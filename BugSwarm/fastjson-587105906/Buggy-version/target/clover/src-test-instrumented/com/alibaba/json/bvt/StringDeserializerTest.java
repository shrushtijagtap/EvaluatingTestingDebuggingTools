/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class StringDeserializerTest extends TestCase {static class __CLR4_1_10zjvzjvlusqjzaz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,46107,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10zjvzjvlusqjzaz.R.globalSliceStart(getClass().getName(),46075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2zjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zjvzjvlusqjzaz.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zjvzjvlusqjzaz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringDeserializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46075,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2zjv() throws Exception{try{__CLR4_1_10zjvzjvlusqjzaz.R.inc(46075);
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46076);Assert.assertEquals("123", JSON.parseObject("123", String.class));
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46077);Assert.assertEquals("true", JSON.parseObject("true", String.class));
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46078);Assert.assertEquals(null, JSON.parseObject("null", String.class));
    }finally{__CLR4_1_10zjvzjvlusqjzaz.R.flushNeeded();}}

    public void test_StringBuffer() throws Exception {__CLR4_1_10zjvzjvlusqjzaz.R.globalSliceStart(getClass().getName(),46079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn4ba3zjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zjvzjvlusqjzaz.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zjvzjvlusqjzaz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringDeserializerTest.test_StringBuffer",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46079,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn4ba3zjz() throws Exception{try{__CLR4_1_10zjvzjvlusqjzaz.R.inc(46079);
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46080);Assert.assertTrue(equals(new StringBuffer("123"), JSON.parseObject("123", StringBuffer.class)));
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46081);Assert.assertTrue(equals(new StringBuffer("true"), JSON.parseObject("true", StringBuffer.class)));
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46082);Assert.assertEquals(null, JSON.parseObject("null", StringBuffer.class));
    }finally{__CLR4_1_10zjvzjvlusqjzaz.R.flushNeeded();}}

    public void test_StringBuilder() throws Exception {__CLR4_1_10zjvzjvlusqjzaz.R.globalSliceStart(getClass().getName(),46083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qvmqzgzk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zjvzjvlusqjzaz.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zjvzjvlusqjzaz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringDeserializerTest.test_StringBuilder",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46083,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qvmqzgzk3() throws Exception{try{__CLR4_1_10zjvzjvlusqjzaz.R.inc(46083);
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46084);Assert.assertTrue(equals(new StringBuilder("123"), JSON.parseObject("123", StringBuilder.class)));
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46085);Assert.assertTrue(equals(new StringBuilder("true"), JSON.parseObject("true", StringBuilder.class)));
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46086);Assert.assertEquals(null, JSON.parseObject("null", StringBuilder.class));
    }finally{__CLR4_1_10zjvzjvlusqjzaz.R.flushNeeded();}}

    private boolean equals(StringBuffer sb1, StringBuffer sb2) {try{__CLR4_1_10zjvzjvlusqjzaz.R.inc(46087);
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46088);if ((((sb1 == null && sb2 == null)&&(__CLR4_1_10zjvzjvlusqjzaz.R.iget(46089)!=0|true))||(__CLR4_1_10zjvzjvlusqjzaz.R.iget(46090)==0&false))) {{
            __CLR4_1_10zjvzjvlusqjzaz.R.inc(46091);return true;
        }
        }__CLR4_1_10zjvzjvlusqjzaz.R.inc(46092);if (((((sb1 == null && sb2 != null) || (sb1 != null && sb2 == null))&&(__CLR4_1_10zjvzjvlusqjzaz.R.iget(46093)!=0|true))||(__CLR4_1_10zjvzjvlusqjzaz.R.iget(46094)==0&false))) {{
            __CLR4_1_10zjvzjvlusqjzaz.R.inc(46095);return false;
        }

        }__CLR4_1_10zjvzjvlusqjzaz.R.inc(46096);return sb1.toString().equals(sb2.toString());
    }finally{__CLR4_1_10zjvzjvlusqjzaz.R.flushNeeded();}}

    private boolean equals(StringBuilder sb1, StringBuilder sb2) {try{__CLR4_1_10zjvzjvlusqjzaz.R.inc(46097);
        __CLR4_1_10zjvzjvlusqjzaz.R.inc(46098);if ((((sb1 == null && sb2 == null)&&(__CLR4_1_10zjvzjvlusqjzaz.R.iget(46099)!=0|true))||(__CLR4_1_10zjvzjvlusqjzaz.R.iget(46100)==0&false))) {{
            __CLR4_1_10zjvzjvlusqjzaz.R.inc(46101);return true;
        }
        }__CLR4_1_10zjvzjvlusqjzaz.R.inc(46102);if (((((sb1 == null && sb2 != null) || (sb1 != null && sb2 == null))&&(__CLR4_1_10zjvzjvlusqjzaz.R.iget(46103)!=0|true))||(__CLR4_1_10zjvzjvlusqjzaz.R.iget(46104)==0&false))) {{
            __CLR4_1_10zjvzjvlusqjzaz.R.inc(46105);return false;
        }

        }__CLR4_1_10zjvzjvlusqjzaz.R.inc(46106);return sb1.toString().equals(sb2.toString());
    }finally{__CLR4_1_10zjvzjvlusqjzaz.R.flushNeeded();}}
}
