/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.IOException;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONStreamAware;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JSONSerializerTest extends TestCase {static class __CLR4_5_21sqd1sqdlusvngc6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84033,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21sqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21sqd() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83893);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83894);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83895);serializer.write(new C());

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83896);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_0_s() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1sqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1sqh() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83897);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83898);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83899);serializer.write(new C());

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83900);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1sql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1sql() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83901);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83902);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83903);serializer.write(Collections.singletonList(1));

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83904);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1sqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1sqp() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83905);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83906);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83907);serializer.write(Collections.singletonList(1));

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83908);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441sqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441sqt() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83909);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83910);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83911);serializer.write(Collections.EMPTY_MAP);

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83912);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1sqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1sqx() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83913);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83914);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83915);serializer.write(Collections.EMPTY_MAP);

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83916);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1sr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1sr1() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83917);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83918);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83919);serializer.write(new JSONAware() {

            public String toJSONString() {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83920);
                __CLR4_5_21sqd1sqdlusvngc6.R.inc(83921);return "null";
            }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}
        });

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83922);Assert.assertEquals("null", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1sr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1sr7() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83923);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83924);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83925);serializer.write(new JSONAware() {

            public String toJSONString() {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83926);
                __CLR4_5_21sqd1sqdlusvngc6.R.inc(83927);return "null";
            }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}
        });

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83928);Assert.assertEquals("null", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61srd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83929,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61srd() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83929);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83930);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83931);serializer.write(new JSONStreamAware() {

            public void writeJSONString(Appendable out) throws IOException {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83932);
                __CLR4_5_21sqd1sqdlusvngc6.R.inc(83933);out.append("abc");
            }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}
        });

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83934);Assert.assertEquals("abc", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1srj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1srj() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83935);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83936);JSONException error = null;
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83937);try {
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(83938);StringWriter out = new StringWriter();

            __CLR4_5_21sqd1sqdlusvngc6.R.inc(83939);JSONSerializer serializer = new JSONSerializer();
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(83940);serializer.write(new JSONStreamAware() {

                public void writeJSONString(Appendable out) throws IOException {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83941);
                    __CLR4_5_21sqd1sqdlusvngc6.R.inc(83942);throw new IOException();
                }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}
            });
        } catch (JSONException e) {
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(83943);error = e;
        }
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83944);Assert.assertNotNull(error);
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1srt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83945,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1srt() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83945);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83946);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83947);serializer.write(new A(3));

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83948);Assert.assertEquals("{\"id\":3}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_5_null() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gjqo851srx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_5_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gjqo851srx() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83949);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83950);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83951);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83952);serializer.write(new A(null));

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83953);Assert.assertEquals("{\"id\":null}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81ss2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81ss2() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83954);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83955);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83956);serializer.write(new Date(1293805405498L));

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83957);Assert.assertEquals("1293805405498", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1ss6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1ss6() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83958);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83959);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83960);serializer.write(new B(1293805405498L));

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83961);Assert.assertEquals("{\"d\":1293805405498}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1ssa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1ssa() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83962);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83963);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83964);serializer.write(new B());

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83965);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71sse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71sse() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83966);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83967);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83968);serializer.write(new D(3L));

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83969);Assert.assertEquals("{\"id\":3}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_9_null() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c5djhb1ssi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_9_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83970,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c5djhb1ssi() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83970);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83971);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83972);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83973);serializer.write(new D(null));

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83974);Assert.assertEquals("{\"id\":null}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1ssn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1ssn() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83975);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83976);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83977);serializer.write(3);

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83978);Assert.assertEquals("3", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1ssr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1ssr() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83979);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83980);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83981);serializer.write(3L);

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83982);Assert.assertEquals("3", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1ssv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1ssv() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83983);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83984);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83985);serializer.write(new Object[0]);

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83986);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1ssz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83987,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1ssz() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83987);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83988);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83989);serializer.write(new Object[] { 1 });

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83990);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1st3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83991,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1st3() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83991);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83992);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83993);serializer.write(new Object[] { 1, 2, 3, 4 });

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83994);Assert.assertEquals("[1,2,3,4]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1st7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1st7() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83995);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83996);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83997);serializer.write(new Object[] { 1L, 2L, 3L, 4L });

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(83998);Assert.assertEquals("[1,2,3,4]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),83999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1stb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83999,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1stb() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(83999);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(84000);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(84001);serializer.write(new Object[] { "", "", "", "" });

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(84002);Assert.assertEquals("[\"\",\"\",\"\",\"\"]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceStart(getClass().getName(),84003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anb8be1stf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sqd1sqdlusvngc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sqd1sqdlusvngc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84003,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anb8be1stf() throws Exception{try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84003);
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(84004);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21sqd1sqdlusvngc6.R.inc(84005);serializer.write(new Object[] { null, null, null, null });

        __CLR4_5_21sqd1sqdlusvngc6.R.inc(84006);Assert.assertEquals("[null,null,null,null]", serializer.getWriter().toString());
    }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    public static class A {

        private Integer id;

        public A(Integer id){
            super();__CLR4_5_21sqd1sqdlusvngc6.R.inc(84008);try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84007);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84009);this.id = id;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84010);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84011);return id;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84012);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84013);this.id = id;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}
    }

    public static class B {

        private Date d;

        public B(){try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84014);

        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

        public B(long value){
            super();__CLR4_5_21sqd1sqdlusvngc6.R.inc(84016);try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84015);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84017);this.d = new Date(value);
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

        public Date getD() {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84018);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84019);return d;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

        public void setD(Date d) {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84020);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84021);this.d = d;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

    }

    public static class D {

        private Long id;

        public D(Long id){
            super();__CLR4_5_21sqd1sqdlusvngc6.R.inc(84023);try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84022);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84024);this.id = id;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

        public Long getId() {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84025);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84026);return id;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84027);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84028);this.id = id;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}
    }

    public static class C extends AbstractCollection {

        @Override
        public Iterator iterator() {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84029);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84030);return Collections.EMPTY_LIST.iterator();
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}

        @Override
        public int size() {try{__CLR4_5_21sqd1sqdlusvngc6.R.inc(84031);
            __CLR4_5_21sqd1sqdlusvngc6.R.inc(84032);return 0;
        }finally{__CLR4_5_21sqd1sqdlusvngc6.R.flushNeeded();}}
    }

}
