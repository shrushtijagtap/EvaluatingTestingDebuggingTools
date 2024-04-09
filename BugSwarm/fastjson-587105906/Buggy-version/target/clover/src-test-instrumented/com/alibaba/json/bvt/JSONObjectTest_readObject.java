/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JSONObjectTest_readObject extends TestCase {static class __CLR4_1_10y3cy3clusqjy94{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,44263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_10y3cy3clusqjy94.R.globalSliceStart(getClass().getName(),44184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2y3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y3cy3clusqjy94.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y3cy3clusqjy94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_readObject.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44184,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2y3c() throws Exception{try{__CLR4_1_10y3cy3clusqjy94.R.inc(44184);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44185);JSONObject jsonObject = new JSONObject();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44186);jsonObject.put("id", 123);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44187);jsonObject.put("obj", new JSONObject());

        __CLR4_1_10y3cy3clusqjy94.R.inc(44188);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44189);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44190);objOut.writeObject(jsonObject);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44191);objOut.flush();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44192);byte[] bytes = bytesOut.toByteArray();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44193);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44194);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

        __CLR4_1_10y3cy3clusqjy94.R.inc(44195);Object obj = objIn.readObject();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44196);assertEquals(JSONObject.class, obj.getClass());
        __CLR4_1_10y3cy3clusqjy94.R.inc(44197);assertEquals(jsonObject, obj);
    }finally{__CLR4_1_10y3cy3clusqjy94.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_10y3cy3clusqjy94.R.globalSliceStart(getClass().getName(),44198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k44y3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y3cy3clusqjy94.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y3cy3clusqjy94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_readObject.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44198,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k44y3q() throws Exception{try{__CLR4_1_10y3cy3clusqjy94.R.inc(44198);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44199);JSONObject jsonObject = JSON.parseObject("{123:345}");

        __CLR4_1_10y3cy3clusqjy94.R.inc(44200);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44201);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44202);objOut.writeObject(jsonObject);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44203);objOut.flush();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44204);byte[] bytes = bytesOut.toByteArray();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44205);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44206);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

        __CLR4_1_10y3cy3clusqjy94.R.inc(44207);Object obj = objIn.readObject();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44208);assertEquals(JSONObject.class, obj.getClass());
        __CLR4_1_10y3cy3clusqjy94.R.inc(44209);assertEquals(jsonObject, obj);
    }finally{__CLR4_1_10y3cy3clusqjy94.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_10y3cy3clusqjy94.R.globalSliceStart(getClass().getName(),44210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbny42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y3cy3clusqjy94.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y3cy3clusqjy94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_readObject.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44210,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbny42() throws Exception{try{__CLR4_1_10y3cy3clusqjy94.R.inc(44210);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44211);JSONObject jsonObject = JSON.parseObject("{123:345,\"items\":[1,2,3,4]}");

        __CLR4_1_10y3cy3clusqjy94.R.inc(44212);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44213);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44214);objOut.writeObject(jsonObject);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44215);objOut.flush();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44216);byte[] bytes = bytesOut.toByteArray();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44217);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44218);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

        __CLR4_1_10y3cy3clusqjy94.R.inc(44219);Object obj = objIn.readObject();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44220);assertEquals(JSONObject.class, obj.getClass());
        __CLR4_1_10y3cy3clusqjy94.R.inc(44221);assertEquals(jsonObject, obj);
    }finally{__CLR4_1_10y3cy3clusqjy94.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_10y3cy3clusqjy94.R.globalSliceStart(getClass().getName(),44222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj6y4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y3cy3clusqjy94.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y3cy3clusqjy94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_readObject.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj6y4e() throws Exception{try{__CLR4_1_10y3cy3clusqjy94.R.inc(44222);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44223);JSONObject jsonObject = new JSONObject();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44224);jsonObject.put("val", new Byte[]{});

        __CLR4_1_10y3cy3clusqjy94.R.inc(44225);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44226);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44227);objOut.writeObject(jsonObject);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44228);objOut.flush();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44229);byte[] bytes = bytesOut.toByteArray();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44230);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44231);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

        __CLR4_1_10y3cy3clusqjy94.R.inc(44232);Object obj = objIn.readObject();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44233);assertEquals(JSONObject.class, obj.getClass());
        __CLR4_1_10y3cy3clusqjy94.R.inc(44234);assertEquals(jsonObject.toJSONString(), JSON.toJSONString(obj));
    }finally{__CLR4_1_10y3cy3clusqjy94.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_10y3cy3clusqjy94.R.globalSliceStart(getClass().getName(),44235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqpy4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y3cy3clusqjy94.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y3cy3clusqjy94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_readObject.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44235,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqpy4r() throws Exception{try{__CLR4_1_10y3cy3clusqjy94.R.inc(44235);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44236);JSONObject jsonObject = new JSONObject();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44237);jsonObject.put("val", new byte[]{});

        __CLR4_1_10y3cy3clusqjy94.R.inc(44238);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44239);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44240);objOut.writeObject(jsonObject);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44241);objOut.flush();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44242);byte[] bytes = bytesOut.toByteArray();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44243);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44244);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

        __CLR4_1_10y3cy3clusqjy94.R.inc(44245);Object obj = objIn.readObject();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44246);assertEquals(JSONObject.class, obj.getClass());
        __CLR4_1_10y3cy3clusqjy94.R.inc(44247);assertEquals(jsonObject.toJSONString(), JSON.toJSONString(obj));
    }finally{__CLR4_1_10y3cy3clusqjy94.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_10y3cy3clusqjy94.R.globalSliceStart(getClass().getName(),44248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy8y54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y3cy3clusqjy94.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y3cy3clusqjy94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_readObject.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44248,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy8y54() throws Exception{try{__CLR4_1_10y3cy3clusqjy94.R.inc(44248);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44249);JSONObject jsonObject = new JSONObject();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44250);jsonObject.put("val", new Character[]{});
        __CLR4_1_10y3cy3clusqjy94.R.inc(44251);jsonObject.put("cls", java.lang.Number.class);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44252);jsonObject.put("nums", new java.lang.Number[] {});

        __CLR4_1_10y3cy3clusqjy94.R.inc(44253);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        __CLR4_1_10y3cy3clusqjy94.R.inc(44254);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44255);objOut.writeObject(jsonObject);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44256);objOut.flush();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44257);byte[] bytes = bytesOut.toByteArray();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44258);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
        __CLR4_1_10y3cy3clusqjy94.R.inc(44259);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

        __CLR4_1_10y3cy3clusqjy94.R.inc(44260);Object obj = objIn.readObject();

        __CLR4_1_10y3cy3clusqjy94.R.inc(44261);assertEquals(JSONObject.class, obj.getClass());
        __CLR4_1_10y3cy3clusqjy94.R.inc(44262);assertEquals(jsonObject.toJSONString(), JSON.toJSONString(obj));
    }finally{__CLR4_1_10y3cy3clusqjy94.R.flushNeeded();}}
}
