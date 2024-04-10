/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_bool_field extends TestCase {static class __CLR4_5_21uxu1uxulusyjvdw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,86830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceStart(getClass().getName(),86754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21uxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxu1uxulusyjvdw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21uxu() throws Exception{try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86754);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86755);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86756);
                __CLR4_5_21uxu1uxulusyjvdw.R.inc(86757);return false;
            }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}
        };

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86758);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86759);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86760);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86761);A a = new A();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86762);serializer.write(a);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86763);String text = out.toString();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86764);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceStart(getClass().getName(),86765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1uy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxu1uxulusyjvdw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1uy5() throws Exception{try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86765);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86766);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86767);
                __CLR4_5_21uxu1uxulusyjvdw.R.inc(86768);if (((("id".equals(name))&&(__CLR4_5_21uxu1uxulusyjvdw.R.iget(86769)!=0|true))||(__CLR4_5_21uxu1uxulusyjvdw.R.iget(86770)==0&false))) {{
                    __CLR4_5_21uxu1uxulusyjvdw.R.inc(86771);Assert.assertTrue(value instanceof Boolean);
                    __CLR4_5_21uxu1uxulusyjvdw.R.inc(86772);return true;
                }
                }__CLR4_5_21uxu1uxulusyjvdw.R.inc(86773);return false;
            }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}
        };

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86774);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86775);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86776);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86777);A a = new A();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86778);serializer.write(a);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86779);String text = out.toString();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86780);Assert.assertEquals("{\"id\":false}", text);
    }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceStart(getClass().getName(),86781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441uyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxu1uxulusyjvdw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86781,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441uyl() throws Exception{try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86781);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86782);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86783);
                __CLR4_5_21uxu1uxulusyjvdw.R.inc(86784);if (((("name".equals(name))&&(__CLR4_5_21uxu1uxulusyjvdw.R.iget(86785)!=0|true))||(__CLR4_5_21uxu1uxulusyjvdw.R.iget(86786)==0&false))) {{
                    __CLR4_5_21uxu1uxulusyjvdw.R.inc(86787);return true;
                }
                }__CLR4_5_21uxu1uxulusyjvdw.R.inc(86788);return false;
            }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}
        };

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86789);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86790);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86791);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86792);A a = new A();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86793);a.name = "chennp2008";
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86794);serializer.write(a);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86795);String text = out.toString();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86796);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceStart(getClass().getName(),86797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1uz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxu1uxulusyjvdw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1uz1() throws Exception{try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86797);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86798);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86799);
                __CLR4_5_21uxu1uxulusyjvdw.R.inc(86800);if (((("name".equals(name))&&(__CLR4_5_21uxu1uxulusyjvdw.R.iget(86801)!=0|true))||(__CLR4_5_21uxu1uxulusyjvdw.R.iget(86802)==0&false))) {{
                    __CLR4_5_21uxu1uxulusyjvdw.R.inc(86803);return true;
                }
                }__CLR4_5_21uxu1uxulusyjvdw.R.inc(86804);return false;
            }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}
        };

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86805);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86806);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86807);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86808);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86809);map.put("name", "chennp2008");
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86810);serializer.write(map);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86811);String text = out.toString();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86812);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceStart(getClass().getName(),86813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61uzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxu1uxulusyjvdw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxu1uxulusyjvdw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61uzh() throws Exception{try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86813);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86814);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uxu1uxulusyjvdw.R.inc(86815);
                __CLR4_5_21uxu1uxulusyjvdw.R.inc(86816);if (((("name".equals(name))&&(__CLR4_5_21uxu1uxulusyjvdw.R.iget(86817)!=0|true))||(__CLR4_5_21uxu1uxulusyjvdw.R.iget(86818)==0&false))) {{
                    __CLR4_5_21uxu1uxulusyjvdw.R.inc(86819);return false;
                }
                }__CLR4_5_21uxu1uxulusyjvdw.R.inc(86820);return true;
            }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}
        };

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86821);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86822);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86823);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86824);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86825);map.put("id", 3);
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86826);map.put("name", "chennp2008");
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86827);serializer.write(map);

        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86828);String text = out.toString();
        __CLR4_5_21uxu1uxulusyjvdw.R.inc(86829);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21uxu1uxulusyjvdw.R.flushNeeded();}}

    public static class A {

        public boolean id;
        public String  name;

    }
}
