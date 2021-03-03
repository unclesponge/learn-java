package org.stack.demo.design.coupon;

/**
 * Created by yylu on 2021/2/25.
 */
public class CouponService {
    public  CouponResult sendCoupon(String uId, String couponNumber, String uuid){
        System.out.println("模拟发放优惠券一张:"+uId+","+couponNumber+","+uuid);
        return new CouponResult("0000", "发放成功");
    }
}
