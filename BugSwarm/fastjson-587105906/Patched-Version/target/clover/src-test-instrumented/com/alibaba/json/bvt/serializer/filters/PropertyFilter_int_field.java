/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_int_field extends TestCase {static class __CLR4_5_21w7i1w7ilusvnh1o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,88474,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceStart(getClass().getName(),88398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21w7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7i1w7ilusvnh1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21w7i() throws Exception{try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88398);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88399);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88400);
                __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88401);return false;
            }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}
        };

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88402);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88403);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88404);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88405);A a = new A();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88406);serializer.write(a);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88407);String text = out.toString();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88408);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceStart(getClass().getName(),88409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1w7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7i1w7ilusvnh1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1w7t() throws Exception{try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88409);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88410);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88411);
                __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88412);if (((("id".equals(name))&&(__CLR4_5_21w7i1w7ilusvnh1o.R.iget(88413)!=0|true))||(__CLR4_5_21w7i1w7ilusvnh1o.R.iget(88414)==0&false))) {{
                    __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88415);Assert.assertTrue(value instanceof Integer);
                    __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88416);return true;
                }
                }__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88417);return false;
            }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}
        };

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88418);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88419);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88420);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88421);A a = new A();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88422);serializer.write(a);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88423);String text = out.toString();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88424);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceStart(getClass().getName(),88425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441w89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7i1w7ilusvnh1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441w89() throws Exception{try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88425);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88426);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88427);
                __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88428);if (((("name".equals(name))&&(__CLR4_5_21w7i1w7ilusvnh1o.R.iget(88429)!=0|true))||(__CLR4_5_21w7i1w7ilusvnh1o.R.iget(88430)==0&false))) {{
                    __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88431);return true;
                }
                }__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88432);return false;
            }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}
        };

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88433);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88434);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88435);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88436);A a = new A();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88437);a.name = "chennp2008";
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88438);serializer.write(a);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88439);String text = out.toString();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88440);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceStart(getClass().getName(),88441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1w8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7i1w7ilusvnh1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1w8p() throws Exception{try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88441);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88442);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88443);
                __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88444);if (((("name".equals(name))&&(__CLR4_5_21w7i1w7ilusvnh1o.R.iget(88445)!=0|true))||(__CLR4_5_21w7i1w7ilusvnh1o.R.iget(88446)==0&false))) {{
                    __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88447);return true;
                }
                }__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88448);return false;
            }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}
        };

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88449);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88450);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88451);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88452);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88453);map.put("name", "chennp2008");
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88454);serializer.write(map);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88455);String text = out.toString();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88456);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceStart(getClass().getName(),88457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61w95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7i1w7ilusvnh1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7i1w7ilusvnh1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_int_field.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61w95() throws Exception{try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88457);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88458);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88459);
                __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88460);if (((("name".equals(name))&&(__CLR4_5_21w7i1w7ilusvnh1o.R.iget(88461)!=0|true))||(__CLR4_5_21w7i1w7ilusvnh1o.R.iget(88462)==0&false))) {{
                    __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88463);return false;
                }
                }__CLR4_5_21w7i1w7ilusvnh1o.R.inc(88464);return true;
            }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}
        };

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88465);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88466);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88467);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88468);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88469);map.put("id", 3);
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88470);map.put("name", "chennp2008");
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88471);serializer.write(map);

        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88472);String text = out.toString();
        __CLR4_5_21w7i1w7ilusvnh1o.R.inc(88473);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21w7i1w7ilusvnh1o.R.flushNeeded();}}

    public static class A {

        public int    id;
        public String name;


    }
}
