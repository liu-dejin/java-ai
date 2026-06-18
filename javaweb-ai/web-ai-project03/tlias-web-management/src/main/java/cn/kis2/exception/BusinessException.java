package cn.kis2.exception;

public class BusinessException extends RuntimeException  {
    public BusinessException(String msg) {
        super(msg);
    }
}
