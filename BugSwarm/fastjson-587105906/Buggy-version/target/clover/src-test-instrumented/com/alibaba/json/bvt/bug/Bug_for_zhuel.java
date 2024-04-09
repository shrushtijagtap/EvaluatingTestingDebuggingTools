/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Bug_for_zhuel extends TestCase {static class __CLR4_1_10168j168jlusqk63n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,54915,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_zhuel() throws Exception {__CLR4_1_10168j168jlusqk63n.R.globalSliceStart(getClass().getName(),54739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rbntzi168j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10168j168jlusqk63n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10168j168jlusqk63n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhuel.test_for_zhuel",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),54739,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rbntzi168j() throws Exception{try{__CLR4_1_10168j168jlusqk63n.R.inc(54739);
        __CLR4_1_10168j168jlusqk63n.R.inc(54740);Person[] ps = new Person[3];
        __CLR4_1_10168j168jlusqk63n.R.inc(54741);Person p1 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54742);p1.setAge(50);
        __CLR4_1_10168j168jlusqk63n.R.inc(54743);p1.setHight("170");
        __CLR4_1_10168j168jlusqk63n.R.inc(54744);p1.setId("p1's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54745);p1.setName("person1's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54746);p1.setNames(new String[] { "p1's id", "person1's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54747);p1.setSex("\u7537");
        __CLR4_1_10168j168jlusqk63n.R.inc(54748);Person p2 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54749);p2.setAge(48);
        __CLR4_1_10168j168jlusqk63n.R.inc(54750);p2.setHight("155");
        __CLR4_1_10168j168jlusqk63n.R.inc(54751);p2.setId("p2's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54752);p2.setName("person2's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54753);p2.setNames(new String[] { "p2's id", "person2's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54754);p2.setSex("\u5973");
        __CLR4_1_10168j168jlusqk63n.R.inc(54755);Person p3 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54756);p3.setAge(10);
        __CLR4_1_10168j168jlusqk63n.R.inc(54757);p3.setHight("120");
        __CLR4_1_10168j168jlusqk63n.R.inc(54758);p3.setId("p3's id ");
        __CLR4_1_10168j168jlusqk63n.R.inc(54759);p3.setName("son's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54760);p3.setNames(new String[] { "p3's id ", "son's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54761);p3.setSex("\u7537");
        __CLR4_1_10168j168jlusqk63n.R.inc(54762);ps[0] = p1;
        __CLR4_1_10168j168jlusqk63n.R.inc(54763);ps[1] = p2;
        __CLR4_1_10168j168jlusqk63n.R.inc(54764);ps[2] = p3;

        __CLR4_1_10168j168jlusqk63n.R.inc(54765);Person[] ps1 = new Person[3];
        __CLR4_1_10168j168jlusqk63n.R.inc(54766);Person pp1 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54767);pp1.setAge(52);
        __CLR4_1_10168j168jlusqk63n.R.inc(54768);pp1.setHight("170");
        __CLR4_1_10168j168jlusqk63n.R.inc(54769);pp1.setId("pp1's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54770);pp1.setName("personpp1's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54771);pp1.setNames(new String[] { "pp1's id", "personpp1's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54772);pp1.setSex("\u7537");
        __CLR4_1_10168j168jlusqk63n.R.inc(54773);Person pp2 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54774);pp2.setAge(49);
        __CLR4_1_10168j168jlusqk63n.R.inc(54775);pp2.setHight("150");
        __CLR4_1_10168j168jlusqk63n.R.inc(54776);pp2.setId("pp2's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54777);pp2.setName("personpp2's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54778);pp2.setNames(new String[] { "pp2's id", "personpp2's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54779);pp2.setSex("\u5973");
        __CLR4_1_10168j168jlusqk63n.R.inc(54780);Person pp3 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54781);pp3.setAge(10);
        __CLR4_1_10168j168jlusqk63n.R.inc(54782);pp3.setHight("125");
        __CLR4_1_10168j168jlusqk63n.R.inc(54783);pp3.setId("pp3's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54784);pp3.setName("daughter's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54785);pp3.setNames(new String[] { "pp3's id", "daughter's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54786);pp3.setSex("\u5973");
        __CLR4_1_10168j168jlusqk63n.R.inc(54787);ps1[0] = pp1;
        __CLR4_1_10168j168jlusqk63n.R.inc(54788);ps1[1] = pp2;
        __CLR4_1_10168j168jlusqk63n.R.inc(54789);ps1[2] = pp3;

        __CLR4_1_10168j168jlusqk63n.R.inc(54790);Person[] ps2 = new Person[3];
        __CLR4_1_10168j168jlusqk63n.R.inc(54791);Person a1 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54792);a1.setAge(52);
        __CLR4_1_10168j168jlusqk63n.R.inc(54793);a1.setHight("170");
        __CLR4_1_10168j168jlusqk63n.R.inc(54794);a1.setId("a1's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54795);a1.setName("a1's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54796);a1.setNames(new String[] { "a1's id", "a1's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54797);a1.setSex("\u7537");
        __CLR4_1_10168j168jlusqk63n.R.inc(54798);Person a2 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54799);a2.setAge(49);
        __CLR4_1_10168j168jlusqk63n.R.inc(54800);a2.setHight("150");
        __CLR4_1_10168j168jlusqk63n.R.inc(54801);a2.setId("a2's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54802);a2.setName("a2's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54803);a2.setNames(new String[] { "a2's id", "a2's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54804);a2.setSex("\u5973");
        __CLR4_1_10168j168jlusqk63n.R.inc(54805);Person a3 = new Person();
        __CLR4_1_10168j168jlusqk63n.R.inc(54806);a3.setAge(10);
        __CLR4_1_10168j168jlusqk63n.R.inc(54807);a3.setHight("125");
        __CLR4_1_10168j168jlusqk63n.R.inc(54808);a3.setId("a3's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54809);a3.setName("daughter's name");
        __CLR4_1_10168j168jlusqk63n.R.inc(54810);a3.setNames(new String[] { "a3's id", "daughter's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54811);a3.setSex("\u5973");
        __CLR4_1_10168j168jlusqk63n.R.inc(54812);ps2[0] = a1;
        __CLR4_1_10168j168jlusqk63n.R.inc(54813);ps2[1] = a2;
        __CLR4_1_10168j168jlusqk63n.R.inc(54814);ps2[2] = a3;

        __CLR4_1_10168j168jlusqk63n.R.inc(54815);Family f1 = new Family();
        __CLR4_1_10168j168jlusqk63n.R.inc(54816);f1.setId("f1's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54817);f1.setAddress("f1's address");
        __CLR4_1_10168j168jlusqk63n.R.inc(54818);f1.setChildrennames(new String[] { "p1's name", "p2's name", "p3's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54819);f1.setIncome(100000000);
        __CLR4_1_10168j168jlusqk63n.R.inc(54820);f1.setMaster(p1);
        __CLR4_1_10168j168jlusqk63n.R.inc(54821);f1.setName("person1's home");
        __CLR4_1_10168j168jlusqk63n.R.inc(54822);f1.setPs(ps);
        __CLR4_1_10168j168jlusqk63n.R.inc(54823);f1.setTest(1994.08);

        __CLR4_1_10168j168jlusqk63n.R.inc(54824);Family f2 = new Family();
        __CLR4_1_10168j168jlusqk63n.R.inc(54825);f2.setId("f2's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54826);f2.setAddress("f2's address");
        __CLR4_1_10168j168jlusqk63n.R.inc(54827);f2.setChildrennames(new String[] { "pp1's name", "pp2's name", "pp3's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54828);f2.setIncome(100000000);
        __CLR4_1_10168j168jlusqk63n.R.inc(54829);f2.setMaster(pp1);
        __CLR4_1_10168j168jlusqk63n.R.inc(54830);f2.setName("personpp1's home");
        __CLR4_1_10168j168jlusqk63n.R.inc(54831);f2.setPs(ps1);
        __CLR4_1_10168j168jlusqk63n.R.inc(54832);Family f3 = new Family();
        __CLR4_1_10168j168jlusqk63n.R.inc(54833);f3.setId("f3's id");
        __CLR4_1_10168j168jlusqk63n.R.inc(54834);f3.setAddress("f3's address");
        __CLR4_1_10168j168jlusqk63n.R.inc(54835);f3.setChildrennames(new String[] { "a1's name", "a2's name", "a3's name" });
        __CLR4_1_10168j168jlusqk63n.R.inc(54836);f3.setIncome(100000000);
        __CLR4_1_10168j168jlusqk63n.R.inc(54837);f3.setMaster(a1);
        __CLR4_1_10168j168jlusqk63n.R.inc(54838);f3.setName("a1's home");
        __CLR4_1_10168j168jlusqk63n.R.inc(54839);f3.setPs(ps2);
        __CLR4_1_10168j168jlusqk63n.R.inc(54840);f3.setTest(1995.08);
        __CLR4_1_10168j168jlusqk63n.R.inc(54841);Family[] fs = new Family[3];
        __CLR4_1_10168j168jlusqk63n.R.inc(54842);fs[0] = f1;
        __CLR4_1_10168j168jlusqk63n.R.inc(54843);fs[1] = f2;
        __CLR4_1_10168j168jlusqk63n.R.inc(54844);fs[2] = f3;
        __CLR4_1_10168j168jlusqk63n.R.inc(54845);System.out.println(JSON.VERSION);
        __CLR4_1_10168j168jlusqk63n.R.inc(54846);String sfs = JSON.toJSONString(fs, true);

        __CLR4_1_10168j168jlusqk63n.R.inc(54847);Assert.assertSame(fs[0].getMaster(), fs[0].getPs()[0]);
        __CLR4_1_10168j168jlusqk63n.R.inc(54848);System.out.println(sfs);

        {
            __CLR4_1_10168j168jlusqk63n.R.inc(54849);Family[] result = JSON.parseObject(sfs, Family[].class);
            __CLR4_1_10168j168jlusqk63n.R.inc(54850);Assert.assertSame(result[0].getMaster(), result[0].getPs()[0]);
            __CLR4_1_10168j168jlusqk63n.R.inc(54851);Assert.assertSame(result[1].getMaster(), result[1].getPs()[0]);
            __CLR4_1_10168j168jlusqk63n.R.inc(54852);Assert.assertSame(result[2].getMaster(), result[2].getPs()[0]);
        }
        {
            __CLR4_1_10168j168jlusqk63n.R.inc(54853);JSONArray array = JSON.parseArray(sfs);
            __CLR4_1_10168j168jlusqk63n.R.inc(54854);for (int i = 0; (((i < array.size())&&(__CLR4_1_10168j168jlusqk63n.R.iget(54855)!=0|true))||(__CLR4_1_10168j168jlusqk63n.R.iget(54856)==0&false)); ++i) {{
                __CLR4_1_10168j168jlusqk63n.R.inc(54857);JSONObject jsonObj = array.getJSONObject(i);
                __CLR4_1_10168j168jlusqk63n.R.inc(54858);Assert.assertSame(jsonObj.get("master"), jsonObj.getJSONArray("ps").get(0));
            }
        }}
    }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

    public static class Family {

        private String   id;
        private String   name;
        private Person[] ps;
        private String   address;
        private String[] childrennames;
        private Person   master;
        private long     income;
        private double   test;

        public String getId() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54859);
            __CLR4_1_10168j168jlusqk63n.R.inc(54860);return id;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54861);
            __CLR4_1_10168j168jlusqk63n.R.inc(54862);this.id = id;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54863);
            __CLR4_1_10168j168jlusqk63n.R.inc(54864);return name;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54865);
            __CLR4_1_10168j168jlusqk63n.R.inc(54866);this.name = name;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public Person[] getPs() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54867);
            __CLR4_1_10168j168jlusqk63n.R.inc(54868);return ps;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setPs(Person[] ps) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54869);
            __CLR4_1_10168j168jlusqk63n.R.inc(54870);this.ps = ps;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public String getAddress() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54871);
            __CLR4_1_10168j168jlusqk63n.R.inc(54872);return address;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setAddress(String address) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54873);
            __CLR4_1_10168j168jlusqk63n.R.inc(54874);this.address = address;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public String[] getChildrennames() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54875);
            __CLR4_1_10168j168jlusqk63n.R.inc(54876);return childrennames;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setChildrennames(String[] childrennames) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54877);
            __CLR4_1_10168j168jlusqk63n.R.inc(54878);this.childrennames = childrennames;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public Person getMaster() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54879);
            __CLR4_1_10168j168jlusqk63n.R.inc(54880);return master;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setMaster(Person master) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54881);
            __CLR4_1_10168j168jlusqk63n.R.inc(54882);this.master = master;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public long getIncome() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54883);
            __CLR4_1_10168j168jlusqk63n.R.inc(54884);return income;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setIncome(long income) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54885);
            __CLR4_1_10168j168jlusqk63n.R.inc(54886);this.income = income;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public double getTest() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54887);
            __CLR4_1_10168j168jlusqk63n.R.inc(54888);return test;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setTest(double test) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54889);
            __CLR4_1_10168j168jlusqk63n.R.inc(54890);this.test = test;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}
    }

    public static class Person {

        private String   id;
        private String   name;
        private String   sex;
        private int      age;
        private String[] names;
        private String   hight;

        public String getId() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54891);
            __CLR4_1_10168j168jlusqk63n.R.inc(54892);return id;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54893);
            __CLR4_1_10168j168jlusqk63n.R.inc(54894);this.id = id;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54895);
            __CLR4_1_10168j168jlusqk63n.R.inc(54896);return name;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54897);
            __CLR4_1_10168j168jlusqk63n.R.inc(54898);this.name = name;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public String getSex() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54899);
            __CLR4_1_10168j168jlusqk63n.R.inc(54900);return sex;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setSex(String sex) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54901);
            __CLR4_1_10168j168jlusqk63n.R.inc(54902);this.sex = sex;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54903);
            __CLR4_1_10168j168jlusqk63n.R.inc(54904);return age;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54905);
            __CLR4_1_10168j168jlusqk63n.R.inc(54906);this.age = age;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public String[] getNames() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54907);
            __CLR4_1_10168j168jlusqk63n.R.inc(54908);return names;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setNames(String[] names) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54909);
            __CLR4_1_10168j168jlusqk63n.R.inc(54910);this.names = names;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public String getHight() {try{__CLR4_1_10168j168jlusqk63n.R.inc(54911);
            __CLR4_1_10168j168jlusqk63n.R.inc(54912);return hight;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

        public void setHight(String hight) {try{__CLR4_1_10168j168jlusqk63n.R.inc(54913);
            __CLR4_1_10168j168jlusqk63n.R.inc(54914);this.hight = hight;
        }finally{__CLR4_1_10168j168jlusqk63n.R.flushNeeded();}}

    }

}
