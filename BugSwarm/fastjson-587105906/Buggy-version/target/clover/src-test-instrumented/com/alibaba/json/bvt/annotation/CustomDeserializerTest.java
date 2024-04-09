/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.annotation;

import java.lang.reflect.Type;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import junit.framework.TestCase;

public class CustomDeserializerTest extends TestCase {static class __CLR4_1_1010721072lusqjzwy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,46925,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_1010721072lusqjzwy.R.globalSliceStart(getClass().getName(),46910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21072();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1010721072lusqjzwy.R.rethrow($CLV_t2$);}finally{__CLR4_1_1010721072lusqjzwy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.annotation.CustomDeserializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46910,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21072() throws Exception{try{__CLR4_1_1010721072lusqjzwy.R.inc(46910);
        __CLR4_1_1010721072lusqjzwy.R.inc(46911);String text = "{\"xid\":1001}";
        __CLR4_1_1010721072lusqjzwy.R.inc(46912);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_1010721072lusqjzwy.R.inc(46913);Assert.assertEquals(1001, model.id);
    }finally{__CLR4_1_1010721072lusqjzwy.R.flushNeeded();}}
    
    @JSONType(deserializer=ModelDeserializer.class)
    public static class Model {
        public int id;
    }
    
    public static class ModelDeserializer implements ObjectDeserializer {
        @Override
        public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1010721072lusqjzwy.R.inc(46914);
            __CLR4_1_1010721072lusqjzwy.R.inc(46915);JSONReader reader = new JSONReader(parser);
            
            __CLR4_1_1010721072lusqjzwy.R.inc(46916);reader.startObject();
            
            __CLR4_1_1010721072lusqjzwy.R.inc(46917);String key = reader.readString();
            __CLR4_1_1010721072lusqjzwy.R.inc(46918);Integer value = reader.readInteger();
            
            __CLR4_1_1010721072lusqjzwy.R.inc(46919);Model model = new Model();
            __CLR4_1_1010721072lusqjzwy.R.inc(46920);model.id = value;
            
            __CLR4_1_1010721072lusqjzwy.R.inc(46921);reader.endObject();
            // TODO Auto-generated method stub
            __CLR4_1_1010721072lusqjzwy.R.inc(46922);return (T) model;
        }finally{__CLR4_1_1010721072lusqjzwy.R.flushNeeded();}}

        @Override
        public int getFastMatchToken() {try{__CLR4_1_1010721072lusqjzwy.R.inc(46923);
            __CLR4_1_1010721072lusqjzwy.R.inc(46924);return 0;
        }finally{__CLR4_1_1010721072lusqjzwy.R.flushNeeded();}}
        
    }
}
