package com.lewis.springAnno.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/11/14.
 * 使用@Configuration表明此类是一个配置类，这意味着这个类里面可能有0个或者多个@Bean注解
 * 此处没有使用包扫描，因为所有的bean都在此类中定义了
 */
@Configuration
public class JavaConfig {

    //使用@Bean注解，表明当前方法的返回值是一个Bean,Bean的名称是方法名
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
