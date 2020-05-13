package com.carlos.security.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 该类配置相当于 applicationContext.xml 文件
 * 扫描控制包，排除 控制类
 * @author Carlos
 * @version 1.0.0
 * @date 2020/5/13 18:34
 */
@Configuration
@ComponentScan(basePackages = "com.carlos.security.springmvc"
        , excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class ApplicationConfig {

    // 在此配置除了Controller的其它bean，比如：数据库连接池、事务管理器、业务bean等。


}
