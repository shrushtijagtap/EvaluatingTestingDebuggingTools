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

public class ValueFilterTest_field extends TestCase {static class __CLR4_5_21woq1woqlusvnh4s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,89089,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_5_21woq1woqlusvnh4s.R.globalSliceStart(getClass().getName(),89018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oiyabn1woq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21woq1woqlusvnh4s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21woq1woqlusvnh4s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oiyabn1woq() throws Exception{try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89018);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89019);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89020);
                __CLR4_5_21woq1woqlusvnh4s.R.inc(89021);if ((((name.equals("id"))&&(__CLR4_5_21woq1woqlusvnh4s.R.iget(89022)!=0|true))||(__CLR4_5_21woq1woqlusvnh4s.R.iget(89023)==0&false))) {{
                    __CLR4_5_21woq1woqlusvnh4s.R.inc(89024);return "AAA";
                }

                }__CLR4_5_21woq1woqlusvnh4s.R.inc(89025);return value;
            }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

        };

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89026);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89027);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89028);serializer.getValueFilters().add(filter);

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89029);A a = new A();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89030);serializer.write(a);

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89031);String text = out.toString();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89032);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21woq1woqlusvnh4s.R.globalSliceStart(getClass().getName(),89033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1wp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21woq1woqlusvnh4s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21woq1woqlusvnh4s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89033,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1wp5() throws Exception{try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89033);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89034);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89035);
                __CLR4_5_21woq1woqlusvnh4s.R.inc(89036);if ((((name.equals("id"))&&(__CLR4_5_21woq1woqlusvnh4s.R.iget(89037)!=0|true))||(__CLR4_5_21woq1woqlusvnh4s.R.iget(89038)==0&false))) {{
                    __CLR4_5_21woq1woqlusvnh4s.R.inc(89039);return "AAA";
                }

                }__CLR4_5_21woq1woqlusvnh4s.R.inc(89040);return value;
            }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

        };
        
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89041);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_5_21woq1woqlusvnh4s.R.globalSliceStart(getClass().getName(),89042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285ccsr1wpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21woq1woqlusvnh4s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21woq1woqlusvnh4s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285ccsr1wpe() throws Exception{try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89042);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89043);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89044);
                __CLR4_5_21woq1woqlusvnh4s.R.inc(89045);if ((((name.equals("name"))&&(__CLR4_5_21woq1woqlusvnh4s.R.iget(89046)!=0|true))||(__CLR4_5_21woq1woqlusvnh4s.R.iget(89047)==0&false))) {{
                    __CLR4_5_21woq1woqlusvnh4s.R.inc(89048);return "AAA";
                }

                }__CLR4_5_21woq1woqlusvnh4s.R.inc(89049);return value;
            }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

        };

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89050);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89051);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89052);serializer.getValueFilters().add(filter);

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89053);A a = new A();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89054);serializer.write(a);

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89055);String text = out.toString();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89056);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_5_21woq1woqlusvnh4s.R.globalSliceStart(getClass().getName(),89057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wce0a1wpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21woq1woqlusvnh4s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21woq1woqlusvnh4s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89057,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wce0a1wpt() throws Exception{try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89057);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89058);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89059);
                __CLR4_5_21woq1woqlusvnh4s.R.inc(89060);if ((((name.equals("name"))&&(__CLR4_5_21woq1woqlusvnh4s.R.iget(89061)!=0|true))||(__CLR4_5_21woq1woqlusvnh4s.R.iget(89062)==0&false))) {{
                    __CLR4_5_21woq1woqlusvnh4s.R.inc(89063);return "AAA";
                }

                }__CLR4_5_21woq1woqlusvnh4s.R.inc(89064);return value;
            }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

        };

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89065);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89066);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89067);serializer.getValueFilters().add(filter);

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89068);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89069);map.put("name", null);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89070);serializer.write(map);

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89071);String text = out.toString();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89072);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_5_21woq1woqlusvnh4s.R.globalSliceStart(getClass().getName(),89073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ncf7t1wq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21woq1woqlusvnh4s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21woq1woqlusvnh4s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ncf7t1wq9() throws Exception{try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89073);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89074);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21woq1woqlusvnh4s.R.inc(89075);
                __CLR4_5_21woq1woqlusvnh4s.R.inc(89076);if ((((name.equals("name"))&&(__CLR4_5_21woq1woqlusvnh4s.R.iget(89077)!=0|true))||(__CLR4_5_21woq1woqlusvnh4s.R.iget(89078)==0&false))) {{
                    __CLR4_5_21woq1woqlusvnh4s.R.inc(89079);return null;
                }

                }__CLR4_5_21woq1woqlusvnh4s.R.inc(89080);return value;
            }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

        };

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89081);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89082);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89083);serializer.getValueFilters().add(filter);

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89084);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89085);map.put("name", "AA");
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89086);serializer.write(map);

        __CLR4_5_21woq1woqlusvnh4s.R.inc(89087);String text = out.toString();
        __CLR4_5_21woq1woqlusvnh4s.R.inc(89088);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21woq1woqlusvnh4s.R.flushNeeded();}}

    public static class Bean {

        public int    id;
        public String name;


    }
}
