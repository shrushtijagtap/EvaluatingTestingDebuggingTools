/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.ref;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.io.Serializable;

/**
 * Created by wenshao on 08/02/2017.
 */
public class RefTest_for_huanxige extends TestCase {static class __CLR4_1_101rc81rc8luszwern{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,82125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_ref() throws Exception {__CLR4_1_101rc81rc8luszwern.R.globalSliceStart(getClass().getName(),82088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j9k8mv1rc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rc81rc8luszwern.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rc81rc8luszwern.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest_for_huanxige.test_for_ref",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82088,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j9k8mv1rc8() throws Exception{try{__CLR4_1_101rc81rc8luszwern.R.inc(82088);
//\u5b57\u7b26\u4e32\u901a\u8fc7\u5176\u5b83\u5bf9\u8c61\u5e8f\u5217\u5316\u800c\u6765\uff0c\u5f53\u4e2d\u6d89\u53ca\u5faa\u73af\u5f15\u7528\uff0c\u56e0\u6b64\u5b58\u5728$ref
        __CLR4_1_101rc81rc8luszwern.R.inc(82089);String jsonStr="{\"displayName\":\"\u7070\u5ea6\u53d1\u5e03\",\"id\":221," +
                "\"name\":\"\u7070\u5ea6\",\"processInsId\":48,\"processInstance\":{\"$ref\":\"$" +
                ".lastSubProcessInstence.parentProcess\"},\"status\":1,\"success\":true," +
                "\"tail\":true,\"type\":\"gray\"}";
        __CLR4_1_101rc81rc8luszwern.R.inc(82090);ProcessNodeInstanceDto a = JSON.parseObject(jsonStr, ProcessNodeInstanceDto.class);//status\u4e3a\u7a7a\uff01\uff01\uff01
        __CLR4_1_101rc81rc8luszwern.R.inc(82091);assertNotNull(a.status);
        __CLR4_1_101rc81rc8luszwern.R.inc(82092);assertEquals(1, a.status.intValue());
    }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}

    public static class ProcessNodeInstanceDto implements Serializable {
        private Long id;
        private Long processInsId;
        private String name;
        private String displayName;
        private Integer status;
        private String type;
        private Boolean success;
        private Boolean tail;

        public Long getId() {try{__CLR4_1_101rc81rc8luszwern.R.inc(82093);
            __CLR4_1_101rc81rc8luszwern.R.inc(82094);return id;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public void setId(Long id) {try{__CLR4_1_101rc81rc8luszwern.R.inc(82095);
            __CLR4_1_101rc81rc8luszwern.R.inc(82096);this.id = id;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public Long getProcessInsId() {try{__CLR4_1_101rc81rc8luszwern.R.inc(82097);
            __CLR4_1_101rc81rc8luszwern.R.inc(82098);return processInsId;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public void setProcessInsId(Long processInsId) {try{__CLR4_1_101rc81rc8luszwern.R.inc(82099);
            __CLR4_1_101rc81rc8luszwern.R.inc(82100);this.processInsId = processInsId;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public String getName() {try{__CLR4_1_101rc81rc8luszwern.R.inc(82101);
            __CLR4_1_101rc81rc8luszwern.R.inc(82102);return name;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public void setName(String name) {try{__CLR4_1_101rc81rc8luszwern.R.inc(82103);
            __CLR4_1_101rc81rc8luszwern.R.inc(82104);this.name = name;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public String getDisplayName() {try{__CLR4_1_101rc81rc8luszwern.R.inc(82105);
            __CLR4_1_101rc81rc8luszwern.R.inc(82106);return displayName;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public void setDisplayName(String displayName) {try{__CLR4_1_101rc81rc8luszwern.R.inc(82107);
            __CLR4_1_101rc81rc8luszwern.R.inc(82108);this.displayName = displayName;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public Integer getStatus() {try{__CLR4_1_101rc81rc8luszwern.R.inc(82109);
            __CLR4_1_101rc81rc8luszwern.R.inc(82110);return status;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public void setStatus(Integer status) {try{__CLR4_1_101rc81rc8luszwern.R.inc(82111);
            __CLR4_1_101rc81rc8luszwern.R.inc(82112);this.status = status;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public String getType() {try{__CLR4_1_101rc81rc8luszwern.R.inc(82113);
            __CLR4_1_101rc81rc8luszwern.R.inc(82114);return type;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public void setType(String type) {try{__CLR4_1_101rc81rc8luszwern.R.inc(82115);
            __CLR4_1_101rc81rc8luszwern.R.inc(82116);this.type = type;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public Boolean getSuccess() {try{__CLR4_1_101rc81rc8luszwern.R.inc(82117);
            __CLR4_1_101rc81rc8luszwern.R.inc(82118);return success;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public void setSuccess(Boolean success) {try{__CLR4_1_101rc81rc8luszwern.R.inc(82119);
            __CLR4_1_101rc81rc8luszwern.R.inc(82120);this.success = success;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public Boolean getTail() {try{__CLR4_1_101rc81rc8luszwern.R.inc(82121);
            __CLR4_1_101rc81rc8luszwern.R.inc(82122);return tail;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
        public void setTail(Boolean tail) {try{__CLR4_1_101rc81rc8luszwern.R.inc(82123);
            __CLR4_1_101rc81rc8luszwern.R.inc(82124);this.tail = tail;
        }finally{__CLR4_1_101rc81rc8luszwern.R.flushNeeded();}}
    }
}
