/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2300;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.Serializable;
import java.util.List;

public class Issue2348 extends TestCase {static class __CLR4_5_21dgb1dgblusyjt74{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,64339,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21dgb1dgblusyjt74.R.globalSliceStart(getClass().getName(),64091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1dgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dgb1dgblusyjt74.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dgb1dgblusyjt74.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2300.Issue2348.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1dgb() throws Exception{try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64091);
        __CLR4_5_21dgb1dgblusyjt74.R.inc(64092);String json = "{\n" +
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

        __CLR4_5_21dgb1dgblusyjt74.R.inc(64093);PersonnelModel p = JSON.parseObject(json, PersonnelModel.class);
        __CLR4_5_21dgb1dgblusyjt74.R.inc(64094);assertEquals("23", p.getRfid());
        __CLR4_5_21dgb1dgblusyjt74.R.inc(64095);assertEquals("1", p.getBhlx());
        __CLR4_5_21dgb1dgblusyjt74.R.inc(64096);assertEquals(null, p.getJdxj());
    }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

    public static class RoomPersonnel {
        private String code;
        private List<PersonnelModel> data;
        private int count;
        static RoomPersonnel roompersonnel;

        public static RoomPersonnel getRoomPersonnel(){try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64097);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64098);if((((roompersonnel==null)&&(__CLR4_5_21dgb1dgblusyjt74.R.iget(64099)!=0|true))||(__CLR4_5_21dgb1dgblusyjt74.R.iget(64100)==0&false))){{
                __CLR4_5_21dgb1dgblusyjt74.R.inc(64101);roompersonnel=new  RoomPersonnel();
            }
            }__CLR4_5_21dgb1dgblusyjt74.R.inc(64102);return roompersonnel;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setCode(String code) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64103);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64104);this.code = code;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}
        public String getCode() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64105);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64106);return code;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}


        public void setData(List<PersonnelModel> data) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64107);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64108);this.data = data;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}
        public List<PersonnelModel> getData() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64109);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64110);return data;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}


        public void setCount(int count) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64111);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64112);this.count = count;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}
        public int getCount() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64113);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64114);return count;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}
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
        public String getType() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64115);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64116);return type;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setType(String type) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64117);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64118);this.type = type;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getBadw() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64119);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64120);return badw;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setBadw(String badw) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64121);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64122);this.badw = badw;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getByzde() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64123);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64124);return byzde;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setByzde(String byzde) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64125);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64126);this.byzde = byzde;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getByzde_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64127);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64128);return byzde_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setByzde_(String byzde_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64129);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64130);this.byzde_ = byzde_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getJdxj() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64131);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64132);return jdxj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setJdxj(String jdxj) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64133);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64134);this.jdxj = jdxj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getWcnr() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64135);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64136);return wcnr;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setWcnr(String wcnr) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64137);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64138);this.wcnr = wcnr;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getGzdw() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64139);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64140);return gzdw;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZbzt() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64141);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64142);return zbzt;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZbzt(String zbzt) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64143);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64144);this.zbzt = zbzt;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setGzdw(String gzdw) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64145);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64146);this.gzdw = gzdw;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZjlx() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64147);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64148);return zjlx;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZjlx(String zjlx) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64149);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64150);this.zjlx = zjlx;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getJkzk_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64151);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64152);return jkzk_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setJkzk_(String jkzk_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64153);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64154);this.jkzk_ = jkzk_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getHyzk() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64155);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64156);return hyzk;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setHyzk(String hyzk) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64157);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64158);this.hyzk = hyzk;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getHyzk_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64159);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64160);return hyzk_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setHyzk_(String hyzk_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64161);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64162);this.hyzk_ = hyzk_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getBhlx() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64163);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64164);return bhlx;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setBhlx(String bhlx) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64165);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64166);this.bhlx = bhlx;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getRfid() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64167);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64168);return rfid;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setRfid(String rfid) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64169);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64170);this.rfid = rfid;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setXm(String xm) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64171);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64172);this.xm = xm;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getGyqx() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64173);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64174);return gyqx;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setGyqx(String gyqx) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64175);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64176);this.gyqx = gyqx;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZzd() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64177);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64178);return zzd;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZzd(String zzd) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64179);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64180);this.zzd = zzd;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getRsaq() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64181);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64182);return rsaq;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setRsaq(String rsaq) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64183);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64184);this.rsaq = rsaq;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getSg() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64185);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64186);return sg;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setSg(String sg) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64187);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64188);this.sg = sg;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getTz() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64189);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64190);return tz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setTz(String tz) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64191);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64192);this.tz = tz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getXm() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64193);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64194);return xm;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setXb(String xb) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64195);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64196);this.xb = xb;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getXb() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64197);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64198);return xb;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setXb_(String xb_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64199);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64200);this.xb_ = xb_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getXb_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64201);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64202);return xb_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZjh(String zjh) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64203);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64204);this.zjh = zjh;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZjh() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64205);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64206);return zjh;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setJsh(String jsh) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64207);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64208);this.jsh = jsh;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getJsh() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64209);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64210);return jsh;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setGj(String gj) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64211);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64212);this.gj = gj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getGj() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64213);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64214);return gj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setGj_(String gj_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64215);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64216);this.gj_ = gj_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getGj_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64217);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64218);return gj_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setMz(String mz) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64219);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64220);this.mz = mz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getMz() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64221);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64222);return mz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setMz_(String mz_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64223);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64224);this.mz_ = mz_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getMz_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64225);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64226);return mz_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setWhcd(String whcd) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64227);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64228);this.whcd = whcd;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getWhcd() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64229);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64230);return whcd;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setWhcd_(String whcd_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64231);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64232);this.whcd_ = whcd_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getWhcd_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64233);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64234);return whcd_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZy(String zy) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64235);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64236);this.zy = zy;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZy() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64237);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64238);return zy;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZy_(String zy_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64239);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64240);this.zy_ = zy_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZy_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64241);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64242);return zy_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setCsrq(String csrq) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64243);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64244);this.csrq = csrq;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getCsrq() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64245);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64246);return csrq;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setCbz(String cbz) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64247);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64248);this.cbz = cbz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getCbz() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64249);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64250);return cbz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setLffh(String lffh) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64251);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64252);this.lffh = lffh;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getLffh() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64253);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64254);return lffh;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setNl(String nl) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64255);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64256);this.nl = nl;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getNl() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64257);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64258);return nl;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setRsrq(String rsrq) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64259);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64260);this.rsrq = rsrq;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getRsrq() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64261);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64262);return rsrq;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setAy(String ay) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64263);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64264);this.ay = ay;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getAy() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64265);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64266);return ay;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setAy_(String ay_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64267);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64268);this.ay_ = ay_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getAy_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64269);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64270);return ay_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZz(String zz) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64271);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64272);this.zz = zz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZz() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64273);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64274);return zz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setBahj(String bahj) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64275);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64276);this.bahj = bahj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getBahj() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64277);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64278);return bahj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setBahj_(String bahj_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64279);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64280);this.bahj_ = bahj_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getBahj_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64281);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64282);return bahj_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setJyqx(String jyqx) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64283);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64284);this.jyqx = jyqx;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getJyqx() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64285);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64286);return jyqx;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZszt(String zszt) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64287);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64288);this.zszt = zszt;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZszt() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64289);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64290);return zszt;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZszt_(String zszt_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64291);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64292);this.zszt_ = zszt_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZszt_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64293);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64294);return zszt_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setPwh(String pwh) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64295);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64296);this.pwh = pwh;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getPwh() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64297);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64298);return pwh;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setWxdj(String wxdj) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64299);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64300);this.wxdj = wxdj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getWxdj() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64301);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64302);return wxdj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setWxdj_(String wxdj_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64303);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64304);this.wxdj_ = wxdj_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getWxdj_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64305);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64306);return wxdj_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setJkzk(String jkzk) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64307);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64308);this.jkzk = jkzk;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getJkzk() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64309);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64310);return jkzk;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setFzjj(String fzjj) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64311);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64312);this.fzjj = fzjj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getFzjj() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64313);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64314);return fzjj;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZdry(String zdry) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64315);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64316);this.zdry = zdry;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZdry() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64317);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64318);return zdry;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setZdry_(String zdry_) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64319);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64320);this.zdry_ = zdry_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getZdry_() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64321);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64322);return zdry_;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setPhoto(String photo) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64323);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64324);this.photo = photo;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getPhoto() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64325);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64326);return photo;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setTzz(String tzz) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64327);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64328);this.tzz = tzz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getTzz() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64329);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64330);return tzz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public void setTzz2(String tzz2) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64331);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64332);this.tzz2 = tzz2;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getTzz2() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64333);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64334);return tzz2;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}


        public void setRsxz(String rsxz) {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64335);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64336);this.rsxz = rsxz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

        public String getRsxz() {try{__CLR4_5_21dgb1dgblusyjt74.R.inc(64337);
            __CLR4_5_21dgb1dgblusyjt74.R.inc(64338);return rsxz;
        }finally{__CLR4_5_21dgb1dgblusyjt74.R.flushNeeded();}}

    }
}
