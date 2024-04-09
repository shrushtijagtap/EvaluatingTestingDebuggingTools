/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2300;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.Serializable;
import java.util.List;

public class Issue2348 extends TestCase {static class __CLR4_5_21eej1eejlusvnbi4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,65571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21eej1eejlusvnbi4.R.globalSliceStart(getClass().getName(),65323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1eej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21eej1eejlusvnbi4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21eej1eejlusvnbi4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2300.Issue2348.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1eej() throws Exception{try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65323);
        __CLR4_5_21eej1eejlusvnbi4.R.inc(65324);String json = "{\n" +
                "\"ID\": null,\n" +
                "\"XM\": \"\u9648XX\",\n" +
                "\"XB\": \"1\",\n" +
                "\"XB_\": \"\u7537\",\n" +
                "\"ZJH\": \"522401198310176625\",\n" +
                "\"JSH\": \"0101\",\n" +
                "\"GJ\": \"156\",\n" +
                "\"GJ_\": \"\u4e2d\u56fd\",\n" +
                "\"MZ\": \"01\",\n" +
                "\"MZ_\": \"\u6c49\u65cf\",\n" +
                "\"WHCD\": \"48\",\n" +
                "\"WHCD_\": \"\u76f8\u5f53\u4e2d\u4e13\u6216\u4e2d\u6280\u6bd5\u4e1a\",\n" +
                "\"ZY\": null,\n" +
                "\"ZY_\": null,\n" +
                "\"CSRQ\": \"1532448000000\",\n" +
                "\"CBZ\": null,\n" +
                "\"LFFH\": \"370100111201807250001\",\n" +
                "\"NL\": \"0\",\n" +
                "\"RSRQ\": \"1537167900000\",\n" +
                "\"AY\": \"010180\",\n" +
                "\"AY_\": \"\u8d44\u52a9\u6d3b\u52a8\u6848\",\n" +
                "\"ZZ\": \"AAAA\",\n" +
                "\"BAHJ\": \"11\",\n" +
                "\"BAHJ_\": \"\u4e8b\u7559\",\n" +
                "\"JYQX\": null,\n" +
                "\"ZSZT\": \"11\",\n" +
                "\"ZSZT_\": null,\n" +
                "\"PWH\": \"16\",\n" +
                "\"WXDJ\": \"3\",\n" +
                "\"WXDJ_\": \"\u4e8c\u7ea7\",\n" +
                "\"JKZK\": null,\n" +
                "\"JKZK_\": null,\n" +
                "\"FZJJ\": \"\u963f\u5fb7\",\n" +
                "\"ZDRY\": \"0\",\n" +
                "\"ZDRY_\": \"\u975e\u91cd\u70b9\",\n" +
                "\"Photo\": \"\",\n" +
                "\"TZZ\": \"\",\n" +
                "\"TZZ2\": \"\",\n" +
                "\"GYQX\": \"2018/8/30 0:00:00\",\n" +
                "\"ZZD\": \"QQQQ\",\n" +
                "\"RSAQ\": \"\u963f\u5fb7\",\n" +
                "\"SG\": 22,\n" +
                "\"TZ\": 22,\n" +
                "\"HYZK\": null,\n" +
                "\"HYZK_\": null,\n" +
                "\"BHLX\": \"1\",\n" +
                "\"BHLX_\": null,\n" +
                "\"RFID\": \"23\",\n" +
                "\"RFID_\": \"\u7406\u53d1\",\n" +
                "\"ZBZT\": null,\n" +
                "\"JDXJ\": null,\n" +
                "\"WCNR\": null,\n" +
                "\"BYZDE\": \"3\",\n" +
                "\"BYZDE_\": null,\n" +
                "\"GL\": null,\n" +
                "\"GZDW\": \"\u65e0\u5355\u4f4d\",\n" +
                "\"ZJLX\": \"\u5c45\u6c11\u8eab\u4efd\u8bc1\",\n" +
                "\"CARDID\": \"D0CB8F1B\",\n" +
                "\"JBR\": null,\n" +
                "\"SKSJ\": null,\n" +
                "\"SKYY\": null,\n" +
                "\"YE\": 7427.87,\n" +
                "\"BADW\": \"\u5e02\u770b\",\n" +
                "\"RSXZ\": \"\u4e8b\u7559\",\n" +
                "\"ZB\": null,\n" +
                "\"TYPE\": \"1\",\n" +
                "\"CSSJ\": null,\n" +
                "\"CSYY\": null,\n" +
                "\"YXGW\": \"1\"\n" +
                "}";

        __CLR4_5_21eej1eejlusvnbi4.R.inc(65325);PersonnelModel p = JSON.parseObject(json, PersonnelModel.class);
        __CLR4_5_21eej1eejlusvnbi4.R.inc(65326);assertEquals("23", p.getRfid());
        __CLR4_5_21eej1eejlusvnbi4.R.inc(65327);assertEquals("1", p.getBhlx());
        __CLR4_5_21eej1eejlusvnbi4.R.inc(65328);assertEquals(null, p.getJdxj());
    }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

