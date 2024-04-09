/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Bug_for_NonStringKeyMap extends TestCase {static class __CLR4_1_1013bl13bllusqk21v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,50982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_1013bl13bllusqk21v.R.inc(50961);
        __CLR4_1_1013bl13bllusqk21v.R.inc(50962);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_NonStringKeyMap.");
    }finally{__CLR4_1_1013bl13bllusqk21v.R.flushNeeded();}}

    public void test_bug() throws Exception {__CLR4_1_1013bl13bllusqk21v.R.globalSliceStart(getClass().getName(),50963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a1x2ge13bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013bl13bllusqk21v.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013bl13bllusqk21v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_NonStringKeyMap.test_bug",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50963,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a1x2ge13bn() throws Exception{try{__CLR4_1_1013bl13bllusqk21v.R.inc(50963);
        __CLR4_1_1013bl13bllusqk21v.R.inc(50964);VO vo = new VO();
        __CLR4_1_1013bl13bllusqk21v.R.inc(50965);vo.getMap().put(1L, new VAL());
        
        __CLR4_1_1013bl13bllusqk21v.R.inc(50966);String text = JSON.toJSONString(vo, SerializerFeature.WriteClassName);
        __CLR4_1_1013bl13bllusqk21v.R.inc(50967);System.out.println(text);
        
        __CLR4_1_1013bl13bllusqk21v.R.inc(50968);JSON.parse(text);
    }finally{__CLR4_1_1013bl13bllusqk21v.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_1013bl13bllusqk21v.R.globalSliceStart(getClass().getName(),50969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl13bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013bl13bllusqk21v.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013bl13bllusqk21v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_NonStringKeyMap.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50969,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl13bt() throws Exception{try{__CLR4_1_1013bl13bllusqk21v.R.inc(50969);
        __CLR4_1_1013bl13bllusqk21v.R.inc(50970);Map<Map<String, String>, String> map = new HashMap<Map<String, String>, String>();
        __CLR4_1_1013bl13bllusqk21v.R.inc(50971);Map<String, String> submap = new HashMap<String, String>();
        __CLR4_1_1013bl13bllusqk21v.R.inc(50972);submap.put("subkey", "subvalue");
        __CLR4_1_1013bl13bllusqk21v.R.inc(50973);map.put(submap, "value");
        __CLR4_1_1013bl13bllusqk21v.R.inc(50974);String jsonString = JSON.toJSONString(map, SerializerFeature.WriteClassName);
        __CLR4_1_1013bl13bllusqk21v.R.inc(50975);System.out.println(jsonString);
        __CLR4_1_1013bl13bllusqk21v.R.inc(50976);Object object = JSON.parse(jsonString);
        __CLR4_1_1013bl13bllusqk21v.R.inc(50977);System.out.println(object.toString());
    }finally{__CLR4_1_1013bl13bllusqk21v.R.flushNeeded();}}

    public static class VO {

        private Map<Long, VAL> map = new HashMap<Long, VAL>();

        public Map<Long, VAL> getMap() {try{__CLR4_1_1013bl13bllusqk21v.R.inc(50978);
            __CLR4_1_1013bl13bllusqk21v.R.inc(50979);return map;
        }finally{__CLR4_1_1013bl13bllusqk21v.R.flushNeeded();}}

        public void setMap(Map<Long, VAL> map) {try{__CLR4_1_1013bl13bllusqk21v.R.inc(50980);
            __CLR4_1_1013bl13bllusqk21v.R.inc(50981);this.map = map;
        }finally{__CLR4_1_1013bl13bllusqk21v.R.flushNeeded();}}

    }

    public static class VAL {

    }
}
