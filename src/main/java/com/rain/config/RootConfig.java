package com.rain.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * config dataSource, sqlSessionTemplate, sqlSessionFactory
 * config mapper
 * no transaction config
 * @author rain
 * created on 2018/3/31
 */
@Configuration
@MapperScan(basePackages = {"com.rain.mapper"})
@ComponentScan(basePackages = {"com.rain.service"})
public class RootConfig {
    /**
     * SqlSession Proxy
     * @param sqlSessionFactory factory
     * @return Proxy
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactoryBean sqlSessionFactory) {
        try {
            return new SqlSessionTemplate(sqlSessionFactory.getObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        return sqlSessionFactory;
    }

    /**
     * 数据源
     * @return dataSource
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/zmall?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("tiger");
        return dataSource;
    }
}