/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support;

import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import junit.framework.TestCase;
import org.junit.Assert;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class FastJsonConfigTest extends TestCase {static class __CLR4_1_101xaz1xazluszwfq2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,89866,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101xaz1xazluszwfq2.R.globalSliceStart(getClass().getName(),89819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21xaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xaz1xazluszwfq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xaz1xazluszwfq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.FastJsonConfigTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89819,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21xaz() throws Exception{try{__CLR4_1_101xaz1xazluszwfq2.R.inc(89819);

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89820);FastJsonConfig config = new FastJsonConfig();

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89821);Assert.assertEquals(Charset.forName("UTF-8"), config.getCharset());
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89822);config.setCharset(Charset.forName("GBK"));
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89823);Assert.assertEquals(Charset.forName("GBK"), config.getCharset());

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89824);Assert.assertNull(config.getDateFormat());
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89825);config.setDateFormat("yyyyMMdd");
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89826);Assert.assertNotNull(config.getDateFormat());

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89827);config.setParserConfig(ParserConfig.getGlobalInstance());
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89828);Assert.assertNotNull(config.getParserConfig());

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89829);config.setSerializeConfig(SerializeConfig.globalInstance);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89830);Assert.assertNotNull(config.getSerializeConfig());

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89831);config.setFeatures(Feature.AllowComment, Feature.AutoCloseSource);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89832);Assert.assertEquals(2, config.getFeatures().length);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89833);Assert.assertEquals(Feature.AllowComment, config.getFeatures()[0]);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89834);Assert.assertEquals(Feature.AutoCloseSource, config.getFeatures()[1]);

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89835);config.setSerializerFeatures(SerializerFeature.IgnoreErrorGetter);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89836);Assert.assertEquals(1, config.getSerializerFeatures().length);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89837);Assert.assertEquals(SerializerFeature.IgnoreErrorGetter,
                config.getSerializerFeatures()[0]);

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89838);config.setSerializeFilters(serializeFilter);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89839);Assert.assertEquals(1, config.getSerializeFilters().length);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89840);Assert.assertEquals(serializeFilter, config.getSerializeFilters()[0]);

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89841);classSerializeFilter.put(TestVO.class, serializeFilter);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89842);config.setClassSerializeFilters(classSerializeFilter);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89843);Assert.assertEquals(1, config.getClassSerializeFilters().size());
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89844);Assert.assertEquals(classSerializeFilter,
                config.getClassSerializeFilters());
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89845);config.setClassSerializeFilters(null);

        __CLR4_1_101xaz1xazluszwfq2.R.inc(89846);config.setWriteContentLength(false);
        __CLR4_1_101xaz1xazluszwfq2.R.inc(89847);Assert.assertEquals(false, config.isWriteContentLength());
    }finally{__CLR4_1_101xaz1xazluszwfq2.R.flushNeeded();}}

    private Map<Class<?>, SerializeFilter> classSerializeFilter = new HashMap<Class<?>, SerializeFilter>();

    private SerializeFilter serializeFilter = new ValueFilter() {
        @Override
        public Object process(Object object, String name, Object value) {try{__CLR4_1_101xaz1xazluszwfq2.R.inc(89848);
            __CLR4_1_101xaz1xazluszwfq2.R.inc(89849);if ((((value == null)&&(__CLR4_1_101xaz1xazluszwfq2.R.iget(89850)!=0|true))||(__CLR4_1_101xaz1xazluszwfq2.R.iget(89851)==0&false))) {{
                __CLR4_1_101xaz1xazluszwfq2.R.inc(89852);return "";
            }
            }__CLR4_1_101xaz1xazluszwfq2.R.inc(89853);if ((((value instanceof Number)&&(__CLR4_1_101xaz1xazluszwfq2.R.iget(89854)!=0|true))||(__CLR4_1_101xaz1xazluszwfq2.R.iget(89855)==0&false))) {{
                __CLR4_1_101xaz1xazluszwfq2.R.inc(89856);return String.valueOf(value);
            }
            }__CLR4_1_101xaz1xazluszwfq2.R.inc(89857);return value;
        }finally{__CLR4_1_101xaz1xazluszwfq2.R.flushNeeded();}}
    };

    class TestVO {

        private Number num;

        private String name;

        public Number getNum() {try{__CLR4_1_101xaz1xazluszwfq2.R.inc(89858);
            __CLR4_1_101xaz1xazluszwfq2.R.inc(89859);return num;
        }finally{__CLR4_1_101xaz1xazluszwfq2.R.flushNeeded();}}

        public void setNum(Number num) {try{__CLR4_1_101xaz1xazluszwfq2.R.inc(89860);
            __CLR4_1_101xaz1xazluszwfq2.R.inc(89861);this.num = num;
        }finally{__CLR4_1_101xaz1xazluszwfq2.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101xaz1xazluszwfq2.R.inc(89862);
            __CLR4_1_101xaz1xazluszwfq2.R.inc(89863);return name;
        }finally{__CLR4_1_101xaz1xazluszwfq2.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101xaz1xazluszwfq2.R.inc(89864);
            __CLR4_1_101xaz1xazluszwfq2.R.inc(89865);this.name = name;
        }finally{__CLR4_1_101xaz1xazluszwfq2.R.flushNeeded();}}
    }
}
