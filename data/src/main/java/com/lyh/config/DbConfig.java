package com.lyh.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

@Configuration
public class DbConfig {

    //配置了自定义数据源，默认数据源无须再写
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() throws SQLException {
        DruidDataSource ds = new DruidDataSource();
        //与配置文件对应无需再写
//        ds.setUrl("");
//        ds.setUsername("");
//        ds.setPassword("");
        //开启防火墙
        ds.setFilters("stat,wall");
        return ds;
    }

    //配置druid监控页面
    //监控网址；http://localhost:8080/druid/index.html
    @Bean
    public ServletRegistrationBean statViewServlet(){
        StatViewServlet svs = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> bean =
                new ServletRegistrationBean<>(svs, "/druid/*");

        return bean;
    }

    //Uri请求监控
    @Bean
    public FilterRegistrationBean webStatFilter(){
        WebStatFilter wsf = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>(wsf);
        bean.setUrlPatterns(Arrays.asList("/*"));
        String skipUri = "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*";
        bean.addInitParameter("exclusions",skipUri);
        return bean;
    }
}
