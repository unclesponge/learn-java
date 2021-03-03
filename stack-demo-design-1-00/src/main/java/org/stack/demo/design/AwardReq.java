package org.stack.demo.design;

/**
 * Created by yylu on 2021/2/25.
 */
public class AwardReq {
    String uId;
    int awardType;
    String awardNumber;
    String bizId;


    public String getuId(){
        return this.uId;
    }

    public int getAwardType(){
        return this.awardType;
    }
    public String getBizId(){
        return this.bizId;
    }
    public String getAwardNumber(){
        return this.awardNumber;
    }
}
