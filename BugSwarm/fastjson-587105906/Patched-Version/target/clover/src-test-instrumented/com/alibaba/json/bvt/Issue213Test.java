/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.io.Serializable;
import java.util.Date;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Issue213Test extends TestCase {static class __CLR4_5_2xgjxgjlusyjpv3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,43393,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2xgjxgjlusyjpv3.R.globalSliceStart(getClass().getName(),43363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2xgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xgjxgjlusyjpv3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xgjxgjlusyjpv3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.Issue213Test.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43363,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2xgj() throws Exception{try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43363);
        __CLR4_5_2xgjxgjlusyjpv3.R.inc(43364);String text = "\t\t\t\t\t\t \u00a020:00-21:30</span><br />\r\n\r\n</p>\r\n<p>\r\n\t\r\n</p>\r\n<p>\r\n\t<br />\r\n</p>\r\n\t\t\t";
        __CLR4_5_2xgjxgjlusyjpv3.R.inc(43365);Product e = new Product();
        __CLR4_5_2xgjxgjlusyjpv3.R.inc(43366);e.setIntro(text);
        __CLR4_5_2xgjxgjlusyjpv3.R.inc(43367);byte[] r = JSON.toJSONBytes(e);
        __CLR4_5_2xgjxgjlusyjpv3.R.inc(43368);JSON.parseObject(r, Product.class);
    }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

    public static class Product implements Serializable {

        private static final long serialVersionUID = 5515785177596600948L;

        private String            studyTargets;

        private String            applicableUsers;

        private String            intro;

        private Date              createDateTime;

        private int               createUserId;

        private int               liveStatus;

        public String getStudyTargets() {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43369);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43370);return studyTargets;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public void setStudyTargets(String studyTargets) {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43371);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43372);this.studyTargets = studyTargets;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public String getApplicableUsers() {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43373);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43374);return applicableUsers;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public void setApplicableUsers(String applicableUsers) {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43375);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43376);this.applicableUsers = applicableUsers;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public String getIntro() {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43377);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43378);return intro;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public void setIntro(String intro) {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43379);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43380);this.intro = intro;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public int getCreateUserId() {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43381);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43382);return createUserId;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public void setCreateUserId(int createUserId) {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43383);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43384);this.createUserId = createUserId;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public int getLiveStatus() {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43385);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43386);return liveStatus;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public void setLiveStatus(int liveStatus) {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43387);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43388);this.liveStatus = liveStatus;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public Date getCreateDateTime() {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43389);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43390);return createDateTime;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}

        public void setCreateDateTime(Date createDateTime) {try{__CLR4_5_2xgjxgjlusyjpv3.R.inc(43391);
            __CLR4_5_2xgjxgjlusyjpv3.R.inc(43392);this.createDateTime = createDateTime;
        }finally{__CLR4_5_2xgjxgjlusyjpv3.R.flushNeeded();}}
    }
}
