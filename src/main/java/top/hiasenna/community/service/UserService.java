package top.hiasenna.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.hiasenna.community.mapper.UserMapper;
import top.hiasenna.community.model.User;

/**
 * @ClassName UserService
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/1414:50
 * @Version 1.0
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {
       User dbUser =  userMapper.findByAccountId(user.getAccountId());
       if (dbUser==null){
           //插入
           user.setGmtCreate(System.currentTimeMillis());
           user.setGmtModified(user.getGmtCreate());
           userMapper.insert(user);
       }else {
           //更新
           dbUser.setGmtModified(System.currentTimeMillis());
           dbUser.setAvatarUrl(user.getAvatarUrl());
           dbUser.setName(user.getName());
           dbUser.setToken(user.getToken());
           userMapper.update(dbUser);

       }
    }
}
