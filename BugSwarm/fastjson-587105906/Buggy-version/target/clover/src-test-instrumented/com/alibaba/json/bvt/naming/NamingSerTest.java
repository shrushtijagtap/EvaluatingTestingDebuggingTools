/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.naming;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;

import junit.framework.TestCase;

public class NamingSerTest extends TestCase {static class __CLR4_1_101ewr1ewrlusqkcne{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,66031,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_snake() throws Exception {__CLR4_1_101ewr1ewrlusqkcne.R.globalSliceStart(getClass().getName(),65979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ciphru1ewr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ewr1ewrlusqkcne.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ewr1ewrlusqkcne.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_snake",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65979,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ciphru1ewr() throws Exception{try{__CLR4_1_101ewr1ewrlusqkcne.R.inc(65979);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65980);SerializeConfig config = new SerializeConfig();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65981);config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65982);Model model = new Model();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65983);model.personId = 1001;
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65984);String text = JSON.toJSONString(model, config);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65985);Assert.assertEquals("{\"person_id\":1001}", text);

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65986);ParserConfig parserConfig = new ParserConfig();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65987);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65988);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65989);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65990);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65991);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_1_101ewr1ewrlusqkcne.R.flushNeeded();}}

    public void test_kebab() throws Exception {__CLR4_1_101ewr1ewrlusqkcne.R.globalSliceStart(getClass().getName(),65992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j2tdtv1ex4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ewr1ewrlusqkcne.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ewr1ewrlusqkcne.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_kebab",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65992,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j2tdtv1ex4() throws Exception{try{__CLR4_1_101ewr1ewrlusqkcne.R.inc(65992);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65993);SerializeConfig config = new SerializeConfig();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65994);config.propertyNamingStrategy = PropertyNamingStrategy.KebabCase;

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65995);Model model = new Model();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65996);model.personId = 1001;
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65997);String text = JSON.toJSONString(model, config);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65998);Assert.assertEquals("{\"person-id\":1001}", text);
        
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(65999);ParserConfig parserConfig = new ParserConfig();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66000);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.KebabCase;
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66001);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66002);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66003);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66004);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_1_101ewr1ewrlusqkcne.R.flushNeeded();}}

    public void test_pascal() throws Exception {__CLR4_1_101ewr1ewrlusqkcne.R.globalSliceStart(getClass().getName(),66005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102svhi81exh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ewr1ewrlusqkcne.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ewr1ewrlusqkcne.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_pascal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66005,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102svhi81exh() throws Exception{try{__CLR4_1_101ewr1ewrlusqkcne.R.inc(66005);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66006);SerializeConfig config = new SerializeConfig();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66007);config.propertyNamingStrategy = PropertyNamingStrategy.PascalCase;

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66008);Model model = new Model();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66009);model.personId = 1001;
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66010);String text = JSON.toJSONString(model, config);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66011);Assert.assertEquals("{\"PersonId\":1001}", text);
        
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66012);ParserConfig parserConfig = new ParserConfig();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66013);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.PascalCase;
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66014);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66015);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66016);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66017);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_1_101ewr1ewrlusqkcne.R.flushNeeded();}}

    public void test_camel() throws Exception {__CLR4_1_101ewr1ewrlusqkcne.R.globalSliceStart(getClass().getName(),66018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10acyknk1exu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ewr1ewrlusqkcne.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ewr1ewrlusqkcne.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.NamingSerTest.test_camel",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66018,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10acyknk1exu() throws Exception{try{__CLR4_1_101ewr1ewrlusqkcne.R.inc(66018);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66019);SerializeConfig config = new SerializeConfig();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66020);config.propertyNamingStrategy = PropertyNamingStrategy.CamelCase;

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66021);Model model = new Model();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66022);model.personId = 1001;
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66023);String text = JSON.toJSONString(model, config);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66024);Assert.assertEquals("{\"personId\":1001}", text);
        
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66025);ParserConfig parserConfig = new ParserConfig();
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66026);parserConfig.propertyNamingStrategy = PropertyNamingStrategy.CamelCase;
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66027);Model model2 = JSON.parseObject(text, Model.class, parserConfig);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66028);Assert.assertEquals(model.personId, model2.personId);

        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66029);Model model3 = JSON.parseObject(text, Model.class);
        __CLR4_1_101ewr1ewrlusqkcne.R.inc(66030);Assert.assertEquals(model.personId, model3.personId);
    }finally{__CLR4_1_101ewr1ewrlusqkcne.R.flushNeeded();}}

    public static class Model {

        public int personId;
    }
}
