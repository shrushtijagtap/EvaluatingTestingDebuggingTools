/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import junit.framework.TestCase;

public class Bug_for_issue_449 extends TestCase {static class __CLR4_1_1014j014j0lusqk31s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,52554,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_1014j014j0lusqk31s.R.globalSliceStart(getClass().getName(),52524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb14j0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014j014j0lusqk31s.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014j014j0lusqk31s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_449.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52524,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb14j0() throws Exception{try{__CLR4_1_1014j014j0lusqk31s.R.inc(52524);
        __CLR4_1_1014j014j0lusqk31s.R.inc(52525);ExaminationPojo vo = new ExaminationPojo();
        __CLR4_1_1014j014j0lusqk31s.R.inc(52526);vo.setMg("1435555992");
        __CLR4_1_1014j014j0lusqk31s.R.inc(52527);vo.setNa(" 02570");
        __CLR4_1_1014j014j0lusqk31s.R.inc(52528);vo.setCl("150501");
        __CLR4_1_1014j014j0lusqk31s.R.inc(52529);vo.setPanellot("150501");
        __CLR4_1_1014j014j0lusqk31s.R.inc(52530);String text = JSON.toJSONString(vo);
        
        __CLR4_1_1014j014j0lusqk31s.R.inc(52531);System.out.println(text);
        __CLR4_1_1014j014j0lusqk31s.R.inc(52532);Assert.assertEquals("{\"Cl-\":\"150501\",\"Mg2+\":\"1435555992\",\"Na+\":\" 02570\",\"panellot\":\"150501\"}", text);
        
        __CLR4_1_1014j014j0lusqk31s.R.inc(52533);ExaminationPojo v1 = JSON.parseObject(text, ExaminationPojo.class);
        __CLR4_1_1014j014j0lusqk31s.R.inc(52534);Assert.assertEquals(vo.mg, v1.mg);
        __CLR4_1_1014j014j0lusqk31s.R.inc(52535);Assert.assertEquals(vo.na, v1.na);
        __CLR4_1_1014j014j0lusqk31s.R.inc(52536);Assert.assertEquals(vo.cl, v1.cl);
        __CLR4_1_1014j014j0lusqk31s.R.inc(52537);Assert.assertEquals(vo.panellot, v1.panellot);
        
    }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}

    public static class ExaminationPojo {

        @JSONField(name = "Mg2+")
        private String mg;
        @JSONField(name = "Na+")
        private String na;
        @JSONField(name = "Cl-")
        private String cl;
        @JSONField(name = "panellot")
        private String panellot;
        
        public String getMg() {try{__CLR4_1_1014j014j0lusqk31s.R.inc(52538);
            __CLR4_1_1014j014j0lusqk31s.R.inc(52539);return mg;
        }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}
        
        public void setMg(String mg) {try{__CLR4_1_1014j014j0lusqk31s.R.inc(52540);
            __CLR4_1_1014j014j0lusqk31s.R.inc(52541);this.mg = mg;
        }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}
        
        public String getNa() {try{__CLR4_1_1014j014j0lusqk31s.R.inc(52542);
            __CLR4_1_1014j014j0lusqk31s.R.inc(52543);return na;
        }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}
        
        public void setNa(String na) {try{__CLR4_1_1014j014j0lusqk31s.R.inc(52544);
            __CLR4_1_1014j014j0lusqk31s.R.inc(52545);this.na = na;
        }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}
        
        public String getCl() {try{__CLR4_1_1014j014j0lusqk31s.R.inc(52546);
            __CLR4_1_1014j014j0lusqk31s.R.inc(52547);return cl;
        }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}
        
        public void setCl(String cl) {try{__CLR4_1_1014j014j0lusqk31s.R.inc(52548);
            __CLR4_1_1014j014j0lusqk31s.R.inc(52549);this.cl = cl;
        }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}
        
        public String getPanellot() {try{__CLR4_1_1014j014j0lusqk31s.R.inc(52550);
            __CLR4_1_1014j014j0lusqk31s.R.inc(52551);return panellot;
        }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}
        
        public void setPanellot(String panellot) {try{__CLR4_1_1014j014j0lusqk31s.R.inc(52552);
            __CLR4_1_1014j014j0lusqk31s.R.inc(52553);this.panellot = panellot;
        }finally{__CLR4_1_1014j014j0lusqk31s.R.flushNeeded();}}
        

        
    }
}
