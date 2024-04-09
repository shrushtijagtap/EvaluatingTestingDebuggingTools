/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.performance.case1;

import java.io.InputStream;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.test.codec.Codec;
import com.alibaba.json.test.codec.FastjsonCodec;
import com.alibaba.json.test.codec.GsonCodec;
import com.alibaba.json.test.codec.JacksonCodec;
import com.alibaba.json.test.codec.JsonLibCodec;
import com.alibaba.json.test.codec.SimpleJsonCodec;

public class IntDecoderPerformanceTest extends TestCase {static class __CLR4_5_228il28illusvnlmh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,104404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String    text;
    private final int COUNT = 1000 * 100;

    protected void setUp() throws Exception {try{__CLR4_5_228il28illusvnlmh.R.inc(104349);
        __CLR4_5_228il28illusvnlmh.R.inc(104350);String resource;
        __CLR4_5_228il28illusvnlmh.R.inc(104351);resource = "json/int_100.json";
        __CLR4_5_228il28illusvnlmh.R.inc(104352);resource = "json/object_f_int_1000.json";
        // resource = "json/string_array_10000.json";
        __CLR4_5_228il28illusvnlmh.R.inc(104353);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
        __CLR4_5_228il28illusvnlmh.R.inc(104354);text = IOUtils.toString(is);
        __CLR4_5_228il28illusvnlmh.R.inc(104355);is.close();

        // text =
        // "{\"badboy\":true,\"description\":\"\u795e\u68cd\u654c\u4eba\u59d0\",\"name\":\"\u6821\u957f\",\"age\":3,\"birthdate\":1293278091773,\"salary\":123456789.0123}";
    }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

    public void test_performance() throws Exception {__CLR4_5_228il28illusvnlmh.R.globalSliceStart(getClass().getName(),104356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uun6y28is();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_228il28illusvnlmh.R.rethrow($CLV_t2$);}finally{__CLR4_5_228il28illusvnlmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.performance.case1.IntDecoderPerformanceTest.test_performance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),104356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uun6y28is() throws Exception{try{__CLR4_5_228il28illusvnlmh.R.inc(104356);

        __CLR4_5_228il28illusvnlmh.R.inc(104357);JSON.parse("true");

        __CLR4_5_228il28illusvnlmh.R.inc(104358);List<Codec> decoders = new ArrayList<Codec>();
        __CLR4_5_228il28illusvnlmh.R.inc(104359);decoders.add(new FastjsonCodec());
        __CLR4_5_228il28illusvnlmh.R.inc(104360);decoders.add(new JacksonCodec());
        __CLR4_5_228il28illusvnlmh.R.inc(104361);decoders.add(new SimpleJsonCodec());
        __CLR4_5_228il28illusvnlmh.R.inc(104362);decoders.add(new JsonLibCodec());
        __CLR4_5_228il28illusvnlmh.R.inc(104363);decoders.add(new GsonCodec());

        __CLR4_5_228il28illusvnlmh.R.inc(104364);for (int i = 0; (((i < 4)&&(__CLR4_5_228il28illusvnlmh.R.iget(104365)!=0|true))||(__CLR4_5_228il28illusvnlmh.R.iget(104366)==0&false)); ++i) {{
            __CLR4_5_228il28illusvnlmh.R.inc(104367);for (Codec decoder : decoders) {{
                __CLR4_5_228il28illusvnlmh.R.inc(104368);decode(text, decoder);
                // decodeToJavaBean(text, decoder);
            }
            }__CLR4_5_228il28illusvnlmh.R.inc(104369);System.out.println();
        }
        }__CLR4_5_228il28illusvnlmh.R.inc(104370);System.out.println();
        __CLR4_5_228il28illusvnlmh.R.inc(104371);System.out.println(text);
    }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

    private void decode(String text, Codec decoder) throws Exception {try{__CLR4_5_228il28illusvnlmh.R.inc(104372);
        __CLR4_5_228il28illusvnlmh.R.inc(104373);long startNano = System.nanoTime();
        __CLR4_5_228il28illusvnlmh.R.inc(104374);for (int i = 0; (((i < COUNT)&&(__CLR4_5_228il28illusvnlmh.R.iget(104375)!=0|true))||(__CLR4_5_228il28illusvnlmh.R.iget(104376)==0&false)); ++i) {{
            __CLR4_5_228il28illusvnlmh.R.inc(104377);decoder.decode(text);
        }
        }__CLR4_5_228il28illusvnlmh.R.inc(104378);long nano = System.nanoTime() - startNano;
        __CLR4_5_228il28illusvnlmh.R.inc(104379);System.out.println(decoder.getName() + " : \t" + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

    public static class Person {

        private String     name;
        private int        age;
        private BigDecimal salary;
        private Date       birthdate;
        private boolean    old;
        private String     description;

        public String getDescription() {try{__CLR4_5_228il28illusvnlmh.R.inc(104380);
            __CLR4_5_228il28illusvnlmh.R.inc(104381);return description;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public void setDescription(String description) {try{__CLR4_5_228il28illusvnlmh.R.inc(104382);
            __CLR4_5_228il28illusvnlmh.R.inc(104383);this.description = description;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public boolean isOld() {try{__CLR4_5_228il28illusvnlmh.R.inc(104384);
            __CLR4_5_228il28illusvnlmh.R.inc(104385);return old;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public void setOld(boolean old) {try{__CLR4_5_228il28illusvnlmh.R.inc(104386);
            __CLR4_5_228il28illusvnlmh.R.inc(104387);this.old = old;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public Date getBirthdate() {try{__CLR4_5_228il28illusvnlmh.R.inc(104388);
            __CLR4_5_228il28illusvnlmh.R.inc(104389);return birthdate;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public void setBirthdate(Date birthdate) {try{__CLR4_5_228il28illusvnlmh.R.inc(104390);
            __CLR4_5_228il28illusvnlmh.R.inc(104391);this.birthdate = birthdate;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_228il28illusvnlmh.R.inc(104392);
            __CLR4_5_228il28illusvnlmh.R.inc(104393);return name;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_228il28illusvnlmh.R.inc(104394);
            __CLR4_5_228il28illusvnlmh.R.inc(104395);this.name = name;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_228il28illusvnlmh.R.inc(104396);
            __CLR4_5_228il28illusvnlmh.R.inc(104397);return age;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_228il28illusvnlmh.R.inc(104398);
            __CLR4_5_228il28illusvnlmh.R.inc(104399);this.age = age;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_5_228il28illusvnlmh.R.inc(104400);
            __CLR4_5_228il28illusvnlmh.R.inc(104401);return salary;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_5_228il28illusvnlmh.R.inc(104402);
            __CLR4_5_228il28illusvnlmh.R.inc(104403);this.salary = salary;
        }finally{__CLR4_5_228il28illusvnlmh.R.flushNeeded();}}

    }
}
