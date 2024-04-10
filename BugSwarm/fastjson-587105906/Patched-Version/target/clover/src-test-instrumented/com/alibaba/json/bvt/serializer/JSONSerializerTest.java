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

public class JSONSerializerTest extends TestCase {static class __CLR4_5_21rs51rs5lusyjuyd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,82801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21rs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21rs5() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82661);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82662);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82663);serializer.write(new C());

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82664);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_0_s() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1rs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1rs9() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82665);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82666);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82667);serializer.write(new C());

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82668);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1rsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1rsd() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82669);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82670);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82671);serializer.write(Collections.singletonList(1));

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82672);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1rsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82673,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1rsh() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82673);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82674);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82675);serializer.write(Collections.singletonList(1));

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82676);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441rsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441rsl() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82677);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82678);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82679);serializer.write(Collections.EMPTY_MAP);

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82680);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1rsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1rsp() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82681);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82682);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82683);serializer.write(Collections.EMPTY_MAP);

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82684);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1rst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82685,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1rst() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82685);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82686);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82687);serializer.write(new JSONAware() {

            public String toJSONString() {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82688);
                __CLR4_5_21rs51rs5lusyjuyd.R.inc(82689);return "null";
            }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}
        });

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82690);Assert.assertEquals("null", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1rsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1rsz() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82691);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82692);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82693);serializer.write(new JSONAware() {

            public String toJSONString() {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82694);
                __CLR4_5_21rs51rs5lusyjuyd.R.inc(82695);return "null";
            }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}
        });

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82696);Assert.assertEquals("null", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61rt5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61rt5() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82697);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82698);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82699);serializer.write(new JSONStreamAware() {

            public void writeJSONString(Appendable out) throws IOException {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82700);
                __CLR4_5_21rs51rs5lusyjuyd.R.inc(82701);out.append("abc");
            }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}
        });

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82702);Assert.assertEquals("abc", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1rtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1rtb() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82703);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82704);JSONException error = null;
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82705);try {
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82706);StringWriter out = new StringWriter();

            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82707);JSONSerializer serializer = new JSONSerializer();
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82708);serializer.write(new JSONStreamAware() {

                public void writeJSONString(Appendable out) throws IOException {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82709);
                    __CLR4_5_21rs51rs5lusyjuyd.R.inc(82710);throw new IOException();
                }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}
            });
        } catch (JSONException e) {
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82711);error = e;
        }
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82712);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1rtl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1rtl() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82713);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82714);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82715);serializer.write(new A(3));

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82716);Assert.assertEquals("{\"id\":3}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_5_null() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gjqo851rtp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_5_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82717,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gjqo851rtp() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82717);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82718);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82719);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82720);serializer.write(new A(null));

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82721);Assert.assertEquals("{\"id\":null}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81rtu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81rtu() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82722);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82723);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82724);serializer.write(new Date(1293805405498L));

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82725);Assert.assertEquals("1293805405498", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1rty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82726,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1rty() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82726);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82727);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82728);serializer.write(new B(1293805405498L));

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82729);Assert.assertEquals("{\"d\":1293805405498}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1ru2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1ru2() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82730);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82731);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82732);serializer.write(new B());

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82733);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71ru6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71ru6() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82734);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82735);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82736);serializer.write(new D(3L));

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82737);Assert.assertEquals("{\"id\":3}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_9_null() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c5djhb1rua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_9_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c5djhb1rua() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82738);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82739);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82740);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82741);serializer.write(new D(null));

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82742);Assert.assertEquals("{\"id\":null}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1ruf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1ruf() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82743);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82744);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82745);serializer.write(3);

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82746);Assert.assertEquals("3", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1ruj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1ruj() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82747);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82748);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82749);serializer.write(3L);

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82750);Assert.assertEquals("3", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1run();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1run() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82751);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82752);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82753);serializer.write(new Object[0]);

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82754);Assert.assertEquals("[]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1rur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1rur() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82755);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82756);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82757);serializer.write(new Object[] { 1 });

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82758);Assert.assertEquals("[1]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1ruv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1ruv() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82759);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82760);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82761);serializer.write(new Object[] { 1, 2, 3, 4 });

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82762);Assert.assertEquals("[1,2,3,4]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1ruz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1ruz() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82763);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82764);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82765);serializer.write(new Object[] { 1L, 2L, 3L, 4L });

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82766);Assert.assertEquals("[1,2,3,4]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1rv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1rv3() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82767);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82768);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82769);serializer.write(new Object[] { "", "", "", "" });

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82770);Assert.assertEquals("[\"\",\"\",\"\",\"\"]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceStart(getClass().getName(),82771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anb8be1rv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rs51rs5lusyjuyd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rs51rs5lusyjuyd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest.test_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anb8be1rv7() throws Exception{try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82771);
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82772);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82773);serializer.write(new Object[] { null, null, null, null });

        __CLR4_5_21rs51rs5lusyjuyd.R.inc(82774);Assert.assertEquals("[null,null,null,null]", serializer.getWriter().toString());
    }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    public static class A {

        private Integer id;

        public A(Integer id){
            super();__CLR4_5_21rs51rs5lusyjuyd.R.inc(82776);try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82775);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82777);this.id = id;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82778);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82779);return id;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82780);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82781);this.id = id;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}
    }

    public static class B {

        private Date d;

        public B(){try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82782);

        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

        public B(long value){
            super();__CLR4_5_21rs51rs5lusyjuyd.R.inc(82784);try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82783);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82785);this.d = new Date(value);
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

        public Date getD() {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82786);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82787);return d;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

        public void setD(Date d) {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82788);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82789);this.d = d;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

    }

    public static class D {

        private Long id;

        public D(Long id){
            super();__CLR4_5_21rs51rs5lusyjuyd.R.inc(82791);try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82790);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82792);this.id = id;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

        public Long getId() {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82793);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82794);return id;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82795);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82796);this.id = id;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}
    }

    public static class C extends AbstractCollection {

        @Override
        public Iterator iterator() {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82797);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82798);return Collections.EMPTY_LIST.iterator();
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}

        @Override
        public int size() {try{__CLR4_5_21rs51rs5lusyjuyd.R.inc(82799);
            __CLR4_5_21rs51rs5lusyjuyd.R.inc(82800);return 0;
        }finally{__CLR4_5_21rs51rs5lusyjuyd.R.flushNeeded();}}
    }

}
