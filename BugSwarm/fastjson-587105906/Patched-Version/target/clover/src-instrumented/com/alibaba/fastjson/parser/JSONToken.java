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
@java.lang.SuppressWarnings({"fallthrough"}) public class JSONToken {public static class __CLR4_5_2chvchvlusyjkz8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,16251,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //
    public final static int ERROR                = 1;
    //
    public final static int LITERAL_INT          = 2;
    //
    public final static int LITERAL_FLOAT        = 3;
    //
    public final static int LITERAL_STRING       = 4;
    //
    public final static int LITERAL_ISO8601_DATE = 5;

    public final static int TRUE                 = 6;
    //
    public final static int FALSE                = 7;
    //
    public final static int NULL                 = 8;
    //
    public final static int NEW                  = 9;
    //
    public final static int LPAREN               = 10; // ("("),
    //
    public final static int RPAREN               = 11; // (")"),
    //
    public final static int LBRACE               = 12; // ("{"),
    //
    public final static int RBRACE               = 13; // ("}"),
    //
    public final static int LBRACKET             = 14; // ("["),
    //
    public final static int RBRACKET             = 15; // ("]"),
    //
    public final static int COMMA                = 16; // (","),
    //
    public final static int COLON                = 17; // (":"),
    //
    public final static int IDENTIFIER           = 18;
    //
    public final static int FIELD_NAME           = 19;

    public final static int EOF                  = 20;

    public final static int SET                  = 21;
    public final static int TREE_SET             = 22;
    
    public final static int UNDEFINED            = 23; // undefined

    public final static int SEMI                 = 24;
    public final static int DOT                  = 25;
    public final static int HEX                  = 26;

    public static String name(int value) {try{__CLR4_5_2chvchvlusyjkz8.R.inc(16195);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2chvchvlusyjkz8.R.inc(16196);switch (value) {
            case ERROR:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16197);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16198);return "error";
            case LITERAL_INT:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16199);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16200);return "int";
            case LITERAL_FLOAT:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16201);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16202);return "float";
            case LITERAL_STRING:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16203);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16204);return "string";
            case LITERAL_ISO8601_DATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16205);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16206);return "iso8601";
            case TRUE:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16207);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16208);return "true";
            case FALSE:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16209);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16210);return "false";
            case NULL:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16211);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16212);return "null";
            case NEW:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16213);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16214);return "new";
            case LPAREN:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16215);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16216);return "(";
            case RPAREN:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16217);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16218);return ")";
            case LBRACE:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16219);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16220);return "{";
            case RBRACE:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16221);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16222);return "}";
            case LBRACKET:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16223);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16224);return "[";
            case RBRACKET:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16225);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16226);return "]";
            case COMMA:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16227);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16228);return ",";
            case COLON:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16229);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16230);return ":";
            case SEMI:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16231);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16232);return ";";
            case DOT:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16233);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16234);return ".";
            case IDENTIFIER:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16235);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16236);return "ident";
            case FIELD_NAME:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16237);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16238);return "fieldName";
            case EOF:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16239);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16240);return "EOF";
            case SET:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16241);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16242);return "Set";
            case TREE_SET:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16243);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16244);return "TreeSet";
            case UNDEFINED:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16245);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16246);return "undefined";
            case HEX:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16247);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16248);return "hex";
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2chvchvlusyjkz8.R.inc(16249);__CLB4_5_2_bool0=true;}
                __CLR4_5_2chvchvlusyjkz8.R.inc(16250);return "Unknown";
        }
    }finally{__CLR4_5_2chvchvlusyjkz8.R.flushNeeded();}}
}
