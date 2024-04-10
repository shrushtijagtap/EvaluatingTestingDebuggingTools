/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class BigStringFieldTest_private extends TestCase {static class __CLR4_5_21f5x1f5xlusyjtjc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66377,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_bigFieldString() throws Exception {__CLR4_5_21f5x1f5xlusyjtjc.R.globalSliceStart(getClass().getName(),66309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24jb4m71f5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f5x1f5xlusyjtjc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f5x1f5xlusyjtjc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.BigStringFieldTest_private.test_bigFieldString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24jb4m71f5x() throws Exception{try{__CLR4_5_21f5x1f5xlusyjtjc.R.inc(66309);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66310);Model model = new Model();
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66311);model.f0 = random(1024);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66312);model.f1 = random(1024);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66313);model.f2 = random(1024);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66314);model.f3 = random(1024);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66315);model.f4 = random(1024);
        
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66316);String text = JSON.toJSONString(model);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66317);Model model2 = JSON.parseObject(text, Model.class);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66318);assertEquals(model2.f0, model.f0);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66319);assertEquals(model2.f1, model.f1);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66320);assertEquals(model2.f2, model.f2);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66321);assertEquals(model2.f3, model.f3);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66322);assertEquals(model2.f4, model.f4);
    }finally{__CLR4_5_21f5x1f5xlusyjtjc.R.flushNeeded();}}
    
    public void test_list() throws Exception {__CLR4_5_21f5x1f5xlusyjtjc.R.globalSliceStart(getClass().getName(),66323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1f6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f5x1f5xlusyjtjc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f5x1f5xlusyjtjc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.BigStringFieldTest_private.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1f6b() throws Exception{try{__CLR4_5_21f5x1f5xlusyjtjc.R.inc(66323);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66324);List<Model> list = new ArrayList<Model>();
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66325);for (int i = 0; (((i < 1000)&&(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66326)!=0|true))||(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66327)==0&false)); ++i) {{
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66328);Model model = new Model();
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66329);model.f0 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66330);model.f1 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66331);model.f2 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66332);model.f3 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66333);model.f4 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66334);list.add(model);
        }
        }__CLR4_5_21f5x1f5xlusyjtjc.R.inc(66335);String text = JSON.toJSONString(list);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66336);List<Model> list2 = JSON.parseObject(text, new TypeReference<List<Model>>() {});
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66337);assertEquals(list.size(), list2.size());
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66338);for (int i = 0; (((i < 1000)&&(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66339)!=0|true))||(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66340)==0&false)); ++i) {{
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66341);assertEquals(list.get(i).f0, list2.get(i).f0);    
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66342);assertEquals(list.get(i).f1, list2.get(i).f1);    
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66343);assertEquals(list.get(i).f2, list2.get(i).f2);    
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66344);assertEquals(list.get(i).f3, list2.get(i).f3);    
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66345);assertEquals(list.get(i).f4, list2.get(i).f4);    
        }
    }}finally{__CLR4_5_21f5x1f5xlusyjtjc.R.flushNeeded();}}
    
    public void test_list_browserSecure() throws Exception {__CLR4_5_21f5x1f5xlusyjtjc.R.globalSliceStart(getClass().getName(),66346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s92t8y1f6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f5x1f5xlusyjtjc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f5x1f5xlusyjtjc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.BigStringFieldTest_private.test_list_browserSecure",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s92t8y1f6y() throws Exception{try{__CLR4_5_21f5x1f5xlusyjtjc.R.inc(66346);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66347);List<Model> list = new ArrayList<Model>();
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66348);for (int i = 0; (((i < 1000)&&(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66349)!=0|true))||(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66350)==0&false)); ++i) {{
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66351);Model model = new Model();
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66352);model.f0 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66353);model.f1 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66354);model.f2 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66355);model.f3 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66356);model.f4 = random(64);
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66357);list.add(model);
        }
        }__CLR4_5_21f5x1f5xlusyjtjc.R.inc(66358);String text = JSON.toJSONString(list, SerializerFeature.BrowserSecure);

        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66359);List<Model> list2 = JSON.parseObject(text, new TypeReference<List<Model>>() {});
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66360);assertEquals(list.size(), list2.size());
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66361);for (int i = 0; (((i < 1000)&&(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66362)!=0|true))||(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66363)==0&false)); ++i) {{
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66364);assertEquals(list.get(i).f0, list2.get(i).f0);    
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66365);assertEquals(list.get(i).f1, list2.get(i).f1);    
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66366);assertEquals(list.get(i).f2, list2.get(i).f2);    
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66367);assertEquals(list.get(i).f3, list2.get(i).f3);    
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66368);assertEquals(list.get(i).f4, list2.get(i).f4);    
        }
    }}finally{__CLR4_5_21f5x1f5xlusyjtjc.R.flushNeeded();}}
    
    public String random(int count) {try{__CLR4_5_21f5x1f5xlusyjtjc.R.inc(66369);
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66370);Random random = new Random();
        
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66371);char[] chars = new char[count];
        __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66372);for (int i = 0; (((i < count)&&(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66373)!=0|true))||(__CLR4_5_21f5x1f5xlusyjtjc.R.iget(66374)==0&false)); ++i) {{
            __CLR4_5_21f5x1f5xlusyjtjc.R.inc(66375);chars[i] = (char) random.nextInt();
        }
        
        }__CLR4_5_21f5x1f5xlusyjtjc.R.inc(66376);return new String(chars);
    }finally{__CLR4_5_21f5x1f5xlusyjtjc.R.flushNeeded();}}
    
    private static class Model {
        public String f0;
        public String f1;
        public String f2;
        public String f3;
        public String f4;
    }
}
