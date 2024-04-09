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

public class WriteAsArray_long_public extends TestCase {static class __CLR4_5_21ziq1ziqlusvni8u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,92825,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ziq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92690,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ziq() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92690);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92691);VO vo = new VO();
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92692);vo.setId(123);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92693);vo.setName("wenshao");

        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92694);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92695);Assert.assertEquals("[123,\"wenshao\"]", text);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92696);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92697);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92698);Assert.assertEquals(vo.getName(), vo2.getName());
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ziz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ziz() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92699);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92700);String text = "[123 ,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92701);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92702);Assert.assertEquals(123, vo2.getId());
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92703);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441zj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441zj4() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92704);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92705);String text = "[-123 ,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92706);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92707);Assert.assertEquals(-123, vo2.getId());
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92708);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_1_stream() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ww0qta1zj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_1_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92709,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ww0qta1zj9() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92709);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92710);String text = "[123 ,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92711);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92712);VO vo2 = reader.readObject(VO.class);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92713);Assert.assertEquals(123, vo2.getId());
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92714);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_2_stream() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2frd6pt1zjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_2_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2frd6pt1zjf() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92715);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92716);String text = "[-123 ,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92717);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92718);VO vo2 = reader.readObject(VO.class);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92719);Assert.assertEquals(-123, vo2.getId());
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92720);Assert.assertEquals("wenshao", vo2.getName());
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1zjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1zjl() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92721);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92722);String text = "[123.,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92723);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92724);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92725);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92726);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92727);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_stream() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ze4h791zjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ze4h791zjs() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92728);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92729);String text = "[123.,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92730);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92731);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92732);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92733);reader.readObject(VO.class);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92734);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92735);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92736);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1zk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1zk1() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92737);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92738);String text = "[123:\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92739);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92740);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92741);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92742);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92743);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_stream_1() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fy7dy51zk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fy7dy51zk8() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92744);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92745);String text = "[123:\"wenshao\" ]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92746);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92747);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92748);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92749);reader.readObject(VO.class);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92750);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92751);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92752);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    
    public void test_error_2() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1zkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92753,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1zkh() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92753);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92754);String text = "[-123:\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92755);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92756);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92757);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92758);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92759);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_stream_2() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j77cqm1zko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_stream_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j77cqm1zko() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92760);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92761);String text = "[-123:\"wenshao\" ]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92762);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92763);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92764);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92765);reader.readObject(VO.class);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92766);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92767);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92768);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_overflow() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26057vx1zkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_overflow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26057vx1zkx() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92769);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92770);String text = "[2147483649:\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92771);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92772);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92773);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92774);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92775);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_overflow_stream() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dh58kg1zl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_overflow_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dh58kg1zl4() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92776);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92777);String text = "[2147483649:\"wenshao\" ]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92778);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92779);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92780);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92781);reader.readObject(VO.class);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92782);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92783);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92784);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_value_notmatch() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1xphn1zld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92785,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1xphn1zld() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92785);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92786);String text = "[true,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92787);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92788);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92789);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92790);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92791);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_value_notmatch_stream() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssstqa1zlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92792,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssstqa1zlk() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92792);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92793);String text = "[true,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92794);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92795);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92796);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92797);reader.readObject(VO.class);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92798);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92799);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92800);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lf5sbi1zlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lf5sbi1zlt() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92801);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92802);String text = "[+,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92803);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92804);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92805);JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92806);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92807);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    
    public void test_error_value_notmatch_2_stream() throws Exception {__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceStart(getClass().getName(),92808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2666nyn1zm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ziq1ziqlusvni8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ziq1ziqlusvni8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_long_public.test_error_value_notmatch_2_stream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2666nyn1zm0() throws Exception{try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92808);
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92809);String text = "[+,\"wenshao\"]";
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92810);Exception error = null;
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92811);try {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92812);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92813);reader.readObject(VO.class);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92814);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92815);error = ex;
        }
        __CLR4_5_21ziq1ziqlusvni8u.R.inc(92816);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}

    public static class VO {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92817);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92818);return id;
        }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92819);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92820);this.id = id;
        }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92821);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92822);return name;
        }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21ziq1ziqlusvni8u.R.inc(92823);
            __CLR4_5_21ziq1ziqlusvni8u.R.inc(92824);this.name = name;
        }finally{__CLR4_5_21ziq1ziqlusvni8u.R.flushNeeded();}}
    }
}
