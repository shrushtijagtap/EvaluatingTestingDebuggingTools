/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.Map;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Issue274 extends TestCase {static class __CLR4_1_1017ze17zeluszw9uh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,57024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test() throws Exception {__CLR4_1_1017ze17zeluszw9uh.R.globalSliceStart(getClass().getName(),57002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi4lt317ze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017ze17zeluszw9uh.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017ze17zeluszw9uh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue274.test",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57002,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi4lt317ze() throws Exception{try{__CLR4_1_1017ze17zeluszw9uh.R.inc(57002);
        __CLR4_1_1017ze17zeluszw9uh.R.inc(57003);Customer cus = new Customer();
        __CLR4_1_1017ze17zeluszw9uh.R.inc(57004);cus.setId(1L);
        __CLR4_1_1017ze17zeluszw9uh.R.inc(57005);cus.setName("name");

        __CLR4_1_1017ze17zeluszw9uh.R.inc(57006);Object json = JSON.toJSON(cus);
        __CLR4_1_1017ze17zeluszw9uh.R.inc(57007);System.out.println(json);

        __CLR4_1_1017ze17zeluszw9uh.R.inc(57008);String cusJson = json.toString();

        __CLR4_1_1017ze17zeluszw9uh.R.inc(57009);cusJson = "{\"name\":\"name\",\"id\":1}";

        __CLR4_1_1017ze17zeluszw9uh.R.inc(57010);Customer customer = JSON.parseObject(cusJson, Customer.class);

        __CLR4_1_1017ze17zeluszw9uh.R.inc(57011);System.out.println(customer);
    }finally{__CLR4_1_1017ze17zeluszw9uh.R.flushNeeded();}}

    public interface Indexable<ID extends Serializable> {

        public ID getId();

        public void setId(ID id);
    }

    public static class Customer implements Indexable<Long> {

        private Long   id;
        private String name;

        public Long getId() {try{__CLR4_1_1017ze17zeluszw9uh.R.inc(57012);
            __CLR4_1_1017ze17zeluszw9uh.R.inc(57013);return id;
        }finally{__CLR4_1_1017ze17zeluszw9uh.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_1017ze17zeluszw9uh.R.inc(57014);
            __CLR4_1_1017ze17zeluszw9uh.R.inc(57015);this.id = id;
        }finally{__CLR4_1_1017ze17zeluszw9uh.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1017ze17zeluszw9uh.R.inc(57016);
            __CLR4_1_1017ze17zeluszw9uh.R.inc(57017);return name;
        }finally{__CLR4_1_1017ze17zeluszw9uh.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1017ze17zeluszw9uh.R.inc(57018);
            __CLR4_1_1017ze17zeluszw9uh.R.inc(57019);this.name = name;
        }finally{__CLR4_1_1017ze17zeluszw9uh.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_1017ze17zeluszw9uh.R.inc(57020);
            __CLR4_1_1017ze17zeluszw9uh.R.inc(57021);return "Customer [id=" + id + ", name=" + name + "]";
        }finally{__CLR4_1_1017ze17zeluszw9uh.R.flushNeeded();}}

        // remove this to then no longer throw exception
        public Map<String, Object> toIndexMap() {try{__CLR4_1_1017ze17zeluszw9uh.R.inc(57022);

            __CLR4_1_1017ze17zeluszw9uh.R.inc(57023);return null;
        }finally{__CLR4_1_1017ze17zeluszw9uh.R.flushNeeded();}}

    }
}
