/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_bool_field extends TestCase {static class __CLR4_1_101uy51uy5lusqkleb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,86841,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101uy51uy5lusqkleb.R.globalSliceStart(getClass().getName(),86765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21uy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uy51uy5lusqkleb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uy51uy5lusqkleb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86765,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21uy5() throws Exception{try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86765);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86766);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86767);
                __CLR4_1_101uy51uy5lusqkleb.R.inc(86768);return false;
            }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}
        };

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86769);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86770);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86771);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86772);A a = new A();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86773);serializer.write(a);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86774);String text = out.toString();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86775);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101uy51uy5lusqkleb.R.globalSliceStart(getClass().getName(),86776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1uyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uy51uy5lusqkleb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uy51uy5lusqkleb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86776,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1uyg() throws Exception{try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86776);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86777);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86778);
                __CLR4_1_101uy51uy5lusqkleb.R.inc(86779);if (((("id".equals(name))&&(__CLR4_1_101uy51uy5lusqkleb.R.iget(86780)!=0|true))||(__CLR4_1_101uy51uy5lusqkleb.R.iget(86781)==0&false))) {{
                    __CLR4_1_101uy51uy5lusqkleb.R.inc(86782);Assert.assertTrue(value instanceof Boolean);
                    __CLR4_1_101uy51uy5lusqkleb.R.inc(86783);return true;
                }
                }__CLR4_1_101uy51uy5lusqkleb.R.inc(86784);return false;
            }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}
        };

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86785);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86786);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86787);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86788);A a = new A();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86789);serializer.write(a);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86790);String text = out.toString();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86791);Assert.assertEquals("{\"id\":false}", text);
    }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101uy51uy5lusqkleb.R.globalSliceStart(getClass().getName(),86792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441uyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uy51uy5lusqkleb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uy51uy5lusqkleb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86792,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441uyw() throws Exception{try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86792);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86793);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86794);
                __CLR4_1_101uy51uy5lusqkleb.R.inc(86795);if (((("name".equals(name))&&(__CLR4_1_101uy51uy5lusqkleb.R.iget(86796)!=0|true))||(__CLR4_1_101uy51uy5lusqkleb.R.iget(86797)==0&false))) {{
                    __CLR4_1_101uy51uy5lusqkleb.R.inc(86798);return true;
                }
                }__CLR4_1_101uy51uy5lusqkleb.R.inc(86799);return false;
            }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}
        };

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86800);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86801);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86802);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86803);A a = new A();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86804);a.name = "chennp2008";
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86805);serializer.write(a);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86806);String text = out.toString();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86807);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101uy51uy5lusqkleb.R.globalSliceStart(getClass().getName(),86808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1uzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uy51uy5lusqkleb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uy51uy5lusqkleb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86808,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1uzc() throws Exception{try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86808);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86809);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86810);
                __CLR4_1_101uy51uy5lusqkleb.R.inc(86811);if (((("name".equals(name))&&(__CLR4_1_101uy51uy5lusqkleb.R.iget(86812)!=0|true))||(__CLR4_1_101uy51uy5lusqkleb.R.iget(86813)==0&false))) {{
                    __CLR4_1_101uy51uy5lusqkleb.R.inc(86814);return true;
                }
                }__CLR4_1_101uy51uy5lusqkleb.R.inc(86815);return false;
            }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}
        };

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86816);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86817);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86818);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86819);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86820);map.put("name", "chennp2008");
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86821);serializer.write(map);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86822);String text = out.toString();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86823);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101uy51uy5lusqkleb.R.globalSliceStart(getClass().getName(),86824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61uzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uy51uy5lusqkleb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uy51uy5lusqkleb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_bool_field.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86824,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61uzs() throws Exception{try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86824);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86825);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uy51uy5lusqkleb.R.inc(86826);
                __CLR4_1_101uy51uy5lusqkleb.R.inc(86827);if (((("name".equals(name))&&(__CLR4_1_101uy51uy5lusqkleb.R.iget(86828)!=0|true))||(__CLR4_1_101uy51uy5lusqkleb.R.iget(86829)==0&false))) {{
                    __CLR4_1_101uy51uy5lusqkleb.R.inc(86830);return false;
                }
                }__CLR4_1_101uy51uy5lusqkleb.R.inc(86831);return true;
            }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}
        };

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86832);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86833);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86834);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86835);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86836);map.put("id", 3);
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86837);map.put("name", "chennp2008");
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86838);serializer.write(map);

        __CLR4_1_101uy51uy5lusqkleb.R.inc(86839);String text = out.toString();
        __CLR4_1_101uy51uy5lusqkleb.R.inc(86840);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101uy51uy5lusqkleb.R.flushNeeded();}}

    public static class A {

        public boolean id;
        public String  name;

    }
}
