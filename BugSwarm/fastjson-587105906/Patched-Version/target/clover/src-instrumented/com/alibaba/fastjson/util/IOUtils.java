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
package com.alibaba.fastjson.util;

import java.io.Closeable;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Properties;

import com.alibaba.fastjson.JSONException;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class IOUtils {public static class __CLR4_5_2q6oq6olusyjo6b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,34518,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public final static String     FASTJSON_PROPERTIES              = "fastjson.properties";
    public final static String     FASTJSON_COMPATIBLEWITHJAVABEAN  = "fastjson.compatibleWithJavaBean";
    public final static String     FASTJSON_COMPATIBLEWITHFIELDNAME = "fastjson.compatibleWithFieldName";
    public final static Properties DEFAULT_PROPERTIES               = new Properties();
    public final static Charset    UTF8                             = Charset.forName("UTF-8");
    public final static char[]     DIGITS                           = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final static boolean[]  firstIdentifierFlags             = new boolean[256];
    public final static boolean[]  identifierFlags                  = new boolean[256];
    static {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(33936);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33937);for (char c = 0; (((c < firstIdentifierFlags.length)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33938)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33939)==0&false)); ++c) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(33940);if ((((c >= 'A' && c <= 'Z')&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33941)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33942)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33943);firstIdentifierFlags[c] = true;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(33944);if ((((c >= 'a' && c <= 'z')&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33945)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33946)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33947);firstIdentifierFlags[c] = true;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(33948);if ((((c == '_' || c == '$')&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33949)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33950)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33951);firstIdentifierFlags[c] = true;
            }
        }}}}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(33952);for (char c = 0; (((c < identifierFlags.length)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33953)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33954)==0&false)); ++c) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(33955);if ((((c >= 'A' && c <= 'Z')&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33956)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33957)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33958);identifierFlags[c] = true;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(33959);if ((((c >= 'a' && c <= 'z')&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33960)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33961)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33962);identifierFlags[c] = true;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(33963);if ((((c == '_')&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33964)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33965)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33966);identifierFlags[c] = true;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(33967);if ((((c >= '0' && c <= '9')&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33968)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33969)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33970);identifierFlags[c] = true;
            }
        }}}}}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(33971);try {
            __CLR4_5_2q6oq6olusyjo6b.R.inc(33972);loadPropertiesFromFile();
        } catch (Throwable e) {
            //skip
        }
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}
    
    public static String getStringProperty(String name) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(33973);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33974);String prop = null;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33975);try {
            __CLR4_5_2q6oq6olusyjo6b.R.inc(33976);prop = System.getProperty(name);
        } catch (SecurityException e) {
            //skip
        }
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33977);return ((((prop == null) )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33978)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33979)==0&false))? DEFAULT_PROPERTIES.getProperty(name) : prop;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}
    
    public static void loadPropertiesFromFile(){try{__CLR4_5_2q6oq6olusyjo6b.R.inc(33980);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33981);InputStream imputStream = AccessController.doPrivileged(new PrivilegedAction<InputStream>() {
            public InputStream run() {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(33982);
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33983);ClassLoader cl = Thread.currentThread().getContextClassLoader();
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33984);if ((((cl != null)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33985)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33986)==0&false))) {{
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(33987);return cl.getResourceAsStream(FASTJSON_PROPERTIES);
                } }else {{
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(33988);return ClassLoader.getSystemResourceAsStream(FASTJSON_PROPERTIES);
                }
            }}finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}
        });
        
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33989);if ((((null != imputStream)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(33990)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(33991)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(33992);try {
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33993);DEFAULT_PROPERTIES.load(imputStream);
                __CLR4_5_2q6oq6olusyjo6b.R.inc(33994);imputStream.close();
            } catch (java.io.IOException e) {
                // skip
            }
        }
    }}finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    public final static byte[]    specicalFlags_doubleQuotes = new byte[161];
    public final static byte[]    specicalFlags_singleQuotes = new byte[161];
    public final static boolean[] specicalFlags_doubleQuotesFlags = new boolean[161];
    public final static boolean[] specicalFlags_singleQuotesFlags = new boolean[161];

    public final static char[]    replaceChars               = new char[93];
    static {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(33995);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33996);specicalFlags_doubleQuotes['\0'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33997);specicalFlags_doubleQuotes['\1'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33998);specicalFlags_doubleQuotes['\2'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(33999);specicalFlags_doubleQuotes['\3'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34000);specicalFlags_doubleQuotes['\4'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34001);specicalFlags_doubleQuotes['\5'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34002);specicalFlags_doubleQuotes['\6'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34003);specicalFlags_doubleQuotes['\7'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34004);specicalFlags_doubleQuotes['\b'] = 1; // 8
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34005);specicalFlags_doubleQuotes['\t'] = 1; // 9
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34006);specicalFlags_doubleQuotes['\n'] = 1; // 10
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34007);specicalFlags_doubleQuotes[''] = 4; // 11
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34008);specicalFlags_doubleQuotes['\f'] = 1; // 12
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34009);specicalFlags_doubleQuotes['\r'] = 1; // 13
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34010);specicalFlags_doubleQuotes['\"'] = 1; // 34
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34011);specicalFlags_doubleQuotes['\\'] = 1; // 92

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34012);specicalFlags_singleQuotes['\0'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34013);specicalFlags_singleQuotes['\1'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34014);specicalFlags_singleQuotes['\2'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34015);specicalFlags_singleQuotes['\3'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34016);specicalFlags_singleQuotes['\4'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34017);specicalFlags_singleQuotes['\5'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34018);specicalFlags_singleQuotes['\6'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34019);specicalFlags_singleQuotes['\7'] = 4;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34020);specicalFlags_singleQuotes['\b'] = 1; // 8
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34021);specicalFlags_singleQuotes['\t'] = 1; // 9
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34022);specicalFlags_singleQuotes['\n'] = 1; // 10
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34023);specicalFlags_singleQuotes[''] = 4; // 11
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34024);specicalFlags_singleQuotes['\f'] = 1; // 12
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34025);specicalFlags_singleQuotes['\r'] = 1; // 13
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34026);specicalFlags_singleQuotes['\\'] = 1; // 92
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34027);specicalFlags_singleQuotes['\''] = 1; // 39

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34028);for (int i = 14; (((i <= 31)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34029)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34030)==0&false)); ++i) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34031);specicalFlags_doubleQuotes[i] = 4;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34032);specicalFlags_singleQuotes[i] = 4;
        }

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34033);for (int i = 127; (((i < 160)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34034)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34035)==0&false)); ++i) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34036);specicalFlags_doubleQuotes[i] = 4;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34037);specicalFlags_singleQuotes[i] = 4;
        }
        
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34038);for (int i = 0; (((i < 161)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34039)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34040)==0&false)); ++i) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34041);specicalFlags_doubleQuotesFlags[i] = specicalFlags_doubleQuotes[i] != 0;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34042);specicalFlags_singleQuotesFlags[i] = specicalFlags_singleQuotes[i] != 0;
        }

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34043);replaceChars['\0'] = '0';
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34044);replaceChars['\1'] = '1';
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34045);replaceChars['\2'] = '2';
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34046);replaceChars['\3'] = '3';
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34047);replaceChars['\4'] = '4';
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34048);replaceChars['\5'] = '5';
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34049);replaceChars['\6'] = '6';
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34050);replaceChars['\7'] = '7';
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34051);replaceChars['\b'] = 'b'; // 8
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34052);replaceChars['\t'] = 't'; // 9
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34053);replaceChars['\n'] = 'n'; // 10
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34054);replaceChars[''] = 'v'; // 11
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34055);replaceChars['\f'] = 'f'; // 12
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34056);replaceChars['\r'] = 'r'; // 13
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34057);replaceChars['\"'] = '"'; // 34
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34058);replaceChars['\''] = '\''; // 39
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34059);replaceChars['/'] = '/'; // 47
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34060);replaceChars['\\'] = '\\'; // 92
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    public final static char[]    ASCII_CHARS                = { '0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0',
            '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F',
            '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1',
            'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4',
            '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2',
            'F',                                            };

    public static void close(Closeable x) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34061);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34062);if ((((x != null)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34063)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34064)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34065);try {
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34066);x.close();
            } catch (Exception e) {
                // skip
            }
        }
    }}finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    // Requires positive x
    public static int stringSize(long x) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34067);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34068);long p = 10;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34069);for (int i = 1; (((i < 19)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34070)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34071)==0&false)); i++) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34072);if ((((x < p)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34073)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34074)==0&false))) {__CLR4_5_2q6oq6olusyjo6b.R.inc(34075);return i;
            }__CLR4_5_2q6oq6olusyjo6b.R.inc(34076);p = 10 * p;
        }
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34077);return 19;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    public static void getChars(long i, int index, char[] buf) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34078);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34079);long q;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34080);int r;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34081);int charPos = index;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34082);char sign = 0;

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34083);if ((((i < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34084)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34085)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34086);sign = '-';
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34087);i = -i;
        }

        // Get 2 digits/iteration using longs until quotient fits into an int
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34088);while ((((i > Integer.MAX_VALUE)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34089)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34090)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34091);q = i / 100;
            // really: r = i - (q * 100);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34092);r = (int) (i - ((q << 6) + (q << 5) + (q << 2)));
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34093);i = q;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34094);buf[--charPos] = DigitOnes[r];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34095);buf[--charPos] = DigitTens[r];
        }

        // Get 2 digits/iteration using ints
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34096);int q2;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34097);int i2 = (int) i;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34098);while ((((i2 >= 65536)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34099)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34100)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34101);q2 = i2 / 100;
            // really: r = i2 - (q * 100);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34102);r = i2 - ((q2 << 6) + (q2 << 5) + (q2 << 2));
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34103);i2 = q2;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34104);buf[--charPos] = DigitOnes[r];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34105);buf[--charPos] = DigitTens[r];
        }

        // Fall thru to fast mode for smaller numbers
        // assert(i2 <= 65536, i2);
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34106);for (;;) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34107);q2 = (i2 * 52429) >>> (16 + 3);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34108);r = i2 - ((q2 << 3) + (q2 << 1)); // r = i2-(q2*10) ...
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34109);buf[--charPos] = digits[r];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34110);i2 = q2;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34111);if ((((i2 == 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34112)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34113)==0&false))) {__CLR4_5_2q6oq6olusyjo6b.R.inc(34114);break;
        }}
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34115);if ((((sign != 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34116)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34117)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34118);buf[--charPos] = sign;
        }
    }}finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    /**
     * Places characters representing the integer i into the character array buf. The characters are placed into the
     * buffer backwards starting with the least significant digit at the specified index (exclusive), and working
     * backwards from there. Will fail if i == Integer.MIN_VALUE
     */
    public static void getChars(int i, int index, char[] buf) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34119);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34120);int q, r, p = index;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34121);char sign = 0;

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34122);if ((((i < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34123)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34124)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34125);sign = '-';
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34126);i = -i;
        }

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34127);while ((((i >= 65536)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34128)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34129)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34130);q = i / 100;
            // really: r = i - (q * 100);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34131);r = i - ((q << 6) + (q << 5) + (q << 2));
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34132);i = q;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34133);buf[--p] = DigitOnes[r];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34134);buf[--p] = DigitTens[r];
        }

        // Fall thru to fast mode for smaller numbers
        // assert(i <= 65536, i);
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34135);for (;;) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34136);q = (i * 52429) >>> (16 + 3);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34137);r = i - ((q << 3) + (q << 1)); // r = i-(q*10) ...
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34138);buf[--p] = digits[r];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34139);i = q;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34140);if ((((i == 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34141)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34142)==0&false))) {__CLR4_5_2q6oq6olusyjo6b.R.inc(34143);break;
        }}
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34144);if ((((sign != 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34145)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34146)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34147);buf[--p] = sign;
        }
    }}finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    public static void getChars(byte b, int index, char[] buf) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34148);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34149);int i = b;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34150);int q, r;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34151);int charPos = index;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34152);char sign = 0;

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34153);if ((((i < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34154)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34155)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34156);sign = '-';
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34157);i = -i;
        }

        // Fall thru to fast mode for smaller numbers
        // assert(i <= 65536, i);
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34158);for (;;) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34159);q = (i * 52429) >>> (16 + 3);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34160);r = i - ((q << 3) + (q << 1)); // r = i-(q*10) ...
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34161);buf[--charPos] = digits[r];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34162);i = q;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34163);if ((((i == 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34164)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34165)==0&false))) {__CLR4_5_2q6oq6olusyjo6b.R.inc(34166);break;
        }}
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34167);if ((((sign != 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34168)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34169)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34170);buf[--charPos] = sign;
        }
    }}finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    /**
     * All possible chars for representing a number as a String
     */
    final static char[] digits    = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    final static char[] DigitTens = { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1',
            '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3',
            '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5',
            '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7',
            '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', };

    final static char[] DigitOnes = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', };

    final static int[]  sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE };

    // Requires positive x
    public static int stringSize(int x) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34171);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34172);for (int i = 0;; i++) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34173);if ((((x <= sizeTable[i])&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34174)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34175)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34176);return i + 1;
            }
        }}
    }}finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    public static void decode(CharsetDecoder charsetDecoder, ByteBuffer byteBuf, CharBuffer charByte) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34177);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34178);try {
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34179);CoderResult cr = charsetDecoder.decode(byteBuf, charByte, true);

            __CLR4_5_2q6oq6olusyjo6b.R.inc(34180);if ((((!cr.isUnderflow())&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34181)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34182)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34183);cr.throwException();
            }

            }__CLR4_5_2q6oq6olusyjo6b.R.inc(34184);cr = charsetDecoder.flush(charByte);

            __CLR4_5_2q6oq6olusyjo6b.R.inc(34185);if ((((!cr.isUnderflow())&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34186)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34187)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34188);cr.throwException();
            }
        }} catch (CharacterCodingException x) {
            // Substitution is always enabled,
            // so this shouldn't happen
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34189);throw new JSONException("utf8 decode error, " + x.getMessage(), x);
        }
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    public static boolean firstIdentifier(char ch) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34190);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34191);return ch < IOUtils.firstIdentifierFlags.length && IOUtils.firstIdentifierFlags[ch];
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}
    
    public static boolean isIdent(char ch) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34192);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34193);return ch < identifierFlags.length && identifierFlags[ch];
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}
    
    public static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final int[]  IA = new int[256];
    static {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34194);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34195);Arrays.fill(IA, -1);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34196);for (int i = 0, iS = CA.length; (((i < iS)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34197)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34198)==0&false)); i++)
            {__CLR4_5_2q6oq6olusyjo6b.R.inc(34199);IA[CA[i]] = i;
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34200);IA['='] = 0;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    /**
     * Decodes a BASE64 encoded char array that is known to be resonably well formatted. The method is about twice as
     * fast as #decode(char[]). The preconditions are:<br>
     * + The array must have a line length of 76 chars OR no line separators at all (one line).<br>
     * + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within
     * the encoded string<br>
     * + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.<br>
     *
     * @author Mikael Grev Date: 2004-aug-02 Time: 11:31:11
     * @param chars The source array. Length 0 will return an empty array. <code>null</code> will throw an exception.
     * @return The decoded array of bytes. May be of length 0.
     */
    public static byte[] decodeBase64(char[] chars, int offset, int charsLen) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34201);
        // Check special case
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34202);if ((((charsLen == 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34203)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34204)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34205);return new byte[0];
        }

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34206);int sIx = offset, eIx = offset + charsLen - 1; // Start and end index after trimming.

        // Trim illegal chars from start
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34207);while ((((sIx < eIx && IA[chars[sIx]] < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34208)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34209)==0&false)))
            {__CLR4_5_2q6oq6olusyjo6b.R.inc(34210);sIx++;

        // Trim illegal chars from end
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34211);while ((((eIx > 0 && IA[chars[eIx]] < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34212)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34213)==0&false)))
            {__CLR4_5_2q6oq6olusyjo6b.R.inc(34214);eIx--;

        // get the padding count (=) (0, 1 or 2)
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34215);int pad = (((chars[eIx] == '=' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34216)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34217)==0&false))? ((((chars[eIx - 1] == '=' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34218)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34219)==0&false))? 2 : 1) : 0; // Count '=' at end.
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34220);int cCnt = eIx - sIx + 1; // Content count including possible separators
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34221);int sepCnt = (((charsLen > 76 )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34222)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34223)==0&false))? ((((chars[76] == '\r' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34224)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34225)==0&false))? cCnt / 78 : 0) << 1 : 0;

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34226);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34227);byte[] bytes = new byte[len]; // Preallocate byte[] of exact length

        // Decode all but the last 0 - 2 bytes.
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34228);int d = 0;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34229);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34230)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34231)==0&false));) {{
            // Assemble three bytes into an int from four "valid" characters.
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34232);int i = IA[chars[sIx++]] << 18 | IA[chars[sIx++]] << 12 | IA[chars[sIx++]] << 6 | IA[chars[sIx++]];

            // Add the bytes
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34233);bytes[d++] = (byte) (i >> 16);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34234);bytes[d++] = (byte) (i >> 8);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34235);bytes[d++] = (byte) i;

            // If line separator, jump over it.
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34236);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34237)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34238)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34239);sIx += 2;
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34240);cc = 0;
            }
        }}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34241);if ((((d < len)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34242)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34243)==0&false))) {{
            // Decode last 1-3 bytes (incl '=') into 1-3 bytes
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34244);int i = 0;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34245);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34246)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34247)==0&false)); j++)
                {__CLR4_5_2q6oq6olusyjo6b.R.inc(34248);i |= IA[chars[sIx++]] << (18 - j * 6);

            }__CLR4_5_2q6oq6olusyjo6b.R.inc(34249);for (int r = 16; (((d < len)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34250)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34251)==0&false)); r -= 8)
                {__CLR4_5_2q6oq6olusyjo6b.R.inc(34252);bytes[d++] = (byte) (i >> r);
        }}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34253);return bytes;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    /**
     * @author Mikael Grev Date: 2004-aug-02 Time: 11:31:11
     */
    public static byte[] decodeBase64(String chars, int offset, int charsLen) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34254);
        // Check special case
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34255);if ((((charsLen == 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34256)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34257)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34258);return new byte[0];
        }

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34259);int sIx = offset, eIx = offset + charsLen - 1; // Start and end index after trimming.

        // Trim illegal chars from start
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34260);while ((((sIx < eIx && IA[chars.charAt(sIx)] < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34261)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34262)==0&false)))
            {__CLR4_5_2q6oq6olusyjo6b.R.inc(34263);sIx++;

        // Trim illegal chars from end
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34264);while ((((eIx > 0 && IA[chars.charAt(eIx)] < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34265)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34266)==0&false)))
            {__CLR4_5_2q6oq6olusyjo6b.R.inc(34267);eIx--;

        // get the padding count (=) (0, 1 or 2)
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34268);int pad = (((chars.charAt(eIx) == '=' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34269)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34270)==0&false))? ((((chars.charAt(eIx - 1) == '=' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34271)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34272)==0&false))? 2 : 1) : 0; // Count '=' at end.
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34273);int cCnt = eIx - sIx + 1; // Content count including possible separators
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34274);int sepCnt = (((charsLen > 76 )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34275)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34276)==0&false))? ((((chars.charAt(76) == '\r' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34277)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34278)==0&false))? cCnt / 78 : 0) << 1 : 0;

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34279);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34280);byte[] bytes = new byte[len]; // Preallocate byte[] of exact length

        // Decode all but the last 0 - 2 bytes.
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34281);int d = 0;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34282);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34283)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34284)==0&false));) {{
            // Assemble three bytes into an int from four "valid" characters.
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34285);int i = IA[chars.charAt(sIx++)] << 18
                    | IA[chars.charAt(sIx++)] << 12
                    | IA[chars.charAt(sIx++)] << 6
                    | IA[chars.charAt(sIx++)];

            // Add the bytes
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34286);bytes[d++] = (byte) (i >> 16);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34287);bytes[d++] = (byte) (i >> 8);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34288);bytes[d++] = (byte) i;

            // If line separator, jump over it.
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34289);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34290)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34291)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34292);sIx += 2;
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34293);cc = 0;
            }
        }}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34294);if ((((d < len)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34295)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34296)==0&false))) {{
            // Decode last 1-3 bytes (incl '=') into 1-3 bytes
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34297);int i = 0;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34298);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34299)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34300)==0&false)); j++)
                {__CLR4_5_2q6oq6olusyjo6b.R.inc(34301);i |= IA[chars.charAt(sIx++)] << (18 - j * 6);

            }__CLR4_5_2q6oq6olusyjo6b.R.inc(34302);for (int r = 16; (((d < len)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34303)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34304)==0&false)); r -= 8)
                {__CLR4_5_2q6oq6olusyjo6b.R.inc(34305);bytes[d++] = (byte) (i >> r);
        }}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34306);return bytes;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    /**
     * Decodes a BASE64 encoded string that is known to be resonably well formatted. The method is about twice as fast
     * as decode(String). The preconditions are:<br>
     * + The array must have a line length of 76 chars OR no line separators at all (one line).<br>
     * + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within
     * the encoded string<br>
     * + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.<br>
     *
     * @author Mikael Grev Date: 2004-aug-02 Time: 11:31:11
     * @param s The source string. Length 0 will return an empty array. <code>null</code> will throw an exception.
     * @return The decoded array of bytes. May be of length 0.
     */
    public static byte[] decodeBase64(String s) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34307);
        // Check special case
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34308);int sLen = s.length();
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34309);if ((((sLen == 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34310)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34311)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34312);return new byte[0];
        }

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34313);int sIx = 0, eIx = sLen - 1; // Start and end index after trimming.

        // Trim illegal chars from start
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34314);while ((((sIx < eIx && IA[s.charAt(sIx) & 0xff] < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34315)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34316)==0&false)))
            {__CLR4_5_2q6oq6olusyjo6b.R.inc(34317);sIx++;

        // Trim illegal chars from end
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34318);while ((((eIx > 0 && IA[s.charAt(eIx) & 0xff] < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34319)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34320)==0&false)))
            {__CLR4_5_2q6oq6olusyjo6b.R.inc(34321);eIx--;

        // get the padding count (=) (0, 1 or 2)
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34322);int pad = (((s.charAt(eIx) == '=' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34323)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34324)==0&false))? ((((s.charAt(eIx - 1) == '=' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34325)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34326)==0&false))? 2 : 1) : 0; // Count '=' at end.
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34327);int cCnt = eIx - sIx + 1; // Content count including possible separators
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34328);int sepCnt = (((sLen > 76 )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34329)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34330)==0&false))? ((((s.charAt(76) == '\r' )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34331)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34332)==0&false))? cCnt / 78 : 0) << 1 : 0;

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34333);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34334);byte[] dArr = new byte[len]; // Preallocate byte[] of exact length

        // Decode all but the last 0 - 2 bytes.
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34335);int d = 0;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34336);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34337)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34338)==0&false));) {{
            // Assemble three bytes into an int from four "valid" characters.
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34339);int i = IA[s.charAt(sIx++)] << 18 | IA[s.charAt(sIx++)] << 12 | IA[s.charAt(sIx++)] << 6
                    | IA[s.charAt(sIx++)];

            // Add the bytes
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34340);dArr[d++] = (byte) (i >> 16);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34341);dArr[d++] = (byte) (i >> 8);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34342);dArr[d++] = (byte) i;

            // If line separator, jump over it.
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34343);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34344)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34345)==0&false))) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34346);sIx += 2;
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34347);cc = 0;
            }
        }}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34348);if ((((d < len)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34349)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34350)==0&false))) {{
            // Decode last 1-3 bytes (incl '=') into 1-3 bytes
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34351);int i = 0;
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34352);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34353)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34354)==0&false)); j++)
                {__CLR4_5_2q6oq6olusyjo6b.R.inc(34355);i |= IA[s.charAt(sIx++)] << (18 - j * 6);

            }__CLR4_5_2q6oq6olusyjo6b.R.inc(34356);for (int r = 16; (((d < len)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34357)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34358)==0&false)); r -= 8)
                {__CLR4_5_2q6oq6olusyjo6b.R.inc(34359);dArr[d++] = (byte) (i >> r);
        }}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34360);return dArr;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}
    
    public static int encodeUTF8(char[] chars, int offset, int len, byte[] bytes) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34361);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34362);int sl = offset + len;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34363);int dp = 0;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34364);int dlASCII = dp + Math.min(len, bytes.length);

        // ASCII only optimized loop
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34365);while ((((dp < dlASCII && chars[offset] < '\u0080')&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34366)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34367)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34368);bytes[dp++] = (byte) chars[offset++];
        }

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34369);while ((((offset < sl)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34370)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34371)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34372);char c = chars[offset++];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34373);if ((((c < 0x80)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34374)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34375)==0&false))) {{
                // Have at most seven bits
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34376);bytes[dp++] = (byte) c;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(34377);if ((((c < 0x800)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34378)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34379)==0&false))) {{
                // 2 bytes, 11 bits
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34380);bytes[dp++] = (byte) (0xc0 | (c >> 6));
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34381);bytes[dp++] = (byte) (0x80 | (c & 0x3f));
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(34382);if ((((c >= '\ud800' && c < ('\udfff' + 1))&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34383)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34384)==0&false))) {{ //Character.isSurrogate(c) but 1.7
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34385);final int uc;
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34386);int ip = offset - 1;
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34387);if ((((c >= '\ud800' && c < ('\udbff' + 1))&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34388)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34389)==0&false))) {{ // Character.isHighSurrogate(c)
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34390);if ((((sl - ip < 2)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34391)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34392)==0&false))) {{
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34393);uc = -1;
                    } }else {{
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34394);char d = chars[ip + 1];
                        // d >= '\udc00' && d < ('\udfff' + 1)
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34395);if ((((d >= '\udc00' && d < ('\udfff' + 1))&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34396)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34397)==0&false))) {{ // Character.isLowSurrogate(d)
                            __CLR4_5_2q6oq6olusyjo6b.R.inc(34398);uc = ((c << 10) + d) + (0x010000 - ('\ud800' << 10) - '\udc00'); // Character.toCodePoint(c, d)
                        } }else {{
//                            throw new JSONException("encodeUTF8 error", new MalformedInputException(1));
                            __CLR4_5_2q6oq6olusyjo6b.R.inc(34399);bytes[dp++] = (byte) '?';
                            __CLR4_5_2q6oq6olusyjo6b.R.inc(34400);continue;
                        }
                    }}
                }} }else {{
                    //
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34401);if ((((c >= '\udc00' && c < ('\udfff' + 1))&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34402)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34403)==0&false))) {{ // Character.isLowSurrogate(c)
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34404);bytes[dp++] = (byte) '?';
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34405);continue;
//                        throw new JSONException("encodeUTF8 error", new MalformedInputException(1));
                    } }else {{
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34406);uc = c;
                    }
                }}
                
                }__CLR4_5_2q6oq6olusyjo6b.R.inc(34407);if ((((uc < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34408)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34409)==0&false))) {{
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34410);bytes[dp++] = (byte) '?';
                } }else {{
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34411);bytes[dp++] = (byte) (0xf0 | ((uc >> 18)));
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34412);bytes[dp++] = (byte) (0x80 | ((uc >> 12) & 0x3f));
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34413);bytes[dp++] = (byte) (0x80 | ((uc >> 6) & 0x3f));
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34414);bytes[dp++] = (byte) (0x80 | (uc & 0x3f));
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34415);offset++; // 2 chars
                }
            }} }else {{
                // 3 bytes, 16 bits
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34416);bytes[dp++] = (byte) (0xe0 | ((c >> 12)));
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34417);bytes[dp++] = (byte) (0x80 | ((c >> 6) & 0x3f));
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34418);bytes[dp++] = (byte) (0x80 | (c & 0x3f));
            }
        }}}}
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34419);return dp;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public static int decodeUTF8(byte[] sa, int sp, int len, char[] da) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34420);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34421);final int sl = sp + len;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34422);int dp = 0;
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34423);int dlASCII = Math.min(len, da.length);

        // ASCII only optimized loop
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34424);while ((((dp < dlASCII && sa[sp] >= 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34425)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34426)==0&false)))
            {__CLR4_5_2q6oq6olusyjo6b.R.inc(34427);da[dp++] = (char) sa[sp++];

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34428);while ((((sp < sl)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34429)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34430)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34431);int b1 = sa[sp++];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34432);if ((((b1 >= 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34433)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34434)==0&false))) {{
                // 1 byte, 7 bits: 0xxxxxxx
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34435);da[dp++] = (char) b1;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(34436);if (((((b1 >> 5) == -2 && (b1 & 0x1e) != 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34437)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34438)==0&false))) {{
                // 2 bytes, 11 bits: 110xxxxx 10xxxxxx
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34439);if ((((sp < sl)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34440)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34441)==0&false))) {{
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34442);int b2 = sa[sp++];
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34443);if (((((b2 & 0xc0) != 0x80)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34444)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34445)==0&false))) {{ // isNotContinuation(b2)
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34446);return -1;
                    } }else {{
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34447);da[dp++] = (char) (((b1 << 6) ^ b2)^
                                       (((byte) 0xC0 << 6) ^
                                        ((byte) 0x80 << 0)));
                    }
                    }__CLR4_5_2q6oq6olusyjo6b.R.inc(34448);continue;
                }
                }__CLR4_5_2q6oq6olusyjo6b.R.inc(34449);return -1;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(34450);if (((((b1 >> 4) == -2)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34451)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34452)==0&false))) {{
                // 3 bytes, 16 bits: 1110xxxx 10xxxxxx 10xxxxxx
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34453);if ((((sp + 1 < sl)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34454)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34455)==0&false))) {{
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34456);int b2 = sa[sp++];
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34457);int b3 = sa[sp++];
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34458);if (((((b1 == (byte) 0xe0 && (b2 & 0xe0) == 0x80) //
                        || (b2 & 0xc0) != 0x80 //
                        || (b3 & 0xc0) != 0x80)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34459)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34460)==0&false))) {{ // isMalformed3(b1, b2, b3)
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34461);return -1;
                    } }else {{
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34462);char c = (char)((b1 << 12) ^
                                          (b2 <<  6) ^
                                          (b3 ^
                                          (((byte) 0xE0 << 12) ^
                                          ((byte) 0x80 <<  6) ^
                                          ((byte) 0x80 <<  0))));
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34463);boolean isSurrogate = c >= '\ud800' && c < ('\udfff' + 1);
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34464);if ((((isSurrogate)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34465)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34466)==0&false))) {{
                            __CLR4_5_2q6oq6olusyjo6b.R.inc(34467);return -1;
                        } }else {{
                            __CLR4_5_2q6oq6olusyjo6b.R.inc(34468);da[dp++] = c;
                        }
                    }}
                    }__CLR4_5_2q6oq6olusyjo6b.R.inc(34469);continue;
                }
                }__CLR4_5_2q6oq6olusyjo6b.R.inc(34470);return -1;
            } }else {__CLR4_5_2q6oq6olusyjo6b.R.inc(34471);if (((((b1 >> 3) == -2)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34472)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34473)==0&false))) {{
                // 4 bytes, 21 bits: 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34474);if ((((sp + 2 < sl)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34475)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34476)==0&false))) {{
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34477);int b2 = sa[sp++];
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34478);int b3 = sa[sp++];
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34479);int b4 = sa[sp++];
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34480);int uc = ((b1 << 18) ^
                              (b2 << 12) ^
                              (b3 <<  6) ^
                              (b4 ^
                               (((byte) 0xF0 << 18) ^
                               ((byte) 0x80 << 12) ^
                               ((byte) 0x80 <<  6) ^
                               ((byte) 0x80 <<  0))));
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34481);if ((((((b2 & 0xc0) != 0x80 || (b3 & 0xc0) != 0x80 || (b4 & 0xc0) != 0x80) // isMalformed4
                        ||
                        // shortest form check
                        !(uc >= 0x010000 && uc <  0X10FFFF + 1) // !Character.isSupplementaryCodePoint(uc)
                    )&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34482)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34483)==0&false))) {{
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34484);return -1;
                    } }else {{
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34485);da[dp++] =  (char) ((uc >>> 10) + ('\ud800' - (0x010000 >>> 10))); // Character.highSurrogate(uc);
                        __CLR4_5_2q6oq6olusyjo6b.R.inc(34486);da[dp++] = (char) ((uc & 0x3ff) + '\udc00'); // Character.lowSurrogate(uc);
                    }
                    }__CLR4_5_2q6oq6olusyjo6b.R.inc(34487);continue;
                }
                }__CLR4_5_2q6oq6olusyjo6b.R.inc(34488);return -1;
            } }else {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34489);return -1;
            }
        }}}}}
        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34490);return dp;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public static String readAll(Reader reader) {try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34491);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34492);StringBuilder buf = new StringBuilder();

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34493);try {
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34494);char[] chars = new char[2048];
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34495);for (;;) {{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34496);int len = reader.read(chars, 0, chars.length);
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34497);if ((((len < 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34498)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34499)==0&false))) {{
                    __CLR4_5_2q6oq6olusyjo6b.R.inc(34500);break;
                }
                }__CLR4_5_2q6oq6olusyjo6b.R.inc(34501);buf.append(chars, 0, len);
            }
        }} catch(Exception ex) {
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34502);throw new JSONException("read string from reader error", ex);
        }

        __CLR4_5_2q6oq6olusyjo6b.R.inc(34503);return buf.toString();
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

    public static boolean isValidJsonpQueryParam(String value){try{__CLR4_5_2q6oq6olusyjo6b.R.inc(34504);
        __CLR4_5_2q6oq6olusyjo6b.R.inc(34505);if ((((value == null || value.length() == 0)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34506)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34507)==0&false))) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34508);return false;
        }

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34509);for (int i = 0, len = value.length(); (((i < len)&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34510)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34511)==0&false)); ++i) {{
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34512);char ch = value.charAt(i);
            __CLR4_5_2q6oq6olusyjo6b.R.inc(34513);if((((ch != '.' && !IOUtils.isIdent(ch))&&(__CLR4_5_2q6oq6olusyjo6b.R.iget(34514)!=0|true))||(__CLR4_5_2q6oq6olusyjo6b.R.iget(34515)==0&false))){{
                __CLR4_5_2q6oq6olusyjo6b.R.inc(34516);return false;
            }
        }}

        }__CLR4_5_2q6oq6olusyjo6b.R.inc(34517);return true;
    }finally{__CLR4_5_2q6oq6olusyjo6b.R.flushNeeded();}}

}
