/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1000;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenshao on 25/03/2017.
 */
public class Issue1066 extends TestCase {static class __CLR4_1_1019ay19aylusqk8iw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,58749,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Charset CHARSET = Charset.forName("UTF-8");

    public void test_for_issue() throws Exception {__CLR4_1_1019ay19aylusqk8iw.R.globalSliceStart(getClass().getName(),58714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb19ay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019ay19aylusqk8iw.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019ay19aylusqk8iw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1000.Issue1066.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58714,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb19ay() throws Exception{try{__CLR4_1_1019ay19aylusqk8iw.R.inc(58714);
        __CLR4_1_1019ay19aylusqk8iw.R.inc(58715);Map<EnumType, EnumType> map = new HashMap<EnumType, EnumType>();
        __CLR4_1_1019ay19aylusqk8iw.R.inc(58716);map.put(EnumType.ONE, EnumType.TWO);

        __CLR4_1_1019ay19aylusqk8iw.R.inc(58717);System.out.println("\u5e8f\u5217\u5316\u524d\u7684\u53c2\u6570\u4e3a:" + map);
        __CLR4_1_1019ay19aylusqk8iw.R.inc(58718);ByteArrayOutputStream bos = new ByteArrayOutputStream();
        __CLR4_1_1019ay19aylusqk8iw.R.inc(58719);try{
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58720);serialize(map, bos);

            __CLR4_1_1019ay19aylusqk8iw.R.inc(58721);Object desRes = deserialize(bos.toByteArray());
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58722);System.out.println("\u53cd\u5e8f\u5217\u5316\u540e\u7684\u7ed3\u679c\u4e3a:" + JSON.toJSONString(desRes));
        }finally {
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58723);try{
                __CLR4_1_1019ay19aylusqk8iw.R.inc(58724);bos.close();
            }catch (IOException e){
            }
        }
    }finally{__CLR4_1_1019ay19aylusqk8iw.R.flushNeeded();}}

    public static <T> void serialize(T obj, OutputStream out) {try{__CLR4_1_1019ay19aylusqk8iw.R.inc(58725);
        __CLR4_1_1019ay19aylusqk8iw.R.inc(58726);JSONWriter writer = null;
        __CLR4_1_1019ay19aylusqk8iw.R.inc(58727);try {
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58728);writer = new JSONWriter(new OutputStreamWriter(out, CHARSET.newEncoder().onMalformedInput(CodingErrorAction.IGNORE)));
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58729);writer.config(SerializerFeature.QuoteFieldNames, true);
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58730);writer.config(SerializerFeature.SkipTransientField, true);
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58731);writer.config(SerializerFeature.SortField, true);
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58732);writer.config(SerializerFeature.WriteClassName, true);
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58733);writer.config(SerializerFeature.DisableCircularReferenceDetect, true);
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58734);writer.writeObject(obj);
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58735);writer.flush();
        } catch (Exception e) {
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58736);e.printStackTrace();
        } finally {
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58737);if ((((writer != null)&&(__CLR4_1_1019ay19aylusqk8iw.R.iget(58738)!=0|true))||(__CLR4_1_1019ay19aylusqk8iw.R.iget(58739)==0&false))) {{
                __CLR4_1_1019ay19aylusqk8iw.R.inc(58740);try {
                    __CLR4_1_1019ay19aylusqk8iw.R.inc(58741);writer.close();
                } catch (Exception e) {
                }
            }
        }}
    }finally{__CLR4_1_1019ay19aylusqk8iw.R.flushNeeded();}}

    public static <T> T deserialize(byte[] in) {try{__CLR4_1_1019ay19aylusqk8iw.R.inc(58742);
        __CLR4_1_1019ay19aylusqk8iw.R.inc(58743);return (T) JSON.parse(in, 0, in.length, CHARSET.newDecoder(), Feature.AllowArbitraryCommas,
                Feature.IgnoreNotMatch, Feature.SortFeidFastMatch, Feature.DisableCircularReferenceDetect,
                Feature.AutoCloseSource);
    }finally{__CLR4_1_1019ay19aylusqk8iw.R.flushNeeded();}}

    public static enum EnumType {

        ONE(1, "1"),

        TWO(2, "2")
        ;

        private int code;
        private String desc;

        EnumType(int code, String desc){try{__CLR4_1_1019ay19aylusqk8iw.R.inc(58744);
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58745);this.code = code;
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58746);this.desc = desc;
        }finally{__CLR4_1_1019ay19aylusqk8iw.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_1019ay19aylusqk8iw.R.inc(58747);
            __CLR4_1_1019ay19aylusqk8iw.R.inc(58748);return "EnumType{" +
                    "code=" + code +
                    ", desc='" + desc + '\'' +
                    '}';
        }finally{__CLR4_1_1019ay19aylusqk8iw.R.flushNeeded();}}
    }


}
