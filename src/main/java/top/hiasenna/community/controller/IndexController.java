package top.hiasenna.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.hiasenna.community.dto.PaginationDTO;
import top.hiasenna.community.service.QuestionService;

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
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "4") Integer size,
                        @RequestParam(name = "search", required = false) String search ) {
        PaginationDTO pagination = questionService.list(search,page, size);
        model.addAttribute("pagination", pagination);
        model.addAttribute("search", search);
        return "index";
    }
}
