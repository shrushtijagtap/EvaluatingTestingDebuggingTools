/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.A;

public class ValueFilterTest extends TestCase {static class __CLR4_1_101voa1voalusqkloc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87785,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_1_101voa1voalusqkloc.R.globalSliceStart(getClass().getName(),87706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oiyabn1voa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101voa1voalusqkloc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101voa1voalusqkloc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oiyabn1voa() throws Exception{try{__CLR4_1_101voa1voalusqkloc.R.inc(87706);
        __CLR4_1_101voa1voalusqkloc.R.inc(87707);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101voa1voalusqkloc.R.inc(87708);
                __CLR4_1_101voa1voalusqkloc.R.inc(87709);if ((((name.equals("id"))&&(__CLR4_1_101voa1voalusqkloc.R.iget(87710)!=0|true))||(__CLR4_1_101voa1voalusqkloc.R.iget(87711)==0&false))) {{
                    __CLR4_1_101voa1voalusqkloc.R.inc(87712);return "AAA";
                }

                }__CLR4_1_101voa1voalusqkloc.R.inc(87713);return value;
            }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

        };

        __CLR4_1_101voa1voalusqkloc.R.inc(87714);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101voa1voalusqkloc.R.inc(87715);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101voa1voalusqkloc.R.inc(87716);serializer.getValueFilters().add(filter);

        __CLR4_1_101voa1voalusqkloc.R.inc(87717);A a = new A();
        __CLR4_1_101voa1voalusqkloc.R.inc(87718);serializer.write(a);

        __CLR4_1_101voa1voalusqkloc.R.inc(87719);String text = out.toString();
        __CLR4_1_101voa1voalusqkloc.R.inc(87720);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101voa1voalusqkloc.R.globalSliceStart(getClass().getName(),87721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1vop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101voa1voalusqkloc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101voa1voalusqkloc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87721,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1vop() throws Exception{try{__CLR4_1_101voa1voalusqkloc.R.inc(87721);
        __CLR4_1_101voa1voalusqkloc.R.inc(87722);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101voa1voalusqkloc.R.inc(87723);
                __CLR4_1_101voa1voalusqkloc.R.inc(87724);if ((((name.equals("id"))&&(__CLR4_1_101voa1voalusqkloc.R.iget(87725)!=0|true))||(__CLR4_1_101voa1voalusqkloc.R.iget(87726)==0&false))) {{
                    __CLR4_1_101voa1voalusqkloc.R.inc(87727);return "AAA";
                }

                }__CLR4_1_101voa1voalusqkloc.R.inc(87728);return value;
            }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

        };
        
        __CLR4_1_101voa1voalusqkloc.R.inc(87729);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_1_101voa1voalusqkloc.R.globalSliceStart(getClass().getName(),87730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1085ccsr1voy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101voa1voalusqkloc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101voa1voalusqkloc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87730,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1085ccsr1voy() throws Exception{try{__CLR4_1_101voa1voalusqkloc.R.inc(87730);
        __CLR4_1_101voa1voalusqkloc.R.inc(87731);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101voa1voalusqkloc.R.inc(87732);
                __CLR4_1_101voa1voalusqkloc.R.inc(87733);if ((((name.equals("name"))&&(__CLR4_1_101voa1voalusqkloc.R.iget(87734)!=0|true))||(__CLR4_1_101voa1voalusqkloc.R.iget(87735)==0&false))) {{
                    __CLR4_1_101voa1voalusqkloc.R.inc(87736);return "AAA";
                }

                }__CLR4_1_101voa1voalusqkloc.R.inc(87737);return value;
            }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

        };

        __CLR4_1_101voa1voalusqkloc.R.inc(87738);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101voa1voalusqkloc.R.inc(87739);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101voa1voalusqkloc.R.inc(87740);serializer.getValueFilters().add(filter);

        __CLR4_1_101voa1voalusqkloc.R.inc(87741);A a = new A();
        __CLR4_1_101voa1voalusqkloc.R.inc(87742);serializer.write(a);

        __CLR4_1_101voa1voalusqkloc.R.inc(87743);String text = out.toString();
        __CLR4_1_101voa1voalusqkloc.R.inc(87744);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_1_101voa1voalusqkloc.R.globalSliceStart(getClass().getName(),87745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104wce0a1vpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101voa1voalusqkloc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101voa1voalusqkloc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104wce0a1vpd() throws Exception{try{__CLR4_1_101voa1voalusqkloc.R.inc(87745);
        __CLR4_1_101voa1voalusqkloc.R.inc(87746);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101voa1voalusqkloc.R.inc(87747);
                __CLR4_1_101voa1voalusqkloc.R.inc(87748);if ((((name.equals("name"))&&(__CLR4_1_101voa1voalusqkloc.R.iget(87749)!=0|true))||(__CLR4_1_101voa1voalusqkloc.R.iget(87750)==0&false))) {{
                    __CLR4_1_101voa1voalusqkloc.R.inc(87751);return "AAA";
                }

                }__CLR4_1_101voa1voalusqkloc.R.inc(87752);return value;
            }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

        };

        __CLR4_1_101voa1voalusqkloc.R.inc(87753);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101voa1voalusqkloc.R.inc(87754);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101voa1voalusqkloc.R.inc(87755);serializer.getValueFilters().add(filter);

        __CLR4_1_101voa1voalusqkloc.R.inc(87756);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101voa1voalusqkloc.R.inc(87757);map.put("name", null);
        __CLR4_1_101voa1voalusqkloc.R.inc(87758);serializer.write(map);

        __CLR4_1_101voa1voalusqkloc.R.inc(87759);String text = out.toString();
        __CLR4_1_101voa1voalusqkloc.R.inc(87760);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_1_101voa1voalusqkloc.R.globalSliceStart(getClass().getName(),87761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101ncf7t1vpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101voa1voalusqkloc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101voa1voalusqkloc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87761,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101ncf7t1vpt() throws Exception{try{__CLR4_1_101voa1voalusqkloc.R.inc(87761);
        __CLR4_1_101voa1voalusqkloc.R.inc(87762);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101voa1voalusqkloc.R.inc(87763);
                __CLR4_1_101voa1voalusqkloc.R.inc(87764);if ((((name.equals("name"))&&(__CLR4_1_101voa1voalusqkloc.R.iget(87765)!=0|true))||(__CLR4_1_101voa1voalusqkloc.R.iget(87766)==0&false))) {{
                    __CLR4_1_101voa1voalusqkloc.R.inc(87767);return null;
                }

                }__CLR4_1_101voa1voalusqkloc.R.inc(87768);return value;
            }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

        };

        __CLR4_1_101voa1voalusqkloc.R.inc(87769);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101voa1voalusqkloc.R.inc(87770);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101voa1voalusqkloc.R.inc(87771);serializer.getValueFilters().add(filter);

        __CLR4_1_101voa1voalusqkloc.R.inc(87772);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101voa1voalusqkloc.R.inc(87773);map.put("name", "AA");
        __CLR4_1_101voa1voalusqkloc.R.inc(87774);serializer.write(map);

        __CLR4_1_101voa1voalusqkloc.R.inc(87775);String text = out.toString();
        __CLR4_1_101voa1voalusqkloc.R.inc(87776);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

    public static class Bean {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101voa1voalusqkloc.R.inc(87777);
            __CLR4_1_101voa1voalusqkloc.R.inc(87778);return id;
        }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101voa1voalusqkloc.R.inc(87779);
            __CLR4_1_101voa1voalusqkloc.R.inc(87780);this.id = id;
        }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101voa1voalusqkloc.R.inc(87781);
            __CLR4_1_101voa1voalusqkloc.R.inc(87782);return name;
        }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101voa1voalusqkloc.R.inc(87783);
            __CLR4_1_101voa1voalusqkloc.R.inc(87784);this.name = name;
        }finally{__CLR4_1_101voa1voalusqkloc.R.flushNeeded();}}

    }
}
