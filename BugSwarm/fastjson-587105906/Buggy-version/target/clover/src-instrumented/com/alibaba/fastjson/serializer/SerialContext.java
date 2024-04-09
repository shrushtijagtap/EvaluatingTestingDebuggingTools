/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.serializer;

public class SerialContext {public static class __CLR4_1_10m04m04lusqjlmb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,28588,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final SerialContext parent;
    public final Object        object;
    public final Object        fieldName;
    public final int           features;

    public SerialContext(SerialContext parent, Object object, Object fieldName, int features, int fieldFeatures){try{__CLR4_1_10m04m04lusqjlmb.R.inc(28516);
        __CLR4_1_10m04m04lusqjlmb.R.inc(28517);this.parent = parent;
        __CLR4_1_10m04m04lusqjlmb.R.inc(28518);this.object = object;
        __CLR4_1_10m04m04lusqjlmb.R.inc(28519);this.fieldName = fieldName;
        __CLR4_1_10m04m04lusqjlmb.R.inc(28520);this.features = features;
    }finally{__CLR4_1_10m04m04lusqjlmb.R.flushNeeded();}}

    public String toString() {try{__CLR4_1_10m04m04lusqjlmb.R.inc(28521);
        __CLR4_1_10m04m04lusqjlmb.R.inc(28522);if ((((parent == null)&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28523)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28524)==0&false))) {{
            __CLR4_1_10m04m04lusqjlmb.R.inc(28525);return "$";
        } }else {{
            __CLR4_1_10m04m04lusqjlmb.R.inc(28526);StringBuilder buf = new StringBuilder();
            __CLR4_1_10m04m04lusqjlmb.R.inc(28527);toString(buf);
            __CLR4_1_10m04m04lusqjlmb.R.inc(28528);return buf.toString();
        }
    }}finally{__CLR4_1_10m04m04lusqjlmb.R.flushNeeded();}}

    protected void toString(StringBuilder buf) {try{__CLR4_1_10m04m04lusqjlmb.R.inc(28529);
        __CLR4_1_10m04m04lusqjlmb.R.inc(28530);if ((((parent == null)&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28531)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28532)==0&false))) {{
            __CLR4_1_10m04m04lusqjlmb.R.inc(28533);buf.append('$');
        } }else {{
            __CLR4_1_10m04m04lusqjlmb.R.inc(28534);parent.toString(buf);
            __CLR4_1_10m04m04lusqjlmb.R.inc(28535);if ((((fieldName == null)&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28536)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28537)==0&false))) {{
                __CLR4_1_10m04m04lusqjlmb.R.inc(28538);buf.append(".null");
            } }else {__CLR4_1_10m04m04lusqjlmb.R.inc(28539);if ((((fieldName instanceof Integer)&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28540)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28541)==0&false))) {{
                __CLR4_1_10m04m04lusqjlmb.R.inc(28542);buf.append('[');
                __CLR4_1_10m04m04lusqjlmb.R.inc(28543);buf.append(((Integer)fieldName).intValue());
                __CLR4_1_10m04m04lusqjlmb.R.inc(28544);buf.append(']');
            } }else {{
                __CLR4_1_10m04m04lusqjlmb.R.inc(28545);buf.append('.');

                __CLR4_1_10m04m04lusqjlmb.R.inc(28546);String fieldName = this.fieldName.toString();
                __CLR4_1_10m04m04lusqjlmb.R.inc(28547);boolean special = false;
                __CLR4_1_10m04m04lusqjlmb.R.inc(28548);for (int i = 0; (((i < fieldName.length())&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28549)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28550)==0&false)); ++i) {{
                    __CLR4_1_10m04m04lusqjlmb.R.inc(28551);char ch = fieldName.charAt(i);
                    __CLR4_1_10m04m04lusqjlmb.R.inc(28552);if (((((ch >= '0' && ch <='9') || (ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <='z') || ch > 128)&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28553)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28554)==0&false))) {{
                        __CLR4_1_10m04m04lusqjlmb.R.inc(28555);continue;
                    }
                    }__CLR4_1_10m04m04lusqjlmb.R.inc(28556);special = true;
                    __CLR4_1_10m04m04lusqjlmb.R.inc(28557);break;
                }

                }__CLR4_1_10m04m04lusqjlmb.R.inc(28558);if ((((special)&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28559)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28560)==0&false))) {{
                    __CLR4_1_10m04m04lusqjlmb.R.inc(28561);for (int i = 0; (((i < fieldName.length())&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28562)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28563)==0&false)); ++i) {{
                        __CLR4_1_10m04m04lusqjlmb.R.inc(28564);char ch = fieldName.charAt(i);
                        __CLR4_1_10m04m04lusqjlmb.R.inc(28565);if ((((ch == '\\')&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28566)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28567)==0&false))) {{
                            __CLR4_1_10m04m04lusqjlmb.R.inc(28568);buf.append('\\');
                            __CLR4_1_10m04m04lusqjlmb.R.inc(28569);buf.append('\\');
                            __CLR4_1_10m04m04lusqjlmb.R.inc(28570);buf.append('\\');
                        } }else {__CLR4_1_10m04m04lusqjlmb.R.inc(28571);if (((((ch >= '0' && ch <='9') || (ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <='z') || ch > 128)&&(__CLR4_1_10m04m04lusqjlmb.R.iget(28572)!=0|true))||(__CLR4_1_10m04m04lusqjlmb.R.iget(28573)==0&false))) {{
                            __CLR4_1_10m04m04lusqjlmb.R.inc(28574);buf.append(ch);
                            __CLR4_1_10m04m04lusqjlmb.R.inc(28575);continue;
                        } }else {{
                            __CLR4_1_10m04m04lusqjlmb.R.inc(28576);buf.append('\\');
                            __CLR4_1_10m04m04lusqjlmb.R.inc(28577);buf.append('\\');
                        }
                        }}__CLR4_1_10m04m04lusqjlmb.R.inc(28578);buf.append(ch);
                    }
                }} }else {{
                    __CLR4_1_10m04m04lusqjlmb.R.inc(28579);buf.append(fieldName);
                }
            }}
        }}}
    }}finally{__CLR4_1_10m04m04lusqjlmb.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public SerialContext getParent() {try{__CLR4_1_10m04m04lusqjlmb.R.inc(28580);
        __CLR4_1_10m04m04lusqjlmb.R.inc(28581);return parent;
    }finally{__CLR4_1_10m04m04lusqjlmb.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public Object getObject() {try{__CLR4_1_10m04m04lusqjlmb.R.inc(28582);
        __CLR4_1_10m04m04lusqjlmb.R.inc(28583);return object;
    }finally{__CLR4_1_10m04m04lusqjlmb.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public Object getFieldName() {try{__CLR4_1_10m04m04lusqjlmb.R.inc(28584);
        __CLR4_1_10m04m04lusqjlmb.R.inc(28585);return fieldName;
    }finally{__CLR4_1_10m04m04lusqjlmb.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public String getPath() {try{__CLR4_1_10m04m04lusqjlmb.R.inc(28586);
        __CLR4_1_10m04m04lusqjlmb.R.inc(28587);return toString();
    }finally{__CLR4_1_10m04m04lusqjlmb.R.flushNeeded();}}
}
