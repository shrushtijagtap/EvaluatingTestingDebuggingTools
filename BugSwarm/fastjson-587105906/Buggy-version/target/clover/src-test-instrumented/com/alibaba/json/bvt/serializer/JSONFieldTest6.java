/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;
import junit.framework.TestCase;

public class JSONFieldTest6 extends TestCase {static class __CLR4_1_101rid1ridlusqkjmp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,82357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue1()
    {__CLR4_1_101rid1ridlusqkjmp.R.globalSliceStart(getClass().getName(),82309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oo900y1rid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rid1ridlusqkjmp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rid1ridlusqkjmp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONFieldTest6.test_for_issue1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82309,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oo900y1rid(){try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82309);
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82310);NonStringMap nonStringMap = new NonStringMap();
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82311);Map<Integer, Integer> map1 = new HashMap();
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82312);map1.put( 111,666 );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82313);nonStringMap.setMap1( map1 );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82314);String json = JSON.toJSONString( nonStringMap );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82315);assertEquals( "{\"map1\":{\"111\":666}}", json );
    }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

    public void test_for_issue2()
    {__CLR4_1_101rid1ridlusqkjmp.R.globalSliceStart(getClass().getName(),82316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rx8ytf1rik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rid1ridlusqkjmp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rid1ridlusqkjmp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONFieldTest6.test_for_issue2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82316,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rx8ytf1rik(){try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82316);
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82317);NonStringMap nonStringMap = new NonStringMap();
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82318);Map<Integer, Integer> map2 = new HashMap();
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82319);map2.put( 222,888 );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82320);nonStringMap.setMap2( map2 );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82321);String json = JSON.toJSONString( nonStringMap );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82322);assertEquals( "{\"map2\":{222:\"888\"}}", json );
    }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

    public void test_for_issue3()
    {__CLR4_1_101rid1ridlusqkjmp.R.globalSliceStart(getClass().getName(),82323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v68xlw1rir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rid1ridlusqkjmp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rid1ridlusqkjmp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONFieldTest6.test_for_issue3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82323,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v68xlw1rir(){try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82323);
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82324);NonStringMap nonStringMap = new NonStringMap();
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82325);Map<Integer, Integer> map3 = new HashMap();
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82326);map3.put( 333,999 );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82327);nonStringMap.setMap3( map3 );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82328);String json = JSON.toJSONString( nonStringMap );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82329);assertEquals( "{\"map3\":{\"333\":\"999\"}}", json );
    }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

    public void test_for_issue4()
    {__CLR4_1_101rid1ridlusqkjmp.R.globalSliceStart(getClass().getName(),82330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yf8wed1riy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rid1ridlusqkjmp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rid1ridlusqkjmp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONFieldTest6.test_for_issue4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82330,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yf8wed1riy(){try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82330);
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82331);NonStringMap nonStringMap = new NonStringMap();
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82332);Bean person = new Bean();
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82333);person.setAge( 23 );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82334);nonStringMap.setPerson( person );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82335);String json = JSON.toJSONString( nonStringMap );
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82336);assertEquals( "{\"person\":{\"age\":\"23\"}}", json );
    }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

    class NonStringMap
    {
        @JSONField( serialzeFeatures = {SerializerFeature.WriteNonStringKeyAsString} )
        private Map map1;

        public Map getMap1()
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82337);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82338);return map1;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

        public void setMap1( Map map1 )
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82339);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82340);this.map1 = map1;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

        @JSONField( serialzeFeatures = {SerializerFeature.WriteNonStringValueAsString} )
        private Map map2;

        public Map getMap2()
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82341);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82342);return map2;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

        public void setMap2( Map map2 )
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82343);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82344);this.map2 = map2;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

        @JSONField( serialzeFeatures = {SerializerFeature.WriteNonStringKeyAsString, SerializerFeature.WriteNonStringValueAsString} )
        private Map map3;

        public Map getMap3()
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82345);
        __CLR4_1_101rid1ridlusqkjmp.R.inc(82346);return map3;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

        public void setMap3( Map map3 )
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82347);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82348);this.map3 = map3;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

        @JSONField( serialzeFeatures = {SerializerFeature.WriteNonStringValueAsString} )
        private Bean person;

        public Bean getPerson()
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82349);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82350);return person;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

        public void setPerson( Bean person )
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82351);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82352);this.person = person;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}
    }

    class Bean {
        private int age;

        public int getAge()
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82353);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82354);return age;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}

        public void setAge( int age )
        {try{__CLR4_1_101rid1ridlusqkjmp.R.inc(82355);
            __CLR4_1_101rid1ridlusqkjmp.R.inc(82356);this.age = age;
        }finally{__CLR4_1_101rid1ridlusqkjmp.R.flushNeeded();}}
    }
}
