/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_float extends TestCase {static class __CLR4_1_101w5h1w5hluszwfkx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceStart(getClass().getName(),88325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21w5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w5h1w5hluszwfkx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88325,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21w5h() throws Exception{try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88325);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88326);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88327);
                __CLR4_1_101w5h1w5hluszwfkx.R.inc(88328);return false;
            }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}
        };

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88329);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88330);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88331);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88332);A a = new A();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88333);serializer.write(a);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88334);String text = out.toString();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88335);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceStart(getClass().getName(),88336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1w5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w5h1w5hluszwfkx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88336,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1w5s() throws Exception{try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88336);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88337);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88338);
                __CLR4_1_101w5h1w5hluszwfkx.R.inc(88339);if (((("id".equals(name))&&(__CLR4_1_101w5h1w5hluszwfkx.R.iget(88340)!=0|true))||(__CLR4_1_101w5h1w5hluszwfkx.R.iget(88341)==0&false))) {{
                    __CLR4_1_101w5h1w5hluszwfkx.R.inc(88342);Assert.assertTrue(value instanceof Float);
                    __CLR4_1_101w5h1w5hluszwfkx.R.inc(88343);return true;
                }
                }__CLR4_1_101w5h1w5hluszwfkx.R.inc(88344);return false;
            }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}
        };

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88345);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88346);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88347);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88348);A a = new A();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88349);serializer.write(a);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88350);String text = out.toString();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88351);Assert.assertEquals("{\"id\":0.0}", text);
    }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceStart(getClass().getName(),88352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441w68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w5h1w5hluszwfkx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88352,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441w68() throws Exception{try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88352);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88353);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88354);
                __CLR4_1_101w5h1w5hluszwfkx.R.inc(88355);if (((("name".equals(name))&&(__CLR4_1_101w5h1w5hluszwfkx.R.iget(88356)!=0|true))||(__CLR4_1_101w5h1w5hluszwfkx.R.iget(88357)==0&false))) {{
                    __CLR4_1_101w5h1w5hluszwfkx.R.inc(88358);return true;
                }
                }__CLR4_1_101w5h1w5hluszwfkx.R.inc(88359);return false;
            }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}
        };

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88360);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88361);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88362);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88363);A a = new A();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88364);a.setName("chennp2008");
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88365);serializer.write(a);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88366);String text = out.toString();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88367);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceStart(getClass().getName(),88368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1w6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w5h1w5hluszwfkx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88368,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1w6o() throws Exception{try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88368);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88369);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88370);
                __CLR4_1_101w5h1w5hluszwfkx.R.inc(88371);if (((("name".equals(name))&&(__CLR4_1_101w5h1w5hluszwfkx.R.iget(88372)!=0|true))||(__CLR4_1_101w5h1w5hluszwfkx.R.iget(88373)==0&false))) {{
                    __CLR4_1_101w5h1w5hluszwfkx.R.inc(88374);return true;
                }
                }__CLR4_1_101w5h1w5hluszwfkx.R.inc(88375);return false;
            }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}
        };

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88376);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88377);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88378);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88379);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88380);map.put("name", "chennp2008");
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88381);serializer.write(map);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88382);String text = out.toString();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88383);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceStart(getClass().getName(),88384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61w74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w5h1w5hluszwfkx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w5h1w5hluszwfkx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_float.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88384,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61w74() throws Exception{try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88384);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88385);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88386);
                __CLR4_1_101w5h1w5hluszwfkx.R.inc(88387);if (((("name".equals(name))&&(__CLR4_1_101w5h1w5hluszwfkx.R.iget(88388)!=0|true))||(__CLR4_1_101w5h1w5hluszwfkx.R.iget(88389)==0&false))) {{
                    __CLR4_1_101w5h1w5hluszwfkx.R.inc(88390);return false;
                }
                }__CLR4_1_101w5h1w5hluszwfkx.R.inc(88391);return true;
            }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}
        };

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88392);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88393);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88394);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88395);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88396);map.put("id", 3);
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88397);map.put("name", "chennp2008");
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88398);serializer.write(map);

        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88399);String text = out.toString();
        __CLR4_1_101w5h1w5hluszwfkx.R.inc(88400);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

    public static class A {

        private float    id;
        private String name;

        public float getId() {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88401);
            __CLR4_1_101w5h1w5hluszwfkx.R.inc(88402);return id;
        }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

        public void setId(float id) {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88403);
            __CLR4_1_101w5h1w5hluszwfkx.R.inc(88404);this.id = id;
        }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88405);
            __CLR4_1_101w5h1w5hluszwfkx.R.inc(88406);return name;
        }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101w5h1w5hluszwfkx.R.inc(88407);
            __CLR4_1_101w5h1w5hluszwfkx.R.inc(88408);this.name = name;
        }finally{__CLR4_1_101w5h1w5hluszwfkx.R.flushNeeded();}}

    }
}
