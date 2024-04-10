/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PascalNameFilter;

public class PascalNameFilterTest extends TestCase {static class __CLR4_1_101tfa1tfaluszwf49{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101tfa1tfaluszwf49.R.globalSliceStart(getClass().getName(),84790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21tfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tfa1tfaluszwf49.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tfa1tfaluszwf49.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PascalNameFilterTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84790,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21tfa() throws Exception{try{__CLR4_1_101tfa1tfaluszwf49.R.inc(84790);
        __CLR4_1_101tfa1tfaluszwf49.R.inc(84791);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101tfa1tfaluszwf49.R.inc(84792);serializer.getNameFilters().add(new PascalNameFilter());
        
        __CLR4_1_101tfa1tfaluszwf49.R.inc(84793);VO vo = new VO();
        __CLR4_1_101tfa1tfaluszwf49.R.inc(84794);vo.setId(123);
        __CLR4_1_101tfa1tfaluszwf49.R.inc(84795);vo.setName("wenshao");
        
        __CLR4_1_101tfa1tfaluszwf49.R.inc(84796);serializer.write(vo);

        __CLR4_1_101tfa1tfaluszwf49.R.inc(84797);Assert.assertEquals("{\"Id\":123,\"Name\":\"wenshao\"}", serializer.toString());
        
        __CLR4_1_101tfa1tfaluszwf49.R.inc(84798);serializer.close();
    }finally{__CLR4_1_101tfa1tfaluszwf49.R.flushNeeded();}}

    public static class VO {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101tfa1tfaluszwf49.R.inc(84799);
            __CLR4_1_101tfa1tfaluszwf49.R.inc(84800);return id;
        }finally{__CLR4_1_101tfa1tfaluszwf49.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101tfa1tfaluszwf49.R.inc(84801);
            __CLR4_1_101tfa1tfaluszwf49.R.inc(84802);this.id = id;
        }finally{__CLR4_1_101tfa1tfaluszwf49.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101tfa1tfaluszwf49.R.inc(84803);
            __CLR4_1_101tfa1tfaluszwf49.R.inc(84804);return name;
        }finally{__CLR4_1_101tfa1tfaluszwf49.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101tfa1tfaluszwf49.R.inc(84805);
            __CLR4_1_101tfa1tfaluszwf49.R.inc(84806);this.name = name;
        }finally{__CLR4_1_101tfa1tfaluszwf49.R.flushNeeded();}}

    }
}
