/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

public class Issue1683 extends TestCase {static class __CLR4_5_21c3z1c3zlusyjsz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,62374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21c3z1c3zlusyjsz4.R.globalSliceStart(getClass().getName(),62351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1c3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21c3z1c3zlusyjsz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21c3z1c3zlusyjsz4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1600.Issue1683.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),62351,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1c3z() throws Exception{try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62351);
        __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62352);String line = "[2, \"\u6d6a\u6f2b\u5947\u4fa0\", \"\u96e8\u5929\u4e0d\u6253\u4f1e\", 4536]";
        __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62353);BookDO book = JSON.parseObject(line, BookDO.class, Feature.SupportArrayToBean);
        __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62354);assertEquals(2L, book.bookId.longValue());
        __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62355);assertEquals("\u6d6a\u6f2b\u5947\u4fa0", book.bookName);
        __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62356);assertEquals("\u96e8\u5929\u4e0d\u6253\u4f1e", book.authorName);
        __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62357);assertEquals(4536, book.wordCount.intValue());
    }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

    @JSONType(orders = {"bookId", "bookName", "authorName", "wordCount"})
    public static class BookDO {

        private Long bookId;

        private String bookName;

        private String authorName;

        private Integer wordCount;


        public Long getBookId() {try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62358);
            __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62359);return bookId;
        }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

        public void setBookId(Long bookId) {try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62360);
            __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62361);this.bookId = bookId;
        }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

        public String getBookName() {try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62362);
            __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62363);return bookName;
        }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

        public void setBookName(String bookName) {try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62364);
            __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62365);this.bookName = bookName;
        }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

        public String getAuthorName() {try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62366);
            __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62367);return authorName;
        }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

        public void setAuthorName(String authorName) {try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62368);
            __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62369);this.authorName = authorName;
        }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

        public Integer getWordCount() {try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62370);
            __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62371);return wordCount;
        }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

        public void setWordCount(Integer wordCount) {try{__CLR4_5_21c3z1c3zlusyjsz4.R.inc(62372);
            __CLR4_5_21c3z1c3zlusyjsz4.R.inc(62373);this.wordCount = wordCount;
        }finally{__CLR4_5_21c3z1c3zlusyjsz4.R.flushNeeded();}}

    }

}
