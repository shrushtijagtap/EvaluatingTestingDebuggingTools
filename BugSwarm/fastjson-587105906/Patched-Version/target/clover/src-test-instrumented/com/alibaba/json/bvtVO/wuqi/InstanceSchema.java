/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO.wuqi;

/**
 * Created by wuqi on 17/3/30.
 */
public class InstanceSchema {public static class __CLR4_5_2200e200elusyjw8k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,93391,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public InstanceSchema() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93326);
        __CLR4_5_2200e200elusyjw8k.R.inc(93327);this.created = System.currentTimeMillis() / 1000;
        __CLR4_5_2200e200elusyjw8k.R.inc(93328);this.updated = System.currentTimeMillis() / 1000;
        __CLR4_5_2200e200elusyjw8k.R.inc(93329);this.isDeleted = 0;
        __CLR4_5_2200e200elusyjw8k.R.inc(93330);this.isTagField = 0;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    private int id;
    private String instanceName;
    private String fieldName;
    private String fieldType;
    private String fieldBaseType;
    private String fieldComment;
    private int fieldIndexed;
    private int fieldStored;
    private Integer fieldTag;
    private int isDeleted;
    private long created;
    private long updated;
    private Integer cycleType;
    private Integer isTagField;
    private String defaultValue;

    public String getDefaultValue() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93331);
        __CLR4_5_2200e200elusyjw8k.R.inc(93332);return defaultValue;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setDefaultValue(String defaultValue) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93333);
        __CLR4_5_2200e200elusyjw8k.R.inc(93334);this.defaultValue = defaultValue;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public Integer getIsTagField() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93335);
        __CLR4_5_2200e200elusyjw8k.R.inc(93336);return isTagField;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setIsTagField(Integer isTagField) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93337);
        __CLR4_5_2200e200elusyjw8k.R.inc(93338);this.isTagField = isTagField;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public Integer getId() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93339);
        __CLR4_5_2200e200elusyjw8k.R.inc(93340);return id;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setId(Integer id) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93341);
        __CLR4_5_2200e200elusyjw8k.R.inc(93342);this.id = id;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public String getInstanceName() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93343);
        __CLR4_5_2200e200elusyjw8k.R.inc(93344);return instanceName;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setInstanceName(String instanceName) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93345);
        __CLR4_5_2200e200elusyjw8k.R.inc(93346);this.instanceName = instanceName;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public String getFieldName() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93347);
        __CLR4_5_2200e200elusyjw8k.R.inc(93348);return fieldName;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setFieldName(String fieldName) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93349);
        __CLR4_5_2200e200elusyjw8k.R.inc(93350);this.fieldName = fieldName;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public String getFieldType() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93351);
        __CLR4_5_2200e200elusyjw8k.R.inc(93352);return fieldType;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setFieldType(String fieldType) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93353);
        __CLR4_5_2200e200elusyjw8k.R.inc(93354);this.fieldType = fieldType;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public String getFieldBaseType() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93355);
        __CLR4_5_2200e200elusyjw8k.R.inc(93356);return fieldBaseType;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setFieldBaseType(String fieldBaseType) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93357);
        __CLR4_5_2200e200elusyjw8k.R.inc(93358);this.fieldBaseType = fieldBaseType;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public String getFieldComment() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93359);
        __CLR4_5_2200e200elusyjw8k.R.inc(93360);return fieldComment;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setFieldComment(String fieldComment) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93361);
        __CLR4_5_2200e200elusyjw8k.R.inc(93362);this.fieldComment = fieldComment;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public int getFieldIndexed() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93363);
        __CLR4_5_2200e200elusyjw8k.R.inc(93364);return fieldIndexed;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setFieldIndexed(int fieldIndexed) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93365);
        __CLR4_5_2200e200elusyjw8k.R.inc(93366);this.fieldIndexed = fieldIndexed;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public int getFieldStored() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93367);
        __CLR4_5_2200e200elusyjw8k.R.inc(93368);return fieldStored;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setFieldStored(int fieldStored) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93369);
        __CLR4_5_2200e200elusyjw8k.R.inc(93370);this.fieldStored = fieldStored;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public Integer getFieldTag() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93371);
        __CLR4_5_2200e200elusyjw8k.R.inc(93372);return fieldTag;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setFieldTag(Integer fieldTag) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93373);
        __CLR4_5_2200e200elusyjw8k.R.inc(93374);this.fieldTag = fieldTag;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public int getIsDeleted() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93375);
        __CLR4_5_2200e200elusyjw8k.R.inc(93376);return isDeleted;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setIsDeleted(int isDeleted) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93377);
        __CLR4_5_2200e200elusyjw8k.R.inc(93378);this.isDeleted = isDeleted;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public Integer getCycleType() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93379);
        __CLR4_5_2200e200elusyjw8k.R.inc(93380);return cycleType;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setCycleType(Integer cycleType) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93381);
        __CLR4_5_2200e200elusyjw8k.R.inc(93382);this.cycleType = cycleType;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public long getCreated() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93383);
        __CLR4_5_2200e200elusyjw8k.R.inc(93384);return created;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setCreated(long created) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93385);
        __CLR4_5_2200e200elusyjw8k.R.inc(93386);this.created = created;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public long getUpdated() {try{__CLR4_5_2200e200elusyjw8k.R.inc(93387);
        __CLR4_5_2200e200elusyjw8k.R.inc(93388);return updated;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}

    public void setUpdated(long updated) {try{__CLR4_5_2200e200elusyjw8k.R.inc(93389);
        __CLR4_5_2200e200elusyjw8k.R.inc(93390);this.updated = updated;
    }finally{__CLR4_5_2200e200elusyjw8k.R.flushNeeded();}}
}
