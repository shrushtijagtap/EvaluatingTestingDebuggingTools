/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.util.Enumeration;
import java.util.Vector;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class EnumerationSeriliazerTest extends TestCase {static class __CLR4_1_101s331s33luszwexh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,83109,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_nullAsEmtpyList() throws Exception {__CLR4_1_101s331s33luszwexh.R.globalSliceStart(getClass().getName(),83055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ex52b81s33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s331s33luszwexh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s331s33luszwexh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_nullAsEmtpyList",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83055,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ex52b81s33() throws Exception{try{__CLR4_1_101s331s33luszwexh.R.inc(83055);
        __CLR4_1_101s331s33luszwexh.R.inc(83056);VO e = new VO();
        __CLR4_1_101s331s33luszwexh.R.inc(83057);Assert.assertEquals("{\"elements\":[]}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue,
                                                                   SerializerFeature.WriteNullListAsEmpty));
    }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101s331s33luszwexh.R.globalSliceStart(getClass().getName(),83058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1s36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s331s33luszwexh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s331s33luszwexh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83058,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1s36() throws Exception{try{__CLR4_1_101s331s33luszwexh.R.inc(83058);
        __CLR4_1_101s331s33luszwexh.R.inc(83059);VO e = new VO();
        __CLR4_1_101s331s33luszwexh.R.inc(83060);Assert.assertEquals("{\"elements\":null}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue));
    }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101s331s33luszwexh.R.globalSliceStart(getClass().getName(),83061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1s39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s331s33luszwexh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s331s33luszwexh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83061,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1s39() throws Exception{try{__CLR4_1_101s331s33luszwexh.R.inc(83061);
        __CLR4_1_101s331s33luszwexh.R.inc(83062);VO e = new VO(new Entity(), new Entity());
        __CLR4_1_101s331s33luszwexh.R.inc(83063);Assert.assertEquals("{\"elements\":[{},{}]}", JSON.toJSONString(e, SerializerFeature.WriteMapNullValue));
    }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101s331s33luszwexh.R.globalSliceStart(getClass().getName(),83064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441s3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s331s33luszwexh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s331s33luszwexh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83064,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441s3c() throws Exception{try{__CLR4_1_101s331s33luszwexh.R.inc(83064);
        __CLR4_1_101s331s33luszwexh.R.inc(83065);VO e = new VO(new Entity(), new Entity2());
        __CLR4_1_101s331s33luszwexh.R.inc(83066);Assert.assertEquals("{\"elements\":[{},{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity2\"}]}",
                            JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                              SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101s331s33luszwexh.R.globalSliceStart(getClass().getName(),83067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1s3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s331s33luszwexh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s331s33luszwexh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83067,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1s3f() throws Exception{try{__CLR4_1_101s331s33luszwexh.R.inc(83067);
        __CLR4_1_101s331s33luszwexh.R.inc(83068);VO2 e = new VO2(new Entity(), new Entity());
        __CLR4_1_101s331s33luszwexh.R.inc(83069);Assert.assertEquals("{\"elements\":[{},{}]}", JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                                                        SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_1_101s331s33luszwexh.R.globalSliceStart(getClass().getName(),83070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61s3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s331s33luszwexh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s331s33luszwexh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61s3i() throws Exception{try{__CLR4_1_101s331s33luszwexh.R.inc(83070);
        __CLR4_1_101s331s33luszwexh.R.inc(83071);VO3 e = new VO3(new Entity(), new Entity2());
        __CLR4_1_101s331s33luszwexh.R.inc(83072);Assert.assertEquals("{\"elements\":[{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity\"},{\"@type\":\"com.alibaba.json.bvt.serializer.EnumerationSeriliazerTest$Entity2\"}]}", JSON.toJSONString(e, SerializerFeature.WriteClassName,
                                                                        SerializerFeature.NotWriteRootClassName));
    }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

    private static class VO {

        private Enumeration<Entity> elements;

        public VO(Entity... array){try{__CLR4_1_101s331s33luszwexh.R.inc(83073);
            __CLR4_1_101s331s33luszwexh.R.inc(83074);if ((((array.length > 0)&&(__CLR4_1_101s331s33luszwexh.R.iget(83075)!=0|true))||(__CLR4_1_101s331s33luszwexh.R.iget(83076)==0&false))) {{
                __CLR4_1_101s331s33luszwexh.R.inc(83077);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_1_101s331s33luszwexh.R.inc(83078);for (Entity item : array) {{
                    __CLR4_1_101s331s33luszwexh.R.inc(83079);vector.add(item);
                }
                }__CLR4_1_101s331s33luszwexh.R.inc(83080);this.elements = vector.elements();
            }
        }}finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

        public Enumeration<Entity> getElements() {try{__CLR4_1_101s331s33luszwexh.R.inc(83081);
            __CLR4_1_101s331s33luszwexh.R.inc(83082);return elements;
        }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

        public void setElements(Enumeration<Entity> elements) {try{__CLR4_1_101s331s33luszwexh.R.inc(83083);
            __CLR4_1_101s331s33luszwexh.R.inc(83084);this.elements = elements;
        }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

    }

    private static class VO2 extends IVO2<Entity> {

        public VO2(Entity... array){try{__CLR4_1_101s331s33luszwexh.R.inc(83085);
            __CLR4_1_101s331s33luszwexh.R.inc(83086);if ((((array.length > 0)&&(__CLR4_1_101s331s33luszwexh.R.iget(83087)!=0|true))||(__CLR4_1_101s331s33luszwexh.R.iget(83088)==0&false))) {{
                __CLR4_1_101s331s33luszwexh.R.inc(83089);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_1_101s331s33luszwexh.R.inc(83090);for (Entity item : array) {{
                    __CLR4_1_101s331s33luszwexh.R.inc(83091);vector.add(item);
                }
                }__CLR4_1_101s331s33luszwexh.R.inc(83092);this.elements = vector.elements();
            }
        }}finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

    }
    
    private static class VO3 {

        private Enumeration elements;

        public VO3(Entity... array){try{__CLR4_1_101s331s33luszwexh.R.inc(83093);
            __CLR4_1_101s331s33luszwexh.R.inc(83094);if ((((array.length > 0)&&(__CLR4_1_101s331s33luszwexh.R.iget(83095)!=0|true))||(__CLR4_1_101s331s33luszwexh.R.iget(83096)==0&false))) {{
                __CLR4_1_101s331s33luszwexh.R.inc(83097);Vector<Entity> vector = new Vector<Entity>();
                __CLR4_1_101s331s33luszwexh.R.inc(83098);for (Entity item : array) {{
                    __CLR4_1_101s331s33luszwexh.R.inc(83099);vector.add(item);
                }
                }__CLR4_1_101s331s33luszwexh.R.inc(83100);this.elements = vector.elements();
            }
        }}finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

        public Enumeration getElements() {try{__CLR4_1_101s331s33luszwexh.R.inc(83101);
            __CLR4_1_101s331s33luszwexh.R.inc(83102);return elements;
        }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

        public void setElements(Enumeration elements) {try{__CLR4_1_101s331s33luszwexh.R.inc(83103);
            __CLR4_1_101s331s33luszwexh.R.inc(83104);this.elements = elements;
        }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

    }

    private static abstract class IVO2<T> {

        protected Enumeration<Entity> elements;

        public Enumeration<Entity> getElements() {try{__CLR4_1_101s331s33luszwexh.R.inc(83105);
            __CLR4_1_101s331s33luszwexh.R.inc(83106);return elements;
        }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}

        public void setElements(Enumeration<Entity> elements) {try{__CLR4_1_101s331s33luszwexh.R.inc(83107);
            __CLR4_1_101s331s33luszwexh.R.inc(83108);this.elements = elements;
        }finally{__CLR4_1_101s331s33luszwexh.R.flushNeeded();}}
    }

    public static class Entity {

    }

    public static class Entity2 extends Entity {

    }
}
