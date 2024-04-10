/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.lang.reflect.Type;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import junit.framework.TestCase;

public class Bug_for_Issue_603 extends TestCase {static class __CLR4_1_1014191419luszw7ri{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,51908,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_1014191419luszw7ri.R.globalSliceStart(getClass().getName(),51885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1419();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014191419luszw7ri.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014191419luszw7ri.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_Issue_603.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51885,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1419() throws Exception{try{__CLR4_1_1014191419luszw7ri.R.inc(51885);
        __CLR4_1_1014191419luszw7ri.R.inc(51886);ParserConfig.getGlobalInstance().putDeserializer(OrderActionEnum.class, new OrderActionEnumDeser());

        {
            __CLR4_1_1014191419luszw7ri.R.inc(51887);Msg msg = JSON.parseObject("{\"actionEnum\":1,\"body\":\"A\"}", Msg.class);
            __CLR4_1_1014191419luszw7ri.R.inc(51888);Assert.assertEquals(msg.body, "A");
            __CLR4_1_1014191419luszw7ri.R.inc(51889);Assert.assertEquals(msg.actionEnum, OrderActionEnum.FAIL);
        }
        {
            __CLR4_1_1014191419luszw7ri.R.inc(51890);Msg msg = JSON.parseObject("{\"actionEnum\":0,\"body\":\"B\"}", Msg.class);
            __CLR4_1_1014191419luszw7ri.R.inc(51891);Assert.assertEquals(msg.body, "B");
            __CLR4_1_1014191419luszw7ri.R.inc(51892);Assert.assertEquals(msg.actionEnum, OrderActionEnum.SUCC);
        }
    }finally{__CLR4_1_1014191419luszw7ri.R.flushNeeded();}}

    public static class OrderActionEnumDeser implements ObjectDeserializer {

        @SuppressWarnings("unchecked")
        @Override
        public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1014191419luszw7ri.R.inc(51893);
            __CLR4_1_1014191419luszw7ri.R.inc(51894);Integer intValue = parser.parseObject(int.class);
            __CLR4_1_1014191419luszw7ri.R.inc(51895);if ((((intValue == 1)&&(__CLR4_1_1014191419luszw7ri.R.iget(51896)!=0|true))||(__CLR4_1_1014191419luszw7ri.R.iget(51897)==0&false))) {{
                __CLR4_1_1014191419luszw7ri.R.inc(51898);return (T) OrderActionEnum.FAIL;
            } }else {__CLR4_1_1014191419luszw7ri.R.inc(51899);if ((((intValue == 0)&&(__CLR4_1_1014191419luszw7ri.R.iget(51900)!=0|true))||(__CLR4_1_1014191419luszw7ri.R.iget(51901)==0&false))) {{
                __CLR4_1_1014191419luszw7ri.R.inc(51902);return (T) OrderActionEnum.SUCC;
            }
            }}__CLR4_1_1014191419luszw7ri.R.inc(51903);throw new IllegalStateException();
        }finally{__CLR4_1_1014191419luszw7ri.R.flushNeeded();}}

        @Override
        public int getFastMatchToken() {try{__CLR4_1_1014191419luszw7ri.R.inc(51904);
            __CLR4_1_1014191419luszw7ri.R.inc(51905);return JSONToken.LITERAL_INT;
        }finally{__CLR4_1_1014191419luszw7ri.R.flushNeeded();}}

    }

    public static enum OrderActionEnum {
                                        FAIL(1), SUCC(0);

        private int code;

        OrderActionEnum(int code){try{__CLR4_1_1014191419luszw7ri.R.inc(51906);
            __CLR4_1_1014191419luszw7ri.R.inc(51907);this.code = code;
        }finally{__CLR4_1_1014191419luszw7ri.R.flushNeeded();}}
    }

    public static class Msg {

        public OrderActionEnum actionEnum;
        public String          body;
    }
}
