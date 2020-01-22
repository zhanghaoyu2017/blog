package top.hiasenna.community.dto;

import lombok.Data;

import javax.swing.*;

/**
 * @ClassName CommentCreateDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/17-19:43
 * @Version 1.0
 **/
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
