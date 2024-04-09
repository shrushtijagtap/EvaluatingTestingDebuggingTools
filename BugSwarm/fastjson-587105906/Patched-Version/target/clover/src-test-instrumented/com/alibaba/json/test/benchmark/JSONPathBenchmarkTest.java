/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.parser.Feature;

public class JSONPathBenchmarkTest {static class __CLR4_5_223dg23dglusvnkfk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,97716,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws Exception {try{__CLR4_5_223dg23dglusvnkfk.R.inc(97684);
        __CLR4_5_223dg23dglusvnkfk.R.inc(97685);for (int i = 0; (((i < 5)&&(__CLR4_5_223dg23dglusvnkfk.R.iget(97686)!=0|true))||(__CLR4_5_223dg23dglusvnkfk.R.iget(97687)==0&false)); ++i) {{
             __CLR4_5_223dg23dglusvnkfk.R.inc(97688);f0(); // 390 353
        }
        }__CLR4_5_223dg23dglusvnkfk.R.inc(97689);for (int i = 0; (((i < 5)&&(__CLR4_5_223dg23dglusvnkfk.R.iget(97690)!=0|true))||(__CLR4_5_223dg23dglusvnkfk.R.iget(97691)==0&false)); ++i) {{
//            f1();
        }
    }}finally{__CLR4_5_223dg23dglusvnkfk.R.flushNeeded();}}

    public static void f0() throws Exception {try{__CLR4_5_223dg23dglusvnkfk.R.inc(97692);
        __CLR4_5_223dg23dglusvnkfk.R.inc(97693);long start = System.currentTimeMillis();
        __CLR4_5_223dg23dglusvnkfk.R.inc(97694);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_223dg23dglusvnkfk.R.iget(97695)!=0|true))||(__CLR4_5_223dg23dglusvnkfk.R.iget(97696)==0&false)); ++i) {{
            __CLR4_5_223dg23dglusvnkfk.R.inc(97697);Object val = JSONPath.extract(json2, "$.expensive");
            __CLR4_5_223dg23dglusvnkfk.R.inc(97698);if ((((((Integer) val).intValue() != 10)&&(__CLR4_5_223dg23dglusvnkfk.R.iget(97699)!=0|true))||(__CLR4_5_223dg23dglusvnkfk.R.iget(97700)==0&false))) {{
                __CLR4_5_223dg23dglusvnkfk.R.inc(97701);throw new Exception();
            }
        }}
        }__CLR4_5_223dg23dglusvnkfk.R.inc(97702);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223dg23dglusvnkfk.R.inc(97703);System.out.println("extract millis : " + millis);
    }finally{__CLR4_5_223dg23dglusvnkfk.R.flushNeeded();}}

    public static void f1() throws Exception {try{__CLR4_5_223dg23dglusvnkfk.R.inc(97704);
        __CLR4_5_223dg23dglusvnkfk.R.inc(97705);long start = System.currentTimeMillis();
        __CLR4_5_223dg23dglusvnkfk.R.inc(97706);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_223dg23dglusvnkfk.R.iget(97707)!=0|true))||(__CLR4_5_223dg23dglusvnkfk.R.iget(97708)==0&false)); ++i) {{
            __CLR4_5_223dg23dglusvnkfk.R.inc(97709);Object val = JSONPath.read(json2, "$.expensive");
            __CLR4_5_223dg23dglusvnkfk.R.inc(97710);if ((((((Integer) val).intValue() != 10)&&(__CLR4_5_223dg23dglusvnkfk.R.iget(97711)!=0|true))||(__CLR4_5_223dg23dglusvnkfk.R.iget(97712)==0&false))) {{
                __CLR4_5_223dg23dglusvnkfk.R.inc(97713);throw new Exception();
            }
        }}
        }__CLR4_5_223dg23dglusvnkfk.R.inc(97714);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223dg23dglusvnkfk.R.inc(97715);System.out.println("eval millis : " + millis);
    }finally{__CLR4_5_223dg23dglusvnkfk.R.flushNeeded();}}

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
