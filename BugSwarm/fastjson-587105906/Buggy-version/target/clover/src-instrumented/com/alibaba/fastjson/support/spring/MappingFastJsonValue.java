/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * A simple holder for the POJO to serialize via {@link FastJsonHttpMessageConverter} along with further
 * serialization instructions to be passed in to the converter.
 *
 * <p>
 * On the server side this wrapper is added with a {@code ResponseBodyInterceptor} after content negotiation selects the
 * converter to use but before the write.
 *
 * <p>
 * On the client side, simply wrap the POJO and pass it in to the {@code RestTemplate}.
 *
 * @author Jerry.Chen
 * @since 1.2.20
 *
 * @see JSONPObject
 */
@Deprecated
public class MappingFastJsonValue implements JSONSerializable {public static class __CLR4_1_10p2tp2tluszw0hj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,32526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String SECURITY_PREFIX = "/**/";
    private static final int BrowserSecureMask = SerializerFeature.BrowserSecure.mask;

    private Object value;
    private String jsonpFunction;

    /**
     * Create a new instance wrapping the given POJO to be serialized.
     *
     * @param value the Object to be serialized
     */
    public MappingFastJsonValue(Object value) {try{__CLR4_1_10p2tp2tluszw0hj.R.inc(32501);
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32502);this.value = value;
    }finally{__CLR4_1_10p2tp2tluszw0hj.R.flushNeeded();}}

    /**
     * Modify the POJO to serialize.
     */
    public void setValue(Object value) {try{__CLR4_1_10p2tp2tluszw0hj.R.inc(32503);
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32504);this.value = value;
    }finally{__CLR4_1_10p2tp2tluszw0hj.R.flushNeeded();}}

    /**
     * Return the POJO that needs to be serialized.
     */
    public Object getValue() {try{__CLR4_1_10p2tp2tluszw0hj.R.inc(32505);
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32506);return this.value;
    }finally{__CLR4_1_10p2tp2tluszw0hj.R.flushNeeded();}}

    /**
     * Set the name of the JSONP function name.
     */
    public void setJsonpFunction(String functionName) {try{__CLR4_1_10p2tp2tluszw0hj.R.inc(32507);
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32508);this.jsonpFunction = functionName;
    }finally{__CLR4_1_10p2tp2tluszw0hj.R.flushNeeded();}}

    /**
     * Return the configured JSONP function name.
     */
    public String getJsonpFunction() {try{__CLR4_1_10p2tp2tluszw0hj.R.inc(32509);
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32510);return this.jsonpFunction;
    }finally{__CLR4_1_10p2tp2tluszw0hj.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_1_10p2tp2tluszw0hj.R.inc(32511);
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32512);SerializeWriter writer = serializer.out;

        __CLR4_1_10p2tp2tluszw0hj.R.inc(32513);if((((jsonpFunction == null)&&(__CLR4_1_10p2tp2tluszw0hj.R.iget(32514)!=0|true))||(__CLR4_1_10p2tp2tluszw0hj.R.iget(32515)==0&false))){{
            __CLR4_1_10p2tp2tluszw0hj.R.inc(32516);serializer.write(value);
            __CLR4_1_10p2tp2tluszw0hj.R.inc(32517);return;
        }


        }__CLR4_1_10p2tp2tluszw0hj.R.inc(32518);if (((((features & BrowserSecureMask) != 0 || (writer.isEnabled(BrowserSecureMask)))&&(__CLR4_1_10p2tp2tluszw0hj.R.iget(32519)!=0|true))||(__CLR4_1_10p2tp2tluszw0hj.R.iget(32520)==0&false))) {{
            __CLR4_1_10p2tp2tluszw0hj.R.inc(32521);writer.write(SECURITY_PREFIX);
        }

        }__CLR4_1_10p2tp2tluszw0hj.R.inc(32522);writer.write(jsonpFunction);
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32523);writer.write('(');
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32524);serializer.write(value);
        __CLR4_1_10p2tp2tluszw0hj.R.inc(32525);writer.write(')');
    }finally{__CLR4_1_10p2tp2tluszw0hj.R.flushNeeded();}}
}
