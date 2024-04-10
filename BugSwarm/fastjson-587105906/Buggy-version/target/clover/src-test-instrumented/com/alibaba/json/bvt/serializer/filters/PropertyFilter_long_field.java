/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_long_field extends TestCase {static class __CLR4_1_101wc91wc9luszwfld{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101wc91wc9luszwfld.R.globalSliceStart(getClass().getName(),88569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21wc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wc91wc9luszwfld.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wc91wc9luszwfld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88569,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21wc9() throws Exception{try{__CLR4_1_101wc91wc9luszwfld.R.inc(88569);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88570);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wc91wc9luszwfld.R.inc(88571);
                __CLR4_1_101wc91wc9luszwfld.R.inc(88572);return false;
            }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}
        };

        __CLR4_1_101wc91wc9luszwfld.R.inc(88573);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88574);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88575);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88576);A a = new A();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88577);serializer.write(a);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88578);String text = out.toString();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88579);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101wc91wc9luszwfld.R.globalSliceStart(getClass().getName(),88580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1wck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wc91wc9luszwfld.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wc91wc9luszwfld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88580,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1wck() throws Exception{try{__CLR4_1_101wc91wc9luszwfld.R.inc(88580);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88581);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wc91wc9luszwfld.R.inc(88582);
                __CLR4_1_101wc91wc9luszwfld.R.inc(88583);if (((("id".equals(name))&&(__CLR4_1_101wc91wc9luszwfld.R.iget(88584)!=0|true))||(__CLR4_1_101wc91wc9luszwfld.R.iget(88585)==0&false))) {{
                    __CLR4_1_101wc91wc9luszwfld.R.inc(88586);Assert.assertTrue(value instanceof Long);
                    __CLR4_1_101wc91wc9luszwfld.R.inc(88587);return true;
                }
                }__CLR4_1_101wc91wc9luszwfld.R.inc(88588);return false;
            }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}
        };

        __CLR4_1_101wc91wc9luszwfld.R.inc(88589);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88590);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88591);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88592);A a = new A();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88593);serializer.write(a);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88594);String text = out.toString();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88595);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101wc91wc9luszwfld.R.globalSliceStart(getClass().getName(),88596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441wd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wc91wc9luszwfld.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wc91wc9luszwfld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88596,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441wd0() throws Exception{try{__CLR4_1_101wc91wc9luszwfld.R.inc(88596);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88597);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wc91wc9luszwfld.R.inc(88598);
                __CLR4_1_101wc91wc9luszwfld.R.inc(88599);if (((("name".equals(name))&&(__CLR4_1_101wc91wc9luszwfld.R.iget(88600)!=0|true))||(__CLR4_1_101wc91wc9luszwfld.R.iget(88601)==0&false))) {{
                    __CLR4_1_101wc91wc9luszwfld.R.inc(88602);return true;
                }
                }__CLR4_1_101wc91wc9luszwfld.R.inc(88603);return false;
            }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}
        };

        __CLR4_1_101wc91wc9luszwfld.R.inc(88604);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88605);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88606);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88607);A a = new A();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88608);a.name = "chennp2008";
        __CLR4_1_101wc91wc9luszwfld.R.inc(88609);serializer.write(a);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88610);String text = out.toString();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88611);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101wc91wc9luszwfld.R.globalSliceStart(getClass().getName(),88612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1wdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wc91wc9luszwfld.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wc91wc9luszwfld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88612,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1wdg() throws Exception{try{__CLR4_1_101wc91wc9luszwfld.R.inc(88612);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88613);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wc91wc9luszwfld.R.inc(88614);
                __CLR4_1_101wc91wc9luszwfld.R.inc(88615);if (((("name".equals(name))&&(__CLR4_1_101wc91wc9luszwfld.R.iget(88616)!=0|true))||(__CLR4_1_101wc91wc9luszwfld.R.iget(88617)==0&false))) {{
                    __CLR4_1_101wc91wc9luszwfld.R.inc(88618);return true;
                }
                }__CLR4_1_101wc91wc9luszwfld.R.inc(88619);return false;
            }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}
        };

        __CLR4_1_101wc91wc9luszwfld.R.inc(88620);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88621);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88622);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88623);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88624);map.put("name", "chennp2008");
        __CLR4_1_101wc91wc9luszwfld.R.inc(88625);serializer.write(map);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88626);String text = out.toString();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88627);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101wc91wc9luszwfld.R.globalSliceStart(getClass().getName(),88628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61wdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wc91wc9luszwfld.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wc91wc9luszwfld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long_field.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88628,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61wdw() throws Exception{try{__CLR4_1_101wc91wc9luszwfld.R.inc(88628);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88629);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wc91wc9luszwfld.R.inc(88630);
                __CLR4_1_101wc91wc9luszwfld.R.inc(88631);if (((("name".equals(name))&&(__CLR4_1_101wc91wc9luszwfld.R.iget(88632)!=0|true))||(__CLR4_1_101wc91wc9luszwfld.R.iget(88633)==0&false))) {{
                    __CLR4_1_101wc91wc9luszwfld.R.inc(88634);return false;
                }
                }__CLR4_1_101wc91wc9luszwfld.R.inc(88635);return true;
            }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}
        };

        __CLR4_1_101wc91wc9luszwfld.R.inc(88636);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88637);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88638);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88639);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88640);map.put("id", 3);
        __CLR4_1_101wc91wc9luszwfld.R.inc(88641);map.put("name", "chennp2008");
        __CLR4_1_101wc91wc9luszwfld.R.inc(88642);serializer.write(map);

        __CLR4_1_101wc91wc9luszwfld.R.inc(88643);String text = out.toString();
        __CLR4_1_101wc91wc9luszwfld.R.inc(88644);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101wc91wc9luszwfld.R.flushNeeded();}}

    public static class A {

        public long    id;
        public String name;


    }
}
