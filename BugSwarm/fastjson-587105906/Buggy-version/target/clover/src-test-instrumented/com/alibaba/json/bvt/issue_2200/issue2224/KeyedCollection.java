/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2200.issue2224;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class KeyedCollection<TKey, TItem> implements CollectionEx<TItem>, Cloneable {public static class __CLR4_1_101ea31ea3luszwbpr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,65230,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private transient Map<TKey, TItem> items = new LinkedHashMap<TKey, TItem>();

    protected abstract TKey getKeyForItem(TItem item);

    public TItem get(TKey key) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65163);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65164);return this.items.get(key);
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    //region override

    @Override
    public int size() {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65165);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65166);return this.items.size();
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public boolean isEmpty() {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65167);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65168);return this.items.isEmpty();
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public boolean contains(Object key) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65169);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65170);return this.items.containsKey(key);
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public Iterator<TItem> iterator() {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65171);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65172);return this.items.values().iterator();
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public Object[] toArray() {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65173);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65174);return this.items.values().toArray();
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public <T> T[] toArray(T[] a) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65175);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65176);return this.items.values().toArray(a);
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public boolean add(TItem item) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65177);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65178);if ((((item == null)&&(__CLR4_1_101ea31ea3luszwbpr.R.iget(65179)!=0|true))||(__CLR4_1_101ea31ea3luszwbpr.R.iget(65180)==0&false)))
            {__CLR4_1_101ea31ea3luszwbpr.R.inc(65181);throw new IllegalArgumentException("item can not be null.");
        }__CLR4_1_101ea31ea3luszwbpr.R.inc(65182);TKey key = this.getKeyForItem(item);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65183);this.items.put(key, item);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65184);return true;
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public boolean remove(Object key) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65185);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65186);return this.items.remove(key) != null;
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public boolean containsAll(Collection<?> keys) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65187);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65188);return this.items.keySet().containsAll(keys);
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public boolean addAll(Collection<? extends TItem> items) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65189);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65190);boolean modified = false;
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65191);for (TItem item : items)
            {__CLR4_1_101ea31ea3luszwbpr.R.inc(65192);modified |= this.add(item);
        }__CLR4_1_101ea31ea3luszwbpr.R.inc(65193);return modified;
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public boolean removeAll(Collection<?> keys) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65194);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65195);boolean modified = false;
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65196);for (Object key : keys)
            {__CLR4_1_101ea31ea3luszwbpr.R.inc(65197);modified |= this.remove(key);
        }__CLR4_1_101ea31ea3luszwbpr.R.inc(65198);return modified;
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public boolean retainAll(Collection<?> keys) {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65199);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65200);boolean modified = false;
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65201);for (TKey key : this.items.keySet()) {{
            __CLR4_1_101ea31ea3luszwbpr.R.inc(65202);if ((((!keys.contains(key))&&(__CLR4_1_101ea31ea3luszwbpr.R.iget(65203)!=0|true))||(__CLR4_1_101ea31ea3luszwbpr.R.iget(65204)==0&false)))
                {__CLR4_1_101ea31ea3luszwbpr.R.inc(65205);modified |= this.remove(key);
        }}
        }__CLR4_1_101ea31ea3luszwbpr.R.inc(65206);return modified;
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public void clear() {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65207);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65208);this.items.clear();
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_1_101ea31ea3luszwbpr.R.inc(65209);
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65210);StringBuilder builder = new StringBuilder();
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65211);builder.append('[');
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65212);TItem item;
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65213);Iterator<TItem> iterator = this.iterator();
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65214);if ((((iterator.hasNext())&&(__CLR4_1_101ea31ea3luszwbpr.R.iget(65215)!=0|true))||(__CLR4_1_101ea31ea3luszwbpr.R.iget(65216)==0&false))) {{
            __CLR4_1_101ea31ea3luszwbpr.R.inc(65217);item = iterator.next();
            __CLR4_1_101ea31ea3luszwbpr.R.inc(65218);builder.append((((item == this )&&(__CLR4_1_101ea31ea3luszwbpr.R.iget(65219)!=0|true))||(__CLR4_1_101ea31ea3luszwbpr.R.iget(65220)==0&false))? "(this Collection)" : item);
        }
        }__CLR4_1_101ea31ea3luszwbpr.R.inc(65221);while ((((iterator.hasNext())&&(__CLR4_1_101ea31ea3luszwbpr.R.iget(65222)!=0|true))||(__CLR4_1_101ea31ea3luszwbpr.R.iget(65223)==0&false))) {{
            __CLR4_1_101ea31ea3luszwbpr.R.inc(65224);item = iterator.next();
            __CLR4_1_101ea31ea3luszwbpr.R.inc(65225);builder.append(", ").append((((item == this )&&(__CLR4_1_101ea31ea3luszwbpr.R.iget(65226)!=0|true))||(__CLR4_1_101ea31ea3luszwbpr.R.iget(65227)==0&false))? "(this Collection)" : item);
        }
        }__CLR4_1_101ea31ea3luszwbpr.R.inc(65228);builder.append(']');
        __CLR4_1_101ea31ea3luszwbpr.R.inc(65229);return builder.toString();
    }finally{__CLR4_1_101ea31ea3luszwbpr.R.flushNeeded();}}

    //endregion
}
