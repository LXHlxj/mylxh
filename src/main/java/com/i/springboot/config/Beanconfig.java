package com.i.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
/*import org.mybatis.spring.boot.autoconfigure.MybatisProperties;*/
import com.i.springboot.mapper.HrMapper;
/*import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.TextConfigurationRealm;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Beanconfig {

@Autowired
    HrMapper hrMapper;
@Bean
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("lxhLXH15928659674.");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/user");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return druidDataSource;
    }

    @Bean
    public WebMvcProperties.View webMvcPropertie() {
        WebMvcProperties.View webMvcProperties = new WebMvcProperties.View();
        webMvcProperties.setSuffix("/");
        webMvcProperties.setPrefix(".html");
        return webMvcProperties;
    }

/*@Bean
    public Realm realm(){
    TextConfigurationRealm realm=new TextConfigurationRealm();
    realm.setUserDefinitions(hrMapper.selectById(1).getUsername());

}*/




}
