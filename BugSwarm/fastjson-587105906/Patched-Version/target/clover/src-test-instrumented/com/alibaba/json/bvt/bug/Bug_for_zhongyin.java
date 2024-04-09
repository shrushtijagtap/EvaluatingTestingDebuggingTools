/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Bug_for_zhongyin extends TestCase {static class __CLR4_5_2173r173rlusvn7ht{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55907,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_entity() throws Exception {__CLR4_5_2173r173rlusvn7ht.R.globalSliceStart(getClass().getName(),55863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29qqwzt173r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2173r173rlusvn7ht.R.rethrow($CLV_t2$);}finally{__CLR4_5_2173r173rlusvn7ht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhongyin.test_entity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55863,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29qqwzt173r() throws Exception{try{__CLR4_5_2173r173rlusvn7ht.R.inc(55863);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55864);for (char c = '\u0000'; (((c < ' ')&&(__CLR4_5_2173r173rlusvn7ht.R.iget(55865)!=0|true))||(__CLR4_5_2173r173rlusvn7ht.R.iget(55866)==0&false)); c++) {{
            __CLR4_5_2173r173rlusvn7ht.R.inc(55867);String s = String.valueOf(c) + "entity";
            __CLR4_5_2173r173rlusvn7ht.R.inc(55868);String jsons = JSON.toJSONString(new VO(s));
            __CLR4_5_2173r173rlusvn7ht.R.inc(55869);System.out.println(jsons);
            __CLR4_5_2173r173rlusvn7ht.R.inc(55870);VO v = JSON.parseObject(jsons, VO.class);
            __CLR4_5_2173r173rlusvn7ht.R.inc(55871);Assert.assertEquals(s, v.getName());
        }
    }}finally{__CLR4_5_2173r173rlusvn7ht.R.flushNeeded();}}

    public void test_map() throws Exception {__CLR4_5_2173r173rlusvn7ht.R.globalSliceStart(getClass().getName(),55872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyy1740();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2173r173rlusvn7ht.R.rethrow($CLV_t2$);}finally{__CLR4_5_2173r173rlusvn7ht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhongyin.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyy1740() throws Exception{try{__CLR4_5_2173r173rlusvn7ht.R.inc(55872);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55873);for (char c = '\u0000'; (((c < ' ')&&(__CLR4_5_2173r173rlusvn7ht.R.iget(55874)!=0|true))||(__CLR4_5_2173r173rlusvn7ht.R.iget(55875)==0&false)); c++) {{
            __CLR4_5_2173r173rlusvn7ht.R.inc(55876);String s = String.valueOf(c) + "map";
            __CLR4_5_2173r173rlusvn7ht.R.inc(55877);String jsons = JSON.toJSONString(Collections.singletonMap("value", s));
            __CLR4_5_2173r173rlusvn7ht.R.inc(55878);System.out.println(jsons);

            __CLR4_5_2173r173rlusvn7ht.R.inc(55879);JSONObject o = JSON.parseObject(jsons);
            __CLR4_5_2173r173rlusvn7ht.R.inc(55880);Assert.assertEquals(s, o.getString("value"));
        }
    }}finally{__CLR4_5_2173r173rlusvn7ht.R.flushNeeded();}}
    
    public  void test_0() throws Exception {__CLR4_5_2173r173rlusvn7ht.R.globalSliceStart(getClass().getName(),55881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21749();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2173r173rlusvn7ht.R.rethrow($CLV_t2$);}finally{__CLR4_5_2173r173rlusvn7ht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhongyin.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21749() throws Exception{try{__CLR4_5_2173r173rlusvn7ht.R.inc(55881);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55882);String hex = "41544D20E58F96E78EB0EFBC8DE993B6E88194E5908CE59F8E1A20E4BD9BE5B1B1E5B882E7A685E59F8EE58CBAE7A596E5BA99E8B7AF201A33331A20E58FB7E799BEE88AB1E5B9BFE59CBAE9A696E5B182201A";
        __CLR4_5_2173r173rlusvn7ht.R.inc(55883);String result = getHexStr(hex);
        
        __CLR4_5_2173r173rlusvn7ht.R.inc(55884);Map <String , Object>map = new HashMap<String, Object>();
        __CLR4_5_2173r173rlusvn7ht.R.inc(55885);map.put("aaa" , result);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55886);String stringV = JSON.toJSONString(map);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55887);System.out.println(stringV);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55888);JSONObject o = JSON.parseObject(stringV);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55889);System.out.println(o.getString("aaa"));
        
    }finally{__CLR4_5_2173r173rlusvn7ht.R.flushNeeded();}}
    
    private String getHexStr(String hex) throws UnsupportedEncodingException {try{__CLR4_5_2173r173rlusvn7ht.R.inc(55890);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55891);byte []bytes = new byte[hex.length() / 2];
        __CLR4_5_2173r173rlusvn7ht.R.inc(55892);for(int i = 0 ; (((i < bytes.length )&&(__CLR4_5_2173r173rlusvn7ht.R.iget(55893)!=0|true))||(__CLR4_5_2173r173rlusvn7ht.R.iget(55894)==0&false)); i++) {{
            __CLR4_5_2173r173rlusvn7ht.R.inc(55895);String v = hex.substring(i * 2 , i * 2 + 2);
            __CLR4_5_2173r173rlusvn7ht.R.inc(55896);bytes[i] = (byte)Integer.parseInt(v , 16);
        }
        }__CLR4_5_2173r173rlusvn7ht.R.inc(55897);String str = new String(bytes , "UTF-8");
        __CLR4_5_2173r173rlusvn7ht.R.inc(55898);System.out.println(str);
        __CLR4_5_2173r173rlusvn7ht.R.inc(55899);return str;
    }finally{__CLR4_5_2173r173rlusvn7ht.R.flushNeeded();}}

    public static class VO {

        private String name;

        public VO(){try{__CLR4_5_2173r173rlusvn7ht.R.inc(55900);

        }finally{__CLR4_5_2173r173rlusvn7ht.R.flushNeeded();}}

        public VO(String name){try{__CLR4_5_2173r173rlusvn7ht.R.inc(55901);
            __CLR4_5_2173r173rlusvn7ht.R.inc(55902);this.name = name;
        }finally{__CLR4_5_2173r173rlusvn7ht.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2173r173rlusvn7ht.R.inc(55903);
            __CLR4_5_2173r173rlusvn7ht.R.inc(55904);return name;
        }finally{__CLR4_5_2173r173rlusvn7ht.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2173r173rlusvn7ht.R.inc(55905);
            __CLR4_5_2173r173rlusvn7ht.R.inc(55906);this.name = name;
        }finally{__CLR4_5_2173r173rlusvn7ht.R.flushNeeded();}}

    }

}
