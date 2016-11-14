package com.lewis.springAnno.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/14.
 */
@Service
public class DemoAnnoService {

    @Action(name = "注解式的拦截add操作")
    public void add(){

    }
}
