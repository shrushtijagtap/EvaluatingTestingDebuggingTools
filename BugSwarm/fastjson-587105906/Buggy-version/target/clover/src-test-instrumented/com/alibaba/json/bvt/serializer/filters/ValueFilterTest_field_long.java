/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ValueFilterTest_field_long extends TestCase {static class __CLR4_1_101wta1wtaluszwfnh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,89253,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_1_101wta1wtaluszwfnh.R.globalSliceStart(getClass().getName(),89182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oiyabn1wta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wta1wtaluszwfnh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wta1wtaluszwfnh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89182,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oiyabn1wta() throws Exception{try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89182);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89183);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89184);
                __CLR4_1_101wta1wtaluszwfnh.R.inc(89185);if ((((name.equals("id"))&&(__CLR4_1_101wta1wtaluszwfnh.R.iget(89186)!=0|true))||(__CLR4_1_101wta1wtaluszwfnh.R.iget(89187)==0&false))) {{
                    __CLR4_1_101wta1wtaluszwfnh.R.inc(89188);return "AAA";
                }

                }__CLR4_1_101wta1wtaluszwfnh.R.inc(89189);return value;
            }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

        };

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89190);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89191);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89192);serializer.getValueFilters().add(filter);

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89193);Bean a = new Bean();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89194);serializer.write(a);

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89195);String text = out.toString();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89196);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101wta1wtaluszwfnh.R.globalSliceStart(getClass().getName(),89197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1wtp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wta1wtaluszwfnh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wta1wtaluszwfnh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89197,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1wtp() throws Exception{try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89197);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89198);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89199);
                __CLR4_1_101wta1wtaluszwfnh.R.inc(89200);if ((((name.equals("id"))&&(__CLR4_1_101wta1wtaluszwfnh.R.iget(89201)!=0|true))||(__CLR4_1_101wta1wtaluszwfnh.R.iget(89202)==0&false))) {{
                    __CLR4_1_101wta1wtaluszwfnh.R.inc(89203);return "AAA";
                }

                }__CLR4_1_101wta1wtaluszwfnh.R.inc(89204);return value;
            }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

        };
        
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89205);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new Bean(), filter));
    }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_1_101wta1wtaluszwfnh.R.globalSliceStart(getClass().getName(),89206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1085ccsr1wty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wta1wtaluszwfnh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wta1wtaluszwfnh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89206,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1085ccsr1wty() throws Exception{try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89206);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89207);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89208);
                __CLR4_1_101wta1wtaluszwfnh.R.inc(89209);if ((((name.equals("name"))&&(__CLR4_1_101wta1wtaluszwfnh.R.iget(89210)!=0|true))||(__CLR4_1_101wta1wtaluszwfnh.R.iget(89211)==0&false))) {{
                    __CLR4_1_101wta1wtaluszwfnh.R.inc(89212);return "AAA";
                }

                }__CLR4_1_101wta1wtaluszwfnh.R.inc(89213);return value;
            }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

        };

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89214);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89215);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89216);serializer.getValueFilters().add(filter);

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89217);Bean a = new Bean();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89218);serializer.write(a);

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89219);String text = out.toString();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89220);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_1_101wta1wtaluszwfnh.R.globalSliceStart(getClass().getName(),89221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104wce0a1wud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wta1wtaluszwfnh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wta1wtaluszwfnh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89221,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104wce0a1wud() throws Exception{try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89221);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89222);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89223);
                __CLR4_1_101wta1wtaluszwfnh.R.inc(89224);if ((((name.equals("name"))&&(__CLR4_1_101wta1wtaluszwfnh.R.iget(89225)!=0|true))||(__CLR4_1_101wta1wtaluszwfnh.R.iget(89226)==0&false))) {{
                    __CLR4_1_101wta1wtaluszwfnh.R.inc(89227);return "AAA";
                }

                }__CLR4_1_101wta1wtaluszwfnh.R.inc(89228);return value;
            }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

        };

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89229);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89230);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89231);serializer.getValueFilters().add(filter);

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89232);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89233);map.put("name", null);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89234);serializer.write(map);

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89235);String text = out.toString();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89236);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_1_101wta1wtaluszwfnh.R.globalSliceStart(getClass().getName(),89237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101ncf7t1wut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wta1wtaluszwfnh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wta1wtaluszwfnh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89237,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101ncf7t1wut() throws Exception{try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89237);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89238);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wta1wtaluszwfnh.R.inc(89239);
                __CLR4_1_101wta1wtaluszwfnh.R.inc(89240);if ((((name.equals("name"))&&(__CLR4_1_101wta1wtaluszwfnh.R.iget(89241)!=0|true))||(__CLR4_1_101wta1wtaluszwfnh.R.iget(89242)==0&false))) {{
                    __CLR4_1_101wta1wtaluszwfnh.R.inc(89243);return null;
                }

                }__CLR4_1_101wta1wtaluszwfnh.R.inc(89244);return value;
            }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

        };

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89245);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89246);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89247);serializer.getValueFilters().add(filter);

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89248);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89249);map.put("name", "AA");
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89250);serializer.write(map);

        __CLR4_1_101wta1wtaluszwfnh.R.inc(89251);String text = out.toString();
        __CLR4_1_101wta1wtaluszwfnh.R.inc(89252);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101wta1wtaluszwfnh.R.flushNeeded();}}

    public static class Bean {

        public long    id;
        public String name;


    }
}
