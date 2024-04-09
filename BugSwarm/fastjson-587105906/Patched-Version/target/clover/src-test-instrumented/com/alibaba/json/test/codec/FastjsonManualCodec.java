/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.codec;

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

public class FastjsonManualCodec implements Codec {public static class __CLR4_5_2251f251flusvnkwr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,99930,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ParserConfig    config = new ParserConfig();
    private SerializeConfig serializeConfig = new SerializeConfig();

    public FastjsonManualCodec(){try{__CLR4_5_2251f251flusvnkwr.R.inc(99843);
        __CLR4_5_2251f251flusvnkwr.R.inc(99844);System.out.println("fastjson-" + JSON.VERSION);    
        
        __CLR4_5_2251f251flusvnkwr.R.inc(99845);serializeConfig.put(MediaContent.class, new MediaContentSerializer());
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2251f251flusvnkwr.R.inc(99846);
        __CLR4_5_2251f251flusvnkwr.R.inc(99847);return "fastjson-manual";
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    public <T> T decodeObject(String text, Class<T> clazz) {try{__CLR4_5_2251f251flusvnkwr.R.inc(99848);
        __CLR4_5_2251f251flusvnkwr.R.inc(99849);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2251f251flusvnkwr.R.inc(99850);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2251f251flusvnkwr.R.inc(99851);return parser.parseObject(clazz);
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    public <T> Collection<T> decodeArray(String text, Class<T> clazz) throws Exception {try{__CLR4_5_2251f251flusvnkwr.R.inc(99852);
        __CLR4_5_2251f251flusvnkwr.R.inc(99853);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2251f251flusvnkwr.R.inc(99854);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2251f251flusvnkwr.R.inc(99855);return parser.parseArray(clazz);
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    public final Object decodeObject(String text) {try{__CLR4_5_2251f251flusvnkwr.R.inc(99856);
        __CLR4_5_2251f251flusvnkwr.R.inc(99857);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2251f251flusvnkwr.R.inc(99858);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2251f251flusvnkwr.R.inc(99859);return parser.parse();
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    public final Object decode(String text) {try{__CLR4_5_2251f251flusvnkwr.R.inc(99860);
        __CLR4_5_2251f251flusvnkwr.R.inc(99861);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2251f251flusvnkwr.R.inc(99862);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2251f251flusvnkwr.R.inc(99863);return parser.parse();
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    // private JavaBeanSerializer serializer = new JavaBeanSerializer(Long_100_Entity.class);

    public String encode(Object object) throws Exception {try{__CLR4_5_2251f251flusvnkwr.R.inc(99864);
        __CLR4_5_2251f251flusvnkwr.R.inc(99865);SerializeWriter out = new SerializeWriter();
        __CLR4_5_2251f251flusvnkwr.R.inc(99866);out.config(SerializerFeature.DisableCircularReferenceDetect, true);

        __CLR4_5_2251f251flusvnkwr.R.inc(99867);JSONSerializer serializer = new JSONSerializer(out, serializeConfig);
        __CLR4_5_2251f251flusvnkwr.R.inc(99868);serializer.write(object);

        __CLR4_5_2251f251flusvnkwr.R.inc(99869);String text = out.toString();

        __CLR4_5_2251f251flusvnkwr.R.inc(99870);out.close();

        __CLR4_5_2251f251flusvnkwr.R.inc(99871);return text;
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T decodeObject(byte[] input, Class<T> clazz) throws Exception {try{__CLR4_5_2251f251flusvnkwr.R.inc(99872);
        __CLR4_5_2251f251flusvnkwr.R.inc(99873);return (T) JSON.parseObject(input, clazz, Feature.DisableCircularReferenceDetect);
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    public static class ImageSerializer implements ObjectSerializer {

        @Override
        public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                          int features) throws IOException {try{__CLR4_5_2251f251flusvnkwr.R.inc(99874);
            __CLR4_5_2251f251flusvnkwr.R.inc(99875);Image image = (Image) object;
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99876);SerializeWriter out = serializer.out;
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99877);out.writeFieldValue('{', "height", image.getHeight());
            __CLR4_5_2251f251flusvnkwr.R.inc(99878);out.writeFieldValueStringWithDoubleQuote(',', "size", image.getSize().name());
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99879);String tile = image.getTitle();
            __CLR4_5_2251f251flusvnkwr.R.inc(99880);out.writeFieldValueStringWithDoubleQuoteCheck(',', "title", tile);
            __CLR4_5_2251f251flusvnkwr.R.inc(99881);out.writeFieldValueStringWithDoubleQuoteCheck(',', "uri", image.getUri());
            __CLR4_5_2251f251flusvnkwr.R.inc(99882);out.writeFieldValue(',', "width", image.getWidth());

            __CLR4_5_2251f251flusvnkwr.R.inc(99883);out.write('}');
            // TODO
        }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}
        
    }

    public static class MediaSerializer implements ObjectSerializer {

        @Override
        public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                          int features) throws IOException {try{__CLR4_5_2251f251flusvnkwr.R.inc(99884);
            __CLR4_5_2251f251flusvnkwr.R.inc(99885);Media image = (Media) object;
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99886);SerializeWriter out = serializer.out;
            __CLR4_5_2251f251flusvnkwr.R.inc(99887);out.writeFieldValue('{', "bitrate", image.getBitrate());
            __CLR4_5_2251f251flusvnkwr.R.inc(99888);out.writeFieldValue(',', "duration", image.getDuration());
            __CLR4_5_2251f251flusvnkwr.R.inc(99889);out.writeFieldValue(',', "height", image.getHeight());
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99890);String format = image.getFormat();
            __CLR4_5_2251f251flusvnkwr.R.inc(99891);out.writeFieldValueStringWithDoubleQuoteCheck(',', "format", format);
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99892);out.writeFieldValue(',', "size", image.getSize());
            __CLR4_5_2251f251flusvnkwr.R.inc(99893);out.writeFieldValue(',', "height", image.getHeight());
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99894);List<String> persons = image.getPersons();
            __CLR4_5_2251f251flusvnkwr.R.inc(99895);out.writeFieldName("persons");
            __CLR4_5_2251f251flusvnkwr.R.inc(99896);out.write(persons);
            __CLR4_5_2251f251flusvnkwr.R.inc(99897);out.writeFieldValueStringWithDoubleQuote(',', "player", image.getPlayer().name());
            __CLR4_5_2251f251flusvnkwr.R.inc(99898);out.writeFieldValue(',', "size", image.getSize());
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99899);String title = image.getTitle();
            __CLR4_5_2251f251flusvnkwr.R.inc(99900);out.writeFieldValue(',', "title", title);
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99901);String uri = image.getUri();
            __CLR4_5_2251f251flusvnkwr.R.inc(99902);out.writeFieldValueStringWithDoubleQuoteCheck(',', "uri", uri);
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99903);out.writeFieldValue(',', "width", image.getWidth());
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99904);out.write('}');
        }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}
        
    }
    
    public static class MediaContentSerializer implements ObjectSerializer {
        MediaSerializer mediaSer = new MediaSerializer();
        ImageSerializer imageSer = new ImageSerializer();

        @Override
        public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                          int features) throws IOException {try{__CLR4_5_2251f251flusvnkwr.R.inc(99905);
            __CLR4_5_2251f251flusvnkwr.R.inc(99906);MediaContent mediaContent = (MediaContent) object;
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99907);SerializeWriter out = serializer.out;
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99908);out.write('{');
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99909);out.writeFieldName("image", false);
            __CLR4_5_2251f251flusvnkwr.R.inc(99910);List<Image> images = mediaContent.images;
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99911);out.write('[');
            __CLR4_5_2251f251flusvnkwr.R.inc(99912);for (int i = 0, size = images.size(); (((i < size)&&(__CLR4_5_2251f251flusvnkwr.R.iget(99913)!=0|true))||(__CLR4_5_2251f251flusvnkwr.R.iget(99914)==0&false)); ++i) {{
                __CLR4_5_2251f251flusvnkwr.R.inc(99915);if ((((i != 0)&&(__CLR4_5_2251f251flusvnkwr.R.iget(99916)!=0|true))||(__CLR4_5_2251f251flusvnkwr.R.iget(99917)==0&false))) {{
                    __CLR4_5_2251f251flusvnkwr.R.inc(99918);out.write(',');
                }
                }__CLR4_5_2251f251flusvnkwr.R.inc(99919);Image image = images.get(i);
                __CLR4_5_2251f251flusvnkwr.R.inc(99920);imageSer.write(serializer, image, Integer.valueOf(i), Image.class, features);
            }
            }__CLR4_5_2251f251flusvnkwr.R.inc(99921);out.write(']');
            __CLR4_5_2251f251flusvnkwr.R.inc(99922);out.write(',');
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99923);out.writeFieldName("media", false);
            __CLR4_5_2251f251flusvnkwr.R.inc(99924);mediaSer.write(serializer, mediaContent.media, "media", Media.class, features);
            
            __CLR4_5_2251f251flusvnkwr.R.inc(99925);out.write('}');
        }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}
        
    }

    @Override
    public byte[] encodeToBytes(Object object) throws Exception {try{__CLR4_5_2251f251flusvnkwr.R.inc(99926);
        // TODO Auto-generated method stub
        __CLR4_5_2251f251flusvnkwr.R.inc(99927);return null;
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}

    @Override
    public void encode(OutputStream out, Object object) throws Exception {try{__CLR4_5_2251f251flusvnkwr.R.inc(99928);
        __CLR4_5_2251f251flusvnkwr.R.inc(99929);out.write(encodeToBytes(object));        
    }finally{__CLR4_5_2251f251flusvnkwr.R.flushNeeded();}}
}
