package net.xdclass.sp.proxy;

import net.xdclass.sp.proxy.cglib.CglibProxy;

/**
 * @description: 代理类测试
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/14 22:19
 */
public class ProxyTest {

    public static void main(String[] args) {
        //静态代理
//        PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
//        payService.callback("阿巴阿巴");
//        payService.save(1,2);

//        jdk动态代理
        JdkProxy jdkProxy = new JdkProxy();

        PayService payServiceProxy = (PayService)jdkProxy.newProxyInstance(new PayServiceImpl());

        payServiceProxy.save(2,4);
        payServiceProxy.callback("maxwell");

        System.out.println();
        //CGlib动态代理
        CglibProxy cglib = new CglibProxy();
        PayService payService =(PayService)cglib.newProxyInstance(new PayServiceImpl());
        payService.callback("dsda");
        payService.save(2,4);

        System.out.println();

        //cglib可以为非实现类代理
        PayService2 payService2 =(PayService2)cglib.newProxyInstance(new PayService2());
        System.out.println(payService2.callback("cglib牛逼"));

        System.out.println();

        //jdk只能为实现类代理
        PayService2 pay=(PayService2)jdkProxy.newProxyInstance(new PayService2());
        pay.callback("jdk牛逼");

    }


}
