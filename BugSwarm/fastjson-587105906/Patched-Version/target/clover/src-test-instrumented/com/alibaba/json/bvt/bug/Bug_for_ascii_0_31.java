/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

@java.lang.SuppressWarnings({"fallthrough"}) public class Bug_for_ascii_0_31 extends TestCase {static class __CLR4_5_213gp13gplusyjrhf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,51224,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_213gp13gplusyjrhf.R.globalSliceStart(getClass().getName(),51145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp213gp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213gp13gplusyjrhf.R.rethrow($CLV_t2$);}finally{__CLR4_5_213gp13gplusyjrhf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_ascii_0_31.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp213gp() throws Exception{try{__CLR4_5_213gp13gplusyjrhf.R.inc(51145);
        __CLR4_5_213gp13gplusyjrhf.R.inc(51146);for (int i = 0; (((i < 32)&&(__CLR4_5_213gp13gplusyjrhf.R.iget(51147)!=0|true))||(__CLR4_5_213gp13gplusyjrhf.R.iget(51148)==0&false)); ++i) {{
            __CLR4_5_213gp13gplusyjrhf.R.inc(51149);StringBuilder buf = new StringBuilder();
            __CLR4_5_213gp13gplusyjrhf.R.inc(51150);char ch = (char) i;
            __CLR4_5_213gp13gplusyjrhf.R.inc(51151);buf.append(ch);

            __CLR4_5_213gp13gplusyjrhf.R.inc(51152);String text = JSON.toJSONString(buf.toString(), SerializerFeature.BrowserCompatible);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_213gp13gplusyjrhf.R.inc(51153);switch (ch) {
                case '"':if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51154);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51155);Assert.assertEquals("\"\\\"\"", text);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51156);break;
                case '/':if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51157);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51158);Assert.assertEquals("\"\\/\"", text);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51159);break;
                case '\\':if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51160);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51161);Assert.assertEquals("\"\\\\\"", text);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51162);break;
                case '\b':if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51163);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51164);Assert.assertEquals("\"\\b\"", text);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51165);break;
                case '\f':if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51166);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51167);Assert.assertEquals("\"\\f\"", text);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51168);break;
                case '\n':if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51169);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51170);Assert.assertEquals("\"\\n\"", text);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51171);break;
                case '\r':if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51172);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51173);Assert.assertEquals("\"\\r\"", text);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51174);break;
                case '\t':if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51175);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51176);Assert.assertEquals("\"\\t\"", text);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51177);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_213gp13gplusyjrhf.R.inc(51178);__CLB4_5_2_bool0=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51179);if ((((i < 16)&&(__CLR4_5_213gp13gplusyjrhf.R.iget(51180)!=0|true))||(__CLR4_5_213gp13gplusyjrhf.R.iget(51181)==0&false))) {{
                        __CLR4_5_213gp13gplusyjrhf.R.inc(51182);Assert.assertEquals("\"\\u000" + Integer.toHexString(i).toUpperCase() + "\"", text);
                    } }else {{
                        __CLR4_5_213gp13gplusyjrhf.R.inc(51183);Assert.assertEquals("\"\\u00" + Integer.toHexString(i).toUpperCase() + "\"", text);
                    }
                    }__CLR4_5_213gp13gplusyjrhf.R.inc(51184);break;
            }

            __CLR4_5_213gp13gplusyjrhf.R.inc(51185);VO vo = new VO();
            __CLR4_5_213gp13gplusyjrhf.R.inc(51186);vo.setContent(buf.toString());

            __CLR4_5_213gp13gplusyjrhf.R.inc(51187);String voText = JSON.toJSONString(vo, SerializerFeature.BrowserCompatible);

            boolean __CLB4_5_2_bool1=false;__CLR4_5_213gp13gplusyjrhf.R.inc(51188);switch (ch) {
                case '"':if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51189);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51190);Assert.assertEquals("{\"content\":\"\\\"\"}", voText);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51191);break;
                case '/':if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51192);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51193);Assert.assertEquals("{\"content\":\"\\/\"}", voText);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51194);break;
                case '\\':if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51195);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51196);Assert.assertEquals("{\"content\":\"\\\\\"}", voText);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51197);break;
                case '\b':if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51198);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51199);Assert.assertEquals("{\"content\":\"\\b\"}", voText);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51200);break;
                case '\f':if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51201);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51202);Assert.assertEquals("{\"content\":\"\\f\"}", voText);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51203);break;
                case '\n':if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51204);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51205);Assert.assertEquals("{\"content\":\"\\n\"}", voText);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51206);break;
                case '\r':if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51207);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51208);Assert.assertEquals("{\"content\":\"\\r\"}", voText);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51209);break;
                case '\t':if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51210);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51211);Assert.assertEquals("{\"content\":\"\\t\"}", voText);
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51212);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_213gp13gplusyjrhf.R.inc(51213);__CLB4_5_2_bool1=true;}
                    __CLR4_5_213gp13gplusyjrhf.R.inc(51214);if ((((i < 16)&&(__CLR4_5_213gp13gplusyjrhf.R.iget(51215)!=0|true))||(__CLR4_5_213gp13gplusyjrhf.R.iget(51216)==0&false))) {{
                        __CLR4_5_213gp13gplusyjrhf.R.inc(51217);Assert.assertEquals("{\"content\":\"\\u000" + Integer.toHexString(i).toUpperCase() + "\"}",
                                            voText);
                    } }else {{
                        __CLR4_5_213gp13gplusyjrhf.R.inc(51218);Assert.assertEquals("{\"content\":\"\\u00" + Integer.toHexString(i).toUpperCase() + "\"}",
                                            voText);
                    }
                    }__CLR4_5_213gp13gplusyjrhf.R.inc(51219);break;
            }
        }

    }}finally{__CLR4_5_213gp13gplusyjrhf.R.flushNeeded();}}

    public static class VO {

        private String content;

        public String getContent() {try{__CLR4_5_213gp13gplusyjrhf.R.inc(51220);
            __CLR4_5_213gp13gplusyjrhf.R.inc(51221);return content;
        }finally{__CLR4_5_213gp13gplusyjrhf.R.flushNeeded();}}

        public void setContent(String content) {try{__CLR4_5_213gp13gplusyjrhf.R.inc(51222);
            __CLR4_5_213gp13gplusyjrhf.R.inc(51223);this.content = content;
        }finally{__CLR4_5_213gp13gplusyjrhf.R.flushNeeded();}}

    }
}
