/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

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

public class ClassLoaderTest extends TestCase {static class __CLR4_1_101rqm1rqmluszwev5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,82641,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ClassLoader ctxLoader;

    protected void setUp() throws Exception {try{__CLR4_1_101rqm1rqmluszwev5.R.inc(82606);
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82607);ctxLoader = Thread.currentThread().getContextClassLoader();
    }finally{__CLR4_1_101rqm1rqmluszwev5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_1_101rqm1rqmluszwev5.R.inc(82608);
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82609);Thread.currentThread().setContextClassLoader(ctxLoader);
    }finally{__CLR4_1_101rqm1rqmluszwev5.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101rqm1rqmluszwev5.R.globalSliceStart(getClass().getName(),82610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1rqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rqm1rqmluszwev5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rqm1rqmluszwev5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ClassLoaderTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82610,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1rqq() throws Exception{try{__CLR4_1_101rqm1rqmluszwev5.R.inc(82610);
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82611);Field field = ServiceLoader.class.getDeclaredField("loadedUrls");
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82612);field.setAccessible(true);
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82613);Set<String> loadedUrls = (Set<String>) field.get(null);

        __CLR4_1_101rqm1rqmluszwev5.R.inc(82614);Thread.currentThread().setContextClassLoader(new MyClassLoader(new ClassCastException()));
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82615);JSON.toJSONString(new A());
        
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82616);loadedUrls.clear();

        __CLR4_1_101rqm1rqmluszwev5.R.inc(82617);Thread.currentThread().setContextClassLoader(new MyClassLoader(new IOException()));
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82618);JSON.toJSONString(new B());

        __CLR4_1_101rqm1rqmluszwev5.R.inc(82619);loadedUrls.clear();

        __CLR4_1_101rqm1rqmluszwev5.R.inc(82620);Thread.currentThread().setContextClassLoader(new EmptyClassLoader());
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82621);JSON.toJSONString(new C());

        __CLR4_1_101rqm1rqmluszwev5.R.inc(82622);loadedUrls.clear();

        __CLR4_1_101rqm1rqmluszwev5.R.inc(82623);Thread.currentThread().setContextClassLoader(new ErrorClassLoader());
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82624);JSON.toJSONString(new D());

        __CLR4_1_101rqm1rqmluszwev5.R.inc(82625);loadedUrls.clear();

        __CLR4_1_101rqm1rqmluszwev5.R.inc(82626);Thread.currentThread().setContextClassLoader(ctxLoader);
        __CLR4_1_101rqm1rqmluszwev5.R.inc(82627);JSON.toJSONString(new E());
    }finally{__CLR4_1_101rqm1rqmluszwev5.R.flushNeeded();}}

    public static class EmptyClassLoader extends ClassLoader {

        public Enumeration<URL> getResources(String name) throws IOException {try{__CLR4_1_101rqm1rqmluszwev5.R.inc(82628);
            __CLR4_1_101rqm1rqmluszwev5.R.inc(82629);return new Vector<URL>().elements();
        }finally{__CLR4_1_101rqm1rqmluszwev5.R.flushNeeded();}}
    }

    public static class ErrorClassLoader extends ClassLoader {

        public Class<?> loadClass(String name) throws ClassNotFoundException {try{__CLR4_1_101rqm1rqmluszwev5.R.inc(82630);
            __CLR4_1_101rqm1rqmluszwev5.R.inc(82631);return Object.class;
        }finally{__CLR4_1_101rqm1rqmluszwev5.R.flushNeeded();}}
    }

    public static class MyClassLoader extends ClassLoader {

        private final Exception error;

        public MyClassLoader(Exception error){
            super();__CLR4_1_101rqm1rqmluszwev5.R.inc(82633);try{__CLR4_1_101rqm1rqmluszwev5.R.inc(82632);
            __CLR4_1_101rqm1rqmluszwev5.R.inc(82634);this.error = error;
        }finally{__CLR4_1_101rqm1rqmluszwev5.R.flushNeeded();}}

        public Enumeration<URL> getResources(String name) throws IOException {try{__CLR4_1_101rqm1rqmluszwev5.R.inc(82635);
            __CLR4_1_101rqm1rqmluszwev5.R.inc(82636);if ((((error instanceof IOException)&&(__CLR4_1_101rqm1rqmluszwev5.R.iget(82637)!=0|true))||(__CLR4_1_101rqm1rqmluszwev5.R.iget(82638)==0&false))) {{
                __CLR4_1_101rqm1rqmluszwev5.R.inc(82639);throw (IOException) error;
            }
            }__CLR4_1_101rqm1rqmluszwev5.R.inc(82640);throw (RuntimeException) error;
        }finally{__CLR4_1_101rqm1rqmluszwev5.R.flushNeeded();}}
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
