/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.performance;

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

public class JacksonPageModelParser {public static class __CLR4_1_1027dz27dzlusqkwbj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,102992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * @param content
     * @throws JsonParseException
     * @throws IOException
     */
    public PageInstance parse(String content) throws JsonParseException, IOException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102887);
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102888);JsonFactory f = new JsonFactory();
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102889);JsonParser parser = f.createJsonParser(content);

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102890);JsonToken current = parser.nextToken(); // move to the start of the
        // object

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102891);String instanceId = getNextTextValue("sid", parser); // get instanceId

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102892);String pageId = getNextTextValue("cid", parser); // get pageId

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102893);current = parser.nextToken(); // move to field: segments
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102894);assertExpectedFiled(parser.getCurrentName(), "segments", parser.getCurrentLocation());

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102895);PageInstance pageInstance = new PageInstance();
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102896);pageInstance.setCid(pageId);
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102897);pageInstance.setSid(Long.valueOf(instanceId));
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102898);pageInstance.setSegments(parseSegments(parser));
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102899);return pageInstance;
        // \u6784\u5efa\u7ec4\u4ef6\u6811\uff0c\u7528\u4e8e\u9012\u5f52\u6e32\u67d3
        // pageInstance.buildComponentTree();

    }finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

    /**
     * @param parser
     * @throws JsonParseException
     * @throws IOException
     */
    private List<SegmentInstance> parseSegments(JsonParser parser) throws JsonParseException, IOException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102900);
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102901);JsonToken current = parser.nextToken();

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102902);assertExpectedJsonToken(current, JsonToken.START_ARRAY, parser.getCurrentLocation());
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102903);List<SegmentInstance> instances = new ArrayList<SegmentInstance>();
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102904);while ((current = parser.nextToken()) != JsonToken.END_ARRAY) {{

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102907);assertExpectedJsonToken(current, JsonToken.START_OBJECT, parser.getCurrentLocation());

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102908);String segmentId = getNextTextValue("cid", parser); // get pageId

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102909);current = parser.nextToken(); // move to field: layouts
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102910);assertExpectedFiled(parser.getCurrentName(), "layouts", parser.getCurrentLocation());
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102911);SegmentInstance instance = new SegmentInstance();
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102912);instance.setLayouts(parseLayouts(parser, segmentId));
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102913);instances.add(instance);

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102914);assertExpectedJsonToken((current = parser.nextToken()), JsonToken.END_OBJECT, parser.getCurrentLocation());

        }
        }__CLR4_1_1027dz27dzlusqkwbj.R.inc(102915);return instances;

    }finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

    /**
     * @param parser
     * @param segmentId
     * @throws JsonParseException
     * @throws IOException
     */
    private List<LayoutInstance> parseLayouts(JsonParser parser, String segment) throws JsonParseException, IOException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102916);

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102917);JsonToken current = parser.nextToken();

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102918);assertExpectedJsonToken(current, JsonToken.START_ARRAY, parser.getCurrentLocation());

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102919);List<LayoutInstance> layoutInThisSegment = new ArrayList<LayoutInstance>();

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102920);while ((current = parser.nextToken()) != JsonToken.END_ARRAY) {{

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102923);assertExpectedJsonToken(current, JsonToken.START_OBJECT, parser.getCurrentLocation());

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102924);String instanceId = getNextTextValue("sid", parser); // get
                                                                 // instanceId
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102925);String layoutId = getNextTextValue("cid", parser); // get
                                                               // layoutId

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102926);LayoutInstance layoutInstance = new LayoutInstance();
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102927);layoutInstance.setCid(layoutId);
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102928);layoutInstance.setSid(Long.valueOf(instanceId));
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102929);layoutInThisSegment.add(layoutInstance);

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102930);current = parser.nextToken(); // move to field: regions
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102931);assertExpectedFiled(parser.getCurrentName(), "regions", parser.getCurrentLocation());

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102932);layoutInstance.setRegions(parseRegions(parser, segment));

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102933);assertExpectedJsonToken((current = parser.nextToken()), JsonToken.END_OBJECT, parser.getCurrentLocation());
        }
        }__CLR4_1_1027dz27dzlusqkwbj.R.inc(102934);return layoutInThisSegment;

    }finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

    /**
     * @param parser
     * @param layoutId
     * @throws JsonParseException
     * @throws IOException
     */
    private List<RegionInstance> parseRegions(JsonParser parser, String segment) throws JsonParseException, IOException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102935);

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102936);JsonToken current = parser.nextToken();

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102937);assertExpectedJsonToken(current, JsonToken.START_ARRAY, parser.getCurrentLocation());
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102938);List<RegionInstance> instances = new ArrayList<RegionInstance>();
        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102939);while ((current = parser.nextToken()) != JsonToken.END_ARRAY) {{

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102942);assertExpectedJsonToken(current, JsonToken.START_OBJECT, parser.getCurrentLocation());

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102943);String regionId = getNextTextValue("cid", parser); // get regionId
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102944);RegionEnum region = RegionEnum.valueOf(regionId);

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102945);current = parser.nextToken(); // move to field: widgtes
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102946);assertExpectedFiled(parser.getCurrentName(), "widgets", parser.getCurrentLocation());
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102947);RegionInstance instance = new RegionInstance();
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102948);instance.setWidgtes(parseWidgets(parser, region));
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102949);instances.add(instance);

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102950);assertExpectedJsonToken((current = parser.nextToken()), JsonToken.END_OBJECT, parser.getCurrentLocation());
        }
        }__CLR4_1_1027dz27dzlusqkwbj.R.inc(102951);return instances;

    }finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

    /**
     * @param parser
     * @param layoutId
     * @param regionId
     * @throws JsonParseException
     * @throws IOException
     */
    private List<WidgetInstance> parseWidgets(JsonParser parser, RegionEnum region) throws JsonParseException, IOException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102952);

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102953);JsonToken current = parser.nextToken();

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102954);assertExpectedJsonToken(current, JsonToken.START_ARRAY, parser.getCurrentLocation());

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102955);List<WidgetInstance> widgetInThisRegion = new ArrayList<WidgetInstance>();

        __CLR4_1_1027dz27dzlusqkwbj.R.inc(102956);while ((current = parser.nextToken()) != JsonToken.END_ARRAY) {{

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102959);assertExpectedJsonToken(current, JsonToken.START_OBJECT, parser.getCurrentLocation());

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102960);String instanceId = getNextTextValue("sid", parser); // get
                                                                 // instanceId
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102961);String widgetId = getNextTextValue("cid", parser); // get
                                                               // widgetId

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102962);WidgetInstance widgetInstance = new WidgetInstance();
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102963);widgetInstance.setCid(widgetId);
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102964);widgetInstance.setSid(Long.valueOf(instanceId));

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102965);widgetInThisRegion.add(widgetInstance);

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102966);assertExpectedJsonToken((current = parser.nextToken()), JsonToken.END_OBJECT, parser.getCurrentLocation());
        }
        }__CLR4_1_1027dz27dzlusqkwbj.R.inc(102967);return widgetInThisRegion;

    }finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

    public static class JsonParserHelper {

        public static String getNextTextValue(String fieldName, JsonParser parser) throws JsonParseException, IOException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102968);

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102969);JsonToken current = parser.nextToken(); // move to filed
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102970);if ((((current != JsonToken.FIELD_NAME || !fieldName.equals(parser.getCurrentName()))&&(__CLR4_1_1027dz27dzlusqkwbj.R.iget(102971)!=0|true))||(__CLR4_1_1027dz27dzlusqkwbj.R.iget(102972)==0&false))) {{
                __CLR4_1_1027dz27dzlusqkwbj.R.inc(102973);reportParseError("Error occoured while getting value by field name:" + fieldName, parser.getCurrentLocation());
            }
            }__CLR4_1_1027dz27dzlusqkwbj.R.inc(102974);current = parser.nextToken(); // move to value
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102975);return parser.getText();

        }finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

        public static void assertExpectedJsonToken(JsonToken object, JsonToken expected, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102976);
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102977);if ((((object != expected)&&(__CLR4_1_1027dz27dzlusqkwbj.R.iget(102978)!=0|true))||(__CLR4_1_1027dz27dzlusqkwbj.R.iget(102979)==0&false))) {{
                __CLR4_1_1027dz27dzlusqkwbj.R.inc(102980);reportParseError(buildFailMessage(object, expected), jsonLoc);
            }
        }}finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

        public static void assertExpectedFiled(String object, String expected, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102981);
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102982);if ((((!expected.equals(object))&&(__CLR4_1_1027dz27dzlusqkwbj.R.iget(102983)!=0|true))||(__CLR4_1_1027dz27dzlusqkwbj.R.iget(102984)==0&false))) {{
                __CLR4_1_1027dz27dzlusqkwbj.R.inc(102985);reportParseError(buildFailMessage(object, expected), jsonLoc);
            }
        }}finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

        private static String buildFailMessage(Object object, Object expected) {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102986);
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102987);StringBuilder sb = new StringBuilder();
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102988);sb.append("get [").append(object).append("] but expect [").append(expected).append("] !");
            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102989);return sb.toString();
        }finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

        public static void reportParseError(String errorMsg, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_1_1027dz27dzlusqkwbj.R.inc(102990);

            __CLR4_1_1027dz27dzlusqkwbj.R.inc(102991);throw new JsonParseException(errorMsg, jsonLoc);

        }finally{__CLR4_1_1027dz27dzlusqkwbj.R.flushNeeded();}}

    }
}
