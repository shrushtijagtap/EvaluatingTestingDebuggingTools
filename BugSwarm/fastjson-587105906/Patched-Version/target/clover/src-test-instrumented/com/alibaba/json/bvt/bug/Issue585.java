/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

import junit.framework.TestCase;

public class Issue585 extends TestCase {static class __CLR4_5_2175y175ylusyjsd2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,55972,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String original = JSON.DEFAULT_TYPE_KEY;
    private ParserConfig originalConfig = ParserConfig.global;

    protected void setUp() throws Exception {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55942);
        __CLR4_5_2175y175ylusyjsd2.R.inc(55943);ParserConfig.global = new ParserConfig();
        __CLR4_5_2175y175ylusyjsd2.R.inc(55944);if ((((!JSON.DEFAULT_TYPE_KEY.equals("mySpace"))&&(__CLR4_5_2175y175ylusyjsd2.R.iget(55945)!=0|true))||(__CLR4_5_2175y175ylusyjsd2.R.iget(55946)==0&false))) {{
            __CLR4_5_2175y175ylusyjsd2.R.inc(55947);JSON.setDefaultTypeKey("mySpace");
        }

        }__CLR4_5_2175y175ylusyjsd2.R.inc(55948);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Issue585.");
    }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55949);
        __CLR4_5_2175y175ylusyjsd2.R.inc(55950);JSON.setDefaultTypeKey(original);
        __CLR4_5_2175y175ylusyjsd2.R.inc(55951);ParserConfig.global = originalConfig;
    }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_5_2175y175ylusyjsd2.R.globalSliceStart(getClass().getName(),55952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1768();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175y175ylusyjsd2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175y175ylusyjsd2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue585.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1768() throws Exception{try{__CLR4_5_2175y175ylusyjsd2.R.inc(55952);

        __CLR4_5_2175y175ylusyjsd2.R.inc(55953);String cc = "{\"mySpace\":\"com.alibaba.json.bvt.bug.Issue585$Result\",\"attachments\":{\"mySpace\":\"java.util.HashMap\",\"timeout\":5000,\"consumeApp\":\"multiGroupTestServer\"},\"status\":0}";

        __CLR4_5_2175y175ylusyjsd2.R.inc(55954);byte[] bytes = cc.getBytes("utf-8");

        __CLR4_5_2175y175ylusyjsd2.R.inc(55955);Result res = (Result) this.deserialize(bytes);
        __CLR4_5_2175y175ylusyjsd2.R.inc(55956);Assert.assertEquals(0, res.getStatus());
    }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

    public <T> T deserialize(byte[] in) {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55957);
        __CLR4_5_2175y175ylusyjsd2.R.inc(55958);Charset CHARSET = Charset.forName("utf-8");
        __CLR4_5_2175y175ylusyjsd2.R.inc(55959);return (T) JSON.parse(in, 0, in.length, CHARSET.newDecoder(), Feature.AllowArbitraryCommas,
                              Feature.IgnoreNotMatch, Feature.SortFeidFastMatch, Feature.DisableCircularReferenceDetect,
                              Feature.AutoCloseSource);
    }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

    public static class Result {

        private int                 status;
        private Object              value;
        private Map<String, Object> attachments = new HashMap<String, Object>(2);

        public int getStatus() {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55960);
            __CLR4_5_2175y175ylusyjsd2.R.inc(55961);return status;
        }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

        public void setStatus(int status) {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55962);
            __CLR4_5_2175y175ylusyjsd2.R.inc(55963);this.status = status;
        }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

        public Object getValue() {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55964);
            __CLR4_5_2175y175ylusyjsd2.R.inc(55965);return value;
        }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55966);
            __CLR4_5_2175y175ylusyjsd2.R.inc(55967);this.value = value;
        }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

        public Map<String, Object> getAttachments() {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55968);
            __CLR4_5_2175y175ylusyjsd2.R.inc(55969);return attachments;
        }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}

        public void setAttachments(Map<String, Object> attachments) {try{__CLR4_5_2175y175ylusyjsd2.R.inc(55970);
            __CLR4_5_2175y175ylusyjsd2.R.inc(55971);this.attachments = attachments;
        }finally{__CLR4_5_2175y175ylusyjsd2.R.flushNeeded();}}
    }
}
