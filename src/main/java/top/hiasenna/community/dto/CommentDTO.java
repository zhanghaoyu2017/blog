package top.hiasenna.community.dto;

import lombok.Data;
import top.hiasenna.community.model.User;

/**
 * @ClassName CommentDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/22-15:56
 * @Version 1.0
 **/
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
    private Integer commentCount;
}
