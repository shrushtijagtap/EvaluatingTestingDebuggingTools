/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilterTest extends TestCase {static class __CLR4_1_101uvg1uvglusqkld4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,86756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101uvg1uvglusqkld4.R.globalSliceStart(getClass().getName(),86668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21uvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uvg1uvglusqkld4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uvg1uvglusqkld4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86668,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21uvg() throws Exception{try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86668);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86669);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86670);
                __CLR4_1_101uvg1uvglusqkld4.R.inc(86671);return false;
            }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}
        };

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86672);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86673);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86674);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86675);A a = new A();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86676);serializer.write(a);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86677);String text = out.toString();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86678);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101uvg1uvglusqkld4.R.globalSliceStart(getClass().getName(),86679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1uvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uvg1uvglusqkld4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uvg1uvglusqkld4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86679,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1uvr() throws Exception{try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86679);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86680);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86681);
                __CLR4_1_101uvg1uvglusqkld4.R.inc(86682);return false;
            }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}
        };

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86683);Assert.assertEquals("{}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101uvg1uvglusqkld4.R.globalSliceStart(getClass().getName(),86684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1uvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uvg1uvglusqkld4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uvg1uvglusqkld4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86684,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1uvw() throws Exception{try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86684);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86685);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86686);
                __CLR4_1_101uvg1uvglusqkld4.R.inc(86687);if (((("id".equals(name))&&(__CLR4_1_101uvg1uvglusqkld4.R.iget(86688)!=0|true))||(__CLR4_1_101uvg1uvglusqkld4.R.iget(86689)==0&false))) {{
                    __CLR4_1_101uvg1uvglusqkld4.R.inc(86690);return true;
                }
                }__CLR4_1_101uvg1uvglusqkld4.R.inc(86691);return false;
            }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}
        };

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86692);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86693);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86694);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86695);A a = new A();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86696);serializer.write(a);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86697);String text = out.toString();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86698);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101uvg1uvglusqkld4.R.globalSliceStart(getClass().getName(),86699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441uwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uvg1uvglusqkld4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uvg1uvglusqkld4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86699,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441uwb() throws Exception{try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86699);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86700);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86701);
                __CLR4_1_101uvg1uvglusqkld4.R.inc(86702);if (((("name".equals(name))&&(__CLR4_1_101uvg1uvglusqkld4.R.iget(86703)!=0|true))||(__CLR4_1_101uvg1uvglusqkld4.R.iget(86704)==0&false))) {{
                    __CLR4_1_101uvg1uvglusqkld4.R.inc(86705);return true;
                }
                }__CLR4_1_101uvg1uvglusqkld4.R.inc(86706);return false;
            }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}
        };

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86707);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86708);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86709);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86710);A a = new A();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86711);a.setName("chennp2008");
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86712);serializer.write(a);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86713);String text = out.toString();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86714);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101uvg1uvglusqkld4.R.globalSliceStart(getClass().getName(),86715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1uwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uvg1uvglusqkld4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uvg1uvglusqkld4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86715,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1uwr() throws Exception{try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86715);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86716);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86717);
                __CLR4_1_101uvg1uvglusqkld4.R.inc(86718);if (((("name".equals(name))&&(__CLR4_1_101uvg1uvglusqkld4.R.iget(86719)!=0|true))||(__CLR4_1_101uvg1uvglusqkld4.R.iget(86720)==0&false))) {{
                    __CLR4_1_101uvg1uvglusqkld4.R.inc(86721);return true;
                }
                }__CLR4_1_101uvg1uvglusqkld4.R.inc(86722);return false;
            }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}
        };

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86723);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86724);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86725);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86726);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86727);map.put("name", "chennp2008");
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86728);serializer.write(map);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86729);String text = out.toString();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86730);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101uvg1uvglusqkld4.R.globalSliceStart(getClass().getName(),86731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61ux7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uvg1uvglusqkld4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uvg1uvglusqkld4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86731,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61ux7() throws Exception{try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86731);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86732);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86733);
                __CLR4_1_101uvg1uvglusqkld4.R.inc(86734);if (((("name".equals(name))&&(__CLR4_1_101uvg1uvglusqkld4.R.iget(86735)!=0|true))||(__CLR4_1_101uvg1uvglusqkld4.R.iget(86736)==0&false))) {{
                    __CLR4_1_101uvg1uvglusqkld4.R.inc(86737);return false;
                }
                }__CLR4_1_101uvg1uvglusqkld4.R.inc(86738);return true;
            }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}
        };

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86739);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86740);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86741);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86742);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86743);map.put("id", 3);
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86744);map.put("name", "chennp2008");
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86745);serializer.write(map);

        __CLR4_1_101uvg1uvglusqkld4.R.inc(86746);String text = out.toString();
        __CLR4_1_101uvg1uvglusqkld4.R.inc(86747);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

    public static class A {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86748);
            __CLR4_1_101uvg1uvglusqkld4.R.inc(86749);return id;
        }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86750);
            __CLR4_1_101uvg1uvglusqkld4.R.inc(86751);this.id = id;
        }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86752);
            __CLR4_1_101uvg1uvglusqkld4.R.inc(86753);return name;
        }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101uvg1uvglusqkld4.R.inc(86754);
            __CLR4_1_101uvg1uvglusqkld4.R.inc(86755);this.name = name;
        }finally{__CLR4_1_101uvg1uvglusqkld4.R.flushNeeded();}}

    }
}
