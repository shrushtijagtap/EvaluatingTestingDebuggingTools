/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.performance;

import static com.alibaba.json.test.performance.JacksonPageModelParser.JsonParserHelper.assertExpectedFiled;
import static com.alibaba.json.test.performance.JacksonPageModelParser.JsonParserHelper.assertExpectedJsonToken;
import static com.alibaba.json.test.performance.JacksonPageModelParser.JsonParserHelper.getNextTextValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.json.test.entity.pagemodel.LayoutInstance;
import com.alibaba.json.test.entity.pagemodel.PageInstance;
import com.alibaba.json.test.entity.pagemodel.RegionEnum;
import com.alibaba.json.test.entity.pagemodel.RegionInstance;
import com.alibaba.json.test.entity.pagemodel.SegmentInstance;
import com.alibaba.json.test.entity.pagemodel.WidgetInstance;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JacksonPageModelParser {public static class __CLR4_5_228bw28bwlusvnlix{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,104213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * @param content
     * @throws JsonParseException
     * @throws IOException
     */
    public PageInstance parse(String content) throws JsonParseException, IOException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104108);
        __CLR4_5_228bw28bwlusvnlix.R.inc(104109);JsonFactory f = new JsonFactory();
        __CLR4_5_228bw28bwlusvnlix.R.inc(104110);JsonParser parser = f.createJsonParser(content);

        __CLR4_5_228bw28bwlusvnlix.R.inc(104111);JsonToken current = parser.nextToken(); // move to the start of the
        // object

        __CLR4_5_228bw28bwlusvnlix.R.inc(104112);String instanceId = getNextTextValue("sid", parser); // get instanceId

        __CLR4_5_228bw28bwlusvnlix.R.inc(104113);String pageId = getNextTextValue("cid", parser); // get pageId

        __CLR4_5_228bw28bwlusvnlix.R.inc(104114);current = parser.nextToken(); // move to field: segments
        __CLR4_5_228bw28bwlusvnlix.R.inc(104115);assertExpectedFiled(parser.getCurrentName(), "segments", parser.getCurrentLocation());

        __CLR4_5_228bw28bwlusvnlix.R.inc(104116);PageInstance pageInstance = new PageInstance();
        __CLR4_5_228bw28bwlusvnlix.R.inc(104117);pageInstance.setCid(pageId);
        __CLR4_5_228bw28bwlusvnlix.R.inc(104118);pageInstance.setSid(Long.valueOf(instanceId));
        __CLR4_5_228bw28bwlusvnlix.R.inc(104119);pageInstance.setSegments(parseSegments(parser));
        __CLR4_5_228bw28bwlusvnlix.R.inc(104120);return pageInstance;
        // \u6784\u5efa\u7ec4\u4ef6\u6811\uff0c\u7528\u4e8e\u9012\u5f52\u6e32\u67d3
        // pageInstance.buildComponentTree();

    }finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

    /**
     * @param parser
     * @throws JsonParseException
     * @throws IOException
     */
    private List<SegmentInstance> parseSegments(JsonParser parser) throws JsonParseException, IOException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104121);
        __CLR4_5_228bw28bwlusvnlix.R.inc(104122);JsonToken current = parser.nextToken();

        __CLR4_5_228bw28bwlusvnlix.R.inc(104123);assertExpectedJsonToken(current, JsonToken.START_ARRAY, parser.getCurrentLocation());
        __CLR4_5_228bw28bwlusvnlix.R.inc(104124);List<SegmentInstance> instances = new ArrayList<SegmentInstance>();
        __CLR4_5_228bw28bwlusvnlix.R.inc(104125);while ((current = parser.nextToken()) != JsonToken.END_ARRAY) {{

            __CLR4_5_228bw28bwlusvnlix.R.inc(104128);assertExpectedJsonToken(current, JsonToken.START_OBJECT, parser.getCurrentLocation());

            __CLR4_5_228bw28bwlusvnlix.R.inc(104129);String segmentId = getNextTextValue("cid", parser); // get pageId

            __CLR4_5_228bw28bwlusvnlix.R.inc(104130);current = parser.nextToken(); // move to field: layouts
            __CLR4_5_228bw28bwlusvnlix.R.inc(104131);assertExpectedFiled(parser.getCurrentName(), "layouts", parser.getCurrentLocation());
            __CLR4_5_228bw28bwlusvnlix.R.inc(104132);SegmentInstance instance = new SegmentInstance();
            __CLR4_5_228bw28bwlusvnlix.R.inc(104133);instance.setLayouts(parseLayouts(parser, segmentId));
            __CLR4_5_228bw28bwlusvnlix.R.inc(104134);instances.add(instance);

            __CLR4_5_228bw28bwlusvnlix.R.inc(104135);assertExpectedJsonToken((current = parser.nextToken()), JsonToken.END_OBJECT, parser.getCurrentLocation());

        }
        }__CLR4_5_228bw28bwlusvnlix.R.inc(104136);return instances;

    }finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

    /**
     * @param parser
     * @param segmentId
     * @throws JsonParseException
     * @throws IOException
     */
    private List<LayoutInstance> parseLayouts(JsonParser parser, String segment) throws JsonParseException, IOException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104137);

        __CLR4_5_228bw28bwlusvnlix.R.inc(104138);JsonToken current = parser.nextToken();

        __CLR4_5_228bw28bwlusvnlix.R.inc(104139);assertExpectedJsonToken(current, JsonToken.START_ARRAY, parser.getCurrentLocation());

        __CLR4_5_228bw28bwlusvnlix.R.inc(104140);List<LayoutInstance> layoutInThisSegment = new ArrayList<LayoutInstance>();

        __CLR4_5_228bw28bwlusvnlix.R.inc(104141);while ((current = parser.nextToken()) != JsonToken.END_ARRAY) {{

            __CLR4_5_228bw28bwlusvnlix.R.inc(104144);assertExpectedJsonToken(current, JsonToken.START_OBJECT, parser.getCurrentLocation());

            __CLR4_5_228bw28bwlusvnlix.R.inc(104145);String instanceId = getNextTextValue("sid", parser); // get
                                                                 // instanceId
            __CLR4_5_228bw28bwlusvnlix.R.inc(104146);String layoutId = getNextTextValue("cid", parser); // get
                                                               // layoutId

            __CLR4_5_228bw28bwlusvnlix.R.inc(104147);LayoutInstance layoutInstance = new LayoutInstance();
            __CLR4_5_228bw28bwlusvnlix.R.inc(104148);layoutInstance.setCid(layoutId);
            __CLR4_5_228bw28bwlusvnlix.R.inc(104149);layoutInstance.setSid(Long.valueOf(instanceId));
            __CLR4_5_228bw28bwlusvnlix.R.inc(104150);layoutInThisSegment.add(layoutInstance);

            __CLR4_5_228bw28bwlusvnlix.R.inc(104151);current = parser.nextToken(); // move to field: regions
            __CLR4_5_228bw28bwlusvnlix.R.inc(104152);assertExpectedFiled(parser.getCurrentName(), "regions", parser.getCurrentLocation());

            __CLR4_5_228bw28bwlusvnlix.R.inc(104153);layoutInstance.setRegions(parseRegions(parser, segment));

            __CLR4_5_228bw28bwlusvnlix.R.inc(104154);assertExpectedJsonToken((current = parser.nextToken()), JsonToken.END_OBJECT, parser.getCurrentLocation());
        }
        }__CLR4_5_228bw28bwlusvnlix.R.inc(104155);return layoutInThisSegment;

    }finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

    /**
     * @param parser
     * @param layoutId
     * @throws JsonParseException
     * @throws IOException
     */
    private List<RegionInstance> parseRegions(JsonParser parser, String segment) throws JsonParseException, IOException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104156);

        __CLR4_5_228bw28bwlusvnlix.R.inc(104157);JsonToken current = parser.nextToken();

        __CLR4_5_228bw28bwlusvnlix.R.inc(104158);assertExpectedJsonToken(current, JsonToken.START_ARRAY, parser.getCurrentLocation());
        __CLR4_5_228bw28bwlusvnlix.R.inc(104159);List<RegionInstance> instances = new ArrayList<RegionInstance>();
        __CLR4_5_228bw28bwlusvnlix.R.inc(104160);while ((current = parser.nextToken()) != JsonToken.END_ARRAY) {{

            __CLR4_5_228bw28bwlusvnlix.R.inc(104163);assertExpectedJsonToken(current, JsonToken.START_OBJECT, parser.getCurrentLocation());

            __CLR4_5_228bw28bwlusvnlix.R.inc(104164);String regionId = getNextTextValue("cid", parser); // get regionId
            __CLR4_5_228bw28bwlusvnlix.R.inc(104165);RegionEnum region = RegionEnum.valueOf(regionId);

            __CLR4_5_228bw28bwlusvnlix.R.inc(104166);current = parser.nextToken(); // move to field: widgtes
            __CLR4_5_228bw28bwlusvnlix.R.inc(104167);assertExpectedFiled(parser.getCurrentName(), "widgets", parser.getCurrentLocation());
            __CLR4_5_228bw28bwlusvnlix.R.inc(104168);RegionInstance instance = new RegionInstance();
            __CLR4_5_228bw28bwlusvnlix.R.inc(104169);instance.setWidgtes(parseWidgets(parser, region));
            __CLR4_5_228bw28bwlusvnlix.R.inc(104170);instances.add(instance);

            __CLR4_5_228bw28bwlusvnlix.R.inc(104171);assertExpectedJsonToken((current = parser.nextToken()), JsonToken.END_OBJECT, parser.getCurrentLocation());
        }
        }__CLR4_5_228bw28bwlusvnlix.R.inc(104172);return instances;

    }finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

    /**
     * @param parser
     * @param layoutId
     * @param regionId
     * @throws JsonParseException
     * @throws IOException
     */
    private List<WidgetInstance> parseWidgets(JsonParser parser, RegionEnum region) throws JsonParseException, IOException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104173);

        __CLR4_5_228bw28bwlusvnlix.R.inc(104174);JsonToken current = parser.nextToken();

        __CLR4_5_228bw28bwlusvnlix.R.inc(104175);assertExpectedJsonToken(current, JsonToken.START_ARRAY, parser.getCurrentLocation());

        __CLR4_5_228bw28bwlusvnlix.R.inc(104176);List<WidgetInstance> widgetInThisRegion = new ArrayList<WidgetInstance>();

        __CLR4_5_228bw28bwlusvnlix.R.inc(104177);while ((current = parser.nextToken()) != JsonToken.END_ARRAY) {{

            __CLR4_5_228bw28bwlusvnlix.R.inc(104180);assertExpectedJsonToken(current, JsonToken.START_OBJECT, parser.getCurrentLocation());

            __CLR4_5_228bw28bwlusvnlix.R.inc(104181);String instanceId = getNextTextValue("sid", parser); // get
                                                                 // instanceId
            __CLR4_5_228bw28bwlusvnlix.R.inc(104182);String widgetId = getNextTextValue("cid", parser); // get
                                                               // widgetId

            __CLR4_5_228bw28bwlusvnlix.R.inc(104183);WidgetInstance widgetInstance = new WidgetInstance();
            __CLR4_5_228bw28bwlusvnlix.R.inc(104184);widgetInstance.setCid(widgetId);
            __CLR4_5_228bw28bwlusvnlix.R.inc(104185);widgetInstance.setSid(Long.valueOf(instanceId));

            __CLR4_5_228bw28bwlusvnlix.R.inc(104186);widgetInThisRegion.add(widgetInstance);

            __CLR4_5_228bw28bwlusvnlix.R.inc(104187);assertExpectedJsonToken((current = parser.nextToken()), JsonToken.END_OBJECT, parser.getCurrentLocation());
        }
        }__CLR4_5_228bw28bwlusvnlix.R.inc(104188);return widgetInThisRegion;

    }finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

    public static class JsonParserHelper {

        public static String getNextTextValue(String fieldName, JsonParser parser) throws JsonParseException, IOException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104189);

            __CLR4_5_228bw28bwlusvnlix.R.inc(104190);JsonToken current = parser.nextToken(); // move to filed
            __CLR4_5_228bw28bwlusvnlix.R.inc(104191);if ((((current != JsonToken.FIELD_NAME || !fieldName.equals(parser.getCurrentName()))&&(__CLR4_5_228bw28bwlusvnlix.R.iget(104192)!=0|true))||(__CLR4_5_228bw28bwlusvnlix.R.iget(104193)==0&false))) {{
                __CLR4_5_228bw28bwlusvnlix.R.inc(104194);reportParseError("Error occoured while getting value by field name:" + fieldName, parser.getCurrentLocation());
            }
            }__CLR4_5_228bw28bwlusvnlix.R.inc(104195);current = parser.nextToken(); // move to value
            __CLR4_5_228bw28bwlusvnlix.R.inc(104196);return parser.getText();

        }finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

        public static void assertExpectedJsonToken(JsonToken object, JsonToken expected, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104197);
            __CLR4_5_228bw28bwlusvnlix.R.inc(104198);if ((((object != expected)&&(__CLR4_5_228bw28bwlusvnlix.R.iget(104199)!=0|true))||(__CLR4_5_228bw28bwlusvnlix.R.iget(104200)==0&false))) {{
                __CLR4_5_228bw28bwlusvnlix.R.inc(104201);reportParseError(buildFailMessage(object, expected), jsonLoc);
            }
        }}finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

        public static void assertExpectedFiled(String object, String expected, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104202);
            __CLR4_5_228bw28bwlusvnlix.R.inc(104203);if ((((!expected.equals(object))&&(__CLR4_5_228bw28bwlusvnlix.R.iget(104204)!=0|true))||(__CLR4_5_228bw28bwlusvnlix.R.iget(104205)==0&false))) {{
                __CLR4_5_228bw28bwlusvnlix.R.inc(104206);reportParseError(buildFailMessage(object, expected), jsonLoc);
            }
        }}finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

        private static String buildFailMessage(Object object, Object expected) {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104207);
            __CLR4_5_228bw28bwlusvnlix.R.inc(104208);StringBuilder sb = new StringBuilder();
            __CLR4_5_228bw28bwlusvnlix.R.inc(104209);sb.append("get [").append(object).append("] but expect [").append(expected).append("] !");
            __CLR4_5_228bw28bwlusvnlix.R.inc(104210);return sb.toString();
        }finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

        public static void reportParseError(String errorMsg, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_5_228bw28bwlusvnlix.R.inc(104211);

            __CLR4_5_228bw28bwlusvnlix.R.inc(104212);throw new JsonParseException(errorMsg, jsonLoc);

        }finally{__CLR4_5_228bw28bwlusvnlix.R.flushNeeded();}}

    }
}
