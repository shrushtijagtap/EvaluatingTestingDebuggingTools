/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.serializer;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public abstract class SerializeFilterable {public static class __CLR4_1_10mjemjeluszvzx5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,29397,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected List<BeforeFilter>       beforeFilters       = null;
    protected List<AfterFilter>        afterFilters        = null;
    protected List<PropertyFilter>     propertyFilters     = null;
    protected List<ValueFilter>        valueFilters        = null;
    protected List<NameFilter>         nameFilters         = null;
    protected List<PropertyPreFilter>  propertyPreFilters  = null;
    protected List<LabelFilter>        labelFilters        = null;
    protected List<ContextValueFilter> contextValueFilters = null;

    protected boolean                  writeDirect         = true;

    public List<BeforeFilter> getBeforeFilters() {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29210);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29211);if ((((beforeFilters == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29212)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29213)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29214);beforeFilters = new ArrayList<BeforeFilter>();
            __CLR4_1_10mjemjeluszvzx5.R.inc(29215);writeDirect = false;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29216);return beforeFilters;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public List<AfterFilter> getAfterFilters() {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29217);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29218);if ((((afterFilters == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29219)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29220)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29221);afterFilters = new ArrayList<AfterFilter>();
            __CLR4_1_10mjemjeluszvzx5.R.inc(29222);writeDirect = false;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29223);return afterFilters;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public List<NameFilter> getNameFilters() {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29224);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29225);if ((((nameFilters == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29226)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29227)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29228);nameFilters = new ArrayList<NameFilter>();
            __CLR4_1_10mjemjeluszvzx5.R.inc(29229);writeDirect = false;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29230);return nameFilters;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public List<PropertyPreFilter> getPropertyPreFilters() {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29231);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29232);if ((((propertyPreFilters == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29233)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29234)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29235);propertyPreFilters = new ArrayList<PropertyPreFilter>();
            __CLR4_1_10mjemjeluszvzx5.R.inc(29236);writeDirect = false;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29237);return propertyPreFilters;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public List<LabelFilter> getLabelFilters() {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29238);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29239);if ((((labelFilters == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29240)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29241)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29242);labelFilters = new ArrayList<LabelFilter>();
            __CLR4_1_10mjemjeluszvzx5.R.inc(29243);writeDirect = false;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29244);return labelFilters;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public List<PropertyFilter> getPropertyFilters() {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29245);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29246);if ((((propertyFilters == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29247)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29248)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29249);propertyFilters = new ArrayList<PropertyFilter>();
            __CLR4_1_10mjemjeluszvzx5.R.inc(29250);writeDirect = false;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29251);return propertyFilters;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public List<ContextValueFilter> getContextValueFilters() {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29252);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29253);if ((((contextValueFilters == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29254)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29255)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29256);contextValueFilters = new ArrayList<ContextValueFilter>();
            __CLR4_1_10mjemjeluszvzx5.R.inc(29257);writeDirect = false;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29258);return contextValueFilters;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public List<ValueFilter> getValueFilters() {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29259);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29260);if ((((valueFilters == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29261)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29262)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29263);valueFilters = new ArrayList<ValueFilter>();
            __CLR4_1_10mjemjeluszvzx5.R.inc(29264);writeDirect = false;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29265);return valueFilters;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public void addFilter(SerializeFilter filter) {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29266);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29267);if ((((filter == null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29268)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29269)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29270);return;
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29271);if ((((filter instanceof PropertyPreFilter)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29272)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29273)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29274);this.getPropertyPreFilters().add((PropertyPreFilter) filter);
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29275);if ((((filter instanceof NameFilter)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29276)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29277)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29278);this.getNameFilters().add((NameFilter) filter);
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29279);if ((((filter instanceof ValueFilter)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29280)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29281)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29282);this.getValueFilters().add((ValueFilter) filter);
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29283);if ((((filter instanceof ContextValueFilter)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29284)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29285)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29286);this.getContextValueFilters().add((ContextValueFilter) filter);
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29287);if ((((filter instanceof PropertyFilter)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29288)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29289)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29290);this.getPropertyFilters().add((PropertyFilter) filter);
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29291);if ((((filter instanceof BeforeFilter)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29292)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29293)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29294);this.getBeforeFilters().add((BeforeFilter) filter);
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29295);if ((((filter instanceof AfterFilter)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29296)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29297)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29298);this.getAfterFilters().add((AfterFilter) filter);
        }

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29299);if ((((filter instanceof LabelFilter)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29300)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29301)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29302);this.getLabelFilters().add((LabelFilter) filter);
        }
    }}finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}

    public boolean applyName(JSONSerializer jsonBeanDeser, //
                             Object object, String key) {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29303);

        __CLR4_1_10mjemjeluszvzx5.R.inc(29304);if ((((jsonBeanDeser.propertyPreFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29305)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29306)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29307);for (PropertyPreFilter filter : jsonBeanDeser.propertyPreFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29308);if ((((!filter.apply(jsonBeanDeser, object, key))&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29309)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29310)==0&false))) {{
                    __CLR4_1_10mjemjeluszvzx5.R.inc(29311);return false;
                }
            }}
        }}
        
        }__CLR4_1_10mjemjeluszvzx5.R.inc(29312);if ((((this.propertyPreFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29313)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29314)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29315);for (PropertyPreFilter filter : this.propertyPreFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29316);if ((((!filter.apply(jsonBeanDeser, object, key))&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29317)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29318)==0&false))) {{
                    __CLR4_1_10mjemjeluszvzx5.R.inc(29319);return false;
                }
            }}
        }}

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29320);return true;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}
    
    public boolean apply(JSONSerializer jsonBeanDeser, //
                         Object object, //
                         String key, Object propertyValue) {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29321);
        
        __CLR4_1_10mjemjeluszvzx5.R.inc(29322);if ((((jsonBeanDeser.propertyFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29323)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29324)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29325);for (PropertyFilter propertyFilter : jsonBeanDeser.propertyFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29326);if ((((!propertyFilter.apply(object, key, propertyValue))&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29327)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29328)==0&false))) {{
                    __CLR4_1_10mjemjeluszvzx5.R.inc(29329);return false;
                }
            }}
        }}
        
        }__CLR4_1_10mjemjeluszvzx5.R.inc(29330);if ((((this.propertyFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29331)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29332)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29333);for (PropertyFilter propertyFilter : this.propertyFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29334);if ((((!propertyFilter.apply(object, key, propertyValue))&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29335)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29336)==0&false))) {{
                    __CLR4_1_10mjemjeluszvzx5.R.inc(29337);return false;
                }
            }}
        }}

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29338);return true;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}
    
    protected String processKey(JSONSerializer jsonBeanDeser, //
                             Object object, //
                             String key, //
                             Object propertyValue) {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29339);

        __CLR4_1_10mjemjeluszvzx5.R.inc(29340);if ((((jsonBeanDeser.nameFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29341)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29342)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29343);for (NameFilter nameFilter : jsonBeanDeser.nameFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29344);key = nameFilter.process(object, key, propertyValue);
            }
        }}
        
        }__CLR4_1_10mjemjeluszvzx5.R.inc(29345);if ((((this.nameFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29346)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29347)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29348);for (NameFilter nameFilter : this.nameFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29349);key = nameFilter.process(object, key, propertyValue);
            }
        }}

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29350);return key;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}
    
    protected Object processValue(JSONSerializer jsonBeanDeser, //
                               BeanContext beanContext,
                               Object object, //
                               String key, //
                               Object propertyValue, //
                               int features) {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29351);

        __CLR4_1_10mjemjeluszvzx5.R.inc(29352);if ((((propertyValue != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29353)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29354)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29355);if (((((SerializerFeature.isEnabled(jsonBeanDeser.out.features, features, SerializerFeature.WriteNonStringValueAsString)  //
                    || (beanContext != null && (beanContext.getFeatures() & SerializerFeature.WriteNonStringValueAsString.mask) != 0))
                    && (propertyValue instanceof Number || propertyValue instanceof Boolean))&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29356)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29357)==0&false))) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29358);String format = null;
                __CLR4_1_10mjemjeluszvzx5.R.inc(29359);if ((((propertyValue instanceof Number
                        && beanContext != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29360)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29361)==0&false))) {{
                    __CLR4_1_10mjemjeluszvzx5.R.inc(29362);format = beanContext.getFormat();
                }

                }__CLR4_1_10mjemjeluszvzx5.R.inc(29363);if ((((format != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29364)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29365)==0&false))) {{
                    __CLR4_1_10mjemjeluszvzx5.R.inc(29366);propertyValue = new DecimalFormat(format).format(propertyValue);
                } }else {{
                    __CLR4_1_10mjemjeluszvzx5.R.inc(29367);propertyValue = propertyValue.toString();
                }
            }} }else {__CLR4_1_10mjemjeluszvzx5.R.inc(29368);if ((((beanContext != null && beanContext.isJsonDirect())&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29369)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29370)==0&false))) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29371);String jsonStr = (String) propertyValue;
                __CLR4_1_10mjemjeluszvzx5.R.inc(29372);propertyValue = JSON.parse(jsonStr);
            }
        }}}
        
        }__CLR4_1_10mjemjeluszvzx5.R.inc(29373);if ((((jsonBeanDeser.valueFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29374)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29375)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29376);for (ValueFilter valueFilter : jsonBeanDeser.valueFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29377);propertyValue = valueFilter.process(object, key, propertyValue);
            }
        }}

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29378);List<ValueFilter> valueFilters = this.valueFilters;
        __CLR4_1_10mjemjeluszvzx5.R.inc(29379);if ((((valueFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29380)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29381)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29382);for (ValueFilter valueFilter : valueFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29383);propertyValue = valueFilter.process(object, key, propertyValue);
            }
        }}

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29384);if ((((jsonBeanDeser.contextValueFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29385)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29386)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29387);for (ContextValueFilter valueFilter : jsonBeanDeser.contextValueFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29388);propertyValue = valueFilter.process(beanContext, object, key, propertyValue);
            }
        }}

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29389);if ((((this.contextValueFilters != null)&&(__CLR4_1_10mjemjeluszvzx5.R.iget(29390)!=0|true))||(__CLR4_1_10mjemjeluszvzx5.R.iget(29391)==0&false))) {{
            __CLR4_1_10mjemjeluszvzx5.R.inc(29392);for (ContextValueFilter valueFilter : this.contextValueFilters) {{
                __CLR4_1_10mjemjeluszvzx5.R.inc(29393);propertyValue = valueFilter.process(beanContext, object, key, propertyValue);
            }
        }}

        }__CLR4_1_10mjemjeluszvzx5.R.inc(29394);return propertyValue;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}
    
    /**
     * only invoke by asm byte
     * 
     * @return
     */
    protected boolean writeDirect(JSONSerializer jsonBeanDeser) {try{__CLR4_1_10mjemjeluszvzx5.R.inc(29395);
        __CLR4_1_10mjemjeluszvzx5.R.inc(29396);return jsonBeanDeser.out.writeDirect //
               && this.writeDirect //
               && jsonBeanDeser.writeDirect;
    }finally{__CLR4_1_10mjemjeluszvzx5.R.flushNeeded();}}
}
