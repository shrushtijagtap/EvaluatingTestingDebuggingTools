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
package com.alibaba.json.test;

import java.io.InputStream;
import java.text.NumberFormat;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import junit.framework.TestCase;

public class Bug_0_Test extends TestCase {static class __CLR4_1_1021y021y0luszwhm2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,95860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String text;
    private int    COUNT = 1000;

    protected void setUp() throws Exception {try{__CLR4_1_1021y021y0luszwhm2.R.inc(95832);
        __CLR4_1_1021y021y0luszwhm2.R.inc(95833);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("json/Bug_0_Test.json");
        __CLR4_1_1021y021y0luszwhm2.R.inc(95834);text = IOUtils.toString(is);
        __CLR4_1_1021y021y0luszwhm2.R.inc(95835);is.close();

        // text =
        // "[{\"S\":321061,\"T\":\"GetAttributeResp\"},{\"ERROR\":null,\"TS\":0,\"VAL\":{\"SqlList\":[{\"BatchSizeMax\":0,\"BatchSizeTotal\":0,\"ConcurrentMax\":1,\"DataSource\":\"jdbc:wrap-jdbc:filters=default,encoding:name=ds-offer:jdbc:mysql://172.29.61.63:8066/amoeba\",\"EffectedRowCount\":0,\"ErrorCount\":0,\"ExecuteCount\":5,\"FetchRowCount\":5,\"File\":null,\"ID\":2001,\"LastError\":null,\"LastTime\":1292742908178,\"MaxTimespan\":16,\"MaxTimespanOccurTime\":1292742668191,\"Name\":null,\"RunningCount\":0,\"SQL\":\"SELECT @@SQL_MODE\",\"TotalTime\":83}]}}]";
    }finally{__CLR4_1_1021y021y0luszwhm2.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_1021y021y0luszwhm2.R.globalSliceStart(getClass().getName(),95836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp221y4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021y021y0luszwhm2.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021y021y0luszwhm2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.Bug_0_Test.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95836,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp221y4() throws Exception{try{__CLR4_1_1021y021y0luszwhm2.R.inc(95836);
        __CLR4_1_1021y021y0luszwhm2.R.inc(95837);for (int i = 0; (((i < 50)&&(__CLR4_1_1021y021y0luszwhm2.R.iget(95838)!=0|true))||(__CLR4_1_1021y021y0luszwhm2.R.iget(95839)==0&false)); ++i) {{
            // f_ali_json();
            __CLR4_1_1021y021y0luszwhm2.R.inc(95840);f_jackson();
        }
    }}finally{__CLR4_1_1021y021y0luszwhm2.R.flushNeeded();}}

    private void f_ali_json() {try{__CLR4_1_1021y021y0luszwhm2.R.inc(95841);
        __CLR4_1_1021y021y0luszwhm2.R.inc(95842);long startNano = System.nanoTime();
        __CLR4_1_1021y021y0luszwhm2.R.inc(95843);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021y021y0luszwhm2.R.iget(95844)!=0|true))||(__CLR4_1_1021y021y0luszwhm2.R.iget(95845)==0&false)); ++i) {{
            __CLR4_1_1021y021y0luszwhm2.R.inc(95846);com.alibaba.fastjson.JSON.parse(text);
        }
        }__CLR4_1_1021y021y0luszwhm2.R.inc(95847);long nano = System.nanoTime() - startNano;
        __CLR4_1_1021y021y0luszwhm2.R.inc(95848);System.out.println(NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1021y021y0luszwhm2.R.flushNeeded();}}

    private void f_jackson() throws Exception {try{__CLR4_1_1021y021y0luszwhm2.R.inc(95849);
        __CLR4_1_1021y021y0luszwhm2.R.inc(95850);long startNano = System.nanoTime();
        __CLR4_1_1021y021y0luszwhm2.R.inc(95851);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021y021y0luszwhm2.R.iget(95852)!=0|true))||(__CLR4_1_1021y021y0luszwhm2.R.iget(95853)==0&false)); ++i) {{
            __CLR4_1_1021y021y0luszwhm2.R.inc(95854);ObjectMapper mapper = new ObjectMapper();
            __CLR4_1_1021y021y0luszwhm2.R.inc(95855);ArrayNode node = (ArrayNode) mapper.readTree(text);
            __CLR4_1_1021y021y0luszwhm2.R.inc(95856);JsonNode head = node.get(0);
            __CLR4_1_1021y021y0luszwhm2.R.inc(95857);JsonNode body = node.get(1);
        }
        }__CLR4_1_1021y021y0luszwhm2.R.inc(95858);long nano = System.nanoTime() - startNano;
        __CLR4_1_1021y021y0luszwhm2.R.inc(95859);System.out.println(NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1021y021y0luszwhm2.R.flushNeeded();}}

}
