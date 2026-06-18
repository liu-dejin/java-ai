package cn.kis2.tcp2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    static void main() throws Exception {
        // 多发多收 反复

        // 1.socket管道
        Socket socket = new Socket("127.0.0.1", 9080);

        // 2.获取一个字节输出流
        OutputStream os = socket.getOutputStream();
        // 3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请说");
            String msg = sc.nextLine();
            if(msg.equals("quit")){
                System.out.println("退出成功");
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }


    }
}
