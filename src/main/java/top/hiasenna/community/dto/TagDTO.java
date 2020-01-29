package top.hiasenna.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @ClassName TagDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/29-21:04
 * @Version 1.0
 **/
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
