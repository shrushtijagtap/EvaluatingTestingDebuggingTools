/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_wtusmchen extends TestCase {static class __CLR4_5_216ro16rolusvn7aj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_216ro16rolusvn7aj.R.globalSliceStart(getClass().getName(),55428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp216ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ro16rolusvn7aj.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ro16rolusvn7aj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_wtusmchen.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp216ro() throws Exception{try{__CLR4_5_216ro16rolusvn7aj.R.inc(55428);
        __CLR4_5_216ro16rolusvn7aj.R.inc(55429);List<User> users = new ArrayList<User>();
        __CLR4_5_216ro16rolusvn7aj.R.inc(55430);users.add(new User());
        __CLR4_5_216ro16rolusvn7aj.R.inc(55431);users.add(new User());

        __CLR4_5_216ro16rolusvn7aj.R.inc(55432);String text = JSON.toJSONString(users);
        __CLR4_5_216ro16rolusvn7aj.R.inc(55433);System.out.println(text);
        
        __CLR4_5_216ro16rolusvn7aj.R.inc(55434);List<User> users2 = JSON.parseArray(text, User.class);
    }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

    public static class User implements Serializable {

        private String user_id = "aaaa";
        Date           bri;
        Timestamp      bri2;
        Double         num;
        List           list;

        public String getUser_id() {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55435);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55436);return user_id;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public void setUser_id(String user_id) {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55437);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55438);this.user_id = user_id;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public Date getBri() {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55439);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55440);return bri;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public void setBri(Date bri) {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55441);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55442);this.bri = bri;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public Timestamp getBri2() {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55443);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55444);return bri2;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public void setBri2(Timestamp bri2) {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55445);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55446);this.bri2 = bri2;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public Double getNum() {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55447);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55448);return num;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public void setNum(Double num) {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55449);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55450);this.num = num;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public List getList() {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55451);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55452);return list;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

        public void setList(List list) {try{__CLR4_5_216ro16rolusvn7aj.R.inc(55453);
            __CLR4_5_216ro16rolusvn7aj.R.inc(55454);this.list = list;
        }finally{__CLR4_5_216ro16rolusvn7aj.R.flushNeeded();}}

    }
}
