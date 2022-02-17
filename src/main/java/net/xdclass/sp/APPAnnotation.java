package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
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


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //扫描指定包，包括子包
        context.scan("net.xdclass.sp");
        //里面完成初始化操作，核心方法
        context.refresh();

//        VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrder");
//        VideoOrder videoOrder2 = (VideoOrder) context.getBean("videoOrder");
//        System.out.println(videoOrder2==videoOrder);


        VideoService videoService =(VideoService) context.getBean("videoService");
        videoService.findById(4);
//        Video  video =(Video) context.getBean("video");
//        video.init();

    }


}