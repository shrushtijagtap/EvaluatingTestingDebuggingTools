/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.asm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestASM2 extends TestCase {static class __CLR4_5_21mpv1mpvlusvnek1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,76163,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceStart(getClass().getName(),76099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21mpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mpv1mpvlusvnek1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76099,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21mpv() throws Exception{try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76099);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76100);String text = JSON.toJSONString(new V0());
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76101);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceStart(getClass().getName(),76102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1mpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mpv1mpvlusvnek1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1mpy() throws Exception{try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76102);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76103);String text = JSON.toJSONString(new V1());
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76104);Assert.assertEquals("{\"list\":[]}", text);
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceStart(getClass().getName(),76105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441mq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mpv1mpvlusvnek1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441mq1() throws Exception{try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76105);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76106);V1 v = new V1();
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76107);v.getList().add(3);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76108);v.getList().add(4);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76109);String text = JSON.toJSONString(v);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76110);Assert.assertEquals("{\"list\":[3,4]}", text);
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceStart(getClass().getName(),76111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1mq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mpv1mpvlusvnek1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1mq7() throws Exception{try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76111);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76112);V2 v = new V2();
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76113);v.setId(123);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76114);v.setName("\u5218\u52a0\u5927");
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76115);String text = JSON.toJSONString(v);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76116);Assert.assertEquals("{\"id\":123,\"name\":\"\u5218\u52a0\u5927\"}", text);
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceStart(getClass().getName(),76117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61mqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mpv1mpvlusvnek1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61mqd() throws Exception{try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76117);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76118);V2 v = new V2();
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76119);v.setId(123);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76120);String text = JSON.toJSONString(v);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76121);Assert.assertEquals("{\"id\":123}", text);
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceStart(getClass().getName(),76122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1mqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mpv1mpvlusvnek1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76122,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1mqi() throws Exception{try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76122);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76123);V2 v = new V2();
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76124);v.setId(123);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76125);String text = JSON.toJSONString(v, SerializerFeature.WriteMapNullValue);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76126);Assert.assertEquals("{\"id\":123,\"name\":null}", text);
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceStart(getClass().getName(),76127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1mqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mpv1mpvlusvnek1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1mqn() throws Exception{try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76127);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76128);V3 v = new V3();
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76129);v.setText("xxx");
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76130);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76131);Assert.assertEquals("{'text':'xxx'}", text);
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceStart(getClass().getName(),76132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71mqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mpv1mpvlusvnek1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mpv1mpvlusvnek1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76132,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71mqs() throws Exception{try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76132);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76133);V3 v = new V3();
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76134);v.setText("xxx");
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76135);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes, SerializerFeature.WriteMapNullValue);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76136);System.out.println(text);
        
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76137);Assert.assertEquals(true, "{'list':null,'text':'xxx'}".equals(text) || "{'text':'xxx','list':null}".equals(text));
        
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public void f_test_3() throws Exception {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76138);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76139);V1 v = new V1();
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76140);v.getList().add(3);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76141);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_5_21mpv1mpvlusvnek1.R.inc(76142);System.out.println(text);
    }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    public static class V0 {

    }

    public static class V1 {

        private List<Integer> list = new ArrayList<Integer>();

        public List<Integer> getList() {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76143);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76144);return list;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

        public void setList(List<Integer> list) {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76145);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76146);this.list = list;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    }

    public static class V2 {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76147);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76148);return id;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76149);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76150);this.id = id;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76151);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76152);return name;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76153);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76154);this.name = name;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    }

    public static class V3 {

        private List<Integer> list;
        private String        text;

        public List<Integer> getList() {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76155);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76156);return list;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

        public void setList(List<Integer> list) {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76157);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76158);this.list = list;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

        public String getText() {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76159);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76160);return text;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

        public void setText(String text) {try{__CLR4_5_21mpv1mpvlusvnek1.R.inc(76161);
            __CLR4_5_21mpv1mpvlusvnek1.R.inc(76162);this.text = text;
        }finally{__CLR4_5_21mpv1mpvlusvnek1.R.flushNeeded();}}

    }

}
