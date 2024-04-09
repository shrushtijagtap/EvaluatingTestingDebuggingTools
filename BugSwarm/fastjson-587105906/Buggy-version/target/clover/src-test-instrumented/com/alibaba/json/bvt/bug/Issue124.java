/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Issue124 extends TestCase {static class __CLR4_1_1016ln16lnlusqk6g0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,55281,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_1016ln16lnlusqk6g0.R.globalSliceStart(getClass().getName(),55211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb16ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016ln16lnlusqk6g0.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016ln16lnlusqk6g0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue124.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55211,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb16ln() throws Exception{try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55211);
        // final ObjectMapper mapper = new ObjectMapper();
        // mapper.setSerializationInclusion(Include.NON_NULL);
        __CLR4_1_1016ln16lnlusqk6g0.R.inc(55212);final Random random = new Random();
        __CLR4_1_1016ln16lnlusqk6g0.R.inc(55213);final int threadCount = 1000;
        __CLR4_1_1016ln16lnlusqk6g0.R.inc(55214);final CountDownLatch latch = new CountDownLatch(threadCount);
//        {
//            UserInfo info = new UserInfo();
//            CheckInfoVo vo = new CheckInfoVo(100);
//            JSON.toJSONString(new SuccessReturn(info), SerializerFeature.WriteDateUseDateFormat);
//            JSON.toJSONString(new SuccessReturn(vo),
//                              SerializerFeature.WriteDateUseDateFormat);
//        }
        __CLR4_1_1016ln16lnlusqk6g0.R.inc(55215);for (int i = 0; (((i < threadCount)&&(__CLR4_1_1016ln16lnlusqk6g0.R.iget(55216)!=0|true))||(__CLR4_1_1016ln16lnlusqk6g0.R.iget(55217)==0&false)); i++) {{
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55218);new Thread() {

                @Override
                public void run() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55219);
                    __CLR4_1_1016ln16lnlusqk6g0.R.inc(55220);UserInfo info = new UserInfo();
                    __CLR4_1_1016ln16lnlusqk6g0.R.inc(55221);CheckInfoVo vo = new CheckInfoVo(100);
                    __CLR4_1_1016ln16lnlusqk6g0.R.inc(55222);int r = random.nextInt();
                    __CLR4_1_1016ln16lnlusqk6g0.R.inc(55223);try {
                        __CLR4_1_1016ln16lnlusqk6g0.R.inc(55224);if ((((r % 2 == 0)&&(__CLR4_1_1016ln16lnlusqk6g0.R.iget(55225)!=0|true))||(__CLR4_1_1016ln16lnlusqk6g0.R.iget(55226)==0&false))) {{
                            // System.out.println(mapper.writeValueAsString(info));
                            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55227);System.out.println(JSON.toJSONString(new SuccessReturn(info),
                                                                 SerializerFeature.WriteDateUseDateFormat));
                        } }else {{
                            // System.out.println(mapper.writeValueAsString(vo));
                            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55228);System.out.println(JSON.toJSONString(new SuccessReturn(vo),
                                                                 SerializerFeature.WriteDateUseDateFormat));
                        }
                    }} catch (Exception e) {
                        __CLR4_1_1016ln16lnlusqk6g0.R.inc(55229);e.printStackTrace();
                        __CLR4_1_1016ln16lnlusqk6g0.R.inc(55230);System.exit(0);
                    } finally {
                        __CLR4_1_1016ln16lnlusqk6g0.R.inc(55231);latch.countDown();
                    }
                }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}
            }.start();
        }
        }__CLR4_1_1016ln16lnlusqk6g0.R.inc(55232);latch.await();
    }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

    static class SuccessReturn {

        private int    code = 0;
        private Object data;

        SuccessReturn(Object data){try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55233);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55234);this.data = data;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public int getCode() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55235);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55236);return code;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public Object getData() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55237);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55238);return data;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}
    }

    static class CheckInfoVo {

        private final int gmMessageCount;

        public CheckInfoVo(){try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55239);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55240);this.gmMessageCount = 0;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public CheckInfoVo(int gmMessageCount){try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55241);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55242);this.gmMessageCount = gmMessageCount;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public int getGmMessageCount() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55243);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55244);return gmMessageCount;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}
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

        public long getAppid() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55245);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55246);return appid;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setAppid(long appid) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55247);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55248);this.appid = appid;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public long getUid() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55249);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55250);return uid;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setUid(long uid) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55251);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55252);this.uid = uid;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public String getUserName() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55253);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55254);return userName;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setUserName(String userName) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55255);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55256);this.userName = userName;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public int getUserType() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55257);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55258);return userType;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setUserType(int userType) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55259);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55260);this.userType = userType;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public int getAvatar() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55261);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55262);return avatar;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setAvatar(int avatar) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55263);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55264);this.avatar = avatar;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public String getUpdateTime() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55265);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55266);return updateTime;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setUpdateTime(String updateTime) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55267);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55268);this.updateTime = updateTime;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public String getNickName() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55269);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55270);return nickName;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setNickName(String nickName) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55271);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55272);this.nickName = nickName;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public int getModifyNickanme() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55273);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55274);return modifyNickanme;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setModifyNickanme(int modifyNickanme) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55275);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55276);this.modifyNickanme = modifyNickanme;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public List<Integer> getServerIds() {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55277);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55278);return serverIds;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}

        public void setServerIds(List<Integer> serverIds) {try{__CLR4_1_1016ln16lnlusqk6g0.R.inc(55279);
            __CLR4_1_1016ln16lnlusqk6g0.R.inc(55280);this.serverIds = serverIds;
        }finally{__CLR4_1_1016ln16lnlusqk6g0.R.flushNeeded();}}
    }

}
