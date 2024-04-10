/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.A;

public class ValueFilterTest_field extends TestCase {static class __CLR4_5_21vqi1vqilusyjvfx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceStart(getClass().getName(),87786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oiyabn1vqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vqi1vqilusyjvfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oiyabn1vqi() throws Exception{try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87786);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87787);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87788);
                __CLR4_5_21vqi1vqilusyjvfx.R.inc(87789);if ((((name.equals("id"))&&(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87790)!=0|true))||(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87791)==0&false))) {{
                    __CLR4_5_21vqi1vqilusyjvfx.R.inc(87792);return "AAA";
                }

                }__CLR4_5_21vqi1vqilusyjvfx.R.inc(87793);return value;
            }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

        };

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87794);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87795);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87796);serializer.getValueFilters().add(filter);

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87797);A a = new A();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87798);serializer.write(a);

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87799);String text = out.toString();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87800);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceStart(getClass().getName(),87801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1vqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vqi1vqilusyjvfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1vqx() throws Exception{try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87801);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87802);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87803);
                __CLR4_5_21vqi1vqilusyjvfx.R.inc(87804);if ((((name.equals("id"))&&(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87805)!=0|true))||(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87806)==0&false))) {{
                    __CLR4_5_21vqi1vqilusyjvfx.R.inc(87807);return "AAA";
                }

                }__CLR4_5_21vqi1vqilusyjvfx.R.inc(87808);return value;
            }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

        };
        
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87809);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceStart(getClass().getName(),87810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285ccsr1vr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vqi1vqilusyjvfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285ccsr1vr6() throws Exception{try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87810);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87811);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87812);
                __CLR4_5_21vqi1vqilusyjvfx.R.inc(87813);if ((((name.equals("name"))&&(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87814)!=0|true))||(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87815)==0&false))) {{
                    __CLR4_5_21vqi1vqilusyjvfx.R.inc(87816);return "AAA";
                }

                }__CLR4_5_21vqi1vqilusyjvfx.R.inc(87817);return value;
            }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

        };

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87818);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87819);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87820);serializer.getValueFilters().add(filter);

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87821);A a = new A();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87822);serializer.write(a);

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87823);String text = out.toString();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87824);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceStart(getClass().getName(),87825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wce0a1vrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vqi1vqilusyjvfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wce0a1vrl() throws Exception{try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87825);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87826);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87827);
                __CLR4_5_21vqi1vqilusyjvfx.R.inc(87828);if ((((name.equals("name"))&&(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87829)!=0|true))||(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87830)==0&false))) {{
                    __CLR4_5_21vqi1vqilusyjvfx.R.inc(87831);return "AAA";
                }

                }__CLR4_5_21vqi1vqilusyjvfx.R.inc(87832);return value;
            }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

        };

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87833);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87834);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87835);serializer.getValueFilters().add(filter);

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87836);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87837);map.put("name", null);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87838);serializer.write(map);

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87839);String text = out.toString();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87840);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceStart(getClass().getName(),87841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ncf7t1vs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vqi1vqilusyjvfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vqi1vqilusyjvfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ncf7t1vs1() throws Exception{try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87841);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87842);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vqi1vqilusyjvfx.R.inc(87843);
                __CLR4_5_21vqi1vqilusyjvfx.R.inc(87844);if ((((name.equals("name"))&&(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87845)!=0|true))||(__CLR4_5_21vqi1vqilusyjvfx.R.iget(87846)==0&false))) {{
                    __CLR4_5_21vqi1vqilusyjvfx.R.inc(87847);return null;
                }

                }__CLR4_5_21vqi1vqilusyjvfx.R.inc(87848);return value;
            }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

        };

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87849);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87850);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87851);serializer.getValueFilters().add(filter);

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87852);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87853);map.put("name", "AA");
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87854);serializer.write(map);

        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87855);String text = out.toString();
        __CLR4_5_21vqi1vqilusyjvfx.R.inc(87856);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vqi1vqilusyjvfx.R.flushNeeded();}}

    public static class Bean {

        public int    id;
        public String name;


    }
}
