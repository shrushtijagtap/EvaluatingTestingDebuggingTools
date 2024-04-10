/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.codegen;

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

public class DepartmentCodec extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_1_1025av25avluszwiej{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,100381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(config, clazz);__CLR4_1_1025av25avluszwiej.R.inc(100184);try{__CLR4_1_1025av25avluszwiej.R.inc(100183);
        __CLR4_1_1025av25avluszwiej.R.inc(100185);type_gen_deser__ = config.getDeserializer(com.alibaba.json.test.codegen.DepartmentType.class);
    }finally{__CLR4_1_1025av25avluszwiej.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_1_1025av25avluszwiej.R.inc(100186);
        __CLR4_1_1025av25avluszwiej.R.inc(100187);return new Department();
        
    }finally{__CLR4_1_1025av25avluszwiej.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1025av25avluszwiej.R.inc(100188);
        __CLR4_1_1025av25avluszwiej.R.inc(100189);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_1_1025av25avluszwiej.R.inc(100190);if ((((lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_1_1025av25avluszwiej.R.iget(100191)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100192)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100193);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1025av25avluszwiej.R.inc(100194);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_1_1025av25avluszwiej.R.iget(100195)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100196)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_1_1025av25avluszwiej.R.inc(100197);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1025av25avluszwiej.R.iget(100198)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100199)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100200);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1025av25avluszwiej.R.inc(100201);ParseContext mark_context = parser.getContext();
        __CLR4_1_1025av25avluszwiej.R.inc(100202);int matchedCount = 0;
        __CLR4_1_1025av25avluszwiej.R.inc(100203);Department instance = new Department();
        
