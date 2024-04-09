/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.parser.ParserConfig;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Bug_for_issue_415 extends TestCase {static class __CLR4_1_1014ew14ewlusqk2zo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,52410,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52376);
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52377);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_issue_415.");
    }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_1_1014ew14ewlusqk2zo.R.globalSliceStart(getClass().getName(),52378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb14ey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014ew14ewlusqk2zo.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014ew14ewlusqk2zo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_415.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52378,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb14ey() throws Exception{try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52378);
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52379);Teacher t = new Teacher();

        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52380);Address addr = new Address();
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52381);addr.setAddrDetail("\u4e2d\u56fd\u4e0a\u6d77\u5357\u4eac\u8def");

        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52382);Student s1 = new Student();
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52383);s1.setName("\u5f20\u4e09");
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52384);s1.setAddr(addr);

        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52385);Student s2 = new Student();
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52386);s2.setName("\u674e\u56db");
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52387);s2.setAddr(addr);

        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52388);t.setStudentList(Arrays.asList(s1, s2));
        
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52389);String json = JSON.toJSONString(t,SerializerFeature.WriteClassName);
        //@1 \u6253\u5370\u5e8f\u5217\u5316\u7684\u65f6\u5019json\u4e32

        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52390);Teacher t2 = (Teacher) JSON.parse(json);
        __CLR4_1_1014ew14ewlusqk2zo.R.inc(52391);for (Student s : t2.getStudentList()) {{
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52392);Assert.assertNotNull(s);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52393);Assert.assertNotNull(s.getAddr());
        }
    }}finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

    public static class Teacher {

        private List<Student> studentList;

        public List<Student> getStudentList() {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52394);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52395);return studentList;
        }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

        public void setStudentList(List<Student> studentList) {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52396);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52397);this.studentList = studentList;
        }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

    }

    public static class Address {

        private String addrDetail;

        public String getAddrDetail() {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52398);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52399);return addrDetail;
        }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

        public void setAddrDetail(String addressDetail) {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52400);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52401);this.addrDetail = addressDetail;
        }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}
    }

    public static class Student {

        private String  name;
        private Address address;

        public String getName() {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52402);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52403);return name;
        }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52404);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52405);this.name = name;
        }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

        public Address getAddr() {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52406);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52407);return address;
        }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

        public void setAddr(Address address) {try{__CLR4_1_1014ew14ewlusqk2zo.R.inc(52408);
            __CLR4_1_1014ew14ewlusqk2zo.R.inc(52409);this.address = address;
        }finally{__CLR4_1_1014ew14ewlusqk2zo.R.flushNeeded();}}

    }
}
