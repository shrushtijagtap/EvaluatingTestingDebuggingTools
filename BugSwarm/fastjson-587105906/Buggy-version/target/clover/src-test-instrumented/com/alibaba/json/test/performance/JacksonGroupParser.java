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

public class JacksonGroupParser {public static class __CLR4_1_1028562856luszwirt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,104119,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private JsonParser parser;

    public JacksonGroupParser(JsonParser parser) throws Exception{try{__CLR4_1_1028562856luszwirt.R.inc(103866);
        __CLR4_1_1028562856luszwirt.R.inc(103867);this.parser = parser;
        __CLR4_1_1028562856luszwirt.R.inc(103868);parser.nextToken(); // move to the start of the
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    public Group parseGroup() throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(103869);
        __CLR4_1_1028562856luszwirt.R.inc(103870);Group group = new Group();

        __CLR4_1_1028562856luszwirt.R.inc(103871);accept(JsonToken.START_OBJECT);

        __CLR4_1_1028562856luszwirt.R.inc(103872);for (;;) {{
            __CLR4_1_1028562856luszwirt.R.inc(103873);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_1028562856luszwirt.R.inc(103874);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_1_1028562856luszwirt.R.iget(103875)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103876)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(103877);break;
            }

            }__CLR4_1_1028562856luszwirt.R.inc(103878);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_1_1028562856luszwirt.R.iget(103879)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103880)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(103881);String name = parser.getCurrentName();
                __CLR4_1_1028562856luszwirt.R.inc(103882);tok = parser.nextToken();

