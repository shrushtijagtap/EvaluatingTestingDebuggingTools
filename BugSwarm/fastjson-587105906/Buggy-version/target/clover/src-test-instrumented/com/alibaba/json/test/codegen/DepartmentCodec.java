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

public class DepartmentCodec extends JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_1_1024cn24cnlusqkuqw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,99149,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(config, clazz);__CLR4_1_1024cn24cnlusqkuqw.R.inc(98952);try{__CLR4_1_1024cn24cnlusqkuqw.R.inc(98951);
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98953);type_gen_deser__ = config.getDeserializer(com.alibaba.json.test.codegen.DepartmentType.class);
    }finally{__CLR4_1_1024cn24cnlusqkuqw.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_1_1024cn24cnlusqkuqw.R.inc(98954);
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98955);return new Department();
        
    }finally{__CLR4_1_1024cn24cnlusqkuqw.R.flushNeeded();}}
    public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1024cn24cnlusqkuqw.R.inc(98956);
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98957);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();
        
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98958);if ((((lexer.isEnabled(Feature.SortFeidFastMatch))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98959)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98960)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(98961);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(98962);if ((((lexer.isEnabled(Feature.SupportArrayToBean))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98963)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98964)==0&false))) {{
            // deserialzeArrayMapping
        }
        
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(98965);if ((((lexer.scanType("Department") == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98966)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98967)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(98968);return super.deserialze(parser, type, fieldName);
        }
        
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(98969);ParseContext mark_context = parser.getContext();
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98970);int matchedCount = 0;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98971);Department instance = new Department();
        
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98972);ParseContext context = parser.getContext();
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98973);ParseContext childContext = parser.setContext(context, instance, fieldName);
        
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98974);if ((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98975)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98976)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(98977);return instance;
        }
        
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(98978);int matchStat = 0;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98979);int _asm_flag_0 = 0;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98980);int id_gen = 0;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98981);com.alibaba.json.test.codegen.Employee leader_gen = null;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98982);java.util.List members_gen = null;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98983);String name_gen;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98984);if ((((lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98985)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98986)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(98987);name_gen = lexer.stringDefaultValue();
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(98988);_asm_flag_0 |= 8;
        } }else {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(98989);name_gen = null;
        }
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(98990);boolean root_gen = false;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98991);com.alibaba.json.test.codegen.DepartmentType type_gen = null;
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98992);boolean endFlag = false, restFlag = false;
        
        __CLR4_1_1024cn24cnlusqkuqw.R.inc(98993);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98994)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98995)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(98996);id_gen = lexer.scanFieldInt(id_gen_prefix__);
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(98997);if((((lexer.matchStat > 0)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98998)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(98999)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99000);_asm_flag_0 |= 1;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99001);matchedCount++;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99002);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99003)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99004)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99005);restFlag = true;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99006);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99007)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99008)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99009);endFlag = true;
            }
            
        }}
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99010);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99011)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99012)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99013);if ((((lexer.matchField(leader_gen_prefix__))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99014)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99015)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99016);_asm_flag_0 |= 2;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99017);matchedCount++;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99018);if((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99019)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99020)==0&false))) {{
                    __CLR4_1_1024cn24cnlusqkuqw.R.inc(99021);ResolveTask resolveTask = parser.getLastResolveTask();
                    __CLR4_1_1024cn24cnlusqkuqw.R.inc(99022);resolveTask.ownerContext = parser.getContext();
                    __CLR4_1_1024cn24cnlusqkuqw.R.inc(99023);resolveTask.fieldDeserializer = this.getFieldDeserializer("leader");
                    __CLR4_1_1024cn24cnlusqkuqw.R.inc(99024);parser.setResolveStatus(DefaultJSONParser.NONE);
                }
            }}
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99025);if((((lexer.matchStat > 0)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99026)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99027)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99028);_asm_flag_0 |= 2;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99029);matchedCount++;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99030);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99031)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99032)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99033);restFlag = true;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99034);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99035)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99036)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99037);endFlag = true;
            }
            
        }}
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99038);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99039)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99040)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99041);if ((((lexer.matchField(members_gen_prefix__))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99042)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99043)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99044);_asm_flag_0 |= 4;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99045);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99046)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99047)==0&false))) {{
                    __CLR4_1_1024cn24cnlusqkuqw.R.inc(99048);lexer.nextToken(JSONToken.COMMA);
                } }else {{
                    __CLR4_1_1024cn24cnlusqkuqw.R.inc(99049);if ((((lexer.token() == JSONToken.LBRACKET)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99050)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99051)==0&false))) {{
                        __CLR4_1_1024cn24cnlusqkuqw.R.inc(99052);if((((members_gen_list_item_deser__ == null)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99053)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99054)==0&false))) {{
                            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99055);members_gen_list_item_deser__ = parser.getConfig().getDeserializer(com.alibaba.json.test.codegen.Employee.class);
                        }
                        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99056);final int fastMatchToken = members_gen_list_item_deser__.getFastMatchToken();
                        __CLR4_1_1024cn24cnlusqkuqw.R.inc(99057);lexer.nextToken(fastMatchToken);
                        __CLR4_1_1024cn24cnlusqkuqw.R.inc(99058);members_gen = new java.util.ArrayList();
                        __CLR4_1_1024cn24cnlusqkuqw.R.inc(99059);ParseContext listContext = parser.getContext();
                        __CLR4_1_1024cn24cnlusqkuqw.R.inc(99060);parser.setContext(members_gen, "members");
            
                        __CLR4_1_1024cn24cnlusqkuqw.R.inc(99061);for(int i = 0; ;++i) {{
                            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99062);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99063)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99064)==0&false))) {{
                                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99065);break;
                            }
                            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99066);com.alibaba.json.test.codegen.Employee itemValue = members_gen_list_item_deser__.deserialze(parser, members_gen_list_item_type__, i);
                            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99067);members_gen.add(itemValue);
                            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99068);parser.checkListResolve(members_gen);
                            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99069);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99070)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99071)==0&false))) {{
                                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99072);lexer.nextToken(fastMatchToken);
                            }
                        }}
                        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99073);parser.setContext(listContext);
                        __CLR4_1_1024cn24cnlusqkuqw.R.inc(99074);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99075)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99076)==0&false))) {{
                            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99077);restFlag = true;
                        }
                        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99078);lexer.nextToken(JSONToken.COMMA);
            
                    } }else {{
                        __CLR4_1_1024cn24cnlusqkuqw.R.inc(99079);restFlag = true;
                    }
                }}
            }}
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99080);if((((lexer.matchStat > 0)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99081)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99082)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99083);_asm_flag_0 |= 4;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99084);matchedCount++;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99085);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99086)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99087)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99088);restFlag = true;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99089);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99090)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99091)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99092);endFlag = true;
            }
            
        }}
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99093);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99094)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99095)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99096);name_gen = lexer.scanFieldString(name_gen_prefix__);
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99097);if((((lexer.matchStat > 0)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99098)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99099)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99100);_asm_flag_0 |= 8;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99101);matchedCount++;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99102);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99103)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99104)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99105);restFlag = true;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99106);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99107)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99108)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99109);endFlag = true;
            }
            
        }}
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99110);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99111)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99112)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99113);root_gen = lexer.scanFieldBoolean(root_gen_prefix__);
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99114);if((((lexer.matchStat > 0)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99115)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99116)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99117);_asm_flag_0 |= 16;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99118);matchedCount++;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99119);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99120)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99121)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99122);restFlag = true;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99123);if((((lexer.matchStat == JSONLexerBase.END)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99124)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99125)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99126);endFlag = true;
            }
            
        }}
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99127);if (((((!endFlag) && (!restFlag))&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99128)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99129)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99130);type_gen = (com.alibaba.json.test.codegen.DepartmentType) this.scanEnum(lexer, type_gen_prefix__, type_gen_deser__);
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99131);if((((lexer.matchStat > 0)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99132)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99133)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99134);_asm_flag_0 |= 32;
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99135);matchedCount++;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99136);if((((lexer.matchStat == JSONLexerBase.NOT_MATCH)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99137)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99138)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99139);restFlag = true;
            }
            }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99140);if((((lexer.matchStat != JSONLexerBase.END)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99141)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99142)==0&false))) {{
                __CLR4_1_1024cn24cnlusqkuqw.R.inc(99143);restFlag = true;
            }
            
        }}
        
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99144);if ((((restFlag)&&(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99145)!=0|true))||(__CLR4_1_1024cn24cnlusqkuqw.R.iget(99146)==0&false))) {{
            __CLR4_1_1024cn24cnlusqkuqw.R.inc(99147);return super.parseRest(parser, type, fieldName, instance, 0, new int[0]);
        }
        
        }__CLR4_1_1024cn24cnlusqkuqw.R.inc(99148);return instance;
        
    }finally{__CLR4_1_1024cn24cnlusqkuqw.R.flushNeeded();}}
}

