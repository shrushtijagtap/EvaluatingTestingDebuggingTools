/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.asm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestASM2 extends TestCase {static class __CLR4_1_101mq61mq6luszwdkj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,76174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101mq61mq6luszwdkj.R.globalSliceStart(getClass().getName(),76110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21mq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mq61mq6luszwdkj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mq61mq6luszwdkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76110,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21mq6() throws Exception{try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76110);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76111);String text = JSON.toJSONString(new V0());
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76112);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101mq61mq6luszwdkj.R.globalSliceStart(getClass().getName(),76113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1mq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mq61mq6luszwdkj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mq61mq6luszwdkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76113,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1mq9() throws Exception{try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76113);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76114);String text = JSON.toJSONString(new V1());
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76115);Assert.assertEquals("{\"list\":[]}", text);
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101mq61mq6luszwdkj.R.globalSliceStart(getClass().getName(),76116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441mqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mq61mq6luszwdkj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mq61mq6luszwdkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76116,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441mqc() throws Exception{try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76116);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76117);V1 v = new V1();
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76118);v.getList().add(3);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76119);v.getList().add(4);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76120);String text = JSON.toJSONString(v);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76121);Assert.assertEquals("{\"list\":[3,4]}", text);
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101mq61mq6luszwdkj.R.globalSliceStart(getClass().getName(),76122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1mqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mq61mq6luszwdkj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mq61mq6luszwdkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76122,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1mqi() throws Exception{try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76122);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76123);V2 v = new V2();
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76124);v.setId(123);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76125);v.setName("\u5218\u52a0\u5927");
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76126);String text = JSON.toJSONString(v);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76127);Assert.assertEquals("{\"id\":123,\"name\":\"\u5218\u52a0\u5927\"}", text);
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101mq61mq6luszwdkj.R.globalSliceStart(getClass().getName(),76128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61mqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mq61mq6luszwdkj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mq61mq6luszwdkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76128,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61mqo() throws Exception{try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76128);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76129);V2 v = new V2();
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76130);v.setId(123);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76131);String text = JSON.toJSONString(v);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76132);Assert.assertEquals("{\"id\":123}", text);
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101mq61mq6luszwdkj.R.globalSliceStart(getClass().getName(),76133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1mqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mq61mq6luszwdkj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mq61mq6luszwdkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76133,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1mqt() throws Exception{try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76133);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76134);V2 v = new V2();
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76135);v.setId(123);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76136);String text = JSON.toJSONString(v, SerializerFeature.WriteMapNullValue);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76137);Assert.assertEquals("{\"id\":123,\"name\":null}", text);
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101mq61mq6luszwdkj.R.globalSliceStart(getClass().getName(),76138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1mqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mq61mq6luszwdkj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mq61mq6luszwdkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76138,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1mqy() throws Exception{try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76138);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76139);V3 v = new V3();
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76140);v.setText("xxx");
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76141);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76142);Assert.assertEquals("{'text':'xxx'}", text);
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101mq61mq6luszwdkj.R.globalSliceStart(getClass().getName(),76143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71mr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mq61mq6luszwdkj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mq61mq6luszwdkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76143,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71mr3() throws Exception{try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76143);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76144);V3 v = new V3();
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76145);v.setText("xxx");
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76146);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes, SerializerFeature.WriteMapNullValue);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76147);System.out.println(text);
        
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76148);Assert.assertEquals(true, "{'list':null,'text':'xxx'}".equals(text) || "{'text':'xxx','list':null}".equals(text));
        
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public void f_test_3() throws Exception {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76149);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76150);V1 v = new V1();
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76151);v.getList().add(3);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76152);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_1_101mq61mq6luszwdkj.R.inc(76153);System.out.println(text);
    }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    public static class V0 {

    }

    public static class V1 {

        private List<Integer> list = new ArrayList<Integer>();

        public List<Integer> getList() {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76154);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76155);return list;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

        public void setList(List<Integer> list) {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76156);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76157);this.list = list;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    }

    public static class V2 {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76158);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76159);return id;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76160);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76161);this.id = id;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76162);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76163);return name;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76164);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76165);this.name = name;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    }

    public static class V3 {

        private List<Integer> list;
        private String        text;

        public List<Integer> getList() {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76166);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76167);return list;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

        public void setList(List<Integer> list) {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76168);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76169);this.list = list;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

        public String getText() {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76170);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76171);return text;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

        public void setText(String text) {try{__CLR4_1_101mq61mq6luszwdkj.R.inc(76172);
            __CLR4_1_101mq61mq6luszwdkj.R.inc(76173);this.text = text;
        }finally{__CLR4_1_101mq61mq6luszwdkj.R.flushNeeded();}}

    }

}
