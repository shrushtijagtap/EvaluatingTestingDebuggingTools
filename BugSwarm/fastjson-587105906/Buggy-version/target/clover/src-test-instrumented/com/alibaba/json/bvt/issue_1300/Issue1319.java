/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

/**
 * Created by wenshao on 16/07/2017.
 */
public class Issue1319 extends TestCase {static class __CLR4_1_101avy1avyluszwal4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,60786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101avy1avyluszwal4.R.globalSliceStart(getClass().getName(),60766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1avy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101avy1avyluszwal4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101avy1avyluszwal4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1319.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60766,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1avy() throws Exception{try{__CLR4_1_101avy1avyluszwal4.R.inc(60766);
        __CLR4_1_101avy1avyluszwal4.R.inc(60767);MyTest test = new MyTest(1, MyEnum.Test1);
        __CLR4_1_101avy1avyluszwal4.R.inc(60768);String result = JSON.toJSONString(test, SerializerFeature.WriteClassName);
        __CLR4_1_101avy1avyluszwal4.R.inc(60769);System.out.println(result);
        __CLR4_1_101avy1avyluszwal4.R.inc(60770);test = JSON.parseObject(result, MyTest.class);
        __CLR4_1_101avy1avyluszwal4.R.inc(60771);System.out.println(JSON.toJSONString(test));
        __CLR4_1_101avy1avyluszwal4.R.inc(60772);assertEquals(MyEnum.Test1, test.getMyEnum());
        __CLR4_1_101avy1avyluszwal4.R.inc(60773);assertEquals(1, test.value);
    }finally{__CLR4_1_101avy1avyluszwal4.R.flushNeeded();}}

    @JSONType(seeAlso = {OtherEnum.class, MyEnum.class})
    interface EnumInterface{

    }
    @JSONType(typeName = "myEnum")
    enum MyEnum implements EnumInterface {
        Test1,
        Test2
    }
    @JSONType(typeName = "other")
    enum OtherEnum implements EnumInterface {
        Other
    }
    static class MyTest{
        private int value;
        private EnumInterface myEnum;

        public MyTest() {try{__CLR4_1_101avy1avyluszwal4.R.inc(60774);
        }finally{__CLR4_1_101avy1avyluszwal4.R.flushNeeded();}}

        public MyTest(int property, MyEnum enumProperty) {try{__CLR4_1_101avy1avyluszwal4.R.inc(60775);
            __CLR4_1_101avy1avyluszwal4.R.inc(60776);this.value = property;
            __CLR4_1_101avy1avyluszwal4.R.inc(60777);this.myEnum = enumProperty;
        }finally{__CLR4_1_101avy1avyluszwal4.R.flushNeeded();}}
        public int getValue() {try{__CLR4_1_101avy1avyluszwal4.R.inc(60778);
            __CLR4_1_101avy1avyluszwal4.R.inc(60779);return value;
        }finally{__CLR4_1_101avy1avyluszwal4.R.flushNeeded();}}
        public EnumInterface getMyEnum() {try{__CLR4_1_101avy1avyluszwal4.R.inc(60780);
            __CLR4_1_101avy1avyluszwal4.R.inc(60781);return myEnum;
        }finally{__CLR4_1_101avy1avyluszwal4.R.flushNeeded();}}
        public void setMyEnum(EnumInterface myEnum) {try{__CLR4_1_101avy1avyluszwal4.R.inc(60782);
            __CLR4_1_101avy1avyluszwal4.R.inc(60783);this.myEnum = myEnum;
        }finally{__CLR4_1_101avy1avyluszwal4.R.flushNeeded();}}
        public void setValue(int value) {try{__CLR4_1_101avy1avyluszwal4.R.inc(60784);
            __CLR4_1_101avy1avyluszwal4.R.inc(60785);this.value = value;
        }finally{__CLR4_1_101avy1avyluszwal4.R.flushNeeded();}}
    }
}
