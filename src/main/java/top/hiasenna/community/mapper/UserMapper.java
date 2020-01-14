package top.hiasenna.community.mapper;

import org.apache.ibatis.annotations.*;
import top.hiasenna.community.model.User;

/**
 * @ClassName UserMapper
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2810:56
 * @Version 1.0
 **/
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);

    @Select("select * from user where account_id = #{accountId}")
    User findByAccountId(@Param("accountId") String accountId);

    @Update("update user set name = #{name},token=#{token},gmt_modified = #{gmtModified},avatar_url = #{avatarUrl} where account_id = #{accountId}")
    void update(User user);

}
