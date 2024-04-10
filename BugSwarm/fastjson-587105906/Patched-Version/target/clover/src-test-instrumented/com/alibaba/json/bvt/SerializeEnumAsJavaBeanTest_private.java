/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializeConfig;
import junit.framework.TestCase;

/**
 * Created by wenshao on 08/01/2017.
 */
public class SerializeEnumAsJavaBeanTest_private extends TestCase {static class __CLR4_5_2zeszeslusyjq7w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,45909,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_serializeEnumAsJavaBean() throws Exception {__CLR4_5_2zeszeslusyjq7w.R.globalSliceStart(getClass().getName(),45892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a2jt8fzes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zeszeslusyjq7w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zeszeslusyjq7w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.SerializeEnumAsJavaBeanTest_private.test_serializeEnumAsJavaBean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a2jt8fzes() throws Exception{try{__CLR4_5_2zeszeslusyjq7w.R.inc(45892);
        __CLR4_5_2zeszeslusyjq7w.R.inc(45893);String text = JSON.toJSONString(OrderType.PayOrder);
        __CLR4_5_2zeszeslusyjq7w.R.inc(45894);assertEquals("{\"remark\":\"\u652f\u4ed8\u8ba2\u5355\",\"value\":1}", text);
    }finally{__CLR4_5_2zeszeslusyjq7w.R.flushNeeded();}}

    public void test_field() throws Exception {__CLR4_5_2zeszeslusyjq7w.R.globalSliceStart(getClass().getName(),45895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vh3vwszev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zeszeslusyjq7w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zeszeslusyjq7w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.SerializeEnumAsJavaBeanTest_private.test_field",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vh3vwszev() throws Exception{try{__CLR4_5_2zeszeslusyjq7w.R.inc(45895);
        __CLR4_5_2zeszeslusyjq7w.R.inc(45896);Model model = new Model();
        __CLR4_5_2zeszeslusyjq7w.R.inc(45897);model.orderType = OrderType.SettleBill;
        __CLR4_5_2zeszeslusyjq7w.R.inc(45898);String text = JSON.toJSONString(model);
        __CLR4_5_2zeszeslusyjq7w.R.inc(45899);assertEquals("{\"orderType\":{\"remark\":\"\u7ed3\u7b97\u5355\",\"value\":2}}", text);
    }finally{__CLR4_5_2zeszeslusyjq7w.R.flushNeeded();}}

    public void test_field_2() throws Exception {__CLR4_5_2zeszeslusyjq7w.R.globalSliceStart(getClass().getName(),45900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ix0sljzf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zeszeslusyjq7w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zeszeslusyjq7w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.SerializeEnumAsJavaBeanTest_private.test_field_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ix0sljzf0() throws Exception{try{__CLR4_5_2zeszeslusyjq7w.R.inc(45900);
        __CLR4_5_2zeszeslusyjq7w.R.inc(45901);Model model = new Model();
        __CLR4_5_2zeszeslusyjq7w.R.inc(45902);model.orderType = OrderType.SettleBill;
        __CLR4_5_2zeszeslusyjq7w.R.inc(45903);model.orderType1 = OrderType.SettleBill;
        __CLR4_5_2zeszeslusyjq7w.R.inc(45904);String text = JSON.toJSONString(model);
        __CLR4_5_2zeszeslusyjq7w.R.inc(45905);assertEquals("{\"orderType\":{\"remark\":\"\u7ed3\u7b97\u5355\",\"value\":2},\"orderType1\":{\"remark\":\"\u7ed3\u7b97\u5355\",\"value\":2}}", text);
    }finally{__CLR4_5_2zeszeslusyjq7w.R.flushNeeded();}}

    @JSONType(serializeEnumAsJavaBean = true)
    private static enum OrderType {
        PayOrder(1, "\u652f\u4ed8\u8ba2\u5355"), //
        SettleBill(2, "\u7ed3\u7b97\u5355");

        public final int value;
        public final String remark;

        private OrderType(int value, String remark) {try{__CLR4_5_2zeszeslusyjq7w.R.inc(45906);
            __CLR4_5_2zeszeslusyjq7w.R.inc(45907);this.value = value;
            __CLR4_5_2zeszeslusyjq7w.R.inc(45908);this.remark = remark;
        }finally{__CLR4_5_2zeszeslusyjq7w.R.flushNeeded();}}
    }

    private static class Model {
        public OrderType orderType;
        public OrderType orderType1;
    }
}
