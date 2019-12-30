package top.hiasenna.community.model;

import lombok.Data;

/**
 * @ClassName User
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2811:03
 * @Version 1.0
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private  String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
