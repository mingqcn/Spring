package xmu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GoodsControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void detailTest() throws Exception {
        this.mvc.perform(get("/wx/goods/detail?id=1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8")).
                andExpect(content().json("{\"errno\":0,\"data\":{\"id\":1,\"goodsSn\":\"111111\"," +
                        "\"name\":\"测试商品\",\"categoryId\":null,\"brandId\":null,\"gallery\":null,\"keywords\":null,\"brief\":null," +
                        "\"isOnSale\":null,\"sortOrder\":null,\"picUrl\":null,\"shareUrl\":null,\"isNew\":null,\"isHot\":true,\"unit\":null," +
                        "\"counterPrice\":null,\"retailPrice\":null,\"addTime\":null,\"updateTime\":null,\"deleted\":null,\"detail\":null," +
                        "\"goodsAttributeList\":[{\"id\":null,\"goodsId\":null,\"attribute\":\"属性1\",\"value\":\"值1\",\"addTime\":null," +
                        "\"updateTime\":null,\"deleted\":null},{\"id\":null,\"goodsId\":null,\"attribute\":\"属性2\",\"value\":\"值2\"," +
                        "\"addTime\":null,\"updateTime\":null,\"deleted\":null}],\"goodsSpecificationList\":[{\"id\":null,\"goodsId\":null," +
                        "\"specification\":\"规格1\",\"value\":\"规格值1\",\"picUrl\":null,\"addTime\":null,\"updateTime\":null," +
                        "\"deleted\":null},{\"id\":null,\"goodsId\":null,\"specification\":\"规格2\",\"value\":\"规格值2\"," +
                        "\"picUrl\":null,\"addTime\":null,\"updateTime\":null,\"deleted\":null}]},\"errmsg\":\"成功\"}"));
    }
}
