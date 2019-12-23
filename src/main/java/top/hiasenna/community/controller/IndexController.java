package top.hiasenna.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName HelloController
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2310:17
 * @Version 1.0
 **/
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
