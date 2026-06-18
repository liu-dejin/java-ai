package cn.kis2.demo2redlect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjFrame {
    // 保存任意对象
    public static void savaObj(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("day14-junit-reflect-proxy/src/cn/kis2/demo2redlect/obj.txt", true));
        // obj可能是老师，学生，狗
        // 只有反射可以解决
        // 1.获取class对象
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("===================" + simpleName+"===================");
        // 2.获取成员变量
        Field[] fields = c.getDeclaredFields();
        // 3.遍历字段
        for (Field field : fields) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = field.get(obj);
            ps.println(fieldName + "=" + fieldValue);
        }
        ps.close();
    }
}
