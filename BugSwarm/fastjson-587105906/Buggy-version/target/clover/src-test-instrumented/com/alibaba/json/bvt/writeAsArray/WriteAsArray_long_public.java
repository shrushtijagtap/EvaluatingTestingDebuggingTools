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

public class WriteAsArray_long_public extends TestCase {static class __CLR4_1_101zj11zj1luszwggv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,92836,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21zj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92701,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21zj1() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92701);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92702);VO vo = new VO();
        __CLR4_1_101zj11zj1luszwggv.R.inc(92703);vo.setId(123);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92704);vo.setName("wenshao");

        __CLR4_1_101zj11zj1luszwggv.R.inc(92705);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92706);Assert.assertEquals("[123,\"wenshao\"]", text);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92707);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92708);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_1_101zj11zj1luszwggv.R.inc(92709);Assert.assertEquals(vo.getName(), vo2.getName());
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1zja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92710,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1zja() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92710);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92711);String text = "[123 ,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92712);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92713);Assert.assertEquals(123, vo2.getId());
        __CLR4_1_101zj11zj1luszwggv.R.inc(92714);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441zjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92715,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441zjf() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92715);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92716);String text = "[-123 ,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92717);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92718);Assert.assertEquals(-123, vo2.getId());
        __CLR4_1_101zj11zj1luszwggv.R.inc(92719);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_1_stream() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ww0qta1zjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_1_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92720,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ww0qta1zjk() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92720);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92721);String text = "[123 ,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92722);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92723);VO vo2 = reader.readObject(VO.class);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92724);Assert.assertEquals(123, vo2.getId());
        __CLR4_1_101zj11zj1luszwggv.R.inc(92725);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_2_stream() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10frd6pt1zjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_2_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92726,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10frd6pt1zjq() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92726);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92727);String text = "[-123 ,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92728);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92729);VO vo2 = reader.readObject(VO.class);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92730);Assert.assertEquals(-123, vo2.getId());
        __CLR4_1_101zj11zj1luszwggv.R.inc(92731);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1zjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92732,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1zjw() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92732);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92733);String text = "[123.,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92734);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92735);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92736);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92737);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92738);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_stream() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ze4h791zk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92739,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ze4h791zk3() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92739);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92740);String text = "[123.,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92741);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92742);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92743);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92744);reader.readObject(VO.class);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92745);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92746);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92747);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1zkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92748,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1zkc() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92748);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92749);String text = "[123:\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92750);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92751);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92752);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92753);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92754);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_stream_1() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fy7dy51zkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92755,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fy7dy51zkj() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92755);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92756);String text = "[123:\"wenshao\" ]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92757);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92758);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92759);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92760);reader.readObject(VO.class);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92761);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92762);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92763);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    
    public void test_error_2() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1zks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92764,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1zks() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92764);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92765);String text = "[-123:\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92766);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92767);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92768);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92769);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92770);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_stream_2() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j77cqm1zkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92771,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j77cqm1zkz() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92771);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92772);String text = "[-123:\"wenshao\" ]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92773);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92774);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92775);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92776);reader.readObject(VO.class);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92777);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92778);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92779);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_overflow() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106057vx1zl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_overflow",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92780,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106057vx1zl8() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92780);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92781);String text = "[2147483649:\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92782);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92783);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92784);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92785);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92786);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_overflow_stream() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dh58kg1zlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_overflow_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92787,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dh58kg1zlf() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92787);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92788);String text = "[2147483649:\"wenshao\" ]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92789);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92790);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92791);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92792);reader.readObject(VO.class);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92793);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92794);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92795);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_value_notmatch() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g1xphn1zlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92796,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g1xphn1zlo() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92796);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92797);String text = "[true,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92798);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92799);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92800);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92801);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92802);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_value_notmatch_stream() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssstqa1zlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92803,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssstqa1zlv() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92803);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92804);String text = "[true,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92805);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92806);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92807);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92808);reader.readObject(VO.class);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92809);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92810);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92811);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lf5sbi1zm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92812,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lf5sbi1zm4() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92812);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92813);String text = "[+,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92814);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92815);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92816);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92817);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92818);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2_stream() throws Exception {__CLR4_1_101zj11zj1luszwggv.R.globalSliceStart(getClass().getName(),92819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10666nyn1zmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zj11zj1luszwggv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zj11zj1luszwggv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_2_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92819,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10666nyn1zmb() throws Exception{try{__CLR4_1_101zj11zj1luszwggv.R.inc(92819);
        __CLR4_1_101zj11zj1luszwggv.R.inc(92820);String text = "[+,\"wenshao\"]";
        __CLR4_1_101zj11zj1luszwggv.R.inc(92821);Exception error = null;
        __CLR4_1_101zj11zj1luszwggv.R.inc(92822);try {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92823);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92824);reader.readObject(VO.class);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92825);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101zj11zj1luszwggv.R.inc(92826);error = ex;
        }
        __CLR4_1_101zj11zj1luszwggv.R.inc(92827);Assert.assertNotNull(error);
    }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}

    public static class VO {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_1_101zj11zj1luszwggv.R.inc(92828);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92829);return id;
        }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_101zj11zj1luszwggv.R.inc(92830);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92831);this.id = id;
        }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101zj11zj1luszwggv.R.inc(92832);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92833);return name;
        }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101zj11zj1luszwggv.R.inc(92834);
            __CLR4_1_101zj11zj1luszwggv.R.inc(92835);this.name = name;
        }finally{__CLR4_1_101zj11zj1luszwggv.R.flushNeeded();}}
    }
}
