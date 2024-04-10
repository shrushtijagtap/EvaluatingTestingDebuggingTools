/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.knowissue;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

public class Bug_for_loveflying extends TestCase {static class __CLR4_5_2271h271hlusyjx18{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,102480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_loveflying() throws Exception {__CLR4_5_2271h271hlusyjx18.R.globalSliceStart(getClass().getName(),102437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nxaevf271h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2271h271hlusyjx18.R.rethrow($CLV_t2$);}finally{__CLR4_5_2271h271hlusyjx18.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.knowissue.Bug_for_loveflying.test_for_loveflying",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),102437,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nxaevf271h() throws Exception{try{__CLR4_5_2271h271hlusyjx18.R.inc(102437);
        __CLR4_5_2271h271hlusyjx18.R.inc(102438);User user = new User();
        __CLR4_5_2271h271hlusyjx18.R.inc(102439);user.setId(1l);
        __CLR4_5_2271h271hlusyjx18.R.inc(102440);user.setName("loveflying");
        __CLR4_5_2271h271hlusyjx18.R.inc(102441);user.setCreateTime(new java.sql.Timestamp(new Date().getTime()));

        __CLR4_5_2271h271hlusyjx18.R.inc(102442);UserLog userLog = new UserLog();
        __CLR4_5_2271h271hlusyjx18.R.inc(102443);userLog.setId(1l);
        __CLR4_5_2271h271hlusyjx18.R.inc(102444);userLog.setUser(user);
        __CLR4_5_2271h271hlusyjx18.R.inc(102445);user.getUserLogs().add(userLog);

        __CLR4_5_2271h271hlusyjx18.R.inc(102446);userLog = new UserLog();
        __CLR4_5_2271h271hlusyjx18.R.inc(102447);userLog.setId(2l);
        __CLR4_5_2271h271hlusyjx18.R.inc(102448);userLog.setUser(user);
        __CLR4_5_2271h271hlusyjx18.R.inc(102449);user.getUserLogs().add(userLog);

        __CLR4_5_2271h271hlusyjx18.R.inc(102450);SerializeConfig mapping = new SerializeConfig();

        __CLR4_5_2271h271hlusyjx18.R.inc(102451);mapping.put(java.sql.Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_2271h271hlusyjx18.R.inc(102452);mapping.put(java.sql.Timestamp.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
        // mapping.put(User.class, new JavaBeanSerializer(User.class,
        // Collections.singletonMap("id", "uid")));

        __CLR4_5_2271h271hlusyjx18.R.inc(102453);JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
        __CLR4_5_2271h271hlusyjx18.R.inc(102454);jsonObject.put("ext", "\u65b0\u52a0\u7684\u5c5e\u6027");
        __CLR4_5_2271h271hlusyjx18.R.inc(102455);System.out.println(jsonObject.toJSONString(jsonObject, mapping));
    }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

    public static class UserLog {

        private Long           id;

        private transient User user;

        public Long getId() {try{__CLR4_5_2271h271hlusyjx18.R.inc(102456);
            __CLR4_5_2271h271hlusyjx18.R.inc(102457);return id;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_2271h271hlusyjx18.R.inc(102458);
            __CLR4_5_2271h271hlusyjx18.R.inc(102459);this.id = id;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public User getUser() {try{__CLR4_5_2271h271hlusyjx18.R.inc(102460);
            __CLR4_5_2271h271hlusyjx18.R.inc(102461);return user;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public void setUser(User user) {try{__CLR4_5_2271h271hlusyjx18.R.inc(102462);
            __CLR4_5_2271h271hlusyjx18.R.inc(102463);this.user = user;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

    }

    public static class User {

        private Long               id;

        private String             name;

        private java.sql.Timestamp createTime;

        private Set<UserLog>       userLogs = new HashSet<UserLog>();

        public Long getId() {try{__CLR4_5_2271h271hlusyjx18.R.inc(102464);
            __CLR4_5_2271h271hlusyjx18.R.inc(102465);return id;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_2271h271hlusyjx18.R.inc(102466);
            __CLR4_5_2271h271hlusyjx18.R.inc(102467);this.id = id;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2271h271hlusyjx18.R.inc(102468);
            __CLR4_5_2271h271hlusyjx18.R.inc(102469);return name;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2271h271hlusyjx18.R.inc(102470);
            __CLR4_5_2271h271hlusyjx18.R.inc(102471);this.name = name;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public java.sql.Timestamp getCreateTime() {try{__CLR4_5_2271h271hlusyjx18.R.inc(102472);
            __CLR4_5_2271h271hlusyjx18.R.inc(102473);return createTime;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public void setCreateTime(java.sql.Timestamp createTime) {try{__CLR4_5_2271h271hlusyjx18.R.inc(102474);
            __CLR4_5_2271h271hlusyjx18.R.inc(102475);this.createTime = createTime;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public Set<UserLog> getUserLogs() {try{__CLR4_5_2271h271hlusyjx18.R.inc(102476);
            __CLR4_5_2271h271hlusyjx18.R.inc(102477);return userLogs;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

        public void setUserLogs(Set<UserLog> userLogs) {try{__CLR4_5_2271h271hlusyjx18.R.inc(102478);
            __CLR4_5_2271h271hlusyjx18.R.inc(102479);this.userLogs = userLogs;
        }finally{__CLR4_5_2271h271hlusyjx18.R.flushNeeded();}}

    }
}
