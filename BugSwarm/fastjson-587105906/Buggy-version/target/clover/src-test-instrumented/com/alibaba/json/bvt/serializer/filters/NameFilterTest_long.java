/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class NameFilterTest_long extends TestCase {static class __CLR4_1_101voq1voqluszwfjh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,87762,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_namefilter() throws Exception {__CLR4_1_101voq1voqluszwfjh.R.globalSliceStart(getClass().getName(),87722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pmdm8n1voq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101voq1voqluszwfjh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101voq1voqluszwfjh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.NameFilterTest_long.test_namefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87722,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pmdm8n1voq() throws Exception{try{__CLR4_1_101voq1voqluszwfjh.R.inc(87722);
        __CLR4_1_101voq1voqluszwfjh.R.inc(87723);NameFilter filter = new NameFilter() {

            public String process(Object source, String name, Object value) {try{__CLR4_1_101voq1voqluszwfjh.R.inc(87724);
                __CLR4_1_101voq1voqluszwfjh.R.inc(87725);if ((((name.equals("id"))&&(__CLR4_1_101voq1voqluszwfjh.R.iget(87726)!=0|true))||(__CLR4_1_101voq1voqluszwfjh.R.iget(87727)==0&false))) {{
                    __CLR4_1_101voq1voqluszwfjh.R.inc(87728);Assert.assertTrue(value instanceof Long);
                    __CLR4_1_101voq1voqluszwfjh.R.inc(87729);return "ID";
                }

                }__CLR4_1_101voq1voqluszwfjh.R.inc(87730);return name;
            }finally{__CLR4_1_101voq1voqluszwfjh.R.flushNeeded();}}

        };

        __CLR4_1_101voq1voqluszwfjh.R.inc(87731);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101voq1voqluszwfjh.R.inc(87732);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101voq1voqluszwfjh.R.inc(87733);serializer.getNameFilters().add(filter);

        __CLR4_1_101voq1voqluszwfjh.R.inc(87734);Bean a = new Bean();
        __CLR4_1_101voq1voqluszwfjh.R.inc(87735);serializer.write(a);

        __CLR4_1_101voq1voqluszwfjh.R.inc(87736);String text = out.toString();
        __CLR4_1_101voq1voqluszwfjh.R.inc(87737);Assert.assertEquals("{\"ID\":0}", text);
    }finally{__CLR4_1_101voq1voqluszwfjh.R.flushNeeded();}}

    public void test_namefilter_1() throws Exception {__CLR4_1_101voq1voqluszwfjh.R.globalSliceStart(getClass().getName(),87738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10l5s2if1vp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101voq1voqluszwfjh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101voq1voqluszwfjh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.NameFilterTest_long.test_namefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87738,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10l5s2if1vp6() throws Exception{try{__CLR4_1_101voq1voqluszwfjh.R.inc(87738);
        __CLR4_1_101voq1voqluszwfjh.R.inc(87739);NameFilter filter = new NameFilter() {

            public String process(Object source, String name, Object value) {try{__CLR4_1_101voq1voqluszwfjh.R.inc(87740);
                __CLR4_1_101voq1voqluszwfjh.R.inc(87741);if ((((name.equals("id"))&&(__CLR4_1_101voq1voqluszwfjh.R.iget(87742)!=0|true))||(__CLR4_1_101voq1voqluszwfjh.R.iget(87743)==0&false))) {{
                    __CLR4_1_101voq1voqluszwfjh.R.inc(87744);return "ID";
                }

                }__CLR4_1_101voq1voqluszwfjh.R.inc(87745);return name;
            }finally{__CLR4_1_101voq1voqluszwfjh.R.flushNeeded();}}

        };

        __CLR4_1_101voq1voqluszwfjh.R.inc(87746);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101voq1voqluszwfjh.R.inc(87747);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101voq1voqluszwfjh.R.inc(87748);serializer.getNameFilters().add(filter);

        __CLR4_1_101voq1voqluszwfjh.R.inc(87749);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101voq1voqluszwfjh.R.inc(87750);map.put("id", 0);
        __CLR4_1_101voq1voqluszwfjh.R.inc(87751);serializer.write(map);

        __CLR4_1_101voq1voqluszwfjh.R.inc(87752);String text = out.toString();
        __CLR4_1_101voq1voqluszwfjh.R.inc(87753);Assert.assertEquals("{\"ID\":0}", text);
    }finally{__CLR4_1_101voq1voqluszwfjh.R.flushNeeded();}}

    public static class Bean {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_1_101voq1voqluszwfjh.R.inc(87754);
            __CLR4_1_101voq1voqluszwfjh.R.inc(87755);return id;
        }finally{__CLR4_1_101voq1voqluszwfjh.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_101voq1voqluszwfjh.R.inc(87756);
            __CLR4_1_101voq1voqluszwfjh.R.inc(87757);this.id = id;
        }finally{__CLR4_1_101voq1voqluszwfjh.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101voq1voqluszwfjh.R.inc(87758);
            __CLR4_1_101voq1voqluszwfjh.R.inc(87759);return name;
        }finally{__CLR4_1_101voq1voqluszwfjh.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101voq1voqluszwfjh.R.inc(87760);
            __CLR4_1_101voq1voqluszwfjh.R.inc(87761);this.name = name;
        }finally{__CLR4_1_101voq1voqluszwfjh.R.flushNeeded();}}

    }
}
