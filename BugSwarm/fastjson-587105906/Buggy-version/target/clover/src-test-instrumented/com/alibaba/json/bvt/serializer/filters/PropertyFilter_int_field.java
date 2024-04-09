/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_int_field extends TestCase {static class __CLR4_1_101v9l1v9llusqklju{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87253,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101v9l1v9llusqklju.R.globalSliceStart(getClass().getName(),87177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21v9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v9l1v9llusqklju.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v9l1v9llusqklju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87177,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21v9l() throws Exception{try{__CLR4_1_101v9l1v9llusqklju.R.inc(87177);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87178);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v9l1v9llusqklju.R.inc(87179);
                __CLR4_1_101v9l1v9llusqklju.R.inc(87180);return false;
            }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}
        };

        __CLR4_1_101v9l1v9llusqklju.R.inc(87181);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87182);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87183);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87184);A a = new A();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87185);serializer.write(a);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87186);String text = out.toString();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87187);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101v9l1v9llusqklju.R.globalSliceStart(getClass().getName(),87188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1v9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v9l1v9llusqklju.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v9l1v9llusqklju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87188,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1v9w() throws Exception{try{__CLR4_1_101v9l1v9llusqklju.R.inc(87188);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87189);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v9l1v9llusqklju.R.inc(87190);
                __CLR4_1_101v9l1v9llusqklju.R.inc(87191);if (((("id".equals(name))&&(__CLR4_1_101v9l1v9llusqklju.R.iget(87192)!=0|true))||(__CLR4_1_101v9l1v9llusqklju.R.iget(87193)==0&false))) {{
                    __CLR4_1_101v9l1v9llusqklju.R.inc(87194);Assert.assertTrue(value instanceof Integer);
                    __CLR4_1_101v9l1v9llusqklju.R.inc(87195);return true;
                }
                }__CLR4_1_101v9l1v9llusqklju.R.inc(87196);return false;
            }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}
        };

        __CLR4_1_101v9l1v9llusqklju.R.inc(87197);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87198);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87199);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87200);A a = new A();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87201);serializer.write(a);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87202);String text = out.toString();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87203);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101v9l1v9llusqklju.R.globalSliceStart(getClass().getName(),87204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441vac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v9l1v9llusqklju.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v9l1v9llusqklju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87204,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441vac() throws Exception{try{__CLR4_1_101v9l1v9llusqklju.R.inc(87204);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87205);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v9l1v9llusqklju.R.inc(87206);
                __CLR4_1_101v9l1v9llusqklju.R.inc(87207);if (((("name".equals(name))&&(__CLR4_1_101v9l1v9llusqklju.R.iget(87208)!=0|true))||(__CLR4_1_101v9l1v9llusqklju.R.iget(87209)==0&false))) {{
                    __CLR4_1_101v9l1v9llusqklju.R.inc(87210);return true;
                }
                }__CLR4_1_101v9l1v9llusqklju.R.inc(87211);return false;
            }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}
        };

        __CLR4_1_101v9l1v9llusqklju.R.inc(87212);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87213);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87214);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87215);A a = new A();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87216);a.name = "chennp2008";
        __CLR4_1_101v9l1v9llusqklju.R.inc(87217);serializer.write(a);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87218);String text = out.toString();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87219);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101v9l1v9llusqklju.R.globalSliceStart(getClass().getName(),87220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1vas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v9l1v9llusqklju.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v9l1v9llusqklju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87220,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1vas() throws Exception{try{__CLR4_1_101v9l1v9llusqklju.R.inc(87220);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87221);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v9l1v9llusqklju.R.inc(87222);
                __CLR4_1_101v9l1v9llusqklju.R.inc(87223);if (((("name".equals(name))&&(__CLR4_1_101v9l1v9llusqklju.R.iget(87224)!=0|true))||(__CLR4_1_101v9l1v9llusqklju.R.iget(87225)==0&false))) {{
                    __CLR4_1_101v9l1v9llusqklju.R.inc(87226);return true;
                }
                }__CLR4_1_101v9l1v9llusqklju.R.inc(87227);return false;
            }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}
        };

        __CLR4_1_101v9l1v9llusqklju.R.inc(87228);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87229);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87230);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87231);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87232);map.put("name", "chennp2008");
        __CLR4_1_101v9l1v9llusqklju.R.inc(87233);serializer.write(map);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87234);String text = out.toString();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87235);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101v9l1v9llusqklju.R.globalSliceStart(getClass().getName(),87236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61vb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v9l1v9llusqklju.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v9l1v9llusqklju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87236,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61vb8() throws Exception{try{__CLR4_1_101v9l1v9llusqklju.R.inc(87236);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87237);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v9l1v9llusqklju.R.inc(87238);
                __CLR4_1_101v9l1v9llusqklju.R.inc(87239);if (((("name".equals(name))&&(__CLR4_1_101v9l1v9llusqklju.R.iget(87240)!=0|true))||(__CLR4_1_101v9l1v9llusqklju.R.iget(87241)==0&false))) {{
                    __CLR4_1_101v9l1v9llusqklju.R.inc(87242);return false;
                }
                }__CLR4_1_101v9l1v9llusqklju.R.inc(87243);return true;
            }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}
        };

        __CLR4_1_101v9l1v9llusqklju.R.inc(87244);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87245);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87246);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87247);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87248);map.put("id", 3);
        __CLR4_1_101v9l1v9llusqklju.R.inc(87249);map.put("name", "chennp2008");
        __CLR4_1_101v9l1v9llusqklju.R.inc(87250);serializer.write(map);

        __CLR4_1_101v9l1v9llusqklju.R.inc(87251);String text = out.toString();
        __CLR4_1_101v9l1v9llusqklju.R.inc(87252);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101v9l1v9llusqklju.R.flushNeeded();}}

    public static class A {

        public int    id;
        public String name;


    }
}
