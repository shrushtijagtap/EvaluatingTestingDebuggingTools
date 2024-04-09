/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_long extends TestCase {static class __CLR4_1_101vbp1vbplusqklkd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87337,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101vbp1vbplusqklkd.R.globalSliceStart(getClass().getName(),87253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21vbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vbp1vbplusqklkd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vbp1vbplusqklkd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87253,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21vbp() throws Exception{try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87253);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87254);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87255);
                __CLR4_1_101vbp1vbplusqklkd.R.inc(87256);return false;
            }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}
        };

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87257);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87258);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87259);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87260);A a = new A();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87261);serializer.write(a);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87262);String text = out.toString();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87263);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101vbp1vbplusqklkd.R.globalSliceStart(getClass().getName(),87264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1vc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vbp1vbplusqklkd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vbp1vbplusqklkd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87264,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1vc0() throws Exception{try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87264);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87265);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87266);
                __CLR4_1_101vbp1vbplusqklkd.R.inc(87267);if (((("id".equals(name))&&(__CLR4_1_101vbp1vbplusqklkd.R.iget(87268)!=0|true))||(__CLR4_1_101vbp1vbplusqklkd.R.iget(87269)==0&false))) {{
                    __CLR4_1_101vbp1vbplusqklkd.R.inc(87270);Assert.assertTrue(value instanceof Long);
                    __CLR4_1_101vbp1vbplusqklkd.R.inc(87271);return true;
                }
                }__CLR4_1_101vbp1vbplusqklkd.R.inc(87272);return false;
            }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}
        };

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87273);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87274);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87275);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87276);A a = new A();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87277);serializer.write(a);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87278);String text = out.toString();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87279);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101vbp1vbplusqklkd.R.globalSliceStart(getClass().getName(),87280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441vcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vbp1vbplusqklkd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vbp1vbplusqklkd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87280,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441vcg() throws Exception{try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87280);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87281);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87282);
                __CLR4_1_101vbp1vbplusqklkd.R.inc(87283);if (((("name".equals(name))&&(__CLR4_1_101vbp1vbplusqklkd.R.iget(87284)!=0|true))||(__CLR4_1_101vbp1vbplusqklkd.R.iget(87285)==0&false))) {{
                    __CLR4_1_101vbp1vbplusqklkd.R.inc(87286);return true;
                }
                }__CLR4_1_101vbp1vbplusqklkd.R.inc(87287);return false;
            }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}
        };

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87288);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87289);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87290);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87291);A a = new A();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87292);a.setName("chennp2008");
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87293);serializer.write(a);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87294);String text = out.toString();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87295);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101vbp1vbplusqklkd.R.globalSliceStart(getClass().getName(),87296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1vcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vbp1vbplusqklkd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vbp1vbplusqklkd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87296,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1vcw() throws Exception{try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87296);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87297);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87298);
                __CLR4_1_101vbp1vbplusqklkd.R.inc(87299);if (((("name".equals(name))&&(__CLR4_1_101vbp1vbplusqklkd.R.iget(87300)!=0|true))||(__CLR4_1_101vbp1vbplusqklkd.R.iget(87301)==0&false))) {{
                    __CLR4_1_101vbp1vbplusqklkd.R.inc(87302);return true;
                }
                }__CLR4_1_101vbp1vbplusqklkd.R.inc(87303);return false;
            }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}
        };

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87304);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87305);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87306);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87307);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87308);map.put("name", "chennp2008");
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87309);serializer.write(map);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87310);String text = out.toString();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87311);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101vbp1vbplusqklkd.R.globalSliceStart(getClass().getName(),87312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61vdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vbp1vbplusqklkd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vbp1vbplusqklkd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87312,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61vdc() throws Exception{try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87312);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87313);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87314);
                __CLR4_1_101vbp1vbplusqklkd.R.inc(87315);if (((("name".equals(name))&&(__CLR4_1_101vbp1vbplusqklkd.R.iget(87316)!=0|true))||(__CLR4_1_101vbp1vbplusqklkd.R.iget(87317)==0&false))) {{
                    __CLR4_1_101vbp1vbplusqklkd.R.inc(87318);return false;
                }
                }__CLR4_1_101vbp1vbplusqklkd.R.inc(87319);return true;
            }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}
        };

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87320);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87321);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87322);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87323);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87324);map.put("id", 3);
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87325);map.put("name", "chennp2008");
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87326);serializer.write(map);

        __CLR4_1_101vbp1vbplusqklkd.R.inc(87327);String text = out.toString();
        __CLR4_1_101vbp1vbplusqklkd.R.inc(87328);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

    public static class A {

        private long    id;
        private String name;

        public long getId() {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87329);
            __CLR4_1_101vbp1vbplusqklkd.R.inc(87330);return id;
        }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87331);
            __CLR4_1_101vbp1vbplusqklkd.R.inc(87332);this.id = id;
        }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87333);
            __CLR4_1_101vbp1vbplusqklkd.R.inc(87334);return name;
        }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101vbp1vbplusqklkd.R.inc(87335);
            __CLR4_1_101vbp1vbplusqklkd.R.inc(87336);this.name = name;
        }finally{__CLR4_1_101vbp1vbplusqklkd.R.flushNeeded();}}

    }
}
