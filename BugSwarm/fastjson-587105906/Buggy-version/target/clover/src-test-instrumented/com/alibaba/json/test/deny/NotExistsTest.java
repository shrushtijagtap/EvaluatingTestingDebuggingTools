/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.deny;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import junit.framework.TestCase;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by wenshao on 28/01/2017.
 */
public class NotExistsTest extends TestCase {static class __CLR4_1_1024is24islusqkuto{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,99191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_1024is24islusqkuto.R.globalSliceStart(getClass().getName(),99172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp224is();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1024is24islusqkuto.R.rethrow($CLV_t2$);}finally{__CLR4_1_1024is24islusqkuto.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.deny.NotExistsTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),99172,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp224is() throws Exception{try{__CLR4_1_1024is24islusqkuto.R.inc(99172);
        __CLR4_1_1024is24islusqkuto.R.inc(99173);Field field = TypeUtils.class.getDeclaredField("mappings");
        __CLR4_1_1024is24islusqkuto.R.inc(99174);field.setAccessible(true);

        __CLR4_1_1024is24islusqkuto.R.inc(99175);ConcurrentMap<String, Class<?>> mappings = (ConcurrentMap<String, Class<?>>) field.get(null);
        __CLR4_1_1024is24islusqkuto.R.inc(99176);System.out.println(mappings.size());
//         ParserConfig.global.setAutoTypeSupport(true);
        __CLR4_1_1024is24islusqkuto.R.inc(99177);for (int i = 0; (((i < 10)&&(__CLR4_1_1024is24islusqkuto.R.iget(99178)!=0|true))||(__CLR4_1_1024is24islusqkuto.R.iget(99179)==0&false)); ++i) {{
            __CLR4_1_1024is24islusqkuto.R.inc(99180);long start = System.currentTimeMillis();
            __CLR4_1_1024is24islusqkuto.R.inc(99181);perf();
            __CLR4_1_1024is24islusqkuto.R.inc(99182);long millis = System.currentTimeMillis() - start;
            __CLR4_1_1024is24islusqkuto.R.inc(99183);System.out.println("millis : " + millis);
        }
    }}finally{__CLR4_1_1024is24islusqkuto.R.flushNeeded();}}

    private void perf() {try{__CLR4_1_1024is24islusqkuto.R.inc(99184);
        __CLR4_1_1024is24islusqkuto.R.inc(99185);for (int i = 0; (((i < 1000 * 1)&&(__CLR4_1_1024is24islusqkuto.R.iget(99186)!=0|true))||(__CLR4_1_1024is24islusqkuto.R.iget(99187)==0&false)); ++i) {{
            __CLR4_1_1024is24islusqkuto.R.inc(99188);String text = "[{\"@type\":\"x0\"},{\"@type\":\"x1\"},{\"@type\":\"x2\"},{\"@type\":\"x3\"},{\"@type\":\"x4\"}]";
            __CLR4_1_1024is24islusqkuto.R.inc(99189);try {
                __CLR4_1_1024is24islusqkuto.R.inc(99190);JSON.parseObject(text);
            } catch (Exception ex) {
                // skip
            }
        }
    }}finally{__CLR4_1_1024is24islusqkuto.R.flushNeeded();}}
}
