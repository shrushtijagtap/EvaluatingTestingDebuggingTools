/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;

public class JSONReaderScannerTest__entity_int extends TestCase {static class __CLR4_1_101hnz1hnzluszwcib{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,69575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scanInt() throws Exception {__CLR4_1_101hnz1hnzluszwcib.R.globalSliceStart(getClass().getName(),69551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lzj1lg1hnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hnz1hnzluszwcib.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hnz1hnzluszwcib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderScannerTest__entity_int.test_scanInt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lzj1lg1hnz() throws Exception{try{__CLR4_1_101hnz1hnzluszwcib.R.inc(69551);
        __CLR4_1_101hnz1hnzluszwcib.R.inc(69552);StringBuffer buf = new StringBuffer();
        __CLR4_1_101hnz1hnzluszwcib.R.inc(69553);buf.append('[');
        __CLR4_1_101hnz1hnzluszwcib.R.inc(69554);for (int i = 0; (((i < 1024)&&(__CLR4_1_101hnz1hnzluszwcib.R.iget(69555)!=0|true))||(__CLR4_1_101hnz1hnzluszwcib.R.iget(69556)==0&false)); ++i) {{
            __CLR4_1_101hnz1hnzluszwcib.R.inc(69557);if ((((i != 0)&&(__CLR4_1_101hnz1hnzluszwcib.R.iget(69558)!=0|true))||(__CLR4_1_101hnz1hnzluszwcib.R.iget(69559)==0&false))) {{
                __CLR4_1_101hnz1hnzluszwcib.R.inc(69560);buf.append(',');
            }
            }__CLR4_1_101hnz1hnzluszwcib.R.inc(69561);buf.append("{\"id\":" + i + "}");
        }
        }__CLR4_1_101hnz1hnzluszwcib.R.inc(69562);buf.append(']');

        __CLR4_1_101hnz1hnzluszwcib.R.inc(69563);Reader reader = new StringReader(buf.toString());

        __CLR4_1_101hnz1hnzluszwcib.R.inc(69564);JSONReaderScanner scanner = new JSONReaderScanner(reader);

        __CLR4_1_101hnz1hnzluszwcib.R.inc(69565);DefaultJSONParser parser = new DefaultJSONParser(scanner);
        __CLR4_1_101hnz1hnzluszwcib.R.inc(69566);List<VO> array = parser.parseArray(VO.class);
        __CLR4_1_101hnz1hnzluszwcib.R.inc(69567);for (int i = 0; (((i < array.size())&&(__CLR4_1_101hnz1hnzluszwcib.R.iget(69568)!=0|true))||(__CLR4_1_101hnz1hnzluszwcib.R.iget(69569)==0&false)); ++i) {{
            __CLR4_1_101hnz1hnzluszwcib.R.inc(69570);Assert.assertEquals(i, array.get(i).getId());
        }
    }}finally{__CLR4_1_101hnz1hnzluszwcib.R.flushNeeded();}}

    public static class VO {

        private int id;

        public int getId() {try{__CLR4_1_101hnz1hnzluszwcib.R.inc(69571);
            __CLR4_1_101hnz1hnzluszwcib.R.inc(69572);return id;
        }finally{__CLR4_1_101hnz1hnzluszwcib.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101hnz1hnzluszwcib.R.inc(69573);
            __CLR4_1_101hnz1hnzluszwcib.R.inc(69574);this.id = id;
        }finally{__CLR4_1_101hnz1hnzluszwcib.R.flushNeeded();}}

    }
}
