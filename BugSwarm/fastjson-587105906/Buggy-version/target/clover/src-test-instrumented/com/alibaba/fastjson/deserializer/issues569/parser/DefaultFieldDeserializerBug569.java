/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.deserializer.issues569.parser;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.util.FieldInfo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Author : BlackShadowWalker
 * Date   : 2016-10-10
 */
public class DefaultFieldDeserializerBug569 extends DefaultFieldDeserializer {public static class __CLR4_1_10vdsvdsluszw4ad{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,40709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public DefaultFieldDeserializerBug569(ParserConfig mapping, Class<?> clazz, FieldInfo fieldInfo) {
        super(mapping, clazz, fieldInfo);__CLR4_1_10vdsvdsluszw4ad.R.inc(40673);try{__CLR4_1_10vdsvdsluszw4ad.R.inc(40672);
    }finally{__CLR4_1_10vdsvdsluszw4ad.R.flushNeeded();}}

    @Override
    public void parseField(DefaultJSONParser parser, Object object, Type objectType, Map<String, Object> fieldValues) {try{__CLR4_1_10vdsvdsluszw4ad.R.inc(40674);
        __CLR4_1_10vdsvdsluszw4ad.R.inc(40675);if ((((fieldValueDeserilizer == null)&&(__CLR4_1_10vdsvdsluszw4ad.R.iget(40676)!=0|true))||(__CLR4_1_10vdsvdsluszw4ad.R.iget(40677)==0&false))) {{
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40678);getFieldValueDeserilizer(parser.getConfig());
        }

        }__CLR4_1_10vdsvdsluszw4ad.R.inc(40679);Type fieldType = fieldInfo.fieldType;
        __CLR4_1_10vdsvdsluszw4ad.R.inc(40680);if ((((objectType instanceof ParameterizedType)&&(__CLR4_1_10vdsvdsluszw4ad.R.iget(40681)!=0|true))||(__CLR4_1_10vdsvdsluszw4ad.R.iget(40682)==0&false))) {{
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40683);ParseContext objContext = parser.getContext();
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40684);objContext.type = objectType;
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40685);fieldType = FieldInfo.getFieldType(this.clazz, objectType, fieldType);
        }

        // ContextObjectDeserializer
        }__CLR4_1_10vdsvdsluszw4ad.R.inc(40686);Object value;
        __CLR4_1_10vdsvdsluszw4ad.R.inc(40687);if ((((fieldValueDeserilizer instanceof JavaBeanDeserializer)&&(__CLR4_1_10vdsvdsluszw4ad.R.iget(40688)!=0|true))||(__CLR4_1_10vdsvdsluszw4ad.R.iget(40689)==0&false))) {{
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40690);JavaBeanDeserializer javaBeanDeser = (JavaBeanDeserializer) fieldValueDeserilizer;
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40691);value = javaBeanDeser.deserialze(parser, fieldType, fieldInfo.name, fieldInfo.parserFeatures);
        } }else {{
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40692);if ((((this.fieldInfo.format != null && fieldValueDeserilizer instanceof ContextObjectDeserializer)&&(__CLR4_1_10vdsvdsluszw4ad.R.iget(40693)!=0|true))||(__CLR4_1_10vdsvdsluszw4ad.R.iget(40694)==0&false))) {{
                __CLR4_1_10vdsvdsluszw4ad.R.inc(40695);value = ((ContextObjectDeserializer) fieldValueDeserilizer) //
                        .deserialze(parser, fieldType,
                                fieldInfo.name,
                                fieldInfo.format,
                                fieldInfo.parserFeatures);
            } }else {{
                __CLR4_1_10vdsvdsluszw4ad.R.inc(40696);value = fieldValueDeserilizer.deserialze(parser, fieldType, fieldInfo.name);
            }
        }}
        }__CLR4_1_10vdsvdsluszw4ad.R.inc(40697);if ((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_1_10vdsvdsluszw4ad.R.iget(40698)!=0|true))||(__CLR4_1_10vdsvdsluszw4ad.R.iget(40699)==0&false))) {{
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40700);DefaultJSONParser.ResolveTask task = parser.getLastResolveTask();
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40701);task.fieldDeserializer = this;
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40702);task.ownerContext = parser.getContext();
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40703);parser.setResolveStatus(DefaultJSONParser.NONE);
        } }else {{
            __CLR4_1_10vdsvdsluszw4ad.R.inc(40704);if ((((object == null)&&(__CLR4_1_10vdsvdsluszw4ad.R.iget(40705)!=0|true))||(__CLR4_1_10vdsvdsluszw4ad.R.iget(40706)==0&false))) {{
                __CLR4_1_10vdsvdsluszw4ad.R.inc(40707);fieldValues.put(fieldInfo.name, value);
            } }else {{
                __CLR4_1_10vdsvdsluszw4ad.R.inc(40708);setValue(object, value);
            }
        }}
    }}finally{__CLR4_1_10vdsvdsluszw4ad.R.flushNeeded();}}

}
