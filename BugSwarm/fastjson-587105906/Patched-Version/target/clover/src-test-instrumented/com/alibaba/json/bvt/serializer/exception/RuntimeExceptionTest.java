/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.exception;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class RuntimeExceptionTest extends TestCase {static class __CLR4_5_21uzr1uzrlusvngqy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,86838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21uzr1uzrlusvngqy.R.globalSliceStart(getClass().getName(),86823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21uzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uzr1uzrlusvngqy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uzr1uzrlusvngqy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.exception.RuntimeExceptionTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21uzr() throws Exception{try{__CLR4_5_21uzr1uzrlusvngqy.R.inc(86823);
        __CLR4_5_21uzr1uzrlusvngqy.R.inc(86824);RuntimeException ex = new RuntimeException();

        __CLR4_5_21uzr1uzrlusvngqy.R.inc(86825);JSONObject json = JSON.parseObject(JSON.toJSONString(ex));
//        Assert.assertEquals(RuntimeException.class.getName(), json.get("@type"));

        __CLR4_5_21uzr1uzrlusvngqy.R.inc(86826);String jsonString = JSON.toJSONString(ex);
        __CLR4_5_21uzr1uzrlusvngqy.R.inc(86827);Exception ex1 = JSON.parseObject(jsonString, Exception.class);

        __CLR4_5_21uzr1uzrlusvngqy.R.inc(86828);Assert.assertEquals(ex.getMessage(), ex1.getMessage());
        __CLR4_5_21uzr1uzrlusvngqy.R.inc(86829);Assert.assertEquals(ex.getStackTrace().length, ex1.getStackTrace().length);

        __CLR4_5_21uzr1uzrlusvngqy.R.inc(86830);for (int i = 0; (((i < ex.getStackTrace().length)&&(__CLR4_5_21uzr1uzrlusvngqy.R.iget(86831)!=0|true))||(__CLR4_5_21uzr1uzrlusvngqy.R.iget(86832)==0&false)); ++i) {{
            __CLR4_5_21uzr1uzrlusvngqy.R.inc(86833);Assert.assertEquals(ex.getStackTrace()[i].getClassName(), ex1.getStackTrace()[i].getClassName());
            __CLR4_5_21uzr1uzrlusvngqy.R.inc(86834);Assert.assertEquals(ex.getStackTrace()[i].getFileName(), ex1.getStackTrace()[i].getFileName());
            __CLR4_5_21uzr1uzrlusvngqy.R.inc(86835);Assert.assertEquals(ex.getStackTrace()[i].getLineNumber(), ex1.getStackTrace()[i].getLineNumber());
            __CLR4_5_21uzr1uzrlusvngqy.R.inc(86836);Assert.assertEquals(ex.getStackTrace()[i].getMethodName(), ex1.getStackTrace()[i].getMethodName());
        }

        }__CLR4_5_21uzr1uzrlusvngqy.R.inc(86837);Assert.assertEquals(ex1.getClass(), ex.getClass());

        //System.out.println(JSON.toJSONString(ex));
        // Assert.assertEquals("\"java.lang.Boolean\"", JSON.toJSONString(ex));
    }finally{__CLR4_5_21uzr1uzrlusvngqy.R.flushNeeded();}}
}
