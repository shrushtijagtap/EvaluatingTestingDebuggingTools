/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2200.issue2224;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class KeyedCollection<TKey, TItem> implements CollectionEx<TItem>, Cloneable {public static class __CLR4_1_101dbv1dbvlusqkbte{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,63998,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private transient Map<TKey, TItem> items = new LinkedHashMap<TKey, TItem>();

    protected abstract TKey getKeyForItem(TItem item);

    public TItem get(TKey key) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63931);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63932);return this.items.get(key);
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    //region override

    @Override
    public int size() {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63933);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63934);return this.items.size();
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public boolean isEmpty() {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63935);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63936);return this.items.isEmpty();
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public boolean contains(Object key) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63937);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63938);return this.items.containsKey(key);
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public Iterator<TItem> iterator() {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63939);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63940);return this.items.values().iterator();
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public Object[] toArray() {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63941);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63942);return this.items.values().toArray();
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public <T> T[] toArray(T[] a) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63943);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63944);return this.items.values().toArray(a);
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public boolean add(TItem item) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63945);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63946);if ((((item == null)&&(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63947)!=0|true))||(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63948)==0&false)))
            {__CLR4_1_101dbv1dbvlusqkbte.R.inc(63949);throw new IllegalArgumentException("item can not be null.");
        }__CLR4_1_101dbv1dbvlusqkbte.R.inc(63950);TKey key = this.getKeyForItem(item);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63951);this.items.put(key, item);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63952);return true;
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public boolean remove(Object key) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63953);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63954);return this.items.remove(key) != null;
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public boolean containsAll(Collection<?> keys) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63955);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63956);return this.items.keySet().containsAll(keys);
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public boolean addAll(Collection<? extends TItem> items) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63957);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63958);boolean modified = false;
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63959);for (TItem item : items)
            {__CLR4_1_101dbv1dbvlusqkbte.R.inc(63960);modified |= this.add(item);
        }__CLR4_1_101dbv1dbvlusqkbte.R.inc(63961);return modified;
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public boolean removeAll(Collection<?> keys) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63962);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63963);boolean modified = false;
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63964);for (Object key : keys)
            {__CLR4_1_101dbv1dbvlusqkbte.R.inc(63965);modified |= this.remove(key);
        }__CLR4_1_101dbv1dbvlusqkbte.R.inc(63966);return modified;
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public boolean retainAll(Collection<?> keys) {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63967);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63968);boolean modified = false;
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63969);for (TKey key : this.items.keySet()) {{
            __CLR4_1_101dbv1dbvlusqkbte.R.inc(63970);if ((((!keys.contains(key))&&(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63971)!=0|true))||(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63972)==0&false)))
                {__CLR4_1_101dbv1dbvlusqkbte.R.inc(63973);modified |= this.remove(key);
        }}
        }__CLR4_1_101dbv1dbvlusqkbte.R.inc(63974);return modified;
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public void clear() {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63975);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63976);this.items.clear();
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_1_101dbv1dbvlusqkbte.R.inc(63977);
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63978);StringBuilder builder = new StringBuilder();
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63979);builder.append('[');
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63980);TItem item;
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63981);Iterator<TItem> iterator = this.iterator();
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63982);if ((((iterator.hasNext())&&(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63983)!=0|true))||(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63984)==0&false))) {{
            __CLR4_1_101dbv1dbvlusqkbte.R.inc(63985);item = iterator.next();
            __CLR4_1_101dbv1dbvlusqkbte.R.inc(63986);builder.append((((item == this )&&(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63987)!=0|true))||(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63988)==0&false))? "(this Collection)" : item);
        }
        }__CLR4_1_101dbv1dbvlusqkbte.R.inc(63989);while ((((iterator.hasNext())&&(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63990)!=0|true))||(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63991)==0&false))) {{
            __CLR4_1_101dbv1dbvlusqkbte.R.inc(63992);item = iterator.next();
            __CLR4_1_101dbv1dbvlusqkbte.R.inc(63993);builder.append(", ").append((((item == this )&&(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63994)!=0|true))||(__CLR4_1_101dbv1dbvlusqkbte.R.iget(63995)==0&false))? "(this Collection)" : item);
        }
        }__CLR4_1_101dbv1dbvlusqkbte.R.inc(63996);builder.append(']');
        __CLR4_1_101dbv1dbvlusqkbte.R.inc(63997);return builder.toString();
    }finally{__CLR4_1_101dbv1dbvlusqkbte.R.flushNeeded();}}

    //endregion
}
