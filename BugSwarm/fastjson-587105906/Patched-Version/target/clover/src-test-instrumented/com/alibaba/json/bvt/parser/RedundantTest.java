/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;

public class RedundantTest extends TestCase {static class __CLR4_5_21ii01ii0lusyjtsx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,70661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_extra() throws Exception {__CLR4_5_21ii01ii0lusyjtsx.R.globalSliceStart(getClass().getName(),70632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rfayoa1ii0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ii01ii0lusyjtsx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ii01ii0lusyjtsx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.RedundantTest.test_extra",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rfayoa1ii0() throws Exception{try{__CLR4_5_21ii01ii0lusyjtsx.R.inc(70632);
        __CLR4_5_21ii01ii0lusyjtsx.R.inc(70633);ExtraProcessor processor = new ExtraProcessor() {
            public void processExtra(Object object, String key, Object value) {try{__CLR4_5_21ii01ii0lusyjtsx.R.inc(70634);
                __CLR4_5_21ii01ii0lusyjtsx.R.inc(70635);VO vo = (VO) object;
                __CLR4_5_21ii01ii0lusyjtsx.R.inc(70636);vo.getAttributes().put(key, value);
            }finally{__CLR4_5_21ii01ii0lusyjtsx.R.flushNeeded();}}
        };

        __CLR4_5_21ii01ii0lusyjtsx.R.inc(70637);VO vo = JSON.parseObject("{\"id\":123,\"name\":\"abc\"}", VO.class, processor);
        __CLR4_5_21ii01ii0lusyjtsx.R.inc(70638);Assert.assertEquals(123, vo.getId());
        __CLR4_5_21ii01ii0lusyjtsx.R.inc(70639);Assert.assertEquals("abc", vo.getAttributes().get("name"));
    }finally{__CLR4_5_21ii01ii0lusyjtsx.R.flushNeeded();}}
    
    public void test_extraWithType() throws Exception {__CLR4_5_21ii01ii0lusyjtsx.R.globalSliceStart(getClass().getName(),70640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkif1y1ii8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ii01ii0lusyjtsx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ii01ii0lusyjtsx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.RedundantTest.test_extraWithType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70640,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkif1y1ii8() throws Exception{try{__CLR4_5_21ii01ii0lusyjtsx.R.inc(70640);
        class MyExtraProcessor implements ExtraProcessor, ExtraTypeProvider {
            public void processExtra(Object object, String key, Object value) {try{__CLR4_5_21ii01ii0lusyjtsx.R.inc(70641);
                __CLR4_5_21ii01ii0lusyjtsx.R.inc(70642);VO vo = (VO) object;
                __CLR4_5_21ii01ii0lusyjtsx.R.inc(70643);vo.getAttributes().put(key, value);
            }finally{__CLR4_5_21ii01ii0lusyjtsx.R.flushNeeded();}}

            public Type getExtraType(Object object, String key) {try{__CLR4_5_21ii01ii0lusyjtsx.R.inc(70644);
                __CLR4_5_21ii01ii0lusyjtsx.R.inc(70645);if (((("value".equals(key))&&(__CLR4_5_21ii01ii0lusyjtsx.R.iget(70646)!=0|true))||(__CLR4_5_21ii01ii0lusyjtsx.R.iget(70647)==0&false))) {{
                    __CLR4_5_21ii01ii0lusyjtsx.R.inc(70648);return int.class;
                }
                }__CLR4_5_21ii01ii0lusyjtsx.R.inc(70649);return null;
            }finally{__CLR4_5_21ii01ii0lusyjtsx.R.flushNeeded();}}
        }__CLR4_5_21ii01ii0lusyjtsx.R.inc(70650);;
        __CLR4_5_21ii01ii0lusyjtsx.R.inc(70651);ExtraProcessor processor = new MyExtraProcessor();

        __CLR4_5_21ii01ii0lusyjtsx.R.inc(70652);VO vo = JSON.parseObject("{\"id\":123,\"value\":\"123456\"}", VO.class, processor);
        __CLR4_5_21ii01ii0lusyjtsx.R.inc(70653);Assert.assertEquals(123, vo.getId());
        __CLR4_5_21ii01ii0lusyjtsx.R.inc(70654);Assert.assertEquals(123456, vo.getAttributes().get("value"));
    }finally{__CLR4_5_21ii01ii0lusyjtsx.R.flushNeeded();}}


    public static class VO {

        private int                 id;
        private Map<String, Object> attributes = new HashMap<String, Object>();

        public int getId() {try{__CLR4_5_21ii01ii0lusyjtsx.R.inc(70655);
            __CLR4_5_21ii01ii0lusyjtsx.R.inc(70656);return id;
        }finally{__CLR4_5_21ii01ii0lusyjtsx.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ii01ii0lusyjtsx.R.inc(70657);
            __CLR4_5_21ii01ii0lusyjtsx.R.inc(70658);this.id = id;
        }finally{__CLR4_5_21ii01ii0lusyjtsx.R.flushNeeded();}}

        public Map<String, Object> getAttributes() {try{__CLR4_5_21ii01ii0lusyjtsx.R.inc(70659);
            __CLR4_5_21ii01ii0lusyjtsx.R.inc(70660);return attributes;
        }finally{__CLR4_5_21ii01ii0lusyjtsx.R.flushNeeded();}}

    }
}
