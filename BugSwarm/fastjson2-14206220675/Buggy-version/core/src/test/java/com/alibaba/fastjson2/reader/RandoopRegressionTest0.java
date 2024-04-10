package com.alibaba.fastjson2.reader;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        long long0 = com.alibaba.fastjson2.reader.ObjectReader.HASH_TYPE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 3044221079117626727L + "'", long0 == 3044221079117626727L);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Class class0 = null;
        java.lang.Enum enum1 = null;
        java.lang.Enum[] enumArray2 = new java.lang.Enum[] { enum1 };
        java.lang.Enum[] enumArray3 = new java.lang.Enum[] {};
        long[] longArray4 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4 objectReaderImplEnum2X4_5 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4(class0, enumArray2, enumArray3, longArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumArray2);
        org.junit.Assert.assertNotNull(enumArray3);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Class class0 = null;
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Member member2 = null;
        java.lang.Enum[] enumArray3 = new java.lang.Enum[] {};
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        long[] longArray12 = new long[] { 10L, 100, 0L, '4', (short) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum13 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum(class0, method1, member2, enumArray3, enumArray5, longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumArray3);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 100, 0, 52, 1, 32]");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Class class0 = null;
        java.lang.Enum[] enumArray1 = new java.lang.Enum[] {};
        java.lang.Enum[] enumArray2 = new java.lang.Enum[] {};
        long[] longArray5 = new long[] { 0, 0L };
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4 objectReaderImplEnum2X4_6 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4(class0, enumArray1, enumArray2, longArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumArray1);
        org.junit.Assert.assertNotNull(enumArray2);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 0]");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Enum[] enumArray2 = null;
        java.lang.Enum enum3 = null;
        java.lang.Enum[] enumArray4 = new java.lang.Enum[] { enum3 };
        long[] longArray9 = new long[] { 100L, '4', 10, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4 objectReaderImplEnum2X4_10 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4((java.lang.Class) wildcardClass1, enumArray2, enumArray4, longArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray4);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 52, 10, -1]");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Member member5 = null;
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        java.lang.Enum enum8 = null;
        java.lang.Enum[] enumArray9 = new java.lang.Enum[] { enum8 };
        long[] longArray12 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum13 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass3, method4, member5, enumArray7, enumArray9, longArray12);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Member member29 = null;
        java.lang.Enum enum30 = null;
        java.lang.Enum[] enumArray31 = new java.lang.Enum[] { enum30 };
        java.lang.Enum enum32 = null;
        java.lang.Enum[] enumArray33 = new java.lang.Enum[] { enum32 };
        long[] longArray36 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum37 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass27, method28, member29, enumArray31, enumArray33, longArray36);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Member member39 = null;
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Member member43 = null;
        java.lang.Enum enum44 = null;
        java.lang.Enum[] enumArray45 = new java.lang.Enum[] { enum44 };
        java.lang.Enum enum46 = null;
        java.lang.Enum[] enumArray47 = new java.lang.Enum[] { enum46 };
        long[] longArray50 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum51 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass41, method42, member43, enumArray45, enumArray47, longArray50);
        java.lang.Enum[] enumArray52 = null;
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Member member56 = null;
        java.lang.Enum enum57 = null;
        java.lang.Enum[] enumArray58 = new java.lang.Enum[] { enum57 };
        java.lang.Enum enum59 = null;
        java.lang.Enum[] enumArray60 = new java.lang.Enum[] { enum59 };
        long[] longArray63 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum64 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass54, method55, member56, enumArray58, enumArray60, longArray63);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum65 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass27, method38, member39, enumArray47, enumArray52, longArray63);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4 objectReaderImplEnum2X4_66 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4((java.lang.Class) wildcardClass1, enumArray7, enumArray21, longArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(enumArray9);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(enumArray31);
        org.junit.Assert.assertNotNull(enumArray33);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(enumArray45);
        org.junit.Assert.assertNotNull(enumArray47);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(enumArray58);
        org.junit.Assert.assertNotNull(enumArray60);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[32, 1]");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum13 = objectReaderImplEnum11.of((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.32");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum[] enumArray4 = new java.lang.Enum[] {};
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Member member8 = null;
        java.lang.Enum enum9 = null;
        java.lang.Enum[] enumArray10 = new java.lang.Enum[] { enum9 };
        java.lang.Enum enum11 = null;
        java.lang.Enum[] enumArray12 = new java.lang.Enum[] { enum11 };
        long[] longArray15 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum16 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass6, method7, member8, enumArray10, enumArray12, longArray15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum29 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray4, enumArray12, longArray27);
        com.alibaba.fastjson2.JSONReader jSONReader30 = null;
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Member member34 = null;
        java.lang.Enum[] enumArray35 = new java.lang.Enum[] {};
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Member member39 = null;
        java.lang.Enum enum40 = null;
        java.lang.Enum[] enumArray41 = new java.lang.Enum[] { enum40 };
        java.lang.Enum enum42 = null;
        java.lang.Enum[] enumArray43 = new java.lang.Enum[] { enum42 };
        long[] longArray46 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum47 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass37, method38, member39, enumArray41, enumArray43, longArray46);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Member member51 = null;
        java.lang.Enum enum52 = null;
        java.lang.Enum[] enumArray53 = new java.lang.Enum[] { enum52 };
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        long[] longArray58 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum59 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass49, method50, member51, enumArray53, enumArray55, longArray58);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum60 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass32, method33, member34, enumArray35, enumArray43, longArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = objectReaderImplEnum29.readJSONBObject(jSONReader30, (java.lang.reflect.Type) wildcardClass32, (java.lang.Object) false, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(enumArray10);
        org.junit.Assert.assertNotNull(enumArray12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(enumArray35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(enumArray41);
        org.junit.Assert.assertNotNull(enumArray43);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(enumArray53);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[32, 1]");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByHashCode((long) (short) 1);
        com.alibaba.fastjson2.JSONReader jSONReader42 = null;
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Member member46 = null;
        java.lang.Enum[] enumArray47 = new java.lang.Enum[] {};
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Member member51 = null;
        java.lang.Enum enum52 = null;
        java.lang.Enum[] enumArray53 = new java.lang.Enum[] { enum52 };
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        long[] longArray58 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum59 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass49, method50, member51, enumArray53, enumArray55, longArray58);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        java.lang.reflect.Method method62 = null;
        java.lang.reflect.Member member63 = null;
        java.lang.Enum enum64 = null;
        java.lang.Enum[] enumArray65 = new java.lang.Enum[] { enum64 };
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        long[] longArray70 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum71 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass61, method62, member63, enumArray65, enumArray67, longArray70);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum72 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass44, method45, member46, enumArray47, enumArray55, longArray70);
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj76 = objectReaderImplEnum39.readJSONBObject(jSONReader42, (java.lang.reflect.Type) wildcardClass44, obj73, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNull(enum41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(enumArray47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(enumArray53);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(enumArray65);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum15 = objectReaderImplEnum11.getEnumByOrdinal((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.100");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum15 = objectReaderImplEnum11.of((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.-1");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Enum[] enumArray14 = new java.lang.Enum[] {};
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Member member18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] {};
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Member member23 = null;
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        long[] longArray30 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum31 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass21, method22, member23, enumArray25, enumArray27, longArray30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Member member35 = null;
        java.lang.Enum enum36 = null;
        java.lang.Enum[] enumArray37 = new java.lang.Enum[] { enum36 };
        java.lang.Enum enum38 = null;
        java.lang.Enum[] enumArray39 = new java.lang.Enum[] { enum38 };
        long[] longArray42 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass33, method34, member35, enumArray37, enumArray39, longArray42);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum44 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass16, method17, member18, enumArray19, enumArray27, longArray42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Member member48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] {};
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Member member53 = null;
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        java.lang.Enum enum56 = null;
        java.lang.Enum[] enumArray57 = new java.lang.Enum[] { enum56 };
        long[] longArray60 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum61 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass51, method52, member53, enumArray55, enumArray57, longArray60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Member member65 = null;
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        java.lang.Enum enum68 = null;
        java.lang.Enum[] enumArray69 = new java.lang.Enum[] { enum68 };
        long[] longArray72 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum73 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass63, method64, member65, enumArray67, enumArray69, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum74 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass46, method47, member48, enumArray49, enumArray57, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum75 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray14, enumArray19, longArray72);
        com.alibaba.fastjson2.JSONReader jSONReader76 = null;
        java.lang.reflect.Type type77 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = objectReaderImplEnum75.readJSONBObject(jSONReader76, type77, (java.lang.Object) 10L, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(enumArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(enumArray37);
        org.junit.Assert.assertNotNull(enumArray39);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(enumArray57);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(enumArray69);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[32, 1]");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByOrdinal((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.32");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum[] enumArray13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Member member29 = null;
        java.lang.Enum[] enumArray30 = new java.lang.Enum[] {};
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Member member34 = null;
        java.lang.Enum enum35 = null;
        java.lang.Enum[] enumArray36 = new java.lang.Enum[] { enum35 };
        java.lang.Enum enum37 = null;
        java.lang.Enum[] enumArray38 = new java.lang.Enum[] { enum37 };
        long[] longArray41 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum42 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass32, method33, member34, enumArray36, enumArray38, longArray41);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Member member46 = null;
        java.lang.Enum enum47 = null;
        java.lang.Enum[] enumArray48 = new java.lang.Enum[] { enum47 };
        java.lang.Enum enum49 = null;
        java.lang.Enum[] enumArray50 = new java.lang.Enum[] { enum49 };
        long[] longArray53 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum54 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass44, method45, member46, enumArray48, enumArray50, longArray53);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum55 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass27, method28, member29, enumArray30, enumArray38, longArray53);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4 objectReaderImplEnum2X4_56 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4(class12, enumArray13, enumArray21, longArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(enumArray30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(enumArray36);
        org.junit.Assert.assertNotNull(enumArray38);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(enumArray48);
        org.junit.Assert.assertNotNull(enumArray50);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[32, 1]");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByHashCode((long) (short) 1);
        com.alibaba.fastjson2.JSONReader jSONReader42 = null;
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Member member46 = null;
        java.lang.Enum enum47 = null;
        java.lang.Enum[] enumArray48 = new java.lang.Enum[] { enum47 };
        java.lang.Enum enum49 = null;
        java.lang.Enum[] enumArray50 = new java.lang.Enum[] { enum49 };
        long[] longArray53 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum54 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass44, method45, member46, enumArray48, enumArray50, longArray53);
        java.lang.Class class55 = objectReaderImplEnum54.getObjectClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = objectReaderImplEnum39.readJSONBObject(jSONReader42, (java.lang.reflect.Type) class55, (java.lang.Object) (byte) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNull(enum41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(enumArray48);
        org.junit.Assert.assertNotNull(enumArray50);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[32, 1]");
        org.junit.Assert.assertNotNull(class55);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Enum[] enumArray14 = new java.lang.Enum[] {};
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Member member18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] {};
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Member member23 = null;
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        long[] longArray30 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum31 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass21, method22, member23, enumArray25, enumArray27, longArray30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Member member35 = null;
        java.lang.Enum enum36 = null;
        java.lang.Enum[] enumArray37 = new java.lang.Enum[] { enum36 };
        java.lang.Enum enum38 = null;
        java.lang.Enum[] enumArray39 = new java.lang.Enum[] { enum38 };
        long[] longArray42 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass33, method34, member35, enumArray37, enumArray39, longArray42);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum44 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass16, method17, member18, enumArray19, enumArray27, longArray42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Member member48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] {};
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Member member53 = null;
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        java.lang.Enum enum56 = null;
        java.lang.Enum[] enumArray57 = new java.lang.Enum[] { enum56 };
        long[] longArray60 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum61 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass51, method52, member53, enumArray55, enumArray57, longArray60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Member member65 = null;
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        java.lang.Enum enum68 = null;
        java.lang.Enum[] enumArray69 = new java.lang.Enum[] { enum68 };
        long[] longArray72 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum73 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass63, method64, member65, enumArray67, enumArray69, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum74 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass46, method47, member48, enumArray49, enumArray57, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum75 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray14, enumArray19, longArray72);
        com.alibaba.fastjson2.JSONReader jSONReader76 = null;
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Class<?> wildcardClass78 = obj77.getClass();
        java.lang.reflect.Method method79 = null;
        java.lang.reflect.Member member80 = null;
        java.lang.Enum enum81 = null;
        java.lang.Enum[] enumArray82 = new java.lang.Enum[] { enum81 };
        java.lang.Enum enum83 = null;
        java.lang.Enum[] enumArray84 = new java.lang.Enum[] { enum83 };
        long[] longArray87 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum88 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass78, method79, member80, enumArray82, enumArray84, longArray87);
        java.lang.Class class89 = objectReaderImplEnum88.getObjectClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj92 = objectReaderImplEnum75.readJSONBObject(jSONReader76, (java.lang.reflect.Type) class89, (java.lang.Object) (short) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(enumArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(enumArray37);
        org.junit.Assert.assertNotNull(enumArray39);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(enumArray57);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(enumArray69);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(enumArray82);
        org.junit.Assert.assertNotNull(enumArray84);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[32, 1]");
        org.junit.Assert.assertNotNull(class89);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Enum[] enumArray14 = new java.lang.Enum[] {};
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Member member18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] {};
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Member member23 = null;
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        long[] longArray30 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum31 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass21, method22, member23, enumArray25, enumArray27, longArray30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Member member35 = null;
        java.lang.Enum enum36 = null;
        java.lang.Enum[] enumArray37 = new java.lang.Enum[] { enum36 };
        java.lang.Enum enum38 = null;
        java.lang.Enum[] enumArray39 = new java.lang.Enum[] { enum38 };
        long[] longArray42 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass33, method34, member35, enumArray37, enumArray39, longArray42);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum44 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass16, method17, member18, enumArray19, enumArray27, longArray42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Member member48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] {};
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Member member53 = null;
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        java.lang.Enum enum56 = null;
        java.lang.Enum[] enumArray57 = new java.lang.Enum[] { enum56 };
        long[] longArray60 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum61 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass51, method52, member53, enumArray55, enumArray57, longArray60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Member member65 = null;
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        java.lang.Enum enum68 = null;
        java.lang.Enum[] enumArray69 = new java.lang.Enum[] { enum68 };
        long[] longArray72 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum73 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass63, method64, member65, enumArray67, enumArray69, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum74 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass46, method47, member48, enumArray49, enumArray57, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum75 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray14, enumArray19, longArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum77 = objectReaderImplEnum75.getEnumByOrdinal(1);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.1");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(enumArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(enumArray37);
        org.junit.Assert.assertNotNull(enumArray39);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(enumArray57);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(enumArray69);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[32, 1]");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByHashCode((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum43 = objectReaderImplEnum39.getEnumByOrdinal((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNull(enum41);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum14 = objectReaderImplEnum11.of(0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: None enum ordinal or value 0");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum13 = objectReaderImplEnum11.of(100);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.100");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnumByHashCode((long) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
        org.junit.Assert.assertNull(enum15);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Enum[] enumArray14 = new java.lang.Enum[] {};
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Member member18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] {};
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Member member23 = null;
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        long[] longArray30 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum31 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass21, method22, member23, enumArray25, enumArray27, longArray30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Member member35 = null;
        java.lang.Enum enum36 = null;
        java.lang.Enum[] enumArray37 = new java.lang.Enum[] { enum36 };
        java.lang.Enum enum38 = null;
        java.lang.Enum[] enumArray39 = new java.lang.Enum[] { enum38 };
        long[] longArray42 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass33, method34, member35, enumArray37, enumArray39, longArray42);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum44 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass16, method17, member18, enumArray19, enumArray27, longArray42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Member member48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] {};
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Member member53 = null;
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        java.lang.Enum enum56 = null;
        java.lang.Enum[] enumArray57 = new java.lang.Enum[] { enum56 };
        long[] longArray60 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum61 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass51, method52, member53, enumArray55, enumArray57, longArray60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Member member65 = null;
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        java.lang.Enum enum68 = null;
        java.lang.Enum[] enumArray69 = new java.lang.Enum[] { enum68 };
        long[] longArray72 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum73 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass63, method64, member65, enumArray67, enumArray69, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum74 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass46, method47, member48, enumArray49, enumArray57, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum75 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray14, enumArray19, longArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum77 = objectReaderImplEnum75.getEnumByOrdinal((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.32");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(enumArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(enumArray37);
        org.junit.Assert.assertNotNull(enumArray39);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(enumArray57);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(enumArray69);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[32, 1]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByOrdinal((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Class class13 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnumByHashCode((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum17 = objectReaderImplEnum11.of((int) '#');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.35");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNull(enum15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Class class13 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnumByHashCode((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum17 = objectReaderImplEnum11.getEnumByOrdinal((int) '4');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.52");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNull(enum15);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Class<?> wildcardClass13 = objectReaderImplEnum11.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum[] enumArray18 = new java.lang.Enum[] {};
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Member member22 = null;
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        java.lang.Enum enum25 = null;
        java.lang.Enum[] enumArray26 = new java.lang.Enum[] { enum25 };
        long[] longArray29 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum30 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass20, method21, member22, enumArray24, enumArray26, longArray29);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Member member34 = null;
        java.lang.Enum enum35 = null;
        java.lang.Enum[] enumArray36 = new java.lang.Enum[] { enum35 };
        java.lang.Enum enum37 = null;
        java.lang.Enum[] enumArray38 = new java.lang.Enum[] { enum37 };
        long[] longArray41 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum42 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass32, method33, member34, enumArray36, enumArray38, longArray41);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray18, enumArray26, longArray41);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Member member47 = null;
        java.lang.Enum enum48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] { enum48 };
        java.lang.Enum enum50 = null;
        java.lang.Enum[] enumArray51 = new java.lang.Enum[] { enum50 };
        long[] longArray54 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum55 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass45, method46, member47, enumArray49, enumArray51, longArray54);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Member member59 = null;
        java.lang.Enum enum60 = null;
        java.lang.Enum[] enumArray61 = new java.lang.Enum[] { enum60 };
        java.lang.Enum enum62 = null;
        java.lang.Enum[] enumArray63 = new java.lang.Enum[] { enum62 };
        long[] longArray66 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum67 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass57, method58, member59, enumArray61, enumArray63, longArray66);
        java.lang.reflect.Method method68 = null;
        java.lang.reflect.Member member69 = null;
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        java.lang.reflect.Method method72 = null;
        java.lang.reflect.Member member73 = null;
        java.lang.Enum enum74 = null;
        java.lang.Enum[] enumArray75 = new java.lang.Enum[] { enum74 };
        java.lang.Enum enum76 = null;
        java.lang.Enum[] enumArray77 = new java.lang.Enum[] { enum76 };
        long[] longArray80 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum81 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass71, method72, member73, enumArray75, enumArray77, longArray80);
        java.lang.Enum[] enumArray82 = null;
        java.lang.Object obj83 = new java.lang.Object();
        java.lang.Class<?> wildcardClass84 = obj83.getClass();
        java.lang.reflect.Method method85 = null;
        java.lang.reflect.Member member86 = null;
        java.lang.Enum enum87 = null;
        java.lang.Enum[] enumArray88 = new java.lang.Enum[] { enum87 };
        java.lang.Enum enum89 = null;
        java.lang.Enum[] enumArray90 = new java.lang.Enum[] { enum89 };
        long[] longArray93 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum94 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass84, method85, member86, enumArray88, enumArray90, longArray93);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum95 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass57, method68, member69, enumArray77, enumArray82, longArray93);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4 objectReaderImplEnum2X4_96 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum2X4((java.lang.Class) wildcardClass13, enumArray18, enumArray49, longArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(enumArray26);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(enumArray36);
        org.junit.Assert.assertNotNull(enumArray38);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(enumArray51);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(enumArray61);
        org.junit.Assert.assertNotNull(enumArray63);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(enumArray75);
        org.junit.Assert.assertNotNull(enumArray77);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(enumArray88);
        org.junit.Assert.assertNotNull(enumArray90);
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[32, 1]");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Member member41 = null;
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Member member45 = null;
        java.lang.Enum enum46 = null;
        java.lang.Enum[] enumArray47 = new java.lang.Enum[] { enum46 };
        java.lang.Enum enum48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] { enum48 };
        long[] longArray52 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum53 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass43, method44, member45, enumArray47, enumArray49, longArray52);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Member member57 = null;
        java.lang.Enum[] enumArray58 = new java.lang.Enum[] {};
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Member member62 = null;
        java.lang.Enum enum63 = null;
        java.lang.Enum[] enumArray64 = new java.lang.Enum[] { enum63 };
        java.lang.Enum enum65 = null;
        java.lang.Enum[] enumArray66 = new java.lang.Enum[] { enum65 };
        long[] longArray69 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum70 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass60, method61, member62, enumArray64, enumArray66, longArray69);
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        java.lang.reflect.Method method73 = null;
        java.lang.reflect.Member member74 = null;
        java.lang.Enum enum75 = null;
        java.lang.Enum[] enumArray76 = new java.lang.Enum[] { enum75 };
        java.lang.Enum enum77 = null;
        java.lang.Enum[] enumArray78 = new java.lang.Enum[] { enum77 };
        long[] longArray81 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum82 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass72, method73, member74, enumArray76, enumArray78, longArray81);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum83 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass55, method56, member57, enumArray58, enumArray66, longArray81);
        long[] longArray84 = new long[] {};
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum85 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method40, member41, enumArray47, enumArray58, longArray84);
        java.lang.Class<?> wildcardClass86 = longArray84.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(enumArray47);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(enumArray58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(enumArray64);
        org.junit.Assert.assertNotNull(enumArray66);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(enumArray76);
        org.junit.Assert.assertNotNull(enumArray78);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Class class13 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnumByHashCode((long) (short) 0);
        com.alibaba.fastjson2.JSONReader jSONReader16 = null;
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        java.lang.Class class29 = objectReaderImplEnum28.getObjectClass();
        java.lang.Class<?> wildcardClass30 = objectReaderImplEnum28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = objectReaderImplEnum11.readJSONBObject(jSONReader16, (java.lang.reflect.Type) wildcardClass30, (java.lang.Object) 100.0f, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNull(enum15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum[] enumArray4 = new java.lang.Enum[] {};
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Member member8 = null;
        java.lang.Enum enum9 = null;
        java.lang.Enum[] enumArray10 = new java.lang.Enum[] { enum9 };
        java.lang.Enum enum11 = null;
        java.lang.Enum[] enumArray12 = new java.lang.Enum[] { enum11 };
        long[] longArray15 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum16 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass6, method7, member8, enumArray10, enumArray12, longArray15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum29 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray4, enumArray12, longArray27);
        com.alibaba.fastjson2.JSONReader jSONReader30 = null;
        java.lang.reflect.Type type31 = null;
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Member member35 = null;
        java.lang.Enum[] enumArray36 = new java.lang.Enum[] {};
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Member member40 = null;
        java.lang.Enum enum41 = null;
        java.lang.Enum[] enumArray42 = new java.lang.Enum[] { enum41 };
        java.lang.Enum enum43 = null;
        java.lang.Enum[] enumArray44 = new java.lang.Enum[] { enum43 };
        long[] longArray47 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum48 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass38, method39, member40, enumArray42, enumArray44, longArray47);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Member member52 = null;
        java.lang.Enum enum53 = null;
        java.lang.Enum[] enumArray54 = new java.lang.Enum[] { enum53 };
        java.lang.Enum enum55 = null;
        java.lang.Enum[] enumArray56 = new java.lang.Enum[] { enum55 };
        long[] longArray59 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum60 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass50, method51, member52, enumArray54, enumArray56, longArray59);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum61 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass33, method34, member35, enumArray36, enumArray44, longArray59);
        java.lang.Enum enum63 = objectReaderImplEnum61.getEnumByHashCode((long) (short) 0);
        java.lang.Enum enum65 = objectReaderImplEnum61.getEnumByHashCode((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = objectReaderImplEnum29.readJSONBObject(jSONReader30, type31, (java.lang.Object) enum65, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(enumArray10);
        org.junit.Assert.assertNotNull(enumArray12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(enumArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(enumArray42);
        org.junit.Assert.assertNotNull(enumArray44);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(enumArray54);
        org.junit.Assert.assertNotNull(enumArray56);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[32, 1]");
        org.junit.Assert.assertNull(enum63);
        org.junit.Assert.assertNull(enum65);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByHashCode((long) (byte) 0);
        com.alibaba.fastjson2.JSONReader jSONReader15 = null;
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Member member19 = null;
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        java.lang.Enum enum22 = null;
        java.lang.Enum[] enumArray23 = new java.lang.Enum[] { enum22 };
        long[] longArray26 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum27 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass17, method18, member19, enumArray21, enumArray23, longArray26);
        java.lang.Class class28 = objectReaderImplEnum27.getObjectClass();
        java.lang.Class<?> wildcardClass29 = objectReaderImplEnum27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = objectReaderImplEnum11.readJSONBObject(jSONReader15, (java.lang.reflect.Type) wildcardClass29, (java.lang.Object) 100L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(enum14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(enumArray23);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[32, 1]");
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Enum[] enumArray14 = new java.lang.Enum[] {};
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Member member18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] {};
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Member member23 = null;
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        long[] longArray30 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum31 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass21, method22, member23, enumArray25, enumArray27, longArray30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Member member35 = null;
        java.lang.Enum enum36 = null;
        java.lang.Enum[] enumArray37 = new java.lang.Enum[] { enum36 };
        java.lang.Enum enum38 = null;
        java.lang.Enum[] enumArray39 = new java.lang.Enum[] { enum38 };
        long[] longArray42 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass33, method34, member35, enumArray37, enumArray39, longArray42);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum44 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass16, method17, member18, enumArray19, enumArray27, longArray42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Member member48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] {};
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Member member53 = null;
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        java.lang.Enum enum56 = null;
        java.lang.Enum[] enumArray57 = new java.lang.Enum[] { enum56 };
        long[] longArray60 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum61 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass51, method52, member53, enumArray55, enumArray57, longArray60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Member member65 = null;
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        java.lang.Enum enum68 = null;
        java.lang.Enum[] enumArray69 = new java.lang.Enum[] { enum68 };
        long[] longArray72 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum73 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass63, method64, member65, enumArray67, enumArray69, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum74 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass46, method47, member48, enumArray49, enumArray57, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum75 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray14, enumArray19, longArray72);
        com.alibaba.fastjson2.JSONReader jSONReader76 = null;
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Class<?> wildcardClass78 = obj77.getClass();
        java.lang.reflect.Method method79 = null;
        java.lang.reflect.Member member80 = null;
        java.lang.Enum enum81 = null;
        java.lang.Enum[] enumArray82 = new java.lang.Enum[] { enum81 };
        java.lang.Enum enum83 = null;
        java.lang.Enum[] enumArray84 = new java.lang.Enum[] { enum83 };
        long[] longArray87 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum88 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass78, method79, member80, enumArray82, enumArray84, longArray87);
        java.lang.Class class89 = objectReaderImplEnum88.getObjectClass();
        java.lang.Object obj90 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj92 = objectReaderImplEnum75.readObject(jSONReader76, (java.lang.reflect.Type) class89, obj90, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(enumArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(enumArray37);
        org.junit.Assert.assertNotNull(enumArray39);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(enumArray57);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(enumArray69);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(enumArray82);
        org.junit.Assert.assertNotNull(enumArray84);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[32, 1]");
        org.junit.Assert.assertNotNull(class89);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        com.alibaba.fastjson2.JSONReader jSONReader13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum[] enumArray18 = new java.lang.Enum[] {};
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Member member22 = null;
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        java.lang.Enum enum25 = null;
        java.lang.Enum[] enumArray26 = new java.lang.Enum[] { enum25 };
        long[] longArray29 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum30 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass20, method21, member22, enumArray24, enumArray26, longArray29);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Member member34 = null;
        java.lang.Enum enum35 = null;
        java.lang.Enum[] enumArray36 = new java.lang.Enum[] { enum35 };
        java.lang.Enum enum37 = null;
        java.lang.Enum[] enumArray38 = new java.lang.Enum[] { enum37 };
        long[] longArray41 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum42 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass32, method33, member34, enumArray36, enumArray38, longArray41);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray18, enumArray26, longArray41);
        java.lang.Enum enum45 = objectReaderImplEnum43.getEnumByHashCode((long) (short) 0);
        java.lang.Class class46 = objectReaderImplEnum43.getObjectClass();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Member member50 = null;
        java.lang.Enum enum51 = null;
        java.lang.Enum[] enumArray52 = new java.lang.Enum[] { enum51 };
        java.lang.Enum enum53 = null;
        java.lang.Enum[] enumArray54 = new java.lang.Enum[] { enum53 };
        long[] longArray57 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum58 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass48, method49, member50, enumArray52, enumArray54, longArray57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = objectReaderImplEnum11.readObject(jSONReader13, (java.lang.reflect.Type) class46, (java.lang.Object) enumArray54, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(enumArray26);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(enumArray36);
        org.junit.Assert.assertNotNull(enumArray38);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[32, 1]");
        org.junit.Assert.assertNull(enum45);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(enumArray52);
        org.junit.Assert.assertNotNull(enumArray54);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[32, 1]");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Member member41 = null;
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Member member45 = null;
        java.lang.Enum enum46 = null;
        java.lang.Enum[] enumArray47 = new java.lang.Enum[] { enum46 };
        java.lang.Enum enum48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] { enum48 };
        long[] longArray52 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum53 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass43, method44, member45, enumArray47, enumArray49, longArray52);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Member member57 = null;
        java.lang.Enum[] enumArray58 = new java.lang.Enum[] {};
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Member member62 = null;
        java.lang.Enum enum63 = null;
        java.lang.Enum[] enumArray64 = new java.lang.Enum[] { enum63 };
        java.lang.Enum enum65 = null;
        java.lang.Enum[] enumArray66 = new java.lang.Enum[] { enum65 };
        long[] longArray69 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum70 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass60, method61, member62, enumArray64, enumArray66, longArray69);
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        java.lang.reflect.Method method73 = null;
        java.lang.reflect.Member member74 = null;
        java.lang.Enum enum75 = null;
        java.lang.Enum[] enumArray76 = new java.lang.Enum[] { enum75 };
        java.lang.Enum enum77 = null;
        java.lang.Enum[] enumArray78 = new java.lang.Enum[] { enum77 };
        long[] longArray81 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum82 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass72, method73, member74, enumArray76, enumArray78, longArray81);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum83 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass55, method56, member57, enumArray58, enumArray66, longArray81);
        long[] longArray84 = new long[] {};
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum85 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method40, member41, enumArray47, enumArray58, longArray84);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum87 = objectReaderImplEnum85.of((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.1");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(enumArray47);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(enumArray58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(enumArray64);
        org.junit.Assert.assertNotNull(enumArray66);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(enumArray76);
        org.junit.Assert.assertNotNull(enumArray78);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Class class13 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnumByHashCode((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum17 = objectReaderImplEnum11.getEnumByOrdinal((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.32");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNull(enum15);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum[] enumArray4 = new java.lang.Enum[] {};
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Member member8 = null;
        java.lang.Enum enum9 = null;
        java.lang.Enum[] enumArray10 = new java.lang.Enum[] { enum9 };
        java.lang.Enum enum11 = null;
        java.lang.Enum[] enumArray12 = new java.lang.Enum[] { enum11 };
        long[] longArray15 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum16 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass6, method7, member8, enumArray10, enumArray12, longArray15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum29 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray4, enumArray12, longArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum31 = objectReaderImplEnum29.getEnumByOrdinal((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.32");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(enumArray10);
        org.junit.Assert.assertNotNull(enumArray12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Class<?> wildcardClass40 = objectReaderImplEnum39.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnum("hi!");
        com.alibaba.fastjson2.JSONReader jSONReader16 = null;
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Member member22 = null;
        java.lang.Enum[] enumArray23 = new java.lang.Enum[] {};
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Member member27 = null;
        java.lang.Enum enum28 = null;
        java.lang.Enum[] enumArray29 = new java.lang.Enum[] { enum28 };
        java.lang.Enum enum30 = null;
        java.lang.Enum[] enumArray31 = new java.lang.Enum[] { enum30 };
        long[] longArray34 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum35 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass25, method26, member27, enumArray29, enumArray31, longArray34);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Member member39 = null;
        java.lang.Enum enum40 = null;
        java.lang.Enum[] enumArray41 = new java.lang.Enum[] { enum40 };
        java.lang.Enum enum42 = null;
        java.lang.Enum[] enumArray43 = new java.lang.Enum[] { enum42 };
        long[] longArray46 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum47 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass37, method38, member39, enumArray41, enumArray43, longArray46);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum48 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass20, method21, member22, enumArray23, enumArray31, longArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = objectReaderImplEnum11.readObject(jSONReader16, (java.lang.reflect.Type) wildcardClass18, (java.lang.Object) enumArray23, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
        org.junit.Assert.assertNull(enum15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(enumArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(enumArray29);
        org.junit.Assert.assertNotNull(enumArray31);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(enumArray41);
        org.junit.Assert.assertNotNull(enumArray43);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[32, 1]");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByHashCode((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum16 = objectReaderImplEnum11.of((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: None enum ordinal or value 0");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(enum14);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        com.alibaba.fastjson2.JSONReader jSONReader40 = null;
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Member member44 = null;
        java.lang.Enum enum45 = null;
        java.lang.Enum[] enumArray46 = new java.lang.Enum[] { enum45 };
        java.lang.Enum enum47 = null;
        java.lang.Enum[] enumArray48 = new java.lang.Enum[] { enum47 };
        long[] longArray51 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum52 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass42, method43, member44, enumArray46, enumArray48, longArray51);
        java.lang.reflect.Method method53 = null;
        java.lang.reflect.Member member54 = null;
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Member member58 = null;
        java.lang.Enum enum59 = null;
        java.lang.Enum[] enumArray60 = new java.lang.Enum[] { enum59 };
        java.lang.Enum enum61 = null;
        java.lang.Enum[] enumArray62 = new java.lang.Enum[] { enum61 };
        long[] longArray65 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum66 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass56, method57, member58, enumArray60, enumArray62, longArray65);
        java.lang.Enum[] enumArray67 = null;
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        java.lang.reflect.Method method70 = null;
        java.lang.reflect.Member member71 = null;
        java.lang.Enum enum72 = null;
        java.lang.Enum[] enumArray73 = new java.lang.Enum[] { enum72 };
        java.lang.Enum enum74 = null;
        java.lang.Enum[] enumArray75 = new java.lang.Enum[] { enum74 };
        long[] longArray78 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum79 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass69, method70, member71, enumArray73, enumArray75, longArray78);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum80 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass42, method53, member54, enumArray62, enumArray67, longArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = objectReaderImplEnum39.readJSONBObject(jSONReader40, (java.lang.reflect.Type) wildcardClass42, (java.lang.Object) 10.0f, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(enumArray46);
        org.junit.Assert.assertNotNull(enumArray48);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(enumArray60);
        org.junit.Assert.assertNotNull(enumArray62);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(enumArray73);
        org.junit.Assert.assertNotNull(enumArray75);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[32, 1]");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Enum[] enumArray14 = new java.lang.Enum[] {};
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Member member18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] {};
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Member member23 = null;
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        long[] longArray30 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum31 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass21, method22, member23, enumArray25, enumArray27, longArray30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Member member35 = null;
        java.lang.Enum enum36 = null;
        java.lang.Enum[] enumArray37 = new java.lang.Enum[] { enum36 };
        java.lang.Enum enum38 = null;
        java.lang.Enum[] enumArray39 = new java.lang.Enum[] { enum38 };
        long[] longArray42 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass33, method34, member35, enumArray37, enumArray39, longArray42);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum44 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass16, method17, member18, enumArray19, enumArray27, longArray42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Member member48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] {};
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Member member53 = null;
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        java.lang.Enum enum56 = null;
        java.lang.Enum[] enumArray57 = new java.lang.Enum[] { enum56 };
        long[] longArray60 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum61 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass51, method52, member53, enumArray55, enumArray57, longArray60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Member member65 = null;
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        java.lang.Enum enum68 = null;
        java.lang.Enum[] enumArray69 = new java.lang.Enum[] { enum68 };
        long[] longArray72 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum73 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass63, method64, member65, enumArray67, enumArray69, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum74 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass46, method47, member48, enumArray49, enumArray57, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum75 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray14, enumArray19, longArray72);
        java.lang.Enum enum77 = objectReaderImplEnum75.getEnumByHashCode((long) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(enumArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(enumArray37);
        org.junit.Assert.assertNotNull(enumArray39);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(enumArray57);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(enumArray69);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[32, 1]");
        org.junit.Assert.assertNull(enum77);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByHashCode((long) '4');
        java.lang.Enum enum16 = objectReaderImplEnum11.getEnumByHashCode((long) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(enum14);
        org.junit.Assert.assertNull(enum16);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByHashCode((long) (short) 1);
        java.lang.Class class42 = objectReaderImplEnum39.getObjectClass();
        java.lang.Enum enum44 = objectReaderImplEnum39.getEnum("hi!");
        com.alibaba.fastjson2.JSONReader jSONReader45 = null;
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Member member49 = null;
        java.lang.Enum enum50 = null;
        java.lang.Enum[] enumArray51 = new java.lang.Enum[] { enum50 };
        java.lang.Enum enum52 = null;
        java.lang.Enum[] enumArray53 = new java.lang.Enum[] { enum52 };
        long[] longArray56 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum57 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass47, method48, member49, enumArray51, enumArray53, longArray56);
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Member member59 = null;
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        java.lang.reflect.Method method62 = null;
        java.lang.reflect.Member member63 = null;
        java.lang.Enum enum64 = null;
        java.lang.Enum[] enumArray65 = new java.lang.Enum[] { enum64 };
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        long[] longArray70 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum71 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass61, method62, member63, enumArray65, enumArray67, longArray70);
        java.lang.Enum[] enumArray72 = null;
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        java.lang.reflect.Method method75 = null;
        java.lang.reflect.Member member76 = null;
        java.lang.Enum enum77 = null;
        java.lang.Enum[] enumArray78 = new java.lang.Enum[] { enum77 };
        java.lang.Enum enum79 = null;
        java.lang.Enum[] enumArray80 = new java.lang.Enum[] { enum79 };
        long[] longArray83 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum84 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass74, method75, member76, enumArray78, enumArray80, longArray83);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum85 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass47, method58, member59, enumArray67, enumArray72, longArray83);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = objectReaderImplEnum39.readJSONBObject(jSONReader45, (java.lang.reflect.Type) wildcardClass47, (java.lang.Object) 0.0d, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNull(enum41);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNull(enum44);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(enumArray51);
        org.junit.Assert.assertNotNull(enumArray53);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(enumArray65);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(enumArray78);
        org.junit.Assert.assertNotNull(enumArray80);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[32, 1]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByHashCode((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum43 = objectReaderImplEnum39.of((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNull(enum41);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByHashCode((long) '4');
        java.lang.Enum enum16 = objectReaderImplEnum11.getEnumByHashCode((long) 1);
        java.lang.Enum enum18 = objectReaderImplEnum11.getEnum("hi!");
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(enum14);
        org.junit.Assert.assertNull(enum16);
        org.junit.Assert.assertNull(enum18);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnum("");
        com.alibaba.fastjson2.JSONReader jSONReader16 = null;
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        java.lang.Class<?> wildcardClass29 = enumArray22.getClass();
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = objectReaderImplEnum11.readJSONBObject(jSONReader16, (java.lang.reflect.Type) wildcardClass29, obj30, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
        org.junit.Assert.assertNull(enum15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Class class13 = objectReaderImplEnum11.getObjectClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum15 = objectReaderImplEnum11.of((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: None enum ordinal or value 0");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Class class13 = objectReaderImplEnum11.getObjectClass();
        com.alibaba.fastjson2.JSONReader jSONReader14 = null;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = objectReaderImplEnum11.readJSONBObject(jSONReader14, (java.lang.reflect.Type) wildcardClass16, (java.lang.Object) (byte) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum[] enumArray4 = new java.lang.Enum[] {};
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Member member8 = null;
        java.lang.Enum enum9 = null;
        java.lang.Enum[] enumArray10 = new java.lang.Enum[] { enum9 };
        java.lang.Enum enum11 = null;
        java.lang.Enum[] enumArray12 = new java.lang.Enum[] { enum11 };
        long[] longArray15 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum16 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass6, method7, member8, enumArray10, enumArray12, longArray15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum29 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray4, enumArray12, longArray27);
        java.lang.Class<?> wildcardClass30 = objectReaderImplEnum29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(enumArray10);
        org.junit.Assert.assertNotNull(enumArray12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByHashCode((long) (short) 1);
        java.lang.Class class42 = objectReaderImplEnum39.getObjectClass();
        java.lang.Class class43 = objectReaderImplEnum39.getObjectClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNull(enum41);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(class43);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum[] enumArray4 = new java.lang.Enum[] {};
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Member member8 = null;
        java.lang.Enum enum9 = null;
        java.lang.Enum[] enumArray10 = new java.lang.Enum[] { enum9 };
        java.lang.Enum enum11 = null;
        java.lang.Enum[] enumArray12 = new java.lang.Enum[] { enum11 };
        long[] longArray15 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum16 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass6, method7, member8, enumArray10, enumArray12, longArray15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum29 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray4, enumArray12, longArray27);
        java.lang.Enum enum31 = objectReaderImplEnum29.getEnumByHashCode((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum33 = objectReaderImplEnum29.getEnumByOrdinal((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.100");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(enumArray10);
        org.junit.Assert.assertNotNull(enumArray12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
        org.junit.Assert.assertNull(enum31);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Member member41 = null;
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Member member45 = null;
        java.lang.Enum enum46 = null;
        java.lang.Enum[] enumArray47 = new java.lang.Enum[] { enum46 };
        java.lang.Enum enum48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] { enum48 };
        long[] longArray52 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum53 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass43, method44, member45, enumArray47, enumArray49, longArray52);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Member member57 = null;
        java.lang.Enum[] enumArray58 = new java.lang.Enum[] {};
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Member member62 = null;
        java.lang.Enum enum63 = null;
        java.lang.Enum[] enumArray64 = new java.lang.Enum[] { enum63 };
        java.lang.Enum enum65 = null;
        java.lang.Enum[] enumArray66 = new java.lang.Enum[] { enum65 };
        long[] longArray69 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum70 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass60, method61, member62, enumArray64, enumArray66, longArray69);
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        java.lang.reflect.Method method73 = null;
        java.lang.reflect.Member member74 = null;
        java.lang.Enum enum75 = null;
        java.lang.Enum[] enumArray76 = new java.lang.Enum[] { enum75 };
        java.lang.Enum enum77 = null;
        java.lang.Enum[] enumArray78 = new java.lang.Enum[] { enum77 };
        long[] longArray81 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum82 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass72, method73, member74, enumArray76, enumArray78, longArray81);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum83 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass55, method56, member57, enumArray58, enumArray66, longArray81);
        long[] longArray84 = new long[] {};
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum85 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method40, member41, enumArray47, enumArray58, longArray84);
        java.lang.Class class86 = objectReaderImplEnum85.getObjectClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(enumArray47);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(enumArray58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(enumArray64);
        org.junit.Assert.assertNotNull(enumArray66);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(enumArray76);
        org.junit.Assert.assertNotNull(enumArray78);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
        org.junit.Assert.assertNotNull(class86);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByHashCode((long) (short) 1);
        java.lang.Class class42 = objectReaderImplEnum39.getObjectClass();
        java.lang.Enum enum44 = objectReaderImplEnum39.getEnum("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum46 = objectReaderImplEnum39.of(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNull(enum41);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNull(enum44);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Member member41 = null;
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Member member45 = null;
        java.lang.Enum enum46 = null;
        java.lang.Enum[] enumArray47 = new java.lang.Enum[] { enum46 };
        java.lang.Enum enum48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] { enum48 };
        long[] longArray52 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum53 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass43, method44, member45, enumArray47, enumArray49, longArray52);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Member member57 = null;
        java.lang.Enum[] enumArray58 = new java.lang.Enum[] {};
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Member member62 = null;
        java.lang.Enum enum63 = null;
        java.lang.Enum[] enumArray64 = new java.lang.Enum[] { enum63 };
        java.lang.Enum enum65 = null;
        java.lang.Enum[] enumArray66 = new java.lang.Enum[] { enum65 };
        long[] longArray69 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum70 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass60, method61, member62, enumArray64, enumArray66, longArray69);
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        java.lang.reflect.Method method73 = null;
        java.lang.reflect.Member member74 = null;
        java.lang.Enum enum75 = null;
        java.lang.Enum[] enumArray76 = new java.lang.Enum[] { enum75 };
        java.lang.Enum enum77 = null;
        java.lang.Enum[] enumArray78 = new java.lang.Enum[] { enum77 };
        long[] longArray81 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum82 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass72, method73, member74, enumArray76, enumArray78, longArray81);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum83 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass55, method56, member57, enumArray58, enumArray66, longArray81);
        long[] longArray84 = new long[] {};
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum85 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method40, member41, enumArray47, enumArray58, longArray84);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum87 = objectReaderImplEnum85.of((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.10");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(enumArray47);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(enumArray58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(enumArray64);
        org.junit.Assert.assertNotNull(enumArray66);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(enumArray76);
        org.junit.Assert.assertNotNull(enumArray78);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Enum[] enumArray14 = new java.lang.Enum[] {};
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Member member18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] {};
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Member member23 = null;
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        long[] longArray30 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum31 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass21, method22, member23, enumArray25, enumArray27, longArray30);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Member member35 = null;
        java.lang.Enum enum36 = null;
        java.lang.Enum[] enumArray37 = new java.lang.Enum[] { enum36 };
        java.lang.Enum enum38 = null;
        java.lang.Enum[] enumArray39 = new java.lang.Enum[] { enum38 };
        long[] longArray42 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass33, method34, member35, enumArray37, enumArray39, longArray42);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum44 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass16, method17, member18, enumArray19, enumArray27, longArray42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Member member48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] {};
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Member member53 = null;
        java.lang.Enum enum54 = null;
        java.lang.Enum[] enumArray55 = new java.lang.Enum[] { enum54 };
        java.lang.Enum enum56 = null;
        java.lang.Enum[] enumArray57 = new java.lang.Enum[] { enum56 };
        long[] longArray60 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum61 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass51, method52, member53, enumArray55, enumArray57, longArray60);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Member member65 = null;
        java.lang.Enum enum66 = null;
        java.lang.Enum[] enumArray67 = new java.lang.Enum[] { enum66 };
        java.lang.Enum enum68 = null;
        java.lang.Enum[] enumArray69 = new java.lang.Enum[] { enum68 };
        long[] longArray72 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum73 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass63, method64, member65, enumArray67, enumArray69, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum74 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass46, method47, member48, enumArray49, enumArray57, longArray72);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum75 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray14, enumArray19, longArray72);
        java.lang.Enum enum77 = objectReaderImplEnum75.getEnumByHashCode(1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum79 = objectReaderImplEnum75.getEnumByOrdinal((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.0");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(enumArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(enumArray37);
        org.junit.Assert.assertNotNull(enumArray39);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(enumArray55);
        org.junit.Assert.assertNotNull(enumArray57);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(enumArray69);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[32, 1]");
        org.junit.Assert.assertNull(enum77);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        com.alibaba.fastjson2.JSONReader jSONReader13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Class class26 = objectReaderImplEnum25.getObjectClass();
        java.lang.Class class27 = objectReaderImplEnum25.getObjectClass();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Member member31 = null;
        java.lang.Enum enum32 = null;
        java.lang.Enum[] enumArray33 = new java.lang.Enum[] { enum32 };
        java.lang.Enum enum34 = null;
        java.lang.Enum[] enumArray35 = new java.lang.Enum[] { enum34 };
        long[] longArray38 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass29, method30, member31, enumArray33, enumArray35, longArray38);
        java.lang.Class class40 = objectReaderImplEnum39.getObjectClass();
        java.lang.Class<?> wildcardClass41 = objectReaderImplEnum39.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = objectReaderImplEnum11.readObject(jSONReader13, (java.lang.reflect.Type) class27, (java.lang.Object) wildcardClass41, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(enumArray33);
        org.junit.Assert.assertNotNull(enumArray35);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[32, 1]");
        org.junit.Assert.assertNotNull(class40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByHashCode((long) (byte) 0);
        java.lang.Enum enum16 = objectReaderImplEnum11.getEnum("");
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(enum14);
        org.junit.Assert.assertNull(enum16);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum15 = objectReaderImplEnum11.of((int) '4');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.52");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Enum enum41 = objectReaderImplEnum39.getEnumByHashCode((long) (short) 1);
        java.lang.Class class42 = objectReaderImplEnum39.getObjectClass();
        java.lang.Enum enum44 = objectReaderImplEnum39.getEnum("hi!");
        java.lang.Enum enum46 = objectReaderImplEnum39.getEnumByHashCode((-1L));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNull(enum41);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNull(enum44);
        org.junit.Assert.assertNull(enum46);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        com.alibaba.fastjson2.JSONReader jSONReader14 = null;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = objectReaderImplEnum11.readObject(jSONReader14, (java.lang.reflect.Type) wildcardClass16, (java.lang.Object) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Class class13 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnumByHashCode((long) (short) 0);
        com.alibaba.fastjson2.JSONReader jSONReader16 = null;
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] {};
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Member member25 = null;
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        java.lang.Enum enum28 = null;
        java.lang.Enum[] enumArray29 = new java.lang.Enum[] { enum28 };
        long[] longArray32 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum33 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass23, method24, member25, enumArray27, enumArray29, longArray32);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Member member37 = null;
        java.lang.Enum enum38 = null;
        java.lang.Enum[] enumArray39 = new java.lang.Enum[] { enum38 };
        java.lang.Enum enum40 = null;
        java.lang.Enum[] enumArray41 = new java.lang.Enum[] { enum40 };
        long[] longArray44 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum45 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass35, method36, member37, enumArray39, enumArray41, longArray44);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum46 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray21, enumArray29, longArray44);
        java.lang.Enum enum48 = objectReaderImplEnum46.getEnumByHashCode((long) (short) 0);
        java.lang.Class class49 = objectReaderImplEnum46.getObjectClass();
        java.lang.Object obj50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = objectReaderImplEnum11.readJSONBObject(jSONReader16, (java.lang.reflect.Type) class49, obj50, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNull(enum15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(enumArray29);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(enumArray39);
        org.junit.Assert.assertNotNull(enumArray41);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[32, 1]");
        org.junit.Assert.assertNull(enum48);
        org.junit.Assert.assertNotNull(class49);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Member member31 = null;
        java.lang.Enum enum32 = null;
        java.lang.Enum[] enumArray33 = new java.lang.Enum[] { enum32 };
        java.lang.Enum enum34 = null;
        java.lang.Enum[] enumArray35 = new java.lang.Enum[] { enum34 };
        long[] longArray38 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass29, method30, member31, enumArray33, enumArray35, longArray38);
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Member member41 = null;
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Member member45 = null;
        java.lang.Enum enum46 = null;
        java.lang.Enum[] enumArray47 = new java.lang.Enum[] { enum46 };
        java.lang.Enum enum48 = null;
        java.lang.Enum[] enumArray49 = new java.lang.Enum[] { enum48 };
        long[] longArray52 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum53 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass43, method44, member45, enumArray47, enumArray49, longArray52);
        java.lang.Enum[] enumArray54 = null;
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Member member58 = null;
        java.lang.Enum enum59 = null;
        java.lang.Enum[] enumArray60 = new java.lang.Enum[] { enum59 };
        java.lang.Enum enum61 = null;
        java.lang.Enum[] enumArray62 = new java.lang.Enum[] { enum61 };
        long[] longArray65 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum66 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass56, method57, member58, enumArray60, enumArray62, longArray65);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum67 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass29, method40, member41, enumArray49, enumArray54, longArray65);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum68 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray19, enumArray27, longArray65);
        java.lang.Class<?> wildcardClass69 = enumArray19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(enumArray33);
        org.junit.Assert.assertNotNull(enumArray35);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(enumArray47);
        org.junit.Assert.assertNotNull(enumArray49);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(enumArray60);
        org.junit.Assert.assertNotNull(enumArray62);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnum("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum enum17 = objectReaderImplEnum11.getEnumByOrdinal((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: No enum ordinal java.lang.Object.32");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
        org.junit.Assert.assertNull(enum15);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByHashCode((long) '4');
        java.lang.Enum enum16 = objectReaderImplEnum11.getEnumByHashCode((long) 1);
        com.alibaba.fastjson2.JSONReader jSONReader17 = null;
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Member member21 = null;
        java.lang.Enum enum22 = null;
        java.lang.Enum[] enumArray23 = new java.lang.Enum[] { enum22 };
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        long[] longArray28 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum29 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass19, method20, member21, enumArray23, enumArray25, longArray28);
        java.lang.Class<?> wildcardClass30 = enumArray23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = objectReaderImplEnum11.readObject(jSONReader17, (java.lang.reflect.Type) wildcardClass30, (java.lang.Object) 1.0d, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(enum14);
        org.junit.Assert.assertNull(enum16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(enumArray23);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Enum enum13 = objectReaderImplEnum11.getEnum("hi!");
        java.lang.Enum enum15 = objectReaderImplEnum11.getEnum("hi!");
        com.alibaba.fastjson2.JSONReader jSONReader16 = null;
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        java.lang.Class<?> wildcardClass29 = enumArray22.getClass();
        java.lang.Object obj30 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = objectReaderImplEnum11.readObject(jSONReader16, (java.lang.reflect.Type) wildcardClass29, obj30, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNull(enum13);
        org.junit.Assert.assertNull(enum15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByHashCode((long) '4');
        java.lang.Enum enum16 = objectReaderImplEnum11.getEnumByHashCode((long) 1);
        java.lang.Enum enum18 = objectReaderImplEnum11.getEnumByHashCode((long) '#');
        com.alibaba.fastjson2.JSONReader jSONReader19 = null;
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Member member23 = null;
        java.lang.Enum enum24 = null;
        java.lang.Enum[] enumArray25 = new java.lang.Enum[] { enum24 };
        java.lang.Enum enum26 = null;
        java.lang.Enum[] enumArray27 = new java.lang.Enum[] { enum26 };
        long[] longArray30 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum31 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass21, method22, member23, enumArray25, enumArray27, longArray30);
        java.lang.Class class32 = objectReaderImplEnum31.getObjectClass();
        java.lang.Class<?> wildcardClass33 = objectReaderImplEnum31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = objectReaderImplEnum11.readJSONBObject(jSONReader19, (java.lang.reflect.Type) wildcardClass33, (java.lang.Object) (-1L), (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(enum14);
        org.junit.Assert.assertNull(enum16);
        org.junit.Assert.assertNull(enum18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(enumArray25);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[32, 1]");
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Member member29 = null;
        java.lang.Enum[] enumArray30 = new java.lang.Enum[] {};
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Member member34 = null;
        java.lang.Enum enum35 = null;
        java.lang.Enum[] enumArray36 = new java.lang.Enum[] { enum35 };
        java.lang.Enum enum37 = null;
        java.lang.Enum[] enumArray38 = new java.lang.Enum[] { enum37 };
        long[] longArray41 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum42 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass32, method33, member34, enumArray36, enumArray38, longArray41);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Member member46 = null;
        java.lang.Enum enum47 = null;
        java.lang.Enum[] enumArray48 = new java.lang.Enum[] { enum47 };
        java.lang.Enum enum49 = null;
        java.lang.Enum[] enumArray50 = new java.lang.Enum[] { enum49 };
        long[] longArray53 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum54 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass44, method45, member46, enumArray48, enumArray50, longArray53);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum55 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass27, method28, member29, enumArray30, enumArray38, longArray53);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Member member59 = null;
        java.lang.Enum enum60 = null;
        java.lang.Enum[] enumArray61 = new java.lang.Enum[] { enum60 };
        java.lang.Enum enum62 = null;
        java.lang.Enum[] enumArray63 = new java.lang.Enum[] { enum62 };
        long[] longArray66 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum67 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass57, method58, member59, enumArray61, enumArray63, longArray66);
        java.lang.reflect.Method method68 = null;
        java.lang.reflect.Member member69 = null;
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        java.lang.reflect.Method method72 = null;
        java.lang.reflect.Member member73 = null;
        java.lang.Enum enum74 = null;
        java.lang.Enum[] enumArray75 = new java.lang.Enum[] { enum74 };
        java.lang.Enum enum76 = null;
        java.lang.Enum[] enumArray77 = new java.lang.Enum[] { enum76 };
        long[] longArray80 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum81 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass71, method72, member73, enumArray75, enumArray77, longArray80);
        java.lang.Enum[] enumArray82 = null;
        java.lang.Object obj83 = new java.lang.Object();
        java.lang.Class<?> wildcardClass84 = obj83.getClass();
        java.lang.reflect.Method method85 = null;
        java.lang.reflect.Member member86 = null;
        java.lang.Enum enum87 = null;
        java.lang.Enum[] enumArray88 = new java.lang.Enum[] { enum87 };
        java.lang.Enum enum89 = null;
        java.lang.Enum[] enumArray90 = new java.lang.Enum[] { enum89 };
        long[] longArray93 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum94 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass84, method85, member86, enumArray88, enumArray90, longArray93);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum95 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass57, method68, member69, enumArray77, enumArray82, longArray93);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum96 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray38, longArray93);
        java.lang.Class class97 = objectReaderImplEnum96.getObjectClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(enumArray30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(enumArray36);
        org.junit.Assert.assertNotNull(enumArray38);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(enumArray48);
        org.junit.Assert.assertNotNull(enumArray50);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(enumArray61);
        org.junit.Assert.assertNotNull(enumArray63);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(enumArray75);
        org.junit.Assert.assertNotNull(enumArray77);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(enumArray88);
        org.junit.Assert.assertNotNull(enumArray90);
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[32, 1]");
        org.junit.Assert.assertNotNull(class97);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum[] enumArray4 = new java.lang.Enum[] {};
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Member member8 = null;
        java.lang.Enum enum9 = null;
        java.lang.Enum[] enumArray10 = new java.lang.Enum[] { enum9 };
        java.lang.Enum enum11 = null;
        java.lang.Enum[] enumArray12 = new java.lang.Enum[] { enum11 };
        long[] longArray15 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum16 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass6, method7, member8, enumArray10, enumArray12, longArray15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Member member20 = null;
        java.lang.Enum enum21 = null;
        java.lang.Enum[] enumArray22 = new java.lang.Enum[] { enum21 };
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        long[] longArray27 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum28 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass18, method19, member20, enumArray22, enumArray24, longArray27);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum29 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray4, enumArray12, longArray27);
        java.lang.Enum enum31 = objectReaderImplEnum29.getEnumByHashCode((long) (short) 0);
        java.lang.Enum enum33 = objectReaderImplEnum29.getEnumByHashCode((long) (byte) 100);
        java.lang.Enum enum35 = objectReaderImplEnum29.getEnum("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass36 = enum35.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(enumArray10);
        org.junit.Assert.assertNotNull(enumArray12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(enumArray22);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32, 1]");
        org.junit.Assert.assertNull(enum31);
        org.junit.Assert.assertNull(enum33);
        org.junit.Assert.assertNull(enum35);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        com.alibaba.fastjson2.JSONReader jSONReader13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum[] enumArray18 = new java.lang.Enum[] {};
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Member member22 = null;
        java.lang.Enum enum23 = null;
        java.lang.Enum[] enumArray24 = new java.lang.Enum[] { enum23 };
        java.lang.Enum enum25 = null;
        java.lang.Enum[] enumArray26 = new java.lang.Enum[] { enum25 };
        long[] longArray29 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum30 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass20, method21, member22, enumArray24, enumArray26, longArray29);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Member member34 = null;
        java.lang.Enum enum35 = null;
        java.lang.Enum[] enumArray36 = new java.lang.Enum[] { enum35 };
        java.lang.Enum enum37 = null;
        java.lang.Enum[] enumArray38 = new java.lang.Enum[] { enum37 };
        long[] longArray41 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum42 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass32, method33, member34, enumArray36, enumArray38, longArray41);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum43 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray18, enumArray26, longArray41);
        java.lang.Enum enum45 = objectReaderImplEnum43.getEnumByHashCode((long) (short) 0);
        java.lang.Class class46 = objectReaderImplEnum43.getObjectClass();
        java.lang.Class<?> wildcardClass47 = objectReaderImplEnum43.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Member member51 = null;
        java.lang.Enum[] enumArray52 = new java.lang.Enum[] {};
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Member member56 = null;
        java.lang.Enum enum57 = null;
        java.lang.Enum[] enumArray58 = new java.lang.Enum[] { enum57 };
        java.lang.Enum enum59 = null;
        java.lang.Enum[] enumArray60 = new java.lang.Enum[] { enum59 };
        long[] longArray63 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum64 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass54, method55, member56, enumArray58, enumArray60, longArray63);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Member member68 = null;
        java.lang.Enum enum69 = null;
        java.lang.Enum[] enumArray70 = new java.lang.Enum[] { enum69 };
        java.lang.Enum enum71 = null;
        java.lang.Enum[] enumArray72 = new java.lang.Enum[] { enum71 };
        long[] longArray75 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum76 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass66, method67, member68, enumArray70, enumArray72, longArray75);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum77 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass49, method50, member51, enumArray52, enumArray60, longArray75);
        java.lang.Class class78 = objectReaderImplEnum77.getObjectClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = objectReaderImplEnum11.readObject(jSONReader13, (java.lang.reflect.Type) wildcardClass47, (java.lang.Object) objectReaderImplEnum77, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(enumArray24);
        org.junit.Assert.assertNotNull(enumArray26);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(enumArray36);
        org.junit.Assert.assertNotNull(enumArray38);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[32, 1]");
        org.junit.Assert.assertNull(enum45);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(enumArray52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(enumArray58);
        org.junit.Assert.assertNotNull(enumArray60);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(enumArray70);
        org.junit.Assert.assertNotNull(enumArray72);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[32, 1]");
        org.junit.Assert.assertNotNull(class78);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Member member13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Member member17 = null;
        java.lang.Enum enum18 = null;
        java.lang.Enum[] enumArray19 = new java.lang.Enum[] { enum18 };
        java.lang.Enum enum20 = null;
        java.lang.Enum[] enumArray21 = new java.lang.Enum[] { enum20 };
        long[] longArray24 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum25 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass15, method16, member17, enumArray19, enumArray21, longArray24);
        java.lang.Enum[] enumArray26 = null;
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Member member30 = null;
        java.lang.Enum enum31 = null;
        java.lang.Enum[] enumArray32 = new java.lang.Enum[] { enum31 };
        java.lang.Enum enum33 = null;
        java.lang.Enum[] enumArray34 = new java.lang.Enum[] { enum33 };
        long[] longArray37 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum38 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass28, method29, member30, enumArray32, enumArray34, longArray37);
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum39 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method12, member13, enumArray21, enumArray26, longArray37);
        java.lang.Class class40 = objectReaderImplEnum39.getObjectClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(enumArray21);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(enumArray32);
        org.junit.Assert.assertNotNull(enumArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[32, 1]");
        org.junit.Assert.assertNotNull(class40);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Member member3 = null;
        java.lang.Enum enum4 = null;
        java.lang.Enum[] enumArray5 = new java.lang.Enum[] { enum4 };
        java.lang.Enum enum6 = null;
        java.lang.Enum[] enumArray7 = new java.lang.Enum[] { enum6 };
        long[] longArray10 = new long[] { ' ', (short) 1 };
        com.alibaba.fastjson2.reader.ObjectReaderImplEnum objectReaderImplEnum11 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum((java.lang.Class) wildcardClass1, method2, member3, enumArray5, enumArray7, longArray10);
        java.lang.Class class12 = objectReaderImplEnum11.getObjectClass();
        java.lang.Enum enum14 = objectReaderImplEnum11.getEnumByHashCode((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = enum14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(enumArray5);
        org.junit.Assert.assertNotNull(enumArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(enum14);
    }
}

