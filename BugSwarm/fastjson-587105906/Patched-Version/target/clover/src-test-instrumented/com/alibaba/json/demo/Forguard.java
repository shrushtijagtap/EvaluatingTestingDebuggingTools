/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.demo;

import junit.framework.TestCase;

/**
 * Created by wenshao on 10/03/2017.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Forguard extends TestCase {static class __CLR4_5_2213t213tlusvnjct{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,94881,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2213t213tlusvnjct.R.globalSliceStart(getClass().getName(),94745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2213t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2213t213tlusvnjct.R.rethrow($CLV_t2$);}finally{__CLR4_5_2213t213tlusvnjct.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.demo.Forguard.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),94745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2213t() throws Exception{try{__CLR4_5_2213t213tlusvnjct.R.inc(94745);
        __CLR4_5_2213t213tlusvnjct.R.inc(94746);String json = "{\"id\":\"a123\", \"name\":\"wxf\"}";

        __CLR4_5_2213t213tlusvnjct.R.inc(94747);String value = javaGet(json, "id");
        __CLR4_5_2213t213tlusvnjct.R.inc(94748);System.out.println(value);
    }finally{__CLR4_5_2213t213tlusvnjct.R.flushNeeded();}}

    public static String javaGet(String json, String key) {try{__CLR4_5_2213t213tlusvnjct.R.inc(94749);
        __CLR4_5_2213t213tlusvnjct.R.inc(94750);char[] json_chars = json.toCharArray();
        __CLR4_5_2213t213tlusvnjct.R.inc(94751);char[] key_chars = key.toCharArray();

        __CLR4_5_2213t213tlusvnjct.R.inc(94752);char[] value_chars = get(json_chars, json_chars.length, key_chars, key_chars.length);

        __CLR4_5_2213t213tlusvnjct.R.inc(94753);return new String(value_chars);
    }finally{__CLR4_5_2213t213tlusvnjct.R.flushNeeded();}}

    public static char[] get(char[] json, int json_len, char[] key, int key_len) {try{__CLR4_5_2213t213tlusvnjct.R.inc(94754);
        __CLR4_5_2213t213tlusvnjct.R.inc(94755);if ((((json_len == 0)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94756)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94757)==0&false))) {{
            __CLR4_5_2213t213tlusvnjct.R.inc(94758);return new char[0];
        }

        }__CLR4_5_2213t213tlusvnjct.R.inc(94759);Parser parser = new Parser();
        __CLR4_5_2213t213tlusvnjct.R.inc(94760);parser.json_chars = json;
        __CLR4_5_2213t213tlusvnjct.R.inc(94761);parser.json_len = json_len;
        __CLR4_5_2213t213tlusvnjct.R.inc(94762);parser.ch = json[0];
        __CLR4_5_2213t213tlusvnjct.R.inc(94763);next_token(parser);

        __CLR4_5_2213t213tlusvnjct.R.inc(94764);if ((((parser.token != Token.LBRACE)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94765)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94766)==0&false))) {{
            __CLR4_5_2213t213tlusvnjct.R.inc(94767);throw new IllegalArgumentException("illegal json");
        }
        }__CLR4_5_2213t213tlusvnjct.R.inc(94768);next_token(parser);

        __CLR4_5_2213t213tlusvnjct.R.inc(94769);for (;;) {{
            __CLR4_5_2213t213tlusvnjct.R.inc(94770);if ((((parser.token == Token.RBRACE)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94771)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94772)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94773);break;
            }

            }__CLR4_5_2213t213tlusvnjct.R.inc(94774);if ((((parser.token != Token.STRING)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94775)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94776)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94777);throw new IllegalArgumentException("illegal json");
            }

            }__CLR4_5_2213t213tlusvnjct.R.inc(94778);char[] name_chars = parser.str_chars;
            __CLR4_5_2213t213tlusvnjct.R.inc(94779);int name_len = parser.str_chars_len;
            __CLR4_5_2213t213tlusvnjct.R.inc(94780);next_token(parser);

            __CLR4_5_2213t213tlusvnjct.R.inc(94781);if ((((parser.token != Token.COLON)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94782)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94783)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94784);throw new IllegalArgumentException("illegal json");
            }
            }__CLR4_5_2213t213tlusvnjct.R.inc(94785);next_token(parser);

            __CLR4_5_2213t213tlusvnjct.R.inc(94786);if ((((parser.token != Token.STRING)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94787)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94788)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94789);throw new IllegalArgumentException("illegal json");
            }

            }__CLR4_5_2213t213tlusvnjct.R.inc(94790);if ((((name_len == key_len)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94791)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94792)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94793);boolean eq = true;
                __CLR4_5_2213t213tlusvnjct.R.inc(94794);for (int i = 0; (((i < name_len)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94795)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94796)==0&false)); ++i) {{
                    __CLR4_5_2213t213tlusvnjct.R.inc(94797);if ((((name_chars[i] != key[i])&&(__CLR4_5_2213t213tlusvnjct.R.iget(94798)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94799)==0&false))) {{
                        __CLR4_5_2213t213tlusvnjct.R.inc(94800);eq = false;
                        __CLR4_5_2213t213tlusvnjct.R.inc(94801);break;
                    }
                }}
                }__CLR4_5_2213t213tlusvnjct.R.inc(94802);if ((((eq)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94803)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94804)==0&false))) {{
                    __CLR4_5_2213t213tlusvnjct.R.inc(94805);return parser.str_chars;
                }
            }}

            }__CLR4_5_2213t213tlusvnjct.R.inc(94806);next_token(parser);

            __CLR4_5_2213t213tlusvnjct.R.inc(94807);if ((((parser.token == Token.COMMA)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94808)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94809)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94810);next_token(parser);
                __CLR4_5_2213t213tlusvnjct.R.inc(94811);continue;
            }

        }}

        }__CLR4_5_2213t213tlusvnjct.R.inc(94812);return null;
    }finally{__CLR4_5_2213t213tlusvnjct.R.flushNeeded();}}

    public static class Parser {
        public char[] json_chars;
        public int json_len;

        public char[] str_chars;
        public int str_chars_len;

        public char ch;
        public int  pos;
        public Token token;
    }

    public static void next_char(Parser parser) {try{__CLR4_5_2213t213tlusvnjct.R.inc(94813);
        __CLR4_5_2213t213tlusvnjct.R.inc(94814);parser.ch = ((((++parser.pos) < parser.json_len )&&(__CLR4_5_2213t213tlusvnjct.R.iget(94815)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94816)==0&false))? parser.json_chars[parser.pos] : '\0';
    }finally{__CLR4_5_2213t213tlusvnjct.R.flushNeeded();}}

    public static void scanString(Parser parser) {try{__CLR4_5_2213t213tlusvnjct.R.inc(94817);
        __CLR4_5_2213t213tlusvnjct.R.inc(94818);next_char(parser);

        __CLR4_5_2213t213tlusvnjct.R.inc(94819);int start = parser.pos;
        __CLR4_5_2213t213tlusvnjct.R.inc(94820);int end;
        __CLR4_5_2213t213tlusvnjct.R.inc(94821);for (;;) {{
            __CLR4_5_2213t213tlusvnjct.R.inc(94822);if ((((parser.pos >= parser.json_len)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94823)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94824)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94825);throw new IllegalArgumentException("illegal string");
            }
            }__CLR4_5_2213t213tlusvnjct.R.inc(94826);if ((((parser.ch == '"')&&(__CLR4_5_2213t213tlusvnjct.R.iget(94827)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94828)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94829);end = parser.pos;
                __CLR4_5_2213t213tlusvnjct.R.inc(94830);next_char(parser);
                __CLR4_5_2213t213tlusvnjct.R.inc(94831);break;
            }

            }__CLR4_5_2213t213tlusvnjct.R.inc(94832);if ((((parser.ch == '\\')&&(__CLR4_5_2213t213tlusvnjct.R.iget(94833)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94834)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94835);throw new IllegalArgumentException("illegal string");
            }
            }__CLR4_5_2213t213tlusvnjct.R.inc(94836);next_char(parser);
        }

        }__CLR4_5_2213t213tlusvnjct.R.inc(94837);parser.str_chars_len = end - start;
        __CLR4_5_2213t213tlusvnjct.R.inc(94838);parser.str_chars = new char[parser.str_chars_len];
        __CLR4_5_2213t213tlusvnjct.R.inc(94839);for (int i = 0; (((i < parser.str_chars_len)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94840)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94841)==0&false)); ++i) {{
            __CLR4_5_2213t213tlusvnjct.R.inc(94842);parser.str_chars[i] = parser.json_chars[start + i];
        }
        }__CLR4_5_2213t213tlusvnjct.R.inc(94843);parser.token = Token.STRING;
    }finally{__CLR4_5_2213t213tlusvnjct.R.flushNeeded();}}

    public static void next_token(Parser parser) {try{__CLR4_5_2213t213tlusvnjct.R.inc(94844);
        __CLR4_5_2213t213tlusvnjct.R.inc(94845);for (;;) {{
            __CLR4_5_2213t213tlusvnjct.R.inc(94846);int ch = parser.ch;
            __CLR4_5_2213t213tlusvnjct.R.inc(94847);boolean isWhiteSpace = ch == '\n' || ch == '\r' || ch == ' ' || ch == '\t';
            __CLR4_5_2213t213tlusvnjct.R.inc(94848);if ((((isWhiteSpace)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94849)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94850)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94851);next_char(parser);
                __CLR4_5_2213t213tlusvnjct.R.inc(94852);continue;
            }
            }__CLR4_5_2213t213tlusvnjct.R.inc(94853);if ((((parser.pos >= parser.json_len)&&(__CLR4_5_2213t213tlusvnjct.R.iget(94854)!=0|true))||(__CLR4_5_2213t213tlusvnjct.R.iget(94855)==0&false))) {{
                __CLR4_5_2213t213tlusvnjct.R.inc(94856);parser.token = Token.EOF;
                __CLR4_5_2213t213tlusvnjct.R.inc(94857);return;
            }
            }__CLR4_5_2213t213tlusvnjct.R.inc(94858);break;
        }

        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2213t213tlusvnjct.R.inc(94859);switch (parser.ch) {
            case '{':if (!__CLB4_5_2_bool0) {__CLR4_5_2213t213tlusvnjct.R.inc(94860);__CLB4_5_2_bool0=true;}
                __CLR4_5_2213t213tlusvnjct.R.inc(94861);parser.token = Token.LBRACE;
                __CLR4_5_2213t213tlusvnjct.R.inc(94862);next_char(parser);
                __CLR4_5_2213t213tlusvnjct.R.inc(94863);break;
            case '}':if (!__CLB4_5_2_bool0) {__CLR4_5_2213t213tlusvnjct.R.inc(94864);__CLB4_5_2_bool0=true;}
                __CLR4_5_2213t213tlusvnjct.R.inc(94865);parser.token = Token.RBRACE;
                __CLR4_5_2213t213tlusvnjct.R.inc(94866);next_char(parser);
                __CLR4_5_2213t213tlusvnjct.R.inc(94867);break;
            case ',':if (!__CLB4_5_2_bool0) {__CLR4_5_2213t213tlusvnjct.R.inc(94868);__CLB4_5_2_bool0=true;}
                __CLR4_5_2213t213tlusvnjct.R.inc(94869);parser.token = Token.COMMA;
                __CLR4_5_2213t213tlusvnjct.R.inc(94870);next_char(parser);
                __CLR4_5_2213t213tlusvnjct.R.inc(94871);break;
            case ':':if (!__CLB4_5_2_bool0) {__CLR4_5_2213t213tlusvnjct.R.inc(94872);__CLB4_5_2_bool0=true;}
                __CLR4_5_2213t213tlusvnjct.R.inc(94873);parser.token = Token.COLON;
                __CLR4_5_2213t213tlusvnjct.R.inc(94874);next_char(parser);
                __CLR4_5_2213t213tlusvnjct.R.inc(94875);break;
            case '"':if (!__CLB4_5_2_bool0) {__CLR4_5_2213t213tlusvnjct.R.inc(94876);__CLB4_5_2_bool0=true;}
                __CLR4_5_2213t213tlusvnjct.R.inc(94877);scanString(parser);
                __CLR4_5_2213t213tlusvnjct.R.inc(94878);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2213t213tlusvnjct.R.inc(94879);__CLB4_5_2_bool0=true;}
                __CLR4_5_2213t213tlusvnjct.R.inc(94880);throw new IllegalArgumentException("illegal json char");
        }
    }finally{__CLR4_5_2213t213tlusvnjct.R.flushNeeded();}}

    public static enum Token {
        STRING, //
        EOF, //
        LBRACE,
        RBRACE,
        COMMA,
        COLON
    }
}
