/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;

public class JSONObjectTest3 extends TestCase {static class __CLR4_1_10xymxymlusqjy54{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,44096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2xym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44014,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2xym() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44014);
        __CLR4_1_10xymxymlusqjy54.R.inc(44015);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44016);Bean bean = JSON.parseObject(text, Bean.class);
        __CLR4_1_10xymxymlusqjy54.R.inc(44017);Assert.assertEquals("123", bean.getValue());
        __CLR4_1_10xymxymlusqjy54.R.inc(44018);Assert.assertEquals(false, bean.isBig());
        __CLR4_1_10xymxymlusqjy54.R.inc(44019);Assert.assertEquals(123, bean.getIntValue());

        __CLR4_1_10xymxymlusqjy54.R.inc(44020);bean.setBig(true);
        __CLR4_1_10xymxymlusqjy54.R.inc(44021);Assert.assertEquals(true, bean.isBig());

        __CLR4_1_10xymxymlusqjy54.R.inc(44022);bean.setID(567);
        __CLR4_1_10xymxymlusqjy54.R.inc(44023);Assert.assertEquals(567, bean.getID());

    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxvxyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44024,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxvxyw() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44024);
        __CLR4_1_10xymxymlusqjy54.R.inc(44025);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44026);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44027);JSONException error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44028);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44029);bean.f();
        } catch (JSONException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44030);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44031);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqcxz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44032,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqcxz4() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44032);
        __CLR4_1_10xymxymlusqjy54.R.inc(44033);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44034);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44035);JSONException error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44036);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44037);bean.f(1);
        } catch (JSONException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44038);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44039);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfitxzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44040,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfitxzc() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44040);
        __CLR4_1_10xymxymlusqjy54.R.inc(44041);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44042);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44043);JSONException error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44044);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44045);bean.get();
        } catch (JSONException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44046);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44047);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orcebaxzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44048,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orcebaxzk() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44048);
        __CLR4_1_10xymxymlusqjy54.R.inc(44049);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44050);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44051);JSONException error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44052);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44053);bean.is();
        } catch (JSONException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44054);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44055);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3rxzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44056,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3rxzs() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44056);
        __CLR4_1_10xymxymlusqjy54.R.inc(44057);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44058);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44059);Exception error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44060);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44061);bean.f(1, 2);
        } catch (UnsupportedOperationException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44062);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44063);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw8y00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44064,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw8y00() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44064);
        __CLR4_1_10xymxymlusqjy54.R.inc(44065);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44066);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44067);JSONException error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44068);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44069);bean.getA();
        } catch (JSONException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44070);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44071);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaopy08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaopy08() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44072);
        __CLR4_1_10xymxymlusqjy54.R.inc(44073);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44074);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44075);JSONException error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44076);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44077);bean.f1(1);
        } catch (JSONException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44078);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44079);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshyy0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44080,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshyy0g() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44080);
        __CLR4_1_10xymxymlusqjy54.R.inc(44081);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44082);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44083);JSONException error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44084);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44085);bean.set(1);
        } catch (JSONException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44086);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44087);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_1_10xymxymlusqjy54.R.globalSliceStart(getClass().getName(),44088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtphy0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xymxymlusqjy54.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xymxymlusqjy54.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest3.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44088,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtphy0o() throws Exception{try{__CLR4_1_10xymxymlusqjy54.R.inc(44088);
        __CLR4_1_10xymxymlusqjy54.R.inc(44089);String text = "{value:'123',big:false}";
        __CLR4_1_10xymxymlusqjy54.R.inc(44090);Bean bean = JSON.parseObject(text, Bean.class);

        __CLR4_1_10xymxymlusqjy54.R.inc(44091);JSONException error = null;
        __CLR4_1_10xymxymlusqjy54.R.inc(44092);try {
            __CLR4_1_10xymxymlusqjy54.R.inc(44093);bean.xx();
        } catch (JSONException ex) {
            __CLR4_1_10xymxymlusqjy54.R.inc(44094);error = ex;
        }
        __CLR4_1_10xymxymlusqjy54.R.inc(44095);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xymxymlusqjy54.R.flushNeeded();}}

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
