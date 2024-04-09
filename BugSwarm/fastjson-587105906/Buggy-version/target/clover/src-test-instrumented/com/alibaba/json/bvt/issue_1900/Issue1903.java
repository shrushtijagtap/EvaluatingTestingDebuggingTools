/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1900;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.beans.Transient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
public class Issue1903 extends TestCase {static class __CLR4_1_101cnw1cnwlusqkarn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,63086,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_issue() throws Exception {__CLR4_1_101cnw1cnwlusqkarn.R.globalSliceStart(getClass().getName(),63068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1015xljh1cnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101cnw1cnwlusqkarn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101cnw1cnwlusqkarn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1900.Issue1903.test_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63068,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1015xljh1cnw() throws Exception{try{__CLR4_1_101cnw1cnwlusqkarn.R.inc(63068);
        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63069);MapHandler mh = new MapHandler();
        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63070);mh.add("name", "test");
        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63071);mh.add("age", 20);

        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63072);Issues1903 issues = (Issues1903) Proxy.newProxyInstance(mh.getClass().getClassLoader(), new Class[]{Issues1903.class}, mh);
        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63073);System.out.println(issues.getName());
        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63074);System.out.println(issues.getAge());

        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63075);System.out.println(JSON.toJSON(issues).toString()); //\u6b63\u786e\u7ed3\u679c: {"age":20}
        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63076);System.out.println(JSON.toJSONString(issues));  //\u6b63\u786e\u7ed3\u679c: {"age":20}
        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63077);Assert.assertEquals("{\"age\":20}", JSON.toJSON(issues).toString());
        __CLR4_1_101cnw1cnwlusqkarn.R.inc(63078);Assert.assertEquals("{\"age\":20}", JSON.toJSONString(issues));
    }finally{__CLR4_1_101cnw1cnwlusqkarn.R.flushNeeded();}}

    interface Issues1903{
        @Transient
        @JSONField(serialzeFeatures = { SerializerFeature.SkipTransientField })
        public String getName();
        public void setName(String name);

        public Integer getAge();
        public void setAge(Integer age);
    }


    class MapHandler implements InvocationHandler {
        Map<String, Object> map = new HashMap<String, Object>();

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {try{__CLR4_1_101cnw1cnwlusqkarn.R.inc(63079);
            __CLR4_1_101cnw1cnwlusqkarn.R.inc(63080);String name = method.getName().substring(3);
            __CLR4_1_101cnw1cnwlusqkarn.R.inc(63081);String first = String.valueOf(name.charAt(0));
            __CLR4_1_101cnw1cnwlusqkarn.R.inc(63082);name = name.replaceFirst(first, first.toLowerCase());
            __CLR4_1_101cnw1cnwlusqkarn.R.inc(63083);return map.get(name);
        }finally{__CLR4_1_101cnw1cnwlusqkarn.R.flushNeeded();}}

        public void add(String key, Object val){try{__CLR4_1_101cnw1cnwlusqkarn.R.inc(63084);
            __CLR4_1_101cnw1cnwlusqkarn.R.inc(63085);map.put(key, val);
        }finally{__CLR4_1_101cnw1cnwlusqkarn.R.flushNeeded();}}
    }
}
