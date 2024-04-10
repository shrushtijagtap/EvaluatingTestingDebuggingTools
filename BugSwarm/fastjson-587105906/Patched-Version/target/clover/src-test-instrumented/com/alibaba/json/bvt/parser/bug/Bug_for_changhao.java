/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

public class Bug_for_changhao extends TestCase {static class __CLR4_5_21ji21ji2lusyjtws{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71946,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_bug() throws Exception {__CLR4_5_21ji21ji2lusyjtws.R.globalSliceStart(getClass().getName(),71930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yy5c3c1ji2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ji21ji2lusyjtws.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ji21ji2lusyjtws.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.bug.Bug_for_changhao.test_for_bug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yy5c3c1ji2() throws Exception{try{__CLR4_5_21ji21ji2lusyjtws.R.inc(71930);
        __CLR4_5_21ji21ji2lusyjtws.R.inc(71931);String s = "{\"intValue\":1,\"stringValue\":\"abc\"}";
        __CLR4_5_21ji21ji2lusyjtws.R.inc(71932);ParserConfig parseConfig = new ParserConfig();
        __CLR4_5_21ji21ji2lusyjtws.R.inc(71933);parseConfig.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        __CLR4_5_21ji21ji2lusyjtws.R.inc(71934);TestClass t = JSON.parseObject(s, TestClass.class, parseConfig, Feature.DisableFieldSmartMatch);
        __CLR4_5_21ji21ji2lusyjtws.R.inc(71935);System.out.println(JSON.toJSONString(t));
    }finally{__CLR4_5_21ji21ji2lusyjtws.R.flushNeeded();}}

    static class TestClass {
        String stringValue;
        int intValue;

        /**
         * Getter method for property <tt>stringValue</tt>.
         *
         * @return property value of stringValue
         */
        public String getStringValue() {try{__CLR4_5_21ji21ji2lusyjtws.R.inc(71936);
            __CLR4_5_21ji21ji2lusyjtws.R.inc(71937);return stringValue;
        }finally{__CLR4_5_21ji21ji2lusyjtws.R.flushNeeded();}}

        /**
         * Setter method for property <tt>stringValue</tt>.
         *
         * @param stringValue  value to be assigned to property stringValue
         */
        public TestClass setStringValue(String stringValue) {try{__CLR4_5_21ji21ji2lusyjtws.R.inc(71938);
            __CLR4_5_21ji21ji2lusyjtws.R.inc(71939);this.stringValue = stringValue;
            __CLR4_5_21ji21ji2lusyjtws.R.inc(71940);return this;
        }finally{__CLR4_5_21ji21ji2lusyjtws.R.flushNeeded();}}

        /**
         * Getter method for property <tt>intValue</tt>.
         *
         * @return property value of intValue
         */
        public int getIntValue() {try{__CLR4_5_21ji21ji2lusyjtws.R.inc(71941);
            __CLR4_5_21ji21ji2lusyjtws.R.inc(71942);return intValue;
        }finally{__CLR4_5_21ji21ji2lusyjtws.R.flushNeeded();}}

        /**
         * Setter method for property <tt>intValue</tt>.
         *
         * @param intValue  value to be assigned to property intValue
         */
        public TestClass setIntValue(int intValue) {try{__CLR4_5_21ji21ji2lusyjtws.R.inc(71943);
            __CLR4_5_21ji21ji2lusyjtws.R.inc(71944);this.intValue = intValue;
            __CLR4_5_21ji21ji2lusyjtws.R.inc(71945);return this;
        }finally{__CLR4_5_21ji21ji2lusyjtws.R.flushNeeded();}}
    }
}
