package com.atguigu.kipchogemall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Nacos配置中心引入:
 * 1. 引入Maven依赖
 * 2. 创建bootstrap.properties并配置
 *     spring.application.name
 *     spring.cloud.nacos.config.server-addr
 * 3. 在配置中心添加数据集，其 Data Id 通常为 "当前应用名" + ".properties"
 * 4. 在数据集中添加需要动态发布的配置
 * 5. 动态获取配置
 *      用 @RefreshScope 注解修饰controller类名，刷新配置
 *      用 @Value("${}") 获取配置
 * 6. 对于相同的配置项，配置中心优先于当前应用的配置文件
 *
 *
 * Namespace:
 * 可使用 namespace 实现 prod/dev/test 环境隔离，
 * 也可为不同的微服务创建各自的 namespace，
 * 每个微服务只加载自己 namespace 中的配置文件 实现服务隔离.
 *
 * 默认所有的新增配置都保存在 public namespace，
 * 可在 bootstrap.properties 中配置默认使用的 namespace ID
 *
 * Group:
 * 默认所有的配置集都保存在 DEFAULT_GROUP 中，
 * 可创建不同的 Group 以保存专属的一组配置文件，
 * 例如，double-11 Group, Christmas Group
 * 可在 bootstrap.properties 中配置默认使用的 Group
 *   e.g., spring.cloud.nacos.config.group=Christmas
 *
 *
 * Recommended Practices:
 * 每个微服务创建自己的 namespace, 使用不同的 Group 来区分 prod/dev/test 环境
 *
 * 同时加载多个配置集:
 * 微服务任何配置信息，任何配置文件都可以放在配置中心，
 * 只需在 bootstrap.properties 中指定加载配置中心的哪些配置文件即可，
 * 通过 @Value, @ConfigurationProperties 等注解读取变量值
 *
 * 优先读取配置中心的配置项
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class KipchogemallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(KipchogemallCouponApplication.class, args);
    }

}
