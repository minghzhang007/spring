package com.lewis.springAnno.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/14.
 */
@Service
public class DemoService {

    //注入普通字符串
    @Value("其他类的属性")
    private String annother;

    public String getAnnother() {
        return annother;
    }

    public void setAnnother(String annother) {
        this.annother = annother;
    }
}
