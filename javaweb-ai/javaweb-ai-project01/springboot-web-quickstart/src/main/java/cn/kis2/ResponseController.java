package cn.kis2;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResponseController {
    /*
     * 方法一 HttpServletResponse 设置响应数据
     */
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws Exception {

        // 1.设置响应状态码
        // response.setStatus(HttpServletResponse.SC_OK);
        response.setStatus(401);
        // 2.设置响应头信息
        response.setHeader("Content-Type", "text/html;charset=utf-8");
        // 3.设置响应体
        response.getWriter().write("<h1>401 Unauthorized</h1>");
    }
    /*
     * 方法二 ResponseEntity 设置响应数据
     */
    @RequestMapping("/response2")
    public ResponseEntity<String> response2() {
        return ResponseEntity.status(401).header("Accept", "text/html").body("ResponseEntity的方式：<h1>401 Unauthorized</h1>");
    }

}
