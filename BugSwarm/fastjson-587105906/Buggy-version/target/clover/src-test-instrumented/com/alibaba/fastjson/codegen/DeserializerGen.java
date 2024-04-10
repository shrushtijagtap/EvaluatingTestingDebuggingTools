/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.codegen;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;

public class DeserializerGen extends ClassGen {public static class __CLR4_1_10utcutcluszw46l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,40471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private JavaBeanInfo beanInfo;
    private String              genClassName;

    public DeserializerGen(Class<?> clazz, Appendable out){
        super(clazz, out);__CLR4_1_10utcutcluszw46l.R.inc(39937);try{__CLR4_1_10utcutcluszw46l.R.inc(39936);
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    @Override
    public void gen() throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(39938);
        __CLR4_1_10utcutcluszw46l.R.inc(39939);beanInfo = JavaBeanInfo.build(clazz, type, null);
        __CLR4_1_10utcutcluszw46l.R.inc(39940);genClassName = clazz.getSimpleName() + "GenDecoder";

        __CLR4_1_10utcutcluszw46l.R.inc(39941);print("package ");
        __CLR4_1_10utcutcluszw46l.R.inc(39942);print(clazz.getPackage().getName());
        __CLR4_1_10utcutcluszw46l.R.inc(39943);println(";");
        __CLR4_1_10utcutcluszw46l.R.inc(39944);println();

        __CLR4_1_10utcutcluszw46l.R.inc(39945);println("import java.lang.reflect.Type;");
        __CLR4_1_10utcutcluszw46l.R.inc(39946);println();

        __CLR4_1_10utcutcluszw46l.R.inc(39947);println("import com.alibaba.fastjson.parser.DefaultJSONParser;");
        __CLR4_1_10utcutcluszw46l.R.inc(39948);println("import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;");
        __CLR4_1_10utcutcluszw46l.R.inc(39949);println("import com.alibaba.fastjson.parser.ParserConfig;");
        __CLR4_1_10utcutcluszw46l.R.inc(39950);println("import com.alibaba.fastjson.parser.Feature;");
        __CLR4_1_10utcutcluszw46l.R.inc(39951);println("import com.alibaba.fastjson.parser.JSONLexerBase;");
        __CLR4_1_10utcutcluszw46l.R.inc(39952);println("import com.alibaba.fastjson.parser.JSONToken;");
        __CLR4_1_10utcutcluszw46l.R.inc(39953);println("import com.alibaba.fastjson.parser.ParseContext;");
        __CLR4_1_10utcutcluszw46l.R.inc(39954);println("import com.alibaba.fastjson.parser.deserializer.ASMJavaBeanDeserializer;");
        __CLR4_1_10utcutcluszw46l.R.inc(39955);println("import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;");
        __CLR4_1_10utcutcluszw46l.R.inc(39956);println();

        __CLR4_1_10utcutcluszw46l.R.inc(39957);print("public class ");
        __CLR4_1_10utcutcluszw46l.R.inc(39958);print(genClassName);
        __CLR4_1_10utcutcluszw46l.R.inc(39959);print(" extends ASMJavaBeanDeserializer implements ObjectDeserializer {");
        __CLR4_1_10utcutcluszw46l.R.inc(39960);incrementIndent();
        __CLR4_1_10utcutcluszw46l.R.inc(39961);println();

        __CLR4_1_10utcutcluszw46l.R.inc(39962);genConstructor();

        __CLR4_1_10utcutcluszw46l.R.inc(39963);genCreateInstance();

        __CLR4_1_10utcutcluszw46l.R.inc(39964);genDeserialze();

        __CLR4_1_10utcutcluszw46l.R.inc(39965);endClass();
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    protected void genCreateInstance() throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(39966);
        __CLR4_1_10utcutcluszw46l.R.inc(39967);println();
        __CLR4_1_10utcutcluszw46l.R.inc(39968);print("public Object createInstance(DefaultJSONParser parser, Type type) {");
        __CLR4_1_10utcutcluszw46l.R.inc(39969);incrementIndent();
        __CLR4_1_10utcutcluszw46l.R.inc(39970);println();

        __CLR4_1_10utcutcluszw46l.R.inc(39971);print("return new ");
        __CLR4_1_10utcutcluszw46l.R.inc(39972);print(clazz.getSimpleName());
        __CLR4_1_10utcutcluszw46l.R.inc(39973);print("();");
        __CLR4_1_10utcutcluszw46l.R.inc(39974);println();

        __CLR4_1_10utcutcluszw46l.R.inc(39975);decrementIndent();
        __CLR4_1_10utcutcluszw46l.R.inc(39976);println();
        __CLR4_1_10utcutcluszw46l.R.inc(39977);print("}");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    protected void genDeserialze() throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(39978);
        __CLR4_1_10utcutcluszw46l.R.inc(39979);if ((((beanInfo.fields.length == 0)&&(__CLR4_1_10utcutcluszw46l.R.iget(39980)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(39981)==0&false))) {{
            __CLR4_1_10utcutcluszw46l.R.inc(39982);return;
        }

        }__CLR4_1_10utcutcluszw46l.R.inc(39983);for (FieldInfo fieldInfo : beanInfo.fields) {{
            __CLR4_1_10utcutcluszw46l.R.inc(39984);Class<?> fieldClass = fieldInfo.fieldClass;
            __CLR4_1_10utcutcluszw46l.R.inc(39985);Type fieldType = fieldInfo.fieldType;

            __CLR4_1_10utcutcluszw46l.R.inc(39986);if ((((fieldClass == char.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(39987)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(39988)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(39989);return;
            }

            }__CLR4_1_10utcutcluszw46l.R.inc(39990);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_1_10utcutcluszw46l.R.iget(39991)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(39992)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(39993);if ((((fieldType instanceof ParameterizedType)&&(__CLR4_1_10utcutcluszw46l.R.iget(39994)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(39995)==0&false))) {{
                    __CLR4_1_10utcutcluszw46l.R.inc(39996);Type itemType = ((ParameterizedType) fieldType).getActualTypeArguments()[0];
                    __CLR4_1_10utcutcluszw46l.R.inc(39997);if ((((itemType instanceof Class)&&(__CLR4_1_10utcutcluszw46l.R.iget(39998)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(39999)==0&false))) {{
                        __CLR4_1_10utcutcluszw46l.R.inc(40000);continue;
                    } }else {{
                        __CLR4_1_10utcutcluszw46l.R.inc(40001);return;
                    }
                }} }else {{
                    __CLR4_1_10utcutcluszw46l.R.inc(40002);return;
                }
            }}
        }}

        }__CLR4_1_10utcutcluszw46l.R.inc(40003);FieldInfo[] fieldList = beanInfo.sortedFields;

        __CLR4_1_10utcutcluszw46l.R.inc(40004);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40005);print("public Object deserialze(DefaultJSONParser parser, Type type, Object fieldName) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40006);incrementIndent();
        __CLR4_1_10utcutcluszw46l.R.inc(40007);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40008);println("JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();");
        __CLR4_1_10utcutcluszw46l.R.inc(40009);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40010);println("if (!lexer.isEnabled(Feature.SortFeidFastMatch)) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40011);println("\treturn super.deserialze(parser, type, fieldName);");
        __CLR4_1_10utcutcluszw46l.R.inc(40012);println("}");

        __CLR4_1_10utcutcluszw46l.R.inc(40013);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40014);println("if (isSupportArrayToBean(lexer)) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40015);println("\t// deserialzeArrayMapping");
        __CLR4_1_10utcutcluszw46l.R.inc(40016);println("}");

        __CLR4_1_10utcutcluszw46l.R.inc(40017);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40018);println("if (lexer.scanType(\"Department\") == JSONLexerBase.NOT_MATCH) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40019);println("\treturn super.deserialze(parser, type, fieldName);");
        __CLR4_1_10utcutcluszw46l.R.inc(40020);println("}");

        __CLR4_1_10utcutcluszw46l.R.inc(40021);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40022);println("ParseContext mark_context = parser.getContext();");
        __CLR4_1_10utcutcluszw46l.R.inc(40023);println("int matchedCount = 0;");

        __CLR4_1_10utcutcluszw46l.R.inc(40024);print(clazz.getSimpleName());
        __CLR4_1_10utcutcluszw46l.R.inc(40025);print(" instance = ");
        __CLR4_1_10utcutcluszw46l.R.inc(40026);Constructor<?> defaultConstructor = beanInfo.defaultConstructor;
        __CLR4_1_10utcutcluszw46l.R.inc(40027);if ((((Modifier.isPublic(defaultConstructor.getModifiers()))&&(__CLR4_1_10utcutcluszw46l.R.iget(40028)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40029)==0&false))) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40030);print("new ");
            __CLR4_1_10utcutcluszw46l.R.inc(40031);print(clazz.getSimpleName());
            __CLR4_1_10utcutcluszw46l.R.inc(40032);println("();");
        } }else {{
            __CLR4_1_10utcutcluszw46l.R.inc(40033);print("(");
            __CLR4_1_10utcutcluszw46l.R.inc(40034);print(clazz.getSimpleName());
            __CLR4_1_10utcutcluszw46l.R.inc(40035);print(") createInstance(parser);");
        }

        }__CLR4_1_10utcutcluszw46l.R.inc(40036);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40037);println("ParseContext context = parser.getContext();");
        __CLR4_1_10utcutcluszw46l.R.inc(40038);println("ParseContext childContext = parser.setContext(context, instance, fieldName);");

        __CLR4_1_10utcutcluszw46l.R.inc(40039);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40040);println("if (lexer.matchStat == JSONLexerBase.END) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40041);println("\treturn instance;");
        __CLR4_1_10utcutcluszw46l.R.inc(40042);println("}");

        __CLR4_1_10utcutcluszw46l.R.inc(40043);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40044);println("int matchStat = 0;");

        __CLR4_1_10utcutcluszw46l.R.inc(40045);int fieldListSize = fieldList.length;
        __CLR4_1_10utcutcluszw46l.R.inc(40046);for (int i = 0; (((i < fieldListSize)&&(__CLR4_1_10utcutcluszw46l.R.iget(40047)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40048)==0&false)); i += 32) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40049);print("int _asm_flag_");
            __CLR4_1_10utcutcluszw46l.R.inc(40050);print(Integer.toString(i / 32));
            __CLR4_1_10utcutcluszw46l.R.inc(40051);println(" = 0;");
        }

        }__CLR4_1_10utcutcluszw46l.R.inc(40052);for (int i = 0; (((i < fieldListSize)&&(__CLR4_1_10utcutcluszw46l.R.iget(40053)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40054)==0&false)); ++i) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40055);FieldInfo fieldInfo = fieldList[i];
            __CLR4_1_10utcutcluszw46l.R.inc(40056);Class<?> fieldClass = fieldInfo.fieldClass;

            __CLR4_1_10utcutcluszw46l.R.inc(40057);if ((((fieldClass == boolean.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40058)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40059)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40060);print("boolean ");
                __CLR4_1_10utcutcluszw46l.R.inc(40061);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40062);println(" = false;");
            } }else {__CLR4_1_10utcutcluszw46l.R.inc(40063);if ((((fieldClass == byte.class //
                       || fieldClass == short.class //
                       || fieldClass == int.class //
                       || fieldClass == long.class //
                       || fieldClass == float.class //
                       || fieldClass == double.class //
            )&&(__CLR4_1_10utcutcluszw46l.R.iget(40064)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40065)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40066);print(fieldClass.getSimpleName());
                __CLR4_1_10utcutcluszw46l.R.inc(40067);print(" ");
                __CLR4_1_10utcutcluszw46l.R.inc(40068);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40069);println(" = 0;");
            } }else {{
                __CLR4_1_10utcutcluszw46l.R.inc(40070);if ((((fieldClass == String.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40071)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40072)==0&false))) {{
                    __CLR4_1_10utcutcluszw46l.R.inc(40073);print("String ");
                    __CLR4_1_10utcutcluszw46l.R.inc(40074);printFieldVarName(fieldInfo);
                    __CLR4_1_10utcutcluszw46l.R.inc(40075);println(";");

                    __CLR4_1_10utcutcluszw46l.R.inc(40076);println("if (lexer.isEnabled(Feature.InitStringFieldAsEmpty)) {");
                    __CLR4_1_10utcutcluszw46l.R.inc(40077);print("\t");
                    __CLR4_1_10utcutcluszw46l.R.inc(40078);printFieldVarName(fieldInfo);
                    __CLR4_1_10utcutcluszw46l.R.inc(40079);println(" = lexer.stringDefaultValue();");
                    __CLR4_1_10utcutcluszw46l.R.inc(40080);print("\t");
                    __CLR4_1_10utcutcluszw46l.R.inc(40081);genSetFlag(i);
                    __CLR4_1_10utcutcluszw46l.R.inc(40082);println("} else {");
                    __CLR4_1_10utcutcluszw46l.R.inc(40083);print("\t");
                    __CLR4_1_10utcutcluszw46l.R.inc(40084);printFieldVarName(fieldInfo);
                    __CLR4_1_10utcutcluszw46l.R.inc(40085);println(" = null;");
                    __CLR4_1_10utcutcluszw46l.R.inc(40086);println("}");
                } }else {{
                    __CLR4_1_10utcutcluszw46l.R.inc(40087);printClassName(fieldClass);
                    __CLR4_1_10utcutcluszw46l.R.inc(40088);print(" ");
                    __CLR4_1_10utcutcluszw46l.R.inc(40089);printFieldVarName(fieldInfo);
                    __CLR4_1_10utcutcluszw46l.R.inc(40090);print(" = null;");
                    __CLR4_1_10utcutcluszw46l.R.inc(40091);println();
                }
            }}
        }}}

        }__CLR4_1_10utcutcluszw46l.R.inc(40092);println("boolean endFlag = false, restFlag = false;");
        __CLR4_1_10utcutcluszw46l.R.inc(40093);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40094);for (int i = 0; (((i < fieldListSize)&&(__CLR4_1_10utcutcluszw46l.R.iget(40095)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40096)==0&false)); ++i) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40097);print("if ((!endFlag) && (!restFlag)) {");
            __CLR4_1_10utcutcluszw46l.R.inc(40098);incrementIndent();
            __CLR4_1_10utcutcluszw46l.R.inc(40099);println();

            __CLR4_1_10utcutcluszw46l.R.inc(40100);FieldInfo fieldInfo = fieldList[i];
            __CLR4_1_10utcutcluszw46l.R.inc(40101);Class<?> fieldClass = fieldInfo.fieldClass;
            __CLR4_1_10utcutcluszw46l.R.inc(40102);Type fieldType = fieldInfo.fieldType;

            __CLR4_1_10utcutcluszw46l.R.inc(40103);if ((((fieldClass == boolean.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40104)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40105)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40106);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40107);print(" = lexer.scanFieldBoolean(");
                __CLR4_1_10utcutcluszw46l.R.inc(40108);printFieldPrefix(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40109);println(");");
            } }else {__CLR4_1_10utcutcluszw46l.R.inc(40110);if ((((fieldClass == byte.class || fieldClass == short.class || fieldClass == int.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40111)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40112)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40113);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40114);print(" = lexer.scanFieldInt(");
                __CLR4_1_10utcutcluszw46l.R.inc(40115);printFieldPrefix(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40116);println(");");
            } }else {__CLR4_1_10utcutcluszw46l.R.inc(40117);if ((((fieldClass == long.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40118)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40119)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40120);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40121);print(" = lexer.scanFieldLong(");
                __CLR4_1_10utcutcluszw46l.R.inc(40122);printFieldPrefix(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40123);println(");");
            } }else {__CLR4_1_10utcutcluszw46l.R.inc(40124);if ((((fieldClass == float.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40125)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40126)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40127);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40128);print(" = lexer.scanFieldFloat(");
                __CLR4_1_10utcutcluszw46l.R.inc(40129);printFieldPrefix(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40130);println(");");
            } }else {__CLR4_1_10utcutcluszw46l.R.inc(40131);if ((((fieldClass == double.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40132)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40133)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40134);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40135);print(" = lexer.scanFieldDouble(");
                __CLR4_1_10utcutcluszw46l.R.inc(40136);printFieldPrefix(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40137);println(");");
            } }else {__CLR4_1_10utcutcluszw46l.R.inc(40138);if ((((fieldClass == String.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40139)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40140)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40141);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40142);print(" = lexer.scanFieldString(");
                __CLR4_1_10utcutcluszw46l.R.inc(40143);printFieldPrefix(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40144);println(");");
            } }else {__CLR4_1_10utcutcluszw46l.R.inc(40145);if ((((fieldClass.isEnum())&&(__CLR4_1_10utcutcluszw46l.R.iget(40146)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40147)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40148);print("String ");
                __CLR4_1_10utcutcluszw46l.R.inc(40149);printFieldVarEnumName(fieldInfo);

                __CLR4_1_10utcutcluszw46l.R.inc(40150);print(" = lexer.scanFieldSymbol(");
                __CLR4_1_10utcutcluszw46l.R.inc(40151);printFieldPrefix(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40152);println(", parser.getSymbolTable());");

                __CLR4_1_10utcutcluszw46l.R.inc(40153);print("if (");
                __CLR4_1_10utcutcluszw46l.R.inc(40154);printFieldVarEnumName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40155);println(" == null) {");
                __CLR4_1_10utcutcluszw46l.R.inc(40156);print("\t");
                __CLR4_1_10utcutcluszw46l.R.inc(40157);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40158);print(" = ");
                __CLR4_1_10utcutcluszw46l.R.inc(40159);printClassName(fieldClass);
                __CLR4_1_10utcutcluszw46l.R.inc(40160);print(".valueOf(");
                __CLR4_1_10utcutcluszw46l.R.inc(40161);printFieldVarEnumName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40162);println(");");
                __CLR4_1_10utcutcluszw46l.R.inc(40163);println("}");
            } }else {__CLR4_1_10utcutcluszw46l.R.inc(40164);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_1_10utcutcluszw46l.R.iget(40165)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40166)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40167);Class<?> itemClass = TypeUtils.getCollectionItemClass(fieldType);

                __CLR4_1_10utcutcluszw46l.R.inc(40168);if ((((itemClass == String.class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40169)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40170)==0&false))) {{
                    __CLR4_1_10utcutcluszw46l.R.inc(40171);printFieldVarName(fieldInfo);
                    __CLR4_1_10utcutcluszw46l.R.inc(40172);print(" = (");
                    __CLR4_1_10utcutcluszw46l.R.inc(40173);printClassName(fieldClass);
                    __CLR4_1_10utcutcluszw46l.R.inc(40174);print(") lexer.scanFieldStringArray(");
                    __CLR4_1_10utcutcluszw46l.R.inc(40175);printFieldPrefix(fieldInfo);
                    __CLR4_1_10utcutcluszw46l.R.inc(40176);print(", ");
                    __CLR4_1_10utcutcluszw46l.R.inc(40177);printClassName(fieldClass);
                    __CLR4_1_10utcutcluszw46l.R.inc(40178);print(".class);");
                    __CLR4_1_10utcutcluszw46l.R.inc(40179);println();
                } }else {{
                    __CLR4_1_10utcutcluszw46l.R.inc(40180);genDeserialzeList(fieldInfo, i, itemClass);
                    __CLR4_1_10utcutcluszw46l.R.inc(40181);if ((((i == fieldListSize - 1)&&(__CLR4_1_10utcutcluszw46l.R.iget(40182)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40183)==0&false))) {{
                        __CLR4_1_10utcutcluszw46l.R.inc(40184);genEndCheck();
                    }
                }}
            }} }else {{
                __CLR4_1_10utcutcluszw46l.R.inc(40185);genDeserialzeObject(fieldInfo, i);

                __CLR4_1_10utcutcluszw46l.R.inc(40186);if ((((i == fieldListSize - 1)&&(__CLR4_1_10utcutcluszw46l.R.iget(40187)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40188)==0&false))) {{
                    __CLR4_1_10utcutcluszw46l.R.inc(40189);genEndCheck();
                }
            }}

            }}}}}}}}__CLR4_1_10utcutcluszw46l.R.inc(40190);println("if(lexer.matchStat > 0) {");
            __CLR4_1_10utcutcluszw46l.R.inc(40191);print("\t");
            __CLR4_1_10utcutcluszw46l.R.inc(40192);genSetFlag(i);
            __CLR4_1_10utcutcluszw46l.R.inc(40193);println("\tmatchedCount++;");
            __CLR4_1_10utcutcluszw46l.R.inc(40194);println("}");

            __CLR4_1_10utcutcluszw46l.R.inc(40195);println("if(lexer.matchStat == JSONLexerBase.NOT_MATCH) {");
            __CLR4_1_10utcutcluszw46l.R.inc(40196);println("\trestFlag = true;");
            __CLR4_1_10utcutcluszw46l.R.inc(40197);println("}");

  
            __CLR4_1_10utcutcluszw46l.R.inc(40198);println("if(lexer.matchStat != JSONLexerBase.END) {");
            __CLR4_1_10utcutcluszw46l.R.inc(40199);println("\tendFlag = true;");
            __CLR4_1_10utcutcluszw46l.R.inc(40200);println("}");
            

            __CLR4_1_10utcutcluszw46l.R.inc(40201);decrementIndent();
            __CLR4_1_10utcutcluszw46l.R.inc(40202);println();
            __CLR4_1_10utcutcluszw46l.R.inc(40203);println("}");
        }

        }__CLR4_1_10utcutcluszw46l.R.inc(40204);genBatchSet(fieldList, true);

        __CLR4_1_10utcutcluszw46l.R.inc(40205);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40206);println("if (restFlag) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40207);println("\treturn super.parseRest(parser, type, fieldName, instance);");
        __CLR4_1_10utcutcluszw46l.R.inc(40208);println("}");

        __CLR4_1_10utcutcluszw46l.R.inc(40209);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40210);print("return instance;");
        __CLR4_1_10utcutcluszw46l.R.inc(40211);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40212);decrementIndent();
        __CLR4_1_10utcutcluszw46l.R.inc(40213);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40214);print("}");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void genBatchSet(FieldInfo[] fieldList, boolean flag) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40215);
        __CLR4_1_10utcutcluszw46l.R.inc(40216);for (int i = 0, size = fieldList.length; (((i < size)&&(__CLR4_1_10utcutcluszw46l.R.iget(40217)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40218)==0&false)); ++i) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40219);FieldInfo fieldInfo = fieldList[i];
            
            __CLR4_1_10utcutcluszw46l.R.inc(40220);String varName = "_asm_flag_" + (i / 32);
            __CLR4_1_10utcutcluszw46l.R.inc(40221);if ((((flag)&&(__CLR4_1_10utcutcluszw46l.R.iget(40222)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40223)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40224);print("if ((");
                __CLR4_1_10utcutcluszw46l.R.inc(40225);print(varName);
                __CLR4_1_10utcutcluszw46l.R.inc(40226);print(" & ");
                __CLR4_1_10utcutcluszw46l.R.inc(40227);print(Integer.toString(1 << i));
                __CLR4_1_10utcutcluszw46l.R.inc(40228);print(") != 0) {");
                __CLR4_1_10utcutcluszw46l.R.inc(40229);println();
                __CLR4_1_10utcutcluszw46l.R.inc(40230);incrementIndent();
            }
            
            }__CLR4_1_10utcutcluszw46l.R.inc(40231);if ((((fieldInfo.method != null)&&(__CLR4_1_10utcutcluszw46l.R.iget(40232)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40233)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40234);print("\tinstance.");
                __CLR4_1_10utcutcluszw46l.R.inc(40235);print(fieldInfo.method.getName());
                __CLR4_1_10utcutcluszw46l.R.inc(40236);print("(");
                __CLR4_1_10utcutcluszw46l.R.inc(40237);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40238);println(");");
            } }else {{
                __CLR4_1_10utcutcluszw46l.R.inc(40239);print("\tinstance.");
                __CLR4_1_10utcutcluszw46l.R.inc(40240);print(fieldInfo.field.getName());
                __CLR4_1_10utcutcluszw46l.R.inc(40241);print(" = ");
                __CLR4_1_10utcutcluszw46l.R.inc(40242);printFieldVarName(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40243);println(";");
            }

            }__CLR4_1_10utcutcluszw46l.R.inc(40244);if ((((flag)&&(__CLR4_1_10utcutcluszw46l.R.iget(40245)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40246)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40247);decrementIndent();
                __CLR4_1_10utcutcluszw46l.R.inc(40248);println();
                __CLR4_1_10utcutcluszw46l.R.inc(40249);println("}");
            }
        }}
    }}finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void genEndCheck() throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40250);
        __CLR4_1_10utcutcluszw46l.R.inc(40251);println("if (matchedCount <= 0 || lexer.token() != JSONToken.RBRACE) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40252);println("\trestFlag = true;");
        __CLR4_1_10utcutcluszw46l.R.inc(40253);println("} else if (lexer.token() == JSONToken.COMMA) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40254);println("\tlexer.nextToken();");
        __CLR4_1_10utcutcluszw46l.R.inc(40255);println("}");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    protected void genDeserialzeList(FieldInfo fieldInfo, int i, Class<?> itemClass) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40256);
        __CLR4_1_10utcutcluszw46l.R.inc(40257);print("if (lexer.matchField(");
        __CLR4_1_10utcutcluszw46l.R.inc(40258);printFieldPrefix(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40259);print(")) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40260);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40261);print("\t");
        __CLR4_1_10utcutcluszw46l.R.inc(40262);genSetFlag(i);
        __CLR4_1_10utcutcluszw46l.R.inc(40263);println("\tif (lexer.token() == JSONToken.NULL) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40264);println("\t\tlexer.nextToken(JSONToken.COMMA);");
        __CLR4_1_10utcutcluszw46l.R.inc(40265);println("\t} else {");
        __CLR4_1_10utcutcluszw46l.R.inc(40266);println("\t\tif (lexer.token() == JSONToken.LBRACKET) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40267);print("\t\t\tif(");
        __CLR4_1_10utcutcluszw46l.R.inc(40268);printListFieldItemDeser(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40269);print(" == null) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40270);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40271);print("\t\t\t\t");
        __CLR4_1_10utcutcluszw46l.R.inc(40272);printListFieldItemDeser(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40273);print(" = parser.getConfig().getDeserializer(");
        __CLR4_1_10utcutcluszw46l.R.inc(40274);printClassName(itemClass);
        __CLR4_1_10utcutcluszw46l.R.inc(40275);print(".class);");
        __CLR4_1_10utcutcluszw46l.R.inc(40276);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40277);print("\t\t\t}");
        __CLR4_1_10utcutcluszw46l.R.inc(40278);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40279);print("\t\t\tfinal int fastMatchToken = ");
        __CLR4_1_10utcutcluszw46l.R.inc(40280);printListFieldItemDeser(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40281);print(".getFastMatchToken();");
        __CLR4_1_10utcutcluszw46l.R.inc(40282);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40283);println("\t\t\tlexer.nextToken(fastMatchToken);");

        // _newCollection
        __CLR4_1_10utcutcluszw46l.R.inc(40284);print("\t\t\t");
        __CLR4_1_10utcutcluszw46l.R.inc(40285);printFieldVarName(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40286);print(" = ");
        __CLR4_1_10utcutcluszw46l.R.inc(40287);Class<?> fieldClass = fieldInfo.fieldClass;
        __CLR4_1_10utcutcluszw46l.R.inc(40288);if ((((fieldClass.isAssignableFrom(ArrayList.class))&&(__CLR4_1_10utcutcluszw46l.R.iget(40289)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40290)==0&false))) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40291);print("new java.util.ArrayList();");
        } }else {__CLR4_1_10utcutcluszw46l.R.inc(40292);if ((((fieldClass.isAssignableFrom(LinkedList.class))&&(__CLR4_1_10utcutcluszw46l.R.iget(40293)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40294)==0&false))) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40295);print("new java.util.LinkedList();");
        } }else {__CLR4_1_10utcutcluszw46l.R.inc(40296);if ((((fieldClass.isAssignableFrom(HashSet.class))&&(__CLR4_1_10utcutcluszw46l.R.iget(40297)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40298)==0&false))) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40299);print("new java.util.HashSet();");
        } }else {__CLR4_1_10utcutcluszw46l.R.inc(40300);if ((((fieldClass.isAssignableFrom(TreeSet.class))&&(__CLR4_1_10utcutcluszw46l.R.iget(40301)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40302)==0&false))) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40303);print("new java.util.TreeSet();");
        } }else {{
            __CLR4_1_10utcutcluszw46l.R.inc(40304);print("new ");
            __CLR4_1_10utcutcluszw46l.R.inc(40305);printClassName(fieldClass);
            __CLR4_1_10utcutcluszw46l.R.inc(40306);print("();");
        }
        }}}}__CLR4_1_10utcutcluszw46l.R.inc(40307);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40308);println("\t\t\tParseContext listContext = parser.getContext();");
        __CLR4_1_10utcutcluszw46l.R.inc(40309);print("\t\t\tparser.setContext(");
        __CLR4_1_10utcutcluszw46l.R.inc(40310);printFieldVarName(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40311);print(", \"");
        __CLR4_1_10utcutcluszw46l.R.inc(40312);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40313);print("\");");
        __CLR4_1_10utcutcluszw46l.R.inc(40314);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40315);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40316);println("\t\t\tfor(int i = 0; ;++i) {");

        __CLR4_1_10utcutcluszw46l.R.inc(40317);println("\t\t\t\tif (lexer.token() == JSONToken.RBRACKET) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40318);println("\t\t\t\t\tbreak;");
        __CLR4_1_10utcutcluszw46l.R.inc(40319);println("\t\t\t\t}");
        __CLR4_1_10utcutcluszw46l.R.inc(40320);print("\t\t\t\t");
        __CLR4_1_10utcutcluszw46l.R.inc(40321);printClassName(itemClass);
        __CLR4_1_10utcutcluszw46l.R.inc(40322);print(" itemValue = ");
        __CLR4_1_10utcutcluszw46l.R.inc(40323);printListFieldItemDeser(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40324);print(".deserialze(parser, ");
        __CLR4_1_10utcutcluszw46l.R.inc(40325);printListFieldItemType(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40326);println(", i);");

        __CLR4_1_10utcutcluszw46l.R.inc(40327);print("\t\t\t\t");
        __CLR4_1_10utcutcluszw46l.R.inc(40328);printFieldVarName(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40329);println(".add(itemValue);");

        __CLR4_1_10utcutcluszw46l.R.inc(40330);print("\t\t\t\tparser.checkListResolve(");
        __CLR4_1_10utcutcluszw46l.R.inc(40331);printFieldVarName(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40332);println(");");

        __CLR4_1_10utcutcluszw46l.R.inc(40333);println("\t\t\t\tif (lexer.token() == JSONToken.COMMA) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40334);println("\t\t\t\t\tlexer.nextToken(fastMatchToken);");
        __CLR4_1_10utcutcluszw46l.R.inc(40335);println("\t\t\t\t}");

        // end for
        __CLR4_1_10utcutcluszw46l.R.inc(40336);println("\t\t\t}");

        __CLR4_1_10utcutcluszw46l.R.inc(40337);println("\t\t\tparser.setContext(listContext);");

        __CLR4_1_10utcutcluszw46l.R.inc(40338);println("\t\t\tif (lexer.token() != JSONToken.RBRACKET) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40339);println("\t\t\t\trestFlag = true;");
        __CLR4_1_10utcutcluszw46l.R.inc(40340);println("\t\t\t}");
        __CLR4_1_10utcutcluszw46l.R.inc(40341);println("\t\t\tlexer.nextToken(JSONToken.COMMA);");

        __CLR4_1_10utcutcluszw46l.R.inc(40342);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40343);println("\t\t} else {");
        __CLR4_1_10utcutcluszw46l.R.inc(40344);println("\t\t\trestFlag = true;");
        __CLR4_1_10utcutcluszw46l.R.inc(40345);println("\t\t}");
        __CLR4_1_10utcutcluszw46l.R.inc(40346);println("\t}");
        __CLR4_1_10utcutcluszw46l.R.inc(40347);println("}");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    protected void genDeserialzeObject(FieldInfo fieldInfo, int i) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40348);
        __CLR4_1_10utcutcluszw46l.R.inc(40349);print("if (lexer.matchField(");
        __CLR4_1_10utcutcluszw46l.R.inc(40350);printFieldPrefix(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40351);print(")) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40352);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40353);print("\t");
        __CLR4_1_10utcutcluszw46l.R.inc(40354);genSetFlag(i);
        __CLR4_1_10utcutcluszw46l.R.inc(40355);println("\tmatchedCount++;");

        // _deserObject
        __CLR4_1_10utcutcluszw46l.R.inc(40356);print("if (");
        __CLR4_1_10utcutcluszw46l.R.inc(40357);printFieldDeser(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40358);print(" == null) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40359);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40360);print("\t");
        __CLR4_1_10utcutcluszw46l.R.inc(40361);printFieldDeser(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40362);print(" = parser.getConfig().getDeserializer(");
        __CLR4_1_10utcutcluszw46l.R.inc(40363);printClassName(fieldInfo.fieldClass);
        __CLR4_1_10utcutcluszw46l.R.inc(40364);println(".class);");
        __CLR4_1_10utcutcluszw46l.R.inc(40365);println("}");

        __CLR4_1_10utcutcluszw46l.R.inc(40366);print("\t");
        __CLR4_1_10utcutcluszw46l.R.inc(40367);printFieldDeser(fieldInfo);
        __CLR4_1_10utcutcluszw46l.R.inc(40368);print(".deserialze(parser, ");
        __CLR4_1_10utcutcluszw46l.R.inc(40369);if ((((fieldInfo.fieldType instanceof Class)&&(__CLR4_1_10utcutcluszw46l.R.iget(40370)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40371)==0&false))) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40372);printClassName(fieldInfo.fieldClass);
            __CLR4_1_10utcutcluszw46l.R.inc(40373);print(".class");
        } }else {{
            __CLR4_1_10utcutcluszw46l.R.inc(40374);print("getFieldType(\"");
            __CLR4_1_10utcutcluszw46l.R.inc(40375);println(fieldInfo.name);
            __CLR4_1_10utcutcluszw46l.R.inc(40376);print("\")");
        }
        }__CLR4_1_10utcutcluszw46l.R.inc(40377);print(",\"");
        __CLR4_1_10utcutcluszw46l.R.inc(40378);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40379);println("\");");

        __CLR4_1_10utcutcluszw46l.R.inc(40380);println("\tif(parser.getResolveStatus() == DefaultJSONParser.NeedToResolve) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40381);println("\t\tResolveTask resolveTask = parser.getLastResolveTask();");
        __CLR4_1_10utcutcluszw46l.R.inc(40382);println("\t\tresolveTask.setOwnerContext(parser.getContext());");
        __CLR4_1_10utcutcluszw46l.R.inc(40383);print("\t\tresolveTask.setFieldDeserializer(this.getFieldDeserializer(\"");
        __CLR4_1_10utcutcluszw46l.R.inc(40384);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40385);println("\"));");
        __CLR4_1_10utcutcluszw46l.R.inc(40386);println("\t\tparser.setResolveStatus(DefaultJSONParser.NONE);");
        __CLR4_1_10utcutcluszw46l.R.inc(40387);println("\t}");
        __CLR4_1_10utcutcluszw46l.R.inc(40388);println("}");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void printFieldVarName(FieldInfo fieldInfo) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40389);
        __CLR4_1_10utcutcluszw46l.R.inc(40390);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40391);print("_gen");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void printFieldVarEnumName(FieldInfo fieldInfo) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40392);
        __CLR4_1_10utcutcluszw46l.R.inc(40393);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40394);print("_gen_enum_name");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void printFieldPrefix(FieldInfo fieldInfo) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40395);
        __CLR4_1_10utcutcluszw46l.R.inc(40396);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40397);print("_gen_prefix__");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void printListFieldItemDeser(FieldInfo fieldInfo) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40398);
        __CLR4_1_10utcutcluszw46l.R.inc(40399);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40400);print("_gen_list_item_deser__");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void printFieldDeser(FieldInfo fieldInfo) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40401);
        __CLR4_1_10utcutcluszw46l.R.inc(40402);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40403);print("_gen_deser__");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void printListFieldItemType(FieldInfo fieldInfo) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40404);
        __CLR4_1_10utcutcluszw46l.R.inc(40405);print(fieldInfo.name);
        __CLR4_1_10utcutcluszw46l.R.inc(40406);print("_gen_list_item_type__");
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    private void genSetFlag(int flag) throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40407);
        __CLR4_1_10utcutcluszw46l.R.inc(40408);String varName = "_asm_flag_" + (flag / 32);
        __CLR4_1_10utcutcluszw46l.R.inc(40409);print(varName);
        __CLR4_1_10utcutcluszw46l.R.inc(40410);print(" |= ");
        __CLR4_1_10utcutcluszw46l.R.inc(40411);print(Integer.toString(1 << flag));
        __CLR4_1_10utcutcluszw46l.R.inc(40412);print(";");
        __CLR4_1_10utcutcluszw46l.R.inc(40413);println();
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

    protected void genConstructor() throws IOException {try{__CLR4_1_10utcutcluszw46l.R.inc(40414);
        __CLR4_1_10utcutcluszw46l.R.inc(40415);for (int i = 0, size = beanInfo.fields.length; (((i < size)&&(__CLR4_1_10utcutcluszw46l.R.iget(40416)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40417)==0&false)); ++i) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40418);FieldInfo fieldInfo = beanInfo.fields[i];
            __CLR4_1_10utcutcluszw46l.R.inc(40419);print("private char[] ");
            __CLR4_1_10utcutcluszw46l.R.inc(40420);printFieldPrefix(fieldInfo);
            __CLR4_1_10utcutcluszw46l.R.inc(40421);print(" = \"\\\"");
            __CLR4_1_10utcutcluszw46l.R.inc(40422);print(fieldInfo.name);
            __CLR4_1_10utcutcluszw46l.R.inc(40423);print("\\\":\".toCharArray();");
            __CLR4_1_10utcutcluszw46l.R.inc(40424);println();
        }

        }__CLR4_1_10utcutcluszw46l.R.inc(40425);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40426);boolean fieldDeserFlag = false;
        __CLR4_1_10utcutcluszw46l.R.inc(40427);for (int i = 0, size = beanInfo.fields.length; (((i < size)&&(__CLR4_1_10utcutcluszw46l.R.iget(40428)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40429)==0&false)); ++i) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40430);FieldInfo fieldInfo = beanInfo.fields[i];
            __CLR4_1_10utcutcluszw46l.R.inc(40431);Class<?> fieldClass = fieldInfo.fieldClass;

            __CLR4_1_10utcutcluszw46l.R.inc(40432);if ((((fieldClass.isPrimitive())&&(__CLR4_1_10utcutcluszw46l.R.iget(40433)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40434)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40435);continue;
            }

            }__CLR4_1_10utcutcluszw46l.R.inc(40436);if ((((fieldClass.isEnum())&&(__CLR4_1_10utcutcluszw46l.R.iget(40437)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40438)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40439);continue;
            }

            }__CLR4_1_10utcutcluszw46l.R.inc(40440);print("private ObjectDeserializer ");

            __CLR4_1_10utcutcluszw46l.R.inc(40441);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_1_10utcutcluszw46l.R.iget(40442)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40443)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40444);printListFieldItemDeser(fieldInfo);
            } }else {{
                __CLR4_1_10utcutcluszw46l.R.inc(40445);printFieldDeser(fieldInfo);
            }
            }__CLR4_1_10utcutcluszw46l.R.inc(40446);println(";");
            __CLR4_1_10utcutcluszw46l.R.inc(40447);fieldDeserFlag = true;

            __CLR4_1_10utcutcluszw46l.R.inc(40448);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_1_10utcutcluszw46l.R.iget(40449)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40450)==0&false))) {{
                __CLR4_1_10utcutcluszw46l.R.inc(40451);print("private Type ");
                __CLR4_1_10utcutcluszw46l.R.inc(40452);printListFieldItemType(fieldInfo);
                __CLR4_1_10utcutcluszw46l.R.inc(40453);print(" = ");
                __CLR4_1_10utcutcluszw46l.R.inc(40454);Class<?> fieldItemClass = TypeUtils.getCollectionItemClass(fieldInfo.fieldType);
                __CLR4_1_10utcutcluszw46l.R.inc(40455);printClassName(fieldItemClass);
                __CLR4_1_10utcutcluszw46l.R.inc(40456);println(".class;");
            }
        }}

        }__CLR4_1_10utcutcluszw46l.R.inc(40457);if ((((fieldDeserFlag)&&(__CLR4_1_10utcutcluszw46l.R.iget(40458)!=0|true))||(__CLR4_1_10utcutcluszw46l.R.iget(40459)==0&false))) {{
            __CLR4_1_10utcutcluszw46l.R.inc(40460);println();
        }

        // constructor
        }__CLR4_1_10utcutcluszw46l.R.inc(40461);print("public ");
        __CLR4_1_10utcutcluszw46l.R.inc(40462);print(genClassName);
        __CLR4_1_10utcutcluszw46l.R.inc(40463);print(" (ParserConfig config, Class clazz) {");
        __CLR4_1_10utcutcluszw46l.R.inc(40464);incrementIndent();
        __CLR4_1_10utcutcluszw46l.R.inc(40465);println();

        __CLR4_1_10utcutcluszw46l.R.inc(40466);println("super(config, clazz);");

        __CLR4_1_10utcutcluszw46l.R.inc(40467);decrementIndent();
        __CLR4_1_10utcutcluszw46l.R.inc(40468);println();
        __CLR4_1_10utcutcluszw46l.R.inc(40469);print("}");
        __CLR4_1_10utcutcluszw46l.R.inc(40470);println();
    }finally{__CLR4_1_10utcutcluszw46l.R.flushNeeded();}}

}
