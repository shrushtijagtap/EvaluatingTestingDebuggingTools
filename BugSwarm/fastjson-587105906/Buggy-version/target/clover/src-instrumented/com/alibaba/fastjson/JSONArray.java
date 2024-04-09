/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastjson;

import static com.alibaba.fastjson.util.TypeUtils.castToBigDecimal;
import static com.alibaba.fastjson.util.TypeUtils.castToBigInteger;
import static com.alibaba.fastjson.util.TypeUtils.castToBoolean;
import static com.alibaba.fastjson.util.TypeUtils.castToByte;
import static com.alibaba.fastjson.util.TypeUtils.castToDate;
import static com.alibaba.fastjson.util.TypeUtils.castToDouble;
import static com.alibaba.fastjson.util.TypeUtils.castToFloat;
import static com.alibaba.fastjson.util.TypeUtils.castToInt;
import static com.alibaba.fastjson.util.TypeUtils.castToLong;
import static com.alibaba.fastjson.util.TypeUtils.castToShort;
import static com.alibaba.fastjson.util.TypeUtils.castToSqlDate;
import static com.alibaba.fastjson.util.TypeUtils.castToString;
import static com.alibaba.fastjson.util.TypeUtils.castToTimestamp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONArray extends JSON implements List<Object>, Cloneable, RandomAccess, Serializable {public static class __CLR4_1_10ihihlusqj2ge{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long  serialVersionUID = 1L;
    private final List<Object> list;
    protected transient Object relatedArray;
    protected transient Type   componentType;

    public JSONArray(){try{__CLR4_1_10ihihlusqj2ge.R.inc(665);
        __CLR4_1_10ihihlusqj2ge.R.inc(666);this.list = new ArrayList<Object>();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray(List<Object> list){try{__CLR4_1_10ihihlusqj2ge.R.inc(667);
        __CLR4_1_10ihihlusqj2ge.R.inc(668);this.list = list;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray(int initialCapacity){try{__CLR4_1_10ihihlusqj2ge.R.inc(669);
        __CLR4_1_10ihihlusqj2ge.R.inc(670);this.list = new ArrayList<Object>(initialCapacity);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    /**
     * @since 1.1.16
     * @return
     */
    public Object getRelatedArray() {try{__CLR4_1_10ihihlusqj2ge.R.inc(671);
        __CLR4_1_10ihihlusqj2ge.R.inc(672);return relatedArray;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public void setRelatedArray(Object relatedArray) {try{__CLR4_1_10ihihlusqj2ge.R.inc(673);
        __CLR4_1_10ihihlusqj2ge.R.inc(674);this.relatedArray = relatedArray;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Type getComponentType() {try{__CLR4_1_10ihihlusqj2ge.R.inc(675);
        __CLR4_1_10ihihlusqj2ge.R.inc(676);return componentType;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public void setComponentType(Type componentType) {try{__CLR4_1_10ihihlusqj2ge.R.inc(677);
        __CLR4_1_10ihihlusqj2ge.R.inc(678);this.componentType = componentType;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public int size() {try{__CLR4_1_10ihihlusqj2ge.R.inc(679);
        __CLR4_1_10ihihlusqj2ge.R.inc(680);return list.size();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean isEmpty() {try{__CLR4_1_10ihihlusqj2ge.R.inc(681);
        __CLR4_1_10ihihlusqj2ge.R.inc(682);return list.isEmpty();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean contains(Object o) {try{__CLR4_1_10ihihlusqj2ge.R.inc(683);
        __CLR4_1_10ihihlusqj2ge.R.inc(684);return list.contains(o);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Iterator<Object> iterator() {try{__CLR4_1_10ihihlusqj2ge.R.inc(685);
        __CLR4_1_10ihihlusqj2ge.R.inc(686);return list.iterator();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Object[] toArray() {try{__CLR4_1_10ihihlusqj2ge.R.inc(687);
        __CLR4_1_10ihihlusqj2ge.R.inc(688);return list.toArray();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public <T> T[] toArray(T[] a) {try{__CLR4_1_10ihihlusqj2ge.R.inc(689);
        __CLR4_1_10ihihlusqj2ge.R.inc(690);return list.toArray(a);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean add(Object e) {try{__CLR4_1_10ihihlusqj2ge.R.inc(691);
        __CLR4_1_10ihihlusqj2ge.R.inc(692);return list.add(e);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentAdd(Object e) {try{__CLR4_1_10ihihlusqj2ge.R.inc(693);
        __CLR4_1_10ihihlusqj2ge.R.inc(694);list.add(e);
        __CLR4_1_10ihihlusqj2ge.R.inc(695);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean remove(Object o) {try{__CLR4_1_10ihihlusqj2ge.R.inc(696);
        __CLR4_1_10ihihlusqj2ge.R.inc(697);return list.remove(o);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentRemove(Object o) {try{__CLR4_1_10ihihlusqj2ge.R.inc(698);
        __CLR4_1_10ihihlusqj2ge.R.inc(699);list.remove(o);
        __CLR4_1_10ihihlusqj2ge.R.inc(700);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean containsAll(Collection<?> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(701);
        __CLR4_1_10ihihlusqj2ge.R.inc(702);return list.containsAll(c);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean addAll(Collection<? extends Object> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(703);
        __CLR4_1_10ihihlusqj2ge.R.inc(704);return list.addAll(c);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentAddAll(Collection<? extends Object> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(705);
        __CLR4_1_10ihihlusqj2ge.R.inc(706);list.addAll(c);
        __CLR4_1_10ihihlusqj2ge.R.inc(707);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean addAll(int index, Collection<? extends Object> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(708);
        __CLR4_1_10ihihlusqj2ge.R.inc(709);return list.addAll(index, c);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentAddAll(int index, Collection<? extends Object> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(710);
        __CLR4_1_10ihihlusqj2ge.R.inc(711);list.addAll(index, c);
        __CLR4_1_10ihihlusqj2ge.R.inc(712);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean removeAll(Collection<?> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(713);
        __CLR4_1_10ihihlusqj2ge.R.inc(714);return list.removeAll(c);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentRemoveAll(Collection<?> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(715);
        __CLR4_1_10ihihlusqj2ge.R.inc(716);list.removeAll(c);
        __CLR4_1_10ihihlusqj2ge.R.inc(717);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean retainAll(Collection<?> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(718);
        __CLR4_1_10ihihlusqj2ge.R.inc(719);return list.retainAll(c);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentRetainAll(Collection<?> c) {try{__CLR4_1_10ihihlusqj2ge.R.inc(720);
        __CLR4_1_10ihihlusqj2ge.R.inc(721);list.retainAll(c);
        __CLR4_1_10ihihlusqj2ge.R.inc(722);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public void clear() {try{__CLR4_1_10ihihlusqj2ge.R.inc(723);
        __CLR4_1_10ihihlusqj2ge.R.inc(724);list.clear();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentClear() {try{__CLR4_1_10ihihlusqj2ge.R.inc(725);
        __CLR4_1_10ihihlusqj2ge.R.inc(726);list.clear();
        __CLR4_1_10ihihlusqj2ge.R.inc(727);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Object set(int index, Object element) {try{__CLR4_1_10ihihlusqj2ge.R.inc(728);
        __CLR4_1_10ihihlusqj2ge.R.inc(729);if ((((index == -1)&&(__CLR4_1_10ihihlusqj2ge.R.iget(730)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(731)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(732);list.add(element);
            __CLR4_1_10ihihlusqj2ge.R.inc(733);return null;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(734);if ((((list.size() <= index)&&(__CLR4_1_10ihihlusqj2ge.R.iget(735)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(736)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(737);for (int i = list.size(); (((i < index)&&(__CLR4_1_10ihihlusqj2ge.R.iget(738)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(739)==0&false)); ++i) {{
                __CLR4_1_10ihihlusqj2ge.R.inc(740);list.add(null);
            }
            }__CLR4_1_10ihihlusqj2ge.R.inc(741);list.add(element);
            __CLR4_1_10ihihlusqj2ge.R.inc(742);return null;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(743);return list.set(index, element);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentSet(int index, Object element) {try{__CLR4_1_10ihihlusqj2ge.R.inc(744);
        __CLR4_1_10ihihlusqj2ge.R.inc(745);set(index, element);
        __CLR4_1_10ihihlusqj2ge.R.inc(746);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public void add(int index, Object element) {try{__CLR4_1_10ihihlusqj2ge.R.inc(747);
        __CLR4_1_10ihihlusqj2ge.R.inc(748);list.add(index, element);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentAdd(int index, Object element) {try{__CLR4_1_10ihihlusqj2ge.R.inc(749);
        __CLR4_1_10ihihlusqj2ge.R.inc(750);list.add(index, element);
        __CLR4_1_10ihihlusqj2ge.R.inc(751);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Object remove(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(752);
        __CLR4_1_10ihihlusqj2ge.R.inc(753);return list.remove(index);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray fluentRemove(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(754);
        __CLR4_1_10ihihlusqj2ge.R.inc(755);list.remove(index);
        __CLR4_1_10ihihlusqj2ge.R.inc(756);return this;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public int indexOf(Object o) {try{__CLR4_1_10ihihlusqj2ge.R.inc(757);
        __CLR4_1_10ihihlusqj2ge.R.inc(758);return list.indexOf(o);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public int lastIndexOf(Object o) {try{__CLR4_1_10ihihlusqj2ge.R.inc(759);
        __CLR4_1_10ihihlusqj2ge.R.inc(760);return list.lastIndexOf(o);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public ListIterator<Object> listIterator() {try{__CLR4_1_10ihihlusqj2ge.R.inc(761);
        __CLR4_1_10ihihlusqj2ge.R.inc(762);return list.listIterator();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public ListIterator<Object> listIterator(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(763);
        __CLR4_1_10ihihlusqj2ge.R.inc(764);return list.listIterator(index);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public List<Object> subList(int fromIndex, int toIndex) {try{__CLR4_1_10ihihlusqj2ge.R.inc(765);
        __CLR4_1_10ihihlusqj2ge.R.inc(766);return list.subList(fromIndex, toIndex);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Object get(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(767);
        __CLR4_1_10ihihlusqj2ge.R.inc(768);return list.get(index);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONObject getJSONObject(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(769);
        __CLR4_1_10ihihlusqj2ge.R.inc(770);Object value = list.get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(771);if ((((value instanceof JSONObject)&&(__CLR4_1_10ihihlusqj2ge.R.iget(772)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(773)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(774);return (JSONObject) value;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(775);if ((((value instanceof Map)&&(__CLR4_1_10ihihlusqj2ge.R.iget(776)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(777)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(778);return new JSONObject((Map) value);
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(779);return (JSONObject) toJSON(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public JSONArray getJSONArray(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(780);
        __CLR4_1_10ihihlusqj2ge.R.inc(781);Object value = list.get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(782);if ((((value instanceof JSONArray)&&(__CLR4_1_10ihihlusqj2ge.R.iget(783)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(784)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(785);return (JSONArray) value;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(786);if ((((value instanceof List)&&(__CLR4_1_10ihihlusqj2ge.R.iget(787)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(788)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(789);return new JSONArray((List) value);
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(790);return (JSONArray) toJSON(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public <T> T getObject(int index, Class<T> clazz) {try{__CLR4_1_10ihihlusqj2ge.R.inc(791);
        __CLR4_1_10ihihlusqj2ge.R.inc(792);Object obj = list.get(index);
        __CLR4_1_10ihihlusqj2ge.R.inc(793);return TypeUtils.castToJavaBean(obj, clazz);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public <T> T getObject(int index, Type type) {try{__CLR4_1_10ihihlusqj2ge.R.inc(794);
        __CLR4_1_10ihihlusqj2ge.R.inc(795);Object obj = list.get(index);
        __CLR4_1_10ihihlusqj2ge.R.inc(796);if ((((type instanceof Class)&&(__CLR4_1_10ihihlusqj2ge.R.iget(797)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(798)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(799);return (T) TypeUtils.castToJavaBean(obj, (Class) type);
        } }else {{
            __CLR4_1_10ihihlusqj2ge.R.inc(800);String json = JSON.toJSONString(obj);
            __CLR4_1_10ihihlusqj2ge.R.inc(801);return (T) JSON.parseObject(json, type);
        }
    }}finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Boolean getBoolean(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(802);
        __CLR4_1_10ihihlusqj2ge.R.inc(803);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(804);if ((((value == null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(805)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(806)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(807);return null;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(808);return castToBoolean(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean getBooleanValue(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(809);
        __CLR4_1_10ihihlusqj2ge.R.inc(810);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(811);if ((((value == null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(812)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(813)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(814);return false;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(815);return castToBoolean(value).booleanValue();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Byte getByte(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(816);
        __CLR4_1_10ihihlusqj2ge.R.inc(817);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(818);return castToByte(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public byte getByteValue(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(819);
        __CLR4_1_10ihihlusqj2ge.R.inc(820);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(821);Byte byteVal = castToByte(value);
        __CLR4_1_10ihihlusqj2ge.R.inc(822);if ((((byteVal == null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(823)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(824)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(825);return 0;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(826);return byteVal.byteValue();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Short getShort(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(827);
        __CLR4_1_10ihihlusqj2ge.R.inc(828);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(829);return castToShort(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public short getShortValue(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(830);
        __CLR4_1_10ihihlusqj2ge.R.inc(831);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(832);Short shortVal = castToShort(value);
        __CLR4_1_10ihihlusqj2ge.R.inc(833);if ((((shortVal == null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(834)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(835)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(836);return 0;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(837);return shortVal.shortValue();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Integer getInteger(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(838);
        __CLR4_1_10ihihlusqj2ge.R.inc(839);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(840);return castToInt(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public int getIntValue(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(841);
        __CLR4_1_10ihihlusqj2ge.R.inc(842);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(843);Integer intVal = castToInt(value);
        __CLR4_1_10ihihlusqj2ge.R.inc(844);if ((((intVal == null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(845)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(846)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(847);return 0;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(848);return intVal.intValue();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Long getLong(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(849);
        __CLR4_1_10ihihlusqj2ge.R.inc(850);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(851);return castToLong(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public long getLongValue(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(852);
        __CLR4_1_10ihihlusqj2ge.R.inc(853);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(854);Long longVal = castToLong(value);
        __CLR4_1_10ihihlusqj2ge.R.inc(855);if ((((longVal == null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(856)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(857)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(858);return 0L;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(859);return longVal.longValue();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Float getFloat(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(860);
        __CLR4_1_10ihihlusqj2ge.R.inc(861);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(862);return castToFloat(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public float getFloatValue(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(863);
        __CLR4_1_10ihihlusqj2ge.R.inc(864);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(865);Float floatValue = castToFloat(value);
        __CLR4_1_10ihihlusqj2ge.R.inc(866);if ((((floatValue == null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(867)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(868)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(869);return 0F;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(870);return floatValue.floatValue();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public Double getDouble(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(871);
        __CLR4_1_10ihihlusqj2ge.R.inc(872);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(873);return castToDouble(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public double getDoubleValue(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(874);
        __CLR4_1_10ihihlusqj2ge.R.inc(875);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(876);Double doubleValue = castToDouble(value);
        __CLR4_1_10ihihlusqj2ge.R.inc(877);if ((((doubleValue == null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(878)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(879)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(880);return 0D;
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(881);return doubleValue.doubleValue();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public BigDecimal getBigDecimal(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(882);
        __CLR4_1_10ihihlusqj2ge.R.inc(883);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(884);return castToBigDecimal(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public BigInteger getBigInteger(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(885);
        __CLR4_1_10ihihlusqj2ge.R.inc(886);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(887);return castToBigInteger(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public String getString(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(888);
        __CLR4_1_10ihihlusqj2ge.R.inc(889);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(890);return castToString(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public java.util.Date getDate(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(891);
        __CLR4_1_10ihihlusqj2ge.R.inc(892);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(893);return castToDate(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public java.sql.Date getSqlDate(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(894);
        __CLR4_1_10ihihlusqj2ge.R.inc(895);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(896);return castToSqlDate(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public java.sql.Timestamp getTimestamp(int index) {try{__CLR4_1_10ihihlusqj2ge.R.inc(897);
        __CLR4_1_10ihihlusqj2ge.R.inc(898);Object value = get(index);

        __CLR4_1_10ihihlusqj2ge.R.inc(899);return castToTimestamp(value);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    /**
     * @since  1.2.23
     */
    public <T> List<T> toJavaList(Class<T> clazz) {try{__CLR4_1_10ihihlusqj2ge.R.inc(900);
        __CLR4_1_10ihihlusqj2ge.R.inc(901);List<T> list = new ArrayList<T>(this.size());

        __CLR4_1_10ihihlusqj2ge.R.inc(902);ParserConfig config = ParserConfig.getGlobalInstance();

        __CLR4_1_10ihihlusqj2ge.R.inc(903);for (Object item : this) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(904);T classItem = (T) TypeUtils.cast(item, clazz, config);
            __CLR4_1_10ihihlusqj2ge.R.inc(905);list.add(classItem);
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(906);return list;
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    @Override
    public Object clone() {try{__CLR4_1_10ihihlusqj2ge.R.inc(907);
        __CLR4_1_10ihihlusqj2ge.R.inc(908);return new JSONArray(new ArrayList<Object>(list));
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_1_10ihihlusqj2ge.R.inc(909);
        __CLR4_1_10ihihlusqj2ge.R.inc(910);return this.list.equals(obj);
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_1_10ihihlusqj2ge.R.inc(911);
        __CLR4_1_10ihihlusqj2ge.R.inc(912);return this.list.hashCode();
    }finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}

    private void readObject(final java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_1_10ihihlusqj2ge.R.inc(913);
        __CLR4_1_10ihihlusqj2ge.R.inc(914);JSONObject.SecureObjectInputStream.ensureFields();
        __CLR4_1_10ihihlusqj2ge.R.inc(915);if ((((JSONObject.SecureObjectInputStream.fields != null && !JSONObject.SecureObjectInputStream.fields_error)&&(__CLR4_1_10ihihlusqj2ge.R.iget(916)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(917)==0&false))) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(918);ObjectInputStream secIn = new JSONObject.SecureObjectInputStream(in);
            __CLR4_1_10ihihlusqj2ge.R.inc(919);try {
                __CLR4_1_10ihihlusqj2ge.R.inc(920);secIn.defaultReadObject();
                __CLR4_1_10ihihlusqj2ge.R.inc(921);return;
            } catch (java.io.NotActiveException e) {
                // skip
            }
        }

        }__CLR4_1_10ihihlusqj2ge.R.inc(922);in.defaultReadObject();
        __CLR4_1_10ihihlusqj2ge.R.inc(923);for (Object item : list) {{
            __CLR4_1_10ihihlusqj2ge.R.inc(924);if ((((item != null)&&(__CLR4_1_10ihihlusqj2ge.R.iget(925)!=0|true))||(__CLR4_1_10ihihlusqj2ge.R.iget(926)==0&false))) {{
                __CLR4_1_10ihihlusqj2ge.R.inc(927);ParserConfig.global.checkAutoType(item.getClass().getName(), null);
            }
        }}
    }}finally{__CLR4_1_10ihihlusqj2ge.R.flushNeeded();}}
}
