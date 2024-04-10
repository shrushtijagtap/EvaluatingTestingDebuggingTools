/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Bug_for_issue_630 extends TestCase {static class __CLR4_5_214rs14rslusyjrp5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,52867,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue_null() throws Exception {__CLR4_5_214rs14rslusyjrp5.R.globalSliceStart(getClass().getName(),52840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqzn6114rs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214rs14rslusyjrp5.R.rethrow($CLV_t2$);}finally{__CLR4_5_214rs14rslusyjrp5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_630.test_for_issue_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqzn6114rs() throws Exception{try{__CLR4_5_214rs14rslusyjrp5.R.inc(52840);
        __CLR4_5_214rs14rslusyjrp5.R.inc(52841);Model model = new Model();
        __CLR4_5_214rs14rslusyjrp5.R.inc(52842);model.id = 123;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52843);model.name = null;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52844);model.modelName = null;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52845);model.isFlay = false;
//        model.persons = new ArrayList<Person>();
//        model.persons.add(new Person());
        
        __CLR4_5_214rs14rslusyjrp5.R.inc(52846);String str = JSON.toJSONString(model, SerializerFeature.BeanToArray);
//        System.out.println(str);
        __CLR4_5_214rs14rslusyjrp5.R.inc(52847);JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);
    }finally{__CLR4_5_214rs14rslusyjrp5.R.flushNeeded();}}
    
    public void test_for_issue_empty() throws Exception {__CLR4_5_214rs14rslusyjrp5.R.globalSliceStart(getClass().getName(),52848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2edmc5114s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214rs14rslusyjrp5.R.rethrow($CLV_t2$);}finally{__CLR4_5_214rs14rslusyjrp5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_630.test_for_issue_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52848,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2edmc5114s0() throws Exception{try{__CLR4_5_214rs14rslusyjrp5.R.inc(52848);
        __CLR4_5_214rs14rslusyjrp5.R.inc(52849);Model model = new Model();
        __CLR4_5_214rs14rslusyjrp5.R.inc(52850);model.id = 123;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52851);model.name = null;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52852);model.modelName = null;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52853);model.isFlay = false;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52854);model.persons = new ArrayList<Person>();
//        model.persons.add(new Person());
        
        __CLR4_5_214rs14rslusyjrp5.R.inc(52855);String str = JSON.toJSONString(model, SerializerFeature.BeanToArray);
//        System.out.println(str);
        __CLR4_5_214rs14rslusyjrp5.R.inc(52856);JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);
    }finally{__CLR4_5_214rs14rslusyjrp5.R.flushNeeded();}}
    
    public void test_for_issue_one() throws Exception {__CLR4_5_214rs14rslusyjrp5.R.globalSliceStart(getClass().getName(),52857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jz29c414s9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214rs14rslusyjrp5.R.rethrow($CLV_t2$);}finally{__CLR4_5_214rs14rslusyjrp5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_630.test_for_issue_one",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jz29c414s9() throws Exception{try{__CLR4_5_214rs14rslusyjrp5.R.inc(52857);
        __CLR4_5_214rs14rslusyjrp5.R.inc(52858);Model model = new Model();
        __CLR4_5_214rs14rslusyjrp5.R.inc(52859);model.id = 123;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52860);model.name = null;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52861);model.modelName = null;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52862);model.isFlay = false;
        __CLR4_5_214rs14rslusyjrp5.R.inc(52863);model.persons = new ArrayList<Person>();
        __CLR4_5_214rs14rslusyjrp5.R.inc(52864);model.persons.add(new Person());
        
        __CLR4_5_214rs14rslusyjrp5.R.inc(52865);String str = JSON.toJSONString(model, SerializerFeature.BeanToArray);
//        System.out.println(str);
        __CLR4_5_214rs14rslusyjrp5.R.inc(52866);JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);
    }finally{__CLR4_5_214rs14rslusyjrp5.R.flushNeeded();}}

    public static class Model {

        public int     id;
        public String  name;
        public String  modelName;
        public boolean isFlay;
        public List<Person>    persons;// = new ArrayList<Person>();
    }

    public static class Person {

        public int    id;
        public String name;
    }
}
