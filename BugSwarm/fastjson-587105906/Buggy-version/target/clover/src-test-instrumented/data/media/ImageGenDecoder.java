/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class ImageGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_1_1029g829g8luszwj16{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,105717,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] size_gen_prefix__ = "\"size\":".toCharArray();
    private char[] uri_gen_prefix__ = "\"uri\":".toCharArray();
    private char[] title_gen_prefix__ = "\"title\":".toCharArray();
    private char[] width_gen_prefix__ = "\"width\":".toCharArray();
    private char[] height_gen_prefix__ = "\"height\":".toCharArray();
    
    private ObjectDeserializer uri_gen_deser__;
    private ObjectDeserializer title_gen_deser__;
    private ObjectDeserializer size_gen_deser__;
    
    public ImageGenDecoder (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_1_1029g829g8luszwj16.R.inc(105561);try{__CLR4_1_1029g829g8luszwj16.R.inc(105560);
        __CLR4_1_1029g829g8luszwj16.R.inc(105562);size_gen_deser__ = config.getDeserializer(data.media.Image.Size.class);
    }finally{__CLR4_1_1029g829g8luszwj16.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_1_1029g829g8luszwj16.R.inc(105563);
        __CLR4_1_1029g829g8luszwj16.R.inc(105564);return new Image();
        
    }finally{__CLR4_1_1029g829g8luszwj16.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1029g829g8luszwj16.R.inc(105565);
        __CLR4_1_1029g829g8luszwj16.R.inc(105566);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_1_1029g829g8luszwj16.R.inc(105567);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105568)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105569)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105570);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1029g829g8luszwj16.R.inc(105571);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105572)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105573)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_1_1029g829g8luszwj16.R.inc(105574);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105575)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105576)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105577);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1029g829g8luszwj16.R.inc(105578);ParseContext mark_context = parser.getContext();
        __CLR4_1_1029g829g8luszwj16.R.inc(105579);int matchedCount = 0;
        __CLR4_1_1029g829g8luszwj16.R.inc(105580);Image instance = new Image();
        
        __CLR4_1_1029g829g8luszwj16.R.inc(105581);ParseContext context = parser.getContext();
        __CLR4_1_1029g829g8luszwj16.R.inc(105582);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_1_1029g829g8luszwj16.R.inc(105583);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105584)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105585)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105586);return instance;
        }
        
        }__CLR4_1_1029g829g8luszwj16.R.inc(105587);int matchStat = 0;
        __CLR4_1_1029g829g8luszwj16.R.inc(105588);int _asm_flag_0 = 0;
        __CLR4_1_1029g829g8luszwj16.R.inc(105589);int height_gen = 0;
        __CLR4_1_1029g829g8luszwj16.R.inc(105590);data.media.Image.Size size_gen = null;
        __CLR4_1_1029g829g8luszwj16.R.inc(105591);String title_gen;
        __CLR4_1_1029g829g8luszwj16.R.inc(105592);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105593)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105594)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105595);title_gen = lexer.stringDefaultValue();
            __CLR4_1_1029g829g8luszwj16.R.inc(105596);_asm_flag_0 |= 4;
        } }else {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105597);title_gen = null;
        }
        }__CLR4_1_1029g829g8luszwj16.R.inc(105598);String uri_gen;
        __CLR4_1_1029g829g8luszwj16.R.inc(105599);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105600)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105601)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105602);uri_gen = lexer.stringDefaultValue();
            __CLR4_1_1029g829g8luszwj16.R.inc(105603);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105604);uri_gen = null;
        }
        }__CLR4_1_1029g829g8luszwj16.R.inc(105605);int width_gen = 0;
        __CLR4_1_1029g829g8luszwj16.R.inc(105606);boolean endFlag = false, restFlag = false;
        
        __CLR4_1_1029g829g8luszwj16.R.inc(105607);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105608)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105609)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105610);height_gen = lexer.scanFieldInt(height_gen_prefix__);
            __CLR4_1_1029g829g8luszwj16.R.inc(105611);if((((lexer.matchStat > 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105612)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105613)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105614);_asm_flag_0 |= 1;
                __CLR4_1_1029g829g8luszwj16.R.inc(105615);matchedCount++;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105616);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105617)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105618)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105619);restFlag = true;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105620);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105621)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105622)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105623);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029g829g8luszwj16.R.inc(105624);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105625)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105626)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105627);size_gen = (data.media.Image.Size) this.scanEnum(lexer, size_gen_prefix__, size_gen_deser__);
            __CLR4_1_1029g829g8luszwj16.R.inc(105628);if((((lexer.matchStat > 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105629)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105630)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105631);_asm_flag_0 |= 2;
                __CLR4_1_1029g829g8luszwj16.R.inc(105632);matchedCount++;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105633);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105634)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105635)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105636);restFlag = true;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105637);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105638)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105639)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105640);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029g829g8luszwj16.R.inc(105641);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105642)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105643)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105644);title_gen = lexer.scanFieldString(title_gen_prefix__);
            __CLR4_1_1029g829g8luszwj16.R.inc(105645);if((((lexer.matchStat > 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105646)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105647)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105648);_asm_flag_0 |= 4;
                __CLR4_1_1029g829g8luszwj16.R.inc(105649);matchedCount++;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105650);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105651)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105652)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105653);restFlag = true;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105654);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105655)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105656)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105657);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029g829g8luszwj16.R.inc(105658);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105659)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105660)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105661);uri_gen = lexer.scanFieldString(uri_gen_prefix__);
            __CLR4_1_1029g829g8luszwj16.R.inc(105662);if((((lexer.matchStat > 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105663)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105664)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105665);_asm_flag_0 |= 8;
                __CLR4_1_1029g829g8luszwj16.R.inc(105666);matchedCount++;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105667);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105668)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105669)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105670);restFlag = true;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105671);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105672)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105673)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105674);endFlag = true;
            }
            
        }}
        }__CLR4_1_1029g829g8luszwj16.R.inc(105675);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1029g829g8luszwj16.R.iget(105676)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105677)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105678);width_gen = lexer.scanFieldInt(width_gen_prefix__);
            __CLR4_1_1029g829g8luszwj16.R.inc(105679);if((((lexer.matchStat > 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105680)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105681)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105682);_asm_flag_0 |= 16;
                __CLR4_1_1029g829g8luszwj16.R.inc(105683);matchedCount++;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105684);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105685)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105686)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105687);restFlag = true;
            }
            }__CLR4_1_1029g829g8luszwj16.R.inc(105688);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105689)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105690)==0&false))) {{
                __CLR4_1_1029g829g8luszwj16.R.inc(105691);restFlag = true;
            }
            
        }}
        }__CLR4_1_1029g829g8luszwj16.R.inc(105692);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105693)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105694)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105695);instance.setHeight(height_gen);
            
        }
        }__CLR4_1_1029g829g8luszwj16.R.inc(105696);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105697)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105698)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105699);instance.setSize(size_gen);
            
        }
        }__CLR4_1_1029g829g8luszwj16.R.inc(105700);if (((((_asm_flag_0 & 4) != 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105701)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105702)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105703);instance.setTitle(title_gen);
            
        }
        }__CLR4_1_1029g829g8luszwj16.R.inc(105704);if (((((_asm_flag_0 & 8) != 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105705)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105706)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105707);instance.setUri(uri_gen);
            
        }
        }__CLR4_1_1029g829g8luszwj16.R.inc(105708);if (((((_asm_flag_0 & 16) != 0)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105709)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105710)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105711);instance.setWidth(width_gen);
            
        }
        
        }__CLR4_1_1029g829g8luszwj16.R.inc(105712);if ((((restFlag)&&(__CLR4_1_1029g829g8luszwj16.R.iget(105713)!=0|true))||(__CLR4_1_1029g829g8luszwj16.R.iget(105714)==0&false))) {{
            __CLR4_1_1029g829g8luszwj16.R.inc(105715);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_1_1029g829g8luszwj16.R.inc(105716);return instance;
        
    }finally{__CLR4_1_1029g829g8luszwj16.R.flushNeeded();}}
}

