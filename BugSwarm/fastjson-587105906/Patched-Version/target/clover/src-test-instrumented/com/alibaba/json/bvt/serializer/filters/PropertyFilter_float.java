/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_float extends TestCase {static class __CLR4_5_21w561w56lusvnh1f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,88398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21w561w56lusvnh1f.R.globalSliceStart(getClass().getName(),88314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21w56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w561w56lusvnh1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w561w56lusvnh1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88314,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21w56() throws Exception{try{__CLR4_5_21w561w56lusvnh1f.R.inc(88314);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88315);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88316);
                __CLR4_5_21w561w56lusvnh1f.R.inc(88317);return false;
            }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}
        };

        __CLR4_5_21w561w56lusvnh1f.R.inc(88318);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88319);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88320);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88321);A a = new A();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88322);serializer.write(a);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88323);String text = out.toString();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88324);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21w561w56lusvnh1f.R.globalSliceStart(getClass().getName(),88325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1w5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w561w56lusvnh1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w561w56lusvnh1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1w5h() throws Exception{try{__CLR4_5_21w561w56lusvnh1f.R.inc(88325);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88326);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88327);
                __CLR4_5_21w561w56lusvnh1f.R.inc(88328);if (((("id".equals(name))&&(__CLR4_5_21w561w56lusvnh1f.R.iget(88329)!=0|true))||(__CLR4_5_21w561w56lusvnh1f.R.iget(88330)==0&false))) {{
                    __CLR4_5_21w561w56lusvnh1f.R.inc(88331);Assert.assertTrue(value instanceof Float);
                    __CLR4_5_21w561w56lusvnh1f.R.inc(88332);return true;
                }
                }__CLR4_5_21w561w56lusvnh1f.R.inc(88333);return false;
            }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}
        };

        __CLR4_5_21w561w56lusvnh1f.R.inc(88334);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88335);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88336);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88337);A a = new A();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88338);serializer.write(a);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88339);String text = out.toString();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88340);Assert.assertEquals("{\"id\":0.0}", text);
    }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21w561w56lusvnh1f.R.globalSliceStart(getClass().getName(),88341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441w5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w561w56lusvnh1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w561w56lusvnh1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88341,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441w5x() throws Exception{try{__CLR4_5_21w561w56lusvnh1f.R.inc(88341);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88342);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88343);
                __CLR4_5_21w561w56lusvnh1f.R.inc(88344);if (((("name".equals(name))&&(__CLR4_5_21w561w56lusvnh1f.R.iget(88345)!=0|true))||(__CLR4_5_21w561w56lusvnh1f.R.iget(88346)==0&false))) {{
                    __CLR4_5_21w561w56lusvnh1f.R.inc(88347);return true;
                }
                }__CLR4_5_21w561w56lusvnh1f.R.inc(88348);return false;
            }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}
        };

        __CLR4_5_21w561w56lusvnh1f.R.inc(88349);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88350);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88351);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88352);A a = new A();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88353);a.setName("chennp2008");
        __CLR4_5_21w561w56lusvnh1f.R.inc(88354);serializer.write(a);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88355);String text = out.toString();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88356);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21w561w56lusvnh1f.R.globalSliceStart(getClass().getName(),88357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1w6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w561w56lusvnh1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w561w56lusvnh1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1w6d() throws Exception{try{__CLR4_5_21w561w56lusvnh1f.R.inc(88357);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88358);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88359);
                __CLR4_5_21w561w56lusvnh1f.R.inc(88360);if (((("name".equals(name))&&(__CLR4_5_21w561w56lusvnh1f.R.iget(88361)!=0|true))||(__CLR4_5_21w561w56lusvnh1f.R.iget(88362)==0&false))) {{
                    __CLR4_5_21w561w56lusvnh1f.R.inc(88363);return true;
                }
                }__CLR4_5_21w561w56lusvnh1f.R.inc(88364);return false;
            }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}
        };

        __CLR4_5_21w561w56lusvnh1f.R.inc(88365);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88366);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88367);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88368);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88369);map.put("name", "chennp2008");
        __CLR4_5_21w561w56lusvnh1f.R.inc(88370);serializer.write(map);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88371);String text = out.toString();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88372);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21w561w56lusvnh1f.R.globalSliceStart(getClass().getName(),88373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61w6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w561w56lusvnh1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w561w56lusvnh1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61w6t() throws Exception{try{__CLR4_5_21w561w56lusvnh1f.R.inc(88373);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88374);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88375);
                __CLR4_5_21w561w56lusvnh1f.R.inc(88376);if (((("name".equals(name))&&(__CLR4_5_21w561w56lusvnh1f.R.iget(88377)!=0|true))||(__CLR4_5_21w561w56lusvnh1f.R.iget(88378)==0&false))) {{
                    __CLR4_5_21w561w56lusvnh1f.R.inc(88379);return false;
                }
                }__CLR4_5_21w561w56lusvnh1f.R.inc(88380);return true;
            }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}
        };

        __CLR4_5_21w561w56lusvnh1f.R.inc(88381);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88382);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88383);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88384);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88385);map.put("id", 3);
        __CLR4_5_21w561w56lusvnh1f.R.inc(88386);map.put("name", "chennp2008");
        __CLR4_5_21w561w56lusvnh1f.R.inc(88387);serializer.write(map);

        __CLR4_5_21w561w56lusvnh1f.R.inc(88388);String text = out.toString();
        __CLR4_5_21w561w56lusvnh1f.R.inc(88389);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

    public static class A {

        private float    id;
        private String name;

        public float getId() {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88390);
            __CLR4_5_21w561w56lusvnh1f.R.inc(88391);return id;
        }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

        public void setId(float id) {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88392);
            __CLR4_5_21w561w56lusvnh1f.R.inc(88393);this.id = id;
        }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88394);
            __CLR4_5_21w561w56lusvnh1f.R.inc(88395);return name;
        }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21w561w56lusvnh1f.R.inc(88396);
            __CLR4_5_21w561w56lusvnh1f.R.inc(88397);this.name = name;
        }finally{__CLR4_5_21w561w56lusvnh1f.R.flushNeeded();}}

    }
}
