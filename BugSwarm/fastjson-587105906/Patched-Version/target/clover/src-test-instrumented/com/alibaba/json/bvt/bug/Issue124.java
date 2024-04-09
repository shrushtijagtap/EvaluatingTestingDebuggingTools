/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Issue124 extends TestCase {static class __CLR4_5_217jk17jklusvn7qv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56502,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_217jk17jklusvn7qv.R.globalSliceStart(getClass().getName(),56432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb17jk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217jk17jklusvn7qv.R.rethrow($CLV_t2$);}finally{__CLR4_5_217jk17jklusvn7qv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue124.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56432,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb17jk() throws Exception{try{__CLR4_5_217jk17jklusvn7qv.R.inc(56432);
        // final ObjectMapper mapper = new ObjectMapper();
        // mapper.setSerializationInclusion(Include.NON_NULL);
        __CLR4_5_217jk17jklusvn7qv.R.inc(56433);final Random random = new Random();
        __CLR4_5_217jk17jklusvn7qv.R.inc(56434);final int threadCount = 1000;
        __CLR4_5_217jk17jklusvn7qv.R.inc(56435);final CountDownLatch latch = new CountDownLatch(threadCount);
//        {
//            UserInfo info = new UserInfo();
//            CheckInfoVo vo = new CheckInfoVo(100);
//            JSON.toJSONString(new SuccessReturn(info), SerializerFeature.WriteDateUseDateFormat);
//            JSON.toJSONString(new SuccessReturn(vo),
//                              SerializerFeature.WriteDateUseDateFormat);
//        }
        __CLR4_5_217jk17jklusvn7qv.R.inc(56436);for (int i = 0; (((i < threadCount)&&(__CLR4_5_217jk17jklusvn7qv.R.iget(56437)!=0|true))||(__CLR4_5_217jk17jklusvn7qv.R.iget(56438)==0&false)); i++) {{
            __CLR4_5_217jk17jklusvn7qv.R.inc(56439);new Thread() {

                @Override
                public void run() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56440);
                    __CLR4_5_217jk17jklusvn7qv.R.inc(56441);UserInfo info = new UserInfo();
                    __CLR4_5_217jk17jklusvn7qv.R.inc(56442);CheckInfoVo vo = new CheckInfoVo(100);
                    __CLR4_5_217jk17jklusvn7qv.R.inc(56443);int r = random.nextInt();
                    __CLR4_5_217jk17jklusvn7qv.R.inc(56444);try {
                        __CLR4_5_217jk17jklusvn7qv.R.inc(56445);if ((((r % 2 == 0)&&(__CLR4_5_217jk17jklusvn7qv.R.iget(56446)!=0|true))||(__CLR4_5_217jk17jklusvn7qv.R.iget(56447)==0&false))) {{
                            // System.out.println(mapper.writeValueAsString(info));
                            __CLR4_5_217jk17jklusvn7qv.R.inc(56448);System.out.println(JSON.toJSONString(new SuccessReturn(info),
                                                                 SerializerFeature.WriteDateUseDateFormat));
                        } }else {{
                            // System.out.println(mapper.writeValueAsString(vo));
                            __CLR4_5_217jk17jklusvn7qv.R.inc(56449);System.out.println(JSON.toJSONString(new SuccessReturn(vo),
                                                                 SerializerFeature.WriteDateUseDateFormat));
                        }
                    }} catch (Exception e) {
                        __CLR4_5_217jk17jklusvn7qv.R.inc(56450);e.printStackTrace();
                        __CLR4_5_217jk17jklusvn7qv.R.inc(56451);System.exit(0);
                    } finally {
                        __CLR4_5_217jk17jklusvn7qv.R.inc(56452);latch.countDown();
                    }
                }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}
            }.start();
        }
        }__CLR4_5_217jk17jklusvn7qv.R.inc(56453);latch.await();
    }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

    static class SuccessReturn {

        private int    code = 0;
        private Object data;

        SuccessReturn(Object data){try{__CLR4_5_217jk17jklusvn7qv.R.inc(56454);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56455);this.data = data;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public int getCode() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56456);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56457);return code;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public Object getData() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56458);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56459);return data;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}
    }

    static class CheckInfoVo {

        private final int gmMessageCount;

        public CheckInfoVo(){try{__CLR4_5_217jk17jklusvn7qv.R.inc(56460);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56461);this.gmMessageCount = 0;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public CheckInfoVo(int gmMessageCount){try{__CLR4_5_217jk17jklusvn7qv.R.inc(56462);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56463);this.gmMessageCount = gmMessageCount;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public int getGmMessageCount() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56464);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56465);return gmMessageCount;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}
    }

    static class UserInfo {

        private long          uid;
        private String        userName;
        private String        nickName;
        private int           userType;
        private int           avatar;
        private String        updateTime;
        private int           modifyNickanme; // 1\u53ef\u4ee5\u4fee\u6539nickname 0\u4e0d\u80fd\u4fee\u6539
        private long          appid;
        private List<Integer> serverIds;

        public long getAppid() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56466);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56467);return appid;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setAppid(long appid) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56468);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56469);this.appid = appid;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public long getUid() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56470);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56471);return uid;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setUid(long uid) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56472);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56473);this.uid = uid;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public String getUserName() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56474);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56475);return userName;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setUserName(String userName) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56476);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56477);this.userName = userName;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public int getUserType() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56478);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56479);return userType;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setUserType(int userType) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56480);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56481);this.userType = userType;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public int getAvatar() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56482);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56483);return avatar;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setAvatar(int avatar) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56484);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56485);this.avatar = avatar;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public String getUpdateTime() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56486);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56487);return updateTime;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setUpdateTime(String updateTime) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56488);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56489);this.updateTime = updateTime;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public String getNickName() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56490);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56491);return nickName;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setNickName(String nickName) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56492);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56493);this.nickName = nickName;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public int getModifyNickanme() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56494);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56495);return modifyNickanme;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setModifyNickanme(int modifyNickanme) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56496);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56497);this.modifyNickanme = modifyNickanme;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public List<Integer> getServerIds() {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56498);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56499);return serverIds;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}

        public void setServerIds(List<Integer> serverIds) {try{__CLR4_5_217jk17jklusvn7qv.R.inc(56500);
            __CLR4_5_217jk17jklusvn7qv.R.inc(56501);this.serverIds = serverIds;
        }finally{__CLR4_5_217jk17jklusvn7qv.R.flushNeeded();}}
    }

}
