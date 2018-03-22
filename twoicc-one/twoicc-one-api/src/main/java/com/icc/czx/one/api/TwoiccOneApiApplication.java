package com.icc.czx.one.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,})
@ImportResource(value = {"classpath:dubbo/consumers.xml"})
public class TwoiccOneApiApplication {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(TwoiccOneApiApplication.class);
		springApplication.run(args);
		log.info("========== TwoiccOneApiApplication启动成功 ==========");
	}
}
