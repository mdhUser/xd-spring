package net.xdclass.sp.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/18 23:27
 */

@Configuration
@ComponentScan("net.xdclass.sp")
@EnableAspectJAutoProxy//开启spring对aspect的支持
public class AnnotationConfig {


}
