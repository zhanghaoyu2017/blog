package top.hiasenna.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.hiasenna.community.dto.CommentDTO;
import top.hiasenna.community.dto.QuestionDTO;
import top.hiasenna.community.enums.CommentTypeEnum;
import top.hiasenna.community.service.CommentService;
import top.hiasenna.community.service.QuestionService;

import java.util.List;

/**
 * @ClassName QuestionController
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/1411:03
 * @Version 1.0
 **/
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @Autowired
    private CommentService commentService;
    @GetMapping("/question/{id}")
    public String question(@PathVariable(name="id")Long id, Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        List<QuestionDTO> relatedQuestions = questionService.selecetRelated(questionDTO);
        List<CommentDTO> comments = commentService.listByTargetId(id, CommentTypeEnum.QUESTION);
        //累加阅读数
        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        model.addAttribute("comments",comments);
        model.addAttribute("relatedQuestions",relatedQuestions);

        return "question";
    }
}
