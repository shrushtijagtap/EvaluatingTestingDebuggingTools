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

public class FastJsonConfigTest extends TestCase {static class __CLR4_1_101wcr1wcrlusqkm01{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,88634,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101wcr1wcrlusqkm01.R.globalSliceStart(getClass().getName(),88587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21wcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wcr1wcrlusqkm01.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wcr1wcrlusqkm01.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.FastJsonConfigTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88587,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21wcr() throws Exception{try{__CLR4_1_101wcr1wcrlusqkm01.R.inc(88587);

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88588);FastJsonConfig config = new FastJsonConfig();

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88589);Assert.assertEquals(Charset.forName("UTF-8"), config.getCharset());
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88590);config.setCharset(Charset.forName("GBK"));
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88591);Assert.assertEquals(Charset.forName("GBK"), config.getCharset());

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88592);Assert.assertNull(config.getDateFormat());
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88593);config.setDateFormat("yyyyMMdd");
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88594);Assert.assertNotNull(config.getDateFormat());

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88595);config.setParserConfig(ParserConfig.getGlobalInstance());
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88596);Assert.assertNotNull(config.getParserConfig());

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88597);config.setSerializeConfig(SerializeConfig.globalInstance);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88598);Assert.assertNotNull(config.getSerializeConfig());

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88599);config.setFeatures(Feature.AllowComment, Feature.AutoCloseSource);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88600);Assert.assertEquals(2, config.getFeatures().length);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88601);Assert.assertEquals(Feature.AllowComment, config.getFeatures()[0]);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88602);Assert.assertEquals(Feature.AutoCloseSource, config.getFeatures()[1]);

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88603);config.setSerializerFeatures(SerializerFeature.IgnoreErrorGetter);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88604);Assert.assertEquals(1, config.getSerializerFeatures().length);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88605);Assert.assertEquals(SerializerFeature.IgnoreErrorGetter,
                config.getSerializerFeatures()[0]);

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88606);config.setSerializeFilters(serializeFilter);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88607);Assert.assertEquals(1, config.getSerializeFilters().length);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88608);Assert.assertEquals(serializeFilter, config.getSerializeFilters()[0]);

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88609);classSerializeFilter.put(TestVO.class, serializeFilter);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88610);config.setClassSerializeFilters(classSerializeFilter);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88611);Assert.assertEquals(1, config.getClassSerializeFilters().size());
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88612);Assert.assertEquals(classSerializeFilter,
                config.getClassSerializeFilters());
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88613);config.setClassSerializeFilters(null);

        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88614);config.setWriteContentLength(false);
        __CLR4_1_101wcr1wcrlusqkm01.R.inc(88615);Assert.assertEquals(false, config.isWriteContentLength());
    }finally{__CLR4_1_101wcr1wcrlusqkm01.R.flushNeeded();}}

    private Map<Class<?>, SerializeFilter> classSerializeFilter = new HashMap<Class<?>, SerializeFilter>();

    private SerializeFilter serializeFilter = new ValueFilter() {
        @Override
        public Object process(Object object, String name, Object value) {try{__CLR4_1_101wcr1wcrlusqkm01.R.inc(88616);
            __CLR4_1_101wcr1wcrlusqkm01.R.inc(88617);if ((((value == null)&&(__CLR4_1_101wcr1wcrlusqkm01.R.iget(88618)!=0|true))||(__CLR4_1_101wcr1wcrlusqkm01.R.iget(88619)==0&false))) {{
                __CLR4_1_101wcr1wcrlusqkm01.R.inc(88620);return "";
            }
            }__CLR4_1_101wcr1wcrlusqkm01.R.inc(88621);if ((((value instanceof Number)&&(__CLR4_1_101wcr1wcrlusqkm01.R.iget(88622)!=0|true))||(__CLR4_1_101wcr1wcrlusqkm01.R.iget(88623)==0&false))) {{
                __CLR4_1_101wcr1wcrlusqkm01.R.inc(88624);return String.valueOf(value);
            }
            }__CLR4_1_101wcr1wcrlusqkm01.R.inc(88625);return value;
        }finally{__CLR4_1_101wcr1wcrlusqkm01.R.flushNeeded();}}
    };

    class TestVO {

        private Number num;

        private String name;

        public Number getNum() {try{__CLR4_1_101wcr1wcrlusqkm01.R.inc(88626);
            __CLR4_1_101wcr1wcrlusqkm01.R.inc(88627);return num;
        }finally{__CLR4_1_101wcr1wcrlusqkm01.R.flushNeeded();}}

        public void setNum(Number num) {try{__CLR4_1_101wcr1wcrlusqkm01.R.inc(88628);
            __CLR4_1_101wcr1wcrlusqkm01.R.inc(88629);this.num = num;
        }finally{__CLR4_1_101wcr1wcrlusqkm01.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101wcr1wcrlusqkm01.R.inc(88630);
            __CLR4_1_101wcr1wcrlusqkm01.R.inc(88631);return name;
        }finally{__CLR4_1_101wcr1wcrlusqkm01.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101wcr1wcrlusqkm01.R.inc(88632);
            __CLR4_1_101wcr1wcrlusqkm01.R.inc(88633);this.name = name;
        }finally{__CLR4_1_101wcr1wcrlusqkm01.R.flushNeeded();}}
    }
}
