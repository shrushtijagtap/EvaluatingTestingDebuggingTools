/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by haihong.xiahh on 13-12-23.
 */
public class PushMsg implements Serializable {public static class __CLR4_5_220jm20jmlusvnj72{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,94238,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String DIR_PUSH = "push";

    /**
     * 
     */
    private static final long serialVersionUID = 8145512296629061628L;

    public static final String TAG = PushMsg.class.getSimpleName();

    public static final String TYPE_SYS = "sys";

    public static final String TYPE_WL = "wl";

    public static final long STATUS_TRANK_NO_NEW = 128;

    /**
     * id of PushMsg
     */
    private String id;
    /**
     * type
     */
    private String tp;
    /**
     * start time with unit second(s)
     */
    private long st;
    /**
     * end time with unit second(s)
     */
    private long et;
    /**
     * delay range \u4ee510\u79d2\u4e3a\u5355\u4f4d\uff0c\u5ba2\u6237\u7aef\u4f1a\u5728[0 ~ dr*10seconds]\u7684\u8303\u56f4\u5185\uff0c\u8fdb\u884c\u968f\u673a\u5ef6\u65f6\u8bf7\u6c42msg\uff0c\u9632\u6b62\u670d\u52a1\u5668\u8fc7\u8f7d\u3002
     */
    private long dr;

    private Msg msg;

