/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.spring.annotation;

import java.lang.annotation.*;

/**
 * <pre>
 * \u8bbe\u7f6e\u8fc7\u6ee4\u5bf9\u8c61\u5bf9\u5e94\u7684class\u548c\u5bf9\u5e94\u7684\u5c5e\u6027
 * </pre>
 * @author yanquanyu
 * @author liuming
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FastJsonFilter {
    Class<?> clazz();
    String[] props();
}
