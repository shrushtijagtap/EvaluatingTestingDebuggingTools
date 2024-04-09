/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilterTest extends TestCase {static class __CLR4_5_21vtd1vtdlusvngxs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,87977,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceStart(getClass().getName(),87889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21vtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vtd1vtdlusvngxs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21vtd() throws Exception{try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87889);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87890);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87891);
                __CLR4_5_21vtd1vtdlusvngxs.R.inc(87892);return false;
            }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}
        };

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87893);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87894);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87895);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87896);A a = new A();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87897);serializer.write(a);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87898);String text = out.toString();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87899);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceStart(getClass().getName(),87900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1vto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vtd1vtdlusvngxs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1vto() throws Exception{try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87900);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87901);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87902);
                __CLR4_5_21vtd1vtdlusvngxs.R.inc(87903);return false;
            }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}
        };

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87904);Assert.assertEquals("{}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceStart(getClass().getName(),87905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1vtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vtd1vtdlusvngxs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1vtt() throws Exception{try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87905);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87906);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87907);
                __CLR4_5_21vtd1vtdlusvngxs.R.inc(87908);if (((("id".equals(name))&&(__CLR4_5_21vtd1vtdlusvngxs.R.iget(87909)!=0|true))||(__CLR4_5_21vtd1vtdlusvngxs.R.iget(87910)==0&false))) {{
                    __CLR4_5_21vtd1vtdlusvngxs.R.inc(87911);return true;
                }
                }__CLR4_5_21vtd1vtdlusvngxs.R.inc(87912);return false;
            }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}
        };

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87913);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87914);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87915);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87916);A a = new A();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87917);serializer.write(a);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87918);String text = out.toString();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87919);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceStart(getClass().getName(),87920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441vu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vtd1vtdlusvngxs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441vu8() throws Exception{try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87920);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87921);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87922);
                __CLR4_5_21vtd1vtdlusvngxs.R.inc(87923);if (((("name".equals(name))&&(__CLR4_5_21vtd1vtdlusvngxs.R.iget(87924)!=0|true))||(__CLR4_5_21vtd1vtdlusvngxs.R.iget(87925)==0&false))) {{
                    __CLR4_5_21vtd1vtdlusvngxs.R.inc(87926);return true;
                }
                }__CLR4_5_21vtd1vtdlusvngxs.R.inc(87927);return false;
            }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}
        };

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87928);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87929);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87930);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87931);A a = new A();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87932);a.setName("chennp2008");
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87933);serializer.write(a);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87934);String text = out.toString();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87935);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceStart(getClass().getName(),87936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1vuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vtd1vtdlusvngxs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1vuo() throws Exception{try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87936);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87937);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87938);
                __CLR4_5_21vtd1vtdlusvngxs.R.inc(87939);if (((("name".equals(name))&&(__CLR4_5_21vtd1vtdlusvngxs.R.iget(87940)!=0|true))||(__CLR4_5_21vtd1vtdlusvngxs.R.iget(87941)==0&false))) {{
                    __CLR4_5_21vtd1vtdlusvngxs.R.inc(87942);return true;
                }
                }__CLR4_5_21vtd1vtdlusvngxs.R.inc(87943);return false;
            }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}
        };

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87944);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87945);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87946);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87947);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87948);map.put("name", "chennp2008");
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87949);serializer.write(map);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87950);String text = out.toString();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87951);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceStart(getClass().getName(),87952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61vv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vtd1vtdlusvngxs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vtd1vtdlusvngxs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61vv4() throws Exception{try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87952);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87953);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87954);
                __CLR4_5_21vtd1vtdlusvngxs.R.inc(87955);if (((("name".equals(name))&&(__CLR4_5_21vtd1vtdlusvngxs.R.iget(87956)!=0|true))||(__CLR4_5_21vtd1vtdlusvngxs.R.iget(87957)==0&false))) {{
                    __CLR4_5_21vtd1vtdlusvngxs.R.inc(87958);return false;
                }
                }__CLR4_5_21vtd1vtdlusvngxs.R.inc(87959);return true;
            }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}
        };

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87960);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87961);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87962);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87963);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87964);map.put("id", 3);
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87965);map.put("name", "chennp2008");
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87966);serializer.write(map);

        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87967);String text = out.toString();
        __CLR4_5_21vtd1vtdlusvngxs.R.inc(87968);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

    public static class A {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87969);
            __CLR4_5_21vtd1vtdlusvngxs.R.inc(87970);return id;
        }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87971);
            __CLR4_5_21vtd1vtdlusvngxs.R.inc(87972);this.id = id;
        }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87973);
            __CLR4_5_21vtd1vtdlusvngxs.R.inc(87974);return name;
        }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21vtd1vtdlusvngxs.R.inc(87975);
            __CLR4_5_21vtd1vtdlusvngxs.R.inc(87976);this.name = name;
        }finally{__CLR4_5_21vtd1vtdlusvngxs.R.flushNeeded();}}

    }
}
