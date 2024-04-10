/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_byte extends TestCase {static class __CLR4_5_21uzy1uzylusyjve1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,86914,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21uzy1uzylusyjve1.R.globalSliceStart(getClass().getName(),86830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21uzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uzy1uzylusyjve1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uzy1uzylusyjve1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21uzy() throws Exception{try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86830);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86831);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86832);
                __CLR4_5_21uzy1uzylusyjve1.R.inc(86833);return false;
            }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}
        };

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86834);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86835);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86836);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86837);A a = new A();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86838);serializer.write(a);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86839);String text = out.toString();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86840);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21uzy1uzylusyjve1.R.globalSliceStart(getClass().getName(),86841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1v09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uzy1uzylusyjve1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uzy1uzylusyjve1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1v09() throws Exception{try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86841);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86842);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86843);
                __CLR4_5_21uzy1uzylusyjve1.R.inc(86844);if (((("id".equals(name))&&(__CLR4_5_21uzy1uzylusyjve1.R.iget(86845)!=0|true))||(__CLR4_5_21uzy1uzylusyjve1.R.iget(86846)==0&false))) {{
                    __CLR4_5_21uzy1uzylusyjve1.R.inc(86847);Assert.assertTrue(value instanceof Byte);
                    __CLR4_5_21uzy1uzylusyjve1.R.inc(86848);return true;
                }
                }__CLR4_5_21uzy1uzylusyjve1.R.inc(86849);return false;
            }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}
        };

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86850);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86851);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86852);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86853);A a = new A();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86854);serializer.write(a);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86855);String text = out.toString();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86856);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21uzy1uzylusyjve1.R.globalSliceStart(getClass().getName(),86857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441v0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uzy1uzylusyjve1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uzy1uzylusyjve1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441v0p() throws Exception{try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86857);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86858);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86859);
                __CLR4_5_21uzy1uzylusyjve1.R.inc(86860);if (((("name".equals(name))&&(__CLR4_5_21uzy1uzylusyjve1.R.iget(86861)!=0|true))||(__CLR4_5_21uzy1uzylusyjve1.R.iget(86862)==0&false))) {{
                    __CLR4_5_21uzy1uzylusyjve1.R.inc(86863);return true;
                }
                }__CLR4_5_21uzy1uzylusyjve1.R.inc(86864);return false;
            }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}
        };

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86865);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86866);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86867);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86868);A a = new A();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86869);a.setName("chennp2008");
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86870);serializer.write(a);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86871);String text = out.toString();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86872);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21uzy1uzylusyjve1.R.globalSliceStart(getClass().getName(),86873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1v15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uzy1uzylusyjve1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uzy1uzylusyjve1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1v15() throws Exception{try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86873);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86874);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86875);
                __CLR4_5_21uzy1uzylusyjve1.R.inc(86876);if (((("name".equals(name))&&(__CLR4_5_21uzy1uzylusyjve1.R.iget(86877)!=0|true))||(__CLR4_5_21uzy1uzylusyjve1.R.iget(86878)==0&false))) {{
                    __CLR4_5_21uzy1uzylusyjve1.R.inc(86879);return true;
                }
                }__CLR4_5_21uzy1uzylusyjve1.R.inc(86880);return false;
            }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}
        };

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86881);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86882);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86883);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86884);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86885);map.put("name", "chennp2008");
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86886);serializer.write(map);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86887);String text = out.toString();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86888);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21uzy1uzylusyjve1.R.globalSliceStart(getClass().getName(),86889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61v1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uzy1uzylusyjve1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uzy1uzylusyjve1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61v1l() throws Exception{try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86889);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86890);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86891);
                __CLR4_5_21uzy1uzylusyjve1.R.inc(86892);if (((("name".equals(name))&&(__CLR4_5_21uzy1uzylusyjve1.R.iget(86893)!=0|true))||(__CLR4_5_21uzy1uzylusyjve1.R.iget(86894)==0&false))) {{
                    __CLR4_5_21uzy1uzylusyjve1.R.inc(86895);return false;
                }
                }__CLR4_5_21uzy1uzylusyjve1.R.inc(86896);return true;
            }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}
        };

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86897);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86898);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86899);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86900);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86901);map.put("id", 3);
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86902);map.put("name", "chennp2008");
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86903);serializer.write(map);

        __CLR4_5_21uzy1uzylusyjve1.R.inc(86904);String text = out.toString();
        __CLR4_5_21uzy1uzylusyjve1.R.inc(86905);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

    public static class A {

        private byte    id;
        private String name;

        public byte getId() {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86906);
            __CLR4_5_21uzy1uzylusyjve1.R.inc(86907);return id;
        }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

        public void setId(byte id) {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86908);
            __CLR4_5_21uzy1uzylusyjve1.R.inc(86909);this.id = id;
        }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86910);
            __CLR4_5_21uzy1uzylusyjve1.R.inc(86911);return name;
        }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21uzy1uzylusyjve1.R.inc(86912);
            __CLR4_5_21uzy1uzylusyjve1.R.inc(86913);this.name = name;
        }finally{__CLR4_5_21uzy1uzylusyjve1.R.flushNeeded();}}

    }
}
