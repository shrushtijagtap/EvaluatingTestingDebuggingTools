/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson;

/**
 * @since 1.2.15
 */
@java.lang.SuppressWarnings({"fallthrough"}) public enum PropertyNamingStrategy {
                                    CamelCase, //
                                    PascalCase, //
                                    SnakeCase, //
                                    KebabCase;

    public String translate(String propertyName) {try{__CLR4_1_1045y45ylusqj7ew.R.inc(5398);
        boolean __CLB4_1_10_bool0=false;__CLR4_1_1045y45ylusqj7ew.R.inc(5399);switch (this) {
            case SnakeCase:if (!__CLB4_1_10_bool0) {__CLR4_1_1045y45ylusqj7ew.R.inc(5400);__CLB4_1_10_bool0=true;} {
                __CLR4_1_1045y45ylusqj7ew.R.inc(5401);StringBuilder buf = new StringBuilder();
                __CLR4_1_1045y45ylusqj7ew.R.inc(5402);for (int i = 0; (((i < propertyName.length())&&(__CLR4_1_1045y45ylusqj7ew.R.iget(5403)!=0|true))||(__CLR4_1_1045y45ylusqj7ew.R.iget(5404)==0&false)); ++i) {{
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5405);char ch = propertyName.charAt(i);
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5406);if ((((ch >= 'A' && ch <= 'Z')&&(__CLR4_1_1045y45ylusqj7ew.R.iget(5407)!=0|true))||(__CLR4_1_1045y45ylusqj7ew.R.iget(5408)==0&false))) {{
                        __CLR4_1_1045y45ylusqj7ew.R.inc(5409);char ch_ucase = (char) (ch + 32);
                        __CLR4_1_1045y45ylusqj7ew.R.inc(5410);if ((((i > 0)&&(__CLR4_1_1045y45ylusqj7ew.R.iget(5411)!=0|true))||(__CLR4_1_1045y45ylusqj7ew.R.iget(5412)==0&false))) {{
                            __CLR4_1_1045y45ylusqj7ew.R.inc(5413);buf.append('_');
                        }
                        }__CLR4_1_1045y45ylusqj7ew.R.inc(5414);buf.append(ch_ucase);
                    } }else {{
                        __CLR4_1_1045y45ylusqj7ew.R.inc(5415);buf.append(ch);
                    }
                }}
                }__CLR4_1_1045y45ylusqj7ew.R.inc(5416);return buf.toString();
            }
            case KebabCase:if (!__CLB4_1_10_bool0) {__CLR4_1_1045y45ylusqj7ew.R.inc(5417);__CLB4_1_10_bool0=true;} {
                __CLR4_1_1045y45ylusqj7ew.R.inc(5418);StringBuilder buf = new StringBuilder();
                __CLR4_1_1045y45ylusqj7ew.R.inc(5419);for (int i = 0; (((i < propertyName.length())&&(__CLR4_1_1045y45ylusqj7ew.R.iget(5420)!=0|true))||(__CLR4_1_1045y45ylusqj7ew.R.iget(5421)==0&false)); ++i) {{
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5422);char ch = propertyName.charAt(i);
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5423);if ((((ch >= 'A' && ch <= 'Z')&&(__CLR4_1_1045y45ylusqj7ew.R.iget(5424)!=0|true))||(__CLR4_1_1045y45ylusqj7ew.R.iget(5425)==0&false))) {{
                        __CLR4_1_1045y45ylusqj7ew.R.inc(5426);char ch_ucase = (char) (ch + 32);
                        __CLR4_1_1045y45ylusqj7ew.R.inc(5427);if ((((i > 0)&&(__CLR4_1_1045y45ylusqj7ew.R.iget(5428)!=0|true))||(__CLR4_1_1045y45ylusqj7ew.R.iget(5429)==0&false))) {{
                            __CLR4_1_1045y45ylusqj7ew.R.inc(5430);buf.append('-');
                        }
                        }__CLR4_1_1045y45ylusqj7ew.R.inc(5431);buf.append(ch_ucase);
                    } }else {{
                        __CLR4_1_1045y45ylusqj7ew.R.inc(5432);buf.append(ch);
                    }
                }}
                }__CLR4_1_1045y45ylusqj7ew.R.inc(5433);return buf.toString();
            }
            case PascalCase:if (!__CLB4_1_10_bool0) {__CLR4_1_1045y45ylusqj7ew.R.inc(5434);__CLB4_1_10_bool0=true;} {
                __CLR4_1_1045y45ylusqj7ew.R.inc(5435);char ch = propertyName.charAt(0);
                __CLR4_1_1045y45ylusqj7ew.R.inc(5436);if ((((ch >= 'a' && ch <= 'z')&&(__CLR4_1_1045y45ylusqj7ew.R.iget(5437)!=0|true))||(__CLR4_1_1045y45ylusqj7ew.R.iget(5438)==0&false))) {{
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5439);char[] chars = propertyName.toCharArray();
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5440);chars[0] -= 32;
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5441);return new String(chars);
                }

                }__CLR4_1_1045y45ylusqj7ew.R.inc(5442);return propertyName;
            }
            case CamelCase:if (!__CLB4_1_10_bool0) {__CLR4_1_1045y45ylusqj7ew.R.inc(5443);__CLB4_1_10_bool0=true;} {
                __CLR4_1_1045y45ylusqj7ew.R.inc(5444);char ch = propertyName.charAt(0);
                __CLR4_1_1045y45ylusqj7ew.R.inc(5445);if ((((ch >= 'A' && ch <= 'Z')&&(__CLR4_1_1045y45ylusqj7ew.R.iget(5446)!=0|true))||(__CLR4_1_1045y45ylusqj7ew.R.iget(5447)==0&false))) {{
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5448);char[] chars = propertyName.toCharArray();
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5449);chars[0] += 32;
                    __CLR4_1_1045y45ylusqj7ew.R.inc(5450);return new String(chars);
                }

                }__CLR4_1_1045y45ylusqj7ew.R.inc(5451);return propertyName;
            }
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_1045y45ylusqj7ew.R.inc(5452);__CLB4_1_10_bool0=true;}
                __CLR4_1_1045y45ylusqj7ew.R.inc(5453);return propertyName;
        }
    }finally{__CLR4_1_1045y45ylusqj7ew.R.flushNeeded();}}
;public static class __CLR4_1_1045y45ylusqj7ew{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,5454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
