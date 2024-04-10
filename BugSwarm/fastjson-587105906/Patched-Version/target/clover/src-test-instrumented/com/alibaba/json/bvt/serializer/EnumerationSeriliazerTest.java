/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.Enumeration;
import java.util.Vector;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class EnumerationSeriliazerTest extends TestCase {static class __CLR4_5_21r4k1r4klusyjuuc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,81866,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_nullAsEmtpyList() throws Exception {__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceStart(getClass().getName(),81812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ex52b81r4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r4k1r4klusyjuuc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_nullAsEmtpyList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81812,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ex52b81r4k() throws Exception{try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81812);
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81813);VO e = new VO();
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81814);Assert.assertEquals("{\"elements\":[]}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue,
                                                                   SerializerFeature.WriteNullListAsEmpty));
    }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceStart(getClass().getName(),81815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1r4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r4k1r4klusyjuuc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1r4n() throws Exception{try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81815);
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81816);VO e = new VO();
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81817);Assert.assertEquals("{\"elements\":null}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue));
    }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceStart(getClass().getName(),81818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1r4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r4k1r4klusyjuuc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1r4q() throws Exception{try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81818);
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81819);VO e = new VO(new Entity(), new Entity());
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81820);Assert.assertEquals("{\"elements\":[{},{}]}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue));
    }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceStart(getClass().getName(),81821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441r4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r4k1r4klusyjuuc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81821,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441r4t() throws Exception{try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81821);
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81822);VO e = new VO(new Entity(), new Entity2());
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81823);Assert.assertEquals("{\"elements\":[{},{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity2\"}]}",
                            JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                              SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceStart(getClass().getName(),81824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1r4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r4k1r4klusyjuuc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81824,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1r4w() throws Exception{try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81824);
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81825);VO2 e = new VO2(new Entity(), new Entity());
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81826);Assert.assertEquals("{\"elements\":[{},{}]}", JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                                                        SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceStart(getClass().getName(),81827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61r4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r4k1r4klusyjuuc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r4k1r4klusyjuuc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81827,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61r4z() throws Exception{try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81827);
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81828);VO3 e = new VO3(new Entity(), new Entity2());
        __CLR4_5_21r4k1r4klusyjuuc.R.inc(81829);Assert.assertEquals("{\"elements\":[{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity\"},{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity2\"}]}", JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                                                        SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

    private static class VO {

        private Enumeration<Entity> elements;

        public VO(Entity... array){try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81830);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81831);if ((((array.length > 0)&&(__CLR4_5_21r4k1r4klusyjuuc.R.iget(81832)!=0|true))||(__CLR4_5_21r4k1r4klusyjuuc.R.iget(81833)==0&false))) {{
                __CLR4_5_21r4k1r4klusyjuuc.R.inc(81834);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_5_21r4k1r4klusyjuuc.R.inc(81835);for (Entity item : array) {{
                    __CLR4_5_21r4k1r4klusyjuuc.R.inc(81836);vector.add(item);
                }
                }__CLR4_5_21r4k1r4klusyjuuc.R.inc(81837);this.elements = vector.elements();
            }
        }}finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

        public Enumeration<Entity> getElements() {try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81838);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81839);return elements;
        }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

        public void setElements(Enumeration<Entity> elements) {try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81840);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81841);this.elements = elements;
        }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

    }

    private static class VO2 extends IVO2<Entity> {

        public VO2(Entity... array){try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81842);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81843);if ((((array.length > 0)&&(__CLR4_5_21r4k1r4klusyjuuc.R.iget(81844)!=0|true))||(__CLR4_5_21r4k1r4klusyjuuc.R.iget(81845)==0&false))) {{
                __CLR4_5_21r4k1r4klusyjuuc.R.inc(81846);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_5_21r4k1r4klusyjuuc.R.inc(81847);for (Entity item : array) {{
                    __CLR4_5_21r4k1r4klusyjuuc.R.inc(81848);vector.add(item);
                }
                }__CLR4_5_21r4k1r4klusyjuuc.R.inc(81849);this.elements = vector.elements();
            }
        }}finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

    }
    
    private static class VO3 {

        private Enumeration elements;

        public VO3(Entity... array){try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81850);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81851);if ((((array.length > 0)&&(__CLR4_5_21r4k1r4klusyjuuc.R.iget(81852)!=0|true))||(__CLR4_5_21r4k1r4klusyjuuc.R.iget(81853)==0&false))) {{
                __CLR4_5_21r4k1r4klusyjuuc.R.inc(81854);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_5_21r4k1r4klusyjuuc.R.inc(81855);for (Entity item : array) {{
                    __CLR4_5_21r4k1r4klusyjuuc.R.inc(81856);vector.add(item);
                }
                }__CLR4_5_21r4k1r4klusyjuuc.R.inc(81857);this.elements = vector.elements();
            }
        }}finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

        public Enumeration getElements() {try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81858);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81859);return elements;
        }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

        public void setElements(Enumeration elements) {try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81860);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81861);this.elements = elements;
        }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

    }

    private static abstract class IVO2<T> {

        protected Enumeration<Entity> elements;

        public Enumeration<Entity> getElements() {try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81862);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81863);return elements;
        }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}

        public void setElements(Enumeration<Entity> elements) {try{__CLR4_5_21r4k1r4klusyjuuc.R.inc(81864);
            __CLR4_5_21r4k1r4klusyjuuc.R.inc(81865);this.elements = elements;
        }finally{__CLR4_5_21r4k1r4klusyjuuc.R.flushNeeded();}}
    }

    public static class Entity {

    }

    public static class Entity2 extends Entity {

    }
}
