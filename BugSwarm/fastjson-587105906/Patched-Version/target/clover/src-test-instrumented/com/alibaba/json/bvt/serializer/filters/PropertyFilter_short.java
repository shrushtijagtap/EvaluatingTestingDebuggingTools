/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_short extends TestCase {static class __CLR4_5_21we21we2lusvnh2s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,88718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21we21we2lusvnh2s.R.globalSliceStart(getClass().getName(),88634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21we2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21we21we2lusvnh2s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21we21we2lusvnh2s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21we2() throws Exception{try{__CLR4_5_21we21we2lusvnh2s.R.inc(88634);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88635);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88636);
                __CLR4_5_21we21we2lusvnh2s.R.inc(88637);return false;
            }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}
        };

        __CLR4_5_21we21we2lusvnh2s.R.inc(88638);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88639);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88640);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88641);A a = new A();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88642);serializer.write(a);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88643);String text = out.toString();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88644);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21we21we2lusvnh2s.R.globalSliceStart(getClass().getName(),88645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1wed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21we21we2lusvnh2s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21we21we2lusvnh2s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1wed() throws Exception{try{__CLR4_5_21we21we2lusvnh2s.R.inc(88645);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88646);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88647);
                __CLR4_5_21we21we2lusvnh2s.R.inc(88648);if (((("id".equals(name))&&(__CLR4_5_21we21we2lusvnh2s.R.iget(88649)!=0|true))||(__CLR4_5_21we21we2lusvnh2s.R.iget(88650)==0&false))) {{
                    __CLR4_5_21we21we2lusvnh2s.R.inc(88651);Assert.assertTrue(value instanceof Short);
                    __CLR4_5_21we21we2lusvnh2s.R.inc(88652);return true;
                }
                }__CLR4_5_21we21we2lusvnh2s.R.inc(88653);return false;
            }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}
        };

        __CLR4_5_21we21we2lusvnh2s.R.inc(88654);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88655);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88656);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88657);A a = new A();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88658);serializer.write(a);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88659);String text = out.toString();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88660);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21we21we2lusvnh2s.R.globalSliceStart(getClass().getName(),88661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441wet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21we21we2lusvnh2s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21we21we2lusvnh2s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441wet() throws Exception{try{__CLR4_5_21we21we2lusvnh2s.R.inc(88661);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88662);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88663);
                __CLR4_5_21we21we2lusvnh2s.R.inc(88664);if (((("name".equals(name))&&(__CLR4_5_21we21we2lusvnh2s.R.iget(88665)!=0|true))||(__CLR4_5_21we21we2lusvnh2s.R.iget(88666)==0&false))) {{
                    __CLR4_5_21we21we2lusvnh2s.R.inc(88667);return true;
                }
                }__CLR4_5_21we21we2lusvnh2s.R.inc(88668);return false;
            }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}
        };

        __CLR4_5_21we21we2lusvnh2s.R.inc(88669);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88670);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88671);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88672);A a = new A();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88673);a.setName("chennp2008");
        __CLR4_5_21we21we2lusvnh2s.R.inc(88674);serializer.write(a);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88675);String text = out.toString();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88676);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21we21we2lusvnh2s.R.globalSliceStart(getClass().getName(),88677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1wf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21we21we2lusvnh2s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21we21we2lusvnh2s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1wf9() throws Exception{try{__CLR4_5_21we21we2lusvnh2s.R.inc(88677);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88678);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88679);
                __CLR4_5_21we21we2lusvnh2s.R.inc(88680);if (((("name".equals(name))&&(__CLR4_5_21we21we2lusvnh2s.R.iget(88681)!=0|true))||(__CLR4_5_21we21we2lusvnh2s.R.iget(88682)==0&false))) {{
                    __CLR4_5_21we21we2lusvnh2s.R.inc(88683);return true;
                }
                }__CLR4_5_21we21we2lusvnh2s.R.inc(88684);return false;
            }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}
        };

        __CLR4_5_21we21we2lusvnh2s.R.inc(88685);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88686);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88687);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88688);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88689);map.put("name", "chennp2008");
        __CLR4_5_21we21we2lusvnh2s.R.inc(88690);serializer.write(map);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88691);String text = out.toString();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88692);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21we21we2lusvnh2s.R.globalSliceStart(getClass().getName(),88693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61wfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21we21we2lusvnh2s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21we21we2lusvnh2s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61wfp() throws Exception{try{__CLR4_5_21we21we2lusvnh2s.R.inc(88693);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88694);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88695);
                __CLR4_5_21we21we2lusvnh2s.R.inc(88696);if (((("name".equals(name))&&(__CLR4_5_21we21we2lusvnh2s.R.iget(88697)!=0|true))||(__CLR4_5_21we21we2lusvnh2s.R.iget(88698)==0&false))) {{
                    __CLR4_5_21we21we2lusvnh2s.R.inc(88699);return false;
                }
                }__CLR4_5_21we21we2lusvnh2s.R.inc(88700);return true;
            }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}
        };

        __CLR4_5_21we21we2lusvnh2s.R.inc(88701);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88702);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88703);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88704);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88705);map.put("id", 3);
        __CLR4_5_21we21we2lusvnh2s.R.inc(88706);map.put("name", "chennp2008");
        __CLR4_5_21we21we2lusvnh2s.R.inc(88707);serializer.write(map);

        __CLR4_5_21we21we2lusvnh2s.R.inc(88708);String text = out.toString();
        __CLR4_5_21we21we2lusvnh2s.R.inc(88709);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

    public static class A {

        private short    id;
        private String name;

        public short getId() {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88710);
            __CLR4_5_21we21we2lusvnh2s.R.inc(88711);return id;
        }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

        public void setId(short id) {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88712);
            __CLR4_5_21we21we2lusvnh2s.R.inc(88713);this.id = id;
        }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88714);
            __CLR4_5_21we21we2lusvnh2s.R.inc(88715);return name;
        }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21we21we2lusvnh2s.R.inc(88716);
            __CLR4_5_21we21we2lusvnh2s.R.inc(88717);this.name = name;
        }finally{__CLR4_5_21we21we2lusvnh2s.R.flushNeeded();}}

    }
}
