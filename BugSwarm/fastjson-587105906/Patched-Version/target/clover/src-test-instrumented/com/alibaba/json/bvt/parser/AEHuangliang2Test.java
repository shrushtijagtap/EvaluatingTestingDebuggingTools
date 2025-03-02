/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.json.bvtVO.ae.huangliang2.*;
import junit.framework.TestCase;

import java.lang.reflect.Type;

/**
 * Created by wenshao on 09/05/2017.
 */
public class AEHuangliang2Test extends TestCase {static class __CLR4_5_21exw1exwlusyjtii{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66057,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String jsonData = "{\n" +
            "    \"areas\": [\n" +
            "      {\n" +
            "        \"@type\": \"section\",\n" +
            "        \"templateId\": \"grid\",\n" +
            "        \"style\": {\n" +
            "          \"card\" : \"true\",\n" +
            "          \"column-count\":\"2\",\n" +
            "          \"aspect-ratio\":\"2\",\n" +
            "          \"margins\":\"16 0 16 16\",\n" +
            "          \"background-color\": \"#ffffff\",\n" +
            "          \"column-gap\": \"10\"\n" +
            "        },\n" +
            "        \"children\": [\n" +
            "        {\n" +
            "        \"@type\": \"section\",\n" +
            "        \"templateId\": \"grid\",\n" +
            "        \"style\": {\n" +
            "          \"card\" : \"true\",\n" +
            "          \"column-count\":\"2\",\n" +
            "          \"aspect-ratio\":\"2\",\n" +
            "          \"margins\":\"16 0 16 16\",\n" +
            "          \"background-color\": \"#ffffff\",\n" +
            "          \"column-gap\": \"10\"\n" +
            "        },\n" +
            "        \"children\": [\n" +
            "          {\n" +
            "            \"@type\": \"floorV2\",\n" +
            "            \"templateId\": \"base\",\n" +
            "            \"image\": \"http://xxx\",\n" +
            "            \"fields\": [\n" +
            "              {\n" +
            "                \"index\": 0,\n" +
            "                \"value\": \"xxxx\",\n" +
            "                \"type\": \"text\",\n" +
            "                \"track\": {\n" +
            "                  \"name\": \"track name\",\n" +
            "                  \"params\": {\n" +
            "                    \"trackParam1\": \"trackParam1\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"extInfo\": {\n" +
            "                  \"likeByMe\": \"true\",\n" +
            "                  \"isFollowed\": \"true\"\n" +
            "                },\n" +
            "                \"action\": {\n" +
            "                  \"type\": \"click\",\n" +
            "                  \"action\": \"aecmd://nativie/invokeApi?name=key1&likeId=111&likeByMe=true\"\n" +
            "                }\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bizId\": \"banner-myae-1-746877468\",\n" +
            "            \"style\": {\n" +
            "              \"card\" : \"true\",\n" +
            "              \"background-color\": \"#000000\"\n" +
            "            },\n" +
            "            \"isTest\": false\n" +
            "          },\n" +
            "          {\n" +
            "            \"@type\": \"floorV2\",\n" +
            "            \"templateId\": \"base\",\n" +
            "            \"image\": \"http://xxx\",\n" +
            "            \"fields\": [\n" +
            "              {\n" +
            "                \"index\": 0,\n" +
            "                \"value\": \"xxxx\",\n" +
            "                \"type\": \"text\",\n" +
            "                \"track\": {\n" +
            "                  \"name\": \"track name\",\n" +
            "                  \"params\": {\n" +
            "                    \"trackParam1\": \"trackParam1\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"action\": {\n" +
            "                  \"type\": \"click\",\n" +
            "                  \"action\": \"aecmd://xxxx\"\n" +
            "                }\n" +
            "              }\n" +
            "            ],\n" +
            "            \"extInfo\": {\n" +
            "              \"likeByMe\": \"true\"\n" +
            "            },\n" +
            "            \"bizId\": \"banner-myae-1-746877468\",\n" +
            "            \"style\": {\n" +
            "              \"card\" : \"true\",\n" +
            "              \"background-color\": \"#ffc1c1\"\n" +
            "            },\n" +
            "            \"isTest\": false\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "          {\n" +
            "            \"@type\": \"floorV2\",\n" +
            "            \"templateId\": \"base\",\n" +
            "            \"image\": \"http://xxx\",\n" +
            "            \"fields\": [\n" +
            "              {\n" +
            "                \"index\": 0,\n" +
            "                \"value\": \"xxxx\",\n" +
            "                \"type\": \"text\",\n" +
            "                \"track\": {\n" +
            "                  \"name\": \"track name\",\n" +
            "                  \"params\": {\n" +
            "                    \"trackParam1\": \"trackParam1\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"extInfo\": {\n" +
            "                  \"likeByMe\": \"true\",\n" +
            "                  \"isFollowed\": \"true\"\n" +
            "                },\n" +
            "                \"action\": {\n" +
            "                  \"type\": \"click\",\n" +
            "                  \"action\": \"aecmd://nativie/invokeApi?name=key1&likeId=111&likeByMe=true\"\n" +
            "                }\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bizId\": \"banner-myae-1-746877468\",\n" +
            "            \"style\": {\n" +
            "              \"card\" : \"true\",\n" +
            "              \"background-color\": \"#000000\"\n" +
            "            },\n" +
            "            \"isTest\": false\n" +
            "          },\n" +
            "          {\n" +
            "            \"@type\": \"floorV2\",\n" +
            "            \"templateId\": \"base\",\n" +
            "            \"image\": \"http://xxx\",\n" +
            "            \"fields\": [\n" +
            "              {\n" +
            "                \"index\": 0,\n" +
            "                \"value\": \"xxxx\",\n" +
            "                \"type\": \"text\",\n" +
            "                \"track\": {\n" +
            "                  \"name\": \"track name\",\n" +
            "                  \"params\": {\n" +
            "                    \"trackParam1\": \"trackParam1\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"action\": {\n" +
            "                  \"type\": \"click\",\n" +
            "                  \"action\": \"aecmd://xxxx\"\n" +
            "                }\n" +
            "              }\n" +
            "            ],\n" +
            "            \"extInfo\": {\n" +
            "              \"likeByMe\": \"true\"\n" +
            "            },\n" +
            "            \"bizId\": \"banner-myae-1-746877468\",\n" +
            "            \"style\": {\n" +
            "              \"card\" : \"true\",\n" +
            "              \"background-color\": \"#ffc1c1\"\n" +
            "            },\n" +
            "            \"isTest\": false\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    ],\n" +
            "    \"version\": 3,\n" +
            "    \"currency\": \"RUB\"\n" +
            "  }";

    static String floordata = "{\n" +
            "    \"isTest\": true,\n" +
            "    \"mockResult\": {\n" +
            "  \"body\": {\n" +
            "    \"areas\": [\n" +
            "      {\n" +
            "        \"@type\": \"section\",\n" +
            "        \"templateId\": \"grid\",\n" +
            "        \"style\": {\n" +
            "          \"card\" : \"true\",\n" +
            "          \"column-count\":\"2\",\n" +
            "          \"aspect-ratio\":\"2\",\n" +
            "          \"margins\":\"16 0 16 16\",\n" +
            "          \"background-color\": \"#ffffff\",\n" +
            "          \"column-gap\": \"10\"\n" +
            "        },\n" +
            "        \"children\": [\n" +
            "        {\n" +
            "        \"@type\": \"section\",\n" +
            "        \"templateId\": \"grid\",\n" +
            "        \"style\": {\n" +
            "          \"card\" : \"true\",\n" +
            "          \"column-count\":\"2\",\n" +
            "          \"aspect-ratio\":\"2\",\n" +
            "          \"margins\":\"16 0 16 16\",\n" +
            "          \"background-color\": \"#ffffff\",\n" +
            "          \"column-gap\": \"10\"\n" +
            "        },\n" +
            "        \"children\": [\n" +
            "          {\n" +
            "            \"@type\": \"floorV2\",\n" +
            "            \"templateId\": \"base\",\n" +
            "            \"image\": \"http://xxx\",\n" +
            "            \"fields\": [\n" +
            "              {\n" +
            "                \"index\": 0,\n" +
            "                \"value\": \"xxxx\",\n" +
            "                \"type\": \"text\",\n" +
            "                \"track\": {\n" +
            "                  \"name\": \"track name\",\n" +
            "                  \"params\": {\n" +
            "                    \"trackParam1\": \"trackParam1\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"extInfo\": {\n" +
            "                  \"likeByMe\": \"true\",\n" +
            "                  \"isFollowed\": \"true\"\n" +
            "                },\n" +
            "                \"action\": {\n" +
            "                  \"type\": \"click\",\n" +
            "                  \"action\": \"aecmd://nativie/invokeApi?name=key1&likeId=111&likeByMe=true\"\n" +
            "                }\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bizId\": \"banner-myae-1-746877468\",\n" +
            "            \"style\": {\n" +
            "              \"card\" : \"true\",\n" +
            "              \"background-color\": \"#000000\"\n" +
            "            },\n" +
            "            \"isTest\": false\n" +
            "          },\n" +
            "          {\n" +
            "            \"@type\": \"floorV2\",\n" +
            "            \"templateId\": \"base\",\n" +
            "            \"image\": \"http://xxx\",\n" +
            "            \"fields\": [\n" +
            "              {\n" +
            "                \"index\": 0,\n" +
            "                \"value\": \"xxxx\",\n" +
            "                \"type\": \"text\",\n" +
            "                \"track\": {\n" +
            "                  \"name\": \"track name\",\n" +
            "                  \"params\": {\n" +
            "                    \"trackParam1\": \"trackParam1\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"action\": {\n" +
            "                  \"type\": \"click\",\n" +
            "                  \"action\": \"aecmd://xxxx\"\n" +
            "                }\n" +
            "              }\n" +
            "            ],\n" +
            "            \"extInfo\": {\n" +
            "              \"likeByMe\": \"true\"\n" +
            "            },\n" +
            "            \"bizId\": \"banner-myae-1-746877468\",\n" +
            "            \"style\": {\n" +
            "              \"card\" : \"true\",\n" +
            "              \"background-color\": \"#ffc1c1\"\n" +
            "            },\n" +
            "            \"isTest\": false\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "          {\n" +
            "            \"@type\": \"floorV2\",\n" +
            "            \"templateId\": \"base\",\n" +
            "            \"image\": \"http://xxx\",\n" +
            "            \"fields\": [\n" +
            "              {\n" +
            "                \"index\": 0,\n" +
            "                \"value\": \"xxxx\",\n" +
            "                \"type\": \"text\",\n" +
            "                \"track\": {\n" +
            "                  \"name\": \"track name\",\n" +
            "                  \"params\": {\n" +
            "                    \"trackParam1\": \"trackParam1\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"extInfo\": {\n" +
            "                  \"likeByMe\": \"true\",\n" +
            "                  \"isFollowed\": \"true\"\n" +
            "                },\n" +
            "                \"action\": {\n" +
            "                  \"type\": \"click\",\n" +
            "                  \"action\": \"aecmd://nativie/invokeApi?name=key1&likeId=111&likeByMe=true\"\n" +
            "                }\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bizId\": \"banner-myae-1-746877468\",\n" +
            "            \"style\": {\n" +
            "              \"card\" : \"true\",\n" +
            "              \"background-color\": \"#000000\"\n" +
            "            },\n" +
            "            \"isTest\": false\n" +
            "          },\n" +
            "          {\n" +
            "            \"@type\": \"floorV2\",\n" +
            "            \"templateId\": \"base\",\n" +
            "            \"image\": \"http://xxx\",\n" +
            "            \"fields\": [\n" +
            "              {\n" +
            "                \"index\": 0,\n" +
            "                \"value\": \"xxxx\",\n" +
            "                \"type\": \"text\",\n" +
            "                \"track\": {\n" +
            "                  \"name\": \"track name\",\n" +
            "                  \"params\": {\n" +
            "                    \"trackParam1\": \"trackParam1\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"action\": {\n" +
            "                  \"type\": \"click\",\n" +
            "                  \"action\": \"aecmd://xxxx\"\n" +
            "                }\n" +
            "              }\n" +
            "            ],\n" +
            "            \"extInfo\": {\n" +
            "              \"likeByMe\": \"true\"\n" +
            "            },\n" +
            "            \"bizId\": \"banner-myae-1-746877468\",\n" +
            "            \"style\": {\n" +
            "              \"card\" : \"true\",\n" +
            "              \"background-color\": \"#ffc1c1\"\n" +
            "            },\n" +
            "            \"isTest\": false\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    ],\n" +
            "    \"version\": 3,\n" +
            "    \"currency\": \"RUB\"\n" +
            "  },\n" +
            "  \"head\": {\n" +
            "    \"message\": \"\",\n" +
            "    \"serverTime\": 1489473042814,\n" +
            "    \"code\": \"200\",\n" +
            "    \"ab\": \"yepxf_B\"\n" +
            "  }\n" +
            "}\n" +
            "}";

    public void test_for_issue() throws Exception {__CLR4_5_21exw1exwlusyjtii.R.globalSliceStart(getClass().getName(),66020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1exw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21exw1exwlusyjtii.R.rethrow($CLV_t2$);}finally{__CLR4_5_21exw1exwlusyjtii.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.AEHuangliang2Test.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1exw() throws Exception{try{__CLR4_5_21exw1exwlusyjtii.R.inc(66020);
        __CLR4_5_21exw1exwlusyjtii.R.inc(66021);ParserConfig.getGlobalInstance().putDeserializer(Area.class, new ObjectDeserializer() {

            public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21exw1exwlusyjtii.R.inc(66022);
                __CLR4_5_21exw1exwlusyjtii.R.inc(66023);JSONObject jsonObject = (JSONObject) parser.parse();
                __CLR4_5_21exw1exwlusyjtii.R.inc(66024);String areaType;

                __CLR4_5_21exw1exwlusyjtii.R.inc(66025);if ((((jsonObject.get("type") instanceof String)&&(__CLR4_5_21exw1exwlusyjtii.R.iget(66026)!=0|true))||(__CLR4_5_21exw1exwlusyjtii.R.iget(66027)==0&false))) {{
                    __CLR4_5_21exw1exwlusyjtii.R.inc(66028);areaType = (String) jsonObject.get("type");
                } }else {{
                    __CLR4_5_21exw1exwlusyjtii.R.inc(66029);return null;
                }
                }__CLR4_5_21exw1exwlusyjtii.R.inc(66030);if ((((Area.TYPE_SECTION.equals(areaType))&&(__CLR4_5_21exw1exwlusyjtii.R.iget(66031)!=0|true))||(__CLR4_5_21exw1exwlusyjtii.R.iget(66032)==0&false))) {{
                    __CLR4_5_21exw1exwlusyjtii.R.inc(66033);String text = jsonObject.toJSONString();
                    __CLR4_5_21exw1exwlusyjtii.R.inc(66034);return (T) JSON.parseObject(text, Section.class);
                } }else {__CLR4_5_21exw1exwlusyjtii.R.inc(66035);if ((((Area.TYPE_FLOORV1.equals(areaType))&&(__CLR4_5_21exw1exwlusyjtii.R.iget(66036)!=0|true))||(__CLR4_5_21exw1exwlusyjtii.R.iget(66037)==0&false))) {{
                    __CLR4_5_21exw1exwlusyjtii.R.inc(66038);String text = jsonObject.toJSONString();
                    __CLR4_5_21exw1exwlusyjtii.R.inc(66039);return (T) JSON.parseObject(text, FloorV1.class);
                } }else {__CLR4_5_21exw1exwlusyjtii.R.inc(66040);if ((((Area.TYPE_FLOORV2.equals(areaType))&&(__CLR4_5_21exw1exwlusyjtii.R.iget(66041)!=0|true))||(__CLR4_5_21exw1exwlusyjtii.R.iget(66042)==0&false))) {{
                    __CLR4_5_21exw1exwlusyjtii.R.inc(66043);String text = jsonObject.toJSONString();
                    __CLR4_5_21exw1exwlusyjtii.R.inc(66044);return (T) JSON.parseObject(text, FloorV2.class);
                }

                }}}__CLR4_5_21exw1exwlusyjtii.R.inc(66045);return null;
            }finally{__CLR4_5_21exw1exwlusyjtii.R.flushNeeded();}}

            public int getFastMatchToken() {try{__CLR4_5_21exw1exwlusyjtii.R.inc(66046);
                __CLR4_5_21exw1exwlusyjtii.R.inc(66047);return JSONToken.LBRACE;
            }finally{__CLR4_5_21exw1exwlusyjtii.R.flushNeeded();}}
        });

        __CLR4_5_21exw1exwlusyjtii.R.inc(66048);ParserConfig.getGlobalInstance().addAccept("section");
        __CLR4_5_21exw1exwlusyjtii.R.inc(66049);ParserConfig.getGlobalInstance().addAccept("floorV2");


        __CLR4_5_21exw1exwlusyjtii.R.inc(66050);MockResult data = JSON.parseObject(floordata, MockResult.class);
        __CLR4_5_21exw1exwlusyjtii.R.inc(66051);String mockResultJson = JSON.toJSONString(data.mockResult);
        __CLR4_5_21exw1exwlusyjtii.R.inc(66052);NetResponse response = JSON.parseObject(mockResultJson, NetResponse.class);

        __CLR4_5_21exw1exwlusyjtii.R.inc(66053);String bodyJson = JSON.toJSONString(response.body);
        __CLR4_5_21exw1exwlusyjtii.R.inc(66054);System.out.println(bodyJson);
        __CLR4_5_21exw1exwlusyjtii.R.inc(66055);FloorPageData pageData = JSON.parseObject(bodyJson, FloorPageData.class);
        __CLR4_5_21exw1exwlusyjtii.R.inc(66056);assertNotNull(pageData.areas);
    }finally{__CLR4_5_21exw1exwlusyjtii.R.flushNeeded();}}
}
