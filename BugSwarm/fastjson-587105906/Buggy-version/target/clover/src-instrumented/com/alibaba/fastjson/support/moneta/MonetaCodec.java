/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.support.moneta;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import org.javamoney.moneta.Money;

import javax.money.Monetary;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;

public class MonetaCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10onzonzluszw0dz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,31998,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final MonetaCodec instance = new MonetaCodec();

    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_1_10onzonzluszw0dz.R.inc(31967);
        __CLR4_1_10onzonzluszw0dz.R.inc(31968);Money money = (Money) object;
        __CLR4_1_10onzonzluszw0dz.R.inc(31969);if ((((money == null)&&(__CLR4_1_10onzonzluszw0dz.R.iget(31970)!=0|true))||(__CLR4_1_10onzonzluszw0dz.R.iget(31971)==0&false))) {{
            __CLR4_1_10onzonzluszw0dz.R.inc(31972);serializer.writeNull();
            __CLR4_1_10onzonzluszw0dz.R.inc(31973);return;
        }

        }__CLR4_1_10onzonzluszw0dz.R.inc(31974);SerializeWriter out = serializer.out;
        __CLR4_1_10onzonzluszw0dz.R.inc(31975);out.writeFieldValue('{', "numberStripped", money.getNumberStripped());
        __CLR4_1_10onzonzluszw0dz.R.inc(31976);out.writeFieldValue(',', "currency", money.getCurrency().getCurrencyCode());
        __CLR4_1_10onzonzluszw0dz.R.inc(31977);out.write('}');
    }finally{__CLR4_1_10onzonzluszw0dz.R.flushNeeded();}}

    @Override
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_10onzonzluszw0dz.R.inc(31978);
        __CLR4_1_10onzonzluszw0dz.R.inc(31979);JSONObject object = parser.parseObject();
        __CLR4_1_10onzonzluszw0dz.R.inc(31980);Object currency = object.get("currency");

        __CLR4_1_10onzonzluszw0dz.R.inc(31981);String currencyCode = null;
        __CLR4_1_10onzonzluszw0dz.R.inc(31982);if ((((currency instanceof JSONObject)&&(__CLR4_1_10onzonzluszw0dz.R.iget(31983)!=0|true))||(__CLR4_1_10onzonzluszw0dz.R.iget(31984)==0&false))) {{
            __CLR4_1_10onzonzluszw0dz.R.inc(31985);currencyCode = ((JSONObject) currency).getString("currencyCode");
        } }else {__CLR4_1_10onzonzluszw0dz.R.inc(31986);if ((((currency instanceof String)&&(__CLR4_1_10onzonzluszw0dz.R.iget(31987)!=0|true))||(__CLR4_1_10onzonzluszw0dz.R.iget(31988)==0&false))) {{
            __CLR4_1_10onzonzluszw0dz.R.inc(31989);currencyCode = (String) currency;
        }

        }}__CLR4_1_10onzonzluszw0dz.R.inc(31990);Object numberStripped = object.get("numberStripped");

        __CLR4_1_10onzonzluszw0dz.R.inc(31991);if ((((numberStripped instanceof BigDecimal)&&(__CLR4_1_10onzonzluszw0dz.R.iget(31992)!=0|true))||(__CLR4_1_10onzonzluszw0dz.R.iget(31993)==0&false))) {{
            __CLR4_1_10onzonzluszw0dz.R.inc(31994);return (T) Money.of((BigDecimal) numberStripped, Monetary.getCurrency(currencyCode));
        }

        }__CLR4_1_10onzonzluszw0dz.R.inc(31995);throw new UnsupportedOperationException();
    }finally{__CLR4_1_10onzonzluszw0dz.R.flushNeeded();}}

    @Override
    public int getFastMatchToken() {try{__CLR4_1_10onzonzluszw0dz.R.inc(31996);
        __CLR4_1_10onzonzluszw0dz.R.inc(31997);return 0;
    }finally{__CLR4_1_10onzonzluszw0dz.R.flushNeeded();}}
}
