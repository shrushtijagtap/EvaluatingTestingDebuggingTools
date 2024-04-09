/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeAsArray;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.VO;

import junit.framework.TestCase;

public class WriteAsArray_long_public extends TestCase {static class __CLR4_1_101ykt1yktlusqkoac{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,91604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ykt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91469,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ykt() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91469);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91470);VO vo = new VO();
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91471);vo.setId(123);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91472);vo.setName("wenshao");

        __CLR4_1_101ykt1yktlusqkoac.R.inc(91473);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91474);Assert.assertEquals("[123,\"wenshao\"]", text);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91475);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91476);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91477);Assert.assertEquals(vo.getName(), vo2.getName());
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1yl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91478,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1yl2() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91478);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91479);String text = "[123 ,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91480);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91481);Assert.assertEquals(123, vo2.getId());
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91482);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441yl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91483,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441yl7() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91483);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91484);String text = "[-123 ,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91485);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91486);Assert.assertEquals(-123, vo2.getId());
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91487);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_1_stream() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ww0qta1ylc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_1_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91488,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ww0qta1ylc() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91488);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91489);String text = "[123 ,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91490);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91491);VO vo2 = reader.readObject(VO.class);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91492);Assert.assertEquals(123, vo2.getId());
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91493);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_2_stream() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10frd6pt1yli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_2_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91494,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10frd6pt1yli() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91494);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91495);String text = "[-123 ,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91496);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91497);VO vo2 = reader.readObject(VO.class);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91498);Assert.assertEquals(-123, vo2.getId());
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91499);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1ylo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91500,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1ylo() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91500);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91501);String text = "[123.,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91502);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91503);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91504);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91505);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91506);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_stream() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ze4h791ylv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91507,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ze4h791ylv() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91507);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91508);String text = "[123.,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91509);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91510);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91511);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91512);reader.readObject(VO.class);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91513);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91514);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91515);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1ym4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91516,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1ym4() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91516);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91517);String text = "[123:\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91518);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91519);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91520);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91521);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91522);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_stream_1() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fy7dy51ymb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91523,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fy7dy51ymb() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91523);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91524);String text = "[123:\"wenshao\" ]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91525);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91526);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91527);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91528);reader.readObject(VO.class);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91529);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91530);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91531);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    
    public void test_error_2() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1ymk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91532,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1ymk() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91532);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91533);String text = "[-123:\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91534);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91535);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91536);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91537);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91538);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_stream_2() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j77cqm1ymr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91539,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j77cqm1ymr() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91539);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91540);String text = "[-123:\"wenshao\" ]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91541);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91542);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91543);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91544);reader.readObject(VO.class);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91545);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91546);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91547);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_overflow() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106057vx1yn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_overflow",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91548,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106057vx1yn0() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91548);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91549);String text = "[2147483649:\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91550);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91551);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91552);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91553);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91554);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_overflow_stream() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dh58kg1yn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_overflow_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91555,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dh58kg1yn7() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91555);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91556);String text = "[2147483649:\"wenshao\" ]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91557);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91558);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91559);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91560);reader.readObject(VO.class);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91561);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91562);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91563);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_value_notmatch() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g1xphn1yng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91564,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g1xphn1yng() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91564);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91565);String text = "[true,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91566);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91567);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91568);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91569);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91570);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_value_notmatch_stream() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssstqa1ynn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91571,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssstqa1ynn() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91571);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91572);String text = "[true,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91573);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91574);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91575);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91576);reader.readObject(VO.class);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91577);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91578);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91579);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lf5sbi1ynw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91580,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lf5sbi1ynw() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91580);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91581);String text = "[+,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91582);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91583);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91584);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91585);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91586);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2_stream() throws Exception {__CLR4_1_101ykt1yktlusqkoac.R.globalSliceStart(getClass().getName(),91587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10666nyn1yo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ykt1yktlusqkoac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ykt1yktlusqkoac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_2_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91587,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10666nyn1yo3() throws Exception{try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91587);
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91588);String text = "[+,\"wenshao\"]";
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91589);Exception error = null;
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91590);try {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91591);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91592);reader.readObject(VO.class);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91593);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91594);error = ex;
        }
        __CLR4_1_101ykt1yktlusqkoac.R.inc(91595);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}

    public static class VO {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91596);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91597);return id;
        }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91598);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91599);this.id = id;
        }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91600);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91601);return name;
        }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101ykt1yktlusqkoac.R.inc(91602);
            __CLR4_1_101ykt1yktlusqkoac.R.inc(91603);this.name = name;
        }finally{__CLR4_1_101ykt1yktlusqkoac.R.flushNeeded();}}
    }
}
