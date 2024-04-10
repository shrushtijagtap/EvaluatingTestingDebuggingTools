/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

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

public class JSONSerializerTest extends TestCase {static class __CLR4_1_101sqo1sqoluszwf13{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21sqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21sqo() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83904);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83905);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83906);serializer.write(new C());

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83907);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_0_s() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10skazm1sqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_0_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10skazm1sqs() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83908);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83909);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83910);serializer.write(new C());

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83911);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1sqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83912,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1sqw() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83912);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83913);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83914);serializer.write(Collections.singletonList(1));

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83915);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102xezup1sr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_1_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83916,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102xezup1sr0() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83916);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83917);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83918);serializer.write(Collections.singletonList(1));

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83919);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441sr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83920,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441sr4() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83920);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83921);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83922);serializer.write(Collections.EMPTY_MAP);

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83923);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1sr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83924,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1sr8() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83924);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83925);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83926);serializer.write(Collections.EMPTY_MAP);

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83927);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1src();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83928,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1src() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83928);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83929);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83930);serializer.write(new JSONAware() {

            public String toJSONString() {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83931);
                __CLR4_1_101sqo1sqoluszwf13.R.inc(83932);return "null";
            }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}
        });

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83933);Assert.assertEquals("null", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1sri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83934,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1sri() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83934);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83935);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83936);serializer.write(new JSONAware() {

            public String toJSONString() {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83937);
                __CLR4_1_101sqo1sqoluszwf13.R.inc(83938);return "null";
            }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}
        });

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83939);Assert.assertEquals("null", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61sro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83940,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61sro() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83940);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83941);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83942);serializer.write(new JSONStreamAware() {

            public void writeJSONString(Appendable out) throws IOException {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83943);
                __CLR4_1_101sqo1sqoluszwf13.R.inc(83944);out.append("abc");
            }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}
        });

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83945);Assert.assertEquals("abc", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1sru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83946,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1sru() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83946);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83947);JSONException error = null;
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83948);try {
            __CLR4_1_101sqo1sqoluszwf13.R.inc(83949);StringWriter out = new StringWriter();

            __CLR4_1_101sqo1sqoluszwf13.R.inc(83950);JSONSerializer serializer = new JSONSerializer();
            __CLR4_1_101sqo1sqoluszwf13.R.inc(83951);serializer.write(new JSONStreamAware() {

                public void writeJSONString(Appendable out) throws IOException {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83952);
                    __CLR4_1_101sqo1sqoluszwf13.R.inc(83953);throw new IOException();
                }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}
            });
        } catch (JSONException e) {
            __CLR4_1_101sqo1sqoluszwf13.R.inc(83954);error = e;
        }
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83955);Assert.assertNotNull(error);
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1ss4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83956,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1ss4() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83956);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83957);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83958);serializer.write(new A(3));

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83959);Assert.assertEquals("{\"id\":3}", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_5_null() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gjqo851ss8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_5_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83960,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gjqo851ss8() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83960);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83961);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83962);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83963);serializer.write(new A(null));

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83964);Assert.assertEquals("{\"id\":null}", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81ssd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83965,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81ssd() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83965);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83966);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83967);serializer.write(new Date(1293805405498L));

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83968);Assert.assertEquals("1293805405498", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1ssh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83969,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1ssh() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83969);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83970);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83971);serializer.write(new B(1293805405498L));

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83972);Assert.assertEquals("{\"d\":1293805405498}", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1ssl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83973,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1ssl() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83973);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83974);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83975);serializer.write(new B());

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83976);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71ssp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83977,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71ssp() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83977);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83978);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83979);serializer.write(new D(3L));

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83980);Assert.assertEquals("{\"id\":3}", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_9_null() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c5djhb1sst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_9_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83981,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c5djhb1sst() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83981);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83982);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83983);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83984);serializer.write(new D(null));

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83985);Assert.assertEquals("{\"id\":null}", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1ssy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1ssy() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83986);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83987);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83988);serializer.write(3);

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83989);Assert.assertEquals("3", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1st2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83990,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1st2() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83990);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83991);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83992);serializer.write(3L);

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83993);Assert.assertEquals("3", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1st6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83994,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1st6() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83994);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83995);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83996);serializer.write(new Object[0]);

        __CLR4_1_101sqo1sqoluszwf13.R.inc(83997);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),83998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1sta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83998,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1sta() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(83998);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(83999);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84000);serializer.write(new Object[] { 1 });

        __CLR4_1_101sqo1sqoluszwf13.R.inc(84001);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),84002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1ste();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84002,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1ste() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84002);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84003);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84004);serializer.write(new Object[] { 1, 2, 3, 4 });

        __CLR4_1_101sqo1sqoluszwf13.R.inc(84005);Assert.assertEquals("[1,2,3,4]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),84006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1sti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84006,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1sti() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84006);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84007);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84008);serializer.write(new Object[] { 1L, 2L, 3L, 4L });

        __CLR4_1_101sqo1sqoluszwf13.R.inc(84009);Assert.assertEquals("[1,2,3,4]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),84010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1stm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84010,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1stm() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84010);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84011);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84012);serializer.write(new Object[] { "", "", "", "" });

        __CLR4_1_101sqo1sqoluszwf13.R.inc(84013);Assert.assertEquals("[\"\",\"\",\"\",\"\"]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101sqo1sqoluszwf13.R.globalSliceStart(getClass().getName(),84014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1stq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sqo1sqoluszwf13.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sqo1sqoluszwf13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84014,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1stq() throws Exception{try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84014);
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84015);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101sqo1sqoluszwf13.R.inc(84016);serializer.write(new Object[] { null, null, null, null });

        __CLR4_1_101sqo1sqoluszwf13.R.inc(84017);Assert.assertEquals("[null,null,null,null]", serializer.getWriter().toString());
    }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    public static class A {

        private Integer id;

        public A(Integer id){
            super();__CLR4_1_101sqo1sqoluszwf13.R.inc(84019);try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84018);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84020);this.id = id;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84021);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84022);return id;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84023);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84024);this.id = id;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}
    }

    public static class B {

        private Date d;

        public B(){try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84025);

        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

        public B(long value){
            super();__CLR4_1_101sqo1sqoluszwf13.R.inc(84027);try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84026);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84028);this.d = new Date(value);
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

        public Date getD() {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84029);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84030);return d;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

        public void setD(Date d) {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84031);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84032);this.d = d;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

    }

    public static class D {

        private Long id;

        public D(Long id){
            super();__CLR4_1_101sqo1sqoluszwf13.R.inc(84034);try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84033);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84035);this.id = id;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

        public Long getId() {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84036);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84037);return id;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84038);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84039);this.id = id;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}
    }

    public static class C extends AbstractCollection {

        @Override
        public Iterator iterator() {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84040);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84041);return Collections.EMPTY_LIST.iterator();
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}

        @Override
        public int size() {try{__CLR4_1_101sqo1sqoluszwf13.R.inc(84042);
            __CLR4_1_101sqo1sqoluszwf13.R.inc(84043);return 0;
        }finally{__CLR4_1_101sqo1sqoluszwf13.R.flushNeeded();}}
    }

}
