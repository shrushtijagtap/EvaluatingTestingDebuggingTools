/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

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
@java.lang.SuppressWarnings({"fallthrough"}) public class JsonIteratorImageTest extends TestCase {static class __CLR4_5_221lp21lplusyjwht{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95449,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String input = "{\"bitrate\":262144,\"duration\":18000000,\"format\":\"video/mpg4\",\"height\":480,\"persons\":[\"Bill Gates\",\"Steve Jobs\"],\"player\":\"JAVA\",\"size\":58982400,\"title\":\"Javaone Keynote\",\"uri\":\"http://javaone.com/keynote.mpg\",\"width\":640}";
    private byte[] inputBytes = input.getBytes();
    private TypeLiteral<Model> modelTypeLiteral; // this is thread-safe can reused
    private JsonIterator iter;

    private int COUNT = 1000 * 1000 * 1;

    protected void setUp() throws Exception {try{__CLR4_5_221lp21lplusyjwht.R.inc(95389);
        __CLR4_5_221lp21lplusyjwht.R.inc(95390);inputBytes = input.getBytes();
        __CLR4_5_221lp21lplusyjwht.R.inc(95391);iter = new JsonIterator();
        __CLR4_5_221lp21lplusyjwht.R.inc(95392);modelTypeLiteral = new TypeLiteral<Model>() {
        };
    }finally{__CLR4_5_221lp21lplusyjwht.R.flushNeeded();}}

    public void test_for_iterator() throws Exception {__CLR4_5_221lp21lplusyjwht.R.globalSliceStart(getClass().getName(),95393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24gbqjs21lt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221lp21lplusyjwht.R.rethrow($CLV_t2$);}finally{__CLR4_5_221lp21lplusyjwht.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.JsonIteratorImageTest.test_for_iterator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24gbqjs21lt() throws Exception{try{__CLR4_5_221lp21lplusyjwht.R.inc(95393);
        __CLR4_5_221lp21lplusyjwht.R.inc(95394);iter.reset(inputBytes);
        __CLR4_5_221lp21lplusyjwht.R.inc(95395);Model m2 = iter.read(modelTypeLiteral);

        __CLR4_5_221lp21lplusyjwht.R.inc(95396);fastjson();
        __CLR4_5_221lp21lplusyjwht.R.inc(95397);for (int i = 0; (((i < 5)&&(__CLR4_5_221lp21lplusyjwht.R.iget(95398)!=0|true))||(__CLR4_5_221lp21lplusyjwht.R.iget(95399)==0&false)); ++i) {{
            __CLR4_5_221lp21lplusyjwht.R.inc(95400);long startMillis = System.currentTimeMillis();
            __CLR4_5_221lp21lplusyjwht.R.inc(95401);fastjson();
            __CLR4_5_221lp21lplusyjwht.R.inc(95402);long millis = System.currentTimeMillis() - startMillis;
            __CLR4_5_221lp21lplusyjwht.R.inc(95403);System.out.println("fastjson : " + millis);
        }

//        jsoniterator();
//        for (int i = 0; i < 5; ++i) {
//            long startMillis = System.currentTimeMillis();
//            jsoniterator();
//            long millis = System.currentTimeMillis() - startMillis;
//            System.out.println("jsoniterator : " + millis);
//        }
    }}finally{__CLR4_5_221lp21lplusyjwht.R.flushNeeded();}}

    private void jsoniterator() throws java.io.IOException {try{__CLR4_5_221lp21lplusyjwht.R.inc(95404);
        __CLR4_5_221lp21lplusyjwht.R.inc(95405);for (int i = 0; (((i < COUNT)&&(__CLR4_5_221lp21lplusyjwht.R.iget(95406)!=0|true))||(__CLR4_5_221lp21lplusyjwht.R.iget(95407)==0&false)); ++i){{
            __CLR4_5_221lp21lplusyjwht.R.inc(95408);iter.reset(inputBytes);
            __CLR4_5_221lp21lplusyjwht.R.inc(95409);Model model2 = iter.read(modelTypeLiteral);
        }
    }}finally{__CLR4_5_221lp21lplusyjwht.R.flushNeeded();}}

    private void fastjson() throws java.io.IOException {try{__CLR4_5_221lp21lplusyjwht.R.inc(95410);
        __CLR4_5_221lp21lplusyjwht.R.inc(95411);for (int i = 0; (((i < COUNT)&&(__CLR4_5_221lp21lplusyjwht.R.iget(95412)!=0|true))||(__CLR4_5_221lp21lplusyjwht.R.iget(95413)==0&false)); ++i){{
            __CLR4_5_221lp21lplusyjwht.R.inc(95414);Model model2 = JSON.parseObject(input, Model.class);
        }
    }}finally{__CLR4_5_221lp21lplusyjwht.R.flushNeeded();}}

    public static class Model {
        public int id;
        public String name;
    }

    public static Object decode_(JsonIterator iter) throws java.io.IOException {try{__CLR4_5_221lp21lplusyjwht.R.inc(95415);
        __CLR4_5_221lp21lplusyjwht.R.inc(95416);if ((((iter.readNull())&&(__CLR4_5_221lp21lplusyjwht.R.iget(95417)!=0|true))||(__CLR4_5_221lp21lplusyjwht.R.iget(95418)==0&false))) {{
            __CLR4_5_221lp21lplusyjwht.R.inc(95419);com.jsoniter.CodegenAccess.resetExistingObject(iter);
            __CLR4_5_221lp21lplusyjwht.R.inc(95420);return null;
        }
        }__CLR4_5_221lp21lplusyjwht.R.inc(95421);JsonIteratorImageTest.Model obj = ((((com.jsoniter.CodegenAccess.existingObject(iter) == null )&&(__CLR4_5_221lp21lplusyjwht.R.iget(95422)!=0|true))||(__CLR4_5_221lp21lplusyjwht.R.iget(95423)==0&false))? new JsonIteratorImageTest.Model() : (JsonIteratorImageTest.Model)com.jsoniter.CodegenAccess.resetExistingObject(iter));
        __CLR4_5_221lp21lplusyjwht.R.inc(95424);if ((((!com.jsoniter.CodegenAccess.readObjectStart(iter))&&(__CLR4_5_221lp21lplusyjwht.R.iget(95425)!=0|true))||(__CLR4_5_221lp21lplusyjwht.R.iget(95426)==0&false))) {{ __CLR4_5_221lp21lplusyjwht.R.inc(95427);return obj; }
        }boolean __CLB4_5_2_bool0=false;__CLR4_5_221lp21lplusyjwht.R.inc(95428);switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
            case 926444256:if (!__CLB4_5_2_bool0) {__CLR4_5_221lp21lplusyjwht.R.inc(95429);__CLB4_5_2_bool0=true;}
                __CLR4_5_221lp21lplusyjwht.R.inc(95430);obj.id = (int)iter.readInt();
                __CLR4_5_221lp21lplusyjwht.R.inc(95431);break;
            case -1925595674:if (!__CLB4_5_2_bool0) {__CLR4_5_221lp21lplusyjwht.R.inc(95432);__CLB4_5_2_bool0=true;}
                __CLR4_5_221lp21lplusyjwht.R.inc(95433);obj.name = (String)iter.readString();
                __CLR4_5_221lp21lplusyjwht.R.inc(95434);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_221lp21lplusyjwht.R.inc(95435);__CLB4_5_2_bool0=true;}
                __CLR4_5_221lp21lplusyjwht.R.inc(95436);iter.skip();
        }
        __CLR4_5_221lp21lplusyjwht.R.inc(95437);while ((((com.jsoniter.CodegenAccess.nextToken(iter) == ',')&&(__CLR4_5_221lp21lplusyjwht.R.iget(95438)!=0|true))||(__CLR4_5_221lp21lplusyjwht.R.iget(95439)==0&false))) {{
            boolean __CLB4_5_2_bool1=false;__CLR4_5_221lp21lplusyjwht.R.inc(95440);switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
                case 926444256:if (!__CLB4_5_2_bool1) {__CLR4_5_221lp21lplusyjwht.R.inc(95441);__CLB4_5_2_bool1=true;}
                    __CLR4_5_221lp21lplusyjwht.R.inc(95442);obj.id = (int)iter.readInt();
                    __CLR4_5_221lp21lplusyjwht.R.inc(95443);continue;
                case -1925595674:if (!__CLB4_5_2_bool1) {__CLR4_5_221lp21lplusyjwht.R.inc(95444);__CLB4_5_2_bool1=true;}
                    __CLR4_5_221lp21lplusyjwht.R.inc(95445);obj.name = (String)iter.readString();
                    __CLR4_5_221lp21lplusyjwht.R.inc(95446);continue;
            }
            __CLR4_5_221lp21lplusyjwht.R.inc(95447);iter.skip();
        }
        }__CLR4_5_221lp21lplusyjwht.R.inc(95448);return obj;
    }finally{__CLR4_5_221lp21lplusyjwht.R.flushNeeded();}}


}
