/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.enum_;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import junit.framework.TestCase;

import java.lang.reflect.Type;

public class EnumCustomCodecTest extends TestCase {static class __CLR4_5_21utv1utvlusvngpd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,86638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_enum() throws Exception {__CLR4_5_21utv1utvlusvngpd.R.globalSliceStart(getClass().getName(),86611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c9s9yt1utv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21utv1utvlusvngpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21utv1utvlusvngpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumCustomCodecTest.test_for_enum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86611,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c9s9yt1utv() throws Exception{try{__CLR4_5_21utv1utvlusvngpd.R.inc(86611);
        __CLR4_5_21utv1utvlusvngpd.R.inc(86612);Type type = Type.A;
        __CLR4_5_21utv1utvlusvngpd.R.inc(86613);String str =JSON.toJSONString(type);

        __CLR4_5_21utv1utvlusvngpd.R.inc(86614);assertEquals("{\"id\":1001,\"name\":\"aaa\"}", str);

        __CLR4_5_21utv1utvlusvngpd.R.inc(86615);Type type2 = JSON.parseObject(str, Type.class);
        __CLR4_5_21utv1utvlusvngpd.R.inc(86616);Type type3 = JSON.parseObject(str, Type.class);

        __CLR4_5_21utv1utvlusvngpd.R.inc(86617);assertSame(type, type2);
        __CLR4_5_21utv1utvlusvngpd.R.inc(86618);assertSame(type, type3);

    }finally{__CLR4_5_21utv1utvlusvngpd.R.flushNeeded();}}

    @JSONType(serializeEnumAsJavaBean = true, deserializer = TypeDeser.class)
    public static enum Type {
        A(1001, "aaa"), B(1002, "bbb")
        ;

        public int id;
        public String name;

        Type(int id, String name) {try{__CLR4_5_21utv1utvlusvngpd.R.inc(86619);
            __CLR4_5_21utv1utvlusvngpd.R.inc(86620);this.id = id;
            __CLR4_5_21utv1utvlusvngpd.R.inc(86621);this.name = name;
        }finally{__CLR4_5_21utv1utvlusvngpd.R.flushNeeded();}}

        public static Type valueOf(long id) {try{__CLR4_5_21utv1utvlusvngpd.R.inc(86622);
            __CLR4_5_21utv1utvlusvngpd.R.inc(86623);if ((((id == 1001)&&(__CLR4_5_21utv1utvlusvngpd.R.iget(86624)!=0|true))||(__CLR4_5_21utv1utvlusvngpd.R.iget(86625)==0&false))) {{
                __CLR4_5_21utv1utvlusvngpd.R.inc(86626);return A;
            } }else {__CLR4_5_21utv1utvlusvngpd.R.inc(86627);if ((((id == 1002)&&(__CLR4_5_21utv1utvlusvngpd.R.iget(86628)!=0|true))||(__CLR4_5_21utv1utvlusvngpd.R.iget(86629)==0&false))) {{
                __CLR4_5_21utv1utvlusvngpd.R.inc(86630);return B;
            }
            }}__CLR4_5_21utv1utvlusvngpd.R.inc(86631);return null;
        }finally{__CLR4_5_21utv1utvlusvngpd.R.flushNeeded();}}
    }

    public static class TypeDeser implements ObjectDeserializer {

        public <T> T deserialze(DefaultJSONParser parser, java.lang.reflect.Type type, Object fieldName) {try{__CLR4_5_21utv1utvlusvngpd.R.inc(86632);
            __CLR4_5_21utv1utvlusvngpd.R.inc(86633);JSONObject object = parser.parseObject();
            __CLR4_5_21utv1utvlusvngpd.R.inc(86634);long id = object.getLongValue("id");
            __CLR4_5_21utv1utvlusvngpd.R.inc(86635);return (T) Type.valueOf(id);
        }finally{__CLR4_5_21utv1utvlusvngpd.R.flushNeeded();}}

        public int getFastMatchToken() {try{__CLR4_5_21utv1utvlusvngpd.R.inc(86636);
            __CLR4_5_21utv1utvlusvngpd.R.inc(86637);return 0;
        }finally{__CLR4_5_21utv1utvlusvngpd.R.flushNeeded();}}
    }
}
