/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class StringFieldTest_special_1 extends TestCase {static class __CLR4_1_1010ka10kaluszw6fd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,47421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_special() throws Exception {__CLR4_1_1010ka10kaluszw6fd.R.globalSliceStart(getClass().getName(),47386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105olkgj10ka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1010ka10kaluszw6fd.R.rethrow($CLV_t2$);}finally{__CLR4_1_1010ka10kaluszw6fd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_1.test_special",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),47386,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105olkgj10ka() throws Exception{try{__CLR4_1_1010ka10kaluszw6fd.R.inc(47386);
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47387);Model model = new Model();
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47388);StringBuilder buf = new StringBuilder();
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47389);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_1_1010ka10kaluszw6fd.R.iget(47390)!=0|true))||(__CLR4_1_1010ka10kaluszw6fd.R.iget(47391)==0&false)); ++i) {{
            __CLR4_1_1010ka10kaluszw6fd.R.inc(47392);buf.append((char) i);
        }
        }__CLR4_1_1010ka10kaluszw6fd.R.inc(47393);model.name = buf.toString();
        
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47394);String text = JSON.toJSONString(model);

        __CLR4_1_1010ka10kaluszw6fd.R.inc(47395);Model model2 = JSON.parseObject(text, Model.class);
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47396);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_1_1010ka10kaluszw6fd.R.flushNeeded();}}
    
    public void test_special_browsecue() throws Exception {__CLR4_1_1010ka10kaluszw6fd.R.globalSliceStart(getClass().getName(),47397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101f0vi510kl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1010ka10kaluszw6fd.R.rethrow($CLV_t2$);}finally{__CLR4_1_1010ka10kaluszw6fd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_1.test_special_browsecue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),47397,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101f0vi510kl() throws Exception{try{__CLR4_1_1010ka10kaluszw6fd.R.inc(47397);
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47398);Model model = new Model();
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47399);StringBuilder buf = new StringBuilder();
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47400);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_1_1010ka10kaluszw6fd.R.iget(47401)!=0|true))||(__CLR4_1_1010ka10kaluszw6fd.R.iget(47402)==0&false)); ++i) {{
            __CLR4_1_1010ka10kaluszw6fd.R.inc(47403);buf.append((char) i);
        }
        }__CLR4_1_1010ka10kaluszw6fd.R.inc(47404);model.name = buf.toString();
        
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47405);String text = JSON.toJSONString(model, SerializerFeature.BrowserSecure);
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47406);text = text.replaceAll("&lt;", "<");
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47407);text = text.replaceAll("&gt;", ">");
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47408);Model model2 = JSON.parseObject(text, Model.class);
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47409);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_1_1010ka10kaluszw6fd.R.flushNeeded();}}
    
    public void test_special_browsecompatible() throws Exception {__CLR4_1_1010ka10kaluszw6fd.R.globalSliceStart(getClass().getName(),47410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tticpk10ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1010ka10kaluszw6fd.R.rethrow($CLV_t2$);}finally{__CLR4_1_1010ka10kaluszw6fd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_1.test_special_browsecompatible",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),47410,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tticpk10ky() throws Exception{try{__CLR4_1_1010ka10kaluszw6fd.R.inc(47410);
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47411);Model model = new Model();
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47412);StringBuilder buf = new StringBuilder();
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47413);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_1_1010ka10kaluszw6fd.R.iget(47414)!=0|true))||(__CLR4_1_1010ka10kaluszw6fd.R.iget(47415)==0&false)); ++i) {{
            __CLR4_1_1010ka10kaluszw6fd.R.inc(47416);buf.append((char) i);
        }
        }__CLR4_1_1010ka10kaluszw6fd.R.inc(47417);model.name = buf.toString();
        
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47418);String text = JSON.toJSONString(model, SerializerFeature.BrowserCompatible);

        __CLR4_1_1010ka10kaluszw6fd.R.inc(47419);Model model2 = JSON.parseObject(text, Model.class);
        __CLR4_1_1010ka10kaluszw6fd.R.inc(47420);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_1_1010ka10kaluszw6fd.R.flushNeeded();}}
    
    public static class Model {

        public String name;

    }
}
