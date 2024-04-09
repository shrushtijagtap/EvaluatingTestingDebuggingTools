package com.alibaba.fastjson.parser;

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
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jodaCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) 1.0f, "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer6 = jodaCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) ' ', "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (-1L), beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Object obj3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) jodaCodec2, obj3, (java.lang.reflect.Type) wildcardClass5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer7 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 1L, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) true, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 1.0d, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 100L, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.reflect.Type type4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (-1.0d), obj3, type4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        java.lang.Object obj3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (-1.0d), obj3, (java.lang.reflect.Type) wildcardClass5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) (byte) -1, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer7 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) (-1L), "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable7 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 10.0d, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 1.0f, (java.lang.Object) 10L, (java.lang.reflect.Type) wildcardClass5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass4 = jodaCodec3.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass6 = jodaCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 1.0d, (java.lang.Object) jodaCodec3, (java.lang.reflect.Type) wildcardClass6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 0.0f, (java.lang.Object) (byte) 100, (java.lang.reflect.Type) wildcardClass5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) true, (java.lang.Object) ' ', (java.lang.reflect.Type) wildcardClass5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer6 = jodaCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = jodaCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) false, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer2, (java.lang.Object) 100L, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer3, (java.lang.Object) (byte) -1, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 0.0d, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 10L, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) "", (java.lang.Object) (-1.0d), (java.lang.reflect.Type) wildcardClass5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 100.0f, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) "", (java.lang.Object) 10L, (java.lang.reflect.Type) wildcardClass5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(jodaCodec4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, obj2, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement7 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 1.0d, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) "", beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass4 = jodaCodec3.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass6 = jodaCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 0.0f, (java.lang.Object) wildcardClass4, (java.lang.reflect.Type) wildcardClass6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass6 = jodaCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, obj2, (java.lang.Object) 1.0d, (java.lang.reflect.Type) wildcardClass6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jodaCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer2, (java.lang.Object) (byte) 10, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (short) 1, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass6 = jodaCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer2, (java.lang.Object) jodaCodec3, (java.lang.Object) (byte) 100, (java.lang.reflect.Type) wildcardClass6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jodaCodec3);
        org.junit.Assert.assertNotNull(jodaCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass4 = jodaCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.JodaCodec jodaCodec6 = jodaCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (short) 10, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int3 = jodaCodec2.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) jodaCodec2, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer3, (java.lang.Object) 1L, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer3, (java.lang.Object) 100.0f, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer6 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer7 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass4 = jodaCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable6 = jodaCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jodaCodec4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer9 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 10L, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (short) -1, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer2, (java.lang.Object) 1L, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int4 = jodaCodec3.getFastMatchToken();
        int int5 = jodaCodec3.getFastMatchToken();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec6 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int7 = jodaCodec6.getFastMatchToken();
        int int8 = jodaCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jodaCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (byte) 100, (java.lang.Object) jodaCodec3, (java.lang.reflect.Type) wildcardClass9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int3 = jodaCodec2.getFastMatchToken();
        int int4 = jodaCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.JodaCodec jodaCodec9 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) '#', "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int6 = jodaCodec5.getFastMatchToken();
        int int7 = jodaCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jodaCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer2, (java.lang.Object) (byte) -1, (java.lang.Object) 10.0d, (java.lang.reflect.Type) wildcardClass8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.reflect.Type type4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer8 = jodaCodec0.deserialze(defaultJSONParser3, type4, (java.lang.Object) 10L, "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int3 = jodaCodec2.getFastMatchToken();
        int int4 = jodaCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer9 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (-1.0f), "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec6 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int7 = jodaCodec6.getFastMatchToken();
        int int8 = jodaCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jodaCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer3, (java.lang.Object) 100.0d, (java.lang.Object) 1.0f, (java.lang.reflect.Type) wildcardClass9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (byte) 10, (java.lang.Object) (short) 10, (java.lang.reflect.Type) wildcardClass5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertNotNull(jodaCodec4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass4 = jodaCodec3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration6 = jodaCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable9 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 10, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement6 = jodaCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer3, (java.lang.Object) '#', beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer3, (java.lang.Object) 0.0f, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int6 = jodaCodec5.getFastMatchToken();
        int int7 = jodaCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jodaCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer2, (java.lang.Object) (-1L), obj4, (java.lang.reflect.Type) wildcardClass8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (short) -1, (java.lang.Object) false, (java.lang.reflect.Type) wildcardClass5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int4 = jodaCodec3.getFastMatchToken();
        int int5 = jodaCodec3.getFastMatchToken();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec7 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass8 = jodaCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer2, (java.lang.Object) jodaCodec3, (java.lang.Object) (-1.0d), (java.lang.reflect.Type) wildcardClass8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(jodaCodec7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass5 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration9 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (byte) 0, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int5 = jodaCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass4 = jodaCodec3.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = new com.alibaba.fastjson.serializer.JodaCodec();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = jodaCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) jodaCodec5, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jodaCodec3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (short) 100, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass4 = jodaCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer6 = jodaCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jodaCodec3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass4 = jodaCodec3.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        java.lang.Class<?> wildcardClass6 = jodaCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer9 = jodaCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) jodaCodec5, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jodaCodec3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jodaCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass3 = jodaCodec2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int3 = jodaCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jodaCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec6 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        int int7 = jodaCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jodaCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) jodaCodec6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jodaCodec6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        int int6 = jodaCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jodaCodec5.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec8 = new com.alibaba.fastjson.serializer.JodaCodec();
        java.lang.Class<?> wildcardClass9 = jodaCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer3, (java.lang.Object) true, (java.lang.Object) jodaCodec5, (java.lang.reflect.Type) wildcardClass9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jodaCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec4 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int5 = jodaCodec4.getFastMatchToken();
        int int6 = jodaCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jodaCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) 10.0f, (java.lang.Object) jodaCodec3, (java.lang.reflect.Type) wildcardClass7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        int int1 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int4 = jodaCodec3.getFastMatchToken();
        int int5 = jodaCodec3.getFastMatchToken();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec7 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int8 = jodaCodec7.getFastMatchToken();
        int int9 = jodaCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jodaCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer2, (java.lang.Object) jodaCodec3, (java.lang.Object) (byte) -1, (java.lang.reflect.Type) wildcardClass10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int1 = jodaCodec0.getFastMatchToken();
        int int2 = jodaCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type9 = jodaCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (byte) 10, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        int int3 = jodaCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jodaCodec2.getClass();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jodaCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) jodaCodec5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jodaCodec5);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec2 = new com.alibaba.fastjson.serializer.JodaCodec();
        int int3 = jodaCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jodaCodec2.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) jodaCodec2, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec0 = new com.alibaba.fastjson.serializer.JodaCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec3 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        int int4 = jodaCodec3.getFastMatchToken();
        com.alibaba.fastjson.serializer.JodaCodec jodaCodec5 = com.alibaba.fastjson.serializer.JodaCodec.instance;
        int int6 = jodaCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jodaCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jodaCodec0.write(jSONSerializer1, (java.lang.Object) (short) -1, (java.lang.Object) jodaCodec3, (java.lang.reflect.Type) wildcardClass7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jodaCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jodaCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

