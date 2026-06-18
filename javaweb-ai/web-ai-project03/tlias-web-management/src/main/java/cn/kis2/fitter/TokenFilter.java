package cn.kis2.fitter;

import cn.kis2.utils.CurrentHolder;
import cn.kis2.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
// @WebFilter(urlPatterns = "/*")
public class TokenFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;


        // 1. 获取到请求路径
        String path = req.getRequestURI(); //  /login /depts/1

        // 2. 判断是否是登录请求，如果路径包含 /login 是登录操作就放心
        if (path.contains("/login")) {
            log.info("登录请求放行");
            chain.doFilter(request, response);
            return;
        }
        // 3. 获取请求头中的token
        String token = req.getHeader("token");
        // 4. 判断是否存在  如果不存在 说明用户没有登录返回401
        if (token == null || token.isEmpty()) {
            log.info("token 为空");
            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }
        // 5. 如果存在 校验  校验失败依然401
        try {
            Claims claims = JwtUtils.parseJWT(token);
            Integer empId = Integer.valueOf(claims.get("id").toString());
            CurrentHolder.setCurrentId(empId); // 存入
            log.info("当前登录员工id：{}", empId);
        } catch (Exception e) {
            log.info("令牌非法 响应401");
            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }
        // 6. 校验通过 放行
        log.info("令牌合法 放行");
        chain.doFilter(request, response);

        // 7.删除ThreadLocal中的数据
        CurrentHolder.remove();
    }
}
