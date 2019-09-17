package xmu.demo.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xmu.demo.domain.Goods;
import xmu.demo.service.GoodsService;
import xmu.demo.util.ResponseUtil;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/wx/goods")
@Validated
public class GoodsController {

    private final Log logger = LogFactory.getLog(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("detail")
    public Object detail(@NotNull @RequestParam Integer id) {

        Goods goods = goodsService.findById(id);
        return ResponseUtil.ok(goods);
    }
}
