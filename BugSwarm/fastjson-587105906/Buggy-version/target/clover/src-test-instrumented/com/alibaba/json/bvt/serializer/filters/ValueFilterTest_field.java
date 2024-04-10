/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.json.bvt.serializer.filters.PropertyFilterTest.A;

public class ValueFilterTest_field extends TestCase {static class __CLR4_1_101wp11wp1luszwfn7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,89100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_1_101wp11wp1luszwfn7.R.globalSliceStart(getClass().getName(),89029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oiyabn1wp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wp11wp1luszwfn7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wp11wp1luszwfn7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89029,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oiyabn1wp1() throws Exception{try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89029);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89030);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89031);
                __CLR4_1_101wp11wp1luszwfn7.R.inc(89032);if ((((name.equals("id"))&&(__CLR4_1_101wp11wp1luszwfn7.R.iget(89033)!=0|true))||(__CLR4_1_101wp11wp1luszwfn7.R.iget(89034)==0&false))) {{
                    __CLR4_1_101wp11wp1luszwfn7.R.inc(89035);return "AAA";
                }

                }__CLR4_1_101wp11wp1luszwfn7.R.inc(89036);return value;
            }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

        };

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89037);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89038);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89039);serializer.getValueFilters().add(filter);

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89040);A a = new A();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89041);serializer.write(a);

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89042);String text = out.toString();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89043);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101wp11wp1luszwfn7.R.globalSliceStart(getClass().getName(),89044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1wpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wp11wp1luszwfn7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wp11wp1luszwfn7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89044,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1wpg() throws Exception{try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89044);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89045);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89046);
                __CLR4_1_101wp11wp1luszwfn7.R.inc(89047);if ((((name.equals("id"))&&(__CLR4_1_101wp11wp1luszwfn7.R.iget(89048)!=0|true))||(__CLR4_1_101wp11wp1luszwfn7.R.iget(89049)==0&false))) {{
                    __CLR4_1_101wp11wp1luszwfn7.R.inc(89050);return "AAA";
                }

                }__CLR4_1_101wp11wp1luszwfn7.R.inc(89051);return value;
            }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

        };
        
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89052);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_1_101wp11wp1luszwfn7.R.globalSliceStart(getClass().getName(),89053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1085ccsr1wpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wp11wp1luszwfn7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wp11wp1luszwfn7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89053,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1085ccsr1wpp() throws Exception{try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89053);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89054);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89055);
                __CLR4_1_101wp11wp1luszwfn7.R.inc(89056);if ((((name.equals("name"))&&(__CLR4_1_101wp11wp1luszwfn7.R.iget(89057)!=0|true))||(__CLR4_1_101wp11wp1luszwfn7.R.iget(89058)==0&false))) {{
                    __CLR4_1_101wp11wp1luszwfn7.R.inc(89059);return "AAA";
                }

                }__CLR4_1_101wp11wp1luszwfn7.R.inc(89060);return value;
            }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

        };

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89061);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89062);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89063);serializer.getValueFilters().add(filter);

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89064);A a = new A();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89065);serializer.write(a);

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89066);String text = out.toString();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89067);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_1_101wp11wp1luszwfn7.R.globalSliceStart(getClass().getName(),89068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104wce0a1wq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wp11wp1luszwfn7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wp11wp1luszwfn7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89068,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104wce0a1wq4() throws Exception{try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89068);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89069);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89070);
                __CLR4_1_101wp11wp1luszwfn7.R.inc(89071);if ((((name.equals("name"))&&(__CLR4_1_101wp11wp1luszwfn7.R.iget(89072)!=0|true))||(__CLR4_1_101wp11wp1luszwfn7.R.iget(89073)==0&false))) {{
                    __CLR4_1_101wp11wp1luszwfn7.R.inc(89074);return "AAA";
                }

                }__CLR4_1_101wp11wp1luszwfn7.R.inc(89075);return value;
            }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

        };

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89076);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89077);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89078);serializer.getValueFilters().add(filter);

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89079);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89080);map.put("name", null);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89081);serializer.write(map);

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89082);String text = out.toString();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89083);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_1_101wp11wp1luszwfn7.R.globalSliceStart(getClass().getName(),89084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101ncf7t1wqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wp11wp1luszwfn7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wp11wp1luszwfn7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field.test_valuefilter_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101ncf7t1wqk() throws Exception{try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89084);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89085);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wp11wp1luszwfn7.R.inc(89086);
                __CLR4_1_101wp11wp1luszwfn7.R.inc(89087);if ((((name.equals("name"))&&(__CLR4_1_101wp11wp1luszwfn7.R.iget(89088)!=0|true))||(__CLR4_1_101wp11wp1luszwfn7.R.iget(89089)==0&false))) {{
                    __CLR4_1_101wp11wp1luszwfn7.R.inc(89090);return null;
                }

                }__CLR4_1_101wp11wp1luszwfn7.R.inc(89091);return value;
            }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

        };

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89092);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89093);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89094);serializer.getValueFilters().add(filter);

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89095);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89096);map.put("name", "AA");
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89097);serializer.write(map);

        __CLR4_1_101wp11wp1luszwfn7.R.inc(89098);String text = out.toString();
        __CLR4_1_101wp11wp1luszwfn7.R.inc(89099);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101wp11wp1luszwfn7.R.flushNeeded();}}

    public static class Bean {

        public int    id;
        public String name;


    }
}
