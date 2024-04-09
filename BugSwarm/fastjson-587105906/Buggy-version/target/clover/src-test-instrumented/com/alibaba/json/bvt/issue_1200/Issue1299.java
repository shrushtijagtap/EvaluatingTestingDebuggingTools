/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wenshao on 01/07/2017.
 */
public class Issue1299 extends TestCase {static class __CLR4_1_1019ut19utlusqk90u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,59447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_1019ut19utlusqk90u.R.globalSliceStart(getClass().getName(),59429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb19ut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019ut19utlusqk90u.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019ut19utlusqk90u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1200.Issue1299.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59429,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb19ut() throws Exception{try{__CLR4_1_1019ut19utlusqk90u.R.inc(59429);
        __CLR4_1_1019ut19utlusqk90u.R.inc(59430);String jsonStr = "{\"code\":201,\"data\":{\"materials\":[{\"material\":\"locale\",\"success\":true,"
                + "\"material_id\":356,\"id\":\"5099\"}],\"unitInfo\":{\"languages\":[\"'en_US'\",\"ru_RU\"],"
                + "\"unitName\":\"PC_ROCKBROS\",\"sceneKey\":\"shop_activity_page\",\"domain\":\"shopcdp.aliexpress"
                + ".com\",\"format\":\"HTML\",\"unitId\":\"1625\",\"id\":1761,\"rootPath\":\"shopcdp\","
                + "\"userId\":\"jianqing.zengjq\",\"platforms\":[\"pc\",\"mobile\"],\"status\":2}},\"success\":true}";

        __CLR4_1_1019ut19utlusqk90u.R.inc(59431);UnitsSaveResponse response = JSON.parseObject(jsonStr, UnitsSaveResponse.class);
        __CLR4_1_1019ut19utlusqk90u.R.inc(59432);Class<?> dataClass = response.getData().getClass();
        __CLR4_1_1019ut19utlusqk90u.R.inc(59433);System.out.println(dataClass);
    }finally{__CLR4_1_1019ut19utlusqk90u.R.flushNeeded();}}

    public static class ServiceResult<T> extends BaseResultDo implements Serializable {
        @JSONField(
                name = "data"
        )
        private T data;

        public ServiceResult() {try{__CLR4_1_1019ut19utlusqk90u.R.inc(59434);
        }finally{__CLR4_1_1019ut19utlusqk90u.R.flushNeeded();}}

        public T getData() {try{__CLR4_1_1019ut19utlusqk90u.R.inc(59435);
            __CLR4_1_1019ut19utlusqk90u.R.inc(59436);return this.data;
        }finally{__CLR4_1_1019ut19utlusqk90u.R.flushNeeded();}}

        public void setData(T data) {try{__CLR4_1_1019ut19utlusqk90u.R.inc(59437);
            __CLR4_1_1019ut19utlusqk90u.R.inc(59438);this.data = data;
        }finally{__CLR4_1_1019ut19utlusqk90u.R.flushNeeded();}}
    }

    public static class UnitsSaveResponse extends ServiceResult<UnitSave> {



    }

    public static class UnitSave implements Serializable {

        private SaveUnitInfo unitInfo;

        private List materials;

        public SaveUnitInfo getUnitInfo() {try{__CLR4_1_1019ut19utlusqk90u.R.inc(59439);
            __CLR4_1_1019ut19utlusqk90u.R.inc(59440);return unitInfo;
        }finally{__CLR4_1_1019ut19utlusqk90u.R.flushNeeded();}}

        public void setUnitInfo(SaveUnitInfo unitInfo) {try{__CLR4_1_1019ut19utlusqk90u.R.inc(59441);
            __CLR4_1_1019ut19utlusqk90u.R.inc(59442);this.unitInfo = unitInfo;
        }finally{__CLR4_1_1019ut19utlusqk90u.R.flushNeeded();}}

        public List getMaterials() {try{__CLR4_1_1019ut19utlusqk90u.R.inc(59443);
            __CLR4_1_1019ut19utlusqk90u.R.inc(59444);return materials;
        }finally{__CLR4_1_1019ut19utlusqk90u.R.flushNeeded();}}

        public void setMaterials(List materials) {try{__CLR4_1_1019ut19utlusqk90u.R.inc(59445);
            __CLR4_1_1019ut19utlusqk90u.R.inc(59446);this.materials = materials;
        }finally{__CLR4_1_1019ut19utlusqk90u.R.flushNeeded();}}
    }

    public static class SaveUnitInfo {

    }

    public static class BaseResultDo{

    }


}
