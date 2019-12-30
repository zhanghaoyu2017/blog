package top.hiasenna.community.dto;

import lombok.Data;

/**
 * @ClassName AccessTokenDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2411:06
 * @Version 1.0
 **/
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_url;
    private String state;
}
