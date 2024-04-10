/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1500;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import junit.framework.TestCase;

public class Issue1555 extends TestCase {static class __CLR4_5_21au01au0lusyjsvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60730,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21au01au0lusyjsvn.R.globalSliceStart(getClass().getName(),60696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1au0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21au01au0lusyjsvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21au01au0lusyjsvn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1555.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60696,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1au0() throws Exception{try{__CLR4_5_21au01au0lusyjsvn.R.inc(60696);
        __CLR4_5_21au01au0lusyjsvn.R.inc(60697);Model model = new Model();
        __CLR4_5_21au01au0lusyjsvn.R.inc(60698);model.userId = 1001;
        __CLR4_5_21au01au0lusyjsvn.R.inc(60699);model.userName = "test";
        __CLR4_5_21au01au0lusyjsvn.R.inc(60700);String text = JSON.toJSONString(model);
        __CLR4_5_21au01au0lusyjsvn.R.inc(60701);assertEquals("{\"userName\":\"test\",\"user_id\":1001}", text);

        __CLR4_5_21au01au0lusyjsvn.R.inc(60702);Model model2 = JSON.parseObject(text, Model.class);

        __CLR4_5_21au01au0lusyjsvn.R.inc(60703);assertEquals(1001, model2.userId);
        __CLR4_5_21au01au0lusyjsvn.R.inc(60704);assertEquals("test", model2.userName);
    }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}

    /**
     * \u5f53\u67d0\u4e2a\u5b57\u6bb5\u6709JSONField\u6ce8\u89e3\uff0cJSONField\u4e2dname\u5c5e\u6027\u4e0d\u5b58\u5728\uff0cjson\u5c5e\u6027\u540d\u4e5f\u8981\u7528\u7c7b\u4e0a\u7684\u5c5e\u6027\u540d\u8f6c\u6362\u7b56\u7565
     * @throws Exception
     */
    public void test_when_JSONField_have_not_name_attr() throws Exception {__CLR4_5_21au01au0lusyjsvn.R.globalSliceStart(getClass().getName(),60705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2staxea1au9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21au01au0lusyjsvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21au01au0lusyjsvn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1555.test_when_JSONField_have_not_name_attr",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2staxea1au9() throws Exception{try{__CLR4_5_21au01au0lusyjsvn.R.inc(60705);
        __CLR4_5_21au01au0lusyjsvn.R.inc(60706);ModelTwo modelTwo = new ModelTwo();
        __CLR4_5_21au01au0lusyjsvn.R.inc(60707);modelTwo.userId = 1001;
        __CLR4_5_21au01au0lusyjsvn.R.inc(60708);modelTwo.userName = "test";
        __CLR4_5_21au01au0lusyjsvn.R.inc(60709);String text = JSON.toJSONString(modelTwo);
        __CLR4_5_21au01au0lusyjsvn.R.inc(60710);assertEquals("{\"userName\":\"test\",\"user_id\":\"1001\"}", text);

        __CLR4_5_21au01au0lusyjsvn.R.inc(60711);Model model2 = JSON.parseObject(text, Model.class);

        __CLR4_5_21au01au0lusyjsvn.R.inc(60712);assertEquals(1001, model2.userId);
        __CLR4_5_21au01au0lusyjsvn.R.inc(60713);assertEquals("test", model2.userName);
    }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}

    @JSONType(naming = PropertyNamingStrategy.SnakeCase)
    public static class Model {
        private int userId;
        @JSONField(name = "userName")
        private String userName;

        public int getUserId() {try{__CLR4_5_21au01au0lusyjsvn.R.inc(60714);
            __CLR4_5_21au01au0lusyjsvn.R.inc(60715);return userId;
        }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}

        public void setUserId(int userId) {try{__CLR4_5_21au01au0lusyjsvn.R.inc(60716);
            __CLR4_5_21au01au0lusyjsvn.R.inc(60717);this.userId = userId;
        }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}

        public String getUserName() {try{__CLR4_5_21au01au0lusyjsvn.R.inc(60718);
            __CLR4_5_21au01au0lusyjsvn.R.inc(60719);return userName;
        }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}

        public void setUserName(String userName) {try{__CLR4_5_21au01au0lusyjsvn.R.inc(60720);
            __CLR4_5_21au01au0lusyjsvn.R.inc(60721);this.userName = userName;
        }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}
    }

    @JSONType(naming = PropertyNamingStrategy.SnakeCase)
    public static class ModelTwo {
        /**
         * \u6b64\u5b57\u6bb5\u51c6\u5907\u5e8f\u5217\u5316\u4e3a\u5b57\u7b26\u4e32\u7c7b\u578b
         */
        @JSONField(serializeUsing = StringSerializer.class)
        private int userId;
        @JSONField(name = "userName")
        private String userName;

        public int getUserId() {try{__CLR4_5_21au01au0lusyjsvn.R.inc(60722);
            __CLR4_5_21au01au0lusyjsvn.R.inc(60723);return userId;
        }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}

        public void setUserId(int userId) {try{__CLR4_5_21au01au0lusyjsvn.R.inc(60724);
            __CLR4_5_21au01au0lusyjsvn.R.inc(60725);this.userId = userId;
        }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}

        public String getUserName() {try{__CLR4_5_21au01au0lusyjsvn.R.inc(60726);
            __CLR4_5_21au01au0lusyjsvn.R.inc(60727);return userName;
        }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}

        public void setUserName(String userName) {try{__CLR4_5_21au01au0lusyjsvn.R.inc(60728);
            __CLR4_5_21au01au0lusyjsvn.R.inc(60729);this.userName = userName;
        }finally{__CLR4_5_21au01au0lusyjsvn.R.flushNeeded();}}
    }
}
