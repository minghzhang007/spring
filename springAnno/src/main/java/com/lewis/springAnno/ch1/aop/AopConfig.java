package com.lewis.springAnno.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2016/11/14.
 * 使用@EnableAspectJAutoProxy 注解开启spring对aspectJ代理的支持
 */
@Configuration
@ComponentScan(value = "com.lewis.springAnno.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
