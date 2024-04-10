/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.spring.annotation;

import java.lang.annotation.*;

/**
 * <pre>
 * \u4e00\u4e2a\u653e\u7f6e\u5230 {@link org.springframework.stereotype.Controller Controller}\u65b9\u6cd5\u4e0a\u7684\u6ce8\u89e3.
 * \u8bbe\u7f6e\u8fd4\u56de\u5bf9\u8c61\u9488\u5bf9\u67d0\u4e2a\u7c7b\u9700\u8981\u6392\u9664\u6216\u8005\u5305\u62ec\u7684\u5b57\u6bb5
 * \u4f8b\u5982\uff1a
 * <code>&#064;FastJsonView(exclude = {&#064;FastJsonFilter(clazz = JSON.class,props = {"data"})})</code>
 *
 * </pre>
 * @author yanquanyu
 * @author liuming
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FastJsonView {
    FastJsonFilter[] include() default {};
    FastJsonFilter[] exclude() default {};
}
