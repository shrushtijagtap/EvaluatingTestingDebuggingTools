/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2018 Alibaba Group.
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
package com.alibaba.fastjson.serializer;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public enum SerializerFeature {
    QuoteFieldNames,
    /**
     * 
     */
    UseSingleQuotes,
    /**
     * 
     */
    WriteMapNullValue,
    /**
     * \u7528\u679a\u4e3etoString()\u503c\u8f93\u51fa
     */
    WriteEnumUsingToString,
    /**
     * \u7528\u679a\u4e3ename()\u8f93\u51fa
     */
    WriteEnumUsingName,
    /**
     * 
     */
    UseISO8601DateFormat,
    /**
     * @since 1.1
     */
    WriteNullListAsEmpty,
    /**
     * @since 1.1
     */
    WriteNullStringAsEmpty,
    /**
     * @since 1.1
     */
    WriteNullNumberAsZero,
    /**
     * @since 1.1
     */
    WriteNullBooleanAsFalse,
    /**
     * @since 1.1
     */
    SkipTransientField,
    /**
     * @since 1.1
     */
    SortField,
    /**
     * @since 1.1.1
     */
    @Deprecated
    WriteTabAsSpecial,
    /**
     * @since 1.1.2
     */
    PrettyFormat,
    /**
     * @since 1.1.2
     */
    WriteClassName,

    /**
     * @since 1.1.6
     */
    DisableCircularReferenceDetect, // 32768

    /**
     * @since 1.1.9
     */
    WriteSlashAsSpecial,

    /**
     * @since 1.1.10
     */
    BrowserCompatible,

    /**
     * @since 1.1.14
     */
    WriteDateUseDateFormat,

    /**
     * @since 1.1.15
     */
    NotWriteRootClassName,

    /**
     * @since 1.1.19
     * @deprecated
     */
    DisableCheckSpecialChar,

    /**
     * @since 1.1.35
     */
    BeanToArray,

    /**
     * @since 1.1.37
     */
    WriteNonStringKeyAsString,
    
    /**
     * @since 1.1.42
     */
    NotWriteDefaultValue,
    
    /**
     * @since 1.2.6
     */
    BrowserSecure,
    
    /**
     * @since 1.2.7
     */
    IgnoreNonFieldGetter,
    
    /**
     * @since 1.2.9
     */
    WriteNonStringValueAsString,
    
    /**
     * @since 1.2.11
     */
    IgnoreErrorGetter,

    /**
     * @since 1.2.16
     */
    WriteBigDecimalAsPlain,

    /**
     * @since 1.2.27
     */
    MapSortField;

    SerializerFeature(){try{__CLR4_1_10obiobilusqjmnw.R.inc(31518);
        __CLR4_1_10obiobilusqjmnw.R.inc(31519);mask = (1 << ordinal());
    }finally{__CLR4_1_10obiobilusqjmnw.R.flushNeeded();}}

    public final int mask;

    public final int getMask() {try{__CLR4_1_10obiobilusqjmnw.R.inc(31520);
        __CLR4_1_10obiobilusqjmnw.R.inc(31521);return mask;
    }finally{__CLR4_1_10obiobilusqjmnw.R.flushNeeded();}}

    public static boolean isEnabled(int features, SerializerFeature feature) {try{__CLR4_1_10obiobilusqjmnw.R.inc(31522);
        __CLR4_1_10obiobilusqjmnw.R.inc(31523);return (features & feature.mask) != 0;
    }finally{__CLR4_1_10obiobilusqjmnw.R.flushNeeded();}}
    
    public static boolean isEnabled(int features, int fieaturesB, SerializerFeature feature) {try{__CLR4_1_10obiobilusqjmnw.R.inc(31524);
        __CLR4_1_10obiobilusqjmnw.R.inc(31525);int mask = feature.mask;
        
        __CLR4_1_10obiobilusqjmnw.R.inc(31526);return (features & mask) != 0 || (fieaturesB & mask) != 0;
    }finally{__CLR4_1_10obiobilusqjmnw.R.flushNeeded();}}

    public static int config(int features, SerializerFeature feature, boolean state) {try{__CLR4_1_10obiobilusqjmnw.R.inc(31527);
        __CLR4_1_10obiobilusqjmnw.R.inc(31528);if ((((state)&&(__CLR4_1_10obiobilusqjmnw.R.iget(31529)!=0|true))||(__CLR4_1_10obiobilusqjmnw.R.iget(31530)==0&false))) {{
            __CLR4_1_10obiobilusqjmnw.R.inc(31531);features |= feature.mask;
        } }else {{
            __CLR4_1_10obiobilusqjmnw.R.inc(31532);features &= ~feature.mask;
        }

        }__CLR4_1_10obiobilusqjmnw.R.inc(31533);return features;
    }finally{__CLR4_1_10obiobilusqjmnw.R.flushNeeded();}}
    
    public static int of(SerializerFeature[] features) {try{__CLR4_1_10obiobilusqjmnw.R.inc(31534);
        __CLR4_1_10obiobilusqjmnw.R.inc(31535);if ((((features == null)&&(__CLR4_1_10obiobilusqjmnw.R.iget(31536)!=0|true))||(__CLR4_1_10obiobilusqjmnw.R.iget(31537)==0&false))) {{
            __CLR4_1_10obiobilusqjmnw.R.inc(31538);return 0;
        }
        
        }__CLR4_1_10obiobilusqjmnw.R.inc(31539);int value = 0;
        
        __CLR4_1_10obiobilusqjmnw.R.inc(31540);for (SerializerFeature feature: features) {{
            __CLR4_1_10obiobilusqjmnw.R.inc(31541);value |= feature.mask;
        }
        
        }__CLR4_1_10obiobilusqjmnw.R.inc(31542);return value;
    }finally{__CLR4_1_10obiobilusqjmnw.R.flushNeeded();}}
    
    public final static SerializerFeature[] EMPTY = new SerializerFeature[0];

    public static final int WRITE_MAP_NULL_FEATURES
            = WriteMapNullValue.getMask()
            | WriteNullBooleanAsFalse.getMask()
            | WriteNullListAsEmpty.getMask()
            | WriteNullNumberAsZero.getMask()
            | WriteNullStringAsEmpty.getMask()
            ;
;public static class __CLR4_1_10obiobilusqjmnw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,31543,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
