/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.lang.reflect.Type;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class AbstractTest extends TestCase {static class __CLR4_5_21qeq1qeqlusyjus2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,80920,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21qeq1qeqlusyjus2.R.globalSliceStart(getClass().getName(),80882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21qeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qeq1qeqlusyjus2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qeq1qeqlusyjus2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.AbstractTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80882,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21qeq() throws Exception{try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80882);
        __CLR4_5_21qeq1qeqlusyjus2.R.inc(80883);ParserConfig.getGlobalInstance().putDeserializer(A.class, new ADeserializer());
        __CLR4_5_21qeq1qeqlusyjus2.R.inc(80884);VO vo = JSON.parseObject("{\"a\":{\"num\":1,\"name\":\"bb\"}}", VO.class);
        __CLR4_5_21qeq1qeqlusyjus2.R.inc(80885);Assert.assertTrue(vo.getA() instanceof B);
    }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21qeq1qeqlusyjus2.R.globalSliceStart(getClass().getName(),80886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1qeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qeq1qeqlusyjus2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qeq1qeqlusyjus2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.AbstractTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1qeu() throws Exception{try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80886);
        __CLR4_5_21qeq1qeqlusyjus2.R.inc(80887);ParserConfig.getGlobalInstance().putDeserializer(A.class, new ADeserializer());
        __CLR4_5_21qeq1qeqlusyjus2.R.inc(80888);VO vo = JSON.parseObject("{\"a\":{\"num\":2,\"name\":\"bb\"}}", VO.class);
        __CLR4_5_21qeq1qeqlusyjus2.R.inc(80889);Assert.assertTrue(vo.getA() instanceof C);
    }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}


    public static class ADeserializer implements ObjectDeserializer {

        @SuppressWarnings("unchecked")
        public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80890);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80891);JSONObject json = parser.parseObject();
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80892);int num = json.getInteger("num");
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80893);if ((((num == 1)&&(__CLR4_5_21qeq1qeqlusyjus2.R.iget(80894)!=0|true))||(__CLR4_5_21qeq1qeqlusyjus2.R.iget(80895)==0&false))) {{
                __CLR4_5_21qeq1qeqlusyjus2.R.inc(80896);return (T) JSON.toJavaObject(json, B.class);
            } }else {__CLR4_5_21qeq1qeqlusyjus2.R.inc(80897);if ((((num == 2)&&(__CLR4_5_21qeq1qeqlusyjus2.R.iget(80898)!=0|true))||(__CLR4_5_21qeq1qeqlusyjus2.R.iget(80899)==0&false))) {{
                __CLR4_5_21qeq1qeqlusyjus2.R.inc(80900);return (T) JSON.toJavaObject(json, C.class);
            } }else {{
                __CLR4_5_21qeq1qeqlusyjus2.R.inc(80901);return (T) JSON.toJavaObject(json, A.class);
            }
        }}}finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

        public int getFastMatchToken() {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80902);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80903);return JSONToken.LBRACE;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

    }

    public static class VO {

        private A a;

        public A getA() {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80904);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80905);return a;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80906);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80907);this.a = a;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

    }

    public static class A {

        private int num;

        public int getNum() {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80908);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80909);return num;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

        public void setNum(int num) {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80910);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80911);this.num = num;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}
    }

    public static class B extends A {

        private String name;

        public String getName() {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80912);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80913);return name;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80914);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80915);this.name = name;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

    }

    public static class C extends A {

        public String value;

        public String getValue() {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80916);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80917);return value;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_21qeq1qeqlusyjus2.R.inc(80918);
            __CLR4_5_21qeq1qeqlusyjus2.R.inc(80919);this.value = value;
        }finally{__CLR4_5_21qeq1qeqlusyjus2.R.flushNeeded();}}

    }
}
