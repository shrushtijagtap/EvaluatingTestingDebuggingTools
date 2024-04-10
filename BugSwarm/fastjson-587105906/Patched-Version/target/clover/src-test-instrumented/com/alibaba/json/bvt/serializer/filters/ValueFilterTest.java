/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.A;

public class ValueFilterTest extends TestCase {static class __CLR4_5_21vnz1vnzlusyjvfs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87774,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceStart(getClass().getName(),87695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oiyabn1vnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vnz1vnzlusyjvfs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87695,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oiyabn1vnz() throws Exception{try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87695);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87696);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87697);
                __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87698);if ((((name.equals("id"))&&(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87699)!=0|true))||(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87700)==0&false))) {{
                    __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87701);return "AAA";
                }

                }__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87702);return value;
            }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

        };

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87703);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87704);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87705);serializer.getValueFilters().add(filter);

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87706);A a = new A();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87707);serializer.write(a);

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87708);String text = out.toString();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87709);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceStart(getClass().getName(),87710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1voe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vnz1vnzlusyjvfs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1voe() throws Exception{try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87710);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87711);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87712);
                __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87713);if ((((name.equals("id"))&&(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87714)!=0|true))||(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87715)==0&false))) {{
                    __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87716);return "AAA";
                }

                }__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87717);return value;
            }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

        };
        
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87718);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceStart(getClass().getName(),87719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285ccsr1von();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vnz1vnzlusyjvfs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87719,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285ccsr1von() throws Exception{try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87719);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87720);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87721);
                __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87722);if ((((name.equals("name"))&&(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87723)!=0|true))||(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87724)==0&false))) {{
                    __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87725);return "AAA";
                }

                }__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87726);return value;
            }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

        };

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87727);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87728);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87729);serializer.getValueFilters().add(filter);

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87730);A a = new A();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87731);serializer.write(a);

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87732);String text = out.toString();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87733);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceStart(getClass().getName(),87734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wce0a1vp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vnz1vnzlusyjvfs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wce0a1vp2() throws Exception{try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87734);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87735);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87736);
                __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87737);if ((((name.equals("name"))&&(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87738)!=0|true))||(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87739)==0&false))) {{
                    __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87740);return "AAA";
                }

                }__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87741);return value;
            }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

        };

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87742);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87743);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87744);serializer.getValueFilters().add(filter);

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87745);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87746);map.put("name", null);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87747);serializer.write(map);

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87748);String text = out.toString();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87749);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceStart(getClass().getName(),87750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ncf7t1vpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vnz1vnzlusyjvfs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vnz1vnzlusyjvfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ncf7t1vpi() throws Exception{try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87750);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87751);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87752);
                __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87753);if ((((name.equals("name"))&&(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87754)!=0|true))||(__CLR4_5_21vnz1vnzlusyjvfs.R.iget(87755)==0&false))) {{
                    __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87756);return null;
                }

                }__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87757);return value;
            }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

        };

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87758);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87759);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87760);serializer.getValueFilters().add(filter);

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87761);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87762);map.put("name", "AA");
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87763);serializer.write(map);

        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87764);String text = out.toString();
        __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87765);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

    public static class Bean {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87766);
            __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87767);return id;
        }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87768);
            __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87769);this.id = id;
        }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87770);
            __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87771);return name;
        }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21vnz1vnzlusyjvfs.R.inc(87772);
            __CLR4_5_21vnz1vnzlusyjvfs.R.inc(87773);this.name = name;
        }finally{__CLR4_5_21vnz1vnzlusyjvfs.R.flushNeeded();}}

    }
}
