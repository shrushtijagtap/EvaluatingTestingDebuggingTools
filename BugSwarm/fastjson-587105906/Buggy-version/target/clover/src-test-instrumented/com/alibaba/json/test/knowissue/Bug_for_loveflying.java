/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.knowissue;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

public class Bug_for_loveflying extends TestCase {static class __CLR4_1_1028002800luszwior{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,103723,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_loveflying() throws Exception {__CLR4_1_1028002800luszwior.R.globalSliceStart(getClass().getName(),103680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nxaevf2800();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1028002800luszwior.R.rethrow($CLV_t2$);}finally{__CLR4_1_1028002800luszwior.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.knowissue.Bug_for_loveflying.test_for_loveflying",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),103680,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nxaevf2800() throws Exception{try{__CLR4_1_1028002800luszwior.R.inc(103680);
        __CLR4_1_1028002800luszwior.R.inc(103681);User user = new User();
        __CLR4_1_1028002800luszwior.R.inc(103682);user.setId(1l);
        __CLR4_1_1028002800luszwior.R.inc(103683);user.setName("loveflying");
        __CLR4_1_1028002800luszwior.R.inc(103684);user.setCreateTime(new java.sql.Timestamp(new Date().getTime()));

        __CLR4_1_1028002800luszwior.R.inc(103685);UserLog userLog = new UserLog();
        __CLR4_1_1028002800luszwior.R.inc(103686);userLog.setId(1l);
        __CLR4_1_1028002800luszwior.R.inc(103687);userLog.setUser(user);
        __CLR4_1_1028002800luszwior.R.inc(103688);user.getUserLogs().add(userLog);

        __CLR4_1_1028002800luszwior.R.inc(103689);userLog = new UserLog();
        __CLR4_1_1028002800luszwior.R.inc(103690);userLog.setId(2l);
        __CLR4_1_1028002800luszwior.R.inc(103691);userLog.setUser(user);
        __CLR4_1_1028002800luszwior.R.inc(103692);user.getUserLogs().add(userLog);

        __CLR4_1_1028002800luszwior.R.inc(103693);SerializeConfig mapping = new SerializeConfig();

        __CLR4_1_1028002800luszwior.R.inc(103694);mapping.put(java.sql.Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_1_1028002800luszwior.R.inc(103695);mapping.put(java.sql.Timestamp.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
        // mapping.put(User.class, new JavaBeanSerializer(User.class,
        // Collections.singletonMap("id", "uid")));

        __CLR4_1_1028002800luszwior.R.inc(103696);JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
        __CLR4_1_1028002800luszwior.R.inc(103697);jsonObject.put("ext", "\u65b0\u52a0\u7684\u5c5e\u6027");
        __CLR4_1_1028002800luszwior.R.inc(103698);System.out.println(jsonObject.toJSONString(jsonObject, mapping));
    }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

    public static class UserLog {

        private Long           id;

        private transient User user;

        public Long getId() {try{__CLR4_1_1028002800luszwior.R.inc(103699);
            __CLR4_1_1028002800luszwior.R.inc(103700);return id;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_1028002800luszwior.R.inc(103701);
            __CLR4_1_1028002800luszwior.R.inc(103702);this.id = id;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public User getUser() {try{__CLR4_1_1028002800luszwior.R.inc(103703);
            __CLR4_1_1028002800luszwior.R.inc(103704);return user;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public void setUser(User user) {try{__CLR4_1_1028002800luszwior.R.inc(103705);
            __CLR4_1_1028002800luszwior.R.inc(103706);this.user = user;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

    }

    public static class User {

        private Long               id;

        private String             name;

        private java.sql.Timestamp createTime;

        private Set<UserLog>       userLogs = new HashSet<UserLog>();

        public Long getId() {try{__CLR4_1_1028002800luszwior.R.inc(103707);
            __CLR4_1_1028002800luszwior.R.inc(103708);return id;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_1028002800luszwior.R.inc(103709);
            __CLR4_1_1028002800luszwior.R.inc(103710);this.id = id;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1028002800luszwior.R.inc(103711);
            __CLR4_1_1028002800luszwior.R.inc(103712);return name;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1028002800luszwior.R.inc(103713);
            __CLR4_1_1028002800luszwior.R.inc(103714);this.name = name;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public java.sql.Timestamp getCreateTime() {try{__CLR4_1_1028002800luszwior.R.inc(103715);
            __CLR4_1_1028002800luszwior.R.inc(103716);return createTime;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public void setCreateTime(java.sql.Timestamp createTime) {try{__CLR4_1_1028002800luszwior.R.inc(103717);
            __CLR4_1_1028002800luszwior.R.inc(103718);this.createTime = createTime;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public Set<UserLog> getUserLogs() {try{__CLR4_1_1028002800luszwior.R.inc(103719);
            __CLR4_1_1028002800luszwior.R.inc(103720);return userLogs;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

        public void setUserLogs(Set<UserLog> userLogs) {try{__CLR4_1_1028002800luszwior.R.inc(103721);
            __CLR4_1_1028002800luszwior.R.inc(103722);this.userLogs = userLogs;
        }finally{__CLR4_1_1028002800luszwior.R.flushNeeded();}}

    }
}
