/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvtVO.ae.*;
import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * Created by wenshao on 08/05/2017.
 */
public class AETest extends TestCase {static class __CLR4_5_21fx51fx5lusvncaz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,67312,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String jsonData = "{\n" +
            "    \"areaList\":[\n" +
            "        {\n" +
            "            \"type\":\"floor\",\n" +
            "            \"name\":\"I'm floor\",\n" +
            "            \"children\":[{\n" +
            "                \"type\":\"item\",\n" +
            "            \"name\":\"I'm item 0\"\n" +
            "            },\n" +
            "        {\n" +
            "              \"type\":\"item\",\n" +
            "            \"name\":\"I'm item 1\"\n" +
            "        }\n" +
            "\n" +
            "            ]\n" +
            "        },{\n" +
            "            \"type\":\"item\",\n" +
            "            \"name\":\"I'm item 2\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public void test_for_ae() throws Exception {__CLR4_5_21fx51fx5lusvncaz.R.globalSliceStart(getClass().getName(),67289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_251fi0i1fx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fx51fx5lusvncaz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fx51fx5lusvncaz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.AETest.test_for_ae",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_251fi0i1fx5() throws Exception{try{__CLR4_5_21fx51fx5lusvncaz.R.inc(67289);
        __CLR4_5_21fx51fx5lusvncaz.R.inc(67290);ParserConfig.getGlobalInstance().putDeserializer(Area.class, new ObjectDeserializer() {
            public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21fx51fx5lusvncaz.R.inc(67291);
                __CLR4_5_21fx51fx5lusvncaz.R.inc(67292);JSONObject jsonObject = (JSONObject) parser.parse();
                __CLR4_5_21fx51fx5lusvncaz.R.inc(67293);String areaType;

                __CLR4_5_21fx51fx5lusvncaz.R.inc(67294);if ((((jsonObject.get("type") instanceof String)&&(__CLR4_5_21fx51fx5lusvncaz.R.iget(67295)!=0|true))||(__CLR4_5_21fx51fx5lusvncaz.R.iget(67296)==0&false))) {{
                    __CLR4_5_21fx51fx5lusvncaz.R.inc(67297);areaType = (String) jsonObject.get("type");
                } }else {{
                    __CLR4_5_21fx51fx5lusvncaz.R.inc(67298);return null;
                }
                }__CLR4_5_21fx51fx5lusvncaz.R.inc(67299);if ((((Area.TYPE_FLOOR.equals(areaType))&&(__CLR4_5_21fx51fx5lusvncaz.R.iget(67300)!=0|true))||(__CLR4_5_21fx51fx5lusvncaz.R.iget(67301)==0&false))) {{
                     __CLR4_5_21fx51fx5lusvncaz.R.inc(67302);return (T) JSON.toJavaObject(jsonObject, Floor.class);
                } }else {__CLR4_5_21fx51fx5lusvncaz.R.inc(67303);if ((((Area.TYPE_ITEM.equals(areaType))&&(__CLR4_5_21fx51fx5lusvncaz.R.iget(67304)!=0|true))||(__CLR4_5_21fx51fx5lusvncaz.R.iget(67305)==0&false))) {{
                    __CLR4_5_21fx51fx5lusvncaz.R.inc(67306);return (T) JSON.toJavaObject(jsonObject, Item.class);
                }

                }}__CLR4_5_21fx51fx5lusvncaz.R.inc(67307);return null;
            }finally{__CLR4_5_21fx51fx5lusvncaz.R.flushNeeded();}}

            public int getFastMatchToken() {try{__CLR4_5_21fx51fx5lusvncaz.R.inc(67308);
                __CLR4_5_21fx51fx5lusvncaz.R.inc(67309);return JSONToken.LBRACE;
            }finally{__CLR4_5_21fx51fx5lusvncaz.R.flushNeeded();}}
        });


        __CLR4_5_21fx51fx5lusvncaz.R.inc(67310);Data data = JSON.parseObject(jsonData, Data.class);

        __CLR4_5_21fx51fx5lusvncaz.R.inc(67311);Item item = (Item) ((Floor)(data.areaList.get(0))).children.get(0);
    }finally{__CLR4_5_21fx51fx5lusvncaz.R.flushNeeded();}}
}
