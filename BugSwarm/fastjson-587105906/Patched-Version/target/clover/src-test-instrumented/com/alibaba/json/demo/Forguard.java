/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.demo;

import junit.framework.TestCase;

/**
 * Created by wenshao on 10/03/2017.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Forguard extends TestCase {static class __CLR4_5_2205l205llusyjw9f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,93649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2205l205llusyjw9f.R.globalSliceStart(getClass().getName(),93513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2205l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2205l205llusyjw9f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2205l205llusyjw9f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.demo.Forguard.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),93513,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2205l() throws Exception{try{__CLR4_5_2205l205llusyjw9f.R.inc(93513);
        __CLR4_5_2205l205llusyjw9f.R.inc(93514);String json = "{\"id\":\"a123\", \"name\":\"wxf\"}";

        __CLR4_5_2205l205llusyjw9f.R.inc(93515);String value = javaGet(json, "id");
        __CLR4_5_2205l205llusyjw9f.R.inc(93516);System.out.println(value);
    }finally{__CLR4_5_2205l205llusyjw9f.R.flushNeeded();}}

    public static String javaGet(String json, String key) {try{__CLR4_5_2205l205llusyjw9f.R.inc(93517);
        __CLR4_5_2205l205llusyjw9f.R.inc(93518);char[] json_chars = json.toCharArray();
        __CLR4_5_2205l205llusyjw9f.R.inc(93519);char[] key_chars = key.toCharArray();

        __CLR4_5_2205l205llusyjw9f.R.inc(93520);char[] value_chars = get(json_chars, json_chars.length, key_chars, key_chars.length);

        __CLR4_5_2205l205llusyjw9f.R.inc(93521);return new String(value_chars);
    }finally{__CLR4_5_2205l205llusyjw9f.R.flushNeeded();}}

    public static char[] get(char[] json, int json_len, char[] key, int key_len) {try{__CLR4_5_2205l205llusyjw9f.R.inc(93522);
        __CLR4_5_2205l205llusyjw9f.R.inc(93523);if ((((json_len == 0)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93524)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93525)==0&false))) {{
            __CLR4_5_2205l205llusyjw9f.R.inc(93526);return new char[0];
        }

        }__CLR4_5_2205l205llusyjw9f.R.inc(93527);Parser parser = new Parser();
        __CLR4_5_2205l205llusyjw9f.R.inc(93528);parser.json_chars = json;
        __CLR4_5_2205l205llusyjw9f.R.inc(93529);parser.json_len = json_len;
        __CLR4_5_2205l205llusyjw9f.R.inc(93530);parser.ch = json[0];
        __CLR4_5_2205l205llusyjw9f.R.inc(93531);next_token(parser);

        __CLR4_5_2205l205llusyjw9f.R.inc(93532);if ((((parser.token != Token.LBRACE)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93533)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93534)==0&false))) {{
            __CLR4_5_2205l205llusyjw9f.R.inc(93535);throw new IllegalArgumentException("illegal json");
        }
        }__CLR4_5_2205l205llusyjw9f.R.inc(93536);next_token(parser);

        __CLR4_5_2205l205llusyjw9f.R.inc(93537);for (;;) {{
            __CLR4_5_2205l205llusyjw9f.R.inc(93538);if ((((parser.token == Token.RBRACE)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93539)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93540)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93541);break;
            }

            }__CLR4_5_2205l205llusyjw9f.R.inc(93542);if ((((parser.token != Token.STRING)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93543)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93544)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93545);throw new IllegalArgumentException("illegal json");
            }

            }__CLR4_5_2205l205llusyjw9f.R.inc(93546);char[] name_chars = parser.str_chars;
            __CLR4_5_2205l205llusyjw9f.R.inc(93547);int name_len = parser.str_chars_len;
            __CLR4_5_2205l205llusyjw9f.R.inc(93548);next_token(parser);

            __CLR4_5_2205l205llusyjw9f.R.inc(93549);if ((((parser.token != Token.COLON)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93550)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93551)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93552);throw new IllegalArgumentException("illegal json");
            }
            }__CLR4_5_2205l205llusyjw9f.R.inc(93553);next_token(parser);

            __CLR4_5_2205l205llusyjw9f.R.inc(93554);if ((((parser.token != Token.STRING)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93555)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93556)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93557);throw new IllegalArgumentException("illegal json");
            }

            }__CLR4_5_2205l205llusyjw9f.R.inc(93558);if ((((name_len == key_len)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93559)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93560)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93561);boolean eq = true;
                __CLR4_5_2205l205llusyjw9f.R.inc(93562);for (int i = 0; (((i < name_len)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93563)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93564)==0&false)); ++i) {{
                    __CLR4_5_2205l205llusyjw9f.R.inc(93565);if ((((name_chars[i] != key[i])&&(__CLR4_5_2205l205llusyjw9f.R.iget(93566)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93567)==0&false))) {{
                        __CLR4_5_2205l205llusyjw9f.R.inc(93568);eq = false;
                        __CLR4_5_2205l205llusyjw9f.R.inc(93569);break;
                    }
                }}
                }__CLR4_5_2205l205llusyjw9f.R.inc(93570);if ((((eq)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93571)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93572)==0&false))) {{
                    __CLR4_5_2205l205llusyjw9f.R.inc(93573);return parser.str_chars;
                }
            }}

            }__CLR4_5_2205l205llusyjw9f.R.inc(93574);next_token(parser);

            __CLR4_5_2205l205llusyjw9f.R.inc(93575);if ((((parser.token == Token.COMMA)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93576)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93577)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93578);next_token(parser);
                __CLR4_5_2205l205llusyjw9f.R.inc(93579);continue;
            }

        }}

        }__CLR4_5_2205l205llusyjw9f.R.inc(93580);return null;
    }finally{__CLR4_5_2205l205llusyjw9f.R.flushNeeded();}}

    public static class Parser {
        public char[] json_chars;
        public int json_len;

        public char[] str_chars;
        public int str_chars_len;

        public char ch;
        public int  pos;
        public Token token;
    }

    public static void next_char(Parser parser) {try{__CLR4_5_2205l205llusyjw9f.R.inc(93581);
        __CLR4_5_2205l205llusyjw9f.R.inc(93582);parser.ch = ((((++parser.pos) < parser.json_len )&&(__CLR4_5_2205l205llusyjw9f.R.iget(93583)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93584)==0&false))? parser.json_chars[parser.pos] : '\0';
    }finally{__CLR4_5_2205l205llusyjw9f.R.flushNeeded();}}

    public static void scanString(Parser parser) {try{__CLR4_5_2205l205llusyjw9f.R.inc(93585);
        __CLR4_5_2205l205llusyjw9f.R.inc(93586);next_char(parser);

        __CLR4_5_2205l205llusyjw9f.R.inc(93587);int start = parser.pos;
        __CLR4_5_2205l205llusyjw9f.R.inc(93588);int end;
        __CLR4_5_2205l205llusyjw9f.R.inc(93589);for (;;) {{
            __CLR4_5_2205l205llusyjw9f.R.inc(93590);if ((((parser.pos >= parser.json_len)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93591)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93592)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93593);throw new IllegalArgumentException("illegal string");
            }
            }__CLR4_5_2205l205llusyjw9f.R.inc(93594);if ((((parser.ch == '"')&&(__CLR4_5_2205l205llusyjw9f.R.iget(93595)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93596)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93597);end = parser.pos;
                __CLR4_5_2205l205llusyjw9f.R.inc(93598);next_char(parser);
                __CLR4_5_2205l205llusyjw9f.R.inc(93599);break;
            }

            }__CLR4_5_2205l205llusyjw9f.R.inc(93600);if ((((parser.ch == '\\')&&(__CLR4_5_2205l205llusyjw9f.R.iget(93601)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93602)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93603);throw new IllegalArgumentException("illegal string");
            }
            }__CLR4_5_2205l205llusyjw9f.R.inc(93604);next_char(parser);
        }

        }__CLR4_5_2205l205llusyjw9f.R.inc(93605);parser.str_chars_len = end - start;
        __CLR4_5_2205l205llusyjw9f.R.inc(93606);parser.str_chars = new char[parser.str_chars_len];
        __CLR4_5_2205l205llusyjw9f.R.inc(93607);for (int i = 0; (((i < parser.str_chars_len)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93608)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93609)==0&false)); ++i) {{
            __CLR4_5_2205l205llusyjw9f.R.inc(93610);parser.str_chars[i] = parser.json_chars[start + i];
        }
        }__CLR4_5_2205l205llusyjw9f.R.inc(93611);parser.token = Token.STRING;
    }finally{__CLR4_5_2205l205llusyjw9f.R.flushNeeded();}}

    public static void next_token(Parser parser) {try{__CLR4_5_2205l205llusyjw9f.R.inc(93612);
        __CLR4_5_2205l205llusyjw9f.R.inc(93613);for (;;) {{
            __CLR4_5_2205l205llusyjw9f.R.inc(93614);int ch = parser.ch;
            __CLR4_5_2205l205llusyjw9f.R.inc(93615);boolean isWhiteSpace = ch == '\n' || ch == '\r' || ch == ' ' || ch == '\t';
            __CLR4_5_2205l205llusyjw9f.R.inc(93616);if ((((isWhiteSpace)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93617)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93618)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93619);next_char(parser);
                __CLR4_5_2205l205llusyjw9f.R.inc(93620);continue;
            }
            }__CLR4_5_2205l205llusyjw9f.R.inc(93621);if ((((parser.pos >= parser.json_len)&&(__CLR4_5_2205l205llusyjw9f.R.iget(93622)!=0|true))||(__CLR4_5_2205l205llusyjw9f.R.iget(93623)==0&false))) {{
                __CLR4_5_2205l205llusyjw9f.R.inc(93624);parser.token = Token.EOF;
                __CLR4_5_2205l205llusyjw9f.R.inc(93625);return;
            }
            }__CLR4_5_2205l205llusyjw9f.R.inc(93626);break;
        }

        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2205l205llusyjw9f.R.inc(93627);switch (parser.ch) {
            case '{':if (!__CLB4_5_2_bool0) {__CLR4_5_2205l205llusyjw9f.R.inc(93628);__CLB4_5_2_bool0=true;}
                __CLR4_5_2205l205llusyjw9f.R.inc(93629);parser.token = Token.LBRACE;
                __CLR4_5_2205l205llusyjw9f.R.inc(93630);next_char(parser);
                __CLR4_5_2205l205llusyjw9f.R.inc(93631);break;
            case '}':if (!__CLB4_5_2_bool0) {__CLR4_5_2205l205llusyjw9f.R.inc(93632);__CLB4_5_2_bool0=true;}
                __CLR4_5_2205l205llusyjw9f.R.inc(93633);parser.token = Token.RBRACE;
                __CLR4_5_2205l205llusyjw9f.R.inc(93634);next_char(parser);
                __CLR4_5_2205l205llusyjw9f.R.inc(93635);break;
            case ',':if (!__CLB4_5_2_bool0) {__CLR4_5_2205l205llusyjw9f.R.inc(93636);__CLB4_5_2_bool0=true;}
                __CLR4_5_2205l205llusyjw9f.R.inc(93637);parser.token = Token.COMMA;
                __CLR4_5_2205l205llusyjw9f.R.inc(93638);next_char(parser);
                __CLR4_5_2205l205llusyjw9f.R.inc(93639);break;
            case ':':if (!__CLB4_5_2_bool0) {__CLR4_5_2205l205llusyjw9f.R.inc(93640);__CLB4_5_2_bool0=true;}
                __CLR4_5_2205l205llusyjw9f.R.inc(93641);parser.token = Token.COLON;
                __CLR4_5_2205l205llusyjw9f.R.inc(93642);next_char(parser);
                __CLR4_5_2205l205llusyjw9f.R.inc(93643);break;
            case '"':if (!__CLB4_5_2_bool0) {__CLR4_5_2205l205llusyjw9f.R.inc(93644);__CLB4_5_2_bool0=true;}
                __CLR4_5_2205l205llusyjw9f.R.inc(93645);scanString(parser);
                __CLR4_5_2205l205llusyjw9f.R.inc(93646);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2205l205llusyjw9f.R.inc(93647);__CLB4_5_2_bool0=true;}
                __CLR4_5_2205l205llusyjw9f.R.inc(93648);throw new IllegalArgumentException("illegal json char");
        }
    }finally{__CLR4_5_2205l205llusyjw9f.R.flushNeeded();}}

    public static enum Token {
        STRING, //
        EOF, //
        LBRACE,
        RBRACE,
        COMMA,
        COLON
    }
}
