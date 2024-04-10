/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.autoType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import junit.framework.TestCase;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentMap;

public class AutoTypeTest5 extends TestCase {static class __CLR4_5_21jge1jgelusyjtwm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ConcurrentMap<String,Class<?>> mappings;

    private static int count_x = 0;

    protected void setUp() throws Exception {try{__CLR4_5_21jge1jgelusyjtwm.R.inc(71870);
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71871);Field field = TypeUtils.class.getDeclaredField("mappings");
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71872);field.setAccessible(true);

        __CLR4_5_21jge1jgelusyjtwm.R.inc(71873);mappings = (ConcurrentMap<String,Class<?>>) field.get(null);
    }finally{__CLR4_5_21jge1jgelusyjtwm.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21jge1jgelusyjtwm.R.globalSliceStart(getClass().getName(),71874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21jgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jge1jgelusyjtwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jge1jgelusyjtwm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.autoType.AutoTypeTest5.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21jgi() throws Exception{try{__CLR4_5_21jge1jgelusyjtwm.R.inc(71874);
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71875);ParserConfig config = new ParserConfig();
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71876);assertFalse(config.isAutoTypeSupport());
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71877);JSON.parseObject("{\"value\":{\"@type\":\"com.alibaba.json.bvt.parser.autoType.AutoTypeTest5$V1\"}}", Model.class, config);

        __CLR4_5_21jge1jgelusyjtwm.R.inc(71878);int size = mappings.size();
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71879);Exception error = null;
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71880);try {
            __CLR4_5_21jge1jgelusyjtwm.R.inc(71881);JSON.parseObject("{\"value\":{\"@type\":\"com.alibaba.json.bvt.parser.autoType.AutoTypeTest5$X1\"}}", Model.class, config);
        } catch (JSONException x) {
            __CLR4_5_21jge1jgelusyjtwm.R.inc(71882);error = x;
        }
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71883);assertNotNull(error);
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71884);assertEquals(0, count_x);
        __CLR4_5_21jge1jgelusyjtwm.R.inc(71885);assertEquals(size, mappings.size());
    }finally{__CLR4_5_21jge1jgelusyjtwm.R.flushNeeded();}}

    public static class Model {
        public V0 value;
    }

    public static class V0 {

    }

    public static class V1 extends V0 {

    }

    public static class X1 {
        static {try{__CLR4_5_21jge1jgelusyjtwm.R.inc(71886);
            __CLR4_5_21jge1jgelusyjtwm.R.inc(71887);count_x++;
        }finally{__CLR4_5_21jge1jgelusyjtwm.R.flushNeeded();}}
    }
}
