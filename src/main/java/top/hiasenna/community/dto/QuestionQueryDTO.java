package top.hiasenna.community.dto;

import lombok.Data;

/**
 * @ClassName QuestionQueryDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/2/3-17:58
 * @Version 1.0
 **/
@Data
public class QuestionQueryDTO {
    private String search;
    private String sort;
    private Long time;
    private String tag;
    private Integer page;
    private Integer size;
}
