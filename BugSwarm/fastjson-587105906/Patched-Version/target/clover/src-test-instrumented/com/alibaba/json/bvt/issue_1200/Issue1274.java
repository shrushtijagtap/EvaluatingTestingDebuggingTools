/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.NameFilter;
import junit.framework.TestCase;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kimmking on 15/06/2017.
 */
public class Issue1274 extends TestCase {static class __CLR4_5_21ap61ap6lusvn9pg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,60551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21ap61ap6lusvn9pg.R.globalSliceStart(getClass().getName(),60522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1ap6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ap61ap6lusvn9pg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ap61ap6lusvn9pg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1200.Issue1274.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1ap6() throws Exception{try{__CLR4_5_21ap61ap6lusvn9pg.R.inc(60522);

        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60523);User user = new User();
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60524);user.setId(1);
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60525);user.setName("name");

        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60526);NameFilter filter =  new NameFilter() {
            public String process(Object object, String name, Object value) {try{__CLR4_5_21ap61ap6lusvn9pg.R.inc(60527);
                __CLR4_5_21ap61ap6lusvn9pg.R.inc(60528);System.out.println("name="+name+",value="+value);
                __CLR4_5_21ap61ap6lusvn9pg.R.inc(60529);if((((name.equals("name"))&&(__CLR4_5_21ap61ap6lusvn9pg.R.iget(60530)!=0|true))||(__CLR4_5_21ap61ap6lusvn9pg.R.iget(60531)==0&false))){{
                    __CLR4_5_21ap61ap6lusvn9pg.R.inc(60532);return "nt";
                }
                }__CLR4_5_21ap61ap6lusvn9pg.R.inc(60533);return name;
            }finally{__CLR4_5_21ap61ap6lusvn9pg.R.flushNeeded();}}
        };

        // test for  JSON.toJSONString(user,filter);
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60534);String jsonString = JSON.toJSONString(user,filter);
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60535);System.out.println(jsonString);
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60536);assertEquals("{\"id\":1,\"nt\":\"name\"}", jsonString);

        // test for jsonSerializer.getNameFilters().add(filter);
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60537);JSONSerializer jsonSerializer = new JSONSerializer();
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60538);jsonSerializer.getNameFilters().add(filter);
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60539);jsonSerializer.write(user);
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60540);jsonString = jsonSerializer.toString();
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60541);System.out.println(jsonString);
        __CLR4_5_21ap61ap6lusvn9pg.R.inc(60542);assertEquals("{\"id\":1,\"nt\":\"name\"}",jsonString);

    }finally{__CLR4_5_21ap61ap6lusvn9pg.R.flushNeeded();}}

    public static class User {
        private int id;
        private String name;

        public int getId() {try{__CLR4_5_21ap61ap6lusvn9pg.R.inc(60543);
            __CLR4_5_21ap61ap6lusvn9pg.R.inc(60544);return id;
        }finally{__CLR4_5_21ap61ap6lusvn9pg.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ap61ap6lusvn9pg.R.inc(60545);
            __CLR4_5_21ap61ap6lusvn9pg.R.inc(60546);this.id = id;
        }finally{__CLR4_5_21ap61ap6lusvn9pg.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21ap61ap6lusvn9pg.R.inc(60547);
            __CLR4_5_21ap61ap6lusvn9pg.R.inc(60548);return name;
        }finally{__CLR4_5_21ap61ap6lusvn9pg.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21ap61ap6lusvn9pg.R.inc(60549);
            __CLR4_5_21ap61ap6lusvn9pg.R.inc(60550);this.name = name;
        }finally{__CLR4_5_21ap61ap6lusvn9pg.R.flushNeeded();}}
    }

}
