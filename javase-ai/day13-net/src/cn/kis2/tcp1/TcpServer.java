package cn.kis2.tcp1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    static void main() throws Exception {
        // 1. 创建服务端serverSocket
        ServerSocket ss = new ServerSocket(9080);
        // 2. 调用accept方法接收客户端socket 返回Socket
        Socket socket = ss.accept();
        // 3.获取输入流
        InputStream is = socket.getInputStream();
        // 4.包装为特殊数据输入流
        DataInputStream dis = new DataInputStream(is);
        // 5.读取数据
        int id = dis.readInt();
        String msg = dis.readUTF();
        System.out.println("服务器收到了" + id + ":" + msg);

        // 客户端的ip端口
        System.out.println(socket.getInetAddress().getHostAddress());
        System.out.println(socket.getPort());

    }
}
