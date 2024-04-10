/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1500;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class Issue1576 extends TestCase {static class __CLR4_1_101cqx1cqxluszwazz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,63221,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101cqx1cqxluszwazz.R.globalSliceStart(getClass().getName(),63177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1cqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101cqx1cqxluszwazz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101cqx1cqxluszwazz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1576.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63177,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1cqx() throws Exception{try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63177);
        __CLR4_1_101cqx1cqxluszwazz.R.inc(63178);String json = "{\"code\":200,\"in_msg\":\"a\",\"out_msg\":\"a\",\"data\":[{\"title\":\"a\",\"url\":\"url\",\"content\":\"content\"}],\"client_id\":0,\"client_param\":0,\"userid\":0}";
        __CLR4_1_101cqx1cqxluszwazz.R.inc(63179);NewsDetail newsDetail = JSON.parseObject(json, NewsDetail.class);
        __CLR4_1_101cqx1cqxluszwazz.R.inc(63180);assertNotNull(newsDetail);
    }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

    public static class NewsDetail {

        public int code;
        public String in_msg;
        public String out_msg;
        public String client_id;
        public String client_param;
        public String userid;
        public List<DataBean> data = new ArrayList<DataBean>();

        public int getCode() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63181);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63182);return code;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setCode(int code) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63183);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63184);this.code = code;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public String getIn_msg() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63185);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63186);return in_msg;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setIn_msg(String in_msg) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63187);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63188);this.in_msg = in_msg;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public String getOut_msg() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63189);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63190);return out_msg;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setOut_msg(String out_msg) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63191);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63192);this.out_msg = out_msg;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public String getClient_id() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63193);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63194);return client_id;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setClient_id(String client_id) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63195);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63196);this.client_id = client_id;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public String getClient_param() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63197);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63198);return client_param;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setClient_param(String client_param) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63199);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63200);this.client_param = client_param;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public String getUserid() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63201);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63202);return userid;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setUserid(String userid) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63203);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63204);this.userid = userid;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public List<DataBean> getData() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63205);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63206);return data;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setData(List<DataBean> data) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63207);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63208);this.data = data;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}
    }

    public static class DataBean {
        /**
         * title : \u4e2d\u5348
         * url : url
         * content : content
         */

        public String title;
        public String url;
        public String content;

        public String getTitle() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63209);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63210);return title;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setTitle(String title) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63211);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63212);this.title = title;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public String getUrl() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63213);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63214);return url;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setUrl(String url) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63215);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63216);this.url = url;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public String getContent() {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63217);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63218);return content;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}

        public void setContent(String content) {try{__CLR4_1_101cqx1cqxluszwazz.R.inc(63219);
            __CLR4_1_101cqx1cqxluszwazz.R.inc(63220);this.content = content;
        }finally{__CLR4_1_101cqx1cqxluszwazz.R.flushNeeded();}}
    }
}
