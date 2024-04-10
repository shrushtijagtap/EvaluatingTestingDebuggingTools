/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark;

import java.lang.management.ManagementFactory;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.alibaba.json.test.codec.Codec;

public class BenchmarkExecutor {public static class __CLR4_5_2227y227ylusyjwmk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96329,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int                       loopCount    = 1000;
    private int                       executeCount = 10;

    private final List<Codec>         codecList    = new ArrayList<Codec>();
    private final List<BenchmarkCase> caseList     = new ArrayList<BenchmarkCase>();

    public List<BenchmarkCase> getCaseList() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96190);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96191);return caseList;
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public List<Codec> getCodecList() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96192);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96193);return codecList;
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public int getLoopCount() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96194);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96195);return loopCount;
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public int getExecuteCount() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96196);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96197);return executeCount;
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public void setExecuteCount(int executeCount) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96198);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96199);this.executeCount = executeCount;
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public void setLoopCount(int loopCount) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96200);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96201);this.loopCount = loopCount;
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public void execute() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96202);
    	__CLR4_5_2227y227ylusyjwmk.R.inc(96203);System.out.println(System.getProperty("java.vm.name") + " " + System.getProperty("java.runtime.version"));
    	
        __CLR4_5_2227y227ylusyjwmk.R.inc(96204);for (BenchmarkCase benchmarkCase : caseList) {{
            __CLR4_5_2227y227ylusyjwmk.R.inc(96205);for (Codec codec : codecList) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96206);try {
                    __CLR4_5_2227y227ylusyjwmk.R.inc(96207);benchmarkCase.init(codec);
                } catch (Exception e) {
                    __CLR4_5_2227y227ylusyjwmk.R.inc(96208);e.printStackTrace();
                    __CLR4_5_2227y227ylusyjwmk.R.inc(96209);break;
                }
                
                __CLR4_5_2227y227ylusyjwmk.R.inc(96210);for (int i = 0; (((i < executeCount)&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96211)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96212)==0&false)); ++i) {{
                    __CLR4_5_2227y227ylusyjwmk.R.inc(96213);Result result = executeLoop(codec, benchmarkCase);
                    __CLR4_5_2227y227ylusyjwmk.R.inc(96214);handleResult(codec, result);
                }
                }__CLR4_5_2227y227ylusyjwmk.R.inc(96215);System.out.println();
            }
        }}
    }}finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public void handleResult(Codec codec, Result result) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96216);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96217);if ((((result.getError() != null)&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96218)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96219)==0&false))) {{
            __CLR4_5_2227y227ylusyjwmk.R.inc(96220);result.getError().printStackTrace();
            __CLR4_5_2227y227ylusyjwmk.R.inc(96221);return;
        }
        }__CLR4_5_2227y227ylusyjwmk.R.inc(96222);NumberFormat format = NumberFormat.getInstance();
        __CLR4_5_2227y227ylusyjwmk.R.inc(96223);System.out.println(result.getName() + "\t" + codec.getName() + "\t" + format.format(result.getMillis()) + "\tYGC " + result.getYoungGC()
                           + "\tYGCT " + result.getYoungGCTime());
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    private Result executeLoop(Codec codec, BenchmarkCase benchmarkCase) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96224);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96225);long startMillis = System.currentTimeMillis();
        __CLR4_5_2227y227ylusyjwmk.R.inc(96226);long startYoungGC = getYoungGC();
        __CLR4_5_2227y227ylusyjwmk.R.inc(96227);long startYoungGCTime = getYoungGCTime();
        __CLR4_5_2227y227ylusyjwmk.R.inc(96228);long startFullGC = getFullGC();

        __CLR4_5_2227y227ylusyjwmk.R.inc(96229);Throwable error = null;
        __CLR4_5_2227y227ylusyjwmk.R.inc(96230);try {
            __CLR4_5_2227y227ylusyjwmk.R.inc(96231);for (int i = 0; (((i < loopCount)&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96232)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96233)==0&false)); ++i) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96234);benchmarkCase.execute(codec);
            }
        }} catch (Throwable e) {
            __CLR4_5_2227y227ylusyjwmk.R.inc(96235);error = e;
        }
        __CLR4_5_2227y227ylusyjwmk.R.inc(96236);long time = System.currentTimeMillis() - startMillis;
        __CLR4_5_2227y227ylusyjwmk.R.inc(96237);long youngGC = getYoungGC() - startYoungGC;
        __CLR4_5_2227y227ylusyjwmk.R.inc(96238);long youngGCTime = getYoungGCTime() - startYoungGCTime;
        __CLR4_5_2227y227ylusyjwmk.R.inc(96239);long fullGC = getFullGC() - startFullGC;

        __CLR4_5_2227y227ylusyjwmk.R.inc(96240);Result result = new Result();
        __CLR4_5_2227y227ylusyjwmk.R.inc(96241);result.setName(benchmarkCase.getName());
        __CLR4_5_2227y227ylusyjwmk.R.inc(96242);result.setMillis(time);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96243);result.setYoungGC(youngGC);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96244);result.setYoungGCTime(youngGCTime);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96245);result.setFullGC(fullGC);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96246);result.setError(error);

        __CLR4_5_2227y227ylusyjwmk.R.inc(96247);return result;
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public long getYoungGC() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96248);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96249);try {
        	// java.lang:type=GarbageCollector,name=G1 Young Generation
        	// java.lang:type=GarbageCollector,name=G1 Old Generation
            __CLR4_5_2227y227ylusyjwmk.R.inc(96250);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_2227y227ylusyjwmk.R.inc(96251);ObjectName objectName;
            __CLR4_5_2227y227ylusyjwmk.R.inc(96252);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96253)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96254)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96255);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_5_2227y227ylusyjwmk.R.inc(96256);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96257)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96258)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96259);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_5_2227y227ylusyjwmk.R.inc(96260);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96261)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96262)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96263);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96264);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_5_2227y227ylusyjwmk.R.inc(96265);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_5_2227y227ylusyjwmk.R.inc(96266);throw new RuntimeException("error");
        }
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}
    
    public long getYoungGCTime() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96267);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96268);try {
            __CLR4_5_2227y227ylusyjwmk.R.inc(96269);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_2227y227ylusyjwmk.R.inc(96270);ObjectName objectName;
            __CLR4_5_2227y227ylusyjwmk.R.inc(96271);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96272)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96273)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96274);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_5_2227y227ylusyjwmk.R.inc(96275);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96276)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96277)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96278);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_5_2227y227ylusyjwmk.R.inc(96279);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96280)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96281)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96282);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96283);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_5_2227y227ylusyjwmk.R.inc(96284);return (Long) mbeanServer.getAttribute(objectName, "CollectionTime");
        } catch (Exception e) {
            __CLR4_5_2227y227ylusyjwmk.R.inc(96285);throw new RuntimeException("error", e);
        }
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public long getFullGC() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96286);
        __CLR4_5_2227y227ylusyjwmk.R.inc(96287);try {
            __CLR4_5_2227y227ylusyjwmk.R.inc(96288);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_2227y227ylusyjwmk.R.inc(96289);ObjectName objectName;

            __CLR4_5_2227y227ylusyjwmk.R.inc(96290);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96291)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96292)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96293);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep");
            } }else {__CLR4_5_2227y227ylusyjwmk.R.inc(96294);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96295)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96296)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96297);objectName = new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact");
            } }else {__CLR4_5_2227y227ylusyjwmk.R.inc(96298);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation")))&&(__CLR4_5_2227y227ylusyjwmk.R.iget(96299)!=0|true))||(__CLR4_5_2227y227ylusyjwmk.R.iget(96300)==0&false))) {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96301);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation");
            } }else {{
                __CLR4_5_2227y227ylusyjwmk.R.inc(96302);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS MarkSweep");
            }

            }}}__CLR4_5_2227y227ylusyjwmk.R.inc(96303);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_5_2227y227ylusyjwmk.R.inc(96304);throw new RuntimeException("error");
        }
    }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    public static class Result {

        private String    name;
        private long      millis;
        private long      youngGC;
        private long      youngGCTime;
        private long      fullGC;
        private Throwable error;

        public String getName() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96305);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96306);return name;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96307);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96308);this.name = name;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96309);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96310);return millis;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public void setMillis(long millis) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96311);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96312);this.millis = millis;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public long getYoungGC() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96313);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96314);return youngGC;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public void setYoungGC(long youngGC) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96315);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96316);this.youngGC = youngGC;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}
        
        public long getYoungGCTime() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96317);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96318);return youngGCTime;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public void setYoungGCTime(long youngGCTime) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96319);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96320);this.youngGCTime = youngGCTime;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public long getFullGC() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96321);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96322);return fullGC;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public void setFullGC(long fullGC) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96323);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96324);this.fullGC = fullGC;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public Throwable getError() {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96325);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96326);return error;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

        public void setError(Throwable error) {try{__CLR4_5_2227y227ylusyjwmk.R.inc(96327);
            __CLR4_5_2227y227ylusyjwmk.R.inc(96328);this.error = error;
        }finally{__CLR4_5_2227y227ylusyjwmk.R.flushNeeded();}}

    }
}
