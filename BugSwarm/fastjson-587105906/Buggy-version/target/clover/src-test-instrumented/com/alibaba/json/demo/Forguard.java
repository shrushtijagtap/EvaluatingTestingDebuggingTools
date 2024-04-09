/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo;

import junit.framework.TestCase;

/**
 * Created by wenshao on 10/03/2017.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Forguard extends TestCase {static class __CLR4_1_10205w205wlusqkpta{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,93660,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10205w205wlusqkpta.R.globalSliceStart(getClass().getName(),93524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2205w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10205w205wlusqkpta.R.rethrow($CLV_t2$);}finally{__CLR4_1_10205w205wlusqkpta.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.demo.Forguard.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),93524,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2205w() throws Exception{try{__CLR4_1_10205w205wlusqkpta.R.inc(93524);
        __CLR4_1_10205w205wlusqkpta.R.inc(93525);String json = "{\"id\":\"a123\", \"name\":\"wxf\"}";

        __CLR4_1_10205w205wlusqkpta.R.inc(93526);String value = javaGet(json, "id");
        __CLR4_1_10205w205wlusqkpta.R.inc(93527);System.out.println(value);
    }finally{__CLR4_1_10205w205wlusqkpta.R.flushNeeded();}}

    public static String javaGet(String json, String key) {try{__CLR4_1_10205w205wlusqkpta.R.inc(93528);
        __CLR4_1_10205w205wlusqkpta.R.inc(93529);char[] json_chars = json.toCharArray();
        __CLR4_1_10205w205wlusqkpta.R.inc(93530);char[] key_chars = key.toCharArray();

        __CLR4_1_10205w205wlusqkpta.R.inc(93531);char[] value_chars = get(json_chars, json_chars.length, key_chars, key_chars.length);

        __CLR4_1_10205w205wlusqkpta.R.inc(93532);return new String(value_chars);
    }finally{__CLR4_1_10205w205wlusqkpta.R.flushNeeded();}}

    public static char[] get(char[] json, int json_len, char[] key, int key_len) {try{__CLR4_1_10205w205wlusqkpta.R.inc(93533);
        __CLR4_1_10205w205wlusqkpta.R.inc(93534);if ((((json_len == 0)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93535)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93536)==0&false))) {{
            __CLR4_1_10205w205wlusqkpta.R.inc(93537);return new char[0];
        }

        }__CLR4_1_10205w205wlusqkpta.R.inc(93538);Parser parser = new Parser();
        __CLR4_1_10205w205wlusqkpta.R.inc(93539);parser.json_chars = json;
        __CLR4_1_10205w205wlusqkpta.R.inc(93540);parser.json_len = json_len;
        __CLR4_1_10205w205wlusqkpta.R.inc(93541);parser.ch = json[0];
        __CLR4_1_10205w205wlusqkpta.R.inc(93542);next_token(parser);

        __CLR4_1_10205w205wlusqkpta.R.inc(93543);if ((((parser.token != Token.LBRACE)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93544)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93545)==0&false))) {{
            __CLR4_1_10205w205wlusqkpta.R.inc(93546);throw new IllegalArgumentException("illegal json");
        }
        }__CLR4_1_10205w205wlusqkpta.R.inc(93547);next_token(parser);

        __CLR4_1_10205w205wlusqkpta.R.inc(93548);for (;;) {{
            __CLR4_1_10205w205wlusqkpta.R.inc(93549);if ((((parser.token == Token.RBRACE)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93550)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93551)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93552);break;
            }

            }__CLR4_1_10205w205wlusqkpta.R.inc(93553);if ((((parser.token != Token.STRING)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93554)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93555)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93556);throw new IllegalArgumentException("illegal json");
            }

            }__CLR4_1_10205w205wlusqkpta.R.inc(93557);char[] name_chars = parser.str_chars;
            __CLR4_1_10205w205wlusqkpta.R.inc(93558);int name_len = parser.str_chars_len;
            __CLR4_1_10205w205wlusqkpta.R.inc(93559);next_token(parser);

            __CLR4_1_10205w205wlusqkpta.R.inc(93560);if ((((parser.token != Token.COLON)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93561)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93562)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93563);throw new IllegalArgumentException("illegal json");
            }
            }__CLR4_1_10205w205wlusqkpta.R.inc(93564);next_token(parser);

            __CLR4_1_10205w205wlusqkpta.R.inc(93565);if ((((parser.token != Token.STRING)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93566)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93567)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93568);throw new IllegalArgumentException("illegal json");
            }

            }__CLR4_1_10205w205wlusqkpta.R.inc(93569);if ((((name_len == key_len)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93570)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93571)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93572);boolean eq = true;
                __CLR4_1_10205w205wlusqkpta.R.inc(93573);for (int i = 0; (((i < name_len)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93574)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93575)==0&false)); ++i) {{
                    __CLR4_1_10205w205wlusqkpta.R.inc(93576);if ((((name_chars[i] != key[i])&&(__CLR4_1_10205w205wlusqkpta.R.iget(93577)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93578)==0&false))) {{
                        __CLR4_1_10205w205wlusqkpta.R.inc(93579);eq = false;
                        __CLR4_1_10205w205wlusqkpta.R.inc(93580);break;
                    }
                }}
                }__CLR4_1_10205w205wlusqkpta.R.inc(93581);if ((((eq)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93582)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93583)==0&false))) {{
                    __CLR4_1_10205w205wlusqkpta.R.inc(93584);return parser.str_chars;
                }
            }}

            }__CLR4_1_10205w205wlusqkpta.R.inc(93585);next_token(parser);

            __CLR4_1_10205w205wlusqkpta.R.inc(93586);if ((((parser.token == Token.COMMA)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93587)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93588)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93589);next_token(parser);
                __CLR4_1_10205w205wlusqkpta.R.inc(93590);continue;
            }

        }}

        }__CLR4_1_10205w205wlusqkpta.R.inc(93591);return null;
    }finally{__CLR4_1_10205w205wlusqkpta.R.flushNeeded();}}

    public static class Parser {
        public char[] json_chars;
        public int json_len;

        public char[] str_chars;
        public int str_chars_len;

        public char ch;
        public int  pos;
        public Token token;
    }

    public static void next_char(Parser parser) {try{__CLR4_1_10205w205wlusqkpta.R.inc(93592);
        __CLR4_1_10205w205wlusqkpta.R.inc(93593);parser.ch = ((((++parser.pos) < parser.json_len )&&(__CLR4_1_10205w205wlusqkpta.R.iget(93594)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93595)==0&false))? parser.json_chars[parser.pos] : '\0';
    }finally{__CLR4_1_10205w205wlusqkpta.R.flushNeeded();}}

    public static void scanString(Parser parser) {try{__CLR4_1_10205w205wlusqkpta.R.inc(93596);
        __CLR4_1_10205w205wlusqkpta.R.inc(93597);next_char(parser);

        __CLR4_1_10205w205wlusqkpta.R.inc(93598);int start = parser.pos;
        __CLR4_1_10205w205wlusqkpta.R.inc(93599);int end;
        __CLR4_1_10205w205wlusqkpta.R.inc(93600);for (;;) {{
            __CLR4_1_10205w205wlusqkpta.R.inc(93601);if ((((parser.pos >= parser.json_len)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93602)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93603)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93604);throw new IllegalArgumentException("illegal string");
            }
            }__CLR4_1_10205w205wlusqkpta.R.inc(93605);if ((((parser.ch == '"')&&(__CLR4_1_10205w205wlusqkpta.R.iget(93606)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93607)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93608);end = parser.pos;
                __CLR4_1_10205w205wlusqkpta.R.inc(93609);next_char(parser);
                __CLR4_1_10205w205wlusqkpta.R.inc(93610);break;
            }

            }__CLR4_1_10205w205wlusqkpta.R.inc(93611);if ((((parser.ch == '\\')&&(__CLR4_1_10205w205wlusqkpta.R.iget(93612)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93613)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93614);throw new IllegalArgumentException("illegal string");
            }
            }__CLR4_1_10205w205wlusqkpta.R.inc(93615);next_char(parser);
        }

        }__CLR4_1_10205w205wlusqkpta.R.inc(93616);parser.str_chars_len = end - start;
        __CLR4_1_10205w205wlusqkpta.R.inc(93617);parser.str_chars = new char[parser.str_chars_len];
        __CLR4_1_10205w205wlusqkpta.R.inc(93618);for (int i = 0; (((i < parser.str_chars_len)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93619)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93620)==0&false)); ++i) {{
            __CLR4_1_10205w205wlusqkpta.R.inc(93621);parser.str_chars[i] = parser.json_chars[start + i];
        }
        }__CLR4_1_10205w205wlusqkpta.R.inc(93622);parser.token = Token.STRING;
    }finally{__CLR4_1_10205w205wlusqkpta.R.flushNeeded();}}

    public static void next_token(Parser parser) {try{__CLR4_1_10205w205wlusqkpta.R.inc(93623);
        __CLR4_1_10205w205wlusqkpta.R.inc(93624);for (;;) {{
            __CLR4_1_10205w205wlusqkpta.R.inc(93625);int ch = parser.ch;
            __CLR4_1_10205w205wlusqkpta.R.inc(93626);boolean isWhiteSpace = ch == '\n' || ch == '\r' || ch == ' ' || ch == '\t';
            __CLR4_1_10205w205wlusqkpta.R.inc(93627);if ((((isWhiteSpace)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93628)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93629)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93630);next_char(parser);
                __CLR4_1_10205w205wlusqkpta.R.inc(93631);continue;
            }
            }__CLR4_1_10205w205wlusqkpta.R.inc(93632);if ((((parser.pos >= parser.json_len)&&(__CLR4_1_10205w205wlusqkpta.R.iget(93633)!=0|true))||(__CLR4_1_10205w205wlusqkpta.R.iget(93634)==0&false))) {{
                __CLR4_1_10205w205wlusqkpta.R.inc(93635);parser.token = Token.EOF;
                __CLR4_1_10205w205wlusqkpta.R.inc(93636);return;
            }
            }__CLR4_1_10205w205wlusqkpta.R.inc(93637);break;
        }

        }boolean __CLB4_1_10_bool0=false;__CLR4_1_10205w205wlusqkpta.R.inc(93638);switch (parser.ch) {
            case '{':if (!__CLB4_1_10_bool0) {__CLR4_1_10205w205wlusqkpta.R.inc(93639);__CLB4_1_10_bool0=true;}
                __CLR4_1_10205w205wlusqkpta.R.inc(93640);parser.token = Token.LBRACE;
                __CLR4_1_10205w205wlusqkpta.R.inc(93641);next_char(parser);
                __CLR4_1_10205w205wlusqkpta.R.inc(93642);break;
            case '}':if (!__CLB4_1_10_bool0) {__CLR4_1_10205w205wlusqkpta.R.inc(93643);__CLB4_1_10_bool0=true;}
                __CLR4_1_10205w205wlusqkpta.R.inc(93644);parser.token = Token.RBRACE;
                __CLR4_1_10205w205wlusqkpta.R.inc(93645);next_char(parser);
                __CLR4_1_10205w205wlusqkpta.R.inc(93646);break;
            case ',':if (!__CLB4_1_10_bool0) {__CLR4_1_10205w205wlusqkpta.R.inc(93647);__CLB4_1_10_bool0=true;}
                __CLR4_1_10205w205wlusqkpta.R.inc(93648);parser.token = Token.COMMA;
                __CLR4_1_10205w205wlusqkpta.R.inc(93649);next_char(parser);
                __CLR4_1_10205w205wlusqkpta.R.inc(93650);break;
            case ':':if (!__CLB4_1_10_bool0) {__CLR4_1_10205w205wlusqkpta.R.inc(93651);__CLB4_1_10_bool0=true;}
                __CLR4_1_10205w205wlusqkpta.R.inc(93652);parser.token = Token.COLON;
                __CLR4_1_10205w205wlusqkpta.R.inc(93653);next_char(parser);
                __CLR4_1_10205w205wlusqkpta.R.inc(93654);break;
            case '"':if (!__CLB4_1_10_bool0) {__CLR4_1_10205w205wlusqkpta.R.inc(93655);__CLB4_1_10_bool0=true;}
                __CLR4_1_10205w205wlusqkpta.R.inc(93656);scanString(parser);
                __CLR4_1_10205w205wlusqkpta.R.inc(93657);break;
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_10205w205wlusqkpta.R.inc(93658);__CLB4_1_10_bool0=true;}
                __CLR4_1_10205w205wlusqkpta.R.inc(93659);throw new IllegalArgumentException("illegal json char");
        }
    }finally{__CLR4_1_10205w205wlusqkpta.R.flushNeeded();}}

    public static enum Token {
        STRING, //
        EOF, //
        LBRACE,
        RBRACE,
        COMMA,
        COLON
    }
}
