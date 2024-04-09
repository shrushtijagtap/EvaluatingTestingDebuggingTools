/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.parser.*;

import java.lang.reflect.Type;

/**
 * Created by wenshao on 21/02/2017.
 */
public class JSONPDeserializer implements ObjectDeserializer {public static class __CLR4_1_10exsexslusqjhki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,19402,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final JSONPDeserializer instance = new JSONPDeserializer();

    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_10exsexslusqjhki.R.inc(19360);
        __CLR4_1_10exsexslusqjhki.R.inc(19361);JSONLexerBase lexer = (JSONLexerBase) parser.getLexer();

        __CLR4_1_10exsexslusqjhki.R.inc(19362);SymbolTable symbolTable = parser.getSymbolTable();

        __CLR4_1_10exsexslusqjhki.R.inc(19363);String funcName = lexer.scanSymbolUnQuoted(symbolTable);
        __CLR4_1_10exsexslusqjhki.R.inc(19364);lexer.nextToken();

        __CLR4_1_10exsexslusqjhki.R.inc(19365);int tok = lexer.token();

        __CLR4_1_10exsexslusqjhki.R.inc(19366);if ((((tok == JSONToken.DOT)&&(__CLR4_1_10exsexslusqjhki.R.iget(19367)!=0|true))||(__CLR4_1_10exsexslusqjhki.R.iget(19368)==0&false))) {{
            __CLR4_1_10exsexslusqjhki.R.inc(19369);String name = lexer.scanSymbolUnQuoted(parser.getSymbolTable());
            __CLR4_1_10exsexslusqjhki.R.inc(19370);funcName += ".";
            __CLR4_1_10exsexslusqjhki.R.inc(19371);funcName += name;
            __CLR4_1_10exsexslusqjhki.R.inc(19372);lexer.nextToken();
            __CLR4_1_10exsexslusqjhki.R.inc(19373);tok = lexer.token();
        }

        }__CLR4_1_10exsexslusqjhki.R.inc(19374);JSONPObject jsonp = new JSONPObject(funcName);

        __CLR4_1_10exsexslusqjhki.R.inc(19375);if ((((tok != JSONToken.LPAREN)&&(__CLR4_1_10exsexslusqjhki.R.iget(19376)!=0|true))||(__CLR4_1_10exsexslusqjhki.R.iget(19377)==0&false))) {{
            __CLR4_1_10exsexslusqjhki.R.inc(19378);throw new JSONException("illegal jsonp : " + lexer.info());
        }
        }__CLR4_1_10exsexslusqjhki.R.inc(19379);lexer.nextToken();
        __CLR4_1_10exsexslusqjhki.R.inc(19380);for (;;) {{
            __CLR4_1_10exsexslusqjhki.R.inc(19381);Object arg = parser.parse();
            __CLR4_1_10exsexslusqjhki.R.inc(19382);jsonp.addParameter(arg);

            __CLR4_1_10exsexslusqjhki.R.inc(19383);tok = lexer.token();
            __CLR4_1_10exsexslusqjhki.R.inc(19384);if ((((tok == JSONToken.COMMA)&&(__CLR4_1_10exsexslusqjhki.R.iget(19385)!=0|true))||(__CLR4_1_10exsexslusqjhki.R.iget(19386)==0&false))) {{
                __CLR4_1_10exsexslusqjhki.R.inc(19387);lexer.nextToken();
            } }else {__CLR4_1_10exsexslusqjhki.R.inc(19388);if ((((tok == JSONToken.RPAREN)&&(__CLR4_1_10exsexslusqjhki.R.iget(19389)!=0|true))||(__CLR4_1_10exsexslusqjhki.R.iget(19390)==0&false))) {{
                __CLR4_1_10exsexslusqjhki.R.inc(19391);lexer.nextToken();
                __CLR4_1_10exsexslusqjhki.R.inc(19392);break;
            } }else {{
                __CLR4_1_10exsexslusqjhki.R.inc(19393);throw new JSONException("illegal jsonp : " + lexer.info());
            }
         }}}
        }__CLR4_1_10exsexslusqjhki.R.inc(19394);tok = lexer.token();
        __CLR4_1_10exsexslusqjhki.R.inc(19395);if ((((tok == JSONToken.SEMI)&&(__CLR4_1_10exsexslusqjhki.R.iget(19396)!=0|true))||(__CLR4_1_10exsexslusqjhki.R.iget(19397)==0&false))) {{
            __CLR4_1_10exsexslusqjhki.R.inc(19398);lexer.nextToken();
        }

        }__CLR4_1_10exsexslusqjhki.R.inc(19399);return (T) jsonp;
    }finally{__CLR4_1_10exsexslusqjhki.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10exsexslusqjhki.R.inc(19400);
        __CLR4_1_10exsexslusqjhki.R.inc(19401);return 0;
    }finally{__CLR4_1_10exsexslusqjhki.R.flushNeeded();}}
}
