/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.parser.Feature;

public class JSONPathBenchmarkTest {static class __CLR4_1_1022fj22fjlusqkrze{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,96495,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws Exception {try{__CLR4_1_1022fj22fjlusqkrze.R.inc(96463);
        __CLR4_1_1022fj22fjlusqkrze.R.inc(96464);for (int i = 0; (((i < 5)&&(__CLR4_1_1022fj22fjlusqkrze.R.iget(96465)!=0|true))||(__CLR4_1_1022fj22fjlusqkrze.R.iget(96466)==0&false)); ++i) {{
             __CLR4_1_1022fj22fjlusqkrze.R.inc(96467);f0(); // 390 353
        }
        }__CLR4_1_1022fj22fjlusqkrze.R.inc(96468);for (int i = 0; (((i < 5)&&(__CLR4_1_1022fj22fjlusqkrze.R.iget(96469)!=0|true))||(__CLR4_1_1022fj22fjlusqkrze.R.iget(96470)==0&false)); ++i) {{
//            f1();
        }
    }}finally{__CLR4_1_1022fj22fjlusqkrze.R.flushNeeded();}}

    public static void f0() throws Exception {try{__CLR4_1_1022fj22fjlusqkrze.R.inc(96471);
        __CLR4_1_1022fj22fjlusqkrze.R.inc(96472);long start = System.currentTimeMillis();
        __CLR4_1_1022fj22fjlusqkrze.R.inc(96473);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_1022fj22fjlusqkrze.R.iget(96474)!=0|true))||(__CLR4_1_1022fj22fjlusqkrze.R.iget(96475)==0&false)); ++i) {{
            __CLR4_1_1022fj22fjlusqkrze.R.inc(96476);Object val = JSONPath.extract(json2, "$.expensive");
            __CLR4_1_1022fj22fjlusqkrze.R.inc(96477);if ((((((Integer) val).intValue() != 10)&&(__CLR4_1_1022fj22fjlusqkrze.R.iget(96478)!=0|true))||(__CLR4_1_1022fj22fjlusqkrze.R.iget(96479)==0&false))) {{
                __CLR4_1_1022fj22fjlusqkrze.R.inc(96480);throw new Exception();
            }
        }}
        }__CLR4_1_1022fj22fjlusqkrze.R.inc(96481);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022fj22fjlusqkrze.R.inc(96482);System.out.println("extract millis : " + millis);
    }finally{__CLR4_1_1022fj22fjlusqkrze.R.flushNeeded();}}

    public static void f1() throws Exception {try{__CLR4_1_1022fj22fjlusqkrze.R.inc(96483);
        __CLR4_1_1022fj22fjlusqkrze.R.inc(96484);long start = System.currentTimeMillis();
        __CLR4_1_1022fj22fjlusqkrze.R.inc(96485);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_1022fj22fjlusqkrze.R.iget(96486)!=0|true))||(__CLR4_1_1022fj22fjlusqkrze.R.iget(96487)==0&false)); ++i) {{
            __CLR4_1_1022fj22fjlusqkrze.R.inc(96488);Object val = JSONPath.read(json2, "$.expensive");
            __CLR4_1_1022fj22fjlusqkrze.R.inc(96489);if ((((((Integer) val).intValue() != 10)&&(__CLR4_1_1022fj22fjlusqkrze.R.iget(96490)!=0|true))||(__CLR4_1_1022fj22fjlusqkrze.R.iget(96491)==0&false))) {{
                __CLR4_1_1022fj22fjlusqkrze.R.inc(96492);throw new Exception();
            }
        }}
        }__CLR4_1_1022fj22fjlusqkrze.R.inc(96493);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022fj22fjlusqkrze.R.inc(96494);System.out.println("eval millis : " + millis);
    }finally{__CLR4_1_1022fj22fjlusqkrze.R.flushNeeded();}}

    public static final String json = "{\n" +
            "    \"store\": {\n" +
            "        \"book\": [\n" +
            "            {\n" +
            "                \"category\": \"reference\",\n" +
            "                \"author\": \"Nigel Rees\",\n" +
            "                \"title\": \"Sayings of the Century\",\n" +
            "                \"price\": 8.95\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Evelyn Waugh\",\n" +
            "                \"title\": \"Sword of Honour\",\n" +
            "                \"price\": 12.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Herman Melville\",\n" +
            "                \"title\": \"Moby Dick\",\n" +
            "                \"isbn\": \"0-553-21311-3\",\n" +
            "                \"price\": 8.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"J. R. R. Tolkien\",\n" +
            "                \"title\": \"The Lord of the Rings\",\n" +
            "                \"isbn\": \"0-395-19395-8\",\n" +
            "                \"price\": 22.99\n" +
            "            }\n" +
            "        ],\n" +
            "        \"bicycle\": {\n" +
            "            \"color\": \"red\",\n" +
            "            \"price\": 19.95\n" +
            "        }\n" +
            "    },\n" +
            "    \"expensive\": 10\n" +
            "}";

    public static final String json2 = "{\"store\":{\"book\":[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}],\"bicycle\":{\"color\":\"red\",\"price\":19.95}},\"expensive\":10}";
}
