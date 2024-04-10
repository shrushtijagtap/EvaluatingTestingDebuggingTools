/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_long extends TestCase {static class __CLR4_5_21vbe1vbelusyjven{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21vbe1vbelusyjven.R.globalSliceStart(getClass().getName(),87242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21vbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vbe1vbelusyjven.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vbe1vbelusyjven.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87242,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21vbe() throws Exception{try{__CLR4_5_21vbe1vbelusyjven.R.inc(87242);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87243);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87244);
                __CLR4_5_21vbe1vbelusyjven.R.inc(87245);return false;
            }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}
        };

        __CLR4_5_21vbe1vbelusyjven.R.inc(87246);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87247);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87248);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87249);A a = new A();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87250);serializer.write(a);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87251);String text = out.toString();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87252);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21vbe1vbelusyjven.R.globalSliceStart(getClass().getName(),87253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1vbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vbe1vbelusyjven.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vbe1vbelusyjven.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1vbp() throws Exception{try{__CLR4_5_21vbe1vbelusyjven.R.inc(87253);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87254);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87255);
                __CLR4_5_21vbe1vbelusyjven.R.inc(87256);if (((("id".equals(name))&&(__CLR4_5_21vbe1vbelusyjven.R.iget(87257)!=0|true))||(__CLR4_5_21vbe1vbelusyjven.R.iget(87258)==0&false))) {{
                    __CLR4_5_21vbe1vbelusyjven.R.inc(87259);Assert.assertTrue(value instanceof Long);
                    __CLR4_5_21vbe1vbelusyjven.R.inc(87260);return true;
                }
                }__CLR4_5_21vbe1vbelusyjven.R.inc(87261);return false;
            }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}
        };

        __CLR4_5_21vbe1vbelusyjven.R.inc(87262);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87263);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87264);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87265);A a = new A();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87266);serializer.write(a);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87267);String text = out.toString();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87268);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21vbe1vbelusyjven.R.globalSliceStart(getClass().getName(),87269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441vc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vbe1vbelusyjven.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vbe1vbelusyjven.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441vc5() throws Exception{try{__CLR4_5_21vbe1vbelusyjven.R.inc(87269);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87270);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87271);
                __CLR4_5_21vbe1vbelusyjven.R.inc(87272);if (((("name".equals(name))&&(__CLR4_5_21vbe1vbelusyjven.R.iget(87273)!=0|true))||(__CLR4_5_21vbe1vbelusyjven.R.iget(87274)==0&false))) {{
                    __CLR4_5_21vbe1vbelusyjven.R.inc(87275);return true;
                }
                }__CLR4_5_21vbe1vbelusyjven.R.inc(87276);return false;
            }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}
        };

        __CLR4_5_21vbe1vbelusyjven.R.inc(87277);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87278);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87279);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87280);A a = new A();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87281);a.setName("chennp2008");
        __CLR4_5_21vbe1vbelusyjven.R.inc(87282);serializer.write(a);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87283);String text = out.toString();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87284);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21vbe1vbelusyjven.R.globalSliceStart(getClass().getName(),87285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1vcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vbe1vbelusyjven.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vbe1vbelusyjven.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1vcl() throws Exception{try{__CLR4_5_21vbe1vbelusyjven.R.inc(87285);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87286);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87287);
                __CLR4_5_21vbe1vbelusyjven.R.inc(87288);if (((("name".equals(name))&&(__CLR4_5_21vbe1vbelusyjven.R.iget(87289)!=0|true))||(__CLR4_5_21vbe1vbelusyjven.R.iget(87290)==0&false))) {{
                    __CLR4_5_21vbe1vbelusyjven.R.inc(87291);return true;
                }
                }__CLR4_5_21vbe1vbelusyjven.R.inc(87292);return false;
            }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}
        };

        __CLR4_5_21vbe1vbelusyjven.R.inc(87293);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87294);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87295);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87296);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87297);map.put("name", "chennp2008");
        __CLR4_5_21vbe1vbelusyjven.R.inc(87298);serializer.write(map);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87299);String text = out.toString();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87300);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21vbe1vbelusyjven.R.globalSliceStart(getClass().getName(),87301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61vd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vbe1vbelusyjven.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vbe1vbelusyjven.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_long.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61vd1() throws Exception{try{__CLR4_5_21vbe1vbelusyjven.R.inc(87301);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87302);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87303);
                __CLR4_5_21vbe1vbelusyjven.R.inc(87304);if (((("name".equals(name))&&(__CLR4_5_21vbe1vbelusyjven.R.iget(87305)!=0|true))||(__CLR4_5_21vbe1vbelusyjven.R.iget(87306)==0&false))) {{
                    __CLR4_5_21vbe1vbelusyjven.R.inc(87307);return false;
                }
                }__CLR4_5_21vbe1vbelusyjven.R.inc(87308);return true;
            }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}
        };

        __CLR4_5_21vbe1vbelusyjven.R.inc(87309);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87310);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87311);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87312);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87313);map.put("id", 3);
        __CLR4_5_21vbe1vbelusyjven.R.inc(87314);map.put("name", "chennp2008");
        __CLR4_5_21vbe1vbelusyjven.R.inc(87315);serializer.write(map);

        __CLR4_5_21vbe1vbelusyjven.R.inc(87316);String text = out.toString();
        __CLR4_5_21vbe1vbelusyjven.R.inc(87317);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

    public static class A {

        private long    id;
        private String name;

        public long getId() {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87318);
            __CLR4_5_21vbe1vbelusyjven.R.inc(87319);return id;
        }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87320);
            __CLR4_5_21vbe1vbelusyjven.R.inc(87321);this.id = id;
        }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87322);
            __CLR4_5_21vbe1vbelusyjven.R.inc(87323);return name;
        }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21vbe1vbelusyjven.R.inc(87324);
            __CLR4_5_21vbe1vbelusyjven.R.inc(87325);this.name = name;
        }finally{__CLR4_5_21vbe1vbelusyjven.R.flushNeeded();}}

    }
}
