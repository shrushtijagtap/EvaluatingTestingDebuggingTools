/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ValueFilterTest_field_boolean extends TestCase {static class __CLR4_5_21vsh1vshlusyjvg4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceStart(getClass().getName(),87857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oiyabn1vsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vsh1vshlusyjvg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oiyabn1vsh() throws Exception{try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87857);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87858);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87859);
                __CLR4_5_21vsh1vshlusyjvg4.R.inc(87860);if ((((name.equals("id"))&&(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87861)!=0|true))||(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87862)==0&false))) {{
                    __CLR4_5_21vsh1vshlusyjvg4.R.inc(87863);return "AAA";
                }

                }__CLR4_5_21vsh1vshlusyjvg4.R.inc(87864);return value;
            }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

        };

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87865);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87866);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87867);serializer.getValueFilters().add(filter);

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87868);Bean a = new Bean();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87869);serializer.write(a);

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87870);String text = out.toString();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87871);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceStart(getClass().getName(),87872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1vsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vsh1vshlusyjvg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1vsw() throws Exception{try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87872);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87873);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87874);
                __CLR4_5_21vsh1vshlusyjvg4.R.inc(87875);if ((((name.equals("id"))&&(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87876)!=0|true))||(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87877)==0&false))) {{
                    __CLR4_5_21vsh1vshlusyjvg4.R.inc(87878);return "AAA";
                }

                }__CLR4_5_21vsh1vshlusyjvg4.R.inc(87879);return value;
            }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

        };
        
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87880);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new Bean(), filter));
    }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceStart(getClass().getName(),87881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285ccsr1vt5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vsh1vshlusyjvg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285ccsr1vt5() throws Exception{try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87881);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87882);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87883);
                __CLR4_5_21vsh1vshlusyjvg4.R.inc(87884);if ((((name.equals("name"))&&(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87885)!=0|true))||(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87886)==0&false))) {{
                    __CLR4_5_21vsh1vshlusyjvg4.R.inc(87887);return "AAA";
                }

                }__CLR4_5_21vsh1vshlusyjvg4.R.inc(87888);return value;
            }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

        };

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87889);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87890);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87891);serializer.getValueFilters().add(filter);

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87892);Bean a = new Bean();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87893);serializer.write(a);

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87894);String text = out.toString();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87895);Assert.assertEquals("{\"id\":false,\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceStart(getClass().getName(),87896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wce0a1vtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vsh1vshlusyjvg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wce0a1vtk() throws Exception{try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87896);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87897);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87898);
                __CLR4_5_21vsh1vshlusyjvg4.R.inc(87899);if ((((name.equals("name"))&&(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87900)!=0|true))||(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87901)==0&false))) {{
                    __CLR4_5_21vsh1vshlusyjvg4.R.inc(87902);return "AAA";
                }

                }__CLR4_5_21vsh1vshlusyjvg4.R.inc(87903);return value;
            }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

        };

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87904);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87905);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87906);serializer.getValueFilters().add(filter);

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87907);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87908);map.put("name", null);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87909);serializer.write(map);

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87910);String text = out.toString();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87911);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceStart(getClass().getName(),87912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ncf7t1vu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vsh1vshlusyjvg4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vsh1vshlusyjvg4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_boolean.test_valuefilter_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87912,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ncf7t1vu0() throws Exception{try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87912);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87913);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vsh1vshlusyjvg4.R.inc(87914);
                __CLR4_5_21vsh1vshlusyjvg4.R.inc(87915);if ((((name.equals("name"))&&(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87916)!=0|true))||(__CLR4_5_21vsh1vshlusyjvg4.R.iget(87917)==0&false))) {{
                    __CLR4_5_21vsh1vshlusyjvg4.R.inc(87918);return null;
                }

                }__CLR4_5_21vsh1vshlusyjvg4.R.inc(87919);return value;
            }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

        };

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87920);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87921);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87922);serializer.getValueFilters().add(filter);

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87923);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87924);map.put("name", "AA");
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87925);serializer.write(map);

        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87926);String text = out.toString();
        __CLR4_5_21vsh1vshlusyjvg4.R.inc(87927);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vsh1vshlusyjvg4.R.flushNeeded();}}

    public static class Bean {

        public boolean    id;
        public String name;


    }
}
