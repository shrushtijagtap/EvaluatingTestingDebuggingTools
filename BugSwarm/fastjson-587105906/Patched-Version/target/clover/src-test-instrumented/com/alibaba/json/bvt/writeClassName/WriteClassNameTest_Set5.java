/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeClassName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.*;

public class WriteClassNameTest_Set5 extends TestCase {static class __CLR4_5_21yzy1yzylusyjw1c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,92046,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21yzy1yzylusyjw1c.R.globalSliceStart(getClass().getName(),92014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1yzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yzy1yzylusyjw1c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yzy1yzylusyjw1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set5.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1yzy() throws Exception{try{__CLR4_5_21yzy1yzylusyjw1c.R.inc(92014);
        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92015);Model model = new Model();
        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92016);LinkedHashSet tables = new LinkedHashSet();
        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92017);tables.add(new ExtTable(1001));
        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92018);tables.add(new Table());
        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92019);model.setTables(tables);

        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92020);String json = JSON.toJSONString(model);
        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92021);assertEquals("{\"tables\":[{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set5$ExtTable\",\"id\":1001},{}]}", json);

        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92022);Model model2 = JSON.parseObject(json, Model.class);
        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92023);assertEquals(ExtTable.class, model2.getTables().iterator().next().getClass());

        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92024);JSONObject jsonObject = JSON.parseObject(json, Feature.IgnoreAutoType);
        __CLR4_5_21yzy1yzylusyjw1c.R.inc(92025);assertEquals("{\"tables\":[{\"id\":1001},{}]}", jsonObject.toJSONString());
    }finally{__CLR4_5_21yzy1yzylusyjw1c.R.flushNeeded();}}

    public static class Model {
        @JSONField(serialzeFeatures = SerializerFeature.WriteClassName)
        private LinkedHashSet<? extends Table> tables;

        public LinkedHashSet<? extends Table> getTables() {try{__CLR4_5_21yzy1yzylusyjw1c.R.inc(92026);
            __CLR4_5_21yzy1yzylusyjw1c.R.inc(92027);return tables;
        }finally{__CLR4_5_21yzy1yzylusyjw1c.R.flushNeeded();}}

        public void setTables(LinkedHashSet<? extends Table> tables) {try{__CLR4_5_21yzy1yzylusyjw1c.R.inc(92028);
            __CLR4_5_21yzy1yzylusyjw1c.R.inc(92029);this.tables = tables;
        }finally{__CLR4_5_21yzy1yzylusyjw1c.R.flushNeeded();}}
    }

    public static class Table {

    }

    public static class ExtTable extends Table {
        public int id;

        public ExtTable() {try{__CLR4_5_21yzy1yzylusyjw1c.R.inc(92030);

        }finally{__CLR4_5_21yzy1yzylusyjw1c.R.flushNeeded();}}

        public ExtTable(int id) {try{__CLR4_5_21yzy1yzylusyjw1c.R.inc(92031);
            __CLR4_5_21yzy1yzylusyjw1c.R.inc(92032);this.id = id;
        }finally{__CLR4_5_21yzy1yzylusyjw1c.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_21yzy1yzylusyjw1c.R.inc(92033);
            __CLR4_5_21yzy1yzylusyjw1c.R.inc(92034);if ((((this == o)&&(__CLR4_5_21yzy1yzylusyjw1c.R.iget(92035)!=0|true))||(__CLR4_5_21yzy1yzylusyjw1c.R.iget(92036)==0&false))) {__CLR4_5_21yzy1yzylusyjw1c.R.inc(92037);return true;
            }__CLR4_5_21yzy1yzylusyjw1c.R.inc(92038);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_21yzy1yzylusyjw1c.R.iget(92039)!=0|true))||(__CLR4_5_21yzy1yzylusyjw1c.R.iget(92040)==0&false))) {__CLR4_5_21yzy1yzylusyjw1c.R.inc(92041);return false;

            }__CLR4_5_21yzy1yzylusyjw1c.R.inc(92042);ExtTable extTable = (ExtTable) o;

            __CLR4_5_21yzy1yzylusyjw1c.R.inc(92043);return id == extTable.id;
        }finally{__CLR4_5_21yzy1yzylusyjw1c.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_21yzy1yzylusyjw1c.R.inc(92044);
            __CLR4_5_21yzy1yzylusyjw1c.R.inc(92045);return id;
        }finally{__CLR4_5_21yzy1yzylusyjw1c.R.flushNeeded();}}
    }
}
