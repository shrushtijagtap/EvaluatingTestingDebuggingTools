/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_double extends TestCase {static class __CLR4_5_21w2u1w2ulusvnh16{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,88314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceStart(getClass().getName(),88230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21w2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w2u1w2ulusvnh16.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21w2u() throws Exception{try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88230);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88231);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88232);
                __CLR4_5_21w2u1w2ulusvnh16.R.inc(88233);return false;
            }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}
        };

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88234);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88235);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88236);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88237);A a = new A();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88238);serializer.write(a);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88239);String text = out.toString();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88240);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceStart(getClass().getName(),88241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1w35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w2u1w2ulusvnh16.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1w35() throws Exception{try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88241);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88242);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88243);
                __CLR4_5_21w2u1w2ulusvnh16.R.inc(88244);if (((("id".equals(name))&&(__CLR4_5_21w2u1w2ulusvnh16.R.iget(88245)!=0|true))||(__CLR4_5_21w2u1w2ulusvnh16.R.iget(88246)==0&false))) {{
                    __CLR4_5_21w2u1w2ulusvnh16.R.inc(88247);Assert.assertTrue(value instanceof Double);
                    __CLR4_5_21w2u1w2ulusvnh16.R.inc(88248);return true;
                }
                }__CLR4_5_21w2u1w2ulusvnh16.R.inc(88249);return false;
            }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}
        };

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88250);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88251);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88252);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88253);A a = new A();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88254);serializer.write(a);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88255);String text = out.toString();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88256);Assert.assertEquals("{\"id\":0.0}", text);
    }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceStart(getClass().getName(),88257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441w3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w2u1w2ulusvnh16.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88257,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441w3l() throws Exception{try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88257);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88258);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88259);
                __CLR4_5_21w2u1w2ulusvnh16.R.inc(88260);if (((("name".equals(name))&&(__CLR4_5_21w2u1w2ulusvnh16.R.iget(88261)!=0|true))||(__CLR4_5_21w2u1w2ulusvnh16.R.iget(88262)==0&false))) {{
                    __CLR4_5_21w2u1w2ulusvnh16.R.inc(88263);return true;
                }
                }__CLR4_5_21w2u1w2ulusvnh16.R.inc(88264);return false;
            }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}
        };

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88265);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88266);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88267);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88268);A a = new A();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88269);a.setName("chennp2008");
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88270);serializer.write(a);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88271);String text = out.toString();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88272);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceStart(getClass().getName(),88273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1w41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w2u1w2ulusvnh16.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1w41() throws Exception{try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88273);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88274);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88275);
                __CLR4_5_21w2u1w2ulusvnh16.R.inc(88276);if (((("name".equals(name))&&(__CLR4_5_21w2u1w2ulusvnh16.R.iget(88277)!=0|true))||(__CLR4_5_21w2u1w2ulusvnh16.R.iget(88278)==0&false))) {{
                    __CLR4_5_21w2u1w2ulusvnh16.R.inc(88279);return true;
                }
                }__CLR4_5_21w2u1w2ulusvnh16.R.inc(88280);return false;
            }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}
        };

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88281);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88282);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88283);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88284);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88285);map.put("name", "chennp2008");
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88286);serializer.write(map);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88287);String text = out.toString();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88288);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceStart(getClass().getName(),88289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61w4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w2u1w2ulusvnh16.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w2u1w2ulusvnh16.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61w4h() throws Exception{try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88289);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88290);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88291);
                __CLR4_5_21w2u1w2ulusvnh16.R.inc(88292);if (((("name".equals(name))&&(__CLR4_5_21w2u1w2ulusvnh16.R.iget(88293)!=0|true))||(__CLR4_5_21w2u1w2ulusvnh16.R.iget(88294)==0&false))) {{
                    __CLR4_5_21w2u1w2ulusvnh16.R.inc(88295);return false;
                }
                }__CLR4_5_21w2u1w2ulusvnh16.R.inc(88296);return true;
            }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}
        };

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88297);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88298);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88299);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88300);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88301);map.put("id", 3);
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88302);map.put("name", "chennp2008");
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88303);serializer.write(map);

        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88304);String text = out.toString();
        __CLR4_5_21w2u1w2ulusvnh16.R.inc(88305);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

    public static class A {

        private double    id;
        private String name;

        public double getId() {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88306);
            __CLR4_5_21w2u1w2ulusvnh16.R.inc(88307);return id;
        }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

        public void setId(double id) {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88308);
            __CLR4_5_21w2u1w2ulusvnh16.R.inc(88309);this.id = id;
        }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88310);
            __CLR4_5_21w2u1w2ulusvnh16.R.inc(88311);return name;
        }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21w2u1w2ulusvnh16.R.inc(88312);
            __CLR4_5_21w2u1w2ulusvnh16.R.inc(88313);this.name = name;
        }finally{__CLR4_5_21w2u1w2ulusvnh16.R.flushNeeded();}}

    }
}
