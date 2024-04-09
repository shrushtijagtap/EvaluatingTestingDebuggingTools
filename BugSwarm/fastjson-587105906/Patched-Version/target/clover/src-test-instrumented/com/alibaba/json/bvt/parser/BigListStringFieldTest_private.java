/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class BigListStringFieldTest_private extends TestCase {static class __CLR4_5_21fzz1fzzlusvncc6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,67434,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_list() throws Exception {__CLR4_5_21fzz1fzzlusvncc6.R.globalSliceStart(getClass().getName(),67391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1fzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fzz1fzzlusvncc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fzz1fzzlusvncc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.BigListStringFieldTest_private.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1fzz() throws Exception{try{__CLR4_5_21fzz1fzzlusvncc6.R.inc(67391);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67392);Model model = new Model();
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67393);model.values = new ArrayList<String>(10000);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67394);for (int i = 0; (((i < 10000)&&(__CLR4_5_21fzz1fzzlusvncc6.R.iget(67395)!=0|true))||(__CLR4_5_21fzz1fzzlusvncc6.R.iget(67396)==0&false)); ++i) {{
            __CLR4_5_21fzz1fzzlusvncc6.R.inc(67397);String value = random(100);
            __CLR4_5_21fzz1fzzlusvncc6.R.inc(67398);model.values.add(value);
        }
        }__CLR4_5_21fzz1fzzlusvncc6.R.inc(67399);String text = JSON.toJSONString(model);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67400);Model model2 = JSON.parseObject(text, Model.class);
        
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67401);Assert.assertEquals(model.values, model2.values);
    }finally{__CLR4_5_21fzz1fzzlusvncc6.R.flushNeeded();}}
    
    public void test_list_browserComptible() throws Exception {__CLR4_5_21fzz1fzzlusvncc6.R.globalSliceStart(getClass().getName(),67402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbg37u1g0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fzz1fzzlusvncc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fzz1fzzlusvncc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.BigListStringFieldTest_private.test_list_browserComptible",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbg37u1g0a() throws Exception{try{__CLR4_5_21fzz1fzzlusvncc6.R.inc(67402);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67403);Model model = new Model();
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67404);model.values = new ArrayList<String>(10000);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67405);for (int i = 0; (((i < 10000)&&(__CLR4_5_21fzz1fzzlusvncc6.R.iget(67406)!=0|true))||(__CLR4_5_21fzz1fzzlusvncc6.R.iget(67407)==0&false)); ++i) {{
            __CLR4_5_21fzz1fzzlusvncc6.R.inc(67408);String value = random(100);
            __CLR4_5_21fzz1fzzlusvncc6.R.inc(67409);model.values.add(value);
        }
        }__CLR4_5_21fzz1fzzlusvncc6.R.inc(67410);String text = JSON.toJSONString(model, SerializerFeature.BrowserCompatible);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67411);Model model2 = JSON.parseObject(text, Model.class);
        
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67412);Assert.assertEquals(model.values, model2.values);
    }finally{__CLR4_5_21fzz1fzzlusvncc6.R.flushNeeded();}}
    
    public void test_list_browserSecure() throws Exception {__CLR4_5_21fzz1fzzlusvncc6.R.globalSliceStart(getClass().getName(),67413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s92t8y1g0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fzz1fzzlusvncc6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fzz1fzzlusvncc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.BigListStringFieldTest_private.test_list_browserSecure",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s92t8y1g0l() throws Exception{try{__CLR4_5_21fzz1fzzlusvncc6.R.inc(67413);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67414);Model model = new Model();
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67415);model.values = new ArrayList<String>(10000);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67416);for (int i = 0; (((i < 10000)&&(__CLR4_5_21fzz1fzzlusvncc6.R.iget(67417)!=0|true))||(__CLR4_5_21fzz1fzzlusvncc6.R.iget(67418)==0&false)); ++i) {{
            __CLR4_5_21fzz1fzzlusvncc6.R.inc(67419);String value = random(100);
            __CLR4_5_21fzz1fzzlusvncc6.R.inc(67420);model.values.add(value);
        }
        }__CLR4_5_21fzz1fzzlusvncc6.R.inc(67421);String text = JSON.toJSONString(model, SerializerFeature.BrowserSecure);

        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67422);text = text.replaceAll("&lt;", "<");
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67423);text = text.replaceAll("&gt;", ">");
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67424);Model model2 = JSON.parseObject(text, Model.class);
        
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67425);Assert.assertEquals(model.values, model2.values);
    }finally{__CLR4_5_21fzz1fzzlusvncc6.R.flushNeeded();}}
    
    private static class Model {
        public List<String> values;
    }
    
    public String random(int count) {try{__CLR4_5_21fzz1fzzlusvncc6.R.inc(67426);
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67427);Random random = new Random();
        
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67428);char[] chars = new char[count];
        __CLR4_5_21fzz1fzzlusvncc6.R.inc(67429);for (int i = 0; (((i < count)&&(__CLR4_5_21fzz1fzzlusvncc6.R.iget(67430)!=0|true))||(__CLR4_5_21fzz1fzzlusvncc6.R.iget(67431)==0&false)); ++i) {{
            __CLR4_5_21fzz1fzzlusvncc6.R.inc(67432);chars[i] = (char) random.nextInt(256);
        }
        
        }__CLR4_5_21fzz1fzzlusvncc6.R.inc(67433);return new String(chars);
    }finally{__CLR4_5_21fzz1fzzlusvncc6.R.flushNeeded();}}
}
