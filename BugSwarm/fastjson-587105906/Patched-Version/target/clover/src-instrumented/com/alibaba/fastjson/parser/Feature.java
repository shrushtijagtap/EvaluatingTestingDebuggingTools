/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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


/**
 * @author wenshao[szujobs@hotmail.com]
 */
public enum Feature {
    /**
	 * 
	 */
    AutoCloseSource,
    /**
	 * 
	 */
    AllowComment,
    /**
	 * 
	 */
    AllowUnQuotedFieldNames,
    /**
	 * 
	 */
    AllowSingleQuotes,
    /**
	 * 
	 */
    InternFieldNames,
    /**
	 * 
	 */
    AllowISO8601DateFormat,

    /**
     * {"a":1,,,"b":2}
     */
    AllowArbitraryCommas,

    /**
     * 
     */
    UseBigDecimal,
    
    /**
     * @since 1.1.2
     */
    IgnoreNotMatch,

    /**
     * @since 1.1.3
     */
    SortFeidFastMatch,
    
    /**
     * @since 1.1.3
     */
    DisableASM,
    
    /**
     * @since 1.1.7
     */
    DisableCircularReferenceDetect,
    
    /**
     * @since 1.1.10
     */
    InitStringFieldAsEmpty,
    
    /**
     * @since 1.1.35
     * 
     */
    SupportArrayToBean,
    
    /**
     * @since 1.2.3
     * 
     */
    OrderedField,
    
    /**
     * @since 1.2.5
     * 
     */
    DisableSpecialKeyDetect,
    
    /**
     * @since 1.2.9
     */
    UseObjectArray,

    /**
     * @since 1.2.22, 1.1.54.android
     */
    SupportNonPublicField,

    /**
     * @since 1.2.29
     *
     * disable autotype key '@type'
     */
    IgnoreAutoType,

    /**
     * @since 1.2.30
     *
     * disable field smart match, improve performance in some scenarios.
     */
    DisableFieldSmartMatch,

    /**
     * @since 1.2.41, backport to 1.1.66.android
     */
    SupportAutoType,

    /**
     * @since 1.2.42
     */
    NonStringKeyAsString,

    /**
     * @since 1.2.45
     */
    CustomMapDeserializer,

    /**
     * @since 1.2.55
     */
    ErrorOnEnumNotMatch
    ;

    Feature(){try{__CLR4_5_268i68ilusvmjiv.R.inc(8082);
        __CLR4_5_268i68ilusvmjiv.R.inc(8083);mask = (1 << ordinal());
    }finally{__CLR4_5_268i68ilusvmjiv.R.flushNeeded();}}

    public final int mask;

    public final int getMask() {try{__CLR4_5_268i68ilusvmjiv.R.inc(8084);
        __CLR4_5_268i68ilusvmjiv.R.inc(8085);return mask;
    }finally{__CLR4_5_268i68ilusvmjiv.R.flushNeeded();}}

    public static boolean isEnabled(int features, Feature feature) {try{__CLR4_5_268i68ilusvmjiv.R.inc(8086);
        __CLR4_5_268i68ilusvmjiv.R.inc(8087);return (features & feature.mask) != 0;
    }finally{__CLR4_5_268i68ilusvmjiv.R.flushNeeded();}}

    public static int config(int features, Feature feature, boolean state) {try{__CLR4_5_268i68ilusvmjiv.R.inc(8088);
        __CLR4_5_268i68ilusvmjiv.R.inc(8089);if ((((state)&&(__CLR4_5_268i68ilusvmjiv.R.iget(8090)!=0|true))||(__CLR4_5_268i68ilusvmjiv.R.iget(8091)==0&false))) {{
            __CLR4_5_268i68ilusvmjiv.R.inc(8092);features |= feature.mask;
        } }else {{
            __CLR4_5_268i68ilusvmjiv.R.inc(8093);features &= ~feature.mask;
        }

        }__CLR4_5_268i68ilusvmjiv.R.inc(8094);return features;
    }finally{__CLR4_5_268i68ilusvmjiv.R.flushNeeded();}}
    
    public static int of(Feature[] features) {try{__CLR4_5_268i68ilusvmjiv.R.inc(8095);
        __CLR4_5_268i68ilusvmjiv.R.inc(8096);if ((((features == null)&&(__CLR4_5_268i68ilusvmjiv.R.iget(8097)!=0|true))||(__CLR4_5_268i68ilusvmjiv.R.iget(8098)==0&false))) {{
            __CLR4_5_268i68ilusvmjiv.R.inc(8099);return 0;
        }
        
        }__CLR4_5_268i68ilusvmjiv.R.inc(8100);int value = 0;
        
        __CLR4_5_268i68ilusvmjiv.R.inc(8101);for (Feature feature: features) {{
            __CLR4_5_268i68ilusvmjiv.R.inc(8102);value |= feature.mask;
        }
        
        }__CLR4_5_268i68ilusvmjiv.R.inc(8103);return value;
    }finally{__CLR4_5_268i68ilusvmjiv.R.flushNeeded();}}
;public static class __CLR4_5_268i68ilusvmjiv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,8104,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
