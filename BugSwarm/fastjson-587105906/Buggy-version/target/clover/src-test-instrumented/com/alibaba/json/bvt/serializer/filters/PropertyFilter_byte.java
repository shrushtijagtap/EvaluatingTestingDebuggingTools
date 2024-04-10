/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_byte extends TestCase {static class __CLR4_1_101vyh1vyhluszwfke{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88157,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101vyh1vyhluszwfke.R.globalSliceStart(getClass().getName(),88073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21vyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vyh1vyhluszwfke.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vyh1vyhluszwfke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88073,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21vyh() throws Exception{try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88073);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88074);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88075);
                __CLR4_1_101vyh1vyhluszwfke.R.inc(88076);return false;
            }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}
        };

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88077);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88078);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88079);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88080);A a = new A();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88081);serializer.write(a);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88082);String text = out.toString();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88083);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101vyh1vyhluszwfke.R.globalSliceStart(getClass().getName(),88084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1vys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vyh1vyhluszwfke.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vyh1vyhluszwfke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1vys() throws Exception{try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88084);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88085);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88086);
                __CLR4_1_101vyh1vyhluszwfke.R.inc(88087);if (((("id".equals(name))&&(__CLR4_1_101vyh1vyhluszwfke.R.iget(88088)!=0|true))||(__CLR4_1_101vyh1vyhluszwfke.R.iget(88089)==0&false))) {{
                    __CLR4_1_101vyh1vyhluszwfke.R.inc(88090);Assert.assertTrue(value instanceof Byte);
                    __CLR4_1_101vyh1vyhluszwfke.R.inc(88091);return true;
                }
                }__CLR4_1_101vyh1vyhluszwfke.R.inc(88092);return false;
            }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}
        };

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88093);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88094);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88095);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88096);A a = new A();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88097);serializer.write(a);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88098);String text = out.toString();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88099);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101vyh1vyhluszwfke.R.globalSliceStart(getClass().getName(),88100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441vz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vyh1vyhluszwfke.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vyh1vyhluszwfke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88100,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441vz8() throws Exception{try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88100);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88101);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88102);
                __CLR4_1_101vyh1vyhluszwfke.R.inc(88103);if (((("name".equals(name))&&(__CLR4_1_101vyh1vyhluszwfke.R.iget(88104)!=0|true))||(__CLR4_1_101vyh1vyhluszwfke.R.iget(88105)==0&false))) {{
                    __CLR4_1_101vyh1vyhluszwfke.R.inc(88106);return true;
                }
                }__CLR4_1_101vyh1vyhluszwfke.R.inc(88107);return false;
            }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}
        };

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88108);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88109);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88110);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88111);A a = new A();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88112);a.setName("chennp2008");
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88113);serializer.write(a);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88114);String text = out.toString();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88115);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101vyh1vyhluszwfke.R.globalSliceStart(getClass().getName(),88116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1vzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vyh1vyhluszwfke.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vyh1vyhluszwfke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88116,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1vzo() throws Exception{try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88116);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88117);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88118);
                __CLR4_1_101vyh1vyhluszwfke.R.inc(88119);if (((("name".equals(name))&&(__CLR4_1_101vyh1vyhluszwfke.R.iget(88120)!=0|true))||(__CLR4_1_101vyh1vyhluszwfke.R.iget(88121)==0&false))) {{
                    __CLR4_1_101vyh1vyhluszwfke.R.inc(88122);return true;
                }
                }__CLR4_1_101vyh1vyhluszwfke.R.inc(88123);return false;
            }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}
        };

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88124);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88125);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88126);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88127);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88128);map.put("name", "chennp2008");
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88129);serializer.write(map);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88130);String text = out.toString();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88131);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101vyh1vyhluszwfke.R.globalSliceStart(getClass().getName(),88132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61w04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vyh1vyhluszwfke.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vyh1vyhluszwfke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88132,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61w04() throws Exception{try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88132);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88133);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88134);
                __CLR4_1_101vyh1vyhluszwfke.R.inc(88135);if (((("name".equals(name))&&(__CLR4_1_101vyh1vyhluszwfke.R.iget(88136)!=0|true))||(__CLR4_1_101vyh1vyhluszwfke.R.iget(88137)==0&false))) {{
                    __CLR4_1_101vyh1vyhluszwfke.R.inc(88138);return false;
                }
                }__CLR4_1_101vyh1vyhluszwfke.R.inc(88139);return true;
            }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}
        };

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88140);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88141);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88142);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88143);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88144);map.put("id", 3);
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88145);map.put("name", "chennp2008");
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88146);serializer.write(map);

        __CLR4_1_101vyh1vyhluszwfke.R.inc(88147);String text = out.toString();
        __CLR4_1_101vyh1vyhluszwfke.R.inc(88148);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

    public static class A {

        private byte    id;
        private String name;

        public byte getId() {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88149);
            __CLR4_1_101vyh1vyhluszwfke.R.inc(88150);return id;
        }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

        public void setId(byte id) {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88151);
            __CLR4_1_101vyh1vyhluszwfke.R.inc(88152);this.id = id;
        }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88153);
            __CLR4_1_101vyh1vyhluszwfke.R.inc(88154);return name;
        }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101vyh1vyhluszwfke.R.inc(88155);
            __CLR4_1_101vyh1vyhluszwfke.R.inc(88156);this.name = name;
        }finally{__CLR4_1_101vyh1vyhluszwfke.R.flushNeeded();}}

    }
}
