/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class ListStringFieldTest_array_big extends TestCase {static class __CLR4_1_101npz1npzluszwdu3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,77425,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_list() throws Exception {__CLR4_1_101npz1npzluszwdu3.R.globalSliceStart(getClass().getName(),77399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1npz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npz1npzluszwdu3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npz1npzluszwdu3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_array_big.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77399,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1npz() throws Exception{try{__CLR4_1_101npz1npzluszwdu3.R.inc(77399);
        __CLR4_1_101npz1npzluszwdu3.R.inc(77400);Model model = new Model();
        __CLR4_1_101npz1npzluszwdu3.R.inc(77401);model.values = new ArrayList<String>();
        __CLR4_1_101npz1npzluszwdu3.R.inc(77402);for (int i = 0; (((i < 1000)&&(__CLR4_1_101npz1npzluszwdu3.R.iget(77403)!=0|true))||(__CLR4_1_101npz1npzluszwdu3.R.iget(77404)==0&false)); ++i) {{
            __CLR4_1_101npz1npzluszwdu3.R.inc(77405);char[] chars = new char[512];
            __CLR4_1_101npz1npzluszwdu3.R.inc(77406);Arrays.fill(chars, (char) ('0' + (i % 10))); 
            __CLR4_1_101npz1npzluszwdu3.R.inc(77407);model.values.add(new String(chars));
        }
        
        }__CLR4_1_101npz1npzluszwdu3.R.inc(77408);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        
        __CLR4_1_101npz1npzluszwdu3.R.inc(77409);Model model2 = JSON.parseObject(text, Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101npz1npzluszwdu3.R.inc(77410);Assert.assertEquals(model.values.size(), model2.values.size());
        __CLR4_1_101npz1npzluszwdu3.R.inc(77411);for (int i = 0; (((i < model.values.size())&&(__CLR4_1_101npz1npzluszwdu3.R.iget(77412)!=0|true))||(__CLR4_1_101npz1npzluszwdu3.R.iget(77413)==0&false)); ++i) {{
            __CLR4_1_101npz1npzluszwdu3.R.inc(77414);Assert.assertEquals(model.values.get(i), model2.values.get(i));    
        }
    }}finally{__CLR4_1_101npz1npzluszwdu3.R.flushNeeded();}}
    
    public void test_list_empty() throws Exception {__CLR4_1_101npz1npzluszwdu3.R.globalSliceStart(getClass().getName(),77415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ynnnmo1nqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npz1npzluszwdu3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npz1npzluszwdu3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_array_big.test_list_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77415,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ynnnmo1nqf() throws Exception{try{__CLR4_1_101npz1npzluszwdu3.R.inc(77415);
        __CLR4_1_101npz1npzluszwdu3.R.inc(77416);Model model = new Model();
        __CLR4_1_101npz1npzluszwdu3.R.inc(77417);model.values = new ArrayList<String>();
        
        __CLR4_1_101npz1npzluszwdu3.R.inc(77418);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        
        __CLR4_1_101npz1npzluszwdu3.R.inc(77419);Model model2 = JSON.parseObject(text, Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101npz1npzluszwdu3.R.inc(77420);Assert.assertEquals(model.values.size(), model2.values.size());
        __CLR4_1_101npz1npzluszwdu3.R.inc(77421);for (int i = 0; (((i < model.values.size())&&(__CLR4_1_101npz1npzluszwdu3.R.iget(77422)!=0|true))||(__CLR4_1_101npz1npzluszwdu3.R.iget(77423)==0&false)); ++i) {{
            __CLR4_1_101npz1npzluszwdu3.R.inc(77424);Assert.assertEquals(model.values.get(i), model2.values.get(i));    
        }
    }}finally{__CLR4_1_101npz1npzluszwdu3.R.flushNeeded();}}

    public static class Model {
        public List<String> values;
    }
}
