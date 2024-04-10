/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.retrofit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory;
import junit.framework.TestCase;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.Buffer;
import org.junit.Assert;

import java.nio.charset.Charset;

public class Retrofit2ConverterFactoryTest0 extends TestCase {static class __CLR4_1_101xnn1xnnluszwfu9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,90310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_coverage() throws Exception {__CLR4_1_101xnn1xnnluszwfu9.R.globalSliceStart(getClass().getName(),90275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xmbe9a1xnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xnn1xnnluszwfu9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xnn1xnnluszwfu9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.retrofit.Retrofit2ConverterFactoryTest0.test_for_coverage",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90275,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xmbe9a1xnn() throws Exception{try{__CLR4_1_101xnn1xnnluszwfu9.R.inc(90275);
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90276);Retrofit2ConverterFactory f = new Retrofit2ConverterFactory();
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90277);f.getParserConfig();
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90278);f.getParserFeatures();
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90279);f.getParserFeatureValues();
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90280);f.getSerializeConfig();
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90281);f.getSerializerFeatures();
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90282);f.setParserConfig(ParserConfig.getGlobalInstance());
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90283);f.setParserFeatures(new Feature[0]);
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90284);f.setParserFeatureValues(0);
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90285);f.setSerializeConfig(SerializeConfig.globalInstance);
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90286);f.setSerializerFeatures(new SerializerFeature[0]);
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90287);f.getFastJsonConfig();
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90288);f.setFastJsonConfig(new FastJsonConfig());
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90289);f.requestBodyConverter(Model.class, null, null, null);
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90290);f.responseBodyConverter(Model.class, null, null);

        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90291);final Model model = new Model().setId(1).setName("test");
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90292);final String json = JSON.toJSONString(model);
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90293);final Buffer buffer = new Buffer().writeString(json, Charset.defaultCharset());
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90294);final Headers headers = Headers.of("Content-Type", "application/json; charset=UTF-8");
        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90295);final ResponseBody body = new RealResponseBody(headers, buffer);

        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90296);RequestBody requestBody = Retrofit2ConverterFactory.create()
                .requestBodyConverter(Model.class, null, null, null)
                .convert(model);

        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90297);Assert.assertNotEquals(requestBody.contentLength(), 0);

        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90298);Model mode2 = (Model) Retrofit2ConverterFactory.create()
                .responseBodyConverter(Model.class, null, null)
                .convert(body);

        __CLR4_1_101xnn1xnnluszwfu9.R.inc(90299);Assert.assertEquals(JSON.toJSONString(mode2), json);
    }finally{__CLR4_1_101xnn1xnnluszwfu9.R.flushNeeded();}}

    public static class Model {

        private int id;
        private String name;

        public int getId() {try{__CLR4_1_101xnn1xnnluszwfu9.R.inc(90300);
            __CLR4_1_101xnn1xnnluszwfu9.R.inc(90301);return id;
        }finally{__CLR4_1_101xnn1xnnluszwfu9.R.flushNeeded();}}

        public Model setId(int id) {try{__CLR4_1_101xnn1xnnluszwfu9.R.inc(90302);
            __CLR4_1_101xnn1xnnluszwfu9.R.inc(90303);this.id = id;
            __CLR4_1_101xnn1xnnluszwfu9.R.inc(90304);return this;
        }finally{__CLR4_1_101xnn1xnnluszwfu9.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101xnn1xnnluszwfu9.R.inc(90305);
            __CLR4_1_101xnn1xnnluszwfu9.R.inc(90306);return name;
        }finally{__CLR4_1_101xnn1xnnluszwfu9.R.flushNeeded();}}

        public Model setName(String name) {try{__CLR4_1_101xnn1xnnluszwfu9.R.inc(90307);
            __CLR4_1_101xnn1xnnluszwfu9.R.inc(90308);this.name = name;
            __CLR4_1_101xnn1xnnluszwfu9.R.inc(90309);return this;
        }finally{__CLR4_1_101xnn1xnnluszwfu9.R.flushNeeded();}}
    }
}
