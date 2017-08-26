package org.seckill.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by ADMINIBM on 2017/8/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SeckillControllerTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @Test
    public void testGetSeckillList() throws Exception {
        /**
         * list=[
         * Seckill{seckillId=1000, name='iphone6', number=100, createTime=Sat Aug 19 05:24:02 CST 2017, startTime=Sun May 22 00:00:00 CST 2016, endTime=Mon May 23 00:00:00 CST 2016},
         * Seckill{seckillId=1001, name='iPad2', number=200, createTime=Sat Aug 19 05:24:02 CST 2017, startTime=Sun May 22 00:00:00 CST 2016, endTime=Mon May 23 00:00:00 CST 2016},
         * Seckill{seckillId=1002, name='Xiaomi4', number=300, createTime=Sat Aug 19 05:24:02 CST 2017, startTime=Sun May 22 00:00:00 CST 2016, endTime=Mon May 23 00:00:00 CST 2016},
         * Seckill{seckillId=1003, name='Hongnote', number=400, createTime=Sat Aug 19 05:24:02 CST 2017, startTime=Sun May 22 00:00:00 CST 2016, endTime=Mon May 23 00:00:00 CST 2016}
         * ]
         */
        List<Seckill> seckills = seckillService.getSeckillList();
        logger.info("list={}",seckills);
    }

}
