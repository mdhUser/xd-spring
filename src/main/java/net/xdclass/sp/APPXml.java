package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.VideoOrder;
import net.xdclass.sp.service.VideoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPXml {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        testScope(applicationContext);
//        testInject(applicationContext);
//        testInjectCollection(applicationContext);
//        testExtends(applicationContext);
//        testInject2(applicationContext);
//         testInject2(applicationContext);
//        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();

        testAop(applicationContext);

    }

    //依赖注入测试
    private static void testInject(ApplicationContext context) {
        Video video = (Video) context.getBean("video");
        System.out.println(video.getTitle());
    }

    //测试集合框架
    private static void testInjectCollection(ApplicationContext context) {
        Video video = (Video) context.getBean("video");
        System.out.println(video.getChapterList().toString());
        System.out.println(video.getVideoMap().values());
    }


    //作用域测试
    private static void testScope(ApplicationContext context) {
        Video video1 = (Video) context.getBean("video");
        Video video2 = (Video) context.getBean("video");
        System.out.println(video1 == video2);
    }

    //测试InitDestroy
    private static void testInitDestroy(ApplicationContext context) {
        Video video = (Video) context.getBean("video");
        System.out.println(video.getTitle());
    }

    private static void testInject2(ApplicationContext context) {
        VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrder");
        System.out.println(videoOrder.getVideo().getTitle());
    }

    private static void testAop(ApplicationContext context) {
        VideoService videoService = (VideoService) context.getBean("videoService");
        System.out.println( videoService.fuck());
    }

}
