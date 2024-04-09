/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO;

import java.util.HashMap;
import java.util.Map;

public class VirtualTopic {public static class __CLR4_5_220r520r5lusvnj7p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,94346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long         serialVersionUID = 1115397330651723322L;

    private Map<Integer, QueueEntity> queueMap         = new HashMap<Integer, QueueEntity>();
    private Integer                   queueCount;

    private int                       queueLimit;

    private String                    description;

    public VirtualTopic(){try{__CLR4_5_220r520r5lusvnj7p.R.inc(94289);

    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    public String getDescription() {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94290);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94291);return description;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    public void setDescription(String description) {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94292);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94293);this.description = description;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    /**
     * @return the queueList
     */
    public Map<Integer, QueueEntity> getQueueMap() {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94294);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94295);return queueMap;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    /**
     * @param queueList the queueList to set
     */
    public void setQueueMap(Map<Integer, QueueEntity> queueMap) {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94296);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94297);this.queueMap = queueMap;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    /**
     * @return the queueCount
     */
    public Integer getQueueCount() {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94298);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94299);if ((((queueCount != null)&&(__CLR4_5_220r520r5lusvnj7p.R.iget(94300)!=0|true))||(__CLR4_5_220r520r5lusvnj7p.R.iget(94301)==0&false))) {{
            __CLR4_5_220r520r5lusvnj7p.R.inc(94302);return queueCount;
        } }else {{
            __CLR4_5_220r520r5lusvnj7p.R.inc(94303);return queueMap.size();
        }
    }}finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    /**
     * @param queueCount the queueCount to set
     */
    public void setQueueCount(Integer queueCount) {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94304);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94305);this.queueCount = queueCount;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    public boolean propertiesChanged(Object other) {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94306);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94307);if ((((!(other instanceof VirtualTopic))&&(__CLR4_5_220r520r5lusvnj7p.R.iget(94308)!=0|true))||(__CLR4_5_220r520r5lusvnj7p.R.iget(94309)==0&false))) {{
            __CLR4_5_220r520r5lusvnj7p.R.inc(94310);return false;
        }
        }__CLR4_5_220r520r5lusvnj7p.R.inc(94311);VirtualTopic vt = (VirtualTopic) other;
        __CLR4_5_220r520r5lusvnj7p.R.inc(94312);int size = queueMap.size();
        __CLR4_5_220r520r5lusvnj7p.R.inc(94313);if ((((size != vt.queueMap.size())&&(__CLR4_5_220r520r5lusvnj7p.R.iget(94314)!=0|true))||(__CLR4_5_220r520r5lusvnj7p.R.iget(94315)==0&false))) {{
            __CLR4_5_220r520r5lusvnj7p.R.inc(94316);return true;
        }
        }__CLR4_5_220r520r5lusvnj7p.R.inc(94317);for (Integer id : queueMap.keySet()) {{
            __CLR4_5_220r520r5lusvnj7p.R.inc(94318);if ((((!vt.queueMap.containsKey(id))&&(__CLR4_5_220r520r5lusvnj7p.R.iget(94319)!=0|true))||(__CLR4_5_220r520r5lusvnj7p.R.iget(94320)==0&false))) {{
                __CLR4_5_220r520r5lusvnj7p.R.inc(94321);return true;
            }
        }}
        }__CLR4_5_220r520r5lusvnj7p.R.inc(94322);return false;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    public boolean relationChanged(Object other) {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94323);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94324);if ((((!(other instanceof VirtualTopic))&&(__CLR4_5_220r520r5lusvnj7p.R.iget(94325)!=0|true))||(__CLR4_5_220r520r5lusvnj7p.R.iget(94326)==0&false))) {{
            __CLR4_5_220r520r5lusvnj7p.R.inc(94327);return false;
        }
        }__CLR4_5_220r520r5lusvnj7p.R.inc(94328);VirtualTopic vt = (VirtualTopic) other;
        __CLR4_5_220r520r5lusvnj7p.R.inc(94329);int size = queueMap.size();
        __CLR4_5_220r520r5lusvnj7p.R.inc(94330);if ((((size != vt.queueMap.size())&&(__CLR4_5_220r520r5lusvnj7p.R.iget(94331)!=0|true))||(__CLR4_5_220r520r5lusvnj7p.R.iget(94332)==0&false))) {{
            __CLR4_5_220r520r5lusvnj7p.R.inc(94333);return true;
        }
        }__CLR4_5_220r520r5lusvnj7p.R.inc(94334);for (Integer id : queueMap.keySet()) {{
            __CLR4_5_220r520r5lusvnj7p.R.inc(94335);if ((((!vt.queueMap.containsKey(id))&&(__CLR4_5_220r520r5lusvnj7p.R.iget(94336)!=0|true))||(__CLR4_5_220r520r5lusvnj7p.R.iget(94337)==0&false))) {{
                __CLR4_5_220r520r5lusvnj7p.R.inc(94338);return true;
            }
        }}
        }__CLR4_5_220r520r5lusvnj7p.R.inc(94339);return false;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    /**
     * @param queueEntity
     */
    public void addQueue(QueueEntity queueEntity) {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94340);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94341);this.queueMap.put(queueEntity.getId(), queueEntity);
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    public int getQueueLimit() {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94342);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94343);return queueLimit;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

    public void setQueueLimit(int queueLimit) {try{__CLR4_5_220r520r5lusvnj7p.R.inc(94344);
        __CLR4_5_220r520r5lusvnj7p.R.inc(94345);this.queueLimit = queueLimit;
    }finally{__CLR4_5_220r520r5lusvnj7p.R.flushNeeded();}}

}
