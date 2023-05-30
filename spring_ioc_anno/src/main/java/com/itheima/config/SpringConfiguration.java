package com.itheima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author lance huang
 * @create 2023-05-04-12:06
 */
//标志该类是spring的核心配置类  注：用类的方式代表配置文件吗，用注解的方式标签
@Configuration
//<!--配置组件扫描-->
//<context:component-scan base-package="com.itheima"></context:component-scan>
@ComponentScan("com.itheima")
//<context:property-placeholder location="classpath:jdbc.properties"/>
//@PropertySource("classpath:jdbc.properties")
//<import resource="classpath:"></import>
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}
