/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ValueFilterTest_field_boolean extends TestCase {static class __CLR4_5_21wqp1wqplusvnh52{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,89160,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_5_21wqp1wqplusvnh52.R.globalSliceStart(getClass().getName(),89089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oiyabn1wqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wqp1wqplusvnh52.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wqp1wqplusvnh52.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oiyabn1wqp() throws Exception{try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89089);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89090);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89091);
                __CLR4_5_21wqp1wqplusvnh52.R.inc(89092);if ((((name.equals("id"))&&(__CLR4_5_21wqp1wqplusvnh52.R.iget(89093)!=0|true))||(__CLR4_5_21wqp1wqplusvnh52.R.iget(89094)==0&false))) {{
                    __CLR4_5_21wqp1wqplusvnh52.R.inc(89095);return "AAA";
                }

                }__CLR4_5_21wqp1wqplusvnh52.R.inc(89096);return value;
            }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

        };

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89097);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89098);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89099);serializer.getValueFilters().add(filter);

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89100);Bean a = new Bean();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89101);serializer.write(a);

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89102);String text = out.toString();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89103);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21wqp1wqplusvnh52.R.globalSliceStart(getClass().getName(),89104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1wr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wqp1wqplusvnh52.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wqp1wqplusvnh52.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1wr4() throws Exception{try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89104);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89105);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89106);
                __CLR4_5_21wqp1wqplusvnh52.R.inc(89107);if ((((name.equals("id"))&&(__CLR4_5_21wqp1wqplusvnh52.R.iget(89108)!=0|true))||(__CLR4_5_21wqp1wqplusvnh52.R.iget(89109)==0&false))) {{
                    __CLR4_5_21wqp1wqplusvnh52.R.inc(89110);return "AAA";
                }

                }__CLR4_5_21wqp1wqplusvnh52.R.inc(89111);return value;
            }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

        };
        
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89112);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new Bean(), filter));
    }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_5_21wqp1wqplusvnh52.R.globalSliceStart(getClass().getName(),89113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285ccsr1wrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wqp1wqplusvnh52.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wqp1wqplusvnh52.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89113,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285ccsr1wrd() throws Exception{try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89113);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89114);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89115);
                __CLR4_5_21wqp1wqplusvnh52.R.inc(89116);if ((((name.equals("name"))&&(__CLR4_5_21wqp1wqplusvnh52.R.iget(89117)!=0|true))||(__CLR4_5_21wqp1wqplusvnh52.R.iget(89118)==0&false))) {{
                    __CLR4_5_21wqp1wqplusvnh52.R.inc(89119);return "AAA";
                }

                }__CLR4_5_21wqp1wqplusvnh52.R.inc(89120);return value;
            }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

        };

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89121);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89122);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89123);serializer.getValueFilters().add(filter);

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89124);Bean a = new Bean();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89125);serializer.write(a);

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89126);String text = out.toString();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89127);Assert.assertEquals("{\"id\":false,\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_5_21wqp1wqplusvnh52.R.globalSliceStart(getClass().getName(),89128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wce0a1wrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wqp1wqplusvnh52.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wqp1wqplusvnh52.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89128,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wce0a1wrs() throws Exception{try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89128);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89129);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89130);
                __CLR4_5_21wqp1wqplusvnh52.R.inc(89131);if ((((name.equals("name"))&&(__CLR4_5_21wqp1wqplusvnh52.R.iget(89132)!=0|true))||(__CLR4_5_21wqp1wqplusvnh52.R.iget(89133)==0&false))) {{
                    __CLR4_5_21wqp1wqplusvnh52.R.inc(89134);return "AAA";
                }

                }__CLR4_5_21wqp1wqplusvnh52.R.inc(89135);return value;
            }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

        };

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89136);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89137);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89138);serializer.getValueFilters().add(filter);

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89139);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89140);map.put("name", null);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89141);serializer.write(map);

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89142);String text = out.toString();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89143);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_5_21wqp1wqplusvnh52.R.globalSliceStart(getClass().getName(),89144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ncf7t1ws8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wqp1wqplusvnh52.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wqp1wqplusvnh52.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ncf7t1ws8() throws Exception{try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89144);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89145);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21wqp1wqplusvnh52.R.inc(89146);
                __CLR4_5_21wqp1wqplusvnh52.R.inc(89147);if ((((name.equals("name"))&&(__CLR4_5_21wqp1wqplusvnh52.R.iget(89148)!=0|true))||(__CLR4_5_21wqp1wqplusvnh52.R.iget(89149)==0&false))) {{
                    __CLR4_5_21wqp1wqplusvnh52.R.inc(89150);return null;
                }

                }__CLR4_5_21wqp1wqplusvnh52.R.inc(89151);return value;
            }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

        };

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89152);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89153);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89154);serializer.getValueFilters().add(filter);

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89155);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89156);map.put("name", "AA");
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89157);serializer.write(map);

        __CLR4_5_21wqp1wqplusvnh52.R.inc(89158);String text = out.toString();
        __CLR4_5_21wqp1wqplusvnh52.R.inc(89159);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21wqp1wqplusvnh52.R.flushNeeded();}}

    public static class Bean {

        public boolean    id;
        public String name;


    }
}
