package xmu.demo.dao;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import xmu.demo.domain.Goods;
import xmu.demo.mapper.GoodsMapper;

@Repository
public class GoodsDao {

    private final Log logger = LogFactory.getLog(GoodsDao.class);

    @Autowired
    private GoodsMapper goodsMapper;

    public Goods findById(Integer id) {
        logger.debug("find goods by id: "+id);
        return goodsMapper.findById(id);
    }

    public int create(Goods goods) {
        return goodsMapper.create(goods);
    }

    public Goods updateById(Goods goods) {
        Goods temp_goods = goodsMapper.findById(goods.getId());
        if (null != temp_goods) {
            goodsMapper.updateById(goods);
        }
        temp_goods = goodsMapper.findById(goods.getId());
        return temp_goods;
    }
}
