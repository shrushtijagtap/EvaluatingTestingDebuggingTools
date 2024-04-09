/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark;

import java.lang.management.ManagementFactory;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.alibaba.json.test.codec.Codec;

public class BenchmarkExecutor {public static class __CLR4_5_223662366lusvnkd9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,97561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int                       loopCount    = 1000;
    private int                       executeCount = 10;

    private final List<Codec>         codecList    = new ArrayList<Codec>();
    private final List<BenchmarkCase> caseList     = new ArrayList<BenchmarkCase>();

    public List<BenchmarkCase> getCaseList() {try{__CLR4_5_223662366lusvnkd9.R.inc(97422);
        __CLR4_5_223662366lusvnkd9.R.inc(97423);return caseList;
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public List<Codec> getCodecList() {try{__CLR4_5_223662366lusvnkd9.R.inc(97424);
        __CLR4_5_223662366lusvnkd9.R.inc(97425);return codecList;
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public int getLoopCount() {try{__CLR4_5_223662366lusvnkd9.R.inc(97426);
        __CLR4_5_223662366lusvnkd9.R.inc(97427);return loopCount;
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public int getExecuteCount() {try{__CLR4_5_223662366lusvnkd9.R.inc(97428);
        __CLR4_5_223662366lusvnkd9.R.inc(97429);return executeCount;
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public void setExecuteCount(int executeCount) {try{__CLR4_5_223662366lusvnkd9.R.inc(97430);
        __CLR4_5_223662366lusvnkd9.R.inc(97431);this.executeCount = executeCount;
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public void setLoopCount(int loopCount) {try{__CLR4_5_223662366lusvnkd9.R.inc(97432);
        __CLR4_5_223662366lusvnkd9.R.inc(97433);this.loopCount = loopCount;
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public void execute() {try{__CLR4_5_223662366lusvnkd9.R.inc(97434);
    	__CLR4_5_223662366lusvnkd9.R.inc(97435);System.out.println(System.getProperty("java.vm.name") + " " + System.getProperty("java.runtime.version"));
    	
        __CLR4_5_223662366lusvnkd9.R.inc(97436);for (BenchmarkCase benchmarkCase : caseList) {{
            __CLR4_5_223662366lusvnkd9.R.inc(97437);for (Codec codec : codecList) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97438);try {
                    __CLR4_5_223662366lusvnkd9.R.inc(97439);benchmarkCase.init(codec);
                } catch (Exception e) {
                    __CLR4_5_223662366lusvnkd9.R.inc(97440);e.printStackTrace();
                    __CLR4_5_223662366lusvnkd9.R.inc(97441);break;
                }
                
                __CLR4_5_223662366lusvnkd9.R.inc(97442);for (int i = 0; (((i < executeCount)&&(__CLR4_5_223662366lusvnkd9.R.iget(97443)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97444)==0&false)); ++i) {{
                    __CLR4_5_223662366lusvnkd9.R.inc(97445);Result result = executeLoop(codec, benchmarkCase);
                    __CLR4_5_223662366lusvnkd9.R.inc(97446);handleResult(codec, result);
                }
                }__CLR4_5_223662366lusvnkd9.R.inc(97447);System.out.println();
            }
        }}
    }}finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public void handleResult(Codec codec, Result result) {try{__CLR4_5_223662366lusvnkd9.R.inc(97448);
        __CLR4_5_223662366lusvnkd9.R.inc(97449);if ((((result.getError() != null)&&(__CLR4_5_223662366lusvnkd9.R.iget(97450)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97451)==0&false))) {{
            __CLR4_5_223662366lusvnkd9.R.inc(97452);result.getError().printStackTrace();
            __CLR4_5_223662366lusvnkd9.R.inc(97453);return;
        }
        }__CLR4_5_223662366lusvnkd9.R.inc(97454);NumberFormat format = NumberFormat.getInstance();
        __CLR4_5_223662366lusvnkd9.R.inc(97455);System.out.println(result.getName() + "\t" + codec.getName() + "\t" + format.format(result.getMillis()) + "\tYGC " + result.getYoungGC()
                           + "\tYGCT " + result.getYoungGCTime());
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    private Result executeLoop(Codec codec, BenchmarkCase benchmarkCase) {try{__CLR4_5_223662366lusvnkd9.R.inc(97456);
        __CLR4_5_223662366lusvnkd9.R.inc(97457);long startMillis = System.currentTimeMillis();
        __CLR4_5_223662366lusvnkd9.R.inc(97458);long startYoungGC = getYoungGC();
        __CLR4_5_223662366lusvnkd9.R.inc(97459);long startYoungGCTime = getYoungGCTime();
        __CLR4_5_223662366lusvnkd9.R.inc(97460);long startFullGC = getFullGC();

        __CLR4_5_223662366lusvnkd9.R.inc(97461);Throwable error = null;
        __CLR4_5_223662366lusvnkd9.R.inc(97462);try {
            __CLR4_5_223662366lusvnkd9.R.inc(97463);for (int i = 0; (((i < loopCount)&&(__CLR4_5_223662366lusvnkd9.R.iget(97464)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97465)==0&false)); ++i) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97466);benchmarkCase.execute(codec);
            }
        }} catch (Throwable e) {
            __CLR4_5_223662366lusvnkd9.R.inc(97467);error = e;
        }
        __CLR4_5_223662366lusvnkd9.R.inc(97468);long time = System.currentTimeMillis() - startMillis;
        __CLR4_5_223662366lusvnkd9.R.inc(97469);long youngGC = getYoungGC() - startYoungGC;
        __CLR4_5_223662366lusvnkd9.R.inc(97470);long youngGCTime = getYoungGCTime() - startYoungGCTime;
        __CLR4_5_223662366lusvnkd9.R.inc(97471);long fullGC = getFullGC() - startFullGC;

        __CLR4_5_223662366lusvnkd9.R.inc(97472);Result result = new Result();
        __CLR4_5_223662366lusvnkd9.R.inc(97473);result.setName(benchmarkCase.getName());
        __CLR4_5_223662366lusvnkd9.R.inc(97474);result.setMillis(time);
        __CLR4_5_223662366lusvnkd9.R.inc(97475);result.setYoungGC(youngGC);
        __CLR4_5_223662366lusvnkd9.R.inc(97476);result.setYoungGCTime(youngGCTime);
        __CLR4_5_223662366lusvnkd9.R.inc(97477);result.setFullGC(fullGC);
        __CLR4_5_223662366lusvnkd9.R.inc(97478);result.setError(error);

        __CLR4_5_223662366lusvnkd9.R.inc(97479);return result;
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public long getYoungGC() {try{__CLR4_5_223662366lusvnkd9.R.inc(97480);
        __CLR4_5_223662366lusvnkd9.R.inc(97481);try {
        	// java.lang:type=GarbageCollector,name=G1 Young Generation
        	// java.lang:type=GarbageCollector,name=G1 Old Generation
            __CLR4_5_223662366lusvnkd9.R.inc(97482);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_223662366lusvnkd9.R.inc(97483);ObjectName objectName;
            __CLR4_5_223662366lusvnkd9.R.inc(97484);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97485)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97486)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97487);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_5_223662366lusvnkd9.R.inc(97488);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97489)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97490)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97491);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_5_223662366lusvnkd9.R.inc(97492);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97493)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97494)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97495);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_5_223662366lusvnkd9.R.inc(97496);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_5_223662366lusvnkd9.R.inc(97497);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_5_223662366lusvnkd9.R.inc(97498);throw new RuntimeException("error");
        }
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}
    
    public long getYoungGCTime() {try{__CLR4_5_223662366lusvnkd9.R.inc(97499);
        __CLR4_5_223662366lusvnkd9.R.inc(97500);try {
            __CLR4_5_223662366lusvnkd9.R.inc(97501);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_223662366lusvnkd9.R.inc(97502);ObjectName objectName;
            __CLR4_5_223662366lusvnkd9.R.inc(97503);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97504)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97505)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97506);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_5_223662366lusvnkd9.R.inc(97507);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97508)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97509)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97510);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_5_223662366lusvnkd9.R.inc(97511);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97512)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97513)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97514);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_5_223662366lusvnkd9.R.inc(97515);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_5_223662366lusvnkd9.R.inc(97516);return (Long) mbeanServer.getAttribute(objectName, "CollectionTime");
        } catch (Exception e) {
            __CLR4_5_223662366lusvnkd9.R.inc(97517);throw new RuntimeException("error", e);
        }
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public long getFullGC() {try{__CLR4_5_223662366lusvnkd9.R.inc(97518);
        __CLR4_5_223662366lusvnkd9.R.inc(97519);try {
            __CLR4_5_223662366lusvnkd9.R.inc(97520);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_223662366lusvnkd9.R.inc(97521);ObjectName objectName;

            __CLR4_5_223662366lusvnkd9.R.inc(97522);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97523)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97524)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97525);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep");
            } }else {__CLR4_5_223662366lusvnkd9.R.inc(97526);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97527)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97528)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97529);objectName = new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact");
            } }else {__CLR4_5_223662366lusvnkd9.R.inc(97530);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation")))&&(__CLR4_5_223662366lusvnkd9.R.iget(97531)!=0|true))||(__CLR4_5_223662366lusvnkd9.R.iget(97532)==0&false))) {{
                __CLR4_5_223662366lusvnkd9.R.inc(97533);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation");
            } }else {{
                __CLR4_5_223662366lusvnkd9.R.inc(97534);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS MarkSweep");
            }

            }}}__CLR4_5_223662366lusvnkd9.R.inc(97535);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_5_223662366lusvnkd9.R.inc(97536);throw new RuntimeException("error");
        }
    }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    public static class Result {

        private String    name;
        private long      millis;
        private long      youngGC;
        private long      youngGCTime;
        private long      fullGC;
        private Throwable error;

        public String getName() {try{__CLR4_5_223662366lusvnkd9.R.inc(97537);
            __CLR4_5_223662366lusvnkd9.R.inc(97538);return name;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_223662366lusvnkd9.R.inc(97539);
            __CLR4_5_223662366lusvnkd9.R.inc(97540);this.name = name;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_5_223662366lusvnkd9.R.inc(97541);
            __CLR4_5_223662366lusvnkd9.R.inc(97542);return millis;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public void setMillis(long millis) {try{__CLR4_5_223662366lusvnkd9.R.inc(97543);
            __CLR4_5_223662366lusvnkd9.R.inc(97544);this.millis = millis;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public long getYoungGC() {try{__CLR4_5_223662366lusvnkd9.R.inc(97545);
            __CLR4_5_223662366lusvnkd9.R.inc(97546);return youngGC;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public void setYoungGC(long youngGC) {try{__CLR4_5_223662366lusvnkd9.R.inc(97547);
            __CLR4_5_223662366lusvnkd9.R.inc(97548);this.youngGC = youngGC;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}
        
        public long getYoungGCTime() {try{__CLR4_5_223662366lusvnkd9.R.inc(97549);
            __CLR4_5_223662366lusvnkd9.R.inc(97550);return youngGCTime;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public void setYoungGCTime(long youngGCTime) {try{__CLR4_5_223662366lusvnkd9.R.inc(97551);
            __CLR4_5_223662366lusvnkd9.R.inc(97552);this.youngGCTime = youngGCTime;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public long getFullGC() {try{__CLR4_5_223662366lusvnkd9.R.inc(97553);
            __CLR4_5_223662366lusvnkd9.R.inc(97554);return fullGC;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public void setFullGC(long fullGC) {try{__CLR4_5_223662366lusvnkd9.R.inc(97555);
            __CLR4_5_223662366lusvnkd9.R.inc(97556);this.fullGC = fullGC;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public Throwable getError() {try{__CLR4_5_223662366lusvnkd9.R.inc(97557);
            __CLR4_5_223662366lusvnkd9.R.inc(97558);return error;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

        public void setError(Throwable error) {try{__CLR4_5_223662366lusvnkd9.R.inc(97559);
            __CLR4_5_223662366lusvnkd9.R.inc(97560);this.error = error;
        }finally{__CLR4_5_223662366lusvnkd9.R.flushNeeded();}}

    }
}
