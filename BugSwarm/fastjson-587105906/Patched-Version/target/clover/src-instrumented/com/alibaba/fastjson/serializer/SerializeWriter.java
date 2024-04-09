/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2018 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.RyuDouble;
import com.alibaba.fastjson.util.RyuFloat;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;

import static com.alibaba.fastjson.util.IOUtils.replaceChars;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public final class SerializeWriter extends Writer {public static class __CLR4_5_2molmollusvmvql{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,31518,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static ThreadLocal<char[]> bufLocal         = new ThreadLocal<char[]>();
    private final static ThreadLocal<byte[]> bytesBufLocal    = new ThreadLocal<byte[]>();
    private static       int                 BUFFER_THRESHOLD = 1024 * 128;

    static {try{__CLR4_5_2molmollusvmvql.R.inc(29397);
        __CLR4_5_2molmollusvmvql.R.inc(29398);try {
            __CLR4_5_2molmollusvmvql.R.inc(29399);String prop = IOUtils.getStringProperty("fastjson.serializer_buffer_threshold");
            __CLR4_5_2molmollusvmvql.R.inc(29400);if ((((prop != null && prop.length() > 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29401)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29402)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29403);int serializer_buffer_threshold = Integer.parseInt(prop);
                __CLR4_5_2molmollusvmvql.R.inc(29404);if ((((serializer_buffer_threshold >= 64 && serializer_buffer_threshold <= 1024 * 64)&&(__CLR4_5_2molmollusvmvql.R.iget(29405)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29406)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(29407);BUFFER_THRESHOLD = serializer_buffer_threshold * 1024;
                }
            }}
        }} catch (Throwable error) {
            // skip
        }
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    protected char                           buf[];

    /**
     * The number of chars in the buffer.
     */
    protected int                            count;

    protected int                            features;

    private final Writer                     writer;

    protected boolean                        useSingleQuotes;
    protected boolean                        quoteFieldNames;
    protected boolean                        sortField;
    protected boolean                        disableCircularReferenceDetect;
    protected boolean                        beanToArray;
    protected boolean                        writeNonStringValueAsString;
    protected boolean                        notWriteDefaultValue;
    protected boolean                        writeEnumUsingName;
    protected boolean                        writeEnumUsingToString;
    protected boolean                        writeDirect;

    protected char                           keySeperator;

    protected int                            maxBufSize = -1;

    protected boolean                        browserSecure;
    protected long                           sepcialBits;

    public SerializeWriter(){
        this((Writer) null);__CLR4_5_2molmollusvmvql.R.inc(29409);try{__CLR4_5_2molmollusvmvql.R.inc(29408);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public SerializeWriter(Writer writer){
        this(writer, JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.EMPTY);__CLR4_5_2molmollusvmvql.R.inc(29411);try{__CLR4_5_2molmollusvmvql.R.inc(29410);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public SerializeWriter(SerializerFeature... features){
        this(null, features);__CLR4_5_2molmollusvmvql.R.inc(29413);try{__CLR4_5_2molmollusvmvql.R.inc(29412);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public SerializeWriter(Writer writer, SerializerFeature... features){
        this(writer, 0, features);__CLR4_5_2molmollusvmvql.R.inc(29415);try{__CLR4_5_2molmollusvmvql.R.inc(29414);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    /**
     * @since 1.2.9
     * @param writer
     * @param defaultFeatures
     * @param features
     */
    public SerializeWriter(Writer writer, int defaultFeatures, SerializerFeature... features){try{__CLR4_5_2molmollusvmvql.R.inc(29416);
        __CLR4_5_2molmollusvmvql.R.inc(29417);this.writer = writer;

        __CLR4_5_2molmollusvmvql.R.inc(29418);buf = bufLocal.get();

        __CLR4_5_2molmollusvmvql.R.inc(29419);if ((((buf != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29420)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29421)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29422);bufLocal.set(null);
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(29423);buf = new char[2048];
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29424);int featuresValue = defaultFeatures;
        __CLR4_5_2molmollusvmvql.R.inc(29425);for (SerializerFeature feature : features) {{
            __CLR4_5_2molmollusvmvql.R.inc(29426);featuresValue |= feature.getMask();
        }
        }__CLR4_5_2molmollusvmvql.R.inc(29427);this.features = featuresValue;

        __CLR4_5_2molmollusvmvql.R.inc(29428);computeFeatures();
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public int getMaxBufSize() {try{__CLR4_5_2molmollusvmvql.R.inc(29429);
        __CLR4_5_2molmollusvmvql.R.inc(29430);return maxBufSize;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void setMaxBufSize(int maxBufSize) {try{__CLR4_5_2molmollusvmvql.R.inc(29431);
        __CLR4_5_2molmollusvmvql.R.inc(29432);if ((((maxBufSize < this.buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29433)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29434)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29435);throw new JSONException("must > " + buf.length);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29436);this.maxBufSize = maxBufSize;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public int getBufferLength() {try{__CLR4_5_2molmollusvmvql.R.inc(29437);
        __CLR4_5_2molmollusvmvql.R.inc(29438);return this.buf.length;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public SerializeWriter(int initialSize){
        this(null, initialSize);__CLR4_5_2molmollusvmvql.R.inc(29440);try{__CLR4_5_2molmollusvmvql.R.inc(29439);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public SerializeWriter(Writer writer, int initialSize){try{__CLR4_5_2molmollusvmvql.R.inc(29441);
        __CLR4_5_2molmollusvmvql.R.inc(29442);this.writer = writer;

        __CLR4_5_2molmollusvmvql.R.inc(29443);if ((((initialSize <= 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29444)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29445)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29446);throw new IllegalArgumentException("Negative initial size: " + initialSize);
        }
        }__CLR4_5_2molmollusvmvql.R.inc(29447);buf = new char[initialSize];

        __CLR4_5_2molmollusvmvql.R.inc(29448);computeFeatures();
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void config(SerializerFeature feature, boolean state) {try{__CLR4_5_2molmollusvmvql.R.inc(29449);
        __CLR4_5_2molmollusvmvql.R.inc(29450);if ((((state)&&(__CLR4_5_2molmollusvmvql.R.iget(29451)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29452)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29453);features |= feature.getMask();
            // \u7531\u4e8e\u679a\u4e3e\u5e8f\u5217\u5316\u7279\u6027WriteEnumUsingToString\u548cWriteEnumUsingName\u4e0d\u80fd\u5171\u5b58\uff0c\u9700\u8981\u68c0\u67e5
            __CLR4_5_2molmollusvmvql.R.inc(29454);if ((((feature == SerializerFeature.WriteEnumUsingToString)&&(__CLR4_5_2molmollusvmvql.R.iget(29455)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29456)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29457);features &= ~SerializerFeature.WriteEnumUsingName.getMask();
            } }else {__CLR4_5_2molmollusvmvql.R.inc(29458);if ((((feature == SerializerFeature.WriteEnumUsingName)&&(__CLR4_5_2molmollusvmvql.R.iget(29459)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29460)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29461);features &= ~SerializerFeature.WriteEnumUsingToString.getMask();
            }
        }}} }else {{
            __CLR4_5_2molmollusvmvql.R.inc(29462);features &= ~feature.getMask();
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29463);computeFeatures();
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    final static int nonDirectFeatures = 0 //
            | SerializerFeature.UseSingleQuotes.mask //
            | SerializerFeature.BrowserCompatible.mask //
            | SerializerFeature.PrettyFormat.mask //
            | SerializerFeature.WriteEnumUsingToString.mask
            | SerializerFeature.WriteNonStringValueAsString.mask
            | SerializerFeature.WriteSlashAsSpecial.mask
            | SerializerFeature.IgnoreErrorGetter.mask
            | SerializerFeature.WriteClassName.mask
            | SerializerFeature.NotWriteDefaultValue.mask
            ;
    protected void computeFeatures() {try{__CLR4_5_2molmollusvmvql.R.inc(29464);
        __CLR4_5_2molmollusvmvql.R.inc(29465);quoteFieldNames = (this.features & SerializerFeature.QuoteFieldNames.mask) != 0;
        __CLR4_5_2molmollusvmvql.R.inc(29466);useSingleQuotes = (this.features & SerializerFeature.UseSingleQuotes.mask) != 0;
        __CLR4_5_2molmollusvmvql.R.inc(29467);sortField = (this.features & SerializerFeature.SortField.mask) != 0;
        __CLR4_5_2molmollusvmvql.R.inc(29468);disableCircularReferenceDetect = (this.features & SerializerFeature.DisableCircularReferenceDetect.mask) != 0;
        __CLR4_5_2molmollusvmvql.R.inc(29469);beanToArray = (this.features & SerializerFeature.BeanToArray.mask) != 0;
        __CLR4_5_2molmollusvmvql.R.inc(29470);writeNonStringValueAsString = (this.features & SerializerFeature.WriteNonStringValueAsString.mask) != 0;
        __CLR4_5_2molmollusvmvql.R.inc(29471);notWriteDefaultValue = (this.features & SerializerFeature.NotWriteDefaultValue.mask) != 0;
        __CLR4_5_2molmollusvmvql.R.inc(29472);writeEnumUsingName = (this.features & SerializerFeature.WriteEnumUsingName.mask) != 0;
        __CLR4_5_2molmollusvmvql.R.inc(29473);writeEnumUsingToString = (this.features & SerializerFeature.WriteEnumUsingToString.mask) != 0;

        __CLR4_5_2molmollusvmvql.R.inc(29474);writeDirect = quoteFieldNames //
                      && (this.features & nonDirectFeatures) == 0 //
                      && (beanToArray || writeEnumUsingName)
                      ;

        __CLR4_5_2molmollusvmvql.R.inc(29475);keySeperator = (((useSingleQuotes )&&(__CLR4_5_2molmollusvmvql.R.iget(29476)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29477)==0&false))? '\'' : '"';

        __CLR4_5_2molmollusvmvql.R.inc(29478);browserSecure = (this.features & SerializerFeature.BrowserSecure.mask) != 0;

        __CLR4_5_2molmollusvmvql.R.inc(29479);final long S0 = 0x4FFFFFFFFL, S1 = 0x8004FFFFFFFFL, S2 = 0x50000304ffffffffL;
//        long s = 0;
//        for (int i = 0; i <= 31; ++i) {
//            s |= (1L << i);
//        }
//        s |= (1L << '"');
//
//        //S0 = s;
//        //S1 = s | (1L << '/');
//
//        s |= (1L << '('); // 41
//        s |= (1L << ')'); // 42
//        s |= (1L << '<'); // 60
//        s |= (1L << '>'); // 62
//        S2 = s;
        __CLR4_5_2molmollusvmvql.R.inc(29480);sepcialBits = (((browserSecure
                )&&(__CLR4_5_2molmollusvmvql.R.iget(29481)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29482)==0&false))? S2
                : ((((features & SerializerFeature.WriteSlashAsSpecial.mask) != 0 )&&(__CLR4_5_2molmollusvmvql.R.iget(29483)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29484)==0&false))? S1 : S0;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public boolean isSortField() {try{__CLR4_5_2molmollusvmvql.R.inc(29485);
        __CLR4_5_2molmollusvmvql.R.inc(29486);return sortField;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public boolean isNotWriteDefaultValue() {try{__CLR4_5_2molmollusvmvql.R.inc(29487);
        __CLR4_5_2molmollusvmvql.R.inc(29488);return notWriteDefaultValue;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public boolean isEnabled(SerializerFeature feature) {try{__CLR4_5_2molmollusvmvql.R.inc(29489);
        __CLR4_5_2molmollusvmvql.R.inc(29490);return (this.features & feature.mask) != 0;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    public boolean isEnabled(int feature) {try{__CLR4_5_2molmollusvmvql.R.inc(29491);
        __CLR4_5_2molmollusvmvql.R.inc(29492);return (this.features & feature) != 0;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    /**
     * Writes a character to the buffer.
     */
    public void write(int c) {try{__CLR4_5_2molmollusvmvql.R.inc(29493);
        __CLR4_5_2molmollusvmvql.R.inc(29494);int newcount = count + 1;
        __CLR4_5_2molmollusvmvql.R.inc(29495);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29496)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29497)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29498);if ((((writer == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29499)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29500)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29501);expandCapacity(newcount);
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(29502);flush();
                __CLR4_5_2molmollusvmvql.R.inc(29503);newcount = 1;
            }
        }}
        }__CLR4_5_2molmollusvmvql.R.inc(29504);buf[count] = (char) c;
        __CLR4_5_2molmollusvmvql.R.inc(29505);count = newcount;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    /**
     * Writes characters to the buffer.
     * 
     * @param c the data to be written
     * @param off the start offset in the data
     * @param len the number of chars that are written
     */
    public void write(char c[], int off, int len) {try{__CLR4_5_2molmollusvmvql.R.inc(29506);
        __CLR4_5_2molmollusvmvql.R.inc(29507);if ((((off < 0 //
            || off > c.length //
            || len < 0 //
            || off + len > c.length //
            || off + len < 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29508)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29509)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29510);throw new IndexOutOfBoundsException();
        } }else {__CLR4_5_2molmollusvmvql.R.inc(29511);if ((((len == 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29512)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29513)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29514);return;
        }

        }}__CLR4_5_2molmollusvmvql.R.inc(29515);int newcount = count + len;
        __CLR4_5_2molmollusvmvql.R.inc(29516);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29517)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29518)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29519);if ((((writer == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29520)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29521)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29522);expandCapacity(newcount);
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(29523);do {{
                    __CLR4_5_2molmollusvmvql.R.inc(29524);int rest = buf.length - count;
                    __CLR4_5_2molmollusvmvql.R.inc(29525);System.arraycopy(c, off, buf, count, rest);
                    __CLR4_5_2molmollusvmvql.R.inc(29526);count = buf.length;
                    __CLR4_5_2molmollusvmvql.R.inc(29527);flush();
                    __CLR4_5_2molmollusvmvql.R.inc(29528);len -= rest;
                    __CLR4_5_2molmollusvmvql.R.inc(29529);off += rest;
                } }while ((((len > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29530)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29531)==0&false)));
                __CLR4_5_2molmollusvmvql.R.inc(29532);newcount = len;
            }
        }}
        }__CLR4_5_2molmollusvmvql.R.inc(29533);System.arraycopy(c, off, buf, count, len);
        __CLR4_5_2molmollusvmvql.R.inc(29534);count = newcount;

    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void expandCapacity(int minimumCapacity) {try{__CLR4_5_2molmollusvmvql.R.inc(29535);
        __CLR4_5_2molmollusvmvql.R.inc(29536);if ((((maxBufSize != -1 && minimumCapacity >= maxBufSize)&&(__CLR4_5_2molmollusvmvql.R.iget(29537)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29538)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29539);throw new JSONException("serialize exceeded MAX_OUTPUT_LENGTH=" + maxBufSize + ", minimumCapacity=" + minimumCapacity);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29540);int newCapacity = buf.length + (buf.length >> 1) + 1;

        __CLR4_5_2molmollusvmvql.R.inc(29541);if ((((newCapacity < minimumCapacity)&&(__CLR4_5_2molmollusvmvql.R.iget(29542)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29543)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29544);newCapacity = minimumCapacity;
        }
        }__CLR4_5_2molmollusvmvql.R.inc(29545);char newValue[] = new char[newCapacity];
        __CLR4_5_2molmollusvmvql.R.inc(29546);System.arraycopy(buf, 0, newValue, 0, count);

        __CLR4_5_2molmollusvmvql.R.inc(29547);if ((((buf.length < BUFFER_THRESHOLD)&&(__CLR4_5_2molmollusvmvql.R.iget(29548)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29549)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29550);char[] charsLocal = bufLocal.get();
            __CLR4_5_2molmollusvmvql.R.inc(29551);if ((((charsLocal == null || charsLocal.length < buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29552)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29553)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29554);bufLocal.set(buf);
            }
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(29555);buf = newValue;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    public SerializeWriter append(CharSequence csq) {try{__CLR4_5_2molmollusvmvql.R.inc(29556);
        __CLR4_5_2molmollusvmvql.R.inc(29557);String s = ((((csq == null )&&(__CLR4_5_2molmollusvmvql.R.iget(29558)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29559)==0&false))? "null" : csq.toString());
        __CLR4_5_2molmollusvmvql.R.inc(29560);write(s, 0, s.length());
        __CLR4_5_2molmollusvmvql.R.inc(29561);return this;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public SerializeWriter append(CharSequence csq, int start, int end) {try{__CLR4_5_2molmollusvmvql.R.inc(29562);
        __CLR4_5_2molmollusvmvql.R.inc(29563);String s = ((((csq == null )&&(__CLR4_5_2molmollusvmvql.R.iget(29564)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29565)==0&false))? "null" : csq).subSequence(start, end).toString();
        __CLR4_5_2molmollusvmvql.R.inc(29566);write(s, 0, s.length());
        __CLR4_5_2molmollusvmvql.R.inc(29567);return this;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public SerializeWriter append(char c) {try{__CLR4_5_2molmollusvmvql.R.inc(29568);
        __CLR4_5_2molmollusvmvql.R.inc(29569);write(c);
        __CLR4_5_2molmollusvmvql.R.inc(29570);return this;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    /**
     * Write a portion of a string to the buffer.
     * 
     * @param str String to be written from
     * @param off Offset from which to start reading characters
     * @param len Number of characters to be written
     */
    public void write(String str, int off, int len) {try{__CLR4_5_2molmollusvmvql.R.inc(29571);
        __CLR4_5_2molmollusvmvql.R.inc(29572);int newcount = count + len;
        __CLR4_5_2molmollusvmvql.R.inc(29573);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29574)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29575)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29576);if ((((writer == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29577)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29578)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29579);expandCapacity(newcount);
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(29580);do {{
                    __CLR4_5_2molmollusvmvql.R.inc(29581);int rest = buf.length - count;
                    __CLR4_5_2molmollusvmvql.R.inc(29582);str.getChars(off, off + rest, buf, count);
                    __CLR4_5_2molmollusvmvql.R.inc(29583);count = buf.length;
                    __CLR4_5_2molmollusvmvql.R.inc(29584);flush();
                    __CLR4_5_2molmollusvmvql.R.inc(29585);len -= rest;
                    __CLR4_5_2molmollusvmvql.R.inc(29586);off += rest;
                } }while ((((len > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29587)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29588)==0&false)));
                __CLR4_5_2molmollusvmvql.R.inc(29589);newcount = len;
            }
        }}
        }__CLR4_5_2molmollusvmvql.R.inc(29590);str.getChars(off, off + len, buf, count);
        __CLR4_5_2molmollusvmvql.R.inc(29591);count = newcount;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    /**
     * Writes the contents of the buffer to another character stream.
     * 
     * @param out the output stream to write to
     * @throws IOException If an I/O error occurs.
     */
    public void writeTo(Writer out) throws IOException {try{__CLR4_5_2molmollusvmvql.R.inc(29592);
        __CLR4_5_2molmollusvmvql.R.inc(29593);if ((((this.writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29594)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29595)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29596);throw new UnsupportedOperationException("writer not null");
        }
        }__CLR4_5_2molmollusvmvql.R.inc(29597);out.write(buf, 0, count);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeTo(OutputStream out, String charsetName) throws IOException {try{__CLR4_5_2molmollusvmvql.R.inc(29598);
        __CLR4_5_2molmollusvmvql.R.inc(29599);writeTo(out, Charset.forName(charsetName));
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    public void writeTo(OutputStream out, Charset charset) throws IOException {try{__CLR4_5_2molmollusvmvql.R.inc(29600);
        __CLR4_5_2molmollusvmvql.R.inc(29601);writeToEx(out, charset);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public int writeToEx(OutputStream out, Charset charset) throws IOException {try{__CLR4_5_2molmollusvmvql.R.inc(29602);
        __CLR4_5_2molmollusvmvql.R.inc(29603);if ((((this.writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29604)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29605)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29606);throw new UnsupportedOperationException("writer not null");
        }
        
        }__CLR4_5_2molmollusvmvql.R.inc(29607);if ((((charset == IOUtils.UTF8)&&(__CLR4_5_2molmollusvmvql.R.iget(29608)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29609)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29610);return encodeToUTF8(out);
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(29611);byte[] bytes = new String(buf, 0, count).getBytes(charset);
            __CLR4_5_2molmollusvmvql.R.inc(29612);out.write(bytes);
            __CLR4_5_2molmollusvmvql.R.inc(29613);return bytes.length;
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    /**
     * Returns a copy of the input data.
     * 
     * @return an array of chars copied from the input data.
     */
    public char[] toCharArray() {try{__CLR4_5_2molmollusvmvql.R.inc(29614);
        __CLR4_5_2molmollusvmvql.R.inc(29615);if ((((this.writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29616)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29617)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29618);throw new UnsupportedOperationException("writer not null");
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29619);char[] newValue = new char[count];
        __CLR4_5_2molmollusvmvql.R.inc(29620);System.arraycopy(buf, 0, newValue, 0, count);
        __CLR4_5_2molmollusvmvql.R.inc(29621);return newValue;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    /**
     * only for springwebsocket
     * @return
     */
    public char[] toCharArrayForSpringWebSocket() {try{__CLR4_5_2molmollusvmvql.R.inc(29622);
        __CLR4_5_2molmollusvmvql.R.inc(29623);if ((((this.writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29624)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29625)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29626);throw new UnsupportedOperationException("writer not null");
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29627);char[] newValue = new char[count - 2];
        __CLR4_5_2molmollusvmvql.R.inc(29628);System.arraycopy(buf, 1, newValue, 0, count - 2);
        __CLR4_5_2molmollusvmvql.R.inc(29629);return newValue;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public byte[] toBytes(String charsetName) {try{__CLR4_5_2molmollusvmvql.R.inc(29630);
        __CLR4_5_2molmollusvmvql.R.inc(29631);return toBytes((((charsetName == null || "UTF-8".equals(charsetName) //
            )&&(__CLR4_5_2molmollusvmvql.R.iget(29632)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29633)==0&false))? IOUtils.UTF8 //
            : Charset.forName(charsetName));
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public byte[] toBytes(Charset charset) {try{__CLR4_5_2molmollusvmvql.R.inc(29634);
        __CLR4_5_2molmollusvmvql.R.inc(29635);if ((((this.writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29636)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29637)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29638);throw new UnsupportedOperationException("writer not null");
        }
        
        }__CLR4_5_2molmollusvmvql.R.inc(29639);if ((((charset == IOUtils.UTF8)&&(__CLR4_5_2molmollusvmvql.R.iget(29640)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29641)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29642);return encodeToUTF8Bytes();
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(29643);return new String(buf, 0, count).getBytes(charset);
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    private int encodeToUTF8(OutputStream out) throws IOException {try{__CLR4_5_2molmollusvmvql.R.inc(29644);

        __CLR4_5_2molmollusvmvql.R.inc(29645);int bytesLength = (int) (count * (double) 3);
        __CLR4_5_2molmollusvmvql.R.inc(29646);byte[] bytes = bytesBufLocal.get();

        __CLR4_5_2molmollusvmvql.R.inc(29647);if ((((bytes == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29648)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29649)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29650);bytes = new byte[1024 * 8];
            __CLR4_5_2molmollusvmvql.R.inc(29651);bytesBufLocal.set(bytes);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29652);if ((((bytes.length < bytesLength)&&(__CLR4_5_2molmollusvmvql.R.iget(29653)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29654)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29655);bytes = new byte[bytesLength];
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29656);int position = IOUtils.encodeUTF8(buf, 0, count, bytes);
        __CLR4_5_2molmollusvmvql.R.inc(29657);out.write(bytes, 0, position);
        __CLR4_5_2molmollusvmvql.R.inc(29658);return position;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    private byte[] encodeToUTF8Bytes() {try{__CLR4_5_2molmollusvmvql.R.inc(29659);
        __CLR4_5_2molmollusvmvql.R.inc(29660);int bytesLength = (int) (count * (double) 3);
        __CLR4_5_2molmollusvmvql.R.inc(29661);byte[] bytes = bytesBufLocal.get();

        __CLR4_5_2molmollusvmvql.R.inc(29662);if ((((bytes == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29663)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29664)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29665);bytes = new byte[1024 * 8];
            __CLR4_5_2molmollusvmvql.R.inc(29666);bytesBufLocal.set(bytes);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29667);if ((((bytes.length < bytesLength)&&(__CLR4_5_2molmollusvmvql.R.iget(29668)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29669)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29670);bytes = new byte[bytesLength];
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29671);int position = IOUtils.encodeUTF8(buf, 0, count, bytes);
        __CLR4_5_2molmollusvmvql.R.inc(29672);byte[] copy = new byte[position];
        __CLR4_5_2molmollusvmvql.R.inc(29673);System.arraycopy(bytes, 0, copy, 0, position);
        __CLR4_5_2molmollusvmvql.R.inc(29674);return copy;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    public int size() {try{__CLR4_5_2molmollusvmvql.R.inc(29675);
        __CLR4_5_2molmollusvmvql.R.inc(29676);return count;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_2molmollusvmvql.R.inc(29677);
        __CLR4_5_2molmollusvmvql.R.inc(29678);return new String(buf, 0, count);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    /**
     * Close the stream. This method does not release the buffer, since its contents might still be required. Note:
     * Invoking this method in this class will have no effect.
     */
    public void close() {try{__CLR4_5_2molmollusvmvql.R.inc(29679);
        __CLR4_5_2molmollusvmvql.R.inc(29680);if ((((writer != null && count > 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29681)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29682)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29683);flush();
        }
        }__CLR4_5_2molmollusvmvql.R.inc(29684);if ((((buf.length <= BUFFER_THRESHOLD)&&(__CLR4_5_2molmollusvmvql.R.iget(29685)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29686)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29687);bufLocal.set(buf);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29688);this.buf = null;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void write(String text) {try{__CLR4_5_2molmollusvmvql.R.inc(29689);
        __CLR4_5_2molmollusvmvql.R.inc(29690);if ((((text == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29691)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29692)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29693);writeNull();
            __CLR4_5_2molmollusvmvql.R.inc(29694);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29695);write(text, 0, text.length());
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeInt(int i) {try{__CLR4_5_2molmollusvmvql.R.inc(29696);
        __CLR4_5_2molmollusvmvql.R.inc(29697);if ((((i == Integer.MIN_VALUE)&&(__CLR4_5_2molmollusvmvql.R.iget(29698)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29699)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29700);write("-2147483648");
            __CLR4_5_2molmollusvmvql.R.inc(29701);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29702);int size = ((((i < 0) )&&(__CLR4_5_2molmollusvmvql.R.iget(29703)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29704)==0&false))? IOUtils.stringSize(-i) + 1 : IOUtils.stringSize(i);

        __CLR4_5_2molmollusvmvql.R.inc(29705);int newcount = count + size;
        __CLR4_5_2molmollusvmvql.R.inc(29706);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29707)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29708)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29709);if ((((writer == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29710)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29711)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29712);expandCapacity(newcount);
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(29713);char[] chars = new char[size];
                __CLR4_5_2molmollusvmvql.R.inc(29714);IOUtils.getChars(i, size, chars);
                __CLR4_5_2molmollusvmvql.R.inc(29715);write(chars, 0, chars.length);
                __CLR4_5_2molmollusvmvql.R.inc(29716);return;
            }
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(29717);IOUtils.getChars(i, newcount, buf);

        __CLR4_5_2molmollusvmvql.R.inc(29718);count = newcount;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeByteArray(byte[] bytes) {try{__CLR4_5_2molmollusvmvql.R.inc(29719);
        __CLR4_5_2molmollusvmvql.R.inc(29720);if ((((isEnabled(SerializerFeature.WriteClassName.mask))&&(__CLR4_5_2molmollusvmvql.R.iget(29721)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29722)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29723);writeHex(bytes);
            __CLR4_5_2molmollusvmvql.R.inc(29724);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29725);int bytesLen = bytes.length;
        __CLR4_5_2molmollusvmvql.R.inc(29726);final char quote = (((useSingleQuotes )&&(__CLR4_5_2molmollusvmvql.R.iget(29727)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29728)==0&false))? '\'' : '"';
        __CLR4_5_2molmollusvmvql.R.inc(29729);if ((((bytesLen == 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29730)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29731)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29732);String emptyString = (((useSingleQuotes )&&(__CLR4_5_2molmollusvmvql.R.iget(29733)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29734)==0&false))? "''" : "\"\"";
            __CLR4_5_2molmollusvmvql.R.inc(29735);write(emptyString);
            __CLR4_5_2molmollusvmvql.R.inc(29736);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29737);final char[] CA = IOUtils.CA;

        // base64 algorithm author Mikael Grev
        __CLR4_5_2molmollusvmvql.R.inc(29738);int eLen = (bytesLen / 3) * 3; // Length of even 24-bits.
        __CLR4_5_2molmollusvmvql.R.inc(29739);int charsLen = ((bytesLen - 1) / 3 + 1) << 2; // base64 character count
        // char[] chars = new char[charsLen];
        __CLR4_5_2molmollusvmvql.R.inc(29740);int offset = count;
        __CLR4_5_2molmollusvmvql.R.inc(29741);int newcount = count + charsLen + 2;
        __CLR4_5_2molmollusvmvql.R.inc(29742);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29743)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29744)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29745);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29746)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29747)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29748);write(quote);

                __CLR4_5_2molmollusvmvql.R.inc(29749);for (int s = 0; (((s < eLen)&&(__CLR4_5_2molmollusvmvql.R.iget(29750)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29751)==0&false));) {{
                    // Copy next three bytes into lower 24 bits of int, paying attension to sign.
                    __CLR4_5_2molmollusvmvql.R.inc(29752);int i = (bytes[s++] & 0xff) << 16 | (bytes[s++] & 0xff) << 8 | (bytes[s++] & 0xff);

                    // Encode the int into four chars
                    __CLR4_5_2molmollusvmvql.R.inc(29753);write(CA[(i >>> 18) & 0x3f]);
                    __CLR4_5_2molmollusvmvql.R.inc(29754);write(CA[(i >>> 12) & 0x3f]);
                    __CLR4_5_2molmollusvmvql.R.inc(29755);write(CA[(i >>> 6) & 0x3f]);
                    __CLR4_5_2molmollusvmvql.R.inc(29756);write(CA[i & 0x3f]);
                }

                // Pad and encode last bits if source isn't even 24 bits.
                }__CLR4_5_2molmollusvmvql.R.inc(29757);int left = bytesLen - eLen; // 0 - 2.
                __CLR4_5_2molmollusvmvql.R.inc(29758);if ((((left > 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29759)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29760)==0&false))) {{
                    // Prepare the int
                    __CLR4_5_2molmollusvmvql.R.inc(29761);int i = ((bytes[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_5_2molmollusvmvql.R.iget(29762)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29763)==0&false))? ((bytes[bytesLen - 1] & 0xff) << 2) : 0);

                    // Set last four chars
                    __CLR4_5_2molmollusvmvql.R.inc(29764);write(CA[i >> 12]);
                    __CLR4_5_2molmollusvmvql.R.inc(29765);write(CA[(i >>> 6) & 0x3f]);
                    __CLR4_5_2molmollusvmvql.R.inc(29766);write((((left == 2 )&&(__CLR4_5_2molmollusvmvql.R.iget(29767)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29768)==0&false))? CA[i & 0x3f] : '=');
                    __CLR4_5_2molmollusvmvql.R.inc(29769);write('=');
                }

                }__CLR4_5_2molmollusvmvql.R.inc(29770);write(quote);
                __CLR4_5_2molmollusvmvql.R.inc(29771);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(29772);expandCapacity(newcount);
        }
        }__CLR4_5_2molmollusvmvql.R.inc(29773);count = newcount;
        __CLR4_5_2molmollusvmvql.R.inc(29774);buf[offset++] = quote;

        // Encode even 24-bits
        __CLR4_5_2molmollusvmvql.R.inc(29775);for (int s = 0, d = offset; (((s < eLen)&&(__CLR4_5_2molmollusvmvql.R.iget(29776)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29777)==0&false));) {{
            // Copy next three bytes into lower 24 bits of int, paying attension to sign.
            __CLR4_5_2molmollusvmvql.R.inc(29778);int i = (bytes[s++] & 0xff) << 16 | (bytes[s++] & 0xff) << 8 | (bytes[s++] & 0xff);

            // Encode the int into four chars
            __CLR4_5_2molmollusvmvql.R.inc(29779);buf[d++] = CA[(i >>> 18) & 0x3f];
            __CLR4_5_2molmollusvmvql.R.inc(29780);buf[d++] = CA[(i >>> 12) & 0x3f];
            __CLR4_5_2molmollusvmvql.R.inc(29781);buf[d++] = CA[(i >>> 6) & 0x3f];
            __CLR4_5_2molmollusvmvql.R.inc(29782);buf[d++] = CA[i & 0x3f];
        }

        // Pad and encode last bits if source isn't even 24 bits.
        }__CLR4_5_2molmollusvmvql.R.inc(29783);int left = bytesLen - eLen; // 0 - 2.
        __CLR4_5_2molmollusvmvql.R.inc(29784);if ((((left > 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29785)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29786)==0&false))) {{
            // Prepare the int
            __CLR4_5_2molmollusvmvql.R.inc(29787);int i = ((bytes[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_5_2molmollusvmvql.R.iget(29788)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29789)==0&false))? ((bytes[bytesLen - 1] & 0xff) << 2) : 0);

            // Set last four chars
            __CLR4_5_2molmollusvmvql.R.inc(29790);buf[newcount - 5] = CA[i >> 12];
            __CLR4_5_2molmollusvmvql.R.inc(29791);buf[newcount - 4] = CA[(i >>> 6) & 0x3f];
            __CLR4_5_2molmollusvmvql.R.inc(29792);buf[newcount - 3] = (((left == 2 )&&(__CLR4_5_2molmollusvmvql.R.iget(29793)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29794)==0&false))? CA[i & 0x3f] : '=';
            __CLR4_5_2molmollusvmvql.R.inc(29795);buf[newcount - 2] = '=';
        }
        }__CLR4_5_2molmollusvmvql.R.inc(29796);buf[newcount - 1] = quote;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeHex(byte[] bytes) {try{__CLR4_5_2molmollusvmvql.R.inc(29797);
        __CLR4_5_2molmollusvmvql.R.inc(29798);int newcount = count + bytes.length * 2 + 3;
        __CLR4_5_2molmollusvmvql.R.inc(29799);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29800)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29801)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29802);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29803)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29804)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29805);char[] chars = new char[bytes.length * 2 + 3];
                __CLR4_5_2molmollusvmvql.R.inc(29806);int pos = 0;
                __CLR4_5_2molmollusvmvql.R.inc(29807);chars[pos++] = 'x';
                __CLR4_5_2molmollusvmvql.R.inc(29808);chars[pos++] = '\'';

                __CLR4_5_2molmollusvmvql.R.inc(29809);for (int i = 0; (((i < bytes.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29810)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29811)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(29812);byte b = bytes[i];

                    __CLR4_5_2molmollusvmvql.R.inc(29813);int a = b & 0xFF;
                    __CLR4_5_2molmollusvmvql.R.inc(29814);int b0 = a >> 4;
                    __CLR4_5_2molmollusvmvql.R.inc(29815);int b1 = a & 0xf;

                    __CLR4_5_2molmollusvmvql.R.inc(29816);chars[pos++] = (char) (b0 + ((((b0 < 10 )&&(__CLR4_5_2molmollusvmvql.R.iget(29817)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29818)==0&false))? 48 : 55));
                    __CLR4_5_2molmollusvmvql.R.inc(29819);chars[pos++] = (char) (b1 + ((((b1 < 10 )&&(__CLR4_5_2molmollusvmvql.R.iget(29820)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29821)==0&false))? 48 : 55));
                }
                }__CLR4_5_2molmollusvmvql.R.inc(29822);chars[pos++] = '\'';
                __CLR4_5_2molmollusvmvql.R.inc(29823);try {
                    __CLR4_5_2molmollusvmvql.R.inc(29824);writer.write(chars);
                } catch (IOException ex) {
                    __CLR4_5_2molmollusvmvql.R.inc(29825);throw new JSONException("writeBytes error.", ex);
                }
                __CLR4_5_2molmollusvmvql.R.inc(29826);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(29827);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29828);buf[count++] = 'x';
        __CLR4_5_2molmollusvmvql.R.inc(29829);buf[count++] = '\'';

        __CLR4_5_2molmollusvmvql.R.inc(29830);for (int i = 0; (((i < bytes.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29831)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29832)==0&false)); ++i) {{
            __CLR4_5_2molmollusvmvql.R.inc(29833);byte b = bytes[i];

            __CLR4_5_2molmollusvmvql.R.inc(29834);int a = b & 0xFF;
            __CLR4_5_2molmollusvmvql.R.inc(29835);int b0 = a >> 4;
            __CLR4_5_2molmollusvmvql.R.inc(29836);int b1 = a & 0xf;

            __CLR4_5_2molmollusvmvql.R.inc(29837);buf[count++] = (char) (b0 + ((((b0 < 10 )&&(__CLR4_5_2molmollusvmvql.R.iget(29838)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29839)==0&false))? 48 : 55));
            __CLR4_5_2molmollusvmvql.R.inc(29840);buf[count++] = (char) (b1 + ((((b1 < 10 )&&(__CLR4_5_2molmollusvmvql.R.iget(29841)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29842)==0&false))? 48 : 55));
        }
        }__CLR4_5_2molmollusvmvql.R.inc(29843);buf[count++] = '\'';
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFloat(float value, boolean checkWriteClassName) {try{__CLR4_5_2molmollusvmvql.R.inc(29844);
        __CLR4_5_2molmollusvmvql.R.inc(29845);if ((((value != value || value == Float.POSITIVE_INFINITY || value == Float.NEGATIVE_INFINITY)&&(__CLR4_5_2molmollusvmvql.R.iget(29846)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29847)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29848);writeNull();
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(29849);int newcount = count + 15;
            __CLR4_5_2molmollusvmvql.R.inc(29850);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29851)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29852)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29853);if ((((writer == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29854)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29855)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(29856);expandCapacity(newcount);
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(29857);String str = RyuFloat.toString(value);
                    __CLR4_5_2molmollusvmvql.R.inc(29858);write(str, 0, str.length());

                    __CLR4_5_2molmollusvmvql.R.inc(29859);if ((((checkWriteClassName && isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_5_2molmollusvmvql.R.iget(29860)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29861)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(29862);write('F');
                    }
                    }__CLR4_5_2molmollusvmvql.R.inc(29863);return;
                }
            }}

            }__CLR4_5_2molmollusvmvql.R.inc(29864);int len = RyuFloat.toString(value, buf, count);
            __CLR4_5_2molmollusvmvql.R.inc(29865);count += len;

            __CLR4_5_2molmollusvmvql.R.inc(29866);if ((((checkWriteClassName && isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_5_2molmollusvmvql.R.iget(29867)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29868)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29869);write('F');
            }
        }}
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeDouble(double value, boolean checkWriteClassName) {try{__CLR4_5_2molmollusvmvql.R.inc(29870);
        __CLR4_5_2molmollusvmvql.R.inc(29871);if ((((Double.isNaN(value)
                || Double.isInfinite(value))&&(__CLR4_5_2molmollusvmvql.R.iget(29872)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29873)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29874);writeNull();
            __CLR4_5_2molmollusvmvql.R.inc(29875);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29876);int newcount = count + 24;
        __CLR4_5_2molmollusvmvql.R.inc(29877);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29878)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29879)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29880);if ((((writer == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29881)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29882)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29883);expandCapacity(newcount);
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(29884);String str = RyuDouble.toString(value);
                __CLR4_5_2molmollusvmvql.R.inc(29885);write(str, 0, str.length());

                __CLR4_5_2molmollusvmvql.R.inc(29886);if ((((checkWriteClassName && isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_5_2molmollusvmvql.R.iget(29887)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29888)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(29889);write('D');
                }
                }__CLR4_5_2molmollusvmvql.R.inc(29890);return;
            }
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(29891);int len = RyuDouble.toString(value, buf, count);
        __CLR4_5_2molmollusvmvql.R.inc(29892);count += len;

        __CLR4_5_2molmollusvmvql.R.inc(29893);if ((((checkWriteClassName && isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_5_2molmollusvmvql.R.iget(29894)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29895)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29896);write('D');
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeEnum(Enum<?> value) {try{__CLR4_5_2molmollusvmvql.R.inc(29897);
        __CLR4_5_2molmollusvmvql.R.inc(29898);if ((((value == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29899)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29900)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29901);writeNull();
            __CLR4_5_2molmollusvmvql.R.inc(29902);return;
        }
        
        }__CLR4_5_2molmollusvmvql.R.inc(29903);String strVal = null;
        __CLR4_5_2molmollusvmvql.R.inc(29904);if ((((writeEnumUsingName && !writeEnumUsingToString)&&(__CLR4_5_2molmollusvmvql.R.iget(29905)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29906)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29907);strVal = value.name();
        } }else {__CLR4_5_2molmollusvmvql.R.inc(29908);if ((((writeEnumUsingToString)&&(__CLR4_5_2molmollusvmvql.R.iget(29909)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29910)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29911);strVal = value.toString();__CLR4_5_2molmollusvmvql.R.inc(29912);;
        }

        }}__CLR4_5_2molmollusvmvql.R.inc(29913);if ((((strVal != null)&&(__CLR4_5_2molmollusvmvql.R.iget(29914)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29915)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29916);char quote = (((isEnabled(SerializerFeature.UseSingleQuotes) )&&(__CLR4_5_2molmollusvmvql.R.iget(29917)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29918)==0&false))? '\'' : '"';
            __CLR4_5_2molmollusvmvql.R.inc(29919);write(quote);
            __CLR4_5_2molmollusvmvql.R.inc(29920);write(strVal);
            __CLR4_5_2molmollusvmvql.R.inc(29921);write(quote);
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(29922);writeInt(value.ordinal());
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public void writeLongAndChar(long i, char c) throws IOException {try{__CLR4_5_2molmollusvmvql.R.inc(29923);
        __CLR4_5_2molmollusvmvql.R.inc(29924);writeLong(i);
        __CLR4_5_2molmollusvmvql.R.inc(29925);write(c);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeLong(long i) {try{__CLR4_5_2molmollusvmvql.R.inc(29926);
        __CLR4_5_2molmollusvmvql.R.inc(29927);boolean needQuotationMark = isEnabled(SerializerFeature.BrowserCompatible) //
                                    && (!isEnabled(SerializerFeature.WriteClassName)) //
                                    && (i > 9007199254740991L || i < -9007199254740991L);

        __CLR4_5_2molmollusvmvql.R.inc(29928);if ((((i == Long.MIN_VALUE)&&(__CLR4_5_2molmollusvmvql.R.iget(29929)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29930)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29931);if ((((needQuotationMark)&&(__CLR4_5_2molmollusvmvql.R.iget(29932)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29933)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29934);write("\"-9223372036854775808\"");
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(29935);write("-9223372036854775808");
            }
            }__CLR4_5_2molmollusvmvql.R.inc(29936);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29937);int size = ((((i < 0) )&&(__CLR4_5_2molmollusvmvql.R.iget(29938)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29939)==0&false))? IOUtils.stringSize(-i) + 1 : IOUtils.stringSize(i);

        __CLR4_5_2molmollusvmvql.R.inc(29940);int newcount = count + size;
        __CLR4_5_2molmollusvmvql.R.inc(29941);if ((((needQuotationMark)&&(__CLR4_5_2molmollusvmvql.R.iget(29942)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29943)==0&false))) {__CLR4_5_2molmollusvmvql.R.inc(29944);newcount += 2;
        }__CLR4_5_2molmollusvmvql.R.inc(29945);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(29946)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29947)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29948);if ((((writer == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29949)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29950)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(29951);expandCapacity(newcount);
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(29952);char[] chars = new char[size];
                __CLR4_5_2molmollusvmvql.R.inc(29953);IOUtils.getChars(i, size, chars);
                __CLR4_5_2molmollusvmvql.R.inc(29954);if ((((needQuotationMark)&&(__CLR4_5_2molmollusvmvql.R.iget(29955)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29956)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(29957);write('"');
                    __CLR4_5_2molmollusvmvql.R.inc(29958);write(chars, 0, chars.length);
                    __CLR4_5_2molmollusvmvql.R.inc(29959);write('"');
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(29960);write(chars, 0, chars.length);
                }
                }__CLR4_5_2molmollusvmvql.R.inc(29961);return;
            }
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(29962);if ((((needQuotationMark)&&(__CLR4_5_2molmollusvmvql.R.iget(29963)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29964)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29965);buf[count] = '"';
            __CLR4_5_2molmollusvmvql.R.inc(29966);IOUtils.getChars(i, newcount - 1, buf);
            __CLR4_5_2molmollusvmvql.R.inc(29967);buf[newcount - 1] = '"';
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(29968);IOUtils.getChars(i, newcount, buf);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(29969);count = newcount;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeNull() {try{__CLR4_5_2molmollusvmvql.R.inc(29970);
        __CLR4_5_2molmollusvmvql.R.inc(29971);write("null");
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    public void writeNull(SerializerFeature feature) {try{__CLR4_5_2molmollusvmvql.R.inc(29972);
        __CLR4_5_2molmollusvmvql.R.inc(29973);writeNull(0, feature.mask);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    public void writeNull(int beanFeatures , int feature) {try{__CLR4_5_2molmollusvmvql.R.inc(29974);
        __CLR4_5_2molmollusvmvql.R.inc(29975);if (((((beanFeatures & feature) == 0 //
            && (this.features & feature) == 0)&&(__CLR4_5_2molmollusvmvql.R.iget(29976)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29977)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29978);writeNull();
            __CLR4_5_2molmollusvmvql.R.inc(29979);return;
        }
        
        }__CLR4_5_2molmollusvmvql.R.inc(29980);if ((((feature == SerializerFeature.WriteNullListAsEmpty.mask)&&(__CLR4_5_2molmollusvmvql.R.iget(29981)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29982)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29983);write("[]");
        } }else {__CLR4_5_2molmollusvmvql.R.inc(29984);if ((((feature == SerializerFeature.WriteNullStringAsEmpty.mask)&&(__CLR4_5_2molmollusvmvql.R.iget(29985)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29986)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29987);writeString("");
        } }else {__CLR4_5_2molmollusvmvql.R.inc(29988);if ((((feature == SerializerFeature.WriteNullBooleanAsFalse.mask)&&(__CLR4_5_2molmollusvmvql.R.iget(29989)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29990)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29991);write("false");
        } }else {__CLR4_5_2molmollusvmvql.R.inc(29992);if ((((feature == SerializerFeature.WriteNullNumberAsZero.mask)&&(__CLR4_5_2molmollusvmvql.R.iget(29993)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(29994)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(29995);write('0');
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(29996);writeNull();
        }
    }}}}}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    public void writeStringWithDoubleQuote(String text, final char seperator) {try{__CLR4_5_2molmollusvmvql.R.inc(29997);
        __CLR4_5_2molmollusvmvql.R.inc(29998);if ((((text == null)&&(__CLR4_5_2molmollusvmvql.R.iget(29999)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30000)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30001);writeNull();
            __CLR4_5_2molmollusvmvql.R.inc(30002);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30003)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30004)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30005);write(seperator);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30006);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30007);int len = text.length();
        __CLR4_5_2molmollusvmvql.R.inc(30008);int newcount = count + len + 2;
        __CLR4_5_2molmollusvmvql.R.inc(30009);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30010)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30011)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30012);newcount++;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30013);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30014)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30015)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30016);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(30017)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30018)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30019);write('"');

                __CLR4_5_2molmollusvmvql.R.inc(30020);for (int i = 0; (((i < text.length())&&(__CLR4_5_2molmollusvmvql.R.iget(30021)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30022)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30023);char ch = text.charAt(i);

                    __CLR4_5_2molmollusvmvql.R.inc(30024);if ((((isEnabled(SerializerFeature.BrowserSecure))&&(__CLR4_5_2molmollusvmvql.R.iget(30025)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30026)==0&false))) {{
                       __CLR4_5_2molmollusvmvql.R.inc(30027);if ((((ch == '(' || ch == ')' || ch == '<' || ch == '>')&&(__CLR4_5_2molmollusvmvql.R.iget(30028)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30029)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30030);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30031);write('u');
                            __CLR4_5_2molmollusvmvql.R.inc(30032);write(IOUtils.DIGITS[(ch >>> 12) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30033);write(IOUtils.DIGITS[(ch >>> 8 ) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30034);write(IOUtils.DIGITS[(ch >>> 4 ) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30035);write(IOUtils.DIGITS[ch & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30036);continue;
                        }
                    }}

                    }__CLR4_5_2molmollusvmvql.R.inc(30037);if ((((isEnabled(SerializerFeature.BrowserCompatible))&&(__CLR4_5_2molmollusvmvql.R.iget(30038)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30039)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30040);if ((((ch == '\b' //
                            || ch == '\f' //
                            || ch == '\n' //
                            || ch == '\r' //
                            || ch == '\t' //
                            || ch == '"' //
                            || ch == '/' //
                            || ch == '\\')&&(__CLR4_5_2molmollusvmvql.R.iget(30041)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30042)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30043);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30044);write(replaceChars[(int) ch]);
                            __CLR4_5_2molmollusvmvql.R.inc(30045);continue;
                        }

                        }__CLR4_5_2molmollusvmvql.R.inc(30046);if ((((ch < 32)&&(__CLR4_5_2molmollusvmvql.R.iget(30047)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30048)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30049);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30050);write('u');
                            __CLR4_5_2molmollusvmvql.R.inc(30051);write('0');
                            __CLR4_5_2molmollusvmvql.R.inc(30052);write('0');
                            __CLR4_5_2molmollusvmvql.R.inc(30053);write(IOUtils.ASCII_CHARS[ch * 2    ]);
                            __CLR4_5_2molmollusvmvql.R.inc(30054);write(IOUtils.ASCII_CHARS[ch * 2 + 1]);
                            __CLR4_5_2molmollusvmvql.R.inc(30055);continue;
                        }

                        }__CLR4_5_2molmollusvmvql.R.inc(30056);if ((((ch >= 127)&&(__CLR4_5_2molmollusvmvql.R.iget(30057)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30058)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30059);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30060);write('u');
                            __CLR4_5_2molmollusvmvql.R.inc(30061);write(IOUtils.DIGITS[(ch >>> 12) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30062);write(IOUtils.DIGITS[(ch >>> 8 ) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30063);write(IOUtils.DIGITS[(ch >>> 4 ) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30064);write(IOUtils.DIGITS[ ch         & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30065);continue;
                        }
                    }} }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(30066);if ((((ch < IOUtils.specicalFlags_doubleQuotes.length
                            && IOUtils.specicalFlags_doubleQuotes[ch] != 0 //
                            || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(30067)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30068)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30069);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30070);if ((((IOUtils.specicalFlags_doubleQuotes[ch] == 4)&&(__CLR4_5_2molmollusvmvql.R.iget(30071)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30072)==0&false))) {{
                                __CLR4_5_2molmollusvmvql.R.inc(30073);write('u');
                                __CLR4_5_2molmollusvmvql.R.inc(30074);write(IOUtils.DIGITS[ch >>> 12 & 15]);
                                __CLR4_5_2molmollusvmvql.R.inc(30075);write(IOUtils.DIGITS[ch >>> 8  & 15]);
                                __CLR4_5_2molmollusvmvql.R.inc(30076);write(IOUtils.DIGITS[ch >>> 4  & 15]);
                                __CLR4_5_2molmollusvmvql.R.inc(30077);write(IOUtils.DIGITS[ch        & 15]);
                            } }else {{
                                __CLR4_5_2molmollusvmvql.R.inc(30078);write(IOUtils.replaceChars[ch]);
                            }
                            }__CLR4_5_2molmollusvmvql.R.inc(30079);continue;
                        }
                    }}

                    }__CLR4_5_2molmollusvmvql.R.inc(30080);write(ch);
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30081);write('"');
                __CLR4_5_2molmollusvmvql.R.inc(30082);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30083)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30084)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30085);write(seperator);
                }
                }__CLR4_5_2molmollusvmvql.R.inc(30086);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30087);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30088);int start = count + 1;
        __CLR4_5_2molmollusvmvql.R.inc(30089);int end = start + len;

        __CLR4_5_2molmollusvmvql.R.inc(30090);buf[count] = '\"';
        __CLR4_5_2molmollusvmvql.R.inc(30091);text.getChars(0, len, buf, start);

        __CLR4_5_2molmollusvmvql.R.inc(30092);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(30093);if ((((isEnabled(SerializerFeature.BrowserCompatible))&&(__CLR4_5_2molmollusvmvql.R.iget(30094)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30095)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30096);int lastSpecialIndex = -1;

            __CLR4_5_2molmollusvmvql.R.inc(30097);for (int i = start; (((i < end)&&(__CLR4_5_2molmollusvmvql.R.iget(30098)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30099)==0&false)); ++i) {{
                __CLR4_5_2molmollusvmvql.R.inc(30100);char ch = buf[i];

                __CLR4_5_2molmollusvmvql.R.inc(30101);if ((((ch == '"' //
                    || ch == '/' //
                    || ch == '\\')&&(__CLR4_5_2molmollusvmvql.R.iget(30102)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30103)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30104);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30105);newcount += 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30106);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30107);if ((((ch == '\b' //
                    || ch == '\f' //
                    || ch == '\n' //
                    || ch == '\r' //
                    || ch == '\t')&&(__CLR4_5_2molmollusvmvql.R.iget(30108)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30109)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30110);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30111);newcount += 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30112);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30113);if ((((ch < 32)&&(__CLR4_5_2molmollusvmvql.R.iget(30114)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30115)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30116);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30117);newcount += 5;
                    __CLR4_5_2molmollusvmvql.R.inc(30118);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30119);if ((((ch >= 127)&&(__CLR4_5_2molmollusvmvql.R.iget(30120)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30121)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30122);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30123);newcount += 5;
                    __CLR4_5_2molmollusvmvql.R.inc(30124);continue;
                }
            }}

            }__CLR4_5_2molmollusvmvql.R.inc(30125);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30126)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30127)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30128);expandCapacity(newcount);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30129);count = newcount;

            __CLR4_5_2molmollusvmvql.R.inc(30130);for (int i = lastSpecialIndex; (((i >= start)&&(__CLR4_5_2molmollusvmvql.R.iget(30131)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30132)==0&false)); --i) {{
                __CLR4_5_2molmollusvmvql.R.inc(30133);char ch = buf[i];

                __CLR4_5_2molmollusvmvql.R.inc(30134);if ((((ch == '\b' //
                    || ch == '\f'//
                    || ch == '\n' //
                    || ch == '\r' //
                    || ch == '\t'
                )&&(__CLR4_5_2molmollusvmvql.R.iget(30135)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30136)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30137);System.arraycopy(buf, i + 1, buf, i + 2, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(30138);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30139);buf[i + 1] = replaceChars[(int) ch];
                    __CLR4_5_2molmollusvmvql.R.inc(30140);end += 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30141);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30142);if ((((ch == '"' //
                    || ch == '/' //
                    || ch == '\\'
                )&&(__CLR4_5_2molmollusvmvql.R.iget(30143)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30144)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30145);System.arraycopy(buf, i + 1, buf, i + 2, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(30146);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30147);buf[i + 1] = ch;
                    __CLR4_5_2molmollusvmvql.R.inc(30148);end += 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30149);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30150);if ((((ch < 32)&&(__CLR4_5_2molmollusvmvql.R.iget(30151)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30152)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30153);System.arraycopy(buf, i + 1, buf, i + 6, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(30154);buf[i    ] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30155);buf[i + 1] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(30156);buf[i + 2] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(30157);buf[i + 3] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(30158);buf[i + 4] = IOUtils.ASCII_CHARS[ch * 2];
                    __CLR4_5_2molmollusvmvql.R.inc(30159);buf[i + 5] = IOUtils.ASCII_CHARS[ch * 2 + 1];
                    __CLR4_5_2molmollusvmvql.R.inc(30160);end += 5;
                    __CLR4_5_2molmollusvmvql.R.inc(30161);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30162);if ((((ch >= 127)&&(__CLR4_5_2molmollusvmvql.R.iget(30163)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30164)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30165);System.arraycopy(buf, i + 1, buf, i + 6, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(30166);buf[i    ] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30167);buf[i + 1] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(30168);buf[i + 2] = IOUtils.DIGITS[(ch >>> 12) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30169);buf[i + 3] = IOUtils.DIGITS[(ch >>> 8) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30170);buf[i + 4] = IOUtils.DIGITS[(ch >>> 4) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30171);buf[i + 5] = IOUtils.DIGITS[ch & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30172);end += 5;
                }
            }}

            }__CLR4_5_2molmollusvmvql.R.inc(30173);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30174)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30175)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30176);buf[count - 2] = '\"';
                __CLR4_5_2molmollusvmvql.R.inc(30177);buf[count - 1] = seperator;
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(30178);buf[count - 1] = '\"';
            }

            }__CLR4_5_2molmollusvmvql.R.inc(30179);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30180);int specialCount      = 0;
        __CLR4_5_2molmollusvmvql.R.inc(30181);int lastSpecialIndex  = -1;
        __CLR4_5_2molmollusvmvql.R.inc(30182);int firstSpecialIndex = -1;
        __CLR4_5_2molmollusvmvql.R.inc(30183);char lastSpecial      = '\0';

        __CLR4_5_2molmollusvmvql.R.inc(30184);for (int i = start; (((i < end)&&(__CLR4_5_2molmollusvmvql.R.iget(30185)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30186)==0&false)); ++i) {{
            __CLR4_5_2molmollusvmvql.R.inc(30187);char ch = buf[i];

            __CLR4_5_2molmollusvmvql.R.inc(30188);if ((((ch >= ']')&&(__CLR4_5_2molmollusvmvql.R.iget(30189)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30190)==0&false))) {{ // 93
                __CLR4_5_2molmollusvmvql.R.inc(30191);if ((((ch >= 0x7F //
                        && (ch == '\u2028' //
                        || ch == '\u2029' //
                        || ch < 0xA0))&&(__CLR4_5_2molmollusvmvql.R.iget(30192)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30193)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30194);if ((((firstSpecialIndex == -1)&&(__CLR4_5_2molmollusvmvql.R.iget(30195)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30196)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30197);firstSpecialIndex = i;
                    }

                    }__CLR4_5_2molmollusvmvql.R.inc(30198);specialCount++;
                    __CLR4_5_2molmollusvmvql.R.inc(30199);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30200);lastSpecial = ch;
                    __CLR4_5_2molmollusvmvql.R.inc(30201);newcount += 4;
                }
                }__CLR4_5_2molmollusvmvql.R.inc(30202);continue;
            }

            }__CLR4_5_2molmollusvmvql.R.inc(30203);boolean special = (ch < 64 && (sepcialBits & (1L << ch)) != 0) || ch == '\\';
            __CLR4_5_2molmollusvmvql.R.inc(30204);if ((((special)&&(__CLR4_5_2molmollusvmvql.R.iget(30205)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30206)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30207);specialCount++;
                __CLR4_5_2molmollusvmvql.R.inc(30208);lastSpecialIndex = i;
                __CLR4_5_2molmollusvmvql.R.inc(30209);lastSpecial = ch;

                __CLR4_5_2molmollusvmvql.R.inc(30210);if ((((ch == '('
                        || ch == ')'
                        || ch == '<'
                        || ch == '>'
                        || (ch < IOUtils.specicalFlags_doubleQuotes.length //
                    && IOUtils.specicalFlags_doubleQuotes[ch] == 4) //
                )&&(__CLR4_5_2molmollusvmvql.R.iget(30211)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30212)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30213);newcount += 4;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30214);if ((((firstSpecialIndex == -1)&&(__CLR4_5_2molmollusvmvql.R.iget(30215)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30216)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30217);firstSpecialIndex = i;
                }
            }}
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(30218);if ((((specialCount > 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30219)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30220)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30221);newcount += specialCount;
            __CLR4_5_2molmollusvmvql.R.inc(30222);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30223)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30224)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30225);expandCapacity(newcount);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30226);count = newcount;

            __CLR4_5_2molmollusvmvql.R.inc(30227);if ((((specialCount == 1)&&(__CLR4_5_2molmollusvmvql.R.iget(30228)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30229)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30230);if ((((lastSpecial == '\u2028')&&(__CLR4_5_2molmollusvmvql.R.iget(30231)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30232)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30233);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30234);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(30235);int LengthOfCopy = end - lastSpecialIndex - 1;

                    __CLR4_5_2molmollusvmvql.R.inc(30236);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                    __CLR4_5_2molmollusvmvql.R.inc(30237);buf[lastSpecialIndex  ] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30238);buf[++lastSpecialIndex] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(30239);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(30240);buf[++lastSpecialIndex] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(30241);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(30242);buf[++lastSpecialIndex] = '8';

                } }else {__CLR4_5_2molmollusvmvql.R.inc(30243);if ((((lastSpecial == '\u2029')&&(__CLR4_5_2molmollusvmvql.R.iget(30244)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30245)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30246);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30247);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(30248);int LengthOfCopy = end - lastSpecialIndex - 1;

                    __CLR4_5_2molmollusvmvql.R.inc(30249);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                    __CLR4_5_2molmollusvmvql.R.inc(30250);buf[lastSpecialIndex  ] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30251);buf[++lastSpecialIndex] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(30252);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(30253);buf[++lastSpecialIndex] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(30254);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(30255);buf[++lastSpecialIndex] = '9';

                } }else {__CLR4_5_2molmollusvmvql.R.inc(30256);if ((((lastSpecial == '(' || lastSpecial == ')' || lastSpecial == '<' || lastSpecial == '>')&&(__CLR4_5_2molmollusvmvql.R.iget(30257)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30258)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30259);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30260);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(30261);int LengthOfCopy = end - lastSpecialIndex - 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30262);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                    __CLR4_5_2molmollusvmvql.R.inc(30263);buf[lastSpecialIndex] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30264);buf[++lastSpecialIndex] = 'u';

                    __CLR4_5_2molmollusvmvql.R.inc(30265);final char ch = lastSpecial;
                    __CLR4_5_2molmollusvmvql.R.inc(30266);buf[++lastSpecialIndex] = IOUtils.DIGITS[(ch >>> 12) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30267);buf[++lastSpecialIndex] = IOUtils.DIGITS[(ch >>> 8) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30268);buf[++lastSpecialIndex] = IOUtils.DIGITS[(ch >>> 4) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30269);buf[++lastSpecialIndex] = IOUtils.DIGITS[ch & 15];
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(30270);final char ch = lastSpecial;
                    __CLR4_5_2molmollusvmvql.R.inc(30271);if ((((ch < IOUtils.specicalFlags_doubleQuotes.length //
                        && IOUtils.specicalFlags_doubleQuotes[ch] == 4)&&(__CLR4_5_2molmollusvmvql.R.iget(30272)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30273)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30274);int srcPos = lastSpecialIndex + 1;
                        __CLR4_5_2molmollusvmvql.R.inc(30275);int destPos = lastSpecialIndex + 6;
                        __CLR4_5_2molmollusvmvql.R.inc(30276);int LengthOfCopy = end - lastSpecialIndex - 1;
                        __CLR4_5_2molmollusvmvql.R.inc(30277);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);

                        __CLR4_5_2molmollusvmvql.R.inc(30278);int bufIndex = lastSpecialIndex;
                        __CLR4_5_2molmollusvmvql.R.inc(30279);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(30280);buf[bufIndex++] = 'u';
                        __CLR4_5_2molmollusvmvql.R.inc(30281);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30282);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30283);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30284);buf[bufIndex++] = IOUtils.DIGITS[ch & 15];
                    } }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(30285);int srcPos = lastSpecialIndex + 1;
                        __CLR4_5_2molmollusvmvql.R.inc(30286);int destPos = lastSpecialIndex + 2;
                        __CLR4_5_2molmollusvmvql.R.inc(30287);int LengthOfCopy = end - lastSpecialIndex - 1;
                        __CLR4_5_2molmollusvmvql.R.inc(30288);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                        __CLR4_5_2molmollusvmvql.R.inc(30289);buf[lastSpecialIndex] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(30290);buf[++lastSpecialIndex] = replaceChars[(int) ch];
                    }
                }}
            }}}} }else {__CLR4_5_2molmollusvmvql.R.inc(30291);if ((((specialCount > 1)&&(__CLR4_5_2molmollusvmvql.R.iget(30292)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30293)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30294);int textIndex = firstSpecialIndex - start;
                __CLR4_5_2molmollusvmvql.R.inc(30295);int bufIndex = firstSpecialIndex;
                __CLR4_5_2molmollusvmvql.R.inc(30296);for (int i = textIndex; (((i < text.length())&&(__CLR4_5_2molmollusvmvql.R.iget(30297)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30298)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30299);char ch = text.charAt(i);

                    __CLR4_5_2molmollusvmvql.R.inc(30300);if ((((browserSecure && (ch == '('
                            || ch == ')'
                            || ch == '<'
                            || ch == '>'))&&(__CLR4_5_2molmollusvmvql.R.iget(30301)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30302)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30303);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(30304);buf[bufIndex++] = 'u';
                        __CLR4_5_2molmollusvmvql.R.inc(30305);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30306);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8 ) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30307);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4 ) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30308);buf[bufIndex++] = IOUtils.DIGITS[ch          & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30309);end += 5;
                    } }else {__CLR4_5_2molmollusvmvql.R.inc(30310);if ((((ch < IOUtils.specicalFlags_doubleQuotes.length //
                        && IOUtils.specicalFlags_doubleQuotes[ch] != 0 //
                        || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(30311)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30312)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30313);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(30314);if ((((IOUtils.specicalFlags_doubleQuotes[ch] == 4)&&(__CLR4_5_2molmollusvmvql.R.iget(30315)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30316)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30317);buf[bufIndex++] = 'u';
                            __CLR4_5_2molmollusvmvql.R.inc(30318);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30319);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8 ) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30320);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4 ) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30321);buf[bufIndex++] = IOUtils.DIGITS[ch          & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30322);end += 5;
                        } }else {{
                            __CLR4_5_2molmollusvmvql.R.inc(30323);buf[bufIndex++] = replaceChars[(int) ch];
                            __CLR4_5_2molmollusvmvql.R.inc(30324);end++;
                        }
                    }} }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(30325);if ((((ch == '\u2028' || ch == '\u2029')&&(__CLR4_5_2molmollusvmvql.R.iget(30326)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30327)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30328);buf[bufIndex++] = '\\';
                            __CLR4_5_2molmollusvmvql.R.inc(30329);buf[bufIndex++] = 'u';
                            __CLR4_5_2molmollusvmvql.R.inc(30330);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30331);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8 ) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30332);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4 ) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30333);buf[bufIndex++] = IOUtils.DIGITS[ch          & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30334);end += 5;
                        } }else {{
                            __CLR4_5_2molmollusvmvql.R.inc(30335);buf[bufIndex++] = ch;
                        }
                    }}
                }}}
            }}
        }}}

        }__CLR4_5_2molmollusvmvql.R.inc(30336);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30337)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30338)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30339);buf[count - 2] = '\"';
            __CLR4_5_2molmollusvmvql.R.inc(30340);buf[count - 1] = seperator;
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(30341);buf[count - 1] = '\"';
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeStringWithDoubleQuote(char[] text, final char seperator) {try{__CLR4_5_2molmollusvmvql.R.inc(30342);
        __CLR4_5_2molmollusvmvql.R.inc(30343);if ((((text == null)&&(__CLR4_5_2molmollusvmvql.R.iget(30344)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30345)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30346);writeNull();
            __CLR4_5_2molmollusvmvql.R.inc(30347);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30348)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30349)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30350);write(seperator);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30351);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30352);int len = text.length;
        __CLR4_5_2molmollusvmvql.R.inc(30353);int newcount = count + len + 2;
        __CLR4_5_2molmollusvmvql.R.inc(30354);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30355)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30356)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30357);newcount++;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30358);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30359)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30360)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30361);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(30362)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30363)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30364);write('"');

                __CLR4_5_2molmollusvmvql.R.inc(30365);for (int i = 0; (((i < text.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30366)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30367)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30368);char ch = text[i];

                    __CLR4_5_2molmollusvmvql.R.inc(30369);if ((((isEnabled(SerializerFeature.BrowserSecure))&&(__CLR4_5_2molmollusvmvql.R.iget(30370)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30371)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30372);if ((((ch == '('
                                || ch == ')'
                                || ch == '<'
                                || ch == '>'
                        )&&(__CLR4_5_2molmollusvmvql.R.iget(30373)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30374)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30375);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30376);write('u');
                            __CLR4_5_2molmollusvmvql.R.inc(30377);write(IOUtils.DIGITS[(ch >>> 12) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30378);write(IOUtils.DIGITS[(ch >>> 8 ) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30379);write(IOUtils.DIGITS[(ch >>> 4 ) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30380);write(IOUtils.DIGITS[ch          & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30381);continue;
                        }
                    }}

                    }__CLR4_5_2molmollusvmvql.R.inc(30382);if ((((isEnabled(SerializerFeature.BrowserCompatible))&&(__CLR4_5_2molmollusvmvql.R.iget(30383)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30384)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30385);if ((((ch == '\b' //
                                || ch == '\f' //
                                || ch == '\n' //
                                || ch == '\r' //
                                || ch == '\t' //
                                || ch == '"' //
                                || ch == '/' //
                                || ch == '\\')&&(__CLR4_5_2molmollusvmvql.R.iget(30386)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30387)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30388);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30389);write(replaceChars[(int) ch]);
                            __CLR4_5_2molmollusvmvql.R.inc(30390);continue;
                        }

                        }__CLR4_5_2molmollusvmvql.R.inc(30391);if ((((ch < 32)&&(__CLR4_5_2molmollusvmvql.R.iget(30392)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30393)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30394);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30395);write('u');
                            __CLR4_5_2molmollusvmvql.R.inc(30396);write('0');
                            __CLR4_5_2molmollusvmvql.R.inc(30397);write('0');
                            __CLR4_5_2molmollusvmvql.R.inc(30398);write(IOUtils.ASCII_CHARS[ch * 2    ]);
                            __CLR4_5_2molmollusvmvql.R.inc(30399);write(IOUtils.ASCII_CHARS[ch * 2 + 1]);
                            __CLR4_5_2molmollusvmvql.R.inc(30400);continue;
                        }

                        }__CLR4_5_2molmollusvmvql.R.inc(30401);if ((((ch >= 127)&&(__CLR4_5_2molmollusvmvql.R.iget(30402)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30403)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30404);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30405);write('u');
                            __CLR4_5_2molmollusvmvql.R.inc(30406);write(IOUtils.DIGITS[(ch >>> 12) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30407);write(IOUtils.DIGITS[(ch >>> 8 ) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30408);write(IOUtils.DIGITS[(ch >>> 4 ) & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30409);write(IOUtils.DIGITS[ch          & 15]);
                            __CLR4_5_2molmollusvmvql.R.inc(30410);continue;
                        }
                    }} }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(30411);if ((((ch < IOUtils.specicalFlags_doubleQuotes.length
                                && IOUtils.specicalFlags_doubleQuotes[ch] != 0 //
                                || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(30412)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30413)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30414);write('\\');
                            __CLR4_5_2molmollusvmvql.R.inc(30415);if ((((IOUtils.specicalFlags_doubleQuotes[ch] == 4)&&(__CLR4_5_2molmollusvmvql.R.iget(30416)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30417)==0&false))) {{
                                __CLR4_5_2molmollusvmvql.R.inc(30418);write('u');
                                __CLR4_5_2molmollusvmvql.R.inc(30419);write(IOUtils.DIGITS[ch >>> 12 & 15]);
                                __CLR4_5_2molmollusvmvql.R.inc(30420);write(IOUtils.DIGITS[ch >>> 8  & 15]);
                                __CLR4_5_2molmollusvmvql.R.inc(30421);write(IOUtils.DIGITS[ch >>> 4  & 15]);
                                __CLR4_5_2molmollusvmvql.R.inc(30422);write(IOUtils.DIGITS[ch        & 15]);
                            } }else {{
                                __CLR4_5_2molmollusvmvql.R.inc(30423);write(IOUtils.replaceChars[ch]);
                            }
                            }__CLR4_5_2molmollusvmvql.R.inc(30424);continue;
                        }
                    }}

                    }__CLR4_5_2molmollusvmvql.R.inc(30425);write(ch);
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30426);write('"');
                __CLR4_5_2molmollusvmvql.R.inc(30427);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30428)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30429)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30430);write(seperator);
                }
                }__CLR4_5_2molmollusvmvql.R.inc(30431);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30432);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30433);int start = count + 1;
        __CLR4_5_2molmollusvmvql.R.inc(30434);int end = start + len;

        __CLR4_5_2molmollusvmvql.R.inc(30435);buf[count] = '\"';
