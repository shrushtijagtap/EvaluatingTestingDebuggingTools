/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializeConfig;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class Issue1496 extends TestCase {static class __CLR4_5_21anv1anvlusyjsv3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60563,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21anv1anvlusyjsv3.R.globalSliceStart(getClass().getName(),60475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1anv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21anv1anvlusyjsv3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21anv1anvlusyjsv3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1496.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1anv() throws Exception{try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60475);
        __CLR4_5_21anv1anvlusyjsv3.R.inc(60476);String json = JSON.toJSONString(SetupStatus.FINAL_TRAIL);
        __CLR4_5_21anv1anvlusyjsv3.R.inc(60477);assertEquals("{\"canRefuse\":true,\"code\":3,\"declaringClass\":\"com.alibaba.json.bvt.issue_1400.Issue1496$SetupStatus\",\"first\":false,\"last\":false,\"name\":\"FINAL_TRAIL\",\"nameCn\":\"\u516c\u76ca\u59d4\u5458\u4f1a/\u7406\u4e8b\u4f1a/\u7406\u4e8b\u957f\u5ba1\u6838\"}", json);
    }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

    public interface ISetupStatusInfo {
        List<SetupStatus> nextList();

        Boolean isFirst();

        Boolean isLast();
    }

    public interface ISetupStatusProcess {

        /**
         *
         * @return
         */
        SetupStatus refuse();

        /**
         * \u72b6\u6001\u8f6c\u79fb\u5931\u8d25\u8fd4\u56denull
         *
         * @param name
         * @return
         */
        SetupStatus next(String name);

    }

    @JSONType(serializeEnumAsJavaBean = true)
    public enum SetupStatus implements ISetupStatusInfo, ISetupStatusProcess {
        EDIT(0, "EDIT", "\u7f16\u8f91\u4e2d") {
            public List<SetupStatus> nextList() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60478);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60479);return Arrays.asList(FIRST_TRAIL);
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

            @Override
            public Boolean isFirst() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60480);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60481);return true;
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

            @Override
            public SetupStatus refuse() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60482);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60483);return EDIT;
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        }, FIRST_TRAIL(1, "FIRST_TRAIL", "\u521d\u5ba1") {
            public List<SetupStatus> nextList() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60484);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60485);return Arrays.asList(EXPERT, FINAL_TRAIL);
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

            @Override
            public SetupStatus refuse() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60486);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60487);return EDIT;
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        }, EXPERT(2, "EXPERT", "\u4e13\u5bb6\u8865\u5145\u610f\u89c1", false) {
            public List<SetupStatus> nextList() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60488);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60489);return Arrays.asList(FINAL_TRAIL);
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        }, FINAL_TRAIL(3, "FINAL_TRAIL", "\u516c\u76ca\u59d4\u5458\u4f1a/\u7406\u4e8b\u4f1a/\u7406\u4e8b\u957f\u5ba1\u6838") {
            public List<SetupStatus> nextList() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60490);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60491);return Arrays.asList(PASS);
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

            @Override
            public SetupStatus refuse() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60492);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60493);return EDIT;
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}
        }, PASS(4, "PASS", "\u9879\u76ee\u901a\u8fc7", false) {
            public List<SetupStatus> nextList() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60494);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60495);return Arrays.asList(SIGN);
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}
        }, SIGN(5, "SIGN", "\u534f\u8bae\u7b7e\u7f72", false) {
            @Override
            public List<SetupStatus> nextList() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60496);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60497);return Arrays.asList(ACTIVE);
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}
        }, ACTIVE(6, "ACTIVE", "\u542f\u52a8") {
            @Override
            public List<SetupStatus> nextList() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60498);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60499);return null;
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

            @Override
            public Boolean isLast() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60500);
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60501);return true;
            }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}
        };
        private int code;
        private String name;
        private String nameCn;
        private boolean canRefuse;

        SetupStatus(int code, String name, String nameCn) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60502);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60503);this.code = code;
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60504);this.name = name;
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60505);this.nameCn = nameCn;
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60506);this.canRefuse = true;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        SetupStatus(int code, String name, String nameCn, boolean canRefuse) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60507);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60508);this.code = code;
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60509);this.name = name;
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60510);this.nameCn = nameCn;
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60511);this.canRefuse = canRefuse;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public int getCode() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60512);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60513);return code;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public void setCode(int code) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60514);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60515);this.code = code;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60516);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60517);return name;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60518);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60519);this.name = name;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public String getNameCn() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60520);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60521);return nameCn;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public void setNameCn(String nameCn) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60522);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60523);this.nameCn = nameCn;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public boolean isCanRefuse() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60524);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60525);return canRefuse;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public void setCanRefuse(boolean canRefuse) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60526);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60527);this.canRefuse = canRefuse;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public static SetupStatus getFromCode(Integer code) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60528);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60529);if ((((code == null)&&(__CLR4_5_21anv1anvlusyjsv3.R.iget(60530)!=0|true))||(__CLR4_5_21anv1anvlusyjsv3.R.iget(60531)==0&false))) {{
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60532);return null;
            }
            }__CLR4_5_21anv1anvlusyjsv3.R.inc(60533);for (SetupStatus status : values()) {{
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60534);if ((((status.code == code)&&(__CLR4_5_21anv1anvlusyjsv3.R.iget(60535)!=0|true))||(__CLR4_5_21anv1anvlusyjsv3.R.iget(60536)==0&false))) {{
                    __CLR4_5_21anv1anvlusyjsv3.R.inc(60537);return status;
                }
            }}
            }__CLR4_5_21anv1anvlusyjsv3.R.inc(60538);throw new IllegalArgumentException("unknown SetupStatus enumeration code:" + code);
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public static SetupStatus getFromName(String name) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60539);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60540);if ((((name == null)&&(__CLR4_5_21anv1anvlusyjsv3.R.iget(60541)!=0|true))||(__CLR4_5_21anv1anvlusyjsv3.R.iget(60542)==0&false))) {{
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60543);return null;
            }
            }__CLR4_5_21anv1anvlusyjsv3.R.inc(60544);for (SetupStatus status : values()) {{
                __CLR4_5_21anv1anvlusyjsv3.R.inc(60545);if ((((status.name.equals(name))&&(__CLR4_5_21anv1anvlusyjsv3.R.iget(60546)!=0|true))||(__CLR4_5_21anv1anvlusyjsv3.R.iget(60547)==0&false))) {{
                    __CLR4_5_21anv1anvlusyjsv3.R.inc(60548);return status;
                }
            }}
            }__CLR4_5_21anv1anvlusyjsv3.R.inc(60549);return null;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public Boolean isFirst() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60550);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60551);return false;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public Boolean isLast() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60552);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60553);return false;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public SetupStatus refuse() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60554);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60555);return null;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        public SetupStatus next(String name) {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60556);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60557);SetupStatus status = getFromName(name);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60558);return (((name != null && this.nextList().contains(status) )&&(__CLR4_5_21anv1anvlusyjsv3.R.iget(60559)!=0|true))||(__CLR4_5_21anv1anvlusyjsv3.R.iget(60560)==0&false))? status : null;
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21anv1anvlusyjsv3.R.inc(60561);
            __CLR4_5_21anv1anvlusyjsv3.R.inc(60562);return "SetupStatus{" + "code=" + code + ", name='" + name + '\'' + ", nameCn='" + nameCn + '\'' + ", canRefuse=" + canRefuse + '}';
        }finally{__CLR4_5_21anv1anvlusyjsv3.R.flushNeeded();}}
    }
}
