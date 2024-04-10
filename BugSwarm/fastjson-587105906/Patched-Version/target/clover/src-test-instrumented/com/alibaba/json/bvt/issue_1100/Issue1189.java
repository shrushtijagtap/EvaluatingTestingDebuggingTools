/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1100;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import junit.framework.TestCase;

import java.util.Map;

/**
 * Created by wenshao on 10/05/2017.
 */
public class Issue1189 extends TestCase {static class __CLR4_5_219hz19hzlusyjsoj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59001,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_219hz19hzlusyjsoj.R.globalSliceStart(getClass().getName(),58967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb19hz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219hz19hzlusyjsoj.R.rethrow($CLV_t2$);}finally{__CLR4_5_219hz19hzlusyjsoj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1100.Issue1189.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb19hz() throws Exception{try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58967);
        __CLR4_5_219hz19hzlusyjsoj.R.inc(58968);String str = new String("{\"headernotificationType\": \"PUSH\",\"headertemplateNo\": \"99\",\"headerdestination\": [{\"target\": \"all\",\"targetvalue\": \"all\"}],\"body\": [{\"title\": \"\u9884\u7ea6\u8d85\u65f6\",\"body\": \"\u60a8\u7684\u9884\u7ea6\u5df2\u7ecf\u8d85\u65f6\"}]}");

        __CLR4_5_219hz19hzlusyjsoj.R.inc(58969);JsonBean objeclt = JSON.parseObject(str, JsonBean.class);
        __CLR4_5_219hz19hzlusyjsoj.R.inc(58970);Map<String, String> list = objeclt.getBody();
        __CLR4_5_219hz19hzlusyjsoj.R.inc(58971);System.out.println(list.get("body"));
    }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}

    public static class JsonBean {
        private Map<String, String> body;
        private int headertemplateno;
        private Map<String, String> headerdestination;
        private String headernotificationtype;
        private String notificationType;



        public Map<String, String> getBody() {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58972);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58973);return body;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public void setBody(Map<String, String> body) {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58974);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58975);this.body = body;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public int getHeadertemplateno() {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58976);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58977);return headertemplateno;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public void setHeadertemplateno(int headertemplateno) {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58978);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58979);this.headertemplateno = headertemplateno;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public Map<String, String> getHeaderdestination() {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58980);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58981);return headerdestination;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public void setHeaderdestination(Map<String, String> headerdestination) {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58982);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58983);this.headerdestination = headerdestination;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public String getHeadernotificationtype() {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58984);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58985);return headernotificationtype;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public void setHeadernotificationtype(String headernotificationtype) {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58986);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58987);this.headernotificationtype = headernotificationtype;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public String getNotificationType() {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58988);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58989);return notificationType;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public void setNotificationType(String notificationType) {try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58990);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58991);this.notificationType = notificationType;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public JsonBean(Map<String, String> body, int headertemplateno,
                        Map<String, String> headerdestination,
                        String headernotificationtype, String notificationType) {
            super();__CLR4_5_219hz19hzlusyjsoj.R.inc(58993);try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58992);
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58994);this.body = body;
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58995);this.headertemplateno = headertemplateno;
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58996);this.headerdestination = headerdestination;
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58997);this.headernotificationtype = headernotificationtype;
            __CLR4_5_219hz19hzlusyjsoj.R.inc(58998);this.notificationType = notificationType;
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}
        public JsonBean() {
            super();__CLR4_5_219hz19hzlusyjsoj.R.inc(59000);try{__CLR4_5_219hz19hzlusyjsoj.R.inc(58999);
            // TODO Auto-generated constructor stub
        }finally{__CLR4_5_219hz19hzlusyjsoj.R.flushNeeded();}}

    }
}
