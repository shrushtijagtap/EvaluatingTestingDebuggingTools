/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.io.StringWriter;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class StringFieldTest_special_singquote extends TestCase {static class __CLR4_5_210nq10nqlusvn3vz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,47546,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_special() throws Exception {__CLR4_5_210nq10nqlusvn3vz.R.globalSliceStart(getClass().getName(),47510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25olkgj10nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210nq10nqlusvn3vz.R.rethrow($CLV_t2$);}finally{__CLR4_5_210nq10nqlusvn3vz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_singquote.test_special",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25olkgj10nq() throws Exception{try{__CLR4_5_210nq10nqlusvn3vz.R.inc(47510);
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47511);Model model = new Model();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47512);StringBuilder buf = new StringBuilder();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47513);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_5_210nq10nqlusvn3vz.R.iget(47514)!=0|true))||(__CLR4_5_210nq10nqlusvn3vz.R.iget(47515)==0&false)); ++i) {{
            __CLR4_5_210nq10nqlusvn3vz.R.inc(47516);buf.append((char) i);
        }
        }__CLR4_5_210nq10nqlusvn3vz.R.inc(47517);model.name = buf.toString();
        
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47518);StringWriter writer = new StringWriter();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47519);JSON.writeJSONString(writer, model);

        __CLR4_5_210nq10nqlusvn3vz.R.inc(47520);Model model2 = JSON.parseObject(writer.toString(), Model.class);
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47521);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_5_210nq10nqlusvn3vz.R.flushNeeded();}}
    
    public void test_special_browsecue() throws Exception {__CLR4_5_210nq10nqlusvn3vz.R.globalSliceStart(getClass().getName(),47522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21f0vi510o2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210nq10nqlusvn3vz.R.rethrow($CLV_t2$);}finally{__CLR4_5_210nq10nqlusvn3vz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_singquote.test_special_browsecue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21f0vi510o2() throws Exception{try{__CLR4_5_210nq10nqlusvn3vz.R.inc(47522);
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47523);Model model = new Model();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47524);StringBuilder buf = new StringBuilder();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47525);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_5_210nq10nqlusvn3vz.R.iget(47526)!=0|true))||(__CLR4_5_210nq10nqlusvn3vz.R.iget(47527)==0&false)); ++i) {{
            __CLR4_5_210nq10nqlusvn3vz.R.inc(47528);buf.append((char) i);
        }
        }__CLR4_5_210nq10nqlusvn3vz.R.inc(47529);model.name = buf.toString();
        
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47530);StringWriter writer = new StringWriter();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47531);JSON.writeJSONString(writer, model, SerializerFeature.UseSingleQuotes);

        __CLR4_5_210nq10nqlusvn3vz.R.inc(47532);Model model2 = JSON.parseObject(writer.toString(), Model.class);
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47533);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_5_210nq10nqlusvn3vz.R.flushNeeded();}}
    
    public void test_special_browsecompatible() throws Exception {__CLR4_5_210nq10nqlusvn3vz.R.globalSliceStart(getClass().getName(),47534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tticpk10oe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210nq10nqlusvn3vz.R.rethrow($CLV_t2$);}finally{__CLR4_5_210nq10nqlusvn3vz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_singquote.test_special_browsecompatible",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tticpk10oe() throws Exception{try{__CLR4_5_210nq10nqlusvn3vz.R.inc(47534);
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47535);Model model = new Model();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47536);StringBuilder buf = new StringBuilder();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47537);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_5_210nq10nqlusvn3vz.R.iget(47538)!=0|true))||(__CLR4_5_210nq10nqlusvn3vz.R.iget(47539)==0&false)); ++i) {{
            __CLR4_5_210nq10nqlusvn3vz.R.inc(47540);buf.append((char) i);
        }
        }__CLR4_5_210nq10nqlusvn3vz.R.inc(47541);model.name = buf.toString();
        
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47542);StringWriter writer = new StringWriter();
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47543);JSON.writeJSONString(writer, model, SerializerFeature.UseSingleQuotes);

        __CLR4_5_210nq10nqlusvn3vz.R.inc(47544);Model model2 = JSON.parseObject(writer.toString(), Model.class);
        __CLR4_5_210nq10nqlusvn3vz.R.inc(47545);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_5_210nq10nqlusvn3vz.R.flushNeeded();}}

    private static class Model {

        public String name;

    }
}
