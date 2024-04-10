/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class MultiFieldIntTest_writer2 extends TestCase {static class __CLR4_1_101t7t1t7tluszwf3f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84553,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public void test_for_big_writer() throws Exception {__CLR4_1_101t7t1t7tluszwf3f.R.globalSliceStart(getClass().getName(),84521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1035bdto1t7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t7t1t7tluszwf3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t7t1t7tluszwf3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MultiFieldIntTest_writer2.test_for_big_writer",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84521,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1035bdto1t7t() throws Exception{try{__CLR4_1_101t7t1t7tluszwf3f.R.inc(84521);
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84522);List<Model> list = new ArrayList<Model>();
        
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84523);for (int i = 0; (((i < 1024 * 10)&&(__CLR4_1_101t7t1t7tluszwf3f.R.iget(84524)!=0|true))||(__CLR4_1_101t7t1t7tluszwf3f.R.iget(84525)==0&false)); ++i) {{
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84526);Model model = new Model();
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84527);model.i = 0;
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84528);model.j = 1;
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84529);model.k = 2;
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84530);model.v = 3;
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84531);model.l = 4;
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84532);model.m = 5;
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84533);model.n = 6;
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84534);list.add(model);
        }
        
        }__CLR4_1_101t7t1t7tluszwf3f.R.inc(84535);StringWriter out = new StringWriter();
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84536);JSONWriter writer = new JSONWriter(out);
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84537);writer.writeObject(list);
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84538);writer.close();
        
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84539);String text = out.toString();
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84540);System.out.println(text);
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84541);List<Model> results = JSON.parseObject(text, new TypeReference<List<Model>>() {});
        
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84542);Assert.assertEquals(list.size(), results.size());
        __CLR4_1_101t7t1t7tluszwf3f.R.inc(84543);for (int i = 0; (((i < results.size())&&(__CLR4_1_101t7t1t7tluszwf3f.R.iget(84544)!=0|true))||(__CLR4_1_101t7t1t7tluszwf3f.R.iget(84545)==0&false)); ++i) {{
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84546);Assert.assertEquals(list.get(i).i, results.get(i).i);
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84547);Assert.assertEquals(list.get(i).j, results.get(i).j);
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84548);Assert.assertEquals(list.get(i).k, results.get(i).k);
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84549);Assert.assertEquals(list.get(i).v, results.get(i).v);
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84550);Assert.assertEquals(list.get(i).l, results.get(i).l);
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84551);Assert.assertEquals(list.get(i).m, results.get(i).m);
            __CLR4_1_101t7t1t7tluszwf3f.R.inc(84552);Assert.assertEquals(list.get(i).n, results.get(i).n);
        }
    }}finally{__CLR4_1_101t7t1t7tluszwf3f.R.flushNeeded();}}
    
    public static class Model {
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int v;
    }
}
