/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.serializer;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.IOUtils;

public class SerializeWriterTest {static class __CLR4_1_10w6tw6tlusqjvqg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,41761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Logger logger = Logger.getLogger(SerializeWriterTest.class.getSimpleName());

    private final ByteArrayOutputStream baos = new ByteArrayOutputStream();

    private final SerializeWriter writer = new SerializeWriter(new OutputStreamWriter(baos));

    @Before
    public void setUp() throws Exception {try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41717);
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41718);
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}

    @Test
    public void testWriteLiteBasicStr() throws UnsupportedEncodingException {__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceStart(getClass().getName(),41719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a0yr2dw6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w6tw6tlusqjvqg.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.serializer.SerializeWriterTest.testWriteLiteBasicStr",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41719,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a0yr2dw6v() throws UnsupportedEncodingException{try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41719);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41720);String targetStr = new String(IOUtils.DIGITS);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41721);this.doTestWrite(targetStr);
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}

    private String doTestWrite(String input) throws UnsupportedEncodingException {try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41722);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41723);writer.writeString(input, (char) 0);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41724);writer.flush();
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41725);String result = this.baos.toString("UTF-8");

        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41726);Assert.assertEquals(input, JSON.parse(result));

        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41727);logger.info(result);

        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41728);return result;
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}

    @Test
    public void testWriteLiteSpecilaStr() throws UnsupportedEncodingException {__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceStart(getClass().getName(),41729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9pd9sw75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w6tw6tlusqjvqg.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.serializer.SerializeWriterTest.testWriteLiteSpecilaStr",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9pd9sw75() throws UnsupportedEncodingException{try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41729);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41730);this.doTestWrite(this.makeSpecialChars());
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}

    private String makeSpecialChars() {try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41731);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41732);StringBuilder strBuilder = new StringBuilder(128);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41733);for (char c = 128; (((c <= 160)&&(__CLR4_1_10w6tw6tlusqjvqg.R.iget(41734)!=0|true))||(__CLR4_1_10w6tw6tlusqjvqg.R.iget(41735)==0&false)); c++) {{
            __CLR4_1_10w6tw6tlusqjvqg.R.inc(41736);strBuilder.append(c);
        }
        }__CLR4_1_10w6tw6tlusqjvqg.R.inc(41737);return strBuilder.toString();
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}

    @Test
    public void testWriteLargeBasicStr() throws UnsupportedEncodingException {__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceStart(getClass().getName(),41738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qlk1fcw7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w6tw6tlusqjvqg.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.serializer.SerializeWriterTest.testWriteLargeBasicStr",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41738,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qlk1fcw7e() throws UnsupportedEncodingException{try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41738);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41739);String tmp = new String(IOUtils.DIGITS);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41740);StringBuilder builder = new StringBuilder();
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41741);for (int i = 0; (((i < 200)&&(__CLR4_1_10w6tw6tlusqjvqg.R.iget(41742)!=0|true))||(__CLR4_1_10w6tw6tlusqjvqg.R.iget(41743)==0&false)); i++) {{
            __CLR4_1_10w6tw6tlusqjvqg.R.inc(41744);builder.append(tmp);
        }
        }__CLR4_1_10w6tw6tlusqjvqg.R.inc(41745);this.doTestWrite(builder.toString());
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}

    @Test
    public void testWriteLargeSpecialStr() throws UnsupportedEncodingException {__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceStart(getClass().getName(),41746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109fb3jhw7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w6tw6tlusqjvqg.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.serializer.SerializeWriterTest.testWriteLargeSpecialStr",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41746,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109fb3jhw7m() throws UnsupportedEncodingException{try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41746);

        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41747);String tmp = this.makeSpecialChars();
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41748);StringBuilder builder = new StringBuilder();
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41749);for (int i = 0; (((i < 200)&&(__CLR4_1_10w6tw6tlusqjvqg.R.iget(41750)!=0|true))||(__CLR4_1_10w6tw6tlusqjvqg.R.iget(41751)==0&false)); i++) {{
            __CLR4_1_10w6tw6tlusqjvqg.R.inc(41752);builder.append(tmp);
        }
        }__CLR4_1_10w6tw6tlusqjvqg.R.inc(41753);this.doTestWrite(builder.toString());
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}

    @Test
    public void test_large() throws Exception {__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceStart(getClass().getName(),41754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jvcudxw7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w6tw6tlusqjvqg.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w6tw6tlusqjvqg.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.serializer.SerializeWriterTest.test_large",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41754,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jvcudxw7u() throws Exception{try{__CLR4_1_10w6tw6tlusqjvqg.R.inc(41754);
        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41755);SerializeWriter writer = new SerializeWriter();

        __CLR4_1_10w6tw6tlusqjvqg.R.inc(41756);for (int i = 0; (((i < 1024 * 1024)&&(__CLR4_1_10w6tw6tlusqjvqg.R.iget(41757)!=0|true))||(__CLR4_1_10w6tw6tlusqjvqg.R.iget(41758)==0&false)); ++i) {{
            __CLR4_1_10w6tw6tlusqjvqg.R.inc(41759);writer.write(i);
        }

        }__CLR4_1_10w6tw6tlusqjvqg.R.inc(41760);writer.close();
    }finally{__CLR4_1_10w6tw6tlusqjvqg.R.flushNeeded();}}
}
