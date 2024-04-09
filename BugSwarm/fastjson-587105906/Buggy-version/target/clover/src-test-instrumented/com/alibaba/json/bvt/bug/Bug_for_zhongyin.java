/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Bug_for_zhongyin extends TestCase {static class __CLR4_1_10165u165ulusqk61h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,54686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_entity() throws Exception {__CLR4_1_10165u165ulusqk61h.R.globalSliceStart(getClass().getName(),54642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109qqwzt165u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10165u165ulusqk61h.R.rethrow($CLV_t2$);}finally{__CLR4_1_10165u165ulusqk61h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhongyin.test_entity",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),54642,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109qqwzt165u() throws Exception{try{__CLR4_1_10165u165ulusqk61h.R.inc(54642);
        __CLR4_1_10165u165ulusqk61h.R.inc(54643);for (char c = '\u0000'; (((c < ' ')&&(__CLR4_1_10165u165ulusqk61h.R.iget(54644)!=0|true))||(__CLR4_1_10165u165ulusqk61h.R.iget(54645)==0&false)); c++) {{
            __CLR4_1_10165u165ulusqk61h.R.inc(54646);String s = String.valueOf(c) + "entity";
            __CLR4_1_10165u165ulusqk61h.R.inc(54647);String jsons = JSON.toJSONString(new VO(s));
            __CLR4_1_10165u165ulusqk61h.R.inc(54648);System.out.println(jsons);
            __CLR4_1_10165u165ulusqk61h.R.inc(54649);VO v = JSON.parseObject(jsons, VO.class);
            __CLR4_1_10165u165ulusqk61h.R.inc(54650);Assert.assertEquals(s, v.getName());
        }
    }}finally{__CLR4_1_10165u165ulusqk61h.R.flushNeeded();}}

    public void test_map() throws Exception {__CLR4_1_10165u165ulusqk61h.R.globalSliceStart(getClass().getName(),54651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aaqgyy1663();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10165u165ulusqk61h.R.rethrow($CLV_t2$);}finally{__CLR4_1_10165u165ulusqk61h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhongyin.test_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),54651,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aaqgyy1663() throws Exception{try{__CLR4_1_10165u165ulusqk61h.R.inc(54651);
        __CLR4_1_10165u165ulusqk61h.R.inc(54652);for (char c = '\u0000'; (((c < ' ')&&(__CLR4_1_10165u165ulusqk61h.R.iget(54653)!=0|true))||(__CLR4_1_10165u165ulusqk61h.R.iget(54654)==0&false)); c++) {{
            __CLR4_1_10165u165ulusqk61h.R.inc(54655);String s = String.valueOf(c) + "map";
            __CLR4_1_10165u165ulusqk61h.R.inc(54656);String jsons = JSON.toJSONString(Collections.singletonMap("value", s));
            __CLR4_1_10165u165ulusqk61h.R.inc(54657);System.out.println(jsons);

            __CLR4_1_10165u165ulusqk61h.R.inc(54658);JSONObject o = JSON.parseObject(jsons);
            __CLR4_1_10165u165ulusqk61h.R.inc(54659);Assert.assertEquals(s, o.getString("value"));
        }
    }}finally{__CLR4_1_10165u165ulusqk61h.R.flushNeeded();}}
    
    public  void test_0() throws Exception {__CLR4_1_10165u165ulusqk61h.R.globalSliceStart(getClass().getName(),54660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2166c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10165u165ulusqk61h.R.rethrow($CLV_t2$);}finally{__CLR4_1_10165u165ulusqk61h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhongyin.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),54660,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2166c() throws Exception{try{__CLR4_1_10165u165ulusqk61h.R.inc(54660);
        __CLR4_1_10165u165ulusqk61h.R.inc(54661);String hex = "41544D20E58F96E78EB0EFBC8DE993B6E88194E5908CE59F8E1A20E4BD9BE5B1B1E5B882E7A685E59F8EE58CBAE7A596E5BA99E8B7AF201A33331A20E58FB7E799BEE88AB1E5B9BFE59CBAE9A696E5B182201A";
        __CLR4_1_10165u165ulusqk61h.R.inc(54662);String result = getHexStr(hex);
        
        __CLR4_1_10165u165ulusqk61h.R.inc(54663);Map <String , Object>map = new HashMap<String, Object>();
        __CLR4_1_10165u165ulusqk61h.R.inc(54664);map.put("aaa" , result);
        __CLR4_1_10165u165ulusqk61h.R.inc(54665);String stringV = JSON.toJSONString(map);
        __CLR4_1_10165u165ulusqk61h.R.inc(54666);System.out.println(stringV);
        __CLR4_1_10165u165ulusqk61h.R.inc(54667);JSONObject o = JSON.parseObject(stringV);
        __CLR4_1_10165u165ulusqk61h.R.inc(54668);System.out.println(o.getString("aaa"));
        
    }finally{__CLR4_1_10165u165ulusqk61h.R.flushNeeded();}}
    
    private String getHexStr(String hex) throws UnsupportedEncodingException {try{__CLR4_1_10165u165ulusqk61h.R.inc(54669);
        __CLR4_1_10165u165ulusqk61h.R.inc(54670);byte []bytes = new byte[hex.length() / 2];
        __CLR4_1_10165u165ulusqk61h.R.inc(54671);for(int i = 0 ; (((i < bytes.length )&&(__CLR4_1_10165u165ulusqk61h.R.iget(54672)!=0|true))||(__CLR4_1_10165u165ulusqk61h.R.iget(54673)==0&false)); i++) {{
            __CLR4_1_10165u165ulusqk61h.R.inc(54674);String v = hex.substring(i * 2 , i * 2 + 2);
            __CLR4_1_10165u165ulusqk61h.R.inc(54675);bytes[i] = (byte)Integer.parseInt(v , 16);
        }
        }__CLR4_1_10165u165ulusqk61h.R.inc(54676);String str = new String(bytes , "UTF-8");
        __CLR4_1_10165u165ulusqk61h.R.inc(54677);System.out.println(str);
        __CLR4_1_10165u165ulusqk61h.R.inc(54678);return str;
    }finally{__CLR4_1_10165u165ulusqk61h.R.flushNeeded();}}

    public static class VO {

        private String name;

        public VO(){try{__CLR4_1_10165u165ulusqk61h.R.inc(54679);

        }finally{__CLR4_1_10165u165ulusqk61h.R.flushNeeded();}}

        public VO(String name){try{__CLR4_1_10165u165ulusqk61h.R.inc(54680);
            __CLR4_1_10165u165ulusqk61h.R.inc(54681);this.name = name;
        }finally{__CLR4_1_10165u165ulusqk61h.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10165u165ulusqk61h.R.inc(54682);
            __CLR4_1_10165u165ulusqk61h.R.inc(54683);return name;
        }finally{__CLR4_1_10165u165ulusqk61h.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10165u165ulusqk61h.R.inc(54684);
            __CLR4_1_10165u165ulusqk61h.R.inc(54685);this.name = name;
        }finally{__CLR4_1_10165u165ulusqk61h.R.flushNeeded();}}

    }

}
