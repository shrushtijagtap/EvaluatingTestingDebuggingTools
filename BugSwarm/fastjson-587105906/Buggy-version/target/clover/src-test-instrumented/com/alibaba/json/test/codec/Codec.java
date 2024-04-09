/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.codec;

import java.io.OutputStream;
import java.util.Collection;

public interface Codec {

    String getName();

    <T> T decodeObject(String text, Class<T> clazz) throws Exception;

    <T> T decodeObject(byte[] input, Class<T> clazz) throws Exception;

    <T> Collection<T> decodeArray(String text, Class<T> clazz) throws Exception;

    Object decodeObject(String text) throws Exception;

    Object decode(String text) throws Exception;
    
    void encode(OutputStream out, Object object) throws Exception;

    String encode(Object object) throws Exception;
    
    byte[] encodeToBytes(Object object) throws Exception;
}
