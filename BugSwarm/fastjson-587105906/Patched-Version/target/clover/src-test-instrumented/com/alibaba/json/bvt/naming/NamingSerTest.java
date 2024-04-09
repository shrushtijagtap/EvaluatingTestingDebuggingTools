/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.naming;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;

import junit.framework.TestCase;

public class NamingSerTest extends TestCase {static class __CLR4_5_21fuo1fuolusvnc8s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,67252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_snake() throws Exception {__CLR4_5_21fuo1fuolusvnc8s.R.globalSliceStart(getClass().getName(),67200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ciphru1fuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fuo1fuolusvnc8s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fuo1fuolusvnc8s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_snake",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67200,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ciphru1fuo() throws Exception{try{__CLR4_5_21fuo1fuolusvnc8s.R.inc(67200);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67201);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67202);config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67203);Model model = new Model();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67204);model.personId = 1001;
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67205);String text = JSON.toJSONString(model, config);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67206);Assert.assertEquals("{\"person_id\":1001}", text);

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67207);ParserConfig parserConfig = new ParserConfig();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67208);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67209);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67210);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67211);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67212);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_5_21fuo1fuolusvnc8s.R.flushNeeded();}}

    public void test_kebab() throws Exception {__CLR4_5_21fuo1fuolusvnc8s.R.globalSliceStart(getClass().getName(),67213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j2tdtv1fv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fuo1fuolusvnc8s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fuo1fuolusvnc8s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_kebab",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j2tdtv1fv1() throws Exception{try{__CLR4_5_21fuo1fuolusvnc8s.R.inc(67213);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67214);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67215);config.propertyNamingStrategy = PropertyNamingStrategy.KebabCase;

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67216);Model model = new Model();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67217);model.personId = 1001;
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67218);String text = JSON.toJSONString(model, config);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67219);Assert.assertEquals("{\"person-id\":1001}", text);
        
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67220);ParserConfig parserConfig = new ParserConfig();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67221);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.KebabCase;
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67222);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67223);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67224);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67225);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_5_21fuo1fuolusvnc8s.R.flushNeeded();}}

    public void test_pascal() throws Exception {__CLR4_5_21fuo1fuolusvnc8s.R.globalSliceStart(getClass().getName(),67226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22svhi81fve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fuo1fuolusvnc8s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fuo1fuolusvnc8s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_pascal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22svhi81fve() throws Exception{try{__CLR4_5_21fuo1fuolusvnc8s.R.inc(67226);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67227);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67228);config.propertyNamingStrategy = PropertyNamingStrategy.PascalCase;

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67229);Model model = new Model();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67230);model.personId = 1001;
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67231);String text = JSON.toJSONString(model, config);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67232);Assert.assertEquals("{\"PersonId\":1001}", text);
        
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67233);ParserConfig parserConfig = new ParserConfig();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67234);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.PascalCase;
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67235);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67236);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67237);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67238);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_5_21fuo1fuolusvnc8s.R.flushNeeded();}}

    public void test_camel() throws Exception {__CLR4_5_21fuo1fuolusvnc8s.R.globalSliceStart(getClass().getName(),67239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2acyknk1fvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fuo1fuolusvnc8s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fuo1fuolusvnc8s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_camel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67239,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2acyknk1fvr() throws Exception{try{__CLR4_5_21fuo1fuolusvnc8s.R.inc(67239);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67240);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67241);config.propertyNamingStrategy = PropertyNamingStrategy.CamelCase;

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67242);Model model = new Model();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67243);model.personId = 1001;
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67244);String text = JSON.toJSONString(model, config);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67245);Assert.assertEquals("{\"personId\":1001}", text);
        
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67246);ParserConfig parserConfig = new ParserConfig();
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67247);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.CamelCase;
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67248);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67249);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67250);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_5_21fuo1fuolusvnc8s.R.inc(67251);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_5_21fuo1fuolusvnc8s.R.flushNeeded();}}

    public static class Model {

        public int personId;
    }
}
