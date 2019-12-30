package top.hiasenna.community.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.hiasenna.community.dto.QuestionDTO;
import top.hiasenna.community.mapper.QuestionMapper;
import top.hiasenna.community.mapper.UserMapper;
import top.hiasenna.community.model.Question;
import top.hiasenna.community.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName QuestionService
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2019/12/3019:19
 * @Version 1.0
 **/
@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
           User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            //快速拷贝 复制
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
