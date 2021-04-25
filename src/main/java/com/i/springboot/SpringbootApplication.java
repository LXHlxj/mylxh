package com.i.springboot;

import org.apache.logging.log4j.core.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@MapperScan(basePackages = "com.i.springboot.mapper")
/*@ComponentScan
@EnableAutoConfiguration*/
@ServletComponentScan("com.i.springboot.config.*")
@SpringBootApplication
public class SpringbootApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class,args);
    }
}
