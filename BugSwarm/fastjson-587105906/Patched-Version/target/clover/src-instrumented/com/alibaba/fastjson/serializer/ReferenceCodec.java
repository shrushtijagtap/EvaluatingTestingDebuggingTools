/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2018 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class ReferenceCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_5_2lzblzblusyjn9h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,28516,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static ReferenceCodec instance = new ReferenceCodec();

    @SuppressWarnings("rawtypes")
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_2lzblzblusyjn9h.R.inc(28487);
        __CLR4_5_2lzblzblusyjn9h.R.inc(28488);Object item;
        __CLR4_5_2lzblzblusyjn9h.R.inc(28489);if ((((object instanceof AtomicReference)&&(__CLR4_5_2lzblzblusyjn9h.R.iget(28490)!=0|true))||(__CLR4_5_2lzblzblusyjn9h.R.iget(28491)==0&false))) {{
            __CLR4_5_2lzblzblusyjn9h.R.inc(28492);AtomicReference val = (AtomicReference) object;
            __CLR4_5_2lzblzblusyjn9h.R.inc(28493);item = val.get();
        } }else {{
            __CLR4_5_2lzblzblusyjn9h.R.inc(28494);item = ((Reference) object).get();
        }
        }__CLR4_5_2lzblzblusyjn9h.R.inc(28495);serializer.write(item);
    }finally{__CLR4_5_2lzblzblusyjn9h.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_2lzblzblusyjn9h.R.inc(28496);
        __CLR4_5_2lzblzblusyjn9h.R.inc(28497);ParameterizedType paramType = (ParameterizedType) type;
        __CLR4_5_2lzblzblusyjn9h.R.inc(28498);Type itemType = paramType.getActualTypeArguments()[0];

        __CLR4_5_2lzblzblusyjn9h.R.inc(28499);Object itemObject = parser.parseObject(itemType);

        __CLR4_5_2lzblzblusyjn9h.R.inc(28500);Type rawType = paramType.getRawType();
        __CLR4_5_2lzblzblusyjn9h.R.inc(28501);if ((((rawType == AtomicReference.class)&&(__CLR4_5_2lzblzblusyjn9h.R.iget(28502)!=0|true))||(__CLR4_5_2lzblzblusyjn9h.R.iget(28503)==0&false))) {{
            __CLR4_5_2lzblzblusyjn9h.R.inc(28504);return (T) new AtomicReference(itemObject);
        }

        }__CLR4_5_2lzblzblusyjn9h.R.inc(28505);if ((((rawType == WeakReference.class)&&(__CLR4_5_2lzblzblusyjn9h.R.iget(28506)!=0|true))||(__CLR4_5_2lzblzblusyjn9h.R.iget(28507)==0&false))) {{
            __CLR4_5_2lzblzblusyjn9h.R.inc(28508);return (T) new WeakReference(itemObject);
        }

        }__CLR4_5_2lzblzblusyjn9h.R.inc(28509);if ((((rawType == SoftReference.class)&&(__CLR4_5_2lzblzblusyjn9h.R.iget(28510)!=0|true))||(__CLR4_5_2lzblzblusyjn9h.R.iget(28511)==0&false))) {{
            __CLR4_5_2lzblzblusyjn9h.R.inc(28512);return (T) new SoftReference(itemObject);
        }

        }__CLR4_5_2lzblzblusyjn9h.R.inc(28513);throw new UnsupportedOperationException(rawType.toString());
    }finally{__CLR4_5_2lzblzblusyjn9h.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2lzblzblusyjn9h.R.inc(28514);
        __CLR4_5_2lzblzblusyjn9h.R.inc(28515);return JSONToken.LBRACE;
    }finally{__CLR4_5_2lzblzblusyjn9h.R.flushNeeded();}}
}
