/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

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

public class MediaContentGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_1_1028sw28swlusqky2e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,104860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] media_gen_prefix__ = "\"media\":".toCharArray();
    private char[] images_gen_prefix__ = "\"images\":".toCharArray();
    
    private ObjectDeserializer media_gen_deser__;
    private ObjectDeserializer images_gen_list_item_deser__;
    private Type images_gen_list_item_type__ = data.media.Image.class;
    
    public MediaContentGenDecoder (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_1_1028sw28swlusqky2e.R.inc(104721);try{__CLR4_1_1028sw28swlusqky2e.R.inc(104720);
        
    }finally{__CLR4_1_1028sw28swlusqky2e.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_1_1028sw28swlusqky2e.R.inc(104722);
        __CLR4_1_1028sw28swlusqky2e.R.inc(104723);return new MediaContent();
        
    }finally{__CLR4_1_1028sw28swlusqky2e.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1028sw28swlusqky2e.R.inc(104724);
        __CLR4_1_1028sw28swlusqky2e.R.inc(104725);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_1_1028sw28swlusqky2e.R.inc(104726);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104727)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104728)==0&false))) {{
            __CLR4_1_1028sw28swlusqky2e.R.inc(104729);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104730);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104731)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104732)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104733);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104734)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104735)==0&false))) {{
            __CLR4_1_1028sw28swlusqky2e.R.inc(104736);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104737);ParseContext mark_context = parser.getContext();
        __CLR4_1_1028sw28swlusqky2e.R.inc(104738);int matchedCount = 0;
        __CLR4_1_1028sw28swlusqky2e.R.inc(104739);MediaContent instance = new MediaContent();
        
        __CLR4_1_1028sw28swlusqky2e.R.inc(104740);ParseContext context = parser.getContext();
        __CLR4_1_1028sw28swlusqky2e.R.inc(104741);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_1_1028sw28swlusqky2e.R.inc(104742);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104743)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104744)==0&false))) {{
            __CLR4_1_1028sw28swlusqky2e.R.inc(104745);return instance;
        }
        
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104746);int matchStat = 0;
        __CLR4_1_1028sw28swlusqky2e.R.inc(104747);int _asm_flag_0 = 0;
        __CLR4_1_1028sw28swlusqky2e.R.inc(104748);java.util.List images_gen = null;
        __CLR4_1_1028sw28swlusqky2e.R.inc(104749);data.media.Media media_gen = null;
        __CLR4_1_1028sw28swlusqky2e.R.inc(104750);boolean endFlag = false, restFlag = false;
        
        __CLR4_1_1028sw28swlusqky2e.R.inc(104751);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104752)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104753)==0&false))) {{
            __CLR4_1_1028sw28swlusqky2e.R.inc(104754);if ((((lexer.matchField(images_gen_prefix__))&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104755)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104756)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104757);_asm_flag_0 |= 1;
                __CLR4_1_1028sw28swlusqky2e.R.inc(104758);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104759)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104760)==0&false))) {{
                    __CLR4_1_1028sw28swlusqky2e.R.inc(104761);lexer.nextToken(JSONToken.COMMA);
                } }else {{
                    __CLR4_1_1028sw28swlusqky2e.R.inc(104762);if ((((lexer.token() == JSONToken.LBRACKET)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104763)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104764)==0&false))) {{
                        __CLR4_1_1028sw28swlusqky2e.R.inc(104765);if((((images_gen_list_item_deser__ == null)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104766)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104767)==0&false))) {{
                            __CLR4_1_1028sw28swlusqky2e.R.inc(104768);images_gen_list_item_deser__ = parser.getConfig().getDeserializer(data.media.Image.class);
                        }
                        }__CLR4_1_1028sw28swlusqky2e.R.inc(104769);final int fastMatchToken = images_gen_list_item_deser__.getFastMatchToken();
                        __CLR4_1_1028sw28swlusqky2e.R.inc(104770);lexer.nextToken(fastMatchToken);
                        __CLR4_1_1028sw28swlusqky2e.R.inc(104771);images_gen = new java.util.ArrayList();
                        __CLR4_1_1028sw28swlusqky2e.R.inc(104772);ParseContext listContext = parser.getContext();
                        __CLR4_1_1028sw28swlusqky2e.R.inc(104773);parser.setContext(images_gen, "images");
            
                        __CLR4_1_1028sw28swlusqky2e.R.inc(104774);for(int i = 0; ;++i) {{
                            __CLR4_1_1028sw28swlusqky2e.R.inc(104775);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104776)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104777)==0&false))) {{
                                __CLR4_1_1028sw28swlusqky2e.R.inc(104778);break;
                            }
                            }__CLR4_1_1028sw28swlusqky2e.R.inc(104779);data.media.Image itemValue = images_gen_list_item_deser__.deserialze(parser, images_gen_list_item_type__, i);
                            __CLR4_1_1028sw28swlusqky2e.R.inc(104780);images_gen.add(itemValue);
                            __CLR4_1_1028sw28swlusqky2e.R.inc(104781);parser.checkListResolve(images_gen);
                            __CLR4_1_1028sw28swlusqky2e.R.inc(104782);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104783)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104784)==0&false))) {{
                                __CLR4_1_1028sw28swlusqky2e.R.inc(104785);lexer.nextToken(fastMatchToken);
                            }
                        }}
                        }__CLR4_1_1028sw28swlusqky2e.R.inc(104786);parser.setContext(listContext);
                        __CLR4_1_1028sw28swlusqky2e.R.inc(104787);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104788)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104789)==0&false))) {{
                            __CLR4_1_1028sw28swlusqky2e.R.inc(104790);restFlag = true;
                        }
                        }__CLR4_1_1028sw28swlusqky2e.R.inc(104791);lexer.nextToken(JSONToken.COMMA);
            
                    } }else {{
                        __CLR4_1_1028sw28swlusqky2e.R.inc(104792);restFlag = true;
                    }
                }}
            }}
            }__CLR4_1_1028sw28swlusqky2e.R.inc(104793);if((((lexer.matchStat > 0)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104794)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104795)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104796);_asm_flag_0 |= 1;
                __CLR4_1_1028sw28swlusqky2e.R.inc(104797);matchedCount++;
            }
            }__CLR4_1_1028sw28swlusqky2e.R.inc(104798);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104799)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104800)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104801);restFlag = true;
            }
            }__CLR4_1_1028sw28swlusqky2e.R.inc(104802);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104803)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104804)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104805);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104806);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104807)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104808)==0&false))) {{
            __CLR4_1_1028sw28swlusqky2e.R.inc(104809);if ((((lexer.matchField(media_gen_prefix__))&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104810)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104811)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104812);_asm_flag_0 |= 2;
                __CLR4_1_1028sw28swlusqky2e.R.inc(104813);matchedCount++;
            __CLR4_1_1028sw28swlusqky2e.R.inc(104814);if ((((media_gen_deser__ == null)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104815)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104816)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104817);media_gen_deser__ = parser.getConfig().getDeserializer(data.media.Media.class);
            }
                }__CLR4_1_1028sw28swlusqky2e.R.inc(104818);media_gen_deser__.deserialze(parser, data.media.Media.class,"media");
                __CLR4_1_1028sw28swlusqky2e.R.inc(104819);if((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104820)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104821)==0&false))) {{
                    __CLR4_1_1028sw28swlusqky2e.R.inc(104822);ResolveTask resolveTask = parser.getLastResolveTask();
                    __CLR4_1_1028sw28swlusqky2e.R.inc(104823);resolveTask.ownerContext = parser.getContext();
                    __CLR4_1_1028sw28swlusqky2e.R.inc(104824);resolveTask.fieldDeserializer = this.getFieldDeserializer("media");
                    __CLR4_1_1028sw28swlusqky2e.R.inc(104825);parser.setResolveStatus(DefaultJSONParser.NONE);
                }
            }}
            }__CLR4_1_1028sw28swlusqky2e.R.inc(104826);if ((((matchedCount <= 0 || lexer.token() != JSONToken.RBRACE)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104827)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104828)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104829);restFlag = true;
            } }else {__CLR4_1_1028sw28swlusqky2e.R.inc(104830);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104831)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104832)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104833);lexer.nextToken();
            }
            }}__CLR4_1_1028sw28swlusqky2e.R.inc(104834);if((((lexer.matchStat > 0)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104835)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104836)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104837);_asm_flag_0 |= 2;
                __CLR4_1_1028sw28swlusqky2e.R.inc(104838);matchedCount++;
            }
            }__CLR4_1_1028sw28swlusqky2e.R.inc(104839);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104840)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104841)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104842);restFlag = true;
            }
            }__CLR4_1_1028sw28swlusqky2e.R.inc(104843);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104844)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104845)==0&false))) {{
                __CLR4_1_1028sw28swlusqky2e.R.inc(104846);restFlag = true;
            }
            
        }}
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104847);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104848)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104849)==0&false))) {{
            __CLR4_1_1028sw28swlusqky2e.R.inc(104850);instance.setImages(images_gen);
            
        }
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104851);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104852)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104853)==0&false))) {{
            __CLR4_1_1028sw28swlusqky2e.R.inc(104854);instance.setMedia(media_gen);
            
        }
        
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104855);if ((((restFlag)&&(__CLR4_1_1028sw28swlusqky2e.R.iget(104856)!=0|true))||(__CLR4_1_1028sw28swlusqky2e.R.iget(104857)==0&false))) {{
            __CLR4_1_1028sw28swlusqky2e.R.inc(104858);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_1_1028sw28swlusqky2e.R.inc(104859);return instance;
        
    }finally{__CLR4_1_1028sw28swlusqky2e.R.flushNeeded();}}
}

