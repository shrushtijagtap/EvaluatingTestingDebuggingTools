/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO;

/**
 * Created by wenshao on 10/02/2017.
 */
public enum AuditStatusType implements IntEnum<AuditStatusType> {
    AUDIT_FAILURE(0, "\u5ba1\u6838\u5931\u8d25", "FAILED"),
    AUDIT_SUCCESS(1, "\u6210\u529f", "SUCCEED"),
    AUDIT_NO_SUBMIT(2, "\u672a\u5b9e\u540d\u8ba4\u8bc1", "NONAUDIT"),
    AUDIT_SUBMIT(3, "\u5ba1\u6838\u4e2d", "AUDITING");

    private int code;
    private String desc;
    private String enCode;

    private AuditStatusType(int code) {try{__CLR4_5_2203p203plusvnit9.R.inc(93445);
        __CLR4_5_2203p203plusvnit9.R.inc(93446);this.code = code;
    }finally{__CLR4_5_2203p203plusvnit9.R.flushNeeded();}}

    private AuditStatusType(int code, String desc, String enCode) {try{__CLR4_5_2203p203plusvnit9.R.inc(93447);
        __CLR4_5_2203p203plusvnit9.R.inc(93448);this.code = code;
        __CLR4_5_2203p203plusvnit9.R.inc(93449);this.desc = desc;
        __CLR4_5_2203p203plusvnit9.R.inc(93450);this.enCode = enCode;
    }finally{__CLR4_5_2203p203plusvnit9.R.flushNeeded();}}

    public static AuditStatusType valuesOf(String enCode) {try{__CLR4_5_2203p203plusvnit9.R.inc(93451);
        __CLR4_5_2203p203plusvnit9.R.inc(93452);AuditStatusType[] arr$ = values();
        __CLR4_5_2203p203plusvnit9.R.inc(93453);int len$ = arr$.length;

        __CLR4_5_2203p203plusvnit9.R.inc(93454);for(int i$ = 0; (((i$ < len$)&&(__CLR4_5_2203p203plusvnit9.R.iget(93455)!=0|true))||(__CLR4_5_2203p203plusvnit9.R.iget(93456)==0&false)); ++i$) {{
            __CLR4_5_2203p203plusvnit9.R.inc(93457);AuditStatusType temp = arr$[i$];
            __CLR4_5_2203p203plusvnit9.R.inc(93458);if((((temp.getEnCode().equals(enCode))&&(__CLR4_5_2203p203plusvnit9.R.iget(93459)!=0|true))||(__CLR4_5_2203p203plusvnit9.R.iget(93460)==0&false))) {{
                __CLR4_5_2203p203plusvnit9.R.inc(93461);return temp;
            }
        }}

        }__CLR4_5_2203p203plusvnit9.R.inc(93462);return null;
    }finally{__CLR4_5_2203p203plusvnit9.R.flushNeeded();}}

    public String getDesc() {try{__CLR4_5_2203p203plusvnit9.R.inc(93463);
        __CLR4_5_2203p203plusvnit9.R.inc(93464);return this.desc;
    }finally{__CLR4_5_2203p203plusvnit9.R.flushNeeded();}}

    public String getEnCode() {try{__CLR4_5_2203p203plusvnit9.R.inc(93465);
        __CLR4_5_2203p203plusvnit9.R.inc(93466);return this.enCode;
    }finally{__CLR4_5_2203p203plusvnit9.R.flushNeeded();}}

    public int getCode() {try{__CLR4_5_2203p203plusvnit9.R.inc(93467);
        __CLR4_5_2203p203plusvnit9.R.inc(93468);return this.code;
    }finally{__CLR4_5_2203p203plusvnit9.R.flushNeeded();}}
;public static class __CLR4_5_2203p203plusvnit9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,93469,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
