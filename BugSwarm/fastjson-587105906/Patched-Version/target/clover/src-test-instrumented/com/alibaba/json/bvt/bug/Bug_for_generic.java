/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_generic extends TestCase {static class __CLR4_5_214rs14rslusvn65w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,52992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_214rs14rslusvn65w.R.inc(52840);
        __CLR4_5_214rs14rslusvn65w.R.inc(52841);ParserConfig.global.addAccept("NotifyDetail");
    }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

    public void test() throws Exception {__CLR4_5_214rs14rslusvn65w.R.globalSliceStart(getClass().getName(),52842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt314ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214rs14rslusvn65w.R.rethrow($CLV_t2$);}finally{__CLR4_5_214rs14rslusvn65w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_generic.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52842,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt314ru() throws Exception{try{__CLR4_5_214rs14rslusvn65w.R.inc(52842);
        __CLR4_5_214rs14rslusvn65w.R.inc(52843);String json = "{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_generic$NotifyDetail\",\"args\":[\"61354557\",\"\u4f9d\u4f9d\",\"\u516d\"],\"destId\":60721687,\"detailId\":3155063,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344530416000},\"hotId\":0,\"srcId\":1000,\"templateId\":482}";
        __CLR4_5_214rs14rslusvn65w.R.inc(52844);JSON.parseObject(json, NotifyDetail.class);
        __CLR4_5_214rs14rslusvn65w.R.inc(52845);System.out.println("NotifyDetail\u5bf9\u8c61\u6ca1\u95ee\u9898");
        __CLR4_5_214rs14rslusvn65w.R.inc(52846);String json2 = "{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_generic$Pagination\",\"fromIndex\":0,\"list\":[{\"@type\":\"NotifyDetail\",\"args\":[\"61354557\",\"\u4f9d\u4f9d\",\"\u516d\"],\"destId\":60721687,\"detailId\":3155063,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344530416000},\"hotId\":0,\"srcId\":1000,\"templateId\":482},{\"@type\":\"NotifyDetail\",\"args\":[\"14527269\",\"\u61d2\u6d0b\u6d0b\",\"///\u6700\u4f73\u62cd\u6863,\u975e\u5e38\",\"24472950\"],\"destId\":60721687,\"detailId\":3151609,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344354485000},\"hotId\":0,\"srcId\":1000,\"templateId\":40},{\"@type\":\"NotifyDetail\",\"args\":[\"51090218\",\"\u5929\u4e4b\u6daf\",\"\u5929\u4f1a\u9ed1\uff0c\u4eba\u4f1a\u53d8\u3002\u4e09\u5206\"],\"destId\":60721687,\"detailId\":3149221,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344247529000},\"hotId\":0,\"srcId\":1000,\"templateId\":459},{\"@type\":\"NotifyDetail\",\"args\":[\"51687981\",\"\u6479\u7136\u56de\u9996\u68a6\u5df2\u6210\u5e74\",\"\u661f\u661f\u5728\u54ea\u91cc\u90fd\u5f88\u4eae\u7684,\"],\"destId\":60721687,\"detailId\":3149173,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344247414000},\"hotId\":0,\"srcId\":1000,\"templateId\":459},{\"@type\":\"NotifyDetail\",\"args\":[\"41486427\",\"\u5bd2\u6c5f\u84d1\u7b20\",\"\u53cc\u4f11\u4e86\"],\"destId\":60721687,\"detailId\":3148148,\"display\":false,\"foundTime\":{\"@type\":\"java.sql.Timestamp\",\"val\":1344244730000},\"hotId\":0,\"srcId\":1000,\"templateId\":459}],\"maxLength\":5,\"nextPage\":2,\"pageIndex\":1,\"prevPage\":1,\"toIndex\":5,\"totalPage\":3,\"totalResult\":13}";
        __CLR4_5_214rs14rslusvn65w.R.inc(52847);JSON.parseObject(json2, Pagination.class);
    }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

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

        public Pagination(){try{__CLR4_5_214rs14rslusvn65w.R.inc(52848);

        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setTotalResult(int totalResult) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52849);
            __CLR4_5_214rs14rslusvn65w.R.inc(52850);this.totalResult = totalResult;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setTotalPage(int totalPage) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52851);
            __CLR4_5_214rs14rslusvn65w.R.inc(52852);this.totalPage = totalPage;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setPageIndex(int pageIndex) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52853);
            __CLR4_5_214rs14rslusvn65w.R.inc(52854);this.pageIndex = pageIndex;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setMaxLength(int maxLength) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52855);
            __CLR4_5_214rs14rslusvn65w.R.inc(52856);this.maxLength = maxLength;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setFromIndex(int fromIndex) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52857);
            __CLR4_5_214rs14rslusvn65w.R.inc(52858);this.fromIndex = fromIndex;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setToIndex(int toIndex) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52859);
            __CLR4_5_214rs14rslusvn65w.R.inc(52860);this.toIndex = toIndex;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getFromIndex() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52861);
            __CLR4_5_214rs14rslusvn65w.R.inc(52862);return this.fromIndex;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getToIndex() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52863);
            __CLR4_5_214rs14rslusvn65w.R.inc(52864);return this.toIndex;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getNextPage() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52865);
            __CLR4_5_214rs14rslusvn65w.R.inc(52866);if ((((this.pageIndex < this.totalPage)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52867)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52868)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52869);return this.pageIndex + 1;
            } }else {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52870);return this.pageIndex;
            }
        }}finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getPrevPage() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52871);
            __CLR4_5_214rs14rslusvn65w.R.inc(52872);if ((((this.pageIndex > 1)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52873)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52874)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52875);return this.pageIndex - 1;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52876);return this.pageIndex;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /**
         * @return the currentPage
         */
        public int getPageIndex() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52877);
            __CLR4_5_214rs14rslusvn65w.R.inc(52878);return pageIndex;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /**
         * @return the list
         */
        public List<T> getList() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52879);
            __CLR4_5_214rs14rslusvn65w.R.inc(52880);if ((((list == null)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52881)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52882)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52883);return new ArrayList<T>();
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52884);return new ArrayList<T>(list);
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /**
         * @return the totalPage
         */
        public int getTotalPage() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52885);
            __CLR4_5_214rs14rslusvn65w.R.inc(52886);return totalPage;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /**
         * @return the totalRecord
         */
        public int getTotalResult() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52887);
            __CLR4_5_214rs14rslusvn65w.R.inc(52888);return totalResult;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getMaxLength() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52889);
            __CLR4_5_214rs14rslusvn65w.R.inc(52890);return maxLength;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /**
         * @param totalResult
         * @param pageIndex
         * @param maxLength
         */
        public Pagination(int totalResult, int pageIndex, int maxLength){try{__CLR4_5_214rs14rslusvn65w.R.inc(52891);
            __CLR4_5_214rs14rslusvn65w.R.inc(52892);if ((((maxLength > 0)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52893)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52894)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52895);this.maxLength = maxLength;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52896);if ((((totalResult > 0)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52897)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52898)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52899);this.totalResult = totalResult;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52900);if ((((pageIndex > 0)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52901)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52902)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52903);this.pageIndex = pageIndex;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52904);this.totalPage = this.totalResult / this.maxLength;
            __CLR4_5_214rs14rslusvn65w.R.inc(52905);if ((((this.totalResult % this.maxLength != 0)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52906)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52907)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52908);this.totalPage = this.totalPage + 1;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52909);if ((((this.totalPage == 0)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52910)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52911)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52912);this.totalPage = 1;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52913);if ((((this.pageIndex > this.totalPage)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52914)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52915)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52916);this.pageIndex = this.totalPage;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52917);if ((((this.pageIndex <= 0)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52918)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52919)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52920);this.pageIndex = 1;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52921);this.fromIndex = (this.pageIndex - 1) * maxLength;
            __CLR4_5_214rs14rslusvn65w.R.inc(52922);this.toIndex = this.fromIndex + maxLength;
            __CLR4_5_214rs14rslusvn65w.R.inc(52923);if ((((this.toIndex < 0)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52924)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52925)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52926);this.toIndex = fromIndex;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52927);if ((((this.toIndex > this.totalResult)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52928)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52929)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52930);this.toIndex = this.totalResult;
            }

        }}finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /**
         * @param datas the datas to set
         */
        public void setList(List<T> list) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52931);
            __CLR4_5_214rs14rslusvn65w.R.inc(52932);this.list = list;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52933);
            __CLR4_5_214rs14rslusvn65w.R.inc(52934);StringBuffer sb = new StringBuffer();
            __CLR4_5_214rs14rslusvn65w.R.inc(52935);sb.append("Pagination:\r\n");
            __CLR4_5_214rs14rslusvn65w.R.inc(52936);sb.append("\tpageIndex\t" + this.pageIndex + "\r\n");
            __CLR4_5_214rs14rslusvn65w.R.inc(52937);sb.append("\ttotalPage\t" + this.totalPage + "\r\n");
            __CLR4_5_214rs14rslusvn65w.R.inc(52938);sb.append("\tmaxLength\t" + this.maxLength + "\r\n");
            __CLR4_5_214rs14rslusvn65w.R.inc(52939);sb.append("\ttotalResult\t" + this.totalResult + "\r\n");
            __CLR4_5_214rs14rslusvn65w.R.inc(52940);for (T t : list) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52941);sb.append(t + "\r\n");
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52942);return sb.toString();
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

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

        public int getDetailId() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52943);
            __CLR4_5_214rs14rslusvn65w.R.inc(52944);return detailId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setDetailId(int detailId) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52945);
            __CLR4_5_214rs14rslusvn65w.R.inc(52946);this.detailId = detailId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getHotId() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52947);
            __CLR4_5_214rs14rslusvn65w.R.inc(52948);return hotId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setHotId(int hotId) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52949);
            __CLR4_5_214rs14rslusvn65w.R.inc(52950);this.hotId = hotId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getTemplateId() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52951);
            __CLR4_5_214rs14rslusvn65w.R.inc(52952);return templateId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public List<String> getArgs() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52953);
            __CLR4_5_214rs14rslusvn65w.R.inc(52954);return args;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setArgs(List<String> args) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52955);
            __CLR4_5_214rs14rslusvn65w.R.inc(52956);this.args = args;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setTemplateId(int templateId) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52957);
            __CLR4_5_214rs14rslusvn65w.R.inc(52958);this.templateId = templateId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getSrcId() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52959);
            __CLR4_5_214rs14rslusvn65w.R.inc(52960);return srcId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setSrcId(int srcId) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52961);
            __CLR4_5_214rs14rslusvn65w.R.inc(52962);this.srcId = srcId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public int getDestId() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52963);
            __CLR4_5_214rs14rslusvn65w.R.inc(52964);return destId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setDestId(int destId) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52965);
            __CLR4_5_214rs14rslusvn65w.R.inc(52966);this.destId = destId;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public boolean isDisplay() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52967);
            __CLR4_5_214rs14rslusvn65w.R.inc(52968);return display;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setDisplay(boolean display) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52969);
            __CLR4_5_214rs14rslusvn65w.R.inc(52970);this.display = display;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public java.sql.Date getFoundTime() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52971);
            __CLR4_5_214rs14rslusvn65w.R.inc(52972);return foundTime;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        public void setFoundTime(java.sql.Date foundTime) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52973);
            __CLR4_5_214rs14rslusvn65w.R.inc(52974);this.foundTime = foundTime;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {try{__CLR4_5_214rs14rslusvn65w.R.inc(52975);
            __CLR4_5_214rs14rslusvn65w.R.inc(52976);int hasCode = 0;
            __CLR4_5_214rs14rslusvn65w.R.inc(52977);if ((((this.detailId != 0)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52978)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52979)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52980);hasCode += this.detailId;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52981);return hasCode;
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

        /*
         * (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj) {try{__CLR4_5_214rs14rslusvn65w.R.inc(52982);
            __CLR4_5_214rs14rslusvn65w.R.inc(52983);if ((((obj == null)&&(__CLR4_5_214rs14rslusvn65w.R.iget(52984)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52985)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52986);return false;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52987);if ((((!(obj instanceof NotifyDetail))&&(__CLR4_5_214rs14rslusvn65w.R.iget(52988)!=0|true))||(__CLR4_5_214rs14rslusvn65w.R.iget(52989)==0&false))) {{
                __CLR4_5_214rs14rslusvn65w.R.inc(52990);return false;
            }
            }__CLR4_5_214rs14rslusvn65w.R.inc(52991);return this.hashCode() == obj.hashCode();
        }finally{__CLR4_5_214rs14rslusvn65w.R.flushNeeded();}}

    }

}
