/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONPOJOBuilder;
import com.alibaba.fastjson.annotation.JSONType;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by wenshao on 19/12/2016.
 */
public class Issue955 extends TestCase {static class __CLR4_5_218kb18kblusvn8oc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,57807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_checkObject() {__CLR4_5_218kb18kblusvn8oc.R.globalSliceStart(getClass().getName(),57755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvfept18kb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kb18kblusvn8oc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kb18kblusvn8oc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue955.test_checkObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvfept18kb(){try{__CLR4_5_218kb18kblusvn8oc.R.inc(57755);
        __CLR4_5_218kb18kblusvn8oc.R.inc(57756);Art origin = makeOrigin();
        __CLR4_5_218kb18kblusvn8oc.R.inc(57757);JSONObject articleObj = (JSONObject) JSON.toJSON(origin);

        __CLR4_5_218kb18kblusvn8oc.R.inc(57758);JSONObject dataObj = new JSONObject();
        __CLR4_5_218kb18kblusvn8oc.R.inc(57759);dataObj.put("art", articleObj);

        __CLR4_5_218kb18kblusvn8oc.R.inc(57760);Art other = dataObj.getObject("art", Art.class);// return null;
        __CLR4_5_218kb18kblusvn8oc.R.inc(57761);assertSame(origin, other); // test failed
    }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

    public void test_checkArray() throws Exception {__CLR4_5_218kb18kblusvn8oc.R.globalSliceStart(getClass().getName(),57762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h3koe318ki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kb18kblusvn8oc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kb18kblusvn8oc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue955.test_checkArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h3koe318ki() throws Exception{try{__CLR4_5_218kb18kblusvn8oc.R.inc(57762);
        __CLR4_5_218kb18kblusvn8oc.R.inc(57763);Art origin = makeOrigin();
        __CLR4_5_218kb18kblusvn8oc.R.inc(57764);JSONObject object = (JSONObject) JSON.toJSON(origin);

        __CLR4_5_218kb18kblusvn8oc.R.inc(57765);JSONArray jsonArray = new JSONArray();
        __CLR4_5_218kb18kblusvn8oc.R.inc(57766);jsonArray.add(object);

        __CLR4_5_218kb18kblusvn8oc.R.inc(57767);Art other = JSON.parseObject(jsonArray.getString(0), Art.class);
        __CLR4_5_218kb18kblusvn8oc.R.inc(57768);assertSame(origin, other); // test passed

        __CLR4_5_218kb18kblusvn8oc.R.inc(57769);other = jsonArray.getObject(0, Art.class); // return = null;
        __CLR4_5_218kb18kblusvn8oc.R.inc(57770);assertSame(origin, other); // test failed
    }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

    private Art makeOrigin() {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57771);
        __CLR4_5_218kb18kblusvn8oc.R.inc(57772);final long unixTime = System.currentTimeMillis() / 1000;
        __CLR4_5_218kb18kblusvn8oc.R.inc(57773);final Art origin = new Art();
        __CLR4_5_218kb18kblusvn8oc.R.inc(57774);origin.id = "12";
        __CLR4_5_218kb18kblusvn8oc.R.inc(57775);origin.date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(unixTime * 1000));
        __CLR4_5_218kb18kblusvn8oc.R.inc(57776);origin.isSupported = true;
        __CLR4_5_218kb18kblusvn8oc.R.inc(57777);return origin;
    }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

    public void assertSame(Art origin, Art another) {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57778);
        __CLR4_5_218kb18kblusvn8oc.R.inc(57779);assertNotNull(another);
        __CLR4_5_218kb18kblusvn8oc.R.inc(57780);assertEquals(origin.id, another.id);
        __CLR4_5_218kb18kblusvn8oc.R.inc(57781);assertEquals(origin.date, another.date);
        __CLR4_5_218kb18kblusvn8oc.R.inc(57782);assertSame(origin.isSupported, another.isSupported);
    }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

    @JSONType(builder = Art.Builder.class)
    public static class Art {
        private String id;
        private String date;
        private boolean isSupported;

        public String getId() {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57783);
            __CLR4_5_218kb18kblusvn8oc.R.inc(57784);return id;
        }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

        public long getDatetime() throws ParseException {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57785);
            __CLR4_5_218kb18kblusvn8oc.R.inc(57786);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            __CLR4_5_218kb18kblusvn8oc.R.inc(57787);return (format.parse(date)).getTime() / 1000;
        }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

        @JSONField(name = "isSupported")
        public int isSupported() {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57788);
            __CLR4_5_218kb18kblusvn8oc.R.inc(57789);return (((isSupported )&&(__CLR4_5_218kb18kblusvn8oc.R.iget(57790)!=0|true))||(__CLR4_5_218kb18kblusvn8oc.R.iget(57791)==0&false))? 1 : 0;
        }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

        @JSONPOJOBuilder()
        public final static class Builder {
            private final Art article = new Art();

            public Builder(){try{__CLR4_5_218kb18kblusvn8oc.R.inc(57792);

            }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

            @JSONField(name = "id")
            public Builder withId(String id) {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57793);
                __CLR4_5_218kb18kblusvn8oc.R.inc(57794);article.id = id;
                __CLR4_5_218kb18kblusvn8oc.R.inc(57795);return this;
            }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

            @JSONField(name = "datetime")
            public Builder withDateTime(long dateTime) {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57796);
                __CLR4_5_218kb18kblusvn8oc.R.inc(57797);if ((((dateTime > 0)&&(__CLR4_5_218kb18kblusvn8oc.R.iget(57798)!=0|true))||(__CLR4_5_218kb18kblusvn8oc.R.iget(57799)==0&false)))
                    {__CLR4_5_218kb18kblusvn8oc.R.inc(57800);article.date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(dateTime * 1000));
                }__CLR4_5_218kb18kblusvn8oc.R.inc(57801);return this;

            }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

            @JSONField(name = "isSupported")
            public Builder withSupported(int supported) {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57802);
                __CLR4_5_218kb18kblusvn8oc.R.inc(57803);article.isSupported = supported == 1;
                __CLR4_5_218kb18kblusvn8oc.R.inc(57804);return this;
            }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}

            public Art build() {try{__CLR4_5_218kb18kblusvn8oc.R.inc(57805);
                __CLR4_5_218kb18kblusvn8oc.R.inc(57806);return article;
            }finally{__CLR4_5_218kb18kblusvn8oc.R.flushNeeded();}}
        }
    }
}
