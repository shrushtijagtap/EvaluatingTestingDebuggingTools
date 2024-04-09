/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

import org.junit.Assert;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4;
import com.alibaba.fastjson.support.spring.MappingFastJsonValue;

import junit.framework.TestCase;

public class FastJsonpHttpMessageConverter4Test extends TestCase {static class __CLR4_5_21xvh1xvhlusvnhbo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,90619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_1() throws Exception {__CLR4_5_21xvh1xvhlusvnhbo.R.globalSliceStart(getClass().getName(),90557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1xvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xvh1xvhlusvnhbo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xvh1xvhlusvnhbo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonpHttpMessageConverter4Test.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1xvh() throws Exception{try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90557);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90558);FastJsonpHttpMessageConverter4 converter = new FastJsonpHttpMessageConverter4();

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90559);Assert.assertNotNull(converter.getFastJsonConfig());
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90560);converter.setFastJsonConfig(new FastJsonConfig());

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90561);converter.canRead(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90562);converter.canWrite(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90563);Method method1 = FastJsonpHttpMessageConverter4.class.getDeclaredMethod("supports", Class.class);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90564);method1.setAccessible(true);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90565);method1.invoke(converter, int.class);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90566);HttpInputMessage input = new HttpInputMessage() {

            public HttpHeaders getHeaders() {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90567);
                __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90568);return null;
            }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

            public InputStream getBody() throws IOException {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90569);
                __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90570);return new ByteArrayInputStream("{\"id\":123}".getBytes(Charset.forName("UTF-8")));
            }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

        };
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90571);VO vo = (VO) converter.read(VO.class, VO.class, input);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90572);Assert.assertEquals(123, vo.getId());

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90573);final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90574);HttpOutputMessage out = new HttpOutputMessage() {

            public HttpHeaders getHeaders() {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90575);
                __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90576);return new HttpHeaders();
            }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

            public OutputStream getBody() throws IOException {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90577);
                __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90578);return byteOut;
            }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}
        };
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90579);converter.write(vo, VO.class, MediaType.TEXT_PLAIN, out);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90580);byte[] bytes = byteOut.toByteArray();
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90581);Assert.assertEquals("{\"id\":123}", new String(bytes, "UTF-8"));

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90582);Method method2 = FastJsonpHttpMessageConverter4.class.getDeclaredMethod("readInternal", Class.class,
                HttpInputMessage.class);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90583);method2.setAccessible(true);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90584);method2.invoke(converter, VO.class, input);
    }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21xvh1xvhlusvnhbo.R.globalSliceStart(getClass().getName(),90585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441xw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xvh1xvhlusvnhbo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xvh1xvhlusvnhbo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonpHttpMessageConverter4Test.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441xw9() throws Exception{try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90585);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90586);FastJsonpHttpMessageConverter4 converter = new FastJsonpHttpMessageConverter4();

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90587);Assert.assertNotNull(converter.getFastJsonConfig());
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90588);converter.setFastJsonConfig(new FastJsonConfig());

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90589);converter.canRead(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90590);converter.canWrite(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90591);Method method1 = FastJsonpHttpMessageConverter4.class.getDeclaredMethod("supports", Class.class);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90592);method1.setAccessible(true);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90593);method1.invoke(converter, int.class);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90594);HttpInputMessage input = new HttpInputMessage() {

            public HttpHeaders getHeaders() {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90595);
                __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90596);return null;
            }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

            public InputStream getBody() throws IOException {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90597);
                __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90598);return new ByteArrayInputStream("{\"id\":123}".getBytes(Charset.forName("UTF-8")));
            }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

        };
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90599);VO vo = (VO) converter.read(VO.class, VO.class, input);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90600);Assert.assertEquals(123, vo.getId());

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90601);final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90602);HttpOutputMessage out = new HttpOutputMessage() {

            public HttpHeaders getHeaders() {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90603);
                __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90604);return new HttpHeaders();
            }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

            public OutputStream getBody() throws IOException {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90605);
                __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90606);return byteOut;
            }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}
        };
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90607);MappingFastJsonValue mappingFastJsonValue = new MappingFastJsonValue(vo);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90608);mappingFastJsonValue.setJsonpFunction("callback");
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90609);converter.write(mappingFastJsonValue, VO.class, MediaType.TEXT_PLAIN, out);

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90610);byte[] bytes = byteOut.toByteArray();
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90611);Assert.assertEquals("/**/callback({\"id\":123})", new String(bytes, "UTF-8"));

        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90612);Method method2 = FastJsonpHttpMessageConverter4.class.getDeclaredMethod("readInternal", Class.class,
                HttpInputMessage.class);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90613);method2.setAccessible(true);
        __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90614);method2.invoke(converter, VO.class, input);
    }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

    public static class VO {

        private int id;

        public int getId() {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90615);
            __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90616);return id;
        }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21xvh1xvhlusvnhbo.R.inc(90617);
            __CLR4_5_21xvh1xvhlusvnhbo.R.inc(90618);this.id = id;
        }finally{__CLR4_5_21xvh1xvhlusvnhbo.R.flushNeeded();}}

    }
}
