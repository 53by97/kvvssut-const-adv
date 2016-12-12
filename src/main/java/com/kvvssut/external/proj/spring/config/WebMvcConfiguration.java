/**
 * 
 */
package com.kvvssut.external.proj.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.kvvssut.external.proj.spring.dao.GroupsDAO;
import com.kvvssut.external.proj.spring.dao.impl.GroupsDAOImpl;
import com.kvvssut.external.proj.spring.service.GroupsService;
import com.kvvssut.external.proj.spring.service.impl.GroupsServiceImpl;

/**
 * @author Srimanta Sahu
 *
 */
@Configuration
@ComponentScan(basePackages = "com.kvvssut.external.proj.spring.*")
@EnableWebMvc
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	/*public void addInterceptors(InterceptorRegistry registry) {
		// registry.addInterceptor(); - add to handle redirection
	};*/

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/constadvdb");
		dataSource.setUsername("root");
		dataSource.setPassword("homepwd");
		return dataSource;
	}

	@Bean
	public GroupsDAO getGroupsDAO() {
		return new GroupsDAOImpl(getDataSource());
	}

	@Bean
	public GroupsService getGroupsService() {
		return new GroupsServiceImpl();
	}

}
