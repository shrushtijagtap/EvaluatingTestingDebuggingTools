/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class Bug_for_issue_330 extends TestCase {static class __CLR4_1_10158i158iluszw8hh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,53468,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_10158i158iluszw8hh.R.globalSliceStart(getClass().getName(),53442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb158i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10158i158iluszw8hh.R.rethrow($CLV_t2$);}finally{__CLR4_1_10158i158iluszw8hh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_330.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53442,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb158i() throws Exception{try{__CLR4_1_10158i158iluszw8hh.R.inc(53442);
        __CLR4_1_10158i158iluszw8hh.R.inc(53443);String jsonContent = "{\"data\":{\"content\":\"xxx\",\"hour\":1}}";
        __CLR4_1_10158i158iluszw8hh.R.inc(53444);StatusBean<WorkBean> bean = JSONObject.parseObject(jsonContent,
                                      new TypeReference<StatusBean<WorkBean>>() {
                                    });
        
        __CLR4_1_10158i158iluszw8hh.R.inc(53445);Assert.assertNotNull(bean.getData());
        __CLR4_1_10158i158iluszw8hh.R.inc(53446);Assert.assertEquals(1, bean.getData().getHour());
        __CLR4_1_10158i158iluszw8hh.R.inc(53447);Assert.assertEquals("xxx", bean.getData().getContent());
    }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

    public static class StatusBean<T> {

        private int    code;
        private String msg;
        private T      data;

        public int getCode() {try{__CLR4_1_10158i158iluszw8hh.R.inc(53448);
            __CLR4_1_10158i158iluszw8hh.R.inc(53449);return code;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

        public void setCode(int code) {try{__CLR4_1_10158i158iluszw8hh.R.inc(53450);
            __CLR4_1_10158i158iluszw8hh.R.inc(53451);this.code = code;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

        public String getMsg() {try{__CLR4_1_10158i158iluszw8hh.R.inc(53452);
            __CLR4_1_10158i158iluszw8hh.R.inc(53453);return msg;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

        public void setMsg(String msg) {try{__CLR4_1_10158i158iluszw8hh.R.inc(53454);
            __CLR4_1_10158i158iluszw8hh.R.inc(53455);this.msg = msg;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

        public T getData() {try{__CLR4_1_10158i158iluszw8hh.R.inc(53456);
            __CLR4_1_10158i158iluszw8hh.R.inc(53457);return data;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

        public void setData(T data) {try{__CLR4_1_10158i158iluszw8hh.R.inc(53458);
            __CLR4_1_10158i158iluszw8hh.R.inc(53459);this.data = data;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

    }

    public static class WorkBean {

        private int    hour;
        private String content;

        public int getHour() {try{__CLR4_1_10158i158iluszw8hh.R.inc(53460);
            __CLR4_1_10158i158iluszw8hh.R.inc(53461);return hour;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

        public void setHour(int hour) {try{__CLR4_1_10158i158iluszw8hh.R.inc(53462);
            __CLR4_1_10158i158iluszw8hh.R.inc(53463);this.hour = hour;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

        public String getContent() {try{__CLR4_1_10158i158iluszw8hh.R.inc(53464);
            __CLR4_1_10158i158iluszw8hh.R.inc(53465);return content;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

        public void setContent(String content) {try{__CLR4_1_10158i158iluszw8hh.R.inc(53466);
            __CLR4_1_10158i158iluszw8hh.R.inc(53467);this.content = content;
        }finally{__CLR4_1_10158i158iluszw8hh.R.flushNeeded();}}

    }
}
