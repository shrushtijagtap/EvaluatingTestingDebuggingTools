/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson;

import static com.alibaba.fastjson.JSONStreamContext.ArrayValue;
import static com.alibaba.fastjson.JSONStreamContext.PropertyKey;
import static com.alibaba.fastjson.JSONStreamContext.PropertyValue;
import static com.alibaba.fastjson.JSONStreamContext.StartArray;
import static com.alibaba.fastjson.JSONStreamContext.StartObject;

import java.io.Closeable;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.util.TypeUtils;

@java.lang.SuppressWarnings({"fallthrough"}) public class JSONReader implements Closeable {public static class __CLR4_5_23kq3kqlusyjijr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,4869,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DefaultJSONParser parser;
    private JSONStreamContext       context;

    public JSONReader(Reader reader){
        this(reader, new Feature[0]);__CLR4_5_23kq3kqlusyjijr.R.inc(4635);try{__CLR4_5_23kq3kqlusyjijr.R.inc(4634);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}
    
    public JSONReader(Reader reader, Feature... features){
        this(new JSONReaderScanner(reader));__CLR4_5_23kq3kqlusyjijr.R.inc(4637);try{__CLR4_5_23kq3kqlusyjijr.R.inc(4636);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4638);for (Feature feature : features) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4639);this.config(feature, true);
        }
    }}finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public JSONReader(JSONLexer lexer){
        this(new DefaultJSONParser(lexer));__CLR4_5_23kq3kqlusyjijr.R.inc(4641);try{__CLR4_5_23kq3kqlusyjijr.R.inc(4640);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public JSONReader(DefaultJSONParser parser){try{__CLR4_5_23kq3kqlusyjijr.R.inc(4642);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4643);this.parser = parser;
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}
    
    public void setTimzeZone(TimeZone timezone) {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4644);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4645);this.parser.lexer.setTimeZone(timezone);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}
    
    public void setLocale(Locale locale) {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4646);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4647);this.parser.lexer.setLocale(locale);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public void config(Feature feature, boolean state) {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4648);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4649);this.parser.config(feature, state);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}
    
    public Locale getLocal() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4650);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4651);return this.parser.lexer.getLocale();
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}
    
    public TimeZone getTimzeZone() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4652);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4653);return this.parser.lexer.getTimeZone();
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public void startObject() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4654);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4655);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4656)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4657)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4658);context = new JSONStreamContext(null, JSONStreamContext.StartObject);
        } }else {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4659);startStructure();
            __CLR4_5_23kq3kqlusyjijr.R.inc(4660);context = new JSONStreamContext(context, JSONStreamContext.StartObject);
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4661);this.parser.accept(JSONToken.LBRACE, JSONToken.IDENTIFIER);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public void endObject() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4662);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4663);this.parser.accept(JSONToken.RBRACE);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4664);endStructure();
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public void startArray() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4665);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4666);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4667)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4668)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4669);context = new JSONStreamContext(null, StartArray);
        } }else {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4670);startStructure();

            __CLR4_5_23kq3kqlusyjijr.R.inc(4671);context = new JSONStreamContext(context, StartArray);
        }
        }__CLR4_5_23kq3kqlusyjijr.R.inc(4672);this.parser.accept(JSONToken.LBRACKET);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public void endArray() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4673);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4674);this.parser.accept(JSONToken.RBRACKET);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4675);endStructure();
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    private void startStructure() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4676);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4677);final int state = context.state;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_23kq3kqlusyjijr.R.inc(4678);switch (state) {
            case PropertyKey:if (!__CLB4_5_2_bool0) {__CLR4_5_23kq3kqlusyjijr.R.inc(4679);__CLB4_5_2_bool0=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4680);parser.accept(JSONToken.COLON);
                __CLR4_5_23kq3kqlusyjijr.R.inc(4681);break;
            case PropertyValue:if (!__CLB4_5_2_bool0) {__CLR4_5_23kq3kqlusyjijr.R.inc(4682);__CLB4_5_2_bool0=true;}
            case ArrayValue:if (!__CLB4_5_2_bool0) {__CLR4_5_23kq3kqlusyjijr.R.inc(4683);__CLB4_5_2_bool0=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4684);parser.accept(JSONToken.COMMA);
                __CLR4_5_23kq3kqlusyjijr.R.inc(4685);break;
            case StartArray:if (!__CLB4_5_2_bool0) {__CLR4_5_23kq3kqlusyjijr.R.inc(4686);__CLB4_5_2_bool0=true;}
            case StartObject:if (!__CLB4_5_2_bool0) {__CLR4_5_23kq3kqlusyjijr.R.inc(4687);__CLB4_5_2_bool0=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4688);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_23kq3kqlusyjijr.R.inc(4689);__CLB4_5_2_bool0=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4690);throw new JSONException("illegal state : " + context.state);
        }
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    private void endStructure() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4691);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4692);context = context.parent;

        __CLR4_5_23kq3kqlusyjijr.R.inc(4693);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4694)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4695)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4696);return;
        }
        
        }__CLR4_5_23kq3kqlusyjijr.R.inc(4697);final int state = context.state;
        __CLR4_5_23kq3kqlusyjijr.R.inc(4698);int newState = -1;
        boolean __CLB4_5_2_bool1=false;__CLR4_5_23kq3kqlusyjijr.R.inc(4699);switch (state) {
            case PropertyKey:if (!__CLB4_5_2_bool1) {__CLR4_5_23kq3kqlusyjijr.R.inc(4700);__CLB4_5_2_bool1=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4701);newState = PropertyValue;
                __CLR4_5_23kq3kqlusyjijr.R.inc(4702);break;
            case StartArray:if (!__CLB4_5_2_bool1) {__CLR4_5_23kq3kqlusyjijr.R.inc(4703);__CLB4_5_2_bool1=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4704);newState = ArrayValue;
                __CLR4_5_23kq3kqlusyjijr.R.inc(4705);break;
            case PropertyValue:if (!__CLB4_5_2_bool1) {__CLR4_5_23kq3kqlusyjijr.R.inc(4706);__CLB4_5_2_bool1=true;}
            case StartObject:if (!__CLB4_5_2_bool1) {__CLR4_5_23kq3kqlusyjijr.R.inc(4707);__CLB4_5_2_bool1=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4708);newState = PropertyKey;
                __CLR4_5_23kq3kqlusyjijr.R.inc(4709);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_23kq3kqlusyjijr.R.inc(4710);__CLB4_5_2_bool1=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4711);break;
        }
        __CLR4_5_23kq3kqlusyjijr.R.inc(4712);if ((((newState != -1)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4713)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4714)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4715);context.state = newState;
        }
    }}finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public boolean hasNext() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4716);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4717);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4718)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4719)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4720);throw new JSONException("context is null");
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4721);final int token = parser.lexer.token();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4722);final int state = context.state;
        boolean __CLB4_5_2_bool2=false;__CLR4_5_23kq3kqlusyjijr.R.inc(4723);switch (state) {
            case StartArray:if (!__CLB4_5_2_bool2) {__CLR4_5_23kq3kqlusyjijr.R.inc(4724);__CLB4_5_2_bool2=true;}
            case ArrayValue:if (!__CLB4_5_2_bool2) {__CLR4_5_23kq3kqlusyjijr.R.inc(4725);__CLB4_5_2_bool2=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4726);return token != JSONToken.RBRACKET;
            case StartObject:if (!__CLB4_5_2_bool2) {__CLR4_5_23kq3kqlusyjijr.R.inc(4727);__CLB4_5_2_bool2=true;}
            case PropertyValue:if (!__CLB4_5_2_bool2) {__CLR4_5_23kq3kqlusyjijr.R.inc(4728);__CLB4_5_2_bool2=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4729);return token != JSONToken.RBRACE;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_23kq3kqlusyjijr.R.inc(4730);__CLB4_5_2_bool2=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4731);throw new JSONException("illegal state : " + state);
        }
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public int peek() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4732);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4733);return parser.lexer.token();
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public void close() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4734);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4735);parser.close();
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public Integer readInteger() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4736);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4737);Object object;
        __CLR4_5_23kq3kqlusyjijr.R.inc(4738);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4739)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4740)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4741);object = parser.parse();
        } }else {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4742);readBefore();
            __CLR4_5_23kq3kqlusyjijr.R.inc(4743);object = parser.parse();
            __CLR4_5_23kq3kqlusyjijr.R.inc(4744);readAfter();
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4745);return TypeUtils.castToInt(object);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public Long readLong() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4746);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4747);Object object;
        __CLR4_5_23kq3kqlusyjijr.R.inc(4748);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4749)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4750)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4751);object = parser.parse();
        } }else {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4752);readBefore();
            __CLR4_5_23kq3kqlusyjijr.R.inc(4753);object = parser.parse();
            __CLR4_5_23kq3kqlusyjijr.R.inc(4754);readAfter();
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4755);return TypeUtils.castToLong(object);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public String readString() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4756);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4757);Object object;
        __CLR4_5_23kq3kqlusyjijr.R.inc(4758);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4759)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4760)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4761);object = parser.parse();
        } }else {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4762);readBefore();
            __CLR4_5_23kq3kqlusyjijr.R.inc(4763);JSONLexer lexer = parser.lexer;
            __CLR4_5_23kq3kqlusyjijr.R.inc(4764);if ((((context.state == JSONStreamContext.StartObject && lexer.token() == JSONToken.IDENTIFIER)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4765)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4766)==0&false))) {{
                __CLR4_5_23kq3kqlusyjijr.R.inc(4767);object = lexer.stringVal();
                __CLR4_5_23kq3kqlusyjijr.R.inc(4768);lexer.nextToken();
            } }else {{
                __CLR4_5_23kq3kqlusyjijr.R.inc(4769);object = parser.parse();
            }
            }__CLR4_5_23kq3kqlusyjijr.R.inc(4770);readAfter();
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4771);return TypeUtils.castToString(object);
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}
    
    public <T> T readObject(TypeReference<T> typeRef) {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4772);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4773);return readObject(typeRef.getType());
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public <T> T readObject(Type type) {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4774);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4775);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4776)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4777)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4778);return parser.parseObject(type);
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4779);readBefore();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4780);T object = parser.parseObject(type);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4781);readAfter();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4782);return object;
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public <T> T readObject(Class<T> type) {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4783);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4784);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4785)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4786)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4787);return parser.parseObject(type);
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4788);readBefore();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4789);T object = parser.parseObject(type);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4790);readAfter();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4791);return object;
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public void readObject(Object object) {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4792);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4793);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4794)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4795)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4796);parser.parseObject(object);
            __CLR4_5_23kq3kqlusyjijr.R.inc(4797);return;
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4798);readBefore();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4799);parser.parseObject(object);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4800);readAfter();
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    public Object readObject() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4801);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4802);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4803)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4804)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4805);return parser.parse();
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4806);readBefore();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4807);Object object;
        boolean __CLB4_5_2_bool3=false;__CLR4_5_23kq3kqlusyjijr.R.inc(4808);switch (context.state) {
            case StartObject:if (!__CLB4_5_2_bool3) {__CLR4_5_23kq3kqlusyjijr.R.inc(4809);__CLB4_5_2_bool3=true;}
            case PropertyValue:if (!__CLB4_5_2_bool3) {__CLR4_5_23kq3kqlusyjijr.R.inc(4810);__CLB4_5_2_bool3=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4811);object = parser.parseKey();
                __CLR4_5_23kq3kqlusyjijr.R.inc(4812);break;
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_23kq3kqlusyjijr.R.inc(4813);__CLB4_5_2_bool3=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4814);object = parser.parse();
                __CLR4_5_23kq3kqlusyjijr.R.inc(4815);break;
        }

        __CLR4_5_23kq3kqlusyjijr.R.inc(4816);readAfter();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4817);return object;
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public Object readObject(Map object) {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4818);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4819);if ((((context == null)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4820)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4821)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4822);return parser.parseObject(object);
        }

        }__CLR4_5_23kq3kqlusyjijr.R.inc(4823);readBefore();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4824);Object value = parser.parseObject(object);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4825);readAfter();
        __CLR4_5_23kq3kqlusyjijr.R.inc(4826);return value;
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    private void readBefore() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4827);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4828);int state = context.state;
        // before
        boolean __CLB4_5_2_bool4=false;__CLR4_5_23kq3kqlusyjijr.R.inc(4829);switch (state) {
            case PropertyKey:if (!__CLB4_5_2_bool4) {__CLR4_5_23kq3kqlusyjijr.R.inc(4830);__CLB4_5_2_bool4=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4831);parser.accept(JSONToken.COLON);
                __CLR4_5_23kq3kqlusyjijr.R.inc(4832);break;
            case PropertyValue:if (!__CLB4_5_2_bool4) {__CLR4_5_23kq3kqlusyjijr.R.inc(4833);__CLB4_5_2_bool4=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4834);parser.accept(JSONToken.COMMA, JSONToken.IDENTIFIER);
                __CLR4_5_23kq3kqlusyjijr.R.inc(4835);break;
            case ArrayValue:if (!__CLB4_5_2_bool4) {__CLR4_5_23kq3kqlusyjijr.R.inc(4836);__CLB4_5_2_bool4=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4837);parser.accept(JSONToken.COMMA);
                __CLR4_5_23kq3kqlusyjijr.R.inc(4838);break;
            case StartObject:if (!__CLB4_5_2_bool4) {__CLR4_5_23kq3kqlusyjijr.R.inc(4839);__CLB4_5_2_bool4=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4840);break;
            case StartArray:if (!__CLB4_5_2_bool4) {__CLR4_5_23kq3kqlusyjijr.R.inc(4841);__CLB4_5_2_bool4=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4842);break;
            default:if (!__CLB4_5_2_bool4) {__CLR4_5_23kq3kqlusyjijr.R.inc(4843);__CLB4_5_2_bool4=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4844);throw new JSONException("illegal state : " + state);
        }
    }finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

    private void readAfter() {try{__CLR4_5_23kq3kqlusyjijr.R.inc(4845);
        __CLR4_5_23kq3kqlusyjijr.R.inc(4846);int state = context.state;
        __CLR4_5_23kq3kqlusyjijr.R.inc(4847);int newStat = -1;
        boolean __CLB4_5_2_bool5=false;__CLR4_5_23kq3kqlusyjijr.R.inc(4848);switch (state) {
            case StartObject:if (!__CLB4_5_2_bool5) {__CLR4_5_23kq3kqlusyjijr.R.inc(4849);__CLB4_5_2_bool5=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4850);newStat = PropertyKey;
                __CLR4_5_23kq3kqlusyjijr.R.inc(4851);break;
            case PropertyKey:if (!__CLB4_5_2_bool5) {__CLR4_5_23kq3kqlusyjijr.R.inc(4852);__CLB4_5_2_bool5=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4853);newStat = PropertyValue;
                __CLR4_5_23kq3kqlusyjijr.R.inc(4854);break;
            case PropertyValue:if (!__CLB4_5_2_bool5) {__CLR4_5_23kq3kqlusyjijr.R.inc(4855);__CLB4_5_2_bool5=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4856);newStat = PropertyKey;
                __CLR4_5_23kq3kqlusyjijr.R.inc(4857);break;
            case ArrayValue:if (!__CLB4_5_2_bool5) {__CLR4_5_23kq3kqlusyjijr.R.inc(4858);__CLB4_5_2_bool5=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4859);break;
            case StartArray:if (!__CLB4_5_2_bool5) {__CLR4_5_23kq3kqlusyjijr.R.inc(4860);__CLB4_5_2_bool5=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4861);newStat = ArrayValue;
                __CLR4_5_23kq3kqlusyjijr.R.inc(4862);break;
            default:if (!__CLB4_5_2_bool5) {__CLR4_5_23kq3kqlusyjijr.R.inc(4863);__CLB4_5_2_bool5=true;}
                __CLR4_5_23kq3kqlusyjijr.R.inc(4864);throw new JSONException("illegal state : " + state);
        }
        __CLR4_5_23kq3kqlusyjijr.R.inc(4865);if ((((newStat != -1)&&(__CLR4_5_23kq3kqlusyjijr.R.iget(4866)!=0|true))||(__CLR4_5_23kq3kqlusyjijr.R.iget(4867)==0&false))) {{
            __CLR4_5_23kq3kqlusyjijr.R.inc(4868);context.state = newStat;
        }
    }}finally{__CLR4_5_23kq3kqlusyjijr.R.flushNeeded();}}

}
