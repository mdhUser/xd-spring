package net.xdclass.sp.aop;

import java.time.LocalDateTime;

/**
 * @description: 时间戳控制器
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/17 16:23
 */

//横切
public class TimeHandler {

    public void printBefore() {
        System.out.println("printBefore log time="+ LocalDateTime.now());
    }

    public void printAfter() {
        System.out.println("printAfter log time="+ LocalDateTime.now());
    }

}
