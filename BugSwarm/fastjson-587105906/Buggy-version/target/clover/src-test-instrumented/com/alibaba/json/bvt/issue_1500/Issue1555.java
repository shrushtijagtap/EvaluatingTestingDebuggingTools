/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1500;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import junit.framework.TestCase;

public class Issue1555 extends TestCase {static class __CLR4_1_101aub1aublusqk9yq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,60741,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101aub1aublusqk9yq.R.globalSliceStart(getClass().getName(),60707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1aub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101aub1aublusqk9yq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101aub1aublusqk9yq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1555.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60707,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1aub() throws Exception{try{__CLR4_1_101aub1aublusqk9yq.R.inc(60707);
        __CLR4_1_101aub1aublusqk9yq.R.inc(60708);Model model = new Model();
        __CLR4_1_101aub1aublusqk9yq.R.inc(60709);model.userId = 1001;
        __CLR4_1_101aub1aublusqk9yq.R.inc(60710);model.userName = "test";
        __CLR4_1_101aub1aublusqk9yq.R.inc(60711);String text = JSON.toJSONString(model);
        __CLR4_1_101aub1aublusqk9yq.R.inc(60712);assertEquals("{\"userName\":\"test\",\"user_id\":1001}", text);

        __CLR4_1_101aub1aublusqk9yq.R.inc(60713);Model model2 = JSON.parseObject(text, Model.class);

        __CLR4_1_101aub1aublusqk9yq.R.inc(60714);assertEquals(1001, model2.userId);
        __CLR4_1_101aub1aublusqk9yq.R.inc(60715);assertEquals("test", model2.userName);
    }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}

    /**
     * \u5f53\u67d0\u4e2a\u5b57\u6bb5\u6709JSONField\u6ce8\u89e3\uff0cJSONField\u4e2dname\u5c5e\u6027\u4e0d\u5b58\u5728\uff0cjson\u5c5e\u6027\u540d\u4e5f\u8981\u7528\u7c7b\u4e0a\u7684\u5c5e\u6027\u540d\u8f6c\u6362\u7b56\u7565
     * @throws Exception
     */
    public void test_when_JSONField_have_not_name_attr() throws Exception {__CLR4_1_101aub1aublusqk9yq.R.globalSliceStart(getClass().getName(),60716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10staxea1auk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101aub1aublusqk9yq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101aub1aublusqk9yq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1555.test_when_JSONField_have_not_name_attr",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60716,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10staxea1auk() throws Exception{try{__CLR4_1_101aub1aublusqk9yq.R.inc(60716);
        __CLR4_1_101aub1aublusqk9yq.R.inc(60717);ModelTwo modelTwo = new ModelTwo();
        __CLR4_1_101aub1aublusqk9yq.R.inc(60718);modelTwo.userId = 1001;
        __CLR4_1_101aub1aublusqk9yq.R.inc(60719);modelTwo.userName = "test";
        __CLR4_1_101aub1aublusqk9yq.R.inc(60720);String text = JSON.toJSONString(modelTwo);
        __CLR4_1_101aub1aublusqk9yq.R.inc(60721);assertEquals("{\"userName\":\"test\",\"user_id\":\"1001\"}", text);

        __CLR4_1_101aub1aublusqk9yq.R.inc(60722);Model model2 = JSON.parseObject(text, Model.class);

        __CLR4_1_101aub1aublusqk9yq.R.inc(60723);assertEquals(1001, model2.userId);
        __CLR4_1_101aub1aublusqk9yq.R.inc(60724);assertEquals("test", model2.userName);
    }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}

    @JSONType(naming = PropertyNamingStrategy.SnakeCase)
    public static class Model {
        private int userId;
        @JSONField(name = "userName")
        private String userName;

        public int getUserId() {try{__CLR4_1_101aub1aublusqk9yq.R.inc(60725);
            __CLR4_1_101aub1aublusqk9yq.R.inc(60726);return userId;
        }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}

        public void setUserId(int userId) {try{__CLR4_1_101aub1aublusqk9yq.R.inc(60727);
            __CLR4_1_101aub1aublusqk9yq.R.inc(60728);this.userId = userId;
        }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}

        public String getUserName() {try{__CLR4_1_101aub1aublusqk9yq.R.inc(60729);
            __CLR4_1_101aub1aublusqk9yq.R.inc(60730);return userName;
        }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}

        public void setUserName(String userName) {try{__CLR4_1_101aub1aublusqk9yq.R.inc(60731);
            __CLR4_1_101aub1aublusqk9yq.R.inc(60732);this.userName = userName;
        }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}
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

        public int getUserId() {try{__CLR4_1_101aub1aublusqk9yq.R.inc(60733);
            __CLR4_1_101aub1aublusqk9yq.R.inc(60734);return userId;
        }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}

        public void setUserId(int userId) {try{__CLR4_1_101aub1aublusqk9yq.R.inc(60735);
            __CLR4_1_101aub1aublusqk9yq.R.inc(60736);this.userId = userId;
        }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}

        public String getUserName() {try{__CLR4_1_101aub1aublusqk9yq.R.inc(60737);
            __CLR4_1_101aub1aublusqk9yq.R.inc(60738);return userName;
        }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}

        public void setUserName(String userName) {try{__CLR4_1_101aub1aublusqk9yq.R.inc(60739);
            __CLR4_1_101aub1aublusqk9yq.R.inc(60740);this.userName = userName;
        }finally{__CLR4_1_101aub1aublusqk9yq.R.flushNeeded();}}
    }
}
