/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo;

import junit.framework.TestCase;

/**
 * Created by wenshao on 10/03/2017.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Forguard extends TestCase {static class __CLR4_1_1021442144luszwh9k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,94892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_1021442144luszwh9k.R.globalSliceStart(getClass().getName(),94756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp22144();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021442144luszwh9k.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021442144luszwh9k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.demo.Forguard.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),94756,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp22144() throws Exception{try{__CLR4_1_1021442144luszwh9k.R.inc(94756);
        __CLR4_1_1021442144luszwh9k.R.inc(94757);String json = "{\"id\":\"a123\", \"name\":\"wxf\"}";

        __CLR4_1_1021442144luszwh9k.R.inc(94758);String value = javaGet(json, "id");
        __CLR4_1_1021442144luszwh9k.R.inc(94759);System.out.println(value);
    }finally{__CLR4_1_1021442144luszwh9k.R.flushNeeded();}}

    public static String javaGet(String json, String key) {try{__CLR4_1_1021442144luszwh9k.R.inc(94760);
        __CLR4_1_1021442144luszwh9k.R.inc(94761);char[] json_chars = json.toCharArray();
        __CLR4_1_1021442144luszwh9k.R.inc(94762);char[] key_chars = key.toCharArray();

        __CLR4_1_1021442144luszwh9k.R.inc(94763);char[] value_chars = get(json_chars, json_chars.length, key_chars, key_chars.length);

        __CLR4_1_1021442144luszwh9k.R.inc(94764);return new String(value_chars);
    }finally{__CLR4_1_1021442144luszwh9k.R.flushNeeded();}}

    public static char[] get(char[] json, int json_len, char[] key, int key_len) {try{__CLR4_1_1021442144luszwh9k.R.inc(94765);
        __CLR4_1_1021442144luszwh9k.R.inc(94766);if ((((json_len == 0)&&(__CLR4_1_1021442144luszwh9k.R.iget(94767)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94768)==0&false))) {{
            __CLR4_1_1021442144luszwh9k.R.inc(94769);return new char[0];
        }

        }__CLR4_1_1021442144luszwh9k.R.inc(94770);Parser parser = new Parser();
        __CLR4_1_1021442144luszwh9k.R.inc(94771);parser.json_chars = json;
        __CLR4_1_1021442144luszwh9k.R.inc(94772);parser.json_len = json_len;
        __CLR4_1_1021442144luszwh9k.R.inc(94773);parser.ch = json[0];
        __CLR4_1_1021442144luszwh9k.R.inc(94774);next_token(parser);

        __CLR4_1_1021442144luszwh9k.R.inc(94775);if ((((parser.token != Token.LBRACE)&&(__CLR4_1_1021442144luszwh9k.R.iget(94776)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94777)==0&false))) {{
            __CLR4_1_1021442144luszwh9k.R.inc(94778);throw new IllegalArgumentException("illegal json");
        }
        }__CLR4_1_1021442144luszwh9k.R.inc(94779);next_token(parser);

        __CLR4_1_1021442144luszwh9k.R.inc(94780);for (;;) {{
            __CLR4_1_1021442144luszwh9k.R.inc(94781);if ((((parser.token == Token.RBRACE)&&(__CLR4_1_1021442144luszwh9k.R.iget(94782)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94783)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94784);break;
            }

            }__CLR4_1_1021442144luszwh9k.R.inc(94785);if ((((parser.token != Token.STRING)&&(__CLR4_1_1021442144luszwh9k.R.iget(94786)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94787)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94788);throw new IllegalArgumentException("illegal json");
            }

            }__CLR4_1_1021442144luszwh9k.R.inc(94789);char[] name_chars = parser.str_chars;
            __CLR4_1_1021442144luszwh9k.R.inc(94790);int name_len = parser.str_chars_len;
            __CLR4_1_1021442144luszwh9k.R.inc(94791);next_token(parser);

            __CLR4_1_1021442144luszwh9k.R.inc(94792);if ((((parser.token != Token.COLON)&&(__CLR4_1_1021442144luszwh9k.R.iget(94793)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94794)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94795);throw new IllegalArgumentException("illegal json");
            }
            }__CLR4_1_1021442144luszwh9k.R.inc(94796);next_token(parser);

            __CLR4_1_1021442144luszwh9k.R.inc(94797);if ((((parser.token != Token.STRING)&&(__CLR4_1_1021442144luszwh9k.R.iget(94798)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94799)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94800);throw new IllegalArgumentException("illegal json");
            }

            }__CLR4_1_1021442144luszwh9k.R.inc(94801);if ((((name_len == key_len)&&(__CLR4_1_1021442144luszwh9k.R.iget(94802)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94803)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94804);boolean eq = true;
                __CLR4_1_1021442144luszwh9k.R.inc(94805);for (int i = 0; (((i < name_len)&&(__CLR4_1_1021442144luszwh9k.R.iget(94806)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94807)==0&false)); ++i) {{
                    __CLR4_1_1021442144luszwh9k.R.inc(94808);if ((((name_chars[i] != key[i])&&(__CLR4_1_1021442144luszwh9k.R.iget(94809)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94810)==0&false))) {{
                        __CLR4_1_1021442144luszwh9k.R.inc(94811);eq = false;
                        __CLR4_1_1021442144luszwh9k.R.inc(94812);break;
                    }
                }}
                }__CLR4_1_1021442144luszwh9k.R.inc(94813);if ((((eq)&&(__CLR4_1_1021442144luszwh9k.R.iget(94814)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94815)==0&false))) {{
                    __CLR4_1_1021442144luszwh9k.R.inc(94816);return parser.str_chars;
                }
            }}

            }__CLR4_1_1021442144luszwh9k.R.inc(94817);next_token(parser);

            __CLR4_1_1021442144luszwh9k.R.inc(94818);if ((((parser.token == Token.COMMA)&&(__CLR4_1_1021442144luszwh9k.R.iget(94819)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94820)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94821);next_token(parser);
                __CLR4_1_1021442144luszwh9k.R.inc(94822);continue;
            }

        }}

        }__CLR4_1_1021442144luszwh9k.R.inc(94823);return null;
    }finally{__CLR4_1_1021442144luszwh9k.R.flushNeeded();}}

    public static class Parser {
        public char[] json_chars;
        public int json_len;

        public char[] str_chars;
        public int str_chars_len;

        public char ch;
        public int  pos;
        public Token token;
    }

    public static void next_char(Parser parser) {try{__CLR4_1_1021442144luszwh9k.R.inc(94824);
        __CLR4_1_1021442144luszwh9k.R.inc(94825);parser.ch = ((((++parser.pos) < parser.json_len )&&(__CLR4_1_1021442144luszwh9k.R.iget(94826)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94827)==0&false))? parser.json_chars[parser.pos] : '\0';
    }finally{__CLR4_1_1021442144luszwh9k.R.flushNeeded();}}

    public static void scanString(Parser parser) {try{__CLR4_1_1021442144luszwh9k.R.inc(94828);
        __CLR4_1_1021442144luszwh9k.R.inc(94829);next_char(parser);

        __CLR4_1_1021442144luszwh9k.R.inc(94830);int start = parser.pos;
        __CLR4_1_1021442144luszwh9k.R.inc(94831);int end;
        __CLR4_1_1021442144luszwh9k.R.inc(94832);for (;;) {{
            __CLR4_1_1021442144luszwh9k.R.inc(94833);if ((((parser.pos >= parser.json_len)&&(__CLR4_1_1021442144luszwh9k.R.iget(94834)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94835)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94836);throw new IllegalArgumentException("illegal string");
            }
            }__CLR4_1_1021442144luszwh9k.R.inc(94837);if ((((parser.ch == '"')&&(__CLR4_1_1021442144luszwh9k.R.iget(94838)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94839)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94840);end = parser.pos;
                __CLR4_1_1021442144luszwh9k.R.inc(94841);next_char(parser);
                __CLR4_1_1021442144luszwh9k.R.inc(94842);break;
            }

            }__CLR4_1_1021442144luszwh9k.R.inc(94843);if ((((parser.ch == '\\')&&(__CLR4_1_1021442144luszwh9k.R.iget(94844)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94845)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94846);throw new IllegalArgumentException("illegal string");
            }
            }__CLR4_1_1021442144luszwh9k.R.inc(94847);next_char(parser);
        }

        }__CLR4_1_1021442144luszwh9k.R.inc(94848);parser.str_chars_len = end - start;
        __CLR4_1_1021442144luszwh9k.R.inc(94849);parser.str_chars = new char[parser.str_chars_len];
        __CLR4_1_1021442144luszwh9k.R.inc(94850);for (int i = 0; (((i < parser.str_chars_len)&&(__CLR4_1_1021442144luszwh9k.R.iget(94851)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94852)==0&false)); ++i) {{
            __CLR4_1_1021442144luszwh9k.R.inc(94853);parser.str_chars[i] = parser.json_chars[start + i];
        }
        }__CLR4_1_1021442144luszwh9k.R.inc(94854);parser.token = Token.STRING;
    }finally{__CLR4_1_1021442144luszwh9k.R.flushNeeded();}}

    public static void next_token(Parser parser) {try{__CLR4_1_1021442144luszwh9k.R.inc(94855);
        __CLR4_1_1021442144luszwh9k.R.inc(94856);for (;;) {{
            __CLR4_1_1021442144luszwh9k.R.inc(94857);int ch = parser.ch;
            __CLR4_1_1021442144luszwh9k.R.inc(94858);boolean isWhiteSpace = ch == '\n' || ch == '\r' || ch == ' ' || ch == '\t';
            __CLR4_1_1021442144luszwh9k.R.inc(94859);if ((((isWhiteSpace)&&(__CLR4_1_1021442144luszwh9k.R.iget(94860)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94861)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94862);next_char(parser);
                __CLR4_1_1021442144luszwh9k.R.inc(94863);continue;
            }
            }__CLR4_1_1021442144luszwh9k.R.inc(94864);if ((((parser.pos >= parser.json_len)&&(__CLR4_1_1021442144luszwh9k.R.iget(94865)!=0|true))||(__CLR4_1_1021442144luszwh9k.R.iget(94866)==0&false))) {{
                __CLR4_1_1021442144luszwh9k.R.inc(94867);parser.token = Token.EOF;
                __CLR4_1_1021442144luszwh9k.R.inc(94868);return;
            }
            }__CLR4_1_1021442144luszwh9k.R.inc(94869);break;
        }

        }boolean __CLB4_1_10_bool0=false;__CLR4_1_1021442144luszwh9k.R.inc(94870);switch (parser.ch) {
            case '{':if (!__CLB4_1_10_bool0) {__CLR4_1_1021442144luszwh9k.R.inc(94871);__CLB4_1_10_bool0=true;}
                __CLR4_1_1021442144luszwh9k.R.inc(94872);parser.token = Token.LBRACE;
                __CLR4_1_1021442144luszwh9k.R.inc(94873);next_char(parser);
                __CLR4_1_1021442144luszwh9k.R.inc(94874);break;
            case '}':if (!__CLB4_1_10_bool0) {__CLR4_1_1021442144luszwh9k.R.inc(94875);__CLB4_1_10_bool0=true;}
                __CLR4_1_1021442144luszwh9k.R.inc(94876);parser.token = Token.RBRACE;
                __CLR4_1_1021442144luszwh9k.R.inc(94877);next_char(parser);
                __CLR4_1_1021442144luszwh9k.R.inc(94878);break;
            case ',':if (!__CLB4_1_10_bool0) {__CLR4_1_1021442144luszwh9k.R.inc(94879);__CLB4_1_10_bool0=true;}
                __CLR4_1_1021442144luszwh9k.R.inc(94880);parser.token = Token.COMMA;
                __CLR4_1_1021442144luszwh9k.R.inc(94881);next_char(parser);
                __CLR4_1_1021442144luszwh9k.R.inc(94882);break;
            case ':':if (!__CLB4_1_10_bool0) {__CLR4_1_1021442144luszwh9k.R.inc(94883);__CLB4_1_10_bool0=true;}
                __CLR4_1_1021442144luszwh9k.R.inc(94884);parser.token = Token.COLON;
                __CLR4_1_1021442144luszwh9k.R.inc(94885);next_char(parser);
                __CLR4_1_1021442144luszwh9k.R.inc(94886);break;
            case '"':if (!__CLB4_1_10_bool0) {__CLR4_1_1021442144luszwh9k.R.inc(94887);__CLB4_1_10_bool0=true;}
                __CLR4_1_1021442144luszwh9k.R.inc(94888);scanString(parser);
                __CLR4_1_1021442144luszwh9k.R.inc(94889);break;
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_1021442144luszwh9k.R.inc(94890);__CLB4_1_10_bool0=true;}
                __CLR4_1_1021442144luszwh9k.R.inc(94891);throw new IllegalArgumentException("illegal json char");
        }
    }finally{__CLR4_1_1021442144luszwh9k.R.flushNeeded();}}

    public static enum Token {
        STRING, //
        EOF, //
        LBRACE,
        RBRACE,
        COMMA,
        COLON
    }
}
