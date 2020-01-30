package top.hiasenna.community.enums;

/**
 * @ClassName NotificationStatusEnum
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/30-23:20
 * @Version 1.0
 **/
public enum  NotificationStatusEnum {
    UNREAD(0),READ(1)
    ;

    private int status;

    NotificationStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
