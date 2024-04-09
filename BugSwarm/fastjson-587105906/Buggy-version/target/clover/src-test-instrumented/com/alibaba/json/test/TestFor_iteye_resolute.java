/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import java.io.Serializable;
import java.util.ArrayList;

import junit.framework.TestCase;

import org.apache.commons.lang.SerializationUtils;

import com.alibaba.fastjson.JSON;

public class TestFor_iteye_resolute extends TestCase {static class __CLR4_1_1021v621v6lusqkrpt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,95777,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int SIZE       = 1000;

    private static final int LOOP_COUNT = 1000 * 10;
    
    public void test_perf() {__CLR4_1_1021v621v6lusqkrpt.R.globalSliceStart(getClass().getName(),95730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t12wvx21v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021v621v6lusqkrpt.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021v621v6lusqkrpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestFor_iteye_resolute.test_perf",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95730,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t12wvx21v6(){try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95730);
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95731);for (int i = 0; (((i < 10)&&(__CLR4_1_1021v621v6lusqkrpt.R.iget(95732)!=0|true))||(__CLR4_1_1021v621v6lusqkrpt.R.iget(95733)==0&false)); ++i) {{
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95734);json();
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95735);javaSer();
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95736);System.out.println();
        }
    }}finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

    public void json() {try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95737);
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95738);long begin = System.currentTimeMillis();
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95739);int length = 0;
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95740);for (int i = 0; (((i < LOOP_COUNT)&&(__CLR4_1_1021v621v6lusqkrpt.R.iget(95741)!=0|true))||(__CLR4_1_1021v621v6lusqkrpt.R.iget(95742)==0&false)); ++i) {{
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95743);String json = JSON.toJSONString(mkTestDates(SIZE));
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95744);length = json.length();
        }
        }__CLR4_1_1021v621v6lusqkrpt.R.inc(95745);long time = System.currentTimeMillis() - begin;
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95746);System.out.println("json time " + time + ", len " + length);
        
    }finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

    public void javaSer() {try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95747);
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95748);long begin = System.currentTimeMillis();
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95749);int length = 0;
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95750);for (int i = 0; (((i < LOOP_COUNT)&&(__CLR4_1_1021v621v6lusqkrpt.R.iget(95751)!=0|true))||(__CLR4_1_1021v621v6lusqkrpt.R.iget(95752)==0&false)); ++i) {{
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95753);byte[] bytes = SerializationUtils.serialize(mkTestDates(SIZE));
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95754);length = bytes.length;
        }
        
        }__CLR4_1_1021v621v6lusqkrpt.R.inc(95755);long time = System.currentTimeMillis() - begin;
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95756);System.out.println("java time " + time + ", len " + length);
    }finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

    public ArrayList<User> mkTestDates(int count) {try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95757);
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95758);ArrayList<User> users = new ArrayList<User>();
        __CLR4_1_1021v621v6lusqkrpt.R.inc(95759);for (int i = 0; (((i < count)&&(__CLR4_1_1021v621v6lusqkrpt.R.iget(95760)!=0|true))||(__CLR4_1_1021v621v6lusqkrpt.R.iget(95761)==0&false)); i++) {{
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95762);User user = new User(i);
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95763);user.setName("xxxxxxxxxxxxxxxxxxxxxx");
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95764);users.add(user);
        }
        }__CLR4_1_1021v621v6lusqkrpt.R.inc(95765);return users;
    }finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

    public static class User implements Serializable {

        private static final long serialVersionUID = 1L;
        private int               id;
        private String            name;

        public User(int id){
            super();__CLR4_1_1021v621v6lusqkrpt.R.inc(95767);try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95766);
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95768);this.id = id;
        }finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95769);
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95770);return id;
        }finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95771);
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95772);this.id = id;
        }finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95773);
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95774);return name;
        }finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1021v621v6lusqkrpt.R.inc(95775);
            __CLR4_1_1021v621v6lusqkrpt.R.inc(95776);this.name = name;
        }finally{__CLR4_1_1021v621v6lusqkrpt.R.flushNeeded();}}

    }

}
