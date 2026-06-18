package cn.kis2.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    static void main() throws Exception {
        System.out.println("服务端启动");
        //多发多收
        DatagramSocket ds = new DatagramSocket(8080);
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        while (true) {
            // 阻塞式收消息
            ds.receive(packet);

            System.out.println("服务器收到了" + new String(buffer, 0, packet.getLength()));
        }

    }
}
