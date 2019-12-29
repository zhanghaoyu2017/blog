package top.hiasenna.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import top.hiasenna.community.mapper.UserMapper;
import top.hiasenna.community.model.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName HelloController
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2310:17
 * @Version 1.0
 **/
@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null) {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }

        return "index";
    }
}
