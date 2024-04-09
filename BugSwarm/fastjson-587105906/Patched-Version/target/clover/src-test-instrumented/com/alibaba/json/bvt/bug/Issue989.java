/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.MapSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import junit.framework.TestCase;
import org.junit.Assert;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by wenshao on 10/01/2017.
 */
public class Issue989 extends TestCase {static class __CLR4_5_218o218o2lusvn8pg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,57918,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_218o218o2lusvn8pg.R.globalSliceStart(getClass().getName(),57890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb18o2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218o218o2lusvn8pg.R.rethrow($CLV_t2$);}finally{__CLR4_5_218o218o2lusvn8pg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue989.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57890,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb18o2() throws Exception{try{__CLR4_5_218o218o2lusvn8pg.R.inc(57890);
        __CLR4_5_218o218o2lusvn8pg.R.inc(57891);assertEquals(
                JSON.toJSONString(getMyObject(new HashMap<String, Name>())),
                JSON.toJSONString(getMyObject(new TreeMap<String, Name>()))
        );
    }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}

    private static MyObject getMyObject(Map<String, Name> names) {try{__CLR4_5_218o218o2lusvn8pg.R.inc(57892);
        __CLR4_5_218o218o2lusvn8pg.R.inc(57893);MyObject mapObj = new MyObject();
        __CLR4_5_218o218o2lusvn8pg.R.inc(57894);mapObj.setNames(names);
        __CLR4_5_218o218o2lusvn8pg.R.inc(57895);Name name = new Name();
        __CLR4_5_218o218o2lusvn8pg.R.inc(57896);name.setFirst("foo");
        __CLR4_5_218o218o2lusvn8pg.R.inc(57897);name.setSecond("boo");
        __CLR4_5_218o218o2lusvn8pg.R.inc(57898);names.put("mock", name);
        __CLR4_5_218o218o2lusvn8pg.R.inc(57899);return mapObj;
    }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}

    public static class NameMapCodec implements ObjectSerializer {

        public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_218o218o2lusvn8pg.R.inc(57900);
            __CLR4_5_218o218o2lusvn8pg.R.inc(57901);JSONObject names = new JSONObject();
            __CLR4_5_218o218o2lusvn8pg.R.inc(57902);for(Map.Entry<String, Name> entry :
                    ((Map<String, Name>)object).entrySet()) {{
                __CLR4_5_218o218o2lusvn8pg.R.inc(57903);Name name = entry.getValue();
                __CLR4_5_218o218o2lusvn8pg.R.inc(57904);names.put(entry.getKey(), name.getFirst() + ":" + name.getSecond());
            }
            }__CLR4_5_218o218o2lusvn8pg.R.inc(57905);MapSerializer.instance.write(serializer, names, fieldName, JSONObject.class, features);
        }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}

    }

    public static class MyObject {

        @JSONField(serializeUsing = NameMapCodec.class)
        private Map<String, Name> names;

        public Map<String, Name> getNames() {try{__CLR4_5_218o218o2lusvn8pg.R.inc(57906);
            __CLR4_5_218o218o2lusvn8pg.R.inc(57907);return names;
        }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}

        public void setNames(Map<String, Name> names) {try{__CLR4_5_218o218o2lusvn8pg.R.inc(57908);
            __CLR4_5_218o218o2lusvn8pg.R.inc(57909);this.names = names;
        }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}

    }

    private static class Name {

        private String first;

        private String second;

        public String getFirst() {try{__CLR4_5_218o218o2lusvn8pg.R.inc(57910);
            __CLR4_5_218o218o2lusvn8pg.R.inc(57911);return first;
        }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}

        public void setFirst(String first) {try{__CLR4_5_218o218o2lusvn8pg.R.inc(57912);
            __CLR4_5_218o218o2lusvn8pg.R.inc(57913);this.first = first;
        }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}

        public String getSecond() {try{__CLR4_5_218o218o2lusvn8pg.R.inc(57914);
            __CLR4_5_218o218o2lusvn8pg.R.inc(57915);return second;
        }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}

        public void setSecond(String second) {try{__CLR4_5_218o218o2lusvn8pg.R.inc(57916);
            __CLR4_5_218o218o2lusvn8pg.R.inc(57917);this.second = second;
        }finally{__CLR4_5_218o218o2lusvn8pg.R.flushNeeded();}}
    }
}
