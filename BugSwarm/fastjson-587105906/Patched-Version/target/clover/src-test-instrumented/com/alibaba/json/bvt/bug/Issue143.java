/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;

public class Issue143 extends TestCase {static class __CLR4_5_216nt16ntlusyjs69{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,55319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_216nt16ntlusyjs69.R.globalSliceStart(getClass().getName(),55289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb16nt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216nt16ntlusyjs69.R.rethrow($CLV_t2$);}finally{__CLR4_5_216nt16ntlusyjs69.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue143.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb16nt() throws Exception{try{__CLR4_5_216nt16ntlusyjs69.R.inc(55289);
        __CLR4_5_216nt16ntlusyjs69.R.inc(55290);String text = "{\"rec\":[{},{}]}";
        
        __CLR4_5_216nt16ntlusyjs69.R.inc(55291);JsonStroe store = new JsonStroe();
        
        __CLR4_5_216nt16ntlusyjs69.R.inc(55292);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_216nt16ntlusyjs69.R.inc(55293);reader.startObject();
        
        __CLR4_5_216nt16ntlusyjs69.R.inc(55294);String key = reader.readString();
        
        __CLR4_5_216nt16ntlusyjs69.R.inc(55295);Assert.assertEquals("rec", key);
        __CLR4_5_216nt16ntlusyjs69.R.inc(55296);reader.startArray();
        
        __CLR4_5_216nt16ntlusyjs69.R.inc(55297);List<KeyValue> list = new ArrayList<KeyValue>();
        __CLR4_5_216nt16ntlusyjs69.R.inc(55298);while((((reader.hasNext())&&(__CLR4_5_216nt16ntlusyjs69.R.iget(55299)!=0|true))||(__CLR4_5_216nt16ntlusyjs69.R.iget(55300)==0&false))) {{
            __CLR4_5_216nt16ntlusyjs69.R.inc(55301);KeyValue keyValue = reader.readObject(KeyValue.class);
            __CLR4_5_216nt16ntlusyjs69.R.inc(55302);list.add(keyValue);
        }
        }__CLR4_5_216nt16ntlusyjs69.R.inc(55303);store.setRec(list);
        
        __CLR4_5_216nt16ntlusyjs69.R.inc(55304);reader.endArray();
        
        __CLR4_5_216nt16ntlusyjs69.R.inc(55305);reader.endObject();
        
        __CLR4_5_216nt16ntlusyjs69.R.inc(55306);reader.close();
    }finally{__CLR4_5_216nt16ntlusyjs69.R.flushNeeded();}}

    public static class JsonStroe {

        private List rec = new ArrayList();

        public void setRec(List items) {try{__CLR4_5_216nt16ntlusyjs69.R.inc(55307);
            __CLR4_5_216nt16ntlusyjs69.R.inc(55308);this.rec = items;
        }finally{__CLR4_5_216nt16ntlusyjs69.R.flushNeeded();}}

        public List getRec() {try{__CLR4_5_216nt16ntlusyjs69.R.inc(55309);
            __CLR4_5_216nt16ntlusyjs69.R.inc(55310);return rec;
        }finally{__CLR4_5_216nt16ntlusyjs69.R.flushNeeded();}}
    }

    public static class KeyValue {

        private String key;
        private String value;

        public String getKey() {try{__CLR4_5_216nt16ntlusyjs69.R.inc(55311);
            __CLR4_5_216nt16ntlusyjs69.R.inc(55312);return key;
        }finally{__CLR4_5_216nt16ntlusyjs69.R.flushNeeded();}}

        public void setKey(String key) {try{__CLR4_5_216nt16ntlusyjs69.R.inc(55313);
            __CLR4_5_216nt16ntlusyjs69.R.inc(55314);this.key = key;
        }finally{__CLR4_5_216nt16ntlusyjs69.R.flushNeeded();}}

        public String getValue() {try{__CLR4_5_216nt16ntlusyjs69.R.inc(55315);
            __CLR4_5_216nt16ntlusyjs69.R.inc(55316);return value;
        }finally{__CLR4_5_216nt16ntlusyjs69.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_216nt16ntlusyjs69.R.inc(55317);
            __CLR4_5_216nt16ntlusyjs69.R.inc(55318);this.value = value;
        }finally{__CLR4_5_216nt16ntlusyjs69.R.flushNeeded();}}
    }
}
