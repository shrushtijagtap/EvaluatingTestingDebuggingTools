/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class GenericTest4 extends TestCase {static class __CLR4_5_21njh1njhlusvneso{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,77194,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21njh1njhlusvneso.R.globalSliceStart(getClass().getName(),77165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21njh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21njh1njhlusvneso.R.rethrow($CLV_t2$);}finally{__CLR4_5_21njh1njhlusvneso.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.generic.GenericTest4.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21njh() throws Exception{try{__CLR4_5_21njh1njhlusvneso.R.inc(77165);
        __CLR4_5_21njh1njhlusvneso.R.inc(77166);String text;
        {
            __CLR4_5_21njh1njhlusvneso.R.inc(77167);User user = new User("Z\u53cb\u7fa4");
            __CLR4_5_21njh1njhlusvneso.R.inc(77168);user.getAddresses().add(new Address("\u6ee8\u6c5f"));
            __CLR4_5_21njh1njhlusvneso.R.inc(77169);text = JSON.toJSONString(user);
        }
        
        __CLR4_5_21njh1njhlusvneso.R.inc(77170);System.out.println(text);
        
        __CLR4_5_21njh1njhlusvneso.R.inc(77171);User user = JSON.parseObject(text, User.class);
        
        __CLR4_5_21njh1njhlusvneso.R.inc(77172);Assert.assertEquals("Z\u53cb\u7fa4", user.getName());
        __CLR4_5_21njh1njhlusvneso.R.inc(77173);Assert.assertEquals(1, user.getAddresses().size());
        __CLR4_5_21njh1njhlusvneso.R.inc(77174);Assert.assertEquals(Address.class, user.getAddresses().get(0).getClass());
        __CLR4_5_21njh1njhlusvneso.R.inc(77175);Assert.assertEquals("\u6ee8\u6c5f", user.getAddresses().get(0).getValue());
    }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

    public static class User {

        private String name;

        public User(){try{__CLR4_5_21njh1njhlusvneso.R.inc(77176);

        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

        public User(String name){try{__CLR4_5_21njh1njhlusvneso.R.inc(77177);
            __CLR4_5_21njh1njhlusvneso.R.inc(77178);this.name = name;
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21njh1njhlusvneso.R.inc(77179);
            __CLR4_5_21njh1njhlusvneso.R.inc(77180);return name;
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21njh1njhlusvneso.R.inc(77181);
            __CLR4_5_21njh1njhlusvneso.R.inc(77182);this.name = name;
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

        private List<Address> addresses = new ArrayList<Address>();

        public List<Address> getAddresses() {try{__CLR4_5_21njh1njhlusvneso.R.inc(77183);
            __CLR4_5_21njh1njhlusvneso.R.inc(77184);return addresses;
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

        public void setAddresses(List<Address> addresses) {try{__CLR4_5_21njh1njhlusvneso.R.inc(77185);
            __CLR4_5_21njh1njhlusvneso.R.inc(77186);this.addresses = addresses;
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

    }

    public static class Address {

        private String value;

        public Address(){try{__CLR4_5_21njh1njhlusvneso.R.inc(77187);
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

        public Address(String value){try{__CLR4_5_21njh1njhlusvneso.R.inc(77188);
            __CLR4_5_21njh1njhlusvneso.R.inc(77189);this.value = value;
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

        public String getValue() {try{__CLR4_5_21njh1njhlusvneso.R.inc(77190);
            __CLR4_5_21njh1njhlusvneso.R.inc(77191);return value;
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_21njh1njhlusvneso.R.inc(77192);
            __CLR4_5_21njh1njhlusvneso.R.inc(77193);this.value = value;
        }finally{__CLR4_5_21njh1njhlusvneso.R.flushNeeded();}}

    }
}
