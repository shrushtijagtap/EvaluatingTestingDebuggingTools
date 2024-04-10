/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import com.alibaba.fastjson.JSONPath;
import junit.framework.TestCase;
import org.junit.Assert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JSONPath_field_access_filter_in_decimal extends TestCase {static class __CLR4_5_21oyi1oyilusyjukg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79087,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_in() throws Exception {__CLR4_5_21oyi1oyilusyjukg.R.globalSliceStart(getClass().getName(),79002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hzv9b41oyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusyjukg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusyjukg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hzv9b41oyi() throws Exception{try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79002);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79003);JSONPath path = new JSONPath("[id in (1001)]");

        __CLR4_5_21oyi1oyilusyjukg.R.inc(79004);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79005);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79006);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79007);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79008);entities.add(new Entity(1004, null));

        __CLR4_5_21oyi1oyilusyjukg.R.inc(79009);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79010);Assert.assertEquals(1, result.size());
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79011);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}
    
    public void test_list_not_in() throws Exception {__CLR4_5_21oyi1oyilusyjukg.R.globalSliceStart(getClass().getName(),79012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h2h7lg1oys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusyjukg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusyjukg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_not_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h2h7lg1oys() throws Exception{try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79012);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79013);JSONPath path = new JSONPath("[id not in (1001)]");

        __CLR4_5_21oyi1oyilusyjukg.R.inc(79014);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79015);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79016);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79017);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79018);entities.add(new Entity(1004, null));

        __CLR4_5_21oyi1oyilusyjukg.R.inc(79019);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79020);Assert.assertEquals(3, result.size());
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79021);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79022);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79023);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}
    
    public void test_list_not_in_null() throws Exception {__CLR4_5_21oyi1oyilusyjukg.R.globalSliceStart(getClass().getName(),79024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_294kv0o1oz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusyjukg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusyjukg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_not_in_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_294kv0o1oz4() throws Exception{try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79024);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79025);JSONPath path = new JSONPath("[id not in (null)]");
        
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79026);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79027);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79028);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79029);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79030);entities.add(new Entity(1004, null));
        
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79031);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79032);Assert.assertEquals(4, result.size());
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79033);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79034);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79035);Assert.assertSame(entities.get(2), result.get(2));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79036);Assert.assertSame(entities.get(3), result.get(3));
    }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}
    
    public void test_list_in_2() throws Exception {__CLR4_5_21oyi1oyilusyjukg.R.globalSliceStart(getClass().getName(),79037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tm9n9p1ozh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusyjukg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusyjukg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tm9n9p1ozh() throws Exception{try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79037);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79038);JSONPath path = new JSONPath("[id in (1001, 1003)]");
        
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79039);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79040);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79041);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79042);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79043);entities.add(new Entity(1004, null));
        
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79044);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79045);Assert.assertEquals(2, result.size());
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79046);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79047);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}
    
    public void test_list_in_3() throws Exception {__CLR4_5_21oyi1oyilusyjukg.R.globalSliceStart(getClass().getName(),79048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qd9oh81ozs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusyjukg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusyjukg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qd9oh81ozs() throws Exception{try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79048);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79049);JSONPath path = new JSONPath("[id in (1001, 1003, 1004)]");
        
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79050);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79051);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79052);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79053);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79054);entities.add(new Entity(1004, null));
        
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79055);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79056);Assert.assertEquals(3, result.size());
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79057);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79058);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79059);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}
    
    public void test_list_in_3_null() throws Exception {__CLR4_5_21oyi1oyilusyjukg.R.globalSliceStart(getClass().getName(),79060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ewx3sw1p04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusyjukg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusyjukg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_3_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ewx3sw1p04() throws Exception{try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79060);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79061);JSONPath path = new JSONPath("[id in (1001, 1003, null)]");
        
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79062);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79063);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79064);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79065);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79066);entities.add(new Entity(null, null));
        
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79067);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79068);Assert.assertEquals(3, result.size());
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79069);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79070);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21oyi1oyilusyjukg.R.inc(79071);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}

    public static class Entity {

        private BigDecimal id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79072);
            __CLR4_5_21oyi1oyilusyjukg.R.inc(79073);if ((((id == null)&&(__CLR4_5_21oyi1oyilusyjukg.R.iget(79074)!=0|true))||(__CLR4_5_21oyi1oyilusyjukg.R.iget(79075)==0&false))) {{
                __CLR4_5_21oyi1oyilusyjukg.R.inc(79076);this.id = null;
            } }else {{
                __CLR4_5_21oyi1oyilusyjukg.R.inc(79077);this.id = BigDecimal.valueOf(id);
            }

            }__CLR4_5_21oyi1oyilusyjukg.R.inc(79078);this.name = name;
        }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}

        public BigDecimal getId() {try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79079);
            __CLR4_5_21oyi1oyilusyjukg.R.inc(79080);return id;
        }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}

        public void setId(BigDecimal id) {try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79081);
            __CLR4_5_21oyi1oyilusyjukg.R.inc(79082);this.id = id;
        }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79083);
            __CLR4_5_21oyi1oyilusyjukg.R.inc(79084);return name;
        }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21oyi1oyilusyjukg.R.inc(79085);
            __CLR4_5_21oyi1oyilusyjukg.R.inc(79086);this.name = name;
        }finally{__CLR4_5_21oyi1oyilusyjukg.R.flushNeeded();}}

    }
}
