/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
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

import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class JsonValueTest extends TestCase {static class __CLR4_1_10ylwylwluszw5qy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,44865,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_toJSONString() throws Exception {__CLR4_1_10ylwylwluszw5qy.R.globalSliceStart(getClass().getName(),44852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udkylw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ylwylwluszw5qy.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ylwylwluszw5qy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JsonValueTest.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udkylw() throws Exception{try{__CLR4_1_10ylwylwluszw5qy.R.inc(44852);
        __CLR4_1_10ylwylwluszw5qy.R.inc(44853);Assert.assertEquals("null", JSON.toJSONString(Double.NaN));
        __CLR4_1_10ylwylwluszw5qy.R.inc(44854);Assert.assertEquals("3.0", JSON.toJSONString(3D));
        __CLR4_1_10ylwylwluszw5qy.R.inc(44855);Assert.assertEquals("null", JSON.toJSONString(Float.NaN));
        __CLR4_1_10ylwylwluszw5qy.R.inc(44856);Assert.assertEquals("3.0", JSON.toJSONString(3F));
        __CLR4_1_10ylwylwluszw5qy.R.inc(44857);Assert.assertEquals("1292939095640", JSON.toJSONString(new Date(1292939095640L)));
        __CLR4_1_10ylwylwluszw5qy.R.inc(44858);Assert.assertEquals(new Date(1292939095640L), JSON.parse("new Date(1292939095640)"));
    }finally{__CLR4_1_10ylwylwluszw5qy.R.flushNeeded();}}

    public void test_bug_0() throws Exception {__CLR4_1_10ylwylwluszw5qy.R.globalSliceStart(getClass().getName(),44859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101y7edbym3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ylwylwluszw5qy.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ylwylwluszw5qy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JsonValueTest.test_bug_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44859,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101y7edbym3() throws Exception{try{__CLR4_1_10ylwylwluszw5qy.R.inc(44859);
        __CLR4_1_10ylwylwluszw5qy.R.inc(44860);String text = "[{\"S\":0,\"T\":\"Register\"},{\"HOST_NAME\":\"qa-qd-62-187\",\"IP\":[\"172.29.62.187\"],\"MAC_ADDR\":[\"00:16:3E:43:E5:1C\"],\"SERVICE_TAG\":\"NOSN00:16:3E:43:E5:1C\",\"VERSION\":\"2.5\"}]  ";
        __CLR4_1_10ylwylwluszw5qy.R.inc(44861);JSON.parseArray(text);
    }finally{__CLR4_1_10ylwylwluszw5qy.R.flushNeeded();}}

    public void test_bug_1() throws Exception {__CLR4_1_10ylwylwluszw5qy.R.globalSliceStart(getClass().getName(),44862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10577d5sym6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ylwylwluszw5qy.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ylwylwluszw5qy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JsonValueTest.test_bug_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44862,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10577d5sym6() throws Exception{try{__CLR4_1_10ylwylwluszw5qy.R.inc(44862);
        __CLR4_1_10ylwylwluszw5qy.R.inc(44863);String text = "[{\"S\":2,\"T\":\"ConnectResp\"},\n\r \t{\"VAL\" :null}]\r\f";
        __CLR4_1_10ylwylwluszw5qy.R.inc(44864);JSON.parseArray(text);
    }finally{__CLR4_1_10ylwylwluszw5qy.R.flushNeeded();}}

}
