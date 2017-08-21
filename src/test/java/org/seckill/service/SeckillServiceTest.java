package org.seckill.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by ADMINIBM on 2017/8/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SeckillServiceTest {

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

    @Test
    public void testGetById() throws Exception {
        /**
         * seckill=
         * Seckill{seckillId=1002, name='Xiaomi4', number=300, createTime=Sat Aug 19 05:24:02 CST 2017, startTime=Sun May 22 00:00:00 CST 2016, endTime=Mon May 23 00:00:00 CST 2016}
         */
        long id = 1004;
        Seckill seckill = seckillService.getById(id);
        logger.info("seckill={}",seckill);
    }

//    分开测试方法，   下面把他们整合起来一起测试service
    @Test
    public void testExportSeckillUrl() throws Exception {
        /* Exposer=Exposer{秒杀状态=true, md5加密值='d206ae033b61cfeb3c3d2125f7f997ea', 秒杀ID=1003, 当前时间=0, 开始时间=0, 结束=0}*/
        long id = 1003;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        logger.info("Exposer={}",exposer);
    }
    @Test
    public void testExecuteSeckill() throws Exception {
        /* resutl=SeckillExecution{秒杀的商品ID=1003, 秒杀状态=1, 秒杀状态信息='秒杀成功', 秒杀的商品=SuccessKilledDao{seckillId=1003, userPhone=15478965778, state=-1, createTime=2017-08-20T23:09:49, seckill=Seckill{seckillId=1003, name='Hongnote', number=0, createTime=Sat Aug 19 05:24:02 CST 2017, startTime=Sat Jul 22 00:00:00 CST 2017, endTime=Sat Sep 23 00:00:00 CST 2017}}}*/
        long id= 1003;
        long userPhone = 15478965778L;
        String md5 = "d206ae033b61cfeb3c3d2125f7f997ea";
        SeckillExecution seckillExecution = seckillService.executeSeckill(id,userPhone,md5);
        logger.info("resutl={}",seckillExecution);
    }
//    public void testSeckillLogic() throws Exception {
//    }

}
