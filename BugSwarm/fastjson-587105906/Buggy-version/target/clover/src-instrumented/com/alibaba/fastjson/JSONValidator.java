/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

@java.lang.SuppressWarnings({"fallthrough"}) public abstract class JSONValidator implements Cloneable {public static class __CLR4_1_103rc3rcluszvsv5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,5263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public enum Type {
        Object, Array, Value
    }

    protected boolean eof;
    protected int pos = -1;
    protected char ch;
    protected Type type;

    protected int count = 0;
    protected boolean supportMultiValue = true;

    public static JSONValidator fromUtf8(byte[] jsonBytes) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(4872);
        __CLR4_1_103rc3rcluszvsv5.R.inc(4873);return new UTF8Validator(jsonBytes);
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    public static JSONValidator fromUtf8(InputStream is) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(4874);
        __CLR4_1_103rc3rcluszvsv5.R.inc(4875);return new UTF8InputStreamValidator(is);
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    public static JSONValidator from(String jsonStr) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(4876);
        __CLR4_1_103rc3rcluszvsv5.R.inc(4877);return new UTF16Validator(jsonStr);
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    public static JSONValidator from(Reader r) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(4878);
        __CLR4_1_103rc3rcluszvsv5.R.inc(4879);return new ReaderValidator(r);
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    public Type getType() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(4880);
        __CLR4_1_103rc3rcluszvsv5.R.inc(4881);return type;
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    abstract void next();

    public boolean validate() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(4882);

        __CLR4_1_103rc3rcluszvsv5.R.inc(4883);for (;;) {{
            __CLR4_1_103rc3rcluszvsv5.R.inc(4884);any();
            __CLR4_1_103rc3rcluszvsv5.R.inc(4885);count++;

            __CLR4_1_103rc3rcluszvsv5.R.inc(4886);if ((((supportMultiValue && !eof)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4887)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4888)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(4889);skipWhiteSpace();
                __CLR4_1_103rc3rcluszvsv5.R.inc(4890);if ((((eof)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4891)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4892)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4893);break;
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(4894);continue;
            } }else {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(4895);break;
            }
        }}

        }__CLR4_1_103rc3rcluszvsv5.R.inc(4896);return true;
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_1_103rc3rcluszvsv5.R.inc(4897);

    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    void any() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(4898);
        boolean __CLB4_1_10_bool0=false;__CLR4_1_103rc3rcluszvsv5.R.inc(4899);switch (ch) {
            case '{':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4900);__CLB4_1_10_bool0=true;}
                __CLR4_1_103rc3rcluszvsv5.R.inc(4901);next();
                __CLR4_1_103rc3rcluszvsv5.R.inc(4902);skipWhiteSpace();
                __CLR4_1_103rc3rcluszvsv5.R.inc(4903);if ((((ch == '}')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4904)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4905)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4906);next();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4907);type = Type.Object;
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4908);return;
                }

                }__CLR4_1_103rc3rcluszvsv5.R.inc(4909);for (;;) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4910);if ((((ch == '"')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4911)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4912)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4913);fieldName();
                    }
                    }else {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4914);error();
                    }

                    }__CLR4_1_103rc3rcluszvsv5.R.inc(4915);skipWhiteSpace();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4916);if ((((ch == ':')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4917)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4918)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4919);next();
                    }
                    }else {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4920);error();
                    }
                    }__CLR4_1_103rc3rcluszvsv5.R.inc(4921);skipWhiteSpace();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4922);any();

                    __CLR4_1_103rc3rcluszvsv5.R.inc(4923);skipWhiteSpace();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4924);if ((((ch == ',')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4925)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4926)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4927);next();
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4928);skipWhiteSpace();
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4929);continue;
                    } }else {__CLR4_1_103rc3rcluszvsv5.R.inc(4930);if ((((ch == '}')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4931)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4932)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4933);next();
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4934);type = Type.Object;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4935);return;
                    }
                }}}
            }case '[':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4936);__CLB4_1_10_bool0=true;}
                __CLR4_1_103rc3rcluszvsv5.R.inc(4937);next();
                __CLR4_1_103rc3rcluszvsv5.R.inc(4938);skipWhiteSpace();

                __CLR4_1_103rc3rcluszvsv5.R.inc(4939);if ((((ch == ']')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4940)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4941)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4942);next();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4943);type = Type.Array;
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4944);return;
                }

                }__CLR4_1_103rc3rcluszvsv5.R.inc(4945);for (; ; ) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4946);any();

                    __CLR4_1_103rc3rcluszvsv5.R.inc(4947);skipWhiteSpace();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4948);if ((((ch == ',')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4949)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4950)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4951);next();
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4952);skipWhiteSpace();
                    } }else {__CLR4_1_103rc3rcluszvsv5.R.inc(4953);if ((((ch == ']')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4954)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4955)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4956);next();
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4957);type = Type.Array;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4958);return;
                    }
                    }else {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4959);error();
                    }
                }}}
            }case '0':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4960);__CLB4_1_10_bool0=true;}
            case '1':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4961);__CLB4_1_10_bool0=true;}
            case '2':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4962);__CLB4_1_10_bool0=true;}
            case '3':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4963);__CLB4_1_10_bool0=true;}
            case '4':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4964);__CLB4_1_10_bool0=true;}
            case '5':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4965);__CLB4_1_10_bool0=true;}
            case '6':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4966);__CLB4_1_10_bool0=true;}
            case '7':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4967);__CLB4_1_10_bool0=true;}
            case '8':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4968);__CLB4_1_10_bool0=true;}
            case '9':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4969);__CLB4_1_10_bool0=true;}
            case '+':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4970);__CLB4_1_10_bool0=true;}
            case '-':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(4971);__CLB4_1_10_bool0=true;}
                __CLR4_1_103rc3rcluszvsv5.R.inc(4972);if ((((ch == '-' || ch == '+')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4973)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4974)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4975);next();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4976);skipWhiteSpace();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4977);if ((((ch < '0' || ch > '9')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4978)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4979)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4980);error();
                    }
                }}

                }__CLR4_1_103rc3rcluszvsv5.R.inc(4981);do {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4982);next();
                }
                }while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4983)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4984)==0&false)));

                __CLR4_1_103rc3rcluszvsv5.R.inc(4985);if ((((ch == '.')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4986)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4987)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4988);next();

                    __CLR4_1_103rc3rcluszvsv5.R.inc(4989);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4990)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4991)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(4992);next();
                    }
                }}

                }__CLR4_1_103rc3rcluszvsv5.R.inc(4993);if ((((ch == 'e' || ch == 'E')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4994)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4995)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4996);next();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(4997);if ((((ch == '-' || ch == '+')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(4998)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(4999)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5000);next();
                    }

                    }__CLR4_1_103rc3rcluszvsv5.R.inc(5001);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5002)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5003)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5004);next();
                    }
                    }else {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5005);error();
                    }

                    }__CLR4_1_103rc3rcluszvsv5.R.inc(5006);do {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5007);next();
                    }
                    }while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5008)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5009)==0&false)));
                }

                }__CLR4_1_103rc3rcluszvsv5.R.inc(5010);type = Type.Value;
                __CLR4_1_103rc3rcluszvsv5.R.inc(5011);break;
            case '"':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(5012);__CLB4_1_10_bool0=true;}
                __CLR4_1_103rc3rcluszvsv5.R.inc(5013);next();
                __CLR4_1_103rc3rcluszvsv5.R.inc(5014);for (;;) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5015);if ((((ch == '\\')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5016)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5017)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5018);next();
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5019);if ((((ch == 'u')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5020)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5021)==0&false))) {{
                            __CLR4_1_103rc3rcluszvsv5.R.inc(5022);next();

                            __CLR4_1_103rc3rcluszvsv5.R.inc(5023);next();
                            __CLR4_1_103rc3rcluszvsv5.R.inc(5024);next();
                            __CLR4_1_103rc3rcluszvsv5.R.inc(5025);next();
                            __CLR4_1_103rc3rcluszvsv5.R.inc(5026);next();
                        } }else {{
                            __CLR4_1_103rc3rcluszvsv5.R.inc(5027);next();
                        }
                    }} }else {__CLR4_1_103rc3rcluszvsv5.R.inc(5028);if ((((ch == '"')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5029)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5030)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5031);next();
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5032);type = Type.Value;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5033);return;
                    } }else {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5034);next();
                    }
                }}}
            }case 't':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(5035);__CLB4_1_10_bool0=true;}
                __CLR4_1_103rc3rcluszvsv5.R.inc(5036);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5037);if ((((ch != 'r')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5038)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5039)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5040);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5041);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5042);if ((((ch != 'u')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5043)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5044)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5045);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5046);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5047);if ((((ch != 'e')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5048)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5049)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5050);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5051);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5052);if ((((isWhiteSpace(ch) || ch == ',' || ch == ']' || ch == '}' || ch == '\0')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5053)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5054)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5055);type = Type.Value;
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5056);return;
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5057);error();
            case 'f':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(5058);__CLB4_1_10_bool0=true;}
                __CLR4_1_103rc3rcluszvsv5.R.inc(5059);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5060);if ((((ch != 'a')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5061)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5062)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5063);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5064);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5065);if ((((ch != 'l')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5066)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5067)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5068);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5069);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5070);if ((((ch != 's')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5071)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5072)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5073);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5074);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5075);if ((((ch != 'e')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5076)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5077)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5078);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5079);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5080);if ((((isWhiteSpace(ch) || ch == ',' || ch == ']' || ch == '}' || ch == '\0')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5081)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5082)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5083);type = Type.Value;
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5084);return;
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5085);error();
            case 'n':if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(5086);__CLB4_1_10_bool0=true;}
                __CLR4_1_103rc3rcluszvsv5.R.inc(5087);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5088);if ((((ch != 'u')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5089)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5090)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5091);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5092);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5093);if ((((ch != 'l')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5094)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5095)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5096);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5097);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5098);if ((((ch != 'l')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5099)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5100)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5101);error();
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5102);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5103);if ((((isWhiteSpace(ch) || ch == ',' || ch == ']' || ch == '}' || ch == '\0')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5104)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5105)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5106);type = Type.Value;
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5107);return;
                }
                }__CLR4_1_103rc3rcluszvsv5.R.inc(5108);error();
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_103rc3rcluszvsv5.R.inc(5109);__CLB4_1_10_bool0=true;}
                __CLR4_1_103rc3rcluszvsv5.R.inc(5110);error();
        }
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    protected void fieldName()
    {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5111);
        __CLR4_1_103rc3rcluszvsv5.R.inc(5112);next();
        __CLR4_1_103rc3rcluszvsv5.R.inc(5113);for (; ; ) {{
            __CLR4_1_103rc3rcluszvsv5.R.inc(5114);if ((((ch == '\\')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5115)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5116)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5117);next();

                __CLR4_1_103rc3rcluszvsv5.R.inc(5118);if ((((ch == 'u')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5119)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5120)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5121);next();

                    __CLR4_1_103rc3rcluszvsv5.R.inc(5122);next();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5123);next();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5124);next();
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5125);next();
                } }else {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5126);next();
                }
            }}
            }else {__CLR4_1_103rc3rcluszvsv5.R.inc(5127);if ((((ch == '"')&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5128)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5129)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5130);next();
                __CLR4_1_103rc3rcluszvsv5.R.inc(5131);break;
            }
            }else {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5132);next();
            }
        }}}
    }}finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    void error() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5133);
        __CLR4_1_103rc3rcluszvsv5.R.inc(5134);throw new JSONException("error : " + pos);
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    void skipWhiteSpace() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5135);
        __CLR4_1_103rc3rcluszvsv5.R.inc(5136);while ((((isWhiteSpace(ch))&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5137)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5138)==0&false))) {{
            __CLR4_1_103rc3rcluszvsv5.R.inc(5139);next();
        }
    }}finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    static final boolean isWhiteSpace(char ch) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5140);
        __CLR4_1_103rc3rcluszvsv5.R.inc(5141);return ch == ' '
                || ch == '\t'
                || ch == '\r'
                || ch == '\n'
                || ch == '\f'
                || ch == '\b'
                ;
    }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

    static class UTF8Validator extends JSONValidator {
        private final byte[] bytes;

        public UTF8Validator(byte[] bytes) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5142);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5143);this.bytes = bytes;
            __CLR4_1_103rc3rcluszvsv5.R.inc(5144);next();
            __CLR4_1_103rc3rcluszvsv5.R.inc(5145);skipWhiteSpace();
        }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

        void next() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5146);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5147);++pos;

            __CLR4_1_103rc3rcluszvsv5.R.inc(5148);if ((((pos >= bytes.length)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5149)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5150)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5151);ch = '\0';
                __CLR4_1_103rc3rcluszvsv5.R.inc(5152);eof = true;
            } }else {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5153);ch = (char) bytes[pos];
            }
        }}finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}
    }

    static class UTF8InputStreamValidator extends JSONValidator {
        private final static ThreadLocal<byte[]> bufLocal = new ThreadLocal<byte[]>();

        private final InputStream is;
        private byte[] buf;
        private int end = -1;
        private int readCount = 0;

        public UTF8InputStreamValidator(InputStream is) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5154);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5155);this.is = is;
            __CLR4_1_103rc3rcluszvsv5.R.inc(5156);buf = bufLocal.get();
            __CLR4_1_103rc3rcluszvsv5.R.inc(5157);if ((((buf != null)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5158)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5159)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5160);bufLocal.set(null);
            } }else {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5161);buf = new byte[1024 * 8];
            }

            }__CLR4_1_103rc3rcluszvsv5.R.inc(5162);next();
            __CLR4_1_103rc3rcluszvsv5.R.inc(5163);skipWhiteSpace();
        }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

        void next() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5164);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5165);if ((((pos < end)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5166)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5167)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5168);ch = (char) buf[++pos];
            } }else {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5169);if ((((!eof)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5170)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5171)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5172);int len;
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5173);try {
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5174);len = is.read(buf, 0, buf.length);
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5175);readCount++;
                    } catch (IOException ex) {
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5176);throw new JSONException("read error");
                    }

                    __CLR4_1_103rc3rcluszvsv5.R.inc(5177);if ((((len > 0)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5178)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5179)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5180);ch = (char) buf[0];
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5181);pos = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5182);end = len - 1;
                    }
                    }else {__CLR4_1_103rc3rcluszvsv5.R.inc(5183);if ((((len == -1)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5184)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5185)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5186);pos = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5187);end = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5188);buf = null;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5189);ch = '\0';
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5190);eof = true;
                    } }else {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5191);pos = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5192);end = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5193);buf = null;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5194);ch = '\0';
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5195);eof = true;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5196);throw new JSONException("read error");
                    }
                }}}
            }}
        }}finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

        void error() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5197);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5198);throw new JSONException("error, readCount " + readCount + ", valueCount : " + count + ", pos " + pos);
        }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

        public void close() throws IOException {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5199);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5200);bufLocal.set(buf);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5201);is.close();
        }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}
    }

    static class UTF16Validator extends JSONValidator {
        private final String str;

        public UTF16Validator(String str) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5202);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5203);this.str = str;
            __CLR4_1_103rc3rcluszvsv5.R.inc(5204);next();
            __CLR4_1_103rc3rcluszvsv5.R.inc(5205);skipWhiteSpace();
        }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

        void next() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5206);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5207);++pos;

            __CLR4_1_103rc3rcluszvsv5.R.inc(5208);if ((((pos >= str.length())&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5209)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5210)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5211);ch = '\0';
                __CLR4_1_103rc3rcluszvsv5.R.inc(5212);eof = true;
            } }else {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5213);ch = str.charAt(pos);
            }
        }}finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}
    }

    static class ReaderValidator extends JSONValidator {
        private final static ThreadLocal<char[]> bufLocal = new ThreadLocal<char[]>();

        final Reader r;

        private char[] buf;
        private int end = -1;
        private int readCount = 0;

        ReaderValidator(Reader r) {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5214);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5215);this.r = r;
            __CLR4_1_103rc3rcluszvsv5.R.inc(5216);buf = bufLocal.get();
            __CLR4_1_103rc3rcluszvsv5.R.inc(5217);if ((((buf != null)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5218)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5219)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5220);bufLocal.set(null);
            } }else {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5221);buf = new char[1024 * 8];
            }

            }__CLR4_1_103rc3rcluszvsv5.R.inc(5222);next();
            __CLR4_1_103rc3rcluszvsv5.R.inc(5223);skipWhiteSpace();
        }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

        void next() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5224);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5225);if ((((pos < end)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5226)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5227)==0&false))) {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5228);ch = buf[++pos];
            } }else {{
                __CLR4_1_103rc3rcluszvsv5.R.inc(5229);if ((((!eof)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5230)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5231)==0&false))) {{
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5232);int len;
                    __CLR4_1_103rc3rcluszvsv5.R.inc(5233);try {
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5234);len = r.read(buf, 0, buf.length);
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5235);readCount++;
                    } catch (IOException ex) {
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5236);throw new JSONException("read error");
                    }

                    __CLR4_1_103rc3rcluszvsv5.R.inc(5237);if ((((len > 0)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5238)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5239)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5240);ch = buf[0];
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5241);pos = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5242);end = len - 1;
                    }
                    }else {__CLR4_1_103rc3rcluszvsv5.R.inc(5243);if ((((len == -1)&&(__CLR4_1_103rc3rcluszvsv5.R.iget(5244)!=0|true))||(__CLR4_1_103rc3rcluszvsv5.R.iget(5245)==0&false))) {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5246);pos = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5247);end = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5248);buf = null;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5249);ch = '\0';
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5250);eof = true;
                    } }else {{
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5251);pos = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5252);end = 0;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5253);buf = null;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5254);ch = '\0';
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5255);eof = true;
                        __CLR4_1_103rc3rcluszvsv5.R.inc(5256);throw new JSONException("read error");
                    }
                }}}
            }}
        }}finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

        void error() {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5257);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5258);throw new JSONException("error, readCount " + readCount + ", valueCount : " + count + ", pos " + pos);
        }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}

        public void close() throws IOException {try{__CLR4_1_103rc3rcluszvsv5.R.inc(5259);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5260);bufLocal.set(buf);
            __CLR4_1_103rc3rcluszvsv5.R.inc(5261);r.close();__CLR4_1_103rc3rcluszvsv5.R.inc(5262);;
        }finally{__CLR4_1_103rc3rcluszvsv5.R.flushNeeded();}}
    }
}
