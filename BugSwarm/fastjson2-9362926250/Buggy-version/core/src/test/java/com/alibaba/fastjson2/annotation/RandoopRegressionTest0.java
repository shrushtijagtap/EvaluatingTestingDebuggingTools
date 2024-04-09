package com.alibaba.fastjson2.annotation;
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
        boolean boolean1 = com.alibaba.fastjson2.JSON.isValid("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        char[] charArray1 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject2 = com.alibaba.fastjson2.JSON.parseObject(charArray1);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: illegal input? offset 1, char 4");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[4]");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONArray jSONArray3 = com.alibaba.fastjson2.JSON.parseArray(byteArray2);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: malformed input around byte 0");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str1 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        char[] charArray6 = new char[] { '#', '4', '#', 'a', '4', '#' };
        java.lang.reflect.Type type9 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray10 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = com.alibaba.fastjson2.JSON.parseObject(charArray6, 1, 1, type9, featureArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#4#a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#4#a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, 4, #, a, 4, #]");
        org.junit.Assert.assertNotNull(featureArray10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        char[] charArray3 = new char[] { '4', '#', '#' };
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray4 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.alibaba.fastjson2.JSON.parse(charArray3, featureArray4);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: input not end, offset 2, character #, line 1, column 3, fastjson-version 2.0.19 4##");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, #]");
        org.junit.Assert.assertNotNull(featureArray4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        java.lang.reflect.Type type7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.alibaba.fastjson2.JSON.parseObject(byteArray6, type7);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: malformed input around byte 2");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, 1, 1, -1]");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.alibaba.fastjson2.TypeReference typeReference1 = null;
        com.alibaba.fastjson2.filter.Filter filter2 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray3 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable4 = com.alibaba.fastjson2.JSON.parseObject("hi!", typeReference1, filter2, featureArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = null;
        com.alibaba.fastjson2.JSONWriter.Context context1 = null;
        java.lang.String str2 = com.alibaba.fastjson2.JSON.toJSONString(obj0, context1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object obj1 = com.alibaba.fastjson2.JSON.toJSON((java.lang.Object) (short) -1);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (-1) + "'", obj1, (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str1 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 10 };
        java.nio.charset.Charset charset5 = null;
        boolean boolean6 = com.alibaba.fastjson2.JSON.isValid(byteArray2, (int) '4', (int) (byte) 0, charset5);
        java.lang.reflect.Type type7 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<char[]> charArrayList9 = com.alibaba.fastjson2.JSON.parseArray(byteArray2, type7, featureArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj1 = com.alibaba.fastjson2.JSON.parse("");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSON.config(feature0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.alibaba.fastjson2.modules.ObjectWriterModule objectWriterModule0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.alibaba.fastjson2.JSON.register(objectWriterModule0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Class class0 = null;
        java.util.function.Function function2 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter3 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function2);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSON.register(class0, (com.alibaba.fastjson2.filter.Filter) valueFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueFilter3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 10 };
        java.nio.charset.Charset charset5 = null;
        boolean boolean6 = com.alibaba.fastjson2.JSON.isValid(byteArray2, (int) '4', (int) (byte) 0, charset5);
        java.lang.reflect.Type type7 = null;
        com.alibaba.fastjson2.JSONReader.Feature feature9 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray10 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature9 };
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = com.alibaba.fastjson2.JSON.parseObject(byteArray2, type7, "null", featureArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(featureArray10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = null;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 0L, featureArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.alibaba.fastjson2.JSONReader.Feature feature1 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature1 };
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject3 = com.alibaba.fastjson2.JSON.parseObject("100", featureArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 10 };
        java.nio.charset.Charset charset5 = null;
        boolean boolean6 = com.alibaba.fastjson2.JSON.isValid(byteArray2, (int) '4', (int) (byte) 0, charset5);
        java.lang.reflect.Type type7 = null;
        com.alibaba.fastjson2.JSONReader.Feature feature8 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray9 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature8 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList10 = com.alibaba.fastjson2.JSON.parseArray(byteArray2, type7, featureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(featureArray9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.function.Function function1 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter2 = com.alibaba.fastjson2.filter.ValueFilter.of("", function1);
        char[] charArray3 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray4 = com.alibaba.fastjson2.JSON.parseArray(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = valueFilter2.apply((java.lang.Object) charArray3, "", (java.lang.Object) "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueFilter2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNull(jSONArray4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.function.Predicate<java.lang.String> strPredicate0 = null;
        java.util.function.Function function1 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter2 = com.alibaba.fastjson2.filter.ValueFilter.of(strPredicate0, function1);
        org.junit.Assert.assertNotNull(valueFilter2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        java.lang.reflect.Type type7 = null;
        com.alibaba.fastjson2.JSONReader.Feature feature8 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray9 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = com.alibaba.fastjson2.JSON.parseObject(byteArray4, (int) (byte) 100, 100, type7, featureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 1, 100]");
        org.junit.Assert.assertNotNull(featureArray9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        char[] charArray0 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray1 = com.alibaba.fastjson2.JSON.parseArray(charArray0);
        com.alibaba.fastjson2.JSONReader.Feature feature4 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature4 };
        com.alibaba.fastjson2.JSONObject jSONObject6 = com.alibaba.fastjson2.JSON.parseObject(charArray0, 100, (int) (byte) -1, featureArray5);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray7 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray7);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONReader.Feature[] featureArray9 = com.alibaba.fastjson2.JSON.copy(featureArray5, featureArray7);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: string value not support input NULL -81 offset 46/46");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(jSONArray1);
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertNull(jSONObject6);
        org.junit.Assert.assertNotNull(featureArray7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.reflect.Type type1 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList3 = com.alibaba.fastjson2.JSON.parseArray("100", type1, featureArray2);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: syntax error : 1");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.reflect.Type type1 = null;
        java.util.function.Function function4 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter5 = com.alibaba.fastjson2.filter.ValueFilter.of("", function4);
        java.util.function.Function function7 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter8 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function7);
        java.util.function.Function function10 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter11 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function10);
        java.util.function.Function function13 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter14 = com.alibaba.fastjson2.filter.ValueFilter.of("", function13);
        java.util.function.Predicate<java.lang.String> strPredicate15 = null;
        java.util.function.Function function16 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter17 = com.alibaba.fastjson2.filter.ValueFilter.of(strPredicate15, function16);
        java.util.function.Function function19 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter20 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function19);
        com.alibaba.fastjson2.filter.Filter[] filterArray21 = new com.alibaba.fastjson2.filter.Filter[] { valueFilter5, valueFilter8, valueFilter11, valueFilter14, valueFilter17, valueFilter20 };
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray22 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.filter.ValueFilter valueFilter23 = com.alibaba.fastjson2.JSON.parseObject("hi!", type1, "", filterArray21, featureArray22);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: offset 1, character h, line 1, column 2, fastjson-version 2.0.19 hi!");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueFilter5);
        org.junit.Assert.assertNotNull(valueFilter8);
        org.junit.Assert.assertNotNull(valueFilter11);
        org.junit.Assert.assertNotNull(valueFilter14);
        org.junit.Assert.assertNotNull(valueFilter17);
        org.junit.Assert.assertNotNull(valueFilter20);
        org.junit.Assert.assertNotNull(filterArray21);
        org.junit.Assert.assertNotNull(featureArray22);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        char[] charArray5 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray6 = com.alibaba.fastjson2.JSON.parseArray(charArray5);
        com.alibaba.fastjson2.JSONReader.Feature feature9 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray10 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature9 };
        com.alibaba.fastjson2.JSONObject jSONObject11 = com.alibaba.fastjson2.JSON.parseObject(charArray5, 100, (int) (byte) -1, featureArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.alibaba.fastjson2.JSON.parse(byteArray4, featureArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 10, 0]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNull(jSONArray6);
        org.junit.Assert.assertNotNull(featureArray10);
        org.junit.Assert.assertNull(jSONObject11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 10 };
        java.nio.charset.Charset charset5 = null;
        boolean boolean6 = com.alibaba.fastjson2.JSON.isValid(byteArray2, (int) '4', (int) (byte) 0, charset5);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONArray jSONArray7 = com.alibaba.fastjson2.JSON.parseArray(byteArray2);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: illegal input, offset 1, char d");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.reflect.Type type1 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = com.alibaba.fastjson2.JSON.parseObject("1", type1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to [C");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.alibaba.fastjson2.JSON.isEnabled(feature0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        java.nio.charset.Charset charset5 = null;
        char[] charArray6 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray7 = com.alibaba.fastjson2.JSON.parseArray(charArray6);
        com.alibaba.fastjson2.JSONReader.Feature feature10 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray11 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature10 };
        com.alibaba.fastjson2.JSONObject jSONObject12 = com.alibaba.fastjson2.JSON.parseObject(charArray6, 100, (int) (byte) -1, featureArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject13 = com.alibaba.fastjson2.JSON.parseObject(byteArray2, (int) (short) 100, 1, charset5, featureArray11);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: not support charset null");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNull(jSONArray7);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNull(jSONObject12);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.io.OutputStream outputStream0 = null;
        java.util.function.Function function4 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter5 = com.alibaba.fastjson2.filter.ValueFilter.of("", function4);
        java.util.function.Predicate<java.lang.String> strPredicate6 = null;
        java.util.function.Function function7 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter8 = com.alibaba.fastjson2.filter.ValueFilter.of(strPredicate6, function7);
        java.util.function.Predicate<java.lang.String> strPredicate9 = null;
        java.util.function.Function function10 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter11 = com.alibaba.fastjson2.filter.ValueFilter.of(strPredicate9, function10);
        java.util.function.Function function13 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter14 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function13);
        java.util.function.Predicate<java.lang.String> strPredicate15 = null;
        java.util.function.Function function16 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter17 = com.alibaba.fastjson2.filter.ValueFilter.of(strPredicate15, function16);
        com.alibaba.fastjson2.filter.Filter[] filterArray18 = new com.alibaba.fastjson2.filter.Filter[] { valueFilter5, valueFilter8, valueFilter11, valueFilter14, valueFilter17 };
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray20 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str21 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.alibaba.fastjson2.JSON.writeTo(outputStream0, (java.lang.Object) (byte) 10, "", filterArray18, featureArray20);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: JSON#writeTo cannot serialize '10' to 'OutputStream'");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueFilter5);
        org.junit.Assert.assertNotNull(valueFilter8);
        org.junit.Assert.assertNotNull(valueFilter11);
        org.junit.Assert.assertNotNull(valueFilter14);
        org.junit.Assert.assertNotNull(valueFilter17);
        org.junit.Assert.assertNotNull(filterArray18);
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0" + "'", str21, "1.0");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.net.URL uRL0 = null;
        com.alibaba.fastjson2.JSONObject jSONObject1 = com.alibaba.fastjson2.JSON.parseObject(uRL0);
        org.junit.Assert.assertNull(jSONObject1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.reflect.Type type1 = null;
        byte[] byteArray2 = new byte[] {};
        boolean boolean3 = com.alibaba.fastjson2.JSON.isValidArray(byteArray2);
        char[] charArray4 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray5 = com.alibaba.fastjson2.JSON.parseArray(charArray4);
        com.alibaba.fastjson2.JSONReader.Feature feature8 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray9 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature8 };
        com.alibaba.fastjson2.JSONObject jSONObject10 = com.alibaba.fastjson2.JSON.parseObject(charArray4, 100, (int) (byte) -1, featureArray9);
        com.alibaba.fastjson2.JSONObject jSONObject11 = com.alibaba.fastjson2.JSON.parseObject(byteArray2, featureArray9);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = com.alibaba.fastjson2.JSON.parseObject("null", type1, featureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNull(jSONArray5);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNull(jSONObject10);
        org.junit.Assert.assertNull(jSONObject11);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.String str0 = com.alibaba.fastjson2.JSON.VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "2.0.19" + "'", str0, "2.0.19");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.reflect.Type type1 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray2);
        java.util.List<char[]> charArrayList4 = com.alibaba.fastjson2.JSON.parseArray("", type1, featureArray2);
        com.alibaba.fastjson2.JSONWriter.Context context5 = null;
        java.lang.String str6 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) charArrayList4, context5);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNull(charArrayList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.alibaba.fastjson2.JSONWriter.Context context1 = null;
        java.lang.String str2 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, context1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0" + "'", str2, "1.0");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        char[] charArray0 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray1 = com.alibaba.fastjson2.JSON.parseArray(charArray0);
        com.alibaba.fastjson2.JSONReader.Feature feature4 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature4 };
        com.alibaba.fastjson2.JSONObject jSONObject6 = com.alibaba.fastjson2.JSON.parseObject(charArray0, 100, (int) (byte) -1, featureArray5);
        com.alibaba.fastjson2.JSONObject jSONObject7 = com.alibaba.fastjson2.JSON.parseObject(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(jSONArray1);
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertNull(jSONObject6);
        org.junit.Assert.assertNull(jSONObject7);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.alibaba.fastjson2.JSONReader.Feature feature0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSON.config(feature0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.reflect.Type type1 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = com.alibaba.fastjson2.JSON.parseObject("[]", type1, featureArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast com.alibaba.fastjson2.JSONArray to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray2);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.reflect.Type type1 = null;
        java.util.function.Function function3 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter4 = com.alibaba.fastjson2.filter.ValueFilter.of("2.0.19", function3);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray5);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray8 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str9 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray8);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray10 = com.alibaba.fastjson2.JSON.copy(featureArray5, featureArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONWriter.Feature[] featureArray11 = com.alibaba.fastjson2.JSON.parseObject("1", type1, (com.alibaba.fastjson2.filter.Filter) valueFilter4, featureArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.Integer to [Lcom.alibaba.fastjson2.JSONWriter$Feature;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueFilter4);
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0" + "'", str9, "1.0");
        org.junit.Assert.assertNotNull(featureArray10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.util.function.Function function2 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter3 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function2);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray4 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str5 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) true, (com.alibaba.fastjson2.filter.Filter) valueFilter3, featureArray4);
        org.junit.Assert.assertNotNull(valueFilter3);
        org.junit.Assert.assertNotNull(featureArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "true" + "'", str5, "true");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = com.alibaba.fastjson2.JSON.isValidArray(byteArray0);
        java.lang.reflect.Type type2 = null;
        java.io.Serializable serializable3 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, type2);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(serializable3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        char[] charArray0 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray1 = com.alibaba.fastjson2.JSON.parseArray(charArray0);
        boolean boolean2 = com.alibaba.fastjson2.JSON.isValid(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(jSONArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.function.Function function1 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter2 = com.alibaba.fastjson2.filter.ValueFilter.of("", function1);
        java.util.function.Function function4 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter5 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function4);
        com.alibaba.fastjson2.filter.ValueFilter valueFilter6 = com.alibaba.fastjson2.filter.ValueFilter.compose(valueFilter2, valueFilter5);
        byte[] byteArray7 = new byte[] {};
        boolean boolean8 = com.alibaba.fastjson2.JSON.isValidArray(byteArray7);
        char[] charArray9 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray10 = com.alibaba.fastjson2.JSON.parseArray(charArray9);
        com.alibaba.fastjson2.JSONReader.Feature feature13 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray14 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature13 };
        com.alibaba.fastjson2.JSONObject jSONObject15 = com.alibaba.fastjson2.JSON.parseObject(charArray9, 100, (int) (byte) -1, featureArray14);
        com.alibaba.fastjson2.JSONObject jSONObject16 = com.alibaba.fastjson2.JSON.parseObject(byteArray7, featureArray14);
        java.lang.reflect.Type type17 = null;
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = null;
        java.util.function.Predicate<java.lang.String> strPredicate21 = null;
        java.util.function.Function function22 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter23 = com.alibaba.fastjson2.filter.ValueFilter.of(strPredicate21, function22);
        java.util.function.Function function25 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter26 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function25);
        com.alibaba.fastjson2.filter.Filter[] filterArray27 = new com.alibaba.fastjson2.filter.Filter[] { valueFilter23, valueFilter26 };
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray28 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray28);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray31 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str32 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray31);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray33 = com.alibaba.fastjson2.JSON.copy(featureArray28, featureArray31);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray36 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str37 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray36);
        java.lang.String str38 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) featureArray33, "1", featureArray36);
        java.lang.String str39 = com.alibaba.fastjson2.JSON.toJSONString(obj20, filterArray27, featureArray36);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray40 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray40);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray43 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str44 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray43);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray45 = com.alibaba.fastjson2.JSON.copy(featureArray40, featureArray43);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray48 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str49 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray48);
        java.lang.String str50 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) featureArray45, "1", featureArray48);
        java.lang.String str51 = com.alibaba.fastjson2.JSON.toJSONString(obj19, filterArray27, featureArray48);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray52 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray52);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray55 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str56 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray55);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray57 = com.alibaba.fastjson2.JSON.copy(featureArray52, featureArray55);
        java.io.Serializable serializable58 = com.alibaba.fastjson2.JSON.parseObject(byteArray7, type17, "1", filterArray27, featureArray57);
        byte[] byteArray60 = new byte[] {};
        boolean boolean61 = com.alibaba.fastjson2.JSON.isValidArray(byteArray60);
        com.alibaba.fastjson2.JSONArray jSONArray62 = com.alibaba.fastjson2.JSON.parseArray(byteArray60);
        java.lang.reflect.Type type63 = null;
        byte[] byteArray65 = new byte[] {};
        boolean boolean66 = com.alibaba.fastjson2.JSON.isValidArray(byteArray65);
        char[] charArray67 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray68 = com.alibaba.fastjson2.JSON.parseArray(charArray67);
        com.alibaba.fastjson2.JSONReader.Feature feature71 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray72 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature71 };
        com.alibaba.fastjson2.JSONObject jSONObject73 = com.alibaba.fastjson2.JSON.parseObject(charArray67, 100, (int) (byte) -1, featureArray72);
        com.alibaba.fastjson2.JSONObject jSONObject74 = com.alibaba.fastjson2.JSON.parseObject(byteArray65, featureArray72);
        byte[] byteArray75 = com.alibaba.fastjson2.JSON.parseObject(byteArray60, type63, "[]", featureArray72);
        java.lang.Object obj76 = valueFilter6.apply((java.lang.Object) byteArray7, "1", (java.lang.Object) featureArray72);
        org.junit.Assert.assertNotNull(valueFilter2);
        org.junit.Assert.assertNotNull(valueFilter5);
        org.junit.Assert.assertNotNull(valueFilter6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertNull(jSONArray10);
        org.junit.Assert.assertNotNull(featureArray14);
        org.junit.Assert.assertNull(jSONObject15);
        org.junit.Assert.assertNull(jSONObject16);
        org.junit.Assert.assertNotNull(valueFilter23);
        org.junit.Assert.assertNotNull(valueFilter26);
        org.junit.Assert.assertNotNull(filterArray27);
        org.junit.Assert.assertNotNull(featureArray28);
        org.junit.Assert.assertNotNull(featureArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1.0" + "'", str32, "1.0");
        org.junit.Assert.assertNotNull(featureArray33);
        org.junit.Assert.assertNotNull(featureArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1.0" + "'", str37, "1.0");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null" + "'", str39, "null");
        org.junit.Assert.assertNotNull(featureArray40);
        org.junit.Assert.assertNotNull(featureArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1.0" + "'", str44, "1.0");
        org.junit.Assert.assertNotNull(featureArray45);
        org.junit.Assert.assertNotNull(featureArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1.0" + "'", str49, "1.0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null" + "'", str51, "null");
        org.junit.Assert.assertNotNull(featureArray52);
        org.junit.Assert.assertNotNull(featureArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1.0" + "'", str56, "1.0");
        org.junit.Assert.assertNotNull(featureArray57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jSONArray62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[]");
        org.junit.Assert.assertNull(jSONArray68);
        org.junit.Assert.assertNotNull(featureArray72);
        org.junit.Assert.assertNull(jSONObject73);
        org.junit.Assert.assertNull(jSONObject74);
        org.junit.Assert.assertNull(byteArray75);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.function.Function function1 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter2 = com.alibaba.fastjson2.filter.ValueFilter.of("2.0.19", function1);
        java.lang.Object obj3 = com.alibaba.fastjson2.JSON.toJSON((java.lang.Object) valueFilter2);
        org.junit.Assert.assertNotNull(valueFilter2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.Map map1 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter2 = com.alibaba.fastjson2.filter.ValueFilter.of("100", map1);
        org.junit.Assert.assertNotNull(valueFilter2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = com.alibaba.fastjson2.JSON.isValidArray(byteArray1);
        java.nio.charset.Charset charset5 = null;
        char[] charArray6 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray7 = com.alibaba.fastjson2.JSON.parseArray(charArray6);
        com.alibaba.fastjson2.JSONReader.Feature feature10 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray11 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature10 };
        com.alibaba.fastjson2.JSONObject jSONObject12 = com.alibaba.fastjson2.JSON.parseObject(charArray6, 100, (int) (byte) -1, featureArray11);
        com.alibaba.fastjson2.JSONObject jSONObject13 = com.alibaba.fastjson2.JSON.parseObject(byteArray1, (int) (short) 0, (int) (short) 10, charset5, featureArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONArray jSONArray14 = com.alibaba.fastjson2.JSON.parseArray(inputStream0, featureArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNull(jSONArray7);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNull(jSONObject12);
        org.junit.Assert.assertNull(jSONObject13);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        boolean boolean1 = com.alibaba.fastjson2.JSON.isValidObject("2.0.19");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.reflect.Type type1 = null;
        char[] charArray2 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray3 = com.alibaba.fastjson2.JSON.parseArray(charArray2);
        com.alibaba.fastjson2.JSONReader.Feature feature6 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray7 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature6 };
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSON.parseObject(charArray2, 100, (int) (byte) -1, featureArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = com.alibaba.fastjson2.JSON.parseObject("1", type1, featureArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNull(jSONArray3);
        org.junit.Assert.assertNotNull(featureArray7);
        org.junit.Assert.assertNull(jSONObject8);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.alibaba.fastjson2.JSONReader.Context context1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.alibaba.fastjson2.JSON.parse("1", context1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.Object obj0 = null;
        byte[] byteArray1 = com.alibaba.fastjson2.JSON.toJSONBytes(obj0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108]");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = com.alibaba.fastjson2.JSON.isValidArray(byteArray0);
        char[] charArray2 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray3 = com.alibaba.fastjson2.JSON.parseArray(charArray2);
        com.alibaba.fastjson2.JSONReader.Feature feature6 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray7 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature6 };
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSON.parseObject(charArray2, 100, (int) (byte) -1, featureArray7);
        com.alibaba.fastjson2.JSONObject jSONObject9 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, featureArray7);
        java.lang.reflect.Type type10 = null;
        java.lang.reflect.Type type13 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray14 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray14);
        java.util.List<char[]> charArrayList16 = com.alibaba.fastjson2.JSON.parseArray("", type13, featureArray14);
        java.lang.Comparable<java.lang.String> strComparable17 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, type10, "", featureArray14);
        java.net.URL uRL20 = null;
        java.lang.reflect.Type type22 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray23 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray23);
        java.util.List<char[]> charArrayList25 = com.alibaba.fastjson2.JSON.parseArray("", type22, featureArray23);
        com.alibaba.fastjson2.JSONArray jSONArray26 = com.alibaba.fastjson2.JSON.parseArray(uRL20, featureArray23);
        com.alibaba.fastjson2.JSONObject jSONObject27 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, (int) (byte) 10, (int) (byte) 1, featureArray23);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNull(jSONArray3);
        org.junit.Assert.assertNotNull(featureArray7);
        org.junit.Assert.assertNull(jSONObject8);
        org.junit.Assert.assertNull(jSONObject9);
        org.junit.Assert.assertNotNull(featureArray14);
        org.junit.Assert.assertNull(charArrayList16);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(featureArray23);
        org.junit.Assert.assertNull(charArrayList25);
        org.junit.Assert.assertNull(jSONArray26);
        org.junit.Assert.assertNull(jSONObject27);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        java.nio.charset.Charset charset8 = null;
        com.alibaba.fastjson2.JSONReader.Feature feature9 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray10 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature9 };
        com.alibaba.fastjson2.JSONObject jSONObject11 = com.alibaba.fastjson2.JSON.parseObject(byteArray5, (int) (byte) 100, (int) (short) 0, charset8, featureArray10);
        java.lang.Object obj12 = com.alibaba.fastjson2.JSON.toJSON((java.lang.Object) byteArray5);
        java.lang.Object obj13 = null;
        java.util.function.Predicate<java.lang.String> strPredicate14 = null;
        java.util.function.Function function15 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter16 = com.alibaba.fastjson2.filter.ValueFilter.of(strPredicate14, function15);
        java.util.function.Function function18 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter19 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function18);
        com.alibaba.fastjson2.filter.Filter[] filterArray20 = new com.alibaba.fastjson2.filter.Filter[] { valueFilter16, valueFilter19 };
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray21 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray21);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray24 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str25 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray24);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray26 = com.alibaba.fastjson2.JSON.copy(featureArray21, featureArray24);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray29 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str30 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray29);
        java.lang.String str31 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) featureArray26, "1", featureArray29);
        java.lang.String str32 = com.alibaba.fastjson2.JSON.toJSONString(obj13, filterArray20, featureArray29);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray33 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray33);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray36 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str37 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray36);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray38 = com.alibaba.fastjson2.JSON.copy(featureArray33, featureArray36);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.alibaba.fastjson2.JSON.writeTo(outputStream0, obj12, filterArray20, featureArray36);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: JSON#writeTo cannot serialize '[1,0,0,10]' to 'OutputStream'");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(featureArray10);
        org.junit.Assert.assertNull(jSONObject11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[1,0,0,10]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[1,0,0,10]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[1,0,0,10]");
        org.junit.Assert.assertNotNull(valueFilter16);
        org.junit.Assert.assertNotNull(valueFilter19);
        org.junit.Assert.assertNotNull(filterArray20);
        org.junit.Assert.assertNotNull(featureArray21);
        org.junit.Assert.assertNotNull(featureArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1.0" + "'", str25, "1.0");
        org.junit.Assert.assertNotNull(featureArray26);
        org.junit.Assert.assertNotNull(featureArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1.0" + "'", str30, "1.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertNotNull(featureArray33);
        org.junit.Assert.assertNotNull(featureArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1.0" + "'", str37, "1.0");
        org.junit.Assert.assertNotNull(featureArray38);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        java.nio.charset.Charset charset10 = null;
        com.alibaba.fastjson2.JSONReader.Feature feature11 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray12 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature11 };
        com.alibaba.fastjson2.JSONObject jSONObject13 = com.alibaba.fastjson2.JSON.parseObject(byteArray7, (int) (byte) 100, (int) (short) 0, charset10, featureArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject14 = com.alibaba.fastjson2.JSON.parseObject("1.0", (int) (short) 100, (int) (byte) 100, featureArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertNull(jSONObject13);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.alibaba.fastjson2.TypeReference typeReference1 = null;
        java.util.function.Function function3 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter4 = com.alibaba.fastjson2.filter.ValueFilter.of("", function3);
        java.util.function.Function function6 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter7 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function6);
        com.alibaba.fastjson2.filter.ValueFilter valueFilter8 = com.alibaba.fastjson2.filter.ValueFilter.compose(valueFilter4, valueFilter7);
        byte[] byteArray9 = new byte[] {};
        boolean boolean10 = com.alibaba.fastjson2.JSON.isValidArray(byteArray9);
        java.nio.charset.Charset charset13 = null;
        char[] charArray14 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray15 = com.alibaba.fastjson2.JSON.parseArray(charArray14);
        com.alibaba.fastjson2.JSONReader.Feature feature18 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray19 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature18 };
        com.alibaba.fastjson2.JSONObject jSONObject20 = com.alibaba.fastjson2.JSON.parseObject(charArray14, 100, (int) (byte) -1, featureArray19);
        com.alibaba.fastjson2.JSONObject jSONObject21 = com.alibaba.fastjson2.JSON.parseObject(byteArray9, (int) (short) 0, (int) (short) 10, charset13, featureArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.filter.Filter filter22 = com.alibaba.fastjson2.JSON.parseObject("[]", typeReference1, (com.alibaba.fastjson2.filter.Filter) valueFilter8, featureArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueFilter4);
        org.junit.Assert.assertNotNull(valueFilter7);
        org.junit.Assert.assertNotNull(valueFilter8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertNull(jSONArray15);
        org.junit.Assert.assertNotNull(featureArray19);
        org.junit.Assert.assertNull(jSONObject20);
        org.junit.Assert.assertNull(jSONObject21);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = com.alibaba.fastjson2.JSON.isValidArray(byteArray0);
        com.alibaba.fastjson2.JSONArray jSONArray2 = com.alibaba.fastjson2.JSON.parseArray(byteArray0);
        java.lang.reflect.Type type3 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray5);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray8 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str9 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray8);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray10 = com.alibaba.fastjson2.JSON.copy(featureArray5, featureArray8);
        com.alibaba.fastjson2.filter.Filter filter11 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, type3, "100", featureArray10);
        java.nio.charset.Charset charset14 = null;
        com.alibaba.fastjson2.JSONArray jSONArray15 = com.alibaba.fastjson2.JSON.parseArray(byteArray0, (-1), 100, charset14);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSONArray2);
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0" + "'", str9, "1.0");
        org.junit.Assert.assertNotNull(featureArray10);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(jSONArray15);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.reflect.Type type1 = null;
        byte[] byteArray2 = new byte[] {};
        boolean boolean3 = com.alibaba.fastjson2.JSON.isValidArray(byteArray2);
        char[] charArray4 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray5 = com.alibaba.fastjson2.JSON.parseArray(charArray4);
        com.alibaba.fastjson2.JSONReader.Feature feature8 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray9 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature8 };
        com.alibaba.fastjson2.JSONObject jSONObject10 = com.alibaba.fastjson2.JSON.parseObject(charArray4, 100, (int) (byte) -1, featureArray9);
        com.alibaba.fastjson2.JSONObject jSONObject11 = com.alibaba.fastjson2.JSON.parseObject(byteArray2, featureArray9);
        java.lang.reflect.Type type12 = null;
        java.lang.reflect.Type type15 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray16 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray16);
        java.util.List<char[]> charArrayList18 = com.alibaba.fastjson2.JSON.parseArray("", type15, featureArray16);
        java.lang.Comparable<java.lang.String> strComparable19 = com.alibaba.fastjson2.JSON.parseObject(byteArray2, type12, "", featureArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object> objList20 = com.alibaba.fastjson2.JSON.parseArray("1", type1, featureArray16);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: syntax error : 1");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNull(jSONArray5);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNull(jSONObject10);
        org.junit.Assert.assertNull(jSONObject11);
        org.junit.Assert.assertNotNull(featureArray16);
        org.junit.Assert.assertNull(charArrayList18);
        org.junit.Assert.assertNull(strComparable19);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray0);
        java.lang.Object obj2 = null;
        java.util.function.Predicate<java.lang.String> strPredicate3 = null;
        java.util.function.Function function4 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter5 = com.alibaba.fastjson2.filter.ValueFilter.of(strPredicate3, function4);
        java.util.function.Function function7 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter8 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function7);
        com.alibaba.fastjson2.filter.Filter[] filterArray9 = new com.alibaba.fastjson2.filter.Filter[] { valueFilter5, valueFilter8 };
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray10 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray10);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray13 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str14 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray13);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray15 = com.alibaba.fastjson2.JSON.copy(featureArray10, featureArray13);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray18 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str19 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray18);
        java.lang.String str20 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) featureArray15, "1", featureArray18);
        java.lang.String str21 = com.alibaba.fastjson2.JSON.toJSONString(obj2, filterArray9, featureArray18);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray22 = com.alibaba.fastjson2.JSON.copy(featureArray0, featureArray18);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(valueFilter5);
        org.junit.Assert.assertNotNull(valueFilter8);
        org.junit.Assert.assertNotNull(filterArray9);
        org.junit.Assert.assertNotNull(featureArray10);
        org.junit.Assert.assertNotNull(featureArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0" + "'", str14, "1.0");
        org.junit.Assert.assertNotNull(featureArray15);
        org.junit.Assert.assertNotNull(featureArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0" + "'", str19, "1.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(featureArray22);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = com.alibaba.fastjson2.JSON.isValidArray(byteArray0);
        char[] charArray2 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray3 = com.alibaba.fastjson2.JSON.parseArray(charArray2);
        com.alibaba.fastjson2.JSONReader.Feature feature6 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray7 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature6 };
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSON.parseObject(charArray2, 100, (int) (byte) -1, featureArray7);
        com.alibaba.fastjson2.JSONObject jSONObject9 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, featureArray7);
        java.lang.reflect.Type type10 = null;
        java.lang.reflect.Type type13 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray14 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray14);
        java.util.List<char[]> charArrayList16 = com.alibaba.fastjson2.JSON.parseArray("", type13, featureArray14);
        java.lang.Comparable<java.lang.String> strComparable17 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, type10, "", featureArray14);
        java.nio.charset.Charset charset20 = null;
        byte[] byteArray21 = new byte[] {};
        boolean boolean22 = com.alibaba.fastjson2.JSON.isValidArray(byteArray21);
        com.alibaba.fastjson2.JSONArray jSONArray23 = com.alibaba.fastjson2.JSON.parseArray(byteArray21);
        java.lang.reflect.Type type24 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray26 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray26);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray29 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str30 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray29);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray31 = com.alibaba.fastjson2.JSON.copy(featureArray26, featureArray29);
        com.alibaba.fastjson2.filter.Filter filter32 = com.alibaba.fastjson2.JSON.parseObject(byteArray21, type24, "100", featureArray31);
        com.alibaba.fastjson2.JSONObject jSONObject33 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, (-1), 0, charset20, featureArray31);
        java.lang.String str34 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNull(jSONArray3);
        org.junit.Assert.assertNotNull(featureArray7);
        org.junit.Assert.assertNull(jSONObject8);
        org.junit.Assert.assertNull(jSONObject9);
        org.junit.Assert.assertNotNull(featureArray14);
        org.junit.Assert.assertNull(charArrayList16);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSONArray23);
        org.junit.Assert.assertNotNull(featureArray26);
        org.junit.Assert.assertNotNull(featureArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1.0" + "'", str30, "1.0");
        org.junit.Assert.assertNotNull(featureArray31);
        org.junit.Assert.assertNull(filter32);
        org.junit.Assert.assertNull(jSONObject33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.alibaba.fastjson2.JSONReader.Feature feature3 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray4 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature3 };
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject5 = com.alibaba.fastjson2.JSON.parseObject("[]", (int) ' ', (int) (byte) 1, featureArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray4);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.io.InputStream inputStream0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type type3 = null;
        byte[] byteArray4 = new byte[] {};
        boolean boolean5 = com.alibaba.fastjson2.JSON.isValidArray(byteArray4);
        com.alibaba.fastjson2.JSONArray jSONArray6 = com.alibaba.fastjson2.JSON.parseArray(byteArray4);
        java.lang.reflect.Type type7 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray9 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray9);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray12 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str13 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray12);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray14 = com.alibaba.fastjson2.JSON.copy(featureArray9, featureArray12);
        com.alibaba.fastjson2.filter.Filter filter15 = com.alibaba.fastjson2.JSON.parseObject(byteArray4, type7, "100", featureArray14);
        java.lang.Comparable<java.lang.String> strComparable16 = com.alibaba.fastjson2.JSON.parseObject("", type3, featureArray14);
        com.alibaba.fastjson2.filter.Filter[] filterArray17 = com.alibaba.fastjson2.JSON.parseObject(inputStream0, type1, featureArray14);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSONArray6);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0" + "'", str13, "1.0");
        org.junit.Assert.assertNotNull(featureArray14);
        org.junit.Assert.assertNull(filter15);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNull(filterArray17);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        java.util.function.Function function1 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter2 = com.alibaba.fastjson2.filter.ValueFilter.of("", function1);
        java.util.function.Function function4 = null;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter5 = com.alibaba.fastjson2.filter.ValueFilter.of("100", function4);
        com.alibaba.fastjson2.filter.ValueFilter valueFilter6 = com.alibaba.fastjson2.filter.ValueFilter.compose(valueFilter2, valueFilter5);
        byte[] byteArray7 = com.alibaba.fastjson2.JSON.toJSONBytes((java.lang.Object) valueFilter6);
        java.lang.reflect.Type type10 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray11 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray11);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray14 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str15 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray14);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray16 = com.alibaba.fastjson2.JSON.copy(featureArray11, featureArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.filter.Filter[] filterArray17 = com.alibaba.fastjson2.JSON.parseObject(byteArray7, (int) (byte) 0, (int) (byte) -1, type10, featureArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueFilter2);
        org.junit.Assert.assertNotNull(valueFilter5);
        org.junit.Assert.assertNotNull(valueFilter6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[123, 125]");
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNotNull(featureArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0" + "'", str15, "1.0");
        org.junit.Assert.assertNotNull(featureArray16);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.alibaba.fastjson2.JSONReader.Feature feature0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSON.config(feature0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.lang.reflect.Type type1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.alibaba.fastjson2.JSON.parseObject("1.0", type1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.math.BigDecimal to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { type1 };
        byte[] byteArray3 = new byte[] {};
        boolean boolean4 = com.alibaba.fastjson2.JSON.isValidArray(byteArray3);
        com.alibaba.fastjson2.JSONArray jSONArray5 = com.alibaba.fastjson2.JSON.parseArray(byteArray3);
        java.lang.reflect.Type type6 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray8 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray8);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray11 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str12 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray11);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray13 = com.alibaba.fastjson2.JSON.copy(featureArray8, featureArray11);
        com.alibaba.fastjson2.filter.Filter filter14 = com.alibaba.fastjson2.JSON.parseObject(byteArray3, type6, "100", featureArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object> objList15 = com.alibaba.fastjson2.JSON.parseArray("1", typeArray2, featureArray13);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: offset 1, character ?, line 1, column 2, fastjson-version 2.0.19 1");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSONArray5);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0" + "'", str12, "1.0");
        org.junit.Assert.assertNotNull(featureArray13);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        byte[] byteArray0 = null;
        com.alibaba.fastjson2.JSONObject jSONObject1 = com.alibaba.fastjson2.JSON.parseObject(byteArray0);
        org.junit.Assert.assertNull(jSONObject1);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.alibaba.fastjson2.TypeReference typeReference1 = null;
        char[] charArray2 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray3 = com.alibaba.fastjson2.JSON.parseArray(charArray2);
        com.alibaba.fastjson2.JSONReader.Feature feature6 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray7 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature6 };
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSON.parseObject(charArray2, 100, (int) (byte) -1, featureArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.alibaba.fastjson2.JSON.parseObject("[]", typeReference1, featureArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNull(jSONArray3);
        org.junit.Assert.assertNotNull(featureArray7);
        org.junit.Assert.assertNull(jSONObject8);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { type1 };
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray3 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        com.alibaba.fastjson2.JSON.config(featureArray3);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray6 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str7 = com.alibaba.fastjson2.JSON.toJSONString((java.lang.Object) 1.0f, featureArray6);
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray8 = com.alibaba.fastjson2.JSON.copy(featureArray3, featureArray6);
        java.util.List<com.alibaba.fastjson2.filter.Filter> filterList9 = com.alibaba.fastjson2.JSON.parseArray("100", typeArray2, featureArray3);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(featureArray3);
        org.junit.Assert.assertNotNull(featureArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0" + "'", str7, "1.0");
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = com.alibaba.fastjson2.JSON.isValidArray(byteArray0);
        char[] charArray2 = new char[] {};
        com.alibaba.fastjson2.JSONArray jSONArray3 = com.alibaba.fastjson2.JSON.parseArray(charArray2);
        com.alibaba.fastjson2.JSONReader.Feature feature6 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray7 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature6 };
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSON.parseObject(charArray2, 100, (int) (byte) -1, featureArray7);
        com.alibaba.fastjson2.JSONObject jSONObject9 = com.alibaba.fastjson2.JSON.parseObject(byteArray0, featureArray7);
        java.lang.reflect.Type type10 = null;
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        java.nio.charset.Charset charset18 = null;
        com.alibaba.fastjson2.JSONReader.Feature feature19 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray20 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature19 };
        com.alibaba.fastjson2.JSONObject jSONObject21 = com.alibaba.fastjson2.JSON.parseObject(byteArray15, (int) (byte) 100, (int) (short) 0, charset18, featureArray20);
        java.util.List<char[]> charArrayList22 = com.alibaba.fastjson2.JSON.parseArray(byteArray0, type10, featureArray20);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNull(jSONArray3);
        org.junit.Assert.assertNotNull(featureArray7);
        org.junit.Assert.assertNull(jSONObject8);
        org.junit.Assert.assertNull(jSONObject9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 0, 0, 10]");
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertNull(jSONObject21);
        org.junit.Assert.assertNull(charArrayList22);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.alibaba.fastjson2.JSONReader.Context context1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.alibaba.fastjson2.JSON.parse("100", context1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

