/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_long_field extends TestCase {static class __CLR4_5_21wby1wbylusvnh2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,88634,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21wby1wbylusvnh2g.R.globalSliceStart(getClass().getName(),88558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21wby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wby1wbylusvnh2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wby1wbylusvnh2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21wby() throws Exception{try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88558);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88559);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88560);
                __CLR4_5_21wby1wbylusvnh2g.R.inc(88561);return false;
            }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}
        };

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88562);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88563);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88564);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88565);A a = new A();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88566);serializer.write(a);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88567);String text = out.toString();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88568);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21wby1wbylusvnh2g.R.globalSliceStart(getClass().getName(),88569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1wc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wby1wbylusvnh2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wby1wbylusvnh2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1wc9() throws Exception{try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88569);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88570);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88571);
                __CLR4_5_21wby1wbylusvnh2g.R.inc(88572);if (((("id".equals(name))&&(__CLR4_5_21wby1wbylusvnh2g.R.iget(88573)!=0|true))||(__CLR4_5_21wby1wbylusvnh2g.R.iget(88574)==0&false))) {{
                    __CLR4_5_21wby1wbylusvnh2g.R.inc(88575);Assert.assertTrue(value instanceof Long);
                    __CLR4_5_21wby1wbylusvnh2g.R.inc(88576);return true;
                }
                }__CLR4_5_21wby1wbylusvnh2g.R.inc(88577);return false;
            }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}
        };

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88578);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88579);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88580);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88581);A a = new A();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88582);serializer.write(a);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88583);String text = out.toString();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88584);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21wby1wbylusvnh2g.R.globalSliceStart(getClass().getName(),88585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441wcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wby1wbylusvnh2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wby1wbylusvnh2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441wcp() throws Exception{try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88585);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88586);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88587);
                __CLR4_5_21wby1wbylusvnh2g.R.inc(88588);if (((("name".equals(name))&&(__CLR4_5_21wby1wbylusvnh2g.R.iget(88589)!=0|true))||(__CLR4_5_21wby1wbylusvnh2g.R.iget(88590)==0&false))) {{
                    __CLR4_5_21wby1wbylusvnh2g.R.inc(88591);return true;
                }
                }__CLR4_5_21wby1wbylusvnh2g.R.inc(88592);return false;
            }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}
        };

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88593);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88594);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88595);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88596);A a = new A();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88597);a.name = "chennp2008";
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88598);serializer.write(a);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88599);String text = out.toString();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88600);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21wby1wbylusvnh2g.R.globalSliceStart(getClass().getName(),88601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1wd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wby1wbylusvnh2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wby1wbylusvnh2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1wd5() throws Exception{try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88601);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88602);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88603);
                __CLR4_5_21wby1wbylusvnh2g.R.inc(88604);if (((("name".equals(name))&&(__CLR4_5_21wby1wbylusvnh2g.R.iget(88605)!=0|true))||(__CLR4_5_21wby1wbylusvnh2g.R.iget(88606)==0&false))) {{
                    __CLR4_5_21wby1wbylusvnh2g.R.inc(88607);return true;
                }
                }__CLR4_5_21wby1wbylusvnh2g.R.inc(88608);return false;
            }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}
        };

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88609);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88610);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88611);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88612);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88613);map.put("name", "chennp2008");
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88614);serializer.write(map);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88615);String text = out.toString();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88616);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21wby1wbylusvnh2g.R.globalSliceStart(getClass().getName(),88617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61wdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wby1wbylusvnh2g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wby1wbylusvnh2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61wdl() throws Exception{try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88617);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88618);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21wby1wbylusvnh2g.R.inc(88619);
                __CLR4_5_21wby1wbylusvnh2g.R.inc(88620);if (((("name".equals(name))&&(__CLR4_5_21wby1wbylusvnh2g.R.iget(88621)!=0|true))||(__CLR4_5_21wby1wbylusvnh2g.R.iget(88622)==0&false))) {{
                    __CLR4_5_21wby1wbylusvnh2g.R.inc(88623);return false;
                }
                }__CLR4_5_21wby1wbylusvnh2g.R.inc(88624);return true;
            }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}
        };

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88625);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88626);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88627);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88628);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88629);map.put("id", 3);
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88630);map.put("name", "chennp2008");
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88631);serializer.write(map);

        __CLR4_5_21wby1wbylusvnh2g.R.inc(88632);String text = out.toString();
        __CLR4_5_21wby1wbylusvnh2g.R.inc(88633);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21wby1wbylusvnh2g.R.flushNeeded();}}

    public static class A {

        public long    id;
        public String name;


    }
}
