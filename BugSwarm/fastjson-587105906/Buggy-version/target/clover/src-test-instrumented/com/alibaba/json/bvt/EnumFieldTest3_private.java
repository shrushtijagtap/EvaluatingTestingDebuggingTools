/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.io.StringWriter;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class EnumFieldTest3_private extends TestCase {static class __CLR4_1_10x4wx4wluszw53z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,42988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_1() throws Exception {__CLR4_1_10x4wx4wluszw53z.R.globalSliceStart(getClass().getName(),42944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwlx4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x4wx4wluszw53z.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x4wx4wluszw53z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest3_private.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42944,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwlx4w() throws Exception{try{__CLR4_1_10x4wx4wluszw53z.R.inc(42944);
        __CLR4_1_10x4wx4wluszw53z.R.inc(42945);Model[] array = new Model[2048];
        __CLR4_1_10x4wx4wluszw53z.R.inc(42946);for (int i = 0; (((i < array.length)&&(__CLR4_1_10x4wx4wluszw53z.R.iget(42947)!=0|true))||(__CLR4_1_10x4wx4wluszw53z.R.iget(42948)==0&false)); ++i) {{
            __CLR4_1_10x4wx4wluszw53z.R.inc(42949);array[i] = new Model();
            __CLR4_1_10x4wx4wluszw53z.R.inc(42950);array[i].value = Type.A;
        }

        }__CLR4_1_10x4wx4wluszw53z.R.inc(42951);String text = JSON.toJSONString(array);

        __CLR4_1_10x4wx4wluszw53z.R.inc(42952);Model[] array2 = JSON.parseObject(text, Model[].class);

        __CLR4_1_10x4wx4wluszw53z.R.inc(42953);Assert.assertEquals(array.length, array2.length);
        __CLR4_1_10x4wx4wluszw53z.R.inc(42954);for (int i = 0; (((i < array.length)&&(__CLR4_1_10x4wx4wluszw53z.R.iget(42955)!=0|true))||(__CLR4_1_10x4wx4wluszw53z.R.iget(42956)==0&false)); ++i) {{
            __CLR4_1_10x4wx4wluszw53z.R.inc(42957);Assert.assertEquals(array[i].value, array2[i].value);
        }
    }}finally{__CLR4_1_10x4wx4wluszw53z.R.flushNeeded();}}
    
    public void test_1_writer() throws Exception {__CLR4_1_10x4wx4wluszw53z.R.globalSliceStart(getClass().getName(),42958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ivnfajx5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x4wx4wluszw53z.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x4wx4wluszw53z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest3_private.test_1_writer",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42958,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ivnfajx5a() throws Exception{try{__CLR4_1_10x4wx4wluszw53z.R.inc(42958);
        __CLR4_1_10x4wx4wluszw53z.R.inc(42959);Model[] array = new Model[2048];
        __CLR4_1_10x4wx4wluszw53z.R.inc(42960);for (int i = 0; (((i < array.length)&&(__CLR4_1_10x4wx4wluszw53z.R.iget(42961)!=0|true))||(__CLR4_1_10x4wx4wluszw53z.R.iget(42962)==0&false)); ++i) {{
            __CLR4_1_10x4wx4wluszw53z.R.inc(42963);array[i] = new Model();
            __CLR4_1_10x4wx4wluszw53z.R.inc(42964);array[i].value = Type.A;
        }

        }__CLR4_1_10x4wx4wluszw53z.R.inc(42965);StringWriter writer = new StringWriter();
        __CLR4_1_10x4wx4wluszw53z.R.inc(42966);JSON.writeJSONString(writer, array);
        __CLR4_1_10x4wx4wluszw53z.R.inc(42967);String text = writer.toString();

        __CLR4_1_10x4wx4wluszw53z.R.inc(42968);Model[] array2 = JSON.parseObject(text, Model[].class);

        __CLR4_1_10x4wx4wluszw53z.R.inc(42969);Assert.assertEquals(array.length, array2.length);
        __CLR4_1_10x4wx4wluszw53z.R.inc(42970);for (int i = 0; (((i < array.length)&&(__CLR4_1_10x4wx4wluszw53z.R.iget(42971)!=0|true))||(__CLR4_1_10x4wx4wluszw53z.R.iget(42972)==0&false)); ++i) {{
            __CLR4_1_10x4wx4wluszw53z.R.inc(42973);Assert.assertEquals(array[i].value, array2[i].value);
        }
    }}finally{__CLR4_1_10x4wx4wluszw53z.R.flushNeeded();}}
    
    public void test_null() throws Exception {__CLR4_1_10x4wx4wluszw53z.R.globalSliceStart(getClass().getName(),42974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwlx5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x4wx4wluszw53z.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x4wx4wluszw53z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest3_private.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42974,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwlx5q() throws Exception{try{__CLR4_1_10x4wx4wluszw53z.R.inc(42974);
        __CLR4_1_10x4wx4wluszw53z.R.inc(42975);Model[] array = new Model[2048];
        __CLR4_1_10x4wx4wluszw53z.R.inc(42976);for (int i = 0; (((i < array.length)&&(__CLR4_1_10x4wx4wluszw53z.R.iget(42977)!=0|true))||(__CLR4_1_10x4wx4wluszw53z.R.iget(42978)==0&false)); ++i) {{
            __CLR4_1_10x4wx4wluszw53z.R.inc(42979);array[i] = new Model();
            __CLR4_1_10x4wx4wluszw53z.R.inc(42980);array[i].value = null;
        }

        }__CLR4_1_10x4wx4wluszw53z.R.inc(42981);String text = JSON.toJSONString(array, SerializerFeature.WriteMapNullValue);

        __CLR4_1_10x4wx4wluszw53z.R.inc(42982);Model[] array2 = JSON.parseObject(text, Model[].class);

        __CLR4_1_10x4wx4wluszw53z.R.inc(42983);Assert.assertEquals(array.length, array2.length);
        __CLR4_1_10x4wx4wluszw53z.R.inc(42984);for (int i = 0; (((i < array.length)&&(__CLR4_1_10x4wx4wluszw53z.R.iget(42985)!=0|true))||(__CLR4_1_10x4wx4wluszw53z.R.iget(42986)==0&false)); ++i) {{
            __CLR4_1_10x4wx4wluszw53z.R.inc(42987);Assert.assertEquals(array[i].value, array2[i].value);
        }
    }}finally{__CLR4_1_10x4wx4wluszw53z.R.flushNeeded();}}

    public static class Model {

        public Type value;

    }
    
    private static enum Type {
        A, B, C
    }
}
