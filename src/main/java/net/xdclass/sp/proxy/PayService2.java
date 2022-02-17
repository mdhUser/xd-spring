package net.xdclass.sp.proxy;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/17 17:29
 */
public class PayService2 {

    public String callback(String outTradeNo) {
        System.out.println("目标类 PayService2 回调方法 callback");
        return outTradeNo;
    }


    public int save(int userId, int productId) {
        System.out.println("目标类 PayService2 回调方法 save");
        return productId;
    }
}
