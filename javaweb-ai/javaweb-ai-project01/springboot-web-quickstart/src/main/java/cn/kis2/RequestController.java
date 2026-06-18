package cn.kis2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        // 1.请求方式
        String method = request.getMethod();
        System.out.println("method:" + method);


        // int i = 1 / 0; // 模拟异常 500
        // 2.请求的url
        String url = request.getRequestURL().toString();
        System.out.println("url:" + url);
        String uri = request.getRequestURI().toString();
        System.out.println("uri:" + uri);
        // 3.请求的协议
        String protocol = request.getProtocol();
        System.out.println("protocol:" + protocol);
        // 4.请求携带参数 name
        String name = request.getParameter("name");
        System.out.println("name:" + name);
        // 5.请求头信息 Accept
        String accept = request.getHeader("Accept");
        System.out.println("accept:" + accept);

        return "ok";
    }
}
