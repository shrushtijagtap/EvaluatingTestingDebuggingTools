/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.hsf;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.*;
import com.alibaba.fastjson.util.TypeUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

import static com.alibaba.fastjson.parser.JSONLexer.NOT_MATCH_NAME;

public class HSFJSONUtils {public static class __CLR4_5_2ohlohllusyjnqv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,31827,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final static SymbolTable typeSymbolTable      = new SymbolTable(1024);
    final static char[]      fieldName_argsTypes  = "\"argsTypes\"".toCharArray();
    final static char[]      fieldName_argsObjs   = "\"argsObjs\"".toCharArray();

    final static char[]      fieldName_type       = "\"@type\":".toCharArray();

    public static Object[] parseInvocationArguments(String json, MethodLocator methodLocator) {try{__CLR4_5_2ohlohllusyjnqv.R.inc(31737);
        __CLR4_5_2ohlohllusyjnqv.R.inc(31738);DefaultJSONParser parser = new DefaultJSONParser(json);

        __CLR4_5_2ohlohllusyjnqv.R.inc(31739);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();

        __CLR4_5_2ohlohllusyjnqv.R.inc(31740);ParseContext rootContext = parser.setContext(null, null);

        __CLR4_5_2ohlohllusyjnqv.R.inc(31741);Object[] values;
        __CLR4_5_2ohlohllusyjnqv.R.inc(31742);int token = lexer.token();
        __CLR4_5_2ohlohllusyjnqv.R.inc(31743);if ((((token == JSONToken.LBRACE)&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31744)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31745)==0&false))) {{
            __CLR4_5_2ohlohllusyjnqv.R.inc(31746);String[] typeNames = lexer.scanFieldStringArray(fieldName_argsTypes, -1, typeSymbolTable);
            __CLR4_5_2ohlohllusyjnqv.R.inc(31747);if ((((typeNames == null && lexer.matchStat == NOT_MATCH_NAME)&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31748)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31749)==0&false))) {{
                __CLR4_5_2ohlohllusyjnqv.R.inc(31750);String type = lexer.scanFieldString(fieldName_type);
                __CLR4_5_2ohlohllusyjnqv.R.inc(31751);if (((("com.alibaba.fastjson.JSONObject".equals(type))&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31752)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31753)==0&false))) {{
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31754);typeNames = lexer.scanFieldStringArray(fieldName_argsTypes, -1, typeSymbolTable);
                }
            }}
            }__CLR4_5_2ohlohllusyjnqv.R.inc(31755);Method method = methodLocator.findMethod(typeNames);

            __CLR4_5_2ohlohllusyjnqv.R.inc(31756);if ((((method == null)&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31757)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31758)==0&false))) {{
                __CLR4_5_2ohlohllusyjnqv.R.inc(31759);lexer.close();

                __CLR4_5_2ohlohllusyjnqv.R.inc(31760);JSONObject jsonObject = JSON.parseObject(json);
                __CLR4_5_2ohlohllusyjnqv.R.inc(31761);typeNames = jsonObject.getObject("argsTypes", String[].class);
                __CLR4_5_2ohlohllusyjnqv.R.inc(31762);method = methodLocator.findMethod(typeNames);

                __CLR4_5_2ohlohllusyjnqv.R.inc(31763);JSONArray argsObjs = jsonObject.getJSONArray("argsObjs");
                __CLR4_5_2ohlohllusyjnqv.R.inc(31764);if ((((argsObjs == null)&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31765)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31766)==0&false))) {{
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31767);values = null;
                } }else {{
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31768);Type[] argTypes = method.getGenericParameterTypes();
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31769);values = new Object[argTypes.length];
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31770);for (int i = 0; (((i < argTypes.length)&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31771)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31772)==0&false)); i++) {{
                        __CLR4_5_2ohlohllusyjnqv.R.inc(31773);Type type = argTypes[i];
                        __CLR4_5_2ohlohllusyjnqv.R.inc(31774);values[i] = argsObjs.getObject(i, type);
                    }
                }}
            }} }else {{
                __CLR4_5_2ohlohllusyjnqv.R.inc(31775);Type[] argTypes = method.getGenericParameterTypes();

                __CLR4_5_2ohlohllusyjnqv.R.inc(31776);lexer.skipWhitespace();
                __CLR4_5_2ohlohllusyjnqv.R.inc(31777);if ((((lexer.getCurrent() == ',')&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31778)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31779)==0&false))) {{
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31780);lexer.next();
                }

                }__CLR4_5_2ohlohllusyjnqv.R.inc(31781);if ((((lexer.matchField2(fieldName_argsObjs))&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31782)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31783)==0&false))) {{
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31784);lexer.nextToken();

                    __CLR4_5_2ohlohllusyjnqv.R.inc(31785);ParseContext context = parser.setContext(rootContext, null, "argsObjs");
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31786);values = parser.parseArray(argTypes);
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31787);context.object = values;

                    __CLR4_5_2ohlohllusyjnqv.R.inc(31788);parser.accept(JSONToken.RBRACE);

                    __CLR4_5_2ohlohllusyjnqv.R.inc(31789);parser.handleResovleTask(null);
                } }else {{
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31790);values = null;
                }

                }__CLR4_5_2ohlohllusyjnqv.R.inc(31791);parser.close();
            }
        }} }else {__CLR4_5_2ohlohllusyjnqv.R.inc(31792);if ((((token == JSONToken.LBRACKET)&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31793)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31794)==0&false))) {{
            __CLR4_5_2ohlohllusyjnqv.R.inc(31795);String[] typeNames = lexer.scanFieldStringArray(null, -1, typeSymbolTable);

            __CLR4_5_2ohlohllusyjnqv.R.inc(31796);lexer.skipWhitespace();

            __CLR4_5_2ohlohllusyjnqv.R.inc(31797);char ch = lexer.getCurrent();

            __CLR4_5_2ohlohllusyjnqv.R.inc(31798);if ((((ch == ']')&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31799)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31800)==0&false))) {{
                __CLR4_5_2ohlohllusyjnqv.R.inc(31801);Method method = methodLocator.findMethod(null);
                __CLR4_5_2ohlohllusyjnqv.R.inc(31802);Type[] argTypes = method.getGenericParameterTypes();
                __CLR4_5_2ohlohllusyjnqv.R.inc(31803);values = new Object[typeNames.length];
                __CLR4_5_2ohlohllusyjnqv.R.inc(31804);for (int i = 0; (((i < typeNames.length)&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31805)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31806)==0&false)); ++i) {{
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31807);Type argType = argTypes[i];
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31808);String typeName = typeNames[i];
                    __CLR4_5_2ohlohllusyjnqv.R.inc(31809);if ((((argType != String.class)&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31810)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31811)==0&false))) {{
                        __CLR4_5_2ohlohllusyjnqv.R.inc(31812);values[i] = TypeUtils.cast(typeName, argType, parser.getConfig());
                    } }else {{
                        __CLR4_5_2ohlohllusyjnqv.R.inc(31813);values[i] = typeName;
                    }
                }}
                }__CLR4_5_2ohlohllusyjnqv.R.inc(31814);return values;
            }
            }__CLR4_5_2ohlohllusyjnqv.R.inc(31815);if ((((ch == ',')&&(__CLR4_5_2ohlohllusyjnqv.R.iget(31816)!=0|true))||(__CLR4_5_2ohlohllusyjnqv.R.iget(31817)==0&false))) {{
                __CLR4_5_2ohlohllusyjnqv.R.inc(31818);lexer.next();
                __CLR4_5_2ohlohllusyjnqv.R.inc(31819);lexer.skipWhitespace();
            }
            }__CLR4_5_2ohlohllusyjnqv.R.inc(31820);lexer.nextToken(JSONToken.LBRACKET);

            __CLR4_5_2ohlohllusyjnqv.R.inc(31821);Method method = methodLocator.findMethod(typeNames);
            __CLR4_5_2ohlohllusyjnqv.R.inc(31822);Type[] argTypes = method.getGenericParameterTypes();
            __CLR4_5_2ohlohllusyjnqv.R.inc(31823);values = parser.parseArray(argTypes);
            __CLR4_5_2ohlohllusyjnqv.R.inc(31824);lexer.close();
        } }else {{
            __CLR4_5_2ohlohllusyjnqv.R.inc(31825);values = null;
        }

        }}__CLR4_5_2ohlohllusyjnqv.R.inc(31826);return values;
    }finally{__CLR4_5_2ohlohllusyjnqv.R.flushNeeded();}}
}
