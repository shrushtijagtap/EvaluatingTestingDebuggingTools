/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;

public class JSONLibDataFormatSerializer implements ObjectSerializer {public static class __CLR4_5_2k2nk2nlusyjmwf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,26034,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public JSONLibDataFormatSerializer(){try{__CLR4_5_2k2nk2nlusyjmwf.R.inc(26015);
    }finally{__CLR4_5_2k2nk2nlusyjmwf.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_2k2nk2nlusyjmwf.R.inc(26016);
    	__CLR4_5_2k2nk2nlusyjmwf.R.inc(26017);if ((((object == null)&&(__CLR4_5_2k2nk2nlusyjmwf.R.iget(26018)!=0|true))||(__CLR4_5_2k2nk2nlusyjmwf.R.iget(26019)==0&false))) {{
    		__CLR4_5_2k2nk2nlusyjmwf.R.inc(26020);serializer.out.writeNull();
    		__CLR4_5_2k2nk2nlusyjmwf.R.inc(26021);return;
    	}
    	
        }__CLR4_5_2k2nk2nlusyjmwf.R.inc(26022);Date date = (Date) object;
       
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26023);JSONObject json = new JSONObject();
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26024);json.put("date", date.getDate());
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26025);json.put("day", date.getDay());
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26026);json.put("hours", date.getHours());
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26027);json.put("minutes", date.getMinutes());
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26028);json.put("month", date.getMonth());
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26029);json.put("seconds", date.getSeconds());
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26030);json.put("time", date.getTime());
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26031);json.put("timezoneOffset", date.getTimezoneOffset());
        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26032);json.put("year", date.getYear());

        __CLR4_5_2k2nk2nlusyjmwf.R.inc(26033);serializer.write(json);
    }finally{__CLR4_5_2k2nk2nlusyjmwf.R.flushNeeded();}}
}
