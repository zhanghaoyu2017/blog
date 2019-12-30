package top.hiasenna.community.model;

import lombok.Data;

/**
 * @ClassName Question
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2911:53
 * @Version 1.0
 **/
@Data
public class Question {
    private Integer id;
    private String title;
    private  String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private  Integer creator;
    private Integer viewCount;
    private Integer comentCount;
    private Integer likeCount;
}
