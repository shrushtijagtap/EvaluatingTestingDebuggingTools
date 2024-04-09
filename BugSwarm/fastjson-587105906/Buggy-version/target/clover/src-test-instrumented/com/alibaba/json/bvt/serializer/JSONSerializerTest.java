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

public class JSONSerializerTest extends TestCase {static class __CLR4_1_101rsg1rsglusqkjrp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,82812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21rsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21rsg() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82672);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82673);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82674);serializer.write(new C());

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82675);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_0_s() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10skazm1rsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_0_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10skazm1rsk() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82676);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82677);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82678);serializer.write(new C());

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82679);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1rso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82680,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1rso() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82680);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82681);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82682);serializer.write(Collections.singletonList(1));

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82683);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102xezup1rss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_1_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82684,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102xezup1rss() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82684);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82685);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82686);serializer.write(Collections.singletonList(1));

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82687);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441rsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82688,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441rsw() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82688);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82689);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82690);serializer.write(Collections.EMPTY_MAP);

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82691);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1rt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82692,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1rt0() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82692);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82693);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82694);serializer.write(Collections.EMPTY_MAP);

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82695);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1rt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82696,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1rt4() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82696);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82697);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82698);serializer.write(new JSONAware() {

            public String toJSONString() {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82699);
                __CLR4_1_101rsg1rsglusqkjrp.R.inc(82700);return "null";
            }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}
        });

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82701);Assert.assertEquals("null", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1rta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82702,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1rta() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82702);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82703);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82704);serializer.write(new JSONAware() {

            public String toJSONString() {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82705);
                __CLR4_1_101rsg1rsglusqkjrp.R.inc(82706);return "null";
            }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}
        });

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82707);Assert.assertEquals("null", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61rtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82708,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61rtg() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82708);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82709);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82710);serializer.write(new JSONStreamAware() {

            public void writeJSONString(Appendable out) throws IOException {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82711);
                __CLR4_1_101rsg1rsglusqkjrp.R.inc(82712);out.append("abc");
            }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}
        });

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82713);Assert.assertEquals("abc", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1rtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82714,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1rtm() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82714);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82715);JSONException error = null;
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82716);try {
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82717);StringWriter out = new StringWriter();

            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82718);JSONSerializer serializer = new JSONSerializer();
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82719);serializer.write(new JSONStreamAware() {

                public void writeJSONString(Appendable out) throws IOException {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82720);
                    __CLR4_1_101rsg1rsglusqkjrp.R.inc(82721);throw new IOException();
                }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}
            });
        } catch (JSONException e) {
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82722);error = e;
        }
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82723);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1rtw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82724,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1rtw() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82724);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82725);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82726);serializer.write(new A(3));

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82727);Assert.assertEquals("{\"id\":3}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_5_null() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gjqo851ru0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_5_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82728,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gjqo851ru0() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82728);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82729);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82730);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82731);serializer.write(new A(null));

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82732);Assert.assertEquals("{\"id\":null}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81ru5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81ru5() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82733);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82734);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82735);serializer.write(new Date(1293805405498L));

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82736);Assert.assertEquals("1293805405498", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1ru9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82737,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1ru9() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82737);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82738);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82739);serializer.write(new B(1293805405498L));

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82740);Assert.assertEquals("{\"d\":1293805405498}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1rud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82741,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1rud() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82741);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82742);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82743);serializer.write(new B());

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82744);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71ruh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71ruh() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82745);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82746);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82747);serializer.write(new D(3L));

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82748);Assert.assertEquals("{\"id\":3}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_9_null() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c5djhb1rul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_9_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82749,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c5djhb1rul() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82749);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82750);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82751);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82752);serializer.write(new D(null));

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82753);Assert.assertEquals("{\"id\":null}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1ruq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82754,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1ruq() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82754);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82755);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82756);serializer.write(3);

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82757);Assert.assertEquals("3", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1ruu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82758,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1ruu() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82758);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82759);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82760);serializer.write(3L);

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82761);Assert.assertEquals("3", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1ruy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82762,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1ruy() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82762);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82763);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82764);serializer.write(new Object[0]);

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82765);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1rv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82766,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1rv2() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82766);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82767);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82768);serializer.write(new Object[] { 1 });

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82769);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1rv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82770,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1rv6() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82770);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82771);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82772);serializer.write(new Object[] { 1, 2, 3, 4 });

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82773);Assert.assertEquals("[1,2,3,4]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1rva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82774,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1rva() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82774);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82775);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82776);serializer.write(new Object[] { 1L, 2L, 3L, 4L });

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82777);Assert.assertEquals("[1,2,3,4]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1rve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82778,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1rve() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82778);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82779);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82780);serializer.write(new Object[] { "", "", "", "" });

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82781);Assert.assertEquals("[\"\",\"\",\"\",\"\"]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceStart(getClass().getName(),82782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1rvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rsg1rsglusqkjrp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rsg1rsglusqkjrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82782,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1rvi() throws Exception{try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82782);
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82783);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82784);serializer.write(new Object[] { null, null, null, null });

        __CLR4_1_101rsg1rsglusqkjrp.R.inc(82785);Assert.assertEquals("[null,null,null,null]", serializer.getWriter().toString());
    }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    public static class A {

        private Integer id;

        public A(Integer id){
            super();__CLR4_1_101rsg1rsglusqkjrp.R.inc(82787);try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82786);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82788);this.id = id;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82789);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82790);return id;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82791);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82792);this.id = id;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}
    }

    public static class B {

        private Date d;

        public B(){try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82793);

        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

        public B(long value){
            super();__CLR4_1_101rsg1rsglusqkjrp.R.inc(82795);try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82794);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82796);this.d = new Date(value);
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

        public Date getD() {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82797);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82798);return d;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

        public void setD(Date d) {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82799);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82800);this.d = d;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

    }

    public static class D {

        private Long id;

        public D(Long id){
            super();__CLR4_1_101rsg1rsglusqkjrp.R.inc(82802);try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82801);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82803);this.id = id;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

        public Long getId() {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82804);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82805);return id;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82806);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82807);this.id = id;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}
    }

    public static class C extends AbstractCollection {

        @Override
        public Iterator iterator() {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82808);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82809);return Collections.EMPTY_LIST.iterator();
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}

        @Override
        public int size() {try{__CLR4_1_101rsg1rsglusqkjrp.R.inc(82810);
            __CLR4_1_101rsg1rsglusqkjrp.R.inc(82811);return 0;
        }finally{__CLR4_1_101rsg1rsglusqkjrp.R.flushNeeded();}}
    }

}
