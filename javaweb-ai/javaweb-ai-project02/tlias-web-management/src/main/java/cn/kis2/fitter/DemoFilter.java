package cn.kis2.fitter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

// @WebFilter(urlPatterns = "/*")
@Slf4j
public class DemoFilter implements Filter {

    // 初始化方法 web服务器自动执行 只执行一次
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init 初始化方案");
    }


    // 拦截到请求之后执行
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("拦截到了请求 ,放行前的逻辑执行了");
        // 放行
        chain.doFilter(request, response);
        // 放行后的逻辑
        log.info("放行后的逻辑");
    }

    // 销毁方法 服务器关闭时执行 只执行一次
    @Override
    public void destroy() {
        log.info("destroy 销毁");
    }
}
