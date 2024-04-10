/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.jaxrs;

import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import junit.framework.TestCase;
import org.junit.Assert;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FastJsonProviderTest extends TestCase {static class __CLR4_5_21wl81wl8lusyjvip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,88949,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("deprecation")
    public void test_1() throws Exception {__CLR4_5_21wl81wl8lusyjvip.R.globalSliceStart(getClass().getName(),88892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1wl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wl81wl8lusyjvip.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wl81wl8lusyjvip.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.jaxrs.FastJsonProviderTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1wl8() throws Exception{try{__CLR4_5_21wl81wl8lusyjvip.R.inc(88892);

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88893);FastJsonProvider provider1 = new FastJsonProvider("UTF-8");
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88894);Assert.assertEquals("UTF-8", provider1.getCharset().name());

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88895);FastJsonProvider provider2 = new FastJsonProvider();

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88896);provider2.setCharset(Charset.forName("GBK"));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88897);Assert.assertEquals("GBK", provider2.getCharset().name());

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88898);Assert.assertNull(provider2.getDateFormat());
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88899);provider2.setDateFormat("yyyyMMdd");

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88900);provider2.setFeatures(SerializerFeature.IgnoreErrorGetter);
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88901);Assert.assertEquals(1, provider2.getFeatures().length);
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88902);Assert.assertEquals(SerializerFeature.IgnoreErrorGetter,
                provider2.getFeatures()[0]);

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88903);provider2.setFilters(serializeFilter);
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88904);Assert.assertEquals(1, provider2.getFilters().length);
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88905);Assert.assertEquals(serializeFilter, provider2.getFilters()[0]);

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88906);FastJsonProvider provider = new FastJsonProvider(new Class[]{VO.class});

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88907);Assert.assertNotNull(provider.getFastJsonConfig());

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88908);FastJsonConfig fastJsonConfig = new FastJsonConfig();
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88909);fastJsonConfig.setWriteContentLength(false);
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88910);provider.setFastJsonConfig(fastJsonConfig);

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88911);Assert.assertEquals(true, provider.isReadable(VO.class, VO.class, null, MediaType.APPLICATION_JSON_TYPE));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88912);Assert.assertEquals(true, provider.isWriteable(VO.class, VO.class, null, MediaType.APPLICATION_JSON_TYPE));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88913);Assert.assertEquals(true, provider.isReadable(VO.class, VO.class, null, MediaType.APPLICATION_FORM_URLENCODED_TYPE));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88914);Assert.assertEquals(true, provider.isWriteable(VO.class, VO.class, null, MediaType.APPLICATION_FORM_URLENCODED_TYPE));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88915);Assert.assertEquals(false, provider.isReadable(VO.class, VO.class, null, MediaType.APPLICATION_XML_TYPE));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88916);Assert.assertEquals(false, provider.isWriteable(VO.class, VO.class, null, MediaType.APPLICATION_XML_TYPE));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88917);Assert.assertEquals(false, provider.isReadable(String.class, String.class, null, MediaType.valueOf("application/javascript")));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88918);Assert.assertEquals(false, provider.isWriteable(String.class, String.class, null, MediaType.valueOf("application/x-javascript")));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88919);Assert.assertEquals(false, provider.isReadable(String.class, String.class, null, MediaType.valueOf("applications/+json")));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88920);Assert.assertEquals(false, provider.isWriteable(String.class, String.class, null, MediaType.valueOf("applications/x-json")));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88921);Assert.assertEquals(false, provider.isReadable(null, null, null, MediaType.valueOf("application/x-javascript")));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88922);Assert.assertEquals(false, provider.isWriteable(null, null, null, null));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88923);Assert.assertEquals(false, provider.isReadable(InputStream.class, null, null, MediaType.valueOf("application/x-javascript")));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88924);Assert.assertEquals(false, provider.isWriteable(OutputStream.class, null, null, null));


        __CLR4_5_21wl81wl8lusyjvip.R.inc(88925);VO vo = (VO) provider.readFrom(null, VO.class, null, MediaType.APPLICATION_JSON_TYPE, null, new ByteArrayInputStream("{\"id\":123}".getBytes(Charset
                .forName("UTF-8"))));
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88926);Assert.assertEquals(123, vo.getId());

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88927);final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88928);provider.writeTo(vo, VO.class, VO.class, null, MediaType.APPLICATION_JSON_TYPE, new MultivaluedHashMap<String, Object>(), byteOut);

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88929);byte[] bytes = byteOut.toByteArray();
        __CLR4_5_21wl81wl8lusyjvip.R.inc(88930);Assert.assertEquals("{\"id\":123}", new String(bytes, "UTF-8"));

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88931);provider.getSize(vo, VO.class, VO.class, null, MediaType.APPLICATION_JSON_TYPE);

        __CLR4_5_21wl81wl8lusyjvip.R.inc(88932);try {
            __CLR4_5_21wl81wl8lusyjvip.R.inc(88933);provider.readFrom(null, VO.class, null, MediaType.APPLICATION_JSON_TYPE, null, new ByteArrayInputStream("\"id\":123".getBytes(Charset
                    .forName("UTF-8"))));
        } catch (WebApplicationException ex) {
            __CLR4_5_21wl81wl8lusyjvip.R.inc(88934);Assert.assertNotNull(ex);
        }
    }finally{__CLR4_5_21wl81wl8lusyjvip.R.flushNeeded();}}

    private SerializeFilter serializeFilter = new ValueFilter() {
        @Override
        public Object process(Object object, String name, Object value) {try{__CLR4_5_21wl81wl8lusyjvip.R.inc(88935);
            __CLR4_5_21wl81wl8lusyjvip.R.inc(88936);if ((((value == null)&&(__CLR4_5_21wl81wl8lusyjvip.R.iget(88937)!=0|true))||(__CLR4_5_21wl81wl8lusyjvip.R.iget(88938)==0&false))) {{
                __CLR4_5_21wl81wl8lusyjvip.R.inc(88939);return "";
            }
            }__CLR4_5_21wl81wl8lusyjvip.R.inc(88940);if ((((value instanceof Number)&&(__CLR4_5_21wl81wl8lusyjvip.R.iget(88941)!=0|true))||(__CLR4_5_21wl81wl8lusyjvip.R.iget(88942)==0&false))) {{
                __CLR4_5_21wl81wl8lusyjvip.R.inc(88943);return String.valueOf(value);
            }
            }__CLR4_5_21wl81wl8lusyjvip.R.inc(88944);return value;
        }finally{__CLR4_5_21wl81wl8lusyjvip.R.flushNeeded();}}
    };

    public static class VO {

        private int id;

        public int getId() {try{__CLR4_5_21wl81wl8lusyjvip.R.inc(88945);
            __CLR4_5_21wl81wl8lusyjvip.R.inc(88946);return id;
        }finally{__CLR4_5_21wl81wl8lusyjvip.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21wl81wl8lusyjvip.R.inc(88947);
            __CLR4_5_21wl81wl8lusyjvip.R.inc(88948);this.id = id;
        }finally{__CLR4_5_21wl81wl8lusyjvip.R.flushNeeded();}}

    }
}
