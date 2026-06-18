package cn.kis2.bs;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class BsServer {
    static void main() throws Exception {

        // bs架构
        System.out.println("服务器启动成功");

        ServerSocket ss = new ServerSocket(8080);
        System.out.println("服务器启动成功，请访问 http://127.0.0.1:8080");


        // 创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3,10,10, TimeUnit.SECONDS,new LinkedBlockingQueue<>(100), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        while (true){
            // 等待客户端链接 返回一个socket
            Socket socket = ss.accept();

            System.out.println("上线了"+socket.getInetAddress().getHostAddress());
            System.out.println(socket.getPort());
            // 线程池处理

            pool.execute(new ServerReaderRunable(socket));

        }

    }
}
