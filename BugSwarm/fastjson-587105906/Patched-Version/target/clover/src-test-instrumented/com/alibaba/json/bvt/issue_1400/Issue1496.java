/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializeConfig;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class Issue1496 extends TestCase {static class __CLR4_5_21bm31bm3lusvna7d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,61795,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21bm31bm3lusvna7d.R.globalSliceStart(getClass().getName(),61707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1bm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bm31bm3lusvna7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bm31bm3lusvna7d.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1496.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1bm3() throws Exception{try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61707);
        __CLR4_5_21bm31bm3lusvna7d.R.inc(61708);String json = JSON.toJSONString(SetupStatus.FINAL_TRAIL);
        __CLR4_5_21bm31bm3lusvna7d.R.inc(61709);assertEquals("{\"canRefuse\":true,\"code\":3,\"declaringClass\":\"com.alibaba.json.bvt.issue_1400.Issue1496$SetupStatus\",\"first\":false,\"last\":false,\"name\":\"FINAL_TRAIL\",\"nameCn\":\"\u516c\u76ca\u59d4\u5458\u4f1a/\u7406\u4e8b\u4f1a/\u7406\u4e8b\u957f\u5ba1\u6838\"}", json);
    }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

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
            public List<SetupStatus> nextList() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61710);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61711);return Arrays.asList(FIRST_TRAIL);
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

            @Override
            public Boolean isFirst() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61712);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61713);return true;
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

            @Override
            public SetupStatus refuse() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61714);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61715);return EDIT;
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        }, FIRST_TRAIL(1, "FIRST_TRAIL", "\u521d\u5ba1") {
            public List<SetupStatus> nextList() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61716);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61717);return Arrays.asList(EXPERT, FINAL_TRAIL);
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

            @Override
            public SetupStatus refuse() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61718);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61719);return EDIT;
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        }, EXPERT(2, "EXPERT", "\u4e13\u5bb6\u8865\u5145\u610f\u89c1", false) {
            public List<SetupStatus> nextList() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61720);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61721);return Arrays.asList(FINAL_TRAIL);
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        }, FINAL_TRAIL(3, "FINAL_TRAIL", "\u516c\u76ca\u59d4\u5458\u4f1a/\u7406\u4e8b\u4f1a/\u7406\u4e8b\u957f\u5ba1\u6838") {
            public List<SetupStatus> nextList() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61722);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61723);return Arrays.asList(PASS);
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

            @Override
            public SetupStatus refuse() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61724);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61725);return EDIT;
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}
        }, PASS(4, "PASS", "\u9879\u76ee\u901a\u8fc7", false) {
            public List<SetupStatus> nextList() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61726);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61727);return Arrays.asList(SIGN);
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}
        }, SIGN(5, "SIGN", "\u534f\u8bae\u7b7e\u7f72", false) {
            @Override
            public List<SetupStatus> nextList() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61728);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61729);return Arrays.asList(ACTIVE);
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}
        }, ACTIVE(6, "ACTIVE", "\u542f\u52a8") {
            @Override
            public List<SetupStatus> nextList() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61730);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61731);return null;
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

            @Override
            public Boolean isLast() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61732);
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61733);return true;
            }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}
        };
        private int code;
        private String name;
        private String nameCn;
        private boolean canRefuse;

        SetupStatus(int code, String name, String nameCn) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61734);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61735);this.code = code;
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61736);this.name = name;
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61737);this.nameCn = nameCn;
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61738);this.canRefuse = true;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        SetupStatus(int code, String name, String nameCn, boolean canRefuse) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61739);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61740);this.code = code;
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61741);this.name = name;
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61742);this.nameCn = nameCn;
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61743);this.canRefuse = canRefuse;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public int getCode() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61744);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61745);return code;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public void setCode(int code) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61746);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61747);this.code = code;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61748);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61749);return name;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61750);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61751);this.name = name;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public String getNameCn() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61752);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61753);return nameCn;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public void setNameCn(String nameCn) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61754);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61755);this.nameCn = nameCn;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public boolean isCanRefuse() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61756);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61757);return canRefuse;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public void setCanRefuse(boolean canRefuse) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61758);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61759);this.canRefuse = canRefuse;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public static SetupStatus getFromCode(Integer code) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61760);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61761);if ((((code == null)&&(__CLR4_5_21bm31bm3lusvna7d.R.iget(61762)!=0|true))||(__CLR4_5_21bm31bm3lusvna7d.R.iget(61763)==0&false))) {{
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61764);return null;
            }
            }__CLR4_5_21bm31bm3lusvna7d.R.inc(61765);for (SetupStatus status : values()) {{
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61766);if ((((status.code == code)&&(__CLR4_5_21bm31bm3lusvna7d.R.iget(61767)!=0|true))||(__CLR4_5_21bm31bm3lusvna7d.R.iget(61768)==0&false))) {{
                    __CLR4_5_21bm31bm3lusvna7d.R.inc(61769);return status;
                }
            }}
            }__CLR4_5_21bm31bm3lusvna7d.R.inc(61770);throw new IllegalArgumentException("unknown SetupStatus enumeration code:" + code);
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public static SetupStatus getFromName(String name) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61771);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61772);if ((((name == null)&&(__CLR4_5_21bm31bm3lusvna7d.R.iget(61773)!=0|true))||(__CLR4_5_21bm31bm3lusvna7d.R.iget(61774)==0&false))) {{
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61775);return null;
            }
            }__CLR4_5_21bm31bm3lusvna7d.R.inc(61776);for (SetupStatus status : values()) {{
                __CLR4_5_21bm31bm3lusvna7d.R.inc(61777);if ((((status.name.equals(name))&&(__CLR4_5_21bm31bm3lusvna7d.R.iget(61778)!=0|true))||(__CLR4_5_21bm31bm3lusvna7d.R.iget(61779)==0&false))) {{
                    __CLR4_5_21bm31bm3lusvna7d.R.inc(61780);return status;
                }
            }}
            }__CLR4_5_21bm31bm3lusvna7d.R.inc(61781);return null;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public Boolean isFirst() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61782);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61783);return false;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public Boolean isLast() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61784);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61785);return false;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public SetupStatus refuse() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61786);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61787);return null;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        public SetupStatus next(String name) {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61788);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61789);SetupStatus status = getFromName(name);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61790);return (((name != null && this.nextList().contains(status) )&&(__CLR4_5_21bm31bm3lusvna7d.R.iget(61791)!=0|true))||(__CLR4_5_21bm31bm3lusvna7d.R.iget(61792)==0&false))? status : null;
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21bm31bm3lusvna7d.R.inc(61793);
            __CLR4_5_21bm31bm3lusvna7d.R.inc(61794);return "SetupStatus{" + "code=" + code + ", name='" + name + '\'' + ", nameCn='" + nameCn + '\'' + ", canRefuse=" + canRefuse + '}';
        }finally{__CLR4_5_21bm31bm3lusvna7d.R.flushNeeded();}}
    }
}
