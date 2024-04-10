/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_rlike extends TestCase {static class __CLR4_1_101qb31qb3luszwekb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,80842,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_1_101qb31qb3luszwekb.R.globalSliceStart(getClass().getName(),80751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109501zo1qb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qb31qb3luszwekb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qb31qb3luszwekb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80751,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109501zo1qb3() throws Exception{try{__CLR4_1_101qb31qb3luszwekb.R.inc(80751);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80752);JSONPath path = new JSONPath("$[name rlike 'ljw2083']");

        __CLR4_1_101qb31qb3luszwekb.R.inc(80753);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101qb31qb3luszwekb.R.inc(80754);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80755);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80756);entities.add(new Entity(1003, null));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80757);entities.add(new Entity(null, null));

        __CLR4_1_101qb31qb3luszwekb.R.inc(80758);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80759);Assert.assertEquals(1, result.size());
        __CLR4_1_101qb31qb3luszwekb.R.inc(80760);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_1_101qb31qb3luszwekb.R.globalSliceStart(getClass().getName(),80761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bzg58g1qbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qb31qb3luszwekb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qb31qb3luszwekb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_not_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80761,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bzg58g1qbd() throws Exception{try{__CLR4_1_101qb31qb3luszwekb.R.inc(80761);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80762);JSONPath path = new JSONPath("$[name not rlike 'wenshao']");

        __CLR4_1_101qb31qb3luszwekb.R.inc(80763);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101qb31qb3luszwekb.R.inc(80764);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80765);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80766);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80767);entities.add(new Entity(null, null));

        __CLR4_1_101qb31qb3luszwekb.R.inc(80768);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80769);Assert.assertEquals(2, result.size());
        __CLR4_1_101qb31qb3luszwekb.R.inc(80770);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80771);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_1_101qb31qb3luszwekb.R.globalSliceStart(getClass().getName(),80772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nsd1s81qbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qb31qb3luszwekb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qb31qb3luszwekb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_left_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80772,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nsd1s81qbo() throws Exception{try{__CLR4_1_101qb31qb3luszwekb.R.inc(80772);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80773);JSONPath path = new JSONPath("$[?(@.name like 'ljw%')]");

        __CLR4_1_101qb31qb3luszwekb.R.inc(80774);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101qb31qb3luszwekb.R.inc(80775);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80776);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80777);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80778);entities.add(new Entity(null, null));

        __CLR4_1_101qb31qb3luszwekb.R.inc(80779);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80780);Assert.assertEquals(1, result.size());
        __CLR4_1_101qb31qb3luszwekb.R.inc(80781);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_1_101qb31qb3luszwekb.R.globalSliceStart(getClass().getName(),80782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hx3bmz1qby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qb31qb3luszwekb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qb31qb3luszwekb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_right_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80782,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hx3bmz1qby() throws Exception{try{__CLR4_1_101qb31qb3luszwekb.R.inc(80782);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80783);JSONPath path = new JSONPath("$[?(@.name like '%2083')]");

        __CLR4_1_101qb31qb3luszwekb.R.inc(80784);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101qb31qb3luszwekb.R.inc(80785);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80786);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80787);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80788);entities.add(new Entity(null, null));

        __CLR4_1_101qb31qb3luszwekb.R.inc(80789);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80790);Assert.assertEquals(1, result.size());
        __CLR4_1_101qb31qb3luszwekb.R.inc(80791);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_1_101qb31qb3luszwekb.R.globalSliceStart(getClass().getName(),80792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fwgg9y1qc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qb31qb3luszwekb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qb31qb3luszwekb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_contains",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80792,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fwgg9y1qc8() throws Exception{try{__CLR4_1_101qb31qb3luszwekb.R.inc(80792);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80793);JSONPath path = new JSONPath("$[?(@.name like '%208%')]");

        __CLR4_1_101qb31qb3luszwekb.R.inc(80794);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101qb31qb3luszwekb.R.inc(80795);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80796);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80797);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80798);entities.add(new Entity(null, null));

        __CLR4_1_101qb31qb3luszwekb.R.inc(80799);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80800);Assert.assertEquals(1, result.size());
        __CLR4_1_101qb31qb3luszwekb.R.inc(80801);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_1_101qb31qb3luszwekb.R.globalSliceStart(getClass().getName(),80802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kxs5ka1qci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qb31qb3luszwekb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qb31qb3luszwekb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80802,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kxs5ka1qci() throws Exception{try{__CLR4_1_101qb31qb3luszwekb.R.inc(80802);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80803);JSONPath path = new JSONPath("$[?(@.name like 'ljw%83')]");

        __CLR4_1_101qb31qb3luszwekb.R.inc(80804);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101qb31qb3luszwekb.R.inc(80805);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80806);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80807);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80808);entities.add(new Entity(null, null));

        __CLR4_1_101qb31qb3luszwekb.R.inc(80809);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80810);Assert.assertEquals(1, result.size());
        __CLR4_1_101qb31qb3luszwekb.R.inc(80811);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_1_101qb31qb3luszwekb.R.globalSliceStart(getClass().getName(),80812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10clwq6v1qcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qb31qb3luszwekb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qb31qb3luszwekb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80812,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10clwq6v1qcs() throws Exception{try{__CLR4_1_101qb31qb3luszwekb.R.inc(80812);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80813);JSONPath path = new JSONPath("$[?(@.name like 'ljw%w2083')]");
        
        __CLR4_1_101qb31qb3luszwekb.R.inc(80814);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101qb31qb3luszwekb.R.inc(80815);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80816);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80817);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80818);entities.add(new Entity(null, null));
        
        __CLR4_1_101qb31qb3luszwekb.R.inc(80819);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80820);Assert.assertEquals(0, result.size());
    }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_1_101qb31qb3luszwekb.R.globalSliceStart(getClass().getName(),80821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109cwree1qd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qb31qb3luszwekb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qb31qb3luszwekb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80821,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109cwree1qd1() throws Exception{try{__CLR4_1_101qb31qb3luszwekb.R.inc(80821);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80822);JSONPath path = new JSONPath("$[?(@.name like 'ljw%2%0%83')]");
        
        __CLR4_1_101qb31qb3luszwekb.R.inc(80823);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101qb31qb3luszwekb.R.inc(80824);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80825);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80826);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101qb31qb3luszwekb.R.inc(80827);entities.add(new Entity(null, null));
        
        __CLR4_1_101qb31qb3luszwekb.R.inc(80828);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101qb31qb3luszwekb.R.inc(80829);Assert.assertEquals(1, result.size());
        __CLR4_1_101qb31qb3luszwekb.R.inc(80830);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101qb31qb3luszwekb.R.inc(80831);
            __CLR4_1_101qb31qb3luszwekb.R.inc(80832);this.id = id;
            __CLR4_1_101qb31qb3luszwekb.R.inc(80833);this.name = name;
        }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101qb31qb3luszwekb.R.inc(80834);
            __CLR4_1_101qb31qb3luszwekb.R.inc(80835);return id;
        }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101qb31qb3luszwekb.R.inc(80836);
            __CLR4_1_101qb31qb3luszwekb.R.inc(80837);this.id = id;
        }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101qb31qb3luszwekb.R.inc(80838);
            __CLR4_1_101qb31qb3luszwekb.R.inc(80839);return name;
        }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101qb31qb3luszwekb.R.inc(80840);
            __CLR4_1_101qb31qb3luszwekb.R.inc(80841);this.name = name;
        }finally{__CLR4_1_101qb31qb3luszwekb.R.flushNeeded();}}

    }
}
