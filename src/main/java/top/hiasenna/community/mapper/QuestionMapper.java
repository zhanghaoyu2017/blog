package top.hiasenna.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.hiasenna.community.model.Question;

import java.util.List;

/**
 * @ClassName QuestionMapper
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2911:48
 * @Version 1.0
 **/
@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title,description,gmt_create,gmt_modified,creator,tag) values(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    public void create(Question question);
    @Select("select * from question")
    List<Question> list();
}
