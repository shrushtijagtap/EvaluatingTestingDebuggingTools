/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_double extends TestCase {static class __CLR4_1_101w351w35luszwfks{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101w351w35luszwfks.R.globalSliceStart(getClass().getName(),88241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21w35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w351w35luszwfks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w351w35luszwfks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88241,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21w35() throws Exception{try{__CLR4_1_101w351w35luszwfks.R.inc(88241);
        __CLR4_1_101w351w35luszwfks.R.inc(88242);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w351w35luszwfks.R.inc(88243);
                __CLR4_1_101w351w35luszwfks.R.inc(88244);return false;
            }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}
        };

        __CLR4_1_101w351w35luszwfks.R.inc(88245);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w351w35luszwfks.R.inc(88246);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w351w35luszwfks.R.inc(88247);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w351w35luszwfks.R.inc(88248);A a = new A();
        __CLR4_1_101w351w35luszwfks.R.inc(88249);serializer.write(a);

        __CLR4_1_101w351w35luszwfks.R.inc(88250);String text = out.toString();
        __CLR4_1_101w351w35luszwfks.R.inc(88251);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101w351w35luszwfks.R.globalSliceStart(getClass().getName(),88252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1w3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w351w35luszwfks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w351w35luszwfks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88252,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1w3g() throws Exception{try{__CLR4_1_101w351w35luszwfks.R.inc(88252);
        __CLR4_1_101w351w35luszwfks.R.inc(88253);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w351w35luszwfks.R.inc(88254);
                __CLR4_1_101w351w35luszwfks.R.inc(88255);if (((("id".equals(name))&&(__CLR4_1_101w351w35luszwfks.R.iget(88256)!=0|true))||(__CLR4_1_101w351w35luszwfks.R.iget(88257)==0&false))) {{
                    __CLR4_1_101w351w35luszwfks.R.inc(88258);Assert.assertTrue(value instanceof Double);
                    __CLR4_1_101w351w35luszwfks.R.inc(88259);return true;
                }
                }__CLR4_1_101w351w35luszwfks.R.inc(88260);return false;
            }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}
        };

        __CLR4_1_101w351w35luszwfks.R.inc(88261);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w351w35luszwfks.R.inc(88262);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w351w35luszwfks.R.inc(88263);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w351w35luszwfks.R.inc(88264);A a = new A();
        __CLR4_1_101w351w35luszwfks.R.inc(88265);serializer.write(a);

        __CLR4_1_101w351w35luszwfks.R.inc(88266);String text = out.toString();
        __CLR4_1_101w351w35luszwfks.R.inc(88267);Assert.assertEquals("{\"id\":0.0}", text);
    }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101w351w35luszwfks.R.globalSliceStart(getClass().getName(),88268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441w3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w351w35luszwfks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w351w35luszwfks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88268,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441w3w() throws Exception{try{__CLR4_1_101w351w35luszwfks.R.inc(88268);
        __CLR4_1_101w351w35luszwfks.R.inc(88269);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w351w35luszwfks.R.inc(88270);
                __CLR4_1_101w351w35luszwfks.R.inc(88271);if (((("name".equals(name))&&(__CLR4_1_101w351w35luszwfks.R.iget(88272)!=0|true))||(__CLR4_1_101w351w35luszwfks.R.iget(88273)==0&false))) {{
                    __CLR4_1_101w351w35luszwfks.R.inc(88274);return true;
                }
                }__CLR4_1_101w351w35luszwfks.R.inc(88275);return false;
            }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}
        };

        __CLR4_1_101w351w35luszwfks.R.inc(88276);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w351w35luszwfks.R.inc(88277);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w351w35luszwfks.R.inc(88278);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w351w35luszwfks.R.inc(88279);A a = new A();
        __CLR4_1_101w351w35luszwfks.R.inc(88280);a.setName("chennp2008");
        __CLR4_1_101w351w35luszwfks.R.inc(88281);serializer.write(a);

        __CLR4_1_101w351w35luszwfks.R.inc(88282);String text = out.toString();
        __CLR4_1_101w351w35luszwfks.R.inc(88283);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101w351w35luszwfks.R.globalSliceStart(getClass().getName(),88284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1w4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w351w35luszwfks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w351w35luszwfks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88284,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1w4c() throws Exception{try{__CLR4_1_101w351w35luszwfks.R.inc(88284);
        __CLR4_1_101w351w35luszwfks.R.inc(88285);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w351w35luszwfks.R.inc(88286);
                __CLR4_1_101w351w35luszwfks.R.inc(88287);if (((("name".equals(name))&&(__CLR4_1_101w351w35luszwfks.R.iget(88288)!=0|true))||(__CLR4_1_101w351w35luszwfks.R.iget(88289)==0&false))) {{
                    __CLR4_1_101w351w35luszwfks.R.inc(88290);return true;
                }
                }__CLR4_1_101w351w35luszwfks.R.inc(88291);return false;
            }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}
        };

        __CLR4_1_101w351w35luszwfks.R.inc(88292);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w351w35luszwfks.R.inc(88293);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w351w35luszwfks.R.inc(88294);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w351w35luszwfks.R.inc(88295);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w351w35luszwfks.R.inc(88296);map.put("name", "chennp2008");
        __CLR4_1_101w351w35luszwfks.R.inc(88297);serializer.write(map);

        __CLR4_1_101w351w35luszwfks.R.inc(88298);String text = out.toString();
        __CLR4_1_101w351w35luszwfks.R.inc(88299);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101w351w35luszwfks.R.globalSliceStart(getClass().getName(),88300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61w4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w351w35luszwfks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w351w35luszwfks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61w4s() throws Exception{try{__CLR4_1_101w351w35luszwfks.R.inc(88300);
        __CLR4_1_101w351w35luszwfks.R.inc(88301);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w351w35luszwfks.R.inc(88302);
                __CLR4_1_101w351w35luszwfks.R.inc(88303);if (((("name".equals(name))&&(__CLR4_1_101w351w35luszwfks.R.iget(88304)!=0|true))||(__CLR4_1_101w351w35luszwfks.R.iget(88305)==0&false))) {{
                    __CLR4_1_101w351w35luszwfks.R.inc(88306);return false;
                }
                }__CLR4_1_101w351w35luszwfks.R.inc(88307);return true;
            }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}
        };

        __CLR4_1_101w351w35luszwfks.R.inc(88308);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w351w35luszwfks.R.inc(88309);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w351w35luszwfks.R.inc(88310);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w351w35luszwfks.R.inc(88311);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w351w35luszwfks.R.inc(88312);map.put("id", 3);
        __CLR4_1_101w351w35luszwfks.R.inc(88313);map.put("name", "chennp2008");
        __CLR4_1_101w351w35luszwfks.R.inc(88314);serializer.write(map);

        __CLR4_1_101w351w35luszwfks.R.inc(88315);String text = out.toString();
        __CLR4_1_101w351w35luszwfks.R.inc(88316);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

    public static class A {

        private double    id;
        private String name;

        public double getId() {try{__CLR4_1_101w351w35luszwfks.R.inc(88317);
            __CLR4_1_101w351w35luszwfks.R.inc(88318);return id;
        }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

        public void setId(double id) {try{__CLR4_1_101w351w35luszwfks.R.inc(88319);
            __CLR4_1_101w351w35luszwfks.R.inc(88320);this.id = id;
        }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101w351w35luszwfks.R.inc(88321);
            __CLR4_1_101w351w35luszwfks.R.inc(88322);return name;
        }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101w351w35luszwfks.R.inc(88323);
            __CLR4_1_101w351w35luszwfks.R.inc(88324);this.name = name;
        }finally{__CLR4_1_101w351w35luszwfks.R.flushNeeded();}}

    }
}
