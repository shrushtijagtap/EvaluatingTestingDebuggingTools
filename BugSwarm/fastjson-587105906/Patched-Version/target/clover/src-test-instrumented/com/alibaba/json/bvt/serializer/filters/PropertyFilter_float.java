/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_float extends TestCase {static class __CLR4_5_21v6y1v6ylusyjvee{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceStart(getClass().getName(),87082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21v6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v6y1v6ylusyjvee.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21v6y() throws Exception{try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87082);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87083);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87084);
                __CLR4_5_21v6y1v6ylusyjvee.R.inc(87085);return false;
            }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}
        };

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87086);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87087);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87088);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87089);A a = new A();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87090);serializer.write(a);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87091);String text = out.toString();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87092);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceStart(getClass().getName(),87093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1v79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v6y1v6ylusyjvee.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87093,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1v79() throws Exception{try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87093);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87094);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87095);
                __CLR4_5_21v6y1v6ylusyjvee.R.inc(87096);if (((("id".equals(name))&&(__CLR4_5_21v6y1v6ylusyjvee.R.iget(87097)!=0|true))||(__CLR4_5_21v6y1v6ylusyjvee.R.iget(87098)==0&false))) {{
                    __CLR4_5_21v6y1v6ylusyjvee.R.inc(87099);Assert.assertTrue(value instanceof Float);
                    __CLR4_5_21v6y1v6ylusyjvee.R.inc(87100);return true;
                }
                }__CLR4_5_21v6y1v6ylusyjvee.R.inc(87101);return false;
            }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}
        };

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87102);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87103);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87104);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87105);A a = new A();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87106);serializer.write(a);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87107);String text = out.toString();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87108);Assert.assertEquals("{\"id\":0.0}", text);
    }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceStart(getClass().getName(),87109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441v7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v6y1v6ylusyjvee.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441v7p() throws Exception{try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87109);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87110);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87111);
                __CLR4_5_21v6y1v6ylusyjvee.R.inc(87112);if (((("name".equals(name))&&(__CLR4_5_21v6y1v6ylusyjvee.R.iget(87113)!=0|true))||(__CLR4_5_21v6y1v6ylusyjvee.R.iget(87114)==0&false))) {{
                    __CLR4_5_21v6y1v6ylusyjvee.R.inc(87115);return true;
                }
                }__CLR4_5_21v6y1v6ylusyjvee.R.inc(87116);return false;
            }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}
        };

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87117);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87118);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87119);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87120);A a = new A();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87121);a.setName("chennp2008");
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87122);serializer.write(a);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87123);String text = out.toString();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87124);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceStart(getClass().getName(),87125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1v85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v6y1v6ylusyjvee.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1v85() throws Exception{try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87125);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87126);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87127);
                __CLR4_5_21v6y1v6ylusyjvee.R.inc(87128);if (((("name".equals(name))&&(__CLR4_5_21v6y1v6ylusyjvee.R.iget(87129)!=0|true))||(__CLR4_5_21v6y1v6ylusyjvee.R.iget(87130)==0&false))) {{
                    __CLR4_5_21v6y1v6ylusyjvee.R.inc(87131);return true;
                }
                }__CLR4_5_21v6y1v6ylusyjvee.R.inc(87132);return false;
            }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}
        };

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87133);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87134);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87135);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87136);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87137);map.put("name", "chennp2008");
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87138);serializer.write(map);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87139);String text = out.toString();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87140);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceStart(getClass().getName(),87141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61v8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v6y1v6ylusyjvee.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v6y1v6ylusyjvee.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87141,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61v8l() throws Exception{try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87141);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87142);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87143);
                __CLR4_5_21v6y1v6ylusyjvee.R.inc(87144);if (((("name".equals(name))&&(__CLR4_5_21v6y1v6ylusyjvee.R.iget(87145)!=0|true))||(__CLR4_5_21v6y1v6ylusyjvee.R.iget(87146)==0&false))) {{
                    __CLR4_5_21v6y1v6ylusyjvee.R.inc(87147);return false;
                }
                }__CLR4_5_21v6y1v6ylusyjvee.R.inc(87148);return true;
            }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}
        };

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87149);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87150);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87151);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87152);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87153);map.put("id", 3);
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87154);map.put("name", "chennp2008");
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87155);serializer.write(map);

        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87156);String text = out.toString();
        __CLR4_5_21v6y1v6ylusyjvee.R.inc(87157);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

    public static class A {

        private float    id;
        private String name;

        public float getId() {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87158);
            __CLR4_5_21v6y1v6ylusyjvee.R.inc(87159);return id;
        }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

        public void setId(float id) {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87160);
            __CLR4_5_21v6y1v6ylusyjvee.R.inc(87161);this.id = id;
        }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87162);
            __CLR4_5_21v6y1v6ylusyjvee.R.inc(87163);return name;
        }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21v6y1v6ylusyjvee.R.inc(87164);
            __CLR4_5_21v6y1v6ylusyjvee.R.inc(87165);this.name = name;
        }finally{__CLR4_5_21v6y1v6ylusyjvee.R.flushNeeded();}}

    }
}
