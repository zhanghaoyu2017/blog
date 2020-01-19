package top.hiasenna.community.dto;

import lombok.Data;
import top.hiasenna.community.model.User;

/**
 * @ClassName QuestionDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/3019:17
 * @Version 1.0
 **/
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private  String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private  Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
