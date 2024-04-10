/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.decode;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.alibaba.json.test.benchmark.BenchmarkCase;
import com.alibaba.json.test.codec.Codec;

/**
 * Created by wenshao on 16/4/4.
 */
public class TradeObjectParse extends BenchmarkCase {public static class __CLR4_5_2235n235nlusyjws3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,97422,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String text;

    public TradeObjectParse(){
        super("TradeObjectParse");__CLR4_5_2235n235nlusyjws3.R.inc(97404);try{__CLR4_5_2235n235nlusyjws3.R.inc(97403);

        // JavaBeanMapping.getGlobalInstance().putDeserializer(Image.class, new ImageDeserializer());
        // JavaBeanMapping.getGlobalInstance().putDeserializer(Media.class, new MediaDeserializer());
    }finally{__CLR4_5_2235n235nlusyjws3.R.flushNeeded();}}

    public void init(Codec codec) throws Exception {try{__CLR4_5_2235n235nlusyjws3.R.inc(97405);
        __CLR4_5_2235n235nlusyjws3.R.inc(97406);InputStream is = TradeObjectParse.class.getClassLoader().getResourceAsStream("json/trade.json");
        __CLR4_5_2235n235nlusyjws3.R.inc(97407);Reader reader = new InputStreamReader(is, "UTF-8");
        __CLR4_5_2235n235nlusyjws3.R.inc(97408);char[] chars = new char[1024];

        __CLR4_5_2235n235nlusyjws3.R.inc(97409);StringBuilder out = new StringBuilder();
        __CLR4_5_2235n235nlusyjws3.R.inc(97410);for (;;) {{
            __CLR4_5_2235n235nlusyjws3.R.inc(97411);int len = reader.read(chars);
            __CLR4_5_2235n235nlusyjws3.R.inc(97412);if ((((len <= 0)&&(__CLR4_5_2235n235nlusyjws3.R.iget(97413)!=0|true))||(__CLR4_5_2235n235nlusyjws3.R.iget(97414)==0&false))) {{
                __CLR4_5_2235n235nlusyjws3.R.inc(97415);break;
            }
            }__CLR4_5_2235n235nlusyjws3.R.inc(97416);out.append(chars, 0, len);
        }
        }__CLR4_5_2235n235nlusyjws3.R.inc(97417);reader.close();
        __CLR4_5_2235n235nlusyjws3.R.inc(97418);text = out.toString();
        __CLR4_5_2235n235nlusyjws3.R.inc(97419);System.out.println("tradeJsonObject " + text.substring(100));
    }finally{__CLR4_5_2235n235nlusyjws3.R.flushNeeded();}}

    @Override
    public void execute(Codec codec) throws Exception {try{__CLR4_5_2235n235nlusyjws3.R.inc(97420);
        __CLR4_5_2235n235nlusyjws3.R.inc(97421);codec.decode(text);
    }finally{__CLR4_5_2235n235nlusyjws3.R.flushNeeded();}}

}