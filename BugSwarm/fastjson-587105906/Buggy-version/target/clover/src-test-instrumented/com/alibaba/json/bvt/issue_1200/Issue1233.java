/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by wenshao on 30/05/2017.
 */
public class Issue1233 extends TestCase {static class __CLR4_1_101akt1aktluszwai1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,60400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101akt1aktluszwai1.R.globalSliceStart(getClass().getName(),60365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1akt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101akt1aktluszwai1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101akt1aktluszwai1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1200.Issue1233.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60365,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1akt() throws Exception{try{__CLR4_1_101akt1aktluszwai1.R.inc(60365);
        __CLR4_1_101akt1aktluszwai1.R.inc(60366);ParserConfig.getGlobalInstance().putDeserializer(Area.class, new ObjectDeserializer() {
            public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_101akt1aktluszwai1.R.inc(60367);
                __CLR4_1_101akt1aktluszwai1.R.inc(60368);JSONObject jsonObject = (JSONObject) parser.parse();
                __CLR4_1_101akt1aktluszwai1.R.inc(60369);String areaType;

                __CLR4_1_101akt1aktluszwai1.R.inc(60370);if ((((jsonObject.get("type") instanceof String)&&(__CLR4_1_101akt1aktluszwai1.R.iget(60371)!=0|true))||(__CLR4_1_101akt1aktluszwai1.R.iget(60372)==0&false))) {{
                    __CLR4_1_101akt1aktluszwai1.R.inc(60373);areaType = (String) jsonObject.get("type");
                } }else {{
                    __CLR4_1_101akt1aktluszwai1.R.inc(60374);return null;
                }
                }__CLR4_1_101akt1aktluszwai1.R.inc(60375);if ((((Area.TYPE_SECTION.equals(areaType))&&(__CLR4_1_101akt1aktluszwai1.R.iget(60376)!=0|true))||(__CLR4_1_101akt1aktluszwai1.R.iget(60377)==0&false))) {{
                    __CLR4_1_101akt1aktluszwai1.R.inc(60378);return (T) JSON.toJavaObject(jsonObject, Section.class);
                } }else {__CLR4_1_101akt1aktluszwai1.R.inc(60379);if ((((Area.TYPE_FLOORV1.equals(areaType))&&(__CLR4_1_101akt1aktluszwai1.R.iget(60380)!=0|true))||(__CLR4_1_101akt1aktluszwai1.R.iget(60381)==0&false))) {{
                    __CLR4_1_101akt1aktluszwai1.R.inc(60382);return (T) JSON.toJavaObject(jsonObject, FloorV1.class);
                } }else {__CLR4_1_101akt1aktluszwai1.R.inc(60383);if ((((Area.TYPE_FLOORV2.equals(areaType))&&(__CLR4_1_101akt1aktluszwai1.R.iget(60384)!=0|true))||(__CLR4_1_101akt1aktluszwai1.R.iget(60385)==0&false))) {{
                    __CLR4_1_101akt1aktluszwai1.R.inc(60386);return (T) JSON.toJavaObject(jsonObject, FloorV2.class);
                }
                }}}__CLR4_1_101akt1aktluszwai1.R.inc(60387);return null;
            }finally{__CLR4_1_101akt1aktluszwai1.R.flushNeeded();}}

            public int getFastMatchToken() {try{__CLR4_1_101akt1aktluszwai1.R.inc(60388);
                __CLR4_1_101akt1aktluszwai1.R.inc(60389);return 0;
            }finally{__CLR4_1_101akt1aktluszwai1.R.flushNeeded();}}
        });

        __CLR4_1_101akt1aktluszwai1.R.inc(60390);JSONObject jsonObject = JSON.parseObject("{\"type\":\"floorV2\",\"templateId\":\"x123\"}");

        __CLR4_1_101akt1aktluszwai1.R.inc(60391);FloorV2 floorV2 = (FloorV2) jsonObject.toJavaObject(Area.class);
        __CLR4_1_101akt1aktluszwai1.R.inc(60392);assertNotNull(floorV2);
        __CLR4_1_101akt1aktluszwai1.R.inc(60393);assertEquals("x123", floorV2.templateId);
    }finally{__CLR4_1_101akt1aktluszwai1.R.flushNeeded();}}

    public interface Area {
        public static final String TYPE_SECTION = "section";
        public static final String TYPE_FLOORV1 = "floorV1";
        public static final String TYPE_FLOORV2 = "floorV2";

        String getName();
    }

    public static class Section implements Area {
        public List<Area> children;

        public String type;

        public String templateId;

        public String getName() {try{__CLR4_1_101akt1aktluszwai1.R.inc(60394);
            __CLR4_1_101akt1aktluszwai1.R.inc(60395);return templateId;
        }finally{__CLR4_1_101akt1aktluszwai1.R.flushNeeded();}}
    }

    public static class FloorV1 implements Area {
        public String type;
        public String templateId;

        public String getName() {try{__CLR4_1_101akt1aktluszwai1.R.inc(60396);
            __CLR4_1_101akt1aktluszwai1.R.inc(60397);return templateId;
        }finally{__CLR4_1_101akt1aktluszwai1.R.flushNeeded();}}
    }

    public static class FloorV2 implements Area {
        public List<Area> children;

        public String type;

        public String templateId;

        public String getName() {try{__CLR4_1_101akt1aktluszwai1.R.inc(60398);
            __CLR4_1_101akt1aktluszwai1.R.inc(60399);return templateId;
        }finally{__CLR4_1_101akt1aktluszwai1.R.flushNeeded();}}
    }
}
