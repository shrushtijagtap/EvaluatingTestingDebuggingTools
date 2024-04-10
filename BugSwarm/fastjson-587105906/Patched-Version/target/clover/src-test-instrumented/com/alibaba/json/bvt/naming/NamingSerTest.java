/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.naming;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;

import junit.framework.TestCase;

public class NamingSerTest extends TestCase {static class __CLR4_5_21ewg1ewglusyjti3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66020,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_snake() throws Exception {__CLR4_5_21ewg1ewglusyjti3.R.globalSliceStart(getClass().getName(),65968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ciphru1ewg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewg1ewglusyjti3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewg1ewglusyjti3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_snake",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ciphru1ewg() throws Exception{try{__CLR4_5_21ewg1ewglusyjti3.R.inc(65968);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65969);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65970);config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;

        __CLR4_5_21ewg1ewglusyjti3.R.inc(65971);Model model = new Model();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65972);model.personId = 1001;
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65973);String text = JSON.toJSONString(model, config);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65974);Assert.assertEquals("{\"person_id\":1001}", text);

        __CLR4_5_21ewg1ewglusyjti3.R.inc(65975);ParserConfig parserConfig = new ParserConfig();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65976);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65977);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65978);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_5_21ewg1ewglusyjti3.R.inc(65979);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65980);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_5_21ewg1ewglusyjti3.R.flushNeeded();}}

    public void test_kebab() throws Exception {__CLR4_5_21ewg1ewglusyjti3.R.globalSliceStart(getClass().getName(),65981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j2tdtv1ewt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewg1ewglusyjti3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewg1ewglusyjti3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_kebab",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j2tdtv1ewt() throws Exception{try{__CLR4_5_21ewg1ewglusyjti3.R.inc(65981);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65982);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65983);config.propertyNamingStrategy = PropertyNamingStrategy.KebabCase;

        __CLR4_5_21ewg1ewglusyjti3.R.inc(65984);Model model = new Model();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65985);model.personId = 1001;
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65986);String text = JSON.toJSONString(model, config);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65987);Assert.assertEquals("{\"person-id\":1001}", text);
        
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65988);ParserConfig parserConfig = new ParserConfig();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65989);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.KebabCase;
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65990);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65991);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_5_21ewg1ewglusyjti3.R.inc(65992);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65993);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_5_21ewg1ewglusyjti3.R.flushNeeded();}}

    public void test_pascal() throws Exception {__CLR4_5_21ewg1ewglusyjti3.R.globalSliceStart(getClass().getName(),65994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22svhi81ex6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewg1ewglusyjti3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewg1ewglusyjti3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_pascal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22svhi81ex6() throws Exception{try{__CLR4_5_21ewg1ewglusyjti3.R.inc(65994);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65995);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65996);config.propertyNamingStrategy = PropertyNamingStrategy.PascalCase;

        __CLR4_5_21ewg1ewglusyjti3.R.inc(65997);Model model = new Model();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65998);model.personId = 1001;
        __CLR4_5_21ewg1ewglusyjti3.R.inc(65999);String text = JSON.toJSONString(model, config);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66000);Assert.assertEquals("{\"PersonId\":1001}", text);
        
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66001);ParserConfig parserConfig = new ParserConfig();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66002);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.PascalCase;
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66003);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66004);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_5_21ewg1ewglusyjti3.R.inc(66005);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66006);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_5_21ewg1ewglusyjti3.R.flushNeeded();}}

    public void test_camel() throws Exception {__CLR4_5_21ewg1ewglusyjti3.R.globalSliceStart(getClass().getName(),66007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2acyknk1exj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewg1ewglusyjti3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewg1ewglusyjti3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_camel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2acyknk1exj() throws Exception{try{__CLR4_5_21ewg1ewglusyjti3.R.inc(66007);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66008);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66009);config.propertyNamingStrategy = PropertyNamingStrategy.CamelCase;

        __CLR4_5_21ewg1ewglusyjti3.R.inc(66010);Model model = new Model();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66011);model.personId = 1001;
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66012);String text = JSON.toJSONString(model, config);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66013);Assert.assertEquals("{\"personId\":1001}", text);
        
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66014);ParserConfig parserConfig = new ParserConfig();
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66015);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.CamelCase;
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66016);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66017);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_5_21ewg1ewglusyjti3.R.inc(66018);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_5_21ewg1ewglusyjti3.R.inc(66019);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_5_21ewg1ewglusyjti3.R.flushNeeded();}}

    public static class Model {

        public int personId;
    }
}
