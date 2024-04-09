/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import java.lang.reflect.Type;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class ImageGenDecoder extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_229fx29fxlusvnlvv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,105706,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] size_gen_prefix__ = "\"size\":".toCharArray();
    private char[] uri_gen_prefix__ = "\"uri\":".toCharArray();
    private char[] title_gen_prefix__ = "\"title\":".toCharArray();
    private char[] width_gen_prefix__ = "\"width\":".toCharArray();
    private char[] height_gen_prefix__ = "\"height\":".toCharArray();
    
    private ObjectDeserializer uri_gen_deser__;
    private ObjectDeserializer title_gen_deser__;
    private ObjectDeserializer size_gen_deser__;
    
    public ImageGenDecoder (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_5_229fx29fxlusvnlvv.R.inc(105550);try{__CLR4_5_229fx29fxlusvnlvv.R.inc(105549);
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105551);size_gen_deser__ = config.getDeserializer(data.media.Image.Size.class);
    }finally{__CLR4_5_229fx29fxlusvnlvv.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_229fx29fxlusvnlvv.R.inc(105552);
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105553);return new Image();
        
    }finally{__CLR4_5_229fx29fxlusvnlvv.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_229fx29fxlusvnlvv.R.inc(105554);
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105555);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105556);if ((((!lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105557)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105558)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105559);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105560);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105561)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105562)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105563);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105564)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105565)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105566);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105567);ParseContext mark_context = parser.getContext();
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105568);int matchedCount = 0;
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105569);Image instance = new Image();
        
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105570);ParseContext context = parser.getContext();
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105571);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105572);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105573)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105574)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105575);return instance;
        }
        
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105576);int matchStat = 0;
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105577);int _asm_flag_0 = 0;
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105578);int height_gen = 0;
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105579);data.media.Image.Size size_gen = null;
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105580);String title_gen;
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105581);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105582)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105583)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105584);title_gen = lexer.stringDefaultValue();
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105585);_asm_flag_0 |= 4;
        } }else {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105586);title_gen = null;
        }
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105587);String uri_gen;
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105588);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105589)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105590)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105591);uri_gen = lexer.stringDefaultValue();
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105592);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105593);uri_gen = null;
        }
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105594);int width_gen = 0;
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105595);boolean endFlag = false, restFlag = false;
        
        __CLR4_5_229fx29fxlusvnlvv.R.inc(105596);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105597)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105598)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105599);height_gen = lexer.scanFieldInt(height_gen_prefix__);
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105600);if((((lexer.matchStat > 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105601)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105602)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105603);_asm_flag_0 |= 1;
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105604);matchedCount++;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105605);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105606)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105607)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105608);restFlag = true;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105609);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105610)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105611)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105612);endFlag = true;
            }
            
        }}
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105613);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105614)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105615)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105616);size_gen = (data.media.Image.Size) this.scanEnum(lexer, size_gen_prefix__, size_gen_deser__);
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105617);if((((lexer.matchStat > 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105618)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105619)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105620);_asm_flag_0 |= 2;
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105621);matchedCount++;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105622);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105623)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105624)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105625);restFlag = true;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105626);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105627)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105628)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105629);endFlag = true;
            }
            
        }}
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105630);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105631)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105632)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105633);title_gen = lexer.scanFieldString(title_gen_prefix__);
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105634);if((((lexer.matchStat > 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105635)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105636)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105637);_asm_flag_0 |= 4;
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105638);matchedCount++;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105639);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105640)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105641)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105642);restFlag = true;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105643);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105644)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105645)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105646);endFlag = true;
            }
            
        }}
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105647);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105648)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105649)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105650);uri_gen = lexer.scanFieldString(uri_gen_prefix__);
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105651);if((((lexer.matchStat > 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105652)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105653)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105654);_asm_flag_0 |= 8;
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105655);matchedCount++;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105656);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105657)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105658)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105659);restFlag = true;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105660);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105661)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105662)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105663);endFlag = true;
            }
            
        }}
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105664);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105665)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105666)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105667);width_gen = lexer.scanFieldInt(width_gen_prefix__);
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105668);if((((lexer.matchStat > 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105669)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105670)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105671);_asm_flag_0 |= 16;
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105672);matchedCount++;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105673);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105674)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105675)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105676);restFlag = true;
            }
            }__CLR4_5_229fx29fxlusvnlvv.R.inc(105677);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105678)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105679)==0&false))) {{
                __CLR4_5_229fx29fxlusvnlvv.R.inc(105680);restFlag = true;
            }
            
        }}
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105681);if (((((_asm_flag_0 & 1) != 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105682)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105683)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105684);instance.setHeight(height_gen);
            
        }
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105685);if (((((_asm_flag_0 & 2) != 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105686)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105687)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105688);instance.setSize(size_gen);
            
        }
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105689);if (((((_asm_flag_0 & 4) != 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105690)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105691)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105692);instance.setTitle(title_gen);
            
        }
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105693);if (((((_asm_flag_0 & 8) != 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105694)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105695)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105696);instance.setUri(uri_gen);
            
        }
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105697);if (((((_asm_flag_0 & 16) != 0)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105698)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105699)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105700);instance.setWidth(width_gen);
            
        }
        
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105701);if ((((restFlag)&&(__CLR4_5_229fx29fxlusvnlvv.R.iget(105702)!=0|true))||(__CLR4_5_229fx29fxlusvnlvv.R.iget(105703)==0&false))) {{
            __CLR4_5_229fx29fxlusvnlvv.R.inc(105704);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_5_229fx29fxlusvnlvv.R.inc(105705);return instance;
        
    }finally{__CLR4_5_229fx29fxlusvnlvv.R.flushNeeded();}}
}

