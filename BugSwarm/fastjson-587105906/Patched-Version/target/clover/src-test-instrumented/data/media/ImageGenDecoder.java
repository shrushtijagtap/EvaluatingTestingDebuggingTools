/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class ImageGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_228hp28hplusyjxc1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,104474,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] size_gen_prefix__ = "\"size\":".toCharArray();
    private char[] uri_gen_prefix__ = "\"uri\":".toCharArray();
    private char[] title_gen_prefix__ = "\"title\":".toCharArray();
    private char[] width_gen_prefix__ = "\"width\":".toCharArray();
    private char[] height_gen_prefix__ = "\"height\":".toCharArray();
    
    private ObjectDeserializer uri_gen_deser__;
    private ObjectDeserializer title_gen_deser__;
    private ObjectDeserializer size_gen_deser__;
    
    public ImageGenDecoder (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_5_228hp28hplusyjxc1.R.inc(104318);try{__CLR4_5_228hp28hplusyjxc1.R.inc(104317);
        __CLR4_5_228hp28hplusyjxc1.R.inc(104319);size_gen_deser__ = config.getDeserializer(data.media.Image.Size.class);
    }finally{__CLR4_5_228hp28hplusyjxc1.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_228hp28hplusyjxc1.R.inc(104320);
        __CLR4_5_228hp28hplusyjxc1.R.inc(104321);return new Image();
        
    }finally{__CLR4_5_228hp28hplusyjxc1.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_228hp28hplusyjxc1.R.inc(104322);
        __CLR4_5_228hp28hplusyjxc1.R.inc(104323);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_5_228hp28hplusyjxc1.R.inc(104324);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104325)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104326)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104327);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104328);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104329)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104330)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104331);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104332)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104333)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104334);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104335);ParseContext mark_context = parser.getContext();
        __CLR4_5_228hp28hplusyjxc1.R.inc(104336);int matchedCount = 0;
        __CLR4_5_228hp28hplusyjxc1.R.inc(104337);Image instance = new Image();
        
        __CLR4_5_228hp28hplusyjxc1.R.inc(104338);ParseContext context = parser.getContext();
        __CLR4_5_228hp28hplusyjxc1.R.inc(104339);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_5_228hp28hplusyjxc1.R.inc(104340);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104341)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104342)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104343);return instance;
        }
        
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104344);int matchStat = 0;
        __CLR4_5_228hp28hplusyjxc1.R.inc(104345);int _asm_flag_0 = 0;
        __CLR4_5_228hp28hplusyjxc1.R.inc(104346);int height_gen = 0;
        __CLR4_5_228hp28hplusyjxc1.R.inc(104347);data.media.Image.Size size_gen = null;
        __CLR4_5_228hp28hplusyjxc1.R.inc(104348);String title_gen;
        __CLR4_5_228hp28hplusyjxc1.R.inc(104349);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104350)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104351)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104352);title_gen = lexer.stringDefaultValue();
            __CLR4_5_228hp28hplusyjxc1.R.inc(104353);_asm_flag_0 |= 4;
        } }else {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104354);title_gen = null;
        }
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104355);String uri_gen;
        __CLR4_5_228hp28hplusyjxc1.R.inc(104356);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104357)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104358)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104359);uri_gen = lexer.stringDefaultValue();
            __CLR4_5_228hp28hplusyjxc1.R.inc(104360);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104361);uri_gen = null;
        }
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104362);int width_gen = 0;
        __CLR4_5_228hp28hplusyjxc1.R.inc(104363);boolean endFlag = false, restFlag = false;
        
        __CLR4_5_228hp28hplusyjxc1.R.inc(104364);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104365)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104366)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104367);height_gen = lexer.scanFieldInt(height_gen_prefix__);
            __CLR4_5_228hp28hplusyjxc1.R.inc(104368);if((((lexer.matchStat > 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104369)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104370)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104371);_asm_flag_0 |= 1;
                __CLR4_5_228hp28hplusyjxc1.R.inc(104372);matchedCount++;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104373);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104374)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104375)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104376);restFlag = true;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104377);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104378)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104379)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104380);endFlag = true;
            }
            
        }}
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104381);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104382)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104383)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104384);size_gen = (data.media.Image.Size) this.scanEnum(lexer, size_gen_prefix__, size_gen_deser__);
            __CLR4_5_228hp28hplusyjxc1.R.inc(104385);if((((lexer.matchStat > 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104386)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104387)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104388);_asm_flag_0 |= 2;
                __CLR4_5_228hp28hplusyjxc1.R.inc(104389);matchedCount++;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104390);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104391)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104392)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104393);restFlag = true;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104394);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104395)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104396)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104397);endFlag = true;
            }
            
        }}
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104398);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104399)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104400)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104401);title_gen = lexer.scanFieldString(title_gen_prefix__);
            __CLR4_5_228hp28hplusyjxc1.R.inc(104402);if((((lexer.matchStat > 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104403)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104404)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104405);_asm_flag_0 |= 4;
                __CLR4_5_228hp28hplusyjxc1.R.inc(104406);matchedCount++;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104407);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104408)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104409)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104410);restFlag = true;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104411);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104412)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104413)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104414);endFlag = true;
            }
            
        }}
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104415);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104416)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104417)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104418);uri_gen = lexer.scanFieldString(uri_gen_prefix__);
            __CLR4_5_228hp28hplusyjxc1.R.inc(104419);if((((lexer.matchStat > 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104420)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104421)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104422);_asm_flag_0 |= 8;
                __CLR4_5_228hp28hplusyjxc1.R.inc(104423);matchedCount++;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104424);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104425)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104426)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104427);restFlag = true;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104428);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104429)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104430)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104431);endFlag = true;
            }
            
        }}
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104432);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104433)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104434)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104435);width_gen = lexer.scanFieldInt(width_gen_prefix__);
            __CLR4_5_228hp28hplusyjxc1.R.inc(104436);if((((lexer.matchStat > 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104437)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104438)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104439);_asm_flag_0 |= 16;
                __CLR4_5_228hp28hplusyjxc1.R.inc(104440);matchedCount++;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104441);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104442)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104443)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104444);restFlag = true;
            }
            }__CLR4_5_228hp28hplusyjxc1.R.inc(104445);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104446)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104447)==0&false))) {{
                __CLR4_5_228hp28hplusyjxc1.R.inc(104448);restFlag = true;
            }
            
        }}
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104449);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104450)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104451)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104452);instance.setHeight(height_gen);
            
        }
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104453);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104454)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104455)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104456);instance.setSize(size_gen);
            
        }
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104457);if (((((_asm_flag_0 & 4) != 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104458)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104459)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104460);instance.setTitle(title_gen);
            
        }
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104461);if (((((_asm_flag_0 & 8) != 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104462)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104463)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104464);instance.setUri(uri_gen);
            
        }
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104465);if (((((_asm_flag_0 & 16) != 0)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104466)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104467)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104468);instance.setWidth(width_gen);
            
        }
        
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104469);if ((((restFlag)&&(__CLR4_5_228hp28hplusyjxc1.R.iget(104470)!=0|true))||(__CLR4_5_228hp28hplusyjxc1.R.iget(104471)==0&false))) {{
            __CLR4_5_228hp28hplusyjxc1.R.inc(104472);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_5_228hp28hplusyjxc1.R.inc(104473);return instance;
        
    }finally{__CLR4_5_228hp28hplusyjxc1.R.flushNeeded();}}
}

