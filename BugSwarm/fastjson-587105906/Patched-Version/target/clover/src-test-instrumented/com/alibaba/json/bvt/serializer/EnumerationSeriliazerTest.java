/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.Enumeration;
import java.util.Vector;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class EnumerationSeriliazerTest extends TestCase {static class __CLR4_5_21s2s1s2slusvng4g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,83098,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_nullAsEmtpyList() throws Exception {__CLR4_5_21s2s1s2slusvng4g.R.globalSliceStart(getClass().getName(),83044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ex52b81s2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s2s1s2slusvng4g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s2s1s2slusvng4g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_nullAsEmtpyList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ex52b81s2s() throws Exception{try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83044);
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83045);VO e = new VO();
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83046);Assert.assertEquals("{\"elements\":[]}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue,
                                                                   SerializerFeature.WriteNullListAsEmpty));
    }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21s2s1s2slusvng4g.R.globalSliceStart(getClass().getName(),83047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1s2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s2s1s2slusvng4g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s2s1s2slusvng4g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1s2v() throws Exception{try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83047);
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83048);VO e = new VO();
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83049);Assert.assertEquals("{\"elements\":null}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue));
    }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21s2s1s2slusvng4g.R.globalSliceStart(getClass().getName(),83050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1s2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s2s1s2slusvng4g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s2s1s2slusvng4g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1s2y() throws Exception{try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83050);
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83051);VO e = new VO(new Entity(), new Entity());
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83052);Assert.assertEquals("{\"elements\":[{},{}]}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue));
    }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21s2s1s2slusvng4g.R.globalSliceStart(getClass().getName(),83053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441s31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s2s1s2slusvng4g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s2s1s2slusvng4g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441s31() throws Exception{try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83053);
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83054);VO e = new VO(new Entity(), new Entity2());
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83055);Assert.assertEquals("{\"elements\":[{},{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity2\"}]}",
                            JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                              SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21s2s1s2slusvng4g.R.globalSliceStart(getClass().getName(),83056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1s34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s2s1s2slusvng4g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s2s1s2slusvng4g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1s34() throws Exception{try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83056);
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83057);VO2 e = new VO2(new Entity(), new Entity());
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83058);Assert.assertEquals("{\"elements\":[{},{}]}", JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                                                        SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_5_21s2s1s2slusvng4g.R.globalSliceStart(getClass().getName(),83059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61s37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s2s1s2slusvng4g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s2s1s2slusvng4g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61s37() throws Exception{try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83059);
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83060);VO3 e = new VO3(new Entity(), new Entity2());
        __CLR4_5_21s2s1s2slusvng4g.R.inc(83061);Assert.assertEquals("{\"elements\":[{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity\"},{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity2\"}]}", JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                                                        SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

    private static class VO {

        private Enumeration<Entity> elements;

        public VO(Entity... array){try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83062);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83063);if ((((array.length > 0)&&(__CLR4_5_21s2s1s2slusvng4g.R.iget(83064)!=0|true))||(__CLR4_5_21s2s1s2slusvng4g.R.iget(83065)==0&false))) {{
                __CLR4_5_21s2s1s2slusvng4g.R.inc(83066);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_5_21s2s1s2slusvng4g.R.inc(83067);for (Entity item : array) {{
                    __CLR4_5_21s2s1s2slusvng4g.R.inc(83068);vector.add(item);
                }
                }__CLR4_5_21s2s1s2slusvng4g.R.inc(83069);this.elements = vector.elements();
            }
        }}finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

        public Enumeration<Entity> getElements() {try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83070);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83071);return elements;
        }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

        public void setElements(Enumeration<Entity> elements) {try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83072);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83073);this.elements = elements;
        }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

    }

    private static class VO2 extends IVO2<Entity> {

        public VO2(Entity... array){try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83074);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83075);if ((((array.length > 0)&&(__CLR4_5_21s2s1s2slusvng4g.R.iget(83076)!=0|true))||(__CLR4_5_21s2s1s2slusvng4g.R.iget(83077)==0&false))) {{
                __CLR4_5_21s2s1s2slusvng4g.R.inc(83078);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_5_21s2s1s2slusvng4g.R.inc(83079);for (Entity item : array) {{
                    __CLR4_5_21s2s1s2slusvng4g.R.inc(83080);vector.add(item);
                }
                }__CLR4_5_21s2s1s2slusvng4g.R.inc(83081);this.elements = vector.elements();
            }
        }}finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

    }
    
    private static class VO3 {

        private Enumeration elements;

        public VO3(Entity... array){try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83082);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83083);if ((((array.length > 0)&&(__CLR4_5_21s2s1s2slusvng4g.R.iget(83084)!=0|true))||(__CLR4_5_21s2s1s2slusvng4g.R.iget(83085)==0&false))) {{
                __CLR4_5_21s2s1s2slusvng4g.R.inc(83086);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_5_21s2s1s2slusvng4g.R.inc(83087);for (Entity item : array) {{
                    __CLR4_5_21s2s1s2slusvng4g.R.inc(83088);vector.add(item);
                }
                }__CLR4_5_21s2s1s2slusvng4g.R.inc(83089);this.elements = vector.elements();
            }
        }}finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

        public Enumeration getElements() {try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83090);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83091);return elements;
        }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

        public void setElements(Enumeration elements) {try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83092);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83093);this.elements = elements;
        }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

    }

    private static abstract class IVO2<T> {

        protected Enumeration<Entity> elements;

        public Enumeration<Entity> getElements() {try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83094);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83095);return elements;
        }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}

        public void setElements(Enumeration<Entity> elements) {try{__CLR4_5_21s2s1s2slusvng4g.R.inc(83096);
            __CLR4_5_21s2s1s2slusvng4g.R.inc(83097);this.elements = elements;
        }finally{__CLR4_5_21s2s1s2slusvng4g.R.flushNeeded();}}
    }

    public static class Entity {

    }

    public static class Entity2 extends Entity {

    }
}
