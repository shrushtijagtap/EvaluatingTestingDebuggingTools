/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark;

import java.lang.management.ManagementFactory;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.alibaba.json.test.codec.Codec;

public class BenchmarkExecutor {public static class __CLR4_1_10236h236hluszwi5m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,97572,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int                       loopCount    = 1000;
    private int                       executeCount = 10;

    private final List<Codec>         codecList    = new ArrayList<Codec>();
    private final List<BenchmarkCase> caseList     = new ArrayList<BenchmarkCase>();

    public List<BenchmarkCase> getCaseList() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97433);
        __CLR4_1_10236h236hluszwi5m.R.inc(97434);return caseList;
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public List<Codec> getCodecList() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97435);
        __CLR4_1_10236h236hluszwi5m.R.inc(97436);return codecList;
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public int getLoopCount() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97437);
        __CLR4_1_10236h236hluszwi5m.R.inc(97438);return loopCount;
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public int getExecuteCount() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97439);
        __CLR4_1_10236h236hluszwi5m.R.inc(97440);return executeCount;
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public void setExecuteCount(int executeCount) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97441);
        __CLR4_1_10236h236hluszwi5m.R.inc(97442);this.executeCount = executeCount;
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public void setLoopCount(int loopCount) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97443);
        __CLR4_1_10236h236hluszwi5m.R.inc(97444);this.loopCount = loopCount;
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public void execute() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97445);
    	__CLR4_1_10236h236hluszwi5m.R.inc(97446);System.out.println(System.getProperty("java.vm.name") + " " + System.getProperty("java.runtime.version"));
    	
        __CLR4_1_10236h236hluszwi5m.R.inc(97447);for (BenchmarkCase benchmarkCase : caseList) {{
            __CLR4_1_10236h236hluszwi5m.R.inc(97448);for (Codec codec : codecList) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97449);try {
                    __CLR4_1_10236h236hluszwi5m.R.inc(97450);benchmarkCase.init(codec);
                } catch (Exception e) {
                    __CLR4_1_10236h236hluszwi5m.R.inc(97451);e.printStackTrace();
                    __CLR4_1_10236h236hluszwi5m.R.inc(97452);break;
                }
                
                __CLR4_1_10236h236hluszwi5m.R.inc(97453);for (int i = 0; (((i < executeCount)&&(__CLR4_1_10236h236hluszwi5m.R.iget(97454)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97455)==0&false)); ++i) {{
                    __CLR4_1_10236h236hluszwi5m.R.inc(97456);Result result = executeLoop(codec, benchmarkCase);
                    __CLR4_1_10236h236hluszwi5m.R.inc(97457);handleResult(codec, result);
                }
                }__CLR4_1_10236h236hluszwi5m.R.inc(97458);System.out.println();
            }
        }}
    }}finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public void handleResult(Codec codec, Result result) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97459);
        __CLR4_1_10236h236hluszwi5m.R.inc(97460);if ((((result.getError() != null)&&(__CLR4_1_10236h236hluszwi5m.R.iget(97461)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97462)==0&false))) {{
            __CLR4_1_10236h236hluszwi5m.R.inc(97463);result.getError().printStackTrace();
            __CLR4_1_10236h236hluszwi5m.R.inc(97464);return;
        }
        }__CLR4_1_10236h236hluszwi5m.R.inc(97465);NumberFormat format = NumberFormat.getInstance();
        __CLR4_1_10236h236hluszwi5m.R.inc(97466);System.out.println(result.getName() + "\t" + codec.getName() + "\t" + format.format(result.getMillis()) + "\tYGC " + result.getYoungGC()
                           + "\tYGCT " + result.getYoungGCTime());
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    private Result executeLoop(Codec codec, BenchmarkCase benchmarkCase) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97467);
        __CLR4_1_10236h236hluszwi5m.R.inc(97468);long startMillis = System.currentTimeMillis();
        __CLR4_1_10236h236hluszwi5m.R.inc(97469);long startYoungGC = getYoungGC();
        __CLR4_1_10236h236hluszwi5m.R.inc(97470);long startYoungGCTime = getYoungGCTime();
        __CLR4_1_10236h236hluszwi5m.R.inc(97471);long startFullGC = getFullGC();

        __CLR4_1_10236h236hluszwi5m.R.inc(97472);Throwable error = null;
        __CLR4_1_10236h236hluszwi5m.R.inc(97473);try {
            __CLR4_1_10236h236hluszwi5m.R.inc(97474);for (int i = 0; (((i < loopCount)&&(__CLR4_1_10236h236hluszwi5m.R.iget(97475)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97476)==0&false)); ++i) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97477);benchmarkCase.execute(codec);
            }
        }} catch (Throwable e) {
            __CLR4_1_10236h236hluszwi5m.R.inc(97478);error = e;
        }
        __CLR4_1_10236h236hluszwi5m.R.inc(97479);long time = System.currentTimeMillis() - startMillis;
        __CLR4_1_10236h236hluszwi5m.R.inc(97480);long youngGC = getYoungGC() - startYoungGC;
        __CLR4_1_10236h236hluszwi5m.R.inc(97481);long youngGCTime = getYoungGCTime() - startYoungGCTime;
        __CLR4_1_10236h236hluszwi5m.R.inc(97482);long fullGC = getFullGC() - startFullGC;

        __CLR4_1_10236h236hluszwi5m.R.inc(97483);Result result = new Result();
        __CLR4_1_10236h236hluszwi5m.R.inc(97484);result.setName(benchmarkCase.getName());
        __CLR4_1_10236h236hluszwi5m.R.inc(97485);result.setMillis(time);
        __CLR4_1_10236h236hluszwi5m.R.inc(97486);result.setYoungGC(youngGC);
        __CLR4_1_10236h236hluszwi5m.R.inc(97487);result.setYoungGCTime(youngGCTime);
        __CLR4_1_10236h236hluszwi5m.R.inc(97488);result.setFullGC(fullGC);
        __CLR4_1_10236h236hluszwi5m.R.inc(97489);result.setError(error);

        __CLR4_1_10236h236hluszwi5m.R.inc(97490);return result;
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public long getYoungGC() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97491);
        __CLR4_1_10236h236hluszwi5m.R.inc(97492);try {
        	// java.lang:type=GarbageCollector,name=G1 Young Generation
        	// java.lang:type=GarbageCollector,name=G1 Old Generation
            __CLR4_1_10236h236hluszwi5m.R.inc(97493);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_10236h236hluszwi5m.R.inc(97494);ObjectName objectName;
            __CLR4_1_10236h236hluszwi5m.R.inc(97495);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97496)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97497)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97498);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_1_10236h236hluszwi5m.R.inc(97499);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97500)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97501)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97502);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_1_10236h236hluszwi5m.R.inc(97503);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97504)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97505)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97506);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97507);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_1_10236h236hluszwi5m.R.inc(97508);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_1_10236h236hluszwi5m.R.inc(97509);throw new RuntimeException("error");
        }
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}
    
    public long getYoungGCTime() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97510);
        __CLR4_1_10236h236hluszwi5m.R.inc(97511);try {
            __CLR4_1_10236h236hluszwi5m.R.inc(97512);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_10236h236hluszwi5m.R.inc(97513);ObjectName objectName;
            __CLR4_1_10236h236hluszwi5m.R.inc(97514);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97515)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97516)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97517);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_1_10236h236hluszwi5m.R.inc(97518);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97519)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97520)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97521);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_1_10236h236hluszwi5m.R.inc(97522);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97523)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97524)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97525);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97526);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_1_10236h236hluszwi5m.R.inc(97527);return (Long) mbeanServer.getAttribute(objectName, "CollectionTime");
        } catch (Exception e) {
            __CLR4_1_10236h236hluszwi5m.R.inc(97528);throw new RuntimeException("error", e);
        }
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public long getFullGC() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97529);
        __CLR4_1_10236h236hluszwi5m.R.inc(97530);try {
            __CLR4_1_10236h236hluszwi5m.R.inc(97531);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_10236h236hluszwi5m.R.inc(97532);ObjectName objectName;

            __CLR4_1_10236h236hluszwi5m.R.inc(97533);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97534)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97535)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97536);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep");
            } }else {__CLR4_1_10236h236hluszwi5m.R.inc(97537);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97538)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97539)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97540);objectName = new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact");
            } }else {__CLR4_1_10236h236hluszwi5m.R.inc(97541);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation")))&&(__CLR4_1_10236h236hluszwi5m.R.iget(97542)!=0|true))||(__CLR4_1_10236h236hluszwi5m.R.iget(97543)==0&false))) {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97544);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation");
            } }else {{
                __CLR4_1_10236h236hluszwi5m.R.inc(97545);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS MarkSweep");
            }

            }}}__CLR4_1_10236h236hluszwi5m.R.inc(97546);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_1_10236h236hluszwi5m.R.inc(97547);throw new RuntimeException("error");
        }
    }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    public static class Result {

        private String    name;
        private long      millis;
        private long      youngGC;
        private long      youngGCTime;
        private long      fullGC;
        private Throwable error;

        public String getName() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97548);
            __CLR4_1_10236h236hluszwi5m.R.inc(97549);return name;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97550);
            __CLR4_1_10236h236hluszwi5m.R.inc(97551);this.name = name;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97552);
            __CLR4_1_10236h236hluszwi5m.R.inc(97553);return millis;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public void setMillis(long millis) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97554);
            __CLR4_1_10236h236hluszwi5m.R.inc(97555);this.millis = millis;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public long getYoungGC() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97556);
            __CLR4_1_10236h236hluszwi5m.R.inc(97557);return youngGC;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public void setYoungGC(long youngGC) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97558);
            __CLR4_1_10236h236hluszwi5m.R.inc(97559);this.youngGC = youngGC;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}
        
        public long getYoungGCTime() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97560);
            __CLR4_1_10236h236hluszwi5m.R.inc(97561);return youngGCTime;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public void setYoungGCTime(long youngGCTime) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97562);
            __CLR4_1_10236h236hluszwi5m.R.inc(97563);this.youngGCTime = youngGCTime;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public long getFullGC() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97564);
            __CLR4_1_10236h236hluszwi5m.R.inc(97565);return fullGC;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public void setFullGC(long fullGC) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97566);
            __CLR4_1_10236h236hluszwi5m.R.inc(97567);this.fullGC = fullGC;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public Throwable getError() {try{__CLR4_1_10236h236hluszwi5m.R.inc(97568);
            __CLR4_1_10236h236hluszwi5m.R.inc(97569);return error;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

        public void setError(Throwable error) {try{__CLR4_1_10236h236hluszwi5m.R.inc(97570);
            __CLR4_1_10236h236hluszwi5m.R.inc(97571);this.error = error;
        }finally{__CLR4_1_10236h236hluszwi5m.R.flushNeeded();}}

    }
}
