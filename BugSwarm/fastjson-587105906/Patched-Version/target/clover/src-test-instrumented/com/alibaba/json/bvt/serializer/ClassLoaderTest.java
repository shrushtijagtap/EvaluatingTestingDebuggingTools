/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Enumeration;
import java.util.Set;
import java.util.Vector;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.ServiceLoader;
import com.alibaba.json.demo.X;

public class ClassLoaderTest extends TestCase {static class __CLR4_5_21qs31qs3lusyjuta{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,81398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ClassLoader ctxLoader;

    protected void setUp() throws Exception {try{__CLR4_5_21qs31qs3lusyjuta.R.inc(81363);
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81364);ctxLoader = Thread.currentThread().getContextClassLoader();
    }finally{__CLR4_5_21qs31qs3lusyjuta.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_5_21qs31qs3lusyjuta.R.inc(81365);
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81366);Thread.currentThread().setContextClassLoader(ctxLoader);
    }finally{__CLR4_5_21qs31qs3lusyjuta.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21qs31qs3lusyjuta.R.globalSliceStart(getClass().getName(),81367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1qs7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qs31qs3lusyjuta.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qs31qs3lusyjuta.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ClassLoaderTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1qs7() throws Exception{try{__CLR4_5_21qs31qs3lusyjuta.R.inc(81367);
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81368);Field field = ServiceLoader.class.getDeclaredField("loadedUrls");
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81369);field.setAccessible(true);
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81370);Set<String> loadedUrls = (Set<String>) field.get(null);

        __CLR4_5_21qs31qs3lusyjuta.R.inc(81371);Thread.currentThread().setContextClassLoader(new MyClassLoader(new ClassCastException()));
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81372);JSON.toJSONString(new A());
        
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81373);loadedUrls.clear();

        __CLR4_5_21qs31qs3lusyjuta.R.inc(81374);Thread.currentThread().setContextClassLoader(new MyClassLoader(new IOException()));
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81375);JSON.toJSONString(new B());

        __CLR4_5_21qs31qs3lusyjuta.R.inc(81376);loadedUrls.clear();

        __CLR4_5_21qs31qs3lusyjuta.R.inc(81377);Thread.currentThread().setContextClassLoader(new EmptyClassLoader());
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81378);JSON.toJSONString(new C());

        __CLR4_5_21qs31qs3lusyjuta.R.inc(81379);loadedUrls.clear();

        __CLR4_5_21qs31qs3lusyjuta.R.inc(81380);Thread.currentThread().setContextClassLoader(new ErrorClassLoader());
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81381);JSON.toJSONString(new D());

        __CLR4_5_21qs31qs3lusyjuta.R.inc(81382);loadedUrls.clear();

        __CLR4_5_21qs31qs3lusyjuta.R.inc(81383);Thread.currentThread().setContextClassLoader(ctxLoader);
        __CLR4_5_21qs31qs3lusyjuta.R.inc(81384);JSON.toJSONString(new E());
    }finally{__CLR4_5_21qs31qs3lusyjuta.R.flushNeeded();}}

    public static class EmptyClassLoader extends ClassLoader {

        public Enumeration<URL> getResources(String name) throws IOException {try{__CLR4_5_21qs31qs3lusyjuta.R.inc(81385);
            __CLR4_5_21qs31qs3lusyjuta.R.inc(81386);return new Vector<URL>().elements();
        }finally{__CLR4_5_21qs31qs3lusyjuta.R.flushNeeded();}}
    }

    public static class ErrorClassLoader extends ClassLoader {

        public Class<?> loadClass(String name) throws ClassNotFoundException {try{__CLR4_5_21qs31qs3lusyjuta.R.inc(81387);
            __CLR4_5_21qs31qs3lusyjuta.R.inc(81388);return Object.class;
        }finally{__CLR4_5_21qs31qs3lusyjuta.R.flushNeeded();}}
    }

    public static class MyClassLoader extends ClassLoader {

        private final Exception error;

        public MyClassLoader(Exception error){
            super();__CLR4_5_21qs31qs3lusyjuta.R.inc(81390);try{__CLR4_5_21qs31qs3lusyjuta.R.inc(81389);
            __CLR4_5_21qs31qs3lusyjuta.R.inc(81391);this.error = error;
        }finally{__CLR4_5_21qs31qs3lusyjuta.R.flushNeeded();}}

        public Enumeration<URL> getResources(String name) throws IOException {try{__CLR4_5_21qs31qs3lusyjuta.R.inc(81392);
            __CLR4_5_21qs31qs3lusyjuta.R.inc(81393);if ((((error instanceof IOException)&&(__CLR4_5_21qs31qs3lusyjuta.R.iget(81394)!=0|true))||(__CLR4_5_21qs31qs3lusyjuta.R.iget(81395)==0&false))) {{
                __CLR4_5_21qs31qs3lusyjuta.R.inc(81396);throw (IOException) error;
            }
            }__CLR4_5_21qs31qs3lusyjuta.R.inc(81397);throw (RuntimeException) error;
        }finally{__CLR4_5_21qs31qs3lusyjuta.R.flushNeeded();}}
    }

    public class A {

    }

    public class B {

    }

    public class C {

    }

    public class D {

    }

    public class E {

    }
}
