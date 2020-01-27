package top.hiasenna.community.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import top.hiasenna.community.model.Comment;
import top.hiasenna.community.model.CommentExample;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}