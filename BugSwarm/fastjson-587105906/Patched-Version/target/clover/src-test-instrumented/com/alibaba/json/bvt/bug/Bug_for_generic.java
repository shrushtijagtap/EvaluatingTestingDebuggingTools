/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_generic extends TestCase {static class __CLR4_5_213tk13tklusyjrk8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,51760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51608);
        __CLR4_5_213tk13tklusyjrk8.R.inc(51609);ParserConfig.global.addAccept("NotifyDetail");
    }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

    public void test() throws Exception {__CLR4_5_213tk13tklusyjrk8.R.globalSliceStart(getClass().getName(),51610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt313tm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213tk13tklusyjrk8.R.rethrow($CLV_t2$);}finally{__CLR4_5_213tk13tklusyjrk8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_generic.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51610,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt313tm() throws Exception{try{__CLR4_5_213tk13tklusyjrk8.R.inc(51610);
        __CLR4_5_213tk13tklusyjrk8.R.inc(51611);String json = "{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_generic$NotifyDetail\",\"args\":[\"61354557\",\"\u4f9d\u4f9d\",\"\u516d\"],\"destId\":60721687,\"detailId\":3155063,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344530416000},\"hotId\":0,\"srcId\":1000,\"templateId\":482}";
        __CLR4_5_213tk13tklusyjrk8.R.inc(51612);JSON.parseObject(json, NotifyDetail.class);
        __CLR4_5_213tk13tklusyjrk8.R.inc(51613);System.out.println("NotifyDetail\u5bf9\u8c61\u6ca1\u95ee\u9898");
        __CLR4_5_213tk13tklusyjrk8.R.inc(51614);String json2 = "{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_generic$Pagination\",\"fromIndex\":0,\"list\":[{\"@type\":\"NotifyDetail\",\"args\":[\"61354557\",\"\u4f9d\u4f9d\",\"\u516d\"],\"destId\":60721687,\"detailId\":3155063,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344530416000},\"hotId\":0,\"srcId\":1000,\"templateId\":482},{\"@type\":\"NotifyDetail\",\"args\":[\"14527269\",\"\u61d2\u6d0b\u6d0b\",\"///\u6700\u4f73\u62cd\u6863,\u975e\u5e38\",\"24472950\"],\"destId\":60721687,\"detailId\":3151609,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344354485000},\"hotId\":0,\"srcId\":1000,\"templateId\":40},{\"@type\":\"NotifyDetail\",\"args\":[\"51090218\",\"\u5929\u4e4b\u6daf\",\"\u5929\u4f1a\u9ed1\uff0c\u4eba\u4f1a\u53d8\u3002\u4e09\u5206\"],\"destId\":60721687,\"detailId\":3149221,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344247529000},\"hotId\":0,\"srcId\":1000,\"templateId\":459},{\"@type\":\"NotifyDetail\",\"args\":[\"51687981\",\"\u6479\u7136\u56de\u9996\u68a6\u5df2\u6210\u5e74\",\"\u661f\u661f\u5728\u54ea\u91cc\u90fd\u5f88\u4eae\u7684,\"],\"destId\":60721687,\"detailId\":3149173,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344247414000},\"hotId\":0,\"srcId\":1000,\"templateId\":459},{\"@type\":\"NotifyDetail\",\"args\":[\"41486427\",\"\u5bd2\u6c5f\u84d1\u7b20\",\"\u53cc\u4f11\u4e86\"],\"destId\":60721687,\"detailId\":3148148,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344244730000},\"hotId\":0,\"srcId\":1000,\"templateId\":459}],\"maxLength\":5,\"nextPage\":2,\"pageIndex\":1,\"prevPage\":1,\"toIndex\":5,\"totalPage\":3,\"totalResult\":13}";
        __CLR4_5_213tk13tklusyjrk8.R.inc(51615);JSON.parseObject(json2, Pagination.class);
    }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

    public static class Pagination<T> implements Serializable {

        /**
     * 
     */
        private static final long serialVersionUID = 5038839734218582220L;

        private int               totalResult      = 0;

        private int               totalPage        = 1;

        private int               pageIndex        = 1;

        private int               maxLength        = 5;

        private int               fromIndex        = 0;

        private int               toIndex          = 0;

        private List<T>           list             = new ArrayList<T>();

        public Pagination(){try{__CLR4_5_213tk13tklusyjrk8.R.inc(51616);

        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setTotalResult(int totalResult) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51617);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51618);this.totalResult = totalResult;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setTotalPage(int totalPage) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51619);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51620);this.totalPage = totalPage;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setPageIndex(int pageIndex) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51621);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51622);this.pageIndex = pageIndex;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setMaxLength(int maxLength) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51623);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51624);this.maxLength = maxLength;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setFromIndex(int fromIndex) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51625);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51626);this.fromIndex = fromIndex;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setToIndex(int toIndex) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51627);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51628);this.toIndex = toIndex;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getFromIndex() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51629);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51630);return this.fromIndex;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getToIndex() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51631);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51632);return this.toIndex;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getNextPage() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51633);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51634);if ((((this.pageIndex < this.totalPage)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51635)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51636)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51637);return this.pageIndex + 1;
            } }else {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51638);return this.pageIndex;
            }
        }}finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getPrevPage() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51639);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51640);if ((((this.pageIndex > 1)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51641)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51642)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51643);return this.pageIndex - 1;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51644);return this.pageIndex;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /**
         * @return the currentPage
         */
        public int getPageIndex() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51645);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51646);return pageIndex;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /**
         * @return the list
         */
        public List<T> getList() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51647);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51648);if ((((list == null)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51649)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51650)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51651);return new ArrayList<T>();
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51652);return new ArrayList<T>(list);
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /**
         * @return the totalPage
         */
        public int getTotalPage() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51653);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51654);return totalPage;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /**
         * @return the totalRecord
         */
        public int getTotalResult() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51655);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51656);return totalResult;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getMaxLength() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51657);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51658);return maxLength;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /**
         * @param totalResult
         * @param pageIndex
         * @param maxLength
         */
        public Pagination(int totalResult, int pageIndex, int maxLength){try{__CLR4_5_213tk13tklusyjrk8.R.inc(51659);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51660);if ((((maxLength > 0)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51661)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51662)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51663);this.maxLength = maxLength;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51664);if ((((totalResult > 0)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51665)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51666)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51667);this.totalResult = totalResult;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51668);if ((((pageIndex > 0)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51669)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51670)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51671);this.pageIndex = pageIndex;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51672);this.totalPage = this.totalResult / this.maxLength;
            __CLR4_5_213tk13tklusyjrk8.R.inc(51673);if ((((this.totalResult % this.maxLength != 0)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51674)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51675)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51676);this.totalPage = this.totalPage + 1;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51677);if ((((this.totalPage == 0)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51678)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51679)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51680);this.totalPage = 1;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51681);if ((((this.pageIndex > this.totalPage)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51682)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51683)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51684);this.pageIndex = this.totalPage;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51685);if ((((this.pageIndex <= 0)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51686)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51687)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51688);this.pageIndex = 1;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51689);this.fromIndex = (this.pageIndex - 1) * maxLength;
            __CLR4_5_213tk13tklusyjrk8.R.inc(51690);this.toIndex = this.fromIndex + maxLength;
            __CLR4_5_213tk13tklusyjrk8.R.inc(51691);if ((((this.toIndex < 0)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51692)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51693)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51694);this.toIndex = fromIndex;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51695);if ((((this.toIndex > this.totalResult)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51696)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51697)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51698);this.toIndex = this.totalResult;
            }

        }}finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /**
         * @param datas the datas to set
         */
        public void setList(List<T> list) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51699);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51700);this.list = list;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51701);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51702);StringBuffer sb = new StringBuffer();
            __CLR4_5_213tk13tklusyjrk8.R.inc(51703);sb.append("Pagination:\r\n");
            __CLR4_5_213tk13tklusyjrk8.R.inc(51704);sb.append("\tpageIndex\t" + this.pageIndex + "\r\n");
            __CLR4_5_213tk13tklusyjrk8.R.inc(51705);sb.append("\ttotalPage\t" + this.totalPage + "\r\n");
            __CLR4_5_213tk13tklusyjrk8.R.inc(51706);sb.append("\tmaxLength\t" + this.maxLength + "\r\n");
            __CLR4_5_213tk13tklusyjrk8.R.inc(51707);sb.append("\ttotalResult\t" + this.totalResult + "\r\n");
            __CLR4_5_213tk13tklusyjrk8.R.inc(51708);for (T t : list) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51709);sb.append(t + "\r\n");
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51710);return sb.toString();
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

    }

    public static class NotifyDetail implements Serializable {

        /**
         * 
         */
        private static final long serialVersionUID = 8760630447394929224L;

        private int               detailId;

        private int               hotId;

        private int               templateId;

        private int               srcId;

        private int               destId;

        private boolean           display;

        private java.sql.Date     foundTime;

        private List<String>      args             = new ArrayList<String>();

        public int getDetailId() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51711);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51712);return detailId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setDetailId(int detailId) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51713);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51714);this.detailId = detailId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getHotId() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51715);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51716);return hotId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setHotId(int hotId) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51717);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51718);this.hotId = hotId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getTemplateId() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51719);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51720);return templateId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public List<String> getArgs() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51721);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51722);return args;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setArgs(List<String> args) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51723);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51724);this.args = args;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setTemplateId(int templateId) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51725);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51726);this.templateId = templateId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getSrcId() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51727);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51728);return srcId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setSrcId(int srcId) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51729);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51730);this.srcId = srcId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public int getDestId() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51731);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51732);return destId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setDestId(int destId) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51733);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51734);this.destId = destId;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public boolean isDisplay() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51735);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51736);return display;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setDisplay(boolean display) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51737);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51738);this.display = display;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public java.sql.Date getFoundTime() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51739);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51740);return foundTime;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        public void setFoundTime(java.sql.Date foundTime) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51741);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51742);this.foundTime = foundTime;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51743);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51744);int hasCode = 0;
            __CLR4_5_213tk13tklusyjrk8.R.inc(51745);if ((((this.detailId != 0)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51746)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51747)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51748);hasCode += this.detailId;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51749);return hasCode;
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj) {try{__CLR4_5_213tk13tklusyjrk8.R.inc(51750);
            __CLR4_5_213tk13tklusyjrk8.R.inc(51751);if ((((obj == null)&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51752)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51753)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51754);return false;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51755);if ((((!(obj instanceof NotifyDetail))&&(__CLR4_5_213tk13tklusyjrk8.R.iget(51756)!=0|true))||(__CLR4_5_213tk13tklusyjrk8.R.iget(51757)==0&false))) {{
                __CLR4_5_213tk13tklusyjrk8.R.inc(51758);return false;
            }
            }__CLR4_5_213tk13tklusyjrk8.R.inc(51759);return this.hashCode() == obj.hashCode();
        }finally{__CLR4_5_213tk13tklusyjrk8.R.flushNeeded();}}

    }

}
