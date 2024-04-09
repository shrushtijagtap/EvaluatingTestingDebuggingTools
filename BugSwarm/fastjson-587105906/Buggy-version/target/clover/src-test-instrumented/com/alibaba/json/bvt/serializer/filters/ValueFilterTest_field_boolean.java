/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ValueFilterTest_field_boolean extends TestCase {static class __CLR4_1_101vss1vsslusqklpc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87939,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_1_101vss1vsslusqklpc.R.globalSliceStart(getClass().getName(),87868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oiyabn1vss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vss1vsslusqklpc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vss1vsslusqklpc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87868,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oiyabn1vss() throws Exception{try{__CLR4_1_101vss1vsslusqklpc.R.inc(87868);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87869);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vss1vsslusqklpc.R.inc(87870);
                __CLR4_1_101vss1vsslusqklpc.R.inc(87871);if ((((name.equals("id"))&&(__CLR4_1_101vss1vsslusqklpc.R.iget(87872)!=0|true))||(__CLR4_1_101vss1vsslusqklpc.R.iget(87873)==0&false))) {{
                    __CLR4_1_101vss1vsslusqklpc.R.inc(87874);return "AAA";
                }

                }__CLR4_1_101vss1vsslusqklpc.R.inc(87875);return value;
            }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

        };

        __CLR4_1_101vss1vsslusqklpc.R.inc(87876);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87877);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87878);serializer.getValueFilters().add(filter);

        __CLR4_1_101vss1vsslusqklpc.R.inc(87879);Bean a = new Bean();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87880);serializer.write(a);

        __CLR4_1_101vss1vsslusqklpc.R.inc(87881);String text = out.toString();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87882);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101vss1vsslusqklpc.R.globalSliceStart(getClass().getName(),87883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1vt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vss1vsslusqklpc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vss1vsslusqklpc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87883,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1vt7() throws Exception{try{__CLR4_1_101vss1vsslusqklpc.R.inc(87883);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87884);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vss1vsslusqklpc.R.inc(87885);
                __CLR4_1_101vss1vsslusqklpc.R.inc(87886);if ((((name.equals("id"))&&(__CLR4_1_101vss1vsslusqklpc.R.iget(87887)!=0|true))||(__CLR4_1_101vss1vsslusqklpc.R.iget(87888)==0&false))) {{
                    __CLR4_1_101vss1vsslusqklpc.R.inc(87889);return "AAA";
                }

                }__CLR4_1_101vss1vsslusqklpc.R.inc(87890);return value;
            }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

        };
        
        __CLR4_1_101vss1vsslusqklpc.R.inc(87891);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new Bean(), filter));
    }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_1_101vss1vsslusqklpc.R.globalSliceStart(getClass().getName(),87892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1085ccsr1vtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vss1vsslusqklpc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vss1vsslusqklpc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1085ccsr1vtg() throws Exception{try{__CLR4_1_101vss1vsslusqklpc.R.inc(87892);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87893);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vss1vsslusqklpc.R.inc(87894);
                __CLR4_1_101vss1vsslusqklpc.R.inc(87895);if ((((name.equals("name"))&&(__CLR4_1_101vss1vsslusqklpc.R.iget(87896)!=0|true))||(__CLR4_1_101vss1vsslusqklpc.R.iget(87897)==0&false))) {{
                    __CLR4_1_101vss1vsslusqklpc.R.inc(87898);return "AAA";
                }

                }__CLR4_1_101vss1vsslusqklpc.R.inc(87899);return value;
            }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

        };

        __CLR4_1_101vss1vsslusqklpc.R.inc(87900);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87901);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87902);serializer.getValueFilters().add(filter);

        __CLR4_1_101vss1vsslusqklpc.R.inc(87903);Bean a = new Bean();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87904);serializer.write(a);

        __CLR4_1_101vss1vsslusqklpc.R.inc(87905);String text = out.toString();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87906);Assert.assertEquals("{\"id\":false,\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_1_101vss1vsslusqklpc.R.globalSliceStart(getClass().getName(),87907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104wce0a1vtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vss1vsslusqklpc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vss1vsslusqklpc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87907,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104wce0a1vtv() throws Exception{try{__CLR4_1_101vss1vsslusqklpc.R.inc(87907);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87908);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vss1vsslusqklpc.R.inc(87909);
                __CLR4_1_101vss1vsslusqklpc.R.inc(87910);if ((((name.equals("name"))&&(__CLR4_1_101vss1vsslusqklpc.R.iget(87911)!=0|true))||(__CLR4_1_101vss1vsslusqklpc.R.iget(87912)==0&false))) {{
                    __CLR4_1_101vss1vsslusqklpc.R.inc(87913);return "AAA";
                }

                }__CLR4_1_101vss1vsslusqklpc.R.inc(87914);return value;
            }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

        };

        __CLR4_1_101vss1vsslusqklpc.R.inc(87915);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87916);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87917);serializer.getValueFilters().add(filter);

        __CLR4_1_101vss1vsslusqklpc.R.inc(87918);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87919);map.put("name", null);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87920);serializer.write(map);

        __CLR4_1_101vss1vsslusqklpc.R.inc(87921);String text = out.toString();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87922);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_1_101vss1vsslusqklpc.R.globalSliceStart(getClass().getName(),87923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101ncf7t1vub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vss1vsslusqklpc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vss1vsslusqklpc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87923,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101ncf7t1vub() throws Exception{try{__CLR4_1_101vss1vsslusqklpc.R.inc(87923);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87924);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101vss1vsslusqklpc.R.inc(87925);
                __CLR4_1_101vss1vsslusqklpc.R.inc(87926);if ((((name.equals("name"))&&(__CLR4_1_101vss1vsslusqklpc.R.iget(87927)!=0|true))||(__CLR4_1_101vss1vsslusqklpc.R.iget(87928)==0&false))) {{
                    __CLR4_1_101vss1vsslusqklpc.R.inc(87929);return null;
                }

                }__CLR4_1_101vss1vsslusqklpc.R.inc(87930);return value;
            }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

        };

        __CLR4_1_101vss1vsslusqklpc.R.inc(87931);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87932);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vss1vsslusqklpc.R.inc(87933);serializer.getValueFilters().add(filter);

        __CLR4_1_101vss1vsslusqklpc.R.inc(87934);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87935);map.put("name", "AA");
        __CLR4_1_101vss1vsslusqklpc.R.inc(87936);serializer.write(map);

        __CLR4_1_101vss1vsslusqklpc.R.inc(87937);String text = out.toString();
        __CLR4_1_101vss1vsslusqklpc.R.inc(87938);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101vss1vsslusqklpc.R.flushNeeded();}}

    public static class Bean {

        public boolean    id;
        public String name;


    }
}
