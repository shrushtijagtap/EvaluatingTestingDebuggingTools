/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wenshao on 10/05/2017.
 */
public class AnnotationSerializer implements ObjectSerializer {public static class __CLR4_5_2ir9ir9lusyjmio{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,24368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static volatile Class sun_AnnotationType = null;
    private static volatile boolean sun_AnnotationType_error = false;
    private static volatile Method sun_AnnotationType_getInstance = null;
    private static volatile Method sun_AnnotationType_members = null;

    public static AnnotationSerializer instance = new AnnotationSerializer();

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_2ir9ir9lusyjmio.R.inc(24309);
        __CLR4_5_2ir9ir9lusyjmio.R.inc(24310);Class objClass = object.getClass();
        __CLR4_5_2ir9ir9lusyjmio.R.inc(24311);Class[] interfaces = objClass.getInterfaces();
        __CLR4_5_2ir9ir9lusyjmio.R.inc(24312);if ((((interfaces.length == 1 && interfaces[0].isAnnotation())&&(__CLR4_5_2ir9ir9lusyjmio.R.iget(24313)!=0|true))||(__CLR4_5_2ir9ir9lusyjmio.R.iget(24314)==0&false))) {{
            __CLR4_5_2ir9ir9lusyjmio.R.inc(24315);Class annotationClass = interfaces[0];

            __CLR4_5_2ir9ir9lusyjmio.R.inc(24316);if ((((sun_AnnotationType == null && !sun_AnnotationType_error)&&(__CLR4_5_2ir9ir9lusyjmio.R.iget(24317)!=0|true))||(__CLR4_5_2ir9ir9lusyjmio.R.iget(24318)==0&false))) {{
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24319);try {
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24320);sun_AnnotationType = Class.forName("sun.reflect.annotation.AnnotationType");
                } catch (Throwable ex) {
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24321);sun_AnnotationType_error = true;
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24322);throw new JSONException("not support Type Annotation.", ex);
                }
            }

            }__CLR4_5_2ir9ir9lusyjmio.R.inc(24323);if ((((sun_AnnotationType == null)&&(__CLR4_5_2ir9ir9lusyjmio.R.iget(24324)!=0|true))||(__CLR4_5_2ir9ir9lusyjmio.R.iget(24325)==0&false))) {{
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24326);throw new JSONException("not support Type Annotation.");
            }

            }__CLR4_5_2ir9ir9lusyjmio.R.inc(24327);if ((((sun_AnnotationType_getInstance == null && !sun_AnnotationType_error)&&(__CLR4_5_2ir9ir9lusyjmio.R.iget(24328)!=0|true))||(__CLR4_5_2ir9ir9lusyjmio.R.iget(24329)==0&false))) {{
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24330);try {
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24331);sun_AnnotationType_getInstance = sun_AnnotationType.getMethod("getInstance", Class.class);
                } catch (Throwable ex) {
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24332);sun_AnnotationType_error = true;
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24333);throw new JSONException("not support Type Annotation.", ex);
                }
            }

            }__CLR4_5_2ir9ir9lusyjmio.R.inc(24334);if ((((sun_AnnotationType_members == null && !sun_AnnotationType_error)&&(__CLR4_5_2ir9ir9lusyjmio.R.iget(24335)!=0|true))||(__CLR4_5_2ir9ir9lusyjmio.R.iget(24336)==0&false))) {{
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24337);try {
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24338);sun_AnnotationType_members = sun_AnnotationType.getMethod("members");
                } catch (Throwable ex) {
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24339);sun_AnnotationType_error = true;
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24340);throw new JSONException("not support Type Annotation.", ex);
                }
            }

            }__CLR4_5_2ir9ir9lusyjmio.R.inc(24341);if ((((sun_AnnotationType_getInstance == null || sun_AnnotationType_error)&&(__CLR4_5_2ir9ir9lusyjmio.R.iget(24342)!=0|true))||(__CLR4_5_2ir9ir9lusyjmio.R.iget(24343)==0&false))) {{
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24344);throw new JSONException("not support Type Annotation.");
            }

            }__CLR4_5_2ir9ir9lusyjmio.R.inc(24345);Object type;
            __CLR4_5_2ir9ir9lusyjmio.R.inc(24346);try {
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24347);type = sun_AnnotationType_getInstance.invoke(null, annotationClass);
            } catch (Throwable ex) {
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24348);sun_AnnotationType_error = true;
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24349);throw new JSONException("not support Type Annotation.", ex);
            }

            __CLR4_5_2ir9ir9lusyjmio.R.inc(24350);Map<String, Method> members;
            __CLR4_5_2ir9ir9lusyjmio.R.inc(24351);try {
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24352);members = (Map<String, Method>) sun_AnnotationType_members.invoke(type);
            } catch (Throwable ex) {
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24353);sun_AnnotationType_error = true;
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24354);throw new JSONException("not support Type Annotation.", ex);
            }

            __CLR4_5_2ir9ir9lusyjmio.R.inc(24355);JSONObject json = new JSONObject(members.size());
            __CLR4_5_2ir9ir9lusyjmio.R.inc(24356);Iterator<Map.Entry<String, Method>> iterator = members.entrySet().iterator();
            __CLR4_5_2ir9ir9lusyjmio.R.inc(24357);Map.Entry<String, Method> entry;
            __CLR4_5_2ir9ir9lusyjmio.R.inc(24358);Object val = null;
            __CLR4_5_2ir9ir9lusyjmio.R.inc(24359);while ((((iterator.hasNext())&&(__CLR4_5_2ir9ir9lusyjmio.R.iget(24360)!=0|true))||(__CLR4_5_2ir9ir9lusyjmio.R.iget(24361)==0&false))) {{
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24362);entry = iterator.next();
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24363);try {
                    __CLR4_5_2ir9ir9lusyjmio.R.inc(24364);val = entry.getValue().invoke(object);
                } catch (IllegalAccessException e) {
                    // skip
                } catch (InvocationTargetException e) {
                    // skip
                }
                __CLR4_5_2ir9ir9lusyjmio.R.inc(24365);json.put(entry.getKey(), JSON.toJSON(val));
            }
            }__CLR4_5_2ir9ir9lusyjmio.R.inc(24366);serializer.write(json);
            __CLR4_5_2ir9ir9lusyjmio.R.inc(24367);return;
        }
    }}finally{__CLR4_5_2ir9ir9lusyjmio.R.flushNeeded();}}
}
