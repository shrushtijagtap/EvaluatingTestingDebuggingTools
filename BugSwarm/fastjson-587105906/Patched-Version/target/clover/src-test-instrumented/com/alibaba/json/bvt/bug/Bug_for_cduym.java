/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.parser.ParserConfig;
import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_cduym extends TestCase {static class __CLR4_5_213jl13jllusyjrhs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,51293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51249);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51250);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_cduym");
    }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public void test0() {__CLR4_5_213jl13jllusyjrhs.R.globalSliceStart(getClass().getName(),51251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2156cmd13jn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213jl13jllusyjrhs.R.rethrow($CLV_t2$);}finally{__CLR4_5_213jl13jllusyjrhs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cduym.test0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2156cmd13jn(){try{__CLR4_5_213jl13jllusyjrhs.R.inc(51251);

        __CLR4_5_213jl13jllusyjrhs.R.inc(51252);List<A> as = new ArrayList<A>();

        __CLR4_5_213jl13jllusyjrhs.R.inc(51253);A a1 = new A();
        __CLR4_5_213jl13jllusyjrhs.R.inc(51254);a1.setA(1000);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51255);a1.setB(2000l);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51256);a1.setC("xxx");

        __CLR4_5_213jl13jllusyjrhs.R.inc(51257);as.add(a1);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51258);as.add(a1);

        __CLR4_5_213jl13jllusyjrhs.R.inc(51259);String text = JSON.toJSONString(as, SerializerFeature.WriteClassName);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51260);System.out.println(text);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51261);List<?> target = (List) JSON.parseObject(text, Object.class);
        
        __CLR4_5_213jl13jllusyjrhs.R.inc(51262);Assert.assertSame(target.get(0), target.get(1));
    }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}
    
    public void test1() {__CLR4_5_213jl13jllusyjrhs.R.globalSliceStart(getClass().getName(),51263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu13jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213jl13jllusyjrhs.R.rethrow($CLV_t2$);}finally{__CLR4_5_213jl13jllusyjrhs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cduym.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu13jz(){try{__CLR4_5_213jl13jllusyjrhs.R.inc(51263);
        
        __CLR4_5_213jl13jllusyjrhs.R.inc(51264);List<A> as = new ArrayList<A>();
        
        __CLR4_5_213jl13jllusyjrhs.R.inc(51265);A a1 = new A();
        __CLR4_5_213jl13jllusyjrhs.R.inc(51266);a1.setA(1000);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51267);a1.setB(2000l);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51268);a1.setC("xxx");
        
        __CLR4_5_213jl13jllusyjrhs.R.inc(51269);as.add(a1);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51270);as.add(a1);
        
        __CLR4_5_213jl13jllusyjrhs.R.inc(51271);Demo o = new Demo();
        __CLR4_5_213jl13jllusyjrhs.R.inc(51272);o.setAs(as);
        
        __CLR4_5_213jl13jllusyjrhs.R.inc(51273);String text = JSON.toJSONString(o, SerializerFeature.WriteClassName);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51274);System.out.println(text);
        __CLR4_5_213jl13jllusyjrhs.R.inc(51275);Demo target = (Demo) JSON.parseObject(text, Object.class);
        
        __CLR4_5_213jl13jllusyjrhs.R.inc(51276);Assert.assertSame(((List)target.getAs()).get(0), ((List)target.getAs()).get(1));
    }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}
    

    public static class Demo {

        private Object as;

        public Object getAs() {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51277);
            __CLR4_5_213jl13jllusyjrhs.R.inc(51278);return as;
        }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

        public void setAs(Object as) {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51279);
            __CLR4_5_213jl13jllusyjrhs.R.inc(51280);this.as = as;
        }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

    }

    private static class A {

        private Integer a;
        private Long    b;

        private String  c;

        public Integer getA() {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51281);
            __CLR4_5_213jl13jllusyjrhs.R.inc(51282);return a;
        }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

        public void setA(Integer a) {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51283);
            __CLR4_5_213jl13jllusyjrhs.R.inc(51284);this.a = a;
        }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

        public Long getB() {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51285);
            __CLR4_5_213jl13jllusyjrhs.R.inc(51286);return b;
        }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

        public void setB(Long b) {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51287);
            __CLR4_5_213jl13jllusyjrhs.R.inc(51288);this.b = b;
        }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

        public String getC() {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51289);
            __CLR4_5_213jl13jllusyjrhs.R.inc(51290);return c;
        }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

        public void setC(String c) {try{__CLR4_5_213jl13jllusyjrhs.R.inc(51291);
            __CLR4_5_213jl13jllusyjrhs.R.inc(51292);this.c = c;
        }finally{__CLR4_5_213jl13jllusyjrhs.R.flushNeeded();}}

    }
}
