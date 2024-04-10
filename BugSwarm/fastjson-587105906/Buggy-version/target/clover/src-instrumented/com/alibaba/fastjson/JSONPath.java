/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.parser.*;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.FieldSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 * @since 1.2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class JSONPath implements JSONAware {public static class __CLR4_1_1011y11yluszvsmz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,4630,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static ConcurrentMap<String, JSONPath> pathCache  = new ConcurrentHashMap<String, JSONPath>(128, 0.75f, 1);

    private final String                           path;
    private Segment[]                              segments;
    private boolean                                hasRefSegment;

    private SerializeConfig                        serializeConfig;
    private ParserConfig                           parserConfig;

    public JSONPath(String path){
        this(path, SerializeConfig.getGlobalInstance(), ParserConfig.getGlobalInstance());__CLR4_1_1011y11yluszvsmz.R.inc(1367);try{__CLR4_1_1011y11yluszvsmz.R.inc(1366);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public JSONPath(String path, SerializeConfig serializeConfig, ParserConfig parserConfig){try{__CLR4_1_1011y11yluszvsmz.R.inc(1368);
        __CLR4_1_1011y11yluszvsmz.R.inc(1369);if ((((path == null || path.length() == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1370)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1371)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1372);throw new JSONPathException("json-path can not be null or empty");
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1373);this.path = path;
        __CLR4_1_1011y11yluszvsmz.R.inc(1374);this.serializeConfig = serializeConfig;
        __CLR4_1_1011y11yluszvsmz.R.inc(1375);this.parserConfig = parserConfig;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    protected void init() {try{__CLR4_1_1011y11yluszvsmz.R.inc(1376);
        __CLR4_1_1011y11yluszvsmz.R.inc(1377);if ((((segments != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1378)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1379)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1380);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1381);if (((("*".equals(path))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1382)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1383)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1384);this.segments = new Segment[] { WildCardSegment.instance };
        } }else {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1385);JSONPathParser parser = new JSONPathParser(path);
            __CLR4_1_1011y11yluszvsmz.R.inc(1386);this.segments = parser.explain();
            __CLR4_1_1011y11yluszvsmz.R.inc(1387);this.hasRefSegment = parser.hasRefSegment;
        }
    }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public Object eval(Object rootObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1388);
        __CLR4_1_1011y11yluszvsmz.R.inc(1389);if ((((rootObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1390)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1391)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1392);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1393);init();

        __CLR4_1_1011y11yluszvsmz.R.inc(1394);Object currentObject = rootObject;
        __CLR4_1_1011y11yluszvsmz.R.inc(1395);for (int i = 0; (((i < segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1396)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1397)==0&false)); ++i) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1398);Segment segment = segments[i];
            __CLR4_1_1011y11yluszvsmz.R.inc(1399);currentObject = segment.eval(this, rootObject, currentObject);
        }
        }__CLR4_1_1011y11yluszvsmz.R.inc(1400);return currentObject;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public Object extract(DefaultJSONParser parser) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1401);
        __CLR4_1_1011y11yluszvsmz.R.inc(1402);if ((((parser == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1403)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1404)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1405);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1406);init();

        __CLR4_1_1011y11yluszvsmz.R.inc(1407);if ((((hasRefSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1408)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1409)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1410);Object root = parser.parse();
            __CLR4_1_1011y11yluszvsmz.R.inc(1411);return this.eval(root);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1412);if ((((segments.length == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1413)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1414)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1415);return parser.parse();
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1416);Context context = null;
        __CLR4_1_1011y11yluszvsmz.R.inc(1417);for (int i = 0; (((i < segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1418)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1419)==0&false)); ++i) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1420);Segment segment = segments[i];
            __CLR4_1_1011y11yluszvsmz.R.inc(1421);boolean last = i == segments.length - 1;

            __CLR4_1_1011y11yluszvsmz.R.inc(1422);if ((((context != null && context.object != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1423)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1424)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1425);context.object = segment.eval(this, null, context.object);
                __CLR4_1_1011y11yluszvsmz.R.inc(1426);continue;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(1427);boolean eval;

            __CLR4_1_1011y11yluszvsmz.R.inc(1428);if ((((!last)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1429)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1430)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1431);Segment nextSegment = segments[i + 1];
                __CLR4_1_1011y11yluszvsmz.R.inc(1432);if ((((segment instanceof PropertySegment
                        && ((PropertySegment) segment).deep
                        && (nextSegment instanceof ArrayAccessSegment
                            || nextSegment instanceof MultiIndexSegment
                            || nextSegment instanceof MultiPropertySegment
                            || nextSegment instanceof SizeSegment
                            || nextSegment instanceof PropertySegment
                            || nextSegment instanceof FilterSegment))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1433)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1434)==0&false)))
                {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1435);eval = true;
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(1436);if ((((nextSegment instanceof ArrayAccessSegment
                        && ((ArrayAccessSegment) nextSegment).index < 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1437)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1438)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1439);eval = true;
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(1440);if ((((nextSegment instanceof FilterSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1441)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1442)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1443);eval = true;
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(1444);if ((((segment instanceof WildCardSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1445)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1446)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1447);eval = true;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1448);eval = false;
                }
            }}}}} }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1449);eval = true;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(1450);context = new Context(context, eval);
            __CLR4_1_1011y11yluszvsmz.R.inc(1451);segment.extract(this, parser, context);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1452);return context.object;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    private static class Context {
        final Context parent;
        final boolean eval;
        Object object;

        public Context(Context parent, boolean eval) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1453);
            __CLR4_1_1011y11yluszvsmz.R.inc(1454);this.parent = parent;
            __CLR4_1_1011y11yluszvsmz.R.inc(1455);this.eval = eval;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    public boolean contains(Object rootObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1456);
        __CLR4_1_1011y11yluszvsmz.R.inc(1457);if ((((rootObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1458)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1459)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1460);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1461);init();

        __CLR4_1_1011y11yluszvsmz.R.inc(1462);Object currentObject = rootObject;
        __CLR4_1_1011y11yluszvsmz.R.inc(1463);for (int i = 0; (((i < segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1464)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1465)==0&false)); ++i) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1466);Object parentObject = currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(1467);currentObject = segments[i].eval(this, rootObject, currentObject);
            __CLR4_1_1011y11yluszvsmz.R.inc(1468);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1469)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1470)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1471);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(1472);if ((((currentObject == Collections.EMPTY_LIST && parentObject instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1473)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1474)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1475);return ((List) parentObject).contains(currentObject);
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(1476);return true;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public boolean containsValue(Object rootObject, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1477);
        __CLR4_1_1011y11yluszvsmz.R.inc(1478);Object currentObject = eval(rootObject);

        __CLR4_1_1011y11yluszvsmz.R.inc(1479);if ((((currentObject == value)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1480)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1481)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1482);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1483);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1484)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1485)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1486);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1487);if ((((currentObject instanceof Iterable)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1488)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1489)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1490);Iterator it = ((Iterable) currentObject).iterator();
            __CLR4_1_1011y11yluszvsmz.R.inc(1491);while ((((it.hasNext())&&(__CLR4_1_1011y11yluszvsmz.R.iget(1492)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1493)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1494);Object item = it.next();
                __CLR4_1_1011y11yluszvsmz.R.inc(1495);if ((((eq(item, value))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1496)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1497)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1498);return true;
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(1499);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1500);return eq(currentObject, value);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public int size(Object rootObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1501);
        __CLR4_1_1011y11yluszvsmz.R.inc(1502);if ((((rootObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1503)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1504)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1505);return -1;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1506);init();

        __CLR4_1_1011y11yluszvsmz.R.inc(1507);Object currentObject = rootObject;
        __CLR4_1_1011y11yluszvsmz.R.inc(1508);for (int i = 0; (((i < segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1509)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1510)==0&false)); ++i) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1511);currentObject = segments[i].eval(this, rootObject, currentObject);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1512);return evalSize(currentObject);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    /**
     * Extract keySet or field names from rootObject on this JSONPath.
     * 
     * @param rootObject Can be a map or custom object. Array and Collection are not supported.
     * @return Set of keys, or <code>null</code> if not supported.
     */
    public Set<?> keySet(Object rootObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1513);
        __CLR4_1_1011y11yluszvsmz.R.inc(1514);if ((((rootObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1515)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1516)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1517);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1518);init();

        __CLR4_1_1011y11yluszvsmz.R.inc(1519);Object currentObject = rootObject;
        __CLR4_1_1011y11yluszvsmz.R.inc(1520);for (int i = 0; (((i < segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1521)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1522)==0&false)); ++i) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1523);currentObject = segments[i].eval(this, rootObject, currentObject);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1524);return evalKeySet(currentObject);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void arrayAdd(Object rootObject, Object... values) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1525);
        __CLR4_1_1011y11yluszvsmz.R.inc(1526);if ((((values == null || values.length == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1527)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1528)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1529);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1530);if ((((rootObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1531)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1532)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1533);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1534);init();

        __CLR4_1_1011y11yluszvsmz.R.inc(1535);Object currentObject = rootObject;
        __CLR4_1_1011y11yluszvsmz.R.inc(1536);Object parentObject = null;
        __CLR4_1_1011y11yluszvsmz.R.inc(1537);for (int i = 0; (((i < segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1538)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1539)==0&false)); ++i) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1540);if ((((i == segments.length - 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1541)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1542)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1543);parentObject = currentObject;
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(1544);currentObject = segments[i].eval(this, rootObject, currentObject);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1545);Object result = currentObject;

        __CLR4_1_1011y11yluszvsmz.R.inc(1546);if ((((result == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1547)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1548)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1549);throw new JSONPathException("value not found in path " + path);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1550);if ((((result instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1551)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1552)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1553);Collection collection = (Collection) result;
            __CLR4_1_1011y11yluszvsmz.R.inc(1554);for (Object value : values) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1555);collection.add(value);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(1556);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1557);Class<?> resultClass = result.getClass();

        __CLR4_1_1011y11yluszvsmz.R.inc(1558);Object newResult;
        __CLR4_1_1011y11yluszvsmz.R.inc(1559);if ((((resultClass.isArray())&&(__CLR4_1_1011y11yluszvsmz.R.iget(1560)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1561)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1562);int length = Array.getLength(result);
            __CLR4_1_1011y11yluszvsmz.R.inc(1563);Object descArray = Array.newInstance(resultClass.getComponentType(), length + values.length);

            __CLR4_1_1011y11yluszvsmz.R.inc(1564);System.arraycopy(result, 0, descArray, 0, length);
            __CLR4_1_1011y11yluszvsmz.R.inc(1565);for (int i = 0; (((i < values.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1566)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1567)==0&false)); ++i) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1568);Array.set(descArray, length + i, values[i]);

            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(1569);newResult = descArray;
        } }else {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1570);throw new JSONException("unsupported array put operation. " + resultClass);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1571);Segment lastSegment = segments[segments.length - 1];
        __CLR4_1_1011y11yluszvsmz.R.inc(1572);if ((((lastSegment instanceof PropertySegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1573)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1574)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1575);PropertySegment propertySegment = (PropertySegment) lastSegment;
            __CLR4_1_1011y11yluszvsmz.R.inc(1576);propertySegment.setValue(this, parentObject, newResult);
            __CLR4_1_1011y11yluszvsmz.R.inc(1577);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1578);if ((((lastSegment instanceof ArrayAccessSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1579)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1580)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1581);((ArrayAccessSegment) lastSegment).setValue(this, parentObject, newResult);
            __CLR4_1_1011y11yluszvsmz.R.inc(1582);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1583);throw new UnsupportedOperationException();
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    
    public boolean remove(Object rootObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1584);
        __CLR4_1_1011y11yluszvsmz.R.inc(1585);if ((((rootObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1586)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1587)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1588);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1589);init();

        __CLR4_1_1011y11yluszvsmz.R.inc(1590);Object currentObject = rootObject;
        __CLR4_1_1011y11yluszvsmz.R.inc(1591);Object parentObject = null;
        __CLR4_1_1011y11yluszvsmz.R.inc(1592);for (int i = 0; (((i < segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1593)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1594)==0&false)); ++i) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1595);if ((((i == segments.length - 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1596)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1597)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1598);parentObject = currentObject;
                __CLR4_1_1011y11yluszvsmz.R.inc(1599);break;
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(1600);currentObject = segments[i].eval(this, rootObject, currentObject);
            __CLR4_1_1011y11yluszvsmz.R.inc(1601);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1602)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1603)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1604);break;
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(1605);if ((((parentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1606)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1607)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1608);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1609);Segment lastSegment = segments[segments.length - 1];
        __CLR4_1_1011y11yluszvsmz.R.inc(1610);if ((((lastSegment instanceof PropertySegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1611)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1612)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1613);PropertySegment propertySegment = (PropertySegment) lastSegment;

            __CLR4_1_1011y11yluszvsmz.R.inc(1614);if ((((parentObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1615)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1616)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1617);if ((((segments.length > 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1618)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1619)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1620);Segment parentSegment = segments[segments.length - 2];
                    __CLR4_1_1011y11yluszvsmz.R.inc(1621);if ((((parentSegment instanceof RangeSegment || parentSegment instanceof MultiIndexSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1622)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1623)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1624);Collection collection = (Collection) parentObject;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1625);boolean removedOnce = false;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1626);for (Object item : collection) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(1627);boolean removed = propertySegment.remove(this, item);
                            __CLR4_1_1011y11yluszvsmz.R.inc(1628);if ((((removed)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1629)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1630)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(1631);removedOnce = true;
                            }
                        }}
                        }__CLR4_1_1011y11yluszvsmz.R.inc(1632);return removedOnce;
                    }
                }}
            }}
            }__CLR4_1_1011y11yluszvsmz.R.inc(1633);return propertySegment.remove(this, parentObject);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1634);if ((((lastSegment instanceof ArrayAccessSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1635)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1636)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1637);return ((ArrayAccessSegment) lastSegment).remove(this, parentObject);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1638);throw new UnsupportedOperationException();
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public boolean set(Object rootObject, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1639);
        __CLR4_1_1011y11yluszvsmz.R.inc(1640);return set(rootObject, value, true);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public boolean set(Object rootObject, Object value, boolean p) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1641);
        __CLR4_1_1011y11yluszvsmz.R.inc(1642);if ((((rootObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1643)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1644)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1645);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1646);init();

        __CLR4_1_1011y11yluszvsmz.R.inc(1647);Object currentObject = rootObject;
        __CLR4_1_1011y11yluszvsmz.R.inc(1648);Object parentObject = null;
        __CLR4_1_1011y11yluszvsmz.R.inc(1649);for (int i = 0; (((i < segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1650)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1651)==0&false)); ++i) {{
//            if (i == segments.length - 1) {
//                parentObject = currentObject;
//                break;
//            }
//            
            __CLR4_1_1011y11yluszvsmz.R.inc(1652);parentObject = currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(1653);Segment segment = segments[i];
            __CLR4_1_1011y11yluszvsmz.R.inc(1654);currentObject = segment.eval(this, rootObject, currentObject);
            __CLR4_1_1011y11yluszvsmz.R.inc(1655);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1656)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1657)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1658);Segment nextSegment = null;
                __CLR4_1_1011y11yluszvsmz.R.inc(1659);if ((((i < segments.length - 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1660)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1661)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1662);nextSegment = segments[i + 1];
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(1663);Object newObj = null;
                __CLR4_1_1011y11yluszvsmz.R.inc(1664);if ((((nextSegment instanceof PropertySegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1665)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1666)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1667);JavaBeanDeserializer beanDeserializer = null;
                    __CLR4_1_1011y11yluszvsmz.R.inc(1668);Class<?> fieldClass = null;
                    __CLR4_1_1011y11yluszvsmz.R.inc(1669);if ((((segment instanceof PropertySegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1670)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1671)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1672);String propertyName = ((PropertySegment) segment).propertyName;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1673);Class<?> parentClass = parentObject.getClass();
                        __CLR4_1_1011y11yluszvsmz.R.inc(1674);JavaBeanDeserializer parentBeanDeserializer = getJavaBeanDeserializer(parentClass);
                        __CLR4_1_1011y11yluszvsmz.R.inc(1675);if ((((parentBeanDeserializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1676)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1677)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(1678);FieldDeserializer fieldDeserializer = parentBeanDeserializer.getFieldDeserializer(propertyName);
                            __CLR4_1_1011y11yluszvsmz.R.inc(1679);fieldClass = fieldDeserializer.fieldInfo.fieldClass;
                            __CLR4_1_1011y11yluszvsmz.R.inc(1680);beanDeserializer = getJavaBeanDeserializer(fieldClass);
                        }
                    }}

                    }__CLR4_1_1011y11yluszvsmz.R.inc(1681);if ((((beanDeserializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1682)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1683)==0&false))) {{

                        __CLR4_1_1011y11yluszvsmz.R.inc(1684);if ((((beanDeserializer.beanInfo.defaultConstructor != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1685)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1686)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(1687);newObj = beanDeserializer.createInstance(null, fieldClass);
                        } }else {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(1688);return false;
                        }
                    }} }else {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1689);newObj = new JSONObject();
                    }
                }} }else {__CLR4_1_1011y11yluszvsmz.R.inc(1690);if ((((nextSegment instanceof ArrayAccessSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1691)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1692)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1693);newObj = new JSONArray();
                }
                
                }}__CLR4_1_1011y11yluszvsmz.R.inc(1694);if ((((newObj != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1695)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1696)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1697);if ((((segment instanceof PropertySegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1698)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1699)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1700);PropertySegment propSegement = (PropertySegment) segment;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1701);propSegement.setValue(this, parentObject, newObj);
                        __CLR4_1_1011y11yluszvsmz.R.inc(1702);currentObject = newObj;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1703);continue;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(1704);if ((((segment instanceof ArrayAccessSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1705)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1706)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1707);ArrayAccessSegment arrayAccessSegement = (ArrayAccessSegment) segment;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1708);arrayAccessSegement.setValue(this, parentObject, newObj);
                        __CLR4_1_1011y11yluszvsmz.R.inc(1709);currentObject = newObj;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1710);continue;
                    }
                }}}
                
                }__CLR4_1_1011y11yluszvsmz.R.inc(1711);break;
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(1712);if ((((parentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1713)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1714)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1715);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1716);Segment lastSegment = segments[segments.length - 1];
        __CLR4_1_1011y11yluszvsmz.R.inc(1717);if ((((lastSegment instanceof PropertySegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1718)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1719)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1720);PropertySegment propertySegment = (PropertySegment) lastSegment;
            __CLR4_1_1011y11yluszvsmz.R.inc(1721);propertySegment.setValue(this, parentObject, value);
            __CLR4_1_1011y11yluszvsmz.R.inc(1722);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1723);if ((((lastSegment instanceof ArrayAccessSegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1724)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1725)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1726);return ((ArrayAccessSegment) lastSegment).setValue(this, parentObject, value);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1727);throw new UnsupportedOperationException();
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static Object eval(Object rootObject, String path) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1728);
        __CLR4_1_1011y11yluszvsmz.R.inc(1729);JSONPath jsonpath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1730);return jsonpath.eval(rootObject);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static int size(Object rootObject, String path) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1731);
        __CLR4_1_1011y11yluszvsmz.R.inc(1732);JSONPath jsonpath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1733);Object result = jsonpath.eval(rootObject);
        __CLR4_1_1011y11yluszvsmz.R.inc(1734);return jsonpath.evalSize(result);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    /**
     * Compile jsonPath and use it to extract keySet or field names from rootObject.
     * 
     * @param rootObject Can be a map or custom object. Array and Collection are not supported.
     * @param path JSONPath string to be compiled.
     * @return Set of keys, or <code>null</code> if not supported.
     */
    public static Set<?> keySet(Object rootObject, String path) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1735);
        __CLR4_1_1011y11yluszvsmz.R.inc(1736);JSONPath jsonpath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1737);Object result = jsonpath.eval(rootObject);
        __CLR4_1_1011y11yluszvsmz.R.inc(1738);return jsonpath.evalKeySet(result);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static boolean contains(Object rootObject, String path) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1739);
        __CLR4_1_1011y11yluszvsmz.R.inc(1740);if ((((rootObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1741)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1742)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1743);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1744);JSONPath jsonpath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1745);return jsonpath.contains(rootObject);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static boolean containsValue(Object rootObject, String path, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1746);
        __CLR4_1_1011y11yluszvsmz.R.inc(1747);JSONPath jsonpath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1748);return jsonpath.containsValue(rootObject, value);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static void arrayAdd(Object rootObject, String path, Object... values) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1749);
        __CLR4_1_1011y11yluszvsmz.R.inc(1750);JSONPath jsonpath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1751);jsonpath.arrayAdd(rootObject, values);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static boolean set(Object rootObject, String path, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1752);
        __CLR4_1_1011y11yluszvsmz.R.inc(1753);JSONPath jsonpath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1754);return jsonpath.set(rootObject, value);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    
    public static boolean remove(Object root, String path) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1755);
        __CLR4_1_1011y11yluszvsmz.R.inc(1756);JSONPath jsonpath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1757);return jsonpath.remove(root);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static JSONPath compile(String path) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1758);
        __CLR4_1_1011y11yluszvsmz.R.inc(1759);if ((((path == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1760)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1761)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1762);throw new JSONPathException("jsonpath can not be null");
        }
        
        }__CLR4_1_1011y11yluszvsmz.R.inc(1763);JSONPath jsonpath = pathCache.get(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1764);if ((((jsonpath == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1765)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1766)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1767);jsonpath = new JSONPath(path);
            __CLR4_1_1011y11yluszvsmz.R.inc(1768);if ((((pathCache.size() < 1024)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1769)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1770)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1771);pathCache.putIfAbsent(path, jsonpath);
                __CLR4_1_1011y11yluszvsmz.R.inc(1772);jsonpath = pathCache.get(path);
            }
        }}
        }__CLR4_1_1011y11yluszvsmz.R.inc(1773);return jsonpath;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    /**
     * @since 1.2.9
     * @param json
     * @param path
     * @return
     */
    public static Object read(String json, String path) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1774);
        __CLR4_1_1011y11yluszvsmz.R.inc(1775);return compile(path)
                .eval(
                        JSON.parse(json)
                );
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    /**
     * @since 1.2.51
     * @param json
     * @param path
     * @return
     */
    public static Object extract(String json, String path, ParserConfig config, int features, Feature... optionFeatures) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1776);
        __CLR4_1_1011y11yluszvsmz.R.inc(1777);features |= Feature.OrderedField.mask;
        __CLR4_1_1011y11yluszvsmz.R.inc(1778);DefaultJSONParser parser = new DefaultJSONParser(json, config, features);
        __CLR4_1_1011y11yluszvsmz.R.inc(1779);JSONPath jsonPath = compile(path);
        __CLR4_1_1011y11yluszvsmz.R.inc(1780);Object result = jsonPath.extract(parser);
        __CLR4_1_1011y11yluszvsmz.R.inc(1781);parser.lexer.close();
        __CLR4_1_1011y11yluszvsmz.R.inc(1782);return result;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static Object extract(String json, String path) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1783);
        __CLR4_1_1011y11yluszvsmz.R.inc(1784);return extract(json, path, ParserConfig.global, JSON.DEFAULT_PARSER_FEATURE);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static Map<String, Object> paths(Object javaObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1785);
        __CLR4_1_1011y11yluszvsmz.R.inc(1786);return paths(javaObject, SerializeConfig.globalInstance);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    
    public static Map<String, Object> paths(Object javaObject, SerializeConfig config) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1787);
        __CLR4_1_1011y11yluszvsmz.R.inc(1788);Map<Object, String> values = new IdentityHashMap<Object, String>();
        __CLR4_1_1011y11yluszvsmz.R.inc(1789);Map<String, Object> paths = new HashMap<String, Object>();

        __CLR4_1_1011y11yluszvsmz.R.inc(1790);paths(values, paths, "/", javaObject, config);
        __CLR4_1_1011y11yluszvsmz.R.inc(1791);return paths;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    private static void paths(Map<Object, String> values, Map<String, Object> paths, String parent, Object javaObject, SerializeConfig config) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1792);
        __CLR4_1_1011y11yluszvsmz.R.inc(1793);if ((((javaObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1794)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1795)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1796);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1797);String p = values.put(javaObject, parent);
        __CLR4_1_1011y11yluszvsmz.R.inc(1798);if ((((p != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1799)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1800)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1801);boolean basicType =  javaObject instanceof String
                    || javaObject instanceof Number
                    || javaObject instanceof Date
                    || javaObject instanceof UUID;

            __CLR4_1_1011y11yluszvsmz.R.inc(1802);if ((((!basicType)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1803)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1804)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1805);return;
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(1806);paths.put(parent, javaObject);

        __CLR4_1_1011y11yluszvsmz.R.inc(1807);if ((((javaObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1808)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1809)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1810);Map map = (Map) javaObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(1811);for (Object entryObj : map.entrySet()) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1812);Map.Entry entry = (Map.Entry) entryObj;
                __CLR4_1_1011y11yluszvsmz.R.inc(1813);Object key = entry.getKey();

                __CLR4_1_1011y11yluszvsmz.R.inc(1814);if ((((key instanceof String)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1815)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1816)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1817);String path = (((parent.equals("/") )&&(__CLR4_1_1011y11yluszvsmz.R.iget(1818)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1819)==0&false))?  "/" + key : parent + "/" + key;
                    __CLR4_1_1011y11yluszvsmz.R.inc(1820);paths(values, paths, path, entry.getValue(), config);
                }
            }}
            }__CLR4_1_1011y11yluszvsmz.R.inc(1821);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1822);if ((((javaObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1823)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1824)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1825);Collection collection = (Collection) javaObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(1826);int i = 0;
            __CLR4_1_1011y11yluszvsmz.R.inc(1827);for (Object item : collection) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1828);String path = (((parent.equals("/") )&&(__CLR4_1_1011y11yluszvsmz.R.iget(1829)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1830)==0&false))?  "/" + i : parent + "/" + i;
                __CLR4_1_1011y11yluszvsmz.R.inc(1831);paths(values, paths, path, item, config);
                __CLR4_1_1011y11yluszvsmz.R.inc(1832);++i;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(1833);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1834);Class<?> clazz = javaObject.getClass();

        __CLR4_1_1011y11yluszvsmz.R.inc(1835);if ((((clazz.isArray())&&(__CLR4_1_1011y11yluszvsmz.R.iget(1836)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1837)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1838);int len = Array.getLength(javaObject);

            __CLR4_1_1011y11yluszvsmz.R.inc(1839);for (int i = 0; (((i < len)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1840)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1841)==0&false)); ++i) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1842);Object item = Array.get(javaObject, i);

                __CLR4_1_1011y11yluszvsmz.R.inc(1843);String path = (((parent.equals("/") )&&(__CLR4_1_1011y11yluszvsmz.R.iget(1844)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1845)==0&false))?  "/" + i : parent + "/" + i;
                __CLR4_1_1011y11yluszvsmz.R.inc(1846);paths(values, paths, path, item, config);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(1847);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1848);if ((((ParserConfig.isPrimitive2(clazz) || clazz.isEnum())&&(__CLR4_1_1011y11yluszvsmz.R.iget(1849)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1850)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1851);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1852);ObjectSerializer serializer = config.getObjectWriter(clazz);
        __CLR4_1_1011y11yluszvsmz.R.inc(1853);if ((((serializer instanceof JavaBeanSerializer)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1854)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1855)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(1856);JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) serializer;

            __CLR4_1_1011y11yluszvsmz.R.inc(1857);try {
                __CLR4_1_1011y11yluszvsmz.R.inc(1858);Map<String, Object> fieldValues = javaBeanSerializer.getFieldValuesMap(javaObject);
                __CLR4_1_1011y11yluszvsmz.R.inc(1859);for (Map.Entry<String, Object> entry : fieldValues.entrySet()) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1860);String key = entry.getKey();

                    __CLR4_1_1011y11yluszvsmz.R.inc(1861);if ((((key instanceof String)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1862)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1863)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1864);String path = (((parent.equals("/") )&&(__CLR4_1_1011y11yluszvsmz.R.iget(1865)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1866)==0&false))?  "/" + key : parent + "/" + key;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1867);paths(values, paths, path, entry.getValue(), config);
                    }
                }}
            }} catch (Exception e) {
                __CLR4_1_1011y11yluszvsmz.R.inc(1868);throw new JSONException("toJSON error", e);
            }
            __CLR4_1_1011y11yluszvsmz.R.inc(1869);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(1870);return;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public String getPath() {try{__CLR4_1_1011y11yluszvsmz.R.inc(1871);
        __CLR4_1_1011y11yluszvsmz.R.inc(1872);return path;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    static class JSONPathParser {

        private final String path;
        private int          pos;
        private char         ch;
        private int          level;
        private boolean      hasRefSegment;

        public JSONPathParser(String path){try{__CLR4_1_1011y11yluszvsmz.R.inc(1873);
            __CLR4_1_1011y11yluszvsmz.R.inc(1874);this.path = path;
            __CLR4_1_1011y11yluszvsmz.R.inc(1875);next();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        void next() {try{__CLR4_1_1011y11yluszvsmz.R.inc(1876);
            __CLR4_1_1011y11yluszvsmz.R.inc(1877);ch = path.charAt(pos++);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        char getNextChar() {try{__CLR4_1_1011y11yluszvsmz.R.inc(1878);
            __CLR4_1_1011y11yluszvsmz.R.inc(1879);return path.charAt(pos);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        boolean isEOF() {try{__CLR4_1_1011y11yluszvsmz.R.inc(1880);
            __CLR4_1_1011y11yluszvsmz.R.inc(1881);return pos >= path.length();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        Segment readSegement() {try{__CLR4_1_1011y11yluszvsmz.R.inc(1882);
            __CLR4_1_1011y11yluszvsmz.R.inc(1883);if ((((level == 0 && path.length() == 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1884)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1885)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1886);if ((((isDigitFirst(ch))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1887)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1888)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1889);int index = ch - '0';
                    __CLR4_1_1011y11yluszvsmz.R.inc(1890);return new ArrayAccessSegment(index);
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(1891);if (((((ch >= 'a' && ch <= 'z') || ((ch >= 'A' && ch <= 'Z')))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1892)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1893)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1894);return new PropertySegment(Character.toString(ch), false);
                }
            }}}
            }__CLR4_1_1011y11yluszvsmz.R.inc(1895);while ((((!isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(1896)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1897)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1898);skipWhitespace();

                __CLR4_1_1011y11yluszvsmz.R.inc(1899);if ((((ch == '$')&&(__CLR4_1_1011y11yluszvsmz.R.iget(1900)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1901)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1902);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(1903);continue;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(1904);if ((((ch == '.' || ch == '/')&&(__CLR4_1_1011y11yluszvsmz.R.iget(1905)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1906)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1907);int c0 = ch;
                    __CLR4_1_1011y11yluszvsmz.R.inc(1908);boolean deep = false;
                    __CLR4_1_1011y11yluszvsmz.R.inc(1909);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(1910);if ((((c0 == '.' && ch == '.')&&(__CLR4_1_1011y11yluszvsmz.R.iget(1911)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1912)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1913);next();
                        __CLR4_1_1011y11yluszvsmz.R.inc(1914);deep = true;
                        __CLR4_1_1011y11yluszvsmz.R.inc(1915);if ((((path.length() > pos + 3
                                && ch == '['
                                && path.charAt(pos) == '*'
                                && path.charAt(pos + 1) == ']'
                                && path.charAt(pos + 2) == '.')&&(__CLR4_1_1011y11yluszvsmz.R.iget(1916)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1917)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(1918);next();
                            __CLR4_1_1011y11yluszvsmz.R.inc(1919);next();
                            __CLR4_1_1011y11yluszvsmz.R.inc(1920);next();
                            __CLR4_1_1011y11yluszvsmz.R.inc(1921);next();
                        }
                    }}
                    }__CLR4_1_1011y11yluszvsmz.R.inc(1922);if ((((ch == '*')&&(__CLR4_1_1011y11yluszvsmz.R.iget(1923)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1924)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1925);if ((((!isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(1926)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1927)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(1928);next();
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(1929);return (((deep )&&(__CLR4_1_1011y11yluszvsmz.R.iget(1930)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1931)==0&false))? WildCardSegment.instance_deep : WildCardSegment.instance;
                    }
                    
                    }__CLR4_1_1011y11yluszvsmz.R.inc(1932);if ((((isDigitFirst(ch))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1933)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1934)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1935);return parseArrayAccess(false);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(1936);String propertyName = readName();
                    __CLR4_1_1011y11yluszvsmz.R.inc(1937);if ((((ch == '(')&&(__CLR4_1_1011y11yluszvsmz.R.iget(1938)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1939)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(1940);next();
                        __CLR4_1_1011y11yluszvsmz.R.inc(1941);if ((((ch == ')')&&(__CLR4_1_1011y11yluszvsmz.R.iget(1942)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1943)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(1944);if ((((!isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(1945)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1946)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(1947);next();
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(1948);if (((("size".equals(propertyName) || "length".equals(propertyName))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1949)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1950)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(1951);return SizeSegment.instance;
                            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(1952);if (((("max".equals(propertyName))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1953)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1954)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(1955);return MaxSegment.instance;
                            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(1956);if (((("min".equals(propertyName))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1957)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1958)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(1959);return MinSegment.instance;
                            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(1960);if (((("keySet".equals(propertyName))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1961)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1962)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(1963);return KeySetSegment.instance;
                            }

                            }}}}__CLR4_1_1011y11yluszvsmz.R.inc(1964);throw new JSONPathException("not support jsonpath : " + path);
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(1965);throw new JSONPathException("not support jsonpath : " + path);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(1966);return new PropertySegment(propertyName, deep);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(1967);if ((((ch == '[')&&(__CLR4_1_1011y11yluszvsmz.R.iget(1968)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1969)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1970);return parseArrayAccess(true);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(1971);if ((((level == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1972)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1973)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1974);String propertyName = readName();

                    __CLR4_1_1011y11yluszvsmz.R.inc(1975);return new PropertySegment(propertyName, false);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(1976);throw new JSONPathException("not support jsonpath : " + path);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(1977);return null;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public final void skipWhitespace() {try{__CLR4_1_1011y11yluszvsmz.R.inc(1978);
            __CLR4_1_1011y11yluszvsmz.R.inc(1979);for (;;) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1980);if ((((ch <= ' ' && (ch == ' ' || ch == '\r' || ch == '\n' || ch == '\t' || ch == '\f' || ch == '\b'))&&(__CLR4_1_1011y11yluszvsmz.R.iget(1981)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1982)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1983);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(1984);continue;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(1985);break;
                }
            }}
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        Segment parseArrayAccess(boolean acceptBracket) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1986);
            __CLR4_1_1011y11yluszvsmz.R.inc(1987);Object object = parseArrayAccessFilter(acceptBracket);
            __CLR4_1_1011y11yluszvsmz.R.inc(1988);if ((((object instanceof Segment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1989)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1990)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1991);return ((Segment) object);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(1992);return new FilterSegment((Filter) object);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        Object parseArrayAccessFilter(boolean acceptBracket) {try{__CLR4_1_1011y11yluszvsmz.R.inc(1993);
            __CLR4_1_1011y11yluszvsmz.R.inc(1994);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(1995)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(1996)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(1997);accept('[');
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(1998);boolean predicateFlag = false;

            __CLR4_1_1011y11yluszvsmz.R.inc(1999);if ((((ch == '?')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2000)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2001)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2002);next();
                __CLR4_1_1011y11yluszvsmz.R.inc(2003);accept('(');
                __CLR4_1_1011y11yluszvsmz.R.inc(2004);predicateFlag = true;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2005);if ((((predicateFlag || IOUtils.firstIdentifier(ch) || ch == '\\' || ch == '@')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2006)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2007)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2008);boolean self = false;
                __CLR4_1_1011y11yluszvsmz.R.inc(2009);if ((((ch == '@')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2010)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2011)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2012);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2013);accept('.');
                    __CLR4_1_1011y11yluszvsmz.R.inc(2014);self = true;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(2015);String propertyName = readName();

                __CLR4_1_1011y11yluszvsmz.R.inc(2016);skipWhitespace();

                __CLR4_1_1011y11yluszvsmz.R.inc(2017);if ((((predicateFlag && ch == ')')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2018)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2019)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2020);next();

                    __CLR4_1_1011y11yluszvsmz.R.inc(2021);Filter filter = new NotNullSegement(propertyName);
                    __CLR4_1_1011y11yluszvsmz.R.inc(2022);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2023)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2024)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2025);next();
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2026);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2027)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2028)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2029);filter = filterRest(filter);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2030);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2031)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2032)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2033);accept(']');
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(2034);return filter;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2035);if ((((acceptBracket && ch == ']')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2036)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2037)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2038);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2039);Filter filter = new NotNullSegement(propertyName);
                    __CLR4_1_1011y11yluszvsmz.R.inc(2040);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2041)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2042)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2043);next();
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2044);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2045)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2046)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2047);filter = filterRest(filter);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2048);accept(')');
                    __CLR4_1_1011y11yluszvsmz.R.inc(2049);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2050)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2051)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2052);accept(')');
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2053);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2054)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2055)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2056);accept(']');
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(2057);return filter;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2058);Operator op = readOp();

                __CLR4_1_1011y11yluszvsmz.R.inc(2059);skipWhitespace();

                __CLR4_1_1011y11yluszvsmz.R.inc(2060);if ((((op == Operator.BETWEEN || op == Operator.NOT_BETWEEN)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2061)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2062)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2063);final boolean not = (op == Operator.NOT_BETWEEN);

                    __CLR4_1_1011y11yluszvsmz.R.inc(2064);Object startValue = readValue();

                    __CLR4_1_1011y11yluszvsmz.R.inc(2065);String name = readName();

                    __CLR4_1_1011y11yluszvsmz.R.inc(2066);if ((((!"and".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2067)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2068)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2069);throw new JSONPathException(path);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2070);Object endValue = readValue();

                    __CLR4_1_1011y11yluszvsmz.R.inc(2071);if ((((startValue == null || endValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2072)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2073)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2074);throw new JSONPathException(path);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2075);if ((((isInt(startValue.getClass()) && isInt(endValue.getClass()))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2076)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2077)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2078);Filter filter = new IntBetweenSegement(propertyName
                                , TypeUtils.longExtractValue((Number) startValue)
                                , TypeUtils.longExtractValue((Number) endValue)
                                , not);
                        __CLR4_1_1011y11yluszvsmz.R.inc(2079);return filter;
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2080);throw new JSONPathException(path);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2081);if ((((op == Operator.IN || op == Operator.NOT_IN)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2082)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2083)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2084);final boolean not = (op == Operator.NOT_IN);
                    __CLR4_1_1011y11yluszvsmz.R.inc(2085);accept('(');

                    __CLR4_1_1011y11yluszvsmz.R.inc(2086);List<Object> valueList = new JSONArray();
                    {
                        __CLR4_1_1011y11yluszvsmz.R.inc(2087);Object value = readValue();
                        __CLR4_1_1011y11yluszvsmz.R.inc(2088);valueList.add(value);

                        __CLR4_1_1011y11yluszvsmz.R.inc(2089);for (;;) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2090);skipWhitespace();
                            __CLR4_1_1011y11yluszvsmz.R.inc(2091);if ((((ch != ',')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2092)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2093)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2094);break;
                            }
                            }__CLR4_1_1011y11yluszvsmz.R.inc(2095);next();

                            __CLR4_1_1011y11yluszvsmz.R.inc(2096);value = readValue();
                            __CLR4_1_1011y11yluszvsmz.R.inc(2097);valueList.add(value);
                        }
                    }}

                    __CLR4_1_1011y11yluszvsmz.R.inc(2098);boolean isInt = true;
                    __CLR4_1_1011y11yluszvsmz.R.inc(2099);boolean isIntObj = true;
                    __CLR4_1_1011y11yluszvsmz.R.inc(2100);boolean isString = true;
                    __CLR4_1_1011y11yluszvsmz.R.inc(2101);for (Object item : valueList) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2102);if ((((item == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2103)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2104)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2105);if ((((isInt)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2106)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2107)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2108);isInt = false;
                            }
                            }__CLR4_1_1011y11yluszvsmz.R.inc(2109);continue;
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2110);Class<?> clazz = item.getClass();
                        __CLR4_1_1011y11yluszvsmz.R.inc(2111);if ((((isInt && !(clazz == Byte.class || clazz == Short.class || clazz == Integer.class
                                       || clazz == Long.class))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2112)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2113)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2114);isInt = false;
                            __CLR4_1_1011y11yluszvsmz.R.inc(2115);isIntObj = false;
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2116);if ((((isString && clazz != String.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2117)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2118)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2119);isString = false;
                        }
                    }}

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2120);if ((((valueList.size() == 1 && valueList.get(0) == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2121)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2122)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2123);Filter filter;
                        __CLR4_1_1011y11yluszvsmz.R.inc(2124);if ((((not)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2125)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2126)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2127);filter = new NotNullSegement(propertyName);
                        } }else {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2128);filter = new NullSegement(propertyName);
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2129);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2130)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2131)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2132);next();
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2133);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2134)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2135)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2136);filter = filterRest(filter);
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2137);accept(')');
                        __CLR4_1_1011y11yluszvsmz.R.inc(2138);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2139)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2140)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2141);accept(')');
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2142);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2143)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2144)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2145);accept(']');
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2146);return filter;
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2147);if ((((isInt)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2148)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2149)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2150);if ((((valueList.size() == 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2151)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2152)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2153);long value = TypeUtils.longExtractValue((Number) valueList.get(0));
                            __CLR4_1_1011y11yluszvsmz.R.inc(2154);Operator intOp = (((not )&&(__CLR4_1_1011y11yluszvsmz.R.iget(2155)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2156)==0&false))? Operator.NE : Operator.EQ;
                            __CLR4_1_1011y11yluszvsmz.R.inc(2157);Filter filter = new IntOpSegement(propertyName, value, intOp);
                            __CLR4_1_1011y11yluszvsmz.R.inc(2158);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2159)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2160)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2161);next();
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2162);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2163)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2164)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2165);filter = filterRest(filter);
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2166);accept(')');
                            __CLR4_1_1011y11yluszvsmz.R.inc(2167);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2168)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2169)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2170);accept(')');
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2171);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2172)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2173)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2174);accept(']');
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2175);return filter;
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2176);long[] values = new long[valueList.size()];
                        __CLR4_1_1011y11yluszvsmz.R.inc(2177);for (int i = 0; (((i < values.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2178)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2179)==0&false)); ++i) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2180);values[i] = TypeUtils.longExtractValue((Number) valueList.get(i));
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2181);Filter filter = new IntInSegement(propertyName, values, not);

                        __CLR4_1_1011y11yluszvsmz.R.inc(2182);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2183)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2184)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2185);next();
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2186);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2187)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2188)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2189);filter = filterRest(filter);
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2190);accept(')');
                        __CLR4_1_1011y11yluszvsmz.R.inc(2191);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2192)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2193)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2194);accept(')');
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2195);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2196)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2197)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2198);accept(']');
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2199);return filter;
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2200);if ((((isString)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2201)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2202)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2203);if ((((valueList.size() == 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2204)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2205)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2206);String value = (String) valueList.get(0);

                            __CLR4_1_1011y11yluszvsmz.R.inc(2207);Operator intOp = (((not )&&(__CLR4_1_1011y11yluszvsmz.R.iget(2208)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2209)==0&false))? Operator.NE : Operator.EQ;
                            __CLR4_1_1011y11yluszvsmz.R.inc(2210);Filter filter = new StringOpSegement(propertyName, value, intOp);

                            __CLR4_1_1011y11yluszvsmz.R.inc(2211);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2212)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2213)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2214);next();
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2215);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2216)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2217)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2218);filter = filterRest(filter);
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2219);accept(')');
                            __CLR4_1_1011y11yluszvsmz.R.inc(2220);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2221)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2222)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2223);accept(')');
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2224);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2225)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2226)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2227);accept(']');
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2228);return filter;
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2229);String[] values = new String[valueList.size()];
                        __CLR4_1_1011y11yluszvsmz.R.inc(2230);valueList.toArray(values);

                        __CLR4_1_1011y11yluszvsmz.R.inc(2231);Filter filter = new StringInSegement(propertyName, values, not);

                        __CLR4_1_1011y11yluszvsmz.R.inc(2232);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2233)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2234)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2235);next();
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2236);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2237)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2238)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2239);filter = filterRest(filter);
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2240);accept(')');
                        __CLR4_1_1011y11yluszvsmz.R.inc(2241);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2242)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2243)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2244);accept(')');
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2245);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2246)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2247)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2248);accept(']');
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2249);return filter;
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2250);if ((((isIntObj)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2251)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2252)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2253);Long[] values = new Long[valueList.size()];
                        __CLR4_1_1011y11yluszvsmz.R.inc(2254);for (int i = 0; (((i < values.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2255)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2256)==0&false)); ++i) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2257);Number item = (Number) valueList.get(i);
                            __CLR4_1_1011y11yluszvsmz.R.inc(2258);if ((((item != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2259)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2260)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2261);values[i] = TypeUtils.longExtractValue(item);
                            }
                        }}

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2262);Filter filter = new IntObjInSegement(propertyName, values, not);

                        __CLR4_1_1011y11yluszvsmz.R.inc(2263);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2264)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2265)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2266);next();
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2267);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2268)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2269)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2270);filter = filterRest(filter);
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2271);accept(')');
                        __CLR4_1_1011y11yluszvsmz.R.inc(2272);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2273)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2274)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2275);accept(')');
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2276);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2277)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2278)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2279);accept(']');
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2280);return filter;
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2281);throw new UnsupportedOperationException();
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2282);if ((((ch == '\'' || ch == '"')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2283)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2284)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2285);String strValue = readString();

                    __CLR4_1_1011y11yluszvsmz.R.inc(2286);Filter filter = null;
                    __CLR4_1_1011y11yluszvsmz.R.inc(2287);if ((((op == Operator.RLIKE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2288)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2289)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2290);filter = new RlikeSegement(propertyName, strValue, false);
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2291);if ((((op == Operator.NOT_RLIKE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2292)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2293)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2294);filter = new RlikeSegement(propertyName, strValue, true);
                    } }else  {__CLR4_1_1011y11yluszvsmz.R.inc(2295);if ((((op == Operator.LIKE || op == Operator.NOT_LIKE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2296)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2297)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2298);while ((((strValue.indexOf("%%") != -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2299)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2300)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2301);strValue = strValue.replaceAll("%%", "%");
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2302);final boolean not = (op == Operator.NOT_LIKE);

                        __CLR4_1_1011y11yluszvsmz.R.inc(2303);int p0 = strValue.indexOf('%');
                        __CLR4_1_1011y11yluszvsmz.R.inc(2304);if ((((p0 == -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2305)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2306)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2307);if ((((op == Operator.LIKE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2308)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2309)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2310);op = Operator.EQ;
                            } }else {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2311);op = Operator.NE;
                            }
                            }__CLR4_1_1011y11yluszvsmz.R.inc(2312);filter = new StringOpSegement(propertyName, strValue, op);
                        } }else {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2313);String[] items = strValue.split("%");

                            __CLR4_1_1011y11yluszvsmz.R.inc(2314);String startsWithValue = null;
                            __CLR4_1_1011y11yluszvsmz.R.inc(2315);String endsWithValue = null;
                            __CLR4_1_1011y11yluszvsmz.R.inc(2316);String[] containsValues = null;
                            __CLR4_1_1011y11yluszvsmz.R.inc(2317);if ((((p0 == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2318)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2319)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2320);if ((((strValue.charAt(strValue.length() - 1) == '%')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2321)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2322)==0&false))) {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2323);containsValues = new String[items.length - 1];
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2324);System.arraycopy(items, 1, containsValues, 0, containsValues.length);
                                } }else {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2325);endsWithValue = items[items.length - 1];
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2326);if ((((items.length > 2)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2327)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2328)==0&false))) {{
                                        __CLR4_1_1011y11yluszvsmz.R.inc(2329);containsValues = new String[items.length - 2];
                                        __CLR4_1_1011y11yluszvsmz.R.inc(2330);System.arraycopy(items, 1, containsValues, 0, containsValues.length);
                                    }
                                }}
                            }} }else {__CLR4_1_1011y11yluszvsmz.R.inc(2331);if ((((strValue.charAt(strValue.length() - 1) == '%')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2332)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2333)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2334);if ((((items.length == 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2335)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2336)==0&false))) {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2337);startsWithValue = items[0];
                                } }else {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2338);containsValues = items;
                                }
                            }} }else {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2339);if ((((items.length == 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2340)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2341)==0&false))) {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2342);startsWithValue = items[0];
                                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2343);if ((((items.length == 2)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2344)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2345)==0&false))) {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2346);startsWithValue = items[0];
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2347);endsWithValue = items[1];
                                } }else {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2348);startsWithValue = items[0];
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2349);endsWithValue = items[items.length - 1];
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2350);containsValues = new String[items.length - 2];
                                    __CLR4_1_1011y11yluszvsmz.R.inc(2351);System.arraycopy(items, 1, containsValues, 0, containsValues.length);
                                }
                            }}}

                            }}__CLR4_1_1011y11yluszvsmz.R.inc(2352);filter = new MatchSegement(propertyName, startsWithValue, endsWithValue,
                                    containsValues, not);
                        }
                    }} }else {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2353);filter = new StringOpSegement(propertyName, strValue, op);
                    }

                    }}}__CLR4_1_1011y11yluszvsmz.R.inc(2354);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2355)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2356)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2357);next();
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2358);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2359)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2360)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2361);filter = filterRest(filter);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2362);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2363)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2364)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2365);accept(')');
                    }
                    
                    }__CLR4_1_1011y11yluszvsmz.R.inc(2366);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2367)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2368)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2369);accept(']');
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2370);return filter;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2371);if ((((isDigitFirst(ch))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2372)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2373)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2374);long value = readLongValue();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2375);double doubleValue = 0D;
                    __CLR4_1_1011y11yluszvsmz.R.inc(2376);if ((((ch == '.')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2377)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2378)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2379);doubleValue = readDoubleValue(value);
                        
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2380);Filter filter;

                    __CLR4_1_1011y11yluszvsmz.R.inc(2381);if ((((doubleValue == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2382)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2383)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2384);filter = new IntOpSegement(propertyName, value, op);
                    } }else {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2385);filter = new DoubleOpSegement(propertyName, doubleValue, op);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2386);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2387)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2388)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2389);next();
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2390);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2391)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2392)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2393);filter = filterRest(filter);
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2394);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2395)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2396)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2397);accept(')');
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2398);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2399)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2400)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2401);accept(']');
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2402);return filter;
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2403);if ((((ch == '$')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2404)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2405)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2406);Segment segment = readSegement();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2407);RefOpSegement filter = new RefOpSegement(propertyName, segment, op);
                    __CLR4_1_1011y11yluszvsmz.R.inc(2408);hasRefSegment = true;
                    __CLR4_1_1011y11yluszvsmz.R.inc(2409);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2410)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2411)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2412);next();
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2413);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2414)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2415)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2416);accept(')');
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2417);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2418)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2419)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2420);accept(']');
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2421);return filter;
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2422);if ((((ch == '/')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2423)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2424)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2425);int flags = 0;
                    __CLR4_1_1011y11yluszvsmz.R.inc(2426);StringBuilder regBuf = new StringBuilder();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2427);for (;;) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2428);next();
                        __CLR4_1_1011y11yluszvsmz.R.inc(2429);if ((((ch == '/')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2430)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2431)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2432);next();
                            __CLR4_1_1011y11yluszvsmz.R.inc(2433);if ((((ch == 'i')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2434)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2435)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2436);next();
                                __CLR4_1_1011y11yluszvsmz.R.inc(2437);flags |= Pattern.CASE_INSENSITIVE;
                            }
                            }__CLR4_1_1011y11yluszvsmz.R.inc(2438);break;
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2439);if ((((ch == '\\')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2440)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2441)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2442);next();
                            __CLR4_1_1011y11yluszvsmz.R.inc(2443);regBuf.append(ch);
                        } }else {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2444);regBuf.append(ch);
                        }
                    }}

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2445);Pattern pattern = Pattern.compile(regBuf.toString(), flags);
                    __CLR4_1_1011y11yluszvsmz.R.inc(2446);RegMatchSegement filter = new RegMatchSegement(propertyName, pattern, op);

                    __CLR4_1_1011y11yluszvsmz.R.inc(2447);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2448)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2449)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2450);accept(')');
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2451);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2452)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2453)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2454);accept(']');
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2455);return filter;
                }

                }}}__CLR4_1_1011y11yluszvsmz.R.inc(2456);if ((((ch == 'n')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2457)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2458)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2459);String name = readName();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2460);if (((("null".equals(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2461)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2462)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2463);Filter filter = null;
                        __CLR4_1_1011y11yluszvsmz.R.inc(2464);if ((((op == Operator.EQ)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2465)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2466)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2467);filter = new NullSegement(propertyName);
                        } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2468);if ((((op == Operator.NE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2469)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2470)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2471);filter = new NotNullSegement(propertyName);
                        }

                        }}__CLR4_1_1011y11yluszvsmz.R.inc(2472);if ((((filter != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2473)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2474)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2475);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2476)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2477)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2478);next();
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2479);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2480)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2481)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2482);filter = filterRest(filter);
                            }
                        }}

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2483);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2484)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2485)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2486);accept(')');
                        }
                        }__CLR4_1_1011y11yluszvsmz.R.inc(2487);accept(']');

                        __CLR4_1_1011y11yluszvsmz.R.inc(2488);if ((((filter != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2489)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2490)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2491);return filter;
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2492);throw new UnsupportedOperationException();
                    }
                }} }else {__CLR4_1_1011y11yluszvsmz.R.inc(2493);if ((((ch == 't')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2494)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2495)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2496);String name = readName();
                    
                    __CLR4_1_1011y11yluszvsmz.R.inc(2497);if (((("true".equals(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2498)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2499)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2500);Filter filter = null;

                        __CLR4_1_1011y11yluszvsmz.R.inc(2501);if ((((op == Operator.EQ)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2502)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2503)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2504);filter = new ValueSegment(propertyName, Boolean.TRUE, true);
                        } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2505);if ((((op == Operator.NE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2506)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2507)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2508);filter = new ValueSegment(propertyName, Boolean.TRUE, false);
                        }

                        }}__CLR4_1_1011y11yluszvsmz.R.inc(2509);if ((((filter != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2510)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2511)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2512);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2513)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2514)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2515);next();
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2516);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2517)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2518)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2519);filter = filterRest(filter);
                            }
                        }}

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2520);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2521)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2522)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2523);accept(')');
                        }
                        }__CLR4_1_1011y11yluszvsmz.R.inc(2524);accept(']');

                        __CLR4_1_1011y11yluszvsmz.R.inc(2525);if ((((filter != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2526)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2527)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2528);return filter;
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2529);throw new UnsupportedOperationException();
                    }
                }} }else {__CLR4_1_1011y11yluszvsmz.R.inc(2530);if ((((ch == 'f')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2531)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2532)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2533);String name = readName();
                    
                    __CLR4_1_1011y11yluszvsmz.R.inc(2534);if (((("false".equals(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2535)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2536)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2537);Filter filter = null;

                        __CLR4_1_1011y11yluszvsmz.R.inc(2538);if ((((op == Operator.EQ)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2539)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2540)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2541);filter = new ValueSegment(propertyName, Boolean.FALSE, true);
                        } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2542);if ((((op == Operator.NE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2543)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2544)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2545);filter = new ValueSegment(propertyName, Boolean.FALSE, false);
                        }

                        }}__CLR4_1_1011y11yluszvsmz.R.inc(2546);if ((((filter != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2547)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2548)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2549);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2550)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2551)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2552);next();
                            }

                            }__CLR4_1_1011y11yluszvsmz.R.inc(2553);if ((((ch == '&' || ch == '|')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2554)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2555)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(2556);filter = filterRest(filter);
                            }
                        }}

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2557);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2558)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2559)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2560);accept(')');
                        }
                        }__CLR4_1_1011y11yluszvsmz.R.inc(2561);accept(']');

                        __CLR4_1_1011y11yluszvsmz.R.inc(2562);if ((((filter != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2563)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2564)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2565);return filter;
                        }

                        }__CLR4_1_1011y11yluszvsmz.R.inc(2566);throw new UnsupportedOperationException();
                    }
                }}

                }}}__CLR4_1_1011y11yluszvsmz.R.inc(2567);throw new UnsupportedOperationException();
                // accept(')');
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2568);int start = pos - 1;
            __CLR4_1_1011y11yluszvsmz.R.inc(2569);char startCh = ch;
            __CLR4_1_1011y11yluszvsmz.R.inc(2570);while ((((ch != ']' && ch != '/' && !isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(2571)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2572)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2573);if ((((ch == '.' //
                        && (!predicateFlag) // 
                        && !predicateFlag
                        && startCh != '\''
                )&&(__CLR4_1_1011y11yluszvsmz.R.iget(2574)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2575)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2576);break;
                }
                
                }__CLR4_1_1011y11yluszvsmz.R.inc(2577);if ((((ch == '\\')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2578)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2579)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2580);next();
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(2581);next();
            }
            
            }__CLR4_1_1011y11yluszvsmz.R.inc(2582);int end;
            __CLR4_1_1011y11yluszvsmz.R.inc(2583);if ((((acceptBracket)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2584)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2585)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2586);end = pos - 1;
            } }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2587);if ((((ch == '/' || ch == '.')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2588)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2589)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2590);end = pos - 1;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2591);end = pos;
                }
            }}
            
            }__CLR4_1_1011y11yluszvsmz.R.inc(2592);String text = path.substring(start, end);
            
            __CLR4_1_1011y11yluszvsmz.R.inc(2593);if ((((text.indexOf("\\.") != -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2594)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2595)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2596);String propName;
                __CLR4_1_1011y11yluszvsmz.R.inc(2597);if ((((startCh == '\'' && text.length() > 2 && text.charAt(text.length() - 1) == startCh)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2598)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2599)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2600);propName = text.substring(1, text.length() - 1);
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2601);propName = text.replaceAll("\\\\\\.", "\\.");
                    __CLR4_1_1011y11yluszvsmz.R.inc(2602);if ((((propName.indexOf("\\-") != -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2603)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2604)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2605);propName = propName.replaceAll("\\\\-", "-");
                    }
                }}

                }__CLR4_1_1011y11yluszvsmz.R.inc(2606);if ((((predicateFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2607)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2608)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2609);accept(')');
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2610);return new PropertySegment(propName, false);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2611);Segment segment = buildArraySegement(text);

            __CLR4_1_1011y11yluszvsmz.R.inc(2612);if ((((acceptBracket && !isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(2613)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2614)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2615);accept(']');
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2616);return segment;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        Filter filterRest(Filter filter) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2617);
            __CLR4_1_1011y11yluszvsmz.R.inc(2618);boolean and = ch == '&';
            __CLR4_1_1011y11yluszvsmz.R.inc(2619);if (((((ch == '&' && getNextChar() == '&') || (ch == '|' && getNextChar() == '|'))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2620)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2621)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2622);next();
                __CLR4_1_1011y11yluszvsmz.R.inc(2623);next();

                __CLR4_1_1011y11yluszvsmz.R.inc(2624);while ((((ch == ' ')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2625)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2626)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2627);next();
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2628);Filter right = (Filter) parseArrayAccessFilter(false);

                __CLR4_1_1011y11yluszvsmz.R.inc(2629);filter = new FilterGroup(filter, right, and);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(2630);return filter;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        protected long readLongValue() {try{__CLR4_1_1011y11yluszvsmz.R.inc(2631);
            __CLR4_1_1011y11yluszvsmz.R.inc(2632);int beginIndex = pos - 1;
            __CLR4_1_1011y11yluszvsmz.R.inc(2633);if ((((ch == '+' || ch == '-')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2634)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2635)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2636);next();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2637);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2638)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2639)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2640);next();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2641);int endIndex = pos - 1;
            __CLR4_1_1011y11yluszvsmz.R.inc(2642);String text = path.substring(beginIndex, endIndex);
            __CLR4_1_1011y11yluszvsmz.R.inc(2643);long value = Long.parseLong(text);
            __CLR4_1_1011y11yluszvsmz.R.inc(2644);return value;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
        
        protected double readDoubleValue(long longValue) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2645);
            __CLR4_1_1011y11yluszvsmz.R.inc(2646);int beginIndex = pos - 1;

            __CLR4_1_1011y11yluszvsmz.R.inc(2647);next();
            __CLR4_1_1011y11yluszvsmz.R.inc(2648);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2649)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2650)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2651);next();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2652);int endIndex = pos - 1;
            __CLR4_1_1011y11yluszvsmz.R.inc(2653);String text = path.substring(beginIndex, endIndex);
            __CLR4_1_1011y11yluszvsmz.R.inc(2654);double value = Double.parseDouble(text);
            __CLR4_1_1011y11yluszvsmz.R.inc(2655);value += longValue;
            __CLR4_1_1011y11yluszvsmz.R.inc(2656);return value;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        protected Object readValue() {try{__CLR4_1_1011y11yluszvsmz.R.inc(2657);
            __CLR4_1_1011y11yluszvsmz.R.inc(2658);skipWhitespace();

            __CLR4_1_1011y11yluszvsmz.R.inc(2659);if ((((isDigitFirst(ch))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2660)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2661)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2662);return readLongValue();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2663);if ((((ch == '"' || ch == '\'')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2664)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2665)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2666);return readString();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2667);if ((((ch == 'n')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2668)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2669)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2670);String name = readName();

                __CLR4_1_1011y11yluszvsmz.R.inc(2671);if (((("null".equals(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2672)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2673)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2674);return null;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2675);throw new JSONPathException(path);
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(2676);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        static boolean isDigitFirst(char ch) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2677);
            __CLR4_1_1011y11yluszvsmz.R.inc(2678);return ch == '-' || ch == '+' || (ch >= '0' && ch <= '9');
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        protected Operator readOp() {try{__CLR4_1_1011y11yluszvsmz.R.inc(2679);
            __CLR4_1_1011y11yluszvsmz.R.inc(2680);Operator op = null;
            __CLR4_1_1011y11yluszvsmz.R.inc(2681);if ((((ch == '=')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2682)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2683)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2684);next();
                __CLR4_1_1011y11yluszvsmz.R.inc(2685);if ((((ch == '~')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2686)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2687)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2688);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2689);op = Operator.REG_MATCH;
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2690);if ((((ch == '=')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2691)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2692)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2693);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2694);op = Operator.EQ;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2695);op = Operator.EQ;
                }
            }}} }else {__CLR4_1_1011y11yluszvsmz.R.inc(2696);if ((((ch == '!')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2697)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2698)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2699);next();
                __CLR4_1_1011y11yluszvsmz.R.inc(2700);accept('=');
                __CLR4_1_1011y11yluszvsmz.R.inc(2701);op = Operator.NE;
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2702);if ((((ch == '<')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2703)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2704)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2705);next();
                __CLR4_1_1011y11yluszvsmz.R.inc(2706);if ((((ch == '=')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2707)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2708)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2709);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2710);op = Operator.LE;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2711);op = Operator.LT;
                }
            }} }else {__CLR4_1_1011y11yluszvsmz.R.inc(2712);if ((((ch == '>')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2713)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2714)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2715);next();
                __CLR4_1_1011y11yluszvsmz.R.inc(2716);if ((((ch == '=')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2717)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2718)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2719);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2720);op = Operator.GE;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2721);op = Operator.GT;
                }
            }}

            }}}}__CLR4_1_1011y11yluszvsmz.R.inc(2722);if ((((op == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2723)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2724)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2725);String name = readName();

                __CLR4_1_1011y11yluszvsmz.R.inc(2726);if (((("not".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2727)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2728)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2729);skipWhitespace();

                    __CLR4_1_1011y11yluszvsmz.R.inc(2730);name = readName();

                    __CLR4_1_1011y11yluszvsmz.R.inc(2731);if (((("like".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2732)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2733)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2734);op = Operator.NOT_LIKE;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2735);if (((("rlike".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2736)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2737)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2738);op = Operator.NOT_RLIKE;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2739);if (((("in".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2740)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2741)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2742);op = Operator.NOT_IN;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2743);if (((("between".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2744)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2745)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2746);op = Operator.NOT_BETWEEN;
                    } }else {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2747);throw new UnsupportedOperationException();
                    }
                }}}}} }else {__CLR4_1_1011y11yluszvsmz.R.inc(2748);if (((("nin".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2749)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2750)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2751);op = Operator.NOT_IN;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2752);if (((("like".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2753)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2754)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2755);op = Operator.LIKE;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2756);if (((("rlike".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2757)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2758)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2759);op = Operator.RLIKE;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2760);if (((("in".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2761)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2762)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2763);op = Operator.IN;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2764);if (((("between".equalsIgnoreCase(name))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2765)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2766)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2767);op = Operator.BETWEEN;
                    } }else {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2768);throw new UnsupportedOperationException();
                    }
                }}}}}
            }}}
            }__CLR4_1_1011y11yluszvsmz.R.inc(2769);return op;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        String readName() {try{__CLR4_1_1011y11yluszvsmz.R.inc(2770);
            __CLR4_1_1011y11yluszvsmz.R.inc(2771);skipWhitespace();

            __CLR4_1_1011y11yluszvsmz.R.inc(2772);if ((((ch != '\\' && !Character.isJavaIdentifierStart(ch))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2773)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2774)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2775);throw new JSONPathException("illeal jsonpath syntax. " + path);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2776);StringBuilder buf = new StringBuilder();
            __CLR4_1_1011y11yluszvsmz.R.inc(2777);while ((((!isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(2778)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2779)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2780);if ((((ch == '\\')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2781)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2782)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2783);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2784);buf.append(ch);
                    __CLR4_1_1011y11yluszvsmz.R.inc(2785);if ((((isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(2786)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2787)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2788);return buf.toString();
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(2789);next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2790);continue;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2791);boolean identifierFlag = Character.isJavaIdentifierPart(ch);
                __CLR4_1_1011y11yluszvsmz.R.inc(2792);if ((((!identifierFlag)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2793)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2794)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2795);break;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(2796);buf.append(ch);
                __CLR4_1_1011y11yluszvsmz.R.inc(2797);next();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2798);if ((((isEOF() && Character.isJavaIdentifierPart(ch))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2799)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2800)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2801);buf.append(ch);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2802);return buf.toString();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        String readString() {try{__CLR4_1_1011y11yluszvsmz.R.inc(2803);
            __CLR4_1_1011y11yluszvsmz.R.inc(2804);char quoate = ch;
            __CLR4_1_1011y11yluszvsmz.R.inc(2805);next();

            __CLR4_1_1011y11yluszvsmz.R.inc(2806);int beginIndex = pos - 1;
            __CLR4_1_1011y11yluszvsmz.R.inc(2807);while ((((ch != quoate && !isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(2808)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2809)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2810);next();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2811);String strValue = path.substring(beginIndex, (((isEOF() )&&(__CLR4_1_1011y11yluszvsmz.R.iget(2812)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2813)==0&false))? pos : pos - 1);

            __CLR4_1_1011y11yluszvsmz.R.inc(2814);accept(quoate);

            __CLR4_1_1011y11yluszvsmz.R.inc(2815);return strValue;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        void accept(char expect) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2816);
            __CLR4_1_1011y11yluszvsmz.R.inc(2817);if ((((ch != expect)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2818)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2819)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2820);throw new JSONPathException("expect '" + expect + ", but '" + ch + "'");
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2821);if ((((!isEOF())&&(__CLR4_1_1011y11yluszvsmz.R.iget(2822)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2823)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2824);next();
            }
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public Segment[] explain() {try{__CLR4_1_1011y11yluszvsmz.R.inc(2825);
            __CLR4_1_1011y11yluszvsmz.R.inc(2826);if ((((path == null || path.length() == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2827)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2828)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2829);throw new IllegalArgumentException();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2830);Segment[] segments = new Segment[8];

            __CLR4_1_1011y11yluszvsmz.R.inc(2831);for (;;) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2832);Segment segment = readSegement();
                __CLR4_1_1011y11yluszvsmz.R.inc(2833);if ((((segment == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2834)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2835)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2836);break;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2837);if ((((segment instanceof PropertySegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2838)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2839)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2840);PropertySegment propertySegment = (PropertySegment) segment;
                    __CLR4_1_1011y11yluszvsmz.R.inc(2841);if (((((!propertySegment.deep) && propertySegment.propertyName.equals("*"))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2842)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2843)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2844);continue;
                    }
                }}

                }__CLR4_1_1011y11yluszvsmz.R.inc(2845);if ((((level == segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2846)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2847)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2848);Segment[] t = new Segment[level * 3 / 2];
                    __CLR4_1_1011y11yluszvsmz.R.inc(2849);System.arraycopy(segments, 0, t, 0, level);
                    __CLR4_1_1011y11yluszvsmz.R.inc(2850);segments = t;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(2851);segments[level++] = segment;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2852);if ((((level == segments.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2853)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2854)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2855);return segments;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2856);Segment[] result = new Segment[level];
            __CLR4_1_1011y11yluszvsmz.R.inc(2857);System.arraycopy(segments, 0, result, 0, level);
            __CLR4_1_1011y11yluszvsmz.R.inc(2858);return result;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        Segment buildArraySegement(String indexText) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2859);
            __CLR4_1_1011y11yluszvsmz.R.inc(2860);final int indexTextLen = indexText.length();
            __CLR4_1_1011y11yluszvsmz.R.inc(2861);final char firstChar = indexText.charAt(0);
            __CLR4_1_1011y11yluszvsmz.R.inc(2862);final char lastChar = indexText.charAt(indexTextLen - 1);

            __CLR4_1_1011y11yluszvsmz.R.inc(2863);int commaIndex = indexText.indexOf(',');

            __CLR4_1_1011y11yluszvsmz.R.inc(2864);if ((((indexText.length() > 2 && firstChar == '\'' && lastChar == '\'')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2865)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2866)==0&false))) {{

                __CLR4_1_1011y11yluszvsmz.R.inc(2867);if ((((commaIndex == -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2868)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2869)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2870);String propertyName = indexText.substring(1, indexTextLen - 1);
                    __CLR4_1_1011y11yluszvsmz.R.inc(2871);return new PropertySegment(propertyName, false);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2872);String[] indexesText = indexText.split(",");
                __CLR4_1_1011y11yluszvsmz.R.inc(2873);String[] propertyNames = new String[indexesText.length];
                __CLR4_1_1011y11yluszvsmz.R.inc(2874);for (int i = 0; (((i < indexesText.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2875)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2876)==0&false)); ++i) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2877);String indexesTextItem = indexesText[i];
                    __CLR4_1_1011y11yluszvsmz.R.inc(2878);propertyNames[i] = indexesTextItem.substring(1, indexesTextItem.length() - 1);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2879);return new MultiPropertySegment(propertyNames);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2880);int colonIndex = indexText.indexOf(':');

            __CLR4_1_1011y11yluszvsmz.R.inc(2881);if ((((commaIndex == -1 && colonIndex == -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2882)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2883)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2884);if ((((TypeUtils.isNumber(indexText))&&(__CLR4_1_1011y11yluszvsmz.R.iget(2885)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2886)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2887);try {
                        __CLR4_1_1011y11yluszvsmz.R.inc(2888);int index = Integer.parseInt(indexText);
                        __CLR4_1_1011y11yluszvsmz.R.inc(2889);return new ArrayAccessSegment(index);
                    }catch (NumberFormatException ex){
                        __CLR4_1_1011y11yluszvsmz.R.inc(2890);return new PropertySegment(indexText, false); // fix ISSUE-1208
                    }
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2891);if ((((indexText.charAt(0) == '"' && indexText.charAt(indexText.length() - 1) == '"')&&(__CLR4_1_1011y11yluszvsmz.R.iget(2892)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2893)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2894);indexText = indexText.substring(1, indexText.length() - 1);
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(2895);return new PropertySegment(indexText, false);
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(2896);if ((((commaIndex != -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2897)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2898)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2899);String[] indexesText = indexText.split(",");
                __CLR4_1_1011y11yluszvsmz.R.inc(2900);int[] indexes = new int[indexesText.length];
                __CLR4_1_1011y11yluszvsmz.R.inc(2901);for (int i = 0; (((i < indexesText.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2902)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2903)==0&false)); ++i) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2904);indexes[i] = Integer.parseInt(indexesText[i]);
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(2905);return new MultiIndexSegment(indexes);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2906);if ((((colonIndex != -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2907)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2908)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2909);String[] indexesText = indexText.split(":");
                __CLR4_1_1011y11yluszvsmz.R.inc(2910);int[] indexes = new int[indexesText.length];
                __CLR4_1_1011y11yluszvsmz.R.inc(2911);for (int i = 0; (((i < indexesText.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2912)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2913)==0&false)); ++i) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2914);String str = indexesText[i];
                    __CLR4_1_1011y11yluszvsmz.R.inc(2915);if ((((str.length() == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2916)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2917)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2918);if ((((i == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2919)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2920)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2921);indexes[i] = 0;
                        } }else {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(2922);throw new UnsupportedOperationException();
                        }
                    }} }else {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2923);indexes[i] = Integer.parseInt(str);
                    }
                }}

                }__CLR4_1_1011y11yluszvsmz.R.inc(2924);int start = indexes[0];
                __CLR4_1_1011y11yluszvsmz.R.inc(2925);int end;
                __CLR4_1_1011y11yluszvsmz.R.inc(2926);if ((((indexes.length > 1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2927)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2928)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2929);end = indexes[1];
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2930);end = -1;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(2931);int step;
                __CLR4_1_1011y11yluszvsmz.R.inc(2932);if ((((indexes.length == 3)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2933)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2934)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2935);step = indexes[2];
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2936);step = 1;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2937);if ((((end >= 0 && end < start)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2938)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2939)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2940);throw new UnsupportedOperationException("end must greater than or equals start. start " + start
                                                            + ",  end " + end);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(2941);if ((((step <= 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2942)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2943)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2944);throw new UnsupportedOperationException("step must greater than zero : " + step);
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(2945);return new RangeSegment(start, end, step);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2946);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    interface Segment {

        Object eval(JSONPath path, Object rootObject, Object currentObject);
        void extract(JSONPath path, DefaultJSONParser parser, Context context);
    }


    static class SizeSegment implements Segment {

        public final static SizeSegment instance = new SizeSegment();

        public Integer eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2947);
            __CLR4_1_1011y11yluszvsmz.R.inc(2948);return path.evalSize(currentObject);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2949);
            __CLR4_1_1011y11yluszvsmz.R.inc(2950);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class MaxSegment implements Segment {

        public final static MaxSegment instance = new MaxSegment();

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2951);
            __CLR4_1_1011y11yluszvsmz.R.inc(2952);Object max = null;
            __CLR4_1_1011y11yluszvsmz.R.inc(2953);if ((((rootObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2954)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2955)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2956);Iterator iterator = ((Collection) rootObject).iterator();
                __CLR4_1_1011y11yluszvsmz.R.inc(2957);while ((((iterator.hasNext())&&(__CLR4_1_1011y11yluszvsmz.R.iget(2958)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2959)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2960);Object next = iterator.next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2961);if ((((next == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2962)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2963)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2964);continue;
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2965);if ((((max == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2966)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2967)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2968);max = next;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2969);if ((((compare(max, next) < 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2970)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2971)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2972);max = next;
                    }
                }}}
            }} }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2973);throw new UnsupportedOperationException();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(2974);return max;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2975);
            __CLR4_1_1011y11yluszvsmz.R.inc(2976);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class MinSegment implements Segment {
        public final static MinSegment instance = new MinSegment();

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(2977);
            __CLR4_1_1011y11yluszvsmz.R.inc(2978);Object min = null;
            __CLR4_1_1011y11yluszvsmz.R.inc(2979);if ((((rootObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2980)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2981)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2982);Iterator iterator = ((Collection) rootObject).iterator();
                __CLR4_1_1011y11yluszvsmz.R.inc(2983);while ((((iterator.hasNext())&&(__CLR4_1_1011y11yluszvsmz.R.iget(2984)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2985)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(2986);Object next = iterator.next();
                    __CLR4_1_1011y11yluszvsmz.R.inc(2987);if ((((next == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2988)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2989)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2990);continue;
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(2991);if ((((min == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2992)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2993)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2994);min = next;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(2995);if ((((compare(min, next) > 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(2996)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(2997)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(2998);min = next;
                    }
                }}}
            }} }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(2999);throw new UnsupportedOperationException();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3000);return min;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3001);
            __CLR4_1_1011y11yluszvsmz.R.inc(3002);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static int compare(Object a, Object b) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3003);
        __CLR4_1_1011y11yluszvsmz.R.inc(3004);if ((((a.getClass() == b.getClass())&&(__CLR4_1_1011y11yluszvsmz.R.iget(3005)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3006)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3007);return ((Comparable) a).compareTo(b);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(3008);Class typeA = a.getClass();
        __CLR4_1_1011y11yluszvsmz.R.inc(3009);Class typeB = b.getClass();

        __CLR4_1_1011y11yluszvsmz.R.inc(3010);if ((((typeA == BigDecimal.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3011)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3012)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3013);if ((((typeB == Integer.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3014)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3015)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3016);b = new BigDecimal((Integer) b);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3017);if ((((typeB == Long.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3018)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3019)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3020);b = new BigDecimal((Long) b);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3021);if ((((typeB == Float.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3022)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3023)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3024);b = new BigDecimal((Float) b);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3025);if ((((typeB == Double.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3026)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3027)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3028);b = new BigDecimal((Double) b);
            }
        }}}}} }else {__CLR4_1_1011y11yluszvsmz.R.inc(3029);if ((((typeA == Long.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3030)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3031)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3032);if ((((typeB == Integer.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3033)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3034)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3035);b = new Long((Integer) b);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3036);if ((((typeB == BigDecimal.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3037)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3038)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3039);a = new BigDecimal((Long) a);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3040);if ((((typeB == Float.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3041)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3042)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3043);a = new Float((Long) a);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3044);if ((((typeB == Double.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3045)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3046)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3047);a = new Double((Long) a);
            }
        }}}}} }else {__CLR4_1_1011y11yluszvsmz.R.inc(3048);if ((((typeA == Integer.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3049)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3050)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3051);if ((((typeB == Long.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3052)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3053)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3054);a = new Long((Integer) a);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3055);if ((((typeB == BigDecimal.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3056)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3057)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3058);a = new BigDecimal((Integer) a);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3059);if ((((typeB == Float.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3060)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3061)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3062);a = new Float((Integer) a);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3063);if ((((typeB == Double.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3064)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3065)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3066);a = new Double((Integer) a);
            }
        }}}}} }else {__CLR4_1_1011y11yluszvsmz.R.inc(3067);if ((((typeA == Double.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3068)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3069)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3070);if ((((typeB == Integer.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3071)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3072)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3073);b = new Double((Integer) b);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3074);if ((((typeB == Long.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3075)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3076)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3077);b = new Double((Long) b);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3078);if ((((typeB == Float.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3079)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3080)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3081);b = new Double((Float) b);
            }
        }}}} }else {__CLR4_1_1011y11yluszvsmz.R.inc(3082);if ((((typeA == Float.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3083)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3084)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3085);if ((((typeB == Integer.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3086)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3087)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3088);b = new Float((Integer) b);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3089);if ((((typeB == Long.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3090)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3091)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3092);b = new Float((Long) b);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3093);if ((((typeB == Double.class)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3094)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3095)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3096);a = new Double((Float) a);
            }
        }}}}

        }}}}}__CLR4_1_1011y11yluszvsmz.R.inc(3097);return ((Comparable) a).compareTo(b);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    static class KeySetSegment implements Segment {

        public final static KeySetSegment instance = new KeySetSegment();

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3098);
            __CLR4_1_1011y11yluszvsmz.R.inc(3099);return path.evalKeySet(currentObject);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3100);
            __CLR4_1_1011y11yluszvsmz.R.inc(3101);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class PropertySegment implements Segment {

        private final String  propertyName;
        private final long    propertyNameHash;
        private final boolean deep;

        public PropertySegment(String propertyName, boolean deep){try{__CLR4_1_1011y11yluszvsmz.R.inc(3102);
            __CLR4_1_1011y11yluszvsmz.R.inc(3103);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3104);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3105);this.deep = deep;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3106);
            __CLR4_1_1011y11yluszvsmz.R.inc(3107);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3108)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3109)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3110);List<Object> results = new ArrayList<Object>();
                __CLR4_1_1011y11yluszvsmz.R.inc(3111);path.deepScan(currentObject, propertyName, results);
                __CLR4_1_1011y11yluszvsmz.R.inc(3112);return results;
            } }else {{
                // return path.getPropertyValue(currentObject, propertyName, true);
                __CLR4_1_1011y11yluszvsmz.R.inc(3113);return path.getPropertyValue(currentObject, propertyName, propertyNameHash);
            }
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3114);
            __CLR4_1_1011y11yluszvsmz.R.inc(3115);JSONLexerBase lexer = (JSONLexerBase) parser.lexer;

            __CLR4_1_1011y11yluszvsmz.R.inc(3116);if ((((deep && context.object == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3117)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3118)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3119);context.object = new JSONArray();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3120);if ((((lexer.token() == JSONToken.LBRACKET)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3121)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3122)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3123);if (((("*".equals(propertyName))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3124)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3125)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3126);return;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(3127);lexer.nextToken();
                __CLR4_1_1011y11yluszvsmz.R.inc(3128);JSONArray array;

                __CLR4_1_1011y11yluszvsmz.R.inc(3129);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3130)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3131)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3132);array =(JSONArray) context.object;
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3133);array = new JSONArray();
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(3134);for (;;) {{
                    boolean __CLB4_1_10_bool0=false;__CLR4_1_1011y11yluszvsmz.R.inc(3135);switch (lexer.token()) {
                        case JSONToken.LBRACE:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3136);__CLB4_1_10_bool0=true;} {
                            __CLR4_1_1011y11yluszvsmz.R.inc(3137);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3138)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3139)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3140);extract(path, parser, context);
                                __CLR4_1_1011y11yluszvsmz.R.inc(3141);break;
                            }
                            }__CLR4_1_1011y11yluszvsmz.R.inc(3142);int matchStat = lexer.seekObjectToField(propertyNameHash, deep);
                            __CLR4_1_1011y11yluszvsmz.R.inc(3143);if ((((matchStat == JSONLexer.VALUE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3144)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3145)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3146);Object value;
                                boolean __CLB4_1_10_bool1=false;__CLR4_1_1011y11yluszvsmz.R.inc(3147);switch (lexer.token()) {
                                    case JSONToken.LITERAL_INT:if (!__CLB4_1_10_bool1) {__CLR4_1_1011y11yluszvsmz.R.inc(3148);__CLB4_1_10_bool1=true;}
                                        __CLR4_1_1011y11yluszvsmz.R.inc(3149);value = lexer.integerValue();
                                        __CLR4_1_1011y11yluszvsmz.R.inc(3150);lexer.nextToken();
                                        __CLR4_1_1011y11yluszvsmz.R.inc(3151);break;
                                    case JSONToken.LITERAL_STRING:if (!__CLB4_1_10_bool1) {__CLR4_1_1011y11yluszvsmz.R.inc(3152);__CLB4_1_10_bool1=true;}
                                        __CLR4_1_1011y11yluszvsmz.R.inc(3153);value = lexer.stringVal();
                                        __CLR4_1_1011y11yluszvsmz.R.inc(3154);lexer.nextToken();
                                        __CLR4_1_1011y11yluszvsmz.R.inc(3155);break;
                                    default:if (!__CLB4_1_10_bool1) {__CLR4_1_1011y11yluszvsmz.R.inc(3156);__CLB4_1_10_bool1=true;}
                                        __CLR4_1_1011y11yluszvsmz.R.inc(3157);value = parser.parse();
                                        __CLR4_1_1011y11yluszvsmz.R.inc(3158);break;
                                }

                                __CLR4_1_1011y11yluszvsmz.R.inc(3159);array.add(value);
                                __CLR4_1_1011y11yluszvsmz.R.inc(3160);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3161)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3162)==0&false))) {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(3163);lexer.nextToken();
                                    __CLR4_1_1011y11yluszvsmz.R.inc(3164);continue;
                                } }else {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(3165);lexer.skipObject(false);
                                }
                            }} }else {__CLR4_1_1011y11yluszvsmz.R.inc(3166);if ((((matchStat == JSONLexer.NOT_MATCH)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3167)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3168)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3169);continue;
                            } }else {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3170);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3171)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3172)==0&false))) {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(3173);throw new UnsupportedOperationException(lexer.info());
                                } }else {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(3174);lexer.skipObject(false);
                                }
                            }}
                            }}__CLR4_1_1011y11yluszvsmz.R.inc(3175);break;
                        }
                        case JSONToken.LBRACKET:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3176);__CLB4_1_10_bool0=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3177);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3178)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3179)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3180);extract(path, parser, context);
                            } }else {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3181);lexer.skipObject(false);
                            }
                            }__CLR4_1_1011y11yluszvsmz.R.inc(3182);break;
                        case JSONToken.LITERAL_STRING:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3183);__CLB4_1_10_bool0=true;}
                        case JSONToken.LITERAL_INT:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3184);__CLB4_1_10_bool0=true;}
                        case JSONToken.LITERAL_FLOAT:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3185);__CLB4_1_10_bool0=true;}
                        case JSONToken.LITERAL_ISO8601_DATE:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3186);__CLB4_1_10_bool0=true;}
                        case JSONToken.TRUE:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3187);__CLB4_1_10_bool0=true;}
                        case JSONToken.FALSE:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3188);__CLB4_1_10_bool0=true;}
                        case JSONToken.NULL:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3189);__CLB4_1_10_bool0=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3190);lexer.nextToken();
                            __CLR4_1_1011y11yluszvsmz.R.inc(3191);break;
                        default:if (!__CLB4_1_10_bool0) {__CLR4_1_1011y11yluszvsmz.R.inc(3192);__CLB4_1_10_bool0=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3193);break;
                    }

                    __CLR4_1_1011y11yluszvsmz.R.inc(3194);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3195)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3196)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3197);lexer.nextToken();
                        __CLR4_1_1011y11yluszvsmz.R.inc(3198);break;
                    } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3199);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3200)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3201)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3202);lexer.nextToken();
                        __CLR4_1_1011y11yluszvsmz.R.inc(3203);continue;
                    } }else {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3204);throw new JSONException("illegal json : " + lexer.info());
                    }
                }}}

                }__CLR4_1_1011y11yluszvsmz.R.inc(3205);if ((((!deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3206)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3207)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3208);if ((((array.size() > 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3209)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3210)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3211);context.object = array;
                    }
                }}
                }__CLR4_1_1011y11yluszvsmz.R.inc(3212);return;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3213);if ((((!deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3214)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3215)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3216);int matchStat = lexer.seekObjectToField(propertyNameHash, deep);
                __CLR4_1_1011y11yluszvsmz.R.inc(3217);if ((((matchStat == JSONLexer.VALUE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3218)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3219)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3220);if ((((context.eval)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3221)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3222)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3223);Object value;
                        boolean __CLB4_1_10_bool2=false;__CLR4_1_1011y11yluszvsmz.R.inc(3224);switch (lexer.token()) {
                            case JSONToken.LITERAL_INT:if (!__CLB4_1_10_bool2) {__CLR4_1_1011y11yluszvsmz.R.inc(3225);__CLB4_1_10_bool2=true;}
                                __CLR4_1_1011y11yluszvsmz.R.inc(3226);value = lexer.integerValue();
                                __CLR4_1_1011y11yluszvsmz.R.inc(3227);lexer.nextToken(JSONToken.COMMA);
                                __CLR4_1_1011y11yluszvsmz.R.inc(3228);break;
                            case JSONToken.LITERAL_FLOAT:if (!__CLB4_1_10_bool2) {__CLR4_1_1011y11yluszvsmz.R.inc(3229);__CLB4_1_10_bool2=true;}
                                __CLR4_1_1011y11yluszvsmz.R.inc(3230);value = lexer.decimalValue();
                                __CLR4_1_1011y11yluszvsmz.R.inc(3231);lexer.nextToken(JSONToken.COMMA);
                                __CLR4_1_1011y11yluszvsmz.R.inc(3232);break;
                            case JSONToken.LITERAL_STRING:if (!__CLB4_1_10_bool2) {__CLR4_1_1011y11yluszvsmz.R.inc(3233);__CLB4_1_10_bool2=true;}
                                __CLR4_1_1011y11yluszvsmz.R.inc(3234);value = lexer.stringVal();
                                __CLR4_1_1011y11yluszvsmz.R.inc(3235);lexer.nextToken(JSONToken.COMMA);
                                __CLR4_1_1011y11yluszvsmz.R.inc(3236);break;
                            default:if (!__CLB4_1_10_bool2) {__CLR4_1_1011y11yluszvsmz.R.inc(3237);__CLB4_1_10_bool2=true;}
                                __CLR4_1_1011y11yluszvsmz.R.inc(3238);value = parser.parse();
                                __CLR4_1_1011y11yluszvsmz.R.inc(3239);break;
                        }

                        __CLR4_1_1011y11yluszvsmz.R.inc(3240);if ((((context.eval)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3241)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3242)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(3243);context.object = value;
                        }
                    }}
                }}
                }__CLR4_1_1011y11yluszvsmz.R.inc(3244);return;
            }

            // deep
            }__CLR4_1_1011y11yluszvsmz.R.inc(3245);for (;;) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3246);int matchStat = lexer.seekObjectToField(propertyNameHash, deep);
                __CLR4_1_1011y11yluszvsmz.R.inc(3247);if ((((matchStat == JSONLexer.NOT_MATCH)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3248)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3249)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3250);break;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(3251);if ((((matchStat == JSONLexer.VALUE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3252)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3253)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3254);if ((((context.eval)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3255)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3256)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3257);Object value;
                        boolean __CLB4_1_10_bool3=false;__CLR4_1_1011y11yluszvsmz.R.inc(3258);switch (lexer.token()) {
                            case JSONToken.LITERAL_INT:if (!__CLB4_1_10_bool3) {__CLR4_1_1011y11yluszvsmz.R.inc(3259);__CLB4_1_10_bool3=true;}
                                __CLR4_1_1011y11yluszvsmz.R.inc(3260);value = lexer.integerValue();
                                __CLR4_1_1011y11yluszvsmz.R.inc(3261);lexer.nextToken(JSONToken.COMMA);
                                __CLR4_1_1011y11yluszvsmz.R.inc(3262);break;
                            case JSONToken.LITERAL_FLOAT:if (!__CLB4_1_10_bool3) {__CLR4_1_1011y11yluszvsmz.R.inc(3263);__CLB4_1_10_bool3=true;}
                                __CLR4_1_1011y11yluszvsmz.R.inc(3264);value = lexer.decimalValue();
                                __CLR4_1_1011y11yluszvsmz.R.inc(3265);lexer.nextToken(JSONToken.COMMA);
                                __CLR4_1_1011y11yluszvsmz.R.inc(3266);break;
                            case JSONToken.LITERAL_STRING:if (!__CLB4_1_10_bool3) {__CLR4_1_1011y11yluszvsmz.R.inc(3267);__CLB4_1_10_bool3=true;}
                                __CLR4_1_1011y11yluszvsmz.R.inc(3268);value = lexer.stringVal();
                                __CLR4_1_1011y11yluszvsmz.R.inc(3269);lexer.nextToken(JSONToken.COMMA);
                                __CLR4_1_1011y11yluszvsmz.R.inc(3270);break;
                            default:if (!__CLB4_1_10_bool3) {__CLR4_1_1011y11yluszvsmz.R.inc(3271);__CLB4_1_10_bool3=true;}
                                __CLR4_1_1011y11yluszvsmz.R.inc(3272);value = parser.parse();
                                __CLR4_1_1011y11yluszvsmz.R.inc(3273);break;
                        }

                        __CLR4_1_1011y11yluszvsmz.R.inc(3274);if ((((context.eval)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3275)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3276)==0&false))) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(3277);if ((((context.object instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3278)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3279)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3280);List list = (List) context.object;
                                __CLR4_1_1011y11yluszvsmz.R.inc(3281);if ((((list.size() == 0 && value instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3282)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3283)==0&false))) {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(3284);context.object = value;
                                } }else {{
                                    __CLR4_1_1011y11yluszvsmz.R.inc(3285);list.add(value);
                                }
                            }} }else {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3286);context.object = value;
                            }
                        }}
                    }}
                }} }else {__CLR4_1_1011y11yluszvsmz.R.inc(3287);if ((((matchStat == JSONLexer.OBJECT || matchStat == JSONLexer.ARRAY)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3288)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3289)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3290);extract(path, parser, context);
                }
            }}}
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void setValue(JSONPath path, Object parent, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3291);
            __CLR4_1_1011y11yluszvsmz.R.inc(3292);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3293)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3294)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3295);path.deepSet(parent, propertyName, propertyNameHash, value);
            } }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3296);path.setPropertyValue(parent, propertyName, propertyNameHash, value);
            }
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
        
        public boolean remove(JSONPath path, Object parent) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3297);
            __CLR4_1_1011y11yluszvsmz.R.inc(3298);return path.removePropertyValue(parent, propertyName, deep);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class MultiPropertySegment implements Segment {

        private final String[] propertyNames;
        private final long[]   propertyNamesHash;

        public MultiPropertySegment(String[] propertyNames){try{__CLR4_1_1011y11yluszvsmz.R.inc(3299);
            __CLR4_1_1011y11yluszvsmz.R.inc(3300);this.propertyNames = propertyNames;
            __CLR4_1_1011y11yluszvsmz.R.inc(3301);this.propertyNamesHash = new long[propertyNames.length];
            __CLR4_1_1011y11yluszvsmz.R.inc(3302);for (int i = 0; (((i < propertyNamesHash.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3303)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3304)==0&false)); i++) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3305);propertyNamesHash[i] = TypeUtils.fnv1a_64(propertyNames[i]);
            }
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3306);
            __CLR4_1_1011y11yluszvsmz.R.inc(3307);List<Object> fieldValues = new ArrayList<Object>(propertyNames.length);

            __CLR4_1_1011y11yluszvsmz.R.inc(3308);for (int i = 0; (((i < propertyNames.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3309)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3310)==0&false)); i++) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3311);Object fieldValue = path.getPropertyValue(currentObject, propertyNames[i], propertyNamesHash[i]);
                __CLR4_1_1011y11yluszvsmz.R.inc(3312);fieldValues.add(fieldValue);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3313);return fieldValues;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3314);
            __CLR4_1_1011y11yluszvsmz.R.inc(3315);JSONLexerBase lexer = (JSONLexerBase) parser.lexer;

            __CLR4_1_1011y11yluszvsmz.R.inc(3316);JSONArray array;
            __CLR4_1_1011y11yluszvsmz.R.inc(3317);if ((((context.object == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3318)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3319)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3320);context.object = array = new JSONArray();
            } }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3321);array = (JSONArray) context.object;
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(3322);for (int i = array.size(); (((i < propertyNamesHash.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3323)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3324)==0&false)); ++i) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3325);array.add(null);
            }

