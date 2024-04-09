/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support;

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

public class FastJsonConfigTest extends TestCase {static class __CLR4_5_21xao1xaolusvnh8m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,89855,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21xao1xaolusvnh8m.R.globalSliceStart(getClass().getName(),89808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21xao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xao1xaolusvnh8m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xao1xaolusvnh8m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.FastJsonConfigTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21xao() throws Exception{try{__CLR4_5_21xao1xaolusvnh8m.R.inc(89808);

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89809);FastJsonConfig config = new FastJsonConfig();

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89810);Assert.assertEquals(Charset.forName("UTF-8"), config.getCharset());
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89811);config.setCharset(Charset.forName("GBK"));
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89812);Assert.assertEquals(Charset.forName("GBK"), config.getCharset());

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89813);Assert.assertNull(config.getDateFormat());
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89814);config.setDateFormat("yyyyMMdd");
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89815);Assert.assertNotNull(config.getDateFormat());

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89816);config.setParserConfig(ParserConfig.getGlobalInstance());
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89817);Assert.assertNotNull(config.getParserConfig());

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89818);config.setSerializeConfig(SerializeConfig.globalInstance);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89819);Assert.assertNotNull(config.getSerializeConfig());

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89820);config.setFeatures(Feature.AllowComment, Feature.AutoCloseSource);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89821);Assert.assertEquals(2, config.getFeatures().length);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89822);Assert.assertEquals(Feature.AllowComment, config.getFeatures()[0]);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89823);Assert.assertEquals(Feature.AutoCloseSource, config.getFeatures()[1]);

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89824);config.setSerializerFeatures(SerializerFeature.IgnoreErrorGetter);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89825);Assert.assertEquals(1, config.getSerializerFeatures().length);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89826);Assert.assertEquals(SerializerFeature.IgnoreErrorGetter,
                config.getSerializerFeatures()[0]);

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89827);config.setSerializeFilters(serializeFilter);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89828);Assert.assertEquals(1, config.getSerializeFilters().length);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89829);Assert.assertEquals(serializeFilter, config.getSerializeFilters()[0]);

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89830);classSerializeFilter.put(TestVO.class, serializeFilter);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89831);config.setClassSerializeFilters(classSerializeFilter);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89832);Assert.assertEquals(1, config.getClassSerializeFilters().size());
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89833);Assert.assertEquals(classSerializeFilter,
                config.getClassSerializeFilters());
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89834);config.setClassSerializeFilters(null);

        __CLR4_5_21xao1xaolusvnh8m.R.inc(89835);config.setWriteContentLength(false);
        __CLR4_5_21xao1xaolusvnh8m.R.inc(89836);Assert.assertEquals(false, config.isWriteContentLength());
    }finally{__CLR4_5_21xao1xaolusvnh8m.R.flushNeeded();}}

    private Map<Class<?>, SerializeFilter> classSerializeFilter = new HashMap<Class<?>, SerializeFilter>();

    private SerializeFilter serializeFilter = new ValueFilter() {
        @Override
        public Object process(Object object, String name, Object value) {try{__CLR4_5_21xao1xaolusvnh8m.R.inc(89837);
            __CLR4_5_21xao1xaolusvnh8m.R.inc(89838);if ((((value == null)&&(__CLR4_5_21xao1xaolusvnh8m.R.iget(89839)!=0|true))||(__CLR4_5_21xao1xaolusvnh8m.R.iget(89840)==0&false))) {{
                __CLR4_5_21xao1xaolusvnh8m.R.inc(89841);return "";
            }
            }__CLR4_5_21xao1xaolusvnh8m.R.inc(89842);if ((((value instanceof Number)&&(__CLR4_5_21xao1xaolusvnh8m.R.iget(89843)!=0|true))||(__CLR4_5_21xao1xaolusvnh8m.R.iget(89844)==0&false))) {{
                __CLR4_5_21xao1xaolusvnh8m.R.inc(89845);return String.valueOf(value);
            }
            }__CLR4_5_21xao1xaolusvnh8m.R.inc(89846);return value;
        }finally{__CLR4_5_21xao1xaolusvnh8m.R.flushNeeded();}}
    };

    class TestVO {

        private Number num;

        private String name;

        public Number getNum() {try{__CLR4_5_21xao1xaolusvnh8m.R.inc(89847);
            __CLR4_5_21xao1xaolusvnh8m.R.inc(89848);return num;
        }finally{__CLR4_5_21xao1xaolusvnh8m.R.flushNeeded();}}

        public void setNum(Number num) {try{__CLR4_5_21xao1xaolusvnh8m.R.inc(89849);
            __CLR4_5_21xao1xaolusvnh8m.R.inc(89850);this.num = num;
        }finally{__CLR4_5_21xao1xaolusvnh8m.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21xao1xaolusvnh8m.R.inc(89851);
            __CLR4_5_21xao1xaolusvnh8m.R.inc(89852);return name;
        }finally{__CLR4_5_21xao1xaolusvnh8m.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21xao1xaolusvnh8m.R.inc(89853);
            __CLR4_5_21xao1xaolusvnh8m.R.inc(89854);this.name = name;
        }finally{__CLR4_5_21xao1xaolusvnh8m.R.flushNeeded();}}
    }
}
