/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ValueFilterTest_field_boolean extends TestCase {static class __CLR4_1_101wr01wr0luszwfnb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,89171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_1_101wr01wr0luszwfnb.R.globalSliceStart(getClass().getName(),89100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oiyabn1wr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wr01wr0luszwfnb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wr01wr0luszwfnb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89100,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oiyabn1wr0() throws Exception{try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89100);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89101);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89102);
                __CLR4_1_101wr01wr0luszwfnb.R.inc(89103);if ((((name.equals("id"))&&(__CLR4_1_101wr01wr0luszwfnb.R.iget(89104)!=0|true))||(__CLR4_1_101wr01wr0luszwfnb.R.iget(89105)==0&false))) {{
                    __CLR4_1_101wr01wr0luszwfnb.R.inc(89106);return "AAA";
                }

                }__CLR4_1_101wr01wr0luszwfnb.R.inc(89107);return value;
            }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

        };

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89108);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89109);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89110);serializer.getValueFilters().add(filter);

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89111);Bean a = new Bean();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89112);serializer.write(a);

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89113);String text = out.toString();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89114);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101wr01wr0luszwfnb.R.globalSliceStart(getClass().getName(),89115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1wrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wr01wr0luszwfnb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wr01wr0luszwfnb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89115,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1wrf() throws Exception{try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89115);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89116);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89117);
                __CLR4_1_101wr01wr0luszwfnb.R.inc(89118);if ((((name.equals("id"))&&(__CLR4_1_101wr01wr0luszwfnb.R.iget(89119)!=0|true))||(__CLR4_1_101wr01wr0luszwfnb.R.iget(89120)==0&false))) {{
                    __CLR4_1_101wr01wr0luszwfnb.R.inc(89121);return "AAA";
                }

                }__CLR4_1_101wr01wr0luszwfnb.R.inc(89122);return value;
            }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

        };
        
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89123);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new Bean(), filter));
    }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_1_101wr01wr0luszwfnb.R.globalSliceStart(getClass().getName(),89124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1085ccsr1wro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wr01wr0luszwfnb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wr01wr0luszwfnb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89124,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1085ccsr1wro() throws Exception{try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89124);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89125);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89126);
                __CLR4_1_101wr01wr0luszwfnb.R.inc(89127);if ((((name.equals("name"))&&(__CLR4_1_101wr01wr0luszwfnb.R.iget(89128)!=0|true))||(__CLR4_1_101wr01wr0luszwfnb.R.iget(89129)==0&false))) {{
                    __CLR4_1_101wr01wr0luszwfnb.R.inc(89130);return "AAA";
                }

                }__CLR4_1_101wr01wr0luszwfnb.R.inc(89131);return value;
            }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

        };

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89132);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89133);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89134);serializer.getValueFilters().add(filter);

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89135);Bean a = new Bean();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89136);serializer.write(a);

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89137);String text = out.toString();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89138);Assert.assertEquals("{\"id\":false,\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_1_101wr01wr0luszwfnb.R.globalSliceStart(getClass().getName(),89139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104wce0a1ws3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wr01wr0luszwfnb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wr01wr0luszwfnb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89139,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104wce0a1ws3() throws Exception{try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89139);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89140);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89141);
                __CLR4_1_101wr01wr0luszwfnb.R.inc(89142);if ((((name.equals("name"))&&(__CLR4_1_101wr01wr0luszwfnb.R.iget(89143)!=0|true))||(__CLR4_1_101wr01wr0luszwfnb.R.iget(89144)==0&false))) {{
                    __CLR4_1_101wr01wr0luszwfnb.R.inc(89145);return "AAA";
                }

                }__CLR4_1_101wr01wr0luszwfnb.R.inc(89146);return value;
            }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

        };

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89147);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89148);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89149);serializer.getValueFilters().add(filter);

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89150);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89151);map.put("name", null);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89152);serializer.write(map);

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89153);String text = out.toString();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89154);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_1_101wr01wr0luszwfnb.R.globalSliceStart(getClass().getName(),89155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101ncf7t1wsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wr01wr0luszwfnb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wr01wr0luszwfnb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89155,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101ncf7t1wsj() throws Exception{try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89155);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89156);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wr01wr0luszwfnb.R.inc(89157);
                __CLR4_1_101wr01wr0luszwfnb.R.inc(89158);if ((((name.equals("name"))&&(__CLR4_1_101wr01wr0luszwfnb.R.iget(89159)!=0|true))||(__CLR4_1_101wr01wr0luszwfnb.R.iget(89160)==0&false))) {{
                    __CLR4_1_101wr01wr0luszwfnb.R.inc(89161);return null;
                }

                }__CLR4_1_101wr01wr0luszwfnb.R.inc(89162);return value;
            }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

        };

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89163);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89164);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89165);serializer.getValueFilters().add(filter);

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89166);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89167);map.put("name", "AA");
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89168);serializer.write(map);

        __CLR4_1_101wr01wr0luszwfnb.R.inc(89169);String text = out.toString();
        __CLR4_1_101wr01wr0luszwfnb.R.inc(89170);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101wr01wr0luszwfnb.R.flushNeeded();}}

    public static class Bean {

        public boolean    id;
        public String name;


    }
}
