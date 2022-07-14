package com.atguigu.kipchogemall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合 MyBatis-Plus
 *  1.1 导入Maven依赖
 *  1.2 配置
 *    1.2.1 配置数据源
 *      (1) Maven中导入数据库驱动
 *      (2) 在 application.yml 配置数据源相关信息
 *    1.2.2 配置 MyBatis-Plus
 *      (1) 在启动类中使用 @MapperScan 注解
 *      (2) 在 application.yml 中指定映射.xml文件的位置
 *
 */
@SpringBootApplication
@MapperScan("com.atguigu.kipchogemall.product.dao")
public class KipchogemallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(KipchogemallProductApplication.class, args);
    }

}
