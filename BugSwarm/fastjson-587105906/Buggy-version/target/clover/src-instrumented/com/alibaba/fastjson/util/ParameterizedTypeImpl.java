/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class ParameterizedTypeImpl implements ParameterizedType {public static class __CLR4_1_10rcqrcqlusqjpck{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,35494,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Type[] actualTypeArguments;
    private final Type   ownerType;
    private final Type   rawType;

    public ParameterizedTypeImpl(Type[] actualTypeArguments, Type ownerType, Type rawType){try{__CLR4_1_10rcqrcqlusqjpck.R.inc(35450);
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35451);this.actualTypeArguments = actualTypeArguments;
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35452);this.ownerType = ownerType;
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35453);this.rawType = rawType;
    }finally{__CLR4_1_10rcqrcqlusqjpck.R.flushNeeded();}}

    public Type[] getActualTypeArguments() {try{__CLR4_1_10rcqrcqlusqjpck.R.inc(35454);
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35455);return actualTypeArguments;
    }finally{__CLR4_1_10rcqrcqlusqjpck.R.flushNeeded();}}

    public Type getOwnerType() {try{__CLR4_1_10rcqrcqlusqjpck.R.inc(35456);
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35457);return ownerType;
    }finally{__CLR4_1_10rcqrcqlusqjpck.R.flushNeeded();}}

    public Type getRawType() {try{__CLR4_1_10rcqrcqlusqjpck.R.inc(35458);
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35459);return rawType;
    }finally{__CLR4_1_10rcqrcqlusqjpck.R.flushNeeded();}}


    @Override
    public boolean equals(Object o) {try{__CLR4_1_10rcqrcqlusqjpck.R.inc(35460);
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35461);if ((((this == o)&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35462)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35463)==0&false))) {__CLR4_1_10rcqrcqlusqjpck.R.inc(35464);return true;
        }__CLR4_1_10rcqrcqlusqjpck.R.inc(35465);if ((((o == null || getClass() != o.getClass())&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35466)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35467)==0&false))) {__CLR4_1_10rcqrcqlusqjpck.R.inc(35468);return false;

        }__CLR4_1_10rcqrcqlusqjpck.R.inc(35469);ParameterizedTypeImpl that = (ParameterizedTypeImpl) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35470);if ((((!Arrays.equals(actualTypeArguments, that.actualTypeArguments))&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35471)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35472)==0&false))) {__CLR4_1_10rcqrcqlusqjpck.R.inc(35473);return false;
        }__CLR4_1_10rcqrcqlusqjpck.R.inc(35474);if (((((((ownerType != null )&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35475)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35476)==0&false))? !ownerType.equals(that.ownerType) : that.ownerType != null)&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35477)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35478)==0&false))) {__CLR4_1_10rcqrcqlusqjpck.R.inc(35479);return false;
        }__CLR4_1_10rcqrcqlusqjpck.R.inc(35480);return (((rawType != null )&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35481)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35482)==0&false))? rawType.equals(that.rawType) : that.rawType == null;

    }finally{__CLR4_1_10rcqrcqlusqjpck.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_1_10rcqrcqlusqjpck.R.inc(35483);
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35484);int result = (((actualTypeArguments != null )&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35485)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35486)==0&false))? Arrays.hashCode(actualTypeArguments) : 0;
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35487);result = 31 * result + ((((ownerType != null )&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35488)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35489)==0&false))? ownerType.hashCode() : 0);
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35490);result = 31 * result + ((((rawType != null )&&(__CLR4_1_10rcqrcqlusqjpck.R.iget(35491)!=0|true))||(__CLR4_1_10rcqrcqlusqjpck.R.iget(35492)==0&false))? rawType.hashCode() : 0);
        __CLR4_1_10rcqrcqlusqjpck.R.inc(35493);return result;
    }finally{__CLR4_1_10rcqrcqlusqjpck.R.flushNeeded();}}
}