//            if (lexer.token() == JSONToken.LBRACKET) {
//                lexer.nextToken();
//                JSONArray array;
//
//                array = new JSONArray();
//                for (;;) {
//                    if (lexer.token() == JSONToken.LBRACE) {
//                        int index = lexer.seekObjectToField(propertyNamesHash);
//                        int matchStat = lexer.matchStat;
//                        if (matchStat == JSONLexer.VALUE) {
//                            Object value;
//                            switch (lexer.token()) {
//                                case JSONToken.LITERAL_INT:
//                                    value = lexer.integerValue();
//                                    lexer.nextToken();
//                                    break;
//                                case JSONToken.LITERAL_STRING:
//                                    value = lexer.stringVal();
//                                    lexer.nextToken();
//                                    break;
//                                default:
//                                    value = parser.parse();
//                                    break;
//                            }
//
//                            array.add(index, value);
//                            if (lexer.token() == JSONToken.RBRACE) {
//                                lexer.nextToken();
//                                continue;
//                            } else {
//                                lexer.skipObject();
//                            }
//                        } else {
//                            lexer.skipObject();
//                        }
//                    }
//
//                    if (lexer.token() == JSONToken.RBRACKET) {
//                        break;
//                    } else if (lexer.token() == JSONToken.COMMA) {
//                        lexer.nextToken();
//                        continue;
//                    } else {
//                        throw new JSONException("illegal json.");
//                    }
//                }
//
//                context.object = array;
//                return;
//            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3326);for_:
            for (;;) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3327);int index = lexer.seekObjectToField(propertyNamesHash);
                __CLR4_1_1011y11yluszvsmz.R.inc(3328);int matchStat = lexer.matchStat;
                __CLR4_1_1011y11yluszvsmz.R.inc(3329);if ((((matchStat == JSONLexer.VALUE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3330)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3331)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3332);Object value;
                    boolean __CLB4_1_10_bool4=false;__CLR4_1_1011y11yluszvsmz.R.inc(3333);switch (lexer.token()) {
                        case JSONToken.LITERAL_INT:if (!__CLB4_1_10_bool4) {__CLR4_1_1011y11yluszvsmz.R.inc(3334);__CLB4_1_10_bool4=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3335);value = lexer.integerValue();
                            __CLR4_1_1011y11yluszvsmz.R.inc(3336);lexer.nextToken(JSONToken.COMMA);
                            __CLR4_1_1011y11yluszvsmz.R.inc(3337);break;
                        case JSONToken.LITERAL_FLOAT:if (!__CLB4_1_10_bool4) {__CLR4_1_1011y11yluszvsmz.R.inc(3338);__CLB4_1_10_bool4=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3339);value = lexer.decimalValue();
                            __CLR4_1_1011y11yluszvsmz.R.inc(3340);lexer.nextToken(JSONToken.COMMA);
                            __CLR4_1_1011y11yluszvsmz.R.inc(3341);break;
                        case JSONToken.LITERAL_STRING:if (!__CLB4_1_10_bool4) {__CLR4_1_1011y11yluszvsmz.R.inc(3342);__CLB4_1_10_bool4=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3343);value = lexer.stringVal();
                            __CLR4_1_1011y11yluszvsmz.R.inc(3344);lexer.nextToken(JSONToken.COMMA);
                            __CLR4_1_1011y11yluszvsmz.R.inc(3345);break;
                        default:if (!__CLB4_1_10_bool4) {__CLR4_1_1011y11yluszvsmz.R.inc(3346);__CLB4_1_10_bool4=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3347);value = parser.parse();
                            __CLR4_1_1011y11yluszvsmz.R.inc(3348);break;
                    }

                    __CLR4_1_1011y11yluszvsmz.R.inc(3349);array.set(index, value);

                    __CLR4_1_1011y11yluszvsmz.R.inc(3350);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3351)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3352)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3353);continue for_;
                    }
                }}

                }__CLR4_1_1011y11yluszvsmz.R.inc(3354);break;
            }
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class WildCardSegment implements Segment {
        private boolean deep;

        private WildCardSegment(boolean deep) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3355);
            __CLR4_1_1011y11yluszvsmz.R.inc(3356);this.deep = deep;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public final static WildCardSegment instance = new WildCardSegment(false);
        public final static WildCardSegment instance_deep = new WildCardSegment(true);

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3357);
            __CLR4_1_1011y11yluszvsmz.R.inc(3358);if ((((!deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3359)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3360)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3361);return path.getPropertyValues(currentObject);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3362);List<Object> values = new ArrayList<Object>();
            __CLR4_1_1011y11yluszvsmz.R.inc(3363);path.deepGetPropertyValues(currentObject, values);
            __CLR4_1_1011y11yluszvsmz.R.inc(3364);return values;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3365);
            __CLR4_1_1011y11yluszvsmz.R.inc(3366);if ((((context.eval)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3367)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3368)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3369);Object object = parser.parse();
                __CLR4_1_1011y11yluszvsmz.R.inc(3370);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3371)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3372)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3373);List<Object> values = new ArrayList<Object>();
                    __CLR4_1_1011y11yluszvsmz.R.inc(3374);path.deepGetPropertyValues(object, values);
                    __CLR4_1_1011y11yluszvsmz.R.inc(3375);context.object = values;
                    __CLR4_1_1011y11yluszvsmz.R.inc(3376);return;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(3377);if ((((object instanceof JSONObject)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3378)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3379)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3380);Collection<Object> values = ((JSONObject) object).values();
                    __CLR4_1_1011y11yluszvsmz.R.inc(3381);JSONArray array = new JSONArray(values.size());
                    __CLR4_1_1011y11yluszvsmz.R.inc(3382);for (Object value : values) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3383);array.add(value);
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(3384);context.object = array;
                    __CLR4_1_1011y11yluszvsmz.R.inc(3385);return;
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3386);if ((((object instanceof JSONArray)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3387)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3388)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3389);context.object = object;
                    __CLR4_1_1011y11yluszvsmz.R.inc(3390);return;
                }
            }}}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3391);throw new JSONException("TODO");
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class ArrayAccessSegment implements Segment {

        private final int index;

        public ArrayAccessSegment(int index){try{__CLR4_1_1011y11yluszvsmz.R.inc(3392);
            __CLR4_1_1011y11yluszvsmz.R.inc(3393);this.index = index;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3394);
            __CLR4_1_1011y11yluszvsmz.R.inc(3395);return path.getArrayItem(currentObject, index);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean setValue(JSONPath path, Object currentObject, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3396);
            __CLR4_1_1011y11yluszvsmz.R.inc(3397);return path.setArrayItem(path, currentObject, index, value);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
        
        public boolean remove(JSONPath path, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3398);
            __CLR4_1_1011y11yluszvsmz.R.inc(3399);return path.removeArrayItem(path, currentObject, index);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3400);
            __CLR4_1_1011y11yluszvsmz.R.inc(3401);JSONLexerBase lexer = (JSONLexerBase) parser.lexer;
            __CLR4_1_1011y11yluszvsmz.R.inc(3402);if ((((lexer.seekArrayToItem(index)
                    && context.eval)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3403)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3404)==0&false)))
            {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3405);context.object = parser.parse();
            }
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class MultiIndexSegment implements Segment {

        private final int[] indexes;

        public MultiIndexSegment(int[] indexes){try{__CLR4_1_1011y11yluszvsmz.R.inc(3406);
            __CLR4_1_1011y11yluszvsmz.R.inc(3407);this.indexes = indexes;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3408);
            __CLR4_1_1011y11yluszvsmz.R.inc(3409);List<Object> items = new JSONArray(indexes.length);
            __CLR4_1_1011y11yluszvsmz.R.inc(3410);for (int i = 0; (((i < indexes.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3411)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3412)==0&false)); ++i) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3413);Object item = path.getArrayItem(currentObject, indexes[i]);
                __CLR4_1_1011y11yluszvsmz.R.inc(3414);items.add(item);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(3415);return items;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3416);
            __CLR4_1_1011y11yluszvsmz.R.inc(3417);if ((((context.eval)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3418)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3419)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3420);Object object = parser.parse();
                __CLR4_1_1011y11yluszvsmz.R.inc(3421);if ((((object instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3422)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3423)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3424);int[] indexes = new int[this.indexes.length];
                    __CLR4_1_1011y11yluszvsmz.R.inc(3425);System.arraycopy(this.indexes, 0, indexes, 0, indexes.length);
                    __CLR4_1_1011y11yluszvsmz.R.inc(3426);boolean noneNegative = indexes[0] >= 0;

                    __CLR4_1_1011y11yluszvsmz.R.inc(3427);List list = (List) object;
                    __CLR4_1_1011y11yluszvsmz.R.inc(3428);if ((((noneNegative)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3429)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3430)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3431);for (int i = list.size() - 1; (((i >= 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3432)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3433)==0&false)); i--) {{
                            __CLR4_1_1011y11yluszvsmz.R.inc(3434);if ((((Arrays.binarySearch(indexes, i) < 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3435)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3436)==0&false))) {{
                                __CLR4_1_1011y11yluszvsmz.R.inc(3437);list.remove(i);
                            }
                        }}
                        }__CLR4_1_1011y11yluszvsmz.R.inc(3438);context.object = list;
                        __CLR4_1_1011y11yluszvsmz.R.inc(3439);return;
                    }
                }}
            }}
            }__CLR4_1_1011y11yluszvsmz.R.inc(3440);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class RangeSegment implements Segment {

        private final int start;
        private final int end;
        private final int step;

        public RangeSegment(int start, int end, int step){try{__CLR4_1_1011y11yluszvsmz.R.inc(3441);
            __CLR4_1_1011y11yluszvsmz.R.inc(3442);this.start = start;
            __CLR4_1_1011y11yluszvsmz.R.inc(3443);this.end = end;
            __CLR4_1_1011y11yluszvsmz.R.inc(3444);this.step = step;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3445);
            __CLR4_1_1011y11yluszvsmz.R.inc(3446);int size = SizeSegment.instance.eval(path, rootObject, currentObject);
            __CLR4_1_1011y11yluszvsmz.R.inc(3447);int start = (((this.start >= 0 )&&(__CLR4_1_1011y11yluszvsmz.R.iget(3448)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3449)==0&false))? this.start : this.start + size;
            __CLR4_1_1011y11yluszvsmz.R.inc(3450);int end = (((this.end >= 0 )&&(__CLR4_1_1011y11yluszvsmz.R.iget(3451)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3452)==0&false))? this.end : this.end + size;

            __CLR4_1_1011y11yluszvsmz.R.inc(3453);int array_size = (end - start) / step + 1;
            __CLR4_1_1011y11yluszvsmz.R.inc(3454);if ((((array_size == -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3455)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3456)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3457);return null;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3458);List<Object> items = new ArrayList<Object>(array_size);
            __CLR4_1_1011y11yluszvsmz.R.inc(3459);for (int i = start; (((i <= end && i < size)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3460)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3461)==0&false)); i += step) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3462);Object item = path.getArrayItem(currentObject, i);
                __CLR4_1_1011y11yluszvsmz.R.inc(3463);items.add(item);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(3464);return items;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3465);
            __CLR4_1_1011y11yluszvsmz.R.inc(3466);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class NotNullSegement implements Filter {

        private final String propertyName;
        private final long   propertyNameHash;


        public NotNullSegement(String propertyName){try{__CLR4_1_1011y11yluszvsmz.R.inc(3467);
            __CLR4_1_1011y11yluszvsmz.R.inc(3468);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3469);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3470);
            __CLR4_1_1011y11yluszvsmz.R.inc(3471);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3472);return propertyValue != null;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class NullSegement implements Filter {

        private final String propertyName;
        private final long   propertyNameHash;

        public NullSegement(String propertyName){try{__CLR4_1_1011y11yluszvsmz.R.inc(3473);
            __CLR4_1_1011y11yluszvsmz.R.inc(3474);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3475);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3476);
            __CLR4_1_1011y11yluszvsmz.R.inc(3477);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3478);return propertyValue == null;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }
    
    static class ValueSegment implements Filter {
        private final String propertyName;
        private final long   propertyNameHash;
        private final Object value;
        private boolean eq = true;
        
        public ValueSegment(String propertyName, Object value, boolean eq){try{__CLR4_1_1011y11yluszvsmz.R.inc(3479);
            __CLR4_1_1011y11yluszvsmz.R.inc(3480);if ((((value == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3481)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3482)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3483);throw new IllegalArgumentException("value is null");
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(3484);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3485);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3486);this.value = value;
            __CLR4_1_1011y11yluszvsmz.R.inc(3487);this.eq = eq;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3488);
            __CLR4_1_1011y11yluszvsmz.R.inc(3489);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);
            __CLR4_1_1011y11yluszvsmz.R.inc(3490);boolean result = value.equals(propertyValue);
            __CLR4_1_1011y11yluszvsmz.R.inc(3491);if ((((!eq)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3492)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3493)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3494);result = !result;
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(3495);return result;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class IntInSegement implements Filter {

        private final String  propertyName;
        private final long    propertyNameHash;
        private final long[]  values;
        private final boolean not;

        public IntInSegement(String propertyName, long[] values, boolean not){try{__CLR4_1_1011y11yluszvsmz.R.inc(3496);
            __CLR4_1_1011y11yluszvsmz.R.inc(3497);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3498);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3499);this.values = values;
            __CLR4_1_1011y11yluszvsmz.R.inc(3500);this.not = not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3501);
            __CLR4_1_1011y11yluszvsmz.R.inc(3502);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3503);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3504)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3505)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3506);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3507);if ((((propertyValue instanceof Number)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3508)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3509)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3510);long longPropertyValue = TypeUtils.longExtractValue((Number) propertyValue);
                __CLR4_1_1011y11yluszvsmz.R.inc(3511);for (long value : values) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3512);if ((((value == longPropertyValue)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3513)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3514)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3515);return !not;
                    }
                }}
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3516);return not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class IntBetweenSegement implements Filter {

        private final String  propertyName;
        private final long    propertyNameHash;
        private final long    startValue;
        private final long    endValue;
        private final boolean not;

        public IntBetweenSegement(String propertyName, long startValue, long endValue, boolean not){try{__CLR4_1_1011y11yluszvsmz.R.inc(3517);
            __CLR4_1_1011y11yluszvsmz.R.inc(3518);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3519);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3520);this.startValue = startValue;
            __CLR4_1_1011y11yluszvsmz.R.inc(3521);this.endValue = endValue;
            __CLR4_1_1011y11yluszvsmz.R.inc(3522);this.not = not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3523);
            __CLR4_1_1011y11yluszvsmz.R.inc(3524);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3525);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3526)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3527)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3528);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3529);if ((((propertyValue instanceof Number)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3530)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3531)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3532);long longPropertyValue = TypeUtils.longExtractValue((Number) propertyValue);
                __CLR4_1_1011y11yluszvsmz.R.inc(3533);if ((((longPropertyValue >= startValue && longPropertyValue <= endValue)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3534)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3535)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3536);return !not;
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3537);return not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class IntObjInSegement implements Filter {

        private final String  propertyName;
        private final long    propertyNameHash;
        private final Long[]  values;
        private final boolean not;

        public IntObjInSegement(String propertyName, Long[] values, boolean not){try{__CLR4_1_1011y11yluszvsmz.R.inc(3538);
            __CLR4_1_1011y11yluszvsmz.R.inc(3539);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3540);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3541);this.values = values;
            __CLR4_1_1011y11yluszvsmz.R.inc(3542);this.not = not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3543);
            __CLR4_1_1011y11yluszvsmz.R.inc(3544);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3545);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3546)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3547)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3548);for (Long value : values) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3549);if ((((value == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3550)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3551)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3552);return !not;
                    }
                }}

                }__CLR4_1_1011y11yluszvsmz.R.inc(3553);return not;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3554);if ((((propertyValue instanceof Number)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3555)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3556)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3557);long longPropertyValue = TypeUtils.longExtractValue((Number) propertyValue);
                __CLR4_1_1011y11yluszvsmz.R.inc(3558);for (Long value : values) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3559);if ((((value == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3560)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3561)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3562);continue;
                    }

                    }__CLR4_1_1011y11yluszvsmz.R.inc(3563);if ((((value.longValue() == longPropertyValue)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3564)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3565)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3566);return !not;
                    }
                }}
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3567);return not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class StringInSegement implements Filter {

        private final String   propertyName;
        private final long     propertyNameHash;
        private final String[] values;
        private final boolean  not;

        public StringInSegement(String propertyName, String[] values, boolean not){try{__CLR4_1_1011y11yluszvsmz.R.inc(3568);
            __CLR4_1_1011y11yluszvsmz.R.inc(3569);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3570);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3571);this.values = values;
            __CLR4_1_1011y11yluszvsmz.R.inc(3572);this.not = not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3573);
            __CLR4_1_1011y11yluszvsmz.R.inc(3574);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3575);for (String value : values) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3576);if ((((value == propertyValue)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3577)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3578)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3579);return !not;
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3580);if ((((value != null && value.equals(propertyValue))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3581)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3582)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3583);return !not;
                }
            }}}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3584);return not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class IntOpSegement implements Filter {

        private final String   propertyName;
        private final long     propertyNameHash;
        private final long     value;
        private final Operator op;

        private BigDecimal     valueDecimal;
        private Float          valueFloat;
        private Double         valueDouble;

        public IntOpSegement(String propertyName, long value, Operator op){try{__CLR4_1_1011y11yluszvsmz.R.inc(3585);
            __CLR4_1_1011y11yluszvsmz.R.inc(3586);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3587);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3588);this.value = value;
            __CLR4_1_1011y11yluszvsmz.R.inc(3589);this.op = op;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3590);
            __CLR4_1_1011y11yluszvsmz.R.inc(3591);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3592);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3593)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3594)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3595);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3596);if ((((!(propertyValue instanceof Number))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3597)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3598)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3599);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3600);if ((((propertyValue instanceof BigDecimal)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3601)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3602)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3603);if ((((valueDecimal == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3604)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3605)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3606);valueDecimal = BigDecimal.valueOf(value);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(3607);int result = valueDecimal.compareTo((BigDecimal) propertyValue);
                boolean __CLB4_1_10_bool5=false;__CLR4_1_1011y11yluszvsmz.R.inc(3608);switch (op) {
                    case EQ:if (!__CLB4_1_10_bool5) {__CLR4_1_1011y11yluszvsmz.R.inc(3609);__CLB4_1_10_bool5=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3610);return result == 0;
                    case NE:if (!__CLB4_1_10_bool5) {__CLR4_1_1011y11yluszvsmz.R.inc(3611);__CLB4_1_10_bool5=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3612);return result != 0;
                    case GE:if (!__CLB4_1_10_bool5) {__CLR4_1_1011y11yluszvsmz.R.inc(3613);__CLB4_1_10_bool5=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3614);return 0 >= result;
                    case GT:if (!__CLB4_1_10_bool5) {__CLR4_1_1011y11yluszvsmz.R.inc(3615);__CLB4_1_10_bool5=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3616);return 0 > result;
                    case LE:if (!__CLB4_1_10_bool5) {__CLR4_1_1011y11yluszvsmz.R.inc(3617);__CLB4_1_10_bool5=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3618);return 0 <= result;
                    case LT:if (!__CLB4_1_10_bool5) {__CLR4_1_1011y11yluszvsmz.R.inc(3619);__CLB4_1_10_bool5=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3620);return 0 < result;
                }

                __CLR4_1_1011y11yluszvsmz.R.inc(3621);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3622);if ((((propertyValue instanceof Float)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3623)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3624)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3625);if ((((valueFloat == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3626)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3627)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3628);valueFloat = Float.valueOf(value);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(3629);int result = valueFloat.compareTo((Float) propertyValue);
                boolean __CLB4_1_10_bool6=false;__CLR4_1_1011y11yluszvsmz.R.inc(3630);switch (op) {
                    case EQ:if (!__CLB4_1_10_bool6) {__CLR4_1_1011y11yluszvsmz.R.inc(3631);__CLB4_1_10_bool6=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3632);return result == 0;
                    case NE:if (!__CLB4_1_10_bool6) {__CLR4_1_1011y11yluszvsmz.R.inc(3633);__CLB4_1_10_bool6=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3634);return result != 0;
                    case GE:if (!__CLB4_1_10_bool6) {__CLR4_1_1011y11yluszvsmz.R.inc(3635);__CLB4_1_10_bool6=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3636);return 0 >= result;
                    case GT:if (!__CLB4_1_10_bool6) {__CLR4_1_1011y11yluszvsmz.R.inc(3637);__CLB4_1_10_bool6=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3638);return 0 > result;
                    case LE:if (!__CLB4_1_10_bool6) {__CLR4_1_1011y11yluszvsmz.R.inc(3639);__CLB4_1_10_bool6=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3640);return 0 <= result;
                    case LT:if (!__CLB4_1_10_bool6) {__CLR4_1_1011y11yluszvsmz.R.inc(3641);__CLB4_1_10_bool6=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3642);return 0 < result;
                }

                __CLR4_1_1011y11yluszvsmz.R.inc(3643);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3644);if ((((propertyValue instanceof Double)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3645)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3646)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3647);if ((((valueDouble == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3648)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3649)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3650);valueDouble = Double.valueOf(value);
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(3651);int result = valueDouble.compareTo((Double) propertyValue);
                boolean __CLB4_1_10_bool7=false;__CLR4_1_1011y11yluszvsmz.R.inc(3652);switch (op) {
                    case EQ:if (!__CLB4_1_10_bool7) {__CLR4_1_1011y11yluszvsmz.R.inc(3653);__CLB4_1_10_bool7=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3654);return result == 0;
                    case NE:if (!__CLB4_1_10_bool7) {__CLR4_1_1011y11yluszvsmz.R.inc(3655);__CLB4_1_10_bool7=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3656);return result != 0;
                    case GE:if (!__CLB4_1_10_bool7) {__CLR4_1_1011y11yluszvsmz.R.inc(3657);__CLB4_1_10_bool7=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3658);return 0 >= result;
                    case GT:if (!__CLB4_1_10_bool7) {__CLR4_1_1011y11yluszvsmz.R.inc(3659);__CLB4_1_10_bool7=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3660);return 0 > result;
                    case LE:if (!__CLB4_1_10_bool7) {__CLR4_1_1011y11yluszvsmz.R.inc(3661);__CLB4_1_10_bool7=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3662);return 0 <= result;
                    case LT:if (!__CLB4_1_10_bool7) {__CLR4_1_1011y11yluszvsmz.R.inc(3663);__CLB4_1_10_bool7=true;}
                        __CLR4_1_1011y11yluszvsmz.R.inc(3664);return 0 < result;
                }

                __CLR4_1_1011y11yluszvsmz.R.inc(3665);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3666);long longValue = TypeUtils.longExtractValue((Number) propertyValue);

            boolean __CLB4_1_10_bool8=false;__CLR4_1_1011y11yluszvsmz.R.inc(3667);switch (op) {
                case EQ:if (!__CLB4_1_10_bool8) {__CLR4_1_1011y11yluszvsmz.R.inc(3668);__CLB4_1_10_bool8=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3669);return longValue == value;
                case NE:if (!__CLB4_1_10_bool8) {__CLR4_1_1011y11yluszvsmz.R.inc(3670);__CLB4_1_10_bool8=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3671);return longValue != value;
                case GE:if (!__CLB4_1_10_bool8) {__CLR4_1_1011y11yluszvsmz.R.inc(3672);__CLB4_1_10_bool8=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3673);return longValue >= value;
                case GT:if (!__CLB4_1_10_bool8) {__CLR4_1_1011y11yluszvsmz.R.inc(3674);__CLB4_1_10_bool8=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3675);return longValue > value;
                case LE:if (!__CLB4_1_10_bool8) {__CLR4_1_1011y11yluszvsmz.R.inc(3676);__CLB4_1_10_bool8=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3677);return longValue <= value;
                case LT:if (!__CLB4_1_10_bool8) {__CLR4_1_1011y11yluszvsmz.R.inc(3678);__CLB4_1_10_bool8=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3679);return longValue < value;
            }

            __CLR4_1_1011y11yluszvsmz.R.inc(3680);return false;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }
    
    static class DoubleOpSegement implements Filter {
        private final String   propertyName;
        private final double   value;
        private final Operator op;

        private final long     propertyNameHash;

        public DoubleOpSegement(String propertyName, double value, Operator op){try{__CLR4_1_1011y11yluszvsmz.R.inc(3681);
            __CLR4_1_1011y11yluszvsmz.R.inc(3682);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3683);this.value = value;
            __CLR4_1_1011y11yluszvsmz.R.inc(3684);this.op = op;
            __CLR4_1_1011y11yluszvsmz.R.inc(3685);propertyNameHash = TypeUtils.fnv1a_64(propertyName);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3686);
            __CLR4_1_1011y11yluszvsmz.R.inc(3687);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3688);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3689)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3690)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3691);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3692);if ((((!(propertyValue instanceof Number))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3693)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3694)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3695);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3696);double doubleValue = ((Number) propertyValue).doubleValue();

            boolean __CLB4_1_10_bool9=false;__CLR4_1_1011y11yluszvsmz.R.inc(3697);switch (op) {
                case EQ:if (!__CLB4_1_10_bool9) {__CLR4_1_1011y11yluszvsmz.R.inc(3698);__CLB4_1_10_bool9=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3699);return doubleValue == value;
                case NE:if (!__CLB4_1_10_bool9) {__CLR4_1_1011y11yluszvsmz.R.inc(3700);__CLB4_1_10_bool9=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3701);return doubleValue != value;
                case GE:if (!__CLB4_1_10_bool9) {__CLR4_1_1011y11yluszvsmz.R.inc(3702);__CLB4_1_10_bool9=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3703);return doubleValue >= value;
                case GT:if (!__CLB4_1_10_bool9) {__CLR4_1_1011y11yluszvsmz.R.inc(3704);__CLB4_1_10_bool9=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3705);return doubleValue > value;
                case LE:if (!__CLB4_1_10_bool9) {__CLR4_1_1011y11yluszvsmz.R.inc(3706);__CLB4_1_10_bool9=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3707);return doubleValue <= value;
                case LT:if (!__CLB4_1_10_bool9) {__CLR4_1_1011y11yluszvsmz.R.inc(3708);__CLB4_1_10_bool9=true;}
                    __CLR4_1_1011y11yluszvsmz.R.inc(3709);return doubleValue < value;
            }

            __CLR4_1_1011y11yluszvsmz.R.inc(3710);return false;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class RefOpSegement implements Filter {
        private final String    propertyName;
        private final Segment  refSgement;
        private final Operator  op;
        private final long      propertyNameHash;

        public RefOpSegement(String propertyName, Segment refSgement, Operator op){try{__CLR4_1_1011y11yluszvsmz.R.inc(3711);
            __CLR4_1_1011y11yluszvsmz.R.inc(3712);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3713);this.refSgement = refSgement;
            __CLR4_1_1011y11yluszvsmz.R.inc(3714);this.op = op;
            __CLR4_1_1011y11yluszvsmz.R.inc(3715);propertyNameHash = TypeUtils.fnv1a_64(propertyName);
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3716);
            __CLR4_1_1011y11yluszvsmz.R.inc(3717);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3718);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3719)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3720)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3721);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3722);if ((((!(propertyValue instanceof Number))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3723)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3724)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3725);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3726);Object refValue = refSgement.eval(path, rootObject, rootObject);

            __CLR4_1_1011y11yluszvsmz.R.inc(3727);if ((((refValue instanceof Integer || refValue instanceof Long || refValue instanceof Short || refValue instanceof Byte)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3728)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3729)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3730);long value = TypeUtils.longExtractValue((Number) refValue);

                __CLR4_1_1011y11yluszvsmz.R.inc(3731);if ((((propertyValue instanceof Integer || propertyValue instanceof Long || propertyValue instanceof Short || propertyValue instanceof Byte)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3732)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3733)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3734);long longValue = TypeUtils.longExtractValue((Number) propertyValue);

                    boolean __CLB4_1_10_bool10=false;__CLR4_1_1011y11yluszvsmz.R.inc(3735);switch (op) {
                        case EQ:if (!__CLB4_1_10_bool10) {__CLR4_1_1011y11yluszvsmz.R.inc(3736);__CLB4_1_10_bool10=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3737);return longValue == value;
                        case NE:if (!__CLB4_1_10_bool10) {__CLR4_1_1011y11yluszvsmz.R.inc(3738);__CLB4_1_10_bool10=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3739);return longValue != value;
                        case GE:if (!__CLB4_1_10_bool10) {__CLR4_1_1011y11yluszvsmz.R.inc(3740);__CLB4_1_10_bool10=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3741);return longValue >= value;
                        case GT:if (!__CLB4_1_10_bool10) {__CLR4_1_1011y11yluszvsmz.R.inc(3742);__CLB4_1_10_bool10=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3743);return longValue > value;
                        case LE:if (!__CLB4_1_10_bool10) {__CLR4_1_1011y11yluszvsmz.R.inc(3744);__CLB4_1_10_bool10=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3745);return longValue <= value;
                        case LT:if (!__CLB4_1_10_bool10) {__CLR4_1_1011y11yluszvsmz.R.inc(3746);__CLB4_1_10_bool10=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3747);return longValue < value;
                    }
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3748);if ((((propertyValue instanceof BigDecimal)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3749)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3750)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3751);BigDecimal valueDecimal = BigDecimal.valueOf(value);

                    __CLR4_1_1011y11yluszvsmz.R.inc(3752);int result = valueDecimal.compareTo((BigDecimal) propertyValue);
                    boolean __CLB4_1_10_bool11=false;__CLR4_1_1011y11yluszvsmz.R.inc(3753);switch (op) {
                        case EQ:if (!__CLB4_1_10_bool11) {__CLR4_1_1011y11yluszvsmz.R.inc(3754);__CLB4_1_10_bool11=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3755);return result == 0;
                        case NE:if (!__CLB4_1_10_bool11) {__CLR4_1_1011y11yluszvsmz.R.inc(3756);__CLB4_1_10_bool11=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3757);return result != 0;
                        case GE:if (!__CLB4_1_10_bool11) {__CLR4_1_1011y11yluszvsmz.R.inc(3758);__CLB4_1_10_bool11=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3759);return 0 >= result;
                        case GT:if (!__CLB4_1_10_bool11) {__CLR4_1_1011y11yluszvsmz.R.inc(3760);__CLB4_1_10_bool11=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3761);return 0 > result;
                        case LE:if (!__CLB4_1_10_bool11) {__CLR4_1_1011y11yluszvsmz.R.inc(3762);__CLB4_1_10_bool11=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3763);return 0 <= result;
                        case LT:if (!__CLB4_1_10_bool11) {__CLR4_1_1011y11yluszvsmz.R.inc(3764);__CLB4_1_10_bool11=true;}
                            __CLR4_1_1011y11yluszvsmz.R.inc(3765);return 0 < result;
                    }

                    __CLR4_1_1011y11yluszvsmz.R.inc(3766);return false;
                }
            }}}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3767);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class MatchSegement implements Filter {

        private final String   propertyName;
        private final long     propertyNameHash;
        private final String   startsWithValue;
        private final String   endsWithValue;
        private final String[] containsValues;
        private final int      minLength;
        private final boolean  not;

        public MatchSegement(
                String propertyName,
                String startsWithValue,
                String endsWithValue,
                String[] containsValues,
                boolean not)
        {try{__CLR4_1_1011y11yluszvsmz.R.inc(3768);
            __CLR4_1_1011y11yluszvsmz.R.inc(3769);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3770);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3771);this.startsWithValue = startsWithValue;
            __CLR4_1_1011y11yluszvsmz.R.inc(3772);this.endsWithValue = endsWithValue;
            __CLR4_1_1011y11yluszvsmz.R.inc(3773);this.containsValues = containsValues;
            __CLR4_1_1011y11yluszvsmz.R.inc(3774);this.not = not;

            __CLR4_1_1011y11yluszvsmz.R.inc(3775);int len = 0;
            __CLR4_1_1011y11yluszvsmz.R.inc(3776);if ((((startsWithValue != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3777)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3778)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3779);len += startsWithValue.length();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3780);if ((((endsWithValue != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3781)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3782)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3783);len += endsWithValue.length();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3784);if ((((containsValues != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3785)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3786)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3787);for (String item : containsValues) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3788);len += item.length();
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3789);this.minLength = len;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3790);
            __CLR4_1_1011y11yluszvsmz.R.inc(3791);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3792);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3793)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3794)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3795);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3796);final String strPropertyValue = propertyValue.toString();

            __CLR4_1_1011y11yluszvsmz.R.inc(3797);if ((((strPropertyValue.length() < minLength)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3798)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3799)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3800);return not;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3801);int start = 0;
            __CLR4_1_1011y11yluszvsmz.R.inc(3802);if ((((startsWithValue != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3803)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3804)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3805);if ((((!strPropertyValue.startsWith(startsWithValue))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3806)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3807)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3808);return not;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(3809);start += startsWithValue.length();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3810);if ((((containsValues != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3811)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3812)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3813);for (String containsValue : containsValues) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3814);int index = strPropertyValue.indexOf(containsValue, start);
                    __CLR4_1_1011y11yluszvsmz.R.inc(3815);if ((((index == -1)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3816)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3817)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3818);return not;
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(3819);start = index + containsValue.length();
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3820);if ((((endsWithValue != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3821)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3822)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3823);if ((((!strPropertyValue.endsWith(endsWithValue))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3824)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3825)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3826);return not;
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(3827);return !not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class RlikeSegement implements Filter {

        private final String  propertyName;
        private final long   propertyNameHash;
        private final Pattern pattern;
        private final boolean not;

        public RlikeSegement(String propertyName, String pattern, boolean not){try{__CLR4_1_1011y11yluszvsmz.R.inc(3828);
            __CLR4_1_1011y11yluszvsmz.R.inc(3829);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3830);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3831);this.pattern = Pattern.compile(pattern);
            __CLR4_1_1011y11yluszvsmz.R.inc(3832);this.not = not;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3833);
            __CLR4_1_1011y11yluszvsmz.R.inc(3834);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3835);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3836)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3837)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3838);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3839);String strPropertyValue = propertyValue.toString();
            __CLR4_1_1011y11yluszvsmz.R.inc(3840);Matcher m = pattern.matcher(strPropertyValue);
            __CLR4_1_1011y11yluszvsmz.R.inc(3841);boolean match = m.matches();

            __CLR4_1_1011y11yluszvsmz.R.inc(3842);if ((((not)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3843)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3844)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3845);match = !match;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3846);return match;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class StringOpSegement implements Filter {

        private final String   propertyName;
        private final long     propertyNameHash;
        private final String   value;
        private final Operator op;

        public StringOpSegement(String propertyName, String value, Operator op){try{__CLR4_1_1011y11yluszvsmz.R.inc(3847);
            __CLR4_1_1011y11yluszvsmz.R.inc(3848);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3849);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3850);this.value = value;
            __CLR4_1_1011y11yluszvsmz.R.inc(3851);this.op = op;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3852);
            __CLR4_1_1011y11yluszvsmz.R.inc(3853);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);

            __CLR4_1_1011y11yluszvsmz.R.inc(3854);if ((((op == Operator.EQ)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3855)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3856)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3857);return value.equals(propertyValue);
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3858);if ((((op == Operator.NE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3859)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3860)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3861);return !value.equals(propertyValue);
            }

            }}__CLR4_1_1011y11yluszvsmz.R.inc(3862);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3863)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3864)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3865);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3866);int compareResult = value.compareTo(propertyValue.toString());
            __CLR4_1_1011y11yluszvsmz.R.inc(3867);if ((((op == Operator.GE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3868)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3869)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3870);return compareResult <= 0;
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3871);if ((((op == Operator.GT)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3872)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3873)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3874);return compareResult < 0;
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3875);if ((((op == Operator.LE)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3876)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3877)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3878);return compareResult >= 0;
            } }else {__CLR4_1_1011y11yluszvsmz.R.inc(3879);if ((((op == Operator.LT)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3880)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3881)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3882);return compareResult > 0;
            }

            }}}}__CLR4_1_1011y11yluszvsmz.R.inc(3883);return false;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    static class RegMatchSegement implements Filter {

        private final String   propertyName;
        private final long     propertyNameHash;
        private final Pattern  pattern;
        private final Operator op;

        public RegMatchSegement(String propertyName, Pattern pattern, Operator op){try{__CLR4_1_1011y11yluszvsmz.R.inc(3884);
            __CLR4_1_1011y11yluszvsmz.R.inc(3885);this.propertyName = propertyName;
            __CLR4_1_1011y11yluszvsmz.R.inc(3886);this.propertyNameHash = TypeUtils.fnv1a_64(propertyName);
            __CLR4_1_1011y11yluszvsmz.R.inc(3887);this.pattern = pattern;
            __CLR4_1_1011y11yluszvsmz.R.inc(3888);this.op = op;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3889);
            __CLR4_1_1011y11yluszvsmz.R.inc(3890);Object propertyValue = path.getPropertyValue(item, propertyName, propertyNameHash);
            __CLR4_1_1011y11yluszvsmz.R.inc(3891);if ((((propertyValue == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3892)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3893)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3894);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3895);String str = propertyValue.toString();

            __CLR4_1_1011y11yluszvsmz.R.inc(3896);Matcher m = pattern.matcher(str);
            __CLR4_1_1011y11yluszvsmz.R.inc(3897);return m.matches();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    enum Operator {
                   EQ, NE, GT, GE, LT, LE, LIKE, NOT_LIKE, RLIKE, NOT_RLIKE, IN, NOT_IN, BETWEEN, NOT_BETWEEN, And, Or, REG_MATCH
    }

    static public class FilterSegment implements Segment {

        private final Filter filter;

        public FilterSegment(Filter filter){
            super();__CLR4_1_1011y11yluszvsmz.R.inc(3899);try{__CLR4_1_1011y11yluszvsmz.R.inc(3898);
            __CLR4_1_1011y11yluszvsmz.R.inc(3900);this.filter = filter;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        @SuppressWarnings("rawtypes")
        public Object eval(JSONPath path, Object rootObject, Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3901);
            __CLR4_1_1011y11yluszvsmz.R.inc(3902);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3903)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3904)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3905);return null;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3906);List<Object> items = new JSONArray();

            __CLR4_1_1011y11yluszvsmz.R.inc(3907);if ((((currentObject instanceof Iterable)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3908)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3909)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3910);Iterator it = ((Iterable) currentObject).iterator();
                __CLR4_1_1011y11yluszvsmz.R.inc(3911);while ((((it.hasNext())&&(__CLR4_1_1011y11yluszvsmz.R.iget(3912)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3913)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3914);Object item = it.next();

                    __CLR4_1_1011y11yluszvsmz.R.inc(3915);if ((((filter.apply(path, rootObject, currentObject, item))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3916)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3917)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3918);items.add(item);
                    }
                }}

                }__CLR4_1_1011y11yluszvsmz.R.inc(3919);return items;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3920);if ((((filter.apply(path, rootObject, currentObject, currentObject))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3921)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3922)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3923);return currentObject;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(3924);return null;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public void extract(JSONPath path, DefaultJSONParser parser, Context context) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3925);
            __CLR4_1_1011y11yluszvsmz.R.inc(3926);throw new UnsupportedOperationException();
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    interface Filter {

        boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item);
    }

    static class FilterGroup implements Filter {
        private boolean and;
        private List<Filter> fitlers;

        public FilterGroup(Filter left, Filter right, boolean and) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3927);
            __CLR4_1_1011y11yluszvsmz.R.inc(3928);fitlers = new ArrayList<Filter>(2);
            __CLR4_1_1011y11yluszvsmz.R.inc(3929);fitlers.add(left);
            __CLR4_1_1011y11yluszvsmz.R.inc(3930);fitlers.add(right);
            __CLR4_1_1011y11yluszvsmz.R.inc(3931);this.and = and;
        }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

        public boolean apply(JSONPath path, Object rootObject, Object currentObject, Object item) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3932);
            __CLR4_1_1011y11yluszvsmz.R.inc(3933);if ((((and)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3934)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3935)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3936);for (Filter fitler : this.fitlers) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3937);if ((((!fitler.apply(path, rootObject, currentObject, item))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3938)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3939)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3940);return false;
                    }
                }}
                }__CLR4_1_1011y11yluszvsmz.R.inc(3941);return true;
            } }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3942);for (Filter fitler : this.fitlers) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3943);if ((((fitler.apply(path, rootObject, currentObject, item))&&(__CLR4_1_1011y11yluszvsmz.R.iget(3944)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3945)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(3946);return true;
                    }
                }}
                }__CLR4_1_1011y11yluszvsmz.R.inc(3947);return false;
            }
        }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    }

    @SuppressWarnings("rawtypes")
    protected Object getArrayItem(final Object currentObject, int index) {try{__CLR4_1_1011y11yluszvsmz.R.inc(3948);
        __CLR4_1_1011y11yluszvsmz.R.inc(3949);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3950)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3951)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3952);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(3953);if ((((currentObject instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3954)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3955)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3956);List list = (List) currentObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(3957);if ((((index >= 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3958)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3959)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3960);if ((((index < list.size())&&(__CLR4_1_1011y11yluszvsmz.R.iget(3961)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3962)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3963);return list.get(index);
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(3964);return null;
            } }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3965);if ((((Math.abs(index) <= list.size())&&(__CLR4_1_1011y11yluszvsmz.R.iget(3966)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3967)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3968);return list.get(list.size() + index);
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(3969);return null;
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(3970);if ((((currentObject.getClass().isArray())&&(__CLR4_1_1011y11yluszvsmz.R.iget(3971)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3972)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3973);int arrayLenth = Array.getLength(currentObject);

            __CLR4_1_1011y11yluszvsmz.R.inc(3974);if ((((index >= 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3975)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3976)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3977);if ((((index < arrayLenth)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3978)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3979)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3980);return Array.get(currentObject, index);
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(3981);return null;
            } }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3982);if ((((Math.abs(index) <= arrayLenth)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3983)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3984)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(3985);return Array.get(currentObject, arrayLenth + index);
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(3986);return null;
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(3987);if ((((currentObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3988)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3989)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(3990);Map map = (Map) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(3991);Object value = map.get(index);
            __CLR4_1_1011y11yluszvsmz.R.inc(3992);if ((((value == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3993)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3994)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(3995);value = map.get(Integer.toString(index));
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(3996);return value;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(3997);if ((((currentObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(3998)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(3999)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4000);Collection collection = (Collection) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(4001);int i = 0;
            __CLR4_1_1011y11yluszvsmz.R.inc(4002);for (Object item : collection) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4003);if ((((i == index)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4004)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4005)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4006);return item;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(4007);i++;
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4008);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4009);throw new UnsupportedOperationException();
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public boolean setArrayItem(JSONPath path, Object currentObject, int index, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4010);
        __CLR4_1_1011y11yluszvsmz.R.inc(4011);if ((((currentObject instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4012)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4013)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4014);List list = (List) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(4015);if ((((index >= 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4016)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4017)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4018);list.set(index, value);
            } }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4019);list.set(list.size() + index, value);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4020);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4021);Class<?> clazz = currentObject.getClass();
        __CLR4_1_1011y11yluszvsmz.R.inc(4022);if ((((clazz.isArray())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4023)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4024)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4025);int arrayLenth = Array.getLength(currentObject);

            __CLR4_1_1011y11yluszvsmz.R.inc(4026);if ((((index >= 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4027)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4028)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4029);if ((((index < arrayLenth)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4030)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4031)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4032);Array.set(currentObject, index, value);
                }
            }} }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4033);if ((((Math.abs(index) <= arrayLenth)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4034)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4035)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4036);Array.set(currentObject, arrayLenth + index, value);
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(4037);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4038);throw new JSONPathException("unsupported set operation." + clazz);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public boolean removeArrayItem(JSONPath path, Object currentObject, int index) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4039);
        __CLR4_1_1011y11yluszvsmz.R.inc(4040);if ((((currentObject instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4041)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4042)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4043);List list = (List) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(4044);if ((((index >= 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4045)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4046)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4047);if ((((index >= list.size())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4048)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4049)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4050);return false;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(4051);list.remove(index);
            } }else {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4052);int newIndex = list.size() + index;
                
                __CLR4_1_1011y11yluszvsmz.R.inc(4053);if ((((newIndex < 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4054)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4055)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4056);return false;
                }
                
                }__CLR4_1_1011y11yluszvsmz.R.inc(4057);list.remove(newIndex);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4058);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4059);Class<?> clazz = currentObject.getClass();
        __CLR4_1_1011y11yluszvsmz.R.inc(4060);throw new JSONPathException("unsupported set operation." + clazz);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected Collection<Object> getPropertyValues(final Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4061);
        __CLR4_1_1011y11yluszvsmz.R.inc(4062);final Class<?> currentClass = currentObject.getClass();

        __CLR4_1_1011y11yluszvsmz.R.inc(4063);JavaBeanSerializer beanSerializer = getJavaBeanSerializer(currentClass);

        __CLR4_1_1011y11yluszvsmz.R.inc(4064);if ((((beanSerializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4065)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4066)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4067);try {
                __CLR4_1_1011y11yluszvsmz.R.inc(4068);return beanSerializer.getFieldValues(currentObject);
            } catch (Exception e) {
                __CLR4_1_1011y11yluszvsmz.R.inc(4069);throw new JSONPathException("jsonpath error, path " + path, e);
            }
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4070);if ((((currentObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4071)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4072)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4073);Map map = (Map) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(4074);return map.values();
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4075);if ((((currentObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4076)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4077)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4078);return (Collection) currentObject;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4079);throw new UnsupportedOperationException();
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    protected void deepGetPropertyValues(final Object currentObject, List<Object> outValues) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4080);
        __CLR4_1_1011y11yluszvsmz.R.inc(4081);final Class<?> currentClass = currentObject.getClass();

        __CLR4_1_1011y11yluszvsmz.R.inc(4082);JavaBeanSerializer beanSerializer = getJavaBeanSerializer(currentClass);

        __CLR4_1_1011y11yluszvsmz.R.inc(4083);Collection collection = null;
        __CLR4_1_1011y11yluszvsmz.R.inc(4084);if ((((beanSerializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4085)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4086)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4087);try {
                __CLR4_1_1011y11yluszvsmz.R.inc(4088);collection = beanSerializer.getFieldValues(currentObject);
            } catch (Exception e) {
                __CLR4_1_1011y11yluszvsmz.R.inc(4089);throw new JSONPathException("jsonpath error, path " + path, e);
            }
        } }else {__CLR4_1_1011y11yluszvsmz.R.inc(4090);if ((((currentObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4091)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4092)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4093);Map map = (Map) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(4094);collection = map.values();
        } }else {__CLR4_1_1011y11yluszvsmz.R.inc(4095);if ((((currentObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4096)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4097)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4098);collection = (Collection) currentObject;
        }

        }}}__CLR4_1_1011y11yluszvsmz.R.inc(4099);if ((((collection != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4100)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4101)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4102);for (Object fieldValue : collection) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4103);if ((((fieldValue == null || ParserConfig.isPrimitive2(fieldValue.getClass()))&&(__CLR4_1_1011y11yluszvsmz.R.iget(4104)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4105)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4106);outValues.add(fieldValue);
                } }else {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4107);deepGetPropertyValues(fieldValue, outValues);
                }
            }}
            }__CLR4_1_1011y11yluszvsmz.R.inc(4108);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4109);throw new UnsupportedOperationException(currentClass.getName());
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    static boolean eq(Object a, Object b) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4110);
        __CLR4_1_1011y11yluszvsmz.R.inc(4111);if ((((a == b)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4112)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4113)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4114);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4115);if ((((a == null || b == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4116)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4117)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4118);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4119);if ((((a.getClass() == b.getClass())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4120)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4121)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4122);return a.equals(b);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4123);if ((((a instanceof Number)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4124)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4125)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4126);if ((((b instanceof Number)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4127)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4128)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4129);return eqNotNull((Number) a, (Number) b);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4130);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4131);return a.equals(b);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    static boolean eqNotNull(Number a, Number b) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4132);
        __CLR4_1_1011y11yluszvsmz.R.inc(4133);Class clazzA = a.getClass();
        __CLR4_1_1011y11yluszvsmz.R.inc(4134);boolean isIntA = isInt(clazzA);

        __CLR4_1_1011y11yluszvsmz.R.inc(4135);Class clazzB = b.getClass();
        __CLR4_1_1011y11yluszvsmz.R.inc(4136);boolean isIntB = isInt(clazzB);
        
        __CLR4_1_1011y11yluszvsmz.R.inc(4137);if ((((a instanceof BigDecimal)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4138)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4139)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4140);BigDecimal decimalA = (BigDecimal) a;
            
            __CLR4_1_1011y11yluszvsmz.R.inc(4141);if ((((isIntB)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4142)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4143)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4144);return decimalA.equals(BigDecimal.valueOf(TypeUtils.longExtractValue(b)));
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(4145);if ((((isIntA)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4146)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4147)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4148);if ((((isIntB)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4149)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4150)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4151);return a.longValue() == b.longValue();
            }
            
            }__CLR4_1_1011y11yluszvsmz.R.inc(4152);if ((((b instanceof BigInteger)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4153)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4154)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4155);BigInteger bigIntB = (BigInteger) a;
                __CLR4_1_1011y11yluszvsmz.R.inc(4156);BigInteger bigIntA = BigInteger.valueOf(a.longValue());
                
                __CLR4_1_1011y11yluszvsmz.R.inc(4157);return bigIntA.equals(bigIntB);
            }
        }}
        
        }__CLR4_1_1011y11yluszvsmz.R.inc(4158);if ((((isIntB)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4159)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4160)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4161);if ((((a instanceof BigInteger)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4162)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4163)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4164);BigInteger bigIntA = (BigInteger) a;
                __CLR4_1_1011y11yluszvsmz.R.inc(4165);BigInteger bigIntB = BigInteger.valueOf(TypeUtils.longExtractValue(b));
                
                __CLR4_1_1011y11yluszvsmz.R.inc(4166);return bigIntA.equals(bigIntB);
            }
        }}
        

        }__CLR4_1_1011y11yluszvsmz.R.inc(4167);boolean isDoubleA = isDouble(clazzA);
        __CLR4_1_1011y11yluszvsmz.R.inc(4168);boolean isDoubleB = isDouble(clazzB);

        __CLR4_1_1011y11yluszvsmz.R.inc(4169);if (((((isDoubleA && isDoubleB) || (isDoubleA && isIntB) || (isDoubleB && isIntA))&&(__CLR4_1_1011y11yluszvsmz.R.iget(4170)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4171)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4172);return a.doubleValue() == b.doubleValue();
        }
        

        }__CLR4_1_1011y11yluszvsmz.R.inc(4173);return false;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    protected static boolean isDouble(Class<?> clazzA) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4174);
        __CLR4_1_1011y11yluszvsmz.R.inc(4175);return clazzA == Float.class || clazzA == Double.class;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    protected static boolean isInt(Class<?> clazzA) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4176);
        __CLR4_1_1011y11yluszvsmz.R.inc(4177);return clazzA == Byte.class || clazzA == Short.class || clazzA == Integer.class || clazzA == Long.class;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    final static long SIZE = 0x4dea9618e618ae3cL; // TypeUtils.fnv1a_64("size");
    final static long LENGTH = 0xea11573f1af59eb5L; // TypeUtils.fnv1a_64("length");

    protected Object getPropertyValue(Object currentObject, String propertyName, long propertyNameHash) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4178);
        __CLR4_1_1011y11yluszvsmz.R.inc(4179);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4180)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4181)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4182);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4183);if ((((currentObject instanceof String)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4184)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4185)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4186);try {
                __CLR4_1_1011y11yluszvsmz.R.inc(4187);JSONObject object = JSON.parseObject((String) currentObject);
                __CLR4_1_1011y11yluszvsmz.R.inc(4188);currentObject = object;
            } catch (Exception ex) {
                // skip
            }
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4189);if ((((currentObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4190)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4191)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4192);Map map = (Map) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(4193);Object val = map.get(propertyName);

            __CLR4_1_1011y11yluszvsmz.R.inc(4194);if ((((val == null && (SIZE == propertyNameHash || LENGTH == propertyNameHash))&&(__CLR4_1_1011y11yluszvsmz.R.iget(4195)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4196)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4197);val = map.size();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4198);return val;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4199);final Class<?> currentClass = currentObject.getClass();

        __CLR4_1_1011y11yluszvsmz.R.inc(4200);JavaBeanSerializer beanSerializer = getJavaBeanSerializer(currentClass);
        __CLR4_1_1011y11yluszvsmz.R.inc(4201);if ((((beanSerializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4202)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4203)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4204);try {
                __CLR4_1_1011y11yluszvsmz.R.inc(4205);return beanSerializer.getFieldValue(currentObject, propertyName, propertyNameHash, false);
            } catch (Exception e) {
                __CLR4_1_1011y11yluszvsmz.R.inc(4206);throw new JSONPathException("jsonpath error, path " + path + ", segement " + propertyName, e);
            }
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4207);if ((((currentObject instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4208)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4209)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4210);List list = (List) currentObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(4211);if ((((SIZE == propertyNameHash || LENGTH == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4212)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4213)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4214);return list.size();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4215);List<Object> fieldValues = null;

            __CLR4_1_1011y11yluszvsmz.R.inc(4216);for (int i = 0; (((i < list.size())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4217)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4218)==0&false)); ++i) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4219);Object obj = list.get(i);

                //
                __CLR4_1_1011y11yluszvsmz.R.inc(4220);if ((((obj == list)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4221)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4222)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4223);if ((((fieldValues == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4224)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4225)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(4226);fieldValues = new JSONArray(list.size());
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(4227);fieldValues.add(obj);
                    __CLR4_1_1011y11yluszvsmz.R.inc(4228);continue;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(4229);Object itemValue = getPropertyValue(obj, propertyName, propertyNameHash);
                __CLR4_1_1011y11yluszvsmz.R.inc(4230);if ((((itemValue instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4231)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4232)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4233);Collection collection = (Collection) itemValue;
                    __CLR4_1_1011y11yluszvsmz.R.inc(4234);if ((((fieldValues == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4235)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4236)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(4237);fieldValues = new JSONArray(list.size());
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(4238);fieldValues.addAll(collection);
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(4239);if ((((itemValue != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4240)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4241)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4242);if ((((fieldValues == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4243)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4244)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(4245);fieldValues = new JSONArray(list.size());
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(4246);fieldValues.add(itemValue);
                }
            }}}

            }__CLR4_1_1011y11yluszvsmz.R.inc(4247);if ((((fieldValues == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4248)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4249)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4250);fieldValues = Collections.emptyList();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4251);return fieldValues;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4252);if ((((currentObject instanceof Object[])&&(__CLR4_1_1011y11yluszvsmz.R.iget(4253)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4254)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4255);Object[] array = (Object[]) currentObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(4256);if ((((SIZE == propertyNameHash || LENGTH == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4257)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4258)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4259);return array.length;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4260);List<Object> fieldValues = new JSONArray(array.length);

            __CLR4_1_1011y11yluszvsmz.R.inc(4261);for (int i = 0; (((i < array.length)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4262)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4263)==0&false)); ++i) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4264);Object obj = array[i];

                //
                __CLR4_1_1011y11yluszvsmz.R.inc(4265);if ((((obj == array)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4266)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4267)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4268);fieldValues.add(obj);
                    __CLR4_1_1011y11yluszvsmz.R.inc(4269);continue;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(4270);Object itemValue = getPropertyValue(obj, propertyName, propertyNameHash);
                __CLR4_1_1011y11yluszvsmz.R.inc(4271);if ((((itemValue instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4272)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4273)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4274);Collection collection = (Collection) itemValue;
                    __CLR4_1_1011y11yluszvsmz.R.inc(4275);fieldValues.addAll(collection);
                } }else {__CLR4_1_1011y11yluszvsmz.R.inc(4276);if ((((itemValue != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4277)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4278)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4279);fieldValues.add(itemValue);
                }
            }}}

            }__CLR4_1_1011y11yluszvsmz.R.inc(4280);return fieldValues;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4281);if ((((currentObject instanceof Enum)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4282)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4283)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4284);final long NAME = 0xc4bcadba8e631b86L; // TypeUtils.fnv1a_64("name");
            __CLR4_1_1011y11yluszvsmz.R.inc(4285);final long ORDINAL = 0xf1ebc7c20322fc22L; //TypeUtils.fnv1a_64("ordinal");

            __CLR4_1_1011y11yluszvsmz.R.inc(4286);Enum e = (Enum) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(4287);if ((((NAME == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4288)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4289)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4290);return e.name();
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4291);if ((((ORDINAL == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4292)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4293)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4294);return e.ordinal();
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(4295);if ((((currentObject instanceof Calendar)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4296)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4297)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4298);final long YEAR = 0x7c64634977425edcL; //TypeUtils.fnv1a_64("year");
            __CLR4_1_1011y11yluszvsmz.R.inc(4299);final long MONTH = 0xf4bdc3936faf56a5L; //TypeUtils.fnv1a_64("month");
            __CLR4_1_1011y11yluszvsmz.R.inc(4300);final long DAY = 0xca8d3918f4578f1dL; // TypeUtils.fnv1a_64("day");
            __CLR4_1_1011y11yluszvsmz.R.inc(4301);final long HOUR = 0x407efecc7eb5764fL; //TypeUtils.fnv1a_64("hour");
            __CLR4_1_1011y11yluszvsmz.R.inc(4302);final long MINUTE = 0x5bb2f9bdf2fad1e9L; //TypeUtils.fnv1a_64("minute");
            __CLR4_1_1011y11yluszvsmz.R.inc(4303);final long SECOND = 0xa49985ef4cee20bdL; //TypeUtils.fnv1a_64("second");

            __CLR4_1_1011y11yluszvsmz.R.inc(4304);Calendar e = (Calendar) currentObject;
            __CLR4_1_1011y11yluszvsmz.R.inc(4305);if ((((YEAR == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4306)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4307)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4308);return e.get(Calendar.YEAR);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4309);if ((((MONTH == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4310)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4311)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4312);return e.get(Calendar.MONTH);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4313);if ((((DAY == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4314)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4315)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4316);return e.get(Calendar.DAY_OF_MONTH);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4317);if ((((HOUR == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4318)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4319)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4320);return e.get(Calendar.HOUR_OF_DAY);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4321);if ((((MINUTE == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4322)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4323)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4324);return e.get(Calendar.MINUTE);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4325);if ((((SECOND == propertyNameHash)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4326)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4327)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4328);return e.get(Calendar.SECOND);
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(4329);return null;
        //throw new JSONPathException("jsonpath error, path " + path + ", segement " + propertyName);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    
    @SuppressWarnings("rawtypes")
    protected void deepScan(final Object currentObject, final String propertyName, List<Object> results) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4330);
        __CLR4_1_1011y11yluszvsmz.R.inc(4331);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4332)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4333)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4334);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4335);if ((((currentObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4336)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4337)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4338);Map<?, ?> map = (Map<?, ?>) currentObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(4339);for (Map.Entry entry : map.entrySet()) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4340);Object val = entry.getValue();

                __CLR4_1_1011y11yluszvsmz.R.inc(4341);if ((((propertyName.equals(entry.getKey()))&&(__CLR4_1_1011y11yluszvsmz.R.iget(4342)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4343)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4344);if ((((val instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4345)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4346)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(4347);results.addAll((Collection) val);
                    } }else {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(4348);results.add(val);
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(4349);continue;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(4350);if ((((val == null || ParserConfig.isPrimitive2(val.getClass()))&&(__CLR4_1_1011y11yluszvsmz.R.iget(4351)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4352)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4353);continue;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(4354);deepScan(val, propertyName, results);
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4355);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4356);if ((((currentObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4357)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4358)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4359);Iterator iterator = ((Collection) currentObject).iterator();
            __CLR4_1_1011y11yluszvsmz.R.inc(4360);while ((((iterator.hasNext())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4361)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4362)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4363);Object next = iterator.next();
                __CLR4_1_1011y11yluszvsmz.R.inc(4364);if ((((ParserConfig.isPrimitive2(next.getClass()))&&(__CLR4_1_1011y11yluszvsmz.R.iget(4365)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4366)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4367);continue;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(4368);deepScan(next, propertyName, results);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4369);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4370);final Class<?> currentClass = currentObject.getClass();

        __CLR4_1_1011y11yluszvsmz.R.inc(4371);JavaBeanSerializer beanSerializer = getJavaBeanSerializer(currentClass);
        __CLR4_1_1011y11yluszvsmz.R.inc(4372);if ((((beanSerializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4373)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4374)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4375);try {
                __CLR4_1_1011y11yluszvsmz.R.inc(4376);FieldSerializer fieldDeser = beanSerializer.getFieldSerializer(propertyName);
                __CLR4_1_1011y11yluszvsmz.R.inc(4377);if ((((fieldDeser != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4378)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4379)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4380);try {
                        __CLR4_1_1011y11yluszvsmz.R.inc(4381);Object val = fieldDeser.getPropertyValueDirect(currentObject);
                        __CLR4_1_1011y11yluszvsmz.R.inc(4382);results.add(val);
                    } catch (InvocationTargetException ex) {
                        __CLR4_1_1011y11yluszvsmz.R.inc(4383);throw new JSONException("getFieldValue error." + propertyName, ex);
                    } catch (IllegalAccessException ex) {
                        __CLR4_1_1011y11yluszvsmz.R.inc(4384);throw new JSONException("getFieldValue error." + propertyName, ex);
                    }
                    __CLR4_1_1011y11yluszvsmz.R.inc(4385);return;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(4386);List<Object> fieldValues = beanSerializer.getFieldValues(currentObject);
                __CLR4_1_1011y11yluszvsmz.R.inc(4387);for (Object val : fieldValues) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4388);deepScan(val, propertyName, results);
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(4389);return;
            } catch (Exception e) {
                __CLR4_1_1011y11yluszvsmz.R.inc(4390);throw new JSONPathException("jsonpath error, path " + path + ", segement " + propertyName, e);
            }
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4391);if ((((currentObject instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4392)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4393)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4394);List list = (List) currentObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(4395);for (int i = 0; (((i < list.size())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4396)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4397)==0&false)); ++i) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4398);Object val = list.get(i);
                __CLR4_1_1011y11yluszvsmz.R.inc(4399);deepScan(val, propertyName, results);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4400);return;
        }
    }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    protected void deepSet(final Object currentObject, final String propertyName, long propertyNameHash, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4401);
        __CLR4_1_1011y11yluszvsmz.R.inc(4402);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4403)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4404)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4405);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4406);if ((((currentObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4407)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4408)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4409);Map map = (Map) currentObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(4410);if ((((map.containsKey(propertyName))&&(__CLR4_1_1011y11yluszvsmz.R.iget(4411)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4412)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4413);Object val = map.get(propertyName);
                __CLR4_1_1011y11yluszvsmz.R.inc(4414);map.put(propertyName, value);
                __CLR4_1_1011y11yluszvsmz.R.inc(4415);return;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4416);for (Object val : map.values()) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4417);deepSet(val, propertyName, propertyNameHash, value);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4418);return;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4419);final Class<?> currentClass = currentObject.getClass();

        __CLR4_1_1011y11yluszvsmz.R.inc(4420);JavaBeanDeserializer beanDeserializer = getJavaBeanDeserializer(currentClass);
        __CLR4_1_1011y11yluszvsmz.R.inc(4421);if ((((beanDeserializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4422)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4423)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4424);try {
                __CLR4_1_1011y11yluszvsmz.R.inc(4425);FieldDeserializer fieldDeser = beanDeserializer.getFieldDeserializer(propertyName);
                __CLR4_1_1011y11yluszvsmz.R.inc(4426);if ((((fieldDeser != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4427)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4428)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4429);fieldDeser.setValue(currentObject, value);
                    __CLR4_1_1011y11yluszvsmz.R.inc(4430);return;
                }

                }__CLR4_1_1011y11yluszvsmz.R.inc(4431);JavaBeanSerializer beanSerializer = getJavaBeanSerializer(currentClass);
                __CLR4_1_1011y11yluszvsmz.R.inc(4432);List<Object> fieldValues = beanSerializer.getObjectFieldValues(currentObject);
                __CLR4_1_1011y11yluszvsmz.R.inc(4433);for (Object val : fieldValues) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4434);deepSet(val, propertyName, propertyNameHash, value);
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(4435);return;
            } catch (Exception e) {
                __CLR4_1_1011y11yluszvsmz.R.inc(4436);throw new JSONPathException("jsonpath error, path " + path + ", segement " + propertyName, e);
            }
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4437);if ((((currentObject instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4438)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4439)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4440);List list = (List) currentObject;

            __CLR4_1_1011y11yluszvsmz.R.inc(4441);for (int i = 0; (((i < list.size())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4442)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4443)==0&false)); ++i) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4444);Object val = list.get(i);
                __CLR4_1_1011y11yluszvsmz.R.inc(4445);deepSet(val, propertyName, propertyNameHash, value);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4446);return;
        }
    }}finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected boolean setPropertyValue(Object parent, String name, long propertyNameHash, Object value) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4447);
        __CLR4_1_1011y11yluszvsmz.R.inc(4448);if ((((parent instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4449)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4450)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4451);((Map) parent).put(name, value);
            __CLR4_1_1011y11yluszvsmz.R.inc(4452);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4453);if ((((parent instanceof List)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4454)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4455)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4456);for (Object element : (List) parent) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4457);if ((((element == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4458)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4459)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4460);continue;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(4461);setPropertyValue(element, name, propertyNameHash, value);
            }
            }__CLR4_1_1011y11yluszvsmz.R.inc(4462);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4463);ObjectDeserializer deserializer = parserConfig.getDeserializer(parent.getClass());

        __CLR4_1_1011y11yluszvsmz.R.inc(4464);JavaBeanDeserializer beanDeserializer = null;
        __CLR4_1_1011y11yluszvsmz.R.inc(4465);if ((((deserializer instanceof JavaBeanDeserializer)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4466)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4467)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4468);beanDeserializer = (JavaBeanDeserializer) deserializer;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4469);if ((((beanDeserializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4470)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4471)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4472);FieldDeserializer fieldDeserializer = beanDeserializer.getFieldDeserializer(propertyNameHash);
            __CLR4_1_1011y11yluszvsmz.R.inc(4473);if ((((fieldDeserializer == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4474)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4475)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4476);return false;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4477);fieldDeserializer.setValue(parent, value);
            __CLR4_1_1011y11yluszvsmz.R.inc(4478);return true;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4479);throw new UnsupportedOperationException();
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
    
    @SuppressWarnings({"rawtypes" })
    protected boolean removePropertyValue(Object parent, String name, boolean deep) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4480);
        __CLR4_1_1011y11yluszvsmz.R.inc(4481);if ((((parent instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4482)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4483)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4484);Object origin = ((Map) parent).remove(name);
            __CLR4_1_1011y11yluszvsmz.R.inc(4485);boolean found = origin != null;

            __CLR4_1_1011y11yluszvsmz.R.inc(4486);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4487)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4488)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4489);for (Object item : ((Map) parent).values()) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4490);removePropertyValue(item, name, deep);
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(4491);return found;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4492);ObjectDeserializer deserializer = parserConfig.getDeserializer(parent.getClass());

        __CLR4_1_1011y11yluszvsmz.R.inc(4493);JavaBeanDeserializer beanDeserializer = null;
        __CLR4_1_1011y11yluszvsmz.R.inc(4494);if ((((deserializer instanceof JavaBeanDeserializer)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4495)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4496)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4497);beanDeserializer = (JavaBeanDeserializer) deserializer;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4498);if ((((beanDeserializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4499)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4500)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4501);FieldDeserializer fieldDeserializer = beanDeserializer.getFieldDeserializer(name);

            __CLR4_1_1011y11yluszvsmz.R.inc(4502);boolean found = false;
            __CLR4_1_1011y11yluszvsmz.R.inc(4503);if ((((fieldDeserializer != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4504)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4505)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4506);fieldDeserializer.setValue(parent, null);
                __CLR4_1_1011y11yluszvsmz.R.inc(4507);found = true;
            }

            }__CLR4_1_1011y11yluszvsmz.R.inc(4508);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4509)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4510)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4511);Collection<Object> propertyValues = this.getPropertyValues(parent);
                __CLR4_1_1011y11yluszvsmz.R.inc(4512);for (Object item : propertyValues) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4513);if ((((item == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4514)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4515)==0&false))) {{
                        __CLR4_1_1011y11yluszvsmz.R.inc(4516);continue;
                    }
                    }__CLR4_1_1011y11yluszvsmz.R.inc(4517);removePropertyValue(item, name, deep);
                }
            }}

            }__CLR4_1_1011y11yluszvsmz.R.inc(4518);return found;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4519);if ((((deep)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4520)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4521)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4522);return false;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4523);throw new UnsupportedOperationException();
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    protected JavaBeanSerializer getJavaBeanSerializer(final Class<?> currentClass) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4524);
        __CLR4_1_1011y11yluszvsmz.R.inc(4525);JavaBeanSerializer beanSerializer = null;
        {
            __CLR4_1_1011y11yluszvsmz.R.inc(4526);ObjectSerializer serializer = serializeConfig.getObjectWriter(currentClass);
            __CLR4_1_1011y11yluszvsmz.R.inc(4527);if ((((serializer instanceof JavaBeanSerializer)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4528)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4529)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4530);beanSerializer = (JavaBeanSerializer) serializer;
            }
        }}
        __CLR4_1_1011y11yluszvsmz.R.inc(4531);return beanSerializer;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    protected JavaBeanDeserializer getJavaBeanDeserializer(final Class<?> currentClass) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4532);
        __CLR4_1_1011y11yluszvsmz.R.inc(4533);JavaBeanDeserializer beanDeserializer = null;
        {
            __CLR4_1_1011y11yluszvsmz.R.inc(4534);ObjectDeserializer deserializer = parserConfig.getDeserializer(currentClass);
            __CLR4_1_1011y11yluszvsmz.R.inc(4535);if ((((deserializer instanceof JavaBeanDeserializer)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4536)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4537)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4538);beanDeserializer = (JavaBeanDeserializer) deserializer;
            }
        }}
        __CLR4_1_1011y11yluszvsmz.R.inc(4539);return beanDeserializer;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    int evalSize(Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4540);
        __CLR4_1_1011y11yluszvsmz.R.inc(4541);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4542)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4543)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4544);return -1;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4545);if ((((currentObject instanceof Collection)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4546)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4547)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4548);return ((Collection) currentObject).size();
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4549);if ((((currentObject instanceof Object[])&&(__CLR4_1_1011y11yluszvsmz.R.iget(4550)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4551)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4552);return ((Object[]) currentObject).length;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4553);if ((((currentObject.getClass().isArray())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4554)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4555)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4556);return Array.getLength(currentObject);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4557);if ((((currentObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4558)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4559)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4560);int count = 0;

            __CLR4_1_1011y11yluszvsmz.R.inc(4561);for (Object value : ((Map) currentObject).values()) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4562);if ((((value != null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4563)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4564)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4565);count++;
                }
            }}
            }__CLR4_1_1011y11yluszvsmz.R.inc(4566);return count;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4567);JavaBeanSerializer beanSerializer = getJavaBeanSerializer(currentObject.getClass());

        __CLR4_1_1011y11yluszvsmz.R.inc(4568);if ((((beanSerializer == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4569)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4570)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4571);return -1;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4572);try {
            __CLR4_1_1011y11yluszvsmz.R.inc(4573);return beanSerializer.getSize(currentObject);
        } catch (Exception e) {
            __CLR4_1_1011y11yluszvsmz.R.inc(4574);throw new JSONPathException("evalSize error : " + path, e);
        }
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    @SuppressWarnings({"rawtypes", "unchecked"})
    Set<?> evalKeySet(Object currentObject) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4575);
        __CLR4_1_1011y11yluszvsmz.R.inc(4576);if ((((currentObject == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4577)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4578)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4579);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4580);if ((((currentObject instanceof Map)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4581)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4582)==0&false))) {{
            // For performance reasons return keySet directly, without filtering null-value key.
            __CLR4_1_1011y11yluszvsmz.R.inc(4583);return ((Map)currentObject).keySet();
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4584);if ((((currentObject instanceof Collection || currentObject instanceof Object[]
            || currentObject.getClass().isArray())&&(__CLR4_1_1011y11yluszvsmz.R.iget(4585)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4586)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4587);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4588);JavaBeanSerializer beanSerializer = getJavaBeanSerializer(currentObject.getClass());
        __CLR4_1_1011y11yluszvsmz.R.inc(4589);if ((((beanSerializer == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4590)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4591)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4592);return null;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4593);try {
            __CLR4_1_1011y11yluszvsmz.R.inc(4594);return beanSerializer.getFieldNames(currentObject);
        } catch (Exception e) {
            __CLR4_1_1011y11yluszvsmz.R.inc(4595);throw new JSONPathException("evalKeySet error : " + path, e);
        }
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public String toJSONString() {try{__CLR4_1_1011y11yluszvsmz.R.inc(4596);
        __CLR4_1_1011y11yluszvsmz.R.inc(4597);return JSON.toJSONString(path);
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static Object reserveToArray(Object object, String... paths) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4598);
        __CLR4_1_1011y11yluszvsmz.R.inc(4599);JSONArray reserved = new JSONArray();

        __CLR4_1_1011y11yluszvsmz.R.inc(4600);if ((((paths == null || paths.length == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4601)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4602)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4603);return reserved;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4604);for (String item : paths) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4605);JSONPath path = JSONPath.compile(item);
            __CLR4_1_1011y11yluszvsmz.R.inc(4606);path.init();

            __CLR4_1_1011y11yluszvsmz.R.inc(4607);Object value = path.eval(object);
            __CLR4_1_1011y11yluszvsmz.R.inc(4608);reserved.add(value);
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4609);return reserved;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}

    public static Object reserveToObject(Object object, String... paths) {try{__CLR4_1_1011y11yluszvsmz.R.inc(4610);
        __CLR4_1_1011y11yluszvsmz.R.inc(4611);if ((((paths == null || paths.length == 0)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4612)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4613)==0&false))) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4614);return object;
        }

        }__CLR4_1_1011y11yluszvsmz.R.inc(4615);JSONObject reserved = new JSONObject(true);
        __CLR4_1_1011y11yluszvsmz.R.inc(4616);for (String item : paths) {{
            __CLR4_1_1011y11yluszvsmz.R.inc(4617);JSONPath path = JSONPath.compile(item);
            __CLR4_1_1011y11yluszvsmz.R.inc(4618);path.init();
            __CLR4_1_1011y11yluszvsmz.R.inc(4619);Segment lastSegement = path.segments[path.segments.length - 1];
            __CLR4_1_1011y11yluszvsmz.R.inc(4620);if ((((lastSegement instanceof PropertySegment)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4621)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4622)==0&false))) {{
                __CLR4_1_1011y11yluszvsmz.R.inc(4623);Object value = path.eval(object);
                __CLR4_1_1011y11yluszvsmz.R.inc(4624);if ((((value == null)&&(__CLR4_1_1011y11yluszvsmz.R.iget(4625)!=0|true))||(__CLR4_1_1011y11yluszvsmz.R.iget(4626)==0&false))) {{
                    __CLR4_1_1011y11yluszvsmz.R.inc(4627);continue;
                }
                }__CLR4_1_1011y11yluszvsmz.R.inc(4628);path.set(reserved, value);
            } }else {{
                // skip
            }
        }}

        }__CLR4_1_1011y11yluszvsmz.R.inc(4629);return reserved;
    }finally{__CLR4_1_1011y11yluszvsmz.R.flushNeeded();}}
}
