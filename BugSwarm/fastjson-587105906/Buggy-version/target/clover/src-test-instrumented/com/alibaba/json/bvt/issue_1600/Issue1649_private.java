/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

public class Issue1649_private extends TestCase {static class __CLR4_1_101c1v1c1vlusqkabg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,62298,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101c1v1c1vlusqkabg.R.globalSliceStart(getClass().getName(),62275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1c1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101c1v1c1vlusqkabg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101c1v1c1vlusqkabg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1600.Issue1649_private.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),62275,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1c1v() throws Exception{try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62275);
        __CLR4_1_101c1v1c1vlusqkabg.R.inc(62276);Apple apple = new Apple();
        __CLR4_1_101c1v1c1vlusqkabg.R.inc(62277);String json = JSON.toJSONString(apple);
        __CLR4_1_101c1v1c1vlusqkabg.R.inc(62278);assertEquals("{\"color\":\"\",\"productCity\":\"\",\"size\":0}", json);
    }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}

    @JSONType(serialzeFeatures = {SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue})
    private static class Apple {

        // @JSONField(serialzeFeatures = {SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteMapNullValue})
        private String color;
        private String productCity;
        private int size;

        public String getColor() {try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62279);
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62280);return color;
        }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}

        public Apple setColor(String color) {try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62281);
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62282);this.color = color;
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62283);return this;
        }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}

        public int getSize() {try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62284);
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62285);return size;
        }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}

        public Apple setSize(int size) {try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62286);
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62287);this.size = size;
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62288);return this;
        }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}

        public String getProductCity() {try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62289);
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62290);return productCity;
        }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}

        public Apple setProductCity(String productCity) {try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62291);
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62292);this.productCity = productCity;
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62293);return this;
        }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62294);
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62295);return JSON.toJSONString(this);
        }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}

        public static void main(String[] args) {try{__CLR4_1_101c1v1c1vlusqkabg.R.inc(62296);
            __CLR4_1_101c1v1c1vlusqkabg.R.inc(62297);System.out.println(JSON.toJSONString(new Apple()));
        }finally{__CLR4_1_101c1v1c1vlusqkabg.R.flushNeeded();}}
    }
}
