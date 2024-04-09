/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.codegen;

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

public class DepartmentCodec extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_225ak25aklusvnkye{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,100370,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private char[] name_gen_prefix__ = "\"name\":".toCharArray();
    private char[] root_gen_prefix__ = "\"root\":".toCharArray();
    private char[] type_gen_prefix__ = "\"type\":".toCharArray();
    private char[] id_gen_prefix__ = "\"id\":".toCharArray();
    private char[] leader_gen_prefix__ = "\"leader\":".toCharArray();
    private char[] members_gen_prefix__ = "\"members\":".toCharArray();
    
    private ObjectDeserializer name_gen_deser__;
    private ObjectDeserializer leader_gen_deser__;
    private ObjectDeserializer members_gen_list_item_deser__;
    private Type members_gen_list_item_type__ = com.alibaba.json.test.codegen.Employee.class;
    private ObjectDeserializer type_gen_deser__;
    
    public DepartmentCodec (ParserConfig config, Class clazz) {
        super(config, clazz);__CLR4_5_225ak25aklusvnkye.R.inc(100173);try{__CLR4_5_225ak25aklusvnkye.R.inc(100172);
        __CLR4_5_225ak25aklusvnkye.R.inc(100174);type_gen_deser__ = config.getDeserializer(com.alibaba.json.test.codegen.DepartmentType.class);
    }finally{__CLR4_5_225ak25aklusvnkye.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_225ak25aklusvnkye.R.inc(100175);
        __CLR4_5_225ak25aklusvnkye.R.inc(100176);return new Department();
        
    }finally{__CLR4_5_225ak25aklusvnkye.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_225ak25aklusvnkye.R.inc(100177);
        __CLR4_5_225ak25aklusvnkye.R.inc(100178);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_5_225ak25aklusvnkye.R.inc(100179);if ((((lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100180)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100181)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100182);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_225ak25aklusvnkye.R.inc(100183);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100184)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100185)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_5_225ak25aklusvnkye.R.inc(100186);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100187)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100188)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100189);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_225ak25aklusvnkye.R.inc(100190);ParseContext mark_context = parser.getContext();
        __CLR4_5_225ak25aklusvnkye.R.inc(100191);int matchedCount = 0;
        __CLR4_5_225ak25aklusvnkye.R.inc(100192);Department instance = new Department();
        
        __CLR4_5_225ak25aklusvnkye.R.inc(100193);ParseContext context = parser.getContext();
        __CLR4_5_225ak25aklusvnkye.R.inc(100194);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_5_225ak25aklusvnkye.R.inc(100195);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100196)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100197)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100198);return instance;
        }
        
        }__CLR4_5_225ak25aklusvnkye.R.inc(100199);int matchStat = 0;
        __CLR4_5_225ak25aklusvnkye.R.inc(100200);int _asm_flag_0 = 0;
        __CLR4_5_225ak25aklusvnkye.R.inc(100201);int id_gen = 0;
        __CLR4_5_225ak25aklusvnkye.R.inc(100202);com.alibaba.json.test.codegen.Employee leader_gen = null;
        __CLR4_5_225ak25aklusvnkye.R.inc(100203);java.util.List members_gen = null;
        __CLR4_5_225ak25aklusvnkye.R.inc(100204);String name_gen;
        __CLR4_5_225ak25aklusvnkye.R.inc(100205);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100206)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100207)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100208);name_gen = lexer.stringDefaultValue();
            __CLR4_5_225ak25aklusvnkye.R.inc(100209);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100210);name_gen = null;
        }
        }__CLR4_5_225ak25aklusvnkye.R.inc(100211);boolean root_gen = false;
        __CLR4_5_225ak25aklusvnkye.R.inc(100212);com.alibaba.json.test.codegen.DepartmentType type_gen = null;
        __CLR4_5_225ak25aklusvnkye.R.inc(100213);boolean endFlag = false, restFlag = false;
        
        __CLR4_5_225ak25aklusvnkye.R.inc(100214);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100215)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100216)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100217);id_gen = lexer.scanFieldInt(id_gen_prefix__);
            __CLR4_5_225ak25aklusvnkye.R.inc(100218);if((((lexer.matchStat > 0)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100219)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100220)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100221);_asm_flag_0 |= 1;
                __CLR4_5_225ak25aklusvnkye.R.inc(100222);matchedCount++;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100223);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100224)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100225)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100226);restFlag = true;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100227);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100228)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100229)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100230);endFlag = true;
            }
            
        }}
        }__CLR4_5_225ak25aklusvnkye.R.inc(100231);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100232)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100233)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100234);if ((((lexer.matchField(leader_gen_prefix__))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100235)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100236)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100237);_asm_flag_0 |= 2;
                __CLR4_5_225ak25aklusvnkye.R.inc(100238);matchedCount++;
                __CLR4_5_225ak25aklusvnkye.R.inc(100239);if((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100240)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100241)==0&false))) {{
                    __CLR4_5_225ak25aklusvnkye.R.inc(100242);ResolveTask resolveTask = parser.getLastResolveTask();
                    __CLR4_5_225ak25aklusvnkye.R.inc(100243);resolveTask.ownerContext = parser.getContext();
                    __CLR4_5_225ak25aklusvnkye.R.inc(100244);resolveTask.fieldDeserializer = this.getFieldDeserializer("leader");
                    __CLR4_5_225ak25aklusvnkye.R.inc(100245);parser.setResolveStatus(DefaultJSONParser.NONE);
                }
            }}
            }__CLR4_5_225ak25aklusvnkye.R.inc(100246);if((((lexer.matchStat > 0)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100247)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100248)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100249);_asm_flag_0 |= 2;
                __CLR4_5_225ak25aklusvnkye.R.inc(100250);matchedCount++;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100251);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100252)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100253)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100254);restFlag = true;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100255);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100256)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100257)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100258);endFlag = true;
            }
            
        }}
        }__CLR4_5_225ak25aklusvnkye.R.inc(100259);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100260)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100261)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100262);if ((((lexer.matchField(members_gen_prefix__))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100263)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100264)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100265);_asm_flag_0 |= 4;
                __CLR4_5_225ak25aklusvnkye.R.inc(100266);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100267)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100268)==0&false))) {{
                    __CLR4_5_225ak25aklusvnkye.R.inc(100269);lexer.nextToken(JSONToken.COMMA);
                } }else {{
                    __CLR4_5_225ak25aklusvnkye.R.inc(100270);if ((((lexer.token() == JSONToken.LBRACKET)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100271)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100272)==0&false))) {{
                        __CLR4_5_225ak25aklusvnkye.R.inc(100273);if((((members_gen_list_item_deser__ == null)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100274)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100275)==0&false))) {{
                            __CLR4_5_225ak25aklusvnkye.R.inc(100276);members_gen_list_item_deser__ = parser.getConfig().getDeserializer(com.alibaba.json.test.codegen.Employee.class);
                        }
                        }__CLR4_5_225ak25aklusvnkye.R.inc(100277);final int fastMatchToken = members_gen_list_item_deser__.getFastMatchToken();
                        __CLR4_5_225ak25aklusvnkye.R.inc(100278);lexer.nextToken(fastMatchToken);
                        __CLR4_5_225ak25aklusvnkye.R.inc(100279);members_gen = new java.util.ArrayList();
                        __CLR4_5_225ak25aklusvnkye.R.inc(100280);ParseContext listContext = parser.getContext();
                        __CLR4_5_225ak25aklusvnkye.R.inc(100281);parser.setContext(members_gen, "members");
            
                        __CLR4_5_225ak25aklusvnkye.R.inc(100282);for(int i = 0; ;++i) {{
                            __CLR4_5_225ak25aklusvnkye.R.inc(100283);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100284)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100285)==0&false))) {{
                                __CLR4_5_225ak25aklusvnkye.R.inc(100286);break;
                            }
                            }__CLR4_5_225ak25aklusvnkye.R.inc(100287);com.alibaba.json.test.codegen.Employee itemValue = members_gen_list_item_deser__.deserialze(parser, members_gen_list_item_type__, i);
                            __CLR4_5_225ak25aklusvnkye.R.inc(100288);members_gen.add(itemValue);
                            __CLR4_5_225ak25aklusvnkye.R.inc(100289);parser.checkListResolve(members_gen);
                            __CLR4_5_225ak25aklusvnkye.R.inc(100290);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100291)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100292)==0&false))) {{
                                __CLR4_5_225ak25aklusvnkye.R.inc(100293);lexer.nextToken(fastMatchToken);
                            }
                        }}
                        }__CLR4_5_225ak25aklusvnkye.R.inc(100294);parser.setContext(listContext);
                        __CLR4_5_225ak25aklusvnkye.R.inc(100295);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100296)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100297)==0&false))) {{
                            __CLR4_5_225ak25aklusvnkye.R.inc(100298);restFlag = true;
                        }
                        }__CLR4_5_225ak25aklusvnkye.R.inc(100299);lexer.nextToken(JSONToken.COMMA);
            
                    } }else {{
                        __CLR4_5_225ak25aklusvnkye.R.inc(100300);restFlag = true;
                    }
                }}
            }}
            }__CLR4_5_225ak25aklusvnkye.R.inc(100301);if((((lexer.matchStat > 0)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100302)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100303)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100304);_asm_flag_0 |= 4;
                __CLR4_5_225ak25aklusvnkye.R.inc(100305);matchedCount++;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100306);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100307)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100308)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100309);restFlag = true;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100310);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100311)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100312)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100313);endFlag = true;
            }
            
        }}
        }__CLR4_5_225ak25aklusvnkye.R.inc(100314);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100315)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100316)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100317);name_gen = lexer.scanFieldString(name_gen_prefix__);
            __CLR4_5_225ak25aklusvnkye.R.inc(100318);if((((lexer.matchStat > 0)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100319)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100320)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100321);_asm_flag_0 |= 8;
                __CLR4_5_225ak25aklusvnkye.R.inc(100322);matchedCount++;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100323);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100324)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100325)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100326);restFlag = true;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100327);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100328)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100329)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100330);endFlag = true;
            }
            
        }}
        }__CLR4_5_225ak25aklusvnkye.R.inc(100331);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100332)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100333)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100334);root_gen = lexer.scanFieldBoolean(root_gen_prefix__);
            __CLR4_5_225ak25aklusvnkye.R.inc(100335);if((((lexer.matchStat > 0)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100336)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100337)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100338);_asm_flag_0 |= 16;
                __CLR4_5_225ak25aklusvnkye.R.inc(100339);matchedCount++;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100340);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100341)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100342)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100343);restFlag = true;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100344);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100345)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100346)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100347);endFlag = true;
            }
            
        }}
        }__CLR4_5_225ak25aklusvnkye.R.inc(100348);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_225ak25aklusvnkye.R.iget(100349)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100350)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100351);type_gen = (com.alibaba.json.test.codegen.DepartmentType) this.scanEnum(lexer, type_gen_prefix__, type_gen_deser__);
            __CLR4_5_225ak25aklusvnkye.R.inc(100352);if((((lexer.matchStat > 0)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100353)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100354)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100355);_asm_flag_0 |= 32;
                __CLR4_5_225ak25aklusvnkye.R.inc(100356);matchedCount++;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100357);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100358)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100359)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100360);restFlag = true;
            }
            }__CLR4_5_225ak25aklusvnkye.R.inc(100361);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100362)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100363)==0&false))) {{
                __CLR4_5_225ak25aklusvnkye.R.inc(100364);restFlag = true;
            }
            
        }}
        
        }__CLR4_5_225ak25aklusvnkye.R.inc(100365);if ((((restFlag)&&(__CLR4_5_225ak25aklusvnkye.R.iget(100366)!=0|true))||(__CLR4_5_225ak25aklusvnkye.R.iget(100367)==0&false))) {{
            __CLR4_5_225ak25aklusvnkye.R.inc(100368);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_5_225ak25aklusvnkye.R.inc(100369);return instance;
        
    }finally{__CLR4_5_225ak25aklusvnkye.R.flushNeeded();}}
}

