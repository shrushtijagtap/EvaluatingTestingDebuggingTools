/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_long_field extends TestCase {static class __CLR4_5_21vdq1vdqlusyjver{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87402,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21vdq1vdqlusyjver.R.globalSliceStart(getClass().getName(),87326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21vdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vdq1vdqlusyjver.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vdq1vdqlusyjver.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87326,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21vdq() throws Exception{try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87326);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87327);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87328);
                __CLR4_5_21vdq1vdqlusyjver.R.inc(87329);return false;
            }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}
        };

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87330);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87331);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87332);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87333);A a = new A();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87334);serializer.write(a);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87335);String text = out.toString();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87336);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21vdq1vdqlusyjver.R.globalSliceStart(getClass().getName(),87337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ve1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vdq1vdqlusyjver.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vdq1vdqlusyjver.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ve1() throws Exception{try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87337);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87338);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87339);
                __CLR4_5_21vdq1vdqlusyjver.R.inc(87340);if (((("id".equals(name))&&(__CLR4_5_21vdq1vdqlusyjver.R.iget(87341)!=0|true))||(__CLR4_5_21vdq1vdqlusyjver.R.iget(87342)==0&false))) {{
                    __CLR4_5_21vdq1vdqlusyjver.R.inc(87343);Assert.assertTrue(value instanceof Long);
                    __CLR4_5_21vdq1vdqlusyjver.R.inc(87344);return true;
                }
                }__CLR4_5_21vdq1vdqlusyjver.R.inc(87345);return false;
            }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}
        };

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87346);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87347);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87348);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87349);A a = new A();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87350);serializer.write(a);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87351);String text = out.toString();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87352);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21vdq1vdqlusyjver.R.globalSliceStart(getClass().getName(),87353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441veh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vdq1vdqlusyjver.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vdq1vdqlusyjver.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441veh() throws Exception{try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87353);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87354);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87355);
                __CLR4_5_21vdq1vdqlusyjver.R.inc(87356);if (((("name".equals(name))&&(__CLR4_5_21vdq1vdqlusyjver.R.iget(87357)!=0|true))||(__CLR4_5_21vdq1vdqlusyjver.R.iget(87358)==0&false))) {{
                    __CLR4_5_21vdq1vdqlusyjver.R.inc(87359);return true;
                }
                }__CLR4_5_21vdq1vdqlusyjver.R.inc(87360);return false;
            }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}
        };

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87361);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87362);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87363);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87364);A a = new A();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87365);a.name = "chennp2008";
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87366);serializer.write(a);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87367);String text = out.toString();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87368);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21vdq1vdqlusyjver.R.globalSliceStart(getClass().getName(),87369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1vex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vdq1vdqlusyjver.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vdq1vdqlusyjver.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1vex() throws Exception{try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87369);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87370);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87371);
                __CLR4_5_21vdq1vdqlusyjver.R.inc(87372);if (((("name".equals(name))&&(__CLR4_5_21vdq1vdqlusyjver.R.iget(87373)!=0|true))||(__CLR4_5_21vdq1vdqlusyjver.R.iget(87374)==0&false))) {{
                    __CLR4_5_21vdq1vdqlusyjver.R.inc(87375);return true;
                }
                }__CLR4_5_21vdq1vdqlusyjver.R.inc(87376);return false;
            }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}
        };

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87377);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87378);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87379);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87380);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87381);map.put("name", "chennp2008");
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87382);serializer.write(map);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87383);String text = out.toString();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87384);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21vdq1vdqlusyjver.R.globalSliceStart(getClass().getName(),87385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61vfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vdq1vdqlusyjver.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vdq1vdqlusyjver.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61vfd() throws Exception{try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87385);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87386);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vdq1vdqlusyjver.R.inc(87387);
                __CLR4_5_21vdq1vdqlusyjver.R.inc(87388);if (((("name".equals(name))&&(__CLR4_5_21vdq1vdqlusyjver.R.iget(87389)!=0|true))||(__CLR4_5_21vdq1vdqlusyjver.R.iget(87390)==0&false))) {{
                    __CLR4_5_21vdq1vdqlusyjver.R.inc(87391);return false;
                }
                }__CLR4_5_21vdq1vdqlusyjver.R.inc(87392);return true;
            }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}
        };

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87393);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87394);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87395);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87396);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87397);map.put("id", 3);
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87398);map.put("name", "chennp2008");
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87399);serializer.write(map);

        __CLR4_5_21vdq1vdqlusyjver.R.inc(87400);String text = out.toString();
        __CLR4_5_21vdq1vdqlusyjver.R.inc(87401);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21vdq1vdqlusyjver.R.flushNeeded();}}

    public static class A {

        public long    id;
        public String name;


    }
}
