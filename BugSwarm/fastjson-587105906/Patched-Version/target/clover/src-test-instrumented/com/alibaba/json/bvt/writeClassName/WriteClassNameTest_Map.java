/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeClassName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.*;

public class WriteClassNameTest_Map extends TestCase {static class __CLR4_5_21yx91yx9lusyjw11{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,91936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21yx91yx9lusyjw11.R.globalSliceStart(getClass().getName(),91917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1yx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yx91yx9lusyjw11.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yx91yx9lusyjw11.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Map.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1yx9() throws Exception{try{__CLR4_5_21yx91yx9lusyjw11.R.inc(91917);
        __CLR4_5_21yx91yx9lusyjw11.R.inc(91918);Model model = new Model();
        __CLR4_5_21yx91yx9lusyjw11.R.inc(91919);Map tables = new LinkedHashMap();
        __CLR4_5_21yx91yx9lusyjw11.R.inc(91920);tables.put("1001", new ExtTable(1001));
        __CLR4_5_21yx91yx9lusyjw11.R.inc(91921);tables.put("1002", new Table());
        __CLR4_5_21yx91yx9lusyjw11.R.inc(91922);model.setTables(tables);

        __CLR4_5_21yx91yx9lusyjw11.R.inc(91923);String json = JSON.toJSONString(model);
        __CLR4_5_21yx91yx9lusyjw11.R.inc(91924);assertEquals("{\"tables\":{\"1001\":{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Map$ExtTable\",\"id\":1001},\"1002\":{}}}", json);

        __CLR4_5_21yx91yx9lusyjw11.R.inc(91925);JSONObject jsonObject = JSON.parseObject(json, Feature.IgnoreAutoType);
        __CLR4_5_21yx91yx9lusyjw11.R.inc(91926);assertEquals("{\"tables\":{\"1002\":{},\"1001\":{\"id\":1001}}}", jsonObject.toJSONString());

        __CLR4_5_21yx91yx9lusyjw11.R.inc(91927);Model model2 = JSON.parseObject(json, Model.class);
        __CLR4_5_21yx91yx9lusyjw11.R.inc(91928);assertEquals(ExtTable.class, model2.getTables().get("1001").getClass());
    }finally{__CLR4_5_21yx91yx9lusyjw11.R.flushNeeded();}}

    public static class Model {
        @JSONField(serialzeFeatures = SerializerFeature.WriteClassName)
        private Map<String, ? extends Table> tables;

        public Map<String, ? extends Table> getTables() {try{__CLR4_5_21yx91yx9lusyjw11.R.inc(91929);
            __CLR4_5_21yx91yx9lusyjw11.R.inc(91930);return tables;
        }finally{__CLR4_5_21yx91yx9lusyjw11.R.flushNeeded();}}

        public void setTables(Map<String, ? extends Table> tables) {try{__CLR4_5_21yx91yx9lusyjw11.R.inc(91931);
            __CLR4_5_21yx91yx9lusyjw11.R.inc(91932);this.tables = tables;
        }finally{__CLR4_5_21yx91yx9lusyjw11.R.flushNeeded();}}
    }

    public static class Table {

    }

    public static class ExtTable extends Table {
        public int id;

        public ExtTable() {try{__CLR4_5_21yx91yx9lusyjw11.R.inc(91933);

        }finally{__CLR4_5_21yx91yx9lusyjw11.R.flushNeeded();}}

        public ExtTable(int id) {try{__CLR4_5_21yx91yx9lusyjw11.R.inc(91934);
            __CLR4_5_21yx91yx9lusyjw11.R.inc(91935);this.id = id;
        }finally{__CLR4_5_21yx91yx9lusyjw11.R.flushNeeded();}}
    }
}
