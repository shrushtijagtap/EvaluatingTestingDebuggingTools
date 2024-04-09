/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2004 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */
package com.alibaba.json.bvtVO;

import java.io.Serializable;

/**
 * \ufffd\ufffdImage.java\ufffd\ufffd\u02b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u037c\u01ac\ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd
 * 
 * @author maik.wangz 2011-8-15 \ufffd\ufffd\ufffd\ufffd06:19:39
 */
public class Image implements Serializable {public static class __CLR4_5_220ca20calusvnj2h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,93780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -6804500330834961534L;
    private String            imageUrl;

    public Image(String imageUrl){
        super();__CLR4_5_220ca20calusvnj2h.R.inc(93755);try{__CLR4_5_220ca20calusvnj2h.R.inc(93754);
        __CLR4_5_220ca20calusvnj2h.R.inc(93756);this.imageUrl = imageUrl;
    }finally{__CLR4_5_220ca20calusvnj2h.R.flushNeeded();}}

    public Image(){try{__CLR4_5_220ca20calusvnj2h.R.inc(93757);

    }finally{__CLR4_5_220ca20calusvnj2h.R.flushNeeded();}}

    public String getBigImageUrl() {try{__CLR4_5_220ca20calusvnj2h.R.inc(93758);
        __CLR4_5_220ca20calusvnj2h.R.inc(93759);if ((((imageUrl == null || imageUrl.length() == 0)&&(__CLR4_5_220ca20calusvnj2h.R.iget(93760)!=0|true))||(__CLR4_5_220ca20calusvnj2h.R.iget(93761)==0&false))) {{
            __CLR4_5_220ca20calusvnj2h.R.inc(93762);return "";
        }
        }__CLR4_5_220ca20calusvnj2h.R.inc(93763);return ("img/" + imageUrl).replaceFirst(".jpg", ".310x310.jpg");
    }finally{__CLR4_5_220ca20calusvnj2h.R.flushNeeded();}}

    /** \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u037c\u01ac\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd\ufffd\ufffd\u00b7\ufffd\ufffd 150 * 150 */
    public String getSearchImageUrl() {try{__CLR4_5_220ca20calusvnj2h.R.inc(93764);
        __CLR4_5_220ca20calusvnj2h.R.inc(93765);if ((((imageUrl == null || imageUrl.length() == 0)&&(__CLR4_5_220ca20calusvnj2h.R.iget(93766)!=0|true))||(__CLR4_5_220ca20calusvnj2h.R.iget(93767)==0&false))) {{
            __CLR4_5_220ca20calusvnj2h.R.inc(93768);return "";
        }
        }__CLR4_5_220ca20calusvnj2h.R.inc(93769);return ("img/" + imageUrl).replaceFirst(".jpg", ".search.jpg");
    }finally{__CLR4_5_220ca20calusvnj2h.R.flushNeeded();}}

    /** \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u037c\u01ac\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd\ufffd\ufffd\u00b7\ufffd\ufffd 100 * 100 */
    public String getSummImageUrl() {try{__CLR4_5_220ca20calusvnj2h.R.inc(93770);
        __CLR4_5_220ca20calusvnj2h.R.inc(93771);if ((((imageUrl == null || imageUrl.length() == 0)&&(__CLR4_5_220ca20calusvnj2h.R.iget(93772)!=0|true))||(__CLR4_5_220ca20calusvnj2h.R.iget(93773)==0&false))) {{
            __CLR4_5_220ca20calusvnj2h.R.inc(93774);return "";
        }
        }__CLR4_5_220ca20calusvnj2h.R.inc(93775);return ("img/" + imageUrl).replaceFirst(".jpg", ".summ.jpg");
    }finally{__CLR4_5_220ca20calusvnj2h.R.flushNeeded();}}

    public String getImageUrl() {try{__CLR4_5_220ca20calusvnj2h.R.inc(93776);
        __CLR4_5_220ca20calusvnj2h.R.inc(93777);return imageUrl;
    }finally{__CLR4_5_220ca20calusvnj2h.R.flushNeeded();}}

    public void setImageUrl(String imageUrl) {try{__CLR4_5_220ca20calusvnj2h.R.inc(93778);
        __CLR4_5_220ca20calusvnj2h.R.inc(93779);this.imageUrl = imageUrl;
    }finally{__CLR4_5_220ca20calusvnj2h.R.flushNeeded();}}

}
