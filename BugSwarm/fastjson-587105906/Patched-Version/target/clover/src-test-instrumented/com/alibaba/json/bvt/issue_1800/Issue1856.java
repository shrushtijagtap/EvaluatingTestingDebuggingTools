/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1800;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.Labels;
import junit.framework.TestCase;

public class Issue1856 extends TestCase {static class __CLR4_5_21ck81ck8lusyjt1k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,62960,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_excludes() throws Exception {__CLR4_5_21ck81ck8lusyjt1k.R.globalSliceStart(getClass().getName(),62936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21bpoyb1ck8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ck81ck8lusyjt1k.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ck81ck8lusyjt1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1800.Issue1856.test_excludes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),62936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21bpoyb1ck8() throws Exception{try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62936);
        __CLR4_5_21ck81ck8lusyjt1k.R.inc(62937);VO vo = new VO();
        __CLR4_5_21ck81ck8lusyjt1k.R.inc(62938);vo.setId(123);
        __CLR4_5_21ck81ck8lusyjt1k.R.inc(62939);vo.setName("wenshao");
        __CLR4_5_21ck81ck8lusyjt1k.R.inc(62940);vo.setPassword("ooxxx");
        __CLR4_5_21ck81ck8lusyjt1k.R.inc(62941);vo.setInfo("fofo");

        __CLR4_5_21ck81ck8lusyjt1k.R.inc(62942);String text = JSON.toJSONString(vo, Labels.excludes("AuditIdEntity"));
        __CLR4_5_21ck81ck8lusyjt1k.R.inc(62943);assertEquals("{\"id\":123,\"info\":\"fofo\",\"name\":\"wenshao\"}", text);
    }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

    public static class VO {

        private int    id;
        private String name;
        private String password;
        private String info;

        @JSONField(label = "LogicDeleteEntity")
        public int getId() {try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62944);
            __CLR4_5_21ck81ck8lusyjt1k.R.inc(62945);return id;
        }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62946);
            __CLR4_5_21ck81ck8lusyjt1k.R.inc(62947);this.id = id;
        }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

        @JSONField(label = "LogicDeleteEntity")
        public String getName() {try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62948);
            __CLR4_5_21ck81ck8lusyjt1k.R.inc(62949);return name;
        }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62950);
            __CLR4_5_21ck81ck8lusyjt1k.R.inc(62951);this.name = name;
        }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

        @JSONField(label = "AuditIdEntity")
        public String getPassword() {try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62952);
            __CLR4_5_21ck81ck8lusyjt1k.R.inc(62953);return password;
        }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

        public void setPassword(String password) {try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62954);
            __CLR4_5_21ck81ck8lusyjt1k.R.inc(62955);this.password = password;
        }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

        public String getInfo() {try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62956);
            __CLR4_5_21ck81ck8lusyjt1k.R.inc(62957);return info;
        }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

        public void setInfo(String info) {try{__CLR4_5_21ck81ck8lusyjt1k.R.inc(62958);
            __CLR4_5_21ck81ck8lusyjt1k.R.inc(62959);this.info = info;
        }finally{__CLR4_5_21ck81ck8lusyjt1k.R.flushNeeded();}}

    }
}
