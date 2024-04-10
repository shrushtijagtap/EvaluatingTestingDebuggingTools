/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_int_field extends TestCase {static class __CLR4_5_21v9a1v9alusyjvej{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87242,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21v9a1v9alusyjvej.R.globalSliceStart(getClass().getName(),87166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21v9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v9a1v9alusyjvej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v9a1v9alusyjvej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21v9a() throws Exception{try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87166);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87167);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87168);
                __CLR4_5_21v9a1v9alusyjvej.R.inc(87169);return false;
            }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}
        };

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87170);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87171);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87172);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87173);A a = new A();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87174);serializer.write(a);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87175);String text = out.toString();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87176);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21v9a1v9alusyjvej.R.globalSliceStart(getClass().getName(),87177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1v9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v9a1v9alusyjvej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v9a1v9alusyjvej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1v9l() throws Exception{try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87177);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87178);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87179);
                __CLR4_5_21v9a1v9alusyjvej.R.inc(87180);if (((("id".equals(name))&&(__CLR4_5_21v9a1v9alusyjvej.R.iget(87181)!=0|true))||(__CLR4_5_21v9a1v9alusyjvej.R.iget(87182)==0&false))) {{
                    __CLR4_5_21v9a1v9alusyjvej.R.inc(87183);Assert.assertTrue(value instanceof Integer);
                    __CLR4_5_21v9a1v9alusyjvej.R.inc(87184);return true;
                }
                }__CLR4_5_21v9a1v9alusyjvej.R.inc(87185);return false;
            }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}
        };

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87186);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87187);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87188);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87189);A a = new A();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87190);serializer.write(a);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87191);String text = out.toString();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87192);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21v9a1v9alusyjvej.R.globalSliceStart(getClass().getName(),87193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441va1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v9a1v9alusyjvej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v9a1v9alusyjvej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441va1() throws Exception{try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87193);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87194);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87195);
                __CLR4_5_21v9a1v9alusyjvej.R.inc(87196);if (((("name".equals(name))&&(__CLR4_5_21v9a1v9alusyjvej.R.iget(87197)!=0|true))||(__CLR4_5_21v9a1v9alusyjvej.R.iget(87198)==0&false))) {{
                    __CLR4_5_21v9a1v9alusyjvej.R.inc(87199);return true;
                }
                }__CLR4_5_21v9a1v9alusyjvej.R.inc(87200);return false;
            }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}
        };

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87201);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87202);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87203);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87204);A a = new A();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87205);a.name = "chennp2008";
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87206);serializer.write(a);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87207);String text = out.toString();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87208);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21v9a1v9alusyjvej.R.globalSliceStart(getClass().getName(),87209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1vah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v9a1v9alusyjvej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v9a1v9alusyjvej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1vah() throws Exception{try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87209);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87210);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87211);
                __CLR4_5_21v9a1v9alusyjvej.R.inc(87212);if (((("name".equals(name))&&(__CLR4_5_21v9a1v9alusyjvej.R.iget(87213)!=0|true))||(__CLR4_5_21v9a1v9alusyjvej.R.iget(87214)==0&false))) {{
                    __CLR4_5_21v9a1v9alusyjvej.R.inc(87215);return true;
                }
                }__CLR4_5_21v9a1v9alusyjvej.R.inc(87216);return false;
            }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}
        };

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87217);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87218);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87219);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87220);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87221);map.put("name", "chennp2008");
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87222);serializer.write(map);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87223);String text = out.toString();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87224);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21v9a1v9alusyjvej.R.globalSliceStart(getClass().getName(),87225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61vax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v9a1v9alusyjvej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v9a1v9alusyjvej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61vax() throws Exception{try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87225);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87226);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v9a1v9alusyjvej.R.inc(87227);
                __CLR4_5_21v9a1v9alusyjvej.R.inc(87228);if (((("name".equals(name))&&(__CLR4_5_21v9a1v9alusyjvej.R.iget(87229)!=0|true))||(__CLR4_5_21v9a1v9alusyjvej.R.iget(87230)==0&false))) {{
                    __CLR4_5_21v9a1v9alusyjvej.R.inc(87231);return false;
                }
                }__CLR4_5_21v9a1v9alusyjvej.R.inc(87232);return true;
            }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}
        };

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87233);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87234);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87235);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87236);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87237);map.put("id", 3);
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87238);map.put("name", "chennp2008");
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87239);serializer.write(map);

        __CLR4_5_21v9a1v9alusyjvej.R.inc(87240);String text = out.toString();
        __CLR4_5_21v9a1v9alusyjvej.R.inc(87241);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21v9a1v9alusyjvej.R.flushNeeded();}}

    public static class A {

        public int    id;
        public String name;


    }
}
