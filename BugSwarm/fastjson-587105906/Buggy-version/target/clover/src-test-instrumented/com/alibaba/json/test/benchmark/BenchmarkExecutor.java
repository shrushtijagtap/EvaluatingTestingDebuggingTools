/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark;

import java.lang.management.ManagementFactory;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.alibaba.json.test.codec.Codec;

public class BenchmarkExecutor {public static class __CLR4_1_1022892289lusqkrx8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,96340,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int                       loopCount    = 1000;
    private int                       executeCount = 10;

    private final List<Codec>         codecList    = new ArrayList<Codec>();
    private final List<BenchmarkCase> caseList     = new ArrayList<BenchmarkCase>();

    public List<BenchmarkCase> getCaseList() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96201);
        __CLR4_1_1022892289lusqkrx8.R.inc(96202);return caseList;
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public List<Codec> getCodecList() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96203);
        __CLR4_1_1022892289lusqkrx8.R.inc(96204);return codecList;
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public int getLoopCount() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96205);
        __CLR4_1_1022892289lusqkrx8.R.inc(96206);return loopCount;
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public int getExecuteCount() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96207);
        __CLR4_1_1022892289lusqkrx8.R.inc(96208);return executeCount;
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public void setExecuteCount(int executeCount) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96209);
        __CLR4_1_1022892289lusqkrx8.R.inc(96210);this.executeCount = executeCount;
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public void setLoopCount(int loopCount) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96211);
        __CLR4_1_1022892289lusqkrx8.R.inc(96212);this.loopCount = loopCount;
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public void execute() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96213);
    	__CLR4_1_1022892289lusqkrx8.R.inc(96214);System.out.println(System.getProperty("java.vm.name") + " " + System.getProperty("java.runtime.version"));
    	
        __CLR4_1_1022892289lusqkrx8.R.inc(96215);for (BenchmarkCase benchmarkCase : caseList) {{
            __CLR4_1_1022892289lusqkrx8.R.inc(96216);for (Codec codec : codecList) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96217);try {
                    __CLR4_1_1022892289lusqkrx8.R.inc(96218);benchmarkCase.init(codec);
                } catch (Exception e) {
                    __CLR4_1_1022892289lusqkrx8.R.inc(96219);e.printStackTrace();
                    __CLR4_1_1022892289lusqkrx8.R.inc(96220);break;
                }
                
                __CLR4_1_1022892289lusqkrx8.R.inc(96221);for (int i = 0; (((i < executeCount)&&(__CLR4_1_1022892289lusqkrx8.R.iget(96222)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96223)==0&false)); ++i) {{
                    __CLR4_1_1022892289lusqkrx8.R.inc(96224);Result result = executeLoop(codec, benchmarkCase);
                    __CLR4_1_1022892289lusqkrx8.R.inc(96225);handleResult(codec, result);
                }
                }__CLR4_1_1022892289lusqkrx8.R.inc(96226);System.out.println();
            }
        }}
    }}finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public void handleResult(Codec codec, Result result) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96227);
        __CLR4_1_1022892289lusqkrx8.R.inc(96228);if ((((result.getError() != null)&&(__CLR4_1_1022892289lusqkrx8.R.iget(96229)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96230)==0&false))) {{
            __CLR4_1_1022892289lusqkrx8.R.inc(96231);result.getError().printStackTrace();
            __CLR4_1_1022892289lusqkrx8.R.inc(96232);return;
        }
        }__CLR4_1_1022892289lusqkrx8.R.inc(96233);NumberFormat format = NumberFormat.getInstance();
        __CLR4_1_1022892289lusqkrx8.R.inc(96234);System.out.println(result.getName() + "\t" + codec.getName() + "\t" + format.format(result.getMillis()) + "\tYGC " + result.getYoungGC()
                           + "\tYGCT " + result.getYoungGCTime());
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    private Result executeLoop(Codec codec, BenchmarkCase benchmarkCase) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96235);
        __CLR4_1_1022892289lusqkrx8.R.inc(96236);long startMillis = System.currentTimeMillis();
        __CLR4_1_1022892289lusqkrx8.R.inc(96237);long startYoungGC = getYoungGC();
        __CLR4_1_1022892289lusqkrx8.R.inc(96238);long startYoungGCTime = getYoungGCTime();
        __CLR4_1_1022892289lusqkrx8.R.inc(96239);long startFullGC = getFullGC();

        __CLR4_1_1022892289lusqkrx8.R.inc(96240);Throwable error = null;
        __CLR4_1_1022892289lusqkrx8.R.inc(96241);try {
            __CLR4_1_1022892289lusqkrx8.R.inc(96242);for (int i = 0; (((i < loopCount)&&(__CLR4_1_1022892289lusqkrx8.R.iget(96243)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96244)==0&false)); ++i) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96245);benchmarkCase.execute(codec);
            }
        }} catch (Throwable e) {
            __CLR4_1_1022892289lusqkrx8.R.inc(96246);error = e;
        }
        __CLR4_1_1022892289lusqkrx8.R.inc(96247);long time = System.currentTimeMillis() - startMillis;
        __CLR4_1_1022892289lusqkrx8.R.inc(96248);long youngGC = getYoungGC() - startYoungGC;
        __CLR4_1_1022892289lusqkrx8.R.inc(96249);long youngGCTime = getYoungGCTime() - startYoungGCTime;
        __CLR4_1_1022892289lusqkrx8.R.inc(96250);long fullGC = getFullGC() - startFullGC;

        __CLR4_1_1022892289lusqkrx8.R.inc(96251);Result result = new Result();
        __CLR4_1_1022892289lusqkrx8.R.inc(96252);result.setName(benchmarkCase.getName());
        __CLR4_1_1022892289lusqkrx8.R.inc(96253);result.setMillis(time);
        __CLR4_1_1022892289lusqkrx8.R.inc(96254);result.setYoungGC(youngGC);
        __CLR4_1_1022892289lusqkrx8.R.inc(96255);result.setYoungGCTime(youngGCTime);
        __CLR4_1_1022892289lusqkrx8.R.inc(96256);result.setFullGC(fullGC);
        __CLR4_1_1022892289lusqkrx8.R.inc(96257);result.setError(error);

        __CLR4_1_1022892289lusqkrx8.R.inc(96258);return result;
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public long getYoungGC() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96259);
        __CLR4_1_1022892289lusqkrx8.R.inc(96260);try {
        	// java.lang:type=GarbageCollector,name=G1 Young Generation
        	// java.lang:type=GarbageCollector,name=G1 Old Generation
            __CLR4_1_1022892289lusqkrx8.R.inc(96261);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_1022892289lusqkrx8.R.inc(96262);ObjectName objectName;
            __CLR4_1_1022892289lusqkrx8.R.inc(96263);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96264)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96265)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96266);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_1_1022892289lusqkrx8.R.inc(96267);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96268)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96269)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96270);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_1_1022892289lusqkrx8.R.inc(96271);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96272)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96273)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96274);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96275);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_1_1022892289lusqkrx8.R.inc(96276);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_1_1022892289lusqkrx8.R.inc(96277);throw new RuntimeException("error");
        }
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}
    
    public long getYoungGCTime() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96278);
        __CLR4_1_1022892289lusqkrx8.R.inc(96279);try {
            __CLR4_1_1022892289lusqkrx8.R.inc(96280);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_1022892289lusqkrx8.R.inc(96281);ObjectName objectName;
            __CLR4_1_1022892289lusqkrx8.R.inc(96282);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96283)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96284)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96285);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_1_1022892289lusqkrx8.R.inc(96286);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96287)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96288)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96289);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_1_1022892289lusqkrx8.R.inc(96290);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96291)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96292)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96293);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96294);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_1_1022892289lusqkrx8.R.inc(96295);return (Long) mbeanServer.getAttribute(objectName, "CollectionTime");
        } catch (Exception e) {
            __CLR4_1_1022892289lusqkrx8.R.inc(96296);throw new RuntimeException("error", e);
        }
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public long getFullGC() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96297);
        __CLR4_1_1022892289lusqkrx8.R.inc(96298);try {
            __CLR4_1_1022892289lusqkrx8.R.inc(96299);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_1022892289lusqkrx8.R.inc(96300);ObjectName objectName;

            __CLR4_1_1022892289lusqkrx8.R.inc(96301);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96302)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96303)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96304);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep");
            } }else {__CLR4_1_1022892289lusqkrx8.R.inc(96305);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96306)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96307)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96308);objectName = new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact");
            } }else {__CLR4_1_1022892289lusqkrx8.R.inc(96309);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation")))&&(__CLR4_1_1022892289lusqkrx8.R.iget(96310)!=0|true))||(__CLR4_1_1022892289lusqkrx8.R.iget(96311)==0&false))) {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96312);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation");
            } }else {{
                __CLR4_1_1022892289lusqkrx8.R.inc(96313);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS MarkSweep");
            }

            }}}__CLR4_1_1022892289lusqkrx8.R.inc(96314);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_1_1022892289lusqkrx8.R.inc(96315);throw new RuntimeException("error");
        }
    }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    public static class Result {

        private String    name;
        private long      millis;
        private long      youngGC;
        private long      youngGCTime;
        private long      fullGC;
        private Throwable error;

        public String getName() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96316);
            __CLR4_1_1022892289lusqkrx8.R.inc(96317);return name;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96318);
            __CLR4_1_1022892289lusqkrx8.R.inc(96319);this.name = name;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96320);
            __CLR4_1_1022892289lusqkrx8.R.inc(96321);return millis;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public void setMillis(long millis) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96322);
            __CLR4_1_1022892289lusqkrx8.R.inc(96323);this.millis = millis;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public long getYoungGC() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96324);
            __CLR4_1_1022892289lusqkrx8.R.inc(96325);return youngGC;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public void setYoungGC(long youngGC) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96326);
            __CLR4_1_1022892289lusqkrx8.R.inc(96327);this.youngGC = youngGC;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}
        
        public long getYoungGCTime() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96328);
            __CLR4_1_1022892289lusqkrx8.R.inc(96329);return youngGCTime;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public void setYoungGCTime(long youngGCTime) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96330);
            __CLR4_1_1022892289lusqkrx8.R.inc(96331);this.youngGCTime = youngGCTime;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public long getFullGC() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96332);
            __CLR4_1_1022892289lusqkrx8.R.inc(96333);return fullGC;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public void setFullGC(long fullGC) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96334);
            __CLR4_1_1022892289lusqkrx8.R.inc(96335);this.fullGC = fullGC;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public Throwable getError() {try{__CLR4_1_1022892289lusqkrx8.R.inc(96336);
            __CLR4_1_1022892289lusqkrx8.R.inc(96337);return error;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

        public void setError(Throwable error) {try{__CLR4_1_1022892289lusqkrx8.R.inc(96338);
            __CLR4_1_1022892289lusqkrx8.R.inc(96339);this.error = error;
        }finally{__CLR4_1_1022892289lusqkrx8.R.flushNeeded();}}

    }
}
