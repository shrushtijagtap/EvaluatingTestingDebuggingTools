/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.asm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestASM2 extends TestCase {static class __CLR4_5_21lrn1lrnlusyju8q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,74931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceStart(getClass().getName(),74867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21lrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lrn1lrnlusyju8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21lrn() throws Exception{try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74867);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74868);String text = JSON.toJSONString(new V0());
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74869);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceStart(getClass().getName(),74870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1lrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lrn1lrnlusyju8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1lrq() throws Exception{try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74870);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74871);String text = JSON.toJSONString(new V1());
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74872);Assert.assertEquals("{\"list\":[]}", text);
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceStart(getClass().getName(),74873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441lrt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lrn1lrnlusyju8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441lrt() throws Exception{try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74873);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74874);V1 v = new V1();
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74875);v.getList().add(3);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74876);v.getList().add(4);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74877);String text = JSON.toJSONString(v);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74878);Assert.assertEquals("{\"list\":[3,4]}", text);
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceStart(getClass().getName(),74879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1lrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lrn1lrnlusyju8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1lrz() throws Exception{try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74879);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74880);V2 v = new V2();
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74881);v.setId(123);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74882);v.setName("\u5218\u52a0\u5927");
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74883);String text = JSON.toJSONString(v);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74884);Assert.assertEquals("{\"id\":123,\"name\":\"\u5218\u52a0\u5927\"}", text);
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceStart(getClass().getName(),74885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61ls5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lrn1lrnlusyju8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61ls5() throws Exception{try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74885);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74886);V2 v = new V2();
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74887);v.setId(123);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74888);String text = JSON.toJSONString(v);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74889);Assert.assertEquals("{\"id\":123}", text);
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceStart(getClass().getName(),74890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1lsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lrn1lrnlusyju8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74890,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1lsa() throws Exception{try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74890);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74891);V2 v = new V2();
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74892);v.setId(123);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74893);String text = JSON.toJSONString(v, SerializerFeature.WriteMapNullValue);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74894);Assert.assertEquals("{\"id\":123,\"name\":null}", text);
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceStart(getClass().getName(),74895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1lsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lrn1lrnlusyju8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1lsf() throws Exception{try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74895);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74896);V3 v = new V3();
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74897);v.setText("xxx");
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74898);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74899);Assert.assertEquals("{'text':'xxx'}", text);
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceStart(getClass().getName(),74900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71lsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lrn1lrnlusyju8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lrn1lrnlusyju8q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM2.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71lsk() throws Exception{try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74900);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74901);V3 v = new V3();
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74902);v.setText("xxx");
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74903);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes, SerializerFeature.WriteMapNullValue);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74904);System.out.println(text);
        
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74905);Assert.assertEquals(true, "{'list':null,'text':'xxx'}".equals(text) || "{'text':'xxx','list':null}".equals(text));
        
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public void f_test_3() throws Exception {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74906);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74907);V1 v = new V1();
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74908);v.getList().add(3);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74909);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_5_21lrn1lrnlusyju8q.R.inc(74910);System.out.println(text);
    }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    public static class V0 {

    }

    public static class V1 {

        private List<Integer> list = new ArrayList<Integer>();

        public List<Integer> getList() {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74911);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74912);return list;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

        public void setList(List<Integer> list) {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74913);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74914);this.list = list;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    }

    public static class V2 {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74915);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74916);return id;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74917);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74918);this.id = id;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74919);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74920);return name;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74921);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74922);this.name = name;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    }

    public static class V3 {

        private List<Integer> list;
        private String        text;

        public List<Integer> getList() {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74923);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74924);return list;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

        public void setList(List<Integer> list) {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74925);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74926);this.list = list;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

        public String getText() {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74927);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74928);return text;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

        public void setText(String text) {try{__CLR4_5_21lrn1lrnlusyju8q.R.inc(74929);
            __CLR4_5_21lrn1lrnlusyju8q.R.inc(74930);this.text = text;
        }finally{__CLR4_5_21lrn1lrnlusyju8q.R.flushNeeded();}}

    }

}