    public String getId() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94018);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94019);return id;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public void setId(String id) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94020);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94021);this.id = id;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public String getTp() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94022);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94023);return tp;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public void setTp(String tp) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94024);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94025);this.tp = tp;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public long getSt() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94026);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94027);return st;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public void setSt(long st) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94028);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94029);this.st = st;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public long getEt() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94030);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94031);return et;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public void setEt(long et) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94032);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94033);this.et = et;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public Msg getMsg() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94034);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94035);return msg;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public void setMsg(Msg msg) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94036);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94037);this.msg = msg;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    /**
     * \u6761\u4ef6\uff1a <br/>
     * 1\u3001\u6ca1\u8fc7\u671f(et>=\u5f53\u524d\u65f6\u95f4\uff0cst\u53ef\u4ee5\u5927\u4e8e\u4e5f\u53ef\u4ee5\u5c0f\u4e8e\u5f53\u524d\u65f6\u95f4)<br/>
     * 2\u3001\u6d88\u606f\u4f53\u6709\u6548<br/>
     * 
     * @return true if valid.
     */
    public boolean isValid() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94038);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94039);long now = new Date().getTime() / 1000;
 
        __CLR4_5_220jm20jmlusvnj72.R.inc(94040);if ((((now > et)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94041)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94042)==0&false))) {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94043);return false;
        }// end if

        }__CLR4_5_220jm20jmlusvnj72.R.inc(94044);if ((((msg == null)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94045)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94046)==0&false))) {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94047);return false;
        }// end if

        }__CLR4_5_220jm20jmlusvnj72.R.inc(94048);if ((((!msg.isValid())&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94049)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94050)==0&false))) {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94051);return false;
        }// end if

        }__CLR4_5_220jm20jmlusvnj72.R.inc(94052);return true;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    /**
     * \u6761\u4ef6 1. isValid 2. st <= now <= et
     * */
    public boolean isActiveNow() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94053);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94054);if ((((!isValid())&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94055)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94056)==0&false))) {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94057);return false;
        }
        }__CLR4_5_220jm20jmlusvnj72.R.inc(94058);long now = new Date().getTime() / 1000;

        __CLR4_5_220jm20jmlusvnj72.R.inc(94059);if ((((now < st)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94060)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94061)==0&false))) {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94062);return false;
        }// end if

        }__CLR4_5_220jm20jmlusvnj72.R.inc(94063);if ((((now > et)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94064)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94065)==0&false))) {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94066);return false;
        }// end if

        }__CLR4_5_220jm20jmlusvnj72.R.inc(94067);if ((((!isImagesReady())&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94068)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94069)==0&false))) {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94070);return false;
        }// end if

        }__CLR4_5_220jm20jmlusvnj72.R.inc(94071);return true;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    /**
     * \u6d88\u606f\u7684URL\u662f\u5426\u5b58\u5728
     * 
     * @return true if exist.
     */
    public boolean hasUrl() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94072);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94073);boolean result = true;
        __CLR4_5_220jm20jmlusvnj72.R.inc(94074);if ((((null != msg)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94075)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94076)==0&false))) {{
        } }else {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94077);result = false;
        }


        }__CLR4_5_220jm20jmlusvnj72.R.inc(94078);return result;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public boolean hasText() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94079);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94080);boolean result = true;
        __CLR4_5_220jm20jmlusvnj72.R.inc(94081);if ((((null != msg)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94082)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94083)==0&false))) {{
        } }else {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94084);result = false;
        }


        }__CLR4_5_220jm20jmlusvnj72.R.inc(94085);return result;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    /**
     * \u901a\u77e5\u6240\u9700\u7684\u56fe\u7247\u8d44\u6e90\u662f\u5426\u5c31\u7eea
     * 
     * @return true if ready, otherwise return false.
     */
    private boolean isImagesReady() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94086);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94087);List<String> list = getNewImageUrlList();
        __CLR4_5_220jm20jmlusvnj72.R.inc(94088);boolean ret = null == list || 0 == list.size();
        __CLR4_5_220jm20jmlusvnj72.R.inc(94089);if ((((!ret)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94090)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94091)==0&false))) {{
            __CLR4_5_220jm20jmlusvnj72.R.inc(94092);preparedImages(list);
        }
        }__CLR4_5_220jm20jmlusvnj72.R.inc(94093);return ret;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    /**
     * \u4e3b\u52a8\u4e0b\u8f7d\u672a\u7f13\u5b58\u5230\u5ba2\u6237\u7aef\u7684\u8d44\u6e90\u56fe\u7247
     */
    public void preparedImages() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94094);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94095);List<String> list = getNewImageUrlList();
        __CLR4_5_220jm20jmlusvnj72.R.inc(94096);preparedImages(list);
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public void preparedImages(List<String> list) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94097);
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    /**
     * \u83b7\u53d6\u9700\u8981\u4e0b\u8f7d\u56fe\u7247\u7684URL\u5217\u8868
     * 
     * @return list of image URL which image's URL is not cached, otherwise
     *         return null.
     */
    private List<String> getNewImageUrlList() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94098);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94099);return null;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public static class Msg implements Serializable {
        /**
         * 
         */
        private static final long serialVersionUID = -2020714577526457332L;

        private String gid;
        private String gtp;
        /**
         * \u6307\u663e\u793a\u5728\u901a\u77e5\u5de6\u4fa7\u7684\u5916\u90e8\u56fe\u6807URL
         */
        private String ico;
        private String url;
        private String txt;

        private String flgs;
        private String stxt;
        private String surl;
        /**
         * \u6307\u5728\u5206\u4eab\u9875\u9644\u52a0\u7684\u5916\u90e8\u56fe\u7247URL
         */
        private String simg;

        private ControlFlags controlFlags;

        public Msg() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94100);
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getGid() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94101);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94102);return gid;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setGid(String gid) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94103);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94104);this.gid = gid;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getGtp() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94105);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94106);return gtp;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setGtp(String gtp) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94107);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94108);this.gtp = gtp;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getIco() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94109);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94110);return ico;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setIco(String icon) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94111);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94112);this.ico = icon;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getUrl() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94113);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94114);return url;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setUrl(String url) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94115);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94116);if ((((null != url)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94117)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94118)==0&false))) {{
                __CLR4_5_220jm20jmlusvnj72.R.inc(94119);url = url.trim();
            }
            }__CLR4_5_220jm20jmlusvnj72.R.inc(94120);this.url = url;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getTxt() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94121);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94122);return txt;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setTxt(String txt) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94123);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94124);this.txt = txt;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getFlgs() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94125);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94126);return flgs;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setFlgs(String flgs) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94127);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94128);this.flgs = flgs;
            __CLR4_5_220jm20jmlusvnj72.R.inc(94129);controlFlags = new ControlFlags(flgs);
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getStxt() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94130);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94131);return stxt;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setStxt(String stxt) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94132);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94133);this.stxt = stxt;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getSurl() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94134);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94135);return surl;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setSurl(String surl) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94136);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94137);this.surl = surl;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public String getSimg() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94138);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94139);return simg;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public void setSimg(String simg) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94140);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94141);this.simg = simg;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        public ControlFlags getControlFlags() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94142);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94143);return controlFlags;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        /**
         * <p>
         * \u6761\u4ef6
         * </p>
         * 0.gid \u4e0d\u4e3anull 1.controlFlag \u5fc5\u987b\u6709\u6548\uff08\u5373\u975e\u7a7a\uff0c\u5219\u63a7\u5236\u4f4d\u6570\u76ee\u8db3\u591f\uff09<br/>
         * 2.\u5f53\u5f00\u542f\u5206\u4eab\u529f\u80fd\u65f6\uff0cstxt/surl/simg \u81f3\u5c11\u6709\u4e00\u4e2a\u6709\u6548\uff08\u975e\u7a7a\uff09<br/>
         * 
         * @return true if valid.
         */
        public boolean isValid() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94144);

            __CLR4_5_220jm20jmlusvnj72.R.inc(94145);return true;
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        /**
         * \u6253\u5370debug\u4fe1\u606f
         * 
         * @return
         */
        public String debug() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94146);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94147);StringBuilder sb = new StringBuilder();
            __CLR4_5_220jm20jmlusvnj72.R.inc(94148);sb.append("\n#gid=" + gid);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94149);sb.append("\n#gtp=" + gtp);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94150);sb.append("\n#ico=" + ico);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94151);sb.append("\n#url=" + url);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94152);sb.append("\n#txt=" + txt);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94153);sb.append("\n#flags=" + flgs);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94154);sb.append("\n#stxt=" + stxt);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94155);sb.append("\n#surl=" + surl);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94156);sb.append("\n#simg=" + simg);
            __CLR4_5_220jm20jmlusvnj72.R.inc(94157);if ((((null != controlFlags)&&(__CLR4_5_220jm20jmlusvnj72.R.iget(94158)!=0|true))||(__CLR4_5_220jm20jmlusvnj72.R.iget(94159)==0&false))) {{
                __CLR4_5_220jm20jmlusvnj72.R.inc(94160);sb.append(controlFlags.debug());
            }// end if
            }__CLR4_5_220jm20jmlusvnj72.R.inc(94161);return sb.toString();
        }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

        /**
         * \u6807\u5fd7\u63a7\u5236
         * 
         * @author wangyue.wy
         */
        public static class ControlFlags implements Serializable {

            /**
             * 
             */
            private static final long serialVersionUID = 6289110973325625431L;

            private enum INDEX_TYPE {
                INDEX_POS, INDEX_OPEN_URL, INDEX_DIMISS, INDEX_CANCEL_BTN, INDEX_TEXT_EFFECTS, INDEX_SHARE, INDEX_ATTACH_IMAGE, INDEX_LIMIT_SHOW_MAX_ONCE
            }

            private final int COUNT = INDEX_TYPE.values().length;

            public static final int CTR_UNKNOWN = 0;
            private String text;

            /**
             * <p>
             * \u5c55\u793a\u4f4d\u7f6e\uff08\u6682\u65f6\u53ea\u6709\u9876\u90e8\uff0c\u5c45\u4e2d\uff09
             * </p>
             * <p>
             * A:\u9876\u90e8(default)<br/>
             * B\uff1a\u5c45\u4e2d <br/>
             * </p>
             */
            private char ctrlPos;
            /**
             * <p>
             * URL\u6253\u5f00\u65b9\u5f0f
             * </p>
             * <p>
             * A:\u5185\u5d4c\u6253\u5f00(default)<br/>
             * B\uff1a\u5916\u90e8\u6d4f\u89c8\u5668\u6253\u5f00 <br/>
             * </p>
             */
            private char ctrlOpenUrl;
            /**
             * <p>
             * \u6d88\u5931\u65b9\u5f0f
             * </p>
             * <p>
             * A:\u4e0d\u6d88\u5931\uff08\u76f4\u81f3\u8fc7\u671f\u5931\u6548\uff09(default)<br/>
             * B:\u70b9\u51fb\u6d88\u5931<br/>
             * C:\u89e3\u9501\u6d88\u5931 <br/>
             * D:\u6d4f\u89c8\u6d88\u5931<br/>
             * E:\u89e3\u9501+\u70b9\u51fb\u6d88\u5931 <br/>
             * F:\u89e3\u9501+\u6d4f\u89c8\u6d88\u5931 <br/>
             * G:\u89e3\u9501+\u70b9\u51fb+\u6d4f\u89c8\u6d88\u5931 <br/>
             * </p>
             */
            private char ctrlDimiss;
            /**
             * <p>
             * \u5220\u9664\u6309\u94ae
             * </p>
             * <p>
             * A:\u663e\u793a(default)<br/>
             * B:\u4e0d\u663e\u793a <br/>
             * </p>
             */
            private char ctrlCancelBtn;
            /**
             * <p>
             * \u662f\u5426\u652f\u6301\u5206\u4eab
             * </p>
             * <p>
             * A:\u5f00\u542f(default)<br/>
             * B:\u5173\u95ed<br/>
             * </p>
             */
            private char ctrlShare;
            /**
             * <p>
             * \u9644\u52a0\u56fe\u7247\u6765\u6e90
             * </p>
             * <p>
             * A:\u65e0\u56fe\u7247(default)<br/>
             * B:\u4f7f\u7528\u5c4f\u5e55\u622a\u56fe<br/>
             * C:\u4f7f\u7528\u670d\u52a1\u5668\u6307\u5b9a\u7684URL\u7f51\u7edc\u56fe\u7247
             * </p>
             */
            private char ctrlAttachImage;
            /**
             * <p>
             * \u6587\u6848\u5c55\u793a\u6548\u679c
             * </p>
             * <p>
             * A:\u9759\u6b62\u663e\u793a(default)<br/>
             * B:\u6eda\u52a8 <br/>
             * </p>
             */
            private char ctrlTextEffects;

            /**
             * <p>
             * <b>\u540c\u4e00gid\u901a\u77e5</b>\uff0c\u9650\u5236\u6700\u591a\u5c55\u793a\u4e00\u6b21
             * </p>
             * <p>
             * A:\u5426(default)
             * </p>
             * <p>
             * B:\u662f
             * </p>
             */
            private char ctrlLimitShowMaxOnce;

            public ControlFlags(String param) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94162);

                __CLR4_5_220jm20jmlusvnj72.R.inc(94163);this.text = param;
                __CLR4_5_220jm20jmlusvnj72.R.inc(94164);ctrlPos = text.charAt(INDEX_TYPE.INDEX_POS.ordinal());
                __CLR4_5_220jm20jmlusvnj72.R.inc(94165);ctrlOpenUrl = text.charAt(INDEX_TYPE.INDEX_OPEN_URL.ordinal());
                __CLR4_5_220jm20jmlusvnj72.R.inc(94166);ctrlDimiss = text.charAt(INDEX_TYPE.INDEX_DIMISS.ordinal());
                __CLR4_5_220jm20jmlusvnj72.R.inc(94167);ctrlCancelBtn = text.charAt(INDEX_TYPE.INDEX_CANCEL_BTN.ordinal());
                __CLR4_5_220jm20jmlusvnj72.R.inc(94168);ctrlShare = text.charAt(INDEX_TYPE.INDEX_SHARE.ordinal());
                __CLR4_5_220jm20jmlusvnj72.R.inc(94169);ctrlAttachImage = text.charAt(INDEX_TYPE.INDEX_ATTACH_IMAGE.ordinal());
                __CLR4_5_220jm20jmlusvnj72.R.inc(94170);ctrlTextEffects = text.charAt(INDEX_TYPE.INDEX_TEXT_EFFECTS.ordinal());
                __CLR4_5_220jm20jmlusvnj72.R.inc(94171);ctrlLimitShowMaxOnce = text.charAt(INDEX_TYPE.INDEX_LIMIT_SHOW_MAX_ONCE.ordinal());
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /* control of position */
            public boolean posTop() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94172);
                // default
                __CLR4_5_220jm20jmlusvnj72.R.inc(94173);return 'A' == ctrlPos || ctrlPos > 'B' || ctrlPos < 'A';
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean posCenter() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94174);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94175);return 'B' == ctrlPos;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /* control of open URL mode */
            public boolean openUrlByInner() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94176);
                // default
                __CLR4_5_220jm20jmlusvnj72.R.inc(94177);return 'A' == ctrlOpenUrl || ctrlOpenUrl > 'B' || ctrlPos < 'A';
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean openUrlByOutside() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94178);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94179);return 'B' == ctrlOpenUrl;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /* control of dismiss */
            public boolean nerverDismiss() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94180);
                // default
                __CLR4_5_220jm20jmlusvnj72.R.inc(94181);return 'A' == ctrlDimiss || ctrlDimiss > 'G' || ctrlPos < 'A';
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean dismissByUnlock() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94182);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94183);return 'C' == ctrlDimiss || 'D' == ctrlDimiss;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean dismissByClick() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94184);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94185);return 'B' == ctrlDimiss || 'D' == ctrlDimiss;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /* control of show cancel btn */
            public boolean showCancelBtn() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94186);
                // default
                __CLR4_5_220jm20jmlusvnj72.R.inc(94187);return 'A' == ctrlCancelBtn || ctrlCancelBtn > 'B' || ctrlPos < 'A';
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /**
             * \u662f\u5426\u9996\u9875 \u6216 Web\u9875\uff0c\u5f00\u542f\u5206\u4eab\u6309\u94ae
             * 
             * @return true if Not 'B'(B:\u9996\u9875 \u548c Web\u9875\u5747\u5173\u95ed\u5206\u4eab\u6309\u94ae\u663e\u793a)
             */
            public boolean enableShare() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94188);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94189);return 'B' != ctrlShare;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /* control of share */
            /**
             * \u9996\u9875\u662f\u5426\u652f\u6301\u901a\u77e5\u663e\u793a\u5206\u4eab\u6309\u94ae
             * 
             * @return true if equal 'A', 'C' or [*,A] || [D,*]
             */
            public boolean enableShareInHomePage() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94190);
                // default
                __CLR4_5_220jm20jmlusvnj72.R.inc(94191);return 'A' == ctrlShare || 'C' == ctrlShare || ctrlShare > 'D' || ctrlPos < 'A';
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /**
             * Web\u9875\u662f\u5426\u652f\u6301\u901a\u77e5\u663e\u793a\u5206\u4eab\u6309\u94ae
             * 
             * @return true if equal 'A' Or 'D'
             */
            public boolean enableShareInWebPage() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94192);
                // default
                __CLR4_5_220jm20jmlusvnj72.R.inc(94193);return 'A' == ctrlShare || 'D' == ctrlShare || ctrlShare > 'D' || ctrlPos < 'A';
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /* control of use screen shot image */
            public boolean attachNoImage() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94194);
                // default
                __CLR4_5_220jm20jmlusvnj72.R.inc(94195);return 'A' == ctrlAttachImage || ctrlAttachImage > 'C' || ctrlPos < 'A';
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean attachScreenShot() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94196);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94197);return 'B' == ctrlAttachImage;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean attachWebUrlImage() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94198);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94199);return 'C' == ctrlAttachImage;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /* control of text effects */
            public boolean isStaicTextEffects() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94200);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94201);return 'A' == ctrlTextEffects || ctrlTextEffects > 'C' || ctrlPos < 'A';
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean isScrollTextEffects() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94202);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94203);return 'B' == ctrlTextEffects;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean isBlingTextEffects() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94204);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94205);return 'C' == ctrlTextEffects;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            public boolean isLimitShowMaxOnce() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94206);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94207);return 'B' == ctrlLimitShowMaxOnce;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /**
             * 
             * \u63a7\u5236\u5b57\u4e0d\u80fd\u4e3a\u7a7a<br/>
             * \u63a7\u5236\u5b57\u957f\u5ea6\u4e0d\u5c11\u4e8e\u6240\u9700\u957f\u5ea6
             * 
             * @return true if valid, otherwise return false.
             */
            public boolean isValid() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94208);

                __CLR4_5_220jm20jmlusvnj72.R.inc(94209);return true;
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

            /**
             * \u6253\u5370\u8c03\u8bd5\u4fe1\u606f
             * 
             * @return
             */
            public String debug() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94210);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94211);StringBuilder sb = new StringBuilder();
                __CLR4_5_220jm20jmlusvnj72.R.inc(94212);sb.append("\n>>>>>>>>>>>");
                __CLR4_5_220jm20jmlusvnj72.R.inc(94213);sb.append("\nflag:" + text);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94214);sb.append("\n(" + INDEX_TYPE.INDEX_POS.ordinal() + ")ctrlPos=" + ctrlPos);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94215);sb.append("\n(" + INDEX_TYPE.INDEX_OPEN_URL.ordinal() + ")ctrlOpenUrl=" + ctrlOpenUrl);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94216);sb.append("\n(" + INDEX_TYPE.INDEX_DIMISS.ordinal() + ")ctrlDismiss=" + ctrlDimiss);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94217);sb.append("\n(" + INDEX_TYPE.INDEX_CANCEL_BTN.ordinal() + ")ctrlCancelBtn=" + ctrlCancelBtn);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94218);sb.append("\n(" + INDEX_TYPE.INDEX_TEXT_EFFECTS.ordinal() + ")ctrlTextEffects=" + ctrlTextEffects);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94219);sb.append("\n(" + INDEX_TYPE.INDEX_SHARE.ordinal() + ")ctrlShare=" + ctrlShare);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94220);sb.append("\n(" + INDEX_TYPE.INDEX_ATTACH_IMAGE.ordinal() + ")ctrlAttachImage=" + ctrlAttachImage);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94221);sb.append("\n(" + INDEX_TYPE.INDEX_LIMIT_SHOW_MAX_ONCE.ordinal() + ")ctrlLimitShowMaxOnce="
                        + ctrlLimitShowMaxOnce);
                __CLR4_5_220jm20jmlusvnj72.R.inc(94222);sb.append("\n>>>>>>>>>>>");
                __CLR4_5_220jm20jmlusvnj72.R.inc(94223);return sb.toString();
            }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}
        }
    }

    /**
     * \u6253\u5370debug\u4fe1\u606f
     * 
     * @return
     */
    public String debug() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94224);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94225);StringBuilder sb = new StringBuilder();
        __CLR4_5_220jm20jmlusvnj72.R.inc(94226);sb.append("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        __CLR4_5_220jm20jmlusvnj72.R.inc(94227);sb.append("\nid=" + id);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94228);sb.append("\nst=" + st);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94229);sb.append("\net=" + et);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94230);sb.append("\ndr=" + dr);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94231);sb.append("\nmsg=\n" + msg.debug());
        __CLR4_5_220jm20jmlusvnj72.R.inc(94232);sb.append("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        __CLR4_5_220jm20jmlusvnj72.R.inc(94233);return sb.toString();
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public long getDr() {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94234);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94235);return dr;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}

    public void setDr(long dr) {try{__CLR4_5_220jm20jmlusvnj72.R.inc(94236);
        __CLR4_5_220jm20jmlusvnj72.R.inc(94237);this.dr = dr;
    }finally{__CLR4_5_220jm20jmlusvnj72.R.flushNeeded();}}
}
