/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.validate;

import com.alibaba.fastjson.JSONValidator;
import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class JSONValidateTest_file extends TestCase
{static class __CLR4_5_2wbywbylusyjpnk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,41936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_file() throws Exception {__CLR4_5_2wbywbylusyjpnk.R.globalSliceStart(getClass().getName(),41902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2633tqywby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wbywbylusyjpnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wbywbylusyjpnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_file.test_for_file",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2633tqywby() throws Exception{try{__CLR4_5_2wbywbylusyjpnk.R.inc(41902);
        __CLR4_5_2wbywbylusyjpnk.R.inc(41903);for (int i = 0; (((i < 10)&&(__CLR4_5_2wbywbylusyjpnk.R.iget(41904)!=0|true))||(__CLR4_5_2wbywbylusyjpnk.R.iget(41905)==0&false)); ++i) {{
            __CLR4_5_2wbywbylusyjpnk.R.inc(41906);long start = System.currentTimeMillis();

            __CLR4_5_2wbywbylusyjpnk.R.inc(41907);File file = new File("/Users/wenshao/Downloads/000002_0.json");
            __CLR4_5_2wbywbylusyjpnk.R.inc(41908);FileInputStream is = new FileInputStream(file);
            __CLR4_5_2wbywbylusyjpnk.R.inc(41909);JSONValidator validator = JSONValidator.fromUtf8(is);
            __CLR4_5_2wbywbylusyjpnk.R.inc(41910);assertTrue(validator.validate());
            __CLR4_5_2wbywbylusyjpnk.R.inc(41911);validator.close();

            // 642 335 796
            __CLR4_5_2wbywbylusyjpnk.R.inc(41912);System.out.println("millis " + (System.currentTimeMillis() - start));
        }
    }}finally{__CLR4_5_2wbywbylusyjpnk.R.flushNeeded();}}

    public void test_for_file2() throws Exception {__CLR4_5_2wbywbylusyjpnk.R.globalSliceStart(getClass().getName(),41913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23tm9muwc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wbywbylusyjpnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wbywbylusyjpnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_file.test_for_file2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23tm9muwc9() throws Exception{try{__CLR4_5_2wbywbylusyjpnk.R.inc(41913);
        __CLR4_5_2wbywbylusyjpnk.R.inc(41914);File file = new File("/Users/wenshao/Downloads/000002_0.json");
        __CLR4_5_2wbywbylusyjpnk.R.inc(41915);byte[] bytes = FileUtils.readFileToByteArray(file);

        __CLR4_5_2wbywbylusyjpnk.R.inc(41916);for (int i = 0; (((i < 10)&&(__CLR4_5_2wbywbylusyjpnk.R.iget(41917)!=0|true))||(__CLR4_5_2wbywbylusyjpnk.R.iget(41918)==0&false)); ++i) {{
            __CLR4_5_2wbywbylusyjpnk.R.inc(41919);long start = System.currentTimeMillis();

            __CLR4_5_2wbywbylusyjpnk.R.inc(41920);ByteArrayInputStream is = new ByteArrayInputStream(bytes);

            __CLR4_5_2wbywbylusyjpnk.R.inc(41921);JSONValidator validator = JSONValidator.fromUtf8(is);
            __CLR4_5_2wbywbylusyjpnk.R.inc(41922);assertTrue(validator.validate());
            __CLR4_5_2wbywbylusyjpnk.R.inc(41923);validator.close();

            // 642 335 796
            __CLR4_5_2wbywbylusyjpnk.R.inc(41924);System.out.println("millis " + (System.currentTimeMillis() - start));
        }
    }}finally{__CLR4_5_2wbywbylusyjpnk.R.flushNeeded();}}


    public void test_for_fileReader() throws Exception {__CLR4_5_2wbywbylusyjpnk.R.globalSliceStart(getClass().getName(),41925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pk54h5wcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wbywbylusyjpnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wbywbylusyjpnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_file.test_for_fileReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41925,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pk54h5wcl() throws Exception{try{__CLR4_5_2wbywbylusyjpnk.R.inc(41925);
        __CLR4_5_2wbywbylusyjpnk.R.inc(41926);for (int i = 0; (((i < 10)&&(__CLR4_5_2wbywbylusyjpnk.R.iget(41927)!=0|true))||(__CLR4_5_2wbywbylusyjpnk.R.iget(41928)==0&false)); ++i) {{
            __CLR4_5_2wbywbylusyjpnk.R.inc(41929);long start = System.currentTimeMillis();

            __CLR4_5_2wbywbylusyjpnk.R.inc(41930);File file = new File("/Users/wenshao/Downloads/000002_0.json");
            __CLR4_5_2wbywbylusyjpnk.R.inc(41931);Reader is = new InputStreamReader(new FileInputStream(file), "UTF8");
            __CLR4_5_2wbywbylusyjpnk.R.inc(41932);JSONValidator validator = JSONValidator.from(is);
            __CLR4_5_2wbywbylusyjpnk.R.inc(41933);assertTrue(validator.validate());
            __CLR4_5_2wbywbylusyjpnk.R.inc(41934);validator.close();

            // 642 335 796
            __CLR4_5_2wbywbylusyjpnk.R.inc(41935);System.out.println("millis " + (System.currentTimeMillis() - start));
        }
    }}finally{__CLR4_5_2wbywbylusyjpnk.R.flushNeeded();}}
}
