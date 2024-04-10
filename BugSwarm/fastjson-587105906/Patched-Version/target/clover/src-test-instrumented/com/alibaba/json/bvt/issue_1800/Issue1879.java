/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1800;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class Issue1879 extends TestCase {static class __CLR4_5_21clh1clhlusyjt1o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,62999,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
//    public void test_for_issue() throws Exception {
//        String json = "{\n" +
//                "   \"ids\" : \"1,2,3\"\n" +
//                "}";
//        M1 m = JSON.parseObject(json, M1.class);
//    }

    public void test_for_issue_2() throws Exception {__CLR4_5_21clh1clhlusyjt1o.R.globalSliceStart(getClass().getName(),62981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8suuo1clh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21clh1clhlusyjt1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21clh1clhlusyjt1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1800.Issue1879.test_for_issue_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),62981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8suuo1clh() throws Exception{try{__CLR4_5_21clh1clhlusyjt1o.R.inc(62981);
        __CLR4_5_21clh1clhlusyjt1o.R.inc(62982);String json = "{\n" +
                "   \"ids\" : \"1,2,3\"\n" +
                "}";
        __CLR4_5_21clh1clhlusyjt1o.R.inc(62983);M2 m = JSON.parseObject(json, M2.class);
    }finally{__CLR4_5_21clh1clhlusyjt1o.R.flushNeeded();}}

    public static class M1 {
        private List<Long> ids;

        @JSONCreator
        public M1(@JSONField(name = "ids") String ids) {try{__CLR4_5_21clh1clhlusyjt1o.R.inc(62984);
            __CLR4_5_21clh1clhlusyjt1o.R.inc(62985);this.ids = new ArrayList<Long>();
            __CLR4_5_21clh1clhlusyjt1o.R.inc(62986);for(String id : ids.split(",")) {{
                __CLR4_5_21clh1clhlusyjt1o.R.inc(62987);this.ids.add(Long.valueOf(id));
            }
        }}finally{__CLR4_5_21clh1clhlusyjt1o.R.flushNeeded();}}

        public List<Long> getIds() {try{__CLR4_5_21clh1clhlusyjt1o.R.inc(62988);
            __CLR4_5_21clh1clhlusyjt1o.R.inc(62989);return ids;
        }finally{__CLR4_5_21clh1clhlusyjt1o.R.flushNeeded();}}

        public void setIds(List<Long> ids) {try{__CLR4_5_21clh1clhlusyjt1o.R.inc(62990);
            __CLR4_5_21clh1clhlusyjt1o.R.inc(62991);this.ids = ids;
        }finally{__CLR4_5_21clh1clhlusyjt1o.R.flushNeeded();}}
    }

    public static class M2 {
        private List<Long> ids;

        @JSONCreator
        public M2(@JSONField(name = "ids") Long id) {try{__CLR4_5_21clh1clhlusyjt1o.R.inc(62992);
            __CLR4_5_21clh1clhlusyjt1o.R.inc(62993);this.ids = new ArrayList<Long>();
            __CLR4_5_21clh1clhlusyjt1o.R.inc(62994);this.ids.add(id);
        }finally{__CLR4_5_21clh1clhlusyjt1o.R.flushNeeded();}}

        public List<Long> getIds() {try{__CLR4_5_21clh1clhlusyjt1o.R.inc(62995);
            __CLR4_5_21clh1clhlusyjt1o.R.inc(62996);return ids;
        }finally{__CLR4_5_21clh1clhlusyjt1o.R.flushNeeded();}}

        public void setIds(List<Long> ids) {try{__CLR4_5_21clh1clhlusyjt1o.R.inc(62997);
            __CLR4_5_21clh1clhlusyjt1o.R.inc(62998);this.ids = ids;
        }finally{__CLR4_5_21clh1clhlusyjt1o.R.flushNeeded();}}
    }
}
