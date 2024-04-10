/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.common.collect.ImmutableMap;
import junit.framework.TestCase;

import java.io.Serializable;

public class Issue1458 extends TestCase {static class __CLR4_1_101bgf1bgfluszwar6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,61532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101bgf1bgfluszwar6.R.globalSliceStart(getClass().getName(),61503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1bgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101bgf1bgfluszwar6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101bgf1bgfluszwar6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1458.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61503,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1bgf() throws Exception{try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61503);
        __CLR4_1_101bgf1bgfluszwar6.R.inc(61504);HostPoint hostPoint = new HostPoint(new HostAddress("192.168.10.101"));
        __CLR4_1_101bgf1bgfluszwar6.R.inc(61505);hostPoint.setFingerprint(new Fingerprint("abc"));

        __CLR4_1_101bgf1bgfluszwar6.R.inc(61506);String json = JSON.toJSONString(hostPoint);

        __CLR4_1_101bgf1bgfluszwar6.R.inc(61507);HostPoint hostPoint1 = JSON.parseObject(json, HostPoint.class);
        __CLR4_1_101bgf1bgfluszwar6.R.inc(61508);String json1 = JSON.toJSONString(hostPoint1);
        __CLR4_1_101bgf1bgfluszwar6.R.inc(61509);assertEquals(json, json1);
    }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

    public static class HostPoint implements Serializable {

        private final HostAddress address;

        @JSONField(name = "fingerprint")
        private Fingerprint fingerprint;

        @JSONField(name = "unkown")
        private boolean unkown;

        // ------------------------------------------------------------------------

        @JSONCreator
        public HostPoint(@JSONField(name = "address") HostAddress addr) {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61510);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61511);this.address = addr;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

        public boolean isChanged() {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61512);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61513);return false;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

        public boolean isMatched() {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61514);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61515);return false;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}


        public HostAddress getAddress() {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61516);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61517);return address;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

        public Fingerprint getFingerprint() {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61518);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61519);return fingerprint;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

        public void setFingerprint(Fingerprint fingerprint) {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61520);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61521);this.fingerprint = fingerprint;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

        public boolean isUnkown() {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61522);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61523);return unkown;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

        public void setUnkown(boolean unkown) {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61524);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61525);this.unkown = unkown;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

    }

    public static class Fingerprint implements Serializable {
        private final String source;

        private ImmutableMap<String, String> probes;

        @JSONCreator
        public Fingerprint(@JSONField(name = "source") String fingerprint) {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61526);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61527);this.source = fingerprint;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}


        public String getSource() {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61528);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61529);return source;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}

    }

    public static class HostAddress {
        public final String hostAddress;

        public HostAddress(String hostAddress) {try{__CLR4_1_101bgf1bgfluszwar6.R.inc(61530);
            __CLR4_1_101bgf1bgfluszwar6.R.inc(61531);this.hostAddress = hostAddress;
        }finally{__CLR4_1_101bgf1bgfluszwar6.R.flushNeeded();}}
    }
}
