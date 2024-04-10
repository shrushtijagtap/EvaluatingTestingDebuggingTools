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

public class DepartmentCodec extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_224cc24cclusyjwx6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,99138,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(config, clazz);__CLR4_5_224cc24cclusyjwx6.R.inc(98941);try{__CLR4_5_224cc24cclusyjwx6.R.inc(98940);
        __CLR4_5_224cc24cclusyjwx6.R.inc(98942);type_gen_deser__ = config.getDeserializer(com.alibaba.json.test.codegen.DepartmentType.class);
    }finally{__CLR4_5_224cc24cclusyjwx6.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_224cc24cclusyjwx6.R.inc(98943);
        __CLR4_5_224cc24cclusyjwx6.R.inc(98944);return new Department();
        
    }finally{__CLR4_5_224cc24cclusyjwx6.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_224cc24cclusyjwx6.R.inc(98945);
        __CLR4_5_224cc24cclusyjwx6.R.inc(98946);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_5_224cc24cclusyjwx6.R.inc(98947);if ((((lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98948)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98949)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(98950);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_224cc24cclusyjwx6.R.inc(98951);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98952)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98953)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_5_224cc24cclusyjwx6.R.inc(98954);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98955)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98956)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(98957);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_5_224cc24cclusyjwx6.R.inc(98958);ParseContext mark_context = parser.getContext();
        __CLR4_5_224cc24cclusyjwx6.R.inc(98959);int matchedCount = 0;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98960);Department instance = new Department();
        
        __CLR4_5_224cc24cclusyjwx6.R.inc(98961);ParseContext context = parser.getContext();
        __CLR4_5_224cc24cclusyjwx6.R.inc(98962);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_5_224cc24cclusyjwx6.R.inc(98963);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98964)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98965)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(98966);return instance;
        }
        
        }__CLR4_5_224cc24cclusyjwx6.R.inc(98967);int matchStat = 0;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98968);int _asm_flag_0 = 0;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98969);int id_gen = 0;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98970);com.alibaba.json.test.codegen.Employee leader_gen = null;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98971);java.util.List members_gen = null;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98972);String name_gen;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98973);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98974)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98975)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(98976);name_gen = lexer.stringDefaultValue();
            __CLR4_5_224cc24cclusyjwx6.R.inc(98977);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(98978);name_gen = null;
        }
        }__CLR4_5_224cc24cclusyjwx6.R.inc(98979);boolean root_gen = false;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98980);com.alibaba.json.test.codegen.DepartmentType type_gen = null;
        __CLR4_5_224cc24cclusyjwx6.R.inc(98981);boolean endFlag = false, restFlag = false;
        
        __CLR4_5_224cc24cclusyjwx6.R.inc(98982);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98983)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98984)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(98985);id_gen = lexer.scanFieldInt(id_gen_prefix__);
            __CLR4_5_224cc24cclusyjwx6.R.inc(98986);if((((lexer.matchStat > 0)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98987)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98988)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(98989);_asm_flag_0 |= 1;
                __CLR4_5_224cc24cclusyjwx6.R.inc(98990);matchedCount++;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(98991);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98992)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98993)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(98994);restFlag = true;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(98995);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(98996)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(98997)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(98998);endFlag = true;
            }
            
        }}
        }__CLR4_5_224cc24cclusyjwx6.R.inc(98999);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99000)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99001)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(99002);if ((((lexer.matchField(leader_gen_prefix__))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99003)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99004)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99005);_asm_flag_0 |= 2;
                __CLR4_5_224cc24cclusyjwx6.R.inc(99006);matchedCount++;
                __CLR4_5_224cc24cclusyjwx6.R.inc(99007);if((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99008)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99009)==0&false))) {{
                    __CLR4_5_224cc24cclusyjwx6.R.inc(99010);ResolveTask resolveTask = parser.getLastResolveTask();
                    __CLR4_5_224cc24cclusyjwx6.R.inc(99011);resolveTask.ownerContext = parser.getContext();
                    __CLR4_5_224cc24cclusyjwx6.R.inc(99012);resolveTask.fieldDeserializer = this.getFieldDeserializer("leader");
                    __CLR4_5_224cc24cclusyjwx6.R.inc(99013);parser.setResolveStatus(DefaultJSONParser.NONE);
                }
            }}
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99014);if((((lexer.matchStat > 0)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99015)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99016)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99017);_asm_flag_0 |= 2;
                __CLR4_5_224cc24cclusyjwx6.R.inc(99018);matchedCount++;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99019);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99020)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99021)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99022);restFlag = true;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99023);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99024)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99025)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99026);endFlag = true;
            }
            
        }}
        }__CLR4_5_224cc24cclusyjwx6.R.inc(99027);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99028)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99029)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(99030);if ((((lexer.matchField(members_gen_prefix__))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99031)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99032)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99033);_asm_flag_0 |= 4;
                __CLR4_5_224cc24cclusyjwx6.R.inc(99034);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99035)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99036)==0&false))) {{
                    __CLR4_5_224cc24cclusyjwx6.R.inc(99037);lexer.nextToken(JSONToken.COMMA);
                } }else {{
                    __CLR4_5_224cc24cclusyjwx6.R.inc(99038);if ((((lexer.token() == JSONToken.LBRACKET)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99039)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99040)==0&false))) {{
                        __CLR4_5_224cc24cclusyjwx6.R.inc(99041);if((((members_gen_list_item_deser__ == null)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99042)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99043)==0&false))) {{
                            __CLR4_5_224cc24cclusyjwx6.R.inc(99044);members_gen_list_item_deser__ = parser.getConfig().getDeserializer(com.alibaba.json.test.codegen.Employee.class);
                        }
                        }__CLR4_5_224cc24cclusyjwx6.R.inc(99045);final int fastMatchToken = members_gen_list_item_deser__.getFastMatchToken();
                        __CLR4_5_224cc24cclusyjwx6.R.inc(99046);lexer.nextToken(fastMatchToken);
                        __CLR4_5_224cc24cclusyjwx6.R.inc(99047);members_gen = new java.util.ArrayList();
                        __CLR4_5_224cc24cclusyjwx6.R.inc(99048);ParseContext listContext = parser.getContext();
                        __CLR4_5_224cc24cclusyjwx6.R.inc(99049);parser.setContext(members_gen, "members");
            
                        __CLR4_5_224cc24cclusyjwx6.R.inc(99050);for(int i = 0; ;++i) {{
                            __CLR4_5_224cc24cclusyjwx6.R.inc(99051);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99052)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99053)==0&false))) {{
                                __CLR4_5_224cc24cclusyjwx6.R.inc(99054);break;
                            }
                            }__CLR4_5_224cc24cclusyjwx6.R.inc(99055);com.alibaba.json.test.codegen.Employee itemValue = members_gen_list_item_deser__.deserialze(parser, members_gen_list_item_type__, i);
                            __CLR4_5_224cc24cclusyjwx6.R.inc(99056);members_gen.add(itemValue);
                            __CLR4_5_224cc24cclusyjwx6.R.inc(99057);parser.checkListResolve(members_gen);
                            __CLR4_5_224cc24cclusyjwx6.R.inc(99058);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99059)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99060)==0&false))) {{
                                __CLR4_5_224cc24cclusyjwx6.R.inc(99061);lexer.nextToken(fastMatchToken);
                            }
                        }}
                        }__CLR4_5_224cc24cclusyjwx6.R.inc(99062);parser.setContext(listContext);
                        __CLR4_5_224cc24cclusyjwx6.R.inc(99063);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99064)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99065)==0&false))) {{
                            __CLR4_5_224cc24cclusyjwx6.R.inc(99066);restFlag = true;
                        }
                        }__CLR4_5_224cc24cclusyjwx6.R.inc(99067);lexer.nextToken(JSONToken.COMMA);
            
                    } }else {{
                        __CLR4_5_224cc24cclusyjwx6.R.inc(99068);restFlag = true;
                    }
                }}
            }}
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99069);if((((lexer.matchStat > 0)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99070)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99071)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99072);_asm_flag_0 |= 4;
                __CLR4_5_224cc24cclusyjwx6.R.inc(99073);matchedCount++;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99074);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99075)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99076)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99077);restFlag = true;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99078);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99079)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99080)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99081);endFlag = true;
            }
            
        }}
        }__CLR4_5_224cc24cclusyjwx6.R.inc(99082);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99083)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99084)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(99085);name_gen = lexer.scanFieldString(name_gen_prefix__);
            __CLR4_5_224cc24cclusyjwx6.R.inc(99086);if((((lexer.matchStat > 0)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99087)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99088)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99089);_asm_flag_0 |= 8;
                __CLR4_5_224cc24cclusyjwx6.R.inc(99090);matchedCount++;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99091);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99092)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99093)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99094);restFlag = true;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99095);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99096)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99097)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99098);endFlag = true;
            }
            
        }}
        }__CLR4_5_224cc24cclusyjwx6.R.inc(99099);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99100)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99101)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(99102);root_gen = lexer.scanFieldBoolean(root_gen_prefix__);
            __CLR4_5_224cc24cclusyjwx6.R.inc(99103);if((((lexer.matchStat > 0)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99104)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99105)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99106);_asm_flag_0 |= 16;
                __CLR4_5_224cc24cclusyjwx6.R.inc(99107);matchedCount++;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99108);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99109)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99110)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99111);restFlag = true;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99112);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99113)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99114)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99115);endFlag = true;
            }
            
        }}
        }__CLR4_5_224cc24cclusyjwx6.R.inc(99116);if (((((!endFlag) && (!restFlag))&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99117)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99118)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(99119);type_gen = (com.alibaba.json.test.codegen.DepartmentType) this.scanEnum(lexer, type_gen_prefix__, type_gen_deser__);
            __CLR4_5_224cc24cclusyjwx6.R.inc(99120);if((((lexer.matchStat > 0)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99121)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99122)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99123);_asm_flag_0 |= 32;
                __CLR4_5_224cc24cclusyjwx6.R.inc(99124);matchedCount++;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99125);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99126)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99127)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99128);restFlag = true;
            }
            }__CLR4_5_224cc24cclusyjwx6.R.inc(99129);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99130)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99131)==0&false))) {{
                __CLR4_5_224cc24cclusyjwx6.R.inc(99132);restFlag = true;
            }
            
        }}
        
        }__CLR4_5_224cc24cclusyjwx6.R.inc(99133);if ((((restFlag)&&(__CLR4_5_224cc24cclusyjwx6.R.iget(99134)!=0|true))||(__CLR4_5_224cc24cclusyjwx6.R.iget(99135)==0&false))) {{
            __CLR4_5_224cc24cclusyjwx6.R.inc(99136);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_5_224cc24cclusyjwx6.R.inc(99137);return instance;
        
    }finally{__CLR4_5_224cc24cclusyjwx6.R.flushNeeded();}}
}

