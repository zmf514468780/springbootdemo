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
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 
 * TODO 主数据库
 * 
 * @author zmf 2018年12月7日
 */
@Configuration
@MapperScan(basePackages = "com.zmf.dao.master", sqlSessionFactoryRef = "masterSqlSessionFactroy")
public class MasterDataSourceConfig {
	@Value("${spring.datasource1.username}")
	private String name;
	@Value("${spring.datasource1.url}")
	private String url;
	@Value("${spring.datasource1.driver-class-name}")
	private String driver;
	@Value("${spring.datasource1.password}")
	private String password;
	@Bean("masterDataSource")
	public DataSource getDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUsername(name);
		druidDataSource.setPassword(password);
		druidDataSource.setDriverClassName(driver);
		druidDataSource.setUrl(url);
		return druidDataSource;
	}
	@Bean("masterDataSourceTransaction")
	public DataSourceTransactionManager masterDataSourceTransactionManager(
			@Qualifier("masterDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	@Bean("masterSqlSessionFactroy")
	public SqlSessionFactory getSqlSessionFactory(
			@Qualifier("masterDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean
				.setMapperLocations(new PathMatchingResourcePatternResolver()
						.getResources("classpath:mapper/master/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}
}
