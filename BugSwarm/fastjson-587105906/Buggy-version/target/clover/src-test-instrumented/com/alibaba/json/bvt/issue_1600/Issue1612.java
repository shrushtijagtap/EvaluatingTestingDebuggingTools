/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.junit.Test;

/**
 * <p>Title: Issue1612</p>
 * <p>Description: </p>
 *
 * @author Victor
 * @version 1.0
 * @since 2017/11/27
 */
public class Issue1612 {public static class __CLR4_1_101bxp1bxplusqka7p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,62132,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void test() {try{__CLR4_1_101bxp1bxplusqka7p.R.inc(62125);

        __CLR4_1_101bxp1bxplusqka7p.R.inc(62126);RegResponse<User> userRegResponse = testFastJson(User.class);

        __CLR4_1_101bxp1bxplusqka7p.R.inc(62127);User user = userRegResponse.getResult();
        __CLR4_1_101bxp1bxplusqka7p.R.inc(62128);System.out.println(user);

    }finally{__CLR4_1_101bxp1bxplusqka7p.R.flushNeeded();}}

    public static <T> RegResponse<T> testFastJson(Class<T> clasz) {try{__CLR4_1_101bxp1bxplusqka7p.R.inc(62129);

        //\u628abody\u89e3\u6790\u6210\u4e00\u4e2a\u5bf9\u8c61
        __CLR4_1_101bxp1bxplusqka7p.R.inc(62130);String body = "{\"retCode\":\"200\", \"result\":{\"name\":\"Zhangsan\",\"password\":\"123\"}}";

        __CLR4_1_101bxp1bxplusqka7p.R.inc(62131);return JSON.parseObject(body, new TypeReference<RegResponse<T>>(clasz) {});
    }finally{__CLR4_1_101bxp1bxplusqka7p.R.flushNeeded();}}
}

class RegResponse<T> {public static class __CLR4_1_101bxp1bxwlusqka7p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,62146,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String retCode;
    private String retDesc;
    private T result;

    public String getRetCode() {try{__CLR4_1_101bxp1bxwlusqka7p.R.inc(62132);
        __CLR4_1_101bxp1bxwlusqka7p.R.inc(62133);return retCode;
    }finally{__CLR4_1_101bxp1bxwlusqka7p.R.flushNeeded();}}

    public void setRetCode(String retCode) {try{__CLR4_1_101bxp1bxwlusqka7p.R.inc(62134);
        __CLR4_1_101bxp1bxwlusqka7p.R.inc(62135);this.retCode = retCode;
    }finally{__CLR4_1_101bxp1bxwlusqka7p.R.flushNeeded();}}

    public String getRetDesc() {try{__CLR4_1_101bxp1bxwlusqka7p.R.inc(62136);
        __CLR4_1_101bxp1bxwlusqka7p.R.inc(62137);return retDesc;
    }finally{__CLR4_1_101bxp1bxwlusqka7p.R.flushNeeded();}}

    public void setRetDesc(String retDesc) {try{__CLR4_1_101bxp1bxwlusqka7p.R.inc(62138);
        __CLR4_1_101bxp1bxwlusqka7p.R.inc(62139);this.retDesc = retDesc;
    }finally{__CLR4_1_101bxp1bxwlusqka7p.R.flushNeeded();}}

    public T getResult() {try{__CLR4_1_101bxp1bxwlusqka7p.R.inc(62140);
        __CLR4_1_101bxp1bxwlusqka7p.R.inc(62141);return result;
    }finally{__CLR4_1_101bxp1bxwlusqka7p.R.flushNeeded();}}

    public void setResult(T result) {try{__CLR4_1_101bxp1bxwlusqka7p.R.inc(62142);
        __CLR4_1_101bxp1bxwlusqka7p.R.inc(62143);this.result = result;
    }finally{__CLR4_1_101bxp1bxwlusqka7p.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_1_101bxp1bxwlusqka7p.R.inc(62144);
        __CLR4_1_101bxp1bxwlusqka7p.R.inc(62145);return "RegResponse{" +
                "retCode='" + retCode + '\'' +
                ", retDesc='" + retDesc + '\'' +
                ", result=" + result +
                '}';
    }finally{__CLR4_1_101bxp1bxwlusqka7p.R.flushNeeded();}}
}

class User {public static class __CLR4_1_101bxp1byalusqka7p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,62160,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public User(){try{__CLR4_1_101bxp1byalusqka7p.R.inc(62146);}finally{__CLR4_1_101bxp1byalusqka7p.R.flushNeeded();}}
    public User(String username, String password) {try{__CLR4_1_101bxp1byalusqka7p.R.inc(62147);
        __CLR4_1_101bxp1byalusqka7p.R.inc(62148);this.username = username;
        __CLR4_1_101bxp1byalusqka7p.R.inc(62149);this.password = password;
    }finally{__CLR4_1_101bxp1byalusqka7p.R.flushNeeded();}}

    private String username;
    private String password;

    public String getUsername() {try{__CLR4_1_101bxp1byalusqka7p.R.inc(62150);
        __CLR4_1_101bxp1byalusqka7p.R.inc(62151);return username;
    }finally{__CLR4_1_101bxp1byalusqka7p.R.flushNeeded();}}

    public void setUsername(String username) {try{__CLR4_1_101bxp1byalusqka7p.R.inc(62152);
        __CLR4_1_101bxp1byalusqka7p.R.inc(62153);this.username = username;
    }finally{__CLR4_1_101bxp1byalusqka7p.R.flushNeeded();}}

    public String getPassword() {try{__CLR4_1_101bxp1byalusqka7p.R.inc(62154);
        __CLR4_1_101bxp1byalusqka7p.R.inc(62155);return password;
    }finally{__CLR4_1_101bxp1byalusqka7p.R.flushNeeded();}}

    public void setPassword(String password) {try{__CLR4_1_101bxp1byalusqka7p.R.inc(62156);
        __CLR4_1_101bxp1byalusqka7p.R.inc(62157);this.password = password;
    }finally{__CLR4_1_101bxp1byalusqka7p.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_1_101bxp1byalusqka7p.R.inc(62158);
        __CLR4_1_101bxp1byalusqka7p.R.inc(62159);return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }finally{__CLR4_1_101bxp1byalusqka7p.R.flushNeeded();}}
}
