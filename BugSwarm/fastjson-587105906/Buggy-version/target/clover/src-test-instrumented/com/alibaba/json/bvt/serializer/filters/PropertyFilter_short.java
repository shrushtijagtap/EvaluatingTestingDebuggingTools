/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_short extends TestCase {static class __CLR4_1_101wed1wedluszwflp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88729,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101wed1wedluszwflp.R.globalSliceStart(getClass().getName(),88645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21wed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wed1wedluszwflp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wed1wedluszwflp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88645,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21wed() throws Exception{try{__CLR4_1_101wed1wedluszwflp.R.inc(88645);
        __CLR4_1_101wed1wedluszwflp.R.inc(88646);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wed1wedluszwflp.R.inc(88647);
                __CLR4_1_101wed1wedluszwflp.R.inc(88648);return false;
            }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}
        };

        __CLR4_1_101wed1wedluszwflp.R.inc(88649);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wed1wedluszwflp.R.inc(88650);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wed1wedluszwflp.R.inc(88651);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wed1wedluszwflp.R.inc(88652);A a = new A();
        __CLR4_1_101wed1wedluszwflp.R.inc(88653);serializer.write(a);

        __CLR4_1_101wed1wedluszwflp.R.inc(88654);String text = out.toString();
        __CLR4_1_101wed1wedluszwflp.R.inc(88655);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101wed1wedluszwflp.R.globalSliceStart(getClass().getName(),88656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1weo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wed1wedluszwflp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wed1wedluszwflp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88656,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1weo() throws Exception{try{__CLR4_1_101wed1wedluszwflp.R.inc(88656);
        __CLR4_1_101wed1wedluszwflp.R.inc(88657);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wed1wedluszwflp.R.inc(88658);
                __CLR4_1_101wed1wedluszwflp.R.inc(88659);if (((("id".equals(name))&&(__CLR4_1_101wed1wedluszwflp.R.iget(88660)!=0|true))||(__CLR4_1_101wed1wedluszwflp.R.iget(88661)==0&false))) {{
                    __CLR4_1_101wed1wedluszwflp.R.inc(88662);Assert.assertTrue(value instanceof Short);
                    __CLR4_1_101wed1wedluszwflp.R.inc(88663);return true;
                }
                }__CLR4_1_101wed1wedluszwflp.R.inc(88664);return false;
            }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}
        };

        __CLR4_1_101wed1wedluszwflp.R.inc(88665);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wed1wedluszwflp.R.inc(88666);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wed1wedluszwflp.R.inc(88667);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wed1wedluszwflp.R.inc(88668);A a = new A();
        __CLR4_1_101wed1wedluszwflp.R.inc(88669);serializer.write(a);

        __CLR4_1_101wed1wedluszwflp.R.inc(88670);String text = out.toString();
        __CLR4_1_101wed1wedluszwflp.R.inc(88671);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101wed1wedluszwflp.R.globalSliceStart(getClass().getName(),88672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441wf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wed1wedluszwflp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wed1wedluszwflp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441wf4() throws Exception{try{__CLR4_1_101wed1wedluszwflp.R.inc(88672);
        __CLR4_1_101wed1wedluszwflp.R.inc(88673);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wed1wedluszwflp.R.inc(88674);
                __CLR4_1_101wed1wedluszwflp.R.inc(88675);if (((("name".equals(name))&&(__CLR4_1_101wed1wedluszwflp.R.iget(88676)!=0|true))||(__CLR4_1_101wed1wedluszwflp.R.iget(88677)==0&false))) {{
                    __CLR4_1_101wed1wedluszwflp.R.inc(88678);return true;
                }
                }__CLR4_1_101wed1wedluszwflp.R.inc(88679);return false;
            }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}
        };

        __CLR4_1_101wed1wedluszwflp.R.inc(88680);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wed1wedluszwflp.R.inc(88681);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wed1wedluszwflp.R.inc(88682);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wed1wedluszwflp.R.inc(88683);A a = new A();
        __CLR4_1_101wed1wedluszwflp.R.inc(88684);a.setName("chennp2008");
        __CLR4_1_101wed1wedluszwflp.R.inc(88685);serializer.write(a);

        __CLR4_1_101wed1wedluszwflp.R.inc(88686);String text = out.toString();
        __CLR4_1_101wed1wedluszwflp.R.inc(88687);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101wed1wedluszwflp.R.globalSliceStart(getClass().getName(),88688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1wfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wed1wedluszwflp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wed1wedluszwflp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88688,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1wfk() throws Exception{try{__CLR4_1_101wed1wedluszwflp.R.inc(88688);
        __CLR4_1_101wed1wedluszwflp.R.inc(88689);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wed1wedluszwflp.R.inc(88690);
                __CLR4_1_101wed1wedluszwflp.R.inc(88691);if (((("name".equals(name))&&(__CLR4_1_101wed1wedluszwflp.R.iget(88692)!=0|true))||(__CLR4_1_101wed1wedluszwflp.R.iget(88693)==0&false))) {{
                    __CLR4_1_101wed1wedluszwflp.R.inc(88694);return true;
                }
                }__CLR4_1_101wed1wedluszwflp.R.inc(88695);return false;
            }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}
        };

        __CLR4_1_101wed1wedluszwflp.R.inc(88696);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wed1wedluszwflp.R.inc(88697);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wed1wedluszwflp.R.inc(88698);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wed1wedluszwflp.R.inc(88699);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wed1wedluszwflp.R.inc(88700);map.put("name", "chennp2008");
        __CLR4_1_101wed1wedluszwflp.R.inc(88701);serializer.write(map);

        __CLR4_1_101wed1wedluszwflp.R.inc(88702);String text = out.toString();
        __CLR4_1_101wed1wedluszwflp.R.inc(88703);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101wed1wedluszwflp.R.globalSliceStart(getClass().getName(),88704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61wg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wed1wedluszwflp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wed1wedluszwflp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88704,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61wg0() throws Exception{try{__CLR4_1_101wed1wedluszwflp.R.inc(88704);
        __CLR4_1_101wed1wedluszwflp.R.inc(88705);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101wed1wedluszwflp.R.inc(88706);
                __CLR4_1_101wed1wedluszwflp.R.inc(88707);if (((("name".equals(name))&&(__CLR4_1_101wed1wedluszwflp.R.iget(88708)!=0|true))||(__CLR4_1_101wed1wedluszwflp.R.iget(88709)==0&false))) {{
                    __CLR4_1_101wed1wedluszwflp.R.inc(88710);return false;
                }
                }__CLR4_1_101wed1wedluszwflp.R.inc(88711);return true;
            }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}
        };

        __CLR4_1_101wed1wedluszwflp.R.inc(88712);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wed1wedluszwflp.R.inc(88713);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wed1wedluszwflp.R.inc(88714);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101wed1wedluszwflp.R.inc(88715);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wed1wedluszwflp.R.inc(88716);map.put("id", 3);
        __CLR4_1_101wed1wedluszwflp.R.inc(88717);map.put("name", "chennp2008");
        __CLR4_1_101wed1wedluszwflp.R.inc(88718);serializer.write(map);

        __CLR4_1_101wed1wedluszwflp.R.inc(88719);String text = out.toString();
        __CLR4_1_101wed1wedluszwflp.R.inc(88720);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

    public static class A {

        private short    id;
        private String name;

        public short getId() {try{__CLR4_1_101wed1wedluszwflp.R.inc(88721);
            __CLR4_1_101wed1wedluszwflp.R.inc(88722);return id;
        }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

        public void setId(short id) {try{__CLR4_1_101wed1wedluszwflp.R.inc(88723);
            __CLR4_1_101wed1wedluszwflp.R.inc(88724);this.id = id;
        }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101wed1wedluszwflp.R.inc(88725);
            __CLR4_1_101wed1wedluszwflp.R.inc(88726);return name;
        }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101wed1wedluszwflp.R.inc(88727);
            __CLR4_1_101wed1wedluszwflp.R.inc(88728);this.name = name;
        }finally{__CLR4_1_101wed1wedluszwflp.R.flushNeeded();}}

    }
}
