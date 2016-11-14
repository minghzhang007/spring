package com.lewis.springAnno.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by Administrator on 2016/11/14.
 * 注入配置文件，需使用@PropertySource注解，指定文件地址
 */
@Configuration
@ComponentScan(value = "com.lewis.springAnno.ch2.el")
@PropertySource("classpath:com/lewis/springAnno/ch2/el/test.properties")
public class ElConfig {

    //注入普通字符串
    @Value("I love you !")
    private String normal;

    //注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //注入表达式结果
    @Value("#{ T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    //注入其他bean的属性
    @Value("#{demoService.annother}")
    private String fromAnnother;

    //注入文件资源
    @Value("classpath:com/lewis/springAnno/ch2/el/test.txt")
    private Resource testFile;

    //注入网络资源
    @Value("http://www.baidu.com")
    private Resource testUrl;

    //注入配置文件
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAnnother);
        try {
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