    public static class RoomPersonnel {
        private String code;
        private List<PersonnelModel> data;
        private int count;
        static RoomPersonnel roompersonnel;

        public static RoomPersonnel getRoomPersonnel(){try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65329);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65330);if((((roompersonnel==null)&&(__CLR4_5_21eej1eejlusvnbi4.R.iget(65331)!=0|true))||(__CLR4_5_21eej1eejlusvnbi4.R.iget(65332)==0&false))){{
                __CLR4_5_21eej1eejlusvnbi4.R.inc(65333);roompersonnel=new  RoomPersonnel();
            }
            }__CLR4_5_21eej1eejlusvnbi4.R.inc(65334);return roompersonnel;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setCode(String code) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65335);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65336);this.code = code;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}
        public String getCode() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65337);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65338);return code;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}


        public void setData(List<PersonnelModel> data) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65339);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65340);this.data = data;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}
        public List<PersonnelModel> getData() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65341);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65342);return data;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}


        public void setCount(int count) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65343);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65344);this.count = count;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}
        public int getCount() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65345);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65346);return count;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}
    }

    public static class PersonnelModel implements Serializable {

        private String xm;
        private String xb;
        private String xb_;
        private String zjh;
        private String jsh;
        private String gj;
        private String gj_;
        private String mz;
        private String mz_;
        private String whcd;
        private String whcd_;
        private String zy;
        private String zy_;
        private String csrq;
        private String cbz;
        private String lffh;
        private String nl;
        private String rsrq;
        private String ay;
        private String ay_;
        private String zz;
        private String bahj;
        private String bahj_;
        private String jyqx;
        private String zszt;
        private String zszt_;
        private String pwh;
        private String wxdj;
        private String wxdj_;
        private String jkzk;
        private String fzjj;
        private String zdry;
        private String zdry_;
        private String photo;
        private String tzz;
        private String tzz2;
        private String gyqx;
        private String zzd;
        private String rsaq;
        private String sg;
        private String tz;
        private String hyzk;
        private String hyzk_;
        private String bhlx;
        private String rfid;
        private String jkzk_;
        private String gzdw;
        private String zjlx;
        private String zbzt;
        private String jdxj;
        private String wcnr;
        private String byzde;
        private String byzde_;
        private String badw;
        private String type;
        private String rsxz;
        public String getType() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65347);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65348);return type;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setType(String type) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65349);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65350);this.type = type;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getBadw() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65351);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65352);return badw;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setBadw(String badw) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65353);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65354);this.badw = badw;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getByzde() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65355);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65356);return byzde;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setByzde(String byzde) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65357);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65358);this.byzde = byzde;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getByzde_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65359);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65360);return byzde_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setByzde_(String byzde_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65361);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65362);this.byzde_ = byzde_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getJdxj() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65363);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65364);return jdxj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setJdxj(String jdxj) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65365);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65366);this.jdxj = jdxj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getWcnr() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65367);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65368);return wcnr;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setWcnr(String wcnr) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65369);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65370);this.wcnr = wcnr;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getGzdw() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65371);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65372);return gzdw;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZbzt() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65373);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65374);return zbzt;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZbzt(String zbzt) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65375);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65376);this.zbzt = zbzt;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setGzdw(String gzdw) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65377);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65378);this.gzdw = gzdw;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZjlx() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65379);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65380);return zjlx;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZjlx(String zjlx) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65381);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65382);this.zjlx = zjlx;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getJkzk_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65383);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65384);return jkzk_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setJkzk_(String jkzk_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65385);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65386);this.jkzk_ = jkzk_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getHyzk() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65387);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65388);return hyzk;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setHyzk(String hyzk) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65389);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65390);this.hyzk = hyzk;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getHyzk_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65391);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65392);return hyzk_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setHyzk_(String hyzk_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65393);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65394);this.hyzk_ = hyzk_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getBhlx() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65395);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65396);return bhlx;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setBhlx(String bhlx) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65397);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65398);this.bhlx = bhlx;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getRfid() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65399);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65400);return rfid;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setRfid(String rfid) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65401);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65402);this.rfid = rfid;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setXm(String xm) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65403);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65404);this.xm = xm;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getGyqx() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65405);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65406);return gyqx;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setGyqx(String gyqx) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65407);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65408);this.gyqx = gyqx;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZzd() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65409);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65410);return zzd;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZzd(String zzd) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65411);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65412);this.zzd = zzd;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getRsaq() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65413);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65414);return rsaq;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setRsaq(String rsaq) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65415);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65416);this.rsaq = rsaq;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getSg() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65417);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65418);return sg;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setSg(String sg) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65419);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65420);this.sg = sg;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getTz() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65421);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65422);return tz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setTz(String tz) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65423);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65424);this.tz = tz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getXm() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65425);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65426);return xm;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setXb(String xb) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65427);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65428);this.xb = xb;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getXb() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65429);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65430);return xb;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setXb_(String xb_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65431);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65432);this.xb_ = xb_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getXb_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65433);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65434);return xb_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZjh(String zjh) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65435);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65436);this.zjh = zjh;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZjh() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65437);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65438);return zjh;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setJsh(String jsh) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65439);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65440);this.jsh = jsh;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getJsh() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65441);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65442);return jsh;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setGj(String gj) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65443);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65444);this.gj = gj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getGj() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65445);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65446);return gj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setGj_(String gj_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65447);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65448);this.gj_ = gj_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getGj_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65449);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65450);return gj_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setMz(String mz) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65451);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65452);this.mz = mz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getMz() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65453);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65454);return mz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setMz_(String mz_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65455);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65456);this.mz_ = mz_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getMz_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65457);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65458);return mz_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setWhcd(String whcd) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65459);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65460);this.whcd = whcd;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getWhcd() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65461);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65462);return whcd;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setWhcd_(String whcd_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65463);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65464);this.whcd_ = whcd_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getWhcd_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65465);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65466);return whcd_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZy(String zy) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65467);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65468);this.zy = zy;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZy() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65469);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65470);return zy;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZy_(String zy_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65471);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65472);this.zy_ = zy_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZy_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65473);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65474);return zy_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setCsrq(String csrq) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65475);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65476);this.csrq = csrq;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getCsrq() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65477);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65478);return csrq;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setCbz(String cbz) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65479);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65480);this.cbz = cbz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getCbz() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65481);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65482);return cbz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setLffh(String lffh) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65483);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65484);this.lffh = lffh;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getLffh() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65485);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65486);return lffh;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setNl(String nl) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65487);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65488);this.nl = nl;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getNl() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65489);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65490);return nl;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setRsrq(String rsrq) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65491);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65492);this.rsrq = rsrq;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getRsrq() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65493);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65494);return rsrq;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setAy(String ay) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65495);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65496);this.ay = ay;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getAy() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65497);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65498);return ay;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setAy_(String ay_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65499);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65500);this.ay_ = ay_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getAy_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65501);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65502);return ay_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZz(String zz) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65503);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65504);this.zz = zz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZz() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65505);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65506);return zz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setBahj(String bahj) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65507);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65508);this.bahj = bahj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getBahj() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65509);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65510);return bahj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setBahj_(String bahj_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65511);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65512);this.bahj_ = bahj_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getBahj_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65513);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65514);return bahj_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setJyqx(String jyqx) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65515);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65516);this.jyqx = jyqx;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getJyqx() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65517);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65518);return jyqx;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZszt(String zszt) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65519);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65520);this.zszt = zszt;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZszt() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65521);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65522);return zszt;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZszt_(String zszt_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65523);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65524);this.zszt_ = zszt_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZszt_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65525);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65526);return zszt_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setPwh(String pwh) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65527);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65528);this.pwh = pwh;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getPwh() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65529);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65530);return pwh;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setWxdj(String wxdj) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65531);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65532);this.wxdj = wxdj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getWxdj() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65533);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65534);return wxdj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setWxdj_(String wxdj_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65535);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65536);this.wxdj_ = wxdj_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getWxdj_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65537);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65538);return wxdj_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setJkzk(String jkzk) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65539);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65540);this.jkzk = jkzk;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getJkzk() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65541);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65542);return jkzk;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setFzjj(String fzjj) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65543);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65544);this.fzjj = fzjj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getFzjj() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65545);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65546);return fzjj;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZdry(String zdry) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65547);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65548);this.zdry = zdry;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZdry() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65549);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65550);return zdry;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setZdry_(String zdry_) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65551);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65552);this.zdry_ = zdry_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getZdry_() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65553);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65554);return zdry_;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setPhoto(String photo) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65555);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65556);this.photo = photo;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getPhoto() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65557);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65558);return photo;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setTzz(String tzz) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65559);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65560);this.tzz = tzz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getTzz() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65561);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65562);return tzz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public void setTzz2(String tzz2) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65563);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65564);this.tzz2 = tzz2;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getTzz2() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65565);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65566);return tzz2;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}


        public void setRsxz(String rsxz) {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65567);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65568);this.rsxz = rsxz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

        public String getRsxz() {try{__CLR4_5_21eej1eejlusvnbi4.R.inc(65569);
            __CLR4_5_21eej1eejlusvnbi4.R.inc(65570);return rsxz;
        }finally{__CLR4_5_21eej1eejlusvnbi4.R.flushNeeded();}}

    }
}
