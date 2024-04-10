/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;

public class JSONObjectTest3 extends TestCase {static class __CLR4_5_2xyixyilusyjpzb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,44092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2xyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44010,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2xyi() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44010);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44011);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44012);Bean bean = JSON.parseObject(text, Bean.class);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44013);Assert.assertEquals("123", bean.getValue());
        __CLR4_5_2xyixyilusyjpzb.R.inc(44014);Assert.assertEquals(false, bean.isBig());
        __CLR4_5_2xyixyilusyjpzb.R.inc(44015);Assert.assertEquals(123, bean.getIntValue());

        __CLR4_5_2xyixyilusyjpzb.R.inc(44016);bean.setBig(true);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44017);Assert.assertEquals(true, bean.isBig());

        __CLR4_5_2xyixyilusyjpzb.R.inc(44018);bean.setID(567);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44019);Assert.assertEquals(567, bean.getID());

    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxvxys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxvxys() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44020);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44021);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44022);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44023);JSONException error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44024);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44025);bean.f();
        } catch (JSONException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44026);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44027);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqcxz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqcxz0() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44028);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44029);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44030);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44031);JSONException error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44032);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44033);bean.f(1);
        } catch (JSONException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44034);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44035);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfitxz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfitxz8() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44036);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44037);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44038);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44039);JSONException error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44040);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44041);bean.get();
        } catch (JSONException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44042);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44043);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orcebaxzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orcebaxzg() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44044);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44045);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44046);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44047);JSONException error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44048);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44049);bean.is();
        } catch (JSONException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44050);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44051);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3rxzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3rxzo() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44052);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44053);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44054);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44055);Exception error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44056);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44057);bean.f(1, 2);
        } catch (UnsupportedOperationException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44058);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44059);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw8xzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw8xzw() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44060);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44061);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44062);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44063);JSONException error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44064);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44065);bean.getA();
        } catch (JSONException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44066);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44067);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaopy04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaopy04() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44068);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44069);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44070);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44071);JSONException error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44072);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44073);bean.f1(1);
        } catch (JSONException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44074);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44075);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshyy0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44076,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshyy0c() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44076);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44077);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44078);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44079);JSONException error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44080);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44081);bean.set(1);
        } catch (JSONException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44082);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44083);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_5_2xyixyilusyjpzb.R.globalSliceStart(getClass().getName(),44084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtphy0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xyixyilusyjpzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xyixyilusyjpzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44084,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtphy0k() throws Exception{try{__CLR4_5_2xyixyilusyjpzb.R.inc(44084);
        __CLR4_5_2xyixyilusyjpzb.R.inc(44085);String text = "{value:'123',big:false}";
        __CLR4_5_2xyixyilusyjpzb.R.inc(44086);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_5_2xyixyilusyjpzb.R.inc(44087);JSONException error = null;
        __CLR4_5_2xyixyilusyjpzb.R.inc(44088);try {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44089);bean.xx();
        } catch (JSONException ex) {
            __CLR4_5_2xyixyilusyjpzb.R.inc(44090);error = ex;
        }
        __CLR4_5_2xyixyilusyjpzb.R.inc(44091);Assert.assertNotNull(error);
    }finally{__CLR4_5_2xyixyilusyjpzb.R.flushNeeded();}}

    public static interface Bean {

        String getValue();

        void setValue(String value);

        boolean isBig();

        @JSONField
        void setBig(boolean value);

        @JSONField(name = "value")
        int getIntValue();

        @JSONField(name = "id")
        void setID(int value);

        @JSONField(name = "id")
        int getID();

        Object get();

        Object xx();

        void set(int i);

        boolean is();

        void getA();

        void f();

        Object f(int a);

        void f1(int a);

        void f(int a, int b);
    }
}
