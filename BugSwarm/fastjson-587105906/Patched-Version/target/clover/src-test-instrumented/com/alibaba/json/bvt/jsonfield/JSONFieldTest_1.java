/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.jsonfield;

import java.lang.reflect.Field;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import junit.framework.TestCase;

public class JSONFieldTest_1 extends TestCase {static class __CLR4_5_21fdl1fdllusvnc17{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,66619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21fdl1fdllusvnc17.R.globalSliceStart(getClass().getName(),66585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21fdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fdl1fdllusvnc17.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fdl1fdllusvnc17.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jsonfield.JSONFieldTest_1.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21fdl() throws Exception{try{__CLR4_5_21fdl1fdllusvnc17.R.inc(66585);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66586);VO vo = new VO();
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66587);vo.setF0(100);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66588);vo.setF1(101);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66589);vo.setF2(102);

        __CLR4_5_21fdl1fdllusvnc17.R.inc(66590);String text = JSON.toJSONString(vo);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66591);System.out.println(text);

        __CLR4_5_21fdl1fdllusvnc17.R.inc(66592);Assert.assertEquals("{\"f2\":102,\"f1\":101,\"f0\":100}", text);

        __CLR4_5_21fdl1fdllusvnc17.R.inc(66593);VO vo_decoded = JSON.parseObject(text, VO.class);

        __CLR4_5_21fdl1fdllusvnc17.R.inc(66594);Assert.assertEquals(vo.f0, vo_decoded.f0);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66595);Assert.assertEquals(vo.f1, vo_decoded.f1);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66596);Assert.assertEquals(vo.f2, vo_decoded.f2);

        __CLR4_5_21fdl1fdllusvnc17.R.inc(66597);JavaBeanDeserializer javaBeanDeser = null;

        __CLR4_5_21fdl1fdllusvnc17.R.inc(66598);ObjectDeserializer deser = ParserConfig.getGlobalInstance().getDeserializer(VO.class);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66599);javaBeanDeser = (JavaBeanDeserializer) deser;

        __CLR4_5_21fdl1fdllusvnc17.R.inc(66600);Field field = JavaBeanDeserializer.class.getDeclaredField("sortedFieldDeserializers");
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66601);field.setAccessible(true);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66602);FieldDeserializer[] fieldDeserList = (FieldDeserializer[]) field.get(javaBeanDeser);
        
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66603);Assert.assertEquals(3, fieldDeserList.length);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66604);Assert.assertEquals("f2", fieldDeserList[0].fieldInfo.name);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66605);Assert.assertEquals("f1", fieldDeserList[1].fieldInfo.name);
        __CLR4_5_21fdl1fdllusvnc17.R.inc(66606);Assert.assertEquals("f0", fieldDeserList[2].fieldInfo.name);
    }finally{__CLR4_5_21fdl1fdllusvnc17.R.flushNeeded();}}

    public static class VO {

        private int f0;

       
        private int f1;

        
        private int f2;

        @JSONField(ordinal = 3)
        public int getF0() {try{__CLR4_5_21fdl1fdllusvnc17.R.inc(66607);
            __CLR4_5_21fdl1fdllusvnc17.R.inc(66608);return f0;
        }finally{__CLR4_5_21fdl1fdllusvnc17.R.flushNeeded();}}

        @JSONField(ordinal = 3)
        public void setF0(int f0) {try{__CLR4_5_21fdl1fdllusvnc17.R.inc(66609);
            __CLR4_5_21fdl1fdllusvnc17.R.inc(66610);this.f0 = f0;
        }finally{__CLR4_5_21fdl1fdllusvnc17.R.flushNeeded();}}

        @JSONField(ordinal = 2)
        public int getF1() {try{__CLR4_5_21fdl1fdllusvnc17.R.inc(66611);
            __CLR4_5_21fdl1fdllusvnc17.R.inc(66612);return f1;
        }finally{__CLR4_5_21fdl1fdllusvnc17.R.flushNeeded();}}

        @JSONField(ordinal = 2)
        public void setF1(int f1) {try{__CLR4_5_21fdl1fdllusvnc17.R.inc(66613);
            __CLR4_5_21fdl1fdllusvnc17.R.inc(66614);this.f1 = f1;
        }finally{__CLR4_5_21fdl1fdllusvnc17.R.flushNeeded();}}

        @JSONField(ordinal = 1)
        public int getF2() {try{__CLR4_5_21fdl1fdllusvnc17.R.inc(66615);
            __CLR4_5_21fdl1fdllusvnc17.R.inc(66616);return f2;
        }finally{__CLR4_5_21fdl1fdllusvnc17.R.flushNeeded();}}

        
        @JSONField(ordinal = 1)
        public void setF2(int f2) {try{__CLR4_5_21fdl1fdllusvnc17.R.inc(66617);
            __CLR4_5_21fdl1fdllusvnc17.R.inc(66618);this.f2 = f2;
        }finally{__CLR4_5_21fdl1fdllusvnc17.R.flushNeeded();}}

    }
}
