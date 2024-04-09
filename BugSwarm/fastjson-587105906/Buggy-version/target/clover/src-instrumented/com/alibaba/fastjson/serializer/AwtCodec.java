/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.serializer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Type;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class AwtCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10iwiiwilusqjjs8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,24800,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static AwtCodec instance = new AwtCodec();
    
    public static boolean support(Class<?> clazz) {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24498);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24499);return clazz == Point.class //
               || clazz == Rectangle.class //
               || clazz == Font.class //
               || clazz == Color.class //
        ;
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                      int features) throws IOException {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24500);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24501);SerializeWriter out = serializer.out;

        __CLR4_1_10iwiiwilusqjjs8.R.inc(24502);if ((((object == null)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24503)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24504)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24505);out.writeNull();
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24506);return;
        }

        }__CLR4_1_10iwiiwilusqjjs8.R.inc(24507);char sep = '{';

        __CLR4_1_10iwiiwilusqjjs8.R.inc(24508);if ((((object instanceof Point)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24509)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24510)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24511);Point font = (Point) object;
            
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24512);sep = writeClassName(out, Point.class, sep);
            
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24513);out.writeFieldValue(sep, "x", font.x);
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24514);out.writeFieldValue(',', "y", font.y);
        } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24515);if ((((object instanceof Font)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24516)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24517)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24518);Font font = (Font) object;
            
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24519);sep = writeClassName(out, Font.class, sep);
            
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24520);out.writeFieldValue(sep, "name", font.getName());
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24521);out.writeFieldValue(',', "style", font.getStyle());
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24522);out.writeFieldValue(',', "size", font.getSize());
        } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24523);if ((((object instanceof Rectangle)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24524)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24525)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24526);Rectangle rectangle = (Rectangle) object;
            
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24527);sep = writeClassName(out, Rectangle.class, sep);
            
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24528);out.writeFieldValue(sep, "x", rectangle.x);
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24529);out.writeFieldValue(',', "y", rectangle.y);
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24530);out.writeFieldValue(',', "width", rectangle.width);
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24531);out.writeFieldValue(',', "height", rectangle.height);
        } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24532);if ((((object instanceof Color)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24533)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24534)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24535);Color color = (Color) object;
            
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24536);sep = writeClassName(out, Color.class, sep);
            
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24537);out.writeFieldValue(sep, "r", color.getRed());
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24538);out.writeFieldValue(',', "g", color.getGreen());
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24539);out.writeFieldValue(',', "b", color.getBlue());
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24540);if ((((color.getAlpha() > 0)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24541)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24542)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24543);out.writeFieldValue(',', "alpha", color.getAlpha());
            }
        }} }else {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24544);throw new JSONException("not support awt class : " + object.getClass().getName());
        }

        }}}}__CLR4_1_10iwiiwilusqjjs8.R.inc(24545);out.write('}');

    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}

    protected char writeClassName(SerializeWriter out, Class<?> clazz, char sep) {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24546);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24547);if ((((out.isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24548)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24549)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24550);out.write('{');
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24551);out.writeFieldName(JSON.DEFAULT_TYPE_KEY);
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24552);out.writeString(clazz.getName());
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24553);sep = ',';
        }
        }__CLR4_1_10iwiiwilusqjjs8.R.inc(24554);return sep;
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}

    @SuppressWarnings("unchecked")

    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24555);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24556);JSONLexer lexer = parser.lexer;

        __CLR4_1_10iwiiwilusqjjs8.R.inc(24557);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24558)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24559)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24560);lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24561);return null;
        }

        }__CLR4_1_10iwiiwilusqjjs8.R.inc(24562);if ((((lexer.token() != JSONToken.LBRACE && lexer.token() != JSONToken.COMMA)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24563)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24564)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24565);throw new JSONException("syntax error");
        }
        }__CLR4_1_10iwiiwilusqjjs8.R.inc(24566);lexer.nextToken();

        __CLR4_1_10iwiiwilusqjjs8.R.inc(24567);T obj;
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24568);if ((((type == Point.class)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24569)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24570)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24571);obj = (T) parsePoint(parser, fieldName);
        } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24572);if ((((type == Rectangle.class)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24573)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24574)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24575);obj = (T) parseRectangle(parser);
        } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24576);if ((((type == Color.class)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24577)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24578)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24579);obj = (T) parseColor(parser);
        } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24580);if ((((type == Font.class)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24581)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24582)==0&false))) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24583);obj = (T) parseFont(parser);
        } }else {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24584);throw new JSONException("not support awt class : " + type);
        }

        }}}}__CLR4_1_10iwiiwilusqjjs8.R.inc(24585);ParseContext context = parser.getContext();
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24586);parser.setContext(obj, fieldName);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24587);parser.setContext(context);

        __CLR4_1_10iwiiwilusqjjs8.R.inc(24588);return obj;
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}
    
    protected Font parseFont(DefaultJSONParser parser) {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24589);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24590);JSONLexer lexer = parser.lexer;
        
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24591);int size = 0, style = 0;
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24592);String name = null;
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24593);for (;;) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24594);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24595)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24596)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24597);lexer.nextToken();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24598);break;
            }

            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24599);String key;
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24600);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24601)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24602)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24603);key = lexer.stringVal();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24604);lexer.nextTokenWithColon(JSONToken.LITERAL_INT);
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24605);throw new JSONException("syntax error");
            }


            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24606);if ((((key.equalsIgnoreCase("name"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24607)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24608)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24609);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24610)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24611)==0&false))) {{
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24612);name = lexer.stringVal();
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24613);lexer.nextToken();
                } }else {{
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24614);throw new JSONException("syntax error");
                }
            }} }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24615);if ((((key.equalsIgnoreCase("style"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24616)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24617)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24618);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24619)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24620)==0&false))) {{
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24621);style = lexer.intValue();
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24622);lexer.nextToken();
                } }else {{
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24623);throw new JSONException("syntax error");
                }
            }} }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24624);if ((((key.equalsIgnoreCase("size"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24625)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24626)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24627);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24628)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24629)==0&false))) {{
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24630);size = lexer.intValue();
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24631);lexer.nextToken();
                } }else {{
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24632);throw new JSONException("syntax error");
                }
            }} }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24633);throw new JSONException("syntax error, " + key);
            }

            }}}__CLR4_1_10iwiiwilusqjjs8.R.inc(24634);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24635)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24636)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24637);lexer.nextToken(JSONToken.LITERAL_STRING);
            }
        }}

        }__CLR4_1_10iwiiwilusqjjs8.R.inc(24638);return new Font(name, style, size);
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}
    
    protected Color parseColor(DefaultJSONParser parser) {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24639);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24640);JSONLexer lexer = parser.lexer;
        
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24641);int r = 0, g = 0, b = 0, alpha = 0;
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24642);for (;;) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24643);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24644)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24645)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24646);lexer.nextToken();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24647);break;
            }

            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24648);String key;
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24649);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24650)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24651)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24652);key = lexer.stringVal();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24653);lexer.nextTokenWithColon(JSONToken.LITERAL_INT);
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24654);throw new JSONException("syntax error");
            }

            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24655);int val;
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24656);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24657)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24658)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24659);val = lexer.intValue();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24660);lexer.nextToken();
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24661);throw new JSONException("syntax error");
            }

            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24662);if ((((key.equalsIgnoreCase("r"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24663)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24664)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24665);r = val;
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24666);if ((((key.equalsIgnoreCase("g"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24667)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24668)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24669);g = val;
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24670);if ((((key.equalsIgnoreCase("b"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24671)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24672)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24673);b = val;
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24674);if ((((key.equalsIgnoreCase("alpha"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24675)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24676)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24677);alpha = val;
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24678);throw new JSONException("syntax error, " + key);
            }

            }}}}__CLR4_1_10iwiiwilusqjjs8.R.inc(24679);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24680)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24681)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24682);lexer.nextToken(JSONToken.LITERAL_STRING);
            }
        }}

        }__CLR4_1_10iwiiwilusqjjs8.R.inc(24683);return new Color(r, g, b, alpha);
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}
    
    protected Rectangle parseRectangle(DefaultJSONParser parser) {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24684);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24685);JSONLexer lexer = parser.lexer;
        
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24686);int x = 0, y = 0, width = 0, height = 0;
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24687);for (;;) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24688);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24689)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24690)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24691);lexer.nextToken();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24692);break;
            }

            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24693);String key;
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24694);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24695)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24696)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24697);key = lexer.stringVal();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24698);lexer.nextTokenWithColon(JSONToken.LITERAL_INT);
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24699);throw new JSONException("syntax error");
            }

            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24700);int val;
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24701);int token = lexer.token();
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24702);if ((((token == JSONToken.LITERAL_INT)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24703)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24704)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24705);val = lexer.intValue();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24706);lexer.nextToken();
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24707);if ((((token == JSONToken.LITERAL_FLOAT)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24708)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24709)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24710);val = (int) lexer.floatValue();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24711);lexer.nextToken();
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24712);throw new JSONException("syntax error");
            }

            }}__CLR4_1_10iwiiwilusqjjs8.R.inc(24713);if ((((key.equalsIgnoreCase("x"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24714)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24715)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24716);x = val;
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24717);if ((((key.equalsIgnoreCase("y"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24718)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24719)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24720);y = val;
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24721);if ((((key.equalsIgnoreCase("width"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24722)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24723)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24724);width = val;
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24725);if ((((key.equalsIgnoreCase("height"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24726)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24727)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24728);height = val;
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24729);throw new JSONException("syntax error, " + key);
            }

            }}}}__CLR4_1_10iwiiwilusqjjs8.R.inc(24730);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24731)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24732)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24733);lexer.nextToken(JSONToken.LITERAL_STRING);
            }
        }}

        }__CLR4_1_10iwiiwilusqjjs8.R.inc(24734);return new Rectangle(x, y, width, height);
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}

    protected Point parsePoint(DefaultJSONParser parser, Object fieldName) {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24735);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24736);JSONLexer lexer = parser.lexer;
        
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24737);int x = 0, y = 0;
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24738);for (;;) {{
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24739);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24740)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24741)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24742);lexer.nextToken();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24743);break;
            }

            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24744);String key;
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24745);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24746)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24747)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24748);key = lexer.stringVal();

                __CLR4_1_10iwiiwilusqjjs8.R.inc(24749);if ((((JSON.DEFAULT_TYPE_KEY.equals(key))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24750)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24751)==0&false))) {{
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24752);parser.acceptType("java.awt.Point");
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24753);continue;
                }

                }__CLR4_1_10iwiiwilusqjjs8.R.inc(24754);if (((("$ref".equals(key))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24755)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24756)==0&false))) {{
                    __CLR4_1_10iwiiwilusqjjs8.R.inc(24757);return (Point) parseRef(parser, fieldName);
                }

                }__CLR4_1_10iwiiwilusqjjs8.R.inc(24758);lexer.nextTokenWithColon(JSONToken.LITERAL_INT);
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24759);throw new JSONException("syntax error");
            }

            }__CLR4_1_10iwiiwilusqjjs8.R.inc(24760);int token = lexer.token();
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24761);int val;
            __CLR4_1_10iwiiwilusqjjs8.R.inc(24762);if ((((token == JSONToken.LITERAL_INT)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24763)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24764)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24765);val = lexer.intValue();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24766);lexer.nextToken();
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24767);if((((token == JSONToken.LITERAL_FLOAT)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24768)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24769)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24770);val = (int) lexer.floatValue();
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24771);lexer.nextToken();
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24772);throw new JSONException("syntax error : " + lexer.tokenName());
            }

            }}__CLR4_1_10iwiiwilusqjjs8.R.inc(24773);if ((((key.equalsIgnoreCase("x"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24774)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24775)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24776);x = val;
            } }else {__CLR4_1_10iwiiwilusqjjs8.R.inc(24777);if ((((key.equalsIgnoreCase("y"))&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24778)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24779)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24780);y = val;
            } }else {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24781);throw new JSONException("syntax error, " + key);
            }

            }}__CLR4_1_10iwiiwilusqjjs8.R.inc(24782);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10iwiiwilusqjjs8.R.iget(24783)!=0|true))||(__CLR4_1_10iwiiwilusqjjs8.R.iget(24784)==0&false))) {{
                __CLR4_1_10iwiiwilusqjjs8.R.inc(24785);lexer.nextToken(JSONToken.LITERAL_STRING);
            }
        }}

        }__CLR4_1_10iwiiwilusqjjs8.R.inc(24786);return new Point(x, y);
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}

    private Object parseRef(DefaultJSONParser parser, Object fieldName) {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24787);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24788);JSONLexer lexer = parser.getLexer();
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24789);lexer.nextTokenWithColon(JSONToken.LITERAL_STRING);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24790);String ref = lexer.stringVal();
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24791);parser.setContext(parser.getContext(), fieldName);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24792);parser.addResolveTask(new DefaultJSONParser.ResolveTask(parser.getContext(), ref));
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24793);parser.popContext();
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24794);parser.setResolveStatus(DefaultJSONParser.NeedToResolve);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24795);lexer.nextToken(JSONToken.RBRACE);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24796);parser.accept(JSONToken.RBRACE);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24797);return null;
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10iwiiwilusqjjs8.R.inc(24798);
        __CLR4_1_10iwiiwilusqjjs8.R.inc(24799);return JSONToken.LBRACE;
    }finally{__CLR4_1_10iwiiwilusqjjs8.R.flushNeeded();}}
}