        __CLR4_1_1025av25avluszwiej.R.inc(100204);ParseContext context = parser.getContext();
        __CLR4_1_1025av25avluszwiej.R.inc(100205);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_1_1025av25avluszwiej.R.inc(100206);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1025av25avluszwiej.R.iget(100207)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100208)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100209);return instance;
        }
        
        }__CLR4_1_1025av25avluszwiej.R.inc(100210);int matchStat = 0;
        __CLR4_1_1025av25avluszwiej.R.inc(100211);int _asm_flag_0 = 0;
        __CLR4_1_1025av25avluszwiej.R.inc(100212);int id_gen = 0;
        __CLR4_1_1025av25avluszwiej.R.inc(100213);com.alibaba.json.test.codegen.Employee leader_gen = null;
        __CLR4_1_1025av25avluszwiej.R.inc(100214);java.util.List members_gen = null;
        __CLR4_1_1025av25avluszwiej.R.inc(100215);String name_gen;
        __CLR4_1_1025av25avluszwiej.R.inc(100216);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1025av25avluszwiej.R.iget(100217)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100218)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100219);name_gen = lexer.stringDefaultValue();
            __CLR4_1_1025av25avluszwiej.R.inc(100220);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_1_1025av25avluszwiej.R.inc(100221);name_gen = null;
        }
        }__CLR4_1_1025av25avluszwiej.R.inc(100222);boolean root_gen = false;
        __CLR4_1_1025av25avluszwiej.R.inc(100223);com.alibaba.json.test.codegen.DepartmentType type_gen = null;
        __CLR4_1_1025av25avluszwiej.R.inc(100224);boolean endFlag = false, restFlag = false;
        
        __CLR4_1_1025av25avluszwiej.R.inc(100225);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1025av25avluszwiej.R.iget(100226)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100227)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100228);id_gen = lexer.scanFieldInt(id_gen_prefix__);
            __CLR4_1_1025av25avluszwiej.R.inc(100229);if((((lexer.matchStat > 0)&&(__CLR4_1_1025av25avluszwiej.R.iget(100230)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100231)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100232);_asm_flag_0 |= 1;
                __CLR4_1_1025av25avluszwiej.R.inc(100233);matchedCount++;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100234);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1025av25avluszwiej.R.iget(100235)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100236)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100237);restFlag = true;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100238);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1025av25avluszwiej.R.iget(100239)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100240)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100241);endFlag = true;
            }
            
        }}
        }__CLR4_1_1025av25avluszwiej.R.inc(100242);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1025av25avluszwiej.R.iget(100243)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100244)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100245);if ((((lexer.matchField(leader_gen_prefix__))&&(__CLR4_1_1025av25avluszwiej.R.iget(100246)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100247)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100248);_asm_flag_0 |= 2;
                __CLR4_1_1025av25avluszwiej.R.inc(100249);matchedCount++;
                __CLR4_1_1025av25avluszwiej.R.inc(100250);if((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_1_1025av25avluszwiej.R.iget(100251)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100252)==0&false))) {{
                    __CLR4_1_1025av25avluszwiej.R.inc(100253);ResolveTask resolveTask = parser.getLastResolveTask();
                    __CLR4_1_1025av25avluszwiej.R.inc(100254);resolveTask.ownerContext = parser.getContext();
                    __CLR4_1_1025av25avluszwiej.R.inc(100255);resolveTask.fieldDeserializer = this.getFieldDeserializer("leader");
                    __CLR4_1_1025av25avluszwiej.R.inc(100256);parser.setResolveStatus(DefaultJSONParser.NONE);
                }
            }}
            }__CLR4_1_1025av25avluszwiej.R.inc(100257);if((((lexer.matchStat > 0)&&(__CLR4_1_1025av25avluszwiej.R.iget(100258)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100259)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100260);_asm_flag_0 |= 2;
                __CLR4_1_1025av25avluszwiej.R.inc(100261);matchedCount++;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100262);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1025av25avluszwiej.R.iget(100263)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100264)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100265);restFlag = true;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100266);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1025av25avluszwiej.R.iget(100267)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100268)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100269);endFlag = true;
            }
            
        }}
        }__CLR4_1_1025av25avluszwiej.R.inc(100270);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1025av25avluszwiej.R.iget(100271)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100272)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100273);if ((((lexer.matchField(members_gen_prefix__))&&(__CLR4_1_1025av25avluszwiej.R.iget(100274)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100275)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100276);_asm_flag_0 |= 4;
                __CLR4_1_1025av25avluszwiej.R.inc(100277);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_1025av25avluszwiej.R.iget(100278)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100279)==0&false))) {{
                    __CLR4_1_1025av25avluszwiej.R.inc(100280);lexer.nextToken(JSONToken.COMMA);
                } }else {{
                    __CLR4_1_1025av25avluszwiej.R.inc(100281);if ((((lexer.token() == JSONToken.LBRACKET)&&(__CLR4_1_1025av25avluszwiej.R.iget(100282)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100283)==0&false))) {{
                        __CLR4_1_1025av25avluszwiej.R.inc(100284);if((((members_gen_list_item_deser__ == null)&&(__CLR4_1_1025av25avluszwiej.R.iget(100285)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100286)==0&false))) {{
                            __CLR4_1_1025av25avluszwiej.R.inc(100287);members_gen_list_item_deser__ = parser.getConfig().getDeserializer(com.alibaba.json.test.codegen.Employee.class);
                        }
                        }__CLR4_1_1025av25avluszwiej.R.inc(100288);final int fastMatchToken = members_gen_list_item_deser__.getFastMatchToken();
                        __CLR4_1_1025av25avluszwiej.R.inc(100289);lexer.nextToken(fastMatchToken);
                        __CLR4_1_1025av25avluszwiej.R.inc(100290);members_gen = new java.util.ArrayList();
                        __CLR4_1_1025av25avluszwiej.R.inc(100291);ParseContext listContext = parser.getContext();
                        __CLR4_1_1025av25avluszwiej.R.inc(100292);parser.setContext(members_gen, "members");
            
                        __CLR4_1_1025av25avluszwiej.R.inc(100293);for(int i = 0; ;++i) {{
                            __CLR4_1_1025av25avluszwiej.R.inc(100294);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_1_1025av25avluszwiej.R.iget(100295)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100296)==0&false))) {{
                                __CLR4_1_1025av25avluszwiej.R.inc(100297);break;
                            }
                            }__CLR4_1_1025av25avluszwiej.R.inc(100298);com.alibaba.json.test.codegen.Employee itemValue = members_gen_list_item_deser__.deserialze(parser, members_gen_list_item_type__, i);
                            __CLR4_1_1025av25avluszwiej.R.inc(100299);members_gen.add(itemValue);
                            __CLR4_1_1025av25avluszwiej.R.inc(100300);parser.checkListResolve(members_gen);
                            __CLR4_1_1025av25avluszwiej.R.inc(100301);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_1025av25avluszwiej.R.iget(100302)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100303)==0&false))) {{
                                __CLR4_1_1025av25avluszwiej.R.inc(100304);lexer.nextToken(fastMatchToken);
                            }
                        }}
                        }__CLR4_1_1025av25avluszwiej.R.inc(100305);parser.setContext(listContext);
                        __CLR4_1_1025av25avluszwiej.R.inc(100306);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_1_1025av25avluszwiej.R.iget(100307)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100308)==0&false))) {{
                            __CLR4_1_1025av25avluszwiej.R.inc(100309);restFlag = true;
                        }
                        }__CLR4_1_1025av25avluszwiej.R.inc(100310);lexer.nextToken(JSONToken.COMMA);
            
                    } }else {{
                        __CLR4_1_1025av25avluszwiej.R.inc(100311);restFlag = true;
                    }
                }}
            }}
            }__CLR4_1_1025av25avluszwiej.R.inc(100312);if((((lexer.matchStat > 0)&&(__CLR4_1_1025av25avluszwiej.R.iget(100313)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100314)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100315);_asm_flag_0 |= 4;
                __CLR4_1_1025av25avluszwiej.R.inc(100316);matchedCount++;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100317);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1025av25avluszwiej.R.iget(100318)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100319)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100320);restFlag = true;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100321);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1025av25avluszwiej.R.iget(100322)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100323)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100324);endFlag = true;
            }
            
        }}
        }__CLR4_1_1025av25avluszwiej.R.inc(100325);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1025av25avluszwiej.R.iget(100326)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100327)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100328);name_gen = lexer.scanFieldString(name_gen_prefix__);
            __CLR4_1_1025av25avluszwiej.R.inc(100329);if((((lexer.matchStat > 0)&&(__CLR4_1_1025av25avluszwiej.R.iget(100330)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100331)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100332);_asm_flag_0 |= 8;
                __CLR4_1_1025av25avluszwiej.R.inc(100333);matchedCount++;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100334);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1025av25avluszwiej.R.iget(100335)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100336)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100337);restFlag = true;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100338);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1025av25avluszwiej.R.iget(100339)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100340)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100341);endFlag = true;
            }
            
        }}
        }__CLR4_1_1025av25avluszwiej.R.inc(100342);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1025av25avluszwiej.R.iget(100343)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100344)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100345);root_gen = lexer.scanFieldBoolean(root_gen_prefix__);
            __CLR4_1_1025av25avluszwiej.R.inc(100346);if((((lexer.matchStat > 0)&&(__CLR4_1_1025av25avluszwiej.R.iget(100347)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100348)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100349);_asm_flag_0 |= 16;
                __CLR4_1_1025av25avluszwiej.R.inc(100350);matchedCount++;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100351);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1025av25avluszwiej.R.iget(100352)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100353)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100354);restFlag = true;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100355);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1025av25avluszwiej.R.iget(100356)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100357)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100358);endFlag = true;
            }
            
        }}
        }__CLR4_1_1025av25avluszwiej.R.inc(100359);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1025av25avluszwiej.R.iget(100360)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100361)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100362);type_gen = (com.alibaba.json.test.codegen.DepartmentType) this.scanEnum(lexer, type_gen_prefix__, type_gen_deser__);
            __CLR4_1_1025av25avluszwiej.R.inc(100363);if((((lexer.matchStat > 0)&&(__CLR4_1_1025av25avluszwiej.R.iget(100364)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100365)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100366);_asm_flag_0 |= 32;
                __CLR4_1_1025av25avluszwiej.R.inc(100367);matchedCount++;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100368);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1025av25avluszwiej.R.iget(100369)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100370)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100371);restFlag = true;
            }
            }__CLR4_1_1025av25avluszwiej.R.inc(100372);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_1_1025av25avluszwiej.R.iget(100373)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100374)==0&false))) {{
                __CLR4_1_1025av25avluszwiej.R.inc(100375);restFlag = true;
            }
            
        }}
        
        }__CLR4_1_1025av25avluszwiej.R.inc(100376);if ((((restFlag)&&(__CLR4_1_1025av25avluszwiej.R.iget(100377)!=0|true))||(__CLR4_1_1025av25avluszwiej.R.iget(100378)==0&false))) {{
            __CLR4_1_1025av25avluszwiej.R.inc(100379);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_1_1025av25avluszwiej.R.inc(100380);return instance;
        
    }finally{__CLR4_1_1025av25avluszwiej.R.flushNeeded();}}
}

