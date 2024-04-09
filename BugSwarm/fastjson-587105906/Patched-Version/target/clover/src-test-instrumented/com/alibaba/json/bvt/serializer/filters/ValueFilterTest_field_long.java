/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ValueFilterTest_field_long extends TestCase {static class __CLR4_5_21wsz1wszlusvnh59{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,89242,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_5_21wsz1wszlusvnh59.R.globalSliceStart(getClass().getName(),89171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oiyabn1wsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wsz1wszlusvnh59.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wsz1wszlusvnh59.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oiyabn1wsz() throws Exception{try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89171);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89172);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89173);
                __CLR4_5_21wsz1wszlusvnh59.R.inc(89174);if ((((name.equals("id"))&&(__CLR4_5_21wsz1wszlusvnh59.R.iget(89175)!=0|true))||(__CLR4_5_21wsz1wszlusvnh59.R.iget(89176)==0&false))) {{
                    __CLR4_5_21wsz1wszlusvnh59.R.inc(89177);return "AAA";
                }

                }__CLR4_5_21wsz1wszlusvnh59.R.inc(89178);return value;
            }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

        };

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89179);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89180);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89181);serializer.getValueFilters().add(filter);

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89182);Bean a = new Bean();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89183);serializer.write(a);

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89184);String text = out.toString();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89185);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21wsz1wszlusvnh59.R.globalSliceStart(getClass().getName(),89186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1wte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wsz1wszlusvnh59.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wsz1wszlusvnh59.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89186,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1wte() throws Exception{try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89186);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89187);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89188);
                __CLR4_5_21wsz1wszlusvnh59.R.inc(89189);if ((((name.equals("id"))&&(__CLR4_5_21wsz1wszlusvnh59.R.iget(89190)!=0|true))||(__CLR4_5_21wsz1wszlusvnh59.R.iget(89191)==0&false))) {{
                    __CLR4_5_21wsz1wszlusvnh59.R.inc(89192);return "AAA";
                }

                }__CLR4_5_21wsz1wszlusvnh59.R.inc(89193);return value;
            }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

        };
        
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89194);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new Bean(), filter));
    }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_5_21wsz1wszlusvnh59.R.globalSliceStart(getClass().getName(),89195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285ccsr1wtn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wsz1wszlusvnh59.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wsz1wszlusvnh59.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285ccsr1wtn() throws Exception{try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89195);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89196);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89197);
                __CLR4_5_21wsz1wszlusvnh59.R.inc(89198);if ((((name.equals("name"))&&(__CLR4_5_21wsz1wszlusvnh59.R.iget(89199)!=0|true))||(__CLR4_5_21wsz1wszlusvnh59.R.iget(89200)==0&false))) {{
                    __CLR4_5_21wsz1wszlusvnh59.R.inc(89201);return "AAA";
                }

                }__CLR4_5_21wsz1wszlusvnh59.R.inc(89202);return value;
            }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

        };

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89203);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89204);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89205);serializer.getValueFilters().add(filter);

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89206);Bean a = new Bean();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89207);serializer.write(a);

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89208);String text = out.toString();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89209);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_5_21wsz1wszlusvnh59.R.globalSliceStart(getClass().getName(),89210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wce0a1wu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wsz1wszlusvnh59.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wsz1wszlusvnh59.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89210,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wce0a1wu2() throws Exception{try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89210);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89211);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89212);
                __CLR4_5_21wsz1wszlusvnh59.R.inc(89213);if ((((name.equals("name"))&&(__CLR4_5_21wsz1wszlusvnh59.R.iget(89214)!=0|true))||(__CLR4_5_21wsz1wszlusvnh59.R.iget(89215)==0&false))) {{
                    __CLR4_5_21wsz1wszlusvnh59.R.inc(89216);return "AAA";
                }

                }__CLR4_5_21wsz1wszlusvnh59.R.inc(89217);return value;
            }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

        };

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89218);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89219);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89220);serializer.getValueFilters().add(filter);

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89221);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89222);map.put("name", null);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89223);serializer.write(map);

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89224);String text = out.toString();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89225);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_5_21wsz1wszlusvnh59.R.globalSliceStart(getClass().getName(),89226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ncf7t1wui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wsz1wszlusvnh59.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wsz1wszlusvnh59.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ncf7t1wui() throws Exception{try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89226);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89227);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wsz1wszlusvnh59.R.inc(89228);
                __CLR4_5_21wsz1wszlusvnh59.R.inc(89229);if ((((name.equals("name"))&&(__CLR4_5_21wsz1wszlusvnh59.R.iget(89230)!=0|true))||(__CLR4_5_21wsz1wszlusvnh59.R.iget(89231)==0&false))) {{
                    __CLR4_5_21wsz1wszlusvnh59.R.inc(89232);return null;
                }

                }__CLR4_5_21wsz1wszlusvnh59.R.inc(89233);return value;
            }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

        };

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89234);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89235);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89236);serializer.getValueFilters().add(filter);

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89237);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89238);map.put("name", "AA");
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89239);serializer.write(map);

        __CLR4_5_21wsz1wszlusvnh59.R.inc(89240);String text = out.toString();
        __CLR4_5_21wsz1wszlusvnh59.R.inc(89241);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21wsz1wszlusvnh59.R.flushNeeded();}}

    public static class Bean {

        public long    id;
        public String name;


    }
}
