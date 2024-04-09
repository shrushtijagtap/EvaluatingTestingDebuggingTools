/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Issue_748 extends TestCase {static class __CLR4_1_1017sx17sxlusqk7ac{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,56789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_1017sx17sxlusqk7ac.R.inc(56769);
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56770);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Issue_748.");
    }finally{__CLR4_1_1017sx17sxlusqk7ac.R.flushNeeded();}}

    public void testJsonObjectWithClassName() {__CLR4_1_1017sx17sxlusqk7ac.R.globalSliceStart(getClass().getName(),56771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108scc3917sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017sx17sxlusqk7ac.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017sx17sxlusqk7ac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue_748.testJsonObjectWithClassName",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56771,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108scc3917sz(){try{__CLR4_1_1017sx17sxlusqk7ac.R.inc(56771);
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56772);JSONObject jsonObject = new JSONObject();
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56773);jsonObject.put("key1", "value1");
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56774);jsonObject.put("key2", "value2");
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56775);DataObject dataObject = new DataObject();
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56776);dataObject.setValue(jsonObject);
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56777);String jsonStr = JSON.toJSONString(dataObject, SerializerFeature.QuoteFieldNames,
                                           SerializerFeature.SkipTransientField, SerializerFeature.WriteClassName);

//        System.out.println("parse\u4e4b\u524d:" + jsonStr);

        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56778);DataObject obj = (DataObject) JSON.parse(jsonStr, Feature.IgnoreNotMatch);
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56779);Assert.assertNotNull(obj.value);
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56780);Assert.assertNotNull(obj.value.get("key1"));
        __CLR4_1_1017sx17sxlusqk7ac.R.inc(56781);Assert.assertNotNull(obj.value.get("key2"));
    }finally{__CLR4_1_1017sx17sxlusqk7ac.R.flushNeeded();}}

    public static class DataObject {

        private JSONObject value;

        public DataObject(){try{__CLR4_1_1017sx17sxlusqk7ac.R.inc(56782);
        }finally{__CLR4_1_1017sx17sxlusqk7ac.R.flushNeeded();}}

        public JSONObject getValue() {try{__CLR4_1_1017sx17sxlusqk7ac.R.inc(56783);
            __CLR4_1_1017sx17sxlusqk7ac.R.inc(56784);return value;
        }finally{__CLR4_1_1017sx17sxlusqk7ac.R.flushNeeded();}}

        public void setValue(JSONObject value) {try{__CLR4_1_1017sx17sxlusqk7ac.R.inc(56785);
            __CLR4_1_1017sx17sxlusqk7ac.R.inc(56786);this.value = value;
        }finally{__CLR4_1_1017sx17sxlusqk7ac.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_1017sx17sxlusqk7ac.R.inc(56787);
            __CLR4_1_1017sx17sxlusqk7ac.R.inc(56788);return "DataObject{" + "value=" + value + '}';
        }finally{__CLR4_1_1017sx17sxlusqk7ac.R.flushNeeded();}}
    }

}
