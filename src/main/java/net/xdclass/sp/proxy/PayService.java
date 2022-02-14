package net.xdclass.sp.proxy;

/**
 * @description: 支付服务
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/14 21:06
 */
public interface PayService {

    /**
     * 支付回调
     * @param outTradeNo
     * @return
     */
    String callback(String outTradeNo);


    /**
     *
     * @param userId
     * @param productId
     * @return
     */
    int save(int userId,int productId);
}
