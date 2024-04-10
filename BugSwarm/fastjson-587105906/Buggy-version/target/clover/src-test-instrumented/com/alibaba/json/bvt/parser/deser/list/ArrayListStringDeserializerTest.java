/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class ArrayListStringDeserializerTest extends TestCase {static class __CLR4_1_101nma1nmaluszwdtf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,77337,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_null() throws Exception {__CLR4_1_101nma1nmaluszwdtf.R.globalSliceStart(getClass().getName(),77266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1nma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nma1nmaluszwdtf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nma1nmaluszwdtf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListStringDeserializerTest.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77266,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1nma() throws Exception{try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77266);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77267);Assert.assertNull(JSON.parseObject("null", new TypeReference<List<String>>() {
        }));
        
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77268);Assert.assertNull(JSON.parseArray("null", new Type[] {new TypeReference<List<String>>() {
        }.getType()}));
        
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77269);Assert.assertNull(JSON.parseArray("null", Entity.class));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77270);Assert.assertNull(JSON.parseArray("null", Entity[].class));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77271);Assert.assertNull(JSON.parseArray("null"));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77272);Assert.assertNull(JSON.parseObject("null"));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77273);Assert.assertNull(JSON.parseObject("null", Object[].class));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77274);Assert.assertNull(JSON.parseObject("null", Entity[].class));
        
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77275);Assert.assertNull(JSON.parseArray("[null]", new Type[] {new TypeReference<List<String>>() {
        }.getType()}).get(0));
    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public void test_strings() throws Exception {__CLR4_1_101nma1nmaluszwdtf.R.globalSliceStart(getClass().getName(),77276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10l1z4ho1nmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nma1nmaluszwdtf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nma1nmaluszwdtf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListStringDeserializerTest.test_strings",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77276,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10l1z4ho1nmk() throws Exception{try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77276);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77277);Entity a = JSON.parseObject("{units:['NANOSECONDS', 'SECONDS', 3, null]}", Entity.class);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77278);Assert.assertEquals("NANOSECONDS", a.getUnits().get(0));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77279);Assert.assertEquals("SECONDS", a.getUnits().get(1));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77280);Assert.assertEquals("3", a.getUnits().get(2));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77281);Assert.assertEquals(null, a.getUnits().get(3));

    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public void test_strings_() throws Exception {__CLR4_1_101nma1nmaluszwdtf.R.globalSliceStart(getClass().getName(),77282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10amp2a71nmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nma1nmaluszwdtf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nma1nmaluszwdtf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListStringDeserializerTest.test_strings_",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77282,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10amp2a71nmq() throws Exception{try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77282);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77283);Entity a = JSON.parseObject("{units:['NANOSECONDS',,,, 'SECONDS', 3, null]}", Entity.class);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77284);Assert.assertEquals("NANOSECONDS", a.getUnits().get(0));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77285);Assert.assertEquals("SECONDS", a.getUnits().get(1));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77286);Assert.assertEquals("3", a.getUnits().get(2));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77287);Assert.assertEquals(null, a.getUnits().get(3));

    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public void test_strings_2() throws Exception {__CLR4_1_101nma1nmaluszwdtf.R.globalSliceStart(getClass().getName(),77288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102moi9d1nmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nma1nmaluszwdtf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nma1nmaluszwdtf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListStringDeserializerTest.test_strings_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77288,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102moi9d1nmw() throws Exception{try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77288);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77289);List<String> list = JSON.parseObject("['NANOSECONDS', 'SECONDS', 3, null]", new TypeReference<List<String>>() {
        });
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77290);Assert.assertEquals("NANOSECONDS", list.get(0));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77291);Assert.assertEquals("SECONDS", list.get(1));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77292);Assert.assertEquals("3", list.get(2));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77293);Assert.assertEquals(null, list.get(3));
    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public void test_strings_3() throws Exception {__CLR4_1_101nma1nmaluszwdtf.R.globalSliceStart(getClass().getName(),77294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mbgj41nn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nma1nmaluszwdtf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nma1nmaluszwdtf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListStringDeserializerTest.test_strings_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77294,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mbgj41nn2() throws Exception{try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77294);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77295);List<String> list = JSON.parseObject("['NANOSECONDS', 'SECONDS', 3, null]", new TypeReference<List<String>>() {
        }.getType(), 0, Feature.AllowSingleQuotes);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77296);Assert.assertEquals("NANOSECONDS", list.get(0));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77297);Assert.assertEquals("SECONDS", list.get(1));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77298);Assert.assertEquals("3", list.get(2));
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77299);Assert.assertEquals(null, list.get(3));
    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public void test_string_error_not_eof() throws Exception {__CLR4_1_101nma1nmaluszwdtf.R.globalSliceStart(getClass().getName(),77300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107qi2kf1nn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nma1nmaluszwdtf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nma1nmaluszwdtf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListStringDeserializerTest.test_string_error_not_eof",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107qi2kf1nn8() throws Exception{try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77300);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77301);JSONException ex = null;
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77302);try {
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77303);JSON.parseObject("[}", new TypeReference<List<String>>() {
            }.getType(), 0, Feature.AllowSingleQuotes);
        } catch (JSONException e) {
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77304);ex = e;
        }
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77305);Assert.assertNotNull(ex);
    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public void test_string_error() throws Exception {__CLR4_1_101nma1nmaluszwdtf.R.globalSliceStart(getClass().getName(),77306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g8aroy1nne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nma1nmaluszwdtf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nma1nmaluszwdtf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListStringDeserializerTest.test_string_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77306,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g8aroy1nne() throws Exception{try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77306);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77307);JSONException ex = null;
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77308);try {
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77309);JSON.parseObject("'123'", new TypeReference<List<String>>() {
            });
        } catch (JSONException e) {
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77310);ex = e;
        }
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77311);Assert.assertNotNull(ex);
    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public void test_string_error_1() throws Exception {__CLR4_1_101nma1nmaluszwdtf.R.globalSliceStart(getClass().getName(),77312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xg34001nnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nma1nmaluszwdtf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nma1nmaluszwdtf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListStringDeserializerTest.test_string_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77312,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xg34001nnk() throws Exception{try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77312);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77313);JSONException ex = null;
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77314);try {
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77315);parseObject("{units:['NANOSECONDS',,,, 'SECONDS', 3, null]}", Entity.class);
        } catch (JSONException e) {
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77316);ex = e;
        }
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77317);Assert.assertNotNull(ex);
    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public static final <T> T parseObject(String input, Type clazz, Feature... features) {try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77318);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77319);if ((((input == null)&&(__CLR4_1_101nma1nmaluszwdtf.R.iget(77320)!=0|true))||(__CLR4_1_101nma1nmaluszwdtf.R.iget(77321)==0&false))) {{
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77322);return null;
        }

        }__CLR4_1_101nma1nmaluszwdtf.R.inc(77323);int featureValues = 0;
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77324);for (Feature feature : features) {{
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77325);featureValues = Feature.config(featureValues, feature, true);
        }

        }__CLR4_1_101nma1nmaluszwdtf.R.inc(77326);DefaultJSONParser parser = new DefaultJSONParser(input, ParserConfig.getGlobalInstance(), featureValues);
        __CLR4_1_101nma1nmaluszwdtf.R.inc(77327);T value = (T) parser.parseObject(clazz);

        __CLR4_1_101nma1nmaluszwdtf.R.inc(77328);if ((((clazz != JSONArray.class)&&(__CLR4_1_101nma1nmaluszwdtf.R.iget(77329)!=0|true))||(__CLR4_1_101nma1nmaluszwdtf.R.iget(77330)==0&false))) {{
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77331);parser.close();
        }

        }__CLR4_1_101nma1nmaluszwdtf.R.inc(77332);return (T) value;
    }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    public static class Entity {

        private List<String> units = new ArrayList<String>();

        public List<String> getUnits() {try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77333);
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77334);return units;
        }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

        public void setUnits(List<String> units) {try{__CLR4_1_101nma1nmaluszwdtf.R.inc(77335);
            __CLR4_1_101nma1nmaluszwdtf.R.inc(77336);this.units = units;
        }finally{__CLR4_1_101nma1nmaluszwdtf.R.flushNeeded();}}

    }
}
