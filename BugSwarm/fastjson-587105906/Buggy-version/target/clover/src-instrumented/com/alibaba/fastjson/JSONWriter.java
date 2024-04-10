/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

import static com.alibaba.fastjson.JSONStreamContext.*;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

@java.lang.SuppressWarnings({"fallthrough"}) public class JSONWriter implements Closeable, Flushable {public static class __CLR4_1_10427427luszvsxa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,5398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private SerializeWriter   writer;

    private JSONSerializer    serializer;

    private JSONStreamContext context;

    public JSONWriter(Writer out){try{__CLR4_1_10427427luszvsxa.R.inc(5263);
        __CLR4_1_10427427luszvsxa.R.inc(5264);writer = new SerializeWriter(out);
        __CLR4_1_10427427luszvsxa.R.inc(5265);serializer = new JSONSerializer(writer);
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void config(SerializerFeature feature, boolean state) {try{__CLR4_1_10427427luszvsxa.R.inc(5266);
        __CLR4_1_10427427luszvsxa.R.inc(5267);this.writer.config(feature, state);
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void startObject() {try{__CLR4_1_10427427luszvsxa.R.inc(5268);
        __CLR4_1_10427427luszvsxa.R.inc(5269);if ((((context != null)&&(__CLR4_1_10427427luszvsxa.R.iget(5270)!=0|true))||(__CLR4_1_10427427luszvsxa.R.iget(5271)==0&false))) {{
            __CLR4_1_10427427luszvsxa.R.inc(5272);beginStructure();
        }
        }__CLR4_1_10427427luszvsxa.R.inc(5273);context = new JSONStreamContext(context, JSONStreamContext.StartObject);
        __CLR4_1_10427427luszvsxa.R.inc(5274);writer.write('{');
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void endObject() {try{__CLR4_1_10427427luszvsxa.R.inc(5275);
        __CLR4_1_10427427luszvsxa.R.inc(5276);writer.write('}');
        __CLR4_1_10427427luszvsxa.R.inc(5277);endStructure();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void writeKey(String key) {try{__CLR4_1_10427427luszvsxa.R.inc(5278);
        __CLR4_1_10427427luszvsxa.R.inc(5279);writeObject(key);
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void writeValue(Object object) {try{__CLR4_1_10427427luszvsxa.R.inc(5280);
        __CLR4_1_10427427luszvsxa.R.inc(5281);writeObject(object);
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void writeObject(String object) {try{__CLR4_1_10427427luszvsxa.R.inc(5282);
        __CLR4_1_10427427luszvsxa.R.inc(5283);beforeWrite();

        __CLR4_1_10427427luszvsxa.R.inc(5284);serializer.write(object);

        __CLR4_1_10427427luszvsxa.R.inc(5285);afterWriter();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void writeObject(Object object) {try{__CLR4_1_10427427luszvsxa.R.inc(5286);
        __CLR4_1_10427427luszvsxa.R.inc(5287);beforeWrite();
        __CLR4_1_10427427luszvsxa.R.inc(5288);serializer.write(object);
        __CLR4_1_10427427luszvsxa.R.inc(5289);afterWriter();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void startArray() {try{__CLR4_1_10427427luszvsxa.R.inc(5290);
        __CLR4_1_10427427luszvsxa.R.inc(5291);if ((((context != null)&&(__CLR4_1_10427427luszvsxa.R.iget(5292)!=0|true))||(__CLR4_1_10427427luszvsxa.R.iget(5293)==0&false))) {{
            __CLR4_1_10427427luszvsxa.R.inc(5294);beginStructure();
        }

        }__CLR4_1_10427427luszvsxa.R.inc(5295);context = new JSONStreamContext(context, StartArray);
        __CLR4_1_10427427luszvsxa.R.inc(5296);writer.write('[');
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    private void beginStructure() {try{__CLR4_1_10427427luszvsxa.R.inc(5297);
        __CLR4_1_10427427luszvsxa.R.inc(5298);final int state = context.state;
        boolean __CLB4_1_10_bool0=false;__CLR4_1_10427427luszvsxa.R.inc(5299);switch (context.state) {
            case PropertyKey:if (!__CLB4_1_10_bool0) {__CLR4_1_10427427luszvsxa.R.inc(5300);__CLB4_1_10_bool0=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5301);writer.write(':');
                __CLR4_1_10427427luszvsxa.R.inc(5302);break;
            case ArrayValue:if (!__CLB4_1_10_bool0) {__CLR4_1_10427427luszvsxa.R.inc(5303);__CLB4_1_10_bool0=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5304);writer.write(',');
                __CLR4_1_10427427luszvsxa.R.inc(5305);break;
            case StartObject:if (!__CLB4_1_10_bool0) {__CLR4_1_10427427luszvsxa.R.inc(5306);__CLB4_1_10_bool0=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5307);break;
            case StartArray:if (!__CLB4_1_10_bool0) {__CLR4_1_10427427luszvsxa.R.inc(5308);__CLB4_1_10_bool0=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5309);break;
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_10427427luszvsxa.R.inc(5310);__CLB4_1_10_bool0=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5311);throw new JSONException("illegal state : " + state);
        }
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void endArray() {try{__CLR4_1_10427427luszvsxa.R.inc(5312);
        __CLR4_1_10427427luszvsxa.R.inc(5313);writer.write(']');
        __CLR4_1_10427427luszvsxa.R.inc(5314);endStructure();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    private void endStructure() {try{__CLR4_1_10427427luszvsxa.R.inc(5315);
        __CLR4_1_10427427luszvsxa.R.inc(5316);context = context.parent;

        __CLR4_1_10427427luszvsxa.R.inc(5317);if ((((context == null)&&(__CLR4_1_10427427luszvsxa.R.iget(5318)!=0|true))||(__CLR4_1_10427427luszvsxa.R.iget(5319)==0&false))) {{
            __CLR4_1_10427427luszvsxa.R.inc(5320);return;
        }
        
        }__CLR4_1_10427427luszvsxa.R.inc(5321);int newState = -1;
        boolean __CLB4_1_10_bool1=false;__CLR4_1_10427427luszvsxa.R.inc(5322);switch (context.state) {
            case PropertyKey:if (!__CLB4_1_10_bool1) {__CLR4_1_10427427luszvsxa.R.inc(5323);__CLB4_1_10_bool1=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5324);newState = PropertyValue;
                __CLR4_1_10427427luszvsxa.R.inc(5325);break;
            case StartArray:if (!__CLB4_1_10_bool1) {__CLR4_1_10427427luszvsxa.R.inc(5326);__CLB4_1_10_bool1=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5327);newState = ArrayValue;
                __CLR4_1_10427427luszvsxa.R.inc(5328);break;
            case ArrayValue:if (!__CLB4_1_10_bool1) {__CLR4_1_10427427luszvsxa.R.inc(5329);__CLB4_1_10_bool1=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5330);break;
            case StartObject:if (!__CLB4_1_10_bool1) {__CLR4_1_10427427luszvsxa.R.inc(5331);__CLB4_1_10_bool1=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5332);newState = PropertyKey;
                __CLR4_1_10427427luszvsxa.R.inc(5333);break;
            default:if (!__CLB4_1_10_bool1) {__CLR4_1_10427427luszvsxa.R.inc(5334);__CLB4_1_10_bool1=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5335);break;
        }
        __CLR4_1_10427427luszvsxa.R.inc(5336);if ((((newState != -1)&&(__CLR4_1_10427427luszvsxa.R.iget(5337)!=0|true))||(__CLR4_1_10427427luszvsxa.R.iget(5338)==0&false))) {{
            __CLR4_1_10427427luszvsxa.R.inc(5339);context.state = newState;
        }
    }}finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    private void beforeWrite() {try{__CLR4_1_10427427luszvsxa.R.inc(5340);
        __CLR4_1_10427427luszvsxa.R.inc(5341);if ((((context == null)&&(__CLR4_1_10427427luszvsxa.R.iget(5342)!=0|true))||(__CLR4_1_10427427luszvsxa.R.iget(5343)==0&false))) {{
            __CLR4_1_10427427luszvsxa.R.inc(5344);return;
        }
        
        }boolean __CLB4_1_10_bool2=false;__CLR4_1_10427427luszvsxa.R.inc(5345);switch (context.state) {
            case StartObject:if (!__CLB4_1_10_bool2) {__CLR4_1_10427427luszvsxa.R.inc(5346);__CLB4_1_10_bool2=true;}
            case StartArray:if (!__CLB4_1_10_bool2) {__CLR4_1_10427427luszvsxa.R.inc(5347);__CLB4_1_10_bool2=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5348);break;
            case PropertyKey:if (!__CLB4_1_10_bool2) {__CLR4_1_10427427luszvsxa.R.inc(5349);__CLB4_1_10_bool2=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5350);writer.write(':');
                __CLR4_1_10427427luszvsxa.R.inc(5351);break;
            case PropertyValue:if (!__CLB4_1_10_bool2) {__CLR4_1_10427427luszvsxa.R.inc(5352);__CLB4_1_10_bool2=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5353);writer.write(',');
                __CLR4_1_10427427luszvsxa.R.inc(5354);break;
            case ArrayValue:if (!__CLB4_1_10_bool2) {__CLR4_1_10427427luszvsxa.R.inc(5355);__CLB4_1_10_bool2=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5356);writer.write(',');
                __CLR4_1_10427427luszvsxa.R.inc(5357);break;
            default:if (!__CLB4_1_10_bool2) {__CLR4_1_10427427luszvsxa.R.inc(5358);__CLB4_1_10_bool2=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5359);break;
        }
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    private void afterWriter() {try{__CLR4_1_10427427luszvsxa.R.inc(5360);
        __CLR4_1_10427427luszvsxa.R.inc(5361);if ((((context == null)&&(__CLR4_1_10427427luszvsxa.R.iget(5362)!=0|true))||(__CLR4_1_10427427luszvsxa.R.iget(5363)==0&false))) {{
            __CLR4_1_10427427luszvsxa.R.inc(5364);return;
        }

        }__CLR4_1_10427427luszvsxa.R.inc(5365);final int state = context.state;
        __CLR4_1_10427427luszvsxa.R.inc(5366);int newState = -1;
        boolean __CLB4_1_10_bool3=false;__CLR4_1_10427427luszvsxa.R.inc(5367);switch (state) {
            case PropertyKey:if (!__CLB4_1_10_bool3) {__CLR4_1_10427427luszvsxa.R.inc(5368);__CLB4_1_10_bool3=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5369);newState = PropertyValue;
                __CLR4_1_10427427luszvsxa.R.inc(5370);break;
            case StartObject:if (!__CLB4_1_10_bool3) {__CLR4_1_10427427luszvsxa.R.inc(5371);__CLB4_1_10_bool3=true;}
            case PropertyValue:if (!__CLB4_1_10_bool3) {__CLR4_1_10427427luszvsxa.R.inc(5372);__CLB4_1_10_bool3=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5373);newState = PropertyKey;
                __CLR4_1_10427427luszvsxa.R.inc(5374);break;
            case StartArray:if (!__CLB4_1_10_bool3) {__CLR4_1_10427427luszvsxa.R.inc(5375);__CLB4_1_10_bool3=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5376);newState = ArrayValue;
                __CLR4_1_10427427luszvsxa.R.inc(5377);break;
            case ArrayValue:if (!__CLB4_1_10_bool3) {__CLR4_1_10427427luszvsxa.R.inc(5378);__CLB4_1_10_bool3=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5379);break;
            default:if (!__CLB4_1_10_bool3) {__CLR4_1_10427427luszvsxa.R.inc(5380);__CLB4_1_10_bool3=true;}
                __CLR4_1_10427427luszvsxa.R.inc(5381);break;
        }

        __CLR4_1_10427427luszvsxa.R.inc(5382);if ((((newState != -1)&&(__CLR4_1_10427427luszvsxa.R.iget(5383)!=0|true))||(__CLR4_1_10427427luszvsxa.R.iget(5384)==0&false))) {{
            __CLR4_1_10427427luszvsxa.R.inc(5385);context.state = newState;
        }
    }}finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void flush() throws IOException {try{__CLR4_1_10427427luszvsxa.R.inc(5386);
        __CLR4_1_10427427luszvsxa.R.inc(5387);writer.flush();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_1_10427427luszvsxa.R.inc(5388);
        __CLR4_1_10427427luszvsxa.R.inc(5389);writer.close();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    @Deprecated
    public void writeStartObject() {try{__CLR4_1_10427427luszvsxa.R.inc(5390);
        __CLR4_1_10427427luszvsxa.R.inc(5391);startObject();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    @Deprecated
    public void writeEndObject() {try{__CLR4_1_10427427luszvsxa.R.inc(5392);
        __CLR4_1_10427427luszvsxa.R.inc(5393);endObject();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    @Deprecated
    public void writeStartArray() {try{__CLR4_1_10427427luszvsxa.R.inc(5394);
        __CLR4_1_10427427luszvsxa.R.inc(5395);startArray();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}

    @Deprecated
    public void writeEndArray() {try{__CLR4_1_10427427luszvsxa.R.inc(5396);
        __CLR4_1_10427427luszvsxa.R.inc(5397);endArray();
    }finally{__CLR4_1_10427427luszvsxa.R.flushNeeded();}}
}
