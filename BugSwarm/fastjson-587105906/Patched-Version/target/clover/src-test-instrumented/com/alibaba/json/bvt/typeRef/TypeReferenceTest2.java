/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.typeRef;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class TypeReferenceTest2 extends TestCase {static class __CLR4_5_21xl91xl9lusyjvqg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90225,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21xl91xl9lusyjvqg.R.globalSliceStart(getClass().getName(),90189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21xl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xl91xl9lusyjvqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xl91xl9lusyjvqg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.typeRef.TypeReferenceTest2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21xl9() throws Exception{try{__CLR4_5_21xl91xl9lusyjvqg.R.inc(90189);
        __CLR4_5_21xl91xl9lusyjvqg.R.inc(90190);String text;

        {
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90191);List<Bean> list = new ArrayList<Bean>();
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90192);list.add(new Bean(123, "\u9a6c\u52a0\u7235"));
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90193);list.add(new Bean(234, "\u836f\u5bb6\u946b"));
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90194);list.add(new Bean(456, "\u5218\u5927\u4f1f"));

            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90195);text = JSON.toJSONString(list);
        }

        __CLR4_5_21xl91xl9lusyjvqg.R.inc(90196);System.out.println(text);

        {
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90197);List<Bean> list = JSON.parseObject(text, new TypeReference<List<Bean>>() {}); // \u6ce8\u610f\u8fd9\u91cc
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90198);Assert.assertEquals(3, list.size());
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90199);Assert.assertEquals(123, ((Bean) list.get(0)).getId());
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90200);Assert.assertEquals(234, ((Bean) list.get(1)).getId());
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90201);Assert.assertEquals(456, ((Bean) list.get(2)).getId());

            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90202);Assert.assertEquals("\u9a6c\u52a0\u7235", ((Bean) list.get(0)).getName());
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90203);Assert.assertEquals("\u836f\u5bb6\u946b", ((Bean) list.get(1)).getName());
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90204);Assert.assertEquals("\u5218\u5927\u4f1f", ((Bean) list.get(2)).getName());
        }
        
        {
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90205);JSONArray list = JSON.parseObject(text, new TypeReference<JSONArray>() {}); // \u6ce8\u610f\u8fd9\u91cc
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90206);Assert.assertEquals(3, list.size());
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90207);Assert.assertEquals(123, ((JSONObject) list.get(0)).get("id"));
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90208);Assert.assertEquals(234, ((JSONObject) list.get(1)).get("id"));
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90209);Assert.assertEquals(456, ((JSONObject) list.get(2)).get("id"));
            
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90210);Assert.assertEquals("\u9a6c\u52a0\u7235", ((JSONObject) list.get(0)).get("name"));
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90211);Assert.assertEquals("\u836f\u5bb6\u946b", ((JSONObject) list.get(1)).get("name"));
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90212);Assert.assertEquals("\u5218\u5927\u4f1f", ((JSONObject) list.get(2)).get("name"));
        }
    }finally{__CLR4_5_21xl91xl9lusyjvqg.R.flushNeeded();}}

    public static class Bean {

        private int    id;
        private String name;

        public Bean(){try{__CLR4_5_21xl91xl9lusyjvqg.R.inc(90213);

        }finally{__CLR4_5_21xl91xl9lusyjvqg.R.flushNeeded();}}

        public Bean(int id, String name){try{__CLR4_5_21xl91xl9lusyjvqg.R.inc(90214);
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90215);this.id = id;
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90216);this.name = name;
        }finally{__CLR4_5_21xl91xl9lusyjvqg.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21xl91xl9lusyjvqg.R.inc(90217);
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90218);return id;
        }finally{__CLR4_5_21xl91xl9lusyjvqg.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21xl91xl9lusyjvqg.R.inc(90219);
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90220);this.id = id;
        }finally{__CLR4_5_21xl91xl9lusyjvqg.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21xl91xl9lusyjvqg.R.inc(90221);
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90222);return name;
        }finally{__CLR4_5_21xl91xl9lusyjvqg.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21xl91xl9lusyjvqg.R.inc(90223);
            __CLR4_5_21xl91xl9lusyjvqg.R.inc(90224);this.name = name;
        }finally{__CLR4_5_21xl91xl9lusyjvqg.R.flushNeeded();}}

    }
}
