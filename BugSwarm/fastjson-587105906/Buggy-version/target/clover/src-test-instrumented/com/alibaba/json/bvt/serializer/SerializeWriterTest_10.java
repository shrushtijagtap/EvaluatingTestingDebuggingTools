/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;

public class SerializeWriterTest_10 extends TestCase {static class __CLR4_1_101ssr1ssrlusqkk39{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,84019,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_erro_0() throws Exception {__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceStart(getClass().getName(),83979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107rupw11ssr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ssr1ssrlusqkk39.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_10.test_erro_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83979,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107rupw11ssr() throws Exception{try{__CLR4_1_101ssr1ssrlusqkk39.R.inc(83979);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83980);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83981);Exception error = null;
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83982);try {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(83983);out.write(new char[0], -1, 0);
        } catch (Exception ex) {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(83984);error = ex;
        }
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83985);Assert.assertNotNull(error);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83986);out.close();
    }finally{__CLR4_1_101ssr1ssrlusqkk39.R.flushNeeded();}}

    public void test_erro_1() throws Exception {__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceStart(getClass().getName(),83987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104iur3k1ssz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ssr1ssrlusqkk39.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_10.test_erro_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104iur3k1ssz() throws Exception{try{__CLR4_1_101ssr1ssrlusqkk39.R.inc(83987);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83988);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83989);Exception error = null;
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83990);try {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(83991);out.write(new char[0], 1, 0);
        } catch (Exception ex) {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(83992);error = ex;
        }
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83993);Assert.assertNotNull(error);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83994);out.close();
    }finally{__CLR4_1_101ssr1ssrlusqkk39.R.flushNeeded();}}

    public void test_erro_2() throws Exception {__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceStart(getClass().getName(),83995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1019usb31st7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ssr1ssrlusqkk39.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_10.test_erro_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83995,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1019usb31st7() throws Exception{try{__CLR4_1_101ssr1ssrlusqkk39.R.inc(83995);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83996);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83997);Exception error = null;
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(83998);try {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(83999);out.write(new char[0], 0, -1);
        } catch (Exception ex) {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(84000);error = ex;
        }
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84001);Assert.assertNotNull(error);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84002);out.close();
    }finally{__CLR4_1_101ssr1ssrlusqkk39.R.flushNeeded();}}

    public void test_erro_3() throws Exception {__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceStart(getClass().getName(),84003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101z56he1stf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ssr1ssrlusqkk39.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_10.test_erro_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84003,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101z56he1stf() throws Exception{try{__CLR4_1_101ssr1ssrlusqkk39.R.inc(84003);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84004);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84005);Exception error = null;
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84006);try {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(84007);out.write(new char[] { '0', '0' }, 1, 2);
        } catch (Exception ex) {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(84008);error = ex;
        }
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84009);Assert.assertNotNull(error);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84010);out.close();
    }finally{__CLR4_1_101ssr1ssrlusqkk39.R.flushNeeded();}}
    
    public void test_erro_4() throws Exception {__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceStart(getClass().getName(),84011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1058559v1stn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ssr1ssrlusqkk39.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ssr1ssrlusqkk39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_10.test_erro_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84011,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1058559v1stn() throws Exception{try{__CLR4_1_101ssr1ssrlusqkk39.R.inc(84011);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84012);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84013);Exception error = null;
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84014);try {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(84015);out.write(new char[] { '0', '0' }, 1, Integer.MAX_VALUE);
        } catch (Exception ex) {
            __CLR4_1_101ssr1ssrlusqkk39.R.inc(84016);error = ex;
        }
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84017);Assert.assertNotNull(error);
        __CLR4_1_101ssr1ssrlusqkk39.R.inc(84018);out.close();
    }finally{__CLR4_1_101ssr1ssrlusqkk39.R.flushNeeded();}}
}
