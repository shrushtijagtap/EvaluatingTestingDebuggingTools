/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_wuzhengmao extends TestCase {static class __CLR4_1_1016tc16tcluszw937{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,55510,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_1016tc16tcluszw937.R.globalSliceStart(getClass().getName(),55488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp216tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016tc16tcluszw937.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016tc16tcluszw937.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_wuzhengmao.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55488,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp216tc() throws Exception{try{__CLR4_1_1016tc16tcluszw937.R.inc(55488);
        __CLR4_1_1016tc16tcluszw937.R.inc(55489);Node node1 = new Node();
        __CLR4_1_1016tc16tcluszw937.R.inc(55490);node1.setId(1);
        __CLR4_1_1016tc16tcluszw937.R.inc(55491);Node node2 = new Node();
        __CLR4_1_1016tc16tcluszw937.R.inc(55492);node2.setId(2);
        __CLR4_1_1016tc16tcluszw937.R.inc(55493);node1.setParent(node2);
        
        __CLR4_1_1016tc16tcluszw937.R.inc(55494);List<Node> list = Arrays.asList(new Node[] { node1, node2 });
        __CLR4_1_1016tc16tcluszw937.R.inc(55495);String json = JSON.toJSONString(list, true);
        __CLR4_1_1016tc16tcluszw937.R.inc(55496);System.out.println(json);
        __CLR4_1_1016tc16tcluszw937.R.inc(55497);List<Node> result = JSON.parseArray(json, Node.class);
        __CLR4_1_1016tc16tcluszw937.R.inc(55498);Assert.assertEquals(2, result.size());
        __CLR4_1_1016tc16tcluszw937.R.inc(55499);Assert.assertEquals(1, result.get(0).getId());
        __CLR4_1_1016tc16tcluszw937.R.inc(55500);Assert.assertEquals(2, result.get(1).getId());
        __CLR4_1_1016tc16tcluszw937.R.inc(55501);Assert.assertEquals(result.get(0).getParent(), result.get(1));
    }finally{__CLR4_1_1016tc16tcluszw937.R.flushNeeded();}}

    static class Node {

        int  id;
        Node parent;

        public int getId() {try{__CLR4_1_1016tc16tcluszw937.R.inc(55502);
            __CLR4_1_1016tc16tcluszw937.R.inc(55503);return id;
        }finally{__CLR4_1_1016tc16tcluszw937.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_1016tc16tcluszw937.R.inc(55504);
            __CLR4_1_1016tc16tcluszw937.R.inc(55505);this.id = id;
        }finally{__CLR4_1_1016tc16tcluszw937.R.flushNeeded();}}

        public Node getParent() {try{__CLR4_1_1016tc16tcluszw937.R.inc(55506);
            __CLR4_1_1016tc16tcluszw937.R.inc(55507);return parent;
        }finally{__CLR4_1_1016tc16tcluszw937.R.flushNeeded();}}

        public void setParent(Node parent) {try{__CLR4_1_1016tc16tcluszw937.R.inc(55508);
            __CLR4_1_1016tc16tcluszw937.R.inc(55509);this.parent = parent;
        }finally{__CLR4_1_1016tc16tcluszw937.R.flushNeeded();}}
    }

}
