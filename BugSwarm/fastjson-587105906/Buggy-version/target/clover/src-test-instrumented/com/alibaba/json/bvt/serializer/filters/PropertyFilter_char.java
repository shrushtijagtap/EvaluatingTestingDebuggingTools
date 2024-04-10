/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_char extends TestCase {static class __CLR4_1_101w0t1w0tluszwfkm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceStart(getClass().getName(),88157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21w0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w0t1w0tluszwfkm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88157,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21w0t() throws Exception{try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88157);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88158);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88159);
                __CLR4_1_101w0t1w0tluszwfkm.R.inc(88160);return false;
            }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}
        };

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88161);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88162);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88163);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88164);A a = new A();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88165);serializer.write(a);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88166);String text = out.toString();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88167);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceStart(getClass().getName(),88168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1w14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w0t1w0tluszwfkm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88168,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1w14() throws Exception{try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88168);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88169);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88170);
                __CLR4_1_101w0t1w0tluszwfkm.R.inc(88171);if (((("id".equals(name))&&(__CLR4_1_101w0t1w0tluszwfkm.R.iget(88172)!=0|true))||(__CLR4_1_101w0t1w0tluszwfkm.R.iget(88173)==0&false))) {{
                    __CLR4_1_101w0t1w0tluszwfkm.R.inc(88174);Assert.assertTrue(value instanceof Character);
                    __CLR4_1_101w0t1w0tluszwfkm.R.inc(88175);return true;
                }
                }__CLR4_1_101w0t1w0tluszwfkm.R.inc(88176);return false;
            }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}
        };

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88177);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88178);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88179);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88180);A a = new A();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88181);serializer.write(a);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88182);String text = out.toString();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88183);Assert.assertEquals("{\"id\":\"0\"}", text);
    }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceStart(getClass().getName(),88184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441w1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w0t1w0tluszwfkm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88184,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441w1k() throws Exception{try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88184);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88185);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88186);
                __CLR4_1_101w0t1w0tluszwfkm.R.inc(88187);if (((("name".equals(name))&&(__CLR4_1_101w0t1w0tluszwfkm.R.iget(88188)!=0|true))||(__CLR4_1_101w0t1w0tluszwfkm.R.iget(88189)==0&false))) {{
                    __CLR4_1_101w0t1w0tluszwfkm.R.inc(88190);return true;
                }
                }__CLR4_1_101w0t1w0tluszwfkm.R.inc(88191);return false;
            }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}
        };

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88192);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88193);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88194);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88195);A a = new A();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88196);a.setName("chennp2008");
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88197);serializer.write(a);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88198);String text = out.toString();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88199);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceStart(getClass().getName(),88200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1w20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w0t1w0tluszwfkm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88200,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1w20() throws Exception{try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88200);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88201);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88202);
                __CLR4_1_101w0t1w0tluszwfkm.R.inc(88203);if (((("name".equals(name))&&(__CLR4_1_101w0t1w0tluszwfkm.R.iget(88204)!=0|true))||(__CLR4_1_101w0t1w0tluszwfkm.R.iget(88205)==0&false))) {{
                    __CLR4_1_101w0t1w0tluszwfkm.R.inc(88206);return true;
                }
                }__CLR4_1_101w0t1w0tluszwfkm.R.inc(88207);return false;
            }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}
        };

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88208);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88209);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88210);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88211);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88212);map.put("name", "chennp2008");
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88213);serializer.write(map);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88214);String text = out.toString();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88215);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceStart(getClass().getName(),88216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61w2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w0t1w0tluszwfkm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w0t1w0tluszwfkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88216,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61w2g() throws Exception{try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88216);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88217);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88218);
                __CLR4_1_101w0t1w0tluszwfkm.R.inc(88219);if (((("name".equals(name))&&(__CLR4_1_101w0t1w0tluszwfkm.R.iget(88220)!=0|true))||(__CLR4_1_101w0t1w0tluszwfkm.R.iget(88221)==0&false))) {{
                    __CLR4_1_101w0t1w0tluszwfkm.R.inc(88222);return false;
                }
                }__CLR4_1_101w0t1w0tluszwfkm.R.inc(88223);return true;
            }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}
        };

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88224);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88225);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88226);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88227);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88228);map.put("id", (char) '3');
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88229);map.put("name", "chennp2008");
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88230);serializer.write(map);

        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88231);String text = out.toString();
        __CLR4_1_101w0t1w0tluszwfkm.R.inc(88232);Assert.assertEquals("{\"id\":\"3\"}", text);
    }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

    public static class A {

        private char   id = '0';
        private String name;

        public char getId() {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88233);
            __CLR4_1_101w0t1w0tluszwfkm.R.inc(88234);return id;
        }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

        public void setId(char id) {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88235);
            __CLR4_1_101w0t1w0tluszwfkm.R.inc(88236);this.id = id;
        }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88237);
            __CLR4_1_101w0t1w0tluszwfkm.R.inc(88238);return name;
        }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101w0t1w0tluszwfkm.R.inc(88239);
            __CLR4_1_101w0t1w0tluszwfkm.R.inc(88240);this.name = name;
        }finally{__CLR4_1_101w0t1w0tluszwfkm.R.flushNeeded();}}

    }
}
