/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_short extends TestCase {static class __CLR4_1_101vg51vg5lusqkll9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87497,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101vg51vg5lusqkll9.R.globalSliceStart(getClass().getName(),87413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21vg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vg51vg5lusqkll9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vg51vg5lusqkll9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87413,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21vg5() throws Exception{try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87413);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87414);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87415);
                __CLR4_1_101vg51vg5lusqkll9.R.inc(87416);return false;
            }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}
        };

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87417);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87418);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87419);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87420);A a = new A();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87421);serializer.write(a);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87422);String text = out.toString();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87423);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101vg51vg5lusqkll9.R.globalSliceStart(getClass().getName(),87424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1vgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vg51vg5lusqkll9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vg51vg5lusqkll9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87424,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1vgg() throws Exception{try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87424);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87425);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87426);
                __CLR4_1_101vg51vg5lusqkll9.R.inc(87427);if (((("id".equals(name))&&(__CLR4_1_101vg51vg5lusqkll9.R.iget(87428)!=0|true))||(__CLR4_1_101vg51vg5lusqkll9.R.iget(87429)==0&false))) {{
                    __CLR4_1_101vg51vg5lusqkll9.R.inc(87430);Assert.assertTrue(value instanceof Short);
                    __CLR4_1_101vg51vg5lusqkll9.R.inc(87431);return true;
                }
                }__CLR4_1_101vg51vg5lusqkll9.R.inc(87432);return false;
            }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}
        };

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87433);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87434);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87435);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87436);A a = new A();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87437);serializer.write(a);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87438);String text = out.toString();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87439);Assert.assertEquals("{\"id\":0}", text);
    }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101vg51vg5lusqkll9.R.globalSliceStart(getClass().getName(),87440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441vgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vg51vg5lusqkll9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vg51vg5lusqkll9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87440,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441vgw() throws Exception{try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87440);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87441);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87442);
                __CLR4_1_101vg51vg5lusqkll9.R.inc(87443);if (((("name".equals(name))&&(__CLR4_1_101vg51vg5lusqkll9.R.iget(87444)!=0|true))||(__CLR4_1_101vg51vg5lusqkll9.R.iget(87445)==0&false))) {{
                    __CLR4_1_101vg51vg5lusqkll9.R.inc(87446);return true;
                }
                }__CLR4_1_101vg51vg5lusqkll9.R.inc(87447);return false;
            }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}
        };

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87448);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87449);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87450);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87451);A a = new A();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87452);a.setName("chennp2008");
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87453);serializer.write(a);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87454);String text = out.toString();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87455);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101vg51vg5lusqkll9.R.globalSliceStart(getClass().getName(),87456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1vhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vg51vg5lusqkll9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vg51vg5lusqkll9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87456,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1vhc() throws Exception{try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87456);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87457);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87458);
                __CLR4_1_101vg51vg5lusqkll9.R.inc(87459);if (((("name".equals(name))&&(__CLR4_1_101vg51vg5lusqkll9.R.iget(87460)!=0|true))||(__CLR4_1_101vg51vg5lusqkll9.R.iget(87461)==0&false))) {{
                    __CLR4_1_101vg51vg5lusqkll9.R.inc(87462);return true;
                }
                }__CLR4_1_101vg51vg5lusqkll9.R.inc(87463);return false;
            }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}
        };

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87464);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87465);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87466);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87467);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87468);map.put("name", "chennp2008");
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87469);serializer.write(map);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87470);String text = out.toString();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87471);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101vg51vg5lusqkll9.R.globalSliceStart(getClass().getName(),87472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61vhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vg51vg5lusqkll9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vg51vg5lusqkll9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_short.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87472,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61vhs() throws Exception{try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87472);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87473);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87474);
                __CLR4_1_101vg51vg5lusqkll9.R.inc(87475);if (((("name".equals(name))&&(__CLR4_1_101vg51vg5lusqkll9.R.iget(87476)!=0|true))||(__CLR4_1_101vg51vg5lusqkll9.R.iget(87477)==0&false))) {{
                    __CLR4_1_101vg51vg5lusqkll9.R.inc(87478);return false;
                }
                }__CLR4_1_101vg51vg5lusqkll9.R.inc(87479);return true;
            }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}
        };

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87480);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87481);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87482);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87483);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87484);map.put("id", 3);
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87485);map.put("name", "chennp2008");
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87486);serializer.write(map);

        __CLR4_1_101vg51vg5lusqkll9.R.inc(87487);String text = out.toString();
        __CLR4_1_101vg51vg5lusqkll9.R.inc(87488);Assert.assertEquals("{\"id\":3}", text);
    }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

    public static class A {

        private short    id;
        private String name;

        public short getId() {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87489);
            __CLR4_1_101vg51vg5lusqkll9.R.inc(87490);return id;
        }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

        public void setId(short id) {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87491);
            __CLR4_1_101vg51vg5lusqkll9.R.inc(87492);this.id = id;
        }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87493);
            __CLR4_1_101vg51vg5lusqkll9.R.inc(87494);return name;
        }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101vg51vg5lusqkll9.R.inc(87495);
            __CLR4_1_101vg51vg5lusqkll9.R.inc(87496);this.name = name;
        }finally{__CLR4_1_101vg51vg5lusqkll9.R.flushNeeded();}}

    }
}
