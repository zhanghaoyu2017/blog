package top.hiasenna.community;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @ClassName ServletInitializer
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/2/4-15:51
 * @Version 1.0
 **/
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        //Application的类名
        return application.sources(CommunityApplication.class);
    }
}
