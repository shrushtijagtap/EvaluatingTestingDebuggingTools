/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

public class FieldSerializerTest2 extends TestCase {static class __CLR4_5_21ky11ky1lusyju4b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73843,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_writeNull() throws Exception {__CLR4_5_21ky11ky1lusyju4b.R.globalSliceStart(getClass().getName(),73801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a7dh6o1ky1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ky11ky1lusyju4b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ky11ky1lusyju4b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldSerializerTest2.test_writeNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a7dh6o1ky1() throws Exception{try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73801);
        __CLR4_5_21ky11ky1lusyju4b.R.inc(73802);String text = toJSONString(new Entity());
        __CLR4_5_21ky11ky1lusyju4b.R.inc(73803);Assert.assertEquals("{\"value\":\"xxx\"}", text);
    }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}
    
    public static final String toJSONString(Object object, SerializerFeature... features) {try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73804);
        __CLR4_5_21ky11ky1lusyju4b.R.inc(73805);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21ky11ky1lusyju4b.R.inc(73806);try {
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73807);JSONSerializer serializer = new JSONSerializer(out);
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73808);serializer.getPropertyFilters().add(new PropertyFilter() {
                
                public boolean apply(Object source, String name, Object value) {try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73809);
                    __CLR4_5_21ky11ky1lusyju4b.R.inc(73810);if (((("id".equals(name))&&(__CLR4_5_21ky11ky1lusyju4b.R.iget(73811)!=0|true))||(__CLR4_5_21ky11ky1lusyju4b.R.iget(73812)==0&false))) {{
                        __CLR4_5_21ky11ky1lusyju4b.R.inc(73813);return false;
                    }
                    }__CLR4_5_21ky11ky1lusyju4b.R.inc(73814);return true;
                }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}
            });
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73815);serializer.getNameFilters().add(new NameFilter() {

                public String process(Object source, String name, Object value) {try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73816);
                    __CLR4_5_21ky11ky1lusyju4b.R.inc(73817);if (((("v".equals(name))&&(__CLR4_5_21ky11ky1lusyju4b.R.iget(73818)!=0|true))||(__CLR4_5_21ky11ky1lusyju4b.R.iget(73819)==0&false))) {{
                        __CLR4_5_21ky11ky1lusyju4b.R.inc(73820);return "value";
                    }
                    }__CLR4_5_21ky11ky1lusyju4b.R.inc(73821);return name;
                }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}
                
            });
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73822);serializer.getValueFilters().add(new ValueFilter() {
                
                public Object process(Object source, String name, Object value) {try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73823);
                    __CLR4_5_21ky11ky1lusyju4b.R.inc(73824);if (((("v".endsWith(name))&&(__CLR4_5_21ky11ky1lusyju4b.R.iget(73825)!=0|true))||(__CLR4_5_21ky11ky1lusyju4b.R.iget(73826)==0&false))) {{
                        __CLR4_5_21ky11ky1lusyju4b.R.inc(73827);return "xxx";
                    }
                    
                    }__CLR4_5_21ky11ky1lusyju4b.R.inc(73828);return value;
                }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}
            });
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73829);for (com.alibaba.fastjson.serializer.SerializerFeature feature : features) {{
                __CLR4_5_21ky11ky1lusyju4b.R.inc(73830);serializer.config(feature, true);
            }

            }__CLR4_5_21ky11ky1lusyju4b.R.inc(73831);serializer.write(object);

            __CLR4_5_21ky11ky1lusyju4b.R.inc(73832);return out.toString();
        } catch (StackOverflowError e) {
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73833);throw new JSONException("maybe circular references", e);
        } finally {
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73834);out.close();
        }
    }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}

    private static class Entity {

        private int id;
        @JSONField(name = "v", serialzeFeatures = { SerializerFeature.WriteMapNullValue })
        private String        value;

        public int getId() {try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73835);
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73836);return id;
        }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73837);
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73838);this.id = id;
        }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}

        public String getValue() {try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73839);
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73840);return value;
        }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_21ky11ky1lusyju4b.R.inc(73841);
            __CLR4_5_21ky11ky1lusyju4b.R.inc(73842);this.value = value;
        }finally{__CLR4_5_21ky11ky1lusyju4b.R.flushNeeded();}}

    }
}
