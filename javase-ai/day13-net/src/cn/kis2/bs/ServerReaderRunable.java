package cn.kis2.bs;

import java.io.*;
import java.net.Socket;

public class ServerReaderRunable implements Runnable {
    private Socket socket;
    public ServerReaderRunable(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        // 读管道消息
        // 3.获取输入流
        try {
            // 响应数据
            OutputStream os = socket.getOutputStream();
            // 字节输出流写数据
            PrintStream ps = new PrintStream(os);

            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type: text/html;charset=utf-8");
            ps.println(); // 必须换一行
            ps.println("<h1>你好</h1>");
            ps.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("客户端断开了"+socket.getInetAddress().getHostAddress());
            System.out.println(socket.getPort());

        }
    }
}
