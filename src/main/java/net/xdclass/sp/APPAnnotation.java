package net.xdclass.sp;

import net.xdclass.sp.aop.AnnotationConfig;
import net.xdclass.sp.domain.VideoOrder;
import net.xdclass.sp.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:注解练习
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/17 18:55
 */
public class APPAnnotation {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

//        扫描指定包，包括子包
//        context.scan("net.xdclass.sp");
//        里面完成初始化操作，核心方法
//        context.refresh();


        VideoService videoService = (VideoService) context.getBean("videoService");
        System.out.println(videoService.findById(4));

        VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrder");
        System.out.println(videoOrder);


    }


}