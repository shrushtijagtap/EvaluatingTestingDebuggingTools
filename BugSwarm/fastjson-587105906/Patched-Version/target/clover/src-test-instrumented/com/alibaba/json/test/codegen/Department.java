/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.codegen;

import java.util.ArrayList;
import java.util.List;

public class Department {public static class __CLR4_5_224bo24bolusyjwwx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,98940,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int            id;
    private String         name;

    private boolean        root;

    private Employee       leader;

    private DepartmentType type;

    private List<Employee> members = new ArrayList<Employee>();

    public int getId() {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98916);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98917);return id;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public void setId(int id) {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98918);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98919);this.id = id;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98920);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98921);return name;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98922);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98923);this.name = name;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public boolean isRoot() {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98924);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98925);return root;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public void setRoot(boolean root) {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98926);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98927);this.root = root;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public Employee getLeader() {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98928);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98929);return leader;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public void setLeader(Employee leader) {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98930);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98931);this.leader = leader;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public List<Employee> getMembers() {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98932);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98933);return members;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public void setMembers(List<Employee> members) {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98934);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98935);this.members = members;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public DepartmentType getType() {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98936);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98937);return type;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

    public void setType(DepartmentType type) {try{__CLR4_5_224bo24bolusyjwwx.R.inc(98938);
        __CLR4_5_224bo24bolusyjwwx.R.inc(98939);this.type = type;
    }finally{__CLR4_5_224bo24bolusyjwwx.R.flushNeeded();}}

}
