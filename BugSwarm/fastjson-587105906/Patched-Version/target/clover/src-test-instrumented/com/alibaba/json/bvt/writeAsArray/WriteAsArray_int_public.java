/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeAsArray;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_int_public extends TestCase {static class __CLR4_5_21zbo1zbolusvni7u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,92571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21zbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21zbo() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92436);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92437);VO vo = new VO();
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92438);vo.setId(123);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92439);vo.setName("wenshao");

        __CLR4_5_21zbo1zbolusvni7u.R.inc(92440);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92441);Assert.assertEquals("[123,\"wenshao\"]", text);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92442);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92443);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92444);Assert.assertEquals(vo.getName(), vo2.getName());
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1zbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1zbx() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92445);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92446);String text = "[123 ,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92447);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92448);Assert.assertEquals(123, vo2.getId());
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92449);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441zc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441zc2() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92450);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92451);String text = "[-123 ,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92452);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92453);Assert.assertEquals(-123, vo2.getId());
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92454);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_1_stream() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ww0qta1zc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_1_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ww0qta1zc7() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92455);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92456);String text = "[123 ,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92457);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92458);VO vo2 = reader.readObject(VO.class);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92459);Assert.assertEquals(123, vo2.getId());
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92460);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_2_stream() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2frd6pt1zcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_2_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92461,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2frd6pt1zcd() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92461);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92462);String text = "[-123 ,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92463);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92464);VO vo2 = reader.readObject(VO.class);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92465);Assert.assertEquals(-123, vo2.getId());
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92466);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1zcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1zcj() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92467);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92468);String text = "[123.,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92469);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92470);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92471);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92472);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92473);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_stream() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ze4h791zcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ze4h791zcq() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92474);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92475);String text = "[123.,\"wenshao\" ]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92476);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92477);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92478);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92479);reader.readObject(VO.class);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92480);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92481);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92482);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1zcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1zcz() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92483);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92484);String text = "[123:\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92485);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92486);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92487);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92488);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92489);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_stream_1() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fy7dy51zd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fy7dy51zd6() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92490);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92491);String text = "[123:\"wenshao\" ]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92492);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92493);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92494);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92495);reader.readObject(VO.class);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92496);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92497);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92498);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1zdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1zdf() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92499);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92500);String text = "[-123:\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92501);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92502);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92503);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92504);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92505);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_stream_2() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j77cqm1zdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j77cqm1zdm() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92506);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92507);String text = "[-123:\"wenshao\" ]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92508);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92509);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92510);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92511);reader.readObject(VO.class);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92512);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92513);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92514);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_overflow() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26057vx1zdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_overflow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26057vx1zdv() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92515);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92516);String text = "[2147483649:\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92517);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92518);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92519);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92520);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92521);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_overflow_stream() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dh58kg1ze2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_overflow_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dh58kg1ze2() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92522);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92523);String text = "[2147483649:\"wenshao\" ]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92524);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92525);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92526);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92527);reader.readObject(VO.class);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92528);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92529);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92530);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_value_notmatch() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1xphn1zeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92531,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1xphn1zeb() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92531);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92532);String text = "[true,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92533);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92534);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92535);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92536);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92537);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_value_notmatch_stream() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssstqa1zei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssstqa1zei() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92538);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92539);String text = "[true,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92540);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92541);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92542);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92543);reader.readObject(VO.class);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92544);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92545);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92546);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lf5sbi1zer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lf5sbi1zer() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92547);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92548);String text = "[+,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92549);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92550);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92551);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92552);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92553);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2_stream() throws Exception {__CLR4_5_21zbo1zbolusvni7u.R.globalSliceStart(getClass().getName(),92554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2666nyn1zey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zbo1zbolusvni7u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zbo1zbolusvni7u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_2_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2666nyn1zey() throws Exception{try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92554);
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92555);String text = "[+,\"wenshao\"]";
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92556);Exception error = null;
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92557);try {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92558);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92559);reader.readObject(VO.class);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92560);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92561);error = ex;
        }
        __CLR4_5_21zbo1zbolusvni7u.R.inc(92562);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}

    public static class VO {

        private int   id;
        private String name;

        public int getId() {try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92563);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92564);return id;
        }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92565);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92566);this.id = id;
        }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92567);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92568);return name;
        }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21zbo1zbolusvni7u.R.inc(92569);
            __CLR4_5_21zbo1zbolusvni7u.R.inc(92570);this.name = name;
        }finally{__CLR4_5_21zbo1zbolusvni7u.R.flushNeeded();}}
    }
}
