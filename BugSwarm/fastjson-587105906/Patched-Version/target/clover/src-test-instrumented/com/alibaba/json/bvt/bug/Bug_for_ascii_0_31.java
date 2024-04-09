/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

@java.lang.SuppressWarnings({"fallthrough"}) public class Bug_for_ascii_0_31 extends TestCase {static class __CLR4_5_214ex14exlusvn61d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,52456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_214ex14exlusvn61d.R.globalSliceStart(getClass().getName(),52377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp214ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214ex14exlusvn61d.R.rethrow($CLV_t2$);}finally{__CLR4_5_214ex14exlusvn61d.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_ascii_0_31.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp214ex() throws Exception{try{__CLR4_5_214ex14exlusvn61d.R.inc(52377);
        __CLR4_5_214ex14exlusvn61d.R.inc(52378);for (int i = 0; (((i < 32)&&(__CLR4_5_214ex14exlusvn61d.R.iget(52379)!=0|true))||(__CLR4_5_214ex14exlusvn61d.R.iget(52380)==0&false)); ++i) {{
            __CLR4_5_214ex14exlusvn61d.R.inc(52381);StringBuilder buf = new StringBuilder();
            __CLR4_5_214ex14exlusvn61d.R.inc(52382);char ch = (char) i;
            __CLR4_5_214ex14exlusvn61d.R.inc(52383);buf.append(ch);

            __CLR4_5_214ex14exlusvn61d.R.inc(52384);String text = JSON.toJSONString(buf.toString(), SerializerFeature.BrowserCompatible);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_214ex14exlusvn61d.R.inc(52385);switch (ch) {
                case '"':if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52386);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52387);Assert.assertEquals("\"\\\"\"", text);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52388);break;
                case '/':if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52389);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52390);Assert.assertEquals("\"\\/\"", text);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52391);break;
                case '\\':if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52392);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52393);Assert.assertEquals("\"\\\\\"", text);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52394);break;
                case '\b':if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52395);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52396);Assert.assertEquals("\"\\b\"", text);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52397);break;
                case '\f':if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52398);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52399);Assert.assertEquals("\"\\f\"", text);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52400);break;
                case '\n':if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52401);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52402);Assert.assertEquals("\"\\n\"", text);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52403);break;
                case '\r':if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52404);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52405);Assert.assertEquals("\"\\r\"", text);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52406);break;
                case '\t':if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52407);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52408);Assert.assertEquals("\"\\t\"", text);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52409);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_214ex14exlusvn61d.R.inc(52410);__CLB4_5_2_bool0=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52411);if ((((i < 16)&&(__CLR4_5_214ex14exlusvn61d.R.iget(52412)!=0|true))||(__CLR4_5_214ex14exlusvn61d.R.iget(52413)==0&false))) {{
                        __CLR4_5_214ex14exlusvn61d.R.inc(52414);Assert.assertEquals("\"\\u000" + Integer.toHexString(i).toUpperCase() + "\"", text);
                    } }else {{
                        __CLR4_5_214ex14exlusvn61d.R.inc(52415);Assert.assertEquals("\"\\u00" + Integer.toHexString(i).toUpperCase() + "\"", text);
                    }
                    }__CLR4_5_214ex14exlusvn61d.R.inc(52416);break;
            }

            __CLR4_5_214ex14exlusvn61d.R.inc(52417);VO vo = new VO();
            __CLR4_5_214ex14exlusvn61d.R.inc(52418);vo.setContent(buf.toString());

            __CLR4_5_214ex14exlusvn61d.R.inc(52419);String voText = JSON.toJSONString(vo, SerializerFeature.BrowserCompatible);

            boolean __CLB4_5_2_bool1=false;__CLR4_5_214ex14exlusvn61d.R.inc(52420);switch (ch) {
                case '"':if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52421);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52422);Assert.assertEquals("{\"content\":\"\\\"\"}", voText);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52423);break;
                case '/':if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52424);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52425);Assert.assertEquals("{\"content\":\"\\/\"}", voText);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52426);break;
                case '\\':if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52427);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52428);Assert.assertEquals("{\"content\":\"\\\\\"}", voText);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52429);break;
                case '\b':if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52430);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52431);Assert.assertEquals("{\"content\":\"\\b\"}", voText);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52432);break;
                case '\f':if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52433);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52434);Assert.assertEquals("{\"content\":\"\\f\"}", voText);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52435);break;
                case '\n':if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52436);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52437);Assert.assertEquals("{\"content\":\"\\n\"}", voText);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52438);break;
                case '\r':if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52439);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52440);Assert.assertEquals("{\"content\":\"\\r\"}", voText);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52441);break;
                case '\t':if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52442);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52443);Assert.assertEquals("{\"content\":\"\\t\"}", voText);
                    __CLR4_5_214ex14exlusvn61d.R.inc(52444);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_214ex14exlusvn61d.R.inc(52445);__CLB4_5_2_bool1=true;}
                    __CLR4_5_214ex14exlusvn61d.R.inc(52446);if ((((i < 16)&&(__CLR4_5_214ex14exlusvn61d.R.iget(52447)!=0|true))||(__CLR4_5_214ex14exlusvn61d.R.iget(52448)==0&false))) {{
                        __CLR4_5_214ex14exlusvn61d.R.inc(52449);Assert.assertEquals("{\"content\":\"\\u000" + Integer.toHexString(i).toUpperCase() + "\"}",
                                            voText);
                    } }else {{
                        __CLR4_5_214ex14exlusvn61d.R.inc(52450);Assert.assertEquals("{\"content\":\"\\u00" + Integer.toHexString(i).toUpperCase() + "\"}",
                                            voText);
                    }
                    }__CLR4_5_214ex14exlusvn61d.R.inc(52451);break;
            }
        }

    }}finally{__CLR4_5_214ex14exlusvn61d.R.flushNeeded();}}

    public static class VO {

        private String content;

        public String getContent() {try{__CLR4_5_214ex14exlusvn61d.R.inc(52452);
            __CLR4_5_214ex14exlusvn61d.R.inc(52453);return content;
        }finally{__CLR4_5_214ex14exlusvn61d.R.flushNeeded();}}

        public void setContent(String content) {try{__CLR4_5_214ex14exlusvn61d.R.inc(52454);
            __CLR4_5_214ex14exlusvn61d.R.inc(52455);this.content = content;
        }finally{__CLR4_5_214ex14exlusvn61d.R.flushNeeded();}}

    }
}
