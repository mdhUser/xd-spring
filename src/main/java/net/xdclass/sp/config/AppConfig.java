package net.xdclass.sp.config;

import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @description: 配置类
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/17 22:40
 */
@Configuration
public class AppConfig {

    @Bean(name="videoOrder",initMethod = "init",destroyMethod = "destroy")
    @Scope("singleton")
    public VideoOrder getVideoOrder(){
         VideoOrder videoOrder =new VideoOrder();
         videoOrder.setOutTradeNo("dalkhdsjk");
        return videoOrder;
    }


}
