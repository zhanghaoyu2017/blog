package top.hiasenna.community.dto;

import lombok.Data;
import top.hiasenna.community.exception.CustomizeErrorCode;
import top.hiasenna.community.exception.CustomizeException;

/**
 * @ClassName ResultDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/19-10:29
 * @Version 1.0
 **/
@Data
public class ResultDTO {
    private Integer code;
    private String message;

    public static ResultDTO errorOf(Integer code, String message) {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(), errorCode.getMessage());
    }

    public static ResultDTO okOf() {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("请求成功");
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeException e) {
        return errorOf(e.getCode(), e.getMessage());
    }
}
