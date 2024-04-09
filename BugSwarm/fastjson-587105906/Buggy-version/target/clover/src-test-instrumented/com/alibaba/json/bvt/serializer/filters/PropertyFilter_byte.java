/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_byte extends TestCase {static class __CLR4_1_101v091v09lusqklex{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,86925,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101v091v09lusqklex.R.globalSliceStart(getClass().getName(),86841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21v09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v091v09lusqklex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v091v09lusqklex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86841,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21v09() throws Exception{try{__CLR4_1_101v091v09lusqklex.R.inc(86841);
        __CLR4_1_101v091v09lusqklex.R.inc(86842);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v091v09lusqklex.R.inc(86843);
                __CLR4_1_101v091v09lusqklex.R.inc(86844);return false;
            }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}
        };

        __CLR4_1_101v091v09lusqklex.R.inc(86845);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v091v09lusqklex.R.inc(86846);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v091v09lusqklex.R.inc(86847);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v091v09lusqklex.R.inc(86848);A a = new A();
        __CLR4_1_101v091v09lusqklex.R.inc(86849);serializer.write(a);

        __CLR4_1_101v091v09lusqklex.R.inc(86850);String text = out.toString();
        __CLR4_1_101v091v09lusqklex.R.inc(86851);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101v091v09lusqklex.R.globalSliceStart(getClass().getName(),86852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1v0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v091v09lusqklex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v091v09lusqklex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1v0k() throws Exception{try{__CLR4_1_101v091v09lusqklex.R.inc(86852);
        __CLR4_1_101v091v09lusqklex.R.inc(86853);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v091v09lusqklex.R.inc(86854);
                __CLR4_1_101v091v09lusqklex.R.inc(86855);if (((("id".equals(name))&&(__CLR4_1_101v091v09lusqklex.R.iget(86856)!=0|true))||(__CLR4_1_101v091v09lusqklex.R.iget(86857)==0&false))) {{
                    __CLR4_1_101v091v09lusqklex.R.inc(86858);Assert.assertTrue(value instanceof Byte);
                    __CLR4_1_101v091v09lusqklex.R.inc(86859);return true;
                }
                }__CLR4_1_101v091v09lusqklex.R.inc(86860);return false;
            }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}
        };

        __CLR4_1_101v091v09lusqklex.R.inc(86861);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v091v09lusqklex.R.inc(86862);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v091v09lusqklex.R.inc(86863);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v091v09lusqklex.R.inc(86864);A a = new A();
        __CLR4_1_101v091v09lusqklex.R.inc(86865);serializer.write(a);

        __CLR4_1_101v091v09lusqklex.R.inc(86866);String text = out.toString();
        __CLR4_1_101v091v09lusqklex.R.inc(86867);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101v091v09lusqklex.R.globalSliceStart(getClass().getName(),86868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441v10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v091v09lusqklex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v091v09lusqklex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86868,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441v10() throws Exception{try{__CLR4_1_101v091v09lusqklex.R.inc(86868);
        __CLR4_1_101v091v09lusqklex.R.inc(86869);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v091v09lusqklex.R.inc(86870);
                __CLR4_1_101v091v09lusqklex.R.inc(86871);if (((("name".equals(name))&&(__CLR4_1_101v091v09lusqklex.R.iget(86872)!=0|true))||(__CLR4_1_101v091v09lusqklex.R.iget(86873)==0&false))) {{
                    __CLR4_1_101v091v09lusqklex.R.inc(86874);return true;
                }
                }__CLR4_1_101v091v09lusqklex.R.inc(86875);return false;
            }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}
        };

        __CLR4_1_101v091v09lusqklex.R.inc(86876);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v091v09lusqklex.R.inc(86877);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v091v09lusqklex.R.inc(86878);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v091v09lusqklex.R.inc(86879);A a = new A();
        __CLR4_1_101v091v09lusqklex.R.inc(86880);a.setName("chennp2008");
        __CLR4_1_101v091v09lusqklex.R.inc(86881);serializer.write(a);

        __CLR4_1_101v091v09lusqklex.R.inc(86882);String text = out.toString();
        __CLR4_1_101v091v09lusqklex.R.inc(86883);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101v091v09lusqklex.R.globalSliceStart(getClass().getName(),86884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1v1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v091v09lusqklex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v091v09lusqklex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86884,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1v1g() throws Exception{try{__CLR4_1_101v091v09lusqklex.R.inc(86884);
        __CLR4_1_101v091v09lusqklex.R.inc(86885);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v091v09lusqklex.R.inc(86886);
                __CLR4_1_101v091v09lusqklex.R.inc(86887);if (((("name".equals(name))&&(__CLR4_1_101v091v09lusqklex.R.iget(86888)!=0|true))||(__CLR4_1_101v091v09lusqklex.R.iget(86889)==0&false))) {{
                    __CLR4_1_101v091v09lusqklex.R.inc(86890);return true;
                }
                }__CLR4_1_101v091v09lusqklex.R.inc(86891);return false;
            }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}
        };

        __CLR4_1_101v091v09lusqklex.R.inc(86892);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v091v09lusqklex.R.inc(86893);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v091v09lusqklex.R.inc(86894);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v091v09lusqklex.R.inc(86895);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101v091v09lusqklex.R.inc(86896);map.put("name", "chennp2008");
        __CLR4_1_101v091v09lusqklex.R.inc(86897);serializer.write(map);

        __CLR4_1_101v091v09lusqklex.R.inc(86898);String text = out.toString();
        __CLR4_1_101v091v09lusqklex.R.inc(86899);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101v091v09lusqklex.R.globalSliceStart(getClass().getName(),86900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61v1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v091v09lusqklex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v091v09lusqklex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86900,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61v1w() throws Exception{try{__CLR4_1_101v091v09lusqklex.R.inc(86900);
        __CLR4_1_101v091v09lusqklex.R.inc(86901);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v091v09lusqklex.R.inc(86902);
                __CLR4_1_101v091v09lusqklex.R.inc(86903);if (((("name".equals(name))&&(__CLR4_1_101v091v09lusqklex.R.iget(86904)!=0|true))||(__CLR4_1_101v091v09lusqklex.R.iget(86905)==0&false))) {{
                    __CLR4_1_101v091v09lusqklex.R.inc(86906);return false;
                }
                }__CLR4_1_101v091v09lusqklex.R.inc(86907);return true;
            }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}
        };

        __CLR4_1_101v091v09lusqklex.R.inc(86908);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v091v09lusqklex.R.inc(86909);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v091v09lusqklex.R.inc(86910);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v091v09lusqklex.R.inc(86911);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101v091v09lusqklex.R.inc(86912);map.put("id", 3);
        __CLR4_1_101v091v09lusqklex.R.inc(86913);map.put("name", "chennp2008");
        __CLR4_1_101v091v09lusqklex.R.inc(86914);serializer.write(map);

        __CLR4_1_101v091v09lusqklex.R.inc(86915);String text = out.toString();
        __CLR4_1_101v091v09lusqklex.R.inc(86916);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

    public static class A {

        private byte    id;
        private String name;

        public byte getId() {try{__CLR4_1_101v091v09lusqklex.R.inc(86917);
            __CLR4_1_101v091v09lusqklex.R.inc(86918);return id;
        }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

        public void setId(byte id) {try{__CLR4_1_101v091v09lusqklex.R.inc(86919);
            __CLR4_1_101v091v09lusqklex.R.inc(86920);this.id = id;
        }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101v091v09lusqklex.R.inc(86921);
            __CLR4_1_101v091v09lusqklex.R.inc(86922);return name;
        }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101v091v09lusqklex.R.inc(86923);
            __CLR4_1_101v091v09lusqklex.R.inc(86924);this.name = name;
        }finally{__CLR4_1_101v091v09lusqklex.R.flushNeeded();}}

    }
}
