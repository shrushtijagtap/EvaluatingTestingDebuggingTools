/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class MediaGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_1_1028ws28wslusqky4v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,105161,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(config, clazz);__CLR4_1_1028ws28wslusqky4v.R.inc(104861);try{__CLR4_1_1028ws28wslusqky4v.R.inc(104860);
        // data.media.Media.Player
        __CLR4_1_1028ws28wslusqky4v.R.inc(104862);player_gen_deser__ = config.getDeserializer(data.media.Media.Player.class);
    }finally{__CLR4_1_1028ws28wslusqky4v.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_1_1028ws28wslusqky4v.R.inc(104863);
        __CLR4_1_1028ws28wslusqky4v.R.inc(104864);return new Media();
        
    }finally{__CLR4_1_1028ws28wslusqky4v.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1028ws28wslusqky4v.R.inc(104865);
        __CLR4_1_1028ws28wslusqky4v.R.inc(104866);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_1_1028ws28wslusqky4v.R.inc(104867);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104868)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104869)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104870);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104871);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104872)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104873)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104874);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104875)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104876)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104877);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104878);ParseContext mark_context = parser.getContext();
        __CLR4_1_1028ws28wslusqky4v.R.inc(104879);int matchedCount = 0;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104880);Media instance = new Media();
        
        __CLR4_1_1028ws28wslusqky4v.R.inc(104881);ParseContext context = parser.getContext();
        __CLR4_1_1028ws28wslusqky4v.R.inc(104882);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_1_1028ws28wslusqky4v.R.inc(104883);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104884)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104885)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104886);return instance;
        }
        
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104887);int matchStat = 0;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104888);int _asm_flag_0 = 0;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104889);int bitrate_gen = 0;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104890);String copyright_gen;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104891);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104892)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104893)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104894);copyright_gen = lexer.stringDefaultValue();
            __CLR4_1_1028ws28wslusqky4v.R.inc(104895);_asm_flag_0 |= 2;
        } }else {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104896);copyright_gen = null;
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104897);long duration_gen = 0;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104898);String format_gen;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104899);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104900)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104901)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104902);format_gen = lexer.stringDefaultValue();
            __CLR4_1_1028ws28wslusqky4v.R.inc(104903);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104904);format_gen = null;
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104905);int height_gen = 0;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104906);java.util.List persons_gen = null;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104907);data.media.Media.Player player_gen = null;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104908);long size_gen = 0;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104909);String title_gen;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104910);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104911)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104912)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104913);title_gen = lexer.stringDefaultValue();
            __CLR4_1_1028ws28wslusqky4v.R.inc(104914);_asm_flag_0 |= 256;
        } }else {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104915);title_gen = null;
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104916);String uri_gen;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104917);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104918)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104919)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104920);uri_gen = lexer.stringDefaultValue();
            __CLR4_1_1028ws28wslusqky4v.R.inc(104921);_asm_flag_0 |= 512;
        } }else {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104922);uri_gen = null;
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104923);int width_gen = 0;
        __CLR4_1_1028ws28wslusqky4v.R.inc(104924);boolean endFlag = false, restFlag = false;
        
        __CLR4_1_1028ws28wslusqky4v.R.inc(104925);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104926)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104927)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104928);bitrate_gen = lexer.scanFieldInt(bitrate_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(104929);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104930)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104931)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104932);_asm_flag_0 |= 1;
                __CLR4_1_1028ws28wslusqky4v.R.inc(104933);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(104934);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104935)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104936)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104937);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(104938);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104939)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104940)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104941);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104942);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104943)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104944)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104945);copyright_gen = lexer.scanFieldString(copyright_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(104946);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104947)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104948)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104949);_asm_flag_0 |= 2;
                __CLR4_1_1028ws28wslusqky4v.R.inc(104950);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(104951);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104952)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104953)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104954);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(104955);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104956)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104957)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104958);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104959);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104960)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104961)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104962);duration_gen = lexer.scanFieldLong(duration_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(104963);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104964)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104965)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104966);_asm_flag_0 |= 4;
                __CLR4_1_1028ws28wslusqky4v.R.inc(104967);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(104968);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104969)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104970)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104971);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(104972);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104973)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104974)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104975);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104976);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104977)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104978)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104979);format_gen = lexer.scanFieldString(format_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(104980);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104981)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104982)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104983);_asm_flag_0 |= 8;
                __CLR4_1_1028ws28wslusqky4v.R.inc(104984);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(104985);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104986)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104987)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104988);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(104989);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104990)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104991)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(104992);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(104993);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104994)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104995)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(104996);height_gen = lexer.scanFieldInt(height_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(104997);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(104998)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(104999)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105000);_asm_flag_0 |= 16;
                __CLR4_1_1028ws28wslusqky4v.R.inc(105001);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105002);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105003)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105004)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105005);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105006);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105007)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105008)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105009);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105010);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105011)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105012)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105013);persons_gen = (java.util.List) lexer.scanFieldStringArray(persons_gen_prefix__, java.util.List.class);
            __CLR4_1_1028ws28wslusqky4v.R.inc(105014);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105015)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105016)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105017);_asm_flag_0 |= 32;
                __CLR4_1_1028ws28wslusqky4v.R.inc(105018);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105019);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105020)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105021)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105022);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105023);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105024)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105025)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105026);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105027);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105028)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105029)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105030);player_gen = (data.media.Media.Player) this.scanEnum(lexer, player_gen_prefix__, player_gen_deser__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(105031);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105032)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105033)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105034);_asm_flag_0 |= 64;
                __CLR4_1_1028ws28wslusqky4v.R.inc(105035);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105036);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105037)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105038)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105039);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105040);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105041)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105042)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105043);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105044);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105045)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105046)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105047);size_gen = lexer.scanFieldLong(size_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(105048);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105049)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105050)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105051);_asm_flag_0 |= 128;
                __CLR4_1_1028ws28wslusqky4v.R.inc(105052);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105053);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105054)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105055)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105056);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105057);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105058)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105059)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105060);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105061);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105062)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105063)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105064);title_gen = lexer.scanFieldString(title_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(105065);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105066)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105067)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105068);_asm_flag_0 |= 256;
                __CLR4_1_1028ws28wslusqky4v.R.inc(105069);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105070);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105071)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105072)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105073);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105074);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105075)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105076)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105077);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105078);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105079)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105080)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105081);uri_gen = lexer.scanFieldString(uri_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(105082);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105083)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105084)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105085);_asm_flag_0 |= 512;
                __CLR4_1_1028ws28wslusqky4v.R.inc(105086);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105087);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105088)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105089)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105090);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105091);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105092)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105093)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105094);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105095);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105096)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105097)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105098);width_gen = lexer.scanFieldInt(width_gen_prefix__);
            __CLR4_1_1028ws28wslusqky4v.R.inc(105099);if((((lexer.matchStat > 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105100)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105101)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105102);_asm_flag_0 |= 1024;
                __CLR4_1_1028ws28wslusqky4v.R.inc(105103);matchedCount++;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105104);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105105)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105106)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105107);restFlag = true;
            }
            }__CLR4_1_1028ws28wslusqky4v.R.inc(105108);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105109)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105110)==0&false))) {{
                __CLR4_1_1028ws28wslusqky4v.R.inc(105111);restFlag = true;
            }
            
        }}
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105112);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105113)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105114)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105115);instance.setBitrate(bitrate_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105116);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105117)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105118)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105119);instance.setCopyright(copyright_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105120);if (((((_asm_flag_0 & 4) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105121)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105122)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105123);instance.setDuration(duration_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105124);if (((((_asm_flag_0 & 8) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105125)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105126)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105127);instance.setFormat(format_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105128);if (((((_asm_flag_0 & 16) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105129)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105130)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105131);instance.setHeight(height_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105132);if (((((_asm_flag_0 & 32) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105133)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105134)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105135);instance.setPersons(persons_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105136);if (((((_asm_flag_0 & 64) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105137)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105138)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105139);instance.setPlayer(player_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105140);if (((((_asm_flag_0 & 128) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105141)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105142)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105143);instance.setSize(size_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105144);if (((((_asm_flag_0 & 256) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105145)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105146)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105147);instance.setTitle(title_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105148);if (((((_asm_flag_0 & 512) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105149)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105150)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105151);instance.setUri(uri_gen);
            
        }
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105152);if (((((_asm_flag_0 & 1024) != 0)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105153)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105154)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105155);instance.setWidth(width_gen);
            
        }
        
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105156);if ((((restFlag)&&(__CLR4_1_1028ws28wslusqky4v.R.iget(105157)!=0|true))||(__CLR4_1_1028ws28wslusqky4v.R.iget(105158)==0&false))) {{
            __CLR4_1_1028ws28wslusqky4v.R.inc(105159);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_1_1028ws28wslusqky4v.R.inc(105160);return instance;
        
    }finally{__CLR4_1_1028ws28wslusqky4v.R.flushNeeded();}}
}

