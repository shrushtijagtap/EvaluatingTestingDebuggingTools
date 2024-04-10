/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class MapRefTest extends TestCase {static class __CLR4_1_10z2fz2fluszw5ua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,45467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10z2fz2fluszw5ua.R.globalSliceStart(getClass().getName(),45447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2z2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z2fz2fluszw5ua.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z2fz2fluszw5ua.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.MapRefTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45447,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2z2f() throws Exception{try{__CLR4_1_10z2fz2fluszw5ua.R.inc(45447);
        __CLR4_1_10z2fz2fluszw5ua.R.inc(45448);String text;
        {
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45449);Map<String, Object> map = new HashMap<String, Object>();

            __CLR4_1_10z2fz2fluszw5ua.R.inc(45450);User user = new User();
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45451);user.setId(123);
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45452);user.setName("wenshao");
            
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45453);map.put("u1", user);
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45454);map.put("u2", user);
            
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45455);text = JSON.toJSONString(map);
        }
        
        __CLR4_1_10z2fz2fluszw5ua.R.inc(45456);System.out.println(text);
        __CLR4_1_10z2fz2fluszw5ua.R.inc(45457);Map<String, Object> map = JSON.parseObject(text, new TypeReference<Map<String, Object>>() {});
        //Assert.assertEquals(map, map.get("this"));
        __CLR4_1_10z2fz2fluszw5ua.R.inc(45458);Assert.assertEquals(map.get("u1"), map.get("u2"));
    }finally{__CLR4_1_10z2fz2fluszw5ua.R.flushNeeded();}}

    public static class User {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_10z2fz2fluszw5ua.R.inc(45459);
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45460);return id;
        }finally{__CLR4_1_10z2fz2fluszw5ua.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_10z2fz2fluszw5ua.R.inc(45461);
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45462);this.id = id;
        }finally{__CLR4_1_10z2fz2fluszw5ua.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10z2fz2fluszw5ua.R.inc(45463);
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45464);return name;
        }finally{__CLR4_1_10z2fz2fluszw5ua.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10z2fz2fluszw5ua.R.inc(45465);
            __CLR4_1_10z2fz2fluszw5ua.R.inc(45466);this.name = name;
        }finally{__CLR4_1_10z2fz2fluszw5ua.R.flushNeeded();}}

    }

}
