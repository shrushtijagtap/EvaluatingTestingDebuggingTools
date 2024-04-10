/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.taobao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.ContextValueFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class MTopTest extends TestCase {static class __CLR4_5_21xhr1xhrlusyjvpx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_mtop() throws Exception {__CLR4_5_21xhr1xhrlusyjvpx.R.globalSliceStart(getClass().getName(),90063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2crcoem1xhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xhr1xhrlusyjvpx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xhr1xhrlusyjvpx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.taobao.MTopTest.test_for_mtop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2crcoem1xhr() throws Exception{try{__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90063);
        __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90064);P0 p = new P0();
        __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90065);p.model = new Model();

        __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90066);ContextValueFilter valueFilter = new ContextValueFilter() {

            @Override
            public Object process(BeanContext context, Object object, String name, Object value) {try{__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90067);


                __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90068);if ((((value instanceof Model)&&(__CLR4_5_21xhr1xhrlusyjvpx.R.iget(90069)!=0|true))||(__CLR4_5_21xhr1xhrlusyjvpx.R.iget(90070)==0&false))) {{
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90071);Assert.assertEquals(P0.class, context.getBeanClass());
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90072);Assert.assertNotNull(context.getField());
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90073);Assert.assertNotNull(context.getMethod());
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90074);Assert.assertEquals("model", context.getName());
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90075);Assert.assertEquals(Model.class, context.getFieldClass());
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90076);Assert.assertEquals(Model.class, context.getFieldType());
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90077);Assert.assertEquals(SerializerFeature.WriteMapNullValue.mask, context.getFeatures());
                    
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90078);Field field = context.getField();
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90079);Assert.assertNotNull(field.getAnnotation(UrlIdentify.class));
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90080);Assert.assertNotNull(context.getAnnation(UrlIdentify.class));
                    
                    __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90081);return value;
                }

                }__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90082);return value;
            }finally{__CLR4_5_21xhr1xhrlusyjvpx.R.flushNeeded();}}
        };

        __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90083);JSON.toJSONString(p, valueFilter);
    }finally{__CLR4_5_21xhr1xhrlusyjvpx.R.flushNeeded();}}

    private static class P0 {

        @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue)
        @UrlIdentify(schema = "xxxx")
        private Model model;

        public Model getModel() {try{__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90084);
            __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90085);return model;
        }finally{__CLR4_5_21xhr1xhrlusyjvpx.R.flushNeeded();}}

        public void setModel(Model model) {try{__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90086);
            __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90087);this.model = model;
        }finally{__CLR4_5_21xhr1xhrlusyjvpx.R.flushNeeded();}}

    }

    public static class Model {

        private int    id;
        private String url;

        public String getUrl() {try{__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90088);
            __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90089);return url;
        }finally{__CLR4_5_21xhr1xhrlusyjvpx.R.flushNeeded();}}

        public void setUrl(String url) {try{__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90090);
            __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90091);this.url = url;
        }finally{__CLR4_5_21xhr1xhrlusyjvpx.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90092);
            __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90093);return id;
        }finally{__CLR4_5_21xhr1xhrlusyjvpx.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21xhr1xhrlusyjvpx.R.inc(90094);
            __CLR4_5_21xhr1xhrlusyjvpx.R.inc(90095);this.id = id;
        }finally{__CLR4_5_21xhr1xhrlusyjvpx.R.flushNeeded();}}

    }

    @Retention(RetentionPolicy.RUNTIME)
    public static @interface UrlIdentify {

        String schema();
    }
}
