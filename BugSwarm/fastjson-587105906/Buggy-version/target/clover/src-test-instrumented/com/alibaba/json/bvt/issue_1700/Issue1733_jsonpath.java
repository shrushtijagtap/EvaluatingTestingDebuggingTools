/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1700;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Issue1733_jsonpath extends TestCase {static class __CLR4_1_101d9p1d9pluszwb87{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,63888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101d9p1d9pluszwb87.R.globalSliceStart(getClass().getName(),63853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1d9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d9p1d9pluszwb87.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d9p1d9pluszwb87.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.Issue1733_jsonpath.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63853,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1d9p() throws Exception{try{__CLR4_1_101d9p1d9pluszwb87.R.inc(63853);
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63854);Order order = new Order();
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63855);order.books.add(new Book(10, "\u52a8\u6f2b"));
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63856);order.books.add(new Book(50, "\u79d1\u5e7b"));
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63857);order.books.add(new Book(60, "\u5386\u53f2"));

        __CLR4_1_101d9p1d9pluszwb87.R.inc(63858);String path = "$.books[price>20 && category = '\u79d1\u5e7b']";
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63859);List result = (List) JSONPath.eval(order, path);
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63860);assertSame(1, result.size());
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63861);assertSame(order.books.get(1), result.get(0));
    }finally{__CLR4_1_101d9p1d9pluszwb87.R.flushNeeded();}}

    public void test_for_issue_or() throws Exception {__CLR4_1_101d9p1d9pluszwb87.R.globalSliceStart(getClass().getName(),63862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bhzqc31d9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d9p1d9pluszwb87.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d9p1d9pluszwb87.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.Issue1733_jsonpath.test_for_issue_or",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63862,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bhzqc31d9y() throws Exception{try{__CLR4_1_101d9p1d9pluszwb87.R.inc(63862);
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63863);Order order = new Order();
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63864);order.books.add(new Book(10, "\u52a8\u6f2b"));
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63865);order.books.add(new Book(50, "\u79d1\u5e7b"));
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63866);order.books.add(new Book(60, "\u5386\u53f2"));

        __CLR4_1_101d9p1d9pluszwb87.R.inc(63867);String path = "$.books[price>20||category = '\u79d1\u5e7b']";
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63868);List result = (List) JSONPath.eval(order, path);
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63869);assertEquals(2, result.size());
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63870);assertSame(order.books.get(1), result.get(0));
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63871);assertSame(order.books.get(2), result.get(1));
    }finally{__CLR4_1_101d9p1d9pluszwb87.R.flushNeeded();}}

    public void test_for_issue_or_1() throws Exception {__CLR4_1_101d9p1d9pluszwb87.R.globalSliceStart(getClass().getName(),63872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pby9a31da8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d9p1d9pluszwb87.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d9p1d9pluszwb87.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.Issue1733_jsonpath.test_for_issue_or_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63872,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pby9a31da8() throws Exception{try{__CLR4_1_101d9p1d9pluszwb87.R.inc(63872);
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63873);Order order = new Order();
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63874);order.books.add(new Book(10, "\u52a8\u6f2b"));
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63875);order.books.add(new Book(50, "\u79d1\u5e7b"));
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63876);order.books.add(new Book(60, "\u5386\u53f2"));

        __CLR4_1_101d9p1d9pluszwb87.R.inc(63877);String path = "$.books[category = '\u52a8\u6f2b' ||category = '\u79d1\u5e7b']";
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63878);List result = (List) JSONPath.eval(order, path);
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63879);assertEquals(2, result.size());
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63880);assertSame(order.books.get(0), result.get(0));
        __CLR4_1_101d9p1d9pluszwb87.R.inc(63881);assertSame(order.books.get(1), result.get(1));
    }finally{__CLR4_1_101d9p1d9pluszwb87.R.flushNeeded();}}

    public static class Order {
        public List<Book> books = new ArrayList<Book>();

    }

    public static class Book {
        public BigDecimal price;
        public String category;

        public Book() {try{__CLR4_1_101d9p1d9pluszwb87.R.inc(63882);

        }finally{__CLR4_1_101d9p1d9pluszwb87.R.flushNeeded();}}

        public Book(int price, String category) {
            this(new BigDecimal(price), category);__CLR4_1_101d9p1d9pluszwb87.R.inc(63884);try{__CLR4_1_101d9p1d9pluszwb87.R.inc(63883);
        }finally{__CLR4_1_101d9p1d9pluszwb87.R.flushNeeded();}}

        public Book(BigDecimal price, String category) {try{__CLR4_1_101d9p1d9pluszwb87.R.inc(63885);
            __CLR4_1_101d9p1d9pluszwb87.R.inc(63886);this.price = price;
            __CLR4_1_101d9p1d9pluszwb87.R.inc(63887);this.category = category;
        }finally{__CLR4_1_101d9p1d9pluszwb87.R.flushNeeded();}}
    }
}
