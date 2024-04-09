/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.performance;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONException;
import com.alibaba.json.test.entity.Company;
import com.alibaba.json.test.entity.Department;
import com.alibaba.json.test.entity.Employee;
import com.alibaba.json.test.entity.Group;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JacksonGroupParser {public static class __CLR4_1_10276y276ylusqkw9l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,102887,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private JsonParser parser;

    public JacksonGroupParser(JsonParser parser) throws Exception{try{__CLR4_1_10276y276ylusqkw9l.R.inc(102634);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102635);this.parser = parser;
        __CLR4_1_10276y276ylusqkw9l.R.inc(102636);parser.nextToken(); // move to the start of the
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    public Group parseGroup() throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102637);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102638);Group group = new Group();

        __CLR4_1_10276y276ylusqkw9l.R.inc(102639);accept(JsonToken.START_OBJECT);

        __CLR4_1_10276y276ylusqkw9l.R.inc(102640);for (;;) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102641);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_10276y276ylusqkw9l.R.inc(102642);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102643)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102644)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102645);break;
            }

            }__CLR4_1_10276y276ylusqkw9l.R.inc(102646);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102647)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102648)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102649);String name = parser.getCurrentName();
                __CLR4_1_10276y276ylusqkw9l.R.inc(102650);tok = parser.nextToken();

                __CLR4_1_10276y276ylusqkw9l.R.inc(102651);if (((("name" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102652)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102653)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102654);group.setName(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102655);if (((("description" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102656)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102657)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102658);group.setDescription(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102659);if (((("companies" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102660)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102661)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102662);parseCompany(group.getCompanies());
                } }else {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102663);throw new RuntimeException("not match property : " + name);
                }
            }}}}
        }}

        }__CLR4_1_10276y276ylusqkw9l.R.inc(102664);accept(JsonToken.END_OBJECT);

        __CLR4_1_10276y276ylusqkw9l.R.inc(102665);return group;
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private Company parseCompany() throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102666);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102667);Company company = new Company();

        __CLR4_1_10276y276ylusqkw9l.R.inc(102668);accept(JsonToken.START_OBJECT);

        __CLR4_1_10276y276ylusqkw9l.R.inc(102669);for (;;) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102670);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_10276y276ylusqkw9l.R.inc(102671);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102672)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102673)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102674);break;
            }

            }__CLR4_1_10276y276ylusqkw9l.R.inc(102675);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102676)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102677)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102678);String name = parser.getCurrentName();
                __CLR4_1_10276y276ylusqkw9l.R.inc(102679);tok = parser.nextToken();

                __CLR4_1_10276y276ylusqkw9l.R.inc(102680);if (((("name" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102681)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102682)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102683);company.setName(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102684);if (((("description" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102685)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102686)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102687);company.setDescription(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102688);if (((("stock" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102689)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102690)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102691);company.setStock(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102692);if (((("id" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102693)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102694)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102695);company.setId(acceptLong(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102696);if (((("rootDepartment" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102697)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102698)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102699);company.setRootDepartment(parseDepartment());
                } }else {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102700);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}
        }}

        }__CLR4_1_10276y276ylusqkw9l.R.inc(102701);accept(JsonToken.END_OBJECT);

        __CLR4_1_10276y276ylusqkw9l.R.inc(102702);return company;
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private Department parseDepartment() throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102703);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102704);accept(JsonToken.START_OBJECT);

        __CLR4_1_10276y276ylusqkw9l.R.inc(102705);Department company = new Department();

        __CLR4_1_10276y276ylusqkw9l.R.inc(102706);for (;;) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102707);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_10276y276ylusqkw9l.R.inc(102708);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102709)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102710)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102711);break;
            }

            }__CLR4_1_10276y276ylusqkw9l.R.inc(102712);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102713)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102714)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102715);String name = parser.getCurrentName();
                __CLR4_1_10276y276ylusqkw9l.R.inc(102716);tok = parser.nextToken();

                __CLR4_1_10276y276ylusqkw9l.R.inc(102717);if (((("name" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102718)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102719)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102720);company.setName(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102721);if (((("description" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102722)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102723)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102724);company.setDescription(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102725);if (((("id" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102726)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102727)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102728);company.setId(acceptLong(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102729);if (((("children" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102730)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102731)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102732);parseDepartment(company.getChildren());
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102733);if (((("members" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102734)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102735)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102736);parseEmployee(company.getMembers());
                } }else {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102737);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}
        }}

        }__CLR4_1_10276y276ylusqkw9l.R.inc(102738);accept(JsonToken.END_OBJECT);

        __CLR4_1_10276y276ylusqkw9l.R.inc(102739);return company;
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private Employee parseEmployee() throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102740);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102741);accept(JsonToken.START_OBJECT);

        __CLR4_1_10276y276ylusqkw9l.R.inc(102742);Employee emp = new Employee();

        __CLR4_1_10276y276ylusqkw9l.R.inc(102743);for (;;) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102744);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_10276y276ylusqkw9l.R.inc(102745);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102746)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102747)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102748);break;
            }

            }__CLR4_1_10276y276ylusqkw9l.R.inc(102749);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102750)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102751)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102752);String name = parser.getCurrentName();
                __CLR4_1_10276y276ylusqkw9l.R.inc(102753);tok = parser.nextToken();

                __CLR4_1_10276y276ylusqkw9l.R.inc(102754);if (((("name" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102755)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102756)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102757);emp.setName(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102758);if (((("description" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102759)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102760)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102761);emp.setDescription(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102762);if (((("number" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102763)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102764)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102765);emp.setNumber(acceptString(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102766);if (((("id" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102767)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102768)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102769);emp.setId(acceptLong(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102770);if (((("age" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102771)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102772)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102773);emp.setAge(acceptInteger(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102774);if (((("salary" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102775)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102776)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102777);emp.setSalary(acceptBigDecimal(tok));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102778);if (((("birthdate" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102779)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102780)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102781);emp.setBirthdate(new Date(acceptLong(tok)));
                } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102782);if (((("badboy" == name)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102783)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102784)==0&false))) {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102785);emp.setBadboy(acceptBoolean(tok));
                } }else {{
                    __CLR4_1_10276y276ylusqkw9l.R.inc(102786);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}}}}
        }}

        }__CLR4_1_10276y276ylusqkw9l.R.inc(102787);accept(JsonToken.END_OBJECT);

        __CLR4_1_10276y276ylusqkw9l.R.inc(102788);return emp;
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private void parseEmployee(List<Employee> list) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102789);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102790);accept(JsonToken.START_ARRAY);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102791);for (;;) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102792);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_10276y276ylusqkw9l.R.inc(102793);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102794)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102795)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102796);break;
            }

            }__CLR4_1_10276y276ylusqkw9l.R.inc(102797);list.add(parseEmployee());
        }
        }__CLR4_1_10276y276ylusqkw9l.R.inc(102798);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private void parseDepartment(List<Department> list) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102799);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102800);accept(JsonToken.START_ARRAY);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102801);for (;;) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102802);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_10276y276ylusqkw9l.R.inc(102803);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102804)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102805)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102806);break;
            }

            }__CLR4_1_10276y276ylusqkw9l.R.inc(102807);list.add(parseDepartment());
        }
        }__CLR4_1_10276y276ylusqkw9l.R.inc(102808);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private void parseCompany(List<Company> list) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102809);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102810);accept(JsonToken.START_ARRAY);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102811);for (;;) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102812);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_10276y276ylusqkw9l.R.inc(102813);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102814)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102815)==0&false))) {{
                __CLR4_1_10276y276ylusqkw9l.R.inc(102816);break;
            }

            }__CLR4_1_10276y276ylusqkw9l.R.inc(102817);list.add(parseCompany());
        }
        }__CLR4_1_10276y276ylusqkw9l.R.inc(102818);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private String acceptString() throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102819);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102820);if ((((parser.getCurrentToken() == JsonToken.VALUE_STRING)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102821)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102822)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102823);String stringValue = parser.getText();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102824);parser.nextToken();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102825);return stringValue;
        } }else {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102826);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private String acceptString(JsonToken token) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102827);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102828);if ((((token == JsonToken.VALUE_STRING)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102829)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102830)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102831);String stringValue = parser.getText();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102832);parser.nextToken();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102833);return stringValue;
        } }else {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102834);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private Long acceptLong(JsonToken token) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102835);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102836);if ((((token == JsonToken.VALUE_NUMBER_INT)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102837)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102838)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102839);long value = parser.getLongValue();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102840);parser.nextToken();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102841);return value;
        } }else {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102842);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private boolean acceptBoolean(JsonToken token) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102843);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102844);if ((((token == JsonToken.VALUE_TRUE)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102845)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102846)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102847);parser.nextToken();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102848);return true;
        } }else {__CLR4_1_10276y276ylusqkw9l.R.inc(102849);if ((((token == JsonToken.VALUE_FALSE)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102850)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102851)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102852);parser.nextToken();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102853);return false;
        } }else {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102854);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}}finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private BigDecimal acceptBigDecimal(JsonToken token) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102855);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102856);if ((((token == JsonToken.VALUE_NUMBER_FLOAT)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102857)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102858)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102859);BigDecimal value = parser.getDecimalValue();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102860);parser.nextToken();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102861);return value;
        } }else {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102862);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private Integer acceptInteger(JsonToken token) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102863);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102864);if ((((token == JsonToken.VALUE_NUMBER_INT)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102865)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102866)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102867);int value = parser.getIntValue();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102868);parser.nextToken();
            __CLR4_1_10276y276ylusqkw9l.R.inc(102869);return value;
        } }else {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102870);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    private void accept(JsonToken token) throws Exception {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102871);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102872);if ((((parser.getCurrentToken() == token)&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102873)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102874)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102875);parser.nextToken();
        } }else {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102876);throw new JSONException("syntax error, expect " + token + ", actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    public static String getNextTextValue(String fieldName, JsonParser parser) throws JsonParseException, IOException {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102877);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102878);JsonToken current = parser.nextToken(); // move to filed
        __CLR4_1_10276y276ylusqkw9l.R.inc(102879);if ((((current != JsonToken.FIELD_NAME || !fieldName.equals(parser.getCurrentName()))&&(__CLR4_1_10276y276ylusqkw9l.R.iget(102880)!=0|true))||(__CLR4_1_10276y276ylusqkw9l.R.iget(102881)==0&false))) {{
            __CLR4_1_10276y276ylusqkw9l.R.inc(102882);reportParseError("Error occoured while getting value by field name:" + fieldName, parser.getCurrentLocation());
        }
        }__CLR4_1_10276y276ylusqkw9l.R.inc(102883);current = parser.nextToken(); // move to value
        __CLR4_1_10276y276ylusqkw9l.R.inc(102884);return parser.getText();
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}

    public static void reportParseError(String errorMsg, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_1_10276y276ylusqkw9l.R.inc(102885);
        __CLR4_1_10276y276ylusqkw9l.R.inc(102886);throw new JsonParseException(errorMsg, jsonLoc);
    }finally{__CLR4_1_10276y276ylusqkw9l.R.flushNeeded();}}
}
