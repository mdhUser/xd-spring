package net.xdclass.sp.proxy;

/**
 * @description: 代理类测试
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/14 22:19
 */
public class ProxyTest {

    public static void main(String[] args) {
        //静态代理
        PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
        payService.callback("阿巴阿巴");
        payService.save(1,2);

        System.out.println();
        //jdk动态代理
        JdkProxy jdkProxy = new JdkProxy();

        PayService payServiceProxy = (PayService)jdkProxy.newProxyInstance(new PayServiceImpl());

        payServiceProxy.save(2,4);
        payServiceProxy.callback("maxwell");

    }


}
