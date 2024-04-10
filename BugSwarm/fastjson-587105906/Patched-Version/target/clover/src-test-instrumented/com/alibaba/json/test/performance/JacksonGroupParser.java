/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.performance;

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

public class JacksonGroupParser {public static class __CLR4_5_2276n276nlusyjx72{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,102876,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private JsonParser parser;

    public JacksonGroupParser(JsonParser parser) throws Exception{try{__CLR4_5_2276n276nlusyjx72.R.inc(102623);
        __CLR4_5_2276n276nlusyjx72.R.inc(102624);this.parser = parser;
        __CLR4_5_2276n276nlusyjx72.R.inc(102625);parser.nextToken(); // move to the start of the
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    public Group parseGroup() throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102626);
        __CLR4_5_2276n276nlusyjx72.R.inc(102627);Group group = new Group();

        __CLR4_5_2276n276nlusyjx72.R.inc(102628);accept(JsonToken.START_OBJECT);

        __CLR4_5_2276n276nlusyjx72.R.inc(102629);for (;;) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102630);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2276n276nlusyjx72.R.inc(102631);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102632)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102633)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102634);break;
            }

            }__CLR4_5_2276n276nlusyjx72.R.inc(102635);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102636)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102637)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102638);String name = parser.getCurrentName();
                __CLR4_5_2276n276nlusyjx72.R.inc(102639);tok = parser.nextToken();

                __CLR4_5_2276n276nlusyjx72.R.inc(102640);if (((("name" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102641)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102642)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102643);group.setName(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102644);if (((("description" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102645)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102646)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102647);group.setDescription(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102648);if (((("companies" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102649)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102650)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102651);parseCompany(group.getCompanies());
                } }else {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102652);throw new RuntimeException("not match property : " + name);
                }
            }}}}
        }}

        }__CLR4_5_2276n276nlusyjx72.R.inc(102653);accept(JsonToken.END_OBJECT);

        __CLR4_5_2276n276nlusyjx72.R.inc(102654);return group;
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private Company parseCompany() throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102655);
        __CLR4_5_2276n276nlusyjx72.R.inc(102656);Company company = new Company();

        __CLR4_5_2276n276nlusyjx72.R.inc(102657);accept(JsonToken.START_OBJECT);

        __CLR4_5_2276n276nlusyjx72.R.inc(102658);for (;;) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102659);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2276n276nlusyjx72.R.inc(102660);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102661)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102662)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102663);break;
            }

            }__CLR4_5_2276n276nlusyjx72.R.inc(102664);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102665)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102666)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102667);String name = parser.getCurrentName();
                __CLR4_5_2276n276nlusyjx72.R.inc(102668);tok = parser.nextToken();

                __CLR4_5_2276n276nlusyjx72.R.inc(102669);if (((("name" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102670)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102671)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102672);company.setName(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102673);if (((("description" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102674)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102675)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102676);company.setDescription(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102677);if (((("stock" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102678)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102679)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102680);company.setStock(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102681);if (((("id" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102682)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102683)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102684);company.setId(acceptLong(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102685);if (((("rootDepartment" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102686)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102687)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102688);company.setRootDepartment(parseDepartment());
                } }else {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102689);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}
        }}

        }__CLR4_5_2276n276nlusyjx72.R.inc(102690);accept(JsonToken.END_OBJECT);

        __CLR4_5_2276n276nlusyjx72.R.inc(102691);return company;
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private Department parseDepartment() throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102692);
        __CLR4_5_2276n276nlusyjx72.R.inc(102693);accept(JsonToken.START_OBJECT);

        __CLR4_5_2276n276nlusyjx72.R.inc(102694);Department company = new Department();

        __CLR4_5_2276n276nlusyjx72.R.inc(102695);for (;;) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102696);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2276n276nlusyjx72.R.inc(102697);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102698)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102699)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102700);break;
            }

            }__CLR4_5_2276n276nlusyjx72.R.inc(102701);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102702)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102703)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102704);String name = parser.getCurrentName();
                __CLR4_5_2276n276nlusyjx72.R.inc(102705);tok = parser.nextToken();

                __CLR4_5_2276n276nlusyjx72.R.inc(102706);if (((("name" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102707)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102708)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102709);company.setName(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102710);if (((("description" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102711)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102712)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102713);company.setDescription(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102714);if (((("id" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102715)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102716)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102717);company.setId(acceptLong(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102718);if (((("children" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102719)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102720)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102721);parseDepartment(company.getChildren());
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102722);if (((("members" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102723)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102724)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102725);parseEmployee(company.getMembers());
                } }else {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102726);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}
        }}

        }__CLR4_5_2276n276nlusyjx72.R.inc(102727);accept(JsonToken.END_OBJECT);

        __CLR4_5_2276n276nlusyjx72.R.inc(102728);return company;
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private Employee parseEmployee() throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102729);
        __CLR4_5_2276n276nlusyjx72.R.inc(102730);accept(JsonToken.START_OBJECT);

        __CLR4_5_2276n276nlusyjx72.R.inc(102731);Employee emp = new Employee();

        __CLR4_5_2276n276nlusyjx72.R.inc(102732);for (;;) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102733);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2276n276nlusyjx72.R.inc(102734);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102735)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102736)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102737);break;
            }

            }__CLR4_5_2276n276nlusyjx72.R.inc(102738);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102739)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102740)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102741);String name = parser.getCurrentName();
                __CLR4_5_2276n276nlusyjx72.R.inc(102742);tok = parser.nextToken();

                __CLR4_5_2276n276nlusyjx72.R.inc(102743);if (((("name" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102744)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102745)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102746);emp.setName(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102747);if (((("description" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102748)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102749)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102750);emp.setDescription(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102751);if (((("number" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102752)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102753)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102754);emp.setNumber(acceptString(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102755);if (((("id" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102756)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102757)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102758);emp.setId(acceptLong(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102759);if (((("age" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102760)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102761)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102762);emp.setAge(acceptInteger(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102763);if (((("salary" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102764)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102765)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102766);emp.setSalary(acceptBigDecimal(tok));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102767);if (((("birthdate" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102768)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102769)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102770);emp.setBirthdate(new Date(acceptLong(tok)));
                } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102771);if (((("badboy" == name)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102772)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102773)==0&false))) {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102774);emp.setBadboy(acceptBoolean(tok));
                } }else {{
                    __CLR4_5_2276n276nlusyjx72.R.inc(102775);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}}}}
        }}

        }__CLR4_5_2276n276nlusyjx72.R.inc(102776);accept(JsonToken.END_OBJECT);

        __CLR4_5_2276n276nlusyjx72.R.inc(102777);return emp;
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private void parseEmployee(List<Employee> list) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102778);
        __CLR4_5_2276n276nlusyjx72.R.inc(102779);accept(JsonToken.START_ARRAY);
        __CLR4_5_2276n276nlusyjx72.R.inc(102780);for (;;) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102781);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2276n276nlusyjx72.R.inc(102782);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102783)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102784)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102785);break;
            }

            }__CLR4_5_2276n276nlusyjx72.R.inc(102786);list.add(parseEmployee());
        }
        }__CLR4_5_2276n276nlusyjx72.R.inc(102787);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private void parseDepartment(List<Department> list) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102788);
        __CLR4_5_2276n276nlusyjx72.R.inc(102789);accept(JsonToken.START_ARRAY);
        __CLR4_5_2276n276nlusyjx72.R.inc(102790);for (;;) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102791);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2276n276nlusyjx72.R.inc(102792);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102793)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102794)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102795);break;
            }

            }__CLR4_5_2276n276nlusyjx72.R.inc(102796);list.add(parseDepartment());
        }
        }__CLR4_5_2276n276nlusyjx72.R.inc(102797);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private void parseCompany(List<Company> list) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102798);
        __CLR4_5_2276n276nlusyjx72.R.inc(102799);accept(JsonToken.START_ARRAY);
        __CLR4_5_2276n276nlusyjx72.R.inc(102800);for (;;) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102801);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2276n276nlusyjx72.R.inc(102802);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102803)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102804)==0&false))) {{
                __CLR4_5_2276n276nlusyjx72.R.inc(102805);break;
            }

            }__CLR4_5_2276n276nlusyjx72.R.inc(102806);list.add(parseCompany());
        }
        }__CLR4_5_2276n276nlusyjx72.R.inc(102807);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private String acceptString() throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102808);
        __CLR4_5_2276n276nlusyjx72.R.inc(102809);if ((((parser.getCurrentToken() == JsonToken.VALUE_STRING)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102810)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102811)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102812);String stringValue = parser.getText();
            __CLR4_5_2276n276nlusyjx72.R.inc(102813);parser.nextToken();
            __CLR4_5_2276n276nlusyjx72.R.inc(102814);return stringValue;
        } }else {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102815);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private String acceptString(JsonToken token) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102816);
        __CLR4_5_2276n276nlusyjx72.R.inc(102817);if ((((token == JsonToken.VALUE_STRING)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102818)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102819)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102820);String stringValue = parser.getText();
            __CLR4_5_2276n276nlusyjx72.R.inc(102821);parser.nextToken();
            __CLR4_5_2276n276nlusyjx72.R.inc(102822);return stringValue;
        } }else {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102823);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private Long acceptLong(JsonToken token) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102824);
        __CLR4_5_2276n276nlusyjx72.R.inc(102825);if ((((token == JsonToken.VALUE_NUMBER_INT)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102826)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102827)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102828);long value = parser.getLongValue();
            __CLR4_5_2276n276nlusyjx72.R.inc(102829);parser.nextToken();
            __CLR4_5_2276n276nlusyjx72.R.inc(102830);return value;
        } }else {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102831);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private boolean acceptBoolean(JsonToken token) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102832);
        __CLR4_5_2276n276nlusyjx72.R.inc(102833);if ((((token == JsonToken.VALUE_TRUE)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102834)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102835)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102836);parser.nextToken();
            __CLR4_5_2276n276nlusyjx72.R.inc(102837);return true;
        } }else {__CLR4_5_2276n276nlusyjx72.R.inc(102838);if ((((token == JsonToken.VALUE_FALSE)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102839)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102840)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102841);parser.nextToken();
            __CLR4_5_2276n276nlusyjx72.R.inc(102842);return false;
        } }else {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102843);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}}finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private BigDecimal acceptBigDecimal(JsonToken token) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102844);
        __CLR4_5_2276n276nlusyjx72.R.inc(102845);if ((((token == JsonToken.VALUE_NUMBER_FLOAT)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102846)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102847)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102848);BigDecimal value = parser.getDecimalValue();
            __CLR4_5_2276n276nlusyjx72.R.inc(102849);parser.nextToken();
            __CLR4_5_2276n276nlusyjx72.R.inc(102850);return value;
        } }else {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102851);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private Integer acceptInteger(JsonToken token) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102852);
        __CLR4_5_2276n276nlusyjx72.R.inc(102853);if ((((token == JsonToken.VALUE_NUMBER_INT)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102854)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102855)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102856);int value = parser.getIntValue();
            __CLR4_5_2276n276nlusyjx72.R.inc(102857);parser.nextToken();
            __CLR4_5_2276n276nlusyjx72.R.inc(102858);return value;
        } }else {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102859);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    private void accept(JsonToken token) throws Exception {try{__CLR4_5_2276n276nlusyjx72.R.inc(102860);
        __CLR4_5_2276n276nlusyjx72.R.inc(102861);if ((((parser.getCurrentToken() == token)&&(__CLR4_5_2276n276nlusyjx72.R.iget(102862)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102863)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102864);parser.nextToken();
        } }else {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102865);throw new JSONException("syntax error, expect " + token + ", actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    public static String getNextTextValue(String fieldName, JsonParser parser) throws JsonParseException, IOException {try{__CLR4_5_2276n276nlusyjx72.R.inc(102866);
        __CLR4_5_2276n276nlusyjx72.R.inc(102867);JsonToken current = parser.nextToken(); // move to filed
        __CLR4_5_2276n276nlusyjx72.R.inc(102868);if ((((current != JsonToken.FIELD_NAME || !fieldName.equals(parser.getCurrentName()))&&(__CLR4_5_2276n276nlusyjx72.R.iget(102869)!=0|true))||(__CLR4_5_2276n276nlusyjx72.R.iget(102870)==0&false))) {{
            __CLR4_5_2276n276nlusyjx72.R.inc(102871);reportParseError("Error occoured while getting value by field name:" + fieldName, parser.getCurrentLocation());
        }
        }__CLR4_5_2276n276nlusyjx72.R.inc(102872);current = parser.nextToken(); // move to value
        __CLR4_5_2276n276nlusyjx72.R.inc(102873);return parser.getText();
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}

    public static void reportParseError(String errorMsg, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_5_2276n276nlusyjx72.R.inc(102874);
        __CLR4_5_2276n276nlusyjx72.R.inc(102875);throw new JsonParseException(errorMsg, jsonLoc);
    }finally{__CLR4_5_2276n276nlusyjx72.R.flushNeeded();}}
}
