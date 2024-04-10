/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

/**
 * Created by wenshao on 23/07/2017.
 */
public class Issue1320 extends TestCase {static class __CLR4_5_219xz19xzlusyjsrp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_219xz19xzlusyjsrp.R.globalSliceStart(getClass().getName(),59543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb19xz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219xz19xzlusyjsrp.R.rethrow($CLV_t2$);}finally{__CLR4_5_219xz19xzlusyjsrp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1320.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59543,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb19xz() throws Exception{try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59543);
        __CLR4_5_219xz19xzlusyjsrp.R.inc(59544);SSOToken token = new SSOToken();
        __CLR4_5_219xz19xzlusyjsrp.R.inc(59545);JSON.toJSONString(token);
    }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}

    @SuppressWarnings("serial")
    public static class SSOToken extends Token {

        /* \u767b\u5f55\u7c7b\u578b */
        private Integer type;

        /* \u9884\u7559 */
        private String data;

        /**
         * <p>
         * \u9884\u7559\u5bf9\u8c61\uff0c\u9ed8\u8ba4 fastjson \u4e0d\u53c2\u4e0e\u5e8f\u5217\u5316\uff08\u4e5f\u5c31\u662f\u4e0d\u5b58\u653e\u5728 cookie \u4e2d \uff09
         * </p>
         * <p>
         * \u6b64\u5904\u914d\u5408\u5206\u5e03\u5f0f\u7f13\u5b58\u4f7f\u7528\uff0c\u53ef\u4ee5\u5b58\u653e\u7528\u6237\u5e38\u7528\u57fa\u672c\u4fe1\u606f
         * </p>
         */
        @JSONField(serialize = false)
        private Object object;

        public SSOToken() {try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59546);
            //this.setApp(SSOConfig.getInstance().getRole());
        }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}

        public Integer getType() {try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59547);
            __CLR4_5_219xz19xzlusyjsrp.R.inc(59548);return type;
        }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}

        public void setType(Integer type) {try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59549);
            __CLR4_5_219xz19xzlusyjsrp.R.inc(59550);this.type = type;
        }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}

        public String getData() {try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59551);
            __CLR4_5_219xz19xzlusyjsrp.R.inc(59552);return data;
        }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}

        public void setData(String data) {try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59553);
            __CLR4_5_219xz19xzlusyjsrp.R.inc(59554);this.data = data;
        }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}

        /**
         * \u7f13\u5b58\u7528\u6237\u4fe1\u606f\uff0c\u81ea\u52a8\u7c7b\u578b\u8f6c\u6362
         */
        @SuppressWarnings("unchecked")
        public <T> T getCacheObject() {try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59555);
            __CLR4_5_219xz19xzlusyjsrp.R.inc(59556);return (T) this.getObject();
        }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}

        public Object getObject() {try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59557);
            __CLR4_5_219xz19xzlusyjsrp.R.inc(59558);return object;
        }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}

        public void setObject(Object object) {try{__CLR4_5_219xz19xzlusyjsrp.R.inc(59559);
            __CLR4_5_219xz19xzlusyjsrp.R.inc(59560);this.object = object;
        }finally{__CLR4_5_219xz19xzlusyjsrp.R.flushNeeded();}}
    }

    public static class Token {

    }
}
