/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeAsArray;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_int_public extends TestCase {static class __CLR4_5_21ydg1ydglusyjvvh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,91339,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ydg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91204,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ydg() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91204);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91205);VO vo = new VO();
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91206);vo.setId(123);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91207);vo.setName("wenshao");

        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91208);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91209);Assert.assertEquals("[123,\"wenshao\"]", text);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91210);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91211);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91212);Assert.assertEquals(vo.getName(), vo2.getName());
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ydp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ydp() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91213);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91214);String text = "[123 ,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91215);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91216);Assert.assertEquals(123, vo2.getId());
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91217);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441ydu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91218,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441ydu() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91218);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91219);String text = "[-123 ,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91220);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91221);Assert.assertEquals(-123, vo2.getId());
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91222);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_1_stream() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ww0qta1ydz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_1_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ww0qta1ydz() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91223);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91224);String text = "[123 ,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91225);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91226);VO vo2 = reader.readObject(VO.class);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91227);Assert.assertEquals(123, vo2.getId());
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91228);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_2_stream() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2frd6pt1ye5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_2_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2frd6pt1ye5() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91229);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91230);String text = "[-123 ,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91231);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91232);VO vo2 = reader.readObject(VO.class);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91233);Assert.assertEquals(-123, vo2.getId());
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91234);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1yeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91235,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1yeb() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91235);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91236);String text = "[123.,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91237);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91238);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91239);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91240);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91241);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_stream() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ze4h791yei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91242,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ze4h791yei() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91242);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91243);String text = "[123.,\"wenshao\" ]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91244);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91245);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91246);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91247);reader.readObject(VO.class);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91248);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91249);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91250);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1yer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1yer() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91251);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91252);String text = "[123:\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91253);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91254);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91255);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91256);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91257);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_stream_1() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fy7dy51yey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91258,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fy7dy51yey() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91258);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91259);String text = "[123:\"wenshao\" ]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91260);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91261);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91262);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91263);reader.readObject(VO.class);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91264);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91265);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91266);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1yf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91267,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1yf7() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91267);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91268);String text = "[-123:\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91269);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91270);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91271);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91272);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91273);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_stream_2() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j77cqm1yfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j77cqm1yfe() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91274);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91275);String text = "[-123:\"wenshao\" ]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91276);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91277);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91278);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91279);reader.readObject(VO.class);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91280);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91281);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91282);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_overflow() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26057vx1yfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_overflow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26057vx1yfn() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91283);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91284);String text = "[2147483649:\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91285);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91286);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91287);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91288);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91289);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_overflow_stream() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dh58kg1yfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_overflow_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dh58kg1yfu() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91290);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91291);String text = "[2147483649:\"wenshao\" ]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91292);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91293);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91294);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91295);reader.readObject(VO.class);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91296);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91297);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91298);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_value_notmatch() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1xphn1yg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91299,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1xphn1yg3() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91299);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91300);String text = "[true,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91301);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91302);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91303);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91304);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91305);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_value_notmatch_stream() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssstqa1yga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssstqa1yga() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91306);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91307);String text = "[true,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91308);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91309);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91310);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91311);reader.readObject(VO.class);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91312);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91313);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91314);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lf5sbi1ygj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lf5sbi1ygj() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91315);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91316);String text = "[+,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91317);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91318);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91319);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91320);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91321);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2_stream() throws Exception {__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceStart(getClass().getName(),91322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2666nyn1ygq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydg1ydglusyjvvh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydg1ydglusyjvvh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_2_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2666nyn1ygq() throws Exception{try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91322);
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91323);String text = "[+,\"wenshao\"]";
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91324);Exception error = null;
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91325);try {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91326);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91327);reader.readObject(VO.class);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91328);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91329);error = ex;
        }
        __CLR4_5_21ydg1ydglusyjvvh.R.inc(91330);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}

    public static class VO {

        private int   id;
        private String name;

        public int getId() {try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91331);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91332);return id;
        }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91333);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91334);this.id = id;
        }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91335);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91336);return name;
        }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21ydg1ydglusyjvvh.R.inc(91337);
            __CLR4_5_21ydg1ydglusyjvvh.R.inc(91338);this.name = name;
        }finally{__CLR4_5_21ydg1ydglusyjvvh.R.flushNeeded();}}
    }
}
