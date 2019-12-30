package top.hiasenna.community.dto;

import lombok.Data;

/**
 * @ClassName GithubUser
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2416:58
 * @Version 1.0
 **/
@Data
public class GithubUser {
    private String name;
    private Long id;
    private  String bio;
    private String avatar_url;
}
