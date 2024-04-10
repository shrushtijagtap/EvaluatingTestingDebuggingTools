/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Bug_for_zhuel extends TestCase {static class __CLR4_1_10176r176rluszw9bx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,56147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_zhuel() throws Exception {__CLR4_1_10176r176rluszw9bx.R.globalSliceStart(getClass().getName(),55971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rbntzi176r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10176r176rluszw9bx.R.rethrow($CLV_t2$);}finally{__CLR4_1_10176r176rluszw9bx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhuel.test_for_zhuel",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rbntzi176r() throws Exception{try{__CLR4_1_10176r176rluszw9bx.R.inc(55971);
        __CLR4_1_10176r176rluszw9bx.R.inc(55972);Person[] ps = new Person[3];
        __CLR4_1_10176r176rluszw9bx.R.inc(55973);Person p1 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(55974);p1.setAge(50);
        __CLR4_1_10176r176rluszw9bx.R.inc(55975);p1.setHight("170");
        __CLR4_1_10176r176rluszw9bx.R.inc(55976);p1.setId("p1's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(55977);p1.setName("person1's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(55978);p1.setNames(new String[] { "p1's id", "person1's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(55979);p1.setSex("\u7537");
        __CLR4_1_10176r176rluszw9bx.R.inc(55980);Person p2 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(55981);p2.setAge(48);
        __CLR4_1_10176r176rluszw9bx.R.inc(55982);p2.setHight("155");
        __CLR4_1_10176r176rluszw9bx.R.inc(55983);p2.setId("p2's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(55984);p2.setName("person2's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(55985);p2.setNames(new String[] { "p2's id", "person2's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(55986);p2.setSex("\u5973");
        __CLR4_1_10176r176rluszw9bx.R.inc(55987);Person p3 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(55988);p3.setAge(10);
        __CLR4_1_10176r176rluszw9bx.R.inc(55989);p3.setHight("120");
        __CLR4_1_10176r176rluszw9bx.R.inc(55990);p3.setId("p3's id ");
        __CLR4_1_10176r176rluszw9bx.R.inc(55991);p3.setName("son's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(55992);p3.setNames(new String[] { "p3's id ", "son's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(55993);p3.setSex("\u7537");
        __CLR4_1_10176r176rluszw9bx.R.inc(55994);ps[0] = p1;
        __CLR4_1_10176r176rluszw9bx.R.inc(55995);ps[1] = p2;
        __CLR4_1_10176r176rluszw9bx.R.inc(55996);ps[2] = p3;

        __CLR4_1_10176r176rluszw9bx.R.inc(55997);Person[] ps1 = new Person[3];
        __CLR4_1_10176r176rluszw9bx.R.inc(55998);Person pp1 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(55999);pp1.setAge(52);
        __CLR4_1_10176r176rluszw9bx.R.inc(56000);pp1.setHight("170");
        __CLR4_1_10176r176rluszw9bx.R.inc(56001);pp1.setId("pp1's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56002);pp1.setName("personpp1's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(56003);pp1.setNames(new String[] { "pp1's id", "personpp1's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56004);pp1.setSex("\u7537");
        __CLR4_1_10176r176rluszw9bx.R.inc(56005);Person pp2 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(56006);pp2.setAge(49);
        __CLR4_1_10176r176rluszw9bx.R.inc(56007);pp2.setHight("150");
        __CLR4_1_10176r176rluszw9bx.R.inc(56008);pp2.setId("pp2's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56009);pp2.setName("personpp2's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(56010);pp2.setNames(new String[] { "pp2's id", "personpp2's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56011);pp2.setSex("\u5973");
        __CLR4_1_10176r176rluszw9bx.R.inc(56012);Person pp3 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(56013);pp3.setAge(10);
        __CLR4_1_10176r176rluszw9bx.R.inc(56014);pp3.setHight("125");
        __CLR4_1_10176r176rluszw9bx.R.inc(56015);pp3.setId("pp3's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56016);pp3.setName("daughter's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(56017);pp3.setNames(new String[] { "pp3's id", "daughter's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56018);pp3.setSex("\u5973");
        __CLR4_1_10176r176rluszw9bx.R.inc(56019);ps1[0] = pp1;
        __CLR4_1_10176r176rluszw9bx.R.inc(56020);ps1[1] = pp2;
        __CLR4_1_10176r176rluszw9bx.R.inc(56021);ps1[2] = pp3;

        __CLR4_1_10176r176rluszw9bx.R.inc(56022);Person[] ps2 = new Person[3];
        __CLR4_1_10176r176rluszw9bx.R.inc(56023);Person a1 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(56024);a1.setAge(52);
        __CLR4_1_10176r176rluszw9bx.R.inc(56025);a1.setHight("170");
        __CLR4_1_10176r176rluszw9bx.R.inc(56026);a1.setId("a1's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56027);a1.setName("a1's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(56028);a1.setNames(new String[] { "a1's id", "a1's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56029);a1.setSex("\u7537");
        __CLR4_1_10176r176rluszw9bx.R.inc(56030);Person a2 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(56031);a2.setAge(49);
        __CLR4_1_10176r176rluszw9bx.R.inc(56032);a2.setHight("150");
        __CLR4_1_10176r176rluszw9bx.R.inc(56033);a2.setId("a2's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56034);a2.setName("a2's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(56035);a2.setNames(new String[] { "a2's id", "a2's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56036);a2.setSex("\u5973");
        __CLR4_1_10176r176rluszw9bx.R.inc(56037);Person a3 = new Person();
        __CLR4_1_10176r176rluszw9bx.R.inc(56038);a3.setAge(10);
        __CLR4_1_10176r176rluszw9bx.R.inc(56039);a3.setHight("125");
        __CLR4_1_10176r176rluszw9bx.R.inc(56040);a3.setId("a3's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56041);a3.setName("daughter's name");
        __CLR4_1_10176r176rluszw9bx.R.inc(56042);a3.setNames(new String[] { "a3's id", "daughter's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56043);a3.setSex("\u5973");
        __CLR4_1_10176r176rluszw9bx.R.inc(56044);ps2[0] = a1;
        __CLR4_1_10176r176rluszw9bx.R.inc(56045);ps2[1] = a2;
        __CLR4_1_10176r176rluszw9bx.R.inc(56046);ps2[2] = a3;

        __CLR4_1_10176r176rluszw9bx.R.inc(56047);Family f1 = new Family();
        __CLR4_1_10176r176rluszw9bx.R.inc(56048);f1.setId("f1's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56049);f1.setAddress("f1's address");
        __CLR4_1_10176r176rluszw9bx.R.inc(56050);f1.setChildrennames(new String[] { "p1's name", "p2's name", "p3's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56051);f1.setIncome(100000000);
        __CLR4_1_10176r176rluszw9bx.R.inc(56052);f1.setMaster(p1);
        __CLR4_1_10176r176rluszw9bx.R.inc(56053);f1.setName("person1's home");
        __CLR4_1_10176r176rluszw9bx.R.inc(56054);f1.setPs(ps);
        __CLR4_1_10176r176rluszw9bx.R.inc(56055);f1.setTest(1994.08);

        __CLR4_1_10176r176rluszw9bx.R.inc(56056);Family f2 = new Family();
        __CLR4_1_10176r176rluszw9bx.R.inc(56057);f2.setId("f2's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56058);f2.setAddress("f2's address");
        __CLR4_1_10176r176rluszw9bx.R.inc(56059);f2.setChildrennames(new String[] { "pp1's name", "pp2's name", "pp3's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56060);f2.setIncome(100000000);
        __CLR4_1_10176r176rluszw9bx.R.inc(56061);f2.setMaster(pp1);
        __CLR4_1_10176r176rluszw9bx.R.inc(56062);f2.setName("personpp1's home");
        __CLR4_1_10176r176rluszw9bx.R.inc(56063);f2.setPs(ps1);
        __CLR4_1_10176r176rluszw9bx.R.inc(56064);Family f3 = new Family();
        __CLR4_1_10176r176rluszw9bx.R.inc(56065);f3.setId("f3's id");
        __CLR4_1_10176r176rluszw9bx.R.inc(56066);f3.setAddress("f3's address");
        __CLR4_1_10176r176rluszw9bx.R.inc(56067);f3.setChildrennames(new String[] { "a1's name", "a2's name", "a3's name" });
        __CLR4_1_10176r176rluszw9bx.R.inc(56068);f3.setIncome(100000000);
        __CLR4_1_10176r176rluszw9bx.R.inc(56069);f3.setMaster(a1);
        __CLR4_1_10176r176rluszw9bx.R.inc(56070);f3.setName("a1's home");
        __CLR4_1_10176r176rluszw9bx.R.inc(56071);f3.setPs(ps2);
        __CLR4_1_10176r176rluszw9bx.R.inc(56072);f3.setTest(1995.08);
        __CLR4_1_10176r176rluszw9bx.R.inc(56073);Family[] fs = new Family[3];
        __CLR4_1_10176r176rluszw9bx.R.inc(56074);fs[0] = f1;
        __CLR4_1_10176r176rluszw9bx.R.inc(56075);fs[1] = f2;
        __CLR4_1_10176r176rluszw9bx.R.inc(56076);fs[2] = f3;
        __CLR4_1_10176r176rluszw9bx.R.inc(56077);System.out.println(JSON.VERSION);
        __CLR4_1_10176r176rluszw9bx.R.inc(56078);String sfs = JSON.toJSONString(fs, true);

        __CLR4_1_10176r176rluszw9bx.R.inc(56079);Assert.assertSame(fs[0].getMaster(), fs[0].getPs()[0]);
        __CLR4_1_10176r176rluszw9bx.R.inc(56080);System.out.println(sfs);

        {
            __CLR4_1_10176r176rluszw9bx.R.inc(56081);Family[] result = JSON.parseObject(sfs, Family[].class);
            __CLR4_1_10176r176rluszw9bx.R.inc(56082);Assert.assertSame(result[0].getMaster(), result[0].getPs()[0]);
            __CLR4_1_10176r176rluszw9bx.R.inc(56083);Assert.assertSame(result[1].getMaster(), result[1].getPs()[0]);
            __CLR4_1_10176r176rluszw9bx.R.inc(56084);Assert.assertSame(result[2].getMaster(), result[2].getPs()[0]);
        }
        {
            __CLR4_1_10176r176rluszw9bx.R.inc(56085);JSONArray array = JSON.parseArray(sfs);
            __CLR4_1_10176r176rluszw9bx.R.inc(56086);for (int i = 0; (((i < array.size())&&(__CLR4_1_10176r176rluszw9bx.R.iget(56087)!=0|true))||(__CLR4_1_10176r176rluszw9bx.R.iget(56088)==0&false)); ++i) {{
                __CLR4_1_10176r176rluszw9bx.R.inc(56089);JSONObject jsonObj = array.getJSONObject(i);
                __CLR4_1_10176r176rluszw9bx.R.inc(56090);Assert.assertSame(jsonObj.get("master"), jsonObj.getJSONArray("ps").get(0));
            }
        }}
    }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

    public static class Family {

        private String   id;
        private String   name;
        private Person[] ps;
        private String   address;
        private String[] childrennames;
        private Person   master;
        private long     income;
        private double   test;

        public String getId() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56091);
            __CLR4_1_10176r176rluszw9bx.R.inc(56092);return id;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56093);
            __CLR4_1_10176r176rluszw9bx.R.inc(56094);this.id = id;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56095);
            __CLR4_1_10176r176rluszw9bx.R.inc(56096);return name;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56097);
            __CLR4_1_10176r176rluszw9bx.R.inc(56098);this.name = name;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public Person[] getPs() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56099);
            __CLR4_1_10176r176rluszw9bx.R.inc(56100);return ps;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setPs(Person[] ps) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56101);
            __CLR4_1_10176r176rluszw9bx.R.inc(56102);this.ps = ps;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public String getAddress() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56103);
            __CLR4_1_10176r176rluszw9bx.R.inc(56104);return address;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setAddress(String address) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56105);
            __CLR4_1_10176r176rluszw9bx.R.inc(56106);this.address = address;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public String[] getChildrennames() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56107);
            __CLR4_1_10176r176rluszw9bx.R.inc(56108);return childrennames;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setChildrennames(String[] childrennames) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56109);
            __CLR4_1_10176r176rluszw9bx.R.inc(56110);this.childrennames = childrennames;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public Person getMaster() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56111);
            __CLR4_1_10176r176rluszw9bx.R.inc(56112);return master;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setMaster(Person master) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56113);
            __CLR4_1_10176r176rluszw9bx.R.inc(56114);this.master = master;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public long getIncome() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56115);
            __CLR4_1_10176r176rluszw9bx.R.inc(56116);return income;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setIncome(long income) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56117);
            __CLR4_1_10176r176rluszw9bx.R.inc(56118);this.income = income;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public double getTest() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56119);
            __CLR4_1_10176r176rluszw9bx.R.inc(56120);return test;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setTest(double test) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56121);
            __CLR4_1_10176r176rluszw9bx.R.inc(56122);this.test = test;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}
    }

    public static class Person {

        private String   id;
        private String   name;
        private String   sex;
        private int      age;
        private String[] names;
        private String   hight;

        public String getId() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56123);
            __CLR4_1_10176r176rluszw9bx.R.inc(56124);return id;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56125);
            __CLR4_1_10176r176rluszw9bx.R.inc(56126);this.id = id;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56127);
            __CLR4_1_10176r176rluszw9bx.R.inc(56128);return name;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56129);
            __CLR4_1_10176r176rluszw9bx.R.inc(56130);this.name = name;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public String getSex() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56131);
            __CLR4_1_10176r176rluszw9bx.R.inc(56132);return sex;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setSex(String sex) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56133);
            __CLR4_1_10176r176rluszw9bx.R.inc(56134);this.sex = sex;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56135);
            __CLR4_1_10176r176rluszw9bx.R.inc(56136);return age;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56137);
            __CLR4_1_10176r176rluszw9bx.R.inc(56138);this.age = age;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public String[] getNames() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56139);
            __CLR4_1_10176r176rluszw9bx.R.inc(56140);return names;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setNames(String[] names) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56141);
            __CLR4_1_10176r176rluszw9bx.R.inc(56142);this.names = names;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public String getHight() {try{__CLR4_1_10176r176rluszw9bx.R.inc(56143);
            __CLR4_1_10176r176rluszw9bx.R.inc(56144);return hight;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

        public void setHight(String hight) {try{__CLR4_1_10176r176rluszw9bx.R.inc(56145);
            __CLR4_1_10176r176rluszw9bx.R.inc(56146);this.hight = hight;
        }finally{__CLR4_1_10176r176rluszw9bx.R.flushNeeded();}}

    }

}
