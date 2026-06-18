package cn.kis2.demoudp1;

import java.net.*;

public class UpdClient {
    static void main() throws Exception {
        System.out.println("客户端启动");
        // UPD通信 一发一手
        // 1.窗花吧发送端的人
        DatagramSocket ds = new DatagramSocket();
        // 2.创建数据包对象
        byte[] s = "我爱你".getBytes();
        /**
         * 参数1：数据包中的数据
         * 参数2：数据包中的数据的长度
         * 参数3：对方的ip地址
         * 参数4：对方的端口
         */
        DatagramPacket packet = new DatagramPacket(s,s.length, InetAddress.getLocalHost(),8080);

        // 3. 发送数据包
        ds.send(packet);
    }
}
