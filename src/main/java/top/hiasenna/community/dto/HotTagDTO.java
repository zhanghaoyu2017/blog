package top.hiasenna.community.dto;

import lombok.Data;

/**
 * @ClassName HotTagDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/2/6-22:43
 * @Version 1.0
 **/
@Data
public class HotTagDTO implements Comparable{
    private String name;
    private Integer priority;

    @Override
    public int compareTo(Object o) {
        return this.getPriority() - ((HotTagDTO) o).getPriority();
    }
}
