/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.common.collect.ImmutableMap;
import junit.framework.TestCase;

import java.io.Serializable;

public class Issue1458 extends TestCase {static class __CLR4_5_21ahw1ahwlusyjsue{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60289,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21ahw1ahwlusyjsue.R.globalSliceStart(getClass().getName(),60260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1ahw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ahw1ahwlusyjsue.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ahw1ahwlusyjsue.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1458.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1ahw() throws Exception{try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60260);
        __CLR4_5_21ahw1ahwlusyjsue.R.inc(60261);HostPoint hostPoint = new HostPoint(new HostAddress("192.168.10.101"));
        __CLR4_5_21ahw1ahwlusyjsue.R.inc(60262);hostPoint.setFingerprint(new Fingerprint("abc"));

        __CLR4_5_21ahw1ahwlusyjsue.R.inc(60263);String json = JSON.toJSONString(hostPoint);

        __CLR4_5_21ahw1ahwlusyjsue.R.inc(60264);HostPoint hostPoint1 = JSON.parseObject(json, HostPoint.class);
        __CLR4_5_21ahw1ahwlusyjsue.R.inc(60265);String json1 = JSON.toJSONString(hostPoint1);
        __CLR4_5_21ahw1ahwlusyjsue.R.inc(60266);assertEquals(json, json1);
    }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

    public static class HostPoint implements Serializable {

        private final HostAddress address;

        @JSONField(name = "fingerprint")
        private Fingerprint fingerprint;

        @JSONField(name = "unkown")
        private boolean unkown;

        // ------------------------------------------------------------------------

        @JSONCreator
        public HostPoint(@JSONField(name = "address") HostAddress addr) {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60267);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60268);this.address = addr;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

        public boolean isChanged() {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60269);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60270);return false;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

        public boolean isMatched() {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60271);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60272);return false;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}


        public HostAddress getAddress() {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60273);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60274);return address;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

        public Fingerprint getFingerprint() {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60275);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60276);return fingerprint;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

        public void setFingerprint(Fingerprint fingerprint) {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60277);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60278);this.fingerprint = fingerprint;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

        public boolean isUnkown() {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60279);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60280);return unkown;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

        public void setUnkown(boolean unkown) {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60281);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60282);this.unkown = unkown;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

    }

    public static class Fingerprint implements Serializable {
        private final String source;

        private ImmutableMap<String, String> probes;

        @JSONCreator
        public Fingerprint(@JSONField(name = "source") String fingerprint) {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60283);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60284);this.source = fingerprint;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}


        public String getSource() {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60285);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60286);return source;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}

    }

    public static class HostAddress {
        public final String hostAddress;

        public HostAddress(String hostAddress) {try{__CLR4_5_21ahw1ahwlusyjsue.R.inc(60287);
            __CLR4_5_21ahw1ahwlusyjsue.R.inc(60288);this.hostAddress = hostAddress;
        }finally{__CLR4_5_21ahw1ahwlusyjsue.R.flushNeeded();}}
    }
}
