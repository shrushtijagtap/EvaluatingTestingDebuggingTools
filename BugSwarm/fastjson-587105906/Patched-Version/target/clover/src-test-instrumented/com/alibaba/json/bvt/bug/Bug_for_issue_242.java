/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_issue_242 extends TestCase {static class __CLR4_5_2141k141klusyjrkt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,51945,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_true() throws Exception {__CLR4_5_2141k141klusyjrkt.R.globalSliceStart(getClass().getName(),51896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zgwum6141k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2141k141klusyjrkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2141k141klusyjrkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_242.test_true",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zgwum6141k() throws Exception{try{__CLR4_5_2141k141klusyjrkt.R.inc(51896);
        __CLR4_5_2141k141klusyjrkt.R.inc(51897);final String text = "{int1:\"NULL\",int2:\"null\",long1:NULL,long2:null, dou1:\"NULL\",dou2:\"null\",str1:\"NULL\",str2:NULL, bool2:\"NULL\",bool1:null}";
        __CLR4_5_2141k141klusyjrkt.R.inc(51898);VO vo = JSON.parseObject(text, VO.class);

        __CLR4_5_2141k141klusyjrkt.R.inc(51899);System.out.println(vo);
    }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

    public static class VO {

        public int     int1;
        public int     int2;
        public long    long1;
        public long    long2;
        public double  dou1;
        public double  dou2;
        public boolean bool1;
        public boolean bool2;
        public String  str1;
        public String  str2;

        public VO(){try{__CLR4_5_2141k141klusyjrkt.R.inc(51900);

        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51901);
            __CLR4_5_2141k141klusyjrkt.R.inc(51902);StringBuffer sb = new StringBuffer();
            __CLR4_5_2141k141klusyjrkt.R.inc(51903);sb.append("int1 = ").append(int1)//
            .append(" int2 = ").append(int2)//
            .append(" long1 = ").append(long1)//
            .append(" long2 = ").append(long2)//
            .append(" dou1 = ").append(dou1)//
            .append(" dou2 = ").append(dou2)//
            .append(" bool1 = ").append(bool1)//
            .append(" bool2 = ").append(bool2)//
            .append(" str1 = ").append(str2)//
            .append(" str2 = ").append(str2);
            __CLR4_5_2141k141klusyjrkt.R.inc(51904);return sb.toString();
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public int getInt1() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51905);
            __CLR4_5_2141k141klusyjrkt.R.inc(51906);return int1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setInt1(int int1) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51907);
            __CLR4_5_2141k141klusyjrkt.R.inc(51908);this.int1 = int1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public int getInt2() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51909);
            __CLR4_5_2141k141klusyjrkt.R.inc(51910);return int2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setInt2(int int2) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51911);
            __CLR4_5_2141k141klusyjrkt.R.inc(51912);this.int2 = int2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public long getLong1() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51913);
            __CLR4_5_2141k141klusyjrkt.R.inc(51914);return long1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setLong1(long long1) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51915);
            __CLR4_5_2141k141klusyjrkt.R.inc(51916);this.long1 = long1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public long getLong2() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51917);
            __CLR4_5_2141k141klusyjrkt.R.inc(51918);return long2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setLong2(long long2) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51919);
            __CLR4_5_2141k141klusyjrkt.R.inc(51920);this.long2 = long2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public double getDou1() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51921);
            __CLR4_5_2141k141klusyjrkt.R.inc(51922);return dou1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setDou1(double dou1) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51923);
            __CLR4_5_2141k141klusyjrkt.R.inc(51924);this.dou1 = dou1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public double getDou2() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51925);
            __CLR4_5_2141k141klusyjrkt.R.inc(51926);return dou2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setDou2(double dou2) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51927);
            __CLR4_5_2141k141klusyjrkt.R.inc(51928);this.dou2 = dou2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public boolean isBool1() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51929);
            __CLR4_5_2141k141klusyjrkt.R.inc(51930);return bool1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setBool1(boolean bool1) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51931);
            __CLR4_5_2141k141klusyjrkt.R.inc(51932);this.bool1 = bool1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public boolean isBool2() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51933);
            __CLR4_5_2141k141klusyjrkt.R.inc(51934);return bool2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setBool2(boolean bool2) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51935);
            __CLR4_5_2141k141klusyjrkt.R.inc(51936);this.bool2 = bool2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public String getStr1() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51937);
            __CLR4_5_2141k141klusyjrkt.R.inc(51938);return str1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setStr1(String str1) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51939);
            __CLR4_5_2141k141klusyjrkt.R.inc(51940);this.str1 = str1;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public String getStr2() {try{__CLR4_5_2141k141klusyjrkt.R.inc(51941);
            __CLR4_5_2141k141klusyjrkt.R.inc(51942);return str2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

        public void setStr2(String str2) {try{__CLR4_5_2141k141klusyjrkt.R.inc(51943);
            __CLR4_5_2141k141klusyjrkt.R.inc(51944);this.str2 = str2;
        }finally{__CLR4_5_2141k141klusyjrkt.R.flushNeeded();}}

    }
}
