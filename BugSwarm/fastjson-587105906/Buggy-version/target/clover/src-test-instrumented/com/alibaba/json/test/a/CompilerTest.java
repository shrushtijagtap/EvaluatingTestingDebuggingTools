/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.a;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.io.*;

/**
 * Created by wenshao on 04/02/2017.
 */
public class CompilerTest extends TestCase {static class __CLR4_1_10231h231hluszwi2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,97281,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_compiler() throws Exception {__CLR4_1_10231h231hluszwi2g.R.globalSliceStart(getClass().getName(),97253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eoxyqf231h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10231h231hluszwi2g.R.rethrow($CLV_t2$);}finally{__CLR4_1_10231h231hluszwi2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.a.CompilerTest.test_for_compiler",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),97253,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eoxyqf231h() throws Exception{try{__CLR4_1_10231h231hluszwi2g.R.inc(97253);
        __CLR4_1_10231h231hluszwi2g.R.inc(97254);byte[] bytes;
        {
            __CLR4_1_10231h231hluszwi2g.R.inc(97255);Model model = new Model();
            __CLR4_1_10231h231hluszwi2g.R.inc(97256);model.id = 123;

            __CLR4_1_10231h231hluszwi2g.R.inc(97257);bytes = toBytes(model);
        }

        __CLR4_1_10231h231hluszwi2g.R.inc(97258);perf(bytes);
        __CLR4_1_10231h231hluszwi2g.R.inc(97259);for (int i = 0; (((i < 10)&&(__CLR4_1_10231h231hluszwi2g.R.iget(97260)!=0|true))||(__CLR4_1_10231h231hluszwi2g.R.iget(97261)==0&false)); ++i) {{
            __CLR4_1_10231h231hluszwi2g.R.inc(97262);long start = System.currentTimeMillis();
            __CLR4_1_10231h231hluszwi2g.R.inc(97263);perf(bytes);
            __CLR4_1_10231h231hluszwi2g.R.inc(97264);long millis = System.currentTimeMillis() - start;
            __CLR4_1_10231h231hluszwi2g.R.inc(97265);System.out.println("millis : " + millis);
        }
    }}finally{__CLR4_1_10231h231hluszwi2g.R.flushNeeded();}}

    private void perf(byte[] bytes) throws IOException, ClassNotFoundException {try{__CLR4_1_10231h231hluszwi2g.R.inc(97266);
        __CLR4_1_10231h231hluszwi2g.R.inc(97267);for (int i = 0; (((i < 1000)&&(__CLR4_1_10231h231hluszwi2g.R.iget(97268)!=0|true))||(__CLR4_1_10231h231hluszwi2g.R.iget(97269)==0&false)); ++i) {{
            __CLR4_1_10231h231hluszwi2g.R.inc(97270);ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
            __CLR4_1_10231h231hluszwi2g.R.inc(97271);Model model = (Model) in.readObject();
            __CLR4_1_10231h231hluszwi2g.R.inc(97272);assertEquals(123, model.id);
        }
    }}finally{__CLR4_1_10231h231hluszwi2g.R.flushNeeded();}}

    private byte[] toBytes(Model model) throws IOException {try{__CLR4_1_10231h231hluszwi2g.R.inc(97273);
        __CLR4_1_10231h231hluszwi2g.R.inc(97274);ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        __CLR4_1_10231h231hluszwi2g.R.inc(97275);ObjectOutputStream out = new ObjectOutputStream(byteOut);

        __CLR4_1_10231h231hluszwi2g.R.inc(97276);out.writeObject(model);
        __CLR4_1_10231h231hluszwi2g.R.inc(97277);out.flush();
        __CLR4_1_10231h231hluszwi2g.R.inc(97278);byte[] bytes = byteOut.toByteArray();
        __CLR4_1_10231h231hluszwi2g.R.inc(97279);out.close();
        __CLR4_1_10231h231hluszwi2g.R.inc(97280);return bytes;
    }finally{__CLR4_1_10231h231hluszwi2g.R.flushNeeded();}}

    public static class Model implements Serializable {
        public int id;
    }
}
