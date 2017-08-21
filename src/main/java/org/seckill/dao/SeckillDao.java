package org.seckill.dao;
import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;
import java.util.Date;
import java.util.List;

/**
 * Created by ADMINIBM on 2017/8/19.
 */
public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 更新行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据ID查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);

}
