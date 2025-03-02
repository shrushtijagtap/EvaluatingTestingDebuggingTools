/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
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
package com.alibaba.json.bvt;

import java.util.Collections;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;

public class JSON_toJSONStringTest extends TestCase {static class __CLR4_5_2yikyiklusyjq28{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,44760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2yikyiklusyjq28.R.globalSliceStart(getClass().getName(),44732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2yik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yikyiklusyjq28.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yikyiklusyjq28.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_toJSONStringTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44732,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2yik() throws Exception{try{__CLR4_5_2yikyiklusyjq28.R.inc(44732);
        __CLR4_5_2yikyiklusyjq28.R.inc(44733);User user = new User();
        __CLR4_5_2yikyiklusyjq28.R.inc(44734);user.setId(123);
        __CLR4_5_2yikyiklusyjq28.R.inc(44735);user.setName("\u6bdb\u5934");

        __CLR4_5_2yikyiklusyjq28.R.inc(44736);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2yikyiklusyjq28.R.inc(44737);mapping.put(User.class, new JavaBeanSerializer(User.class, "id"));

        __CLR4_5_2yikyiklusyjq28.R.inc(44738);JSONSerializer serializer = new JSONSerializer(mapping);
        __CLR4_5_2yikyiklusyjq28.R.inc(44739);serializer.write(user);
        __CLR4_5_2yikyiklusyjq28.R.inc(44740);String jsonString = serializer.toString();

        __CLR4_5_2yikyiklusyjq28.R.inc(44741);Assert.assertEquals("{\"id\":123}", jsonString);
    }finally{__CLR4_5_2yikyiklusyjq28.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_2yikyiklusyjq28.R.globalSliceStart(getClass().getName(),44742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwlyiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yikyiklusyjq28.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yikyiklusyjq28.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_toJSONStringTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwlyiu() throws Exception{try{__CLR4_5_2yikyiklusyjq28.R.inc(44742);
        __CLR4_5_2yikyiklusyjq28.R.inc(44743);User user = new User();
        __CLR4_5_2yikyiklusyjq28.R.inc(44744);user.setId(123);
        __CLR4_5_2yikyiklusyjq28.R.inc(44745);user.setName("\u6bdb\u5934");

        __CLR4_5_2yikyiklusyjq28.R.inc(44746);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2yikyiklusyjq28.R.inc(44747);mapping.put(User.class, new JavaBeanSerializer(User.class, Collections.singletonMap("id", "uid")));

        __CLR4_5_2yikyiklusyjq28.R.inc(44748);JSONSerializer serializer = new JSONSerializer(mapping);
        __CLR4_5_2yikyiklusyjq28.R.inc(44749);serializer.write(user);
        __CLR4_5_2yikyiklusyjq28.R.inc(44750);String jsonString = serializer.toString();

        __CLR4_5_2yikyiklusyjq28.R.inc(44751);Assert.assertEquals("{\"uid\":123}", jsonString);
    }finally{__CLR4_5_2yikyiklusyjq28.R.flushNeeded();}}

    public static class User {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_2yikyiklusyjq28.R.inc(44752);
            __CLR4_5_2yikyiklusyjq28.R.inc(44753);return id;
        }finally{__CLR4_5_2yikyiklusyjq28.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_2yikyiklusyjq28.R.inc(44754);
            __CLR4_5_2yikyiklusyjq28.R.inc(44755);this.id = id;
        }finally{__CLR4_5_2yikyiklusyjq28.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2yikyiklusyjq28.R.inc(44756);
            __CLR4_5_2yikyiklusyjq28.R.inc(44757);return name;
        }finally{__CLR4_5_2yikyiklusyjq28.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2yikyiklusyjq28.R.inc(44758);
            __CLR4_5_2yikyiklusyjq28.R.inc(44759);this.name = name;
        }finally{__CLR4_5_2yikyiklusyjq28.R.flushNeeded();}}

    }
}
