/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilterTest extends TestCase {static class __CLR4_5_21uv51uv5lusyjvdq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,86745,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceStart(getClass().getName(),86657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21uv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uv51uv5lusyjvdq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86657,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21uv5() throws Exception{try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86657);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86658);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86659);
                __CLR4_5_21uv51uv5lusyjvdq.R.inc(86660);return false;
            }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}
        };

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86661);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86662);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86663);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86664);A a = new A();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86665);serializer.write(a);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86666);String text = out.toString();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86667);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceStart(getClass().getName(),86668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1uvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uv51uv5lusyjvdq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1uvg() throws Exception{try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86668);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86669);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86670);
                __CLR4_5_21uv51uv5lusyjvdq.R.inc(86671);return false;
            }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}
        };

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86672);Assert.assertEquals("{}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceStart(getClass().getName(),86673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1uvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uv51uv5lusyjvdq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86673,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1uvl() throws Exception{try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86673);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86674);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86675);
                __CLR4_5_21uv51uv5lusyjvdq.R.inc(86676);if (((("id".equals(name))&&(__CLR4_5_21uv51uv5lusyjvdq.R.iget(86677)!=0|true))||(__CLR4_5_21uv51uv5lusyjvdq.R.iget(86678)==0&false))) {{
                    __CLR4_5_21uv51uv5lusyjvdq.R.inc(86679);return true;
                }
                }__CLR4_5_21uv51uv5lusyjvdq.R.inc(86680);return false;
            }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}
        };

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86681);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86682);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86683);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86684);A a = new A();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86685);serializer.write(a);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86686);String text = out.toString();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86687);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceStart(getClass().getName(),86688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441uw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uv51uv5lusyjvdq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441uw0() throws Exception{try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86688);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86689);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86690);
                __CLR4_5_21uv51uv5lusyjvdq.R.inc(86691);if (((("name".equals(name))&&(__CLR4_5_21uv51uv5lusyjvdq.R.iget(86692)!=0|true))||(__CLR4_5_21uv51uv5lusyjvdq.R.iget(86693)==0&false))) {{
                    __CLR4_5_21uv51uv5lusyjvdq.R.inc(86694);return true;
                }
                }__CLR4_5_21uv51uv5lusyjvdq.R.inc(86695);return false;
            }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}
        };

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86696);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86697);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86698);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86699);A a = new A();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86700);a.setName("chennp2008");
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86701);serializer.write(a);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86702);String text = out.toString();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86703);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceStart(getClass().getName(),86704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1uwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uv51uv5lusyjvdq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1uwg() throws Exception{try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86704);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86705);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86706);
                __CLR4_5_21uv51uv5lusyjvdq.R.inc(86707);if (((("name".equals(name))&&(__CLR4_5_21uv51uv5lusyjvdq.R.iget(86708)!=0|true))||(__CLR4_5_21uv51uv5lusyjvdq.R.iget(86709)==0&false))) {{
                    __CLR4_5_21uv51uv5lusyjvdq.R.inc(86710);return true;
                }
                }__CLR4_5_21uv51uv5lusyjvdq.R.inc(86711);return false;
            }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}
        };

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86712);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86713);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86714);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86715);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86716);map.put("name", "chennp2008");
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86717);serializer.write(map);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86718);String text = out.toString();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86719);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceStart(getClass().getName(),86720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61uww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uv51uv5lusyjvdq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uv51uv5lusyjvdq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61uww() throws Exception{try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86720);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86721);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86722);
                __CLR4_5_21uv51uv5lusyjvdq.R.inc(86723);if (((("name".equals(name))&&(__CLR4_5_21uv51uv5lusyjvdq.R.iget(86724)!=0|true))||(__CLR4_5_21uv51uv5lusyjvdq.R.iget(86725)==0&false))) {{
                    __CLR4_5_21uv51uv5lusyjvdq.R.inc(86726);return false;
                }
                }__CLR4_5_21uv51uv5lusyjvdq.R.inc(86727);return true;
            }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}
        };

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86728);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86729);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86730);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86731);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86732);map.put("id", 3);
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86733);map.put("name", "chennp2008");
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86734);serializer.write(map);

        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86735);String text = out.toString();
        __CLR4_5_21uv51uv5lusyjvdq.R.inc(86736);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

    public static class A {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86737);
            __CLR4_5_21uv51uv5lusyjvdq.R.inc(86738);return id;
        }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86739);
            __CLR4_5_21uv51uv5lusyjvdq.R.inc(86740);this.id = id;
        }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86741);
            __CLR4_5_21uv51uv5lusyjvdq.R.inc(86742);return name;
        }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21uv51uv5lusyjvdq.R.inc(86743);
            __CLR4_5_21uv51uv5lusyjvdq.R.inc(86744);this.name = name;
        }finally{__CLR4_5_21uv51uv5lusyjvdq.R.flushNeeded();}}

    }
}