//        text.getChars(0, len, buf, start);
        __CLR4_5_2molmollusvmvql.R.inc(30436);System.arraycopy(text, 0, buf, start, text.length);

        __CLR4_5_2molmollusvmvql.R.inc(30437);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(30438);if ((((isEnabled(SerializerFeature.BrowserCompatible))&&(__CLR4_5_2molmollusvmvql.R.iget(30439)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30440)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30441);int lastSpecialIndex = -1;

            __CLR4_5_2molmollusvmvql.R.inc(30442);for (int i = start; (((i < end)&&(__CLR4_5_2molmollusvmvql.R.iget(30443)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30444)==0&false)); ++i) {{
                __CLR4_5_2molmollusvmvql.R.inc(30445);char ch = buf[i];

                __CLR4_5_2molmollusvmvql.R.inc(30446);if ((((ch == '"' //
                        || ch == '/' //
                        || ch == '\\')&&(__CLR4_5_2molmollusvmvql.R.iget(30447)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30448)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30449);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30450);newcount += 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30451);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30452);if ((((ch == '\b' //
                        || ch == '\f' //
                        || ch == '\n' //
                        || ch == '\r' //
                        || ch == '\t')&&(__CLR4_5_2molmollusvmvql.R.iget(30453)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30454)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30455);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30456);newcount += 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30457);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30458);if ((((ch < 32)&&(__CLR4_5_2molmollusvmvql.R.iget(30459)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30460)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30461);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30462);newcount += 5;
                    __CLR4_5_2molmollusvmvql.R.inc(30463);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30464);if ((((ch >= 127)&&(__CLR4_5_2molmollusvmvql.R.iget(30465)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30466)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30467);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30468);newcount += 5;
                    __CLR4_5_2molmollusvmvql.R.inc(30469);continue;
                }
            }}

            }__CLR4_5_2molmollusvmvql.R.inc(30470);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30471)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30472)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30473);expandCapacity(newcount);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30474);count = newcount;

            __CLR4_5_2molmollusvmvql.R.inc(30475);for (int i = lastSpecialIndex; (((i >= start)&&(__CLR4_5_2molmollusvmvql.R.iget(30476)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30477)==0&false)); --i) {{
                __CLR4_5_2molmollusvmvql.R.inc(30478);char ch = buf[i];

                __CLR4_5_2molmollusvmvql.R.inc(30479);if ((((ch == '\b' //
                        || ch == '\f'//
                        || ch == '\n' //
                        || ch == '\r' //
                        || ch == '\t')&&(__CLR4_5_2molmollusvmvql.R.iget(30480)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30481)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30482);System.arraycopy(buf, i + 1, buf, i + 2, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(30483);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30484);buf[i + 1] = replaceChars[(int) ch];
                    __CLR4_5_2molmollusvmvql.R.inc(30485);end += 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30486);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30487);if ((((ch == '"' //
                        || ch == '/' //
                        || ch == '\\')&&(__CLR4_5_2molmollusvmvql.R.iget(30488)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30489)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30490);System.arraycopy(buf, i + 1, buf, i + 2, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(30491);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30492);buf[i + 1] = ch;
                    __CLR4_5_2molmollusvmvql.R.inc(30493);end += 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30494);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30495);if ((((ch < 32)&&(__CLR4_5_2molmollusvmvql.R.iget(30496)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30497)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30498);System.arraycopy(buf, i + 1, buf, i + 6, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(30499);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30500);buf[i + 1] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(30501);buf[i + 2] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(30502);buf[i + 3] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(30503);buf[i + 4] = IOUtils.ASCII_CHARS[ch * 2];
                    __CLR4_5_2molmollusvmvql.R.inc(30504);buf[i + 5] = IOUtils.ASCII_CHARS[ch * 2 + 1];
                    __CLR4_5_2molmollusvmvql.R.inc(30505);end += 5;
                    __CLR4_5_2molmollusvmvql.R.inc(30506);continue;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30507);if ((((ch >= 127)&&(__CLR4_5_2molmollusvmvql.R.iget(30508)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30509)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30510);System.arraycopy(buf, i + 1, buf, i + 6, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(30511);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30512);buf[i + 1] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(30513);buf[i + 2] = IOUtils.DIGITS[(ch >>> 12) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30514);buf[i + 3] = IOUtils.DIGITS[(ch >>> 8) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30515);buf[i + 4] = IOUtils.DIGITS[(ch >>> 4) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30516);buf[i + 5] = IOUtils.DIGITS[ch & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30517);end += 5;
                }
            }}

            }__CLR4_5_2molmollusvmvql.R.inc(30518);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30519)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30520)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30521);buf[count - 2] = '\"';
                __CLR4_5_2molmollusvmvql.R.inc(30522);buf[count - 1] = seperator;
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(30523);buf[count - 1] = '\"';
            }

            }__CLR4_5_2molmollusvmvql.R.inc(30524);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30525);int specialCount = 0;
        __CLR4_5_2molmollusvmvql.R.inc(30526);int lastSpecialIndex = -1;
        __CLR4_5_2molmollusvmvql.R.inc(30527);int firstSpecialIndex = -1;
        __CLR4_5_2molmollusvmvql.R.inc(30528);char lastSpecial = '\0';

        __CLR4_5_2molmollusvmvql.R.inc(30529);for (int i = start; (((i < end)&&(__CLR4_5_2molmollusvmvql.R.iget(30530)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30531)==0&false)); ++i) {{
            __CLR4_5_2molmollusvmvql.R.inc(30532);char ch = buf[i];

            __CLR4_5_2molmollusvmvql.R.inc(30533);if ((((ch >= ']')&&(__CLR4_5_2molmollusvmvql.R.iget(30534)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30535)==0&false))) {{ // 93
                __CLR4_5_2molmollusvmvql.R.inc(30536);if ((((ch >= 0x7F //
                        && (ch == '\u2028' //
                        || ch == '\u2029' //
                        || ch < 0xA0))&&(__CLR4_5_2molmollusvmvql.R.iget(30537)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30538)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30539);if ((((firstSpecialIndex == -1)&&(__CLR4_5_2molmollusvmvql.R.iget(30540)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30541)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30542);firstSpecialIndex = i;
                    }

                    }__CLR4_5_2molmollusvmvql.R.inc(30543);specialCount++;
                    __CLR4_5_2molmollusvmvql.R.inc(30544);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30545);lastSpecial = ch;
                    __CLR4_5_2molmollusvmvql.R.inc(30546);newcount += 4;
                }
                }__CLR4_5_2molmollusvmvql.R.inc(30547);continue;
            }

            }__CLR4_5_2molmollusvmvql.R.inc(30548);boolean special = (ch < 64 && (sepcialBits & (1L << ch)) != 0) || ch == '\\';
            __CLR4_5_2molmollusvmvql.R.inc(30549);if ((((special)&&(__CLR4_5_2molmollusvmvql.R.iget(30550)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30551)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30552);specialCount++;
                __CLR4_5_2molmollusvmvql.R.inc(30553);lastSpecialIndex = i;
                __CLR4_5_2molmollusvmvql.R.inc(30554);lastSpecial = ch;

                __CLR4_5_2molmollusvmvql.R.inc(30555);if ((((ch == '('
                        || ch == ')'
                        || ch == '<'
                        || ch == '>'
                        || (ch < IOUtils.specicalFlags_doubleQuotes.length //
                        && IOUtils.specicalFlags_doubleQuotes[ch] == 4) //
                        )&&(__CLR4_5_2molmollusvmvql.R.iget(30556)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30557)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30558);newcount += 4;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30559);if ((((firstSpecialIndex == -1)&&(__CLR4_5_2molmollusvmvql.R.iget(30560)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30561)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30562);firstSpecialIndex = i;
                }
            }}
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(30563);if ((((specialCount > 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30564)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30565)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30566);newcount += specialCount;
            __CLR4_5_2molmollusvmvql.R.inc(30567);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30568)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30569)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30570);expandCapacity(newcount);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30571);count = newcount;

            __CLR4_5_2molmollusvmvql.R.inc(30572);if ((((specialCount == 1)&&(__CLR4_5_2molmollusvmvql.R.iget(30573)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30574)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30575);if ((((lastSpecial == '\u2028')&&(__CLR4_5_2molmollusvmvql.R.iget(30576)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30577)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30578);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30579);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(30580);int LengthOfCopy = end - lastSpecialIndex - 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30581);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                    __CLR4_5_2molmollusvmvql.R.inc(30582);buf[lastSpecialIndex  ] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30583);buf[++lastSpecialIndex] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(30584);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(30585);buf[++lastSpecialIndex] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(30586);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(30587);buf[++lastSpecialIndex] = '8';
                } }else {__CLR4_5_2molmollusvmvql.R.inc(30588);if ((((lastSpecial == '\u2029')&&(__CLR4_5_2molmollusvmvql.R.iget(30589)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30590)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30591);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30592);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(30593);int LengthOfCopy = end - lastSpecialIndex - 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30594);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                    __CLR4_5_2molmollusvmvql.R.inc(30595);buf[lastSpecialIndex  ] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30596);buf[++lastSpecialIndex] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(30597);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(30598);buf[++lastSpecialIndex] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(30599);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(30600);buf[++lastSpecialIndex] = '9';
                } }else {__CLR4_5_2molmollusvmvql.R.inc(30601);if ((((lastSpecial == '(' || lastSpecial == ')' || lastSpecial == '<' || lastSpecial == '>')&&(__CLR4_5_2molmollusvmvql.R.iget(30602)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30603)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30604);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30605);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(30606);int LengthOfCopy = end - lastSpecialIndex - 1;
                    __CLR4_5_2molmollusvmvql.R.inc(30607);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                    __CLR4_5_2molmollusvmvql.R.inc(30608);buf[lastSpecialIndex] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(30609);buf[++lastSpecialIndex] = 'u';

                    __CLR4_5_2molmollusvmvql.R.inc(30610);final char ch = lastSpecial;
                    __CLR4_5_2molmollusvmvql.R.inc(30611);buf[++lastSpecialIndex] = IOUtils.DIGITS[(ch >>> 12) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30612);buf[++lastSpecialIndex] = IOUtils.DIGITS[(ch >>> 8) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30613);buf[++lastSpecialIndex] = IOUtils.DIGITS[(ch >>> 4) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(30614);buf[++lastSpecialIndex] = IOUtils.DIGITS[ch & 15];
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(30615);final char ch = lastSpecial;
                    __CLR4_5_2molmollusvmvql.R.inc(30616);if ((((ch < IOUtils.specicalFlags_doubleQuotes.length //
                            && IOUtils.specicalFlags_doubleQuotes[ch] == 4)&&(__CLR4_5_2molmollusvmvql.R.iget(30617)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30618)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30619);int srcPos = lastSpecialIndex + 1;
                        __CLR4_5_2molmollusvmvql.R.inc(30620);int destPos = lastSpecialIndex + 6;
                        __CLR4_5_2molmollusvmvql.R.inc(30621);int LengthOfCopy = end - lastSpecialIndex - 1;
                        __CLR4_5_2molmollusvmvql.R.inc(30622);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);

                        __CLR4_5_2molmollusvmvql.R.inc(30623);int bufIndex = lastSpecialIndex;
                        __CLR4_5_2molmollusvmvql.R.inc(30624);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(30625);buf[bufIndex++] = 'u';
                        __CLR4_5_2molmollusvmvql.R.inc(30626);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30627);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30628);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30629);buf[bufIndex++] = IOUtils.DIGITS[ch & 15];
                    } }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(30630);int srcPos = lastSpecialIndex + 1;
                        __CLR4_5_2molmollusvmvql.R.inc(30631);int destPos = lastSpecialIndex + 2;
                        __CLR4_5_2molmollusvmvql.R.inc(30632);int LengthOfCopy = end - lastSpecialIndex - 1;
                        __CLR4_5_2molmollusvmvql.R.inc(30633);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                        __CLR4_5_2molmollusvmvql.R.inc(30634);buf[lastSpecialIndex] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(30635);buf[++lastSpecialIndex] = replaceChars[(int) ch];
                    }
                }}
            }}}} }else {__CLR4_5_2molmollusvmvql.R.inc(30636);if ((((specialCount > 1)&&(__CLR4_5_2molmollusvmvql.R.iget(30637)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30638)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30639);int textIndex = firstSpecialIndex - start;
                __CLR4_5_2molmollusvmvql.R.inc(30640);int bufIndex = firstSpecialIndex;
                __CLR4_5_2molmollusvmvql.R.inc(30641);for (int i = textIndex; (((i < text.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30642)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30643)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30644);char ch = text[i];

                    __CLR4_5_2molmollusvmvql.R.inc(30645);if ((((browserSecure && (ch == '('
                            || ch == ')'
                            || ch == '<'
                            || ch == '>'))&&(__CLR4_5_2molmollusvmvql.R.iget(30646)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30647)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30648);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(30649);buf[bufIndex++] = 'u';
                        __CLR4_5_2molmollusvmvql.R.inc(30650);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30651);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30652);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30653);buf[bufIndex++] = IOUtils.DIGITS[ch & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(30654);end += 5;
                    } }else {__CLR4_5_2molmollusvmvql.R.inc(30655);if ((((ch < IOUtils.specicalFlags_doubleQuotes.length //
                            && IOUtils.specicalFlags_doubleQuotes[ch] != 0 //
                            || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(30656)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30657)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30658);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(30659);if ((((IOUtils.specicalFlags_doubleQuotes[ch] == 4)&&(__CLR4_5_2molmollusvmvql.R.iget(30660)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30661)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30662);buf[bufIndex++] = 'u';
                            __CLR4_5_2molmollusvmvql.R.inc(30663);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30664);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30665);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30666);buf[bufIndex++] = IOUtils.DIGITS[ch & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30667);end += 5;
                        } }else {{
                            __CLR4_5_2molmollusvmvql.R.inc(30668);buf[bufIndex++] = replaceChars[(int) ch];
                            __CLR4_5_2molmollusvmvql.R.inc(30669);end++;
                        }
                    }} }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(30670);if ((((ch == '\u2028' || ch == '\u2029')&&(__CLR4_5_2molmollusvmvql.R.iget(30671)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30672)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(30673);buf[bufIndex++] = '\\';
                            __CLR4_5_2molmollusvmvql.R.inc(30674);buf[bufIndex++] = 'u';
                            __CLR4_5_2molmollusvmvql.R.inc(30675);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30676);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30677);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30678);buf[bufIndex++] = IOUtils.DIGITS[ch & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(30679);end += 5;
                        } }else {{
                            __CLR4_5_2molmollusvmvql.R.inc(30680);buf[bufIndex++] = ch;
                        }
                    }}
                }}}
            }}
        }}}

        }__CLR4_5_2molmollusvmvql.R.inc(30681);if ((((seperator != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30682)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30683)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30684);buf[count - 2] = '\"';
            __CLR4_5_2molmollusvmvql.R.inc(30685);buf[count - 1] = seperator;
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(30686);buf[count - 1] = '\"';
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}
    
    public void writeFieldNameDirect(String text) {try{__CLR4_5_2molmollusvmvql.R.inc(30687);
        __CLR4_5_2molmollusvmvql.R.inc(30688);int len = text.length();
        __CLR4_5_2molmollusvmvql.R.inc(30689);int newcount = count + len + 3;

        __CLR4_5_2molmollusvmvql.R.inc(30690);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30691)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30692)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30693);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30694);int start = count + 1;

        __CLR4_5_2molmollusvmvql.R.inc(30695);buf[count] = '\"';
        __CLR4_5_2molmollusvmvql.R.inc(30696);text.getChars(0, len, buf, start);

        __CLR4_5_2molmollusvmvql.R.inc(30697);count = newcount;
        __CLR4_5_2molmollusvmvql.R.inc(30698);buf[count - 2] = '\"';
        __CLR4_5_2molmollusvmvql.R.inc(30699);buf[count - 1] = ':';
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void write(List<String> list) {try{__CLR4_5_2molmollusvmvql.R.inc(30700);
        __CLR4_5_2molmollusvmvql.R.inc(30701);if ((((list.isEmpty())&&(__CLR4_5_2molmollusvmvql.R.iget(30702)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30703)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30704);write("[]");
            __CLR4_5_2molmollusvmvql.R.inc(30705);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30706);int offset = count;
        __CLR4_5_2molmollusvmvql.R.inc(30707);final int initOffset = offset;
        __CLR4_5_2molmollusvmvql.R.inc(30708);for (int i = 0, list_size = list.size(); (((i < list_size)&&(__CLR4_5_2molmollusvmvql.R.iget(30709)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30710)==0&false)); ++i) {{
            __CLR4_5_2molmollusvmvql.R.inc(30711);String text = list.get(i);

            __CLR4_5_2molmollusvmvql.R.inc(30712);boolean hasSpecial = false;
            __CLR4_5_2molmollusvmvql.R.inc(30713);if ((((text == null)&&(__CLR4_5_2molmollusvmvql.R.iget(30714)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30715)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30716);hasSpecial = true;
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(30717);for (int j = 0, len = text.length(); (((j < len)&&(__CLR4_5_2molmollusvmvql.R.iget(30718)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30719)==0&false)); ++j) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30720);char ch = text.charAt(j);
                    __CLR4_5_2molmollusvmvql.R.inc(30721);if (hasSpecial = (ch < ' ' //
                                      || ch > '~' //
                                      || ch == '"' //
                                      || ch == '\\')) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30724);break;
                    }
                }}
            }}

            }__CLR4_5_2molmollusvmvql.R.inc(30725);if ((((hasSpecial)&&(__CLR4_5_2molmollusvmvql.R.iget(30726)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30727)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30728);count = initOffset;
                __CLR4_5_2molmollusvmvql.R.inc(30729);write('[');
                __CLR4_5_2molmollusvmvql.R.inc(30730);for (int j = 0; (((j < list.size())&&(__CLR4_5_2molmollusvmvql.R.iget(30731)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30732)==0&false)); ++j) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30733);text = list.get(j);
                    __CLR4_5_2molmollusvmvql.R.inc(30734);if ((((j != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30735)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30736)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30737);write(',');
                    }

                    }__CLR4_5_2molmollusvmvql.R.inc(30738);if ((((text == null)&&(__CLR4_5_2molmollusvmvql.R.iget(30739)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30740)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30741);write("null");
                    } }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(30742);writeStringWithDoubleQuote(text, (char) 0);
                    }
                }}
                }__CLR4_5_2molmollusvmvql.R.inc(30743);write(']');
                __CLR4_5_2molmollusvmvql.R.inc(30744);return;
            }

            }__CLR4_5_2molmollusvmvql.R.inc(30745);int newcount = offset + text.length() + 3;
            __CLR4_5_2molmollusvmvql.R.inc(30746);if ((((i == list.size() - 1)&&(__CLR4_5_2molmollusvmvql.R.iget(30747)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30748)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30749);newcount++;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30750);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30751)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30752)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30753);count = offset;
                __CLR4_5_2molmollusvmvql.R.inc(30754);expandCapacity(newcount);
            }

            }__CLR4_5_2molmollusvmvql.R.inc(30755);if ((((i == 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30756)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30757)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30758);buf[offset++] = '[';
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(30759);buf[offset++] = ',';
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30760);buf[offset++] = '"';
            __CLR4_5_2molmollusvmvql.R.inc(30761);text.getChars(0, text.length(), buf, offset);
            __CLR4_5_2molmollusvmvql.R.inc(30762);offset += text.length();
            __CLR4_5_2molmollusvmvql.R.inc(30763);buf[offset++] = '"';
        }
        }__CLR4_5_2molmollusvmvql.R.inc(30764);buf[offset++] = ']';
        __CLR4_5_2molmollusvmvql.R.inc(30765);count = offset;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    
    public void writeFieldValue(char seperator, String name, char value) {try{__CLR4_5_2molmollusvmvql.R.inc(30766);
        __CLR4_5_2molmollusvmvql.R.inc(30767);write(seperator);
        __CLR4_5_2molmollusvmvql.R.inc(30768);writeFieldName(name);
        __CLR4_5_2molmollusvmvql.R.inc(30769);if ((((value == 0)&&(__CLR4_5_2molmollusvmvql.R.iget(30770)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30771)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30772);writeString("\u0000");
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(30773);writeString(Character.toString(value));
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValue(char seperator, String name, boolean value) {try{__CLR4_5_2molmollusvmvql.R.inc(30774);
        __CLR4_5_2molmollusvmvql.R.inc(30775);if ((((!quoteFieldNames)&&(__CLR4_5_2molmollusvmvql.R.iget(30776)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30777)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30778);write(seperator);
            __CLR4_5_2molmollusvmvql.R.inc(30779);writeFieldName(name);
            __CLR4_5_2molmollusvmvql.R.inc(30780);write(value);
            __CLR4_5_2molmollusvmvql.R.inc(30781);return;
        }
        }__CLR4_5_2molmollusvmvql.R.inc(30782);int intSize = (((value )&&(__CLR4_5_2molmollusvmvql.R.iget(30783)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30784)==0&false))? 4 : 5;

        __CLR4_5_2molmollusvmvql.R.inc(30785);int nameLen = name.length();
        __CLR4_5_2molmollusvmvql.R.inc(30786);int newcount = count + nameLen + 4 + intSize;
        __CLR4_5_2molmollusvmvql.R.inc(30787);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30788)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30789)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30790);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(30791)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30792)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30793);write(seperator);
                __CLR4_5_2molmollusvmvql.R.inc(30794);writeString(name);
                __CLR4_5_2molmollusvmvql.R.inc(30795);write(':');
                __CLR4_5_2molmollusvmvql.R.inc(30796);write(value);
                __CLR4_5_2molmollusvmvql.R.inc(30797);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30798);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30799);int start = count;
        __CLR4_5_2molmollusvmvql.R.inc(30800);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(30801);buf[start] = seperator;

        __CLR4_5_2molmollusvmvql.R.inc(30802);int nameEnd = start + nameLen + 1;

        __CLR4_5_2molmollusvmvql.R.inc(30803);buf[start + 1] = keySeperator;

        __CLR4_5_2molmollusvmvql.R.inc(30804);name.getChars(0, nameLen, buf, start + 2);

        __CLR4_5_2molmollusvmvql.R.inc(30805);buf[nameEnd + 1] = keySeperator;

        __CLR4_5_2molmollusvmvql.R.inc(30806);if ((((value)&&(__CLR4_5_2molmollusvmvql.R.iget(30807)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30808)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30809);System.arraycopy(":true".toCharArray(), 0, buf, nameEnd + 2, 5);
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(30810);System.arraycopy(":false".toCharArray(), 0, buf, nameEnd + 2, 6);
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void write(boolean value) {try{__CLR4_5_2molmollusvmvql.R.inc(30811);
        __CLR4_5_2molmollusvmvql.R.inc(30812);if ((((value)&&(__CLR4_5_2molmollusvmvql.R.iget(30813)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30814)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30815);write("true");
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(30816);write("false");
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValue(char seperator, String name, int value) {try{__CLR4_5_2molmollusvmvql.R.inc(30817);
        __CLR4_5_2molmollusvmvql.R.inc(30818);if ((((value == Integer.MIN_VALUE || !quoteFieldNames)&&(__CLR4_5_2molmollusvmvql.R.iget(30819)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30820)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30821);write(seperator);
            __CLR4_5_2molmollusvmvql.R.inc(30822);writeFieldName(name);
            __CLR4_5_2molmollusvmvql.R.inc(30823);writeInt(value);
            __CLR4_5_2molmollusvmvql.R.inc(30824);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30825);int intSize = ((((value < 0) )&&(__CLR4_5_2molmollusvmvql.R.iget(30826)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30827)==0&false))? IOUtils.stringSize(-value) + 1 : IOUtils.stringSize(value);

        __CLR4_5_2molmollusvmvql.R.inc(30828);int nameLen = name.length();
        __CLR4_5_2molmollusvmvql.R.inc(30829);int newcount = count + nameLen + 4 + intSize;
        __CLR4_5_2molmollusvmvql.R.inc(30830);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30831)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30832)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30833);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(30834)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30835)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30836);write(seperator);
                __CLR4_5_2molmollusvmvql.R.inc(30837);writeFieldName(name);
                __CLR4_5_2molmollusvmvql.R.inc(30838);writeInt(value);
                __CLR4_5_2molmollusvmvql.R.inc(30839);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30840);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30841);int start = count;
        __CLR4_5_2molmollusvmvql.R.inc(30842);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(30843);buf[start] = seperator;

        __CLR4_5_2molmollusvmvql.R.inc(30844);int nameEnd = start + nameLen + 1;

        __CLR4_5_2molmollusvmvql.R.inc(30845);buf[start + 1] = keySeperator;

        __CLR4_5_2molmollusvmvql.R.inc(30846);name.getChars(0, nameLen, buf, start + 2);

        __CLR4_5_2molmollusvmvql.R.inc(30847);buf[nameEnd + 1] = keySeperator;
        __CLR4_5_2molmollusvmvql.R.inc(30848);buf[nameEnd + 2] = ':';

        __CLR4_5_2molmollusvmvql.R.inc(30849);IOUtils.getChars(value, count, buf);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValue(char seperator, String name, long value) {try{__CLR4_5_2molmollusvmvql.R.inc(30850);
        __CLR4_5_2molmollusvmvql.R.inc(30851);if ((((value == Long.MIN_VALUE
                || !quoteFieldNames
                || isEnabled(SerializerFeature.BrowserCompatible.mask)
        )&&(__CLR4_5_2molmollusvmvql.R.iget(30852)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30853)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30854);write(seperator);
            __CLR4_5_2molmollusvmvql.R.inc(30855);writeFieldName(name);
            __CLR4_5_2molmollusvmvql.R.inc(30856);writeLong(value);
            __CLR4_5_2molmollusvmvql.R.inc(30857);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30858);int intSize = ((((value < 0) )&&(__CLR4_5_2molmollusvmvql.R.iget(30859)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30860)==0&false))? IOUtils.stringSize(-value) + 1 : IOUtils.stringSize(value);

        __CLR4_5_2molmollusvmvql.R.inc(30861);int nameLen = name.length();
        __CLR4_5_2molmollusvmvql.R.inc(30862);int newcount = count + nameLen + 4 + intSize;
        __CLR4_5_2molmollusvmvql.R.inc(30863);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30864)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30865)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30866);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(30867)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30868)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30869);write(seperator);
                __CLR4_5_2molmollusvmvql.R.inc(30870);writeFieldName(name);
                __CLR4_5_2molmollusvmvql.R.inc(30871);writeLong(value);
                __CLR4_5_2molmollusvmvql.R.inc(30872);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30873);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30874);int start = count;
        __CLR4_5_2molmollusvmvql.R.inc(30875);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(30876);buf[start] = seperator;

        __CLR4_5_2molmollusvmvql.R.inc(30877);int nameEnd = start + nameLen + 1;

        __CLR4_5_2molmollusvmvql.R.inc(30878);buf[start + 1] = keySeperator;

        __CLR4_5_2molmollusvmvql.R.inc(30879);name.getChars(0, nameLen, buf, start + 2);

        __CLR4_5_2molmollusvmvql.R.inc(30880);buf[nameEnd + 1] = keySeperator;
        __CLR4_5_2molmollusvmvql.R.inc(30881);buf[nameEnd + 2] = ':';

        __CLR4_5_2molmollusvmvql.R.inc(30882);IOUtils.getChars(value, count, buf);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValue(char seperator, String name, float value) {try{__CLR4_5_2molmollusvmvql.R.inc(30883);
        __CLR4_5_2molmollusvmvql.R.inc(30884);write(seperator);
        __CLR4_5_2molmollusvmvql.R.inc(30885);writeFieldName(name);
        __CLR4_5_2molmollusvmvql.R.inc(30886);writeFloat(value, false);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValue(char seperator, String name, double value) {try{__CLR4_5_2molmollusvmvql.R.inc(30887);
        __CLR4_5_2molmollusvmvql.R.inc(30888);write(seperator);
        __CLR4_5_2molmollusvmvql.R.inc(30889);writeFieldName(name);
        __CLR4_5_2molmollusvmvql.R.inc(30890);writeDouble(value, false);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValue(char seperator, String name, String value) {try{__CLR4_5_2molmollusvmvql.R.inc(30891);
        __CLR4_5_2molmollusvmvql.R.inc(30892);if ((((quoteFieldNames)&&(__CLR4_5_2molmollusvmvql.R.iget(30893)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30894)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30895);if ((((useSingleQuotes)&&(__CLR4_5_2molmollusvmvql.R.iget(30896)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30897)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30898);write(seperator);
                __CLR4_5_2molmollusvmvql.R.inc(30899);writeFieldName(name);
                __CLR4_5_2molmollusvmvql.R.inc(30900);if ((((value == null)&&(__CLR4_5_2molmollusvmvql.R.iget(30901)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30902)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30903);writeNull();
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(30904);writeString(value);
                }
            }} }else {{
                __CLR4_5_2molmollusvmvql.R.inc(30905);if ((((isEnabled(SerializerFeature.BrowserCompatible))&&(__CLR4_5_2molmollusvmvql.R.iget(30906)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30907)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30908);write(seperator);
                    __CLR4_5_2molmollusvmvql.R.inc(30909);writeStringWithDoubleQuote(name, ':');
                    __CLR4_5_2molmollusvmvql.R.inc(30910);writeStringWithDoubleQuote(value, (char) 0);
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(30911);writeFieldValueStringWithDoubleQuoteCheck(seperator, name, value);
                }
            }}
        }} }else {{
            __CLR4_5_2molmollusvmvql.R.inc(30912);write(seperator);
            __CLR4_5_2molmollusvmvql.R.inc(30913);writeFieldName(name);
            __CLR4_5_2molmollusvmvql.R.inc(30914);if ((((value == null)&&(__CLR4_5_2molmollusvmvql.R.iget(30915)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30916)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30917);writeNull();
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(30918);writeString(value);
            }
        }}
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValueStringWithDoubleQuoteCheck(char seperator, String name, String value) {try{__CLR4_5_2molmollusvmvql.R.inc(30919);
        __CLR4_5_2molmollusvmvql.R.inc(30920);int nameLen = name.length();
        __CLR4_5_2molmollusvmvql.R.inc(30921);int valueLen;

        __CLR4_5_2molmollusvmvql.R.inc(30922);int newcount = count;

        __CLR4_5_2molmollusvmvql.R.inc(30923);if ((((value == null)&&(__CLR4_5_2molmollusvmvql.R.iget(30924)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30925)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30926);valueLen = 4;
            __CLR4_5_2molmollusvmvql.R.inc(30927);newcount += nameLen + 8;
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(30928);valueLen = value.length();
            __CLR4_5_2molmollusvmvql.R.inc(30929);newcount += nameLen + valueLen + 6;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30930);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(30931)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30932)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30933);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(30934)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30935)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30936);write(seperator);
                __CLR4_5_2molmollusvmvql.R.inc(30937);writeStringWithDoubleQuote(name, ':');
                __CLR4_5_2molmollusvmvql.R.inc(30938);writeStringWithDoubleQuote(value, (char) 0);
                __CLR4_5_2molmollusvmvql.R.inc(30939);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(30940);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30941);buf[count] = seperator;

        __CLR4_5_2molmollusvmvql.R.inc(30942);int nameStart = count + 2;
        __CLR4_5_2molmollusvmvql.R.inc(30943);int nameEnd = nameStart + nameLen;

        __CLR4_5_2molmollusvmvql.R.inc(30944);buf[count + 1] = '\"';
        __CLR4_5_2molmollusvmvql.R.inc(30945);name.getChars(0, nameLen, buf, nameStart);

        __CLR4_5_2molmollusvmvql.R.inc(30946);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(30947);buf[nameEnd] = '\"';

        __CLR4_5_2molmollusvmvql.R.inc(30948);int index = nameEnd + 1;
        __CLR4_5_2molmollusvmvql.R.inc(30949);buf[index++] = ':';

        __CLR4_5_2molmollusvmvql.R.inc(30950);if ((((value == null)&&(__CLR4_5_2molmollusvmvql.R.iget(30951)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30952)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(30953);buf[index++] = 'n';
            __CLR4_5_2molmollusvmvql.R.inc(30954);buf[index++] = 'u';
            __CLR4_5_2molmollusvmvql.R.inc(30955);buf[index++] = 'l';
            __CLR4_5_2molmollusvmvql.R.inc(30956);buf[index++] = 'l';
            __CLR4_5_2molmollusvmvql.R.inc(30957);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(30958);buf[index++] = '"';

        __CLR4_5_2molmollusvmvql.R.inc(30959);int valueStart = index;
        __CLR4_5_2molmollusvmvql.R.inc(30960);int valueEnd = valueStart + valueLen;

        __CLR4_5_2molmollusvmvql.R.inc(30961);value.getChars(0, valueLen, buf, valueStart);

        __CLR4_5_2molmollusvmvql.R.inc(30962);int specialCount = 0;
        __CLR4_5_2molmollusvmvql.R.inc(30963);int lastSpecialIndex = -1;
        __CLR4_5_2molmollusvmvql.R.inc(30964);int firstSpecialIndex = -1;
        __CLR4_5_2molmollusvmvql.R.inc(30965);char lastSpecial = '\0';

        __CLR4_5_2molmollusvmvql.R.inc(30966);for (int i = valueStart; (((i < valueEnd)&&(__CLR4_5_2molmollusvmvql.R.iget(30967)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30968)==0&false)); ++i) {{
            __CLR4_5_2molmollusvmvql.R.inc(30969);char ch = buf[i];

            __CLR4_5_2molmollusvmvql.R.inc(30970);if ((((ch >= ']')&&(__CLR4_5_2molmollusvmvql.R.iget(30971)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30972)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30973);if ((((ch >= 0x7F //
                    && (ch == '\u2028' //
                        || ch == '\u2029' //
                        || ch < 0xA0))&&(__CLR4_5_2molmollusvmvql.R.iget(30974)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30975)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30976);if ((((firstSpecialIndex == -1)&&(__CLR4_5_2molmollusvmvql.R.iget(30977)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30978)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(30979);firstSpecialIndex = i;
                    }

                    }__CLR4_5_2molmollusvmvql.R.inc(30980);specialCount++;
                    __CLR4_5_2molmollusvmvql.R.inc(30981);lastSpecialIndex = i;
                    __CLR4_5_2molmollusvmvql.R.inc(30982);lastSpecial = ch;
                    __CLR4_5_2molmollusvmvql.R.inc(30983);newcount += 4;
                }
                }__CLR4_5_2molmollusvmvql.R.inc(30984);continue;
            }

            }__CLR4_5_2molmollusvmvql.R.inc(30985);boolean special = (ch < 64 && (sepcialBits & (1L << ch)) != 0) || ch == '\\';
            __CLR4_5_2molmollusvmvql.R.inc(30986);if ((((special)&&(__CLR4_5_2molmollusvmvql.R.iget(30987)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30988)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(30989);specialCount++;
                __CLR4_5_2molmollusvmvql.R.inc(30990);lastSpecialIndex = i;
                __CLR4_5_2molmollusvmvql.R.inc(30991);lastSpecial = ch;

                __CLR4_5_2molmollusvmvql.R.inc(30992);if ((((ch == '('
                        || ch == ')'
                        || ch == '<'
                        || ch == '>'
                        || (ch < IOUtils.specicalFlags_doubleQuotes.length //
                        && IOUtils.specicalFlags_doubleQuotes[ch] == 4) //
                        )&&(__CLR4_5_2molmollusvmvql.R.iget(30993)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30994)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30995);newcount += 4;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(30996);if ((((firstSpecialIndex == -1)&&(__CLR4_5_2molmollusvmvql.R.iget(30997)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(30998)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(30999);firstSpecialIndex = i;
                }
            }}
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(31000);if ((((specialCount > 0)&&(__CLR4_5_2molmollusvmvql.R.iget(31001)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31002)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31003);newcount += specialCount;
            __CLR4_5_2molmollusvmvql.R.inc(31004);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31005)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31006)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31007);expandCapacity(newcount);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(31008);count = newcount;

            __CLR4_5_2molmollusvmvql.R.inc(31009);if ((((specialCount == 1)&&(__CLR4_5_2molmollusvmvql.R.iget(31010)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31011)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31012);if ((((lastSpecial == '\u2028')&&(__CLR4_5_2molmollusvmvql.R.iget(31013)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31014)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31015);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(31016);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(31017);int LengthOfCopy = valueEnd - lastSpecialIndex - 1;
                    __CLR4_5_2molmollusvmvql.R.inc(31018);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                    __CLR4_5_2molmollusvmvql.R.inc(31019);buf[lastSpecialIndex] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(31020);buf[++lastSpecialIndex] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(31021);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(31022);buf[++lastSpecialIndex] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(31023);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(31024);buf[++lastSpecialIndex] = '8';
                } }else {__CLR4_5_2molmollusvmvql.R.inc(31025);if ((((lastSpecial == '\u2029')&&(__CLR4_5_2molmollusvmvql.R.iget(31026)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31027)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31028);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(31029);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(31030);int LengthOfCopy = valueEnd - lastSpecialIndex - 1;
                    __CLR4_5_2molmollusvmvql.R.inc(31031);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                    __CLR4_5_2molmollusvmvql.R.inc(31032);buf[lastSpecialIndex] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(31033);buf[++lastSpecialIndex] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(31034);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(31035);buf[++lastSpecialIndex] = '0';
                    __CLR4_5_2molmollusvmvql.R.inc(31036);buf[++lastSpecialIndex] = '2';
                    __CLR4_5_2molmollusvmvql.R.inc(31037);buf[++lastSpecialIndex] = '9';
                } }else {__CLR4_5_2molmollusvmvql.R.inc(31038);if ((((lastSpecial == '(' || lastSpecial == ')' || lastSpecial == '<' || lastSpecial == '>')&&(__CLR4_5_2molmollusvmvql.R.iget(31039)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31040)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31041);final char ch = lastSpecial;
                    __CLR4_5_2molmollusvmvql.R.inc(31042);int srcPos = lastSpecialIndex + 1;
                    __CLR4_5_2molmollusvmvql.R.inc(31043);int destPos = lastSpecialIndex + 6;
                    __CLR4_5_2molmollusvmvql.R.inc(31044);int LengthOfCopy = valueEnd - lastSpecialIndex - 1;
                    __CLR4_5_2molmollusvmvql.R.inc(31045);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);

                    __CLR4_5_2molmollusvmvql.R.inc(31046);int bufIndex = lastSpecialIndex;
                    __CLR4_5_2molmollusvmvql.R.inc(31047);buf[bufIndex++] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(31048);buf[bufIndex++] = 'u';
                    __CLR4_5_2molmollusvmvql.R.inc(31049);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(31050);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(31051);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4) & 15];
                    __CLR4_5_2molmollusvmvql.R.inc(31052);buf[bufIndex++] = IOUtils.DIGITS[ch & 15];
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(31053);final char ch = lastSpecial;
                    __CLR4_5_2molmollusvmvql.R.inc(31054);if ((((ch < IOUtils.specicalFlags_doubleQuotes.length //
                        && IOUtils.specicalFlags_doubleQuotes[ch] == 4)&&(__CLR4_5_2molmollusvmvql.R.iget(31055)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31056)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31057);int srcPos = lastSpecialIndex + 1;
                        __CLR4_5_2molmollusvmvql.R.inc(31058);int destPos = lastSpecialIndex + 6;
                        __CLR4_5_2molmollusvmvql.R.inc(31059);int LengthOfCopy = valueEnd - lastSpecialIndex - 1;
                        __CLR4_5_2molmollusvmvql.R.inc(31060);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);

                        __CLR4_5_2molmollusvmvql.R.inc(31061);int bufIndex = lastSpecialIndex;
                        __CLR4_5_2molmollusvmvql.R.inc(31062);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(31063);buf[bufIndex++] = 'u';
                        __CLR4_5_2molmollusvmvql.R.inc(31064);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(31065);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(31066);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(31067);buf[bufIndex++] = IOUtils.DIGITS[ch & 15];
                    } }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(31068);int srcPos = lastSpecialIndex + 1;
                        __CLR4_5_2molmollusvmvql.R.inc(31069);int destPos = lastSpecialIndex + 2;
                        __CLR4_5_2molmollusvmvql.R.inc(31070);int LengthOfCopy = valueEnd - lastSpecialIndex - 1;
                        __CLR4_5_2molmollusvmvql.R.inc(31071);System.arraycopy(buf, srcPos, buf, destPos, LengthOfCopy);
                        __CLR4_5_2molmollusvmvql.R.inc(31072);buf[lastSpecialIndex] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(31073);buf[++lastSpecialIndex] = replaceChars[(int) ch];
                    }
                }}
            }}}} }else {__CLR4_5_2molmollusvmvql.R.inc(31074);if ((((specialCount > 1)&&(__CLR4_5_2molmollusvmvql.R.iget(31075)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31076)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31077);int textIndex = firstSpecialIndex - valueStart;
                __CLR4_5_2molmollusvmvql.R.inc(31078);int bufIndex = firstSpecialIndex;
                __CLR4_5_2molmollusvmvql.R.inc(31079);for (int i = textIndex; (((i < value.length())&&(__CLR4_5_2molmollusvmvql.R.iget(31080)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31081)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31082);char ch = value.charAt(i);

                    __CLR4_5_2molmollusvmvql.R.inc(31083);if ((((browserSecure && (ch == '('
                            || ch == ')'
                            || ch == '<'
                            || ch == '>'))&&(__CLR4_5_2molmollusvmvql.R.iget(31084)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31085)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31086);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(31087);buf[bufIndex++] = 'u';
                        __CLR4_5_2molmollusvmvql.R.inc(31088);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(31089);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 8 ) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(31090);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 4 ) & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(31091);buf[bufIndex++] = IOUtils.DIGITS[ch          & 15];
                        __CLR4_5_2molmollusvmvql.R.inc(31092);valueEnd += 5;
                    } }else {__CLR4_5_2molmollusvmvql.R.inc(31093);if ((((ch < IOUtils.specicalFlags_doubleQuotes.length //
                        && IOUtils.specicalFlags_doubleQuotes[ch] != 0 //
                        || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(31094)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31095)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31096);buf[bufIndex++] = '\\';
                        __CLR4_5_2molmollusvmvql.R.inc(31097);if ((((IOUtils.specicalFlags_doubleQuotes[ch] == 4)&&(__CLR4_5_2molmollusvmvql.R.iget(31098)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31099)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(31100);buf[bufIndex++] = 'u';
                            __CLR4_5_2molmollusvmvql.R.inc(31101);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(31102);buf[bufIndex++] = IOUtils.DIGITS[(ch >>>  8) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(31103);buf[bufIndex++] = IOUtils.DIGITS[(ch >>>  4) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(31104);buf[bufIndex++] = IOUtils.DIGITS[ch          & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(31105);valueEnd += 5;
                        } }else {{
                            __CLR4_5_2molmollusvmvql.R.inc(31106);buf[bufIndex++] = replaceChars[(int) ch];
                            __CLR4_5_2molmollusvmvql.R.inc(31107);valueEnd++;
                        }
                    }} }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(31108);if ((((ch == '\u2028' || ch == '\u2029')&&(__CLR4_5_2molmollusvmvql.R.iget(31109)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31110)==0&false))) {{
                            __CLR4_5_2molmollusvmvql.R.inc(31111);buf[bufIndex++] = '\\';
                            __CLR4_5_2molmollusvmvql.R.inc(31112);buf[bufIndex++] = 'u';
                            __CLR4_5_2molmollusvmvql.R.inc(31113);buf[bufIndex++] = IOUtils.DIGITS[(ch >>> 12) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(31114);buf[bufIndex++] = IOUtils.DIGITS[(ch >>>  8) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(31115);buf[bufIndex++] = IOUtils.DIGITS[(ch >>>  4) & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(31116);buf[bufIndex++] = IOUtils.DIGITS[ch          & 15];
                            __CLR4_5_2molmollusvmvql.R.inc(31117);valueEnd += 5;
                        } }else {{
                            __CLR4_5_2molmollusvmvql.R.inc(31118);buf[bufIndex++] = ch;
                        }
                    }}
                }}}
            }}
        }}}
        

        }__CLR4_5_2molmollusvmvql.R.inc(31119);buf[count - 1] = '\"';
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValueStringWithDoubleQuote(char seperator, String name, String value) {try{__CLR4_5_2molmollusvmvql.R.inc(31120);
        __CLR4_5_2molmollusvmvql.R.inc(31121);int nameLen = name.length();
        __CLR4_5_2molmollusvmvql.R.inc(31122);int valueLen;

        __CLR4_5_2molmollusvmvql.R.inc(31123);int newcount = count;

        __CLR4_5_2molmollusvmvql.R.inc(31124);valueLen = value.length();
        __CLR4_5_2molmollusvmvql.R.inc(31125);newcount += nameLen + valueLen + 6;

        __CLR4_5_2molmollusvmvql.R.inc(31126);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31127)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31128)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31129);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(31130)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31131)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31132);write(seperator);
                __CLR4_5_2molmollusvmvql.R.inc(31133);writeStringWithDoubleQuote(name, ':');
                __CLR4_5_2molmollusvmvql.R.inc(31134);writeStringWithDoubleQuote(value, (char) 0);
                __CLR4_5_2molmollusvmvql.R.inc(31135);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(31136);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31137);buf[count] = seperator;

        __CLR4_5_2molmollusvmvql.R.inc(31138);int nameStart = count + 2;
        __CLR4_5_2molmollusvmvql.R.inc(31139);int nameEnd = nameStart + nameLen;

        __CLR4_5_2molmollusvmvql.R.inc(31140);buf[count + 1] = '\"';
        __CLR4_5_2molmollusvmvql.R.inc(31141);name.getChars(0, nameLen, buf, nameStart);

        __CLR4_5_2molmollusvmvql.R.inc(31142);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(31143);buf[nameEnd] = '\"';

        __CLR4_5_2molmollusvmvql.R.inc(31144);int index = nameEnd + 1;
        __CLR4_5_2molmollusvmvql.R.inc(31145);buf[index++] = ':';
        __CLR4_5_2molmollusvmvql.R.inc(31146);buf[index++] = '"';

        __CLR4_5_2molmollusvmvql.R.inc(31147);int valueStart = index;
        __CLR4_5_2molmollusvmvql.R.inc(31148);value.getChars(0, valueLen, buf, valueStart);
        __CLR4_5_2molmollusvmvql.R.inc(31149);buf[count - 1] = '\"';
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}


    
    public void writeFieldValue(char seperator, String name, Enum<?> value) {try{__CLR4_5_2molmollusvmvql.R.inc(31150);
        __CLR4_5_2molmollusvmvql.R.inc(31151);if ((((value == null)&&(__CLR4_5_2molmollusvmvql.R.iget(31152)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31153)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31154);write(seperator);
            __CLR4_5_2molmollusvmvql.R.inc(31155);writeFieldName(name);
            __CLR4_5_2molmollusvmvql.R.inc(31156);writeNull();
            __CLR4_5_2molmollusvmvql.R.inc(31157);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31158);if ((((writeEnumUsingName && !writeEnumUsingToString)&&(__CLR4_5_2molmollusvmvql.R.iget(31159)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31160)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31161);writeEnumFieldValue(seperator, name, value.name());
        } }else {__CLR4_5_2molmollusvmvql.R.inc(31162);if ((((writeEnumUsingToString)&&(__CLR4_5_2molmollusvmvql.R.iget(31163)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31164)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31165);writeEnumFieldValue(seperator, name, value.toString());
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(31166);writeFieldValue(seperator, name, value.ordinal());
        }
    }}}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    private void writeEnumFieldValue(char seperator, String name, String value) {try{__CLR4_5_2molmollusvmvql.R.inc(31167);
        __CLR4_5_2molmollusvmvql.R.inc(31168);if ((((useSingleQuotes)&&(__CLR4_5_2molmollusvmvql.R.iget(31169)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31170)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31171);writeFieldValue(seperator, name, value);
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(31172);writeFieldValueStringWithDoubleQuote(seperator, name, value);
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldValue(char seperator, String name, BigDecimal value) {try{__CLR4_5_2molmollusvmvql.R.inc(31173);
        __CLR4_5_2molmollusvmvql.R.inc(31174);write(seperator);
        __CLR4_5_2molmollusvmvql.R.inc(31175);writeFieldName(name);
        __CLR4_5_2molmollusvmvql.R.inc(31176);if ((((value == null)&&(__CLR4_5_2molmollusvmvql.R.iget(31177)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31178)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31179);writeNull();
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(31180);int scale = value.scale();
            __CLR4_5_2molmollusvmvql.R.inc(31181);write((((isEnabled(SerializerFeature.WriteBigDecimalAsPlain) && scale >= -100 && scale < 100
                    )&&(__CLR4_5_2molmollusvmvql.R.iget(31182)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31183)==0&false))? value.toPlainString()
                    : value.toString()
            );
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeString(String text, char seperator) {try{__CLR4_5_2molmollusvmvql.R.inc(31184);
        __CLR4_5_2molmollusvmvql.R.inc(31185);if ((((useSingleQuotes)&&(__CLR4_5_2molmollusvmvql.R.iget(31186)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31187)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31188);writeStringWithSingleQuote(text);
            __CLR4_5_2molmollusvmvql.R.inc(31189);write(seperator);
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(31190);writeStringWithDoubleQuote(text, seperator);
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeString(String text) {try{__CLR4_5_2molmollusvmvql.R.inc(31191);
        __CLR4_5_2molmollusvmvql.R.inc(31192);if ((((useSingleQuotes)&&(__CLR4_5_2molmollusvmvql.R.iget(31193)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31194)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31195);writeStringWithSingleQuote(text);
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(31196);writeStringWithDoubleQuote(text, (char) 0);
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeString(char[] chars) {try{__CLR4_5_2molmollusvmvql.R.inc(31197);
        __CLR4_5_2molmollusvmvql.R.inc(31198);if ((((useSingleQuotes)&&(__CLR4_5_2molmollusvmvql.R.iget(31199)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31200)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31201);writeStringWithSingleQuote(chars);
        } }else {{
            __CLR4_5_2molmollusvmvql.R.inc(31202);String text = new String(chars);
            __CLR4_5_2molmollusvmvql.R.inc(31203);writeStringWithDoubleQuote(text, (char) 0);
        }
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    protected void writeStringWithSingleQuote(String text) {try{__CLR4_5_2molmollusvmvql.R.inc(31204);
        __CLR4_5_2molmollusvmvql.R.inc(31205);if ((((text == null)&&(__CLR4_5_2molmollusvmvql.R.iget(31206)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31207)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31208);int newcount = count + 4;
            __CLR4_5_2molmollusvmvql.R.inc(31209);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31210)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31211)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31212);expandCapacity(newcount);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(31213);"null".getChars(0, 4, buf, count);
            __CLR4_5_2molmollusvmvql.R.inc(31214);count = newcount;
            __CLR4_5_2molmollusvmvql.R.inc(31215);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31216);int len = text.length();
        __CLR4_5_2molmollusvmvql.R.inc(31217);int newcount = count + len + 2;
        __CLR4_5_2molmollusvmvql.R.inc(31218);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31219)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31220)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31221);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(31222)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31223)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31224);write('\'');
                __CLR4_5_2molmollusvmvql.R.inc(31225);for (int i = 0; (((i < text.length())&&(__CLR4_5_2molmollusvmvql.R.iget(31226)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31227)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31228);char ch = text.charAt(i);
                    __CLR4_5_2molmollusvmvql.R.inc(31229);if ((((ch <= 13 || ch == '\\' || ch == '\'' //
                        || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(31230)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31231)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31232);write('\\');
                        __CLR4_5_2molmollusvmvql.R.inc(31233);write(replaceChars[(int) ch]);
                    } }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(31234);write(ch);
                    }
                }}
                }__CLR4_5_2molmollusvmvql.R.inc(31235);write('\'');
                __CLR4_5_2molmollusvmvql.R.inc(31236);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(31237);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31238);int start = count + 1;
        __CLR4_5_2molmollusvmvql.R.inc(31239);int end = start + len;

        __CLR4_5_2molmollusvmvql.R.inc(31240);buf[count] = '\'';
        __CLR4_5_2molmollusvmvql.R.inc(31241);text.getChars(0, len, buf, start);
        __CLR4_5_2molmollusvmvql.R.inc(31242);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(31243);int specialCount = 0;
        __CLR4_5_2molmollusvmvql.R.inc(31244);int lastSpecialIndex = -1;
        __CLR4_5_2molmollusvmvql.R.inc(31245);char lastSpecial = '\0';
        __CLR4_5_2molmollusvmvql.R.inc(31246);for (int i = start; (((i < end)&&(__CLR4_5_2molmollusvmvql.R.iget(31247)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31248)==0&false)); ++i) {{
            __CLR4_5_2molmollusvmvql.R.inc(31249);char ch = buf[i];
            __CLR4_5_2molmollusvmvql.R.inc(31250);if ((((ch <= 13 || ch == '\\' || ch == '\'' //
                || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(31251)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31252)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31253);specialCount++;
                __CLR4_5_2molmollusvmvql.R.inc(31254);lastSpecialIndex = i;
                __CLR4_5_2molmollusvmvql.R.inc(31255);lastSpecial = ch;
            }
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(31256);newcount += specialCount;
        __CLR4_5_2molmollusvmvql.R.inc(31257);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31258)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31259)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31260);expandCapacity(newcount);
        }
        }__CLR4_5_2molmollusvmvql.R.inc(31261);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(31262);if ((((specialCount == 1)&&(__CLR4_5_2molmollusvmvql.R.iget(31263)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31264)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31265);System.arraycopy(buf, lastSpecialIndex + 1, buf, lastSpecialIndex + 2, end - lastSpecialIndex - 1);
            __CLR4_5_2molmollusvmvql.R.inc(31266);buf[lastSpecialIndex] = '\\';
            __CLR4_5_2molmollusvmvql.R.inc(31267);buf[++lastSpecialIndex] = replaceChars[(int) lastSpecial];
        } }else {__CLR4_5_2molmollusvmvql.R.inc(31268);if ((((specialCount > 1)&&(__CLR4_5_2molmollusvmvql.R.iget(31269)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31270)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31271);System.arraycopy(buf, lastSpecialIndex + 1, buf, lastSpecialIndex + 2, end - lastSpecialIndex - 1);
            __CLR4_5_2molmollusvmvql.R.inc(31272);buf[lastSpecialIndex] = '\\';
            __CLR4_5_2molmollusvmvql.R.inc(31273);buf[++lastSpecialIndex] = replaceChars[(int) lastSpecial];
            __CLR4_5_2molmollusvmvql.R.inc(31274);end++;
            __CLR4_5_2molmollusvmvql.R.inc(31275);for (int i = lastSpecialIndex - 2; (((i >= start)&&(__CLR4_5_2molmollusvmvql.R.iget(31276)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31277)==0&false)); --i) {{
                __CLR4_5_2molmollusvmvql.R.inc(31278);char ch = buf[i];

                __CLR4_5_2molmollusvmvql.R.inc(31279);if ((((ch <= 13 || ch == '\\' || ch == '\'' //
                    || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(31280)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31281)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31282);System.arraycopy(buf, i + 1, buf, i + 2, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(31283);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(31284);buf[i + 1] = replaceChars[(int) ch];
                    __CLR4_5_2molmollusvmvql.R.inc(31285);end++;
                }
            }}
        }}

        }}__CLR4_5_2molmollusvmvql.R.inc(31286);buf[count - 1] = '\'';
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    protected void writeStringWithSingleQuote(char[] chars) {try{__CLR4_5_2molmollusvmvql.R.inc(31287);
        __CLR4_5_2molmollusvmvql.R.inc(31288);if ((((chars == null)&&(__CLR4_5_2molmollusvmvql.R.iget(31289)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31290)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31291);int newcount = count + 4;
            __CLR4_5_2molmollusvmvql.R.inc(31292);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31293)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31294)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31295);expandCapacity(newcount);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(31296);"null".getChars(0, 4, buf, count);
            __CLR4_5_2molmollusvmvql.R.inc(31297);count = newcount;
            __CLR4_5_2molmollusvmvql.R.inc(31298);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31299);int len = chars.length;
        __CLR4_5_2molmollusvmvql.R.inc(31300);int newcount = count + len + 2;
        __CLR4_5_2molmollusvmvql.R.inc(31301);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31302)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31303)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31304);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(31305)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31306)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31307);write('\'');
                __CLR4_5_2molmollusvmvql.R.inc(31308);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31309)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31310)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31311);char ch = chars[i];
                    __CLR4_5_2molmollusvmvql.R.inc(31312);if ((((ch <= 13 || ch == '\\' || ch == '\'' //
                            || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(31313)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31314)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31315);write('\\');
                        __CLR4_5_2molmollusvmvql.R.inc(31316);write(replaceChars[(int) ch]);
                    } }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(31317);write(ch);
                    }
                }}
                }__CLR4_5_2molmollusvmvql.R.inc(31318);write('\'');
                __CLR4_5_2molmollusvmvql.R.inc(31319);return;
            }
            }__CLR4_5_2molmollusvmvql.R.inc(31320);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31321);int start = count + 1;
        __CLR4_5_2molmollusvmvql.R.inc(31322);int end = start + len;

        __CLR4_5_2molmollusvmvql.R.inc(31323);buf[count] = '\'';
//        text.getChars(0, len, buf, start);
        __CLR4_5_2molmollusvmvql.R.inc(31324);System.arraycopy(chars, 0, buf, start, chars.length);
        __CLR4_5_2molmollusvmvql.R.inc(31325);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(31326);int specialCount = 0;
        __CLR4_5_2molmollusvmvql.R.inc(31327);int lastSpecialIndex = -1;
        __CLR4_5_2molmollusvmvql.R.inc(31328);char lastSpecial = '\0';
        __CLR4_5_2molmollusvmvql.R.inc(31329);for (int i = start; (((i < end)&&(__CLR4_5_2molmollusvmvql.R.iget(31330)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31331)==0&false)); ++i) {{
            __CLR4_5_2molmollusvmvql.R.inc(31332);char ch = buf[i];
            __CLR4_5_2molmollusvmvql.R.inc(31333);if ((((ch <= 13 || ch == '\\' || ch == '\'' //
                    || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(31334)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31335)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31336);specialCount++;
                __CLR4_5_2molmollusvmvql.R.inc(31337);lastSpecialIndex = i;
                __CLR4_5_2molmollusvmvql.R.inc(31338);lastSpecial = ch;
            }
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(31339);newcount += specialCount;
        __CLR4_5_2molmollusvmvql.R.inc(31340);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31341)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31342)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31343);expandCapacity(newcount);
        }
        }__CLR4_5_2molmollusvmvql.R.inc(31344);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(31345);if ((((specialCount == 1)&&(__CLR4_5_2molmollusvmvql.R.iget(31346)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31347)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31348);System.arraycopy(buf, lastSpecialIndex + 1, buf, lastSpecialIndex + 2, end - lastSpecialIndex - 1);
            __CLR4_5_2molmollusvmvql.R.inc(31349);buf[lastSpecialIndex] = '\\';
            __CLR4_5_2molmollusvmvql.R.inc(31350);buf[++lastSpecialIndex] = replaceChars[(int) lastSpecial];
        } }else {__CLR4_5_2molmollusvmvql.R.inc(31351);if ((((specialCount > 1)&&(__CLR4_5_2molmollusvmvql.R.iget(31352)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31353)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31354);System.arraycopy(buf, lastSpecialIndex + 1, buf, lastSpecialIndex + 2, end - lastSpecialIndex - 1);
            __CLR4_5_2molmollusvmvql.R.inc(31355);buf[lastSpecialIndex] = '\\';
            __CLR4_5_2molmollusvmvql.R.inc(31356);buf[++lastSpecialIndex] = replaceChars[(int) lastSpecial];
            __CLR4_5_2molmollusvmvql.R.inc(31357);end++;
            __CLR4_5_2molmollusvmvql.R.inc(31358);for (int i = lastSpecialIndex - 2; (((i >= start)&&(__CLR4_5_2molmollusvmvql.R.iget(31359)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31360)==0&false)); --i) {{
                __CLR4_5_2molmollusvmvql.R.inc(31361);char ch = buf[i];

                __CLR4_5_2molmollusvmvql.R.inc(31362);if ((((ch <= 13 || ch == '\\' || ch == '\'' //
                        || (ch == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial)))&&(__CLR4_5_2molmollusvmvql.R.iget(31363)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31364)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31365);System.arraycopy(buf, i + 1, buf, i + 2, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(31366);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(31367);buf[i + 1] = replaceChars[(int) ch];
                    __CLR4_5_2molmollusvmvql.R.inc(31368);end++;
                }
            }}
        }}

        }}__CLR4_5_2molmollusvmvql.R.inc(31369);buf[count - 1] = '\'';
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldName(String key) {try{__CLR4_5_2molmollusvmvql.R.inc(31370);
        __CLR4_5_2molmollusvmvql.R.inc(31371);writeFieldName(key, false);
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void writeFieldName(String key, boolean checkSpecial) {try{__CLR4_5_2molmollusvmvql.R.inc(31372);
        __CLR4_5_2molmollusvmvql.R.inc(31373);if ((((key == null)&&(__CLR4_5_2molmollusvmvql.R.iget(31374)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31375)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31376);write("null:");
            __CLR4_5_2molmollusvmvql.R.inc(31377);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31378);if ((((useSingleQuotes)&&(__CLR4_5_2molmollusvmvql.R.iget(31379)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31380)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31381);if ((((quoteFieldNames)&&(__CLR4_5_2molmollusvmvql.R.iget(31382)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31383)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31384);writeStringWithSingleQuote(key);
                __CLR4_5_2molmollusvmvql.R.inc(31385);write(':');
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(31386);writeKeyWithSingleQuoteIfHasSpecial(key);
            }
        }} }else {{
            __CLR4_5_2molmollusvmvql.R.inc(31387);if ((((quoteFieldNames)&&(__CLR4_5_2molmollusvmvql.R.iget(31388)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31389)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31390);writeStringWithDoubleQuote(key, ':');
            } }else {{
                __CLR4_5_2molmollusvmvql.R.inc(31391);boolean hashSpecial = key.length() == 0;
                __CLR4_5_2molmollusvmvql.R.inc(31392);for (int i = 0; (((i < key.length())&&(__CLR4_5_2molmollusvmvql.R.iget(31393)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31394)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31395);char ch = key.charAt(i);
                    __CLR4_5_2molmollusvmvql.R.inc(31396);boolean special = (ch < 64 && (sepcialBits & (1L << ch)) != 0) || ch == '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(31397);if ((((special)&&(__CLR4_5_2molmollusvmvql.R.iget(31398)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31399)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31400);hashSpecial = true;
                        __CLR4_5_2molmollusvmvql.R.inc(31401);break;
                    }
                }}
                }__CLR4_5_2molmollusvmvql.R.inc(31402);if ((((hashSpecial)&&(__CLR4_5_2molmollusvmvql.R.iget(31403)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31404)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31405);writeStringWithDoubleQuote(key, ':');
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(31406);write(key);
                    __CLR4_5_2molmollusvmvql.R.inc(31407);write(':');
                }
            }}
        }}
    }}finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    private void writeKeyWithSingleQuoteIfHasSpecial(String text) {try{__CLR4_5_2molmollusvmvql.R.inc(31408);
        __CLR4_5_2molmollusvmvql.R.inc(31409);final byte[] specicalFlags_singleQuotes = IOUtils.specicalFlags_singleQuotes;

        __CLR4_5_2molmollusvmvql.R.inc(31410);int len = text.length();
        __CLR4_5_2molmollusvmvql.R.inc(31411);int newcount = count + len + 1;
        __CLR4_5_2molmollusvmvql.R.inc(31412);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31413)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31414)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31415);if ((((writer != null)&&(__CLR4_5_2molmollusvmvql.R.iget(31416)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31417)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31418);if ((((len == 0)&&(__CLR4_5_2molmollusvmvql.R.iget(31419)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31420)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31421);write('\'');
                    __CLR4_5_2molmollusvmvql.R.inc(31422);write('\'');
                    __CLR4_5_2molmollusvmvql.R.inc(31423);write(':');
                    __CLR4_5_2molmollusvmvql.R.inc(31424);return;
                }

                }__CLR4_5_2molmollusvmvql.R.inc(31425);boolean hasSpecial = false;
                __CLR4_5_2molmollusvmvql.R.inc(31426);for (int i = 0; (((i < len)&&(__CLR4_5_2molmollusvmvql.R.iget(31427)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31428)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31429);char ch = text.charAt(i);
                    __CLR4_5_2molmollusvmvql.R.inc(31430);if ((((ch < specicalFlags_singleQuotes.length && specicalFlags_singleQuotes[ch] != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(31431)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31432)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31433);hasSpecial = true;
                        __CLR4_5_2molmollusvmvql.R.inc(31434);break;
                    }
                }}

                }__CLR4_5_2molmollusvmvql.R.inc(31435);if ((((hasSpecial)&&(__CLR4_5_2molmollusvmvql.R.iget(31436)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31437)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31438);write('\'');
                }
                }__CLR4_5_2molmollusvmvql.R.inc(31439);for (int i = 0; (((i < len)&&(__CLR4_5_2molmollusvmvql.R.iget(31440)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31441)==0&false)); ++i) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31442);char ch = text.charAt(i);
                    __CLR4_5_2molmollusvmvql.R.inc(31443);if ((((ch < specicalFlags_singleQuotes.length && specicalFlags_singleQuotes[ch] != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(31444)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31445)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31446);write('\\');
                        __CLR4_5_2molmollusvmvql.R.inc(31447);write(replaceChars[(int) ch]);
                    } }else {{
                        __CLR4_5_2molmollusvmvql.R.inc(31448);write(ch);
                    }
                }}
                }__CLR4_5_2molmollusvmvql.R.inc(31449);if ((((hasSpecial)&&(__CLR4_5_2molmollusvmvql.R.iget(31450)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31451)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31452);write('\'');
                }
                }__CLR4_5_2molmollusvmvql.R.inc(31453);write(':');
                __CLR4_5_2molmollusvmvql.R.inc(31454);return;
            }

            }__CLR4_5_2molmollusvmvql.R.inc(31455);expandCapacity(newcount);
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31456);if ((((len == 0)&&(__CLR4_5_2molmollusvmvql.R.iget(31457)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31458)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31459);int newCount = count + 3;
            __CLR4_5_2molmollusvmvql.R.inc(31460);if ((((newCount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31461)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31462)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31463);expandCapacity(count + 3);
            }
            }__CLR4_5_2molmollusvmvql.R.inc(31464);buf[count++] = '\'';
            __CLR4_5_2molmollusvmvql.R.inc(31465);buf[count++] = '\'';
            __CLR4_5_2molmollusvmvql.R.inc(31466);buf[count++] = ':';
            __CLR4_5_2molmollusvmvql.R.inc(31467);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31468);int start = count;
        __CLR4_5_2molmollusvmvql.R.inc(31469);int end = start + len;

        __CLR4_5_2molmollusvmvql.R.inc(31470);text.getChars(0, len, buf, start);
        __CLR4_5_2molmollusvmvql.R.inc(31471);count = newcount;

        __CLR4_5_2molmollusvmvql.R.inc(31472);boolean hasSpecial = false;

        __CLR4_5_2molmollusvmvql.R.inc(31473);for (int i = start; (((i < end)&&(__CLR4_5_2molmollusvmvql.R.iget(31474)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31475)==0&false)); ++i) {{
            __CLR4_5_2molmollusvmvql.R.inc(31476);char ch = buf[i];
            __CLR4_5_2molmollusvmvql.R.inc(31477);if ((((ch < specicalFlags_singleQuotes.length && specicalFlags_singleQuotes[ch] != 0)&&(__CLR4_5_2molmollusvmvql.R.iget(31478)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31479)==0&false))) {{
                __CLR4_5_2molmollusvmvql.R.inc(31480);if ((((!hasSpecial)&&(__CLR4_5_2molmollusvmvql.R.iget(31481)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31482)==0&false))) {{
                    __CLR4_5_2molmollusvmvql.R.inc(31483);newcount += 3;
                    __CLR4_5_2molmollusvmvql.R.inc(31484);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31485)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31486)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31487);expandCapacity(newcount);
                    }
                    }__CLR4_5_2molmollusvmvql.R.inc(31488);count = newcount;

                    __CLR4_5_2molmollusvmvql.R.inc(31489);System.arraycopy(buf, i + 1, buf, i + 3, end - i - 1);
                    __CLR4_5_2molmollusvmvql.R.inc(31490);System.arraycopy(buf, 0, buf, 1, i);
                    __CLR4_5_2molmollusvmvql.R.inc(31491);buf[start] = '\'';
                    __CLR4_5_2molmollusvmvql.R.inc(31492);buf[++i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(31493);buf[++i] = replaceChars[(int) ch];
                    __CLR4_5_2molmollusvmvql.R.inc(31494);end += 2;
                    __CLR4_5_2molmollusvmvql.R.inc(31495);buf[count - 2] = '\'';

                    __CLR4_5_2molmollusvmvql.R.inc(31496);hasSpecial = true;
                } }else {{
                    __CLR4_5_2molmollusvmvql.R.inc(31497);newcount++;
                    __CLR4_5_2molmollusvmvql.R.inc(31498);if ((((newcount > buf.length)&&(__CLR4_5_2molmollusvmvql.R.iget(31499)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31500)==0&false))) {{
                        __CLR4_5_2molmollusvmvql.R.inc(31501);expandCapacity(newcount);
                    }
                    }__CLR4_5_2molmollusvmvql.R.inc(31502);count = newcount;

                    __CLR4_5_2molmollusvmvql.R.inc(31503);System.arraycopy(buf, i + 1, buf, i + 2, end - i);
                    __CLR4_5_2molmollusvmvql.R.inc(31504);buf[i] = '\\';
                    __CLR4_5_2molmollusvmvql.R.inc(31505);buf[++i] = replaceChars[(int) ch];
                    __CLR4_5_2molmollusvmvql.R.inc(31506);end++;
                }
            }}
        }}

        }__CLR4_5_2molmollusvmvql.R.inc(31507);buf[newcount - 1] = ':';
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}

    public void flush() {try{__CLR4_5_2molmollusvmvql.R.inc(31508);
        __CLR4_5_2molmollusvmvql.R.inc(31509);if ((((writer == null)&&(__CLR4_5_2molmollusvmvql.R.iget(31510)!=0|true))||(__CLR4_5_2molmollusvmvql.R.iget(31511)==0&false))) {{
            __CLR4_5_2molmollusvmvql.R.inc(31512);return;
        }

        }__CLR4_5_2molmollusvmvql.R.inc(31513);try {
            __CLR4_5_2molmollusvmvql.R.inc(31514);writer.write(buf, 0, count);
            __CLR4_5_2molmollusvmvql.R.inc(31515);writer.flush();
        } catch (IOException e) {
            __CLR4_5_2molmollusvmvql.R.inc(31516);throw new JSONException(e.getMessage(), e);
        }
        __CLR4_5_2molmollusvmvql.R.inc(31517);count = 0;
    }finally{__CLR4_5_2molmollusvmvql.R.flushNeeded();}}


}
