package top.hiasenna.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.hiasenna.community.mapper.QuestionMapper;
import top.hiasenna.community.model.Question;
import top.hiasenna.community.model.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName PublishController
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/2910:08
 * @Version 1.0
 **/
@Controller
public class PublishController {
    @Autowired
    private QuestionMapper questionMapper;
    @GetMapping("/publish")
    public String publish() {
        return "publish";
    }

    @PostMapping("/publish")
    public String doPublish(
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("tag") String tag, HttpServletRequest request, Model model) {
        model.addAttribute("title",title);
        model.addAttribute("description",description);
        model.addAttribute("tag",tag);
        if (title==null || title.equals("")){
            model.addAttribute("error","标题不能为空");
            return "publish";
        }
        if (description==null || description.equals("")){
            model.addAttribute("error","问题补充不能为空");
            return "publish";
        }
        if (tag==null || tag.equals("")){
            model.addAttribute("error","标签不能为空");
            return "publish";
        }
        User user = (User) request.getSession().getAttribute("user");
        if (user==null){
            model.addAttribute("error","用户未登录");
            return "publish";
        }
        Question question = new Question();
        question.setTitle(title);
        question.setDescription(description);
        question.setTag(tag);
        question.setCreator(user.getId());
        question.setGmtCreate(System.currentTimeMillis());
        question.setGmtModified(question.getGmtCreate());
        questionMapper.create(question);
        return "redirect:/";
    }
}
