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

public class MediaContentGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_229qt29qtlusvnlwv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,106081,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] media_gen_prefix__ = "\"media\":".toCharArray();
    private char[] images_gen_prefix__ = "\"images\":".toCharArray();
    
    private ObjectDeserializer media_gen_deser__;
    private ObjectDeserializer images_gen_list_item_deser__;
    private Type images_gen_list_item_type__ = data.media.Image.class;
    
    public MediaContentGenDecoder (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_5_229qt29qtlusvnlwv.R.inc(105942);try{__CLR4_5_229qt29qtlusvnlwv.R.inc(105941);
        
    }finally{__CLR4_5_229qt29qtlusvnlwv.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_229qt29qtlusvnlwv.R.inc(105943);
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105944);return new MediaContent();
        
    }finally{__CLR4_5_229qt29qtlusvnlwv.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_229qt29qtlusvnlwv.R.inc(105945);
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105946);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105947);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105948)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105949)==0&false))) {{
            __CLR4_5_229qt29qtlusvnlwv.R.inc(105950);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(105951);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105952)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105953)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(105954);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105955)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105956)==0&false))) {{
            __CLR4_5_229qt29qtlusvnlwv.R.inc(105957);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(105958);ParseContext mark_context = parser.getContext();
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105959);int matchedCount = 0;
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105960);MediaContent instance = new MediaContent();
        
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105961);ParseContext context = parser.getContext();
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105962);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105963);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105964)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105965)==0&false))) {{
            __CLR4_5_229qt29qtlusvnlwv.R.inc(105966);return instance;
        }
        
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(105967);int matchStat = 0;
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105968);int _asm_flag_0 = 0;
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105969);java.util.List images_gen = null;
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105970);data.media.Media media_gen = null;
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105971);boolean endFlag = false, restFlag = false;
        
        __CLR4_5_229qt29qtlusvnlwv.R.inc(105972);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105973)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105974)==0&false))) {{
            __CLR4_5_229qt29qtlusvnlwv.R.inc(105975);if ((((lexer.matchField(images_gen_prefix__))&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105976)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105977)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(105978);_asm_flag_0 |= 1;
                __CLR4_5_229qt29qtlusvnlwv.R.inc(105979);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105980)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105981)==0&false))) {{
                    __CLR4_5_229qt29qtlusvnlwv.R.inc(105982);lexer.nextToken(JSONToken.COMMA);
                } }else {{
                    __CLR4_5_229qt29qtlusvnlwv.R.inc(105983);if ((((lexer.token() == JSONToken.LBRACKET)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105984)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105985)==0&false))) {{
                        __CLR4_5_229qt29qtlusvnlwv.R.inc(105986);if((((images_gen_list_item_deser__ == null)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105987)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105988)==0&false))) {{
                            __CLR4_5_229qt29qtlusvnlwv.R.inc(105989);images_gen_list_item_deser__ = parser.getConfig().getDeserializer(data.media.Image.class);
                        }
                        }__CLR4_5_229qt29qtlusvnlwv.R.inc(105990);final int fastMatchToken = images_gen_list_item_deser__.getFastMatchToken();
                        __CLR4_5_229qt29qtlusvnlwv.R.inc(105991);lexer.nextToken(fastMatchToken);
                        __CLR4_5_229qt29qtlusvnlwv.R.inc(105992);images_gen = new java.util.ArrayList();
                        __CLR4_5_229qt29qtlusvnlwv.R.inc(105993);ParseContext listContext = parser.getContext();
                        __CLR4_5_229qt29qtlusvnlwv.R.inc(105994);parser.setContext(images_gen, "images");
            
                        __CLR4_5_229qt29qtlusvnlwv.R.inc(105995);for(int i = 0; ;++i) {{
                            __CLR4_5_229qt29qtlusvnlwv.R.inc(105996);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(105997)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(105998)==0&false))) {{
                                __CLR4_5_229qt29qtlusvnlwv.R.inc(105999);break;
                            }
                            }__CLR4_5_229qt29qtlusvnlwv.R.inc(106000);data.media.Image itemValue = images_gen_list_item_deser__.deserialze(parser, images_gen_list_item_type__, i);
                            __CLR4_5_229qt29qtlusvnlwv.R.inc(106001);images_gen.add(itemValue);
                            __CLR4_5_229qt29qtlusvnlwv.R.inc(106002);parser.checkListResolve(images_gen);
                            __CLR4_5_229qt29qtlusvnlwv.R.inc(106003);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106004)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106005)==0&false))) {{
                                __CLR4_5_229qt29qtlusvnlwv.R.inc(106006);lexer.nextToken(fastMatchToken);
                            }
                        }}
                        }__CLR4_5_229qt29qtlusvnlwv.R.inc(106007);parser.setContext(listContext);
                        __CLR4_5_229qt29qtlusvnlwv.R.inc(106008);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106009)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106010)==0&false))) {{
                            __CLR4_5_229qt29qtlusvnlwv.R.inc(106011);restFlag = true;
                        }
                        }__CLR4_5_229qt29qtlusvnlwv.R.inc(106012);lexer.nextToken(JSONToken.COMMA);
            
                    } }else {{
                        __CLR4_5_229qt29qtlusvnlwv.R.inc(106013);restFlag = true;
                    }
                }}
            }}
            }__CLR4_5_229qt29qtlusvnlwv.R.inc(106014);if((((lexer.matchStat > 0)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106015)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106016)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106017);_asm_flag_0 |= 1;
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106018);matchedCount++;
            }
            }__CLR4_5_229qt29qtlusvnlwv.R.inc(106019);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106020)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106021)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106022);restFlag = true;
            }
            }__CLR4_5_229qt29qtlusvnlwv.R.inc(106023);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106024)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106025)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106026);endFlag = true;
            }
            
        }}
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(106027);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106028)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106029)==0&false))) {{
            __CLR4_5_229qt29qtlusvnlwv.R.inc(106030);if ((((lexer.matchField(media_gen_prefix__))&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106031)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106032)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106033);_asm_flag_0 |= 2;
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106034);matchedCount++;
            __CLR4_5_229qt29qtlusvnlwv.R.inc(106035);if ((((media_gen_deser__ == null)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106036)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106037)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106038);media_gen_deser__ = parser.getConfig().getDeserializer(data.media.Media.class);
            }
                }__CLR4_5_229qt29qtlusvnlwv.R.inc(106039);media_gen_deser__.deserialze(parser, data.media.Media.class,"media");
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106040);if((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106041)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106042)==0&false))) {{
                    __CLR4_5_229qt29qtlusvnlwv.R.inc(106043);ResolveTask resolveTask = parser.getLastResolveTask();
                    __CLR4_5_229qt29qtlusvnlwv.R.inc(106044);resolveTask.ownerContext = parser.getContext();
                    __CLR4_5_229qt29qtlusvnlwv.R.inc(106045);resolveTask.fieldDeserializer = this.getFieldDeserializer("media");
                    __CLR4_5_229qt29qtlusvnlwv.R.inc(106046);parser.setResolveStatus(DefaultJSONParser.NONE);
                }
            }}
            }__CLR4_5_229qt29qtlusvnlwv.R.inc(106047);if ((((matchedCount <= 0 || lexer.token() != JSONToken.RBRACE)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106048)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106049)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106050);restFlag = true;
            } }else {__CLR4_5_229qt29qtlusvnlwv.R.inc(106051);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106052)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106053)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106054);lexer.nextToken();
            }
            }}__CLR4_5_229qt29qtlusvnlwv.R.inc(106055);if((((lexer.matchStat > 0)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106056)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106057)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106058);_asm_flag_0 |= 2;
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106059);matchedCount++;
            }
            }__CLR4_5_229qt29qtlusvnlwv.R.inc(106060);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106061)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106062)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106063);restFlag = true;
            }
            }__CLR4_5_229qt29qtlusvnlwv.R.inc(106064);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106065)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106066)==0&false))) {{
                __CLR4_5_229qt29qtlusvnlwv.R.inc(106067);restFlag = true;
            }
            
        }}
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(106068);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106069)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106070)==0&false))) {{
            __CLR4_5_229qt29qtlusvnlwv.R.inc(106071);instance.setImages(images_gen);
            
        }
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(106072);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106073)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106074)==0&false))) {{
            __CLR4_5_229qt29qtlusvnlwv.R.inc(106075);instance.setMedia(media_gen);
            
        }
        
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(106076);if ((((restFlag)&&(__CLR4_5_229qt29qtlusvnlwv.R.iget(106077)!=0|true))||(__CLR4_5_229qt29qtlusvnlwv.R.iget(106078)==0&false))) {{
            __CLR4_5_229qt29qtlusvnlwv.R.inc(106079);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_5_229qt29qtlusvnlwv.R.inc(106080);return instance;
        
    }finally{__CLR4_5_229qt29qtlusvnlwv.R.flushNeeded();}}
}

