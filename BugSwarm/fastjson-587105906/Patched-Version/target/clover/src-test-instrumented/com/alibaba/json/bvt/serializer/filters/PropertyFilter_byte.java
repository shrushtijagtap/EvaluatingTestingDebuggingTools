/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_byte extends TestCase {static class __CLR4_5_21vy61vy6lusvnh0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,88146,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceStart(getClass().getName(),88062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21vy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vy61vy6lusvnh0h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21vy6() throws Exception{try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88062);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88063);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88064);
                __CLR4_5_21vy61vy6lusvnh0h.R.inc(88065);return false;
            }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}
        };

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88066);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88067);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88068);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88069);A a = new A();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88070);serializer.write(a);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88071);String text = out.toString();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88072);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceStart(getClass().getName(),88073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1vyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vy61vy6lusvnh0h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1vyh() throws Exception{try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88073);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88074);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88075);
                __CLR4_5_21vy61vy6lusvnh0h.R.inc(88076);if (((("id".equals(name))&&(__CLR4_5_21vy61vy6lusvnh0h.R.iget(88077)!=0|true))||(__CLR4_5_21vy61vy6lusvnh0h.R.iget(88078)==0&false))) {{
                    __CLR4_5_21vy61vy6lusvnh0h.R.inc(88079);Assert.assertTrue(value instanceof Byte);
                    __CLR4_5_21vy61vy6lusvnh0h.R.inc(88080);return true;
                }
                }__CLR4_5_21vy61vy6lusvnh0h.R.inc(88081);return false;
            }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}
        };

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88082);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88083);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88084);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88085);A a = new A();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88086);serializer.write(a);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88087);String text = out.toString();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88088);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceStart(getClass().getName(),88089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441vyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vy61vy6lusvnh0h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441vyx() throws Exception{try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88089);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88090);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88091);
                __CLR4_5_21vy61vy6lusvnh0h.R.inc(88092);if (((("name".equals(name))&&(__CLR4_5_21vy61vy6lusvnh0h.R.iget(88093)!=0|true))||(__CLR4_5_21vy61vy6lusvnh0h.R.iget(88094)==0&false))) {{
                    __CLR4_5_21vy61vy6lusvnh0h.R.inc(88095);return true;
                }
                }__CLR4_5_21vy61vy6lusvnh0h.R.inc(88096);return false;
            }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}
        };

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88097);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88098);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88099);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88100);A a = new A();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88101);a.setName("chennp2008");
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88102);serializer.write(a);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88103);String text = out.toString();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88104);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceStart(getClass().getName(),88105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1vzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vy61vy6lusvnh0h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1vzd() throws Exception{try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88105);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88106);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88107);
                __CLR4_5_21vy61vy6lusvnh0h.R.inc(88108);if (((("name".equals(name))&&(__CLR4_5_21vy61vy6lusvnh0h.R.iget(88109)!=0|true))||(__CLR4_5_21vy61vy6lusvnh0h.R.iget(88110)==0&false))) {{
                    __CLR4_5_21vy61vy6lusvnh0h.R.inc(88111);return true;
                }
                }__CLR4_5_21vy61vy6lusvnh0h.R.inc(88112);return false;
            }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}
        };

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88113);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88114);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88115);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88116);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88117);map.put("name", "chennp2008");
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88118);serializer.write(map);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88119);String text = out.toString();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88120);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceStart(getClass().getName(),88121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61vzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vy61vy6lusvnh0h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vy61vy6lusvnh0h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_byte.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61vzt() throws Exception{try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88121);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88122);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88123);
                __CLR4_5_21vy61vy6lusvnh0h.R.inc(88124);if (((("name".equals(name))&&(__CLR4_5_21vy61vy6lusvnh0h.R.iget(88125)!=0|true))||(__CLR4_5_21vy61vy6lusvnh0h.R.iget(88126)==0&false))) {{
                    __CLR4_5_21vy61vy6lusvnh0h.R.inc(88127);return false;
                }
                }__CLR4_5_21vy61vy6lusvnh0h.R.inc(88128);return true;
            }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}
        };

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88129);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88130);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88131);serializer.getPropertyFilters().add(filter);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88132);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88133);map.put("id", 3);
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88134);map.put("name", "chennp2008");
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88135);serializer.write(map);

        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88136);String text = out.toString();
        __CLR4_5_21vy61vy6lusvnh0h.R.inc(88137);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

    public static class A {

        private byte    id;
        private String name;

        public byte getId() {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88138);
            __CLR4_5_21vy61vy6lusvnh0h.R.inc(88139);return id;
        }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

        public void setId(byte id) {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88140);
            __CLR4_5_21vy61vy6lusvnh0h.R.inc(88141);this.id = id;
        }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88142);
            __CLR4_5_21vy61vy6lusvnh0h.R.inc(88143);return name;
        }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21vy61vy6lusvnh0h.R.inc(88144);
            __CLR4_5_21vy61vy6lusvnh0h.R.inc(88145);this.name = name;
        }finally{__CLR4_5_21vy61vy6lusvnh0h.R.flushNeeded();}}

    }
}
