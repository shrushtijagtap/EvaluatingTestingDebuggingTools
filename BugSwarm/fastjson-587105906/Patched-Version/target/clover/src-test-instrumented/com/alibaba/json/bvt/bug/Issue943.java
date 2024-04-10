/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by wenshao on 09/12/2016.
 */
public class Issue943 extends TestCase {static class __CLR4_5_217kx17kxlusyjsff{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,56510,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_217kx17kxlusyjsff.R.globalSliceStart(getClass().getName(),56481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb17kx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217kx17kxlusyjsff.R.rethrow($CLV_t2$);}finally{__CLR4_5_217kx17kxlusyjsff.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue943.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb17kx() throws Exception{try{__CLR4_5_217kx17kxlusyjsff.R.inc(56481);
        __CLR4_5_217kx17kxlusyjsff.R.inc(56482);String text = "{\n" +
                "\t\"symbols\":[\n" +
                "\t    {\"id\":1,\"type\":\"SCATTER\"},\n" +
                "\t    {\"id\":2,\"type\":\"BONUS\"}\n" +
                "\t]\n" +
                "}";

        __CLR4_5_217kx17kxlusyjsff.R.inc(56483);JSONObject root = JSON.parseObject(text);

        __CLR4_5_217kx17kxlusyjsff.R.inc(56484);JSONArray symbols = root.getJSONArray("symbols");
        __CLR4_5_217kx17kxlusyjsff.R.inc(56485);assertNotNull(symbols);
        __CLR4_5_217kx17kxlusyjsff.R.inc(56486);assertEquals(2, symbols.size());
        __CLR4_5_217kx17kxlusyjsff.R.inc(56487);assertEquals(1, symbols.getJSONObject(0).get("id"));
        __CLR4_5_217kx17kxlusyjsff.R.inc(56488);assertEquals("SCATTER", symbols.getJSONObject(0).get("type"));

        __CLR4_5_217kx17kxlusyjsff.R.inc(56489);assertEquals(2, symbols.getJSONObject(1).get("id"));
        __CLR4_5_217kx17kxlusyjsff.R.inc(56490);assertEquals("BONUS", symbols.getJSONObject(1).get("type"));

        __CLR4_5_217kx17kxlusyjsff.R.inc(56491);SlotConfig slotConfig = JSON.parseObject(text, SlotConfig.class);

        __CLR4_5_217kx17kxlusyjsff.R.inc(56492);assertNotNull(slotConfig);
        __CLR4_5_217kx17kxlusyjsff.R.inc(56493);assertEquals(2, slotConfig.symbols.size());
        __CLR4_5_217kx17kxlusyjsff.R.inc(56494);assertEquals(1, slotConfig.symbols.get(0).getId());
        __CLR4_5_217kx17kxlusyjsff.R.inc(56495);assertEquals(SymbolType.SCATTER, slotConfig.symbols.get(0).getType());

        __CLR4_5_217kx17kxlusyjsff.R.inc(56496);assertEquals(2, slotConfig.symbols.get(1).getId());
        __CLR4_5_217kx17kxlusyjsff.R.inc(56497);assertEquals(SymbolType.BONUS, slotConfig.symbols.get(1).getType());

    }finally{__CLR4_5_217kx17kxlusyjsff.R.flushNeeded();}}

    private static class SlotConfig {
        private List<Symbol> symbols;

        public List<Symbol> getSymbols() {try{__CLR4_5_217kx17kxlusyjsff.R.inc(56498);
            __CLR4_5_217kx17kxlusyjsff.R.inc(56499);return symbols;
        }finally{__CLR4_5_217kx17kxlusyjsff.R.flushNeeded();}}

        public void setSymbols(List<Symbol> symbols) {try{__CLR4_5_217kx17kxlusyjsff.R.inc(56500);
            __CLR4_5_217kx17kxlusyjsff.R.inc(56501);this.symbols = symbols;
        }finally{__CLR4_5_217kx17kxlusyjsff.R.flushNeeded();}}
    }

    private static class Symbol {
        private int id;

        private SymbolType type;

        public int getId() {try{__CLR4_5_217kx17kxlusyjsff.R.inc(56502);
            __CLR4_5_217kx17kxlusyjsff.R.inc(56503);return id;
        }finally{__CLR4_5_217kx17kxlusyjsff.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_217kx17kxlusyjsff.R.inc(56504);
            __CLR4_5_217kx17kxlusyjsff.R.inc(56505);this.id = id;
        }finally{__CLR4_5_217kx17kxlusyjsff.R.flushNeeded();}}

        public SymbolType getType() {try{__CLR4_5_217kx17kxlusyjsff.R.inc(56506);
            __CLR4_5_217kx17kxlusyjsff.R.inc(56507);return type;
        }finally{__CLR4_5_217kx17kxlusyjsff.R.flushNeeded();}}

        public void setType(SymbolType type) {try{__CLR4_5_217kx17kxlusyjsff.R.inc(56508);
            __CLR4_5_217kx17kxlusyjsff.R.inc(56509);this.type = type;
        }finally{__CLR4_5_217kx17kxlusyjsff.R.flushNeeded();}}
    }

    enum SymbolType {
        NORMAL, WILD, SCATTER, BONUS
    }
}
