/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import com.alibaba.fastjson.JSONPath;
import junit.framework.TestCase;
import org.junit.Assert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JSONPath_field_access_filter_in_decimal extends TestCase {static class __CLR4_1_101oyt1oytlusqkijx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,79098,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_in() throws Exception {__CLR4_1_101oyt1oytlusqkijx.R.globalSliceStart(getClass().getName(),79013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hzv9b41oyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oyt1oytlusqkijx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oyt1oytlusqkijx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79013,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hzv9b41oyt() throws Exception{try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79013);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79014);JSONPath path = new JSONPath("[id in (1001)]");

        __CLR4_1_101oyt1oytlusqkijx.R.inc(79015);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79016);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79017);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79018);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79019);entities.add(new Entity(1004, null));

        __CLR4_1_101oyt1oytlusqkijx.R.inc(79020);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79021);Assert.assertEquals(1, result.size());
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79022);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}
    
    public void test_list_not_in() throws Exception {__CLR4_1_101oyt1oytlusqkijx.R.globalSliceStart(getClass().getName(),79023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h2h7lg1oz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oyt1oytlusqkijx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oyt1oytlusqkijx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_not_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79023,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h2h7lg1oz3() throws Exception{try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79023);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79024);JSONPath path = new JSONPath("[id not in (1001)]");

        __CLR4_1_101oyt1oytlusqkijx.R.inc(79025);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79026);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79027);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79028);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79029);entities.add(new Entity(1004, null));

        __CLR4_1_101oyt1oytlusqkijx.R.inc(79030);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79031);Assert.assertEquals(3, result.size());
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79032);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79033);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79034);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}
    
    public void test_list_not_in_null() throws Exception {__CLR4_1_101oyt1oytlusqkijx.R.globalSliceStart(getClass().getName(),79035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1094kv0o1ozf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oyt1oytlusqkijx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oyt1oytlusqkijx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_not_in_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79035,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1094kv0o1ozf() throws Exception{try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79035);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79036);JSONPath path = new JSONPath("[id not in (null)]");
        
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79037);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79038);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79039);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79040);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79041);entities.add(new Entity(1004, null));
        
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79042);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79043);Assert.assertEquals(4, result.size());
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79044);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79045);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79046);Assert.assertSame(entities.get(2), result.get(2));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79047);Assert.assertSame(entities.get(3), result.get(3));
    }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}
    
    public void test_list_in_2() throws Exception {__CLR4_1_101oyt1oytlusqkijx.R.globalSliceStart(getClass().getName(),79048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tm9n9p1ozs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oyt1oytlusqkijx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oyt1oytlusqkijx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79048,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tm9n9p1ozs() throws Exception{try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79048);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79049);JSONPath path = new JSONPath("[id in (1001, 1003)]");
        
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79050);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79051);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79052);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79053);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79054);entities.add(new Entity(1004, null));
        
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79055);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79056);Assert.assertEquals(2, result.size());
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79057);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79058);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}
    
    public void test_list_in_3() throws Exception {__CLR4_1_101oyt1oytlusqkijx.R.globalSliceStart(getClass().getName(),79059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qd9oh81p03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oyt1oytlusqkijx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oyt1oytlusqkijx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79059,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qd9oh81p03() throws Exception{try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79059);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79060);JSONPath path = new JSONPath("[id in (1001, 1003, 1004)]");
        
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79061);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79062);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79063);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79064);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79065);entities.add(new Entity(1004, null));
        
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79066);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79067);Assert.assertEquals(3, result.size());
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79068);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79069);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79070);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}
    
    public void test_list_in_3_null() throws Exception {__CLR4_1_101oyt1oytlusqkijx.R.globalSliceStart(getClass().getName(),79071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ewx3sw1p0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oyt1oytlusqkijx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oyt1oytlusqkijx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_decimal.test_list_in_3_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79071,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ewx3sw1p0f() throws Exception{try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79071);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79072);JSONPath path = new JSONPath("[id in (1001, 1003, null)]");
        
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79073);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79074);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79075);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79076);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79077);entities.add(new Entity(null, null));
        
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79078);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79079);Assert.assertEquals(3, result.size());
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79080);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79081);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101oyt1oytlusqkijx.R.inc(79082);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}

    public static class Entity {

        private BigDecimal id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79083);
            __CLR4_1_101oyt1oytlusqkijx.R.inc(79084);if ((((id == null)&&(__CLR4_1_101oyt1oytlusqkijx.R.iget(79085)!=0|true))||(__CLR4_1_101oyt1oytlusqkijx.R.iget(79086)==0&false))) {{
                __CLR4_1_101oyt1oytlusqkijx.R.inc(79087);this.id = null;
            } }else {{
                __CLR4_1_101oyt1oytlusqkijx.R.inc(79088);this.id = BigDecimal.valueOf(id);
            }

            }__CLR4_1_101oyt1oytlusqkijx.R.inc(79089);this.name = name;
        }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}

        public BigDecimal getId() {try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79090);
            __CLR4_1_101oyt1oytlusqkijx.R.inc(79091);return id;
        }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}

        public void setId(BigDecimal id) {try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79092);
            __CLR4_1_101oyt1oytlusqkijx.R.inc(79093);this.id = id;
        }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79094);
            __CLR4_1_101oyt1oytlusqkijx.R.inc(79095);return name;
        }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101oyt1oytlusqkijx.R.inc(79096);
            __CLR4_1_101oyt1oytlusqkijx.R.inc(79097);this.name = name;
        }finally{__CLR4_1_101oyt1oytlusqkijx.R.flushNeeded();}}

    }
}
