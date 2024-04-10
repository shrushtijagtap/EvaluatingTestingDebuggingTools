/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark.decode;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.test.benchmark.BenchmarkCase;
import com.alibaba.json.test.codec.Codec;

import data.media.Image;
import data.media.Image.Size;
import data.media.Media;
import data.media.Media.Player;
import data.media.MediaContent;

public class EishayDecodeBytes extends BenchmarkCase {public static class __CLR4_1_10240p240pluszwi94{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,98568,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static EishayDecodeBytes instance = new EishayDecodeBytes();

    private final byte[]                  bytes;
    private final char[]                  chars;
    private final String                  text;

    private final MediaContent                  content;

    public byte[] getBytes() {try{__CLR4_1_10240p240pluszwi94.R.inc(98521);
        __CLR4_1_10240p240pluszwi94.R.inc(98522);return bytes;
    }finally{__CLR4_1_10240p240pluszwi94.R.flushNeeded();}}

    public char[] getChars() {try{__CLR4_1_10240p240pluszwi94.R.inc(98523);
        __CLR4_1_10240p240pluszwi94.R.inc(98524);return chars;
    }finally{__CLR4_1_10240p240pluszwi94.R.flushNeeded();}}

    public String getText() {try{__CLR4_1_10240p240pluszwi94.R.inc(98525);
        __CLR4_1_10240p240pluszwi94.R.inc(98526);return text;
    }finally{__CLR4_1_10240p240pluszwi94.R.flushNeeded();}}

    public MediaContent getContent() {try{__CLR4_1_10240p240pluszwi94.R.inc(98527);
        __CLR4_1_10240p240pluszwi94.R.inc(98528);return content;
    }finally{__CLR4_1_10240p240pluszwi94.R.flushNeeded();}}

    public EishayDecodeBytes(){
        super("EishayDecode-Byte[]");__CLR4_1_10240p240pluszwi94.R.inc(98530);try{__CLR4_1_10240p240pluszwi94.R.inc(98529);

        __CLR4_1_10240p240pluszwi94.R.inc(98531);content = new MediaContent();

        __CLR4_1_10240p240pluszwi94.R.inc(98532);Media media = new Media();
        __CLR4_1_10240p240pluszwi94.R.inc(98533);media.setUri("http://javaone.com/keynote.mpg");
        __CLR4_1_10240p240pluszwi94.R.inc(98534);media.setTitle("Javaone Keynote");
        __CLR4_1_10240p240pluszwi94.R.inc(98535);media.setWidth(640);
        __CLR4_1_10240p240pluszwi94.R.inc(98536);media.setHeight(480);
        __CLR4_1_10240p240pluszwi94.R.inc(98537);media.setFormat("video/mpg4");
        __CLR4_1_10240p240pluszwi94.R.inc(98538);media.setDuration(18000000);
        __CLR4_1_10240p240pluszwi94.R.inc(98539);media.setSize(58982400);
        __CLR4_1_10240p240pluszwi94.R.inc(98540);media.setBitrate(262144);
        __CLR4_1_10240p240pluszwi94.R.inc(98541);media.setPersons(Arrays.asList("Bill Gates", "Steve Jobs"));
        __CLR4_1_10240p240pluszwi94.R.inc(98542);media.setPlayer(Player.JAVA);
        __CLR4_1_10240p240pluszwi94.R.inc(98543);media.setCopyright(null);

        __CLR4_1_10240p240pluszwi94.R.inc(98544);content.setMedia(media);

        __CLR4_1_10240p240pluszwi94.R.inc(98545);List<Image> images = new ArrayList<Image>();
        {
            __CLR4_1_10240p240pluszwi94.R.inc(98546);Image image = new Image();
            __CLR4_1_10240p240pluszwi94.R.inc(98547);image.setUri("http://javaone.com/keynote_large.jpg");
            __CLR4_1_10240p240pluszwi94.R.inc(98548);image.setTitle("Javaone Keynote");
            __CLR4_1_10240p240pluszwi94.R.inc(98549);image.setWidth(1024);
            __CLR4_1_10240p240pluszwi94.R.inc(98550);image.setHeight(768);
            __CLR4_1_10240p240pluszwi94.R.inc(98551);image.setSize(Size.LARGE);
            __CLR4_1_10240p240pluszwi94.R.inc(98552);images.add(image);
        }
        {
            __CLR4_1_10240p240pluszwi94.R.inc(98553);Image image = new Image();
            __CLR4_1_10240p240pluszwi94.R.inc(98554);image.setUri("http://javaone.com/keynote_small.jpg");
            __CLR4_1_10240p240pluszwi94.R.inc(98555);image.setTitle("Javaone Keynote");
            __CLR4_1_10240p240pluszwi94.R.inc(98556);image.setWidth(320);
            __CLR4_1_10240p240pluszwi94.R.inc(98557);image.setHeight(240);
            __CLR4_1_10240p240pluszwi94.R.inc(98558);image.setSize(Size.SMALL);
            __CLR4_1_10240p240pluszwi94.R.inc(98559);images.add(image);
        }
        __CLR4_1_10240p240pluszwi94.R.inc(98560);content.setImages(images);

        __CLR4_1_10240p240pluszwi94.R.inc(98561);try {
            __CLR4_1_10240p240pluszwi94.R.inc(98562);text = JSON.toJSONString(content, SerializerFeature.WriteEnumUsingToString, SerializerFeature.SortField);
            __CLR4_1_10240p240pluszwi94.R.inc(98563);chars = (text + " ").toCharArray();
            __CLR4_1_10240p240pluszwi94.R.inc(98564);bytes = text.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            __CLR4_1_10240p240pluszwi94.R.inc(98565);throw new RuntimeException();
        }
    }finally{__CLR4_1_10240p240pluszwi94.R.flushNeeded();}}

    @Override
    public void execute(Codec codec) throws Exception {try{__CLR4_1_10240p240pluszwi94.R.inc(98566);
        __CLR4_1_10240p240pluszwi94.R.inc(98567);codec.decodeObject(bytes, MediaContent.class);
    }finally{__CLR4_1_10240p240pluszwi94.R.flushNeeded();}}

}
