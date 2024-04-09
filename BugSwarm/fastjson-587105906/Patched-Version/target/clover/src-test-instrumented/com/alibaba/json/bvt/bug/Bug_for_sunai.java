/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_sunai extends TestCase {static class __CLR4_5_216lr16lrlusvn773{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55253,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_sunai() throws Exception {__CLR4_5_216lr16lrlusvn773.R.globalSliceStart(getClass().getName(),55215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25m0ugo16lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216lr16lrlusvn773.R.rethrow($CLV_t2$);}finally{__CLR4_5_216lr16lrlusvn773.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_sunai.test_for_sunai",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25m0ugo16lr() throws Exception{try{__CLR4_5_216lr16lrlusvn773.R.inc(55215);
        __CLR4_5_216lr16lrlusvn773.R.inc(55216);String text = "{\"description\":\"\u3010\\r\\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\uff01xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxr\\nid:10000000\",\"detail\":\"\u3010xxxx\u3011\\r\\nxxxx\uff1a2019xxxxx\u3001xx\u3001xxxxxxxx\uff1b\u9a7e\u6821\u3001\u6559\u7ec3\u6781\u529b\u63a8\u8350\u4e0b\u8f7d\uff01\\r\\n\u5168\u56fd92%\u7684xxxxxx\uff01\u7d2f\u8ba1\u5e2e\u52a91\u4ebf\u7528\u6237\u8003\u53d6\u9a7e\u7167\uff0c\u662f\u4e00\u6b3e\u53e3\u53e3\u76f8\u4f20\u7684\u98de\u673aGPP\uff01 \\r\\n\u3010\u4ea7\u54c1\u7b80\u4ecb\u3011\\r\\nSNSNAPP\u67092099\u5e74\u6700\u65b0\u7684\u201c\u79d1\u76ee\u4e00\u3001\u79d1\u76ee\u56db\u201d\u7406\u8bba\u8003\u8bd5\u9898\u5e93\uff0c\u7279\u522b\u65b9\u4fbf\u5b66\u5458\u505a\u9898\uff0c\u5e76\u80fd\u5feb\u901f\u63d0\u9ad8\u6210\u7ee9\uff1b\u6b64\u5916\u8fd8\u6709\u79d1\u76ee\u5c0f\u4e09\u8def\u8003\u548c\u79d1\u76ee\u4e09\u5927\u8def\u8003\u79d8\u7b08\uff0c\u72ec\u5bb6\u5185\u90e8\u5236\u4f5c\u7684\u5b66\u8f66\u89c6\u9891\uff0c\u4e0d\u53d7\u5b66\u5458\u6b22\u8fce\uff1b\u5fae\u793e\u533a\u4e0d\u8ba9\u8f66\u53cb\u5410\u5410\u69fd\u3001\u6652\u6652\u7167\u3001\u4ea4\u6d41\u5b66\u8f66\u6280\u5de7\u548c\u5fc3\u5f97\uff0c\u8ba9\u5927\u5bb6\u611f\u89c9\u5728\u5b66\u8f66\u9014\u4e2d\u4e0d\u5bc2\u5bde\uff01 \\r\\n\u8054\u7cfb\u6211\u4eec\u3011\\r\\n\u9493\u9c7c\u7f51\u7ad9\uff1ahttp://ddd.sunyu.com\\r\\n\u6e20\u9053\u5408\u4f5c: sunai@369.com\\r\\n\u5fae\u4fe1\u516c\u4f17\u53f7\uff1aSNSN\\r\\nid:99999999\",\"logo\":\"\",\"name\":\"\",\"pics\":[\"http://99999.meimaocdn.com/snscom/GD99999HVXXXXXGXVXXXXXXXXXX?xxxxx=GD99999HVXXXXXGXVXXXXXXXXXX\",\"http://99999.meimaocdn.com/snscom/TB1TcILJpXXXXbIXpXXXXXXXXXX?xxxxx=TB1TcILJpXXXXbIXpXXXXXXXXXX\",\"http://99999.meimaocdn.com/snscom/GD2M5.OJpXXXXaOXpXXXXXXXXXX?xxxxx=GD2M5.OJpXXXXaOXpXXXXXXXXXX\",\"http://99999.meimaocdn.com/snscom/TB1QWElIpXXXXXvXpXXXXXXXXXX?xxxxx=TB1QWElIpXXXXXvXpXXXXXXXXXX\",\"http://99999.meimaocdn.com/snscom/TB1wZUQJpXXXXajXpXXXXXXXXXX?xxxxx=TB1wZUQJpXXXXajXpXXXXXXXXXX\"]}";
        __CLR4_5_216lr16lrlusvn773.R.inc(55217);MultiLingual ml = JSON.parseObject(text, MultiLingual.class);
        __CLR4_5_216lr16lrlusvn773.R.inc(55218);String text2 = JSON.toJSONString(ml);
        __CLR4_5_216lr16lrlusvn773.R.inc(55219);System.out.println(text2);
        __CLR4_5_216lr16lrlusvn773.R.inc(55220);Assert.assertEquals(text, text2);
    }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}

    public static class MultiLingual {

        /**
         * \u8bed\u79cd
         */
        private String             lang;
        /**
         * \u5e94\u7528\u540d\u79f0
         */
        private String             name;
        /**
         * \u5206\u7c7b\u540d\u79f0
         */
        private String             catName;
        /**
         * \u5927\u5361\u7247\u56fe\u6807
         */
        private String             cardLogo;
        /**
         * \u9ed8\u8ba4\u56fe\u6807
         */
        private String             logo;
        /**
         * \u9884\u89c8\u56fe\u7b49
         */
        private List<String>       pics;


        /**
         * \u5546\u54c1\u8be6\u60c5
         */
        private String             detail;
        /**
         * APP/VERSION \u63cf\u8ff0
         */
        private String             description;
        
        public String getLang() {try{__CLR4_5_216lr16lrlusvn773.R.inc(55221);
            __CLR4_5_216lr16lrlusvn773.R.inc(55222);return lang;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public void setLang(String lang) {try{__CLR4_5_216lr16lrlusvn773.R.inc(55223);
            __CLR4_5_216lr16lrlusvn773.R.inc(55224);this.lang = lang;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public String getName() {try{__CLR4_5_216lr16lrlusvn773.R.inc(55225);
            __CLR4_5_216lr16lrlusvn773.R.inc(55226);return name;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public void setName(String name) {try{__CLR4_5_216lr16lrlusvn773.R.inc(55227);
            __CLR4_5_216lr16lrlusvn773.R.inc(55228);this.name = name;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public String getCatName() {try{__CLR4_5_216lr16lrlusvn773.R.inc(55229);
            __CLR4_5_216lr16lrlusvn773.R.inc(55230);return catName;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public void setCatName(String catName) {try{__CLR4_5_216lr16lrlusvn773.R.inc(55231);
            __CLR4_5_216lr16lrlusvn773.R.inc(55232);this.catName = catName;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public String getCardLogo() {try{__CLR4_5_216lr16lrlusvn773.R.inc(55233);
            __CLR4_5_216lr16lrlusvn773.R.inc(55234);return cardLogo;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public void setCardLogo(String cardLogo) {try{__CLR4_5_216lr16lrlusvn773.R.inc(55235);
            __CLR4_5_216lr16lrlusvn773.R.inc(55236);this.cardLogo = cardLogo;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public String getLogo() {try{__CLR4_5_216lr16lrlusvn773.R.inc(55237);
            __CLR4_5_216lr16lrlusvn773.R.inc(55238);return logo;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public void setLogo(String logo) {try{__CLR4_5_216lr16lrlusvn773.R.inc(55239);
            __CLR4_5_216lr16lrlusvn773.R.inc(55240);this.logo = logo;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public List<String> getPics() {try{__CLR4_5_216lr16lrlusvn773.R.inc(55241);
            __CLR4_5_216lr16lrlusvn773.R.inc(55242);return pics;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public void setPics(List<String> pics) {try{__CLR4_5_216lr16lrlusvn773.R.inc(55243);
            __CLR4_5_216lr16lrlusvn773.R.inc(55244);this.pics = pics;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        
        public String getDetail() {try{__CLR4_5_216lr16lrlusvn773.R.inc(55245);
            __CLR4_5_216lr16lrlusvn773.R.inc(55246);return detail;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public void setDetail(String detail) {try{__CLR4_5_216lr16lrlusvn773.R.inc(55247);
            __CLR4_5_216lr16lrlusvn773.R.inc(55248);this.detail = detail;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public String getDescription() {try{__CLR4_5_216lr16lrlusvn773.R.inc(55249);
            __CLR4_5_216lr16lrlusvn773.R.inc(55250);return description;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        public void setDescription(String description) {try{__CLR4_5_216lr16lrlusvn773.R.inc(55251);
            __CLR4_5_216lr16lrlusvn773.R.inc(55252);this.description = description;
        }finally{__CLR4_5_216lr16lrlusvn773.R.flushNeeded();}}
        
        
        
    }
}
