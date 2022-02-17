package net.xdclass.sp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: jdk 动态代理
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/14 21:01
 */
public class JdkProxy implements InvocationHandler {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        //绑定关系，和哪个具体实现类关联
        return Proxy.newProxyInstance
                (targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        try {
            System.out.println("通过JDK动态代理" + method.getName() + "打印日志 begin");
            result = method.invoke(targetObject, args);
            System.out.println("通过JDK动态代理" + method.getName() + "打印日志 end");

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

}
