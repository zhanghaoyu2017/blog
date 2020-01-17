package top.hiasenna.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName CommentController
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/17-10:42
 * @Version 1.0
 **/
@Controller
public class CommentController {
    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public Object post(){

        return null;
    }
}
