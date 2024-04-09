/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;

import junit.framework.TestCase;

public class Bug_for_issue_448 extends TestCase {static class __CLR4_5_215g215g2lusvn6kd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,53745,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() {__CLR4_5_215g215g2lusvn6kd.R.globalSliceStart(getClass().getName(),53714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp215g2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215g215g2lusvn6kd.R.rethrow($CLV_t2$);}finally{__CLR4_5_215g215g2lusvn6kd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_448.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp215g2(){try{__CLR4_5_215g215g2lusvn6kd.R.inc(53714);
        
    }finally{__CLR4_5_215g215g2lusvn6kd.R.flushNeeded();}}

    // skip
    public void test_for_issue() throws Exception {__CLR4_5_215g215g2lusvn6kd.R.globalSliceStart(getClass().getName(),53715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb15g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215g215g2lusvn6kd.R.rethrow($CLV_t2$);}finally{__CLR4_5_215g215g2lusvn6kd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_448.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb15g3() throws Exception{try{__CLR4_5_215g215g2lusvn6kd.R.inc(53715);
        __CLR4_5_215g215g2lusvn6kd.R.inc(53716);final int value_size = 1024 * 16;
        __CLR4_5_215g215g2lusvn6kd.R.inc(53717);List<Model> list = new ArrayList<Model>();
        __CLR4_5_215g215g2lusvn6kd.R.inc(53718);for (int i = 0; (((i < 10)&&(__CLR4_5_215g215g2lusvn6kd.R.iget(53719)!=0|true))||(__CLR4_5_215g215g2lusvn6kd.R.iget(53720)==0&false)); ++i) {{
            __CLR4_5_215g215g2lusvn6kd.R.inc(53721);Model model = new Model();
            __CLR4_5_215g215g2lusvn6kd.R.inc(53722);char[] buf = new char[value_size];
            __CLR4_5_215g215g2lusvn6kd.R.inc(53723);for (int j = 0; (((j < buf.length)&&(__CLR4_5_215g215g2lusvn6kd.R.iget(53724)!=0|true))||(__CLR4_5_215g215g2lusvn6kd.R.iget(53725)==0&false)); ++j) {{
                __CLR4_5_215g215g2lusvn6kd.R.inc(53726);buf[j] = (char) ('a' + j);
            }
            }__CLR4_5_215g215g2lusvn6kd.R.inc(53727);model.value = new String(buf);
            __CLR4_5_215g215g2lusvn6kd.R.inc(53728);list.add(model);
        }
        
        }__CLR4_5_215g215g2lusvn6kd.R.inc(53729);String text = JSON.toJSONString(list);
        __CLR4_5_215g215g2lusvn6kd.R.inc(53730);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_215g215g2lusvn6kd.R.inc(53731);reader.startArray();
        __CLR4_5_215g215g2lusvn6kd.R.inc(53732);while ((((reader.hasNext())&&(__CLR4_5_215g215g2lusvn6kd.R.iget(53733)!=0|true))||(__CLR4_5_215g215g2lusvn6kd.R.iget(53734)==0&false))) {{
            __CLR4_5_215g215g2lusvn6kd.R.inc(53735);Model model = reader.readObject(Model.class);
            __CLR4_5_215g215g2lusvn6kd.R.inc(53736);String value = model.value;
            __CLR4_5_215g215g2lusvn6kd.R.inc(53737);Assert.assertEquals(value_size, value.length());
            __CLR4_5_215g215g2lusvn6kd.R.inc(53738);for (int i = 0; (((i < value.length())&&(__CLR4_5_215g215g2lusvn6kd.R.iget(53739)!=0|true))||(__CLR4_5_215g215g2lusvn6kd.R.iget(53740)==0&false)); ++i) {{
                __CLR4_5_215g215g2lusvn6kd.R.inc(53741);char ch = value.charAt(i);
                __CLR4_5_215g215g2lusvn6kd.R.inc(53742);Assert.assertEquals("error : index_" + i, (char) ('a' + i), ch);
            }
        }}
        }__CLR4_5_215g215g2lusvn6kd.R.inc(53743);reader.endArray();
        __CLR4_5_215g215g2lusvn6kd.R.inc(53744);reader.close();
    }finally{__CLR4_5_215g215g2lusvn6kd.R.flushNeeded();}}


    public static class Model {
        public String value;
    }
}
