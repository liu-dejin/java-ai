package cn.kis2.demo1exception;

/**
 * 自定义编译时异常类
 * 继承exception
 * 重写构造器
 *  哪里需要异常放回就throw
 */
public class IllegalAgeException extends Exception {
    public IllegalAgeException(){

    }
    public IllegalAgeException(String message) {
        super(message);
    }
}
