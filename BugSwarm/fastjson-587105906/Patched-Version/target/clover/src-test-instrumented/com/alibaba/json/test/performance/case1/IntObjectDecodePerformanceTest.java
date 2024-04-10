/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.performance.case1;

import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;

import com.alibaba.json.test.codec.Codec;
import com.alibaba.json.test.codec.FastjsonCodec;
import com.alibaba.json.test.codec.JacksonCodec;
import com.alibaba.json.test.entity.case1.LongObject_100_Entity;

public class IntObjectDecodePerformanceTest extends TestCase {static class __CLR4_5_227lw27lwlusyjx7s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,103197,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String    text;
    private final int COUNT = 1000 * 100;

    protected void setUp() throws Exception {try{__CLR4_5_227lw27lwlusyjx7s.R.inc(103172);
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103173);String resource = "json/object_f_int_1000.json";
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103174);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103175);text = IOUtils.toString(is);
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103176);is.close();
    }finally{__CLR4_5_227lw27lwlusyjx7s.R.flushNeeded();}}

    public void test_decodeObject() throws Exception {__CLR4_5_227lw27lwlusyjx7s.R.globalSliceStart(getClass().getName(),103177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r89gv327m1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_227lw27lwlusyjx7s.R.rethrow($CLV_t2$);}finally{__CLR4_5_227lw27lwlusyjx7s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.performance.case1.IntObjectDecodePerformanceTest.test_decodeObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),103177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r89gv327m1() throws Exception{try{__CLR4_5_227lw27lwlusyjx7s.R.inc(103177);
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103178);List<Codec> decoders = new ArrayList<Codec>();
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103179);decoders.add(new FastjsonCodec());
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103180);decoders.add(new JacksonCodec());

        __CLR4_5_227lw27lwlusyjx7s.R.inc(103181);for (int i = 0; (((i < 10)&&(__CLR4_5_227lw27lwlusyjx7s.R.iget(103182)!=0|true))||(__CLR4_5_227lw27lwlusyjx7s.R.iget(103183)==0&false)); ++i) {{
            __CLR4_5_227lw27lwlusyjx7s.R.inc(103184);for (Codec decoder : decoders) {{
                __CLR4_5_227lw27lwlusyjx7s.R.inc(103185);decodeToJavaBean(text, decoder);
            }
            }__CLR4_5_227lw27lwlusyjx7s.R.inc(103186);System.out.println();
        }
        }__CLR4_5_227lw27lwlusyjx7s.R.inc(103187);System.out.println();
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103188);System.out.println(text);
    }finally{__CLR4_5_227lw27lwlusyjx7s.R.flushNeeded();}}

    public void decodeToJavaBean(String text, Codec decoder) throws Exception {try{__CLR4_5_227lw27lwlusyjx7s.R.inc(103189);
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103190);long startNano = System.nanoTime();
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103191);for (int i = 0; (((i < COUNT)&&(__CLR4_5_227lw27lwlusyjx7s.R.iget(103192)!=0|true))||(__CLR4_5_227lw27lwlusyjx7s.R.iget(103193)==0&false)); ++i) {{
            __CLR4_5_227lw27lwlusyjx7s.R.inc(103194);decoder.decodeObject(text, LongObject_100_Entity.class);
            // decoder.decode(text);
        }
        }__CLR4_5_227lw27lwlusyjx7s.R.inc(103195);long nano = System.nanoTime() - startNano;
        __CLR4_5_227lw27lwlusyjx7s.R.inc(103196);System.out.println(decoder.getName() + " : \t" + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_227lw27lwlusyjx7s.R.flushNeeded();}}
}
