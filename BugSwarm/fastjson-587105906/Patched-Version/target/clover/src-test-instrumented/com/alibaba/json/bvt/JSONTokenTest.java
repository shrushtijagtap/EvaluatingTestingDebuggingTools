/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONToken;

public class JSONTokenTest extends TestCase {static class __CLR4_5_2yayyaylusvn2zk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,44482,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_2yayyaylusvn2zk.R.globalSliceStart(getClass().getName(),44458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2yay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yayyaylusvn2zk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yayyaylusvn2zk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTokenTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2yay() throws Exception{try{__CLR4_5_2yayyaylusvn2zk.R.inc(44458);
        __CLR4_5_2yayyaylusvn2zk.R.inc(44459);new JSONToken();
        
        __CLR4_5_2yayyaylusvn2zk.R.inc(44460);Assert.assertEquals("int", JSONToken.name(JSONToken.LITERAL_INT));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44461);Assert.assertEquals("float", JSONToken.name(JSONToken.LITERAL_FLOAT));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44462);Assert.assertEquals("string", JSONToken.name(JSONToken.LITERAL_STRING));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44463);Assert.assertEquals("iso8601", JSONToken.name(JSONToken.LITERAL_ISO8601_DATE));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44464);Assert.assertEquals("true", JSONToken.name(JSONToken.TRUE));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44465);Assert.assertEquals("false", JSONToken.name(JSONToken.FALSE));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44466);Assert.assertEquals("null", JSONToken.name(JSONToken.NULL));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44467);Assert.assertEquals("new", JSONToken.name(JSONToken.NEW));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44468);Assert.assertEquals("(", JSONToken.name(JSONToken.LPAREN));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44469);Assert.assertEquals(")", JSONToken.name(JSONToken.RPAREN));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44470);Assert.assertEquals("{", JSONToken.name(JSONToken.LBRACE));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44471);Assert.assertEquals("}", JSONToken.name(JSONToken.RBRACE));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44472);Assert.assertEquals("[", JSONToken.name(JSONToken.LBRACKET));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44473);Assert.assertEquals("]", JSONToken.name(JSONToken.RBRACKET));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44474);Assert.assertEquals(",", JSONToken.name(JSONToken.COMMA));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44475);Assert.assertEquals(":", JSONToken.name(JSONToken.COLON));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44476);Assert.assertEquals("ident", JSONToken.name(JSONToken.IDENTIFIER));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44477);Assert.assertEquals("fieldName", JSONToken.name(JSONToken.FIELD_NAME));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44478);Assert.assertEquals("EOF", JSONToken.name(JSONToken.EOF));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44479);Assert.assertEquals("Unknown", JSONToken.name(Integer.MAX_VALUE));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44480);Assert.assertEquals("Set", JSONToken.name(JSONToken.SET));
        __CLR4_5_2yayyaylusvn2zk.R.inc(44481);Assert.assertEquals("TreeSet", JSONToken.name(JSONToken.TREE_SET));
    }finally{__CLR4_5_2yayyaylusvn2zk.R.flushNeeded();}}
}
