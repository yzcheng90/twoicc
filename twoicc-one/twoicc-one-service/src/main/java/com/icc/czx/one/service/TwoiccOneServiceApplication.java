package com.icc.czx.one.service;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by czx on 2018/3/22.
 */

@Slf4j
@SpringBootApplication
@ComponentScan({"com.icc.czx.one.service.impl"})
@ImportResource(value = {"classpath:dubbo/providers.xml"})
@MapperScan({"com.icc.czx.one.service.mapper"})
public class TwoiccOneServiceApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(TwoiccOneServiceApplication.class);
        springApplication.run(args);
        log.info("========== TwoiccOneServiceApplication启动成功 ==========");
    }
}
