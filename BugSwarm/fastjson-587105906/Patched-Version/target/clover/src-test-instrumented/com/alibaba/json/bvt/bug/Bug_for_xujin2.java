/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.ValueFilter;
import junit.framework.TestCase;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wenshao on 10/02/2017.
 */
public class Bug_for_xujin2 extends TestCase {static class __CLR4_5_216v416v4lusvn7cp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_bug() throws Exception {__CLR4_5_216v416v4lusvn7cp.R.globalSliceStart(getClass().getName(),55552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yy5c3c16v4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216v416v4lusvn7cp.R.rethrow($CLV_t2$);}finally{__CLR4_5_216v416v4lusvn7cp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_xujin2.test_for_bug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yy5c3c16v4() throws Exception{try{__CLR4_5_216v416v4lusvn7cp.R.inc(55552);
        __CLR4_5_216v416v4lusvn7cp.R.inc(55553);ContactTemplateParam param = new ContactTemplateParam();
        __CLR4_5_216v416v4lusvn7cp.R.inc(55554);param.setAuditStatus(AuditStatusType.AUDIT_FAILURE);

        __CLR4_5_216v416v4lusvn7cp.R.inc(55555);String json = JSON.toJSONString(param, new SerializeFilter[] { new IntEnumFilter("auditStatus") });
        __CLR4_5_216v416v4lusvn7cp.R.inc(55556);assertEquals("{\"auditStatus\":0}", json);
    }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

    public static class IntEnumFilter implements ValueFilter {
        private Set<String> needMaskFileds = new HashSet();

        public IntEnumFilter() {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55557);
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        public IntEnumFilter(String... fileds) {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55558);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55559);if((((fileds != null)&&(__CLR4_5_216v416v4lusvn7cp.R.iget(55560)!=0|true))||(__CLR4_5_216v416v4lusvn7cp.R.iget(55561)==0&false))) {{
                __CLR4_5_216v416v4lusvn7cp.R.inc(55562);String[] arr$ = fileds;
                __CLR4_5_216v416v4lusvn7cp.R.inc(55563);int len$ = fileds.length;

                __CLR4_5_216v416v4lusvn7cp.R.inc(55564);for(int i$ = 0; (((i$ < len$)&&(__CLR4_5_216v416v4lusvn7cp.R.iget(55565)!=0|true))||(__CLR4_5_216v416v4lusvn7cp.R.iget(55566)==0&false)); ++i$) {{
                    __CLR4_5_216v416v4lusvn7cp.R.inc(55567);String filed = arr$[i$];
                    __CLR4_5_216v416v4lusvn7cp.R.inc(55568);this.needMaskFileds.add(filed);
                }
            }}

        }}finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        public Object process(Object object, String name, Object value) {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55569);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55570);return (((value == null)&&(__CLR4_5_216v416v4lusvn7cp.R.iget(55571)!=0|true))||(__CLR4_5_216v416v4lusvn7cp.R.iget(55572)==0&false))?value:((((this.needMaskFileds.contains(name) && value instanceof IntEnum )&&(__CLR4_5_216v416v4lusvn7cp.R.iget(55573)!=0|true))||(__CLR4_5_216v416v4lusvn7cp.R.iget(55574)==0&false))?Integer.valueOf(((IntEnum)value).getCode()):value);
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}
    }

    public static class ContactTemplateParam implements Serializable {

        private static final long serialVersionUID = 1L;



        public ContactTemplateParam() {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55575);
            // TODO Auto-generated constructor stub
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        /** \u5ba1\u6838\u72b6\u6001 **/
        private AuditStatusType auditStatus;



        public AuditStatusType getAuditStatus() {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55576);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55577);return auditStatus;
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        public void setAuditStatus(AuditStatusType auditStatus) {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55578);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55579);this.auditStatus = auditStatus;
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55580);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55581);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}
    }

    public static enum AuditStatusType implements IntEnum<AuditStatusType> {
        AUDIT_FAILURE(0, "\u5ba1\u6838\u5931\u8d25", "FAILED"),
        AUDIT_SUCCESS(1, "\u6210\u529f", "SUCCEED"),
        AUDIT_NO_SUBMIT(2, "\u672a\u5b9e\u540d\u8ba4\u8bc1", "NONAUDIT"),
        AUDIT_SUBMIT(3, "\u5ba1\u6838\u4e2d", "AUDITING");

        private int code;
        private String desc;
        private String enCode;

        private AuditStatusType(int code) {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55582);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55583);this.code = code;
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        private AuditStatusType(int code, String desc, String enCode) {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55584);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55585);this.code = code;
            __CLR4_5_216v416v4lusvn7cp.R.inc(55586);this.desc = desc;
            __CLR4_5_216v416v4lusvn7cp.R.inc(55587);this.enCode = enCode;
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        public static AuditStatusType valuesOf(String enCode) {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55588);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55589);AuditStatusType[] arr$ = values();
            __CLR4_5_216v416v4lusvn7cp.R.inc(55590);int len$ = arr$.length;

            __CLR4_5_216v416v4lusvn7cp.R.inc(55591);for(int i$ = 0; (((i$ < len$)&&(__CLR4_5_216v416v4lusvn7cp.R.iget(55592)!=0|true))||(__CLR4_5_216v416v4lusvn7cp.R.iget(55593)==0&false)); ++i$) {{
                __CLR4_5_216v416v4lusvn7cp.R.inc(55594);AuditStatusType temp = arr$[i$];
                __CLR4_5_216v416v4lusvn7cp.R.inc(55595);if((((temp.getEnCode().equals(enCode))&&(__CLR4_5_216v416v4lusvn7cp.R.iget(55596)!=0|true))||(__CLR4_5_216v416v4lusvn7cp.R.iget(55597)==0&false))) {{
                    __CLR4_5_216v416v4lusvn7cp.R.inc(55598);return temp;
                }
            }}

            }__CLR4_5_216v416v4lusvn7cp.R.inc(55599);return null;
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        public String getDesc() {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55600);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55601);return this.desc;
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        public String getEnCode() {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55602);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55603);return this.enCode;
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}

        public int getCode() {try{__CLR4_5_216v416v4lusvn7cp.R.inc(55604);
            __CLR4_5_216v416v4lusvn7cp.R.inc(55605);return this.code;
        }finally{__CLR4_5_216v416v4lusvn7cp.R.flushNeeded();}}
    }

    public interface IntEnum<E extends Enum<E>> {
        int getCode();
    }
}
