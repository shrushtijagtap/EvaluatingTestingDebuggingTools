/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.alibaba.json.bvtVO.DataTransaction;


public class Bug_for_dargoner extends TestCase {static class __CLR4_5_214lu14lulusvn63f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,52646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_214lu14lulusvn63f.R.globalSliceStart(getClass().getName(),52626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp214lu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214lu14lulusvn63f.R.rethrow($CLV_t2$);}finally{__CLR4_5_214lu14lulusvn63f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_dargoner.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp214lu() throws Exception{try{__CLR4_5_214lu14lulusvn63f.R.inc(52626);
        __CLR4_5_214lu14lulusvn63f.R.inc(52627);DataTransaction dt = new DataTransaction();

        __CLR4_5_214lu14lulusvn63f.R.inc(52628);List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        __CLR4_5_214lu14lulusvn63f.R.inc(52629);Map<String, Object> m = new HashMap<String, Object>();
        __CLR4_5_214lu14lulusvn63f.R.inc(52630);m.put("name", "tom");
        __CLR4_5_214lu14lulusvn63f.R.inc(52631);m.put("sex", "m");
        __CLR4_5_214lu14lulusvn63f.R.inc(52632);list.add(m);

        __CLR4_5_214lu14lulusvn63f.R.inc(52633);dt.setDataSet("1000", list);
        __CLR4_5_214lu14lulusvn63f.R.inc(52634);dt.setRetMsgCode("1", "ok");
        __CLR4_5_214lu14lulusvn63f.R.inc(52635);dt.getHead().setAppid("back");
        __CLR4_5_214lu14lulusvn63f.R.inc(52636);dt.getHead().setSeqno("201010");
        __CLR4_5_214lu14lulusvn63f.R.inc(52637);dt.getHead().getUser().setId("root");

        __CLR4_5_214lu14lulusvn63f.R.inc(52638);Map<String, String> m2 = new HashMap<String, String>();
        __CLR4_5_214lu14lulusvn63f.R.inc(52639);m2.put("name1", "tom");
        __CLR4_5_214lu14lulusvn63f.R.inc(52640);m2.put("name2", "tom");
        __CLR4_5_214lu14lulusvn63f.R.inc(52641);m2.put("name3", "tom");

        __CLR4_5_214lu14lulusvn63f.R.inc(52642);dt.getBody().getParam().setForm(m2);

        __CLR4_5_214lu14lulusvn63f.R.inc(52643);System.out.println(dt.toJSON());

        __CLR4_5_214lu14lulusvn63f.R.inc(52644);DataTransaction dt2 = DataTransaction.fromJSON(dt.toJSON());
        __CLR4_5_214lu14lulusvn63f.R.inc(52645);System.out.println(dt2.toJSON());
    }finally{__CLR4_5_214lu14lulusvn63f.R.flushNeeded();}}
}
