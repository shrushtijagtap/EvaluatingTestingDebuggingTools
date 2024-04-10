/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilterTest extends TestCase {static class __CLR4_1_101vto1vtoluszwfjw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,87988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101vto1vtoluszwfjw.R.globalSliceStart(getClass().getName(),87900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21vto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vto1vtoluszwfjw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vto1vtoluszwfjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87900,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21vto() throws Exception{try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87900);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87901);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87902);
                __CLR4_1_101vto1vtoluszwfjw.R.inc(87903);return false;
            }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}
        };

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87904);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87905);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87906);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87907);A a = new A();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87908);serializer.write(a);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87909);String text = out.toString();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87910);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101vto1vtoluszwfjw.R.globalSliceStart(getClass().getName(),87911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1vtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vto1vtoluszwfjw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vto1vtoluszwfjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1vtz() throws Exception{try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87911);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87912);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87913);
                __CLR4_1_101vto1vtoluszwfjw.R.inc(87914);return false;
            }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}
        };

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87915);Assert.assertEquals("{}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101vto1vtoluszwfjw.R.globalSliceStart(getClass().getName(),87916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1vu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vto1vtoluszwfjw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vto1vtoluszwfjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87916,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1vu4() throws Exception{try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87916);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87917);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87918);
                __CLR4_1_101vto1vtoluszwfjw.R.inc(87919);if (((("id".equals(name))&&(__CLR4_1_101vto1vtoluszwfjw.R.iget(87920)!=0|true))||(__CLR4_1_101vto1vtoluszwfjw.R.iget(87921)==0&false))) {{
                    __CLR4_1_101vto1vtoluszwfjw.R.inc(87922);return true;
                }
                }__CLR4_1_101vto1vtoluszwfjw.R.inc(87923);return false;
            }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}
        };

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87924);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87925);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87926);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87927);A a = new A();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87928);serializer.write(a);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87929);String text = out.toString();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87930);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101vto1vtoluszwfjw.R.globalSliceStart(getClass().getName(),87931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441vuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vto1vtoluszwfjw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vto1vtoluszwfjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87931,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441vuj() throws Exception{try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87931);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87932);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87933);
                __CLR4_1_101vto1vtoluszwfjw.R.inc(87934);if (((("name".equals(name))&&(__CLR4_1_101vto1vtoluszwfjw.R.iget(87935)!=0|true))||(__CLR4_1_101vto1vtoluszwfjw.R.iget(87936)==0&false))) {{
                    __CLR4_1_101vto1vtoluszwfjw.R.inc(87937);return true;
                }
                }__CLR4_1_101vto1vtoluszwfjw.R.inc(87938);return false;
            }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}
        };

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87939);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87940);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87941);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87942);A a = new A();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87943);a.setName("chennp2008");
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87944);serializer.write(a);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87945);String text = out.toString();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87946);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101vto1vtoluszwfjw.R.globalSliceStart(getClass().getName(),87947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1vuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vto1vtoluszwfjw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vto1vtoluszwfjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87947,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1vuz() throws Exception{try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87947);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87948);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87949);
                __CLR4_1_101vto1vtoluszwfjw.R.inc(87950);if (((("name".equals(name))&&(__CLR4_1_101vto1vtoluszwfjw.R.iget(87951)!=0|true))||(__CLR4_1_101vto1vtoluszwfjw.R.iget(87952)==0&false))) {{
                    __CLR4_1_101vto1vtoluszwfjw.R.inc(87953);return true;
                }
                }__CLR4_1_101vto1vtoluszwfjw.R.inc(87954);return false;
            }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}
        };

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87955);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87956);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87957);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87958);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87959);map.put("name", "chennp2008");
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87960);serializer.write(map);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87961);String text = out.toString();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87962);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101vto1vtoluszwfjw.R.globalSliceStart(getClass().getName(),87963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61vvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vto1vtoluszwfjw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vto1vtoluszwfjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87963,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61vvf() throws Exception{try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87963);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87964);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87965);
                __CLR4_1_101vto1vtoluszwfjw.R.inc(87966);if (((("name".equals(name))&&(__CLR4_1_101vto1vtoluszwfjw.R.iget(87967)!=0|true))||(__CLR4_1_101vto1vtoluszwfjw.R.iget(87968)==0&false))) {{
                    __CLR4_1_101vto1vtoluszwfjw.R.inc(87969);return false;
                }
                }__CLR4_1_101vto1vtoluszwfjw.R.inc(87970);return true;
            }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}
        };

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87971);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87972);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87973);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87974);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87975);map.put("id", 3);
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87976);map.put("name", "chennp2008");
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87977);serializer.write(map);

        __CLR4_1_101vto1vtoluszwfjw.R.inc(87978);String text = out.toString();
        __CLR4_1_101vto1vtoluszwfjw.R.inc(87979);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

    public static class A {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87980);
            __CLR4_1_101vto1vtoluszwfjw.R.inc(87981);return id;
        }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87982);
            __CLR4_1_101vto1vtoluszwfjw.R.inc(87983);this.id = id;
        }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87984);
            __CLR4_1_101vto1vtoluszwfjw.R.inc(87985);return name;
        }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101vto1vtoluszwfjw.R.inc(87986);
            __CLR4_1_101vto1vtoluszwfjw.R.inc(87987);this.name = name;
        }finally{__CLR4_1_101vto1vtoluszwfjw.R.flushNeeded();}}

    }
}
