/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

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
public class Issue955 extends TestCase {static class __CLR4_1_1017me17melusqk76x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,56586,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_checkObject() {__CLR4_1_1017me17melusqk76x.R.globalSliceStart(getClass().getName(),56534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yvfept17me();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017me17melusqk76x.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017me17melusqk76x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue955.test_checkObject",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56534,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yvfept17me(){try{__CLR4_1_1017me17melusqk76x.R.inc(56534);
        __CLR4_1_1017me17melusqk76x.R.inc(56535);Art origin = makeOrigin();
        __CLR4_1_1017me17melusqk76x.R.inc(56536);JSONObject articleObj = (JSONObject) JSON.toJSON(origin);

        __CLR4_1_1017me17melusqk76x.R.inc(56537);JSONObject dataObj = new JSONObject();
        __CLR4_1_1017me17melusqk76x.R.inc(56538);dataObj.put("art", articleObj);

        __CLR4_1_1017me17melusqk76x.R.inc(56539);Art other = dataObj.getObject("art", Art.class);// return null;
        __CLR4_1_1017me17melusqk76x.R.inc(56540);assertSame(origin, other); // test failed
    }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

    public void test_checkArray() throws Exception {__CLR4_1_1017me17melusqk76x.R.globalSliceStart(getClass().getName(),56541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h3koe317ml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017me17melusqk76x.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017me17melusqk76x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue955.test_checkArray",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h3koe317ml() throws Exception{try{__CLR4_1_1017me17melusqk76x.R.inc(56541);
        __CLR4_1_1017me17melusqk76x.R.inc(56542);Art origin = makeOrigin();
        __CLR4_1_1017me17melusqk76x.R.inc(56543);JSONObject object = (JSONObject) JSON.toJSON(origin);

        __CLR4_1_1017me17melusqk76x.R.inc(56544);JSONArray jsonArray = new JSONArray();
        __CLR4_1_1017me17melusqk76x.R.inc(56545);jsonArray.add(object);

        __CLR4_1_1017me17melusqk76x.R.inc(56546);Art other = JSON.parseObject(jsonArray.getString(0), Art.class);
        __CLR4_1_1017me17melusqk76x.R.inc(56547);assertSame(origin, other); // test passed

        __CLR4_1_1017me17melusqk76x.R.inc(56548);other = jsonArray.getObject(0, Art.class); // return = null;
        __CLR4_1_1017me17melusqk76x.R.inc(56549);assertSame(origin, other); // test failed
    }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

    private Art makeOrigin() {try{__CLR4_1_1017me17melusqk76x.R.inc(56550);
        __CLR4_1_1017me17melusqk76x.R.inc(56551);final long unixTime = System.currentTimeMillis() / 1000;
        __CLR4_1_1017me17melusqk76x.R.inc(56552);final Art origin = new Art();
        __CLR4_1_1017me17melusqk76x.R.inc(56553);origin.id = "12";
        __CLR4_1_1017me17melusqk76x.R.inc(56554);origin.date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(unixTime * 1000));
        __CLR4_1_1017me17melusqk76x.R.inc(56555);origin.isSupported = true;
        __CLR4_1_1017me17melusqk76x.R.inc(56556);return origin;
    }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

    public void assertSame(Art origin, Art another) {try{__CLR4_1_1017me17melusqk76x.R.inc(56557);
        __CLR4_1_1017me17melusqk76x.R.inc(56558);assertNotNull(another);
        __CLR4_1_1017me17melusqk76x.R.inc(56559);assertEquals(origin.id, another.id);
        __CLR4_1_1017me17melusqk76x.R.inc(56560);assertEquals(origin.date, another.date);
        __CLR4_1_1017me17melusqk76x.R.inc(56561);assertSame(origin.isSupported, another.isSupported);
    }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

    @JSONType(builder = Art.Builder.class)
    public static class Art {
        private String id;
        private String date;
        private boolean isSupported;

        public String getId() {try{__CLR4_1_1017me17melusqk76x.R.inc(56562);
            __CLR4_1_1017me17melusqk76x.R.inc(56563);return id;
        }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

        public long getDatetime() throws ParseException {try{__CLR4_1_1017me17melusqk76x.R.inc(56564);
            __CLR4_1_1017me17melusqk76x.R.inc(56565);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            __CLR4_1_1017me17melusqk76x.R.inc(56566);return (format.parse(date)).getTime() / 1000;
        }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

        @JSONField(name = "isSupported")
        public int isSupported() {try{__CLR4_1_1017me17melusqk76x.R.inc(56567);
            __CLR4_1_1017me17melusqk76x.R.inc(56568);return (((isSupported )&&(__CLR4_1_1017me17melusqk76x.R.iget(56569)!=0|true))||(__CLR4_1_1017me17melusqk76x.R.iget(56570)==0&false))? 1 : 0;
        }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

        @JSONPOJOBuilder()
        public final static class Builder {
            private final Art article = new Art();

            public Builder(){try{__CLR4_1_1017me17melusqk76x.R.inc(56571);

            }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

            @JSONField(name = "id")
            public Builder withId(String id) {try{__CLR4_1_1017me17melusqk76x.R.inc(56572);
                __CLR4_1_1017me17melusqk76x.R.inc(56573);article.id = id;
                __CLR4_1_1017me17melusqk76x.R.inc(56574);return this;
            }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

            @JSONField(name = "datetime")
            public Builder withDateTime(long dateTime) {try{__CLR4_1_1017me17melusqk76x.R.inc(56575);
                __CLR4_1_1017me17melusqk76x.R.inc(56576);if ((((dateTime > 0)&&(__CLR4_1_1017me17melusqk76x.R.iget(56577)!=0|true))||(__CLR4_1_1017me17melusqk76x.R.iget(56578)==0&false)))
                    {__CLR4_1_1017me17melusqk76x.R.inc(56579);article.date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(dateTime * 1000));
                }__CLR4_1_1017me17melusqk76x.R.inc(56580);return this;

            }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

            @JSONField(name = "isSupported")
            public Builder withSupported(int supported) {try{__CLR4_1_1017me17melusqk76x.R.inc(56581);
                __CLR4_1_1017me17melusqk76x.R.inc(56582);article.isSupported = supported == 1;
                __CLR4_1_1017me17melusqk76x.R.inc(56583);return this;
            }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}

            public Art build() {try{__CLR4_1_1017me17melusqk76x.R.inc(56584);
                __CLR4_1_1017me17melusqk76x.R.inc(56585);return article;
            }finally{__CLR4_1_1017me17melusqk76x.R.flushNeeded();}}
        }
    }
}
