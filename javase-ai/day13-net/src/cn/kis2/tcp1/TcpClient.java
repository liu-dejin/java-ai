package cn.kis2.tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    static void main() throws Exception {

        // 1.socket管道
        Socket socket = new Socket("127.0.0.1", 9080);

        // 2.获取一个字节输出流
        OutputStream os = socket.getOutputStream();
        // 3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(10);
        dos.writeUTF("你好");

        // 4.释放资源
        socket.close();
    }
}
