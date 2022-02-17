package net.xdclass.sp.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: cglib 动态代理
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/14 23:28
 */
public class CglibProxy implements MethodInterceptor {

    //目标类
    private Object targetObject;

    //设置绑定关系
    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;

        Enhancer enhancer = new Enhancer();
        //设置代理类的父类（目标类）
        enhancer.setSuperclass(this.targetObject.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类（代理类）
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object result = null;

        try {
            System.out.println("通过Cglib动态代理" + method.getName() + "打印日志 begin");

            result = methodProxy.invoke(targetObject, objects);

            System.out.println("通过Cglib动态代理" + method.getName() + "打印日志 end");
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return result;
    }


}