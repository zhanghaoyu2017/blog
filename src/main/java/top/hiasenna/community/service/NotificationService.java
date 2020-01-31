package top.hiasenna.community.service;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.hiasenna.community.dto.NotificationDTO;
import top.hiasenna.community.dto.PaginationDTO;
import top.hiasenna.community.mapper.NotificationMapper;
import top.hiasenna.community.mapper.UserMapper;
import top.hiasenna.community.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @ClassName NotificationService
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/31-10:18
 * @Version 1.0
 **/
@Service

public class NotificationService {
    @Autowired
    private NotificationMapper notificationMapper;
    @Autowired
    private UserMapper userMapper;
    public PaginationDTO list(Long userId, Integer page, Integer size) {
        Integer totalPage;
        PaginationDTO<NotificationDTO> paginationDTO = new PaginationDTO<>();
        NotificationExample notificationExample = new NotificationExample();
        notificationExample.createCriteria().andReceiverEqualTo(userId);
        Integer totalCount = (int) notificationMapper.countByExample(notificationExample);
        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        } else {
            totalPage = totalCount / size + 1;
        }
        if (page < 1) {
            page = 1;
        }
        if (page > totalPage) {
            page = totalPage;
        }
        paginationDTO.setPagination(totalPage, page);
        Integer offset = size * (page - 1);
        if (offset < 0) {
            offset = 1;
        }
        NotificationExample example = new NotificationExample();
        example.createCriteria().andReceiverEqualTo(userId);
        List<Notification> notifications = notificationMapper.selectByExampleWithRowbounds(example, new RowBounds(offset, size));
        if (notifications.size()==0){
            return paginationDTO;
        }
        Set<Long> disUserIds =  notifications.stream().map(notify->notify.getNotifier()).collect(Collectors.toSet());
        List<Long> userIds = new ArrayList<>(disUserIds);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIn(userIds);
        List<User> users = userMapper.selectByExample(userExample);
        Map<Long, User> userMap = users.stream().collect(Collectors.toMap(u -> u.getId(), u -> u));


        List<NotificationDTO> notificationDTOS = new ArrayList<>();
        paginationDTO.setData(notificationDTOS);
        return paginationDTO;
    }
}
