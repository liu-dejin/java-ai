package cn.kis2.demoinetaddress;

import java.net.InetAddress;

public class InetAddressDemo1 {
    static void main() {
        // 获取本机ip对象
        try {
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1);
            System.out.println(ip1.getHostName());
            System.out.println(ip1.getHostAddress());

            // 获取对方ip
            InetAddress ip2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ip2);
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());

            // 判断是否互通
            System.out.println(ip1.isReachable(1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
