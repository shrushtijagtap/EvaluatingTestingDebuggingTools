/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug.bug201810;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class LatLngTest extends TestCase {static class __CLR4_5_218wm18wmlusvn8u5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,58215,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_latlng() throws Exception {__CLR4_5_218wm18wmlusvn8u5.R.globalSliceStart(getClass().getName(),58198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w2lrve18wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218wm18wmlusvn8u5.R.rethrow($CLV_t2$);}finally{__CLR4_5_218wm18wmlusvn8u5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug201810.LatLngTest.test_latlng",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58198,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w2lrve18wm() throws Exception{try{__CLR4_5_218wm18wmlusvn8u5.R.inc(58198);
        __CLR4_5_218wm18wmlusvn8u5.R.inc(58199);LatLng v = new LatLng();
        __CLR4_5_218wm18wmlusvn8u5.R.inc(58200);JSON.toJSONString(v);
    }finally{__CLR4_5_218wm18wmlusvn8u5.R.flushNeeded();}}

    public static class LatLng implements Serializable {
        /**
         * serialVersionUID
         */
        private static final long serialVersionUID = -9176496417369601807L;

        public LatLng() {try{__CLR4_5_218wm18wmlusvn8u5.R.inc(58201);}finally{__CLR4_5_218wm18wmlusvn8u5.R.flushNeeded();}}

        public LatLng(Double lat, Double lng) {try{__CLR4_5_218wm18wmlusvn8u5.R.inc(58202);
            __CLR4_5_218wm18wmlusvn8u5.R.inc(58203);this.lat = lat;
            __CLR4_5_218wm18wmlusvn8u5.R.inc(58204);this.lng = lng;
        }finally{__CLR4_5_218wm18wmlusvn8u5.R.flushNeeded();}}

        /**
         * \u7eac\u5ea6
         */
        @Min(-90)
        @Max(90)
        @NotNull
        private Double lat;
        /**
         * \u7ecf\u5ea6
         */
        @Min(-180)
        @Max(180)
        @NotNull
        private Double lng;

        /**
         * Getter method for property <tt>lat</tt>.
         *
         * @return property value of lat
         */
        public Double getLat() {try{__CLR4_5_218wm18wmlusvn8u5.R.inc(58205);
            __CLR4_5_218wm18wmlusvn8u5.R.inc(58206);return lat;
        }finally{__CLR4_5_218wm18wmlusvn8u5.R.flushNeeded();}}

        /**
         * Setter method for property <tt>lat</tt>.
         *
         * @param lat value to be assigned to property lat
         */
        public void setLat(Double lat) {try{__CLR4_5_218wm18wmlusvn8u5.R.inc(58207);
            __CLR4_5_218wm18wmlusvn8u5.R.inc(58208);this.lat = lat;
        }finally{__CLR4_5_218wm18wmlusvn8u5.R.flushNeeded();}}

        /**
         * Getter method for property <tt>lng</tt>.
         *
         * @return property value of lng
         */
        public Double getLng() {try{__CLR4_5_218wm18wmlusvn8u5.R.inc(58209);
            __CLR4_5_218wm18wmlusvn8u5.R.inc(58210);return lng;
        }finally{__CLR4_5_218wm18wmlusvn8u5.R.flushNeeded();}}

        /**
         * Setter method for property <tt>lng</tt>.
         *
         * @param lng value to be assigned to property lng
         */
        public void setLng(Double lng) {try{__CLR4_5_218wm18wmlusvn8u5.R.inc(58211);
            __CLR4_5_218wm18wmlusvn8u5.R.inc(58212);this.lng = lng;
        }finally{__CLR4_5_218wm18wmlusvn8u5.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_218wm18wmlusvn8u5.R.inc(58213);
            __CLR4_5_218wm18wmlusvn8u5.R.inc(58214);return lat + " " + lng;
        }finally{__CLR4_5_218wm18wmlusvn8u5.R.flushNeeded();}}

    }
}
