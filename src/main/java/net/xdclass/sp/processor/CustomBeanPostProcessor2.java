package net.xdclass.sp.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @description: 学习BeanPostProcessor
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/11 18:47
 */
public class CustomBeanPostProcessor2 implements BeanPostProcessor, Ordered {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization2 beanName="+beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization2 beanName="+beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
