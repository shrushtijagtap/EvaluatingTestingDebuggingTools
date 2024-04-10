/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.performance;

import java.io.InputStream;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;

import com.alibaba.json.test.codec.Codec;
import com.alibaba.json.test.codec.FastjsonCodec;
import com.alibaba.json.test.codec.JacksonCodec;

public class DecoderPerformanceTest extends TestCase {static class __CLR4_5_2272o272olusyjx1b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,102532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    final int      COUNT = 1000 * 100;
    private String text;

    protected void setUp() throws Exception {try{__CLR4_5_2272o272olusyjx1b.R.inc(102480);
        __CLR4_5_2272o272olusyjx1b.R.inc(102481);text = "{\"old\":true,\"description\":\"\u795e\u68cd\",\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}";

        __CLR4_5_2272o272olusyjx1b.R.inc(102482);text = "[{\"S\":321061,\"T\":\"GetAttributeResp\"},{\"ERROR\":null,\"TS\":0,\"VAL\":{\"SqlList\":[{\"BatchSizeMax\":0,\"BatchSizeTotal\":0,\"ConcurrentMax\":1,\"DataSource\":\"jdbc:wrap-jdbc:filters=default,encoding:name=ds-offer:jdbc:mysql://100.10.10.10:8066/xxx\",\"EffectedRowCount\":0,\"ErrorCount\":0,\"ExecuteCount\":5,\"FetchRowCount\":5,\"File\":null,\"ID\":2001,\"LastError\":null,\"LastTime\":1292742908178,\"MaxTimespan\":16,\"MaxTimespanOccurTime\":1292742668191,\"Name\":null,\"RunningCount\":0,\"SQL\":\"SELECT @@SQL_MODE\",\"TotalTime\":83}]}}]";
        // text =
        // "[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25]";
        // text =
        // "[\"description\", \"\u795e\u68cd\", \"\u6821\u957f\", \"old\",\"salary\", \"jdbc:wrap-jdbc:filters=default,encoding:name=ds-offer:jdbc:mysql://100.10.10.10:8066/xxx\"]";
        // text =
        // "{\"OLD\":true,\"DESCRIPTION\":\"\u795e\u68cd\",\"name\":\"\u6821\u957f\",\"AGE\":3,\"SALARY\":123456789.0123}";
        __CLR4_5_2272o272olusyjx1b.R.inc(102483);text = "{\"badboy\":true,\"description\":\"\u795e\u68cd\u654c\u4eba\u59d0\",\"name\":\"\u6821\u957f\",\"age\":3,\"birthdate\":1293278091773,\"salary\":123456789.0123}";

        __CLR4_5_2272o272olusyjx1b.R.inc(102484);String resource = "json/group.json";
        __CLR4_5_2272o272olusyjx1b.R.inc(102485);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
        __CLR4_5_2272o272olusyjx1b.R.inc(102486);text = IOUtils.toString(is);
        __CLR4_5_2272o272olusyjx1b.R.inc(102487);is.close();
    }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

    public void test_performance() throws Exception {__CLR4_5_2272o272olusyjx1b.R.globalSliceStart(getClass().getName(),102488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uun6y272w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2272o272olusyjx1b.R.rethrow($CLV_t2$);}finally{__CLR4_5_2272o272olusyjx1b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.performance.DecoderPerformanceTest.test_performance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),102488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uun6y272w() throws Exception{try{__CLR4_5_2272o272olusyjx1b.R.inc(102488);

        __CLR4_5_2272o272olusyjx1b.R.inc(102489);List<Codec> decoders = new ArrayList<Codec>();
        __CLR4_5_2272o272olusyjx1b.R.inc(102490);decoders.add(new JacksonCodec());
        __CLR4_5_2272o272olusyjx1b.R.inc(102491);decoders.add(new FastjsonCodec());

        __CLR4_5_2272o272olusyjx1b.R.inc(102492);for (int i = 0; (((i < 20)&&(__CLR4_5_2272o272olusyjx1b.R.iget(102493)!=0|true))||(__CLR4_5_2272o272olusyjx1b.R.iget(102494)==0&false)); ++i) {{
            __CLR4_5_2272o272olusyjx1b.R.inc(102495);for (Codec decoder : decoders) {{
                __CLR4_5_2272o272olusyjx1b.R.inc(102496);decode(text, decoder);
                // decodeToJavaBean(text, decoder);
            }
            }__CLR4_5_2272o272olusyjx1b.R.inc(102497);System.out.println();
        }
        }__CLR4_5_2272o272olusyjx1b.R.inc(102498);System.out.println();
        __CLR4_5_2272o272olusyjx1b.R.inc(102499);System.out.println(text);
    }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

    private void decode(String text, Codec decoder) throws Exception {try{__CLR4_5_2272o272olusyjx1b.R.inc(102500);
        __CLR4_5_2272o272olusyjx1b.R.inc(102501);long startNano = System.nanoTime();
        __CLR4_5_2272o272olusyjx1b.R.inc(102502);for (int i = 0; (((i < COUNT)&&(__CLR4_5_2272o272olusyjx1b.R.iget(102503)!=0|true))||(__CLR4_5_2272o272olusyjx1b.R.iget(102504)==0&false)); ++i) {{
            __CLR4_5_2272o272olusyjx1b.R.inc(102505);decoder.decode(text);
        }
        }__CLR4_5_2272o272olusyjx1b.R.inc(102506);long nano = System.nanoTime() - startNano;
        __CLR4_5_2272o272olusyjx1b.R.inc(102507);System.out.println(decoder.getName() + " : \t" + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

    public static class Person {

        private String     name;
        private int        age;
        private BigDecimal salary;
        private Date       birthdate;
        private boolean    old;
        private String     description;

        public String getDescription() {try{__CLR4_5_2272o272olusyjx1b.R.inc(102508);
            __CLR4_5_2272o272olusyjx1b.R.inc(102509);return description;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public void setDescription(String description) {try{__CLR4_5_2272o272olusyjx1b.R.inc(102510);
            __CLR4_5_2272o272olusyjx1b.R.inc(102511);this.description = description;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public boolean isOld() {try{__CLR4_5_2272o272olusyjx1b.R.inc(102512);
            __CLR4_5_2272o272olusyjx1b.R.inc(102513);return old;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public void setOld(boolean old) {try{__CLR4_5_2272o272olusyjx1b.R.inc(102514);
            __CLR4_5_2272o272olusyjx1b.R.inc(102515);this.old = old;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public Date getBirthdate() {try{__CLR4_5_2272o272olusyjx1b.R.inc(102516);
            __CLR4_5_2272o272olusyjx1b.R.inc(102517);return birthdate;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public void setBirthdate(Date birthdate) {try{__CLR4_5_2272o272olusyjx1b.R.inc(102518);
            __CLR4_5_2272o272olusyjx1b.R.inc(102519);this.birthdate = birthdate;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2272o272olusyjx1b.R.inc(102520);
            __CLR4_5_2272o272olusyjx1b.R.inc(102521);return name;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2272o272olusyjx1b.R.inc(102522);
            __CLR4_5_2272o272olusyjx1b.R.inc(102523);this.name = name;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_2272o272olusyjx1b.R.inc(102524);
            __CLR4_5_2272o272olusyjx1b.R.inc(102525);return age;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_2272o272olusyjx1b.R.inc(102526);
            __CLR4_5_2272o272olusyjx1b.R.inc(102527);this.age = age;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_5_2272o272olusyjx1b.R.inc(102528);
            __CLR4_5_2272o272olusyjx1b.R.inc(102529);return salary;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_5_2272o272olusyjx1b.R.inc(102530);
            __CLR4_5_2272o272olusyjx1b.R.inc(102531);this.salary = salary;
        }finally{__CLR4_5_2272o272olusyjx1b.R.flushNeeded();}}

    }
}
