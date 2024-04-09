/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.stream;

import java.io.StringReader;
import java.lang.reflect.Field;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;

public class JSONReaderTest_error extends TestCase {static class __CLR4_1_101o471o47lusqkhox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,77932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_read() throws Exception {__CLR4_1_101o471o47lusqkhox.R.globalSliceStart(getClass().getName(),77911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o8nabu1o47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o471o47lusqkhox.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o471o47lusqkhox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderTest_error.test_read",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o8nabu1o47() throws Exception{try{__CLR4_1_101o471o47lusqkhox.R.inc(77911);
        __CLR4_1_101o471o47lusqkhox.R.inc(77912);Field field = JSONReader.class.getDeclaredField("context");
        __CLR4_1_101o471o47lusqkhox.R.inc(77913);field.setAccessible(true);
        __CLR4_1_101o471o47lusqkhox.R.inc(77914);;

        __CLR4_1_101o471o47lusqkhox.R.inc(77915);JSONReader reader = new JSONReader(new StringReader("[{}]"));
        __CLR4_1_101o471o47lusqkhox.R.inc(77916);reader.config(Feature.AllowArbitraryCommas, true);

        __CLR4_1_101o471o47lusqkhox.R.inc(77917);reader.startArray();

        __CLR4_1_101o471o47lusqkhox.R.inc(77918);Object context = field.get(reader);
        __CLR4_1_101o471o47lusqkhox.R.inc(77919);Field stateField = context.getClass().getDeclaredField("state");
        __CLR4_1_101o471o47lusqkhox.R.inc(77920);stateField.setAccessible(true);
        __CLR4_1_101o471o47lusqkhox.R.inc(77921);stateField.set(context, -1);

        {
            __CLR4_1_101o471o47lusqkhox.R.inc(77922);Exception error = null;
            __CLR4_1_101o471o47lusqkhox.R.inc(77923);try {
                __CLR4_1_101o471o47lusqkhox.R.inc(77924);reader.startObject();
            } catch (Exception ex) {
                __CLR4_1_101o471o47lusqkhox.R.inc(77925);error = ex;
            }
            __CLR4_1_101o471o47lusqkhox.R.inc(77926);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101o471o47lusqkhox.R.inc(77927);Exception error = null;
            __CLR4_1_101o471o47lusqkhox.R.inc(77928);try {
                __CLR4_1_101o471o47lusqkhox.R.inc(77929);reader.readInteger();
            } catch (Exception ex) {
                __CLR4_1_101o471o47lusqkhox.R.inc(77930);error = ex;
            }
            __CLR4_1_101o471o47lusqkhox.R.inc(77931);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101o471o47lusqkhox.R.flushNeeded();}}
}
