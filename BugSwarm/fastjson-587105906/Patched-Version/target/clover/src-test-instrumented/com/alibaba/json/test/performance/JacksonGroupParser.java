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

public class JacksonGroupParser {public static class __CLR4_5_2284v284vlusvnlbb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,104108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private JsonParser parser;

    public JacksonGroupParser(JsonParser parser) throws Exception{try{__CLR4_5_2284v284vlusvnlbb.R.inc(103855);
        __CLR4_5_2284v284vlusvnlbb.R.inc(103856);this.parser = parser;
        __CLR4_5_2284v284vlusvnlbb.R.inc(103857);parser.nextToken(); // move to the start of the
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    public Group parseGroup() throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(103858);
        __CLR4_5_2284v284vlusvnlbb.R.inc(103859);Group group = new Group();

        __CLR4_5_2284v284vlusvnlbb.R.inc(103860);accept(JsonToken.START_OBJECT);

        __CLR4_5_2284v284vlusvnlbb.R.inc(103861);for (;;) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(103862);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2284v284vlusvnlbb.R.inc(103863);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103864)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103865)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(103866);break;
            }

            }__CLR4_5_2284v284vlusvnlbb.R.inc(103867);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103868)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103869)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(103870);String name = parser.getCurrentName();
                __CLR4_5_2284v284vlusvnlbb.R.inc(103871);tok = parser.nextToken();

                __CLR4_5_2284v284vlusvnlbb.R.inc(103872);if (((("name" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103873)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103874)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103875);group.setName(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103876);if (((("description" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103877)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103878)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103879);group.setDescription(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103880);if (((("companies" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103881)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103882)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103883);parseCompany(group.getCompanies());
                } }else {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103884);throw new RuntimeException("not match property : " + name);
                }
            }}}}
        }}

        }__CLR4_5_2284v284vlusvnlbb.R.inc(103885);accept(JsonToken.END_OBJECT);

        __CLR4_5_2284v284vlusvnlbb.R.inc(103886);return group;
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private Company parseCompany() throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(103887);
        __CLR4_5_2284v284vlusvnlbb.R.inc(103888);Company company = new Company();

        __CLR4_5_2284v284vlusvnlbb.R.inc(103889);accept(JsonToken.START_OBJECT);

        __CLR4_5_2284v284vlusvnlbb.R.inc(103890);for (;;) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(103891);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2284v284vlusvnlbb.R.inc(103892);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103893)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103894)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(103895);break;
            }

            }__CLR4_5_2284v284vlusvnlbb.R.inc(103896);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103897)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103898)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(103899);String name = parser.getCurrentName();
                __CLR4_5_2284v284vlusvnlbb.R.inc(103900);tok = parser.nextToken();

                __CLR4_5_2284v284vlusvnlbb.R.inc(103901);if (((("name" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103902)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103903)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103904);company.setName(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103905);if (((("description" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103906)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103907)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103908);company.setDescription(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103909);if (((("stock" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103910)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103911)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103912);company.setStock(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103913);if (((("id" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103914)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103915)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103916);company.setId(acceptLong(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103917);if (((("rootDepartment" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103918)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103919)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103920);company.setRootDepartment(parseDepartment());
                } }else {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103921);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}
        }}

        }__CLR4_5_2284v284vlusvnlbb.R.inc(103922);accept(JsonToken.END_OBJECT);

        __CLR4_5_2284v284vlusvnlbb.R.inc(103923);return company;
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private Department parseDepartment() throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(103924);
        __CLR4_5_2284v284vlusvnlbb.R.inc(103925);accept(JsonToken.START_OBJECT);

        __CLR4_5_2284v284vlusvnlbb.R.inc(103926);Department company = new Department();

        __CLR4_5_2284v284vlusvnlbb.R.inc(103927);for (;;) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(103928);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2284v284vlusvnlbb.R.inc(103929);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103930)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103931)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(103932);break;
            }

            }__CLR4_5_2284v284vlusvnlbb.R.inc(103933);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103934)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103935)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(103936);String name = parser.getCurrentName();
                __CLR4_5_2284v284vlusvnlbb.R.inc(103937);tok = parser.nextToken();

                __CLR4_5_2284v284vlusvnlbb.R.inc(103938);if (((("name" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103939)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103940)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103941);company.setName(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103942);if (((("description" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103943)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103944)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103945);company.setDescription(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103946);if (((("id" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103947)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103948)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103949);company.setId(acceptLong(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103950);if (((("children" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103951)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103952)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103953);parseDepartment(company.getChildren());
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103954);if (((("members" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103955)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103956)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103957);parseEmployee(company.getMembers());
                } }else {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103958);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}
        }}

        }__CLR4_5_2284v284vlusvnlbb.R.inc(103959);accept(JsonToken.END_OBJECT);

        __CLR4_5_2284v284vlusvnlbb.R.inc(103960);return company;
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private Employee parseEmployee() throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(103961);
        __CLR4_5_2284v284vlusvnlbb.R.inc(103962);accept(JsonToken.START_OBJECT);

        __CLR4_5_2284v284vlusvnlbb.R.inc(103963);Employee emp = new Employee();

        __CLR4_5_2284v284vlusvnlbb.R.inc(103964);for (;;) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(103965);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2284v284vlusvnlbb.R.inc(103966);if ((((tok == JsonToken.END_OBJECT)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103967)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103968)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(103969);break;
            }

            }__CLR4_5_2284v284vlusvnlbb.R.inc(103970);if ((((tok == JsonToken.FIELD_NAME)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103971)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103972)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(103973);String name = parser.getCurrentName();
                __CLR4_5_2284v284vlusvnlbb.R.inc(103974);tok = parser.nextToken();

                __CLR4_5_2284v284vlusvnlbb.R.inc(103975);if (((("name" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103976)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103977)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103978);emp.setName(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103979);if (((("description" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103980)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103981)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103982);emp.setDescription(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103983);if (((("number" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103984)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103985)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103986);emp.setNumber(acceptString(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103987);if (((("id" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103988)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103989)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103990);emp.setId(acceptLong(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103991);if (((("age" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103992)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103993)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103994);emp.setAge(acceptInteger(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103995);if (((("salary" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(103996)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(103997)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(103998);emp.setSalary(acceptBigDecimal(tok));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(103999);if (((("birthdate" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104000)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104001)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(104002);emp.setBirthdate(new Date(acceptLong(tok)));
                } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(104003);if (((("badboy" == name)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104004)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104005)==0&false))) {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(104006);emp.setBadboy(acceptBoolean(tok));
                } }else {{
                    __CLR4_5_2284v284vlusvnlbb.R.inc(104007);throw new RuntimeException("not match property : " + name);
                }
            }}}}}}}}}
        }}

        }__CLR4_5_2284v284vlusvnlbb.R.inc(104008);accept(JsonToken.END_OBJECT);

        __CLR4_5_2284v284vlusvnlbb.R.inc(104009);return emp;
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private void parseEmployee(List<Employee> list) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104010);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104011);accept(JsonToken.START_ARRAY);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104012);for (;;) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104013);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2284v284vlusvnlbb.R.inc(104014);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104015)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104016)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(104017);break;
            }

            }__CLR4_5_2284v284vlusvnlbb.R.inc(104018);list.add(parseEmployee());
        }
        }__CLR4_5_2284v284vlusvnlbb.R.inc(104019);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private void parseDepartment(List<Department> list) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104020);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104021);accept(JsonToken.START_ARRAY);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104022);for (;;) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104023);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2284v284vlusvnlbb.R.inc(104024);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104025)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104026)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(104027);break;
            }

            }__CLR4_5_2284v284vlusvnlbb.R.inc(104028);list.add(parseDepartment());
        }
        }__CLR4_5_2284v284vlusvnlbb.R.inc(104029);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private void parseCompany(List<Company> list) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104030);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104031);accept(JsonToken.START_ARRAY);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104032);for (;;) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104033);JsonToken tok = parser.getCurrentToken();

            __CLR4_5_2284v284vlusvnlbb.R.inc(104034);if ((((tok == JsonToken.END_ARRAY)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104035)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104036)==0&false))) {{
                __CLR4_5_2284v284vlusvnlbb.R.inc(104037);break;
            }

            }__CLR4_5_2284v284vlusvnlbb.R.inc(104038);list.add(parseCompany());
        }
        }__CLR4_5_2284v284vlusvnlbb.R.inc(104039);accept(JsonToken.END_ARRAY);
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private String acceptString() throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104040);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104041);if ((((parser.getCurrentToken() == JsonToken.VALUE_STRING)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104042)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104043)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104044);String stringValue = parser.getText();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104045);parser.nextToken();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104046);return stringValue;
        } }else {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104047);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private String acceptString(JsonToken token) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104048);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104049);if ((((token == JsonToken.VALUE_STRING)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104050)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104051)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104052);String stringValue = parser.getText();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104053);parser.nextToken();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104054);return stringValue;
        } }else {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104055);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private Long acceptLong(JsonToken token) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104056);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104057);if ((((token == JsonToken.VALUE_NUMBER_INT)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104058)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104059)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104060);long value = parser.getLongValue();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104061);parser.nextToken();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104062);return value;
        } }else {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104063);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private boolean acceptBoolean(JsonToken token) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104064);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104065);if ((((token == JsonToken.VALUE_TRUE)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104066)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104067)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104068);parser.nextToken();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104069);return true;
        } }else {__CLR4_5_2284v284vlusvnlbb.R.inc(104070);if ((((token == JsonToken.VALUE_FALSE)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104071)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104072)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104073);parser.nextToken();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104074);return false;
        } }else {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104075);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}}finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private BigDecimal acceptBigDecimal(JsonToken token) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104076);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104077);if ((((token == JsonToken.VALUE_NUMBER_FLOAT)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104078)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104079)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104080);BigDecimal value = parser.getDecimalValue();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104081);parser.nextToken();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104082);return value;
        } }else {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104083);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private Integer acceptInteger(JsonToken token) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104084);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104085);if ((((token == JsonToken.VALUE_NUMBER_INT)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104086)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104087)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104088);int value = parser.getIntValue();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104089);parser.nextToken();
            __CLR4_5_2284v284vlusvnlbb.R.inc(104090);return value;
        } }else {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104091);throw new JSONException("syntax error, expect string, actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    private void accept(JsonToken token) throws Exception {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104092);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104093);if ((((parser.getCurrentToken() == token)&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104094)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104095)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104096);parser.nextToken();
        } }else {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104097);throw new JSONException("syntax error, expect " + token + ", actual " + parser.getCurrentToken());
        }
    }}finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    public static String getNextTextValue(String fieldName, JsonParser parser) throws JsonParseException, IOException {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104098);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104099);JsonToken current = parser.nextToken(); // move to filed
        __CLR4_5_2284v284vlusvnlbb.R.inc(104100);if ((((current != JsonToken.FIELD_NAME || !fieldName.equals(parser.getCurrentName()))&&(__CLR4_5_2284v284vlusvnlbb.R.iget(104101)!=0|true))||(__CLR4_5_2284v284vlusvnlbb.R.iget(104102)==0&false))) {{
            __CLR4_5_2284v284vlusvnlbb.R.inc(104103);reportParseError("Error occoured while getting value by field name:" + fieldName, parser.getCurrentLocation());
        }
        }__CLR4_5_2284v284vlusvnlbb.R.inc(104104);current = parser.nextToken(); // move to value
        __CLR4_5_2284v284vlusvnlbb.R.inc(104105);return parser.getText();
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}

    public static void reportParseError(String errorMsg, JsonLocation jsonLoc) throws JsonParseException {try{__CLR4_5_2284v284vlusvnlbb.R.inc(104106);
        __CLR4_5_2284v284vlusvnlbb.R.inc(104107);throw new JsonParseException(errorMsg, jsonLoc);
    }finally{__CLR4_5_2284v284vlusvnlbb.R.flushNeeded();}}
}
