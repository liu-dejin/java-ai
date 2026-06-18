package cn.kis2;

import org.junit.jupiter.api.Test;

import cn.kis2.pojo.User;

import java.sql.*;

public class JdbcTest {
    @Test
    public void testUpdate() throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2.获取数据库连接

        String url = "jdbc:mysql://localhost:3306/web01";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        // 3.获取sql执行对象
        Statement statement = connection.createStatement();
        // 4.执行sql
        int i = statement.executeUpdate("update user set age = 25 where id = 1");// DML
        System.out.println("sql执行完毕影响数：" + i);
        // 5.释放资源
        statement.close();
        connection.close();
    }

    @Test
    public void testSelect() throws Exception {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.获取数据库连接
            String url = "jdbc:mysql://localhost:3306/web01";
            String username = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, username, password);

            // 3.获取sql执行对象
            // 4.执行sql
            String sql = "select id,username,password,name,age from user where username=? and password=?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "daqiao");
            stmt.setString(2, "123456");
            resultSet = stmt.executeQuery();
            // 5.处理结果集
            //
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getObject("age", Integer.class));
                System.out.println(user);
            }
        } finally {
            // 6.释放资源
            try {
                if (resultSet != null) resultSet.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
