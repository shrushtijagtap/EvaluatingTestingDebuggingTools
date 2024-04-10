/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

public class JSONFromObjectTest extends TestCase {static class __CLR4_1_10xt1xt1luszw5g6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,43863,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10xt1xt1luszw5g6.R.globalSliceStart(getClass().getName(),43813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2xt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xt1xt1luszw5g6.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xt1xt1luszw5g6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFromObjectTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2xt1() throws Exception{try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43813);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43814);User user = new User();
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43815);user.setId(3);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43816);user.setName("\u5468\u8bbf");

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43817);JSONObject json = (JSONObject) JSON.toJSON(user);

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43818);Assert.assertEquals(new Long(3), json.getLong("id"));
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43819);Assert.assertEquals("\u5468\u8bbf", json.getString("name"));
    }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_10xt1xt1luszw5g6.R.globalSliceStart(getClass().getName(),43820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwlxt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xt1xt1luszw5g6.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xt1xt1luszw5g6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFromObjectTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43820,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwlxt8() throws Exception{try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43820);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43821);JSONObject user = new JSONObject();
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43822);user.put("id", 3);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43823);user.put("name", "\u5468\u8bbf");

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43824);JSONObject json = (JSONObject) JSON.toJSON(user);

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43825);Assert.assertEquals(new Long(3), json.getLong("id"));
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43826);Assert.assertEquals("\u5468\u8bbf", json.getString("name"));
    }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_10xt1xt1luszw5g6.R.globalSliceStart(getClass().getName(),43827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k44xtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xt1xt1luszw5g6.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xt1xt1luszw5g6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFromObjectTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43827,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k44xtf() throws Exception{try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43827);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43828);HashMap user = new HashMap();
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43829);user.put("id", 3);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43830);user.put("name", "\u5468\u8bbf");

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43831);JSONObject json = (JSONObject) JSON.toJSON(user);

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43832);Assert.assertEquals(new Long(3), json.getLong("id"));
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43833);Assert.assertEquals("\u5468\u8bbf", json.getString("name"));
    }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_10xt1xt1luszw5g6.R.globalSliceStart(getClass().getName(),43834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbnxtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xt1xt1luszw5g6.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xt1xt1luszw5g6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFromObjectTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43834,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbnxtm() throws Exception{try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43834);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43835);List users = new ArrayList();
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43836);HashMap user = new HashMap();
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43837);user.put("id", 3);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43838);user.put("name", "\u5468\u8bbf");
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43839);users.add(user);

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43840);JSONArray array = (JSONArray) JSON.toJSON(users);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43841);JSONObject json = array.getJSONObject(0);

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43842);Assert.assertEquals(new Long(3), json.getLong("id"));
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43843);Assert.assertEquals("\u5468\u8bbf", json.getString("name"));
    }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_10xt1xt1luszw5g6.R.globalSliceStart(getClass().getName(),43844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1axtw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xt1xt1luszw5g6.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xt1xt1luszw5g6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFromObjectTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43844,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1axtw() throws Exception{try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43844);
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43845);C c = new C();

        __CLR4_1_10xt1xt1luszw5g6.R.inc(43846);JSONException error = null;
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43847);try {
            __CLR4_1_10xt1xt1luszw5g6.R.inc(43848);JSON.toJSON(c);
        } catch (JSONException e) {
            __CLR4_1_10xt1xt1luszw5g6.R.inc(43849);error = e;
        }
        __CLR4_1_10xt1xt1luszw5g6.R.inc(43850);Assert.assertNotNull(error);
    }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

    public static class User {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43851);
            __CLR4_1_10xt1xt1luszw5g6.R.inc(43852);return id;
        }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43853);
            __CLR4_1_10xt1xt1luszw5g6.R.inc(43854);this.id = id;
        }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43855);
            __CLR4_1_10xt1xt1luszw5g6.R.inc(43856);return name;
        }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43857);
            __CLR4_1_10xt1xt1luszw5g6.R.inc(43858);this.name = name;
        }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

    }

    public static class C {

        public int getId() {try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43859);
            __CLR4_1_10xt1xt1luszw5g6.R.inc(43860);throw new UnsupportedOperationException();
        }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_10xt1xt1luszw5g6.R.inc(43861);
            __CLR4_1_10xt1xt1luszw5g6.R.inc(43862);throw new UnsupportedOperationException();
        }finally{__CLR4_1_10xt1xt1luszw5g6.R.flushNeeded();}}
    }
}
