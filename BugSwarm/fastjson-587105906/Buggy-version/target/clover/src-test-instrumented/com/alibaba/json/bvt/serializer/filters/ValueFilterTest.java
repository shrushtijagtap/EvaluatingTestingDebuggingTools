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

public class ValueFilterTest extends TestCase {static class __CLR4_1_101wmi1wmiluszwfmo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,89017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceStart(getClass().getName(),88938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oiyabn1wmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wmi1wmiluszwfmo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88938,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oiyabn1wmi() throws Exception{try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88938);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88939);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88940);
                __CLR4_1_101wmi1wmiluszwfmo.R.inc(88941);if ((((name.equals("id"))&&(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88942)!=0|true))||(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88943)==0&false))) {{
                    __CLR4_1_101wmi1wmiluszwfmo.R.inc(88944);return "AAA";
                }

                }__CLR4_1_101wmi1wmiluszwfmo.R.inc(88945);return value;
            }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

        };

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88946);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88947);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88948);serializer.getValueFilters().add(filter);

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88949);A a = new A();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88950);serializer.write(a);

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88951);String text = out.toString();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88952);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceStart(getClass().getName(),88953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s73udk1wmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wmi1wmiluszwfmo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_toJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s73udk1wmx() throws Exception{try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88953);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88954);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88955);
                __CLR4_1_101wmi1wmiluszwfmo.R.inc(88956);if ((((name.equals("id"))&&(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88957)!=0|true))||(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88958)==0&false))) {{
                    __CLR4_1_101wmi1wmiluszwfmo.R.inc(88959);return "AAA";
                }

                }__CLR4_1_101wmi1wmiluszwfmo.R.inc(88960);return value;
            }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

        };
        
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88961);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new A(), filter));
    }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceStart(getClass().getName(),88962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1085ccsr1wn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wmi1wmiluszwfmo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88962,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1085ccsr1wn6() throws Exception{try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88962);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88963);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88964);
                __CLR4_1_101wmi1wmiluszwfmo.R.inc(88965);if ((((name.equals("name"))&&(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88966)!=0|true))||(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88967)==0&false))) {{
                    __CLR4_1_101wmi1wmiluszwfmo.R.inc(88968);return "AAA";
                }

                }__CLR4_1_101wmi1wmiluszwfmo.R.inc(88969);return value;
            }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

        };

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88970);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88971);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88972);serializer.getValueFilters().add(filter);

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88973);A a = new A();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88974);serializer.write(a);

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88975);String text = out.toString();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88976);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceStart(getClass().getName(),88977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104wce0a1wnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wmi1wmiluszwfmo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88977,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104wce0a1wnl() throws Exception{try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88977);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88978);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88979);
                __CLR4_1_101wmi1wmiluszwfmo.R.inc(88980);if ((((name.equals("name"))&&(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88981)!=0|true))||(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88982)==0&false))) {{
                    __CLR4_1_101wmi1wmiluszwfmo.R.inc(88983);return "AAA";
                }

                }__CLR4_1_101wmi1wmiluszwfmo.R.inc(88984);return value;
            }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

        };

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88985);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88986);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88987);serializer.getValueFilters().add(filter);

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88988);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88989);map.put("name", null);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88990);serializer.write(map);

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88991);String text = out.toString();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88992);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceStart(getClass().getName(),88993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101ncf7t1wo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wmi1wmiluszwfmo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wmi1wmiluszwfmo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest.test_valuefilter_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88993,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101ncf7t1wo1() throws Exception{try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88993);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(88994);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(88995);
                __CLR4_1_101wmi1wmiluszwfmo.R.inc(88996);if ((((name.equals("name"))&&(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88997)!=0|true))||(__CLR4_1_101wmi1wmiluszwfmo.R.iget(88998)==0&false))) {{
                    __CLR4_1_101wmi1wmiluszwfmo.R.inc(88999);return null;
                }

                }__CLR4_1_101wmi1wmiluszwfmo.R.inc(89000);return value;
            }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

        };

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(89001);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(89002);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(89003);serializer.getValueFilters().add(filter);

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(89004);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(89005);map.put("name", "AA");
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(89006);serializer.write(map);

        __CLR4_1_101wmi1wmiluszwfmo.R.inc(89007);String text = out.toString();
        __CLR4_1_101wmi1wmiluszwfmo.R.inc(89008);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

    public static class Bean {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(89009);
            __CLR4_1_101wmi1wmiluszwfmo.R.inc(89010);return id;
        }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(89011);
            __CLR4_1_101wmi1wmiluszwfmo.R.inc(89012);this.id = id;
        }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(89013);
            __CLR4_1_101wmi1wmiluszwfmo.R.inc(89014);return name;
        }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101wmi1wmiluszwfmo.R.inc(89015);
            __CLR4_1_101wmi1wmiluszwfmo.R.inc(89016);this.name = name;
        }finally{__CLR4_1_101wmi1wmiluszwfmo.R.flushNeeded();}}

    }
}
