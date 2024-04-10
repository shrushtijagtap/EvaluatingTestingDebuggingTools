/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeAsArray;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.VO;

import junit.framework.TestCase;

public class WriteAsArray_long_public extends TestCase {static class __CLR4_5_21yki1ykilusyjvw8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,91593,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21yki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21yki() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91458);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91459);VO vo = new VO();
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91460);vo.setId(123);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91461);vo.setName("wenshao");

        __CLR4_5_21yki1ykilusyjvw8.R.inc(91462);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91463);Assert.assertEquals("[123,\"wenshao\"]", text);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91464);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91465);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91466);Assert.assertEquals(vo.getName(), vo2.getName());
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ykr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ykr() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91467);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91468);String text = "[123 ,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91469);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91470);Assert.assertEquals(123, vo2.getId());
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91471);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441ykw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441ykw() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91472);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91473);String text = "[-123 ,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91474);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91475);Assert.assertEquals(-123, vo2.getId());
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91476);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_1_stream() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ww0qta1yl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_1_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91477,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ww0qta1yl1() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91477);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91478);String text = "[123 ,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91479);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91480);VO vo2 = reader.readObject(VO.class);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91481);Assert.assertEquals(123, vo2.getId());
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91482);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_2_stream() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2frd6pt1yl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_2_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2frd6pt1yl7() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91483);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91484);String text = "[-123 ,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91485);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91486);VO vo2 = reader.readObject(VO.class);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91487);Assert.assertEquals(-123, vo2.getId());
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91488);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1yld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91489,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1yld() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91489);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91490);String text = "[123.,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91491);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91492);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91493);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91494);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91495);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_stream() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ze4h791ylk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ze4h791ylk() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91496);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91497);String text = "[123.,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91498);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91499);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91500);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91501);reader.readObject(VO.class);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91502);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91503);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91504);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1ylt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1ylt() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91505);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91506);String text = "[123:\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91507);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91508);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91509);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91510);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91511);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_stream_1() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fy7dy51ym0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fy7dy51ym0() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91512);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91513);String text = "[123:\"wenshao\" ]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91514);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91515);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91516);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91517);reader.readObject(VO.class);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91518);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91519);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91520);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    
    public void test_error_2() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1ym9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91521,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1ym9() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91521);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91522);String text = "[-123:\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91523);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91524);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91525);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91526);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91527);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_stream_2() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j77cqm1ymg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j77cqm1ymg() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91528);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91529);String text = "[-123:\"wenshao\" ]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91530);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91531);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91532);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91533);reader.readObject(VO.class);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91534);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91535);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91536);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_overflow() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26057vx1ymp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_overflow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91537,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26057vx1ymp() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91537);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91538);String text = "[2147483649:\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91539);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91540);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91541);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91542);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91543);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_overflow_stream() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dh58kg1ymw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_overflow_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dh58kg1ymw() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91544);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91545);String text = "[2147483649:\"wenshao\" ]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91546);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91547);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91548);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91549);reader.readObject(VO.class);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91550);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91551);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91552);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_value_notmatch() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1xphn1yn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1xphn1yn5() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91553);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91554);String text = "[true,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91555);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91556);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91557);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91558);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91559);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_value_notmatch_stream() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssstqa1ync();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssstqa1ync() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91560);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91561);String text = "[true,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91562);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91563);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91564);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91565);reader.readObject(VO.class);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91566);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91567);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91568);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lf5sbi1ynl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lf5sbi1ynl() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91569);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91570);String text = "[+,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91571);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91572);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91573);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91574);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91575);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2_stream() throws Exception {__CLR4_5_21yki1ykilusyjvw8.R.globalSliceStart(getClass().getName(),91576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2666nyn1yns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yki1ykilusyjvw8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yki1ykilusyjvw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_2_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2666nyn1yns() throws Exception{try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91576);
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91577);String text = "[+,\"wenshao\"]";
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91578);Exception error = null;
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91579);try {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91580);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91581);reader.readObject(VO.class);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91582);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91583);error = ex;
        }
        __CLR4_5_21yki1ykilusyjvw8.R.inc(91584);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}

    public static class VO {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91585);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91586);return id;
        }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91587);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91588);this.id = id;
        }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91589);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91590);return name;
        }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21yki1ykilusyjvw8.R.inc(91591);
            __CLR4_5_21yki1ykilusyjvw8.R.inc(91592);this.name = name;
        }finally{__CLR4_5_21yki1ykilusyjvw8.R.flushNeeded();}}
    }
}
