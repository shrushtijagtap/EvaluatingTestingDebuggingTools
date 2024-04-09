/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvtVO;

public class PhysicalQueue {public static class __CLR4_1_101zk61zk6lusqkpbw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,92773,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private QueueEntity queue;
    private Integer     weight;
    private Integer     capacity;
    private int         inRate;
    private int         outRate;

    // Napoli 1.1 \u65b0\u52a0\u5c5e\u6027
    private boolean     sendable;
    private boolean     receivable;

    public PhysicalQueue(){try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92742);

    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public Integer getCapacity() {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92743);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92744);return capacity;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public void setCapacity(Integer capacity) {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92745);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92746);this.capacity = capacity;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public int getInRate() {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92747);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92748);return inRate;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public void setInRate(int inRate) {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92749);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92750);this.inRate = inRate;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public int getOutRate() {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92751);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92752);return outRate;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public void setOutRate(int outRate) {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92753);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92754);this.outRate = outRate;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public boolean relationChanged(Object other) {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92755);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92756);return false;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public QueueEntity getQueue() {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92757);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92758);return queue;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public void setQueue(QueueEntity queue) {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92759);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92760);this.queue = queue;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public Integer getWeight() {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92761);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92762);return weight;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public void setWeight(Integer weight) {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92763);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92764);this.weight = weight;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public boolean isSendable() {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92765);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92766);return sendable;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public void setSendable(boolean sendable) {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92767);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92768);this.sendable = sendable;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public boolean isReceivable() {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92769);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92770);return receivable;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

    public void setReceivable(boolean receivable) {try{__CLR4_1_101zk61zk6lusqkpbw.R.inc(92771);
        __CLR4_1_101zk61zk6lusqkpbw.R.inc(92772);this.receivable = receivable;
    }finally{__CLR4_1_101zk61zk6lusqkpbw.R.flushNeeded();}}

}
