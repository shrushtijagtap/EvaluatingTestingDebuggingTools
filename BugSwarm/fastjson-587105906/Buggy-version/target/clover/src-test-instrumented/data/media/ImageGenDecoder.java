/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class ImageGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_1_1028i028i0lusqkxur{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,104485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] size_gen_prefix__ = "\"size\":".toCharArray();
    private char[] uri_gen_prefix__ = "\"uri\":".toCharArray();
    private char[] title_gen_prefix__ = "\"title\":".toCharArray();
    private char[] width_gen_prefix__ = "\"width\":".toCharArray();
    private char[] height_gen_prefix__ = "\"height\":".toCharArray();
    
    private ObjectDeserializer uri_gen_deser__;
    private ObjectDeserializer title_gen_deser__;
    private ObjectDeserializer size_gen_deser__;
    
    public ImageGenDecoder (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_1_1028i028i0lusqkxur.R.inc(104329);try{__CLR4_1_1028i028i0lusqkxur.R.inc(104328);
        __CLR4_1_1028i028i0lusqkxur.R.inc(104330);size_gen_deser__ = config.getDeserializer(data.media.Image.Size.class);
    }finally{__CLR4_1_1028i028i0lusqkxur.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_1_1028i028i0lusqkxur.R.inc(104331);
        __CLR4_1_1028i028i0lusqkxur.R.inc(104332);return new Image();
        
    }finally{__CLR4_1_1028i028i0lusqkxur.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1028i028i0lusqkxur.R.inc(104333);
        __CLR4_1_1028i028i0lusqkxur.R.inc(104334);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_1_1028i028i0lusqkxur.R.inc(104335);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104336)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104337)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104338);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104339);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104340)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104341)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104342);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104343)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104344)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104345);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104346);ParseContext mark_context = parser.getContext();
        __CLR4_1_1028i028i0lusqkxur.R.inc(104347);int matchedCount = 0;
        __CLR4_1_1028i028i0lusqkxur.R.inc(104348);Image instance = new Image();
        
        __CLR4_1_1028i028i0lusqkxur.R.inc(104349);ParseContext context = parser.getContext();
        __CLR4_1_1028i028i0lusqkxur.R.inc(104350);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_1_1028i028i0lusqkxur.R.inc(104351);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104352)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104353)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104354);return instance;
        }
        
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104355);int matchStat = 0;
        __CLR4_1_1028i028i0lusqkxur.R.inc(104356);int _asm_flag_0 = 0;
        __CLR4_1_1028i028i0lusqkxur.R.inc(104357);int height_gen = 0;
        __CLR4_1_1028i028i0lusqkxur.R.inc(104358);data.media.Image.Size size_gen = null;
        __CLR4_1_1028i028i0lusqkxur.R.inc(104359);String title_gen;
        __CLR4_1_1028i028i0lusqkxur.R.inc(104360);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104361)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104362)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104363);title_gen = lexer.stringDefaultValue();
            __CLR4_1_1028i028i0lusqkxur.R.inc(104364);_asm_flag_0 |= 4;
        } }else {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104365);title_gen = null;
        }
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104366);String uri_gen;
        __CLR4_1_1028i028i0lusqkxur.R.inc(104367);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104368)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104369)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104370);uri_gen = lexer.stringDefaultValue();
            __CLR4_1_1028i028i0lusqkxur.R.inc(104371);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104372);uri_gen = null;
        }
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104373);int width_gen = 0;
        __CLR4_1_1028i028i0lusqkxur.R.inc(104374);boolean endFlag = false, restFlag = false;
        
        __CLR4_1_1028i028i0lusqkxur.R.inc(104375);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104376)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104377)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104378);height_gen = lexer.scanFieldInt(height_gen_prefix__);
            __CLR4_1_1028i028i0lusqkxur.R.inc(104379);if((((lexer.matchStat > 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104380)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104381)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104382);_asm_flag_0 |= 1;
                __CLR4_1_1028i028i0lusqkxur.R.inc(104383);matchedCount++;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104384);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104385)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104386)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104387);restFlag = true;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104388);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104389)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104390)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104391);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104392);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104393)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104394)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104395);size_gen = (data.media.Image.Size) this.scanEnum(lexer, size_gen_prefix__, size_gen_deser__);
            __CLR4_1_1028i028i0lusqkxur.R.inc(104396);if((((lexer.matchStat > 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104397)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104398)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104399);_asm_flag_0 |= 2;
                __CLR4_1_1028i028i0lusqkxur.R.inc(104400);matchedCount++;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104401);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104402)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104403)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104404);restFlag = true;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104405);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104406)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104407)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104408);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104409);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104410)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104411)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104412);title_gen = lexer.scanFieldString(title_gen_prefix__);
            __CLR4_1_1028i028i0lusqkxur.R.inc(104413);if((((lexer.matchStat > 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104414)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104415)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104416);_asm_flag_0 |= 4;
                __CLR4_1_1028i028i0lusqkxur.R.inc(104417);matchedCount++;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104418);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104419)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104420)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104421);restFlag = true;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104422);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104423)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104424)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104425);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104426);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104427)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104428)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104429);uri_gen = lexer.scanFieldString(uri_gen_prefix__);
            __CLR4_1_1028i028i0lusqkxur.R.inc(104430);if((((lexer.matchStat > 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104431)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104432)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104433);_asm_flag_0 |= 8;
                __CLR4_1_1028i028i0lusqkxur.R.inc(104434);matchedCount++;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104435);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104436)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104437)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104438);restFlag = true;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104439);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104440)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104441)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104442);endFlag = true;
            }
            
        }}
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104443);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104444)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104445)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104446);width_gen = lexer.scanFieldInt(width_gen_prefix__);
            __CLR4_1_1028i028i0lusqkxur.R.inc(104447);if((((lexer.matchStat > 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104448)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104449)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104450);_asm_flag_0 |= 16;
                __CLR4_1_1028i028i0lusqkxur.R.inc(104451);matchedCount++;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104452);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104453)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104454)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104455);restFlag = true;
            }
            }__CLR4_1_1028i028i0lusqkxur.R.inc(104456);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104457)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104458)==0&false))) {{
                __CLR4_1_1028i028i0lusqkxur.R.inc(104459);restFlag = true;
            }
            
        }}
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104460);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104461)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104462)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104463);instance.setHeight(height_gen);
            
        }
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104464);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104465)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104466)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104467);instance.setSize(size_gen);
            
        }
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104468);if (((((_asm_flag_0 & 4) != 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104469)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104470)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104471);instance.setTitle(title_gen);
            
        }
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104472);if (((((_asm_flag_0 & 8) != 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104473)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104474)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104475);instance.setUri(uri_gen);
            
        }
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104476);if (((((_asm_flag_0 & 16) != 0)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104477)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104478)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104479);instance.setWidth(width_gen);
            
        }
        
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104480);if ((((restFlag)&&(__CLR4_1_1028i028i0lusqkxur.R.iget(104481)!=0|true))||(__CLR4_1_1028i028i0lusqkxur.R.iget(104482)==0&false))) {{
            __CLR4_1_1028i028i0lusqkxur.R.inc(104483);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_1_1028i028i0lusqkxur.R.inc(104484);return instance;
        
    }finally{__CLR4_1_1028i028i0lusqkxur.R.flushNeeded();}}
}

