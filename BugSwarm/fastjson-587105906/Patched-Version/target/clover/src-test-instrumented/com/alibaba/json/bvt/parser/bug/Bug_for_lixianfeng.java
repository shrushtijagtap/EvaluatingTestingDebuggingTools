/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.bug;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

/**
 * \u8fd9\u4e2abug\u7531\u674e\u5148\u950b\u53cd\u9988
 * @author wenshao
 *
 */
public class Bug_for_lixianfeng extends TestCase {static class __CLR4_5_21kka1kkalusvne32{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,73321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long_list() throws Exception {__CLR4_5_21kka1kkalusvne32.R.globalSliceStart(getClass().getName(),73306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sosfdn1kka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kka1kkalusvne32.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kka1kkalusvne32.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.bug.Bug_for_lixianfeng.test_long_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sosfdn1kka() throws Exception{try{__CLR4_5_21kka1kkalusvne32.R.inc(73306);
        __CLR4_5_21kka1kkalusvne32.R.inc(73307);String str = "{\"id\":14281,\"name\":\"test\",\"canPurchase\":1,\"categoryId\":955063}";

        __CLR4_5_21kka1kkalusvne32.R.inc(73308);JSON.parseObject(str, Te.class);
    }finally{__CLR4_5_21kka1kkalusvne32.R.flushNeeded();}}

    public static class Te {

        private Long       id;
        private String     name;
        private List<Long> catIds;

        public Long getId() {try{__CLR4_5_21kka1kkalusvne32.R.inc(73309);
            __CLR4_5_21kka1kkalusvne32.R.inc(73310);return id;
        }finally{__CLR4_5_21kka1kkalusvne32.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_21kka1kkalusvne32.R.inc(73311);
            __CLR4_5_21kka1kkalusvne32.R.inc(73312);this.id = id;
        }finally{__CLR4_5_21kka1kkalusvne32.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21kka1kkalusvne32.R.inc(73313);
            __CLR4_5_21kka1kkalusvne32.R.inc(73314);return name;
        }finally{__CLR4_5_21kka1kkalusvne32.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21kka1kkalusvne32.R.inc(73315);
            __CLR4_5_21kka1kkalusvne32.R.inc(73316);this.name = name;
        }finally{__CLR4_5_21kka1kkalusvne32.R.flushNeeded();}}

        public List<Long> getCatIds() {try{__CLR4_5_21kka1kkalusvne32.R.inc(73317);
            __CLR4_5_21kka1kkalusvne32.R.inc(73318);return catIds;
        }finally{__CLR4_5_21kka1kkalusvne32.R.flushNeeded();}}

        public void setCatIds(List<Long> catIds) {try{__CLR4_5_21kka1kkalusvne32.R.inc(73319);
            __CLR4_5_21kka1kkalusvne32.R.inc(73320);this.catIds = catIds;
        }finally{__CLR4_5_21kka1kkalusvne32.R.flushNeeded();}}

    }
}
