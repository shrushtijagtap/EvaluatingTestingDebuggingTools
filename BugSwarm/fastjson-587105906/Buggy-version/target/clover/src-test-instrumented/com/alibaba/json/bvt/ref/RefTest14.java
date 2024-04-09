/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.ref;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class RefTest14 extends TestCase {static class __CLR4_1_101q471q47lusqkj08{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,80553,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101q471q47lusqkj08.R.globalSliceStart(getClass().getName(),80503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21q47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q471q47lusqkj08.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q471q47lusqkj08.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest14.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80503,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21q47() throws Exception{try{__CLR4_1_101q471q47lusqkj08.R.inc(80503);
        __CLR4_1_101q471q47lusqkj08.R.inc(80504);Group admin = new Group("admin");

        __CLR4_1_101q471q47lusqkj08.R.inc(80505);User jobs = new User("jobs");
        __CLR4_1_101q471q47lusqkj08.R.inc(80506);User sager = new User("sager");
        __CLR4_1_101q471q47lusqkj08.R.inc(80507);User sdh5724 = new User("sdh5724");

        __CLR4_1_101q471q47lusqkj08.R.inc(80508);admin.getMembers().add(jobs);
        __CLR4_1_101q471q47lusqkj08.R.inc(80509);jobs.getGroups().add(admin);

        __CLR4_1_101q471q47lusqkj08.R.inc(80510);admin.getMembers().add(sager);
        __CLR4_1_101q471q47lusqkj08.R.inc(80511);sager.getGroups().add(admin);

        __CLR4_1_101q471q47lusqkj08.R.inc(80512);admin.getMembers().add(sdh5724);
        __CLR4_1_101q471q47lusqkj08.R.inc(80513);sdh5724.getGroups().add(admin);
        
        __CLR4_1_101q471q47lusqkj08.R.inc(80514);sager.setReportTo(sdh5724);
        __CLR4_1_101q471q47lusqkj08.R.inc(80515);jobs.setReportTo(sdh5724);

        __CLR4_1_101q471q47lusqkj08.R.inc(80516);SerializeConfig serializeConfig = new SerializeConfig();
        __CLR4_1_101q471q47lusqkj08.R.inc(80517);serializeConfig.setAsmEnable(false);
        __CLR4_1_101q471q47lusqkj08.R.inc(80518);String text = JSON.toJSONString(admin, serializeConfig, SerializerFeature.PrettyFormat);
        __CLR4_1_101q471q47lusqkj08.R.inc(80519);System.out.println(text);
        
        __CLR4_1_101q471q47lusqkj08.R.inc(80520);ParserConfig config = new ParserConfig();
        __CLR4_1_101q471q47lusqkj08.R.inc(80521);config.setAsmEnable(false);
        
        __CLR4_1_101q471q47lusqkj08.R.inc(80522);JSON.parseObject(text, Group.class, config, 0);
    }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

    public static class Group {

        private String     name;

        private List<User> members = new ArrayList<User>();

        public Group(){try{__CLR4_1_101q471q47lusqkj08.R.inc(80523);

        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public Group(String name){try{__CLR4_1_101q471q47lusqkj08.R.inc(80524);
            __CLR4_1_101q471q47lusqkj08.R.inc(80525);this.name = name;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101q471q47lusqkj08.R.inc(80526);
            __CLR4_1_101q471q47lusqkj08.R.inc(80527);return name;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101q471q47lusqkj08.R.inc(80528);
            __CLR4_1_101q471q47lusqkj08.R.inc(80529);this.name = name;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public List<User> getMembers() {try{__CLR4_1_101q471q47lusqkj08.R.inc(80530);
            __CLR4_1_101q471q47lusqkj08.R.inc(80531);return members;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public void setMembers(List<User> members) {try{__CLR4_1_101q471q47lusqkj08.R.inc(80532);
            __CLR4_1_101q471q47lusqkj08.R.inc(80533);this.members = members;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public String toString() {try{__CLR4_1_101q471q47lusqkj08.R.inc(80534);
            __CLR4_1_101q471q47lusqkj08.R.inc(80535);return this.name;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}
    }

    public static class User {

        private String      name;

        private List<Group> groups = new ArrayList<Group>();

        private User        reportTo;

        public User(){try{__CLR4_1_101q471q47lusqkj08.R.inc(80536);

        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public User getReportTo() {try{__CLR4_1_101q471q47lusqkj08.R.inc(80537);
            __CLR4_1_101q471q47lusqkj08.R.inc(80538);return reportTo;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public void setReportTo(User reportTo) {try{__CLR4_1_101q471q47lusqkj08.R.inc(80539);
            __CLR4_1_101q471q47lusqkj08.R.inc(80540);this.reportTo = reportTo;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public User(String name){try{__CLR4_1_101q471q47lusqkj08.R.inc(80541);
            __CLR4_1_101q471q47lusqkj08.R.inc(80542);this.name = name;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101q471q47lusqkj08.R.inc(80543);
            __CLR4_1_101q471q47lusqkj08.R.inc(80544);return name;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101q471q47lusqkj08.R.inc(80545);
            __CLR4_1_101q471q47lusqkj08.R.inc(80546);this.name = name;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public List<Group> getGroups() {try{__CLR4_1_101q471q47lusqkj08.R.inc(80547);
            __CLR4_1_101q471q47lusqkj08.R.inc(80548);return groups;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public void setGroups(List<Group> groups) {try{__CLR4_1_101q471q47lusqkj08.R.inc(80549);
            __CLR4_1_101q471q47lusqkj08.R.inc(80550);this.groups = groups;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}

        public String toString() {try{__CLR4_1_101q471q47lusqkj08.R.inc(80551);
            __CLR4_1_101q471q47lusqkj08.R.inc(80552);return this.name;
        }finally{__CLR4_1_101q471q47lusqkj08.R.flushNeeded();}}
    }
}
