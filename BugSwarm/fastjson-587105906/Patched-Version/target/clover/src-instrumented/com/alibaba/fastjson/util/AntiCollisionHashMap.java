/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.util;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 * @deprecated
 */
public class AntiCollisionHashMap<K, V> extends AbstractMap<K, V> implements
        Map<K, V>, Cloneable, Serializable {public static class __CLR4_5_2pbfpbflusvmwzx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,33328,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    transient volatile Set<K> keySet = null;
    transient volatile Collection<V> values = null;

    /**
     * The default initial capacity - MUST be a power of two.
     */
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    /**
     * The maximum capacity, used if a higher value is implicitly specified by
     * either of the constructors with arguments. MUST be a power of two <=
     * 1<<30.
     */
    static final int MAXIMUM_CAPACITY = 1 << 30;

    /**
     * The load factor used when none specified in constructor.
     */
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    /**
     * The table, resized as necessary. Length MUST Always be a power of two.
     */
    transient Entry<K, V>[] table;

    /**
     * The number of key-value mappings contained in this map.
     */
    transient int size;

    /**
     * The next size value at which to resize (capacity * load factor).
     *
     * @serial
     */
    int threshold;

    /**
     * The load factor for the hash table.
     *
     * @serial
     */
    final float loadFactor;

    /**
     * The number of times this SafelyHashMap has been structurally modified
     * Structural modifications are those that change the number of mappings in
     * the SafelyHashMap or otherwise modify its internal structure (e.g.,
     * rehash). This field is used to make iterators on Collection-views of the
     * SafelyHashMap fail-fast. (See ConcurrentModificationException).
     */
    transient volatile int modCount;

    /**
     * Constructs an empty <tt>SafelyHashMap</tt> with the specified initial
     * capacity and load factor.
     *
     * @param initialCapacity
     *            the initial capacity
     * @param loadFactor
     *            the load factor
     * @throws IllegalArgumentException
     *             if the initial capacity is negative or the load factor is
     *             nonpositive
     */

    final static int M_MASK = 0x8765fed3;
    final static int SEED = -2128831035;
    final static int KEY = 16777619;

    final int random = new Random().nextInt(99999); // a fixed value in an instance
    private int hashString(String key) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32811);

        __CLR4_5_2pbfpbflusvmwzx.R.inc(32812);int hash = SEED * random;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32813);for (int i = 0; (((i < key.length())&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32814)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32815)==0&false)); i++)
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32816);hash = (hash * KEY) ^ key.charAt(i);
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32817);return (hash ^ (hash >> 1)) & M_MASK;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    public AntiCollisionHashMap(int initialCapacity, float loadFactor) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32818);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32819);if ((((initialCapacity < 0)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32820)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32821)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32822);throw new IllegalArgumentException("Illegal initial capacity: "
                    + initialCapacity);
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32823);if ((((initialCapacity > MAXIMUM_CAPACITY)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32824)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32825)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32826);initialCapacity = MAXIMUM_CAPACITY;
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32827);if ((((loadFactor <= 0 || Float.isNaN(loadFactor))&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32828)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32829)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32830);throw new IllegalArgumentException("Illegal load factor: "
                    + loadFactor);

        // Find a power of 2 >= initialCapacity
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32831);int capacity = 1;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32832);while ((((capacity < initialCapacity)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32833)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32834)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32835);capacity <<= 1;

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32836);this.loadFactor = loadFactor;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32837);threshold = (int) (capacity * loadFactor);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32838);table = new Entry[capacity];
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32839);init();
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Constructs an empty <tt>SafelyHashMap</tt> with the specified initial
     * capacity and the default load factor (0.75).
     *
     * @param initialCapacity
     *            the initial capacity.
     * @throws IllegalArgumentException
     *             if the initial capacity is negative.
     */
    public AntiCollisionHashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);__CLR4_5_2pbfpbflusvmwzx.R.inc(32841);try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32840);
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Constructs an empty <tt>SafelyHashMap</tt> with the default initial
     * capacity (16) and the default load factor (0.75).
     */
    public AntiCollisionHashMap() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32842);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32843);this.loadFactor = DEFAULT_LOAD_FACTOR;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32844);threshold = (int) (DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32845);table = new Entry[DEFAULT_INITIAL_CAPACITY];
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32846);init();
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Constructs a new <tt>SafelyHashMap</tt> with the same mappings as the
     * specified <tt>Map</tt>. The <tt>SafelyHashMap</tt> is created with
     * default load factor (0.75) and an initial capacity sufficient to hold the
     * mappings in the specified <tt>Map</tt>.
     *
     * @param m
     *            the map whose mappings are to be placed in this map
     * @throws NullPointerException
     *             if the specified map is null
     */
    public AntiCollisionHashMap(Map<? extends K, ? extends V> m) {
        this(Math.max((int) (m.size() / DEFAULT_LOAD_FACTOR) + 1,
                DEFAULT_INITIAL_CAPACITY), DEFAULT_LOAD_FACTOR);__CLR4_5_2pbfpbflusvmwzx.R.inc(32848);try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32847);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32849);putAllForCreate(m);
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    // internal utilities

    /**
     * Initialization hook for subclasses. This method is called in all
     * constructors and pseudo-constructors (clone, readObject) after
     * SafelyHashMap has been initialized but before any entries have been
     * inserted. (In the absence of this method, readObject would require
     * explicit knowledge of subclasses.)
     */
    void init() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32850);
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Applies a supplemental hash function to a given hashCode, which defends
     * against poor quality hash functions. This is critical because
     * SafelyHashMap uses power-of-two length hash tables, that otherwise
     * encounter collisions for hashCodes that do not differ in lower bits.
     * Note: Null keys always map to hash 0, thus index 0.
     */
    static int hash(int h) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32851);
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32852);h = h * h;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32853);h ^= (h >>> 20) ^ (h >>> 12);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32854);return h ^ (h >>> 7) ^ (h >>> 4);
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Returns index for hash code h.
     */
    static int indexFor(int h, int length) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32855);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32856);return h & (length - 1);
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
    public int size() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32857);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32858);return size;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Returns <tt>true</tt> if this map contains no key-value mappings.
     *
     * @return <tt>true</tt> if this map contains no key-value mappings
     */
    public boolean isEmpty() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32859);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32860);return size == 0;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Returns the value to which the specified key is mapped, or {@code null}
     * if this map contains no mapping for the key.
     *
     * <p>
     * More formally, if this map contains a mapping from a key {@code k} to a
     * value {@code v} such that {@code (key==null ? k==null :
     * key.equals(k))}, then this method returns {@code v}; otherwise it returns
     * {@code null}. (There can be at most one such mapping.)
     *
     * <p>
     * A return value of {@code null} does not <i>necessarily</i> indicate that
     * the map contains no mapping for the key; it's also possible that the map
     * explicitly maps the key to {@code null}. The {@link #containsKey
     * containsKey} operation may be used to distinguish these two cases.
     *
     * @see #put(Object, Object)
     */
    public V get(Object key) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32861);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32862);if ((((key == null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32863)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32864)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32865);return getForNullKey();
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32866);int hash = 0;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32867);if ((((key instanceof String)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32868)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32869)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32870);hash = hash(hashString((String) key));
        }else
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32871);hash = hash(key.hashCode());
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32872);for (Entry<K, V> e = table[indexFor(hash, table.length)]; (((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32873)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32874)==0&false)); e = e.next) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32875);Object k;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32876);if (e.hash == hash && ((k = e.key) == key || key.equals(k)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(32879);return e.value;
        }}
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32880);return null;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Offloaded version of get() to look up null keys. Null keys map to index
     * 0. This null case is split out into separate methods for the sake of
     * performance in the two most commonly used operations (get and put), but
     * incorporated with conditionals in others.
     */
    private V getForNullKey() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32881);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32882);for (Entry<K, V> e = table[0]; (((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32883)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32884)==0&false)); e = e.next) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32885);if ((((e.key == null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32886)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32887)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(32888);return e.value;
        }}
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32889);return null;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the specified
     * key.
     *
     * @param key
     *            The key whose presence in this map is to be tested
     * @return <tt>true</tt> if this map contains a mapping for the specified
     *         key.
     */
    public boolean containsKey(Object key) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32890);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32891);return getEntry(key) != null;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Returns the entry associated with the specified key in the SafelyHashMap.
     * Returns null if the SafelyHashMap contains no mapping for the key.
     */
    final Entry<K, V> getEntry(Object key) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32892);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32893);int hash = ((((key == null) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32894)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32895)==0&false))? 0
                : ((((key instanceof String) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32896)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32897)==0&false))? hash(hashString((String) key))
                : hash(key.hashCode());
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32898);for (Entry<K, V> e = table[indexFor(hash, table.length)]; (((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32899)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32900)==0&false)); e = e.next) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32901);Object k;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32902);if (e.hash == hash
                    && ((k = e.key) == key || (key != null && key.equals(k))))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(32905);return e;
        }}
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32906);return null;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Associates the specified value with the specified key in this map. If the
     * map previously contained a mapping for the key, the old value is
     * replaced.
     *
     * @param key
     *            key with which the specified value is to be associated
     * @param value
     *            value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or <tt>null</tt>
     *         if there was no mapping for <tt>key</tt>. (A <tt>null</tt> return
     *         can also indicate that the map previously associated
     *         <tt>null</tt> with <tt>key</tt>.)
     */
    public V put(K key, V value) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32907);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32908);if ((((key == null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32909)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32910)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32911);return putForNullKey(value);
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32912);int hash = 0;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32913);if ((((key instanceof String)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32914)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32915)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32916);hash = hash(hashString((String) key));
        }else
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(32917);hash = hash(key.hashCode());
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32918);int i = indexFor(hash, table.length);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32919);for (Entry<K, V> e = table[i]; (((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32920)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32921)==0&false)); e = e.next) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32922);Object k;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32923);if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32926);V oldValue = e.value;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32927);e.value = value;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32928);return oldValue;
            }
        }}

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32929);modCount++;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32930);addEntry(hash, key, value, i);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32931);return null;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Offloaded version of put for null keys
     */
    private V putForNullKey(V value) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32932);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32933);for (Entry<K, V> e = table[0]; (((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32934)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32935)==0&false)); e = e.next) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32936);if ((((e.key == null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32937)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32938)==0&false))) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32939);V oldValue = e.value;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32940);e.value = value;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32941);return oldValue;
            }
        }}
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32942);modCount++;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32943);addEntry(0, null, value, 0);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32944);return null;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * This method is used instead of put by constructors and pseudoconstructors
     * (clone, readObject). It does not resize the table, check for
     * comodification, etc. It calls createEntry rather than addEntry.
     */
    private void putForCreate(K key, V value) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32945);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32946);int hash = ((((key == null) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32947)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32948)==0&false))? 0
                : ((((key instanceof String) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32949)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32950)==0&false))? hash(hashString((String) key))
                : hash(key.hashCode());
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32951);int i = indexFor(hash, table.length);

        /**
         * Look for preexisting entry for key. This will never happen for clone
         * or deserialize. It will only happen for construction if the input Map
         * is a sorted map whose ordering is inconsistent w/ equals.
         */
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32952);for (Entry<K, V> e = table[i]; (((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32953)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32954)==0&false)); e = e.next) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32955);Object k;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32956);if (e.hash == hash
                    && ((k = e.key) == key || (key != null && key.equals(k)))) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32959);e.value = value;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32960);return;
            }
        }}

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32961);createEntry(hash, key, value, i);
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    private void putAllForCreate(Map<? extends K, ? extends V> m) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32962);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32963);for (Iterator<? extends Map.Entry<? extends K, ? extends V>> i = m
                .entrySet().iterator(); (((i.hasNext())&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32964)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32965)==0&false));) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32966);Map.Entry<? extends K, ? extends V> e = i.next();
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32967);putForCreate(e.getKey(), e.getValue());
        }
    }}finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Rehashes the contents of this map into a new array with a larger
     * capacity. This method is called automatically when the number of keys in
     * this map reaches its threshold.
     *
     * If current capacity is MAXIMUM_CAPACITY, this method does not resize the
     * map, but sets threshold to Integer.MAX_VALUE. This has the effect of
     * preventing future calls.
     *
     * @param newCapacity
     *            the new capacity, MUST be a power of two; must be greater than
     *            current capacity unless current capacity is MAXIMUM_CAPACITY
     *            (in which case value is irrelevant).
     */
    void resize(int newCapacity) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32968);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32969);Entry<K, V>[] oldTable = table;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32970);int oldCapacity = oldTable.length;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32971);if ((((oldCapacity == MAXIMUM_CAPACITY)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32972)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32973)==0&false))) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32974);threshold = Integer.MAX_VALUE;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32975);return;
        }

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(32976);Entry<K, V>[] newTable = new Entry[newCapacity];
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32977);transfer(newTable);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32978);table = newTable;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32979);threshold = (int) (newCapacity * loadFactor);
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Transfers all entries from current table to newTable.
     */
    void transfer(Entry[] newTable) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32980);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32981);Entry[] src = table;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32982);int newCapacity = newTable.length;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(32983);for (int j = 0; (((j < src.length)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32984)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32985)==0&false)); j++) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32986);Entry<K, V> e = src[j];
            __CLR4_5_2pbfpbflusvmwzx.R.inc(32987);if ((((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32988)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32989)==0&false))) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32990);src[j] = null;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(32991);do {{
                    __CLR4_5_2pbfpbflusvmwzx.R.inc(32992);Entry<K, V> next = e.next;
                    __CLR4_5_2pbfpbflusvmwzx.R.inc(32993);int i = indexFor(e.hash, newCapacity);
                    __CLR4_5_2pbfpbflusvmwzx.R.inc(32994);e.next = newTable[i];
                    __CLR4_5_2pbfpbflusvmwzx.R.inc(32995);newTable[i] = e;
                    __CLR4_5_2pbfpbflusvmwzx.R.inc(32996);e = next;
                } }while ((((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(32997)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(32998)==0&false)));
            }
        }}
    }}finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Copies all of the mappings from the specified map to this map. These
     * mappings will replace any mappings that this map had for any of the keys
     * currently in the specified map.
     *
     * @param m
     *            mappings to be stored in this map
     * @throws NullPointerException
     *             if the specified map is null
     */
    public void putAll(Map<? extends K, ? extends V> m) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(32999);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33000);int numKeysToBeAdded = m.size();
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33001);if ((((numKeysToBeAdded == 0)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33002)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33003)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(33004);return;

		/*
		 * Expand the map if the map if the number of mappings to be added is
		 * greater than or equal to threshold. This is conservative; the obvious
		 * condition is (m.size() + size) >= threshold, but this condition could
		 * result in a map with twice the appropriate capacity, if the keys to
		 * be added overlap with the keys already in this map. By using the
		 * conservative calculation, we subject ourself to at most one extra
		 * resize.
		 */
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(33005);if ((((numKeysToBeAdded > threshold)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33006)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33007)==0&false))) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33008);int targetCapacity = (int) (numKeysToBeAdded / loadFactor + 1);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33009);if ((((targetCapacity > MAXIMUM_CAPACITY)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33010)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33011)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33012);targetCapacity = MAXIMUM_CAPACITY;
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33013);int newCapacity = table.length;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33014);while ((((newCapacity < targetCapacity)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33015)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33016)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33017);newCapacity <<= 1;
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33018);if ((((newCapacity > table.length)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33019)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33020)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33021);resize(newCapacity);
        }}

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(33022);for (Iterator<? extends Map.Entry<? extends K, ? extends V>> i = m
                .entrySet().iterator(); (((i.hasNext())&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33023)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33024)==0&false));) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33025);Map.Entry<? extends K, ? extends V> e = i.next();
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33026);put(e.getKey(), e.getValue());
        }
    }}finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Removes the mapping for the specified key from this map if present.
     *
     * @param key
     *            key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or <tt>null</tt>
     *         if there was no mapping for <tt>key</tt>. (A <tt>null</tt> return
     *         can also indicate that the map previously associated
     *         <tt>null</tt> with <tt>key</tt>.)
     */
    public V remove(Object key) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33027);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33028);Entry<K, V> e = removeEntryForKey(key);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33029);return ((((e == null )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33030)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33031)==0&false))? null : e.value);
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Removes and returns the entry associated with the specified key in the
     * SafelyHashMap. Returns null if the SafelyHashMap contains no mapping for
     * this key.
     */
    final Entry<K, V> removeEntryForKey(Object key) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33032);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33033);int hash = ((((key == null) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33034)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33035)==0&false))? 0
                : ((((key instanceof String) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33036)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33037)==0&false))? hash(hashString((String) key))
                : hash(key.hashCode());
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33038);int i = indexFor(hash, table.length);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33039);Entry<K, V> prev = table[i];
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33040);Entry<K, V> e = prev;

        __CLR4_5_2pbfpbflusvmwzx.R.inc(33041);while ((((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33042)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33043)==0&false))) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33044);Entry<K, V> next = e.next;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33045);Object k;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33046);if (e.hash == hash
                    && ((k = e.key) == key || (key != null && key.equals(k)))) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33049);modCount++;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33050);size--;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33051);if ((((prev == e)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33052)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33053)==0&false)))
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33054);table[i] = next;
                }else
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33055);prev.next = next;
                }__CLR4_5_2pbfpbflusvmwzx.R.inc(33056);return e;
            }
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33057);prev = e;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33058);e = next;
        }

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(33059);return e;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Special version of remove for EntrySet.
     */
    final Entry<K, V> removeMapping(Object o) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33060);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33061);if ((((!(o instanceof Map.Entry))&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33062)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33063)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(33064);return null;

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(33065);Map.Entry<K, V> entry = (Map.Entry<K, V>) o;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33066);Object key = entry.getKey();
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33067);int hash = ((((key == null) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33068)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33069)==0&false))? 0
                : ((((key instanceof String) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33070)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33071)==0&false))? hash(hashString((String) key))
                : hash(key.hashCode());
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33072);int i = indexFor(hash, table.length);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33073);Entry<K, V> prev = table[i];
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33074);Entry<K, V> e = prev;

        __CLR4_5_2pbfpbflusvmwzx.R.inc(33075);while ((((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33076)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33077)==0&false))) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33078);Entry<K, V> next = e.next;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33079);if ((((e.hash == hash && e.equals(entry))&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33080)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33081)==0&false))) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33082);modCount++;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33083);size--;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33084);if ((((prev == e)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33085)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33086)==0&false)))
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33087);table[i] = next;
                }else
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33088);prev.next = next;
                }__CLR4_5_2pbfpbflusvmwzx.R.inc(33089);return e;
            }
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33090);prev = e;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33091);e = next;
        }

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(33092);return e;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Removes all of the mappings from this map. The map will be empty after
     * this call returns.
     */
    public void clear() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33093);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33094);modCount++;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33095);Entry[] tab = table;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33096);for (int i = 0; (((i < tab.length)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33097)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33098)==0&false)); i++)
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(33099);tab[i] = null;
        }__CLR4_5_2pbfpbflusvmwzx.R.inc(33100);size = 0;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the specified
     * value.
     *
     * @param value
     *            value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to the specified
     *         value
     */
    public boolean containsValue(Object value) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33101);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33102);if ((((value == null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33103)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33104)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(33105);return containsNullValue();

        }__CLR4_5_2pbfpbflusvmwzx.R.inc(33106);Entry[] tab = table;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33107);for (int i = 0; (((i < tab.length)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33108)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33109)==0&false)); i++)
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(33110);for (Entry e = tab[i]; (((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33111)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33112)==0&false)); e = e.next)
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33113);if ((((value.equals(e.value))&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33114)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33115)==0&false)))
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33116);return true;
        }}}__CLR4_5_2pbfpbflusvmwzx.R.inc(33117);return false;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Special-case code for containsValue with null argument
     */
    private boolean containsNullValue() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33118);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33119);Entry[] tab = table;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33120);for (int i = 0; (((i < tab.length)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33121)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33122)==0&false)); i++)
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(33123);for (Entry e = tab[i]; (((e != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33124)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33125)==0&false)); e = e.next)
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33126);if ((((e.value == null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33127)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33128)==0&false)))
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33129);return true;
        }}}__CLR4_5_2pbfpbflusvmwzx.R.inc(33130);return false;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Returns a shallow copy of this <tt>SafelyHashMap</tt> instance: the keys
     * and values themselves are not cloned.
     *
     * @return a shallow copy of this map
     */
    public Object clone() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33131);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33132);AntiCollisionHashMap<K, V> result = null;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33133);try {
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33134);result = (AntiCollisionHashMap<K, V>) super.clone();
        } catch (CloneNotSupportedException e) {
            // assert false;
        }
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33135);result.table = new Entry[table.length];
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33136);result.entrySet = null;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33137);result.modCount = 0;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33138);result.size = 0;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33139);result.init();
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33140);result.putAllForCreate(this);

        __CLR4_5_2pbfpbflusvmwzx.R.inc(33141);return result;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    static class Entry<K, V> implements Map.Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;
        final int hash;

        /**
         * Creates new entry.
         */
        Entry(int h, K k, V v, Entry<K, V> n) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33142);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33143);value = v;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33144);next = n;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33145);key = k;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33146);hash = h;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public final K getKey() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33147);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33148);return key;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public final V getValue() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33149);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33150);return value;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public final V setValue(V newValue) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33151);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33152);V oldValue = value;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33153);value = newValue;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33154);return oldValue;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public final boolean equals(Object o) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33155);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33156);if ((((!(o instanceof Map.Entry))&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33157)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33158)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33159);return false;
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33160);Map.Entry e = (Map.Entry) o;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33161);Object k1 = getKey();
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33162);Object k2 = e.getKey();
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33163);if ((((k1 == k2 || (k1 != null && k1.equals(k2)))&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33164)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33165)==0&false))) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33166);Object v1 = getValue();
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33167);Object v2 = e.getValue();
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33168);if ((((v1 == v2 || (v1 != null && v1.equals(v2)))&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33169)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33170)==0&false)))
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33171);return true;
            }}
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33172);return false;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public final int hashCode() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33173);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33174);return ((((key == null )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33175)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33176)==0&false))? 0 : key.hashCode())
                    ^ ((((value == null )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33177)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33178)==0&false))? 0 : value.hashCode());
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public final String toString() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33179);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33180);return getKey() + "=" + getValue();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    }

    /**
     * Adds a new entry with the specified key, value and hash code to the
     * specified bucket. It is the responsibility of this method to resize the
     * table if appropriate.
     *
     * Subclass overrides this to alter the behavior of put method.
     */
    void addEntry(int hash, K key, V value, int bucketIndex) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33181);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33182);Entry<K, V> e = table[bucketIndex];
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33183);table[bucketIndex] = new Entry<K, V>(hash, key, value, e);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33184);if ((((size++ >= threshold)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33185)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33186)==0&false)))
            {__CLR4_5_2pbfpbflusvmwzx.R.inc(33187);resize(2 * table.length);
    }}finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    /**
     * Like addEntry except that this version is used when creating entries as
     * part of Map construction or "pseudo-construction" (cloning,
     * deserialization). This version needn't worry about resizing the table.
     *
     * Subclass overrides this to alter the behavior of SafelyHashMap(Map),
     * clone, and readObject.
     */
    void createEntry(int hash, K key, V value, int bucketIndex) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33188);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33189);Entry<K, V> e = table[bucketIndex];
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33190);table[bucketIndex] = new Entry<K, V>(hash, key, value, e);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33191);size++;
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    private abstract class HashIterator<E> implements Iterator<E> {
        Entry<K, V> next; // next entry to return
        int expectedModCount; // For fast-fail
        int index; // current slot
        Entry<K, V> current; // current entry

        HashIterator() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33192);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33193);expectedModCount = modCount;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33194);if ((((size > 0)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33195)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33196)==0&false))) {{ // advance to first entry
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33197);Entry[] t = table;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33198);while (index < t.length && (next = t[index++]) == null)
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33201);;
            }}
        }}finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public final boolean hasNext() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33202);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33203);return next != null;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        final Entry<K, V> nextEntry() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33204);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33205);if ((((modCount != expectedModCount)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33206)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33207)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33208);throw new ConcurrentModificationException();
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33209);Entry<K, V> e = next;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33210);if ((((e == null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33211)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33212)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33213);throw new NoSuchElementException();

            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33214);if ((next = e.next) == null) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33217);Entry[] t = table;
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33218);while (index < t.length && (next = t[index++]) == null)
                    {__CLR4_5_2pbfpbflusvmwzx.R.inc(33221);;
            }}
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33222);current = e;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33223);return e;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public void remove() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33224);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33225);if ((((current == null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33226)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33227)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33228);throw new IllegalStateException();
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33229);if ((((modCount != expectedModCount)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33230)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33231)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33232);throw new ConcurrentModificationException();
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33233);Object k = current.key;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33234);current = null;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33235);AntiCollisionHashMap.this.removeEntryForKey(k);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33236);expectedModCount = modCount;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    }

    private final class ValueIterator extends HashIterator<V> {
        public V next() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33237);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33238);return nextEntry().value;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}
    }

    private final class KeyIterator extends HashIterator<K> {
        public K next() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33239);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33240);return nextEntry().getKey();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}
    }

    private final class EntryIterator extends HashIterator<Map.Entry<K, V>> {
        public Map.Entry<K, V> next() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33241);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33242);return nextEntry();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}
    }

    // Subclass overrides these to alter behavior of views' iterator() method
    Iterator<K> newKeyIterator() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33243);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33244);return new KeyIterator();
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    Iterator<V> newValueIterator() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33245);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33246);return new ValueIterator();
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    Iterator<Map.Entry<K, V>> newEntryIterator() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33247);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33248);return new EntryIterator();
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    // Views

    private transient Set<Map.Entry<K, V>> entrySet = null;

    /**
     * Returns a {@link Set} view of the keys contained in this map. The set is
     * backed by the map, so changes to the map are reflected in the set, and
     * vice-versa. If the map is modified while an iteration over the set is in
     * progress (except through the iterator's own <tt>remove</tt> operation),
     * the results of the iteration are undefined. The set supports element
     * removal, which removes the corresponding mapping from the map, via the
     * <tt>Iterator.remove</tt>, <tt>Set.remove</tt>, <tt>removeAll</tt>,
     * <tt>retainAll</tt>, and <tt>clear</tt> operations. It does not support
     * the <tt>add</tt> or <tt>addAll</tt> operations.
     */
    public Set<K> keySet() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33249);

        __CLR4_5_2pbfpbflusvmwzx.R.inc(33250);Set<K> ks = keySet;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33251);return ((((ks != null )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33252)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33253)==0&false))? ks : (keySet = new KeySet()));
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    private final class KeySet extends AbstractSet<K> {
        public Iterator<K> iterator() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33254);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33255);return newKeyIterator();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public int size() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33256);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33257);return size;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public boolean contains(Object o) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33258);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33259);return containsKey(o);
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public boolean remove(Object o) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33260);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33261);return AntiCollisionHashMap.this.removeEntryForKey(o) != null;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public void clear() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33262);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33263);AntiCollisionHashMap.this.clear();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}
    }

    /**
     * Returns a {@link Collection} view of the values contained in this map.
     * The collection is backed by the map, so changes to the map are reflected
     * in the collection, and vice-versa. If the map is modified while an
     * iteration over the collection is in progress (except through the
     * iterator's own <tt>remove</tt> operation), the results of the iteration
     * are undefined. The collection supports element removal, which removes the
     * corresponding mapping from the map, via the <tt>Iterator.remove</tt>,
     * <tt>Collection.remove</tt>, <tt>removeAll</tt>, <tt>retainAll</tt> and
     * <tt>clear</tt> operations. It does not support the <tt>add</tt> or
     * <tt>addAll</tt> operations.
     */
    public Collection<V> values() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33264);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33265);Collection<V> vs = values;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33266);return ((((vs != null )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33267)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33268)==0&false))? vs : (values = new Values()));
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    private final class Values extends AbstractCollection<V> {
        public Iterator<V> iterator() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33269);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33270);return newValueIterator();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public int size() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33271);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33272);return size;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public boolean contains(Object o) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33273);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33274);return containsValue(o);
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public void clear() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33275);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33276);AntiCollisionHashMap.this.clear();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}
    }

    /**
     * Returns a {@link Set} view of the mappings contained in this map. The set
     * is backed by the map, so changes to the map are reflected in the set, and
     * vice-versa. If the map is modified while an iteration over the set is in
     * progress (except through the iterator's own <tt>remove</tt> operation, or
     * through the <tt>setValue</tt> operation on a map entry returned by the
     * iterator) the results of the iteration are undefined. The set supports
     * element removal, which removes the corresponding mapping from the map,
     * via the <tt>Iterator.remove</tt>, <tt>Set.remove</tt>, <tt>removeAll</tt>
     * , <tt>retainAll</tt> and <tt>clear</tt> operations. It does not support
     * the <tt>add</tt> or <tt>addAll</tt> operations.
     *
     * @return a set view of the mappings contained in this map
     */
    public Set<Map.Entry<K, V>> entrySet() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33277);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33278);return entrySet0();
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    private Set<Map.Entry<K, V>> entrySet0() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33279);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33280);Set<Map.Entry<K, V>> es = entrySet;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33281);return (((es != null )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33282)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33283)==0&false))? es : (entrySet = new EntrySet());
    }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    private final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public Iterator<Map.Entry<K, V>> iterator() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33284);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33285);return newEntryIterator();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public boolean contains(Object o) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33286);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33287);if ((((!(o instanceof Map.Entry))&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33288)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33289)==0&false)))
                {__CLR4_5_2pbfpbflusvmwzx.R.inc(33290);return false;
            }__CLR4_5_2pbfpbflusvmwzx.R.inc(33291);Map.Entry<K, V> e = (Map.Entry<K, V>) o;
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33292);Entry<K, V> candidate = getEntry(e.getKey());
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33293);return candidate != null && candidate.equals(e);
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public boolean remove(Object o) {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33294);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33295);return removeMapping(o) != null;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public int size() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33296);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33297);return size;
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

        public void clear() {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33298);
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33299);AntiCollisionHashMap.this.clear();
        }finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}
    }

    /**
     * Save the state of the <tt>SafelyHashMap</tt> instance to a stream (i.e.,
     * serialize it).
     *
     * @serialData The <i>capacity</i> of the SafelyHashMap (the length of the
     *             bucket array) is emitted (int), followed by the <i>size</i>
     *             (an int, the number of key-value mappings), followed by the
     *             key (Object) and value (Object) for each key-value mapping.
     *             The key-value mappings are emitted in no particular order.
     */
    private void writeObject(java.io.ObjectOutputStream s) throws IOException {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33300);
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33301);Iterator<Map.Entry<K, V>> i = ((((size > 0) )&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33302)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33303)==0&false))? entrySet0().iterator()
                : null;

        // Write out the threshold, loadfactor, and any hidden stuff
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33304);s.defaultWriteObject();

        // Write out number of buckets
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33305);s.writeInt(table.length);

        // Write out size (number of Mappings)
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33306);s.writeInt(size);

        // Write out keys and values (alternating)
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33307);if ((((i != null)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33308)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33309)==0&false))) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33310);while ((((i.hasNext())&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33311)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33312)==0&false))) {{
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33313);Map.Entry<K, V> e = i.next();
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33314);s.writeObject(e.getKey());
                __CLR4_5_2pbfpbflusvmwzx.R.inc(33315);s.writeObject(e.getValue());
            }
        }}
    }}finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

    private static final long serialVersionUID = 362498820763181265L;

    /**
     * Reconstitute the <tt>SafelyHashMap</tt> instance from a stream (i.e.,
     * deserialize it).
     */
    private void readObject(java.io.ObjectInputStream s) throws IOException,
            ClassNotFoundException {try{__CLR4_5_2pbfpbflusvmwzx.R.inc(33316);
        // Read in the threshold, loadfactor, and any hidden stuff
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33317);s.defaultReadObject();

        // Read in number of buckets and allocate the bucket array;
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33318);int numBuckets = s.readInt();
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33319);table = new Entry[numBuckets];

        __CLR4_5_2pbfpbflusvmwzx.R.inc(33320);init(); // Give subclass a chance to do its thing.

        // Read in size (number of Mappings)
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33321);int size = s.readInt();

        // Read the keys and values, and put the mappings in the SafelyHashMap
        __CLR4_5_2pbfpbflusvmwzx.R.inc(33322);for (int i = 0; (((i < size)&&(__CLR4_5_2pbfpbflusvmwzx.R.iget(33323)!=0|true))||(__CLR4_5_2pbfpbflusvmwzx.R.iget(33324)==0&false)); i++) {{
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33325);K key = (K) s.readObject();
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33326);V value = (V) s.readObject();
            __CLR4_5_2pbfpbflusvmwzx.R.inc(33327);putForCreate(key, value);
        }
    }}finally{__CLR4_5_2pbfpbflusvmwzx.R.flushNeeded();}}

}