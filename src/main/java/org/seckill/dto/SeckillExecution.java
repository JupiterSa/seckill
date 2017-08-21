package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStateEnum;

/**
 * 封装秒杀执行后结果
 * Created by ADMINIBM on 2017/8/20.
 */
public class SeckillExecution {

    //id
    private long seckillId;

    //秒杀执行结果
    private int state;

    //状态标识
    private String stateInfo;

    //秒杀成功当选
    private SuccessKilled successKilled;

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public SeckillExecution(long seckillId, SeckillStateEnum stateEnum, String successKilled) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    public SeckillExecution(long seckillId, SeckillStateEnum stateEnum) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }
}
