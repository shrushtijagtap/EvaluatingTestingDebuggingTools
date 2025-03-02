/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.jsoniter.JsonIterator;
import com.jsoniter.spi.TypeLiteral;
import junit.framework.TestCase;

import java.lang.reflect.Type;

/**
 * Created by wenshao on 27/12/2016.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class JsonIteratorImageTest extends TestCase {static class __CLR4_1_1022k822k8luszwhzn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,96692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String input = "{\"bitrate\":262144,\"duration\":18000000,\"format\":\"video/mpg4\",\"height\":480,\"persons\":[\"Bill Gates\",\"Steve Jobs\"],\"player\":\"JAVA\",\"size\":58982400,\"title\":\"Javaone Keynote\",\"uri\":\"http://javaone.com/keynote.mpg\",\"width\":640}";
    private byte[] inputBytes = input.getBytes();
    private TypeLiteral<Model> modelTypeLiteral; // this is thread-safe can reused
    private JsonIterator iter;

    private int COUNT = 1000 * 1000 * 1;

    protected void setUp() throws Exception {try{__CLR4_1_1022k822k8luszwhzn.R.inc(96632);
        __CLR4_1_1022k822k8luszwhzn.R.inc(96633);inputBytes = input.getBytes();
        __CLR4_1_1022k822k8luszwhzn.R.inc(96634);iter = new JsonIterator();
        __CLR4_1_1022k822k8luszwhzn.R.inc(96635);modelTypeLiteral = new TypeLiteral<Model>() {
        };
    }finally{__CLR4_1_1022k822k8luszwhzn.R.flushNeeded();}}

    public void test_for_iterator() throws Exception {__CLR4_1_1022k822k8luszwhzn.R.globalSliceStart(getClass().getName(),96636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104gbqjs22kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1022k822k8luszwhzn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1022k822k8luszwhzn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.JsonIteratorImageTest.test_for_iterator",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),96636,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104gbqjs22kc() throws Exception{try{__CLR4_1_1022k822k8luszwhzn.R.inc(96636);
        __CLR4_1_1022k822k8luszwhzn.R.inc(96637);iter.reset(inputBytes);
        __CLR4_1_1022k822k8luszwhzn.R.inc(96638);Model m2 = iter.read(modelTypeLiteral);

        __CLR4_1_1022k822k8luszwhzn.R.inc(96639);fastjson();
        __CLR4_1_1022k822k8luszwhzn.R.inc(96640);for (int i = 0; (((i < 5)&&(__CLR4_1_1022k822k8luszwhzn.R.iget(96641)!=0|true))||(__CLR4_1_1022k822k8luszwhzn.R.iget(96642)==0&false)); ++i) {{
            __CLR4_1_1022k822k8luszwhzn.R.inc(96643);long startMillis = System.currentTimeMillis();
            __CLR4_1_1022k822k8luszwhzn.R.inc(96644);fastjson();
            __CLR4_1_1022k822k8luszwhzn.R.inc(96645);long millis = System.currentTimeMillis() - startMillis;
            __CLR4_1_1022k822k8luszwhzn.R.inc(96646);System.out.println("fastjson : " + millis);
        }

//        jsoniterator();
//        for (int i = 0; i < 5; ++i) {
//            long startMillis = System.currentTimeMillis();
//            jsoniterator();
//            long millis = System.currentTimeMillis() - startMillis;
//            System.out.println("jsoniterator : " + millis);
//        }
    }}finally{__CLR4_1_1022k822k8luszwhzn.R.flushNeeded();}}

    private void jsoniterator() throws java.io.IOException {try{__CLR4_1_1022k822k8luszwhzn.R.inc(96647);
        __CLR4_1_1022k822k8luszwhzn.R.inc(96648);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1022k822k8luszwhzn.R.iget(96649)!=0|true))||(__CLR4_1_1022k822k8luszwhzn.R.iget(96650)==0&false)); ++i){{
            __CLR4_1_1022k822k8luszwhzn.R.inc(96651);iter.reset(inputBytes);
            __CLR4_1_1022k822k8luszwhzn.R.inc(96652);Model model2 = iter.read(modelTypeLiteral);
        }
    }}finally{__CLR4_1_1022k822k8luszwhzn.R.flushNeeded();}}

    private void fastjson() throws java.io.IOException {try{__CLR4_1_1022k822k8luszwhzn.R.inc(96653);
        __CLR4_1_1022k822k8luszwhzn.R.inc(96654);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1022k822k8luszwhzn.R.iget(96655)!=0|true))||(__CLR4_1_1022k822k8luszwhzn.R.iget(96656)==0&false)); ++i){{
            __CLR4_1_1022k822k8luszwhzn.R.inc(96657);Model model2 = JSON.parseObject(input, Model.class);
        }
    }}finally{__CLR4_1_1022k822k8luszwhzn.R.flushNeeded();}}

    public static class Model {
        public int id;
        public String name;
    }

    public static Object decode_(JsonIterator iter) throws java.io.IOException {try{__CLR4_1_1022k822k8luszwhzn.R.inc(96658);
        __CLR4_1_1022k822k8luszwhzn.R.inc(96659);if ((((iter.readNull())&&(__CLR4_1_1022k822k8luszwhzn.R.iget(96660)!=0|true))||(__CLR4_1_1022k822k8luszwhzn.R.iget(96661)==0&false))) {{
            __CLR4_1_1022k822k8luszwhzn.R.inc(96662);com.jsoniter.CodegenAccess.resetExistingObject(iter);
            __CLR4_1_1022k822k8luszwhzn.R.inc(96663);return null;
        }
        }__CLR4_1_1022k822k8luszwhzn.R.inc(96664);JsonIteratorImageTest.Model obj = ((((com.jsoniter.CodegenAccess.existingObject(iter) == null )&&(__CLR4_1_1022k822k8luszwhzn.R.iget(96665)!=0|true))||(__CLR4_1_1022k822k8luszwhzn.R.iget(96666)==0&false))? new JsonIteratorImageTest.Model() : (JsonIteratorImageTest.Model)com.jsoniter.CodegenAccess.resetExistingObject(iter));
        __CLR4_1_1022k822k8luszwhzn.R.inc(96667);if ((((!com.jsoniter.CodegenAccess.readObjectStart(iter))&&(__CLR4_1_1022k822k8luszwhzn.R.iget(96668)!=0|true))||(__CLR4_1_1022k822k8luszwhzn.R.iget(96669)==0&false))) {{ __CLR4_1_1022k822k8luszwhzn.R.inc(96670);return obj; }
        }boolean __CLB4_1_10_bool0=false;__CLR4_1_1022k822k8luszwhzn.R.inc(96671);switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
            case 926444256:if (!__CLB4_1_10_bool0) {__CLR4_1_1022k822k8luszwhzn.R.inc(96672);__CLB4_1_10_bool0=true;}
                __CLR4_1_1022k822k8luszwhzn.R.inc(96673);obj.id = (int)iter.readInt();
                __CLR4_1_1022k822k8luszwhzn.R.inc(96674);break;
            case -1925595674:if (!__CLB4_1_10_bool0) {__CLR4_1_1022k822k8luszwhzn.R.inc(96675);__CLB4_1_10_bool0=true;}
                __CLR4_1_1022k822k8luszwhzn.R.inc(96676);obj.name = (String)iter.readString();
                __CLR4_1_1022k822k8luszwhzn.R.inc(96677);break;
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_1022k822k8luszwhzn.R.inc(96678);__CLB4_1_10_bool0=true;}
                __CLR4_1_1022k822k8luszwhzn.R.inc(96679);iter.skip();
        }
        __CLR4_1_1022k822k8luszwhzn.R.inc(96680);while ((((com.jsoniter.CodegenAccess.nextToken(iter) == ',')&&(__CLR4_1_1022k822k8luszwhzn.R.iget(96681)!=0|true))||(__CLR4_1_1022k822k8luszwhzn.R.iget(96682)==0&false))) {{
            boolean __CLB4_1_10_bool1=false;__CLR4_1_1022k822k8luszwhzn.R.inc(96683);switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
                case 926444256:if (!__CLB4_1_10_bool1) {__CLR4_1_1022k822k8luszwhzn.R.inc(96684);__CLB4_1_10_bool1=true;}
                    __CLR4_1_1022k822k8luszwhzn.R.inc(96685);obj.id = (int)iter.readInt();
                    __CLR4_1_1022k822k8luszwhzn.R.inc(96686);continue;
                case -1925595674:if (!__CLB4_1_10_bool1) {__CLR4_1_1022k822k8luszwhzn.R.inc(96687);__CLB4_1_10_bool1=true;}
                    __CLR4_1_1022k822k8luszwhzn.R.inc(96688);obj.name = (String)iter.readString();
                    __CLR4_1_1022k822k8luszwhzn.R.inc(96689);continue;
            }
            __CLR4_1_1022k822k8luszwhzn.R.inc(96690);iter.skip();
        }
        }__CLR4_1_1022k822k8luszwhzn.R.inc(96691);return obj;
    }finally{__CLR4_1_1022k822k8luszwhzn.R.flushNeeded();}}


}
