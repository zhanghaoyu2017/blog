package top.hiasenna.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloController
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2310:17
 * @Version 1.0
 **/
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name",name);
        return "hello";
    }
}
