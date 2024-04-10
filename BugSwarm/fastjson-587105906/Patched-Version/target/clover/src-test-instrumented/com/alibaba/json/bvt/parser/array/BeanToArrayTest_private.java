/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.array;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class BeanToArrayTest_private extends TestCase {static class __CLR4_5_21jeo1jeolusyjtwe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_beanToArray_parse() throws Exception {__CLR4_5_21jeo1jeolusyjtwe.R.globalSliceStart(getClass().getName(),71808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ni5dmk1jeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jeo1jeolusyjtwe.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jeo1jeolusyjtwe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_private.test_beanToArray_parse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ni5dmk1jeo() throws Exception{try{__CLR4_5_21jeo1jeolusyjtwe.R.inc(71808);
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71809);String text = "{\"go\":[[\"0\",[true,false],9999999999999,99,\"012345678901234567890123\",\"ftp://gfw.yma.co/x160\",\"xxxx\",\"9876543210123456\",[[\"m\",\"\u4e0d\u8981\u5f00\u5fc3\",\"http://gfw.meiya.co\",\"123456@gg.com\",\"\u9ebb\u9ebb\",\"add\",null,\"9876543210123456\"]],null,[\"add\",\"ww\"],999,1234567890123]],\"success\":true}";
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71810);GR result = JSON.parseObject(text, GR.class);
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71811);Assert.assertNotNull(result);
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71812);Assert.assertEquals(1, result.go.size());
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71813);Assert.assertEquals("0", result.go.get(0).bi);
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71814);Assert.assertEquals(true, result.go.get(0).co.qu);
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71815);Assert.assertEquals(false, result.go.get(0).co.sa);
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71816);Assert.assertEquals(9999999999999L, result.go.get(0).gm.getTime());
        __CLR4_5_21jeo1jeolusyjtwe.R.inc(71817);Assert.assertEquals(99, result.go.get(0).grCo);
    }finally{__CLR4_5_21jeo1jeolusyjtwe.R.flushNeeded();}}

    public static class GR {
        public List<GO> go;
        public boolean  success;
    }

    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    private static class GO {

        public String       bi;
        public CO           co;

        public Date         gm;
        public int          grCo;
        public String       grId;
        public String       grNa;
        public String       grIm;
        public String       ma;
        public List<MO>     me = new ArrayList<MO>();
        public int          th = 500;
        public List<String> pe = new ArrayList<String>();
        public String       no;
        public long         ve;
    }

    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    private static class MO {

        public String ope;
        public String use;
        public String log;
        public String rea;
        public String gro;
        public String gen;
        public String hea;
        public String nic;
    }

    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    private static class CO {

        public boolean sa;
        public boolean qu;
    }
}
