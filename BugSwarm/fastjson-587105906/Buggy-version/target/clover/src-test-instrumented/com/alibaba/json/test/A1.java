/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.IOUtils;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by wenshao on 14/03/2017.
 */
public class A1 extends TestCase {static class __CLR4_1_1020o620o6lusqkqfh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,94192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_a() throws Exception {__CLR4_1_1020o620o6lusqkqfh.R.globalSliceStart(getClass().getName(),94182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105yd8w520o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1020o620o6lusqkqfh.R.rethrow($CLV_t2$);}finally{__CLR4_1_1020o620o6lusqkqfh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.A1.test_a",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),94182,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105yd8w520o6() throws Exception{try{__CLR4_1_1020o620o6lusqkqfh.R.inc(94182);
        __CLR4_1_1020o620o6lusqkqfh.R.inc(94183);Object obj = JSON.parse("[{\"feature\":\"\\u3A56\\u3A26\"}]");
        __CLR4_1_1020o620o6lusqkqfh.R.inc(94184);String json = JSON.toJSONString(obj, SerializerFeature.BrowserCompatible);
        __CLR4_1_1020o620o6lusqkqfh.R.inc(94185);System.out.println(json);


    }finally{__CLR4_1_1020o620o6lusqkqfh.R.flushNeeded();}}


    public void test_ser() throws Exception {__CLR4_1_1020o620o6lusqkqfh.R.globalSliceStart(getClass().getName(),94186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v8gvmi20oa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1020o620o6lusqkqfh.R.rethrow($CLV_t2$);}finally{__CLR4_1_1020o620o6lusqkqfh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.A1.test_ser",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),94186,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v8gvmi20oa() throws Exception{try{__CLR4_1_1020o620o6lusqkqfh.R.inc(94186);
//        JSONObject obj = new JSONObject();
//
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        ObjectOutputStream objOut = new ObjectOutputStream(out);
//        objOut.writeObject(obj);
//        objOut.flush();
//        objOut.close();
//        byte[] bytes = out.toByteArray();
//
//        String str = Base64.encodeToString(bytes, false);
//        System.out.println(str);

        __CLR4_1_1020o620o6lusqkqfh.R.inc(94187);byte[] bytes2 = IOUtils.decodeBase64("rO0ABXNyAB9jb20uYWxpYmFiYS5mYXN0anNvbi5KU09OT2JqZWN0AAAAAAAAAAECAAFMAANtYXB0AA9MamF2YS91dGlsL01hcDt4cHNyABFqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFmDRAwACRgAKbG9hZEZhY3RvckkACXRocmVzaG9sZHhwP0AAAAAAABB3CAAAABAAAAAAeA==");
        __CLR4_1_1020o620o6lusqkqfh.R.inc(94188);ByteArrayInputStream byteIn = new ByteArrayInputStream(bytes2);
        __CLR4_1_1020o620o6lusqkqfh.R.inc(94189);ObjectInputStream objIn = new ObjectInputStream(byteIn);
        __CLR4_1_1020o620o6lusqkqfh.R.inc(94190);Object obj = objIn.readObject();
        __CLR4_1_1020o620o6lusqkqfh.R.inc(94191);assertEquals(JSONObject.class, obj.getClass());

    }finally{__CLR4_1_1020o620o6lusqkqfh.R.flushNeeded();}}
}
