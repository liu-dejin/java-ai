package cn.kis2.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UpdClient {
    static void main() throws Exception {
        System.out.println("客户端启动");
        //多发多收
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说");
            String msg = sc.nextLine();
            // 如果用户输入的是退出
            if ("exit".equals(msg)) {
                break;
            }
            byte[] s = msg.getBytes();
            // byte[] s = "我爱你".getBytes();
            DatagramPacket packet = new DatagramPacket(s,s.length, InetAddress.getLocalHost(),8080);
            ds.send(packet);
        }
    }
}
