package cn.kis2.tcp3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread {
    private Socket socket;
    public ServerReader(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        // 读管道消息
        // 3.获取输入流
        try {
            InputStream is = socket.getInputStream();
            // 4.包装为特殊数据输入流
            DataInputStream dis = new DataInputStream(is);

            while (true) {
                String msg = dis.readUTF(); // 等待收消息
                System.out.println("服务器收到了"  + msg);

                // 客户端的ip端口
                System.out.println(socket.getInetAddress().getHostAddress());
                System.out.println(socket.getPort());
                System.out.println("===============================");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("客户端断开了"+socket.getInetAddress().getHostAddress());
            System.out.println(socket.getPort());

        }
    }
}
