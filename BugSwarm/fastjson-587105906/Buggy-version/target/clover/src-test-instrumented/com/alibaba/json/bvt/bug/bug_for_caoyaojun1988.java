/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class bug_for_caoyaojun1988 extends TestCase {static class __CLR4_1_1017ze17zelusqk7gp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,57063,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_bug() throws Exception {__CLR4_1_1017ze17zelusqk7gp.R.globalSliceStart(getClass().getName(),57002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yy5c3c17ze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017ze17zelusqk7gp.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017ze17zelusqk7gp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_caoyaojun1988.test_for_bug",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57002,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yy5c3c17ze() throws Exception{try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57002);
        // \u521b\u5efa BusinessVO
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57003);BusinessVO businessVO = new BusinessVO();
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57004);businessVO.setName("name");

        // \u521b\u5efa \u7b2c\u4e00\u4e2aList list\u4e2d\u6bcf\u4e00\u4e2a\u5bf9\u8c61\u90fd\u5305\u542b BusinessVO\u5bf9\u8c61
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57005);ExpiredDto expiredDto = new ExpiredDto();
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57006);expiredDto.setBusinessVO(businessVO);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57007);expiredDto.setId(10001);

        __CLR4_1_1017ze17zelusqk7gp.R.inc(57008);List<ExpiredDto> expiredReports = new ArrayList<ExpiredDto>();
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57009);expiredReports.add(expiredDto);

        // \u521b\u5efa \u7b2c\u4e8c\u4e2aList list\u4e2d\u6bcf\u4e00\u4e2a\u5bf9\u8c61\u90fd\u5305\u542b BusinessVO\u5bf9\u8c61

        __CLR4_1_1017ze17zelusqk7gp.R.inc(57010);List<NormalDto> normalReports = new ArrayList<NormalDto>();
        {
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57011);NormalDto normalDto = new NormalDto();
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57012);normalDto.setBusinessVO(businessVO);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57013);normalDto.setId(10001);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57014);normalReports.add(normalDto);
        }

        // \u521b\u5efa \u9700\u8981\u5e8f\u5217\u5316\u7684\u5bf9\u8c61\uff0c\u5305\u542b\u4e24\u4e2alist
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57015);ReportDto reportDto = new ReportDto();
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57016);reportDto.setExpiredReports(expiredReports);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57017);reportDto.setNormalReports(normalReports);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57018);reportDto.setCompanyId(10004);

        // \u7b2c\u4e00\u4e2a\u573a\u666f \u5f97\u5230\u7684businessVO\u4e3anull\uff1b
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57019);String serializeStr = (String) JSON.toJSONString(reportDto);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57020);System.out.println(serializeStr);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57021);ReportDto reuslt = (ReportDto) JSON.parseObject(serializeStr, ReportDto.class);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57022);System.out.println(reuslt.getNormalReports().get(0).getBusinessVO());

        // \u7b2c\u4e8c\u4e2a\u573a\u666f \u5f97\u5230\u7684businessVO\u4e3a\u6b63\u5e38\u6570\u636e
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57023);expiredReports.add(expiredDto);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57024);serializeStr = (String) JSON.toJSONString(reportDto);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57025);System.out.println(serializeStr);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57026);reuslt = (ReportDto) JSON.parseObject(serializeStr, ReportDto.class);
        __CLR4_1_1017ze17zelusqk7gp.R.inc(57027);System.out.print(reuslt.getNormalReports().get(0).getBusinessVO().getName());
    }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

    public static class BusinessVO implements Serializable {

        private static final long serialVersionUID = -191856665415285103L;
        private String            name;
        
        public BusinessVO() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57028);
            
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57029);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57030);this.name = name;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57031);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57032);return name;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

    }

    public static class ExpiredDto implements Serializable {

        private static final long serialVersionUID = -2361763020563748437L;
        private Integer           id;
        private BusinessVO        businessVO;

        public Integer getId() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57033);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57034);return id;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57035);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57036);this.id = id;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public BusinessVO getBusinessVO() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57037);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57038);return businessVO;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public void setBusinessVO(BusinessVO businessVO) {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57039);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57040);this.businessVO = businessVO;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

    }

    public static class NormalDto implements Serializable {

        private static final long serialVersionUID = -2392077150026945111L;
        private Integer           id;
        private BusinessVO        businessVO;

        public Integer getId() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57041);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57042);return id;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57043);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57044);this.id = id;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public BusinessVO getBusinessVO() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57045);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57046);return businessVO;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public void setBusinessVO(BusinessVO businessVO) {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57047);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57048);this.businessVO = businessVO;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public static long getSerialversionuid() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57049);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57050);return serialVersionUID;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

    }

    public static class ReportDto implements Serializable {

        private static final long serialVersionUID = 4502937258945851832L;
        private Integer           companyId;
        private List<NormalDto>   normalReports;
        private List<ExpiredDto>  expiredReports;

        public Integer getCompanyId() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57051);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57052);return companyId;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public void setCompanyId(Integer companyId) {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57053);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57054);this.companyId = companyId;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public List<NormalDto> getNormalReports() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57055);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57056);return normalReports;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public void setNormalReports(List<NormalDto> normalReports) {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57057);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57058);this.normalReports = normalReports;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public List<ExpiredDto> getExpiredReports() {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57059);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57060);return expiredReports;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

        public void setExpiredReports(List<ExpiredDto> expiredReports) {try{__CLR4_1_1017ze17zelusqk7gp.R.inc(57061);
            __CLR4_1_1017ze17zelusqk7gp.R.inc(57062);this.expiredReports = expiredReports;
        }finally{__CLR4_1_1017ze17zelusqk7gp.R.flushNeeded();}}

    }

}
