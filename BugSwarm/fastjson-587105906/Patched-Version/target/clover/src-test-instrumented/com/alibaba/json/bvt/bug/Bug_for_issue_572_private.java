/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

import junit.framework.TestCase;

public class Bug_for_issue_572_private extends TestCase {static class __CLR4_5_214r114r1lusyjrov{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,52840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_214r114r1lusyjrov.R.globalSliceStart(getClass().getName(),52813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb14r1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214r114r1lusyjrov.R.rethrow($CLV_t2$);}finally{__CLR4_5_214r114r1lusyjrov.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_572_private.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb14r1() throws Exception{try{__CLR4_5_214r114r1lusyjrov.R.inc(52813);
        __CLR4_5_214r114r1lusyjrov.R.inc(52814);Model model = new Model();
        __CLR4_5_214r114r1lusyjrov.R.inc(52815);model.id = 1001;
        __CLR4_5_214r114r1lusyjrov.R.inc(52816);model.name = "wenshao";

        __CLR4_5_214r114r1lusyjrov.R.inc(52817);String text = JSON.toJSONString(model, SerializerFeature.WriteNonStringValueAsString);
        __CLR4_5_214r114r1lusyjrov.R.inc(52818);Assert.assertEquals("{\"id\":\"1001\",\"name\":\"wenshao\"}", text);
    }finally{__CLR4_5_214r114r1lusyjrov.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_5_214r114r1lusyjrov.R.globalSliceStart(getClass().getName(),52819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn514r7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214r114r1lusyjrov.R.rethrow($CLV_t2$);}finally{__CLR4_5_214r114r1lusyjrov.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_572_private.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52819,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn514r7() throws Exception{try{__CLR4_5_214r114r1lusyjrov.R.inc(52819);
        __CLR4_5_214r114r1lusyjrov.R.inc(52820);Model model = new Model();
        __CLR4_5_214r114r1lusyjrov.R.inc(52821);model.id = 1001;
        __CLR4_5_214r114r1lusyjrov.R.inc(52822);model.name = "wenshao";

        __CLR4_5_214r114r1lusyjrov.R.inc(52823);ValueFilter valueFilter = new ValueFilter() {

            @Override
            public Object process(Object object, String name, Object value) {try{__CLR4_5_214r114r1lusyjrov.R.inc(52824);
                __CLR4_5_214r114r1lusyjrov.R.inc(52825);if ((((value instanceof Number)&&(__CLR4_5_214r114r1lusyjrov.R.iget(52826)!=0|true))||(__CLR4_5_214r114r1lusyjrov.R.iget(52827)==0&false))) {{
                    __CLR4_5_214r114r1lusyjrov.R.inc(52828);return null;
                }
                }__CLR4_5_214r114r1lusyjrov.R.inc(52829);return value;
            }finally{__CLR4_5_214r114r1lusyjrov.R.flushNeeded();}}
        };

        __CLR4_5_214r114r1lusyjrov.R.inc(52830);String text = JSON.toJSONString(model, valueFilter, SerializerFeature.WriteNonStringValueAsString);
        __CLR4_5_214r114r1lusyjrov.R.inc(52831);Assert.assertEquals("{\"id\":\"1001\",\"name\":\"wenshao\"}", text);
    }finally{__CLR4_5_214r114r1lusyjrov.R.flushNeeded();}}

    private static class Model {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_214r114r1lusyjrov.R.inc(52832);
            __CLR4_5_214r114r1lusyjrov.R.inc(52833);return id;
        }finally{__CLR4_5_214r114r1lusyjrov.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_214r114r1lusyjrov.R.inc(52834);
            __CLR4_5_214r114r1lusyjrov.R.inc(52835);this.id = id;
        }finally{__CLR4_5_214r114r1lusyjrov.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_214r114r1lusyjrov.R.inc(52836);
            __CLR4_5_214r114r1lusyjrov.R.inc(52837);return name;
        }finally{__CLR4_5_214r114r1lusyjrov.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_214r114r1lusyjrov.R.inc(52838);
            __CLR4_5_214r114r1lusyjrov.R.inc(52839);this.name = name;
        }finally{__CLR4_5_214r114r1lusyjrov.R.flushNeeded();}}

    }
}
