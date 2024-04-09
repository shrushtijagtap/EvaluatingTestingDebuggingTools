/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import com.alibaba.fastjson.JSONPath;
import junit.framework.TestCase;
import org.junit.Assert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JSONPath_field_access_filter_in_decimal extends TestCase {static class __CLR4_5_21pwq1pwqlusvnfht{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,80319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_in() throws Exception {__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceStart(getClass().getName(),80234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hzv9b41pwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pwq1pwqlusvnfht.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hzv9b41pwq() throws Exception{try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80234);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80235);JSONPath path = new JSONPath("[id in (1001)]");

        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80236);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80237);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80238);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80239);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80240);entities.add(new Entity(1004, null));

        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80241);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80242);Assert.assertEquals(1, result.size());
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80243);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}
    
    public void test_list_not_in() throws Exception {__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceStart(getClass().getName(),80244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h2h7lg1px0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pwq1pwqlusvnfht.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_not_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h2h7lg1px0() throws Exception{try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80244);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80245);JSONPath path = new JSONPath("[id not in (1001)]");

        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80246);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80247);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80248);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80249);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80250);entities.add(new Entity(1004, null));

        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80251);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80252);Assert.assertEquals(3, result.size());
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80253);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80254);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80255);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}
    
    public void test_list_not_in_null() throws Exception {__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceStart(getClass().getName(),80256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_294kv0o1pxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pwq1pwqlusvnfht.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_not_in_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_294kv0o1pxc() throws Exception{try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80256);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80257);JSONPath path = new JSONPath("[id not in (null)]");
        
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80258);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80259);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80260);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80261);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80262);entities.add(new Entity(1004, null));
        
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80263);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80264);Assert.assertEquals(4, result.size());
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80265);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80266);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80267);Assert.assertSame(entities.get(2), result.get(2));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80268);Assert.assertSame(entities.get(3), result.get(3));
    }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}
    
    public void test_list_in_2() throws Exception {__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceStart(getClass().getName(),80269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tm9n9p1pxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pwq1pwqlusvnfht.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tm9n9p1pxp() throws Exception{try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80269);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80270);JSONPath path = new JSONPath("[id in (1001, 1003)]");
        
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80271);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80272);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80273);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80274);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80275);entities.add(new Entity(1004, null));
        
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80276);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80277);Assert.assertEquals(2, result.size());
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80278);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80279);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}
    
    public void test_list_in_3() throws Exception {__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceStart(getClass().getName(),80280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qd9oh81py0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pwq1pwqlusvnfht.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qd9oh81py0() throws Exception{try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80280);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80281);JSONPath path = new JSONPath("[id in (1001, 1003, 1004)]");
        
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80282);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80283);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80284);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80285);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80286);entities.add(new Entity(1004, null));
        
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80287);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80288);Assert.assertEquals(3, result.size());
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80289);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80290);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80291);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}
    
    public void test_list_in_3_null() throws Exception {__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceStart(getClass().getName(),80292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ewx3sw1pyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pwq1pwqlusvnfht.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pwq1pwqlusvnfht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_3_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80292,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ewx3sw1pyc() throws Exception{try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80292);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80293);JSONPath path = new JSONPath("[id in (1001, 1003, null)]");
        
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80294);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80295);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80296);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80297);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80298);entities.add(new Entity(null, null));
        
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80299);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80300);Assert.assertEquals(3, result.size());
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80301);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80302);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21pwq1pwqlusvnfht.R.inc(80303);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}

    public static class Entity {

        private BigDecimal id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80304);
            __CLR4_5_21pwq1pwqlusvnfht.R.inc(80305);if ((((id == null)&&(__CLR4_5_21pwq1pwqlusvnfht.R.iget(80306)!=0|true))||(__CLR4_5_21pwq1pwqlusvnfht.R.iget(80307)==0&false))) {{
                __CLR4_5_21pwq1pwqlusvnfht.R.inc(80308);this.id = null;
            } }else {{
                __CLR4_5_21pwq1pwqlusvnfht.R.inc(80309);this.id = BigDecimal.valueOf(id);
            }

            }__CLR4_5_21pwq1pwqlusvnfht.R.inc(80310);this.name = name;
        }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}

        public BigDecimal getId() {try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80311);
            __CLR4_5_21pwq1pwqlusvnfht.R.inc(80312);return id;
        }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}

        public void setId(BigDecimal id) {try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80313);
            __CLR4_5_21pwq1pwqlusvnfht.R.inc(80314);this.id = id;
        }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80315);
            __CLR4_5_21pwq1pwqlusvnfht.R.inc(80316);return name;
        }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21pwq1pwqlusvnfht.R.inc(80317);
            __CLR4_5_21pwq1pwqlusvnfht.R.inc(80318);this.name = name;
        }finally{__CLR4_5_21pwq1pwqlusvnfht.R.flushNeeded();}}

    }
}
