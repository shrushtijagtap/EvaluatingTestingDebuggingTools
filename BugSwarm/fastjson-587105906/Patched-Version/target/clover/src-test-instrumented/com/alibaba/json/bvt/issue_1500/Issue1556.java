/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1500;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.io.Serializable;
import java.util.Date;

public class Issue1556 extends TestCase {static class __CLR4_5_21auy1auylusyjsvq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60803,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21auy1auylusyjsvq.R.globalSliceStart(getClass().getName(),60730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1auy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21auy1auylusyjsvq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21auy1auylusyjsvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1556.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1auy() throws Exception{try{__CLR4_5_21auy1auylusyjsvq.R.inc(60730);
        __CLR4_5_21auy1auylusyjsvq.R.inc(60731);ClassForData classForData = new ClassForData();
        __CLR4_5_21auy1auylusyjsvq.R.inc(60732);classForData.setDataName("dataname");
        __CLR4_5_21auy1auylusyjsvq.R.inc(60733);SubCommonClass commonClass = new SubCommonClass(new Date());

        __CLR4_5_21auy1auylusyjsvq.R.inc(60734);FirstSubClass firstSubClass = new FirstSubClass();
        __CLR4_5_21auy1auylusyjsvq.R.inc(60735);firstSubClass.setAddr("It is addr");
        __CLR4_5_21auy1auylusyjsvq.R.inc(60736);firstSubClass.setCommonInfo(commonClass);

        __CLR4_5_21auy1auylusyjsvq.R.inc(60737);SecondSubClass secondSubClass = new SecondSubClass();
        __CLR4_5_21auy1auylusyjsvq.R.inc(60738);secondSubClass.setName("It is name");
        __CLR4_5_21auy1auylusyjsvq.R.inc(60739);secondSubClass.setCommonInfo(firstSubClass.getCommonInfo());

        __CLR4_5_21auy1auylusyjsvq.R.inc(60740);classForData.setFirst(firstSubClass);
        __CLR4_5_21auy1auylusyjsvq.R.inc(60741);classForData.setSecond(secondSubClass);

        __CLR4_5_21auy1auylusyjsvq.R.inc(60742);ApiResult<ClassForData> apiResult = ApiResult.valueOfSuccess(classForData);
        __CLR4_5_21auy1auylusyjsvq.R.inc(60743);ParserConfig config = new ParserConfig();
        __CLR4_5_21auy1auylusyjsvq.R.inc(60744);config.setAutoTypeSupport(true);

        __CLR4_5_21auy1auylusyjsvq.R.inc(60745);String jsonString = JSON.toJSONString(apiResult, SerializerFeature.WriteClassName);//\u8fd9\u91cc\u52a0\u4e0aSerializerFeature.DisableCircularReferenceDetect
        __CLR4_5_21auy1auylusyjsvq.R.inc(60746);System.out.println(jsonString);
        __CLR4_5_21auy1auylusyjsvq.R.inc(60747);Object obj = JSON.parse(jsonString, config);//\u8fd9\u91cc\u52a0\u4e0aFeature.DisableCircularReferenceDetect  \u8fd9\u6837\u7684\u8bdd \u662f\u53ef\u4ee5\u907f\u514d\u7a7a\u503c\u7684  \uff0c\u4f46\u662f$ref \u8fd8\u6709\u5565\u610f\u601d\u5462
        __CLR4_5_21auy1auylusyjsvq.R.inc(60748);System.out.println(JSON.toJSONString(obj));
    }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

    public static class ApiResult<T> implements Serializable {
        private String msg;
        private int code;
        private T data;

        public ApiResult() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60749);
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public ApiResult(int code, String msg,T data) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60750);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60751);this.code = code;
            __CLR4_5_21auy1auylusyjsvq.R.inc(60752);this.msg = msg;
            __CLR4_5_21auy1auylusyjsvq.R.inc(60753);this.data = data;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public String getMsg() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60754);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60755);return msg;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}
        public int getCode() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60756);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60757);return code;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}
        public void setMsg(String msg) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60758);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60759);this.msg = msg;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setCode(int code) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60760);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60761);this.code = code;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public T getData() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60762);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60763);return data;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setData(T data) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60764);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60765);this.data = data;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public static <T> ApiResult<T> valueOfSuccess(T data) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60766);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60767);return new ApiResult<T>(0, "Success", data);
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

    }

    public static class ClassForData implements Serializable {

        private String dataName;

        private FirstSubClass first;

        private SecondSubClass second;


        public String getDataName() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60768);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60769);return dataName;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setDataName(String dataName) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60770);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60771);this.dataName = dataName;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public FirstSubClass getFirst() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60772);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60773);return first;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setFirst(FirstSubClass first) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60774);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60775);this.first = first;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public SecondSubClass getSecond() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60776);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60777);return second;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setSecond(SecondSubClass second) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60778);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60779);this.second = second;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}
    }

    public static class FirstSubClass  implements Serializable{

        private String addr;//\u4ec5\u4ec5\u505a\u4e0b\u548csecond\u7684\u533a\u5206

        private  SubCommonClass commonInfo;


        public String getAddr() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60780);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60781);return addr;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setAddr(String addr) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60782);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60783);this.addr = addr;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public SubCommonClass getCommonInfo() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60784);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60785);return commonInfo;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setCommonInfo(SubCommonClass commonInfo) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60786);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60787);this.commonInfo = commonInfo;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

    }

    public static class SecondSubClass implements Serializable{

        private String name;

        private  SubCommonClass commonInfo;


        public String getName() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60788);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60789);return name;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60790);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60791);this.name = name;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public SubCommonClass getCommonInfo() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60792);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60793);return commonInfo;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setCommonInfo(SubCommonClass commonInfo) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60794);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60795);this.commonInfo = commonInfo;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}
    }


    public static class SubCommonClass  implements Serializable {

        private Date demoDate;

        public SubCommonClass(){try{__CLR4_5_21auy1auylusyjsvq.R.inc(60796);
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public SubCommonClass(Date demoDate){try{__CLR4_5_21auy1auylusyjsvq.R.inc(60797);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60798);this.demoDate = demoDate;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public Date getDemoDate() {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60799);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60800);return demoDate;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}

        public void setDemoDate(Date demoDate) {try{__CLR4_5_21auy1auylusyjsvq.R.inc(60801);
            __CLR4_5_21auy1auylusyjsvq.R.inc(60802);this.demoDate = demoDate;
        }finally{__CLR4_5_21auy1auylusyjsvq.R.flushNeeded();}}
    }
}
