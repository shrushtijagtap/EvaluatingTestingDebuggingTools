/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PropertyFilter_char extends TestCase {static class __CLR4_1_101v2l1v2llusqklia{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87009,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101v2l1v2llusqklia.R.globalSliceStart(getClass().getName(),86925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21v2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v2l1v2llusqklia.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v2l1v2llusqklia.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86925,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21v2l() throws Exception{try{__CLR4_1_101v2l1v2llusqklia.R.inc(86925);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86926);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v2l1v2llusqklia.R.inc(86927);
                __CLR4_1_101v2l1v2llusqklia.R.inc(86928);return false;
            }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}
        };

        __CLR4_1_101v2l1v2llusqklia.R.inc(86929);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86930);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86931);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86932);A a = new A();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86933);serializer.write(a);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86934);String text = out.toString();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86935);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101v2l1v2llusqklia.R.globalSliceStart(getClass().getName(),86936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1v2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v2l1v2llusqklia.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v2l1v2llusqklia.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86936,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1v2w() throws Exception{try{__CLR4_1_101v2l1v2llusqklia.R.inc(86936);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86937);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v2l1v2llusqklia.R.inc(86938);
                __CLR4_1_101v2l1v2llusqklia.R.inc(86939);if (((("id".equals(name))&&(__CLR4_1_101v2l1v2llusqklia.R.iget(86940)!=0|true))||(__CLR4_1_101v2l1v2llusqklia.R.iget(86941)==0&false))) {{
                    __CLR4_1_101v2l1v2llusqklia.R.inc(86942);Assert.assertTrue(value instanceof Character);
                    __CLR4_1_101v2l1v2llusqklia.R.inc(86943);return true;
                }
                }__CLR4_1_101v2l1v2llusqklia.R.inc(86944);return false;
            }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}
        };

        __CLR4_1_101v2l1v2llusqklia.R.inc(86945);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86946);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86947);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86948);A a = new A();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86949);serializer.write(a);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86950);String text = out.toString();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86951);Assert.assertEquals("{\"id\":\"0\"}", text);
    }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101v2l1v2llusqklia.R.globalSliceStart(getClass().getName(),86952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441v3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v2l1v2llusqklia.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v2l1v2llusqklia.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86952,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441v3c() throws Exception{try{__CLR4_1_101v2l1v2llusqklia.R.inc(86952);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86953);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v2l1v2llusqklia.R.inc(86954);
                __CLR4_1_101v2l1v2llusqklia.R.inc(86955);if (((("name".equals(name))&&(__CLR4_1_101v2l1v2llusqklia.R.iget(86956)!=0|true))||(__CLR4_1_101v2l1v2llusqklia.R.iget(86957)==0&false))) {{
                    __CLR4_1_101v2l1v2llusqklia.R.inc(86958);return true;
                }
                }__CLR4_1_101v2l1v2llusqklia.R.inc(86959);return false;
            }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}
        };

        __CLR4_1_101v2l1v2llusqklia.R.inc(86960);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86961);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86962);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86963);A a = new A();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86964);a.setName("chennp2008");
        __CLR4_1_101v2l1v2llusqklia.R.inc(86965);serializer.write(a);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86966);String text = out.toString();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86967);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101v2l1v2llusqklia.R.globalSliceStart(getClass().getName(),86968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1v3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v2l1v2llusqklia.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v2l1v2llusqklia.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86968,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1v3s() throws Exception{try{__CLR4_1_101v2l1v2llusqklia.R.inc(86968);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86969);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v2l1v2llusqklia.R.inc(86970);
                __CLR4_1_101v2l1v2llusqklia.R.inc(86971);if (((("name".equals(name))&&(__CLR4_1_101v2l1v2llusqklia.R.iget(86972)!=0|true))||(__CLR4_1_101v2l1v2llusqklia.R.iget(86973)==0&false))) {{
                    __CLR4_1_101v2l1v2llusqklia.R.inc(86974);return true;
                }
                }__CLR4_1_101v2l1v2llusqklia.R.inc(86975);return false;
            }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}
        };

        __CLR4_1_101v2l1v2llusqklia.R.inc(86976);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86977);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86978);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86979);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86980);map.put("name", "chennp2008");
        __CLR4_1_101v2l1v2llusqklia.R.inc(86981);serializer.write(map);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86982);String text = out.toString();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86983);Assert.assertEquals("{\"name\":\"chennp2008\"}", text);
    }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101v2l1v2llusqklia.R.globalSliceStart(getClass().getName(),86984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61v48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101v2l1v2llusqklia.R.rethrow($CLV_t2$);}finally{__CLR4_1_101v2l1v2llusqklia.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyFilter_char.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86984,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61v48() throws Exception{try{__CLR4_1_101v2l1v2llusqklia.R.inc(86984);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86985);PropertyFilter filter = new PropertyFilter() {

            public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101v2l1v2llusqklia.R.inc(86986);
                __CLR4_1_101v2l1v2llusqklia.R.inc(86987);if (((("name".equals(name))&&(__CLR4_1_101v2l1v2llusqklia.R.iget(86988)!=0|true))||(__CLR4_1_101v2l1v2llusqklia.R.iget(86989)==0&false))) {{
                    __CLR4_1_101v2l1v2llusqklia.R.inc(86990);return false;
                }
                }__CLR4_1_101v2l1v2llusqklia.R.inc(86991);return true;
            }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}
        };

        __CLR4_1_101v2l1v2llusqklia.R.inc(86992);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86993);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101v2l1v2llusqklia.R.inc(86994);serializer.getPropertyFilters().add(filter);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86995);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101v2l1v2llusqklia.R.inc(86996);map.put("id", (char) '3');
        __CLR4_1_101v2l1v2llusqklia.R.inc(86997);map.put("name", "chennp2008");
        __CLR4_1_101v2l1v2llusqklia.R.inc(86998);serializer.write(map);

        __CLR4_1_101v2l1v2llusqklia.R.inc(86999);String text = out.toString();
        __CLR4_1_101v2l1v2llusqklia.R.inc(87000);Assert.assertEquals("{\"id\":\"3\"}", text);
    }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

    public static class A {

        private char   id = '0';
        private String name;

        public char getId() {try{__CLR4_1_101v2l1v2llusqklia.R.inc(87001);
            __CLR4_1_101v2l1v2llusqklia.R.inc(87002);return id;
        }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

        public void setId(char id) {try{__CLR4_1_101v2l1v2llusqklia.R.inc(87003);
            __CLR4_1_101v2l1v2llusqklia.R.inc(87004);this.id = id;
        }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101v2l1v2llusqklia.R.inc(87005);
            __CLR4_1_101v2l1v2llusqklia.R.inc(87006);return name;
        }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101v2l1v2llusqklia.R.inc(87007);
            __CLR4_1_101v2l1v2llusqklia.R.inc(87008);this.name = name;
        }finally{__CLR4_1_101v2l1v2llusqklia.R.flushNeeded();}}

    }
}
