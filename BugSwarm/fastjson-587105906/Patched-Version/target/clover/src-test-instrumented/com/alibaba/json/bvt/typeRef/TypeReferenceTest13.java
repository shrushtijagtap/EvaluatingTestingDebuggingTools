/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.typeRef;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

/**
 * Created by wenshao on 09/02/2017.
 */
public class TypeReferenceTest13 extends TestCase {static class __CLR4_5_21xkr1xkrlusyjvqa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_typeRef() throws Exception {__CLR4_5_21xkr1xkrlusyjvqa.R.globalSliceStart(getClass().getName(),90171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v56y251xkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xkr1xkrlusyjvqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xkr1xkrlusyjvqa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.typeRef.TypeReferenceTest13.test_typeRef",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v56y251xkr() throws Exception{try{__CLR4_5_21xkr1xkrlusyjvqa.R.inc(90171);
        __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90172);String json = "{\"result\":{}}";
        __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90173);for (int i = 0; (((i < 100)&&(__CLR4_5_21xkr1xkrlusyjvqa.R.iget(90174)!=0|true))||(__CLR4_5_21xkr1xkrlusyjvqa.R.iget(90175)==0&false)); ++i) {{
            {
                __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90176);SearchResult<ResultItem, CountFacet> searchResult = parseSearchResult(
                        json, ResultItem.class, CountFacet.class);
            }
            {
                __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90177);SearchResult<ResultItem1, CountFacet1> searchResult = parseSearchResult(
                        json, ResultItem1.class, CountFacet1.class);
            }
        }
    }}finally{__CLR4_5_21xkr1xkrlusyjvqa.R.flushNeeded();}}

    public static <I, F> SearchResult<I, F> parseSearchResult(String resultStr, Class<I> itemType,
                                                              Class<F> facetType) {try{__CLR4_5_21xkr1xkrlusyjvqa.R.inc(90178);
        __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90179);SearchResult<I, F> searchResult = JSON.parseObject(resultStr, new TypeReference<SearchResult<I, F>>() {
        });

        __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90180);return searchResult;
    }finally{__CLR4_5_21xkr1xkrlusyjvqa.R.flushNeeded();}}

    public static class ResultItem {

    }

    public static class CountFacet {

    }

    public static class ResultItem1 {

    }

    public static class CountFacet1 {

    }

    public static class SearchResult<I, F> extends BaseResult {

        /**
         * \u5927\u7684\u7ed3\u679c\u5bf9\u8c61\uff0c\u5305\u542b\u7ed3\u679c\u6570\u636e\u3001\u8017\u65f6\u3001\u6570\u91cf\u7edf\u8ba1\u7b49\u4fe1\u606f
         */
        @JSONField(name = "result")
        private ResultDO<I, F> result;

        /**
         * \u76ee\u524d\u6ca1\u6709\u7528\u5230
         */
        @JSONField(name = "tracer")
        private String         tracer;

        public String getTracer() {try{__CLR4_5_21xkr1xkrlusyjvqa.R.inc(90181);
            __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90182);return tracer;
        }finally{__CLR4_5_21xkr1xkrlusyjvqa.R.flushNeeded();}}

        public void setTracer(String tracer) {try{__CLR4_5_21xkr1xkrlusyjvqa.R.inc(90183);
            __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90184);this.tracer = tracer;
        }finally{__CLR4_5_21xkr1xkrlusyjvqa.R.flushNeeded();}}

        public ResultDO<I, F> getResult() {try{__CLR4_5_21xkr1xkrlusyjvqa.R.inc(90185);
            __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90186);return result;
        }finally{__CLR4_5_21xkr1xkrlusyjvqa.R.flushNeeded();}}

        public void setResult(ResultDO<I, F> result) {try{__CLR4_5_21xkr1xkrlusyjvqa.R.inc(90187);
            __CLR4_5_21xkr1xkrlusyjvqa.R.inc(90188);this.result = result;
        }finally{__CLR4_5_21xkr1xkrlusyjvqa.R.flushNeeded();}}
    }

    public static class BaseResult {

    }

    public static class ResultDO<I, F> {

    }
}
