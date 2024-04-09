/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import java.io.IOException;

public interface ContextObjectSerializer extends ObjectSerializer {
    void write(JSONSerializer serializer, //
               Object object, //
               BeanContext context) throws IOException;
}
