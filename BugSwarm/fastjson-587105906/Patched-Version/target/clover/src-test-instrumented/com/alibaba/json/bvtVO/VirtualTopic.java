/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO;

import java.util.HashMap;
import java.util.Map;

public class VirtualTopic {public static class __CLR4_5_21zsx1zsxlusyjw7v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,93114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long         serialVersionUID = 1115397330651723322L;

    private Map<Integer, QueueEntity> queueMap         = new HashMap<Integer, QueueEntity>();
    private Integer                   queueCount;

    private int                       queueLimit;

    private String                    description;

    public VirtualTopic(){try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93057);

    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    public String getDescription() {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93058);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93059);return description;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    public void setDescription(String description) {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93060);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93061);this.description = description;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    /**
     * @return the queueList
     */
    public Map<Integer, QueueEntity> getQueueMap() {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93062);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93063);return queueMap;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    /**
     * @param queueList the queueList to set
     */
    public void setQueueMap(Map<Integer, QueueEntity> queueMap) {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93064);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93065);this.queueMap = queueMap;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    /**
     * @return the queueCount
     */
    public Integer getQueueCount() {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93066);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93067);if ((((queueCount != null)&&(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93068)!=0|true))||(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93069)==0&false))) {{
            __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93070);return queueCount;
        } }else {{
            __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93071);return queueMap.size();
        }
    }}finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    /**
     * @param queueCount the queueCount to set
     */
    public void setQueueCount(Integer queueCount) {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93072);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93073);this.queueCount = queueCount;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    public boolean propertiesChanged(Object other) {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93074);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93075);if ((((!(other instanceof VirtualTopic))&&(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93076)!=0|true))||(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93077)==0&false))) {{
            __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93078);return false;
        }
        }__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93079);VirtualTopic vt = (VirtualTopic) other;
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93080);int size = queueMap.size();
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93081);if ((((size != vt.queueMap.size())&&(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93082)!=0|true))||(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93083)==0&false))) {{
            __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93084);return true;
        }
        }__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93085);for (Integer id : queueMap.keySet()) {{
            __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93086);if ((((!vt.queueMap.containsKey(id))&&(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93087)!=0|true))||(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93088)==0&false))) {{
                __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93089);return true;
            }
        }}
        }__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93090);return false;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    public boolean relationChanged(Object other) {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93091);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93092);if ((((!(other instanceof VirtualTopic))&&(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93093)!=0|true))||(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93094)==0&false))) {{
            __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93095);return false;
        }
        }__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93096);VirtualTopic vt = (VirtualTopic) other;
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93097);int size = queueMap.size();
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93098);if ((((size != vt.queueMap.size())&&(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93099)!=0|true))||(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93100)==0&false))) {{
            __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93101);return true;
        }
        }__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93102);for (Integer id : queueMap.keySet()) {{
            __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93103);if ((((!vt.queueMap.containsKey(id))&&(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93104)!=0|true))||(__CLR4_5_21zsx1zsxlusyjw7v.R.iget(93105)==0&false))) {{
                __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93106);return true;
            }
        }}
        }__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93107);return false;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    /**
     * @param queueEntity
     */
    public void addQueue(QueueEntity queueEntity) {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93108);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93109);this.queueMap.put(queueEntity.getId(), queueEntity);
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    public int getQueueLimit() {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93110);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93111);return queueLimit;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

    public void setQueueLimit(int queueLimit) {try{__CLR4_5_21zsx1zsxlusyjw7v.R.inc(93112);
        __CLR4_5_21zsx1zsxlusyjw7v.R.inc(93113);this.queueLimit = queueLimit;
    }finally{__CLR4_5_21zsx1zsxlusyjw7v.R.flushNeeded();}}

}
