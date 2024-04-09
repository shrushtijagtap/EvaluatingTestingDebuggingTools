/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeClassName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WriteClassNameTest_List3 extends TestCase {static class __CLR4_1_101ywq1ywqlusqkogc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,91928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101ywq1ywqlusqkogc.R.globalSliceStart(getClass().getName(),91898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1ywq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ywq1ywqlusqkogc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ywq1ywqlusqkogc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_List3.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91898,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1ywq() throws Exception{try{__CLR4_1_101ywq1ywqlusqkogc.R.inc(91898);
        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91899);Model model = new Model();
        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91900);List tables = new ArrayList();
        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91901);tables.add(new ExtTable(1001));
        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91902);tables.add(new Table());
        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91903);model.setTables(tables);

        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91904);String json = JSON.toJSONString(model);
        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91905);assertEquals("{\"tables\":[{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_List3$ExtTable\",\"id\":1001},{}]}", json);

        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91906);Model model2 = JSON.parseObject(json, Model.class);
        __CLR4_1_101ywq1ywqlusqkogc.R.inc(91907);assertEquals(ExtTable.class, model2.getTables().iterator().next().getClass());
    }finally{__CLR4_1_101ywq1ywqlusqkogc.R.flushNeeded();}}

    public static class Model {
        @JSONField(serialzeFeatures = SerializerFeature.WriteClassName)
        private List<? extends Table> tables;

        public List<? extends Table> getTables() {try{__CLR4_1_101ywq1ywqlusqkogc.R.inc(91908);
            __CLR4_1_101ywq1ywqlusqkogc.R.inc(91909);return tables;
        }finally{__CLR4_1_101ywq1ywqlusqkogc.R.flushNeeded();}}

        public void setTables(List<? extends Table> tables) {try{__CLR4_1_101ywq1ywqlusqkogc.R.inc(91910);
            __CLR4_1_101ywq1ywqlusqkogc.R.inc(91911);this.tables = tables;
        }finally{__CLR4_1_101ywq1ywqlusqkogc.R.flushNeeded();}}
    }

    public static class Table {

    }

    public static class ExtTable extends Table {
        public int id;

        public ExtTable() {try{__CLR4_1_101ywq1ywqlusqkogc.R.inc(91912);

        }finally{__CLR4_1_101ywq1ywqlusqkogc.R.flushNeeded();}}

        public ExtTable(int id) {try{__CLR4_1_101ywq1ywqlusqkogc.R.inc(91913);
            __CLR4_1_101ywq1ywqlusqkogc.R.inc(91914);this.id = id;
        }finally{__CLR4_1_101ywq1ywqlusqkogc.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_1_101ywq1ywqlusqkogc.R.inc(91915);
            __CLR4_1_101ywq1ywqlusqkogc.R.inc(91916);if ((((this == o)&&(__CLR4_1_101ywq1ywqlusqkogc.R.iget(91917)!=0|true))||(__CLR4_1_101ywq1ywqlusqkogc.R.iget(91918)==0&false))) {__CLR4_1_101ywq1ywqlusqkogc.R.inc(91919);return true;
            }__CLR4_1_101ywq1ywqlusqkogc.R.inc(91920);if ((((o == null || getClass() != o.getClass())&&(__CLR4_1_101ywq1ywqlusqkogc.R.iget(91921)!=0|true))||(__CLR4_1_101ywq1ywqlusqkogc.R.iget(91922)==0&false))) {__CLR4_1_101ywq1ywqlusqkogc.R.inc(91923);return false;

            }__CLR4_1_101ywq1ywqlusqkogc.R.inc(91924);ExtTable extTable = (ExtTable) o;

            __CLR4_1_101ywq1ywqlusqkogc.R.inc(91925);return id == extTable.id;
        }finally{__CLR4_1_101ywq1ywqlusqkogc.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_101ywq1ywqlusqkogc.R.inc(91926);
            __CLR4_1_101ywq1ywqlusqkogc.R.inc(91927);return id;
        }finally{__CLR4_1_101ywq1ywqlusqkogc.R.flushNeeded();}}
    }
}
