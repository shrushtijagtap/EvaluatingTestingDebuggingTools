/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class StringFieldTest_special_2 extends TestCase {static class __CLR4_5_2zmqzmqlusyjq94{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,46224,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_special() throws Exception {__CLR4_5_2zmqzmqlusyjq94.R.globalSliceStart(getClass().getName(),46178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25olkgjzmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zmqzmqlusyjq94.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zmqzmqlusyjq94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_2.test_special",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25olkgjzmq() throws Exception{try{__CLR4_5_2zmqzmqlusyjq94.R.inc(46178);
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46179);Model model = new Model();
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46180);StringBuilder buf = new StringBuilder();
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46181);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_5_2zmqzmqlusyjq94.R.iget(46182)!=0|true))||(__CLR4_5_2zmqzmqlusyjq94.R.iget(46183)==0&false)); ++i) {{
            __CLR4_5_2zmqzmqlusyjq94.R.inc(46184);buf.append((char) i);
        }
        }__CLR4_5_2zmqzmqlusyjq94.R.inc(46185);model.name = buf.toString();
        
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46186);String text = JSON.toJSONString(model);

        __CLR4_5_2zmqzmqlusyjq94.R.inc(46187);Model model2 = JSON.parseObject(text, Model.class);
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46188);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_5_2zmqzmqlusyjq94.R.flushNeeded();}}
    
    public void test_special_browsecue() throws Exception {__CLR4_5_2zmqzmqlusyjq94.R.globalSliceStart(getClass().getName(),46189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21f0vi5zn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zmqzmqlusyjq94.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zmqzmqlusyjq94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_2.test_special_browsecue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21f0vi5zn1() throws Exception{try{__CLR4_5_2zmqzmqlusyjq94.R.inc(46189);
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46190);Model model = new Model();
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46191);StringBuilder buf = new StringBuilder();
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46192);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_5_2zmqzmqlusyjq94.R.iget(46193)!=0|true))||(__CLR4_5_2zmqzmqlusyjq94.R.iget(46194)==0&false)); ++i) {{
            __CLR4_5_2zmqzmqlusyjq94.R.inc(46195);buf.append((char) i);
        }
        }__CLR4_5_2zmqzmqlusyjq94.R.inc(46196);model.name = buf.toString();
        
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46197);String text = JSON.toJSONString(model, SerializerFeature.BrowserSecure);
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46198);text = text.replaceAll("&lt;", "<");
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46199);text = text.replaceAll("&gt;", ">");
//        text = text.replaceAll("\\\\/", "/");
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46200);Model model2 = JSON.parseObject(text, Model.class);

        __CLR4_5_2zmqzmqlusyjq94.R.inc(46201);for (int i = 0; (((i < model.name.length() && i < model2.name.length())&&(__CLR4_5_2zmqzmqlusyjq94.R.iget(46202)!=0|true))||(__CLR4_5_2zmqzmqlusyjq94.R.iget(46203)==0&false)); ++i) {{
            __CLR4_5_2zmqzmqlusyjq94.R.inc(46204);char c1 = model.name.charAt(i);
            __CLR4_5_2zmqzmqlusyjq94.R.inc(46205);char c2 = model.name.charAt(i);
            __CLR4_5_2zmqzmqlusyjq94.R.inc(46206);if ((((c1 != c2)&&(__CLR4_5_2zmqzmqlusyjq94.R.iget(46207)!=0|true))||(__CLR4_5_2zmqzmqlusyjq94.R.iget(46208)==0&false))) {{
                __CLR4_5_2zmqzmqlusyjq94.R.inc(46209);System.out.println("diff : " + c1 + " -> " + c2);
                __CLR4_5_2zmqzmqlusyjq94.R.inc(46210);break;
            }
        }}
//        String str = model2.name.substring(65535);
//        System.out.println(str);
        }__CLR4_5_2zmqzmqlusyjq94.R.inc(46211);Assert.assertEquals(model.name.length(), model2.name.length());
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46212);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_5_2zmqzmqlusyjq94.R.flushNeeded();}}
    
    public void test_special_browsecompatible() throws Exception {__CLR4_5_2zmqzmqlusyjq94.R.globalSliceStart(getClass().getName(),46213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tticpkznp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zmqzmqlusyjq94.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zmqzmqlusyjq94.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringFieldTest_special_2.test_special_browsecompatible",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tticpkznp() throws Exception{try{__CLR4_5_2zmqzmqlusyjq94.R.inc(46213);
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46214);Model model = new Model();
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46215);StringBuilder buf = new StringBuilder();
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46216);for (int i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_5_2zmqzmqlusyjq94.R.iget(46217)!=0|true))||(__CLR4_5_2zmqzmqlusyjq94.R.iget(46218)==0&false)); ++i) {{
            __CLR4_5_2zmqzmqlusyjq94.R.inc(46219);buf.append((char) i);
        }
        }__CLR4_5_2zmqzmqlusyjq94.R.inc(46220);model.name = buf.toString();
        
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46221);String text = JSON.toJSONString(model, SerializerFeature.BrowserCompatible);

        __CLR4_5_2zmqzmqlusyjq94.R.inc(46222);Model model2 = JSON.parseObject(text, Model.class);
        __CLR4_5_2zmqzmqlusyjq94.R.inc(46223);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_5_2zmqzmqlusyjq94.R.flushNeeded();}}
    
    private static class Model {

        public String name;

    }
}
