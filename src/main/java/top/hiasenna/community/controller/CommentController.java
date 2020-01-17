package top.hiasenna.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.hiasenna.community.dto.CommentDTO;
import top.hiasenna.community.mapper.CommentMapper;
import top.hiasenna.community.model.Comment;

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
    private CommentMapper commentMapper;

    @ResponseBody
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public Object post(@RequestBody CommentDTO commentDTO) {
        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setCommentator(1);
        comment.setLikeCount(0L);
        commentMapper.insert(comment);
        return null;
    }
}