                __CLR4_1_1028562856luszwirt.R.inc(103883);if (((("name" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103884)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103885)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103886);group.setName(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103887);if (((("description" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103888)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103889)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103890);group.setDescription(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103891);if (((("companies" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103892)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103893)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103894);parseCompany(group.getCompanies());
                } }else {{
                    __CLR4_1_1028562856luszwirt.R.inc(103895);throw new RuntimeException("not match property : " + name);
                }
            }}}}
        }}

        }__CLR4_1_1028562856luszwirt.R.inc(103896);accept(JsonToken.END_OBJECT);

        __CLR4_1_1028562856luszwirt.R.inc(103897);return group;
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private Company parseCompany() throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(103898);
        __CLR4_1_1028562856luszwirt.R.inc(103899);Company company = new Company();

        __CLR4_1_1028562856luszwirt.R.inc(103900);accept(JsonToken.START_OBJECT);

        __CLR4_1_1028562856luszwirt.R.inc(103901);for (;;) {{
            __CLR4_1_1028562856luszwirt.R.inc(103902);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_1028562856luszwirt.R.inc(103903);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_1_1028562856luszwirt.R.iget(103904)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103905)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(103906);break;
            }

            }__CLR4_1_1028562856luszwirt.R.inc(103907);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_1_1028562856luszwirt.R.iget(103908)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103909)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(103910);String name = parser.getCurrentName();
                __CLR4_1_1028562856luszwirt.R.inc(103911);tok = parser.nextToken();

                __CLR4_1_1028562856luszwirt.R.inc(103912);if (((("name" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103913)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103914)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103915);company.setName(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103916);if (((("description" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103917)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103918)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103919);company.setDescription(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103920);if (((("stock" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103921)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103922)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103923);company.setStock(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103924);if (((("id" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103925)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103926)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103927);company.setId(acceptLong(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103928);if (((("rootDepartment" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103929)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103930)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103931);company.setRootDepartment(parseDepartment());
                } }else {{
                    __CLR4_1_1028562856luszwirt.R.inc(103932);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}
        }}

        }__CLR4_1_1028562856luszwirt.R.inc(103933);accept(JsonToken.END_OBJECT);

        __CLR4_1_1028562856luszwirt.R.inc(103934);return company;
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private Department parseDepartment() throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(103935);
        __CLR4_1_1028562856luszwirt.R.inc(103936);accept(JsonToken.START_OBJECT);

        __CLR4_1_1028562856luszwirt.R.inc(103937);Department company = new Department();

        __CLR4_1_1028562856luszwirt.R.inc(103938);for (;;) {{
            __CLR4_1_1028562856luszwirt.R.inc(103939);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_1028562856luszwirt.R.inc(103940);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_1_1028562856luszwirt.R.iget(103941)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103942)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(103943);break;
            }

            }__CLR4_1_1028562856luszwirt.R.inc(103944);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_1_1028562856luszwirt.R.iget(103945)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103946)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(103947);String name = parser.getCurrentName();
                __CLR4_1_1028562856luszwirt.R.inc(103948);tok = parser.nextToken();

                __CLR4_1_1028562856luszwirt.R.inc(103949);if (((("name" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103950)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103951)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103952);company.setName(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103953);if (((("description" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103954)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103955)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103956);company.setDescription(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103957);if (((("id" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103958)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103959)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103960);company.setId(acceptLong(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103961);if (((("children" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103962)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103963)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103964);parseDepartment(company.getChildren());
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103965);if (((("members" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103966)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103967)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103968);parseEmployee(company.getMembers());
                } }else {{
                    __CLR4_1_1028562856luszwirt.R.inc(103969);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}
        }}

        }__CLR4_1_1028562856luszwirt.R.inc(103970);accept(JsonToken.END_OBJECT);

        __CLR4_1_1028562856luszwirt.R.inc(103971);return company;
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private Employee parseEmployee() throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(103972);
        __CLR4_1_1028562856luszwirt.R.inc(103973);accept(JsonToken.START_OBJECT);

        __CLR4_1_1028562856luszwirt.R.inc(103974);Employee emp = new Employee();

        __CLR4_1_1028562856luszwirt.R.inc(103975);for (;;) {{
            __CLR4_1_1028562856luszwirt.R.inc(103976);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_1028562856luszwirt.R.inc(103977);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_1_1028562856luszwirt.R.iget(103978)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103979)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(103980);break;
            }

            }__CLR4_1_1028562856luszwirt.R.inc(103981);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_1_1028562856luszwirt.R.iget(103982)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103983)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(103984);String name = parser.getCurrentName();
                __CLR4_1_1028562856luszwirt.R.inc(103985);tok = parser.nextToken();

                __CLR4_1_1028562856luszwirt.R.inc(103986);if (((("name" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103987)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103988)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103989);emp.setName(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103990);if (((("description" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103991)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103992)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103993);emp.setDescription(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103994);if (((("number" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103995)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(103996)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(103997);emp.setNumber(acceptString(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(103998);if (((("id" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(103999)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104000)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(104001);emp.setId(acceptLong(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(104002);if (((("age" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(104003)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104004)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(104005);emp.setAge(acceptInteger(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(104006);if (((("salary" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(104007)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104008)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(104009);emp.setSalary(acceptBigDecimal(tok));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(104010);if (((("birthdate" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(104011)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104012)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(104013);emp.setBirthdate(new Date(acceptLong(tok)));
                } }else {__CLR4_1_1028562856luszwirt.R.inc(104014);if (((("badboy" == name)&&(__CLR4_1_1028562856luszwirt.R.iget(104015)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104016)==0&false))) {{
                    __CLR4_1_1028562856luszwirt.R.inc(104017);emp.setBadboy(acceptBoolean(tok));
                } }else {{
                    __CLR4_1_1028562856luszwirt.R.inc(104018);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}}}}
        }}

        }__CLR4_1_1028562856luszwirt.R.inc(104019);accept(JsonToken.END_OBJECT);

        __CLR4_1_1028562856luszwirt.R.inc(104020);return emp;
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private void parseEmployee(List<Employee> list) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104021);
        __CLR4_1_1028562856luszwirt.R.inc(104022);accept(JsonToken.START_ARRAY);
        __CLR4_1_1028562856luszwirt.R.inc(104023);for (;;) {{
            __CLR4_1_1028562856luszwirt.R.inc(104024);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_1028562856luszwirt.R.inc(104025);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_1_1028562856luszwirt.R.iget(104026)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104027)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(104028);break;
            }

            }__CLR4_1_1028562856luszwirt.R.inc(104029);list.add(parseEmployee());
        }
        }__CLR4_1_1028562856luszwirt.R.inc(104030);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private void parseDepartment(List<Department> list) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104031);
        __CLR4_1_1028562856luszwirt.R.inc(104032);accept(JsonToken.START_ARRAY);
        __CLR4_1_1028562856luszwirt.R.inc(104033);for (;;) {{
            __CLR4_1_1028562856luszwirt.R.inc(104034);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_1028562856luszwirt.R.inc(104035);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_1_1028562856luszwirt.R.iget(104036)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104037)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(104038);break;
            }

            }__CLR4_1_1028562856luszwirt.R.inc(104039);list.add(parseDepartment());
        }
        }__CLR4_1_1028562856luszwirt.R.inc(104040);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private void parseCompany(List<Company> list) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104041);
        __CLR4_1_1028562856luszwirt.R.inc(104042);accept(JsonToken.START_ARRAY);
        __CLR4_1_1028562856luszwirt.R.inc(104043);for (;;) {{
            __CLR4_1_1028562856luszwirt.R.inc(104044);JsonToken tok = parser.getCurrentToken();

            __CLR4_1_1028562856luszwirt.R.inc(104045);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_1_1028562856luszwirt.R.iget(104046)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104047)==0&false))) {{
                __CLR4_1_1028562856luszwirt.R.inc(104048);break;
            }

            }__CLR4_1_1028562856luszwirt.R.inc(104049);list.add(parseCompany());
        }
        }__CLR4_1_1028562856luszwirt.R.inc(104050);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private String acceptString() throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104051);
        __CLR4_1_1028562856luszwirt.R.inc(104052);if ((((parser.getCurrentToken() == JsonToken.VALUE_STRING)&&(__CLR4_1_1028562856luszwirt.R.iget(104053)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104054)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104055);String stringValue = parser.getText();
            __CLR4_1_1028562856luszwirt.R.inc(104056);parser.nextToken();
            __CLR4_1_1028562856luszwirt.R.inc(104057);return stringValue;
        } }else {{
            __CLR4_1_1028562856luszwirt.R.inc(104058);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private String acceptString(JsonToken token) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104059);
        __CLR4_1_1028562856luszwirt.R.inc(104060);if ((((token == JsonToken.VALUE_STRING)&&(__CLR4_1_1028562856luszwirt.R.iget(104061)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104062)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104063);String stringValue = parser.getText();
            __CLR4_1_1028562856luszwirt.R.inc(104064);parser.nextToken();
            __CLR4_1_1028562856luszwirt.R.inc(104065);return stringValue;
        } }else {{
            __CLR4_1_1028562856luszwirt.R.inc(104066);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private Long acceptLong(JsonToken token) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104067);
        __CLR4_1_1028562856luszwirt.R.inc(104068);if ((((token == JsonToken.VALUE_NUMBER_INT)&&(__CLR4_1_1028562856luszwirt.R.iget(104069)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104070)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104071);long value = parser.getLongValue();
            __CLR4_1_1028562856luszwirt.R.inc(104072);parser.nextToken();
            __CLR4_1_1028562856luszwirt.R.inc(104073);return value;
        } }else {{
            __CLR4_1_1028562856luszwirt.R.inc(104074);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private boolean acceptBoolean(JsonToken token) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104075);
        __CLR4_1_1028562856luszwirt.R.inc(104076);if ((((token == JsonToken.VALUE_TRUE)&&(__CLR4_1_1028562856luszwirt.R.iget(104077)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104078)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104079);parser.nextToken();
            __CLR4_1_1028562856luszwirt.R.inc(104080);return true;
        } }else {__CLR4_1_1028562856luszwirt.R.inc(104081);if ((((token == JsonToken.VALUE_FALSE)&&(__CLR4_1_1028562856luszwirt.R.iget(104082)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104083)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104084);parser.nextToken();
            __CLR4_1_1028562856luszwirt.R.inc(104085);return false;
        } }else {{
            __CLR4_1_1028562856luszwirt.R.inc(104086);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}}finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private BigDecimal acceptBigDecimal(JsonToken token) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104087);
        __CLR4_1_1028562856luszwirt.R.inc(104088);if ((((token == JsonToken.VALUE_NUMBER_FLOAT)&&(__CLR4_1_1028562856luszwirt.R.iget(104089)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104090)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104091);BigDecimal value = parser.getDecimalValue();
            __CLR4_1_1028562856luszwirt.R.inc(104092);parser.nextToken();
            __CLR4_1_1028562856luszwirt.R.inc(104093);return value;
        } }else {{
            __CLR4_1_1028562856luszwirt.R.inc(104094);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private Integer acceptInteger(JsonToken token) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104095);
        __CLR4_1_1028562856luszwirt.R.inc(104096);if ((((token == JsonToken.VALUE_NUMBER_INT)&&(__CLR4_1_1028562856luszwirt.R.iget(104097)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104098)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104099);int value = parser.getIntValue();
            __CLR4_1_1028562856luszwirt.R.inc(104100);parser.nextToken();
            __CLR4_1_1028562856luszwirt.R.inc(104101);return value;
        } }else {{
            __CLR4_1_1028562856luszwirt.R.inc(104102);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    private void accept(JsonToken token) throws Exception {try{__CLR4_1_1028562856luszwirt.R.inc(104103);
        __CLR4_1_1028562856luszwirt.R.inc(104104);if ((((parser.getCurrentToken() == token)&&(__CLR4_1_1028562856luszwirt.R.iget(104105)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104106)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104107);parser.nextToken();
        } }else {{
            __CLR4_1_1028562856luszwirt.R.inc(104108);throw new JSONException("syntax error, expect " + token + ", actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    public static String getNextTextValue(String fieldName, JsonParser parser) throws JsonParseException, IOException {try{__CLR4_1_1028562856luszwirt.R.inc(104109);
        __CLR4_1_1028562856luszwirt.R.inc(104110);JsonToken current = parser.nextToken(); // move to filed
        __CLR4_1_1028562856luszwirt.R.inc(104111);if ((((current != JsonToken.FIELD_NAME || !fieldName.equals(parser.getCurrentName()))&&(__CLR4_1_1028562856luszwirt.R.iget(104112)!=0|true))||(__CLR4_1_1028562856luszwirt.R.iget(104113)==0&false))) {{
            __CLR4_1_1028562856luszwirt.R.inc(104114);reportParseError("Error occoured while getting value by field name:" + fieldName, parser.getCurrentLocation());
        }
        }__CLR4_1_1028562856luszwirt.R.inc(104115);current = parser.nextToken(); // move to value
        __CLR4_1_1028562856luszwirt.R.inc(104116);return parser.getText();
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}

    public static void reportParseError(String errorMsg, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_1_1028562856luszwirt.R.inc(104117);
        __CLR4_1_1028562856luszwirt.R.inc(104118);throw new JsonParseException(errorMsg, jsonLoc);
    }finally{__CLR4_1_1028562856luszwirt.R.flushNeeded();}}
}
