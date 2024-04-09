/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.knowissue;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

public class Bug_for_loveflying extends TestCase {static class __CLR4_5_227zp27zplusvnl9d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,103712,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_loveflying() throws Exception {__CLR4_5_227zp27zplusvnl9d.R.globalSliceStart(getClass().getName(),103669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nxaevf27zp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_227zp27zplusvnl9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_227zp27zplusvnl9d.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.knowissue.Bug_for_loveflying.test_for_loveflying",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),103669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nxaevf27zp() throws Exception{try{__CLR4_5_227zp27zplusvnl9d.R.inc(103669);
        __CLR4_5_227zp27zplusvnl9d.R.inc(103670);User user = new User();
        __CLR4_5_227zp27zplusvnl9d.R.inc(103671);user.setId(1l);
        __CLR4_5_227zp27zplusvnl9d.R.inc(103672);user.setName("loveflying");
        __CLR4_5_227zp27zplusvnl9d.R.inc(103673);user.setCreateTime(new java.sql.Timestamp(new Date().getTime()));

        __CLR4_5_227zp27zplusvnl9d.R.inc(103674);UserLog userLog = new UserLog();
        __CLR4_5_227zp27zplusvnl9d.R.inc(103675);userLog.setId(1l);
        __CLR4_5_227zp27zplusvnl9d.R.inc(103676);userLog.setUser(user);
        __CLR4_5_227zp27zplusvnl9d.R.inc(103677);user.getUserLogs().add(userLog);

        __CLR4_5_227zp27zplusvnl9d.R.inc(103678);userLog = new UserLog();
        __CLR4_5_227zp27zplusvnl9d.R.inc(103679);userLog.setId(2l);
        __CLR4_5_227zp27zplusvnl9d.R.inc(103680);userLog.setUser(user);
        __CLR4_5_227zp27zplusvnl9d.R.inc(103681);user.getUserLogs().add(userLog);

        __CLR4_5_227zp27zplusvnl9d.R.inc(103682);SerializeConfig mapping = new SerializeConfig();

        __CLR4_5_227zp27zplusvnl9d.R.inc(103683);mapping.put(java.sql.Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_227zp27zplusvnl9d.R.inc(103684);mapping.put(java.sql.Timestamp.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
        // mapping.put(User.class, new JavaBeanSerializer(User.class,
        // Collections.singletonMap("id", "uid")));

        __CLR4_5_227zp27zplusvnl9d.R.inc(103685);JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
        __CLR4_5_227zp27zplusvnl9d.R.inc(103686);jsonObject.put("ext", "\u65b0\u52a0\u7684\u5c5e\u6027");
        __CLR4_5_227zp27zplusvnl9d.R.inc(103687);System.out.println(jsonObject.toJSONString(jsonObject, mapping));
    }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

    public static class UserLog {

        private Long           id;

        private transient User user;

        public Long getId() {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103688);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103689);return id;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103690);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103691);this.id = id;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public User getUser() {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103692);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103693);return user;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public void setUser(User user) {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103694);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103695);this.user = user;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

    }

    public static class User {

        private Long               id;

        private String             name;

        private java.sql.Timestamp createTime;

        private Set<UserLog>       userLogs = new HashSet<UserLog>();

        public Long getId() {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103696);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103697);return id;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103698);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103699);this.id = id;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103700);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103701);return name;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103702);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103703);this.name = name;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public java.sql.Timestamp getCreateTime() {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103704);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103705);return createTime;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public void setCreateTime(java.sql.Timestamp createTime) {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103706);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103707);this.createTime = createTime;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public Set<UserLog> getUserLogs() {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103708);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103709);return userLogs;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

        public void setUserLogs(Set<UserLog> userLogs) {try{__CLR4_5_227zp27zplusvnl9d.R.inc(103710);
            __CLR4_5_227zp27zplusvnl9d.R.inc(103711);this.userLogs = userLogs;
        }finally{__CLR4_5_227zp27zplusvnl9d.R.flushNeeded();}}

    }
}
