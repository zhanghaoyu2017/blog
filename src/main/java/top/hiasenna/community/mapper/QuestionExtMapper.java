package top.hiasenna.community.mapper;

import top.hiasenna.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}
