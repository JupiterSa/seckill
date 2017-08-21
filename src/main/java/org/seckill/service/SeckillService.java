package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * 业务接口：站在“使用者”角度设计接口：
 *         方法定义粒度，参数，返回类型(return 类型/ 异常)
 * Created by ADMINIBM on 2017/8/20.
 */
public interface SeckillService {
    //查询接口
    /**
     * 查询所有秒杀及记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    //行为接口
    /**
     * 秒杀接口开启时输出秒杀接口的地址
     * 否则输出系统时间和秒杀数据
     * @param seckillId
     */
    Exposer exportSeckillUrl (long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
        throws SeckillException,RepeatKillException,SeckillCloseException;
}
