/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.cglib;

import java.lang.reflect.Method;

import org.junit.Assert;
import junit.framework.TestCase;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import com.alibaba.fastjson.JSON;

public class TestCglib extends TestCase {static class __CLR4_1_1018661866lusqk7lr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,57269,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_cglib() throws Exception {__CLR4_1_1018661866lusqk7lr.R.globalSliceStart(getClass().getName(),57246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yss6851866();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018661866lusqk7lr.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018661866lusqk7lr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.cglib.TestCglib.test_cglib",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57246,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yss6851866() throws Exception{try{__CLR4_1_1018661866lusqk7lr.R.inc(57246);
        __CLR4_1_1018661866lusqk7lr.R.inc(57247);Enhancer enhancer = new Enhancer();
        __CLR4_1_1018661866lusqk7lr.R.inc(57248);enhancer.setSuperclass(Entity.class);
        __CLR4_1_1018661866lusqk7lr.R.inc(57249);enhancer.setCallback(new Proxy());
        __CLR4_1_1018661866lusqk7lr.R.inc(57250);Entity entity = (Entity) enhancer.create();
        
        __CLR4_1_1018661866lusqk7lr.R.inc(57251);entity.setId(3);
        __CLR4_1_1018661866lusqk7lr.R.inc(57252);entity.setName("Jobs");
        
        __CLR4_1_1018661866lusqk7lr.R.inc(57253);String text = JSON.toJSONString(entity);
        __CLR4_1_1018661866lusqk7lr.R.inc(57254);Assert.assertEquals("{\"id\":3,\"name\":\"Jobs\"}", text);

    }finally{__CLR4_1_1018661866lusqk7lr.R.flushNeeded();}}

    public static class Proxy implements MethodInterceptor {

        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {try{__CLR4_1_1018661866lusqk7lr.R.inc(57255);
            __CLR4_1_1018661866lusqk7lr.R.inc(57256);return proxy.invokeSuper(obj, args);
        }finally{__CLR4_1_1018661866lusqk7lr.R.flushNeeded();}}

    }

    public static class Entity {

        private int    id;
        private String name;

        public Entity(){try{__CLR4_1_1018661866lusqk7lr.R.inc(57257);

        }finally{__CLR4_1_1018661866lusqk7lr.R.flushNeeded();}}

        public Entity(int id, String name){try{__CLR4_1_1018661866lusqk7lr.R.inc(57258);
            __CLR4_1_1018661866lusqk7lr.R.inc(57259);this.id = id;
            __CLR4_1_1018661866lusqk7lr.R.inc(57260);this.name = name;
        }finally{__CLR4_1_1018661866lusqk7lr.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_1018661866lusqk7lr.R.inc(57261);
            __CLR4_1_1018661866lusqk7lr.R.inc(57262);return id;
        }finally{__CLR4_1_1018661866lusqk7lr.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_1018661866lusqk7lr.R.inc(57263);
            __CLR4_1_1018661866lusqk7lr.R.inc(57264);this.id = id;
        }finally{__CLR4_1_1018661866lusqk7lr.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1018661866lusqk7lr.R.inc(57265);
            __CLR4_1_1018661866lusqk7lr.R.inc(57266);return name;
        }finally{__CLR4_1_1018661866lusqk7lr.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1018661866lusqk7lr.R.inc(57267);
            __CLR4_1_1018661866lusqk7lr.R.inc(57268);this.name = name;
        }finally{__CLR4_1_1018661866lusqk7lr.R.flushNeeded();}}

    }
}
