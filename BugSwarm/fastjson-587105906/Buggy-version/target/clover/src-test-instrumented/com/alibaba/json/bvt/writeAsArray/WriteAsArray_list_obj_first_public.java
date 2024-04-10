/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeAsArray;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class WriteAsArray_list_obj_first_public extends TestCase {static class __CLR4_1_101zgd1zgdluszwggb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,92634,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101zgd1zgdluszwggb.R.globalSliceStart(getClass().getName(),92605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21zgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101zgd1zgdluszwggb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101zgd1zgdluszwggb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_list_obj_first_public.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92605,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21zgd() throws Exception{try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92605);
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92606);VO vo = new VO();
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92607);vo.setId(123);
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92608);vo.setName("wenshao");
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92609);vo.getFvalues().add(new A());

        __CLR4_1_101zgd1zgdluszwggb.R.inc(92610);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92611);Assert.assertEquals("[[[0]],123,\"wenshao\"]", text);

        __CLR4_1_101zgd1zgdluszwggb.R.inc(92612);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92613);Assert.assertEquals(vo.getId(), vo2.getId());
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92614);Assert.assertEquals(vo.getName(), vo2.getName());
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92615);Assert.assertEquals(vo.getFvalues().size(), vo2.getFvalues().size());
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92616);Assert.assertEquals(vo.getFvalues().get(0).getClass(), vo2.getFvalues().get(0).getClass());
        __CLR4_1_101zgd1zgdluszwggb.R.inc(92617);Assert.assertEquals(vo.getFvalues().get(0).getValue(), vo2.getFvalues().get(0).getValue());
    }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

    public static class VO {

        private long    id;
        private String  name;
        private List<A> fvalues = new ArrayList<A>();

        public long getId() {try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92618);
            __CLR4_1_101zgd1zgdluszwggb.R.inc(92619);return id;
        }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92620);
            __CLR4_1_101zgd1zgdluszwggb.R.inc(92621);this.id = id;
        }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92622);
            __CLR4_1_101zgd1zgdluszwggb.R.inc(92623);return name;
        }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92624);
            __CLR4_1_101zgd1zgdluszwggb.R.inc(92625);this.name = name;
        }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

        public List<A> getFvalues() {try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92626);
            __CLR4_1_101zgd1zgdluszwggb.R.inc(92627);return fvalues;
        }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

        public void setFvalues(List<A> fvalues) {try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92628);
            __CLR4_1_101zgd1zgdluszwggb.R.inc(92629);this.fvalues = fvalues;
        }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

    }

    public static class A {

        private int value;

        public int getValue() {try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92630);
            __CLR4_1_101zgd1zgdluszwggb.R.inc(92631);return value;
        }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_1_101zgd1zgdluszwggb.R.inc(92632);
            __CLR4_1_101zgd1zgdluszwggb.R.inc(92633);this.value = value;
        }finally{__CLR4_1_101zgd1zgdluszwggb.R.flushNeeded();}}

    }
}
