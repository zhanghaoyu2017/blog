package top.hiasenna.community.exception;

/**
 * @ClassName CustomizeException
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/1517:16
 * @Version 1.0
 **/
public class CustomizeException extends RuntimeException {
    private String message;
    private Integer code;
    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
