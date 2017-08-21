package org.seckill.entity;

import java.util.Date;

/**
 * Created by ADMINIBM on 2017/8/19.
 */
public class Seckill {

    private long seckillId;
    private String name;
    private int number;
    private Date createTime;
    private Date startTime;
    private Date endTime;

    public long getSeckillId() {
        return seckillId;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

//    public Seckill() {
//    }
//
//    public Seckill(long seckillId, String name, int number, Date createTime, Date startTime, Date endTime) {
//        this.seckillId = seckillId;
//        this.name = name;
//        this.number = number;
//        this.createTime = createTime;
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", createTime=" + createTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
