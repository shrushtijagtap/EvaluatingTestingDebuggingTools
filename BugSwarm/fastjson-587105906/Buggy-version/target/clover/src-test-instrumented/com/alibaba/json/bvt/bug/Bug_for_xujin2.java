/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

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
public class Bug_for_xujin2 extends TestCase {static class __CLR4_1_1015x715x7lusqk5ru{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,54385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_bug() throws Exception {__CLR4_1_1015x715x7lusqk5ru.R.globalSliceStart(getClass().getName(),54331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yy5c3c15x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015x715x7lusqk5ru.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015x715x7lusqk5ru.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_xujin2.test_for_bug",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),54331,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yy5c3c15x7() throws Exception{try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54331);
        __CLR4_1_1015x715x7lusqk5ru.R.inc(54332);ContactTemplateParam param = new ContactTemplateParam();
        __CLR4_1_1015x715x7lusqk5ru.R.inc(54333);param.setAuditStatus(AuditStatusType.AUDIT_FAILURE);

        __CLR4_1_1015x715x7lusqk5ru.R.inc(54334);String json = JSON.toJSONString(param, new SerializeFilter[] { new IntEnumFilter("auditStatus") });
        __CLR4_1_1015x715x7lusqk5ru.R.inc(54335);assertEquals("{\"auditStatus\":0}", json);
    }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

    public static class IntEnumFilter implements ValueFilter {
        private Set<String> needMaskFileds = new HashSet();

        public IntEnumFilter() {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54336);
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        public IntEnumFilter(String... fileds) {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54337);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54338);if((((fileds != null)&&(__CLR4_1_1015x715x7lusqk5ru.R.iget(54339)!=0|true))||(__CLR4_1_1015x715x7lusqk5ru.R.iget(54340)==0&false))) {{
                __CLR4_1_1015x715x7lusqk5ru.R.inc(54341);String[] arr$ = fileds;
                __CLR4_1_1015x715x7lusqk5ru.R.inc(54342);int len$ = fileds.length;

                __CLR4_1_1015x715x7lusqk5ru.R.inc(54343);for(int i$ = 0; (((i$ < len$)&&(__CLR4_1_1015x715x7lusqk5ru.R.iget(54344)!=0|true))||(__CLR4_1_1015x715x7lusqk5ru.R.iget(54345)==0&false)); ++i$) {{
                    __CLR4_1_1015x715x7lusqk5ru.R.inc(54346);String filed = arr$[i$];
                    __CLR4_1_1015x715x7lusqk5ru.R.inc(54347);this.needMaskFileds.add(filed);
                }
            }}

        }}finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        public Object process(Object object, String name, Object value) {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54348);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54349);return (((value == null)&&(__CLR4_1_1015x715x7lusqk5ru.R.iget(54350)!=0|true))||(__CLR4_1_1015x715x7lusqk5ru.R.iget(54351)==0&false))?value:((((this.needMaskFileds.contains(name) && value instanceof IntEnum )&&(__CLR4_1_1015x715x7lusqk5ru.R.iget(54352)!=0|true))||(__CLR4_1_1015x715x7lusqk5ru.R.iget(54353)==0&false))?Integer.valueOf(((IntEnum)value).getCode()):value);
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}
    }

    public static class ContactTemplateParam implements Serializable {

        private static final long serialVersionUID = 1L;



        public ContactTemplateParam() {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54354);
            // TODO Auto-generated constructor stub
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        /** \u5ba1\u6838\u72b6\u6001 **/
        private AuditStatusType auditStatus;



        public AuditStatusType getAuditStatus() {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54355);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54356);return auditStatus;
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        public void setAuditStatus(AuditStatusType auditStatus) {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54357);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54358);this.auditStatus = auditStatus;
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54359);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54360);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}
    }

    public static enum AuditStatusType implements IntEnum<AuditStatusType> {
        AUDIT_FAILURE(0, "\u5ba1\u6838\u5931\u8d25", "FAILED"),
        AUDIT_SUCCESS(1, "\u6210\u529f", "SUCCEED"),
        AUDIT_NO_SUBMIT(2, "\u672a\u5b9e\u540d\u8ba4\u8bc1", "NONAUDIT"),
        AUDIT_SUBMIT(3, "\u5ba1\u6838\u4e2d", "AUDITING");

        private int code;
        private String desc;
        private String enCode;

        private AuditStatusType(int code) {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54361);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54362);this.code = code;
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        private AuditStatusType(int code, String desc, String enCode) {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54363);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54364);this.code = code;
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54365);this.desc = desc;
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54366);this.enCode = enCode;
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        public static AuditStatusType valuesOf(String enCode) {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54367);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54368);AuditStatusType[] arr$ = values();
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54369);int len$ = arr$.length;

            __CLR4_1_1015x715x7lusqk5ru.R.inc(54370);for(int i$ = 0; (((i$ < len$)&&(__CLR4_1_1015x715x7lusqk5ru.R.iget(54371)!=0|true))||(__CLR4_1_1015x715x7lusqk5ru.R.iget(54372)==0&false)); ++i$) {{
                __CLR4_1_1015x715x7lusqk5ru.R.inc(54373);AuditStatusType temp = arr$[i$];
                __CLR4_1_1015x715x7lusqk5ru.R.inc(54374);if((((temp.getEnCode().equals(enCode))&&(__CLR4_1_1015x715x7lusqk5ru.R.iget(54375)!=0|true))||(__CLR4_1_1015x715x7lusqk5ru.R.iget(54376)==0&false))) {{
                    __CLR4_1_1015x715x7lusqk5ru.R.inc(54377);return temp;
                }
            }}

            }__CLR4_1_1015x715x7lusqk5ru.R.inc(54378);return null;
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        public String getDesc() {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54379);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54380);return this.desc;
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        public String getEnCode() {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54381);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54382);return this.enCode;
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}

        public int getCode() {try{__CLR4_1_1015x715x7lusqk5ru.R.inc(54383);
            __CLR4_1_1015x715x7lusqk5ru.R.inc(54384);return this.code;
        }finally{__CLR4_1_1015x715x7lusqk5ru.R.flushNeeded();}}
    }

    public interface IntEnum<E extends Enum<E>> {
        int getCode();
    }
}
