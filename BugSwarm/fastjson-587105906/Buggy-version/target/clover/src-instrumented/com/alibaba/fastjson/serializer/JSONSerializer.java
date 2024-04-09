/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2018 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastjson.serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.GZIPOutputStream;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONSerializer extends SerializeFilterable {public static class __CLR4_1_10k3qk3qlusqjk9u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,26319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected final SerializeConfig                  config;
    public final SerializeWriter                     out;

    private int                                      indentCount = 0;
    private String                                   indent      = "\t";

    private String                                   dateFormatPattern;
    private DateFormat                               dateFormat;

    protected IdentityHashMap<Object, SerialContext> references  = null;
    protected SerialContext                          context;

    protected TimeZone                               timeZone    = JSON.defaultTimeZone;
    protected Locale                                 locale      = JSON.defaultLocale;

    public JSONSerializer(){
        this(new SerializeWriter(), SerializeConfig.getGlobalInstance());__CLR4_1_10k3qk3qlusqjk9u.R.inc(26055);try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26054);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public JSONSerializer(SerializeWriter out){
        this(out, SerializeConfig.getGlobalInstance());__CLR4_1_10k3qk3qlusqjk9u.R.inc(26057);try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26056);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public JSONSerializer(SerializeConfig config){
        this(new SerializeWriter(), config);__CLR4_1_10k3qk3qlusqjk9u.R.inc(26059);try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26058);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public JSONSerializer(SerializeWriter out, SerializeConfig config){try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26060);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26061);this.out = out;
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26062);this.config = config;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public String getDateFormatPattern() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26063);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26064);if ((((dateFormat instanceof SimpleDateFormat)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26065)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26066)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26067);return ((SimpleDateFormat) dateFormat).toPattern();
        }
        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26068);return dateFormatPattern;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public DateFormat getDateFormat() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26069);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26070);if ((((dateFormat == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26071)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26072)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26073);if ((((dateFormatPattern != null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26074)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26075)==0&false))) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26076);dateFormat = new SimpleDateFormat(dateFormatPattern, locale);
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26077);dateFormat.setTimeZone(timeZone);
            }
        }}

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26078);return dateFormat;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void setDateFormat(DateFormat dateFormat) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26079);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26080);this.dateFormat = dateFormat;
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26081);if ((((dateFormatPattern != null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26082)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26083)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26084);dateFormatPattern = null;
        }
    }}finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void setDateFormat(String dateFormat) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26085);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26086);this.dateFormatPattern = dateFormat;
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26087);if ((((this.dateFormat != null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26088)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26089)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26090);this.dateFormat = null;
        }
    }}finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public SerialContext getContext() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26091);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26092);return context;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void setContext(SerialContext context) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26093);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26094);this.context = context;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void setContext(SerialContext parent, Object object, Object fieldName, int features) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26095);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26096);this.setContext(parent, object, fieldName, features, 0);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void setContext(SerialContext parent, Object object, Object fieldName, int features, int fieldFeatures) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26097);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26098);if ((((out.disableCircularReferenceDetect)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26099)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26100)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26101);return;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26102);this.context = new SerialContext(parent, object, fieldName, features, fieldFeatures);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26103);if ((((references == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26104)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26105)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26106);references = new IdentityHashMap<Object, SerialContext>();
        }
        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26107);this.references.put(object, context);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void setContext(Object object, Object fieldName) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26108);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26109);this.setContext(context, object, fieldName, 0);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void popContext() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26110);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26111);if ((((context != null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26112)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26113)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26114);this.context = this.context.parent;
        }
    }}finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public final boolean isWriteClassName(Type fieldType, Object obj) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26115);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26116);return out.isEnabled(SerializerFeature.WriteClassName) //
               && (fieldType != null //
                   || (!out.isEnabled(SerializerFeature.NotWriteRootClassName)) //
                   || (context != null && (context.parent != null)));
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public boolean containsReference(Object value) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26117);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26118);if ((((references == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26119)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26120)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26121);return false;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26122);SerialContext refContext = references.get(value);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26123);if ((((refContext == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26124)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26125)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26126);return false;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26127);if ((((value == Collections.emptyMap())&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26128)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26129)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26130);return false;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26131);Object fieldName = refContext.fieldName;

        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26132);return fieldName == null || fieldName instanceof Integer || fieldName instanceof String;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void writeReference(Object object) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26133);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26134);SerialContext context = this.context;
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26135);Object current = context.object;

        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26136);if ((((object == current)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26137)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26138)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26139);out.write("{\"$ref\":\"@\"}");
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26140);return;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26141);SerialContext parentContext = context.parent;

        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26142);if ((((parentContext != null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26143)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26144)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26145);if ((((object == parentContext.object)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26146)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26147)==0&false))) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26148);out.write("{\"$ref\":\"..\"}");
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26149);return;
            }
        }}

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26150);SerialContext rootContext = context;
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26151);for (;;) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26152);if ((((rootContext.parent == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26153)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26154)==0&false))) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26155);break;
            }
            }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26156);rootContext = rootContext.parent;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26157);if ((((object == rootContext.object)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26158)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26159)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26160);out.write("{\"$ref\":\"$\"}");
        } }else {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26161);out.write("{\"$ref\":\"");
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26162);String path = references.get(object).toString();
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26163);out.write(path);
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26164);out.write("\"}");
        }
    }}finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public boolean checkValue(SerializeFilterable filterable) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26165);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26166);return (valueFilters != null && valueFilters.size() > 0) //
               || (contextValueFilters != null && contextValueFilters.size() > 0) //
               || (filterable.valueFilters != null && filterable.valueFilters.size() > 0)
               || (filterable.contextValueFilters != null && filterable.contextValueFilters.size() > 0)
               || out.writeNonStringValueAsString;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}
    
    public boolean hasNameFilters(SerializeFilterable filterable) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26167);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26168);return (nameFilters != null && nameFilters.size() > 0) //
               || (filterable.nameFilters != null && filterable.nameFilters.size() > 0);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public boolean hasPropertyFilters(SerializeFilterable filterable) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26169);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26170);return (propertyFilters != null && propertyFilters.size() > 0) //
                || (filterable.propertyFilters != null && filterable.propertyFilters.size() > 0);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public int getIndentCount() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26171);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26172);return indentCount;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void incrementIndent() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26173);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26174);indentCount++;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void decrementIdent() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26175);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26176);indentCount--;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void println() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26177);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26178);out.write('\n');
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26179);for (int i = 0; (((i < indentCount)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26180)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26181)==0&false)); ++i) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26182);out.write(indent);
        }
    }}finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public SerializeWriter getWriter() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26183);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26184);return out;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public String toString() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26185);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26186);return out.toString();
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void config(SerializerFeature feature, boolean state) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26187);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26188);out.config(feature, state);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public boolean isEnabled(SerializerFeature feature) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26189);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26190);return out.isEnabled(feature);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void writeNull() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26191);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26192);this.out.writeNull();
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public SerializeConfig getMapping() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26193);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26194);return config;
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public static void write(Writer out, Object object) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26195);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26196);SerializeWriter writer = new SerializeWriter();
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26197);try {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26198);JSONSerializer serializer = new JSONSerializer(writer);
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26199);serializer.write(object);
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26200);writer.writeTo(out);
        } catch (IOException ex) {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26201);throw new JSONException(ex.getMessage(), ex);
        } finally {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26202);writer.close();
        }
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public static void write(SerializeWriter out, Object object) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26203);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26204);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26205);serializer.write(object);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public final void write(Object object) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26206);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26207);if ((((object == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26208)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26209)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26210);out.writeNull();
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26211);return;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26212);Class<?> clazz = object.getClass();
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26213);ObjectSerializer writer = getObjectWriter(clazz);

        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26214);try {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26215);writer.write(this, object, null, null, 0);
        } catch (IOException e) {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26216);throw new JSONException(e.getMessage(), e);
        }
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    /**
     * @since 1.2.57
     *
     */
    public final void writeAs(Object object, Class type) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26217);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26218);if ((((object == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26219)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26220)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26221);out.writeNull();
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26222);return;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26223);ObjectSerializer writer = getObjectWriter(type);

        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26224);try {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26225);writer.write(this, object, null, null, 0);
        } catch (IOException e) {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26226);throw new JSONException(e.getMessage(), e);
        }
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public final void writeWithFieldName(Object object, Object fieldName) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26227);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26228);writeWithFieldName(object, fieldName, null, 0);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    protected final void writeKeyValue(char seperator, String key, Object value) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26229);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26230);if ((((seperator != '\0')&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26231)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26232)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26233);out.write(seperator);
        }
        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26234);out.writeFieldName(key);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26235);write(value);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public final void writeWithFieldName(Object object, Object fieldName, Type fieldType, int fieldFeatures) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26236);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26237);try {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26238);if ((((object == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26239)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26240)==0&false))) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26241);out.writeNull();
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26242);return;
            }

            }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26243);Class<?> clazz = object.getClass();

            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26244);ObjectSerializer writer = getObjectWriter(clazz);

            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26245);writer.write(this, object, fieldName, fieldType, fieldFeatures);
        } catch (IOException e) {
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26246);throw new JSONException(e.getMessage(), e);
        }
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public final void writeWithFormat(Object object, String format) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26247);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26248);if ((((object instanceof Date)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26249)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26250)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26251);if (((("unixtime".equals(format))&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26252)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26253)==0&false))) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26254);long seconds = ((Date) object).getTime() / 1000L;
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26255);out.writeInt((int) seconds);
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26256);return;
            }
            }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26257);DateFormat dateFormat = this.getDateFormat();
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26258);if ((((dateFormat == null)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26259)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26260)==0&false))) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26261);try {
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26262);dateFormat = new SimpleDateFormat(format, locale);
                } catch (IllegalArgumentException e) {
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26263);String format2 = format.replaceAll("T", "'T'");
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26264);dateFormat = new SimpleDateFormat(format2, locale);
                }
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26265);dateFormat.setTimeZone(timeZone);
            }
            }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26266);String text = dateFormat.format((Date) object);
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26267);out.writeString(text);
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26268);return;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26269);if ((((object instanceof byte[])&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26270)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26271)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26272);byte[] bytes = (byte[]) object;
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26273);if (((("gzip".equals(format) || "gzip,base64".equals(format))&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26274)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26275)==0&false))) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26276);GZIPOutputStream gzipOut = null;
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26277);try {
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26278);ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26279);if ((((bytes.length < 512)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26280)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26281)==0&false))) {{
                        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26282);gzipOut = new GZIPOutputStream(byteOut, bytes.length);
                    } }else {{
                        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26283);gzipOut = new GZIPOutputStream(byteOut);
                    }
                    }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26284);gzipOut.write(bytes);
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26285);gzipOut.finish();
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26286);out.writeByteArray(byteOut.toByteArray());
                } catch (IOException ex) {
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26287);throw new JSONException("write gzipBytes error", ex);
                } finally {
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26288);IOUtils.close(gzipOut);
                }
            } }else {__CLR4_1_10k3qk3qlusqjk9u.R.inc(26289);if (((("hex".equals(format))&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26290)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26291)==0&false))) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26292);out.writeHex(bytes);
            } }else {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26293);out.writeByteArray(bytes);
            }
            }}__CLR4_1_10k3qk3qlusqjk9u.R.inc(26294);return;
        }

        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26295);if ((((object instanceof Collection)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26296)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26297)==0&false))) {{
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26298);Collection collection = (Collection) object;
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26299);Iterator iterator = collection.iterator();
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26300);out.write('[');
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26301);for (int i = 0; (((i < collection.size())&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26302)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26303)==0&false)); i++) {{
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26304);Object item = iterator.next();
                __CLR4_1_10k3qk3qlusqjk9u.R.inc(26305);if ((((i != 0)&&(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26306)!=0|true))||(__CLR4_1_10k3qk3qlusqjk9u.R.iget(26307)==0&false))) {{
                    __CLR4_1_10k3qk3qlusqjk9u.R.inc(26308);out.write(',');
                }
                }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26309);writeWithFormat(item, format);
            }
            }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26310);out.write(']');
            __CLR4_1_10k3qk3qlusqjk9u.R.inc(26311);return;
        }
        }__CLR4_1_10k3qk3qlusqjk9u.R.inc(26312);write(object);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public final void write(String text) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26313);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26314);StringCodec.instance.write(this, text);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public ObjectSerializer getObjectWriter(Class<?> clazz) {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26315);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26316);return config.getObjectWriter(clazz);
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}

    public void close() {try{__CLR4_1_10k3qk3qlusqjk9u.R.inc(26317);
        __CLR4_1_10k3qk3qlusqjk9u.R.inc(26318);this.out.close();
    }finally{__CLR4_1_10k3qk3qlusqjk9u.R.flushNeeded();}}
   
}
