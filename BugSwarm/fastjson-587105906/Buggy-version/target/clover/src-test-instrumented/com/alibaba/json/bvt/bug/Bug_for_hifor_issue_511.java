/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.Date;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;

import junit.framework.TestCase;

public class Bug_for_hifor_issue_511 extends TestCase {static class __CLR4_1_1014wu14wuluszw898{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,53066,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_1014wu14wuluszw898.R.globalSliceStart(getClass().getName(),53022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb14wu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014wu14wuluszw898.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014wu14wuluszw898.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_hifor_issue_511.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb14wu() throws Exception{try{__CLR4_1_1014wu14wuluszw898.R.inc(53022);
        __CLR4_1_1014wu14wuluszw898.R.inc(53023);String resultString = "{"
                + "    \"errCode\": 0, "
                + "    \"errMsg\": \"ok\", "
                + "    \"model\": {"
                + "        \"doctor\": {"
                + "            \"duty\": \"\u526f\u4e3b\u4efb\u533b\u5e08\", "
                + "            \"glide\": \"20051010082558\", "
                + "            \"mark\": \"0703010000\", "
                + "            \"name\": \"\u67d0\u67d0\u67d0\", "
                + "            \"office\": \"\u5c0f\u513f\u9aa8\u79d1\""
                + "        }, "
                + "        \"patientInfoList\": ["
                + "            {"
                + "                \"patient_Master_Card\": 1, "
                + "                \"patient_addDate\": 1451097938410, "
                + "                \"patient_age\": 30, "
                + "                \"patient_id\": 347, "
                + "                \"patient_idCard\": \"123321\", "
                + "                \"patient_name\": \"\u5f20\u4e09\", "
                + "                \"patient_s_ic_no\": \"123321\", "
                + "                \"patient_sex\": \"1\", "
                + "                \"patient_tel\": \"123\", "
                + "                \"patient_userId\": 2, "
                + "                \"s_ic_no\": \"123321\""
                + "            }, "
                + "            {"
                + "                \"patient_Master_Card\": 0, "
                + "                \"patient_addDate\": 1454296296847, "
                + "                \"patient_age\": 23, "
                + "                \"patient_id\": 598, "
                + "                \"patient_idCard\": \"123123\", "
                + "                \"patient_name\": \"\u674e\u56db\", "
                + "                \"patient_s_ic_no\": \"F10020000615011\", "
                + "                \"patient_sex\": \"1\", "
                + "                \"patient_tel\": \"18065212123\", "
                + "                \"patient_userId\": 2, "
                + "                \"s_ic_no\": \"F10020000615011\""
                + "            }"
                + "        ]"
                + "    }"
                + "}";
        
        __CLR4_1_1014wu14wuluszw898.R.inc(53024);TResult<BookConfirmVo> result = JSON.parseObject(resultString, new TypeReference<TResult<BookConfirmVo>>() { });
        __CLR4_1_1014wu14wuluszw898.R.inc(53025);Assert.assertSame(BookConfirmVo.class, result.model.getClass());
    }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
    
    public static class TResult<T> {
        int errCode = 0;
        String errMsg = "ok";
        List<T> data = null;
        String stringData;
        Integer intData;
        T model;
        String url;
        
        public int getErrCode() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53026);
            __CLR4_1_1014wu14wuluszw898.R.inc(53027);return errCode;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public void setErrCode(int errCode) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53028);
            __CLR4_1_1014wu14wuluszw898.R.inc(53029);this.errCode = errCode;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public String getErrMsg() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53030);
            __CLR4_1_1014wu14wuluszw898.R.inc(53031);return errMsg;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public void setErrMsg(String errMsg) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53032);
            __CLR4_1_1014wu14wuluszw898.R.inc(53033);this.errMsg = errMsg;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public List<T> getData() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53034);
            __CLR4_1_1014wu14wuluszw898.R.inc(53035);return data;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public void setData(List<T> data) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53036);
            __CLR4_1_1014wu14wuluszw898.R.inc(53037);this.data = data;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public String getStringData() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53038);
            __CLR4_1_1014wu14wuluszw898.R.inc(53039);return stringData;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public void setStringData(String stringData) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53040);
            __CLR4_1_1014wu14wuluszw898.R.inc(53041);this.stringData = stringData;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public Integer getIntData() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53042);
            __CLR4_1_1014wu14wuluszw898.R.inc(53043);return intData;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public void setIntData(Integer intData) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53044);
            __CLR4_1_1014wu14wuluszw898.R.inc(53045);this.intData = intData;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public T getModel() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53046);
            __CLR4_1_1014wu14wuluszw898.R.inc(53047);return model;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public void setModel(T model) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53048);
            __CLR4_1_1014wu14wuluszw898.R.inc(53049);this.model = model;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public String getUrl() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53050);
            __CLR4_1_1014wu14wuluszw898.R.inc(53051);return url;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        public void setUrl(String url) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53052);
            __CLR4_1_1014wu14wuluszw898.R.inc(53053);this.url = url;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
        
        
    }

    public static class BookConfirmVo {

        String              selectDay;
        String              selectTime;
        VW_NRE_Doctor       doctor;
        List<PatientInfoVo> patientInfoList;
    }

    public static class VW_NRE_Doctor {

        String glide;
        String name;
        String office;
        String mark;
        String duty;
        byte[] pic;
    }

    public static class PatientInfoVo extends PatientInfo {

        String cols;
        String glide;
        String s_ic_no;

        // \u6ce8\u89e3\u7981\u6b62\u5e8f\u5217\u5316
        @JSONField(serialize = false)
        public String getCols() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53054);
            __CLR4_1_1014wu14wuluszw898.R.inc(53055);return cols;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}

        // \u6ce8\u89e3\u7981\u6b62\u53cd\u5e8f\u5217\u5316
        @JSONField(deserialize = false)
        public void setCols(String cols) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53056);
            __CLR4_1_1014wu14wuluszw898.R.inc(53057);this.cols = cols;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}

        public String getGlide() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53058);
            __CLR4_1_1014wu14wuluszw898.R.inc(53059);return glide;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}

        public void setGlide(String glide) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53060);
            __CLR4_1_1014wu14wuluszw898.R.inc(53061);this.glide = glide;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}

        public String getS_ic_no() {try{__CLR4_1_1014wu14wuluszw898.R.inc(53062);
            __CLR4_1_1014wu14wuluszw898.R.inc(53063);return s_ic_no;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}

        public void setS_ic_no(String s_ic_no) {try{__CLR4_1_1014wu14wuluszw898.R.inc(53064);
            __CLR4_1_1014wu14wuluszw898.R.inc(53065);this.s_ic_no = s_ic_no;
        }finally{__CLR4_1_1014wu14wuluszw898.R.flushNeeded();}}
    }

    public static class PatientInfo {

        Integer patient_id;
        Integer patient_userId;
        String  patient_name;
        String  patient_sex;
        Integer patient_age;
        String  patient_tel;
        String  patient_idCard;
        Date    patient_addDate;
        Date    patient_Date;
        String  patient_s_ic_no;
        Integer patient_Master_Card;
    }
}
