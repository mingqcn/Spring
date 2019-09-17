package xmu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xmu.demo.dao.GoodsDao;
import xmu.demo.domain.Goods;


@Service
public class GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    /**
     * 获取某个商品信息，仅展示相关内容
     *
     * @param id
     * @return
     */
    public Goods findById(Integer id) {
        return goodsDao.findById(id);
    }

    public Goods create(Goods goods) {
        goodsDao.create(goods);
        return goods;
    }

    @Transactional
    public Goods updateById(Goods goods) {
        Goods updated_goods = goodsDao.updateById(goods);
        return updated_goods;
    }
}
