/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.performance;

import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;

import com.alibaba.json.test.codec.Codec;
import com.alibaba.json.test.codec.FastjsonCodec;
import com.alibaba.json.test.codec.JacksonCodec;
import com.alibaba.json.test.entity.pagemodel.PageInstance;

public class PageModelPerformanceTest extends TestCase {static class __CLR4_5_228hn28hnlusvnlmc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,104340,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String    text;
    private final int COUNT = 1000;

    protected void setUp() throws Exception {try{__CLR4_5_228hn28hnlusvnlmc.R.inc(104315);
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104316);text = "{\"badboy\":true,\"description\":\"\u795e\u68cd\u654c\u4eba\u59d0\",\"name\":\"\u6821\u957f\",\"age\":3,\"birthdate\":1293278091773,\"salary\":123456789.0123}";

        __CLR4_5_228hn28hnlusvnlmc.R.inc(104317);String resource = "json/page_model_cached.json";
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104318);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104319);text = IOUtils.toString(is);
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104320);is.close();
    }finally{__CLR4_5_228hn28hnlusvnlmc.R.flushNeeded();}}

    public void test_decodeObject() throws Exception {__CLR4_5_228hn28hnlusvnlmc.R.globalSliceStart(getClass().getName(),104321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r89gv328ht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_228hn28hnlusvnlmc.R.rethrow($CLV_t2$);}finally{__CLR4_5_228hn28hnlusvnlmc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.performance.PageModelPerformanceTest.test_decodeObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),104321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r89gv328ht() throws Exception{try{__CLR4_5_228hn28hnlusvnlmc.R.inc(104321);
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104322);List<Codec> decoders = new ArrayList<Codec>();
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104323);decoders.add(new JacksonCodec());
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104324);decoders.add(new FastjsonCodec());

        __CLR4_5_228hn28hnlusvnlmc.R.inc(104325);for (int i = 0; (((i < 20)&&(__CLR4_5_228hn28hnlusvnlmc.R.iget(104326)!=0|true))||(__CLR4_5_228hn28hnlusvnlmc.R.iget(104327)==0&false)); ++i) {{
            __CLR4_5_228hn28hnlusvnlmc.R.inc(104328);for (Codec decoder : decoders) {{
                __CLR4_5_228hn28hnlusvnlmc.R.inc(104329);decodeToJavaBean(text, decoder);
            }
            }__CLR4_5_228hn28hnlusvnlmc.R.inc(104330);System.out.println();
        }
        }__CLR4_5_228hn28hnlusvnlmc.R.inc(104331);System.out.println();
        // System.out.println(text);
    }finally{__CLR4_5_228hn28hnlusvnlmc.R.flushNeeded();}}

    public void decodeToJavaBean(String text, Codec decoder) throws Exception {try{__CLR4_5_228hn28hnlusvnlmc.R.inc(104332);
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104333);long startNano = System.nanoTime();
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104334);for (int i = 0; (((i < COUNT)&&(__CLR4_5_228hn28hnlusvnlmc.R.iget(104335)!=0|true))||(__CLR4_5_228hn28hnlusvnlmc.R.iget(104336)==0&false)); ++i) {{
            __CLR4_5_228hn28hnlusvnlmc.R.inc(104337);decoder.decodeObject(text, PageInstance.class);
        }
        }__CLR4_5_228hn28hnlusvnlmc.R.inc(104338);long nano = System.nanoTime() - startNano;
        __CLR4_5_228hn28hnlusvnlmc.R.inc(104339);System.out.println(decoder.getName() + " : \t" + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_228hn28hnlusvnlmc.R.flushNeeded();}}
}
