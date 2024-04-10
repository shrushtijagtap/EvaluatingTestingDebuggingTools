/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.JSON;
import com.jsoniter.JsonIterator;
import junit.framework.TestCase;

/**
 * Created by wenshao on 27/12/2016.
 */
public class JsonIteratorTest extends TestCase {static class __CLR4_1_1022lw22lwluszwhzu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,96721,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_iterator() throws Exception {__CLR4_1_1022lw22lwluszwhzu.R.globalSliceStart(getClass().getName(),96692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104gbqjs22lw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1022lw22lwluszwhzu.R.rethrow($CLV_t2$);}finally{__CLR4_1_1022lw22lwluszwhzu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.JsonIteratorTest.test_for_iterator",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),96692,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104gbqjs22lw() throws Exception{try{__CLR4_1_1022lw22lwluszwhzu.R.inc(96692);
        __CLR4_1_1022lw22lwluszwhzu.R.inc(96693);String text = "{\"id\":1001,\"name\":\"wenshao\",\"type\":\"Small\"}";


        __CLR4_1_1022lw22lwluszwhzu.R.inc(96694);fastjson(text);
        __CLR4_1_1022lw22lwluszwhzu.R.inc(96695);jsoniterator(text);

        __CLR4_1_1022lw22lwluszwhzu.R.inc(96696);for (int i = 0; (((i < 5)&&(__CLR4_1_1022lw22lwluszwhzu.R.iget(96697)!=0|true))||(__CLR4_1_1022lw22lwluszwhzu.R.iget(96698)==0&false)); ++i) {{
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96699);long startMillis = System.currentTimeMillis();
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96700);fastjson(text);
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96701);long millis = System.currentTimeMillis() - startMillis;
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96702);System.out.println("fastjson : " + millis);
        }

        }__CLR4_1_1022lw22lwluszwhzu.R.inc(96703);for (int i = 0; (((i < 5)&&(__CLR4_1_1022lw22lwluszwhzu.R.iget(96704)!=0|true))||(__CLR4_1_1022lw22lwluszwhzu.R.iget(96705)==0&false)); ++i) {{
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96706);long startMillis = System.currentTimeMillis();
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96707);jsoniterator(text);
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96708);long millis = System.currentTimeMillis() - startMillis;
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96709);System.out.println("jsoniterator : " + millis);
        }
    }}finally{__CLR4_1_1022lw22lwluszwhzu.R.flushNeeded();}}

    private void jsoniterator(String text) throws java.io.IOException {try{__CLR4_1_1022lw22lwluszwhzu.R.inc(96710);
        __CLR4_1_1022lw22lwluszwhzu.R.inc(96711);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_1022lw22lwluszwhzu.R.iget(96712)!=0|true))||(__CLR4_1_1022lw22lwluszwhzu.R.iget(96713)==0&false)); ++i){{
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96714);JsonIterator it = JsonIterator.parse(text);
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96715);Model model2 = it.read(Model.class);
        }
    }}finally{__CLR4_1_1022lw22lwluszwhzu.R.flushNeeded();}}

    private void fastjson(String text) throws java.io.IOException {try{__CLR4_1_1022lw22lwluszwhzu.R.inc(96716);
        __CLR4_1_1022lw22lwluszwhzu.R.inc(96717);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_1022lw22lwluszwhzu.R.iget(96718)!=0|true))||(__CLR4_1_1022lw22lwluszwhzu.R.iget(96719)==0&false)); ++i){{
            __CLR4_1_1022lw22lwluszwhzu.R.inc(96720);Model model2 = JSON.parseObject(text, Model.class);
        }
    }}finally{__CLR4_1_1022lw22lwluszwhzu.R.flushNeeded();}}

    public static class Model {
        public int id;
        public String name;
        public Type type;
    }

    public static enum Type {
        Big, Small
    }
}
