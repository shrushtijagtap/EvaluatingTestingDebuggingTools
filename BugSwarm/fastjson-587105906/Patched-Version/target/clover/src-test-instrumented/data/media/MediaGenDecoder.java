/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class MediaGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_228wh28whlusyjxcl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,105150,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(config, clazz);__CLR4_5_228wh28whlusyjxcl.R.inc(104850);try{__CLR4_5_228wh28whlusyjxcl.R.inc(104849);
        // data.media.Media.Player
        __CLR4_5_228wh28whlusyjxcl.R.inc(104851);player_gen_deser__ = config.getDeserializer(data.media.Media.Player.class);
    }finally{__CLR4_5_228wh28whlusyjxcl.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_228wh28whlusyjxcl.R.inc(104852);
        __CLR4_5_228wh28whlusyjxcl.R.inc(104853);return new Media();
        
    }finally{__CLR4_5_228wh28whlusyjxcl.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_228wh28whlusyjxcl.R.inc(104854);
        __CLR4_5_228wh28whlusyjxcl.R.inc(104855);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_5_228wh28whlusyjxcl.R.inc(104856);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104857)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104858)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104859);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104860);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104861)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104862)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104863);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104864)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104865)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104866);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104867);ParseContext mark_context = parser.getContext();
        __CLR4_5_228wh28whlusyjxcl.R.inc(104868);int matchedCount = 0;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104869);Media instance = new Media();
        
        __CLR4_5_228wh28whlusyjxcl.R.inc(104870);ParseContext context = parser.getContext();
        __CLR4_5_228wh28whlusyjxcl.R.inc(104871);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_5_228wh28whlusyjxcl.R.inc(104872);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104873)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104874)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104875);return instance;
        }
        
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104876);int matchStat = 0;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104877);int _asm_flag_0 = 0;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104878);int bitrate_gen = 0;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104879);String copyright_gen;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104880);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104881)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104882)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104883);copyright_gen = lexer.stringDefaultValue();
            __CLR4_5_228wh28whlusyjxcl.R.inc(104884);_asm_flag_0 |= 2;
        } }else {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104885);copyright_gen = null;
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104886);long duration_gen = 0;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104887);String format_gen;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104888);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104889)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104890)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104891);format_gen = lexer.stringDefaultValue();
            __CLR4_5_228wh28whlusyjxcl.R.inc(104892);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104893);format_gen = null;
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104894);int height_gen = 0;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104895);java.util.List persons_gen = null;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104896);data.media.Media.Player player_gen = null;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104897);long size_gen = 0;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104898);String title_gen;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104899);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104900)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104901)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104902);title_gen = lexer.stringDefaultValue();
            __CLR4_5_228wh28whlusyjxcl.R.inc(104903);_asm_flag_0 |= 256;
        } }else {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104904);title_gen = null;
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104905);String uri_gen;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104906);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104907)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104908)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104909);uri_gen = lexer.stringDefaultValue();
            __CLR4_5_228wh28whlusyjxcl.R.inc(104910);_asm_flag_0 |= 512;
        } }else {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104911);uri_gen = null;
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104912);int width_gen = 0;
        __CLR4_5_228wh28whlusyjxcl.R.inc(104913);boolean endFlag = false, restFlag = false;
        
        __CLR4_5_228wh28whlusyjxcl.R.inc(104914);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104915)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104916)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104917);bitrate_gen = lexer.scanFieldInt(bitrate_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(104918);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104919)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104920)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104921);_asm_flag_0 |= 1;
                __CLR4_5_228wh28whlusyjxcl.R.inc(104922);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104923);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104924)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104925)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104926);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104927);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104928)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104929)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104930);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104931);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104932)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104933)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104934);copyright_gen = lexer.scanFieldString(copyright_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(104935);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104936)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104937)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104938);_asm_flag_0 |= 2;
                __CLR4_5_228wh28whlusyjxcl.R.inc(104939);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104940);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104941)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104942)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104943);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104944);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104945)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104946)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104947);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104948);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104949)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104950)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104951);duration_gen = lexer.scanFieldLong(duration_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(104952);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104953)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104954)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104955);_asm_flag_0 |= 4;
                __CLR4_5_228wh28whlusyjxcl.R.inc(104956);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104957);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104958)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104959)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104960);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104961);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104962)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104963)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104964);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104965);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104966)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104967)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104968);format_gen = lexer.scanFieldString(format_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(104969);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104970)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104971)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104972);_asm_flag_0 |= 8;
                __CLR4_5_228wh28whlusyjxcl.R.inc(104973);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104974);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104975)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104976)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104977);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104978);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104979)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104980)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104981);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104982);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104983)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104984)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(104985);height_gen = lexer.scanFieldInt(height_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(104986);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104987)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104988)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104989);_asm_flag_0 |= 16;
                __CLR4_5_228wh28whlusyjxcl.R.inc(104990);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104991);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104992)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104993)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104994);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(104995);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(104996)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(104997)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(104998);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(104999);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105000)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105001)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105002);persons_gen = (java.util.List) lexer.scanFieldStringArray(persons_gen_prefix__, java.util.List.class);
            __CLR4_5_228wh28whlusyjxcl.R.inc(105003);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105004)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105005)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105006);_asm_flag_0 |= 32;
                __CLR4_5_228wh28whlusyjxcl.R.inc(105007);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105008);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105009)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105010)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105011);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105012);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105013)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105014)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105015);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105016);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105017)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105018)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105019);player_gen = (data.media.Media.Player) this.scanEnum(lexer, player_gen_prefix__, player_gen_deser__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(105020);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105021)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105022)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105023);_asm_flag_0 |= 64;
                __CLR4_5_228wh28whlusyjxcl.R.inc(105024);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105025);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105026)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105027)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105028);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105029);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105030)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105031)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105032);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105033);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105034)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105035)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105036);size_gen = lexer.scanFieldLong(size_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(105037);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105038)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105039)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105040);_asm_flag_0 |= 128;
                __CLR4_5_228wh28whlusyjxcl.R.inc(105041);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105042);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105043)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105044)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105045);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105046);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105047)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105048)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105049);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105050);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105051)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105052)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105053);title_gen = lexer.scanFieldString(title_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(105054);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105055)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105056)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105057);_asm_flag_0 |= 256;
                __CLR4_5_228wh28whlusyjxcl.R.inc(105058);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105059);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105060)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105061)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105062);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105063);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105064)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105065)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105066);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105067);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105068)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105069)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105070);uri_gen = lexer.scanFieldString(uri_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(105071);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105072)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105073)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105074);_asm_flag_0 |= 512;
                __CLR4_5_228wh28whlusyjxcl.R.inc(105075);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105076);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105077)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105078)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105079);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105080);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105081)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105082)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105083);endFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105084);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105085)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105086)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105087);width_gen = lexer.scanFieldInt(width_gen_prefix__);
            __CLR4_5_228wh28whlusyjxcl.R.inc(105088);if((((lexer.matchStat > 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105089)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105090)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105091);_asm_flag_0 |= 1024;
                __CLR4_5_228wh28whlusyjxcl.R.inc(105092);matchedCount++;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105093);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105094)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105095)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105096);restFlag = true;
            }
            }__CLR4_5_228wh28whlusyjxcl.R.inc(105097);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105098)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105099)==0&false))) {{
                __CLR4_5_228wh28whlusyjxcl.R.inc(105100);restFlag = true;
            }
            
        }}
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105101);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105102)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105103)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105104);instance.setBitrate(bitrate_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105105);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105106)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105107)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105108);instance.setCopyright(copyright_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105109);if (((((_asm_flag_0 & 4) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105110)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105111)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105112);instance.setDuration(duration_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105113);if (((((_asm_flag_0 & 8) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105114)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105115)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105116);instance.setFormat(format_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105117);if (((((_asm_flag_0 & 16) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105118)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105119)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105120);instance.setHeight(height_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105121);if (((((_asm_flag_0 & 32) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105122)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105123)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105124);instance.setPersons(persons_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105125);if (((((_asm_flag_0 & 64) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105126)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105127)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105128);instance.setPlayer(player_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105129);if (((((_asm_flag_0 & 128) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105130)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105131)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105132);instance.setSize(size_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105133);if (((((_asm_flag_0 & 256) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105134)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105135)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105136);instance.setTitle(title_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105137);if (((((_asm_flag_0 & 512) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105138)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105139)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105140);instance.setUri(uri_gen);
            
        }
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105141);if (((((_asm_flag_0 & 1024) != 0)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105142)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105143)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105144);instance.setWidth(width_gen);
            
        }
        
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105145);if ((((restFlag)&&(__CLR4_5_228wh28whlusyjxcl.R.iget(105146)!=0|true))||(__CLR4_5_228wh28whlusyjxcl.R.iget(105147)==0&false))) {{
            __CLR4_5_228wh28whlusyjxcl.R.inc(105148);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_5_228wh28whlusyjxcl.R.inc(105149);return instance;
        
    }finally{__CLR4_5_228wh28whlusyjxcl.R.flushNeeded();}}
}

