/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_long extends TestCase {static class __CLR4_1_101w9x1w9xluszwfl6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88569,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceStart(getClass().getName(),88485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21w9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w9x1w9xluszwfl6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88485,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21w9x() throws Exception{try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88485);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88486);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88487);
                __CLR4_1_101w9x1w9xluszwfl6.R.inc(88488);return false;
            }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}
        };

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88489);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88490);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88491);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88492);A a = new A();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88493);serializer.write(a);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88494);String text = out.toString();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88495);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceStart(getClass().getName(),88496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1wa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w9x1w9xluszwfl6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88496,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1wa8() throws Exception{try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88496);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88497);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88498);
                __CLR4_1_101w9x1w9xluszwfl6.R.inc(88499);if (((("id".equals(name))&&(__CLR4_1_101w9x1w9xluszwfl6.R.iget(88500)!=0|true))||(__CLR4_1_101w9x1w9xluszwfl6.R.iget(88501)==0&false))) {{
                    __CLR4_1_101w9x1w9xluszwfl6.R.inc(88502);Assert.assertTrue(value instanceof Long);
                    __CLR4_1_101w9x1w9xluszwfl6.R.inc(88503);return true;
                }
                }__CLR4_1_101w9x1w9xluszwfl6.R.inc(88504);return false;
            }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}
        };

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88505);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88506);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88507);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88508);A a = new A();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88509);serializer.write(a);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88510);String text = out.toString();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88511);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceStart(getClass().getName(),88512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441wao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w9x1w9xluszwfl6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88512,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441wao() throws Exception{try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88512);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88513);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88514);
                __CLR4_1_101w9x1w9xluszwfl6.R.inc(88515);if (((("name".equals(name))&&(__CLR4_1_101w9x1w9xluszwfl6.R.iget(88516)!=0|true))||(__CLR4_1_101w9x1w9xluszwfl6.R.iget(88517)==0&false))) {{
                    __CLR4_1_101w9x1w9xluszwfl6.R.inc(88518);return true;
                }
                }__CLR4_1_101w9x1w9xluszwfl6.R.inc(88519);return false;
            }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}
        };

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88520);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88521);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88522);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88523);A a = new A();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88524);a.setName("chennp2008");
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88525);serializer.write(a);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88526);String text = out.toString();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88527);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceStart(getClass().getName(),88528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1wb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w9x1w9xluszwfl6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88528,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1wb4() throws Exception{try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88528);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88529);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88530);
                __CLR4_1_101w9x1w9xluszwfl6.R.inc(88531);if (((("name".equals(name))&&(__CLR4_1_101w9x1w9xluszwfl6.R.iget(88532)!=0|true))||(__CLR4_1_101w9x1w9xluszwfl6.R.iget(88533)==0&false))) {{
                    __CLR4_1_101w9x1w9xluszwfl6.R.inc(88534);return true;
                }
                }__CLR4_1_101w9x1w9xluszwfl6.R.inc(88535);return false;
            }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}
        };

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88536);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88537);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88538);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88539);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88540);map.put("name", "chennp2008");
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88541);serializer.write(map);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88542);String text = out.toString();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88543);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceStart(getClass().getName(),88544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61wbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w9x1w9xluszwfl6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w9x1w9xluszwfl6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88544,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61wbk() throws Exception{try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88544);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88545);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88546);
                __CLR4_1_101w9x1w9xluszwfl6.R.inc(88547);if (((("name".equals(name))&&(__CLR4_1_101w9x1w9xluszwfl6.R.iget(88548)!=0|true))||(__CLR4_1_101w9x1w9xluszwfl6.R.iget(88549)==0&false))) {{
                    __CLR4_1_101w9x1w9xluszwfl6.R.inc(88550);return false;
                }
                }__CLR4_1_101w9x1w9xluszwfl6.R.inc(88551);return true;
            }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}
        };

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88552);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88553);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88554);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88555);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88556);map.put("id", 3);
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88557);map.put("name", "chennp2008");
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88558);serializer.write(map);

        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88559);String text = out.toString();
        __CLR4_1_101w9x1w9xluszwfl6.R.inc(88560);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

    public static class A {

        private long    id;
        private String name;

        public long getId() {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88561);
            __CLR4_1_101w9x1w9xluszwfl6.R.inc(88562);return id;
        }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88563);
            __CLR4_1_101w9x1w9xluszwfl6.R.inc(88564);this.id = id;
        }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88565);
            __CLR4_1_101w9x1w9xluszwfl6.R.inc(88566);return name;
        }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101w9x1w9xluszwfl6.R.inc(88567);
            __CLR4_1_101w9x1w9xluszwfl6.R.inc(88568);this.name = name;
        }finally{__CLR4_1_101w9x1w9xluszwfl6.R.flushNeeded();}}

    }
}
