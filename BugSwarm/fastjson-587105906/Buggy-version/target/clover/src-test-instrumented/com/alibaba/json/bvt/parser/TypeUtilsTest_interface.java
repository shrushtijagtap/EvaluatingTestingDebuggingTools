/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;

public class TypeUtilsTest_interface extends TestCase {static class __CLR4_1_101k2w1k2wluszwcv9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_castToJavaBean() throws Exception {__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceStart(getClass().getName(),72680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ye60dc1k2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k2w1k2wluszwcv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_interface.test_castToJavaBean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72680,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ye60dc1k2w() throws Exception{try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72680);
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72681);VO vo = new VO();
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72682);vo.setId(123);
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72683);vo.setName("abc");

        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72684);Assert.assertEquals("{\"ID\":123,\"name\":\"abc\"}", JSON.toJSONString(vo));
    }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

    public void test_parse() throws Exception {__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceStart(getClass().getName(),72685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g914tv1k31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k2w1k2wluszwcv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_interface.test_parse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72685,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g914tv1k31() throws Exception{try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72685);
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72686);VO vo = JSON.parseObject("{\"xid\":123,\"name\":\"abc\"}", VO.class);

        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72687);Assert.assertEquals(123, vo.getId());
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72688);Assert.assertEquals("abc", vo.getName());
    }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

    public void test_parse_var() throws Exception {__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceStart(getClass().getName(),72689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dc5o3v1k35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k2w1k2wluszwcv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_interface.test_parse_var",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72689,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dc5o3v1k35() throws Exception{try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72689);
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72690);List<?> list = JSON.parseObject("[]", new TypeReference<List<?>>() {
        });
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72691);Assert.assertNotNull(list);
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72692);Assert.assertEquals(0, list.size());
    }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

    public void test_deser() throws Exception {__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceStart(getClass().getName(),72693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o3nja11k39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k2w1k2wluszwcv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_interface.test_deser",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72693,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o3nja11k39() throws Exception{try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72693);
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72694);JSON.parseObject("{\"id\":123}", new TypeReference<X_I>(){});
    }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}
    
    public void test_deser2() throws Exception {__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceStart(getClass().getName(),72695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108lh8iv1k3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k2w1k2wluszwcv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_interface.test_deser2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72695,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108lh8iv1k3b() throws Exception{try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72695);
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72696);JSON.parseObject("{\"id\":123}", new TypeReference<X_X<Integer>>(){});
    }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}
    
    public void test_deser2_x() throws Exception {__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceStart(getClass().getName(),72697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10reo5341k3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k2w1k2wluszwcv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k2w1k2wluszwcv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_interface.test_deser2_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72697,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10reo5341k3d() throws Exception{try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72697);
        __CLR4_1_101k2w1k2wluszwcv9.R.inc(72698);JSON.parseObject("{\"id\":123}", new TypeReference<X_X<?>>(){});
    }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}
    
    public static class X_I extends X<Integer> {
        
    }
    
    public static class X_X<T> extends X<T> {
        
    }

    public static class X<T> {

        private T id;

        public X(){try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72699);
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        public T getId() {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72700);
            __CLR4_1_101k2w1k2wluszwcv9.R.inc(72701);return id;
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        public void setId(T id) {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72702);
            __CLR4_1_101k2w1k2wluszwcv9.R.inc(72703);this.id = id;
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

    }

    public static class VO implements IV {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72704);
            __CLR4_1_101k2w1k2wluszwcv9.R.inc(72705);return id;
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72706);
            __CLR4_1_101k2w1k2wluszwcv9.R.inc(72707);this.id = id;
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72708);
            __CLR4_1_101k2w1k2wluszwcv9.R.inc(72709);return name;
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72710);
            __CLR4_1_101k2w1k2wluszwcv9.R.inc(72711);this.name = name;
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        public String getName(String xx) {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72712);
            __CLR4_1_101k2w1k2wluszwcv9.R.inc(72713);return null;
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        public String getName(String xx, int v) {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72714);
            // TODO Auto-generated method stub
            __CLR4_1_101k2w1k2wluszwcv9.R.inc(72715);return null;
        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        @JSONField(deserialize = false)
        public void setName(int value) {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72716);
            // TODO Auto-generated method stub

        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

        public void setName(int value, int x) {try{__CLR4_1_101k2w1k2wluszwcv9.R.inc(72717);
            // TODO Auto-generated method stub

        }finally{__CLR4_1_101k2w1k2wluszwcv9.R.flushNeeded();}}

    }

    public static interface IV {

        @JSONField(name = "ID")
        int getId();

        @JSONField(name = "xid")
        void setId(int value);

        @JSONField(name = "NAME")
        String getName(String xx);

        @JSONField(name = "NAME")
        String getName(String xx, int v);

        @JSONField(name = "xid_1")
        void setName(int value);
    }

}
