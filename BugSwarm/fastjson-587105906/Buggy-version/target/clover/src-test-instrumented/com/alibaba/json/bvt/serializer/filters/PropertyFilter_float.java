/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_float extends TestCase {static class __CLR4_1_101v791v79lusqklj8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87177,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101v791v79lusqklj8.R.globalSliceStart(getClass().getName(),87093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21v79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v791v79lusqklj8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v791v79lusqklj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87093,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21v79() throws Exception{try{__CLR4_1_101v791v79lusqklj8.R.inc(87093);
        __CLR4_1_101v791v79lusqklj8.R.inc(87094);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v791v79lusqklj8.R.inc(87095);
                __CLR4_1_101v791v79lusqklj8.R.inc(87096);return false;
            }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}
        };

        __CLR4_1_101v791v79lusqklj8.R.inc(87097);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v791v79lusqklj8.R.inc(87098);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v791v79lusqklj8.R.inc(87099);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v791v79lusqklj8.R.inc(87100);A a = new A();
        __CLR4_1_101v791v79lusqklj8.R.inc(87101);serializer.write(a);

        __CLR4_1_101v791v79lusqklj8.R.inc(87102);String text = out.toString();
        __CLR4_1_101v791v79lusqklj8.R.inc(87103);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101v791v79lusqklj8.R.globalSliceStart(getClass().getName(),87104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1v7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v791v79lusqklj8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v791v79lusqklj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87104,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1v7k() throws Exception{try{__CLR4_1_101v791v79lusqklj8.R.inc(87104);
        __CLR4_1_101v791v79lusqklj8.R.inc(87105);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v791v79lusqklj8.R.inc(87106);
                __CLR4_1_101v791v79lusqklj8.R.inc(87107);if (((("id".equals(name))&&(__CLR4_1_101v791v79lusqklj8.R.iget(87108)!=0|true))||(__CLR4_1_101v791v79lusqklj8.R.iget(87109)==0&false))) {{
                    __CLR4_1_101v791v79lusqklj8.R.inc(87110);Assert.assertTrue(value instanceof Float);
                    __CLR4_1_101v791v79lusqklj8.R.inc(87111);return true;
                }
                }__CLR4_1_101v791v79lusqklj8.R.inc(87112);return false;
            }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}
        };

        __CLR4_1_101v791v79lusqklj8.R.inc(87113);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v791v79lusqklj8.R.inc(87114);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v791v79lusqklj8.R.inc(87115);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v791v79lusqklj8.R.inc(87116);A a = new A();
        __CLR4_1_101v791v79lusqklj8.R.inc(87117);serializer.write(a);

        __CLR4_1_101v791v79lusqklj8.R.inc(87118);String text = out.toString();
        __CLR4_1_101v791v79lusqklj8.R.inc(87119);Assert.assertEquals("{\"id\":0.0}", text);
    }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101v791v79lusqklj8.R.globalSliceStart(getClass().getName(),87120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441v80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v791v79lusqklj8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v791v79lusqklj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87120,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441v80() throws Exception{try{__CLR4_1_101v791v79lusqklj8.R.inc(87120);
        __CLR4_1_101v791v79lusqklj8.R.inc(87121);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v791v79lusqklj8.R.inc(87122);
                __CLR4_1_101v791v79lusqklj8.R.inc(87123);if (((("name".equals(name))&&(__CLR4_1_101v791v79lusqklj8.R.iget(87124)!=0|true))||(__CLR4_1_101v791v79lusqklj8.R.iget(87125)==0&false))) {{
                    __CLR4_1_101v791v79lusqklj8.R.inc(87126);return true;
                }
                }__CLR4_1_101v791v79lusqklj8.R.inc(87127);return false;
            }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}
        };

        __CLR4_1_101v791v79lusqklj8.R.inc(87128);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v791v79lusqklj8.R.inc(87129);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v791v79lusqklj8.R.inc(87130);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v791v79lusqklj8.R.inc(87131);A a = new A();
        __CLR4_1_101v791v79lusqklj8.R.inc(87132);a.setName("chennp2008");
        __CLR4_1_101v791v79lusqklj8.R.inc(87133);serializer.write(a);

        __CLR4_1_101v791v79lusqklj8.R.inc(87134);String text = out.toString();
        __CLR4_1_101v791v79lusqklj8.R.inc(87135);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101v791v79lusqklj8.R.globalSliceStart(getClass().getName(),87136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1v8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v791v79lusqklj8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v791v79lusqklj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87136,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1v8g() throws Exception{try{__CLR4_1_101v791v79lusqklj8.R.inc(87136);
        __CLR4_1_101v791v79lusqklj8.R.inc(87137);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v791v79lusqklj8.R.inc(87138);
                __CLR4_1_101v791v79lusqklj8.R.inc(87139);if (((("name".equals(name))&&(__CLR4_1_101v791v79lusqklj8.R.iget(87140)!=0|true))||(__CLR4_1_101v791v79lusqklj8.R.iget(87141)==0&false))) {{
                    __CLR4_1_101v791v79lusqklj8.R.inc(87142);return true;
                }
                }__CLR4_1_101v791v79lusqklj8.R.inc(87143);return false;
            }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}
        };

        __CLR4_1_101v791v79lusqklj8.R.inc(87144);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v791v79lusqklj8.R.inc(87145);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v791v79lusqklj8.R.inc(87146);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v791v79lusqklj8.R.inc(87147);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101v791v79lusqklj8.R.inc(87148);map.put("name", "chennp2008");
        __CLR4_1_101v791v79lusqklj8.R.inc(87149);serializer.write(map);

        __CLR4_1_101v791v79lusqklj8.R.inc(87150);String text = out.toString();
        __CLR4_1_101v791v79lusqklj8.R.inc(87151);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101v791v79lusqklj8.R.globalSliceStart(getClass().getName(),87152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61v8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v791v79lusqklj8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v791v79lusqklj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87152,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61v8w() throws Exception{try{__CLR4_1_101v791v79lusqklj8.R.inc(87152);
        __CLR4_1_101v791v79lusqklj8.R.inc(87153);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v791v79lusqklj8.R.inc(87154);
                __CLR4_1_101v791v79lusqklj8.R.inc(87155);if (((("name".equals(name))&&(__CLR4_1_101v791v79lusqklj8.R.iget(87156)!=0|true))||(__CLR4_1_101v791v79lusqklj8.R.iget(87157)==0&false))) {{
                    __CLR4_1_101v791v79lusqklj8.R.inc(87158);return false;
                }
                }__CLR4_1_101v791v79lusqklj8.R.inc(87159);return true;
            }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}
        };

        __CLR4_1_101v791v79lusqklj8.R.inc(87160);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v791v79lusqklj8.R.inc(87161);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v791v79lusqklj8.R.inc(87162);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v791v79lusqklj8.R.inc(87163);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101v791v79lusqklj8.R.inc(87164);map.put("id", 3);
        __CLR4_1_101v791v79lusqklj8.R.inc(87165);map.put("name", "chennp2008");
        __CLR4_1_101v791v79lusqklj8.R.inc(87166);serializer.write(map);

        __CLR4_1_101v791v79lusqklj8.R.inc(87167);String text = out.toString();
        __CLR4_1_101v791v79lusqklj8.R.inc(87168);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

    public static class A {

        private float    id;
        private String name;

        public float getId() {try{__CLR4_1_101v791v79lusqklj8.R.inc(87169);
            __CLR4_1_101v791v79lusqklj8.R.inc(87170);return id;
        }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

        public void setId(float id) {try{__CLR4_1_101v791v79lusqklj8.R.inc(87171);
            __CLR4_1_101v791v79lusqklj8.R.inc(87172);this.id = id;
        }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101v791v79lusqklj8.R.inc(87173);
            __CLR4_1_101v791v79lusqklj8.R.inc(87174);return name;
        }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101v791v79lusqklj8.R.inc(87175);
            __CLR4_1_101v791v79lusqklj8.R.inc(87176);this.name = name;
        }finally{__CLR4_1_101v791v79lusqklj8.R.flushNeeded();}}

    }
}
