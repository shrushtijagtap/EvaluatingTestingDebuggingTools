/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class NameFilterTest_double_field extends TestCase {static class __CLR4_1_101ulp1ulplusqkl58{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,86348,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_namefilter() throws Exception {__CLR4_1_101ulp1ulplusqkl58.R.globalSliceStart(getClass().getName(),86317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pmdm8n1ulp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ulp1ulplusqkl58.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ulp1ulplusqkl58.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.NameFilterTest_double_field.test_namefilter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86317,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pmdm8n1ulp() throws Exception{try{__CLR4_1_101ulp1ulplusqkl58.R.inc(86317);
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86318);NameFilter filter = new NameFilter() {

            public String process(Object source, String name, Object value) {try{__CLR4_1_101ulp1ulplusqkl58.R.inc(86319);
                __CLR4_1_101ulp1ulplusqkl58.R.inc(86320);if ((((name.equals("id"))&&(__CLR4_1_101ulp1ulplusqkl58.R.iget(86321)!=0|true))||(__CLR4_1_101ulp1ulplusqkl58.R.iget(86322)==0&false))) {{
                    __CLR4_1_101ulp1ulplusqkl58.R.inc(86323);return "ID";
                }

                }__CLR4_1_101ulp1ulplusqkl58.R.inc(86324);return name;
            }finally{__CLR4_1_101ulp1ulplusqkl58.R.flushNeeded();}}

        };

        __CLR4_1_101ulp1ulplusqkl58.R.inc(86325);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86326);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86327);serializer.getNameFilters().add(filter);

        __CLR4_1_101ulp1ulplusqkl58.R.inc(86328);Bean a = new Bean();
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86329);serializer.write(a);

        __CLR4_1_101ulp1ulplusqkl58.R.inc(86330);String text = out.toString();
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86331);Assert.assertEquals("{\"ID\":0.0}", text);
    }finally{__CLR4_1_101ulp1ulplusqkl58.R.flushNeeded();}}

    public void test_namefilter_1() throws Exception {__CLR4_1_101ulp1ulplusqkl58.R.globalSliceStart(getClass().getName(),86332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10l5s2if1um4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ulp1ulplusqkl58.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ulp1ulplusqkl58.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.NameFilterTest_double_field.test_namefilter_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86332,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10l5s2if1um4() throws Exception{try{__CLR4_1_101ulp1ulplusqkl58.R.inc(86332);
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86333);NameFilter filter = new NameFilter() {

            public String process(Object source, String name, Object value) {try{__CLR4_1_101ulp1ulplusqkl58.R.inc(86334);
                __CLR4_1_101ulp1ulplusqkl58.R.inc(86335);if ((((name.equals("id"))&&(__CLR4_1_101ulp1ulplusqkl58.R.iget(86336)!=0|true))||(__CLR4_1_101ulp1ulplusqkl58.R.iget(86337)==0&false))) {{
                    __CLR4_1_101ulp1ulplusqkl58.R.inc(86338);return "ID";
                }

                }__CLR4_1_101ulp1ulplusqkl58.R.inc(86339);return name;
            }finally{__CLR4_1_101ulp1ulplusqkl58.R.flushNeeded();}}

        };

        __CLR4_1_101ulp1ulplusqkl58.R.inc(86340);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86341);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86342);serializer.getNameFilters().add(filter);

        __CLR4_1_101ulp1ulplusqkl58.R.inc(86343);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86344);map.put("id", 0);
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86345);serializer.write(map);

        __CLR4_1_101ulp1ulplusqkl58.R.inc(86346);String text = out.toString();
        __CLR4_1_101ulp1ulplusqkl58.R.inc(86347);Assert.assertEquals("{\"ID\":0}", text);
    }finally{__CLR4_1_101ulp1ulplusqkl58.R.flushNeeded();}}

    public static class Bean {

        public double  id;
        public String name;


    }
}
