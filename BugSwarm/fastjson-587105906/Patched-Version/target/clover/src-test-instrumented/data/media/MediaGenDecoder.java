/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class MediaGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_229up29uplusvnlx9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,106382,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(config, clazz);__CLR4_5_229up29uplusvnlx9.R.inc(106082);try{__CLR4_5_229up29uplusvnlx9.R.inc(106081);
        // data.media.Media.Player
        __CLR4_5_229up29uplusvnlx9.R.inc(106083);player_gen_deser__ = config.getDeserializer(data.media.Media.Player.class);
    }finally{__CLR4_5_229up29uplusvnlx9.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_229up29uplusvnlx9.R.inc(106084);
        __CLR4_5_229up29uplusvnlx9.R.inc(106085);return new Media();
        
    }finally{__CLR4_5_229up29uplusvnlx9.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_229up29uplusvnlx9.R.inc(106086);
        __CLR4_5_229up29uplusvnlx9.R.inc(106087);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_5_229up29uplusvnlx9.R.inc(106088);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106089)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106090)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106091);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_229up29uplusvnlx9.R.inc(106092);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106093)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106094)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_5_229up29uplusvnlx9.R.inc(106095);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106096)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106097)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106098);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_229up29uplusvnlx9.R.inc(106099);ParseContext mark_context = parser.getContext();
        __CLR4_5_229up29uplusvnlx9.R.inc(106100);int matchedCount = 0;
        __CLR4_5_229up29uplusvnlx9.R.inc(106101);Media instance = new Media();
        
        __CLR4_5_229up29uplusvnlx9.R.inc(106102);ParseContext context = parser.getContext();
        __CLR4_5_229up29uplusvnlx9.R.inc(106103);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_5_229up29uplusvnlx9.R.inc(106104);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106105)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106106)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106107);return instance;
        }
        
        }__CLR4_5_229up29uplusvnlx9.R.inc(106108);int matchStat = 0;
        __CLR4_5_229up29uplusvnlx9.R.inc(106109);int _asm_flag_0 = 0;
        __CLR4_5_229up29uplusvnlx9.R.inc(106110);int bitrate_gen = 0;
        __CLR4_5_229up29uplusvnlx9.R.inc(106111);String copyright_gen;
        __CLR4_5_229up29uplusvnlx9.R.inc(106112);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106113)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106114)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106115);copyright_gen = lexer.stringDefaultValue();
            __CLR4_5_229up29uplusvnlx9.R.inc(106116);_asm_flag_0 |= 2;
        } }else {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106117);copyright_gen = null;
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106118);long duration_gen = 0;
        __CLR4_5_229up29uplusvnlx9.R.inc(106119);String format_gen;
        __CLR4_5_229up29uplusvnlx9.R.inc(106120);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106121)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106122)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106123);format_gen = lexer.stringDefaultValue();
            __CLR4_5_229up29uplusvnlx9.R.inc(106124);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106125);format_gen = null;
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106126);int height_gen = 0;
        __CLR4_5_229up29uplusvnlx9.R.inc(106127);java.util.List persons_gen = null;
        __CLR4_5_229up29uplusvnlx9.R.inc(106128);data.media.Media.Player player_gen = null;
        __CLR4_5_229up29uplusvnlx9.R.inc(106129);long size_gen = 0;
        __CLR4_5_229up29uplusvnlx9.R.inc(106130);String title_gen;
        __CLR4_5_229up29uplusvnlx9.R.inc(106131);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106132)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106133)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106134);title_gen = lexer.stringDefaultValue();
            __CLR4_5_229up29uplusvnlx9.R.inc(106135);_asm_flag_0 |= 256;
        } }else {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106136);title_gen = null;
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106137);String uri_gen;
        __CLR4_5_229up29uplusvnlx9.R.inc(106138);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106139)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106140)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106141);uri_gen = lexer.stringDefaultValue();
            __CLR4_5_229up29uplusvnlx9.R.inc(106142);_asm_flag_0 |= 512;
        } }else {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106143);uri_gen = null;
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106144);int width_gen = 0;
        __CLR4_5_229up29uplusvnlx9.R.inc(106145);boolean endFlag = false, restFlag = false;
        
        __CLR4_5_229up29uplusvnlx9.R.inc(106146);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106147)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106148)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106149);bitrate_gen = lexer.scanFieldInt(bitrate_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106150);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106151)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106152)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106153);_asm_flag_0 |= 1;
                __CLR4_5_229up29uplusvnlx9.R.inc(106154);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106155);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106156)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106157)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106158);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106159);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106160)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106161)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106162);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106163);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106164)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106165)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106166);copyright_gen = lexer.scanFieldString(copyright_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106167);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106168)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106169)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106170);_asm_flag_0 |= 2;
                __CLR4_5_229up29uplusvnlx9.R.inc(106171);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106172);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106173)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106174)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106175);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106176);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106177)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106178)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106179);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106180);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106181)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106182)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106183);duration_gen = lexer.scanFieldLong(duration_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106184);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106185)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106186)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106187);_asm_flag_0 |= 4;
                __CLR4_5_229up29uplusvnlx9.R.inc(106188);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106189);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106190)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106191)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106192);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106193);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106194)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106195)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106196);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106197);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106198)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106199)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106200);format_gen = lexer.scanFieldString(format_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106201);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106202)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106203)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106204);_asm_flag_0 |= 8;
                __CLR4_5_229up29uplusvnlx9.R.inc(106205);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106206);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106207)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106208)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106209);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106210);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106211)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106212)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106213);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106214);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106215)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106216)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106217);height_gen = lexer.scanFieldInt(height_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106218);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106219)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106220)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106221);_asm_flag_0 |= 16;
                __CLR4_5_229up29uplusvnlx9.R.inc(106222);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106223);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106224)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106225)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106226);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106227);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106228)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106229)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106230);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106231);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106232)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106233)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106234);persons_gen = (java.util.List) lexer.scanFieldStringArray(persons_gen_prefix__, java.util.List.class);
            __CLR4_5_229up29uplusvnlx9.R.inc(106235);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106236)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106237)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106238);_asm_flag_0 |= 32;
                __CLR4_5_229up29uplusvnlx9.R.inc(106239);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106240);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106241)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106242)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106243);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106244);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106245)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106246)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106247);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106248);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106249)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106250)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106251);player_gen = (data.media.Media.Player) this.scanEnum(lexer, player_gen_prefix__, player_gen_deser__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106252);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106253)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106254)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106255);_asm_flag_0 |= 64;
                __CLR4_5_229up29uplusvnlx9.R.inc(106256);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106257);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106258)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106259)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106260);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106261);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106262)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106263)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106264);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106265);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106266)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106267)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106268);size_gen = lexer.scanFieldLong(size_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106269);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106270)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106271)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106272);_asm_flag_0 |= 128;
                __CLR4_5_229up29uplusvnlx9.R.inc(106273);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106274);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106275)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106276)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106277);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106278);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106279)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106280)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106281);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106282);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106283)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106284)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106285);title_gen = lexer.scanFieldString(title_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106286);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106287)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106288)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106289);_asm_flag_0 |= 256;
                __CLR4_5_229up29uplusvnlx9.R.inc(106290);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106291);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106292)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106293)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106294);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106295);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106296)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106297)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106298);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106299);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106300)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106301)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106302);uri_gen = lexer.scanFieldString(uri_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106303);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106304)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106305)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106306);_asm_flag_0 |= 512;
                __CLR4_5_229up29uplusvnlx9.R.inc(106307);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106308);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106309)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106310)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106311);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106312);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106313)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106314)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106315);endFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106316);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229up29uplusvnlx9.R.iget(106317)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106318)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106319);width_gen = lexer.scanFieldInt(width_gen_prefix__);
            __CLR4_5_229up29uplusvnlx9.R.inc(106320);if((((lexer.matchStat > 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106321)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106322)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106323);_asm_flag_0 |= 1024;
                __CLR4_5_229up29uplusvnlx9.R.inc(106324);matchedCount++;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106325);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106326)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106327)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106328);restFlag = true;
            }
            }__CLR4_5_229up29uplusvnlx9.R.inc(106329);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106330)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106331)==0&false))) {{
                __CLR4_5_229up29uplusvnlx9.R.inc(106332);restFlag = true;
            }
            
        }}
        }__CLR4_5_229up29uplusvnlx9.R.inc(106333);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106334)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106335)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106336);instance.setBitrate(bitrate_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106337);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106338)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106339)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106340);instance.setCopyright(copyright_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106341);if (((((_asm_flag_0 & 4) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106342)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106343)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106344);instance.setDuration(duration_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106345);if (((((_asm_flag_0 & 8) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106346)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106347)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106348);instance.setFormat(format_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106349);if (((((_asm_flag_0 & 16) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106350)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106351)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106352);instance.setHeight(height_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106353);if (((((_asm_flag_0 & 32) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106354)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106355)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106356);instance.setPersons(persons_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106357);if (((((_asm_flag_0 & 64) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106358)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106359)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106360);instance.setPlayer(player_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106361);if (((((_asm_flag_0 & 128) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106362)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106363)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106364);instance.setSize(size_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106365);if (((((_asm_flag_0 & 256) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106366)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106367)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106368);instance.setTitle(title_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106369);if (((((_asm_flag_0 & 512) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106370)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106371)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106372);instance.setUri(uri_gen);
            
        }
        }__CLR4_5_229up29uplusvnlx9.R.inc(106373);if (((((_asm_flag_0 & 1024) != 0)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106374)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106375)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106376);instance.setWidth(width_gen);
            
        }
        
        }__CLR4_5_229up29uplusvnlx9.R.inc(106377);if ((((restFlag)&&(__CLR4_5_229up29uplusvnlx9.R.iget(106378)!=0|true))||(__CLR4_5_229up29uplusvnlx9.R.iget(106379)==0&false))) {{
            __CLR4_5_229up29uplusvnlx9.R.inc(106380);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_5_229up29uplusvnlx9.R.inc(106381);return instance;
        
    }finally{__CLR4_5_229up29uplusvnlx9.R.flushNeeded();}}
}

