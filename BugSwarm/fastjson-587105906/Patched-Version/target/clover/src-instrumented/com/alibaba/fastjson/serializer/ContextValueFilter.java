/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

/**
 * @since 1.2.9
 *
 */
public interface ContextValueFilter extends SerializeFilter {
    Object process(BeanContext context, Object object, String name, Object value);
}
