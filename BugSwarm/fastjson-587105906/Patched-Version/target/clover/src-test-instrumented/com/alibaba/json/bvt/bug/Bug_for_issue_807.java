/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.io.Serializable;

/**
 * Created by wenshao on 16/9/5.
 */
public class Bug_for_issue_807 extends TestCase {static class __CLR4_5_214te14telusyjrpe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,52905,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_214te14telusyjrpe.R.globalSliceStart(getClass().getName(),52898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb14te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214te14telusyjrpe.R.rethrow($CLV_t2$);}finally{__CLR4_5_214te14telusyjrpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_807.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb14te() throws Exception{try{__CLR4_5_214te14telusyjrpe.R.inc(52898);
        __CLR4_5_214te14telusyjrpe.R.inc(52899);String text = "{\"ckid\":\"81a5953835310708e414057adb45e826\",\"rcToken\":\"E+jkQCWSwop+JICPBHc+fxMYeExTx2NTDGZCJ8gIPg7NbMLNvfmZBPU2dR5uxpRRe+zPnOIaCATpHcSa6q+k39HGjNFFDRt9PNlEJokpxhTw9gYJ/WKoSlVR/4ibjIgjvVHxS2lNLS4=\",\"userInfo\":{\"openid\":\"oEH-vt-7mGHOQets-XbE1c3DKpVc\",\"nickname\":\"Pietro\",\"sex\":1,\"language\":\"zh_CN\",\"city\":\"\",\"province\":\"Beijing\",\"country\":\"CN\",\"headimgurl\":\"http://wx.qlogo.cn/mmopen/kox8ma2sryApONj7kInbic4iaCZD8tXL4sqe7k3wROLpb2uCZhOiceAbL69ANeXSMu9zf7hibmt3Y0Ed4A6zIt9ibnPaiciauLZn57c/0\",\"privilege\":[],\"unionid\":\"oq9QRtyW-kb6R_7289hIycrOfnyc\"},\"isNewUser\":false}";

        __CLR4_5_214te14telusyjrpe.R.inc(52900);Root root = JSON.parseObject(text, Root.class);
        __CLR4_5_214te14telusyjrpe.R.inc(52901);assertEquals("oq9QRtyW-kb6R_7289hIycrOfnyc", root.userInfo.unionId);

        __CLR4_5_214te14telusyjrpe.R.inc(52902);JSONObject jsonObject = JSON.parseObject(text);
        __CLR4_5_214te14telusyjrpe.R.inc(52903);WechatUserInfo wechatUserInfo = jsonObject.getObject("userInfo", WechatUserInfo.class);

        __CLR4_5_214te14telusyjrpe.R.inc(52904);assertEquals("oq9QRtyW-kb6R_7289hIycrOfnyc", wechatUserInfo.unionId);
    }finally{__CLR4_5_214te14telusyjrpe.R.flushNeeded();}}

    public static class Root {
        public String ckid;
        public String rcToken;
        public WechatUserInfo userInfo;
        public boolean isNewUser;
    }

    public static class WechatUserInfo implements Serializable {

        public String unionId;
        public String openId;
        public String nickname;
        public int sex;
        public String province;
        public String country;
        public String headimgurl;

    }
}
