package com.zmf.config.rs;

import java.io.IOException;
 




import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 从数据库
 * TODO 填写功能说明
 * @author zmf  2018年12月7日
 */
@Configuration
@MapperScan(basePackages="com.zmf.dao.slave",sqlSessionFactoryRef="slaveSqlSessionFactory")
public class SlaveDataSourceConfig {
	@Value("${spring.datasource2.url}")
	private String url;
	@Value("${spring.datasource2.driver-class-name}")
	private String  driverClassName;
	@Value("${spring.datasource2.username}")
	private String userName;
	@Value("${spring.datasource2.password}")
	private String password;
	@Bean("slaveDataSource")
	@Primary
	public DataSource slaveDataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		return  dataSource;
	}
	@Bean("slaveSqlSessionFactory")
	@Primary
	public SqlSessionFactory slaveSqlSeesionFactory(@Qualifier("slaveDataSource") DataSource dataSource ) throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource( dataSource);
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/slave/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}
	
}
