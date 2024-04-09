/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.label;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.Labels;

import junit.framework.TestCase;

public class LabelIncludeTest3 extends TestCase {static class __CLR4_5_21ww01ww0lusvnh5g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,89311,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_includes() throws Exception {__CLR4_5_21ww01ww0lusvnh5g.R.globalSliceStart(getClass().getName(),89280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x7z9pd1ww0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ww01ww0lusvnh5g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ww01ww0lusvnh5g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.label.LabelIncludeTest3.test_includes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x7z9pd1ww0() throws Exception{try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89280);
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89281);VO vo = new VO();
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89282);vo.setId(123);
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89283);vo.setName("wenshao");
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89284);vo.setPassword("ooxxx");

        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89285);String text = JSON.toJSONString(vo, Labels.includes("normal"));
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89286);Assert.assertEquals("{\"id\":123,\"name\":\"wenshao\"}", text);
    }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}
    
    public void test_excludes() throws Exception {__CLR4_5_21ww01ww0lusvnh5g.R.globalSliceStart(getClass().getName(),89287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21bpoyb1ww7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ww01ww0lusvnh5g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ww01ww0lusvnh5g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.label.LabelIncludeTest3.test_excludes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89287,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21bpoyb1ww7() throws Exception{try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89287);
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89288);VO vo = new VO();
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89289);vo.setId(123);
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89290);vo.setName("wenshao");
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89291);vo.setPassword("ooxxx");
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89292);vo.setInfo("fofo");

        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89293);String text = JSON.toJSONString(vo, Labels.excludes("secret"));
        __CLR4_5_21ww01ww0lusvnh5g.R.inc(89294);Assert.assertEquals("{\"id\":123,\"info\":\"fofo\",\"name\":\"wenshao\"}", text);
    }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

    public static class VO {

        private int    id;
        private String name;
        private String password;
        private String info;

        @JSONField(label = "normal")
        public int getId() {try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89295);
            __CLR4_5_21ww01ww0lusvnh5g.R.inc(89296);return id;
        }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89297);
            __CLR4_5_21ww01ww0lusvnh5g.R.inc(89298);this.id = id;
        }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

        @JSONField(label = "normal")
        public String getName() {try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89299);
            __CLR4_5_21ww01ww0lusvnh5g.R.inc(89300);return name;
        }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89301);
            __CLR4_5_21ww01ww0lusvnh5g.R.inc(89302);this.name = name;
        }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

        @JSONField(label = "secret")
        public String getPassword() {try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89303);
            __CLR4_5_21ww01ww0lusvnh5g.R.inc(89304);return password;
        }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

        public void setPassword(String password) {try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89305);
            __CLR4_5_21ww01ww0lusvnh5g.R.inc(89306);this.password = password;
        }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

        public String getInfo() {try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89307);
            __CLR4_5_21ww01ww0lusvnh5g.R.inc(89308);return info;
        }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

        public void setInfo(String info) {try{__CLR4_5_21ww01ww0lusvnh5g.R.inc(89309);
            __CLR4_5_21ww01ww0lusvnh5g.R.inc(89310);this.info = info;
        }finally{__CLR4_5_21ww01ww0lusvnh5g.R.flushNeeded();}}

    }
}
