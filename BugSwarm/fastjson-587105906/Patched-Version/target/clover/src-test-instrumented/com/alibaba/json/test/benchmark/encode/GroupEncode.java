/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.encode;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.test.benchmark.BenchmarkCase;
import com.alibaba.json.test.codec.Codec;
import com.alibaba.json.test.entity.Group;

public class GroupEncode extends BenchmarkCase {public static class __CLR4_5_2248n248nlusvnko9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,98821,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Object object;

    public GroupEncode(){
        super("GroupEncode");__CLR4_5_2248n248nlusvnko9.R.inc(98808);try{__CLR4_5_2248n248nlusvnko9.R.inc(98807);

        __CLR4_5_2248n248nlusvnko9.R.inc(98809);try {
            __CLR4_5_2248n248nlusvnko9.R.inc(98810);String resource = "json/group.json";
            __CLR4_5_2248n248nlusvnko9.R.inc(98811);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
            __CLR4_5_2248n248nlusvnko9.R.inc(98812);String text = IOUtils.toString(is);
            __CLR4_5_2248n248nlusvnko9.R.inc(98813);is.close();

            __CLR4_5_2248n248nlusvnko9.R.inc(98814);object = JSON.parseObject(text, Group.class);
        } catch (IOException ex) {
            __CLR4_5_2248n248nlusvnko9.R.inc(98815);ex.printStackTrace();
        }
    }finally{__CLR4_5_2248n248nlusvnko9.R.flushNeeded();}}

    @Override
    public void execute(Codec codec) throws Exception {try{__CLR4_5_2248n248nlusvnko9.R.inc(98816);
        __CLR4_5_2248n248nlusvnko9.R.inc(98817);for (int i = 0; (((i < 10)&&(__CLR4_5_2248n248nlusvnko9.R.iget(98818)!=0|true))||(__CLR4_5_2248n248nlusvnko9.R.iget(98819)==0&false)); ++i) {{
            __CLR4_5_2248n248nlusvnko9.R.inc(98820);codec.encode(object);
        }
    }}finally{__CLR4_5_2248n248nlusvnko9.R.flushNeeded();}}
}
