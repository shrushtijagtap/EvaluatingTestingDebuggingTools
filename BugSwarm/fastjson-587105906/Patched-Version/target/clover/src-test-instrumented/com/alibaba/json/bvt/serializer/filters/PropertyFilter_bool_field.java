/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_bool_field extends TestCase {static class __CLR4_5_21vw21vw2lusvnh02{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,88062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21vw21vw2lusvnh02.R.globalSliceStart(getClass().getName(),87986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21vw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vw21vw2lusvnh02.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vw21vw2lusvnh02.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21vw2() throws Exception{try{__CLR4_5_21vw21vw2lusvnh02.R.inc(87986);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(87987);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vw21vw2lusvnh02.R.inc(87988);
                __CLR4_5_21vw21vw2lusvnh02.R.inc(87989);return false;
            }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}
        };

        __CLR4_5_21vw21vw2lusvnh02.R.inc(87990);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(87991);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(87992);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(87993);A a = new A();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(87994);serializer.write(a);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(87995);String text = out.toString();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(87996);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21vw21vw2lusvnh02.R.globalSliceStart(getClass().getName(),87997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1vwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vw21vw2lusvnh02.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vw21vw2lusvnh02.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1vwd() throws Exception{try{__CLR4_5_21vw21vw2lusvnh02.R.inc(87997);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(87998);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vw21vw2lusvnh02.R.inc(87999);
                __CLR4_5_21vw21vw2lusvnh02.R.inc(88000);if (((("id".equals(name))&&(__CLR4_5_21vw21vw2lusvnh02.R.iget(88001)!=0|true))||(__CLR4_5_21vw21vw2lusvnh02.R.iget(88002)==0&false))) {{
                    __CLR4_5_21vw21vw2lusvnh02.R.inc(88003);Assert.assertTrue(value instanceof Boolean);
                    __CLR4_5_21vw21vw2lusvnh02.R.inc(88004);return true;
                }
                }__CLR4_5_21vw21vw2lusvnh02.R.inc(88005);return false;
            }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}
        };

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88006);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88007);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88008);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88009);A a = new A();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88010);serializer.write(a);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88011);String text = out.toString();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88012);Assert.assertEquals("{\"id\":false}", text);
    }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21vw21vw2lusvnh02.R.globalSliceStart(getClass().getName(),88013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441vwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vw21vw2lusvnh02.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vw21vw2lusvnh02.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88013,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441vwt() throws Exception{try{__CLR4_5_21vw21vw2lusvnh02.R.inc(88013);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88014);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vw21vw2lusvnh02.R.inc(88015);
                __CLR4_5_21vw21vw2lusvnh02.R.inc(88016);if (((("name".equals(name))&&(__CLR4_5_21vw21vw2lusvnh02.R.iget(88017)!=0|true))||(__CLR4_5_21vw21vw2lusvnh02.R.iget(88018)==0&false))) {{
                    __CLR4_5_21vw21vw2lusvnh02.R.inc(88019);return true;
                }
                }__CLR4_5_21vw21vw2lusvnh02.R.inc(88020);return false;
            }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}
        };

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88021);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88022);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88023);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88024);A a = new A();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88025);a.name = "chennp2008";
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88026);serializer.write(a);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88027);String text = out.toString();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88028);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21vw21vw2lusvnh02.R.globalSliceStart(getClass().getName(),88029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1vx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vw21vw2lusvnh02.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vw21vw2lusvnh02.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88029,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1vx9() throws Exception{try{__CLR4_5_21vw21vw2lusvnh02.R.inc(88029);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88030);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vw21vw2lusvnh02.R.inc(88031);
                __CLR4_5_21vw21vw2lusvnh02.R.inc(88032);if (((("name".equals(name))&&(__CLR4_5_21vw21vw2lusvnh02.R.iget(88033)!=0|true))||(__CLR4_5_21vw21vw2lusvnh02.R.iget(88034)==0&false))) {{
                    __CLR4_5_21vw21vw2lusvnh02.R.inc(88035);return true;
                }
                }__CLR4_5_21vw21vw2lusvnh02.R.inc(88036);return false;
            }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}
        };

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88037);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88038);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88039);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88040);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88041);map.put("name", "chennp2008");
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88042);serializer.write(map);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88043);String text = out.toString();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88044);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21vw21vw2lusvnh02.R.globalSliceStart(getClass().getName(),88045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61vxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vw21vw2lusvnh02.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vw21vw2lusvnh02.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61vxp() throws Exception{try{__CLR4_5_21vw21vw2lusvnh02.R.inc(88045);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88046);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vw21vw2lusvnh02.R.inc(88047);
                __CLR4_5_21vw21vw2lusvnh02.R.inc(88048);if (((("name".equals(name))&&(__CLR4_5_21vw21vw2lusvnh02.R.iget(88049)!=0|true))||(__CLR4_5_21vw21vw2lusvnh02.R.iget(88050)==0&false))) {{
                    __CLR4_5_21vw21vw2lusvnh02.R.inc(88051);return false;
                }
                }__CLR4_5_21vw21vw2lusvnh02.R.inc(88052);return true;
            }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}
        };

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88053);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88054);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88055);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88056);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88057);map.put("id", 3);
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88058);map.put("name", "chennp2008");
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88059);serializer.write(map);

        __CLR4_5_21vw21vw2lusvnh02.R.inc(88060);String text = out.toString();
        __CLR4_5_21vw21vw2lusvnh02.R.inc(88061);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21vw21vw2lusvnh02.R.flushNeeded();}}

    public static class A {

        public boolean id;
        public String  name;

    }
}
