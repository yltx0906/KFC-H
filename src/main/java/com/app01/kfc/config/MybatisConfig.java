package com.app01.kfc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.app01.kfc.mapper")
public class MybatisConfig {

}
