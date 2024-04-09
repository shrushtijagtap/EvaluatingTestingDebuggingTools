/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.A;

public class ValueFilterTest_field extends TestCase {static class __CLR4_1_101vqt1vqtlusqklp0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceStart(getClass().getName(),87797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oiyabn1vqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vqt1vqtlusqklp0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87797,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oiyabn1vqt() throws Exception{try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87797);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87798);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87799);
                __CLR4_1_101vqt1vqtlusqklp0.R.inc(87800);if ((((name.equals("id"))&&(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87801)!=0|true))||(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87802)==0&false))) {{
                    __CLR4_1_101vqt1vqtlusqklp0.R.inc(87803);return "AAA";
                }

                }__CLR4_1_101vqt1vqtlusqklp0.R.inc(87804);return value;
            }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

        };

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87805);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87806);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87807);serializer.getValueFilters().add(filter);

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87808);A a = new A();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87809);serializer.write(a);

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87810);String text = out.toString();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87811);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceStart(getClass().getName(),87812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1vr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vqt1vqtlusqklp0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87812,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1vr8() throws Exception{try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87812);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87813);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87814);
                __CLR4_1_101vqt1vqtlusqklp0.R.inc(87815);if ((((name.equals("id"))&&(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87816)!=0|true))||(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87817)==0&false))) {{
                    __CLR4_1_101vqt1vqtlusqklp0.R.inc(87818);return "AAA";
                }

                }__CLR4_1_101vqt1vqtlusqklp0.R.inc(87819);return value;
            }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

        };
        
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87820);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceStart(getClass().getName(),87821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1085ccsr1vrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vqt1vqtlusqklp0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87821,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1085ccsr1vrh() throws Exception{try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87821);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87822);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87823);
                __CLR4_1_101vqt1vqtlusqklp0.R.inc(87824);if ((((name.equals("name"))&&(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87825)!=0|true))||(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87826)==0&false))) {{
                    __CLR4_1_101vqt1vqtlusqklp0.R.inc(87827);return "AAA";
                }

                }__CLR4_1_101vqt1vqtlusqklp0.R.inc(87828);return value;
            }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

        };

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87829);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87830);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87831);serializer.getValueFilters().add(filter);

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87832);A a = new A();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87833);serializer.write(a);

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87834);String text = out.toString();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87835);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceStart(getClass().getName(),87836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104wce0a1vrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vqt1vqtlusqklp0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87836,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104wce0a1vrw() throws Exception{try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87836);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87837);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87838);
                __CLR4_1_101vqt1vqtlusqklp0.R.inc(87839);if ((((name.equals("name"))&&(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87840)!=0|true))||(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87841)==0&false))) {{
                    __CLR4_1_101vqt1vqtlusqklp0.R.inc(87842);return "AAA";
                }

                }__CLR4_1_101vqt1vqtlusqklp0.R.inc(87843);return value;
            }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

        };

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87844);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87845);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87846);serializer.getValueFilters().add(filter);

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87847);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87848);map.put("name", null);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87849);serializer.write(map);

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87850);String text = out.toString();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87851);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceStart(getClass().getName(),87852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101ncf7t1vsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vqt1vqtlusqklp0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vqt1vqtlusqklp0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101ncf7t1vsc() throws Exception{try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87852);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87853);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vqt1vqtlusqklp0.R.inc(87854);
                __CLR4_1_101vqt1vqtlusqklp0.R.inc(87855);if ((((name.equals("name"))&&(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87856)!=0|true))||(__CLR4_1_101vqt1vqtlusqklp0.R.iget(87857)==0&false))) {{
                    __CLR4_1_101vqt1vqtlusqklp0.R.inc(87858);return null;
                }

                }__CLR4_1_101vqt1vqtlusqklp0.R.inc(87859);return value;
            }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

        };

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87860);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87861);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87862);serializer.getValueFilters().add(filter);

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87863);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87864);map.put("name", "AA");
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87865);serializer.write(map);

        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87866);String text = out.toString();
        __CLR4_1_101vqt1vqtlusqklp0.R.inc(87867);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101vqt1vqtlusqklp0.R.flushNeeded();}}

    public static class Bean {

        public int    id;
        public String name;


    }
}
