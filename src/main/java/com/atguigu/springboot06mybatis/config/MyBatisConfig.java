package com.atguigu.springboot06mybatis.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

        /*
        * 自己定义的MyBatis驼峰映射规则，用来对应
        * javaBean ：  数据库字段
        * lastName -> last_name
        * 这类驼峰命名
        * */
        @Bean
        public ConfigurationCustomizer configurationCustomizer(){
            return new ConfigurationCustomizer(){
                @Override
                public void customize(Configuration configuration) {
                    configuration.setMapUnderscoreToCamelCase(true);
                }
            };
        }
}
