package cn.kis2.demo14dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataDemo1 {
    static void main() {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
            DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
            dos.writeInt(100);
            System.out.println(dis.readInt());
            dos.writeUTF("hello");
            System.out.println(dis.readUTF());
            dos.writeDouble(300.9);
            System.out.println(dis.readDouble());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
