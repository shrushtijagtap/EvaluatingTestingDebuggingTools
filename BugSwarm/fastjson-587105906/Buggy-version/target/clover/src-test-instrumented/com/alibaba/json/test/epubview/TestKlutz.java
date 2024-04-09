/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.epubview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class TestKlutz extends TestCase {static class __CLR4_1_1026xq26xqlusqkvpm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,102353,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private EpubViewBook book;
    
    ObjectMapper mapper = new ObjectMapper();
    Gson gson = new Gson();
    
    private EpubViewBook book_jackson;
    private EpubViewBook book_fastjson;
    
    private int LOOP_COUNT = 1000 * 1;

    @Override
    protected void setUp() throws Exception {try{__CLR4_1_1026xq26xqlusqkvpm.R.inc(102302);
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102303);InputStreamReader isr = new InputStreamReader(
                                                      Thread.currentThread().getContextClassLoader().getResourceAsStream("epub.json"));
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102304);BufferedReader reader = new BufferedReader(isr);
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102305);StringBuilder sb = new StringBuilder();

        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102306);String temp;
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102307);while ((temp = reader.readLine()) != null) {{
            __CLR4_1_1026xq26xqlusqkvpm.R.inc(102310);sb.append(temp);
        }
        }__CLR4_1_1026xq26xqlusqkvpm.R.inc(102311);String s = sb.toString();

        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102312);this.book = JSON.parseObject(s, EpubViewBook.class);
    }finally{__CLR4_1_1026xq26xqlusqkvpm.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_1026xq26xqlusqkvpm.R.globalSliceStart(getClass().getName(),102313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp226y1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1026xq26xqlusqkvpm.R.rethrow($CLV_t2$);}finally{__CLR4_1_1026xq26xqlusqkvpm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.epubview.TestKlutz.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),102313,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp226y1() throws Exception{try{__CLR4_1_1026xq26xqlusqkvpm.R.inc(102313);


        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102314);for (int j = 0; (((j < 5)&&(__CLR4_1_1026xq26xqlusqkvpm.R.iget(102315)!=0|true))||(__CLR4_1_1026xq26xqlusqkvpm.R.iget(102316)==0&false)); j++) {{
            __CLR4_1_1026xq26xqlusqkvpm.R.inc(102317);fastjson();
            //gson();
            __CLR4_1_1026xq26xqlusqkvpm.R.inc(102318);jackson();

            __CLR4_1_1026xq26xqlusqkvpm.R.inc(102319);System.out.println("=======================");
        }
    }}finally{__CLR4_1_1026xq26xqlusqkvpm.R.flushNeeded();}}

    private String jackson() throws Exception {try{__CLR4_1_1026xq26xqlusqkvpm.R.inc(102320);
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102321);String s = mapper.writeValueAsString(book);
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102322);Long startTime;
        // Jackson
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102323);startTime = System.currentTimeMillis();
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102324);for (int i = 0; (((i < LOOP_COUNT)&&(__CLR4_1_1026xq26xqlusqkvpm.R.iget(102325)!=0|true))||(__CLR4_1_1026xq26xqlusqkvpm.R.iget(102326)==0&false)); i++) {{
            __CLR4_1_1026xq26xqlusqkvpm.R.inc(102327);book_jackson = mapper.readValue(s, EpubViewBook.class);
            //s = mapper.writeValueAsString(epubViewBook);
        }
        }__CLR4_1_1026xq26xqlusqkvpm.R.inc(102328);System.out.println("Jackson:" + (System.currentTimeMillis() - startTime) + ", " + s.length());
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102329);System.out.println(s);
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102330);return s;
    }finally{__CLR4_1_1026xq26xqlusqkvpm.R.flushNeeded();}}

    private String gson() throws Exception {try{__CLR4_1_1026xq26xqlusqkvpm.R.inc(102331);
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102332);String s = gson.toJson(book);
        
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102333);Long startTime;
        // Gson
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102334);startTime = System.currentTimeMillis();
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102335);for (int i = 0; (((i < LOOP_COUNT)&&(__CLR4_1_1026xq26xqlusqkvpm.R.iget(102336)!=0|true))||(__CLR4_1_1026xq26xqlusqkvpm.R.iget(102337)==0&false)); i++) {{
            __CLR4_1_1026xq26xqlusqkvpm.R.inc(102338);EpubViewBook epubViewBook = gson.fromJson(s, EpubViewBook.class);
            __CLR4_1_1026xq26xqlusqkvpm.R.inc(102339);s = gson.toJson(epubViewBook);
        }
        }__CLR4_1_1026xq26xqlusqkvpm.R.inc(102340);System.out.println("Gson:" + (System.currentTimeMillis() - startTime) + ", " + s.length());
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102341);return s;
    }finally{__CLR4_1_1026xq26xqlusqkvpm.R.flushNeeded();}}

    private String fastjson() {try{__CLR4_1_1026xq26xqlusqkvpm.R.inc(102342);
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102343);String s = JSON.toJSONString(book, SerializerFeature.DisableCircularReferenceDetect);
        
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102344);Long startTime;
        // Fastjson
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102345);startTime = System.currentTimeMillis();
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102346);for (int i = 0; (((i < LOOP_COUNT)&&(__CLR4_1_1026xq26xqlusqkvpm.R.iget(102347)!=0|true))||(__CLR4_1_1026xq26xqlusqkvpm.R.iget(102348)==0&false)); i++) {{
            __CLR4_1_1026xq26xqlusqkvpm.R.inc(102349);book_fastjson = JSON.parseObject(s, EpubViewBook.class, Feature.DisableCircularReferenceDetect);
            //s = JSON.toJSONString(epubViewBook, SerializerFeature.DisableCircularReferenceDetect);
        }
        }__CLR4_1_1026xq26xqlusqkvpm.R.inc(102350);System.out.println("Fastjson:" + (System.currentTimeMillis() - startTime) + ", " + s.length());
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102351);System.out.println(s);
        __CLR4_1_1026xq26xqlusqkvpm.R.inc(102352);return s;
    }finally{__CLR4_1_1026xq26xqlusqkvpm.R.flushNeeded();}}
}
