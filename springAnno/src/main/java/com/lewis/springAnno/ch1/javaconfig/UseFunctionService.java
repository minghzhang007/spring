package com.lewis.springAnno.ch1.javaconfig;

/**
 * Created by Administrator on 2016/11/14.
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String world){
        return functionService.sayHello(world);
    }
}
