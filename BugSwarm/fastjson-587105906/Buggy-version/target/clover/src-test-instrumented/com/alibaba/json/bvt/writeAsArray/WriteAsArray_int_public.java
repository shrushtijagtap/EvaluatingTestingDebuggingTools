/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeAsArray;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_int_public extends TestCase {static class __CLR4_1_101ydr1ydrlusqko81{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,91350,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ydr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91215,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ydr() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91215);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91216);VO vo = new VO();
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91217);vo.setId(123);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91218);vo.setName("wenshao");

        __CLR4_1_101ydr1ydrlusqko81.R.inc(91219);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91220);Assert.assertEquals("[123,\"wenshao\"]", text);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91221);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91222);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91223);Assert.assertEquals(vo.getName(), vo2.getName());
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ye0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91224,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ye0() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91224);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91225);String text = "[123 ,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91226);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91227);Assert.assertEquals(123, vo2.getId());
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91228);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441ye5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91229,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441ye5() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91229);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91230);String text = "[-123 ,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91231);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91232);Assert.assertEquals(-123, vo2.getId());
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91233);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_1_stream() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ww0qta1yea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_1_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ww0qta1yea() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91234);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91235);String text = "[123 ,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91236);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91237);VO vo2 = reader.readObject(VO.class);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91238);Assert.assertEquals(123, vo2.getId());
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91239);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_2_stream() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10frd6pt1yeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_2_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91240,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10frd6pt1yeg() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91240);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91241);String text = "[-123 ,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91242);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91243);VO vo2 = reader.readObject(VO.class);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91244);Assert.assertEquals(-123, vo2.getId());
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91245);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1yem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91246,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1yem() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91246);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91247);String text = "[123.,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91248);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91249);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91250);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91251);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91252);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_stream() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ze4h791yet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91253,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ze4h791yet() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91253);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91254);String text = "[123.,\"wenshao\" ]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91255);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91256);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91257);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91258);reader.readObject(VO.class);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91259);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91260);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91261);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1yf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91262,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1yf2() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91262);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91263);String text = "[123:\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91264);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91265);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91266);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91267);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91268);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_stream_1() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fy7dy51yf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91269,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fy7dy51yf9() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91269);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91270);String text = "[123:\"wenshao\" ]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91271);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91272);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91273);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91274);reader.readObject(VO.class);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91275);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91276);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91277);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1yfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91278,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1yfi() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91278);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91279);String text = "[-123:\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91280);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91281);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91282);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91283);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91284);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_stream_2() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j77cqm1yfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91285,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j77cqm1yfp() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91285);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91286);String text = "[-123:\"wenshao\" ]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91287);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91288);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91289);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91290);reader.readObject(VO.class);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91291);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91292);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91293);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_overflow() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106057vx1yfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_overflow",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91294,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106057vx1yfy() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91294);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91295);String text = "[2147483649:\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91296);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91297);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91298);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91299);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91300);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_overflow_stream() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dh58kg1yg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_overflow_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91301,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dh58kg1yg5() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91301);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91302);String text = "[2147483649:\"wenshao\" ]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91303);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91304);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91305);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91306);reader.readObject(VO.class);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91307);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91308);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91309);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_value_notmatch() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g1xphn1yge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91310,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g1xphn1yge() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91310);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91311);String text = "[true,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91312);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91313);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91314);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91315);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91316);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_value_notmatch_stream() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssstqa1ygl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91317,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssstqa1ygl() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91317);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91318);String text = "[true,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91319);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91320);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91321);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91322);reader.readObject(VO.class);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91323);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91324);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91325);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lf5sbi1ygu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lf5sbi1ygu() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91326);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91327);String text = "[+,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91328);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91329);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91330);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91331);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91332);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2_stream() throws Exception {__CLR4_1_101ydr1ydrlusqko81.R.globalSliceStart(getClass().getName(),91333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10666nyn1yh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ydr1ydrlusqko81.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ydr1ydrlusqko81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_2_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91333,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10666nyn1yh1() throws Exception{try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91333);
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91334);String text = "[+,\"wenshao\"]";
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91335);Exception error = null;
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91336);try {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91337);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91338);reader.readObject(VO.class);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91339);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91340);error = ex;
        }
        __CLR4_1_101ydr1ydrlusqko81.R.inc(91341);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}

    public static class VO {

        private int   id;
        private String name;

        public int getId() {try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91342);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91343);return id;
        }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91344);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91345);this.id = id;
        }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91346);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91347);return name;
        }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101ydr1ydrlusqko81.R.inc(91348);
            __CLR4_1_101ydr1ydrlusqko81.R.inc(91349);this.name = name;
        }finally{__CLR4_1_101ydr1ydrlusqko81.R.flushNeeded();}}
    }
}
