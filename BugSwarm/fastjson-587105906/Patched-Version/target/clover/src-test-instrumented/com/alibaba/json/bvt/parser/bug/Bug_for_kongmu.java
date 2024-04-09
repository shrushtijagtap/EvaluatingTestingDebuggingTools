/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.bug;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

public class Bug_for_kongmu extends TestCase {static class __CLR4_5_21khc1khclusvne2v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,73231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_bug() throws Exception {__CLR4_5_21khc1khclusvne2v.R.globalSliceStart(getClass().getName(),73200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yy5c3c1khc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21khc1khclusvne2v.R.rethrow($CLV_t2$);}finally{__CLR4_5_21khc1khclusvne2v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.bug.Bug_for_kongmu.test_for_bug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73200,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yy5c3c1khc() throws Exception{try{__CLR4_5_21khc1khclusvne2v.R.inc(73200);
        __CLR4_5_21khc1khclusvne2v.R.inc(73201);String JSON_STRING = "{\n"
                + "\t\"body\":\"parentBody\",\n"
                + "\t\"name\":\"child-1\",\n"
                + "\t\"result\":{\n"
                + "\t\t\"code\":11\n"
                + "\t},\n"
                + "\t\"toy\":{\n"
                + "\t\t\"type\":\"toytype\"\n"
                + "\t}\n"
                + "}";

        __CLR4_5_21khc1khclusvne2v.R.inc(73202);JSON.parseObject(JSON_STRING, Child.class);

    }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}


    public static class BaseDO {
        private String body;
        private Result result;

        public String getBody() {try{__CLR4_5_21khc1khclusvne2v.R.inc(73203);
            __CLR4_5_21khc1khclusvne2v.R.inc(73204);return body;
        }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

        public void setBody(String body) {try{__CLR4_5_21khc1khclusvne2v.R.inc(73205);
            __CLR4_5_21khc1khclusvne2v.R.inc(73206);this.body = body;
        }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

        public Result getResult() {try{__CLR4_5_21khc1khclusvne2v.R.inc(73207);
            __CLR4_5_21khc1khclusvne2v.R.inc(73208);return result;
        }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

        public void setResult(Result result) {try{__CLR4_5_21khc1khclusvne2v.R.inc(73209);
            __CLR4_5_21khc1khclusvne2v.R.inc(73210);this.result = result;
        }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

        // \u57281.2.27\u4e2d\u80fd\u8fc7\uff0c\u57281.2.48\u4e0d\u80fd\u8fc7
        public  class Result {


            // \u57281.2.48\u4e2d\uff0c\u5fc5\u987b\u4e3astatic
            //public static class Result {

            public Result() {try{__CLR4_5_21khc1khclusvne2v.R.inc(73211);
                __CLR4_5_21khc1khclusvne2v.R.inc(73212);this.code = 11;
            }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

            private int code;

            public int getCode() {try{__CLR4_5_21khc1khclusvne2v.R.inc(73213);
                __CLR4_5_21khc1khclusvne2v.R.inc(73214);return code;
            }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

            public void setCode(int code) {try{__CLR4_5_21khc1khclusvne2v.R.inc(73215);
                __CLR4_5_21khc1khclusvne2v.R.inc(73216);this.code = code;
            }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}
        }
    }

    public static class Child extends BaseDO {
        public String name;
        public Toy toy;

        public String getName() {try{__CLR4_5_21khc1khclusvne2v.R.inc(73217);
            __CLR4_5_21khc1khclusvne2v.R.inc(73218);return name;
        }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21khc1khclusvne2v.R.inc(73219);
            __CLR4_5_21khc1khclusvne2v.R.inc(73220);this.name = name;
        }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

        public Toy getToy() {try{__CLR4_5_21khc1khclusvne2v.R.inc(73221);
            __CLR4_5_21khc1khclusvne2v.R.inc(73222);return toy;
        }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

        public void setToy(Toy toy) {try{__CLR4_5_21khc1khclusvne2v.R.inc(73223);
            __CLR4_5_21khc1khclusvne2v.R.inc(73224);this.toy = toy;
        }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

        // \u8fd9\u513f\u4e0d\u662fstatic\uff0c\u57281.2.27\u30011.2.48\u90fd\u80fd\u8fc7
        public  class Toy {
            private String type;

            public Toy() {try{__CLR4_5_21khc1khclusvne2v.R.inc(73225);
                __CLR4_5_21khc1khclusvne2v.R.inc(73226);this.type = "toyType";
            }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}
            public String getType() {try{__CLR4_5_21khc1khclusvne2v.R.inc(73227);
                __CLR4_5_21khc1khclusvne2v.R.inc(73228);return type;
            }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}

            public void setType(String type) {try{__CLR4_5_21khc1khclusvne2v.R.inc(73229);
                __CLR4_5_21khc1khclusvne2v.R.inc(73230);this.type = type;
            }finally{__CLR4_5_21khc1khclusvne2v.R.flushNeeded();}}
        }
    }
}
