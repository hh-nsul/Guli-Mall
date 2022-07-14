package com.atguigu.kipchogemall.product;

import com.atguigu.kipchogemall.product.entity.BrandEntity;
import com.atguigu.kipchogemall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KipchogemallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("Banana");

//        brandService.save(brandEntity);
//        brandService.updateById(brandEntity);

        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntityList.forEach( item -> {
            System.out.println(item);
        });
    }

}
