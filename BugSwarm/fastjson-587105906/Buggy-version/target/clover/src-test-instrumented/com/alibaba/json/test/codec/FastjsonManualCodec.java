/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.codec;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import data.media.Image;
import data.media.Media;
import data.media.MediaContent;

public class FastjsonManualCodec implements Codec {public static class __CLR4_1_10243i243ilusqkuhg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,98709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ParserConfig    config = new ParserConfig();
    private SerializeConfig serializeConfig = new SerializeConfig();

    public FastjsonManualCodec(){try{__CLR4_1_10243i243ilusqkuhg.R.inc(98622);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98623);System.out.println("fastjson-" + JSON.VERSION);    
        
        __CLR4_1_10243i243ilusqkuhg.R.inc(98624);serializeConfig.put(MediaContent.class, new MediaContentSerializer());
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    public String getName() {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98625);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98626);return "fastjson-manual";
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    public <T> T decodeObject(String text, Class<T> clazz) {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98627);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98628);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98629);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98630);return parser.parseObject(clazz);
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    public <T> Collection<T> decodeArray(String text, Class<T> clazz) throws Exception {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98631);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98632);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98633);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98634);return parser.parseArray(clazz);
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    public final Object decodeObject(String text) {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98635);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98636);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98637);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98638);return parser.parse();
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    public final Object decode(String text) {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98639);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98640);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98641);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98642);return parser.parse();
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    // private JavaBeanSerializer serializer = new JavaBeanSerializer(Long_100_Entity.class);

    public String encode(Object object) throws Exception {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98643);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98644);SerializeWriter out = new SerializeWriter();
        __CLR4_1_10243i243ilusqkuhg.R.inc(98645);out.config(SerializerFeature.DisableCircularReferenceDetect, true);

        __CLR4_1_10243i243ilusqkuhg.R.inc(98646);JSONSerializer serializer = new JSONSerializer(out, serializeConfig);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98647);serializer.write(object);

        __CLR4_1_10243i243ilusqkuhg.R.inc(98648);String text = out.toString();

        __CLR4_1_10243i243ilusqkuhg.R.inc(98649);out.close();

        __CLR4_1_10243i243ilusqkuhg.R.inc(98650);return text;
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T decodeObject(byte[] input, Class<T> clazz) throws Exception {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98651);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98652);return (T) JSON.parseObject(input, clazz, Feature.DisableCircularReferenceDetect);
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    public static class ImageSerializer implements ObjectSerializer {

        @Override
        public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                          int features) throws IOException {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98653);
            __CLR4_1_10243i243ilusqkuhg.R.inc(98654);Image image = (Image) object;
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98655);SerializeWriter out = serializer.out;
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98656);out.writeFieldValue('{', "height", image.getHeight());
            __CLR4_1_10243i243ilusqkuhg.R.inc(98657);out.writeFieldValueStringWithDoubleQuote(',', "size", image.getSize().name());
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98658);String tile = image.getTitle();
            __CLR4_1_10243i243ilusqkuhg.R.inc(98659);out.writeFieldValueStringWithDoubleQuoteCheck(',', "title", tile);
            __CLR4_1_10243i243ilusqkuhg.R.inc(98660);out.writeFieldValueStringWithDoubleQuoteCheck(',', "uri", image.getUri());
            __CLR4_1_10243i243ilusqkuhg.R.inc(98661);out.writeFieldValue(',', "width", image.getWidth());

            __CLR4_1_10243i243ilusqkuhg.R.inc(98662);out.write('}');
            // TODO
        }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}
        
    }

    public static class MediaSerializer implements ObjectSerializer {

        @Override
        public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                          int features) throws IOException {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98663);
            __CLR4_1_10243i243ilusqkuhg.R.inc(98664);Media image = (Media) object;
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98665);SerializeWriter out = serializer.out;
            __CLR4_1_10243i243ilusqkuhg.R.inc(98666);out.writeFieldValue('{', "bitrate", image.getBitrate());
            __CLR4_1_10243i243ilusqkuhg.R.inc(98667);out.writeFieldValue(',', "duration", image.getDuration());
            __CLR4_1_10243i243ilusqkuhg.R.inc(98668);out.writeFieldValue(',', "height", image.getHeight());
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98669);String format = image.getFormat();
            __CLR4_1_10243i243ilusqkuhg.R.inc(98670);out.writeFieldValueStringWithDoubleQuoteCheck(',', "format", format);
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98671);out.writeFieldValue(',', "size", image.getSize());
            __CLR4_1_10243i243ilusqkuhg.R.inc(98672);out.writeFieldValue(',', "height", image.getHeight());
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98673);List<String> persons = image.getPersons();
            __CLR4_1_10243i243ilusqkuhg.R.inc(98674);out.writeFieldName("persons");
            __CLR4_1_10243i243ilusqkuhg.R.inc(98675);out.write(persons);
            __CLR4_1_10243i243ilusqkuhg.R.inc(98676);out.writeFieldValueStringWithDoubleQuote(',', "player", image.getPlayer().name());
            __CLR4_1_10243i243ilusqkuhg.R.inc(98677);out.writeFieldValue(',', "size", image.getSize());
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98678);String title = image.getTitle();
            __CLR4_1_10243i243ilusqkuhg.R.inc(98679);out.writeFieldValue(',', "title", title);
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98680);String uri = image.getUri();
            __CLR4_1_10243i243ilusqkuhg.R.inc(98681);out.writeFieldValueStringWithDoubleQuoteCheck(',', "uri", uri);
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98682);out.writeFieldValue(',', "width", image.getWidth());
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98683);out.write('}');
        }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}
        
    }
    
    public static class MediaContentSerializer implements ObjectSerializer {
        MediaSerializer mediaSer = new MediaSerializer();
        ImageSerializer imageSer = new ImageSerializer();

        @Override
        public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                          int features) throws IOException {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98684);
            __CLR4_1_10243i243ilusqkuhg.R.inc(98685);MediaContent mediaContent = (MediaContent) object;
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98686);SerializeWriter out = serializer.out;
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98687);out.write('{');
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98688);out.writeFieldName("image", false);
            __CLR4_1_10243i243ilusqkuhg.R.inc(98689);List<Image> images = mediaContent.images;
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98690);out.write('[');
            __CLR4_1_10243i243ilusqkuhg.R.inc(98691);for (int i = 0, size = images.size(); (((i < size)&&(__CLR4_1_10243i243ilusqkuhg.R.iget(98692)!=0|true))||(__CLR4_1_10243i243ilusqkuhg.R.iget(98693)==0&false)); ++i) {{
                __CLR4_1_10243i243ilusqkuhg.R.inc(98694);if ((((i != 0)&&(__CLR4_1_10243i243ilusqkuhg.R.iget(98695)!=0|true))||(__CLR4_1_10243i243ilusqkuhg.R.iget(98696)==0&false))) {{
                    __CLR4_1_10243i243ilusqkuhg.R.inc(98697);out.write(',');
                }
                }__CLR4_1_10243i243ilusqkuhg.R.inc(98698);Image image = images.get(i);
                __CLR4_1_10243i243ilusqkuhg.R.inc(98699);imageSer.write(serializer, image, Integer.valueOf(i), Image.class, features);
            }
            }__CLR4_1_10243i243ilusqkuhg.R.inc(98700);out.write(']');
            __CLR4_1_10243i243ilusqkuhg.R.inc(98701);out.write(',');
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98702);out.writeFieldName("media", false);
            __CLR4_1_10243i243ilusqkuhg.R.inc(98703);mediaSer.write(serializer, mediaContent.media, "media", Media.class, features);
            
            __CLR4_1_10243i243ilusqkuhg.R.inc(98704);out.write('}');
        }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}
        
    }

    @Override
    public byte[] encodeToBytes(Object object) throws Exception {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98705);
        // TODO Auto-generated method stub
        __CLR4_1_10243i243ilusqkuhg.R.inc(98706);return null;
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}

    @Override
    public void encode(OutputStream out, Object object) throws Exception {try{__CLR4_1_10243i243ilusqkuhg.R.inc(98707);
        __CLR4_1_10243i243ilusqkuhg.R.inc(98708);out.write(encodeToBytes(object));        
    }finally{__CLR4_1_10243i243ilusqkuhg.R.flushNeeded();}}
}
