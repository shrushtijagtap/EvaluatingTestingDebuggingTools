/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestExternal2 extends TestCase {static class __CLR4_1_10zsgzsglusqjzhm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,46422,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10zsgzsglusqjzhm.R.globalSliceStart(getClass().getName(),46384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2zsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zsgzsglusqjzhm.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zsgzsglusqjzhm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.TestExternal2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46384,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2zsg() throws Exception{try{__CLR4_1_10zsgzsglusqjzhm.R.inc(46384);
        __CLR4_1_10zsgzsglusqjzhm.R.inc(46385);ExtClassLoader classLoader = new ExtClassLoader();

        __CLR4_1_10zsgzsglusqjzhm.R.inc(46386);Class theClass = classLoader.loadClass("com.alibaba.mock.demo.service.MockDemoService");
        __CLR4_1_10zsgzsglusqjzhm.R.inc(46387);Method[] methods = theClass.getMethods();

        //\u57fa\u672c\u7c7b\u578b
        __CLR4_1_10zsgzsglusqjzhm.R.inc(46388);if ((((void.class.isPrimitive())&&(__CLR4_1_10zsgzsglusqjzhm.R.iget(46389)!=0|true))||(__CLR4_1_10zsgzsglusqjzhm.R.iget(46390)==0&false))) {{
            __CLR4_1_10zsgzsglusqjzhm.R.inc(46391);System.out.println("void");
        }
        }__CLR4_1_10zsgzsglusqjzhm.R.inc(46392);if ((((boolean.class.isPrimitive())&&(__CLR4_1_10zsgzsglusqjzhm.R.iget(46393)!=0|true))||(__CLR4_1_10zsgzsglusqjzhm.R.iget(46394)==0&false))) {{
            __CLR4_1_10zsgzsglusqjzhm.R.inc(46395);System.out.println("boolean");
        }

        }__CLR4_1_10zsgzsglusqjzhm.R.inc(46396);for (Method method : methods) {{
            __CLR4_1_10zsgzsglusqjzhm.R.inc(46397);System.out.println("name: " + method.getName());

            __CLR4_1_10zsgzsglusqjzhm.R.inc(46398);Class[] paraClassArray = method.getParameterTypes();
            __CLR4_1_10zsgzsglusqjzhm.R.inc(46399);for (Class paraClass : paraClassArray) {{
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46400);System.out.println("parameters: " + paraClass);
                
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46401);Package pkg = paraClass.getPackage();
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46402);if ((((pkg == null || !pkg.getName().equals("java.lang"))&&(__CLR4_1_10zsgzsglusqjzhm.R.iget(46403)!=0|true))||(__CLR4_1_10zsgzsglusqjzhm.R.iget(46404)==0&false))) {{
                    __CLR4_1_10zsgzsglusqjzhm.R.inc(46405);Object obj = paraClass.newInstance();
                  //  System.out.println(obj);

                    __CLR4_1_10zsgzsglusqjzhm.R.inc(46406);String kaka = JSON.toJSONString(obj, SerializerFeature.WriteMapNullValue);
                    __CLR4_1_10zsgzsglusqjzhm.R.inc(46407);System.out.println(kaka);
                    __CLR4_1_10zsgzsglusqjzhm.R.inc(46408);System.out.println(kaka);

//                    ObjectMapper objectMapper = new ObjectMapper();
//                    String tt = objectMapper.writeValueAsString(obj);
//                    System.out.println(tt);
                }
            }}
            //System.out.println("return: " + method.getReturnType());
            //System.out.println("description: " + method.toGenericString());
            }__CLR4_1_10zsgzsglusqjzhm.R.inc(46409);System.out.println();
        }
    }}finally{__CLR4_1_10zsgzsglusqjzhm.R.flushNeeded();}}

    public static class ExtClassLoader extends ClassLoader {

        public ExtClassLoader() throws IOException{
            super(Thread.currentThread().getContextClassLoader());__CLR4_1_10zsgzsglusqjzhm.R.inc(46411);try{__CLR4_1_10zsgzsglusqjzhm.R.inc(46410);

            {
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46412);byte[] bytes;
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46413);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("external/Demo.clazz");
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46414);bytes = IOUtils.toByteArray(is);
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46415);is.close();

                __CLR4_1_10zsgzsglusqjzhm.R.inc(46416);super.defineClass("com.alibaba.mock.demo.api.Demo", bytes, 0, bytes.length);
            }
            {
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46417);byte[] bytes;
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46418);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("external/MockDemoService.clazz");
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46419);bytes = IOUtils.toByteArray(is);
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46420);is.close();
                
                __CLR4_1_10zsgzsglusqjzhm.R.inc(46421);super.defineClass("com.alibaba.mock.demo.service.MockDemoService", bytes, 0, bytes.length);
            }
        }finally{__CLR4_1_10zsgzsglusqjzhm.R.flushNeeded();}}
    }
}
