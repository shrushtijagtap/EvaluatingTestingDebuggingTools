/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.Collections;

import junit.framework.TestCase;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;

public class JavaBeanSerializerTest2 extends TestCase {static class __CLR4_5_21s0p1s0plusyjuyt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,82991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21s0p1s0plusyjuyt.R.globalSliceStart(getClass().getName(),82969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21s0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s0p1s0plusyjuyt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s0p1s0plusyjuyt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82969,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21s0p() throws Exception{try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82969);
        __CLR4_5_21s0p1s0plusyjuyt.R.inc(82970);new JavaBeanSerializer(A.class, Collections.<String, String> emptyMap());
    }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

    public static class A {

        @JSONField(name = "uid")
        private int     id;
        private String  name;

        @JSONField(deserialize = false)
        private boolean b1;

        @JSONField(name = "B2")
        private boolean b2;

        private byte[]  bytes;

        public byte[] getBytes() {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82971);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82972);return bytes;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        public void setBytes(byte[] bytes) {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82973);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82974);this.bytes = bytes;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        public boolean isB2() {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82975);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82976);return b2;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        public void setB2(boolean b2) {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82977);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82978);this.b2 = b2;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        public boolean isB1() {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82979);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82980);return b1;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        public void setB1(boolean b1) {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82981);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82982);this.b1 = b1;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82983);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82984);return id;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82985);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82986);this.id = id;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        @JSONField(name = "xname")
        public String getName() {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82987);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82988);return name;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21s0p1s0plusyjuyt.R.inc(82989);
            __CLR4_5_21s0p1s0plusyjuyt.R.inc(82990);this.name = name;
        }finally{__CLR4_5_21s0p1s0plusyjuyt.R.flushNeeded();}}

    }
}
