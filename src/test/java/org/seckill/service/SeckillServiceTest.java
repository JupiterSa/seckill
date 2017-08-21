package org.seckill.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by ADMINIBM on 2017/8/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class SeckillServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SeckillServiceTest seckillServiceTest;

    @Test
    public void testGetSeckillList() throws Exception {

    }

    @Test
    public void testGetById() throws Exception {

    }

    @Test
    public void testEportSeckillUrl() throws Exception {
    }

    @Test
    public void testExecuteSeckill() throws Exception {
    }

}
