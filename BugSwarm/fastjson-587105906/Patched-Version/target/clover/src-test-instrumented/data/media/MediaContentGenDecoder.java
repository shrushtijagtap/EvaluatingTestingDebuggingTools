/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class MediaContentGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_228sl28sllusyjxce{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,104849,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] media_gen_prefix__ = "\"media\":".toCharArray();
    private char[] images_gen_prefix__ = "\"images\":".toCharArray();
    
    private ObjectDeserializer media_gen_deser__;
    private ObjectDeserializer images_gen_list_item_deser__;
    private Type images_gen_list_item_type__ = data.media.Image.class;
    
    public MediaContentGenDecoder (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_5_228sl28sllusyjxce.R.inc(104710);try{__CLR4_5_228sl28sllusyjxce.R.inc(104709);
        
    }finally{__CLR4_5_228sl28sllusyjxce.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_228sl28sllusyjxce.R.inc(104711);
        __CLR4_5_228sl28sllusyjxce.R.inc(104712);return new MediaContent();
        
    }finally{__CLR4_5_228sl28sllusyjxce.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_228sl28sllusyjxce.R.inc(104713);
        __CLR4_5_228sl28sllusyjxce.R.inc(104714);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_5_228sl28sllusyjxce.R.inc(104715);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_5_228sl28sllusyjxce.R.iget(104716)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104717)==0&false))) {{
            __CLR4_5_228sl28sllusyjxce.R.inc(104718);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_228sl28sllusyjxce.R.inc(104719);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_5_228sl28sllusyjxce.R.iget(104720)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104721)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_5_228sl28sllusyjxce.R.inc(104722);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104723)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104724)==0&false))) {{
            __CLR4_5_228sl28sllusyjxce.R.inc(104725);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_228sl28sllusyjxce.R.inc(104726);ParseContext mark_context = parser.getContext();
        __CLR4_5_228sl28sllusyjxce.R.inc(104727);int matchedCount = 0;
        __CLR4_5_228sl28sllusyjxce.R.inc(104728);MediaContent instance = new MediaContent();
        
        __CLR4_5_228sl28sllusyjxce.R.inc(104729);ParseContext context = parser.getContext();
        __CLR4_5_228sl28sllusyjxce.R.inc(104730);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_5_228sl28sllusyjxce.R.inc(104731);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104732)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104733)==0&false))) {{
            __CLR4_5_228sl28sllusyjxce.R.inc(104734);return instance;
        }
        
        }__CLR4_5_228sl28sllusyjxce.R.inc(104735);int matchStat = 0;
        __CLR4_5_228sl28sllusyjxce.R.inc(104736);int _asm_flag_0 = 0;
        __CLR4_5_228sl28sllusyjxce.R.inc(104737);java.util.List images_gen = null;
        __CLR4_5_228sl28sllusyjxce.R.inc(104738);data.media.Media media_gen = null;
        __CLR4_5_228sl28sllusyjxce.R.inc(104739);boolean endFlag = false, restFlag = false;
        
        __CLR4_5_228sl28sllusyjxce.R.inc(104740);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228sl28sllusyjxce.R.iget(104741)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104742)==0&false))) {{
            __CLR4_5_228sl28sllusyjxce.R.inc(104743);if ((((lexer.matchField(images_gen_prefix__))&&(__CLR4_5_228sl28sllusyjxce.R.iget(104744)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104745)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104746);_asm_flag_0 |= 1;
                __CLR4_5_228sl28sllusyjxce.R.inc(104747);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104748)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104749)==0&false))) {{
                    __CLR4_5_228sl28sllusyjxce.R.inc(104750);lexer.nextToken(JSONToken.COMMA);
                } }else {{
                    __CLR4_5_228sl28sllusyjxce.R.inc(104751);if ((((lexer.token() == JSONToken.LBRACKET)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104752)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104753)==0&false))) {{
                        __CLR4_5_228sl28sllusyjxce.R.inc(104754);if((((images_gen_list_item_deser__ == null)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104755)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104756)==0&false))) {{
                            __CLR4_5_228sl28sllusyjxce.R.inc(104757);images_gen_list_item_deser__ = parser.getConfig().getDeserializer(data.media.Image.class);
                        }
                        }__CLR4_5_228sl28sllusyjxce.R.inc(104758);final int fastMatchToken = images_gen_list_item_deser__.getFastMatchToken();
                        __CLR4_5_228sl28sllusyjxce.R.inc(104759);lexer.nextToken(fastMatchToken);
                        __CLR4_5_228sl28sllusyjxce.R.inc(104760);images_gen = new java.util.ArrayList();
                        __CLR4_5_228sl28sllusyjxce.R.inc(104761);ParseContext listContext = parser.getContext();
                        __CLR4_5_228sl28sllusyjxce.R.inc(104762);parser.setContext(images_gen, "images");
            
                        __CLR4_5_228sl28sllusyjxce.R.inc(104763);for(int i = 0; ;++i) {{
                            __CLR4_5_228sl28sllusyjxce.R.inc(104764);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104765)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104766)==0&false))) {{
                                __CLR4_5_228sl28sllusyjxce.R.inc(104767);break;
                            }
                            }__CLR4_5_228sl28sllusyjxce.R.inc(104768);data.media.Image itemValue = images_gen_list_item_deser__.deserialze(parser, images_gen_list_item_type__, i);
                            __CLR4_5_228sl28sllusyjxce.R.inc(104769);images_gen.add(itemValue);
                            __CLR4_5_228sl28sllusyjxce.R.inc(104770);parser.checkListResolve(images_gen);
                            __CLR4_5_228sl28sllusyjxce.R.inc(104771);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104772)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104773)==0&false))) {{
                                __CLR4_5_228sl28sllusyjxce.R.inc(104774);lexer.nextToken(fastMatchToken);
                            }
                        }}
                        }__CLR4_5_228sl28sllusyjxce.R.inc(104775);parser.setContext(listContext);
                        __CLR4_5_228sl28sllusyjxce.R.inc(104776);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104777)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104778)==0&false))) {{
                            __CLR4_5_228sl28sllusyjxce.R.inc(104779);restFlag = true;
                        }
                        }__CLR4_5_228sl28sllusyjxce.R.inc(104780);lexer.nextToken(JSONToken.COMMA);
            
                    } }else {{
                        __CLR4_5_228sl28sllusyjxce.R.inc(104781);restFlag = true;
                    }
                }}
            }}
            }__CLR4_5_228sl28sllusyjxce.R.inc(104782);if((((lexer.matchStat > 0)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104783)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104784)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104785);_asm_flag_0 |= 1;
                __CLR4_5_228sl28sllusyjxce.R.inc(104786);matchedCount++;
            }
            }__CLR4_5_228sl28sllusyjxce.R.inc(104787);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104788)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104789)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104790);restFlag = true;
            }
            }__CLR4_5_228sl28sllusyjxce.R.inc(104791);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104792)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104793)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104794);endFlag = true;
            }
            
        }}
        }__CLR4_5_228sl28sllusyjxce.R.inc(104795);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228sl28sllusyjxce.R.iget(104796)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104797)==0&false))) {{
            __CLR4_5_228sl28sllusyjxce.R.inc(104798);if ((((lexer.matchField(media_gen_prefix__))&&(__CLR4_5_228sl28sllusyjxce.R.iget(104799)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104800)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104801);_asm_flag_0 |= 2;
                __CLR4_5_228sl28sllusyjxce.R.inc(104802);matchedCount++;
            __CLR4_5_228sl28sllusyjxce.R.inc(104803);if ((((media_gen_deser__ == null)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104804)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104805)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104806);media_gen_deser__ = parser.getConfig().getDeserializer(data.media.Media.class);
            }
                }__CLR4_5_228sl28sllusyjxce.R.inc(104807);media_gen_deser__.deserialze(parser, data.media.Media.class,"media");
                __CLR4_5_228sl28sllusyjxce.R.inc(104808);if((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104809)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104810)==0&false))) {{
                    __CLR4_5_228sl28sllusyjxce.R.inc(104811);ResolveTask resolveTask = parser.getLastResolveTask();
                    __CLR4_5_228sl28sllusyjxce.R.inc(104812);resolveTask.ownerContext = parser.getContext();
                    __CLR4_5_228sl28sllusyjxce.R.inc(104813);resolveTask.fieldDeserializer = this.getFieldDeserializer("media");
                    __CLR4_5_228sl28sllusyjxce.R.inc(104814);parser.setResolveStatus(DefaultJSONParser.NONE);
                }
            }}
            }__CLR4_5_228sl28sllusyjxce.R.inc(104815);if ((((matchedCount <= 0 || lexer.token() != JSONToken.RBRACE)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104816)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104817)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104818);restFlag = true;
            } }else {__CLR4_5_228sl28sllusyjxce.R.inc(104819);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104820)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104821)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104822);lexer.nextToken();
            }
            }}__CLR4_5_228sl28sllusyjxce.R.inc(104823);if((((lexer.matchStat > 0)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104824)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104825)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104826);_asm_flag_0 |= 2;
                __CLR4_5_228sl28sllusyjxce.R.inc(104827);matchedCount++;
            }
            }__CLR4_5_228sl28sllusyjxce.R.inc(104828);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104829)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104830)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104831);restFlag = true;
            }
            }__CLR4_5_228sl28sllusyjxce.R.inc(104832);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104833)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104834)==0&false))) {{
                __CLR4_5_228sl28sllusyjxce.R.inc(104835);restFlag = true;
            }
            
        }}
        }__CLR4_5_228sl28sllusyjxce.R.inc(104836);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104837)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104838)==0&false))) {{
            __CLR4_5_228sl28sllusyjxce.R.inc(104839);instance.setImages(images_gen);
            
        }
        }__CLR4_5_228sl28sllusyjxce.R.inc(104840);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104841)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104842)==0&false))) {{
            __CLR4_5_228sl28sllusyjxce.R.inc(104843);instance.setMedia(media_gen);
            
        }
        
        }__CLR4_5_228sl28sllusyjxce.R.inc(104844);if ((((restFlag)&&(__CLR4_5_228sl28sllusyjxce.R.iget(104845)!=0|true))||(__CLR4_5_228sl28sllusyjxce.R.iget(104846)==0&false))) {{
            __CLR4_5_228sl28sllusyjxce.R.inc(104847);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_5_228sl28sllusyjxce.R.inc(104848);return instance;
        
    }finally{__CLR4_5_228sl28sllusyjxce.R.flushNeeded();}}
}

