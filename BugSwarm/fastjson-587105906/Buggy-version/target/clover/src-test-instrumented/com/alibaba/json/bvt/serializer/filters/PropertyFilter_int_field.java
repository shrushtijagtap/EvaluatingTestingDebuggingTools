/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_int_field extends TestCase {static class __CLR4_1_101w7t1w7tluszwfl2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceStart(getClass().getName(),88409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21w7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7t1w7tluszwfl2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21w7t() throws Exception{try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88409);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88410);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88411);
                __CLR4_1_101w7t1w7tluszwfl2.R.inc(88412);return false;
            }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}
        };

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88413);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88414);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88415);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88416);A a = new A();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88417);serializer.write(a);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88418);String text = out.toString();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88419);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceStart(getClass().getName(),88420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1w84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7t1w7tluszwfl2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88420,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1w84() throws Exception{try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88420);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88421);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88422);
                __CLR4_1_101w7t1w7tluszwfl2.R.inc(88423);if (((("id".equals(name))&&(__CLR4_1_101w7t1w7tluszwfl2.R.iget(88424)!=0|true))||(__CLR4_1_101w7t1w7tluszwfl2.R.iget(88425)==0&false))) {{
                    __CLR4_1_101w7t1w7tluszwfl2.R.inc(88426);Assert.assertTrue(value instanceof Integer);
                    __CLR4_1_101w7t1w7tluszwfl2.R.inc(88427);return true;
                }
                }__CLR4_1_101w7t1w7tluszwfl2.R.inc(88428);return false;
            }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}
        };

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88429);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88430);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88431);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88432);A a = new A();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88433);serializer.write(a);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88434);String text = out.toString();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88435);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceStart(getClass().getName(),88436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441w8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7t1w7tluszwfl2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88436,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441w8k() throws Exception{try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88436);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88437);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88438);
                __CLR4_1_101w7t1w7tluszwfl2.R.inc(88439);if (((("name".equals(name))&&(__CLR4_1_101w7t1w7tluszwfl2.R.iget(88440)!=0|true))||(__CLR4_1_101w7t1w7tluszwfl2.R.iget(88441)==0&false))) {{
                    __CLR4_1_101w7t1w7tluszwfl2.R.inc(88442);return true;
                }
                }__CLR4_1_101w7t1w7tluszwfl2.R.inc(88443);return false;
            }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}
        };

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88444);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88445);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88446);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88447);A a = new A();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88448);a.name = "chennp2008";
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88449);serializer.write(a);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88450);String text = out.toString();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88451);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceStart(getClass().getName(),88452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1w90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7t1w7tluszwfl2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88452,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1w90() throws Exception{try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88452);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88453);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88454);
                __CLR4_1_101w7t1w7tluszwfl2.R.inc(88455);if (((("name".equals(name))&&(__CLR4_1_101w7t1w7tluszwfl2.R.iget(88456)!=0|true))||(__CLR4_1_101w7t1w7tluszwfl2.R.iget(88457)==0&false))) {{
                    __CLR4_1_101w7t1w7tluszwfl2.R.inc(88458);return true;
                }
                }__CLR4_1_101w7t1w7tluszwfl2.R.inc(88459);return false;
            }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}
        };

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88460);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88461);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88462);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88463);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88464);map.put("name", "chennp2008");
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88465);serializer.write(map);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88466);String text = out.toString();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88467);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceStart(getClass().getName(),88468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61w9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7t1w7tluszwfl2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7t1w7tluszwfl2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88468,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61w9g() throws Exception{try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88468);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88469);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w7t1w7tluszwfl2.R.inc(88470);
                __CLR4_1_101w7t1w7tluszwfl2.R.inc(88471);if (((("name".equals(name))&&(__CLR4_1_101w7t1w7tluszwfl2.R.iget(88472)!=0|true))||(__CLR4_1_101w7t1w7tluszwfl2.R.iget(88473)==0&false))) {{
                    __CLR4_1_101w7t1w7tluszwfl2.R.inc(88474);return false;
                }
                }__CLR4_1_101w7t1w7tluszwfl2.R.inc(88475);return true;
            }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}
        };

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88476);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88477);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88478);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88479);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88480);map.put("id", 3);
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88481);map.put("name", "chennp2008");
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88482);serializer.write(map);

        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88483);String text = out.toString();
        __CLR4_1_101w7t1w7tluszwfl2.R.inc(88484);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101w7t1w7tluszwfl2.R.flushNeeded();}}

    public static class A {

        public int    id;
        public String name;


    }
}
