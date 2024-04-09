/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * test parse json contains jsonobject in javabean
 * Created by yixian on 2016-02-25.
 */
public class TestParse {static class __CLR4_5_2w89w89lusvn24g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,41785,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Logger logger = Logger.getLogger(TestParse.class.getSimpleName());

    private String jsonString;

    @Before
    public void prepareJsonString() {try{__CLR4_5_2w89w89lusvn24g.R.inc(41769);
        __CLR4_5_2w89w89lusvn24g.R.inc(41770);TestBean bean = new TestBean();
        __CLR4_5_2w89w89lusvn24g.R.inc(41771);bean.setName("tester");
        __CLR4_5_2w89w89lusvn24g.R.inc(41772);JSONObject data = new JSONObject();
        __CLR4_5_2w89w89lusvn24g.R.inc(41773);data.put("key", "value");
        __CLR4_5_2w89w89lusvn24g.R.inc(41774);bean.setData(data);
        __CLR4_5_2w89w89lusvn24g.R.inc(41775);jsonString = JSON.toJSONString(bean, SerializerFeature.WriteClassName);
    }finally{__CLR4_5_2w89w89lusvn24g.R.flushNeeded();}}

    @Test
    public void testParse() {__CLR4_5_2w89w89lusvn24g.R.globalSliceStart(getClass().getName(),41776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se4tqww8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w89w89lusvn24g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w89w89lusvn24g.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.serializer.TestParse.testParse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se4tqww8g(){try{__CLR4_5_2w89w89lusvn24g.R.inc(41776);
        __CLR4_5_2w89w89lusvn24g.R.inc(41777);logger.info("parsing json string:" + jsonString);
        __CLR4_5_2w89w89lusvn24g.R.inc(41778);TestBean testBean = (TestBean) JSON.parse(jsonString);
        assert (((testBean.getData() != null)&&(__CLR4_5_2w89w89lusvn24g.R.iget(41779)!=0|true))||(__CLR4_5_2w89w89lusvn24g.R.iget(41780)==0&false));
        assert ((("tester".equals(testBean.getName()))&&(__CLR4_5_2w89w89lusvn24g.R.iget(41781)!=0|true))||(__CLR4_5_2w89w89lusvn24g.R.iget(41782)==0&false));
        assert ((("value".equals(testBean.getData().getString("key")))&&(__CLR4_5_2w89w89lusvn24g.R.iget(41783)!=0|true))||(__CLR4_5_2w89w89lusvn24g.R.iget(41784)==0&false));
    }finally{__CLR4_5_2w89w89lusvn24g.R.flushNeeded();}}
}
