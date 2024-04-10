/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_double extends TestCase {static class __CLR4_5_21v4m1v4mlusyjvea{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87082,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceStart(getClass().getName(),86998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21v4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v4m1v4mlusyjvea.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86998,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21v4m() throws Exception{try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(86998);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(86999);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87000);
                __CLR4_5_21v4m1v4mlusyjvea.R.inc(87001);return false;
            }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}
        };

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87002);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87003);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87004);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87005);A a = new A();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87006);serializer.write(a);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87007);String text = out.toString();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87008);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceStart(getClass().getName(),87009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1v4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v4m1v4mlusyjvea.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1v4x() throws Exception{try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87009);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87010);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87011);
                __CLR4_5_21v4m1v4mlusyjvea.R.inc(87012);if (((("id".equals(name))&&(__CLR4_5_21v4m1v4mlusyjvea.R.iget(87013)!=0|true))||(__CLR4_5_21v4m1v4mlusyjvea.R.iget(87014)==0&false))) {{
                    __CLR4_5_21v4m1v4mlusyjvea.R.inc(87015);Assert.assertTrue(value instanceof Double);
                    __CLR4_5_21v4m1v4mlusyjvea.R.inc(87016);return true;
                }
                }__CLR4_5_21v4m1v4mlusyjvea.R.inc(87017);return false;
            }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}
        };

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87018);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87019);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87020);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87021);A a = new A();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87022);serializer.write(a);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87023);String text = out.toString();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87024);Assert.assertEquals("{\"id\":0.0}", text);
    }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceStart(getClass().getName(),87025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441v5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v4m1v4mlusyjvea.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87025,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441v5d() throws Exception{try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87025);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87026);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87027);
                __CLR4_5_21v4m1v4mlusyjvea.R.inc(87028);if (((("name".equals(name))&&(__CLR4_5_21v4m1v4mlusyjvea.R.iget(87029)!=0|true))||(__CLR4_5_21v4m1v4mlusyjvea.R.iget(87030)==0&false))) {{
                    __CLR4_5_21v4m1v4mlusyjvea.R.inc(87031);return true;
                }
                }__CLR4_5_21v4m1v4mlusyjvea.R.inc(87032);return false;
            }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}
        };

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87033);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87034);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87035);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87036);A a = new A();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87037);a.setName("chennp2008");
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87038);serializer.write(a);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87039);String text = out.toString();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87040);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceStart(getClass().getName(),87041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1v5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v4m1v4mlusyjvea.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1v5t() throws Exception{try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87041);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87042);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87043);
                __CLR4_5_21v4m1v4mlusyjvea.R.inc(87044);if (((("name".equals(name))&&(__CLR4_5_21v4m1v4mlusyjvea.R.iget(87045)!=0|true))||(__CLR4_5_21v4m1v4mlusyjvea.R.iget(87046)==0&false))) {{
                    __CLR4_5_21v4m1v4mlusyjvea.R.inc(87047);return true;
                }
                }__CLR4_5_21v4m1v4mlusyjvea.R.inc(87048);return false;
            }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}
        };

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87049);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87050);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87051);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87052);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87053);map.put("name", "chennp2008");
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87054);serializer.write(map);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87055);String text = out.toString();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87056);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceStart(getClass().getName(),87057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61v69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v4m1v4mlusyjvea.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v4m1v4mlusyjvea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_double.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87057,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61v69() throws Exception{try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87057);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87058);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87059);
                __CLR4_5_21v4m1v4mlusyjvea.R.inc(87060);if (((("name".equals(name))&&(__CLR4_5_21v4m1v4mlusyjvea.R.iget(87061)!=0|true))||(__CLR4_5_21v4m1v4mlusyjvea.R.iget(87062)==0&false))) {{
                    __CLR4_5_21v4m1v4mlusyjvea.R.inc(87063);return false;
                }
                }__CLR4_5_21v4m1v4mlusyjvea.R.inc(87064);return true;
            }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}
        };

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87065);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87066);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87067);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87068);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87069);map.put("id", 3);
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87070);map.put("name", "chennp2008");
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87071);serializer.write(map);

        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87072);String text = out.toString();
        __CLR4_5_21v4m1v4mlusyjvea.R.inc(87073);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

    public static class A {

        private double    id;
        private String name;

        public double getId() {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87074);
            __CLR4_5_21v4m1v4mlusyjvea.R.inc(87075);return id;
        }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

        public void setId(double id) {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87076);
            __CLR4_5_21v4m1v4mlusyjvea.R.inc(87077);this.id = id;
        }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87078);
            __CLR4_5_21v4m1v4mlusyjvea.R.inc(87079);return name;
        }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21v4m1v4mlusyjvea.R.inc(87080);
            __CLR4_5_21v4m1v4mlusyjvea.R.inc(87081);this.name = name;
        }finally{__CLR4_5_21v4m1v4mlusyjvea.R.flushNeeded();}}

    }
}
