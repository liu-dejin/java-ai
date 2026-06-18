package cn.kis2;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * 生成jwt  Jwts.builder()
 */
public class JwtTest {
    @Test
    public void generateToken() {
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("id", 1);
        dataMap.put("userName", "admin");
        String jwt = Jwts.builder().signWith(SignatureAlgorithm.HS256, "a2lzMg==").addClaims(dataMap) // 添加自定义信息
                .setExpiration(new Date(System.currentTimeMillis() + 30 * 1000)) // 设置过期时间
                .compact();
        System.out.println(jwt);
    }

    @Test
    public void parseToken() {
        Claims claims = Jwts.parser().setSigningKey("a2lzMg==").parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwidXNlck5hbWUiOiJhZG1pbiIsImV4cCI6MTc4MTUxNTk4M30.mJz7xXudKZWO_gWt7pmjI5meeVAjwGcWQUyfZ9W8n8U").getBody();
        System.out.println(claims);
    }

}
