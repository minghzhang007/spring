package com.lewis.springAnno.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/11/14.
 * 注解本身是没有功能的，就像ＸＭＬ一样，是一种元数据，用来解释数据的数据，即配置
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
