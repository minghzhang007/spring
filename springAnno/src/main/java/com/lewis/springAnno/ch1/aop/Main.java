package com.lewis.springAnno.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/11/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnoService demoAnnoService = context.getBean(DemoAnnoService.class);
        DemoMethodService methodService = context.getBean(DemoMethodService.class);
        demoAnnoService.add();
        methodService.add();
        context.close();
    }
}
