package top.hiasenna.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.hiasenna.community.dto.CommentCreateDTO;
import top.hiasenna.community.dto.ResultDTO;
import top.hiasenna.community.exception.CustomizeErrorCode;
import top.hiasenna.community.model.Comment;
import top.hiasenna.community.model.User;
import top.hiasenna.community.service.CommentService;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName CommentController
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/17-10:42
 * @Version 1.0
 **/
@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public Object post(@RequestBody CommentCreateDTO commentDTO, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }
        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setCommentator(user.getId());
        comment.setLikeCount(0L);
        commentService.insert(comment);
        return ResultDTO.okOf();
    }
}
