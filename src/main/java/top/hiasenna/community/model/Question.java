package top.hiasenna.community.model;

/**
 * @ClassName Question
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2911:53
 * @Version 1.0
 **/
public class Question {
    private Integer id;
    private String title;
    private  String daecription;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private  Integer creator;
    private Integer viewCount;
    private Integer comentCount;
    private Integer likeCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDaecription() {
        return daecription;
    }

    public void setDaecription(String daecription) {
        this.daecription = daecription;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getComentCount() {
        return comentCount;
    }

    public void setComentCount(Integer comentCount) {
        this.comentCount = comentCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}
