/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class ServiceLoader {public static class __CLR4_1_10s1ds1dlusqjqq2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,36389,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String      PREFIX     = "META-INF/services/";

    private static final Set<String> loadedUrls = new HashSet<String>();

    @SuppressWarnings("unchecked")
    public static <T> Set<T> load(Class<T> clazz, ClassLoader classLoader) {try{__CLR4_1_10s1ds1dlusqjqq2.R.inc(36337);
        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36338);if ((((classLoader == null)&&(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36339)!=0|true))||(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36340)==0&false))) {{
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36341);return Collections.emptySet();
        }
        
        }__CLR4_1_10s1ds1dlusqjqq2.R.inc(36342);Set<T> services = new HashSet<T>();

        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36343);String className = clazz.getName();
        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36344);String path = PREFIX + className;

        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36345);Set<String> serviceNames = new HashSet<String>();

        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36346);try {
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36347);Enumeration<URL> urls = classLoader.getResources(path);
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36348);while ((((urls.hasMoreElements())&&(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36349)!=0|true))||(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36350)==0&false))) {{
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36351);URL url = urls.nextElement();
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36352);if ((((loadedUrls.contains(url.toString()))&&(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36353)!=0|true))||(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36354)==0&false))) {{
                    __CLR4_1_10s1ds1dlusqjqq2.R.inc(36355);continue;
                }
                }__CLR4_1_10s1ds1dlusqjqq2.R.inc(36356);load(url, serviceNames);
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36357);loadedUrls.add(url.toString());
            }
        }} catch (Throwable ex) {
            // skip
        }

        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36358);for (String serviceName : serviceNames) {{
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36359);try {
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36360);Class<?> serviceClass = classLoader.loadClass(serviceName);
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36361);T service = (T) serviceClass.newInstance();
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36362);services.add(service);
            } catch (Exception e) {
                // skip
            }
        }

        }__CLR4_1_10s1ds1dlusqjqq2.R.inc(36363);return services;
    }finally{__CLR4_1_10s1ds1dlusqjqq2.R.flushNeeded();}}

    public static void load(URL url, Set<String> set) throws IOException {try{__CLR4_1_10s1ds1dlusqjqq2.R.inc(36364);
        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36365);InputStream is = null;
        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36366);BufferedReader reader = null;
        __CLR4_1_10s1ds1dlusqjqq2.R.inc(36367);try {
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36368);is = url.openStream();
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36369);reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36370);for (;;) {{
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36371);String line = reader.readLine();
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36372);if ((((line == null)&&(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36373)!=0|true))||(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36374)==0&false))) {{
                    __CLR4_1_10s1ds1dlusqjqq2.R.inc(36375);break;
                }

                }__CLR4_1_10s1ds1dlusqjqq2.R.inc(36376);int ci = line.indexOf('#');
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36377);if ((((ci >= 0)&&(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36378)!=0|true))||(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36379)==0&false))) {{
                    __CLR4_1_10s1ds1dlusqjqq2.R.inc(36380);line = line.substring(0, ci);
                }
                }__CLR4_1_10s1ds1dlusqjqq2.R.inc(36381);line = line.trim();
                __CLR4_1_10s1ds1dlusqjqq2.R.inc(36382);if ((((line.length() == 0)&&(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36383)!=0|true))||(__CLR4_1_10s1ds1dlusqjqq2.R.iget(36384)==0&false))) {{
                    __CLR4_1_10s1ds1dlusqjqq2.R.inc(36385);continue;
                }
                }__CLR4_1_10s1ds1dlusqjqq2.R.inc(36386);set.add(line);
            }
        }} finally {
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36387);IOUtils.close(reader);
            __CLR4_1_10s1ds1dlusqjqq2.R.inc(36388);IOUtils.close(is);
        }
    }finally{__CLR4_1_10s1ds1dlusqjqq2.R.flushNeeded();}}
}
