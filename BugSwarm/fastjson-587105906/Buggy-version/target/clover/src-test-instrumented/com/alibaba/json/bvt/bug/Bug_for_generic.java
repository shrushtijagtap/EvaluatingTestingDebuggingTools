/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_generic extends TestCase {static class __CLR4_1_1013tv13tvlusqk2pa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,51771,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51619);
        __CLR4_1_1013tv13tvlusqk2pa.R.inc(51620);ParserConfig.global.addAccept("NotifyDetail");
    }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

    public void test() throws Exception {__CLR4_1_1013tv13tvlusqk2pa.R.globalSliceStart(getClass().getName(),51621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi4lt313tx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013tv13tvlusqk2pa.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013tv13tvlusqk2pa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_generic.test",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51621,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi4lt313tx() throws Exception{try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51621);
        __CLR4_1_1013tv13tvlusqk2pa.R.inc(51622);String json = "{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_generic$NotifyDetail\",\"args\":[\"61354557\",\"\u4f9d\u4f9d\",\"\u516d\"],\"destId\":60721687,\"detailId\":3155063,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344530416000},\"hotId\":0,\"srcId\":1000,\"templateId\":482}";
        __CLR4_1_1013tv13tvlusqk2pa.R.inc(51623);JSON.parseObject(json, NotifyDetail.class);
        __CLR4_1_1013tv13tvlusqk2pa.R.inc(51624);System.out.println("NotifyDetail\u5bf9\u8c61\u6ca1\u95ee\u9898");
        __CLR4_1_1013tv13tvlusqk2pa.R.inc(51625);String json2 = "{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_generic$Pagination\",\"fromIndex\":0,\"list\":[{\"@type\":\"NotifyDetail\",\"args\":[\"61354557\",\"\u4f9d\u4f9d\",\"\u516d\"],\"destId\":60721687,\"detailId\":3155063,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344530416000},\"hotId\":0,\"srcId\":1000,\"templateId\":482},{\"@type\":\"NotifyDetail\",\"args\":[\"14527269\",\"\u61d2\u6d0b\u6d0b\",\"///\u6700\u4f73\u62cd\u6863,\u975e\u5e38\",\"24472950\"],\"destId\":60721687,\"detailId\":3151609,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344354485000},\"hotId\":0,\"srcId\":1000,\"templateId\":40},{\"@type\":\"NotifyDetail\",\"args\":[\"51090218\",\"\u5929\u4e4b\u6daf\",\"\u5929\u4f1a\u9ed1\uff0c\u4eba\u4f1a\u53d8\u3002\u4e09\u5206\"],\"destId\":60721687,\"detailId\":3149221,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344247529000},\"hotId\":0,\"srcId\":1000,\"templateId\":459},{\"@type\":\"NotifyDetail\",\"args\":[\"51687981\",\"\u6479\u7136\u56de\u9996\u68a6\u5df2\u6210\u5e74\",\"\u661f\u661f\u5728\u54ea\u91cc\u90fd\u5f88\u4eae\u7684,\"],\"destId\":60721687,\"detailId\":3149173,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344247414000},\"hotId\":0,\"srcId\":1000,\"templateId\":459},{\"@type\":\"NotifyDetail\",\"args\":[\"41486427\",\"\u5bd2\u6c5f\u84d1\u7b20\",\"\u53cc\u4f11\u4e86\"],\"destId\":60721687,\"detailId\":3148148,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344244730000},\"hotId\":0,\"srcId\":1000,\"templateId\":459}],\"maxLength\":5,\"nextPage\":2,\"pageIndex\":1,\"prevPage\":1,\"toIndex\":5,\"totalPage\":3,\"totalResult\":13}";
        __CLR4_1_1013tv13tvlusqk2pa.R.inc(51626);JSON.parseObject(json2, Pagination.class);
    }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

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

        public Pagination(){try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51627);

        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setTotalResult(int totalResult) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51628);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51629);this.totalResult = totalResult;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setTotalPage(int totalPage) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51630);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51631);this.totalPage = totalPage;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setPageIndex(int pageIndex) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51632);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51633);this.pageIndex = pageIndex;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setMaxLength(int maxLength) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51634);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51635);this.maxLength = maxLength;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setFromIndex(int fromIndex) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51636);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51637);this.fromIndex = fromIndex;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setToIndex(int toIndex) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51638);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51639);this.toIndex = toIndex;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getFromIndex() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51640);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51641);return this.fromIndex;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getToIndex() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51642);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51643);return this.toIndex;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getNextPage() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51644);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51645);if ((((this.pageIndex < this.totalPage)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51646)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51647)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51648);return this.pageIndex + 1;
            } }else {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51649);return this.pageIndex;
            }
        }}finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getPrevPage() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51650);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51651);if ((((this.pageIndex > 1)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51652)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51653)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51654);return this.pageIndex - 1;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51655);return this.pageIndex;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /**
         * @return the currentPage
         */
        public int getPageIndex() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51656);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51657);return pageIndex;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /**
         * @return the list
         */
        public List<T> getList() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51658);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51659);if ((((list == null)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51660)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51661)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51662);return new ArrayList<T>();
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51663);return new ArrayList<T>(list);
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /**
         * @return the totalPage
         */
        public int getTotalPage() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51664);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51665);return totalPage;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /**
         * @return the totalRecord
         */
        public int getTotalResult() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51666);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51667);return totalResult;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getMaxLength() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51668);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51669);return maxLength;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /**
         * @param totalResult
         * @param pageIndex
         * @param maxLength
         */
        public Pagination(int totalResult, int pageIndex, int maxLength){try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51670);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51671);if ((((maxLength > 0)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51672)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51673)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51674);this.maxLength = maxLength;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51675);if ((((totalResult > 0)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51676)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51677)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51678);this.totalResult = totalResult;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51679);if ((((pageIndex > 0)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51680)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51681)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51682);this.pageIndex = pageIndex;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51683);this.totalPage = this.totalResult / this.maxLength;
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51684);if ((((this.totalResult % this.maxLength != 0)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51685)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51686)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51687);this.totalPage = this.totalPage + 1;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51688);if ((((this.totalPage == 0)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51689)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51690)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51691);this.totalPage = 1;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51692);if ((((this.pageIndex > this.totalPage)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51693)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51694)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51695);this.pageIndex = this.totalPage;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51696);if ((((this.pageIndex <= 0)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51697)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51698)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51699);this.pageIndex = 1;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51700);this.fromIndex = (this.pageIndex - 1) * maxLength;
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51701);this.toIndex = this.fromIndex + maxLength;
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51702);if ((((this.toIndex < 0)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51703)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51704)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51705);this.toIndex = fromIndex;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51706);if ((((this.toIndex > this.totalResult)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51707)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51708)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51709);this.toIndex = this.totalResult;
            }

        }}finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /**
         * @param datas the datas to set
         */
        public void setList(List<T> list) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51710);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51711);this.list = list;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51712);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51713);StringBuffer sb = new StringBuffer();
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51714);sb.append("Pagination:\r\n");
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51715);sb.append("\tpageIndex\t" + this.pageIndex + "\r\n");
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51716);sb.append("\ttotalPage\t" + this.totalPage + "\r\n");
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51717);sb.append("\tmaxLength\t" + this.maxLength + "\r\n");
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51718);sb.append("\ttotalResult\t" + this.totalResult + "\r\n");
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51719);for (T t : list) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51720);sb.append(t + "\r\n");
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51721);return sb.toString();
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

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

        public int getDetailId() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51722);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51723);return detailId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setDetailId(int detailId) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51724);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51725);this.detailId = detailId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getHotId() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51726);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51727);return hotId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setHotId(int hotId) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51728);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51729);this.hotId = hotId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getTemplateId() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51730);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51731);return templateId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public List<String> getArgs() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51732);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51733);return args;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setArgs(List<String> args) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51734);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51735);this.args = args;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setTemplateId(int templateId) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51736);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51737);this.templateId = templateId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getSrcId() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51738);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51739);return srcId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setSrcId(int srcId) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51740);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51741);this.srcId = srcId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public int getDestId() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51742);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51743);return destId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setDestId(int destId) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51744);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51745);this.destId = destId;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public boolean isDisplay() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51746);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51747);return display;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setDisplay(boolean display) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51748);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51749);this.display = display;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public java.sql.Date getFoundTime() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51750);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51751);return foundTime;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        public void setFoundTime(java.sql.Date foundTime) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51752);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51753);this.foundTime = foundTime;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51754);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51755);int hasCode = 0;
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51756);if ((((this.detailId != 0)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51757)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51758)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51759);hasCode += this.detailId;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51760);return hasCode;
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj) {try{__CLR4_1_1013tv13tvlusqk2pa.R.inc(51761);
            __CLR4_1_1013tv13tvlusqk2pa.R.inc(51762);if ((((obj == null)&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51763)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51764)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51765);return false;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51766);if ((((!(obj instanceof NotifyDetail))&&(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51767)!=0|true))||(__CLR4_1_1013tv13tvlusqk2pa.R.iget(51768)==0&false))) {{
                __CLR4_1_1013tv13tvlusqk2pa.R.inc(51769);return false;
            }
            }__CLR4_1_1013tv13tvlusqk2pa.R.inc(51770);return this.hashCode() == obj.hashCode();
        }finally{__CLR4_1_1013tv13tvlusqk2pa.R.flushNeeded();}}

    }

}
