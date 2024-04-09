/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class Bug_for_issue_256 extends TestCase {static class __CLR4_1_10143p143plusqk2t4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,52006,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_10143p143plusqk2t4.R.globalSliceStart(getClass().getName(),51973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb143p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10143p143plusqk2t4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10143p143plusqk2t4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_256.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51973,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb143p() throws Exception{try{__CLR4_1_10143p143plusqk2t4.R.inc(51973);
        __CLR4_1_10143p143plusqk2t4.R.inc(51974);List<AisleDeployInfo> list3 = new ArrayList<AisleDeployInfo>();
        __CLR4_1_10143p143plusqk2t4.R.inc(51975);AisleDeployInfo aisleDeployInfo = new AisleDeployInfo();
        __CLR4_1_10143p143plusqk2t4.R.inc(51976);aisleDeployInfo.setId(1L);
        __CLR4_1_10143p143plusqk2t4.R.inc(51977);aisleDeployInfo.setProvinceArea("3,4,5");
        __CLR4_1_10143p143plusqk2t4.R.inc(51978);list3.add(aisleDeployInfo);

        __CLR4_1_10143p143plusqk2t4.R.inc(51979);AisleDeployInfo aisleDeployInfo1 = new AisleDeployInfo();
        __CLR4_1_10143p143plusqk2t4.R.inc(51980);aisleDeployInfo1.setId(2L);
        __CLR4_1_10143p143plusqk2t4.R.inc(51981);aisleDeployInfo1.setProvinceArea("3,4,5");
        __CLR4_1_10143p143plusqk2t4.R.inc(51982);list3.add(aisleDeployInfo1);

        __CLR4_1_10143p143plusqk2t4.R.inc(51983);List<AisleDeployInfo> list4 = new ArrayList<AisleDeployInfo>();
        __CLR4_1_10143p143plusqk2t4.R.inc(51984);list4.add(aisleDeployInfo);

        __CLR4_1_10143p143plusqk2t4.R.inc(51985);Map<String, List<AisleDeployInfo>> map3 = new HashMap<String, List<AisleDeployInfo>>();
        __CLR4_1_10143p143plusqk2t4.R.inc(51986);map3.put("1", list3);
        __CLR4_1_10143p143plusqk2t4.R.inc(51987);map3.put("2", list4);

        __CLR4_1_10143p143plusqk2t4.R.inc(51988);String str = JSON.toJSONString(map3);
        __CLR4_1_10143p143plusqk2t4.R.inc(51989);Map<String, List<AisleDeployInfo>> map1 = JSON.parseObject(str, new TypeReference<Map<String, List<AisleDeployInfo>>>(){});
        __CLR4_1_10143p143plusqk2t4.R.inc(51990);List<AisleDeployInfo> aList = map1.get("1");

        __CLR4_1_10143p143plusqk2t4.R.inc(51991);if ((((aList != null && aList.size() > 0)&&(__CLR4_1_10143p143plusqk2t4.R.iget(51992)!=0|true))||(__CLR4_1_10143p143plusqk2t4.R.iget(51993)==0&false))) {{
            __CLR4_1_10143p143plusqk2t4.R.inc(51994);for (int i = 0; (((i < aList.size())&&(__CLR4_1_10143p143plusqk2t4.R.iget(51995)!=0|true))||(__CLR4_1_10143p143plusqk2t4.R.iget(51996)==0&false)); i++) {{
                __CLR4_1_10143p143plusqk2t4.R.inc(51997);System.out.println(aList.get(i).getId());
            }
        }}
    }}finally{__CLR4_1_10143p143plusqk2t4.R.flushNeeded();}}
    
    public static class AisleDeployInfo {
        private long id;
        private String provinceArea;
        
        public long getId() {try{__CLR4_1_10143p143plusqk2t4.R.inc(51998);
            __CLR4_1_10143p143plusqk2t4.R.inc(51999);return id;
        }finally{__CLR4_1_10143p143plusqk2t4.R.flushNeeded();}}

        
        public void setId(long id) {try{__CLR4_1_10143p143plusqk2t4.R.inc(52000);
            __CLR4_1_10143p143plusqk2t4.R.inc(52001);this.id = id;
        }finally{__CLR4_1_10143p143plusqk2t4.R.flushNeeded();}}


        
        public String getProvinceArea() {try{__CLR4_1_10143p143plusqk2t4.R.inc(52002);
            __CLR4_1_10143p143plusqk2t4.R.inc(52003);return provinceArea;
        }finally{__CLR4_1_10143p143plusqk2t4.R.flushNeeded();}}


        
        public void setProvinceArea(String provinceArea) {try{__CLR4_1_10143p143plusqk2t4.R.inc(52004);
            __CLR4_1_10143p143plusqk2t4.R.inc(52005);this.provinceArea = provinceArea;
        }finally{__CLR4_1_10143p143plusqk2t4.R.flushNeeded();}}
        
        
    }

    public static class Model extends HashMap {

    }
}
