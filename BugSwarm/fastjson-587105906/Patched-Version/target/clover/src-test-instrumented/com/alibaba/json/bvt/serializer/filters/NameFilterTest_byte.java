/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class NameFilterTest_byte extends TestCase {static class __CLR4_5_21vf91vf9lusvngv2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,87424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_namefilter() throws Exception {__CLR4_5_21vf91vf9lusvngv2.R.globalSliceStart(getClass().getName(),87381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pmdm8n1vf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf91vf9lusvngv2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf91vf9lusvngv2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.NameFilterTest_byte.test_namefilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87381,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pmdm8n1vf9() throws Exception{try{__CLR4_5_21vf91vf9lusvngv2.R.inc(87381);
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87382);NameFilter filter = new NameFilter() {

            public String process(Object source, String name, Object value) {try{__CLR4_5_21vf91vf9lusvngv2.R.inc(87383);
                __CLR4_5_21vf91vf9lusvngv2.R.inc(87384);if ((((value != null)&&(__CLR4_5_21vf91vf9lusvngv2.R.iget(87385)!=0|true))||(__CLR4_5_21vf91vf9lusvngv2.R.iget(87386)==0&false))) {{
                    __CLR4_5_21vf91vf9lusvngv2.R.inc(87387);Assert.assertTrue(value instanceof Byte);
                }
                
                }__CLR4_5_21vf91vf9lusvngv2.R.inc(87388);if ((((name.equals("id"))&&(__CLR4_5_21vf91vf9lusvngv2.R.iget(87389)!=0|true))||(__CLR4_5_21vf91vf9lusvngv2.R.iget(87390)==0&false))) {{
                    __CLR4_5_21vf91vf9lusvngv2.R.inc(87391);return "ID";
                }

                }__CLR4_5_21vf91vf9lusvngv2.R.inc(87392);return name;
            }finally{__CLR4_5_21vf91vf9lusvngv2.R.flushNeeded();}}

        };

        __CLR4_5_21vf91vf9lusvngv2.R.inc(87393);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87394);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87395);serializer.getNameFilters().add(filter);

        __CLR4_5_21vf91vf9lusvngv2.R.inc(87396);Bean a = new Bean();
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87397);serializer.write(a);

        __CLR4_5_21vf91vf9lusvngv2.R.inc(87398);String text = out.toString();
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87399);Assert.assertEquals("{\"ID\":0}", text);
    }finally{__CLR4_5_21vf91vf9lusvngv2.R.flushNeeded();}}

    public void test_namefilter_1() throws Exception {__CLR4_5_21vf91vf9lusvngv2.R.globalSliceStart(getClass().getName(),87400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l5s2if1vfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vf91vf9lusvngv2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vf91vf9lusvngv2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.NameFilterTest_byte.test_namefilter_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l5s2if1vfs() throws Exception{try{__CLR4_5_21vf91vf9lusvngv2.R.inc(87400);
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87401);NameFilter filter = new NameFilter() {

            public String process(Object source, String name, Object value) {try{__CLR4_5_21vf91vf9lusvngv2.R.inc(87402);
                __CLR4_5_21vf91vf9lusvngv2.R.inc(87403);if ((((name.equals("id"))&&(__CLR4_5_21vf91vf9lusvngv2.R.iget(87404)!=0|true))||(__CLR4_5_21vf91vf9lusvngv2.R.iget(87405)==0&false))) {{
                    __CLR4_5_21vf91vf9lusvngv2.R.inc(87406);return "ID";
                }

                }__CLR4_5_21vf91vf9lusvngv2.R.inc(87407);return name;
            }finally{__CLR4_5_21vf91vf9lusvngv2.R.flushNeeded();}}

        };

        __CLR4_5_21vf91vf9lusvngv2.R.inc(87408);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87409);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87410);serializer.getNameFilters().add(filter);

        __CLR4_5_21vf91vf9lusvngv2.R.inc(87411);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87412);map.put("id", (byte) 0);
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87413);serializer.write(map);

        __CLR4_5_21vf91vf9lusvngv2.R.inc(87414);String text = out.toString();
        __CLR4_5_21vf91vf9lusvngv2.R.inc(87415);Assert.assertEquals("{\"ID\":0}", text);
    }finally{__CLR4_5_21vf91vf9lusvngv2.R.flushNeeded();}}

    public static class Bean {

        private byte    id;
        private String name;

        public byte getId() {try{__CLR4_5_21vf91vf9lusvngv2.R.inc(87416);
            __CLR4_5_21vf91vf9lusvngv2.R.inc(87417);return id;
        }finally{__CLR4_5_21vf91vf9lusvngv2.R.flushNeeded();}}

        public void setId(byte id) {try{__CLR4_5_21vf91vf9lusvngv2.R.inc(87418);
            __CLR4_5_21vf91vf9lusvngv2.R.inc(87419);this.id = id;
        }finally{__CLR4_5_21vf91vf9lusvngv2.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21vf91vf9lusvngv2.R.inc(87420);
            __CLR4_5_21vf91vf9lusvngv2.R.inc(87421);return name;
        }finally{__CLR4_5_21vf91vf9lusvngv2.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21vf91vf9lusvngv2.R.inc(87422);
            __CLR4_5_21vf91vf9lusvngv2.R.inc(87423);this.name = name;
        }finally{__CLR4_5_21vf91vf9lusvngv2.R.flushNeeded();}}

    }
}
