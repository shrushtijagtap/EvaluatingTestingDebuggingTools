/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;

import junit.framework.TestCase;

public class FieldInfoTest extends TestCase {static class __CLR4_1_101xt61xt6lusqkneg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,90522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_null() throws Exception {__CLR4_1_101xt61xt6lusqkneg.R.globalSliceStart(getClass().getName(),90474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1xt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xt61xt6lusqkneg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xt61xt6lusqkneg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.FieldInfoTest.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90474,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1xt6() throws Exception{try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90474);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90475);FieldInfo fieldInfo = new FieldInfo("getValue", Entity.class.getMethod("getValue"), null, null, null, 0, 0, 0, null, null, null);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90476);Assert.assertEquals(null, fieldInfo.getAnnotation());

        __CLR4_1_101xt61xt6lusqkneg.R.inc(90477);Field field = GenericFieldEntity.class.getField("value");
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90478);Type type = new ParameterizedTypeImpl(new Type[] { ValueObject.class }, null, GenericFieldEntity.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90479);FieldInfo fieldInfoOfField = new FieldInfo("value", null, field, GenericFieldEntity.class, type, 0, 0, 0, null, null, null);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90480);Assert.assertEquals(fieldInfoOfField.fieldType, ValueObject.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90481);Assert.assertEquals(fieldInfoOfField.fieldClass, ValueObject.class);

        __CLR4_1_101xt61xt6lusqkneg.R.inc(90482);field = GenericListFieldEntity.class.getField("value");
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90483);type = new ParameterizedTypeImpl(new Type[] { ValueObject.class }, null, GenericListFieldEntity.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90484);FieldInfo fieldInfoOfListField = new FieldInfo("value", null, field, GenericListFieldEntity.class, type, 0, 0, 0, null, null, null);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90485);ParameterizedTypeImpl actualFieldType = (ParameterizedTypeImpl) fieldInfoOfListField.fieldType;
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90486);Assert.assertEquals(actualFieldType.getActualTypeArguments()[0], ValueObject.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90487);Assert.assertEquals(actualFieldType.getRawType(), List.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90488);Assert.assertEquals(fieldInfoOfListField.fieldClass, List.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90489);Assert.assertEquals(null, ((ParameterizedTypeImpl) type).getOwnerType());

        __CLR4_1_101xt61xt6lusqkneg.R.inc(90490);Method method = GenericSetterEntity.class.getMethod("setValue", Object.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90491);type = new ParameterizedTypeImpl(new Type[] { ValueObject.class }, null, GenericSetterEntity.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90492);FieldInfo fieldInfoOfSetter = new FieldInfo("value", method, null, GenericSetterEntity.class, type, 0, 0, 0, null, null, null);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90493);Assert.assertEquals(fieldInfoOfSetter.fieldType, ValueObject.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90494);Assert.assertEquals(fieldInfoOfSetter.fieldClass, ValueObject.class);
        
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90495);fieldInfoOfSetter.toString();

        __CLR4_1_101xt61xt6lusqkneg.R.inc(90496);method = GenericListSetterEntity.class.getMethod("setValue", List.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90497);type = new ParameterizedTypeImpl(new Type[] { ValueObject.class }, null, GenericListSetterEntity.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90498);FieldInfo fieldInfoOfListSetter = new FieldInfo("value", method, null, GenericListSetterEntity.class, type, 0, 0, 0, null, null, null);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90499);Assert.assertEquals(actualFieldType.getActualTypeArguments()[0], ValueObject.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90500);Assert.assertEquals(actualFieldType.getRawType(), List.class);
        __CLR4_1_101xt61xt6lusqkneg.R.inc(90501);Assert.assertEquals(fieldInfoOfListSetter.fieldClass, List.class);
    }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}

    public static class Entity {
        private int value;

        public int getValue() {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90502);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90503);return value;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90504);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90505);this.value = value;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}
    }

    public static class GenericSetterEntity<T> {
        private T value;

        public T getValue() {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90506);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90507);return value;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}

        public void setValue(T value) {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90508);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90509);this.value = value;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}
    }

    public static class GenericListSetterEntity<T> {
        private List<T> value;

        public List<T> getValue() {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90510);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90511);return value;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}

        public void setValue(List<T> value) {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90512);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90513);this.value = value;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}
    }

    public static class GenericFieldEntity<T> {
        public T value;
    }

    public static class GenericListFieldEntity<T> {
        public List<T> value;
    }

    public static class ValueObject {
        private String name;
        private int    id;

        public String getName() {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90514);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90515);return name;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90516);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90517);this.name = name;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90518);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90519);return id;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101xt61xt6lusqkneg.R.inc(90520);
            __CLR4_1_101xt61xt6lusqkneg.R.inc(90521);this.id = id;
        }finally{__CLR4_1_101xt61xt6lusqkneg.R.flushNeeded();}}
    }
}
