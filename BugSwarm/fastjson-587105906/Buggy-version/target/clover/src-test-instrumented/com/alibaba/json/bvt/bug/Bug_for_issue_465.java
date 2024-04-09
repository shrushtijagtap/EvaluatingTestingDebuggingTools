/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class Bug_for_issue_465 extends TestCase {static class __CLR4_1_1014kr14krlusqk32e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,52637,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_1014kr14krlusqk32e.R.globalSliceStart(getClass().getName(),52587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb14kr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014kr14krlusqk32e.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014kr14krlusqk32e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_465.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52587,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb14kr() throws Exception{try{__CLR4_1_1014kr14krlusqk32e.R.inc(52587);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52588);String json = "[\"abc\",\"efg\",\"sss\",[1,2]]";
        
        __CLR4_1_1014kr14krlusqk32e.R.inc(52589);TestBean testBean = JSON.parseObject(json, TestBean.class);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52590);Assert.assertEquals("abc", testBean.name);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52591);Assert.assertEquals("efg", testBean.country);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52592);Assert.assertEquals("sss", testBean.password);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52593);Assert.assertEquals(2, testBean.location.length);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52594);Assert.assertEquals(1, testBean.location[0]);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52595);Assert.assertEquals(2, testBean.location[1]);
    }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}
    
    public void f_test_for_issue_private() throws Exception {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52596);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52597);String json = "[\"abc\",\"efg\",\"sss\",[1,2]]";
        
        __CLR4_1_1014kr14krlusqk32e.R.inc(52598);TestBean1 testBean = JSON.parseObject(json, TestBean1.class);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52599);Assert.assertEquals("abc", testBean.name);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52600);Assert.assertEquals("efg", testBean.country);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52601);Assert.assertEquals("sss", testBean.password);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52602);Assert.assertEquals(2, testBean.location.length);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52603);Assert.assertEquals(1, testBean.location[0]);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52604);Assert.assertEquals(2, testBean.location[1]);
    }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}
    
    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    public static class TestBean {
      private String name;

      private String password;

      private String country;

      private int[] location;

      public String getName() {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52605);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52606);return name;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      @JSONField(ordinal = 0)
      public void setName(String name) {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52607);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52608);this.name = name;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      public String getPassword() {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52609);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52610);return password;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      @JSONField(ordinal = 2)
      public void setPassword(String password) {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52611);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52612);this.password = password;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      public String getCountry() {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52613);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52614);return country;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      @JSONField(ordinal = 1)
      public void setCountry(String country) {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52615);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52616);this.country = country;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      public int[] getLocation() {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52617);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52618);return location;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      @JSONField(ordinal = 3)
      public void setLocation(int[] location) {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52619);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52620);this.location = location;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}
    }
    
    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    private static class TestBean1 {
      private String name;

      private String password;

      private String country;

      private int[] location;

      public String getName() {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52621);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52622);return name;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      @JSONField(ordinal = 0)
      public void setName(String name) {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52623);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52624);this.name = name;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      public String getPassword() {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52625);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52626);return password;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      @JSONField(ordinal = 2)
      public void setPassword(String password) {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52627);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52628);this.password = password;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      public String getCountry() {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52629);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52630);return country;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      @JSONField(ordinal = 1)
      public void setCountry(String country) {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52631);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52632);this.country = country;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      public int[] getLocation() {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52633);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52634);return location;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}

      @JSONField(ordinal = 3)
      public void setLocation(int[] location) {try{__CLR4_1_1014kr14krlusqk32e.R.inc(52635);
        __CLR4_1_1014kr14krlusqk32e.R.inc(52636);this.location = location;
      }finally{__CLR4_1_1014kr14krlusqk32e.R.flushNeeded();}}
    }
}
