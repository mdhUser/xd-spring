package net.xdclass.sp.proxy;

/**
 * @description: 服务实现
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/14 22:13
 */
public class PayServiceImpl implements PayService {

    @Override
    public String callback(String outTradeNo) {
        System.out.println("目标类 PayServiceImpl 回调方法 callback");
        return outTradeNo;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("目标类 PayServiceImpl 回调方法 save");
        return productId;
    }

}
