package cn.kis2.tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    static void main() throws Exception {

        System.out.println("服务器启动成功");

        ServerSocket ss = new ServerSocket(9999);

        while (true){
            // 等待客户端链接 返回一个socket
            Socket socket = ss.accept();

            System.out.println("上线了"+socket.getInetAddress().getHostAddress());
            System.out.println(socket.getPort());
            // 客户端管道交给子线程 专门处理
            new ServerReader(socket).start();
        }

    }
}
