/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvtVO;

import java.io.Serializable;


public class AccessHttpConfigModel {public static class __CLR4_1_10202d202dluszwgs9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,93441,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * \u4e0a\u4f20\u6587\u4ef6\u7684\u914d\u7f6e.
     *
     * @author wangwb (mailto:wangwb@primeton.com)
     */
    
    public static class FileUploadConfig implements Serializable{
        private String tempDir;

        private int maxSize;

        private int inMemorySize;

        private String exclude;

        /**
         * \u83b7\u53d6\u4e0d\u5141\u8bb8\u4e0a\u4f20\u7684\u6587\u4ef6\u7c7b\u578b.<br>
         * \u591a\u4e2a\u6587\u4ef6\u7c7b\u578b\u4e4b\u95f4\u7528','\u5206\u5272.
         * @return \u83b7\u53d6\u4e0d\u5141\u8bb8\u4e0a\u4f20\u7684\u6587\u4ef6\u7c7b\u578b.
         */
        public String getExclude() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93397);
            __CLR4_1_10202d202dluszwgs9.R.inc(93398);return exclude;
        }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

        /**
         * \u8bbe\u7f6e\u4e0d\u5141\u8bb8\u4e0a\u4f20\u7684\u6587\u4ef6\u7c7b\u578b.<br>
         * \u591a\u4e2a\u6587\u4ef6\u7c7b\u578b\u4e4b\u95f4\u7528','\u5206\u5272.
         *
         * @param exclude\u3000\u4e0d\u5141\u8bb8\u4e0a\u4f20\u7684\u6587\u4ef6\u7c7b\u578b.
         */
        public void setExclude(String exclude) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93399);
            __CLR4_1_10202d202dluszwgs9.R.inc(93400);this.exclude = exclude;
        }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

        /**
         * \u83b7\u53d6\u4e0a\u4f20\u6587\u4ef6\u65f6\u5728\u5185\u5b58\u4e2d\u6700\u5927\u7684\u5b57\u8282\u6570.
         *
         * @return \u4e0a\u4f20\u6587\u4ef6\u65f6\u5728\u5185\u5b58\u4e2d\u6700\u5927\u7684\u5b57\u8282\u6570.
         */
        public int getInMemorySize() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93401);
            __CLR4_1_10202d202dluszwgs9.R.inc(93402);return inMemorySize;
        }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

        /**
         * \u8bbe\u7f6e\u4e0a\u4f20\u6587\u4ef6\u65f6\u5728\u5185\u5b58\u4e2d\u6700\u5927\u7684\u5b57\u8282\u6570.
         *
         * @param inMemorySize
         *            \u4e0a\u4f20\u6587\u4ef6\u65f6\u5728\u5185\u5b58\u4e2d\u6700\u5927\u7684\u5b57\u8282\u6570.
         */
        public void setInMemorySize(int inMemorySize) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93403);
            __CLR4_1_10202d202dluszwgs9.R.inc(93404);this.inMemorySize = inMemorySize;
        }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

        /**
         * \u83b7\u53d6\u4e0a\u4f20\u6587\u4ef6\u7684\u6700\u5927\u5b57\u8282\u6570.
         *
         * @return \u4e0a\u4f20\u6587\u4ef6\u7684\u6700\u5927\u5b57\u8282\u6570.
         */
        public int getMaxSize() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93405);
            __CLR4_1_10202d202dluszwgs9.R.inc(93406);return maxSize;
        }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

        /**
         * \u8bbe\u7f6e\u4e0a\u4f20\u6587\u4ef6\u7684\u6700\u5927\u5b57\u8282\u6570.
         *
         * @param maxSize
         *            \u4e0a\u4f20\u6587\u4ef6\u7684\u6700\u5927\u5b57\u8282\u6570.
         */
        public void setMaxSize(int maxSize) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93407);
            __CLR4_1_10202d202dluszwgs9.R.inc(93408);this.maxSize = maxSize;
        }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

        /**
         * \u83b7\u53d6\u4e0a\u4f20\u6587\u4ef6\u7684\u4fdd\u5b58\u7684\u4e34\u65f6\u76ee\u5f55.
         *
         * @return \u4e0a\u4f20\u6587\u4ef6\u7684\u4fdd\u5b58\u7684\u4e34\u65f6\u76ee\u5f55.
         */
        public String getTempDir() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93409);
            __CLR4_1_10202d202dluszwgs9.R.inc(93410);return tempDir;
        }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

        /**
         * \u8bbe\u7f6e\u4e0a\u4f20\u6587\u4ef6\u7684\u4fdd\u5b58\u7684\u4e34\u65f6\u76ee\u5f55.
         *
         * @param tempDir
         *            \u4e0a\u4f20\u6587\u4ef6\u7684\u4fdd\u5b58\u7684\u4e34\u65f6\u76ee\u5f55.
         */
        public void setTempDir(String tempDir) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93411);
            __CLR4_1_10202d202dluszwgs9.R.inc(93412);this.tempDir = tempDir;
        }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}
    }

    private String encoding;

    private FileUploadConfig fileUploadConfig;

    /**
     * \u83b7\u53d6HttpServletRequest\u8bf7\u6c42\u7684\u5b57\u7b26\u96c6\u8bbe\u7f6e
     *
     * @return HttpServletRequest\u8bf7\u6c42\u7684\u5b57\u7b26\u96c6\u8bbe\u7f6e
     */
    public String getEncoding() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93413);
        __CLR4_1_10202d202dluszwgs9.R.inc(93414);return encoding;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    /**
     * \u8bbe\u7f6eHttpServletRequest\u8bf7\u6c42\u7684\u5b57\u7b26\u96c6\u8bbe\u7f6e
     *
     * @param encoding HttpServletRequest\u8bf7\u6c42\u7684\u5b57\u7b26\u96c6\u8bbe\u7f6e
     */
    public void setEncoding(String encoding) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93415);
        __CLR4_1_10202d202dluszwgs9.R.inc(93416);this.encoding = encoding;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    /**
     * \u83b7\u53d6\u4e0a\u4f20\u6587\u4ef6\u7684\u914d\u7f6e.
     * @return \u4e0a\u4f20\u6587\u4ef6\u7684\u914d\u7f6e.
     */
    public FileUploadConfig getFileUploadConfig() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93417);
        __CLR4_1_10202d202dluszwgs9.R.inc(93418);return fileUploadConfig;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    /**
     * \u8bbe\u7f6e\u4e0a\u4f20\u6587\u4ef6\u7684\u914d\u7f6e.
     * @param fileUploadConfig \u4e0a\u4f20\u6587\u4ef6\u7684\u914d\u7f6e.
     */
    public void setFileUploadConfig(FileUploadConfig fileUploadConfig) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93419);
        __CLR4_1_10202d202dluszwgs9.R.inc(93420);this.fileUploadConfig = fileUploadConfig;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}
    
    private int suspend=10;

    /**
     * \u83b7\u53d6\u8bf7\u6c42\u7684\u6302\u8d77\u7684\u7b49\u5f85\u65f6\u95f4.<br>
     * @return \u83b7\u53d6\u8bf7\u6c42\u7684\u6302\u8d77\u7684\u7b49\u5f85\u65f6\u95f4.
     */
    public int getSuspend() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93421);
        __CLR4_1_10202d202dluszwgs9.R.inc(93422);return suspend;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    /**
     * \u8bbe\u7f6e\u8bf7\u6c42\u6302\u8d77\u7684\u7b49\u5f85\u65f6\u95f4.<br>
     * @param suspend \u8bf7\u6c42\u6302\u8d77\u7684\u7b49\u5f85\u65f6\u95f4.
     */
    public void setSuspend(int suspend) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93423);
        __CLR4_1_10202d202dluszwgs9.R.inc(93424);this.suspend = suspend;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}
    
    private String loginExcludeUrls;
    
    private String loginErrorPage;
    
    private boolean portal;

    private String loginIncludeUrls;

    public String getLoginErrorPage() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93425);
        __CLR4_1_10202d202dluszwgs9.R.inc(93426);return loginErrorPage;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    public void setLoginErrorPage(String loginErrorPage) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93427);
        __CLR4_1_10202d202dluszwgs9.R.inc(93428);this.loginErrorPage = loginErrorPage;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    public String getLoginExcludeUrls() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93429);
        __CLR4_1_10202d202dluszwgs9.R.inc(93430);return loginExcludeUrls;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    public void setLoginExcludeUrls(String loginExcludeUrls) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93431);
        __CLR4_1_10202d202dluszwgs9.R.inc(93432);this.loginExcludeUrls = loginExcludeUrls;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    public boolean isPortal() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93433);
        __CLR4_1_10202d202dluszwgs9.R.inc(93434);return portal;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    public void setPortal(boolean portal) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93435);
        __CLR4_1_10202d202dluszwgs9.R.inc(93436);this.portal = portal;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    public String getLoginIncludeUrls() {try{__CLR4_1_10202d202dluszwgs9.R.inc(93437);
        __CLR4_1_10202d202dluszwgs9.R.inc(93438);return loginIncludeUrls;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

    public void setLoginIncludeUrls(String loginIncludeUrls) {try{__CLR4_1_10202d202dluszwgs9.R.inc(93439);
        __CLR4_1_10202d202dluszwgs9.R.inc(93440);this.loginIncludeUrls = loginIncludeUrls;
    }finally{__CLR4_1_10202d202dluszwgs9.R.flushNeeded();}}

}
