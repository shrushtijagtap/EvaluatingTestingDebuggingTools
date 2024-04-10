/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;

import junit.framework.TestCase;

public class FieldInfoTest extends TestCase {static class __CLR4_1_101yre1yreluszwg4u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91754,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_null() throws Exception {__CLR4_1_101yre1yreluszwg4u.R.globalSliceStart(getClass().getName(),91706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1yre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yre1yreluszwg4u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yre1yreluszwg4u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.FieldInfoTest.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1yre() throws Exception{try{__CLR4_1_101yre1yreluszwg4u.R.inc(91706);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91707);FieldInfo fieldInfo = new FieldInfo("getValue", Entity.class.getMethod("getValue"), null, null, null, 0, 0, 0, null, null, null);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91708);Assert.assertEquals(null, fieldInfo.getAnnotation());

        __CLR4_1_101yre1yreluszwg4u.R.inc(91709);Field field = GenericFieldEntity.class.getField("value");
        __CLR4_1_101yre1yreluszwg4u.R.inc(91710);Type type = new ParameterizedTypeImpl(new Type[] { ValueObject.class }, null, GenericFieldEntity.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91711);FieldInfo fieldInfoOfField = new FieldInfo("value", null, field, GenericFieldEntity.class, type, 0, 0, 0, null, null, null);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91712);Assert.assertEquals(fieldInfoOfField.fieldType, ValueObject.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91713);Assert.assertEquals(fieldInfoOfField.fieldClass, ValueObject.class);

        __CLR4_1_101yre1yreluszwg4u.R.inc(91714);field = GenericListFieldEntity.class.getField("value");
        __CLR4_1_101yre1yreluszwg4u.R.inc(91715);type = new ParameterizedTypeImpl(new Type[] { ValueObject.class }, null, GenericListFieldEntity.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91716);FieldInfo fieldInfoOfListField = new FieldInfo("value", null, field, GenericListFieldEntity.class, type, 0, 0, 0, null, null, null);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91717);ParameterizedTypeImpl actualFieldType = (ParameterizedTypeImpl) fieldInfoOfListField.fieldType;
        __CLR4_1_101yre1yreluszwg4u.R.inc(91718);Assert.assertEquals(actualFieldType.getActualTypeArguments()[0], ValueObject.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91719);Assert.assertEquals(actualFieldType.getRawType(), List.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91720);Assert.assertEquals(fieldInfoOfListField.fieldClass, List.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91721);Assert.assertEquals(null, ((ParameterizedTypeImpl) type).getOwnerType());

        __CLR4_1_101yre1yreluszwg4u.R.inc(91722);Method method = GenericSetterEntity.class.getMethod("setValue", Object.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91723);type = new ParameterizedTypeImpl(new Type[] { ValueObject.class }, null, GenericSetterEntity.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91724);FieldInfo fieldInfoOfSetter = new FieldInfo("value", method, null, GenericSetterEntity.class, type, 0, 0, 0, null, null, null);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91725);Assert.assertEquals(fieldInfoOfSetter.fieldType, ValueObject.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91726);Assert.assertEquals(fieldInfoOfSetter.fieldClass, ValueObject.class);
        
        __CLR4_1_101yre1yreluszwg4u.R.inc(91727);fieldInfoOfSetter.toString();

        __CLR4_1_101yre1yreluszwg4u.R.inc(91728);method = GenericListSetterEntity.class.getMethod("setValue", List.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91729);type = new ParameterizedTypeImpl(new Type[] { ValueObject.class }, null, GenericListSetterEntity.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91730);FieldInfo fieldInfoOfListSetter = new FieldInfo("value", method, null, GenericListSetterEntity.class, type, 0, 0, 0, null, null, null);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91731);Assert.assertEquals(actualFieldType.getActualTypeArguments()[0], ValueObject.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91732);Assert.assertEquals(actualFieldType.getRawType(), List.class);
        __CLR4_1_101yre1yreluszwg4u.R.inc(91733);Assert.assertEquals(fieldInfoOfListSetter.fieldClass, List.class);
    }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}

    public static class Entity {
        private int value;

        public int getValue() {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91734);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91735);return value;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91736);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91737);this.value = value;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}
    }

    public static class GenericSetterEntity<T> {
        private T value;

        public T getValue() {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91738);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91739);return value;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}

        public void setValue(T value) {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91740);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91741);this.value = value;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}
    }

    public static class GenericListSetterEntity<T> {
        private List<T> value;

        public List<T> getValue() {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91742);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91743);return value;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}

        public void setValue(List<T> value) {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91744);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91745);this.value = value;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}
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

        public String getName() {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91746);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91747);return name;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91748);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91749);this.name = name;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91750);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91751);return id;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101yre1yreluszwg4u.R.inc(91752);
            __CLR4_1_101yre1yreluszwg4u.R.inc(91753);this.id = id;
        }finally{__CLR4_1_101yre1yreluszwg4u.R.flushNeeded();}}
    }
}
