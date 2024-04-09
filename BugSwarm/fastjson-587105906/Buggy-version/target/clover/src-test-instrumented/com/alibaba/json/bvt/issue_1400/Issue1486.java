/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.util.List;

public class Issue1486 extends TestCase {static class __CLR4_1_101akw1akwlusqk9ow{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,60391,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101akw1akwlusqk9ow.R.globalSliceStart(getClass().getName(),60368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1akw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101akw1akwlusqk9ow.R.rethrow($CLV_t2$);}finally{__CLR4_1_101akw1akwlusqk9ow.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1486.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60368,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1akw() throws Exception{try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60368);

        __CLR4_1_101akw1akwlusqk9ow.R.inc(60369);String json = "[{\"song_list\":[{\"val\":1,\"v_al\":2},{\"val\":2,\"v_al\":2},{\"val\":3,\"v_al\":2}],\"songlist\":\"v_al\"}]";
        __CLR4_1_101akw1akwlusqk9ow.R.inc(60370);List<Value> parseObject = JSON.parseObject(json, new TypeReference<List<Value>>() {
        });
        __CLR4_1_101akw1akwlusqk9ow.R.inc(60371);for (Value value : parseObject) {{
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60372);System.out.println(value.songList + "  " );
        }
    }}finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}

    public static class Value {
        @JSONField(alternateNames = {"song_list", "songList"})
        List<Value2> songList;

        @JSONField(alternateNames = {"songlist"})
        String songlist;

        public List<Value2> getSongList() {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60373);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60374);return songList;
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}

        public void setSongList(List<Value2> songList) {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60375);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60376);this.songList = songList;
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}

        public String getSonglist() {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60377);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60378);return songlist;
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}

        public void setSonglist(String songlist) {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60379);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60380);this.songlist = songlist;
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}
    }

    public static class Value2 {
        int val;

        int v_al;

        public int getVal() {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60381);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60382);return val;
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}

        public void setVal(int val) {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60383);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60384);this.val = val;
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}

        public int getV_al() {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60385);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60386);return v_al;
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}

        public void setV_al(int v_al) {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60387);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60388);this.v_al = v_al;
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_101akw1akwlusqk9ow.R.inc(60389);
            __CLR4_1_101akw1akwlusqk9ow.R.inc(60390);return "Value2{" +
                    "val=" + val +
                    ", v_al=" + v_al +
                    '}';
        }finally{__CLR4_1_101akw1akwlusqk9ow.R.flushNeeded();}}
    }
}
