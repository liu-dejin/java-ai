package cn.kis2.demoudp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    static void main() throws Exception {
        System.out.println("服务端启动");
        // 1.接收端对象 注册端口
        DatagramSocket ds = new DatagramSocket(8080);
        // 2.创建数据包对象接收数据包
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        // 3.接收
        ds.receive(packet);

        // 查看数据包
        System.out.println("服务器收到了" + new String(buffer, 0, packet.getLength()));
    }
}
