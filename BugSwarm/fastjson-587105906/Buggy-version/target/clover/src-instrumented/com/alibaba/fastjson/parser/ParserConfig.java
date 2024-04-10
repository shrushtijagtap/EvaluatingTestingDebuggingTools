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
package com.alibaba.fastjson.parser;

import java.io.*;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.ClassReader;
import com.alibaba.fastjson.asm.TypeCollector;
import com.alibaba.fastjson.parser.deserializer.*;
import com.alibaba.fastjson.serializer.*;
import com.alibaba.fastjson.spi.Module;
import com.alibaba.fastjson.support.moneta.MonetaCodec;
import com.alibaba.fastjson.util.*;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.util.ServiceLoader;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class ParserConfig {public static class __CLR4_1_10cjxcjxluszvwya{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,17118,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String    DENY_PROPERTY             = "fastjson.parser.deny";
    public static final String    AUTOTYPE_ACCEPT           = "fastjson.parser.autoTypeAccept";
    public static final String    AUTOTYPE_SUPPORT_PROPERTY = "fastjson.parser.autoTypeSupport";

    public static  final String[] DENYS;
    private static final String[] AUTO_TYPE_ACCEPT_LIST;
    public static  final boolean  AUTO_SUPPORT;

    static  {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16269);
        {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16270);String property = IOUtils.getStringProperty(DENY_PROPERTY);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16271);DENYS = splitItemsFormProperty(property);
        }
        {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16272);String property = IOUtils.getStringProperty(AUTOTYPE_SUPPORT_PROPERTY);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16273);AUTO_SUPPORT = "true".equals(property);
        }
        {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16274);String property = IOUtils.getStringProperty(AUTOTYPE_ACCEPT);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16275);String[] items = splitItemsFormProperty(property);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16276);if ((((items == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16277)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16278)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16279);items = new String[0];
            }
            }__CLR4_1_10cjxcjxluszvwya.R.inc(16280);AUTO_TYPE_ACCEPT_LIST = items;
        }
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public static ParserConfig getGlobalInstance() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16281);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16282);return global;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}
    public static ParserConfig                              global                = new ParserConfig();

    private final IdentityHashMap<Type, ObjectDeserializer> deserializers         = new IdentityHashMap<Type, ObjectDeserializer>();
    private final IdentityHashMap<Type, IdentityHashMap<Type, ObjectDeserializer>> mixInDeserializers = new IdentityHashMap<Type, IdentityHashMap<Type, ObjectDeserializer>>(16);
    private final ConcurrentMap<String,Class<?>>            typeMapping           = new ConcurrentHashMap<String,Class<?>>(16, 0.75f, 1);

    private boolean                                         asmEnable             = !ASMUtils.IS_ANDROID;

    public final SymbolTable                                symbolTable           = new SymbolTable(4096);

    public PropertyNamingStrategy                           propertyNamingStrategy;

    protected ClassLoader                                   defaultClassLoader;

    protected ASMDeserializerFactory                        asmFactory;

    private static boolean                                  awtError              = false;
    private static boolean                                  jdk8Error             = false;
    private static boolean                                  jodaError             = false;
    private static boolean                                  guavaError            = false;

    private boolean                                         autoTypeSupport       = AUTO_SUPPORT;
    private long[]                                          denyHashCodes;
    private long[]                                          acceptHashCodes;


    public final boolean                                    fieldBased;
    private boolean                                         jacksonCompatible     = false;

    public boolean                                          compatibleWithJavaBean = TypeUtils.compatibleWithJavaBean;
    private List<Module>                                    modules                = new ArrayList<Module>();

    {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16283);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16284);denyHashCodes = new long[]{
                0x86fc2bf9beaf7aefL,
                0x8eadd40cb2a94443L,
                0x8f75f9fa0df03f80L,
                0x8fd1960988bce8b4L,
                0x9172a53f157930afL,
                0x92122d710e364fb8L,
                0x94305c26580f73c5L,
                0x9437792831df7d3fL,
                0xa123a62f93178b20L,
                0xaa3daffdb10c4937L,
                0xb7e8ed757f5d13a2L,
                0xbcdd9dc12766f0ceL,
                0xc2eb1e621f439309L,
                0xc7599ebfe3e72406L,
                0xc963695082fd728eL,
                0xd9c9dbf6bbd27bb1L,
                0xdf2ddff310cdb375L,
                0xe09ae4604842582fL,
                0xe603d6a51fad692bL,
                0xe9184be55b1d962aL,
                0xe9f20bad25f60807L,
                0xeea210e8da2ec6e1L,
                0xfc773ae20c827691L,
                0xfd5bfc610056d720L,
                0xffdd1a80f1ed3405L,
                0x761619136cc13eL,
                0x1603dc147a3e358L,
                0x45b11bc78a3aba3L,
                0xee6511b66fd5ef0L,
                0x10b2bdca849d9b3eL,
                0x144277b467723158L,
                0x14db2e6fead04af0L,
                0x2b3a37467a344cdfL,
                0x313bb4abd8d4554cL,
                0x332f0b5369a18310L,
                0x33c64b921f523f2fL,
                0x34a81ee78429fdf1L,
                0x398f942e01920cf0L,
                0x42d11a560fc9fba9L,
                0x440e89208f445fb9L,
                0x46c808a4b5841f57L,
                0x4a3797b30328202cL,
                0x4ba3e254e758d70dL,
                0x4ef08c90ff16c675L,
                0x4fd10ddc6d13821fL,
                0x527db6b46ce3bcbcL,
                0x599b5c1213a099acL,
                0x5a5bd85c072e5efeL,
                0x5d92e6ddde40ed84L,
                0x616323f12c2ce25eL,
                0x63a220e60a17c7b9L,
                0x6749835432e0f0d2L,
                0x746bd4a53ec195fbL,
                0x74b50bb9260e31ffL,
                0x767a586a5107feefL,
                0x7aa7ee3627a19cf3L,
                0x7bddd363ad3998c6L
        };

        __CLR4_1_10cjxcjxluszvwya.R.inc(16285);long[] hashCodes = new long[AUTO_TYPE_ACCEPT_LIST.length + 1];
        __CLR4_1_10cjxcjxluszvwya.R.inc(16286);for (int i = 0; (((i < AUTO_TYPE_ACCEPT_LIST.length)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16287)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16288)==0&false)); i++) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16289);hashCodes[i] = TypeUtils.fnv1a_64(AUTO_TYPE_ACCEPT_LIST[i]);
        }
        }__CLR4_1_10cjxcjxluszvwya.R.inc(16290);hashCodes[hashCodes.length - 1] = -6293031534589903644L;

        __CLR4_1_10cjxcjxluszvwya.R.inc(16291);Arrays.sort(hashCodes);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16292);acceptHashCodes = hashCodes;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ParserConfig(){
        this(false);__CLR4_1_10cjxcjxluszvwya.R.inc(16294);try{__CLR4_1_10cjxcjxluszvwya.R.inc(16293);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ParserConfig(boolean fieldBase){
        this(null, null, fieldBase);__CLR4_1_10cjxcjxluszvwya.R.inc(16296);try{__CLR4_1_10cjxcjxluszvwya.R.inc(16295);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ParserConfig(ClassLoader parentClassLoader){
        this(null, parentClassLoader, false);__CLR4_1_10cjxcjxluszvwya.R.inc(16298);try{__CLR4_1_10cjxcjxluszvwya.R.inc(16297);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ParserConfig(ASMDeserializerFactory asmFactory){
        this(asmFactory, null, false);__CLR4_1_10cjxcjxluszvwya.R.inc(16300);try{__CLR4_1_10cjxcjxluszvwya.R.inc(16299);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    private ParserConfig(ASMDeserializerFactory asmFactory, ClassLoader parentClassLoader, boolean fieldBased){try{__CLR4_1_10cjxcjxluszvwya.R.inc(16301);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16302);this.fieldBased = fieldBased;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16303);if ((((asmFactory == null && !ASMUtils.IS_ANDROID)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16304)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16305)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16306);try {
                __CLR4_1_10cjxcjxluszvwya.R.inc(16307);if ((((parentClassLoader == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16308)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16309)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16310);asmFactory = new ASMDeserializerFactory(new ASMClassLoader());
                } }else {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16311);asmFactory = new ASMDeserializerFactory(parentClassLoader);
                }
            }} catch (ExceptionInInitializerError error) {
                // skip
            } catch (AccessControlException error) {
                // skip
            } catch (NoClassDefFoundError error) {
                // skip
            }
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16312);this.asmFactory = asmFactory;

        __CLR4_1_10cjxcjxluszvwya.R.inc(16313);if ((((asmFactory == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16314)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16315)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16316);asmEnable = false;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16317);initDeserializers();

        __CLR4_1_10cjxcjxluszvwya.R.inc(16318);addItemsToDeny(DENYS);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16319);addItemsToAccept(AUTO_TYPE_ACCEPT_LIST);

    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    private void initDeserializers() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16320);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16321);deserializers.put(SimpleDateFormat.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16322);deserializers.put(java.sql.Timestamp.class, SqlDateDeserializer.instance_timestamp);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16323);deserializers.put(java.sql.Date.class, SqlDateDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16324);deserializers.put(java.sql.Time.class, TimeDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16325);deserializers.put(java.util.Date.class, DateCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16326);deserializers.put(Calendar.class, CalendarCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16327);deserializers.put(XMLGregorianCalendar.class, CalendarCodec.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16328);deserializers.put(JSONObject.class, MapDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16329);deserializers.put(JSONArray.class, CollectionCodec.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16330);deserializers.put(Map.class, MapDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16331);deserializers.put(HashMap.class, MapDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16332);deserializers.put(LinkedHashMap.class, MapDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16333);deserializers.put(TreeMap.class, MapDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16334);deserializers.put(ConcurrentMap.class, MapDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16335);deserializers.put(ConcurrentHashMap.class, MapDeserializer.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16336);deserializers.put(Collection.class, CollectionCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16337);deserializers.put(List.class, CollectionCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16338);deserializers.put(ArrayList.class, CollectionCodec.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16339);deserializers.put(Object.class, JavaObjectDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16340);deserializers.put(String.class, StringCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16341);deserializers.put(StringBuffer.class, StringCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16342);deserializers.put(StringBuilder.class, StringCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16343);deserializers.put(char.class, CharacterCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16344);deserializers.put(Character.class, CharacterCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16345);deserializers.put(byte.class, NumberDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16346);deserializers.put(Byte.class, NumberDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16347);deserializers.put(short.class, NumberDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16348);deserializers.put(Short.class, NumberDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16349);deserializers.put(int.class, IntegerCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16350);deserializers.put(Integer.class, IntegerCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16351);deserializers.put(long.class, LongCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16352);deserializers.put(Long.class, LongCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16353);deserializers.put(BigInteger.class, BigIntegerCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16354);deserializers.put(BigDecimal.class, BigDecimalCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16355);deserializers.put(float.class, FloatCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16356);deserializers.put(Float.class, FloatCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16357);deserializers.put(double.class, NumberDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16358);deserializers.put(Double.class, NumberDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16359);deserializers.put(boolean.class, BooleanCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16360);deserializers.put(Boolean.class, BooleanCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16361);deserializers.put(Class.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16362);deserializers.put(char[].class, new CharArrayCodec());

        __CLR4_1_10cjxcjxluszvwya.R.inc(16363);deserializers.put(AtomicBoolean.class, BooleanCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16364);deserializers.put(AtomicInteger.class, IntegerCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16365);deserializers.put(AtomicLong.class, LongCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16366);deserializers.put(AtomicReference.class, ReferenceCodec.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16367);deserializers.put(WeakReference.class, ReferenceCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16368);deserializers.put(SoftReference.class, ReferenceCodec.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16369);deserializers.put(UUID.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16370);deserializers.put(TimeZone.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16371);deserializers.put(Locale.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16372);deserializers.put(Currency.class, MiscCodec.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16373);deserializers.put(Inet4Address.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16374);deserializers.put(Inet6Address.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16375);deserializers.put(InetSocketAddress.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16376);deserializers.put(File.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16377);deserializers.put(URI.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16378);deserializers.put(URL.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16379);deserializers.put(Pattern.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16380);deserializers.put(Charset.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16381);deserializers.put(JSONPath.class, MiscCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16382);deserializers.put(Number.class, NumberDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16383);deserializers.put(AtomicIntegerArray.class, AtomicCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16384);deserializers.put(AtomicLongArray.class, AtomicCodec.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16385);deserializers.put(StackTraceElement.class, StackTraceElementDeserializer.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16386);deserializers.put(Serializable.class, JavaObjectDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16387);deserializers.put(Cloneable.class, JavaObjectDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16388);deserializers.put(Comparable.class, JavaObjectDeserializer.instance);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16389);deserializers.put(Closeable.class, JavaObjectDeserializer.instance);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16390);deserializers.put(JSONPObject.class, new JSONPDeserializer());
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    private static String[] splitItemsFormProperty(final String property ){try{__CLR4_1_10cjxcjxluszvwya.R.inc(16391);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16392);if ((((property != null && property.length() > 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16393)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16394)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16395);return property.split(",");
        }
        }__CLR4_1_10cjxcjxluszvwya.R.inc(16396);return null;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void configFromPropety(Properties properties) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16397);
        {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16398);String property = properties.getProperty(DENY_PROPERTY);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16399);String[] items = splitItemsFormProperty(property);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16400);addItemsToDeny(items);
        }
        {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16401);String property = properties.getProperty(AUTOTYPE_ACCEPT);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16402);String[] items = splitItemsFormProperty(property);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16403);addItemsToAccept(items);
        }
        {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16404);String property = properties.getProperty(AUTOTYPE_SUPPORT_PROPERTY);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16405);if (((("true".equals(property))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16406)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16407)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16408);this.autoTypeSupport = true;
            } }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16409);if (((("false".equals(property))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16410)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16411)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16412);this.autoTypeSupport = false;
            }
        }}}
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    private void addItemsToDeny(final String[] items){try{__CLR4_1_10cjxcjxluszvwya.R.inc(16413);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16414);if ((((items == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16415)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16416)==0&false))){{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16417);return;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16418);for (int i = 0; (((i < items.length)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16419)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16420)==0&false)); ++i) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16421);String item = items[i];
            __CLR4_1_10cjxcjxluszvwya.R.inc(16422);this.addDeny(item);
        }
    }}finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    private void addItemsToAccept(final String[] items){try{__CLR4_1_10cjxcjxluszvwya.R.inc(16423);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16424);if ((((items == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16425)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16426)==0&false))){{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16427);return;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16428);for (int i = 0; (((i < items.length)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16429)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16430)==0&false)); ++i) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16431);String item = items[i];
            __CLR4_1_10cjxcjxluszvwya.R.inc(16432);this.addAccept(item);
        }
    }}finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public boolean isAutoTypeSupport() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16433);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16434);return autoTypeSupport;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void setAutoTypeSupport(boolean autoTypeSupport) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16435);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16436);this.autoTypeSupport = autoTypeSupport;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public boolean isAsmEnable() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16437);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16438);return asmEnable;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void setAsmEnable(boolean asmEnable) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16439);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16440);this.asmEnable = asmEnable;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public IdentityHashMap<Type, ObjectDeserializer> getDerializers() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16441);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16442);return deserializers;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public IdentityHashMap<Type, ObjectDeserializer> getDeserializers() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16443);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16444);return deserializers;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ObjectDeserializer getDeserializer(Type type) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16445);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16446);ObjectDeserializer deserializer = get(type);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16447);if ((((deserializer != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16448)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16449)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16450);return deserializer;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16451);if ((((type instanceof Class<?>)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16452)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16453)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16454);return getDeserializer((Class<?>) type, type);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16455);if ((((type instanceof ParameterizedType)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16456)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16457)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16458);Type rawType = ((ParameterizedType) type).getRawType();
            __CLR4_1_10cjxcjxluszvwya.R.inc(16459);if ((((rawType instanceof Class<?>)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16460)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16461)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16462);return getDeserializer((Class<?>) rawType, type);
            } }else {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16463);return getDeserializer(rawType);
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16464);if ((((type instanceof WildcardType)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16465)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16466)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16467);WildcardType wildcardType = (WildcardType) type;
            __CLR4_1_10cjxcjxluszvwya.R.inc(16468);Type[] upperBounds = wildcardType.getUpperBounds();
            __CLR4_1_10cjxcjxluszvwya.R.inc(16469);if ((((upperBounds.length == 1)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16470)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16471)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16472);Type upperBoundType = upperBounds[0];
                __CLR4_1_10cjxcjxluszvwya.R.inc(16473);return getDeserializer(upperBoundType);
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16474);return JavaObjectDeserializer.instance;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ObjectDeserializer getDeserializer(Class<?> clazz, Type type) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16475);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16476);ObjectDeserializer deserializer = get(type);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16477);if ((((deserializer != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16478)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16479)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16480);return deserializer;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16481);if ((((type == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16482)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16483)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16484);type = clazz;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16485);deserializer = get(type);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16486);if ((((deserializer != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16487)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16488)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16489);return deserializer;
        }

        }{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16490);JSONType annotation = TypeUtils.getAnnotation(clazz,JSONType.class);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16491);if ((((annotation != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16492)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16493)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16494);Class<?> mappingTo = annotation.mappingTo();
                __CLR4_1_10cjxcjxluszvwya.R.inc(16495);if ((((mappingTo != Void.class)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16496)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16497)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16498);return getDeserializer(mappingTo, mappingTo);
                }
            }}
        }}

        __CLR4_1_10cjxcjxluszvwya.R.inc(16499);if ((((type instanceof WildcardType || type instanceof TypeVariable || type instanceof ParameterizedType)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16500)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16501)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16502);deserializer = get(clazz);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16503);if ((((deserializer != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16504)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16505)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16506);return deserializer;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16507);for (Module module : modules) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16508);deserializer = module.createDeserializer(this, clazz);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16509);if ((((deserializer != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16510)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16511)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16512);putDeserializer(type, deserializer);
                __CLR4_1_10cjxcjxluszvwya.R.inc(16513);return deserializer;
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16514);String className = clazz.getName();
        __CLR4_1_10cjxcjxluszvwya.R.inc(16515);className = className.replace('$', '.');

        __CLR4_1_10cjxcjxluszvwya.R.inc(16516);if ((((className.startsWith("java.awt.") //
            && AwtCodec.support(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16517)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16518)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16519);if ((((!awtError)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16520)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16521)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16522);String[] names = new String[] {
                        "java.awt.Point",
                        "java.awt.Font",
                        "java.awt.Rectangle",
                        "java.awt.Color"
                };

                __CLR4_1_10cjxcjxluszvwya.R.inc(16523);try {
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16524);for (String name : names) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16525);if ((((name.equals(className))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16526)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16527)==0&false))) {{
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16528);putDeserializer(Class.forName(name), deserializer = AwtCodec.instance);
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16529);return deserializer;
                        }
                    }}
                }} catch (Throwable e) {
                    // skip
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16530);awtError = true;
                }

                __CLR4_1_10cjxcjxluszvwya.R.inc(16531);deserializer = AwtCodec.instance;
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16532);if ((((!jdk8Error)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16533)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16534)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16535);try {
                __CLR4_1_10cjxcjxluszvwya.R.inc(16536);if ((((className.startsWith("java.time."))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16537)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16538)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16539);String[] names = new String[] {
                            "java.time.LocalDateTime",
                            "java.time.LocalDate",
                            "java.time.LocalTime",
                            "java.time.ZonedDateTime",
                            "java.time.OffsetDateTime",
                            "java.time.OffsetTime",
                            "java.time.ZoneOffset",
                            "java.time.ZoneRegion",
                            "java.time.ZoneId",
                            "java.time.Period",
                            "java.time.Duration",
                            "java.time.Instant"
                    };

                    __CLR4_1_10cjxcjxluszvwya.R.inc(16540);for (String name : names) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16541);if ((((name.equals(className))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16542)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16543)==0&false))) {{
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16544);putDeserializer(Class.forName(name), deserializer = Jdk8DateCodec.instance);
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16545);return deserializer;
                        }
                    }}
                }} }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16546);if ((((className.startsWith("java.util.Optional"))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16547)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16548)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16549);String[] names = new String[] {
                            "java.util.Optional",
                            "java.util.OptionalDouble",
                            "java.util.OptionalInt",
                            "java.util.OptionalLong"
                    };
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16550);for (String name : names) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16551);if ((((name.equals(className))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16552)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16553)==0&false))) {{
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16554);putDeserializer(Class.forName(name), deserializer = OptionalCodec.instance);
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16555);return deserializer;
                        }
                    }}
                }}
            }}} catch (Throwable e) {
                // skip
                __CLR4_1_10cjxcjxluszvwya.R.inc(16556);jdk8Error = true;
            }
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16557);if ((((!jodaError)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16558)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16559)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16560);try {
                __CLR4_1_10cjxcjxluszvwya.R.inc(16561);if ((((className.startsWith("org.joda.time."))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16562)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16563)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16564);String[] names = new String[] {
                            "org.joda.time.DateTime",
                            "org.joda.time.LocalDate",
                            "org.joda.time.LocalDateTime",
                            "org.joda.time.LocalTime",
                            "org.joda.time.Instant",
                            "org.joda.time.Period",
                            "org.joda.time.Duration",
                            "org.joda.time.DateTimeZone",
                            "org.joda.time.format.DateTimeFormatter"
                    };

                    __CLR4_1_10cjxcjxluszvwya.R.inc(16565);for (String name : names) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16566);if ((((name.equals(className))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16567)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16568)==0&false))) {{
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16569);putDeserializer(Class.forName(name), deserializer = JodaCodec.instance);
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16570);return deserializer;
                        }
                    }}
                }}
            }} catch (Throwable e) {
                // skip
                __CLR4_1_10cjxcjxluszvwya.R.inc(16571);jodaError = true;
            }
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16572);if (((((!guavaError) //
                && className.startsWith("com.google.common.collect."))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16573)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16574)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16575);try {
                __CLR4_1_10cjxcjxluszvwya.R.inc(16576);String[] names = new String[] {
                        "com.google.common.collect.HashMultimap",
                        "com.google.common.collect.LinkedListMultimap",
                        "com.google.common.collect.LinkedHashMultimap",
                        "com.google.common.collect.ArrayListMultimap",
                        "com.google.common.collect.TreeMultimap"
                };

                __CLR4_1_10cjxcjxluszvwya.R.inc(16577);for (String name : names) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16578);if ((((name.equals(className))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16579)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16580)==0&false))) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16581);putDeserializer(Class.forName(name), deserializer = GuavaCodec.instance);
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16582);return deserializer;
                    }
                }}
            }} catch (ClassNotFoundException e) {
                // skip
                __CLR4_1_10cjxcjxluszvwya.R.inc(16583);guavaError = true;
            }
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16584);if ((((className.equals("java.nio.ByteBuffer"))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16585)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16586)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16587);putDeserializer(clazz, deserializer = ByteBufferCodec.instance);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16588);if ((((className.equals("java.nio.file.Path"))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16589)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16590)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16591);putDeserializer(clazz, deserializer = MiscCodec.instance);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16592);if ((((clazz == Map.Entry.class)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16593)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16594)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16595);putDeserializer(clazz, deserializer = MiscCodec.instance);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16596);if ((((className.equals("org.javamoney.moneta.Money"))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16597)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16598)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16599);putDeserializer(clazz, deserializer = MonetaCodec.instance);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16600);final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_1_10cjxcjxluszvwya.R.inc(16601);try {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16602);for (AutowiredObjectDeserializer autowired : ServiceLoader.load(AutowiredObjectDeserializer.class,
                                                                            classLoader)) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16603);for (Type forType : autowired.getAutowiredFor()) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16604);putDeserializer(forType, autowired);
                }
            }}
        }} catch (Exception ex) {
            // skip
        }

        __CLR4_1_10cjxcjxluszvwya.R.inc(16605);if ((((deserializer == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16606)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16607)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16608);deserializer = get(type);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16609);if ((((deserializer != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16610)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16611)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16612);return deserializer;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16613);if ((((clazz.isEnum())&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16614)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16615)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16616);if ((((jacksonCompatible)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16617)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16618)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16619);Method[] methods = clazz.getMethods();
                __CLR4_1_10cjxcjxluszvwya.R.inc(16620);for (Method method : methods) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16621);if ((((TypeUtils.isJacksonCreator(method))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16622)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16623)==0&false))) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16624);deserializer = createJavaBeanDeserializer(clazz, type);
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16625);putDeserializer(type, deserializer);
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16626);return deserializer;
                    }
                }}
            }}

            }__CLR4_1_10cjxcjxluszvwya.R.inc(16627);Class<?> deserClass = null;
            __CLR4_1_10cjxcjxluszvwya.R.inc(16628);JSONType jsonType = TypeUtils.getAnnotation(clazz, JSONType.class);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16629);if ((((jsonType != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16630)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16631)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16632);deserClass = jsonType.deserializer();
                __CLR4_1_10cjxcjxluszvwya.R.inc(16633);try {
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16634);deserializer = (ObjectDeserializer) deserClass.newInstance();
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16635);putDeserializer(clazz, deserializer);
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16636);return deserializer;
                } catch (Throwable error) {
                    // skip
                }
            }

            }__CLR4_1_10cjxcjxluszvwya.R.inc(16637);deserializer = new EnumDeserializer(clazz);
        } }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16638);if ((((clazz.isArray())&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16639)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16640)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16641);deserializer = ObjectArrayCodec.instance;
        } }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16642);if ((((clazz == Set.class || clazz == HashSet.class || clazz == Collection.class || clazz == List.class
                   || clazz == ArrayList.class)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16643)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16644)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16645);deserializer = CollectionCodec.instance;
        } }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16646);if ((((Collection.class.isAssignableFrom(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16647)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16648)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16649);deserializer = CollectionCodec.instance;
        } }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16650);if ((((Map.class.isAssignableFrom(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16651)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16652)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16653);deserializer = MapDeserializer.instance;
        } }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16654);if ((((Throwable.class.isAssignableFrom(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16655)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16656)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16657);deserializer = new ThrowableDeserializer(this, clazz);
        } }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16658);if ((((PropertyProcessable.class.isAssignableFrom(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16659)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16660)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16661);deserializer = new PropertyProcessableDeserializer((Class<PropertyProcessable>) clazz);
        } }else {__CLR4_1_10cjxcjxluszvwya.R.inc(16662);if ((((clazz == InetAddress.class)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16663)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16664)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16665);deserializer = MiscCodec.instance;
        } }else {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16666);deserializer = createJavaBeanDeserializer(clazz, type);
        }

        }}}}}}}}__CLR4_1_10cjxcjxluszvwya.R.inc(16667);putDeserializer(type, deserializer);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16668);return deserializer;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    /**
     *
     * @since 1.2.25
     */
    public void initJavaBeanDeserializers(Class<?>... classes) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16669);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16670);if ((((classes == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16671)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16672)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16673);return;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16674);for (Class<?> type : classes) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16675);if ((((type == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16676)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16677)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16678);continue;
            }
            }__CLR4_1_10cjxcjxluszvwya.R.inc(16679);ObjectDeserializer deserializer = createJavaBeanDeserializer(type, type);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16680);putDeserializer(type, deserializer);
        }
    }}finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ObjectDeserializer createJavaBeanDeserializer(Class<?> clazz, Type type) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16681);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16682);boolean asmEnable = this.asmEnable & !this.fieldBased;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16683);if ((((asmEnable)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16684)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16685)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16686);JSONType jsonType = TypeUtils.getAnnotation(clazz,JSONType.class);

            __CLR4_1_10cjxcjxluszvwya.R.inc(16687);if ((((jsonType != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16688)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16689)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16690);Class<?> deserializerClass = jsonType.deserializer();
                __CLR4_1_10cjxcjxluszvwya.R.inc(16691);if ((((deserializerClass != Void.class)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16692)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16693)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16694);try {
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16695);Object deseralizer = deserializerClass.newInstance();
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16696);if ((((deseralizer instanceof ObjectDeserializer)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16697)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16698)==0&false))) {{
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16699);return (ObjectDeserializer) deseralizer;
                        }
                    }} catch (Throwable e) {
                        // skip
                    }
                }

                }__CLR4_1_10cjxcjxluszvwya.R.inc(16700);asmEnable = jsonType.asm();
            }

            }__CLR4_1_10cjxcjxluszvwya.R.inc(16701);if ((((asmEnable)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16702)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16703)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16704);Class<?> superClass = JavaBeanInfo.getBuilderClass(clazz, jsonType);
                __CLR4_1_10cjxcjxluszvwya.R.inc(16705);if ((((superClass == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16706)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16707)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16708);superClass = clazz;
                }

                }__CLR4_1_10cjxcjxluszvwya.R.inc(16709);for (;;) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16710);if ((((!Modifier.isPublic(superClass.getModifiers()))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16711)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16712)==0&false))) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16713);asmEnable = false;
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16714);break;
                    }

                    }__CLR4_1_10cjxcjxluszvwya.R.inc(16715);superClass = superClass.getSuperclass();
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16716);if ((((superClass == Object.class || superClass == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16717)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16718)==0&false))) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16719);break;
                    }
                }}
            }}
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16720);if ((((clazz.getTypeParameters().length != 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16721)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16722)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16723);asmEnable = false;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16724);if ((((asmEnable && asmFactory != null && asmFactory.classLoader.isExternalClass(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16725)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16726)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16727);asmEnable = false;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16728);if ((((asmEnable)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16729)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16730)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16731);asmEnable = ASMUtils.checkName(clazz.getSimpleName());
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16732);if ((((asmEnable)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16733)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16734)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16735);if ((((clazz.isInterface())&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16736)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16737)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16738);asmEnable = false;
            }
            }__CLR4_1_10cjxcjxluszvwya.R.inc(16739);JavaBeanInfo beanInfo = JavaBeanInfo.build(clazz
                    , type
                    , propertyNamingStrategy
                    ,false
                    , TypeUtils.compatibleWithJavaBean
                    , jacksonCompatible
            );

            __CLR4_1_10cjxcjxluszvwya.R.inc(16740);if ((((asmEnable && beanInfo.fields.length > 200)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16741)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16742)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16743);asmEnable = false;
            }

            }__CLR4_1_10cjxcjxluszvwya.R.inc(16744);Constructor<?> defaultConstructor = beanInfo.defaultConstructor;
            __CLR4_1_10cjxcjxluszvwya.R.inc(16745);if ((((asmEnable && defaultConstructor == null && !clazz.isInterface())&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16746)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16747)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16748);asmEnable = false;
            }

            }__CLR4_1_10cjxcjxluszvwya.R.inc(16749);for (FieldInfo fieldInfo : beanInfo.fields) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16750);if ((((fieldInfo.getOnly)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16751)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16752)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16753);asmEnable = false;
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16754);break;
                }

                }__CLR4_1_10cjxcjxluszvwya.R.inc(16755);Class<?> fieldClass = fieldInfo.fieldClass;
                __CLR4_1_10cjxcjxluszvwya.R.inc(16756);if ((((!Modifier.isPublic(fieldClass.getModifiers()))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16757)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16758)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16759);asmEnable = false;
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16760);break;
                }

                }__CLR4_1_10cjxcjxluszvwya.R.inc(16761);if ((((fieldClass.isMemberClass() && !Modifier.isStatic(fieldClass.getModifiers()))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16762)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16763)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16764);asmEnable = false;
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16765);break;
                }

                }__CLR4_1_10cjxcjxluszvwya.R.inc(16766);if ((((fieldInfo.getMember() != null //
                    && !ASMUtils.checkName(fieldInfo.getMember().getName()))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16767)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16768)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16769);asmEnable = false;
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16770);break;
                }

                }__CLR4_1_10cjxcjxluszvwya.R.inc(16771);JSONField annotation = fieldInfo.getAnnotation();
                __CLR4_1_10cjxcjxluszvwya.R.inc(16772);if ((((annotation != null //
                    && ((!ASMUtils.checkName(annotation.name())) //
                        || annotation.format().length() != 0 //
                        || annotation.deserializeUsing() != Void.class //
                        || annotation.unwrapped())
                        || (fieldInfo.method != null && fieldInfo.method.getParameterTypes().length > 1))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16773)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16774)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16775);asmEnable = false;
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16776);break;
                }

                }__CLR4_1_10cjxcjxluszvwya.R.inc(16777);if ((((fieldClass.isEnum())&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16778)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16779)==0&false))) {{ // EnumDeserializer
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16780);ObjectDeserializer fieldDeser = this.getDeserializer(fieldClass);
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16781);if ((((!(fieldDeser instanceof EnumDeserializer))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16782)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16783)==0&false))) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16784);asmEnable = false;
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16785);break;
                    }
                }}
            }}
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16786);if ((((asmEnable)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16787)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16788)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16789);if ((((clazz.isMemberClass() && !Modifier.isStatic(clazz.getModifiers()))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16790)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16791)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16792);asmEnable = false;
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16793);if ((((asmEnable)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16794)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16795)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16796);if ((((TypeUtils.isXmlField(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16797)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16798)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16799);asmEnable = false;
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16800);if ((((!asmEnable)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16801)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16802)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16803);return new JavaBeanDeserializer(this, clazz, type);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16804);JavaBeanInfo beanInfo = JavaBeanInfo.build(clazz, type, propertyNamingStrategy);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16805);try {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16806);return asmFactory.createJavaBeanDeserializer(this, beanInfo);
            // } catch (VerifyError e) {
            // e.printStackTrace();
            // return new JavaBeanDeserializer(this, clazz, type);
        } catch (NoSuchMethodException ex) {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16807);return new JavaBeanDeserializer(this, clazz, type);
        } catch (JSONException asmError) {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16808);return new JavaBeanDeserializer(this, beanInfo);
        } catch (Exception e) {
            __CLR4_1_10cjxcjxluszvwya.R.inc(16809);throw new JSONException("create asm deserializer error, " + clazz.getName(), e);
        }
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public FieldDeserializer createFieldDeserializer(ParserConfig mapping, //
                                                     JavaBeanInfo beanInfo, //
                                                     FieldInfo fieldInfo) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16810);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16811);Class<?> clazz = beanInfo.clazz;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16812);Class<?> fieldClass = fieldInfo.fieldClass;

        __CLR4_1_10cjxcjxluszvwya.R.inc(16813);Class<?> deserializeUsing = null;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16814);JSONField annotation = fieldInfo.getAnnotation();
        __CLR4_1_10cjxcjxluszvwya.R.inc(16815);if ((((annotation != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16816)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16817)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16818);deserializeUsing = annotation.deserializeUsing();
            __CLR4_1_10cjxcjxluszvwya.R.inc(16819);if ((((deserializeUsing == Void.class)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16820)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16821)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16822);deserializeUsing = null;
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16823);if ((((deserializeUsing == null && (fieldClass == List.class || fieldClass == ArrayList.class))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16824)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16825)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16826);return new ArrayListTypeFieldDeserializer(mapping, clazz, fieldInfo);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16827);return new DefaultFieldDeserializer(mapping, clazz, fieldInfo);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void putDeserializer(Type type, ObjectDeserializer deserializer) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16828);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16829);Type mixin = JSON.getMixInAnnotations(type);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16830);if ((((mixin != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16831)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16832)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16833);IdentityHashMap<Type, ObjectDeserializer> mixInClasses = this.mixInDeserializers.get(type);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16834);if ((((mixInClasses == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16835)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16836)==0&false))) {{
                //\u591a\u7ebf\u7a0b\u4e0b\u53ef\u80fd\u4f1a\u91cd\u590d\u521b\u5efa\uff0c\u4f46\u4e0d\u5f71\u54cd\u6b63\u786e\u6027
                __CLR4_1_10cjxcjxluszvwya.R.inc(16837);mixInClasses = new IdentityHashMap<Type, ObjectDeserializer>(4);
                __CLR4_1_10cjxcjxluszvwya.R.inc(16838);this.mixInDeserializers.put(type, mixInClasses);
            }
            }__CLR4_1_10cjxcjxluszvwya.R.inc(16839);mixInClasses.put(mixin, deserializer);
        } }else {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16840);this.deserializers.put(type, deserializer);
        }
    }}finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ObjectDeserializer get(Type type) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16841);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16842);Type mixin = JSON.getMixInAnnotations(type);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16843);if ((((null == mixin)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16844)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16845)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16846);return this.deserializers.get(type);
        }
        }__CLR4_1_10cjxcjxluszvwya.R.inc(16847);IdentityHashMap<Type, ObjectDeserializer> mixInClasses = this.mixInDeserializers.get(type);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16848);if ((((mixInClasses == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16849)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16850)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16851);return null;
        }
        }__CLR4_1_10cjxcjxluszvwya.R.inc(16852);return mixInClasses.get(mixin);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ObjectDeserializer getDeserializer(FieldInfo fieldInfo) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16853);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16854);return getDeserializer(fieldInfo.fieldClass, fieldInfo.fieldType);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    /**
     * @deprecated  internal method, dont call
     */
    public boolean isPrimitive(Class<?> clazz) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16855);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16856);return isPrimitive2(clazz);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    /**
     * @deprecated  internal method, dont call
     */
    public static boolean isPrimitive2(Class<?> clazz) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16857);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16858);return clazz.isPrimitive() //
               || clazz == Boolean.class //
               || clazz == Character.class //
               || clazz == Byte.class //
               || clazz == Short.class //
               || clazz == Integer.class //
               || clazz == Long.class //
               || clazz == Float.class //
               || clazz == Double.class //
               || clazz == BigInteger.class //
               || clazz == BigDecimal.class //
               || clazz == String.class //
               || clazz == java.util.Date.class //
               || clazz == java.sql.Date.class //
               || clazz == java.sql.Time.class //
               || clazz == java.sql.Timestamp.class //
               || clazz.isEnum() //
        ;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    /**
     * fieldName,field \uff0c\u5148\u751f\u6210fieldName\u7684\u5feb\u7167\uff0c\u51cf\u5c11\u4e4b\u540e\u7684findField\u7684\u8f6e\u8be2
     *
     * @param clazz
     * @param fieldCacheMap :map&lt;fieldName ,Field&gt;
     */
    public static void  parserAllFieldToCache(Class<?> clazz,Map</**fieldName*/String , Field> fieldCacheMap){try{__CLR4_1_10cjxcjxluszvwya.R.inc(16859);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16860);Field[] fields = clazz.getDeclaredFields();
        __CLR4_1_10cjxcjxluszvwya.R.inc(16861);for (Field field : fields) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16862);String fieldName = field.getName();
            __CLR4_1_10cjxcjxluszvwya.R.inc(16863);if ((((!fieldCacheMap.containsKey(fieldName))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16864)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16865)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16866);fieldCacheMap.put(fieldName, field);
            }
        }}
        }__CLR4_1_10cjxcjxluszvwya.R.inc(16867);if ((((clazz.getSuperclass() != null && clazz.getSuperclass() != Object.class)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16868)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16869)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16870);parserAllFieldToCache(clazz.getSuperclass(), fieldCacheMap);
        }
    }}finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public static Field getFieldFromCache(String fieldName, Map<String, Field> fieldCacheMap) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16871);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16872);Field field = fieldCacheMap.get(fieldName);

        __CLR4_1_10cjxcjxluszvwya.R.inc(16873);if ((((field == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16874)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16875)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16876);field = fieldCacheMap.get("_" + fieldName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16877);if ((((field == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16878)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16879)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16880);field = fieldCacheMap.get("m_" + fieldName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16881);if ((((field == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16882)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16883)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16884);char c0 = fieldName.charAt(0);
            __CLR4_1_10cjxcjxluszvwya.R.inc(16885);if ((((c0 >= 'a' && c0 <= 'z')&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16886)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16887)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16888);char[] chars = fieldName.toCharArray();
                __CLR4_1_10cjxcjxluszvwya.R.inc(16889);chars[0] -= 32; // lower
                __CLR4_1_10cjxcjxluszvwya.R.inc(16890);String fieldNameX = new String(chars);
                __CLR4_1_10cjxcjxluszvwya.R.inc(16891);field = fieldCacheMap.get(fieldNameX);
            }

            }__CLR4_1_10cjxcjxluszvwya.R.inc(16892);if ((((fieldName.length() > 2)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16893)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16894)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16895);char c1 = fieldName.charAt(1);
                __CLR4_1_10cjxcjxluszvwya.R.inc(16896);if ((((fieldName.length() > 2
                        && c0 >= 'a' && c0 <= 'z'
                        && c1 >= 'A' && c1 <= 'Z')&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16897)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16898)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16899);for (Map.Entry<String, Field> entry : fieldCacheMap.entrySet()) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16900);if ((((fieldName.equalsIgnoreCase(entry.getKey()))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16901)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16902)==0&false))) {{
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16903);field = entry.getValue();
                            __CLR4_1_10cjxcjxluszvwya.R.inc(16904);break;
                        }
                    }}
                }}
            }}
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16905);return field;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public ClassLoader getDefaultClassLoader() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16906);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16907);return defaultClassLoader;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void setDefaultClassLoader(ClassLoader defaultClassLoader) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16908);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16909);this.defaultClassLoader = defaultClassLoader;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void addDeny(String name) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16910);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16911);if ((((name == null || name.length() == 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16912)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16913)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16914);return;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16915);long hash = TypeUtils.fnv1a_64(name);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16916);if ((((Arrays.binarySearch(this.denyHashCodes, hash) >= 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16917)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16918)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16919);return;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16920);long[] hashCodes = new long[this.denyHashCodes.length + 1];
        __CLR4_1_10cjxcjxluszvwya.R.inc(16921);hashCodes[hashCodes.length - 1] = hash;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16922);System.arraycopy(this.denyHashCodes, 0, hashCodes, 0, this.denyHashCodes.length);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16923);Arrays.sort(hashCodes);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16924);this.denyHashCodes = hashCodes;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void addAccept(String name) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16925);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16926);if ((((name == null || name.length() == 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16927)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16928)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16929);return;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16930);long hash = TypeUtils.fnv1a_64(name);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16931);if ((((Arrays.binarySearch(this.acceptHashCodes, hash) >= 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16932)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16933)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16934);return;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16935);long[] hashCodes = new long[this.acceptHashCodes.length + 1];
        __CLR4_1_10cjxcjxluszvwya.R.inc(16936);hashCodes[hashCodes.length - 1] = hash;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16937);System.arraycopy(this.acceptHashCodes, 0, hashCodes, 0, this.acceptHashCodes.length);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16938);Arrays.sort(hashCodes);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16939);this.acceptHashCodes = hashCodes;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public Class<?> checkAutoType(Class type) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16940);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16941);if ((((get(type) != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16942)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16943)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16944);return type;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16945);return checkAutoType(type.getName(), null, JSON.DEFAULT_PARSER_FEATURE);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public Class<?> checkAutoType(String typeName, Class<?> expectClass) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16946);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16947);return checkAutoType(typeName, expectClass, JSON.DEFAULT_PARSER_FEATURE);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public Class<?> checkAutoType(String typeName, Class<?> expectClass, int features) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(16948);
        __CLR4_1_10cjxcjxluszvwya.R.inc(16949);if ((((typeName == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16950)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16951)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16952);return null;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16953);if ((((typeName.length() >= 192 || typeName.length() < 3)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16954)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16955)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16956);throw new JSONException("autoType is not support. " + typeName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16957);final boolean expectClassFlag;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16958);if ((((expectClass == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16959)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16960)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16961);expectClassFlag = false;
        } }else {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16962);if ((((expectClass == Object.class
                    || expectClass == Serializable.class
                    || expectClass == Cloneable.class
                    || expectClass == Closeable.class
                    || expectClass == EventListener.class
                    || expectClass == Iterable.class
                    || expectClass == Collection.class
                    )&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16963)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16964)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16965);expectClassFlag = false;
            } }else {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16966);expectClassFlag = true;
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16967);String className = typeName.replace('$', '.');
        __CLR4_1_10cjxcjxluszvwya.R.inc(16968);Class<?> clazz = null;

        __CLR4_1_10cjxcjxluszvwya.R.inc(16969);final long BASIC = 0xcbf29ce484222325L;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16970);final long PRIME = 0x100000001b3L;

        __CLR4_1_10cjxcjxluszvwya.R.inc(16971);final long h1 = (BASIC ^ className.charAt(0)) * PRIME;
        __CLR4_1_10cjxcjxluszvwya.R.inc(16972);if ((((h1 == 0xaf64164c86024f1aL)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16973)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16974)==0&false))) {{ // [
            __CLR4_1_10cjxcjxluszvwya.R.inc(16975);throw new JSONException("autoType is not support. " + typeName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16976);if (((((h1 ^ className.charAt(className.length() - 1)) * PRIME == 0x9198507b5af98f0L)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16977)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16978)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16979);throw new JSONException("autoType is not support. " + typeName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(16980);final long h3 = (((((BASIC ^ className.charAt(0))
                * PRIME)
                ^ className.charAt(1))
                * PRIME)
                ^ className.charAt(2))
                * PRIME;

        __CLR4_1_10cjxcjxluszvwya.R.inc(16981);if ((((autoTypeSupport || expectClassFlag)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16982)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16983)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(16984);long hash = h3;
            __CLR4_1_10cjxcjxluszvwya.R.inc(16985);for (int i = 3; (((i < className.length())&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16986)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16987)==0&false)); ++i) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(16988);hash ^= className.charAt(i);
                __CLR4_1_10cjxcjxluszvwya.R.inc(16989);hash *= PRIME;
                __CLR4_1_10cjxcjxluszvwya.R.inc(16990);if ((((Arrays.binarySearch(acceptHashCodes, hash) >= 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16991)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16992)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16993);clazz = TypeUtils.loadClass(typeName, defaultClassLoader, true);
                    __CLR4_1_10cjxcjxluszvwya.R.inc(16994);if ((((clazz != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16995)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(16996)==0&false))) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(16997);return clazz;
                    }
                }}
                }__CLR4_1_10cjxcjxluszvwya.R.inc(16998);if ((((Arrays.binarySearch(denyHashCodes, hash) >= 0 && TypeUtils.getClassFromMapping(typeName) == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(16999)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17000)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(17001);throw new JSONException("autoType is not support. " + typeName);
                }
            }}
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17002);if ((((clazz == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17003)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17004)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17005);clazz = TypeUtils.getClassFromMapping(typeName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17006);if ((((clazz == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17007)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17008)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17009);clazz = deserializers.findClass(typeName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17010);if ((((clazz == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17011)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17012)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17013);clazz = typeMapping.get(typeName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17014);if ((((clazz != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17015)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17016)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17017);if ((((expectClass != null
                    && clazz != java.util.HashMap.class
                    && !expectClass.isAssignableFrom(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17018)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17019)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17020);throw new JSONException("type not match. " + typeName + " -> " + expectClass.getName());
            }

            }__CLR4_1_10cjxcjxluszvwya.R.inc(17021);return clazz;
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17022);if ((((!autoTypeSupport)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17023)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17024)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17025);long hash = h3;
            __CLR4_1_10cjxcjxluszvwya.R.inc(17026);for (int i = 3; (((i < className.length())&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17027)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17028)==0&false)); ++i) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17029);char c = className.charAt(i);
                __CLR4_1_10cjxcjxluszvwya.R.inc(17030);hash ^= c;
                __CLR4_1_10cjxcjxluszvwya.R.inc(17031);hash *= PRIME;

                __CLR4_1_10cjxcjxluszvwya.R.inc(17032);if ((((Arrays.binarySearch(denyHashCodes, hash) >= 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17033)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17034)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(17035);throw new JSONException("autoType is not support. " + typeName);
                }

                // white list
                }__CLR4_1_10cjxcjxluszvwya.R.inc(17036);if ((((Arrays.binarySearch(acceptHashCodes, hash) >= 0)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17037)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17038)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(17039);if ((((clazz == null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17040)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17041)==0&false))) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(17042);clazz = TypeUtils.loadClass(typeName, defaultClassLoader, true);
                    }

                    }__CLR4_1_10cjxcjxluszvwya.R.inc(17043);if ((((expectClass != null && expectClass.isAssignableFrom(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17044)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17045)==0&false))) {{
                        __CLR4_1_10cjxcjxluszvwya.R.inc(17046);throw new JSONException("type not match. " + typeName + " -> " + expectClass.getName());
                    }

                    }__CLR4_1_10cjxcjxluszvwya.R.inc(17047);return clazz;
                }
            }}
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17048);boolean jsonType = false;
        __CLR4_1_10cjxcjxluszvwya.R.inc(17049);InputStream is = null;
        __CLR4_1_10cjxcjxluszvwya.R.inc(17050);try {
            __CLR4_1_10cjxcjxluszvwya.R.inc(17051);String resource = typeName.replace('.', '/') + ".class";
            __CLR4_1_10cjxcjxluszvwya.R.inc(17052);if ((((defaultClassLoader != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17053)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17054)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17055);is = defaultClassLoader.getResourceAsStream(resource);
            } }else {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17056);is = ParserConfig.class.getClassLoader().getResourceAsStream(resource);
            }
            }__CLR4_1_10cjxcjxluszvwya.R.inc(17057);if ((((is != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17058)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17059)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17060);ClassReader classReader = new ClassReader(is, true);
                __CLR4_1_10cjxcjxluszvwya.R.inc(17061);TypeCollector visitor = new TypeCollector("<clinit>", new Class[0]);
                __CLR4_1_10cjxcjxluszvwya.R.inc(17062);classReader.accept(visitor);
                __CLR4_1_10cjxcjxluszvwya.R.inc(17063);jsonType = visitor.hasJsonType();
            }
        }} catch (Exception e) {
            // skip
        } finally {
            __CLR4_1_10cjxcjxluszvwya.R.inc(17064);IOUtils.close(is);
        }

        __CLR4_1_10cjxcjxluszvwya.R.inc(17065);final int mask = Feature.SupportAutoType.mask;
        __CLR4_1_10cjxcjxluszvwya.R.inc(17066);boolean autoTypeSupport = this.autoTypeSupport
                || (features & mask) != 0
                || (JSON.DEFAULT_PARSER_FEATURE & mask) != 0;

        __CLR4_1_10cjxcjxluszvwya.R.inc(17067);if ((((clazz == null && (autoTypeSupport || jsonType || expectClassFlag))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17068)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17069)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17070);boolean cacheClass = autoTypeSupport || jsonType;
            __CLR4_1_10cjxcjxluszvwya.R.inc(17071);clazz = TypeUtils.loadClass(typeName, defaultClassLoader, cacheClass);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17072);if ((((clazz != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17073)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17074)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17075);if ((((jsonType)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17076)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17077)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17078);TypeUtils.addMapping(typeName, clazz);
                __CLR4_1_10cjxcjxluszvwya.R.inc(17079);return clazz;
            }

            }__CLR4_1_10cjxcjxluszvwya.R.inc(17080);if ((((ClassLoader.class.isAssignableFrom(clazz) // classloader is danger
                    || javax.sql.DataSource.class.isAssignableFrom(clazz) // dataSource can load jdbc driver
                    || javax.sql.RowSet.class.isAssignableFrom(clazz) //
                    )&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17081)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17082)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17083);throw new JSONException("autoType is not support. " + typeName);
            }

            }__CLR4_1_10cjxcjxluszvwya.R.inc(17084);if ((((expectClass != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17085)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17086)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17087);if ((((expectClass.isAssignableFrom(clazz))&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17088)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17089)==0&false))) {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(17090);TypeUtils.addMapping(typeName, clazz);
                    __CLR4_1_10cjxcjxluszvwya.R.inc(17091);return clazz;
                } }else {{
                    __CLR4_1_10cjxcjxluszvwya.R.inc(17092);throw new JSONException("type not match. " + typeName + " -> " + expectClass.getName());
                }
            }}

            }__CLR4_1_10cjxcjxluszvwya.R.inc(17093);JavaBeanInfo beanInfo = JavaBeanInfo.build(clazz, clazz, propertyNamingStrategy);
            __CLR4_1_10cjxcjxluszvwya.R.inc(17094);if ((((beanInfo.creatorConstructor != null && autoTypeSupport)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17095)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17096)==0&false))) {{
                __CLR4_1_10cjxcjxluszvwya.R.inc(17097);throw new JSONException("autoType is not support. " + typeName);
            }
        }}

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17098);if ((((!autoTypeSupport)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17099)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17100)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17101);throw new JSONException("autoType is not support. " + typeName);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17102);if ((((clazz != null)&&(__CLR4_1_10cjxcjxluszvwya.R.iget(17103)!=0|true))||(__CLR4_1_10cjxcjxluszvwya.R.iget(17104)==0&false))) {{
            __CLR4_1_10cjxcjxluszvwya.R.inc(17105);TypeUtils.addMapping(typeName, clazz);
        }

        }__CLR4_1_10cjxcjxluszvwya.R.inc(17106);return clazz;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void clearDeserializers() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(17107);
        __CLR4_1_10cjxcjxluszvwya.R.inc(17108);this.deserializers.clear();
        __CLR4_1_10cjxcjxluszvwya.R.inc(17109);this.initDeserializers();
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public boolean isJacksonCompatible() {try{__CLR4_1_10cjxcjxluszvwya.R.inc(17110);
        __CLR4_1_10cjxcjxluszvwya.R.inc(17111);return jacksonCompatible;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void setJacksonCompatible(boolean jacksonCompatible) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(17112);
        __CLR4_1_10cjxcjxluszvwya.R.inc(17113);this.jacksonCompatible = jacksonCompatible;
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void register(String typeName, Class type) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(17114);
        __CLR4_1_10cjxcjxluszvwya.R.inc(17115);typeMapping.putIfAbsent(typeName, type);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}

    public void register(Module module) {try{__CLR4_1_10cjxcjxluszvwya.R.inc(17116);
        __CLR4_1_10cjxcjxluszvwya.R.inc(17117);this.modules.add(module);
    }finally{__CLR4_1_10cjxcjxluszvwya.R.flushNeeded();}}
}
