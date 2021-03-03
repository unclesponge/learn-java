package org.stack.demo.design;

import com.alibaba.fastjson.JSON;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.stack.demo.design.coupon.CouponResult;
import org.stack.demo.design.coupon.CouponService;

/**
 * Created by yylu on 2021/2/25.
 */
public class PrizeController {
    private final Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req){
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        try {
            logger.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
            // 按照不不同类型⽅方法商品[1优惠券、2实物商品、3第三⽅方兑换卡(爱奇艺)]
            if (req.getAwardType() == 1) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(),req.getBizId());
                if ("0000".equals(couponResult.getCode())) {
                    awardRes=new AwardRes("0000", "发放成功");
                } else {
                    awardRes=new AwardRes("0001",couponResult.getInfo());
                }
            }else if (req.getAwardType() ==2) {
                    GoodsService goodsService = new GoodsService();
                    DeliverReq deliverReq = new DeliverReq();
                    deliverReq.setUserName(queryUserName(req.getuId()));
                    deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
    }
}
