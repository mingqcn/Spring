package xmu.demo.service;

import org.springframework.stereotype.Service;
import xmu.demo.domain.Goods;
import xmu.demo.domain.GoodsAttribute;
import xmu.demo.domain.GoodsSpecification;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService {

    /**
     * 获取某个商品信息，仅展示相关内容
     *
     * @param id
     * @return
     */
    public Goods findById(Integer id) {
                Goods g = new Goods();
                g.setId(id);
                g.setGoodsSn("111111");
                g.setIsHot(true);
                g.setName("测试商品");

                List<GoodsAttribute> attributeList = new ArrayList<>();
                GoodsAttribute att1 = new GoodsAttribute();
                att1.setAttribute("属性1");
                att1.setValue("值1");
                attributeList.add(att1);
                att1 = new GoodsAttribute();
                att1.setAttribute("属性2");
                att1.setValue("值2");
                attributeList.add(att1);
                g.setGoodsAttributeList(attributeList);

                List<GoodsSpecification> specificationList = new ArrayList<>();
                GoodsSpecification spec1 = new GoodsSpecification();
                spec1.setSpecification("规格1");
                spec1.setValue("规格值1");
                specificationList.add(spec1);
                spec1 = new GoodsSpecification();
                spec1.setSpecification("规格2");
                spec1.setValue("规格值2");
                specificationList.add(spec1);
                g.setGoodsSpecificationList(specificationList);
                return g;
    }
}
