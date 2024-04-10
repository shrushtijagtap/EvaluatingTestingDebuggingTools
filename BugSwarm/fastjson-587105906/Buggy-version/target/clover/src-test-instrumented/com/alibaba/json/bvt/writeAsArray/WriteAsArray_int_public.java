/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeAsArray;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_int_public extends TestCase {static class __CLR4_1_101zbz1zbzluszwgfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,92582,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21zbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92447,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21zbz() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92447);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92448);VO vo = new VO();
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92449);vo.setId(123);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92450);vo.setName("wenshao");

        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92451);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92452);Assert.assertEquals("[123,\"wenshao\"]", text);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92453);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92454);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92455);Assert.assertEquals(vo.getName(), vo2.getName());
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1zc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92456,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1zc8() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92456);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92457);String text = "[123 ,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92458);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92459);Assert.assertEquals(123, vo2.getId());
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92460);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441zcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92461,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441zcd() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92461);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92462);String text = "[-123 ,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92463);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92464);Assert.assertEquals(-123, vo2.getId());
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92465);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_1_stream() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ww0qta1zci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_1_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92466,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ww0qta1zci() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92466);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92467);String text = "[123 ,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92468);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92469);VO vo2 = reader.readObject(VO.class);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92470);Assert.assertEquals(123, vo2.getId());
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92471);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_2_stream() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10frd6pt1zco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_2_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92472,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10frd6pt1zco() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92472);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92473);String text = "[-123 ,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92474);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92475);VO vo2 = reader.readObject(VO.class);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92476);Assert.assertEquals(-123, vo2.getId());
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92477);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1zcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92478,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1zcu() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92478);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92479);String text = "[123.,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92480);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92481);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92482);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92483);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92484);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_stream() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ze4h791zd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92485,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ze4h791zd1() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92485);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92486);String text = "[123.,\"wenshao\" ]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92487);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92488);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92489);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92490);reader.readObject(VO.class);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92491);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92492);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92493);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1zda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92494,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1zda() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92494);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92495);String text = "[123:\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92496);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92497);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92498);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92499);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92500);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_stream_1() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fy7dy51zdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92501,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fy7dy51zdh() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92501);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92502);String text = "[123:\"wenshao\" ]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92503);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92504);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92505);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92506);reader.readObject(VO.class);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92507);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92508);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92509);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1zdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92510,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1zdq() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92510);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92511);String text = "[-123:\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92512);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92513);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92514);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92515);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92516);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_stream_2() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j77cqm1zdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_stream_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92517,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j77cqm1zdx() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92517);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92518);String text = "[-123:\"wenshao\" ]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92519);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92520);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92521);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92522);reader.readObject(VO.class);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92523);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92524);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92525);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_overflow() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106057vx1ze6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_overflow",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92526,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106057vx1ze6() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92526);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92527);String text = "[2147483649:\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92528);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92529);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92530);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92531);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92532);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_overflow_stream() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dh58kg1zed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_overflow_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92533,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dh58kg1zed() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92533);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92534);String text = "[2147483649:\"wenshao\" ]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92535);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92536);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92537);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92538);reader.readObject(VO.class);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92539);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92540);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92541);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_value_notmatch() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g1xphn1zem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92542,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g1xphn1zem() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92542);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92543);String text = "[true,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92544);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92545);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92546);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92547);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92548);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_value_notmatch_stream() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssstqa1zet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92549,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssstqa1zet() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92549);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92550);String text = "[true,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92551);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92552);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92553);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92554);reader.readObject(VO.class);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92555);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92556);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92557);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lf5sbi1zf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92558,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lf5sbi1zf2() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92558);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92559);String text = "[+,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92560);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92561);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92562);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92563);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92564);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2_stream() throws Exception {__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceStart(getClass().getName(),92565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10666nyn1zf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zbz1zbzluszwgfo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zbz1zbzluszwgfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_int_public.test_error_value_notmatch_2_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92565,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10666nyn1zf9() throws Exception{try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92565);
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92566);String text = "[+,\"wenshao\"]";
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92567);Exception error = null;
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92568);try {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92569);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92570);reader.readObject(VO.class);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92571);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92572);error = ex;
        }
        __CLR4_1_101zbz1zbzluszwgfo.R.inc(92573);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}

    public static class VO {

        private int   id;
        private String name;

        public int getId() {try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92574);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92575);return id;
        }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92576);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92577);this.id = id;
        }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92578);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92579);return name;
        }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101zbz1zbzluszwgfo.R.inc(92580);
            __CLR4_1_101zbz1zbzluszwgfo.R.inc(92581);this.name = name;
        }finally{__CLR4_1_101zbz1zbzluszwgfo.R.flushNeeded();}}
    }
}
