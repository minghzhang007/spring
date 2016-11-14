package com.lewis.springAnno.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/14.
 */
@Service
@Scope(value = "prototype")
public class DemoPrototypeService {
}
