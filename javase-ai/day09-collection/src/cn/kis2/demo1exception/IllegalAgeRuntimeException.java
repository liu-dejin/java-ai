package cn.kis2.demo1exception;

/**
 * 自定义编译时异常类
 * 继承RuntimeException
 * 重写RuntimeException构造器
 *  哪里需要异常放回就throw
 */
public class IllegalAgeRuntimeException extends RuntimeException {
    public IllegalAgeRuntimeException(){

    }
    public IllegalAgeRuntimeException(String message) {
        super(message);
    }
}
