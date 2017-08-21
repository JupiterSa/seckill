package org.seckill.entity;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by ADMINIBM on 2017/8/19.
 */
public class SuccessKilled {
    private long seckillId;
    private long userPhone;
    private short state;
    private LocalDateTime createTime;


    //多对一
    private Seckill seckill;

    public SuccessKilled() {
    }

    public SuccessKilled(long seckillId, long userPhone, short state, LocalDateTime createTime, Seckill seckill) {
        this.seckillId = seckillId;
        this.userPhone = userPhone;
        this.state = state;
        this.createTime = createTime;
        this.seckill = seckill;
    }
    public long getSeckillId() {
        return seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public short getState() {
        return state;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public void setState(short state) {
        this.state = state;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilledDao{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                ", seckill=" + seckill +
                '}';
    }
}
