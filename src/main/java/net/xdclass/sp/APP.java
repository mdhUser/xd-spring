package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.Video2;
import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        testScope(applicationContext);
//        testInject(applicationContext);
//        testInjectCollection(applicationContext);
//        testExtends(applicationContext);
//        testInject2(applicationContext);
         Object temp = "dadsd";

         System.out.println(temp);
//         testInject2(applicationContext);
//        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
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

    //bean继承依赖测试
//    private static void testExtends(ApplicationContext context) {
//        Video2 video2 = (Video2) context.getBean("video2");
//        System.out.println(video2.getSummary());
//        System.out.println(video2.getTitle());
//        System.out.println(video2.getId());
//        System.out.println(video2.getVideoMap());
//        System.out.println(video2.getChapterList());
//    }

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

}
