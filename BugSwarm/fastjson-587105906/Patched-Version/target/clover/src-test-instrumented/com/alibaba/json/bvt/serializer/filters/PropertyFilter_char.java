/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_char extends TestCase {static class __CLR4_5_21w0i1w0ilusvnh0s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,88230,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceStart(getClass().getName(),88146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21w0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w0i1w0ilusvnh0s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21w0i() throws Exception{try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88146);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88147);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88148);
                __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88149);return false;
            }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}
        };

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88150);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88151);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88152);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88153);A a = new A();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88154);serializer.write(a);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88155);String text = out.toString();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88156);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceStart(getClass().getName(),88157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1w0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w0i1w0ilusvnh0s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1w0t() throws Exception{try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88157);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88158);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88159);
                __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88160);if (((("id".equals(name))&&(__CLR4_5_21w0i1w0ilusvnh0s.R.iget(88161)!=0|true))||(__CLR4_5_21w0i1w0ilusvnh0s.R.iget(88162)==0&false))) {{
                    __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88163);Assert.assertTrue(value instanceof Character);
                    __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88164);return true;
                }
                }__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88165);return false;
            }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}
        };

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88166);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88167);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88168);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88169);A a = new A();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88170);serializer.write(a);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88171);String text = out.toString();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88172);Assert.assertEquals("{\"id\":\"0\"}", text);
    }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceStart(getClass().getName(),88173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441w19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w0i1w0ilusvnh0s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441w19() throws Exception{try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88173);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88174);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88175);
                __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88176);if (((("name".equals(name))&&(__CLR4_5_21w0i1w0ilusvnh0s.R.iget(88177)!=0|true))||(__CLR4_5_21w0i1w0ilusvnh0s.R.iget(88178)==0&false))) {{
                    __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88179);return true;
                }
                }__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88180);return false;
            }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}
        };

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88181);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88182);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88183);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88184);A a = new A();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88185);a.setName("chennp2008");
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88186);serializer.write(a);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88187);String text = out.toString();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88188);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceStart(getClass().getName(),88189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1w1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w0i1w0ilusvnh0s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1w1p() throws Exception{try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88189);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88190);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88191);
                __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88192);if (((("name".equals(name))&&(__CLR4_5_21w0i1w0ilusvnh0s.R.iget(88193)!=0|true))||(__CLR4_5_21w0i1w0ilusvnh0s.R.iget(88194)==0&false))) {{
                    __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88195);return true;
                }
                }__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88196);return false;
            }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}
        };

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88197);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88198);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88199);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88200);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88201);map.put("name", "chennp2008");
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88202);serializer.write(map);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88203);String text = out.toString();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88204);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceStart(getClass().getName(),88205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61w25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w0i1w0ilusvnh0s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w0i1w0ilusvnh0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61w25() throws Exception{try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88205);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88206);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88207);
                __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88208);if (((("name".equals(name))&&(__CLR4_5_21w0i1w0ilusvnh0s.R.iget(88209)!=0|true))||(__CLR4_5_21w0i1w0ilusvnh0s.R.iget(88210)==0&false))) {{
                    __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88211);return false;
                }
                }__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88212);return true;
            }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}
        };

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88213);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88214);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88215);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88216);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88217);map.put("id", (char) '3');
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88218);map.put("name", "chennp2008");
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88219);serializer.write(map);

        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88220);String text = out.toString();
        __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88221);Assert.assertEquals("{\"id\":\"3\"}", text);
    }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

    public static class A {

        private char   id = '0';
        private String name;

        public char getId() {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88222);
            __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88223);return id;
        }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

        public void setId(char id) {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88224);
            __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88225);this.id = id;
        }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88226);
            __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88227);return name;
        }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21w0i1w0ilusvnh0s.R.inc(88228);
            __CLR4_5_21w0i1w0ilusvnh0s.R.inc(88229);this.name = name;
        }finally{__CLR4_5_21w0i1w0ilusvnh0s.R.flushNeeded();}}

    }
}
