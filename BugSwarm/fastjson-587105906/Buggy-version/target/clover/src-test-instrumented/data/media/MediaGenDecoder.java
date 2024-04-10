/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class MediaGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_1_1029v029v0luszwj2e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,106393,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] size_gen_prefix__ = "\"size\":".toCharArray();
    private char[] uri_gen_prefix__ = "\"uri\":".toCharArray();
    private char[] title_gen_prefix__ = "\"title\":".toCharArray();
    private char[] width_gen_prefix__ = "\"width\":".toCharArray();
    private char[] height_gen_prefix__ = "\"height\":".toCharArray();
    private char[] duration_gen_prefix__ = "\"duration\":".toCharArray();
    private char[] bitrate_gen_prefix__ = "\"bitrate\":".toCharArray();
    private char[] persons_gen_prefix__ = "\"persons\":".toCharArray();
    private char[] player_gen_prefix__ = "\"player\":".toCharArray();
    private char[] copyright_gen_prefix__ = "\"copyright\":".toCharArray();
    private char[] format_gen_prefix__ = "\"format\":".toCharArray();
    
    private ObjectDeserializer uri_gen_deser__;
    private ObjectDeserializer title_gen_deser__;
    private ObjectDeserializer persons_gen_list_item_deser__;
    private Type persons_gen_list_item_type__ = java.lang.String.class;
    private ObjectDeserializer copyright_gen_deser__;
    private ObjectDeserializer format_gen_deser__;
    private ObjectDeserializer player_gen_deser__;
    
    public MediaGenDecoder (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_1_1029v029v0luszwj2e.R.inc(106093);try{__CLR4_1_1029v029v0luszwj2e.R.inc(106092);
        // data.media.Media.Player
        __CLR4_1_1029v029v0luszwj2e.R.inc(106094);player_gen_deser__ = config.getDeserializer(data.media.Media.Player.class);
    }finally{__CLR4_1_1029v029v0luszwj2e.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_1_1029v029v0luszwj2e.R.inc(106095);
        __CLR4_1_1029v029v0luszwj2e.R.inc(106096);return new Media();
        
    }finally{__CLR4_1_1029v029v0luszwj2e.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1029v029v0luszwj2e.R.inc(106097);
        __CLR4_1_1029v029v0luszwj2e.R.inc(106098);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_1_1029v029v0luszwj2e.R.inc(106099);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106100)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106101)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106102);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106103);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106104)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106105)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106106);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106107)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106108)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106109);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106110);ParseContext mark_context = parser.getContext();
        __CLR4_1_1029v029v0luszwj2e.R.inc(106111);int matchedCount = 0;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106112);Media instance = new Media();
        
        __CLR4_1_1029v029v0luszwj2e.R.inc(106113);ParseContext context = parser.getContext();
        __CLR4_1_1029v029v0luszwj2e.R.inc(106114);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_1_1029v029v0luszwj2e.R.inc(106115);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106116)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106117)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106118);return instance;
        }
        
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106119);int matchStat = 0;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106120);int _asm_flag_0 = 0;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106121);int bitrate_gen = 0;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106122);String copyright_gen;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106123);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106124)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106125)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106126);copyright_gen = lexer.stringDefaultValue();
            __CLR4_1_1029v029v0luszwj2e.R.inc(106127);_asm_flag_0 |= 2;
        } }else {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106128);copyright_gen = null;
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106129);long duration_gen = 0;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106130);String format_gen;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106131);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106132)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106133)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106134);format_gen = lexer.stringDefaultValue();
            __CLR4_1_1029v029v0luszwj2e.R.inc(106135);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106136);format_gen = null;
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106137);int height_gen = 0;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106138);java.util.List persons_gen = null;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106139);data.media.Media.Player player_gen = null;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106140);long size_gen = 0;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106141);String title_gen;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106142);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106143)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106144)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106145);title_gen = lexer.stringDefaultValue();
            __CLR4_1_1029v029v0luszwj2e.R.inc(106146);_asm_flag_0 |= 256;
        } }else {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106147);title_gen = null;
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106148);String uri_gen;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106149);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106150)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106151)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106152);uri_gen = lexer.stringDefaultValue();
            __CLR4_1_1029v029v0luszwj2e.R.inc(106153);_asm_flag_0 |= 512;
        } }else {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106154);uri_gen = null;
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106155);int width_gen = 0;
        __CLR4_1_1029v029v0luszwj2e.R.inc(106156);boolean endFlag = false, restFlag = false;
        
        __CLR4_1_1029v029v0luszwj2e.R.inc(106157);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106158)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106159)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106160);bitrate_gen = lexer.scanFieldInt(bitrate_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106161);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106162)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106163)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106164);_asm_flag_0 |= 1;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106165);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106166);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106167)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106168)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106169);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106170);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106171)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106172)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106173);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106174);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106175)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106176)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106177);copyright_gen = lexer.scanFieldString(copyright_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106178);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106179)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106180)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106181);_asm_flag_0 |= 2;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106182);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106183);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106184)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106185)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106186);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106187);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106188)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106189)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106190);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106191);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106192)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106193)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106194);duration_gen = lexer.scanFieldLong(duration_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106195);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106196)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106197)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106198);_asm_flag_0 |= 4;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106199);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106200);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106201)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106202)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106203);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106204);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106205)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106206)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106207);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106208);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106209)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106210)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106211);format_gen = lexer.scanFieldString(format_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106212);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106213)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106214)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106215);_asm_flag_0 |= 8;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106216);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106217);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106218)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106219)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106220);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106221);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106222)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106223)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106224);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106225);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106226)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106227)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106228);height_gen = lexer.scanFieldInt(height_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106229);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106230)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106231)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106232);_asm_flag_0 |= 16;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106233);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106234);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106235)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106236)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106237);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106238);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106239)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106240)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106241);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106242);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106243)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106244)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106245);persons_gen = (java.util.List) lexer.scanFieldStringArray(persons_gen_prefix__, java.util.List.class);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106246);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106247)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106248)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106249);_asm_flag_0 |= 32;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106250);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106251);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106252)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106253)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106254);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106255);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106256)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106257)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106258);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106259);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106260)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106261)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106262);player_gen = (data.media.Media.Player) this.scanEnum(lexer, player_gen_prefix__, player_gen_deser__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106263);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106264)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106265)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106266);_asm_flag_0 |= 64;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106267);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106268);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106269)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106270)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106271);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106272);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106273)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106274)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106275);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106276);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106277)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106278)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106279);size_gen = lexer.scanFieldLong(size_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106280);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106281)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106282)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106283);_asm_flag_0 |= 128;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106284);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106285);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106286)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106287)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106288);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106289);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106290)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106291)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106292);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106293);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106294)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106295)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106296);title_gen = lexer.scanFieldString(title_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106297);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106298)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106299)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106300);_asm_flag_0 |= 256;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106301);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106302);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106303)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106304)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106305);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106306);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106307)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106308)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106309);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106310);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106311)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106312)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106313);uri_gen = lexer.scanFieldString(uri_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106314);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106315)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106316)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106317);_asm_flag_0 |= 512;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106318);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106319);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106320)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106321)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106322);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106323);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106324)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106325)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106326);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106327);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106328)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106329)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106330);width_gen = lexer.scanFieldInt(width_gen_prefix__);
            __CLR4_1_1029v029v0luszwj2e.R.inc(106331);if((((lexer.matchStat > 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106332)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106333)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106334);_asm_flag_0 |= 1024;
                __CLR4_1_1029v029v0luszwj2e.R.inc(106335);matchedCount++;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106336);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106337)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106338)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106339);restFlag = true;
            }
            }__CLR4_1_1029v029v0luszwj2e.R.inc(106340);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106341)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106342)==0&false))) {{
                __CLR4_1_1029v029v0luszwj2e.R.inc(106343);restFlag = true;
            }
            
        }}
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106344);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106345)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106346)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106347);instance.setBitrate(bitrate_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106348);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106349)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106350)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106351);instance.setCopyright(copyright_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106352);if (((((_asm_flag_0 & 4) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106353)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106354)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106355);instance.setDuration(duration_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106356);if (((((_asm_flag_0 & 8) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106357)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106358)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106359);instance.setFormat(format_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106360);if (((((_asm_flag_0 & 16) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106361)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106362)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106363);instance.setHeight(height_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106364);if (((((_asm_flag_0 & 32) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106365)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106366)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106367);instance.setPersons(persons_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106368);if (((((_asm_flag_0 & 64) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106369)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106370)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106371);instance.setPlayer(player_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106372);if (((((_asm_flag_0 & 128) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106373)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106374)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106375);instance.setSize(size_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106376);if (((((_asm_flag_0 & 256) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106377)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106378)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106379);instance.setTitle(title_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106380);if (((((_asm_flag_0 & 512) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106381)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106382)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106383);instance.setUri(uri_gen);
            
        }
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106384);if (((((_asm_flag_0 & 1024) != 0)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106385)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106386)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106387);instance.setWidth(width_gen);
            
        }
        
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106388);if ((((restFlag)&&(__CLR4_1_1029v029v0luszwj2e.R.iget(106389)!=0|true))||(__CLR4_1_1029v029v0luszwj2e.R.iget(106390)==0&false))) {{
            __CLR4_1_1029v029v0luszwj2e.R.inc(106391);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_1_1029v029v0luszwj2e.R.inc(106392);return instance;
        
    }finally{__CLR4_1_1029v029v0luszwj2e.R.flushNeeded();}}
}

