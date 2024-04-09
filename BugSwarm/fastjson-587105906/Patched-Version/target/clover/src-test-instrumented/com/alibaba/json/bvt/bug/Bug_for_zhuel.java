/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Bug_for_zhuel extends TestCase {static class __CLR4_5_2176g176glusvn7jl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56136,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_zhuel() throws Exception {__CLR4_5_2176g176glusvn7jl.R.globalSliceStart(getClass().getName(),55960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbntzi176g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2176g176glusvn7jl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2176g176glusvn7jl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhuel.test_for_zhuel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55960,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbntzi176g() throws Exception{try{__CLR4_5_2176g176glusvn7jl.R.inc(55960);
        __CLR4_5_2176g176glusvn7jl.R.inc(55961);Person[] ps = new Person[3];
        __CLR4_5_2176g176glusvn7jl.R.inc(55962);Person p1 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(55963);p1.setAge(50);
        __CLR4_5_2176g176glusvn7jl.R.inc(55964);p1.setHight("170");
        __CLR4_5_2176g176glusvn7jl.R.inc(55965);p1.setId("p1's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(55966);p1.setName("person1's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(55967);p1.setNames(new String[] { "p1's id", "person1's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(55968);p1.setSex("\u7537");
        __CLR4_5_2176g176glusvn7jl.R.inc(55969);Person p2 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(55970);p2.setAge(48);
        __CLR4_5_2176g176glusvn7jl.R.inc(55971);p2.setHight("155");
        __CLR4_5_2176g176glusvn7jl.R.inc(55972);p2.setId("p2's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(55973);p2.setName("person2's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(55974);p2.setNames(new String[] { "p2's id", "person2's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(55975);p2.setSex("\u5973");
        __CLR4_5_2176g176glusvn7jl.R.inc(55976);Person p3 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(55977);p3.setAge(10);
        __CLR4_5_2176g176glusvn7jl.R.inc(55978);p3.setHight("120");
        __CLR4_5_2176g176glusvn7jl.R.inc(55979);p3.setId("p3's id ");
        __CLR4_5_2176g176glusvn7jl.R.inc(55980);p3.setName("son's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(55981);p3.setNames(new String[] { "p3's id ", "son's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(55982);p3.setSex("\u7537");
        __CLR4_5_2176g176glusvn7jl.R.inc(55983);ps[0] = p1;
        __CLR4_5_2176g176glusvn7jl.R.inc(55984);ps[1] = p2;
        __CLR4_5_2176g176glusvn7jl.R.inc(55985);ps[2] = p3;

        __CLR4_5_2176g176glusvn7jl.R.inc(55986);Person[] ps1 = new Person[3];
        __CLR4_5_2176g176glusvn7jl.R.inc(55987);Person pp1 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(55988);pp1.setAge(52);
        __CLR4_5_2176g176glusvn7jl.R.inc(55989);pp1.setHight("170");
        __CLR4_5_2176g176glusvn7jl.R.inc(55990);pp1.setId("pp1's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(55991);pp1.setName("personpp1's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(55992);pp1.setNames(new String[] { "pp1's id", "personpp1's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(55993);pp1.setSex("\u7537");
        __CLR4_5_2176g176glusvn7jl.R.inc(55994);Person pp2 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(55995);pp2.setAge(49);
        __CLR4_5_2176g176glusvn7jl.R.inc(55996);pp2.setHight("150");
        __CLR4_5_2176g176glusvn7jl.R.inc(55997);pp2.setId("pp2's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(55998);pp2.setName("personpp2's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(55999);pp2.setNames(new String[] { "pp2's id", "personpp2's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(56000);pp2.setSex("\u5973");
        __CLR4_5_2176g176glusvn7jl.R.inc(56001);Person pp3 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(56002);pp3.setAge(10);
        __CLR4_5_2176g176glusvn7jl.R.inc(56003);pp3.setHight("125");
        __CLR4_5_2176g176glusvn7jl.R.inc(56004);pp3.setId("pp3's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(56005);pp3.setName("daughter's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(56006);pp3.setNames(new String[] { "pp3's id", "daughter's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(56007);pp3.setSex("\u5973");
        __CLR4_5_2176g176glusvn7jl.R.inc(56008);ps1[0] = pp1;
        __CLR4_5_2176g176glusvn7jl.R.inc(56009);ps1[1] = pp2;
        __CLR4_5_2176g176glusvn7jl.R.inc(56010);ps1[2] = pp3;

        __CLR4_5_2176g176glusvn7jl.R.inc(56011);Person[] ps2 = new Person[3];
        __CLR4_5_2176g176glusvn7jl.R.inc(56012);Person a1 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(56013);a1.setAge(52);
        __CLR4_5_2176g176glusvn7jl.R.inc(56014);a1.setHight("170");
        __CLR4_5_2176g176glusvn7jl.R.inc(56015);a1.setId("a1's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(56016);a1.setName("a1's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(56017);a1.setNames(new String[] { "a1's id", "a1's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(56018);a1.setSex("\u7537");
        __CLR4_5_2176g176glusvn7jl.R.inc(56019);Person a2 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(56020);a2.setAge(49);
        __CLR4_5_2176g176glusvn7jl.R.inc(56021);a2.setHight("150");
        __CLR4_5_2176g176glusvn7jl.R.inc(56022);a2.setId("a2's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(56023);a2.setName("a2's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(56024);a2.setNames(new String[] { "a2's id", "a2's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(56025);a2.setSex("\u5973");
        __CLR4_5_2176g176glusvn7jl.R.inc(56026);Person a3 = new Person();
        __CLR4_5_2176g176glusvn7jl.R.inc(56027);a3.setAge(10);
        __CLR4_5_2176g176glusvn7jl.R.inc(56028);a3.setHight("125");
        __CLR4_5_2176g176glusvn7jl.R.inc(56029);a3.setId("a3's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(56030);a3.setName("daughter's name");
        __CLR4_5_2176g176glusvn7jl.R.inc(56031);a3.setNames(new String[] { "a3's id", "daughter's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(56032);a3.setSex("\u5973");
        __CLR4_5_2176g176glusvn7jl.R.inc(56033);ps2[0] = a1;
        __CLR4_5_2176g176glusvn7jl.R.inc(56034);ps2[1] = a2;
        __CLR4_5_2176g176glusvn7jl.R.inc(56035);ps2[2] = a3;

        __CLR4_5_2176g176glusvn7jl.R.inc(56036);Family f1 = new Family();
        __CLR4_5_2176g176glusvn7jl.R.inc(56037);f1.setId("f1's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(56038);f1.setAddress("f1's address");
        __CLR4_5_2176g176glusvn7jl.R.inc(56039);f1.setChildrennames(new String[] { "p1's name", "p2's name", "p3's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(56040);f1.setIncome(100000000);
        __CLR4_5_2176g176glusvn7jl.R.inc(56041);f1.setMaster(p1);
        __CLR4_5_2176g176glusvn7jl.R.inc(56042);f1.setName("person1's home");
        __CLR4_5_2176g176glusvn7jl.R.inc(56043);f1.setPs(ps);
        __CLR4_5_2176g176glusvn7jl.R.inc(56044);f1.setTest(1994.08);

        __CLR4_5_2176g176glusvn7jl.R.inc(56045);Family f2 = new Family();
        __CLR4_5_2176g176glusvn7jl.R.inc(56046);f2.setId("f2's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(56047);f2.setAddress("f2's address");
        __CLR4_5_2176g176glusvn7jl.R.inc(56048);f2.setChildrennames(new String[] { "pp1's name", "pp2's name", "pp3's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(56049);f2.setIncome(100000000);
        __CLR4_5_2176g176glusvn7jl.R.inc(56050);f2.setMaster(pp1);
        __CLR4_5_2176g176glusvn7jl.R.inc(56051);f2.setName("personpp1's home");
        __CLR4_5_2176g176glusvn7jl.R.inc(56052);f2.setPs(ps1);
        __CLR4_5_2176g176glusvn7jl.R.inc(56053);Family f3 = new Family();
        __CLR4_5_2176g176glusvn7jl.R.inc(56054);f3.setId("f3's id");
        __CLR4_5_2176g176glusvn7jl.R.inc(56055);f3.setAddress("f3's address");
        __CLR4_5_2176g176glusvn7jl.R.inc(56056);f3.setChildrennames(new String[] { "a1's name", "a2's name", "a3's name" });
        __CLR4_5_2176g176glusvn7jl.R.inc(56057);f3.setIncome(100000000);
        __CLR4_5_2176g176glusvn7jl.R.inc(56058);f3.setMaster(a1);
        __CLR4_5_2176g176glusvn7jl.R.inc(56059);f3.setName("a1's home");
        __CLR4_5_2176g176glusvn7jl.R.inc(56060);f3.setPs(ps2);
        __CLR4_5_2176g176glusvn7jl.R.inc(56061);f3.setTest(1995.08);
        __CLR4_5_2176g176glusvn7jl.R.inc(56062);Family[] fs = new Family[3];
        __CLR4_5_2176g176glusvn7jl.R.inc(56063);fs[0] = f1;
        __CLR4_5_2176g176glusvn7jl.R.inc(56064);fs[1] = f2;
        __CLR4_5_2176g176glusvn7jl.R.inc(56065);fs[2] = f3;
        __CLR4_5_2176g176glusvn7jl.R.inc(56066);System.out.println(JSON.VERSION);
        __CLR4_5_2176g176glusvn7jl.R.inc(56067);String sfs = JSON.toJSONString(fs, true);

        __CLR4_5_2176g176glusvn7jl.R.inc(56068);Assert.assertSame(fs[0].getMaster(), fs[0].getPs()[0]);
        __CLR4_5_2176g176glusvn7jl.R.inc(56069);System.out.println(sfs);

        {
            __CLR4_5_2176g176glusvn7jl.R.inc(56070);Family[] result = JSON.parseObject(sfs, Family[].class);
            __CLR4_5_2176g176glusvn7jl.R.inc(56071);Assert.assertSame(result[0].getMaster(), result[0].getPs()[0]);
            __CLR4_5_2176g176glusvn7jl.R.inc(56072);Assert.assertSame(result[1].getMaster(), result[1].getPs()[0]);
            __CLR4_5_2176g176glusvn7jl.R.inc(56073);Assert.assertSame(result[2].getMaster(), result[2].getPs()[0]);
        }
        {
            __CLR4_5_2176g176glusvn7jl.R.inc(56074);JSONArray array = JSON.parseArray(sfs);
            __CLR4_5_2176g176glusvn7jl.R.inc(56075);for (int i = 0; (((i < array.size())&&(__CLR4_5_2176g176glusvn7jl.R.iget(56076)!=0|true))||(__CLR4_5_2176g176glusvn7jl.R.iget(56077)==0&false)); ++i) {{
                __CLR4_5_2176g176glusvn7jl.R.inc(56078);JSONObject jsonObj = array.getJSONObject(i);
                __CLR4_5_2176g176glusvn7jl.R.inc(56079);Assert.assertSame(jsonObj.get("master"), jsonObj.getJSONArray("ps").get(0));
            }
        }}
    }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

    public static class Family {

        private String   id;
        private String   name;
        private Person[] ps;
        private String   address;
        private String[] childrennames;
        private Person   master;
        private long     income;
        private double   test;

        public String getId() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56080);
            __CLR4_5_2176g176glusvn7jl.R.inc(56081);return id;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56082);
            __CLR4_5_2176g176glusvn7jl.R.inc(56083);this.id = id;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56084);
            __CLR4_5_2176g176glusvn7jl.R.inc(56085);return name;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56086);
            __CLR4_5_2176g176glusvn7jl.R.inc(56087);this.name = name;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public Person[] getPs() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56088);
            __CLR4_5_2176g176glusvn7jl.R.inc(56089);return ps;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setPs(Person[] ps) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56090);
            __CLR4_5_2176g176glusvn7jl.R.inc(56091);this.ps = ps;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public String getAddress() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56092);
            __CLR4_5_2176g176glusvn7jl.R.inc(56093);return address;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setAddress(String address) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56094);
            __CLR4_5_2176g176glusvn7jl.R.inc(56095);this.address = address;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public String[] getChildrennames() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56096);
            __CLR4_5_2176g176glusvn7jl.R.inc(56097);return childrennames;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setChildrennames(String[] childrennames) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56098);
            __CLR4_5_2176g176glusvn7jl.R.inc(56099);this.childrennames = childrennames;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public Person getMaster() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56100);
            __CLR4_5_2176g176glusvn7jl.R.inc(56101);return master;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setMaster(Person master) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56102);
            __CLR4_5_2176g176glusvn7jl.R.inc(56103);this.master = master;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public long getIncome() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56104);
            __CLR4_5_2176g176glusvn7jl.R.inc(56105);return income;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setIncome(long income) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56106);
            __CLR4_5_2176g176glusvn7jl.R.inc(56107);this.income = income;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public double getTest() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56108);
            __CLR4_5_2176g176glusvn7jl.R.inc(56109);return test;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setTest(double test) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56110);
            __CLR4_5_2176g176glusvn7jl.R.inc(56111);this.test = test;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}
    }

    public static class Person {

        private String   id;
        private String   name;
        private String   sex;
        private int      age;
        private String[] names;
        private String   hight;

        public String getId() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56112);
            __CLR4_5_2176g176glusvn7jl.R.inc(56113);return id;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56114);
            __CLR4_5_2176g176glusvn7jl.R.inc(56115);this.id = id;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56116);
            __CLR4_5_2176g176glusvn7jl.R.inc(56117);return name;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56118);
            __CLR4_5_2176g176glusvn7jl.R.inc(56119);this.name = name;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public String getSex() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56120);
            __CLR4_5_2176g176glusvn7jl.R.inc(56121);return sex;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setSex(String sex) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56122);
            __CLR4_5_2176g176glusvn7jl.R.inc(56123);this.sex = sex;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56124);
            __CLR4_5_2176g176glusvn7jl.R.inc(56125);return age;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56126);
            __CLR4_5_2176g176glusvn7jl.R.inc(56127);this.age = age;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public String[] getNames() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56128);
            __CLR4_5_2176g176glusvn7jl.R.inc(56129);return names;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setNames(String[] names) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56130);
            __CLR4_5_2176g176glusvn7jl.R.inc(56131);this.names = names;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public String getHight() {try{__CLR4_5_2176g176glusvn7jl.R.inc(56132);
            __CLR4_5_2176g176glusvn7jl.R.inc(56133);return hight;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

        public void setHight(String hight) {try{__CLR4_5_2176g176glusvn7jl.R.inc(56134);
            __CLR4_5_2176g176glusvn7jl.R.inc(56135);this.hight = hight;
        }finally{__CLR4_5_2176g176glusvn7jl.R.flushNeeded();}}

    }

}
