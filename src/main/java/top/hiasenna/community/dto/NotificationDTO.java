package top.hiasenna.community.dto;

import lombok.Data;
import top.hiasenna.community.model.User;

/**
 * @ClassName NotificationDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/31-10:04
 * @Version 1.0
 **/
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
