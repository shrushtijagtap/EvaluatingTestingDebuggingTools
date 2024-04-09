/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.mixins;

import java.util.HashMap;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;

import junit.framework.TestCase;

public class MixinDeserForMethodsTest extends TestCase {static class __CLR4_1_101erm1ermlusqkcjz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,65819,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static class BaseClass {
        protected HashMap<String, Object> values = new HashMap<String, Object>();

        @JSONCreator
        public BaseClass( @JSONField( name = "name" ) String name,@JSONField( name = "age" ) String age,
                @JSONField( name = "student" ) Object student ) {try{__CLR4_1_101erm1ermlusqkcjz.R.inc(65794);
            __CLR4_1_101erm1ermlusqkcjz.R.inc(65795);values.put( "name", name );
            __CLR4_1_101erm1ermlusqkcjz.R.inc(65796);values.put( "age", age );
            __CLR4_1_101erm1ermlusqkcjz.R.inc(65797);values.put( "student", student );
        }finally{__CLR4_1_101erm1ermlusqkcjz.R.flushNeeded();}}
    }

    static class BaseClass2 {
        protected HashMap<String, Object> values = new HashMap<String, Object>();

        public BaseClass2( String name,String age,Object student ) {try{__CLR4_1_101erm1ermlusqkcjz.R.inc(65798);
            __CLR4_1_101erm1ermlusqkcjz.R.inc(65799);values.put( "name", name );
            __CLR4_1_101erm1ermlusqkcjz.R.inc(65800);values.put( "age", age );
            __CLR4_1_101erm1ermlusqkcjz.R.inc(65801);values.put( "student", student );
        }finally{__CLR4_1_101erm1ermlusqkcjz.R.flushNeeded();}}
    }

    class MixIn {
        @JSONCreator
        MixIn( @JSONField( name = "name" ) String name,@JSONField( name = "age" ) String age,
                @JSONField( name = "student" ) Object student ) {try{__CLR4_1_101erm1ermlusqkcjz.R.inc(65802);
        }finally{__CLR4_1_101erm1ermlusqkcjz.R.flushNeeded();}};
    }

    public void test_0() throws Exception {__CLR4_1_101erm1ermlusqkcjz.R.globalSliceStart(getClass().getName(),65803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21erv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101erm1ermlusqkcjz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101erm1ermlusqkcjz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinDeserForMethodsTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65803,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21erv() throws Exception{try{__CLR4_1_101erm1ermlusqkcjz.R.inc(65803);
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65804);BaseClass result = JSON.parseObject( "{ \"name\" : \"David\", \"age\" : 13, \"student\" : true }",
                BaseClass.class );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65805);Assert.assertNotNull( result );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65806);Assert.assertEquals( 3, result.values.size() );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65807);Assert.assertEquals( "David", result.values.get( "name" ) );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65808);Assert.assertEquals( "13", result.values.get( "age" ) );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65809);Assert.assertEquals( Boolean.TRUE, result.values.get( "student" ) );
    }finally{__CLR4_1_101erm1ermlusqkcjz.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101erm1ermlusqkcjz.R.globalSliceStart(getClass().getName(),65810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1es2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101erm1ermlusqkcjz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101erm1ermlusqkcjz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinDeserForMethodsTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65810,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1es2() throws Exception{try{__CLR4_1_101erm1ermlusqkcjz.R.inc(65810);
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65811);JSON.addMixInAnnotations(BaseClass2.class, MixIn.class);
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65812);BaseClass2 result = JSON.parseObject( "{ \"name\" : \"David\", \"age\" : 13, \"student\" : true }",
                BaseClass2.class );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65813);Assert.assertNotNull( result );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65814);Assert.assertEquals( 3, result.values.size() );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65815);Assert.assertEquals( "David", result.values.get( "name" ) );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65816);Assert.assertEquals( "13", result.values.get( "age" ) );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65817);Assert.assertEquals( Boolean.TRUE, result.values.get( "student" ) );
        __CLR4_1_101erm1ermlusqkcjz.R.inc(65818);JSON.removeMixInAnnotations(BaseClass2.class);
    }finally{__CLR4_1_101erm1ermlusqkcjz.R.flushNeeded();}}
}
